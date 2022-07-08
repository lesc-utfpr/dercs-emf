package dercs.loader.extractor;

import dercs.behavior.Behavior;
import dercs.behavior.actions.*;
import dercs.datatypes.Array;
import dercs.datatypes.ClassDataType;
import dercs.datatypes.DataType;
import dercs.datatypes.DatatypesFactory;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.util.DercsCreationHelper;
import dercs.structure.*;
import dercs.structure.Class;
import dercs.structure.runtime.Object;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adds all attributes found in the UML classes to the corresponding DERCS classes.
 * This includes associations, because Papyrus automatically creates attributes for all associations.
 * <p>
 * Result:
 * <ul>
 *     <li>all DERCS classes have their attributes added</li>
 *     <li>getters and setters are not yet generated</li>
 * </ul>
 */
public class AttributesExtractor extends AbstractModelExtractor {
    private static final Logger LOGGER = LoggerFactory.getLogger("AttributesExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        for (Class cls : model().getClasses()) {
            org.eclipse.uml2.uml.Class umlClass = inProgressModel().getCorrespondingUmlElement(cls);
            handleClass(cls, umlClass);
        }
    }

    private void handleClass(Class dercsClass, org.eclipse.uml2.uml.Class umlClass) throws DercsLoaderException {
        for (Property attribute : umlClass.getAttributes()) {
            DataType dercsType = inProgressModel().getDercsDatatype(attribute.getType());
            boolean isAssociation = dercsType instanceof ClassDataType;

            //an upper bound of -1 means "unlimited" in UML
            if (attribute.getUpper() != 1) {
                // replace type with an array of itself
                Array newArray = DatatypesFactory.eINSTANCE.createArray();
                newArray.setDataType(dercsType);
                newArray.setSize(attribute.getUpper());
                newArray.setLowerValue(attribute.getLower());
                // unbounded arrays in DERCS have upper value 0, not -1
                newArray.setUpperValue(attribute.getUpper() > 1 ? attribute.getUpper() : 0);
                dercsType = newArray;
            }

            LOGGER.info("Adding attribute '{}' to class '{}'.", attribute.getName(), dercsClass.getName());
            Attribute newAttribute = dercsClass.addAttribute(
                    attribute.getName(),
                    dercsType,
                    DatatypeHelper.convertVisibility(attribute.getVisibility()),
                    attribute.isStatic(),
                    attribute.getDefault(),
                    attribute.isReadOnly()
            );

            inProgressModel().registerDercsUmlElementPair(newAttribute, attribute);

            if (isAssociation) {
                addAdditionalClassElements(dercsClass, newAttribute, attribute);
            }
        }
    }

    /**
     * Adds getters, setters and constructor parameters for this attribute to the containing class.
     * <ul>
     *     <li>Compositions:</li>
     *     <ul>
     *         <li>Always: the given minimum number of objects is created and added in the constructor.</li>
     *         <li>For 1-1 or 1-n: nothing else.</li>
     *         <li>For 1-* or 1-n..*: the array is unbounded and an "add[attribute_name]()" method is created, that adds a new instance to the array. The lower bound number of objects is created.</li>
     *         <li>For 1-n..m: the adder method only works up to a size of m.</li>
     *     </ul>
     *     <li>Associations:</li>
     *     <ul>
     *         <li>Always: setter/getter (if multiplicity is higher than 1, these have an index parameter for the array)</li>
     *         <li>For 1-1: constructor parameter and assignment</li>
     *     </ul>
     * </ul>
     *
     * @param dercsClass the DERCS class containing the attribute
     * @param dercsAttribute the DERCS attribute
     * @param umlAttribute the UML attribute
     */
    private void addAdditionalClassElements(Class dercsClass, Attribute dercsAttribute, Property umlAttribute) throws DercsLoaderException {
        if (umlAttribute.getAggregation() == AggregationKind.COMPOSITE_LITERAL) {
            // composition
            // add instantiation action/s to constructor
            int minObjects = umlAttribute.getLower();
            // create required number of objects
            addCompositionObjectCreation(dercsClass, dercsAttribute, minObjects);

            if (dercsAttribute.getDataType() instanceof Array) {
                if (umlAttribute.getUpper() == -1) {
                    // if array is unbounded: create adder method
                    addUnboundedArrayAdderMethod(dercsClass, dercsAttribute);
                } else if (umlAttribute.getUpper() > 1 && umlAttribute.getLower() < umlAttribute.getUpper()) {
                    // if array is bounded and not full: create added method with limit
                    addBoundedArrayAdderMethod(dercsClass, dercsAttribute);
                }
            }

        } else {
            // association
            if (!(dercsAttribute.getDataType() instanceof Array)) {
                // 1-1 association
                //add constructor parameter and assignment action
                LOGGER.info(" - Adding constructor parameter for attribute '{}'.", dercsAttribute.getName());
                DercsCreationHelper.addConstructorParameterForAttribute(dercsClass, dercsAttribute);
            }

            LOGGER.info(" - Creating getter and setter for attribute '{}'.", dercsAttribute.getName());
            DercsCreationHelper.addGetter(dercsClass, dercsAttribute, true);
            DercsCreationHelper.addSetter(dercsClass, dercsAttribute, true);

        }
    }

    private void addCompositionObjectCreation(Class dercsClass, Attribute dercsAttribute, int minObjects) throws DercsLoaderException {
        LOGGER.info(" - Adding constructor actions for creation of {} elements in attribute '{}'.", minObjects, dercsAttribute.getName());
        Constructor constructor = DercsAccessHelper.getConstructor(dercsClass);
        Behavior constructBehavior = constructor.getTriggeredBehavior();

        if (dercsAttribute.getDataType() instanceof Array) {
            for (int i = 0; i < minObjects; i++) {
                // an object representing this attribute must exist in DERCS model
                // thus it must be created and added in the list of objects
                Object obj = DercsCreationHelper.createAttributeRelatedObject(dercsAttribute, true);
                model().getObjects().add(obj);
                // check the deployment of the object
                inProgressModel().deployObject(obj);
                // create actions that instantiate the element i of the new array attribute
                CreateObjectAction createObjAction = DercsConstructors.newCreateObjectAction(obj);
                AssignmentAction assignmentAction = DercsConstructors.newAssignmentAction(null, dercsAttribute, createObjAction);
                assignmentAction.setDestinationArrayElement(i);
                constructBehavior.getBehavioralElements().add(assignmentAction);
            }
        } else {
            // an object representing this attribute must exist in DERCS model
            // thus it must be created and added in the list of objects
            Object obj = DercsCreationHelper.createAttributeRelatedObject(dercsAttribute, true);
            model().getObjects().add(obj);
            // check the deployment of the object
            inProgressModel().deployObject(obj);

            // create actions that instantiate the new attribute
            CreateObjectAction createObjAction = DercsConstructors.newCreateObjectAction(obj);
            AssignmentAction assignmentAction = DercsConstructors.newAssignmentAction(null, dercsAttribute, createObjAction);
            constructBehavior.getBehavioralElements().add(assignmentAction);
        }
    }

    private void addUnboundedArrayAdderMethod(Class cls, Attribute attribute) {
        LOGGER.info(" - Adding method '{}' for unbounded array attribute '{}'.", "add" + attribute.getName(), attribute.getName());
        // create method and behavior
        Behavior addAttrBehavior = DercsConstructors.newBehavior(null, null, null, 0);
        Method addAttrMethod = cls.addMethod("add" + attribute.getName(), ((Array)attribute.getDataType()).getDataType(), Visibility.PUBLIC,
                false, false, addAttrBehavior);

        // create the action that inserts a new element in the array attribute
        InsertArrayElementAction insertArrayAction = DercsConstructors.newInsertArrayElementAction(null, attribute, null, "");
        // the new inserted element must be returned by the "addAttributeName()" method
        ReturnAction returnAction = DercsConstructors.newReturnAction(addAttrMethod, insertArrayAction);
        addAttrBehavior.getBehavioralElements().add(returnAction);
    }

    private void addBoundedArrayAdderMethod(Class cls, Attribute attribute) {
        // FIXME: hardcoded java fragments "(%s.size() < %s)" and "null" should be replaced with a more general solution
        LOGGER.info(" - Adding method '{}' for bounded array attribute '{}'.", "add" + attribute.getName(), attribute.getName());
        String enterCondition = String.format("(%s.size() < %s)", attribute.getName(), ((Array)attribute.getDataType()).getUpperValue());

        // this behavior is executed only if the limit of elements is not reached.
        Behavior addAttrBehavior = DercsConstructors.newBehavior(null, enterCondition, null, 0);
        Method addAttrMethod = cls.addMethod("add" + attribute.getName(), ((Array)attribute.getDataType()).getDataType(), Visibility.PUBLIC,
                false, false, addAttrBehavior);

        // create the action that inserts a new element in the array attribute
        InsertArrayElementAction insertArrayAction = DercsConstructors.newInsertArrayElementAction(null, attribute, null, "");
        // the new inserted element must be returned by the "addAttributeName()" method
        ReturnAction returnAction = DercsConstructors.newReturnAction(addAttrMethod, insertArrayAction);
        addAttrBehavior.getBehavioralElements().add(returnAction);

        // alternative behavior that must be executed if the elements limit was reached.
        Behavior elseBehavior = DercsConstructors.newBehavior(addAttrBehavior, null, null, 0);
        returnAction = DercsConstructors.newReturnAction(addAttrMethod, "null");
        elseBehavior.getBehavioralElements().add(returnAction);
        // setting alternative behavior
        addAttrBehavior.setAlternateBehavior(elseBehavior);
    }

    @Override
    public String getName() {
        return "AttributesExtractor";
    }
}
