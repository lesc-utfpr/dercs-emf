package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.datatypes.ClassDataType;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.behavior.MessageModelInfo;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidMessageTargetException;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageSort;

public class DestroyObjectActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        MessageModelInfo messageInfo = new MessageModelInfo(message, behavior, model);

        if (messageInfo.getToObject() == null) {
            // for a destructor the objects must already exist
            //TODO: couldn't this cause problems when destroy-messages are processed before create-messages?
            throw new InvalidMessageTargetException(messageInfo.getTargetLifeline().getName() + "." + messageInfo.getTargetClass().getName());
        }

        // try to find fromObject if it wasn't found yet
        if (messageInfo.getFromObject() == null) {
            LocalVariable variable = BehaviorHelper.getLocalVariableRecursive(behavior, messageInfo.getSourceLifeline().getName());
            if (variable != null && variable.getDataType() instanceof ClassDataType && ((ClassDataType) variable.getDataType()).getRepresents() == messageInfo.getSourceClass()) {
                // found variable with same name as source lifeline
                messageInfo.setFromObject(DercsAccessHelper.getObjectRelatedTo(variable, model));

            } else if (messageInfo.getSourceClass() == messageInfo.getTargetClass()) {
                messageInfo.setFromObject(messageInfo.getToObject());
            }
        }

        Action result = DercsConstructors.newDestroyObjectAction(messageInfo.getToObject());

        model.deployObject(messageInfo.getToObject());
        model.deployObject(messageInfo.getFromObject());

        return result;
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getMessageSort() == MessageSort.DELETE_MESSAGE_LITERAL;
    }
}
