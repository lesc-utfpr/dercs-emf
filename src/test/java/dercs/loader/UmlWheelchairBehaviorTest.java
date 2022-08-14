package dercs.loader;

import dercs.behavior.Behavior;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.DuplicateElementNameException;
import dercs.loader.util.AbstractLoaderFileTest;
import dercs.loader.util.BehaviorTester;
import dercs.loader.util.DercsAccessHelper;
import dercs.structure.Class;
import dercs.structure.Method;
import org.junit.jupiter.api.Test;

public class UmlWheelchairBehaviorTest extends AbstractLoaderFileTest {
    public UmlWheelchairBehaviorTest() throws DercsLoaderException {
        super("/uml_models/Wheelchair.uml");
    }

    private Behavior getMethodBehavior(String className, String methodName) {
        try {
            Class cls = DercsAccessHelper.findNamedElement(model().getClasses(), className);
            Method method = cls.getMethod(methodName);
            return method.getTriggeredBehavior();
        } catch (DuplicateElementNameException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Test
    public void testGeneralBehavior() {
        BehaviorTester.of(getMethodBehavior("MovementController", "processMovementInformation"))
                .assignmentFromValue("newAngle", "angle + (x/y)*360")
                .assignmentFromValue("newSpeed", "speed + (x/y)*10/66")
                .end();
    }

    @Test
    public void testGeneralBehavior2() {
        BehaviorTester.of(getMethodBehavior("MovementActuator", "changeMovement"))
                .methodCall("leftWheel", "setSpeed", "newSpeed")
                .methodCall("rightWheel", "setSpeed", "newSpeed")
                .end();
    }

    @Test
    public void testMovementControlMalfunctionCorrectiveAction() {
        BehaviorTester.of(getMethodBehavior("MovementController", "exceptionPart"))
                .withLocalVariable("Integer", "mode")
                .assignmentFromMethodCall("mode", "movInfo", "getMode")
                .subBehavior(b -> b
                        .withEnterCondition("mode == RETAIN_VALUES_ON_ERROR")
                        .selfCall("getLastValidControlComputation")
                        .methodCall("wcAct", "changeMovement", "angle", "speed")
                        .withAlternateBehavior(b2 -> b2
                                .withEnterCondition("mode == STOP_ON_ERROR")
                                .methodCall("wcAct", "stopWheelChair")
                                .end()
                        )
                        .end()
                )
                .methodCall("alarm", "startSignal")
                .end();
    }
}
