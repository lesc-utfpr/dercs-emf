package dercs.loader;

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.util.AbstractLoaderFileTest;
import dercs.loader.util.BehaviorTester;
import org.junit.jupiter.api.Test;

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
                        .assignmentFromValue("i", "i + 1")
                        .end()
                )
                .returnAction("false") //TODO: fails because return messages are not yet implemented
                .end();
    }

    @Test
    public void testNestedSelfCallBehavior() {
        BehaviorTester.of(BehaviorTester.getMethodBehavior(model(), "ChildChildClass", "voidMethod"))
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
                        .assignmentFromValue("i", "i - 1")
                        .end()
                )
                .end();
    }
}
