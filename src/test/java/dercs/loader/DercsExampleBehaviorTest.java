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

import dercs.behavior.Behavior;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.util.AbstractLoaderFileTest;
import dercs.loader.util.BehaviorTester;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DercsExampleBehaviorTest extends AbstractLoaderFileTest {
    public DercsExampleBehaviorTest() throws DercsLoaderException {
        super("/uml_models/DercsTest.uml");
    }

    @Test
    public void testManualForLoopBehavior() {
        BehaviorTester.of(BehaviorTester.getMethodBehavior(model(), "ParentClass1", "baseMethod"))
                .withLocalVariable("Integer", "i")
                .assignmentFromValue("i", "0")
                .subBehavior(loop -> loop
                        .withExitCondition("!(i < 10)")
                        .subBehavior(opt -> opt
                                .withEnterCondition("i == 5")
                                .assignmentFromValue("i", "-999")
                                .end()
                        )
                        .assignmentFromExpression("i", "i + 1")
                        .end()
                )
                .returnAction("false")
                .end();
    }

    @Test
    public void testNestedSelfCallBehavior() {
        Behavior method1 = BehaviorTester.getMethodBehavior(model(), "ChildChildClass", "voidMethod");
        Behavior method2 = BehaviorTester.getMethodBehavior(model(), "ParentClass2", "voidMethod");
        assertSame(method1, method2);
        BehaviorTester.of(method1)
                .subBehavior(alt1 -> alt1
                        .withEnterCondition("enumParam == LITERAL_1")
                        .setArrayElement("arrayProp", "3", "-999")
                        .withAlternateBehavior(alt2 -> alt2
                                .withEnterCondition(" ")
                                .removeArrayElement("arrayProp", "0")
                                .end()
                        )
                        .end()

                )
                .subBehavior(alt1 -> alt1
                        .withLocalVariable(null, "i")
                        .withEnterCondition("int i = 5")
                        .withExitCondition("!(i > 0)")
                        .assignmentFromExpression("i", "i - 1")
                        .end()
                )
                .end();
    }

    @Test
    public void testOverridingMethodBehavior() {
        BehaviorTester.of(BehaviorTester.getMethodBehavior(model(), "ChildClass3", "voidMethod"))
                .withLocalVariable("Integer", "local")
                .subBehavior(alt1 -> alt1
                        .withNumberOfRepetitions(10)
                        .modifyState("STATE_5")
                        .end()
                )
                .assignmentFromValue("local", "0")
                .returnAction("local")
                .end();
    }
}
