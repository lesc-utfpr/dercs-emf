package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;

public class SetArrayElementCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        //TODO: Dummy for now
        return DercsConstructors.newSetArrayElementAction(null, null, null);
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.SET_ARRAY_ELEMENT_ACTION);
    }
}
