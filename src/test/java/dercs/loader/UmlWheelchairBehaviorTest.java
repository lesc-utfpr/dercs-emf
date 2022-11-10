/***************************************************************************************
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Copyright Contributors to the DERCS-EMF Project.
 * 
 ****************************************************************************************/
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
                .assignmentFromExpression("newAngle", "angle + (x/y)*360")
                .assignmentFromExpression("newSpeed", "speed + (x/y)*10/66")
                .end();
    }

    @Test
    public void testGeneralBehavior2() {
        BehaviorTester.of(BehaviorTester.getMethodBehavior(model(), "MovementActuator", "changeMovement"))
                .methodCall("leftWheel", "setSpeed", "speed + angle/360*0.45")
                .methodCall("rightWheel", "setSpeed", "speed + angle/360*0.35")
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
                        .methodCall("wcAct", "changeMovement", "newAngle", "newSpeed")
//                        .withAlternateBehavior(b2 -> b2
//                                .withEnterCondition("mode == STOP_ON_ERROR")
//                                .methodCall("wcAct", "stopWheelChair")
//                                .end()
//                        )
                        .withAlternateBehavior(b2 -> b2     //FIXME: temporary change to tests while the workaround in InteractionCompiler::CombinedFragmentInfo::createNextOperandInfo() is present
                                .subBehavior(b3 -> b3
                                        .withEnterCondition("mode == STOP_ON_ERROR")
                                        .methodCall("wcAct", "stopWheelChair")
                                        .end()
                                )
                                .end()
                        )
                        .end()
                )
                .methodCall("alarm", "startSignal")
                .end();
    }

    @Test
    public void testMovementSensoring() {
        BehaviorTester.of(BehaviorTester.getMethodBehavior(model(), "MovementEncoder", "run"))
                .withLocalVariable("Integer", "lWheel")
                .withLocalVariable("Integer", "rWheel")
                .withLocalVariable("Float", "speed")
                .withLocalVariable("Float", "angle")
                .assignmentFromMethodCall("lWheel", "leftWheelSensor", "getValue")
                .assignmentFromMethodCall("rWheel", "rightWheelSensor", "getValue")
                .assignmentFromExpression("speed", "(lWheel + rWheel)/2")
                .assignmentFromExpression("angle", "((lWheel - rWheel)/360)*1000")
                .methodCall("movInfo", "setSpeed", "speed")
                .methodCall("movInfo", "setAngle", "angle")
                .end();
    }

    @Test
    public void testSensingSubSystemInit() {
        BehaviorTester.of(BehaviorTester.getConstructorBehavior(model(), "SensoringSubSystem"))
                .ignore() // movInfo
                .ignore() // jstkInfo
                .assignmentFromObjectCreation("jstkSensor", "JoystickDriver", "jstkInfo")
                .assignmentFromObjectCreation("movEnc", "MovementEncoder", "movInfo", "alarm", "leftWheelSensor", "rightWheelSensor")
                .ignore()
                .ignore()
                .end();
    }
}
