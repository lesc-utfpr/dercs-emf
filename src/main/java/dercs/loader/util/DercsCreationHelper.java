package dercs.loader.util;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.*;
import dercs.datatypes.Array;
import dercs.datatypes.ClassDataType;
import dercs.structure.Class;
import dercs.structure.*;
import dercs.structure.runtime.RuntimeElement;
import dercs.util.DercsConstructors;

/**
 * Contains helper functions for creating and modifying DERCS elements.
 */
public class DercsCreationHelper {
    /**
     * Adds a getter method for the given attribute to the given class.
     * @param cls the DERCS class to add the getter to
     * @param attribute the attribute of this class to create the getter for
     * @param arrayIndexed if true and the attribute is an array, create the getter with an index parameter
     */
    public static Method addGetter(Class cls, Attribute attribute, boolean arrayIndexed) {
        // create the behavior
        Behavior methodBehavior = DercsConstructors.newBehavior(null, null, null, 0);
        Method newMethod;

        if (arrayIndexed && (attribute.getDataType() instanceof Array)) {
            // we want an indexed getter for an array
            // create the method with the array's datatype as return type
            newMethod = cls.addMethod("get" + attribute.getName(), ((Array)attribute.getDataType()).getDataType(), Visibility.PUBLIC, false, false, methodBehavior);
            newMethod.setAssociatedAttribute(attribute);
            // add parameter representing the index of the array element
            dercs.datatypes.Integer newInt = DercsConstructors.newInteger(true);
            Parameter parameter = newMethod.addParameter("index", newInt, ParameterKind.IN);

            // get the array element and return
            GetArrayElementAction getArrAction = DercsConstructors.newGetArrayElementAction(null, attribute, parameter.getName());
            ReturnAction returnAction = DercsConstructors.newReturnAction(newMethod, getArrAction);
            methodBehavior.getBehavioralElements().add(returnAction);
        } else {
            // we want a normal getter
            // create the method with the attribute's datatype as return type
            newMethod = cls.addMethod("get" + attribute.getName(), attribute.getDataType(), Visibility.PUBLIC, false, false, methodBehavior);
            newMethod.setAssociatedAttribute(attribute);
            // get attribute and return
            ExpressionAction expressionAction = DercsConstructors.newExpressionAction(attribute.getName());
            ReturnAction returnAction = DercsConstructors.newReturnAction(newMethod, expressionAction);
            methodBehavior.getBehavioralElements().add(returnAction);
        }

        return newMethod;
    }

    /**
     * Adds a setter method for the given attribute to the given class.
     * @param cls the DERCS class to add the setter to
     * @param attribute the attribute of this class to create the setter
     * @param arrayIndexed if true and the attribute is an array, create the setter with an index parameter
     */
    public static Method addSetter(Class cls, Attribute attribute, boolean arrayIndexed) {
        // create the method and its behavior
        Behavior methodBehavior = DercsConstructors.newBehavior(null, null, null, 0);
        Method newMethod = cls.addMethod("set" + attribute.getName(), DercsConstructors.newVoid(), Visibility.PUBLIC, false, false, methodBehavior);
        newMethod.setAssociatedAttribute(attribute);

        if (arrayIndexed && (attribute.getDataType() instanceof Array)) {
            // we want an indexed setter for an array
            // adding the parameter representing the index of the array element
            dercs.datatypes.Integer newInt = DercsConstructors.newInteger(true);
            Parameter indexParameter = newMethod.addParameter("index", newInt, ParameterKind.IN);
            // add the new-value parameter
            Parameter valueParameter = newMethod.addParameter("_" + attribute.getName(), ((Array)attribute.getDataType()).getDataType(), ParameterKind.IN);

            // get the array element
            SetArrayElementAction setArrAction = DercsConstructors.newSetArrayElementAction(null, attribute, indexParameter.getName(), valueParameter.getName());
            AssignmentAction assignmentAction = DercsConstructors.newAssignmentAction(null, attribute, setArrAction);
            methodBehavior.getBehavioralElements().add(assignmentAction);
        } else {
            // we want a normal setter
            // add the new-value parameter
            Parameter valueParameter = newMethod.addParameter("_" + attribute.getName(), attribute.getDataType(), ParameterKind.IN);

            // set the element
            ExpressionAction ea = DercsConstructors.newExpressionAction(valueParameter.getName());
            AssignmentAction aa = DercsConstructors.newAssignmentAction(null, attribute, ea);
            methodBehavior.getBehavioralElements().add(aa);
        }

        return newMethod;
    }

    /**
     * Adds a parameter to the constructor, that will then be assigned to the attribute.
     * @param cls the DERCS class to modify
     * @param attribute the attribute to add to the constructor
     */
    public static void addConstructorParameterForAttribute(Class cls, Attribute attribute) {
        Constructor constructor = DercsAccessHelper.getConstructor(cls);
        Parameter parameter = constructor.addParameter("_" + attribute.getName(), attribute.getDataType(), ParameterKind.IN);

        AssignmentAction assignmentAction = ActionsFactory.eINSTANCE.createAssignmentAction();
        assignmentAction.setName("Action");
        assignmentAction.setDestinationObject(null);
        assignmentAction.setDestinationAttribute(attribute);
        assignmentAction.setValue(parameter.getName());
        constructor.getTriggeredBehavior().getBehavioralElements().add(assignmentAction);
    }

    /**
     * Create an Object that is related to an attribute.
     * @param attribute the attribute that represents the object being created.
     * @param createAssociation Indicate whether the attribute should be associated with the object and vice-versa.
     * @return The created object instance.
     */
    public static dercs.structure.runtime.Object createAttributeRelatedObject(Attribute attribute, boolean createAssociation) {
        String objName = attribute.getOwnerClass().getName() + "~" + attribute.getName();
        Class cls = ((ClassDataType)attribute.getDataType()).getRepresents();
        return internalCreateRelatedObject(cls, attribute, objName, createAssociation);
    }

    /**
     * Create an Object that is related to a variable.
     * @param localVariable the variable that represents the object being created.
     * @param createAssociation Indicate whether the variable should be associated with the object and vice-versa.
     * @return The created object instance.
     */
    public static dercs.structure.runtime.Object createLocalRelatedObject(LocalVariable localVariable, boolean createAssociation) {
        String objName = "VAR~" + localVariable.getName();
        Class cls = ((ClassDataType)localVariable.getDataType()).getRepresents();
        return internalCreateRelatedObject(cls, localVariable, objName, createAssociation);
    }

    /**
     * Create an Object that is related to an array attribute element
     * @param attribute the attribute that represents the object being created.
     * @param index Index of the array element representing the object
     * @param createAssociation Indicate whether the attribute should be associated with the object and vice-versa.
     * @return The created object instance.
     */
    public static dercs.structure.runtime.Object createAttributeRelatedObject(Attribute attribute, String index, boolean createAssociation) {
        String objName = attribute.getOwnerClass().getName() + "~" + attribute.getName() + "[" + index + "]";
        Class cls = ((ClassDataType)(((Array)attribute.getDataType()).getDataType())).getRepresents();
        return internalCreateRelatedObject(cls, attribute, objName, createAssociation);
    }

    /**
     * Create an Object that is related to an array variable element
     * @param localVariable the variable that represents the object being created.
     * @param index the index of the array element representing the object
     * @param createAssociation Indicate whether the variable should be associated with the object and vice-versa.
     * @return The created object instance.
     */
    public static dercs.structure.runtime.Object createLocalRelatedObject(LocalVariable localVariable, String index, boolean createAssociation) {
        String objName = "VAR~" + localVariable.getName() + "[" + index + "]";
        Class cls = ((ClassDataType)(((Array)localVariable.getDataType()).getDataType())).getRepresents();
        return internalCreateRelatedObject(cls, localVariable, objName, createAssociation);
    }

    private static dercs.structure.runtime.Object internalCreateRelatedObject(Class cls, RuntimeElement relatedTo, String objName, boolean createAssociation) {
        dercs.structure.runtime.Object result;
        if (cls.isActiveClass())
            result = DercsConstructors.newActiveObject(objName, cls, null);
        else if (cls.isPassiveClass())
            result = DercsConstructors.newPassiveObject(objName, cls);
        else
            result = DercsConstructors.newObject(objName, cls);

        if (createAssociation) {
            relatedTo.setAssociatedElement(result);
            result.setAssociatedElement(relatedTo);
        }

        return result;
    }

    /**
     * Create a dummy object from a specific class.
     * @param cl Class from which the object is created
     * @return The object.
     */
    public static dercs.structure.runtime.Object createDummyObject(Class cl) {
        return DercsConstructors.newObject("_dummy_", cl);
    }

    /**
     * Check if the object is a dummy object or not.
     * @param obj Object to be tested
     * @return TRUE if the object is dummy, FALSE otherwise.
     */
    public static boolean isDummyObject(dercs.structure.runtime.Object obj) {
        return obj.getName().compareTo("_dummy_") == 0;
    }

}
