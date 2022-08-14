package dercs.loader.util;

import dercs.behavior.Behavior;
import dercs.behavior.BehavioralElement;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.*;
import dercs.structure.Class;
import dercs.structure.Method;
import dercs.structure.runtime.RuntimeElement;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Allows making assertions about the elements of a given behavior through chained method calls.
 * <p/>
 * The chain should always end with a call to {@link BehaviorTester#end()}, to assert correct length and local variable count.
 */
public class BehaviorTester {
    private final Behavior behavior;
    private final List<BehavioralElement> elements;
    private int index;
    private int expectedLocalVariableCount;

    private BehaviorTester(Behavior behavior) {
        this.behavior = behavior;
        this.elements = behavior.getBehavioralElements();
        this.index = 0;
        this.expectedLocalVariableCount = 0;
    }

    /**
     * Creates a new tester for the given behavior.
     * @param behavior the behavior to test
     * @return the new tester
     */
    public static BehaviorTester of(Behavior behavior) {
        return new BehaviorTester(behavior);
    }

    public BehaviorTester returnAction(Consumer<ActionWithOutput> sourceActionConsumer) {
        ReturnAction action = getCurrentElementAndAdvance(ReturnAction.class);
        assertNotNull(action.getResultOfAction(), "ReturnAction was not result of another action.");
        sourceActionConsumer.accept(action.getResultOfAction());
        return this;
    }

    public BehaviorTester returnAction(String value) {
        ReturnAction action = getCurrentElementAndAdvance(ReturnAction.class);
        assertEquals(value, action.getValue());
        return this;
    }

    public BehaviorTester destroyObject(String objectName) {
        DestroyObjectAction action = getCurrentElementAndAdvance(DestroyObjectAction.class);
        String objectContainerName = action.getRelatedObject().getAssociatedElement().getName();
        assertEquals(objectName, objectContainerName);
        return this;
    }

    public BehaviorTester methodCall(String calledObject, String calledMethod, String... args) {
        SendMessageAction action = getCurrentElementAndAdvance(SendMessageAction.class);
        //TODO: re-add once SMA creator works
//        assertNotNull(action.getToObject(), "Destination object of method call is null.");
//        RuntimeElement runtimeCalledElement = action.getToObject().getAssociatedElement();
//        assertEquals(calledObject, runtimeCalledElement.getName());
        Method method = action.getRelatedMethod();
        assertEquals(calledMethod, method.getName());

        //TODO: see above
//        assertEquals(args.length, action.getParameterValues().size(), "Incorrect number of method arguments.");
//        for (int i = 0; i < args.length; i++) {
//            assertEquals(args[i], action.getParameterValues().get(i).toString());
//        }

        return this;
    }

    public BehaviorTester selfCall(String calledMethod, String... args) {
        SendMessageAction action = getCurrentElementAndAdvance(SendMessageAction.class);
        assertSame(action.getFromObject(), action.getToObject());
        Method method = action.getRelatedMethod();
        assertEquals(calledMethod, method.getName());

        assertEquals(args.length, action.getParameterValues().size(), "Incorrect number of method arguments.");
        for (int i = 0; i < args.length; i++) {
            assertEquals(args[i], action.getParameterValues().get(i).toString());
        }

        return this;
    }

    public BehaviorTester assignmentFromObjectCreation(String destination, String className, String... args) {
        return assignment(destination, source -> {
            assertInstanceOf(CreateObjectAction.class, source);
            Class createdObjectClass = ((CreateObjectAction) source).getRelatedObject().getInstanceOfClass();
            assertEquals(className, createdObjectClass.getName());

            assertEquals(args.length, ((CreateObjectAction) source).getParameterValues().size());
            for (int i = 0; i < args.length; i++) {
                assertEquals(args[i], ((CreateObjectAction) source).getParameterValues().get(i));
            }
        });
    }

    public BehaviorTester assignmentFromMethodCall(String destination, String calledObject, String calledMethod, String... args) {
        return assignment(destination, source -> {
            assertInstanceOf(SendMessageAction.class, source);
            SendMessageAction action = ((SendMessageAction) source);
            //TODO: re-add once SMA creator works
//            assertNotNull(action.getToObject(), "Destination object of method call is null.");
//            RuntimeElement runtimeCalledElement = action.getToObject().getAssociatedElement();
//            assertEquals(calledObject, runtimeCalledElement.getName());
            Method method = action.getRelatedMethod();
            assertEquals(calledMethod, method.getName());

            //TODO: see above
//            assertEquals(args.length, action.getParameterValues().size(), "Incorrect number of method arguments.");
//            for (int i = 0; i < args.length; i++) {
//                assertEquals(args[i], action.getParameterValues().get(i).toString());
//            }
        });
    }

    public BehaviorTester assignment(String destination, Consumer<ActionWithOutput> sourceActionConsumer) {
        AssignmentAction action = getCurrentElement(AssignmentAction.class);
        assertNotNull(action.getResultOfAction(), "AssignmentAction was not result of another action.");
        sourceActionConsumer.accept(action.getResultOfAction());

        return assignmentFromValue(destination, null);
    }

    public BehaviorTester assignmentFromValue(String destination, String value) {
        AssignmentAction action = getCurrentElementAndAdvance(AssignmentAction.class);
        assertEquals(value, action.getValue());
        if (action.getDestinationAttribute() != null) {
            assertEquals(action.getDestinationAttribute().getName(), destination);
        } else if (action.getDestinationVariable() != null) {
            assertEquals(action.getDestinationVariable().getName(), destination);
        } else {
            fail("Assignment action ahs no destination");
        }
        return this;
    }

    public BehaviorTester subBehavior(Consumer<BehaviorTester> subTesterConsumer) {
        Behavior subBehavior = getCurrentElementAndAdvance(Behavior.class);
        subTesterConsumer.accept(new BehaviorTester(subBehavior));
        return this;
    }

    public BehaviorTester withEnterCondition(String condition) {
        assertEquals(condition, this.behavior.getEnterCondition(), "Behavior does not have correct enter condition.");
        return this;
    }

    public BehaviorTester withExitCondition(String condition) {
        assertEquals(condition, this.behavior.getExitCondition(), "Behavior does not have correct enter condition.");
        return this;
    }

    public BehaviorTester withNumberOfRepetitions(int number) {
        assertEquals(number, this.behavior.getNumberOfRepetitions());
        return this;
    }

    public BehaviorTester withLocalVariable(String type, String name) {
        LocalVariable local = this.behavior.getLocalVariable(name);
        assertNotNull(local, "Local variable not found.");
        assertEquals(type, DatatypeHelper.getDatatypeName(local.getDataType()), "Local variable has incorrect type.");
        this.expectedLocalVariableCount++;
        return this;
    }

    public BehaviorTester withAlternateBehavior(Consumer<BehaviorTester> subMatcherConsumer) {
        assertNotNull(this.behavior.getAlternateBehavior(), "Behavior has no alternate behavior.");
        subMatcherConsumer.accept(new BehaviorTester(this.behavior.getAlternateBehavior()));
        return this;
    }

    public void end() {
        assertEquals(this.elements.size(), this.index, "Behavior did not end at expected location.");
        assertEquals(this.expectedLocalVariableCount, this.behavior.getLocalVariables().size(), "Behavior has incorrect number of local variables.");
    }

    private <T extends BehavioralElement> T getCurrentElementAndAdvance(java.lang.Class<T> expectedClass) {
        T element = getCurrentElement(expectedClass);
        this.index++;
        return element;
    }

    @SuppressWarnings("unchecked")
    private <T extends BehavioralElement> T getCurrentElement(java.lang.Class<T> expectedClass) {
        assertTrue(this.index < this.elements.size(), "Behavior ended too early.");

        BehavioralElement current = this.elements.get(this.index);
        assertInstanceOf(expectedClass, current, "Behavioral element was of incorrect type.");
        return (T) current;
    }

    @Override
    public String toString() {
        return "BehaviorMatcher for behavior of '" + this.behavior.getOwner().getName() + "'";
    }
}
