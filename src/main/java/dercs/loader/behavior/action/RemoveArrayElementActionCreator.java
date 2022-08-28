package dercs.loader.behavior.action;

import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.exception.InvalidActionSyntaxException;
import dercs.structure.Attribute;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;

public class RemoveArrayElementActionCreator extends AbstractArrayActionCreator {
    @Override
    protected String[] getAndVerifyParameters(Message message) throws InvalidActionSyntaxException {
        return ActionHelper.getParametersFromMethodString(message.getName(), 2);
    }

    @Override
    protected Action createForAttribute(Attribute attribute, Message message, String[] params) {
        return DercsConstructors.newRemoveArrayElementAction(attribute, params[1]);
    }

    @Override
    protected Action createForLocalVariable(LocalVariable localVariable, Message message, String[] params) {
        return DercsConstructors.newRemoveArrayElementAction(localVariable, params[1]);
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.REMOVE_ARRAY_ELEMENT_ACTION);
    }
}
