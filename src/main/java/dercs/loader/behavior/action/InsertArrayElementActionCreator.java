package dercs.loader.behavior.action;

import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.exception.InvalidActionSyntaxException;
import dercs.structure.Attribute;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;

public class InsertArrayElementActionCreator extends AbstractArrayActionCreator {
    @Override
    protected String[] getAndVerifyParameters(Message message) throws InvalidActionSyntaxException {
        String[] params = ActionHelper.getParametersFromMethodString(message.getName());

        // can have either two or three parameters
        if (params.length != 2 && params.length != 3) {
            throw new InvalidActionSyntaxException(message.getName());
        }

        for (int i = 0; i < params.length; i++) {
            if (params[i].trim().isEmpty()) {
                throw new InvalidActionSyntaxException(message.getName() + " -> Parameter " + (i + 1));
            }
        }

        if (params.length == 2) {
            // no index given -> append at end (null index)
            params = new String[] {params[0], null, params[1]};
        }

        return params;
    }

    @Override
    protected Action createForAttribute(Attribute attribute, Message message, String[] params) {
        return DercsConstructors.newInsertArrayElementAction(null, attribute, params[1], params[2]);
    }

    @Override
    protected Action createForLocalVariable(LocalVariable localVariable, Message message, String[] params) {
        return DercsConstructors.newInsertArrayElementAction(localVariable, params[1], params[2]);
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.INSERT_ARRAY_ELEMENT_ACTION);
    }
}
