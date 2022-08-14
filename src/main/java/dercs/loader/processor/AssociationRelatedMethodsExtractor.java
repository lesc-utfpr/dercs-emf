package dercs.loader.processor;

import dercs.behavior.Behavior;
import dercs.behavior.actions.AssignmentAction;
import dercs.behavior.actions.CreateObjectAction;
import dercs.behavior.actions.InsertArrayElementAction;
import dercs.behavior.actions.ReturnAction;
import dercs.datatypes.Array;
import dercs.datatypes.ClassDataType;
import dercs.datatypes.DataType;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.util.DercsBuilders;
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
 * Adds getters and setters to attributes that represent associations.
 * Also adds actions to constructors to initialize composition elements and methods to add them.
 * <p>
 * Result:
 * <ul>
 *     <li>association attributes have getters and setters.</li>
 *     <li>if an association has multiplicity greater than one, these methods also take an array index as a parameter.</li>
 *     <li>if an association has exactly multiplicity one, a parameter for it's value is added to the class constructor.</li>
 *     <li>composition attributes have their minimum number of objects initialised in the class constructor</li>
 *     <li>if a composition has unbounded multiplicity, a method to add a new object is created.</li>
 * </ul>
 */
public class AssociationRelatedMethodsExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("AssociationRelatedMethodsExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        for (Class cls : model().getClasses()) {
            handleClass(cls);
        }
    }

    private void handleClass(Class dercsClass) throws DercsLoaderException {
        for (Attribute attribute : dercsClass.getAttributes()) {
            LOGGER.info("Processing attribute '{}' of class '{}':", attribute.getName(), dercsClass.getName());
            DataType baseType = DatatypeHelper.getBaseDataType(attribute.getDataType());

            if (baseType instanceof ClassDataType) {
                // association or composition
                addAssociationMethods(dercsClass, attribute);
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
     */
    private void addAssociationMethods(Class dercsClass, Attribute dercsAttribute) throws DercsLoaderException {
        Property umlAttribute = inProgressModel().getCorrespondingUmlElement(dercsAttribute);
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
        Behavior addAttrBehavior = DercsBuilders.Behavior.create().build();
        Method addAttrMethod = DercsBuilders.Method.create("add" + attribute.getName())
                .returnType(((Array)attribute.getDataType()).getDataType())
                .triggeredBehavior(addAttrBehavior)
                .addToClass(cls);

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
        Behavior addAttrBehavior = DercsBuilders.Behavior.create()
                .enterCondition(enterCondition)
                .build();
        Method addAttrMethod = DercsBuilders.Method.create("add" + attribute.getName())
                .returnType(((Array)attribute.getDataType()).getDataType())
                .triggeredBehavior(addAttrBehavior)
                .addToClass(cls);

        // create the action that inserts a new element in the array attribute
        InsertArrayElementAction insertArrayAction = DercsConstructors.newInsertArrayElementAction(null, attribute, null, "");
        // the new inserted element must be returned by the "addAttributeName()" method
        ReturnAction returnAction = DercsConstructors.newReturnAction(addAttrMethod, insertArrayAction);
        addAttrBehavior.getBehavioralElements().add(returnAction);

        // alternative behavior that must be executed if the elements limit was reached.
        Behavior elseBehavior = DercsBuilders.Behavior.create().build();
        returnAction = DercsConstructors.newReturnAction(addAttrMethod, "null");
        elseBehavior.getBehavioralElements().add(returnAction);
        // setting alternative behavior
        addAttrBehavior.setAlternateBehavior(elseBehavior);
    }

    @Override
    public String getName() {
        return "AssociationRelatedMethodsExtractor";
    }
}
