package dercs.util;

import dercs.AO.AOFactory;
import dercs.AO.Aspect;
import dercs.AO.JoinPoint;
import dercs.AO.Pointcut;
import dercs.Model;
import dercs.behavior.*;
import dercs.behavior.actions.*;
import dercs.datatypes.Byte;
import dercs.datatypes.Double;
import dercs.datatypes.Float;
import dercs.datatypes.Long;
import dercs.datatypes.Short;
import dercs.datatypes.Void;
import dercs.datatypes.*;
import dercs.structure.Class;
import dercs.structure.*;
import dercs.structure.runtime.Object;
import dercs.structure.runtime.*;

import java.lang.String;

/**
 * Contains "fake constructors" for commonly needed DERCS objects.
 * These are
 */
public class DercsConstructors {
    // STRUCTURE

    public static dercs.structure.Class newClass(String name, Class superClass, boolean isAbstract, Model owner) {
        dercs.structure.Class obj = StructureFactory.eINSTANCE.createClass();
        obj.setName(name);
        obj.setSuperClass(superClass);
        obj.setAbstract(isAbstract);
        obj.setOwner(owner);
        return obj;
    }

    public static Node newNode(String name, String platformName) {
        Node obj = RuntimeFactory.eINSTANCE.createNode();
        obj.setName(name);
        obj.setPlatformName(platformName);
        return obj;
    }

//    /**
//     * Create an instance of a method which should belong to a class and also
//     * associated with an attribute, i.e. create a get/set method.
//     * @param name Name of the method
//     * @param getter indicate if the method is a get (TRUE) or set (FALSE) method
//     * @param visibility Visibility of the method
//     * @param overwroteMethod Indicates whether the method overwrites some inherited method
//     * @param triggeredBehavior Behavior which is triggered by the method
//     * @param owner Class which owns the method
//     * @param attribute Attribute associated with the method
//     */
//    public static Method newMethod(String name, boolean getter, Visibility visibility,
//                                   boolean overwroteMethod, Behavior triggeredBehavior, Class owner,
//                                   Attribute attribute) {
//        Method obj = StructureFactory.eINSTANCE.createMethod();
//        obj.setName(name);
//        if (getter && attribute != null) {
//            obj.setReturnType(attribute.getDataType());
//        } else {
//            obj.setReturnType(null);
//            obj.addParameter("p"+attribute.getName(), attribute.getDataType(), ParameterKind.IN);
//        }
//        obj.setVisibility(visibility);
//        obj.setTriggeredBehavior(triggeredBehavior);
//        obj.setOverwritingMethod(overwroteMethod);
//        obj.setOwnerClass(owner);
//        obj.setAssociatedAttribute(attribute);
//        obj.setActive(false);
//        obj.setEvery(0);
//        return obj;
//    }

//    /**
//     * Create an instance of a method which should belong to a class.
//     * @param name Name of the method
//     * @param returnType Return data type of the method
//     * @param visibility Visibility of the method
//     * @param overwroteMethod Indicates whether the method overwrites some
//     * inherited method
//     * @param isAbstract Indicates whether the method is abstract or not
//     * @param triggeredBehavior Behavior which is triggered by the method
//     * @param owner Class which owns the method
//     */
//    public static Method newMethod(String name, DataType returnType, Visibility visibility,
//                                   boolean overwroteMethod, boolean isAbstract, Behavior triggeredBehavior, Class owner) {
//        Method obj = StructureFactory.eINSTANCE.createMethod();
//        obj.setName(name);
//        obj.setReturnType(returnType);
//        obj.setVisibility(visibility);
//        obj.setTriggeredBehavior(triggeredBehavior);
//        obj.setOverwritingMethod(overwroteMethod);
//        obj.setAbstract(isAbstract);
//        if (obj.isAbstract() && owner != null && !owner.isAbstract()) {
//            owner.setAbstract(true);
//        }
//        obj.setOwnerClass(owner);
//        obj.setAssociatedAttribute(null);
//        obj.setActive(false);
//        obj.setEvery(0);
//        return obj;
//    }

    // BEHAVIOR

    public static Behavior newBehavior(NamedElement owner, String enterCondition, String exitCondition, int numberOfRepetitions) {
        Behavior obj = BehaviorFactory.eINSTANCE.createBehavior();
        obj.setName("Behavior");
        obj.setOwner(owner);
        obj.setEnterCondition(enterCondition);
        obj.setExitCondition(exitCondition);
        obj.setNumberOfRepetitions(numberOfRepetitions);
        return obj;
    }

    public static dercs.structure.runtime.Object newObject(String name, Class instanceOf) {
        dercs.structure.runtime.Object obj = RuntimeFactory.eINSTANCE.createObject();
        obj.setName(name);
        obj.setInstanceOfClass(instanceOf);
        return obj;
    }

    public static PassiveObject newPassiveObject(String name, Class instanceOf) {
        PassiveObject obj = RuntimeFactory.eINSTANCE.createPassiveObject();
        obj.setName(name);
        obj.setInstanceOfClass(instanceOf);
        return obj;
    }

    public static ActiveObject newActiveObject(String name, Class instanceOf, Method mainBehavior) {
        ActiveObject obj = RuntimeFactory.eINSTANCE.createActiveObject();
        obj.setName(name);
        obj.setInstanceOfClass(instanceOf);
        obj.setMainBehaviour(mainBehavior);
        return obj;
    }

    // ACTIONS

    public static AssignmentAction newAssignmentAction(LocalVariable variable, String value) {
        AssignmentAction obj = ActionsFactory.eINSTANCE.createAssignmentAction();
        obj.setName("Action");
        obj.setDestinationVariable(variable);
        obj.setValue(value);
        return obj;
    }

    public static AssignmentAction newAssignmentAction(LocalVariable variable, ActionWithOutput resultOf) {
        AssignmentAction obj = ActionsFactory.eINSTANCE.createAssignmentAction();
        obj.setName("Action");
        obj.setDestinationVariable(variable);
        obj.setResultOfAction(resultOf);
        return obj;
    }

    public static AssignmentAction newAssignmentAction(LocalVariable variable, Parameter param) {
        AssignmentAction obj = ActionsFactory.eINSTANCE.createAssignmentAction();
        obj.setName("Action");
        obj.setDestinationVariable(variable);
        obj.setValue(param.getName());
        return obj;
    }

    public static AssignmentAction newAssignmentAction(dercs.structure.runtime.Object object, Attribute attribute, String value) {
        AssignmentAction obj = ActionsFactory.eINSTANCE.createAssignmentAction();
        obj.setName("Action");
        obj.setDestinationObject(object);
        obj.setDestinationAttribute(attribute);
        obj.setValue(value);
        return obj;
    }

    public static AssignmentAction newAssignmentAction(dercs.structure.runtime.Object object, Attribute attribute, ActionWithOutput resultOf) {
        AssignmentAction obj = ActionsFactory.eINSTANCE.createAssignmentAction();
        obj.setName("Action");
        obj.setDestinationObject(object);
        obj.setDestinationAttribute(attribute);
        obj.setResultOfAction(resultOf);
        return obj;
    }

    public static AssignmentAction newAssignmentAction(dercs.structure.runtime.Object object, Attribute attribute, Parameter param) {
        AssignmentAction obj = ActionsFactory.eINSTANCE.createAssignmentAction();
        obj.setName("Action");
        obj.setDestinationObject(object);
        obj.setDestinationAttribute(attribute);
        obj.setValue(param.getName());
        return obj;
    }

    public static ExpressionAction newExpressionAction(String expression) {
        ExpressionAction obj = ActionsFactory.eINSTANCE.createExpressionAction();
        obj.setName("Action");
        obj.setExpression(expression);
        return obj;
    }

    public static SetArrayElementAction newSetArrayElementAction(LocalVariable variable, String element, String value) {
        SetArrayElementAction obj = ActionsFactory.eINSTANCE.createSetArrayElementAction();
        obj.setName("Action");
        obj.setArrayVariable(variable);
        obj.setArrayElement(element);
        obj.setValue(value);
        return obj;
    }

    public static SetArrayElementAction newSetArrayElementAction(dercs.structure.runtime.Object object, Attribute attribute, String element, String value) {
        SetArrayElementAction obj = ActionsFactory.eINSTANCE.createSetArrayElementAction();
        obj.setName("Action");
        obj.setArrayObject(object);
        obj.setArrayAttribute(attribute);
        obj.setArrayElement(element);
        obj.setValue(value);
        return obj;
    }

    public static GetArrayElementAction newGetArrayElementAction(LocalVariable variable, String element) {
        GetArrayElementAction obj = ActionsFactory.eINSTANCE.createGetArrayElementAction();
        obj.setName("Action");
        obj.setArrayVariable(variable);
        obj.setArrayElement(element);
        return obj;
    }

    public static GetArrayElementAction newGetArrayElementAction(dercs.structure.runtime.Object object, Attribute attribute, String element) {
        GetArrayElementAction obj = ActionsFactory.eINSTANCE.createGetArrayElementAction();
        obj.setName("Action");
        obj.setArrayObject(object);
        obj.setArrayAttribute(attribute);
        obj.setArrayElement(element);
        return obj;
    }

    public static ReturnAction newReturnAction(Method method, ActionWithOutput resultOf) {
        ReturnAction obj = ActionsFactory.eINSTANCE.createReturnAction();
        obj.setName("Action");
        obj.setMethod(method);
        obj.setResultOfAction(resultOf);
        obj.setDestinationVariable(null);
        return obj;
    }

    public static ReturnAction newReturnAction(Method method, String value) {
        ReturnAction obj = ActionsFactory.eINSTANCE.createReturnAction();
        obj.setName("Action");
        obj.setMethod(method);
        obj.setValue(value);
        obj.setDestinationVariable(null);
        return obj;
    }

    public static CreateObjectAction newCreateObjectAction(dercs.structure.runtime.Object object) {
        CreateObjectAction obj = ActionsFactory.eINSTANCE.createCreateObjectAction();
        obj.setName("Action");
        obj.setRelatedObject(object);
        return obj;
    }

    public static InsertArrayElementAction newInsertArrayElementAction(LocalVariable variable, String element, String value) {
        InsertArrayElementAction obj = ActionsFactory.eINSTANCE.createInsertArrayElementAction();
        obj.setName("Action");
        obj.setArrayVariable(variable);
        obj.setArrayElement(element);
        // FIXME: The value is not passed in the original dercs constructor.
        obj.setValue("");
        return obj;
    }

    public static InsertArrayElementAction newInsertArrayElementAction(Object object, Attribute attribute, String element, String value) {
        InsertArrayElementAction obj = ActionsFactory.eINSTANCE.createInsertArrayElementAction();
        obj.setName("Action");
        obj.setArrayObject(object);
        obj.setArrayAttribute(attribute);
        obj.setArrayElement(element);
        // FIXME: The value is not passed in the original dercs constructor.
        obj.setValue("");
        return obj;
    }

    public static ModifyStateAction newModifyStateAction(StateTransition transition, dercs.structure.runtime.Object object) {
        ModifyStateAction obj = ActionsFactory.eINSTANCE.createModifyStateAction();
        obj.setName("Action");
        obj.setRelatedObject(object);
        obj.setRelatedTransition(transition);
        return obj;
    }

    public static GetArrayLengthAction newGetArrayLengthAction(LocalVariable variable) {
        GetArrayLengthAction obj = ActionsFactory.eINSTANCE.createGetArrayLengthAction();
        obj.setName("Action");
        obj.setArrayVariable(variable);
        return obj;
    }

    public static RemoveArrayElementAction newRemoveArrayElementAction(LocalVariable variable, String element) {
        RemoveArrayElementAction obj = ActionsFactory.eINSTANCE.createRemoveArrayElementAction();
        obj.setName("Action");
        obj.setArrayVariable(variable);
        obj.setArrayElement(element);
        return obj;
    }

    public static DestroyObjectAction newDestroyObjectAction(dercs.structure.runtime.Object object) {
        DestroyObjectAction obj = ActionsFactory.eINSTANCE.createDestroyObjectAction();
        obj.setName("Action");
        obj.setRelatedObject(object);
        return obj;
    }

    public static SendMessageAction newSendMessageAction(Method relatedMethod, RuntimeElement fromObject, RuntimeElement toObject, MessageSort messageSort) {
        SendMessageAction obj = ActionsFactory.eINSTANCE.createSendMessageAction();
        obj.setName("Action");
        obj.setRelatedMethod(relatedMethod);
        obj.setFromObject(fromObject);
        obj.setToObject(toObject);
        obj.setMessageSort(messageSort);
        return obj;
    }

    // AO

    public static Pointcut newPointcut(String name) {
        Pointcut obj = AOFactory.eINSTANCE.createPointcut();
        obj.setName(name);
        return obj;
    }
    public static JoinPoint newJoinPoint(String name, Model model) {
        JoinPoint obj = AOFactory.eINSTANCE.createJoinPoint();
        obj.setName(name);
        obj.setModel(model);
        return obj;
    }
    public static Aspect newAspect(String name) {
        Aspect obj = AOFactory.eINSTANCE.createAspect();
        obj.setName(name);
        return obj;
    }

    // DATATYPES

    public static ClassDataType newClassDataType(dercs.structure.Class representsClass) {
        ClassDataType obj = DatatypesFactory.eINSTANCE.createClassDataType();
        obj.setRepresents(representsClass);
        return obj;
    }

    public static Array newArray(DataType dataType, java.lang.Integer size, java.lang.Integer lower, java.lang.Integer upper) {
        Array obj = DatatypesFactory.eINSTANCE.createArray();
        obj.setDataType(dataType);
        obj.setSize(size);
        obj.setLowerValue(lower);
        obj.setUpperValue(upper);
        return obj;
    }

    public static dercs.datatypes.Boolean newBoolean() {
        dercs.datatypes.Boolean obj = DatatypesFactory.eINSTANCE.createBoolean();
        return obj;
    }

    public static DateTime newDateTime() {
        DateTime obj = DatatypesFactory.eINSTANCE.createDateTime();
        return obj;
    }

    public static Enumeration newEnumeration(String name) {
        Enumeration obj = DatatypesFactory.eINSTANCE.createEnumeration();
        obj.setName(name);
        return obj;
    }

    public static dercs.datatypes.Void newVoid() {
        Void obj = DatatypesFactory.eINSTANCE.createVoid();
        return obj;
    }

    public static Byte newByte(boolean signal) {
        Byte obj = DatatypesFactory.eINSTANCE.createByte();
        obj.setSignal(true);
        return obj;
    }

    public static dercs.datatypes.Integer newInteger(boolean signal) {
        dercs.datatypes.Integer obj = DatatypesFactory.eINSTANCE.createInteger();
        obj.setSignal(true);
        return obj;
    }

    public static dercs.datatypes.Long newLong(boolean signal) {
        Long obj = DatatypesFactory.eINSTANCE.createLong();
        obj.setSignal(true);
        return obj;
    }

    public static Short newShort(boolean signal) {
        Short obj = DatatypesFactory.eINSTANCE.createShort();
        obj.setSignal(true);
        return obj;
    }

    public static Char newChar() {
        Char obj = DatatypesFactory.eINSTANCE.createChar();
        return obj;
    }

    public static dercs.datatypes.String newString(int size) {
        dercs.datatypes.String obj = DatatypesFactory.eINSTANCE.createString();
        obj.setSize(size);
        return obj;
    }

    public static dercs.datatypes.Float newFloat() {
        Float obj = DatatypesFactory.eINSTANCE.createFloat();
        return obj;
    }

    public static dercs.datatypes.Double newDouble() {
        Double obj = DatatypesFactory.eINSTANCE.createDouble();
        return obj;
    }
}
