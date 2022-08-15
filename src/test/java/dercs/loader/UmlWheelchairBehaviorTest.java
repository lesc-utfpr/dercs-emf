package dercs.loader;

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.util.AbstractLoaderFileTest;
import dercs.loader.util.BehaviorTester;
import org.junit.jupiter.api.Test;

public class UmlWheelchairBehaviorTest extends AbstractLoaderFileTest {
    public UmlWheelchairBehaviorTest() throws DercsLoaderException {
        super("/uml_models/Wheelchair.uml");
    }

    @Test
    public void testGeneralBehavior() {
        BehaviorTester.of(BehaviorTester.getMethodBehavior(model(), "MovementController", "processMovementInformation"))
                .assignmentFromValue("newAngle", "angle + (x/y)*360")
                .assignmentFromValue("newSpeed", "speed + (x/y)*10/66")
                .end();
    }

    @Test
    public void testGeneralBehavior2() {
        BehaviorTester.of(BehaviorTester.getMethodBehavior(model(), "MovementActuator", "changeMovement"))
                .methodCall("leftWheel", "setSpeed", "newSpeed")
                .methodCall("rightWheel", "setSpeed", "newSpeed")
                .end();
    }

    @Test
    public void testMovementControlMalfunctionCorrectiveAction() {
        BehaviorTester.of(BehaviorTester.getMethodBehavior(model(), "MovementController", "exceptionPart"))
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
