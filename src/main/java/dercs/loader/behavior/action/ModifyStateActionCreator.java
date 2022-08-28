package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.BehaviorFactory;
import dercs.behavior.StateTransition;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.runtime.RuntimeFactory;
import dercs.structure.runtime.State;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;

//TODO: unfinished
public class ModifyStateActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        String[] params = ActionHelper.getParametersFromMethodString(message.getName(), 1);

        State toState = RuntimeFactory.eINSTANCE.createState();
        toState.setName(params[0]);
        StateTransition transition = BehaviorFactory.eINSTANCE.createStateTransition();
        transition.setToState(toState);

        return DercsConstructors.newModifyStateAction(transition, null);
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.MODIFY_STATE_ACTION);
    }
}
