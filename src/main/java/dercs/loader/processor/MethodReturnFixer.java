package dercs.loader.processor;

import dercs.behavior.Behavior;
import dercs.behavior.BehavioralElement;
import dercs.behavior.actions.ReturnAction;
import dercs.datatypes.Void;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.loader.util.DercsBuilders;
import dercs.structure.Class;
import dercs.structure.Method;
import dercs.util.DercsConstructors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodReturnFixer extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("MethodReturnFixer");

    @Override
    protected void run() throws DercsLoaderException {
        for (Class cls : model().getClasses()) {
            for (Method method : cls.getMethods()) {
                handleMethod(method);
            }
        }
    }

    private void handleMethod(Method method) {
        if (method.isAbstract() || method.getReturnType() == null || method.getReturnType() instanceof Void) {
            return;
        }

        boolean foundReturn = false;

        Behavior methodBehavior = method.getTriggeredBehavior();
        if (methodBehavior != null) {
            foundReturn = hasReturnAction(methodBehavior);
        }

        if (!foundReturn) {
            LOGGER.info("Non-void method '{}' in class '{}' has no return. Adding manually.", method.getName(), method.getOwnerClass().getName());

            if (methodBehavior == null) {
                LOGGER.info(" - Creating empty behavior.");
                methodBehavior = DercsBuilders.Behavior.create().build();
                method.setTriggeredBehavior(methodBehavior);
            }

            ReturnAction newReturn = DercsConstructors.newReturnAction(method, "__DEFAULT_VALUE__");
            methodBehavior.getBehavioralElements().add(newReturn);
        }
    }

    private boolean hasReturnAction(Behavior behavior) {
        for (BehavioralElement elem : behavior.getBehavioralElements()) {
            if (elem instanceof ReturnAction) {
                if (((ReturnAction) elem).getMethod() == null) {
                    LOGGER.error("ReturnAction does not have method reference set.");
                }
                return true;
            } else if (elem instanceof Behavior) {
                if (hasReturnAction((Behavior) elem)) {
                    return true;
                }
            }
        }

        if (behavior.hasAlternativeBehavior()) {
            return hasReturnAction(behavior.getAlternateBehavior());
        }

        return false;
    }

    @Override
    public String getName() {
        return "MethodReturnFixer";
    }
}
