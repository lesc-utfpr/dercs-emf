package dercs.loader.behavior.action;

import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.exception.InvalidActionSyntaxException;
import dercs.structure.Attribute;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;

public class ArrayLengthActionCreator extends AbstractArrayActionCreator {
    @Override
    protected String[] getAndVerifyParameters(Message message) throws InvalidActionSyntaxException {
        return ActionHelper.getParametersFromMethodString(message.getName(), 1);
    }

    @Override
    protected Action createForAttribute(Attribute attribute, Message message, String[] params) {
        return DercsConstructors.newGetArrayLengthAction(attribute);
    }

    @Override
    protected Action createForLocalVariable(LocalVariable localVariable, Message message, String[] params) {
        return DercsConstructors.newGetArrayLengthAction(localVariable);
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.ARRAY_LENGTH_ACTION);
    }
}
