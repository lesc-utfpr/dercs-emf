package dercs.loader.behavior.message;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.SendMessageAction;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.exception.DuplicatedBehaviorException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageSort;

public class ReplyMessageCreator extends BaseMessageCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) {
        Behavior callingBehavior = getCompiler().getCallingBehavior();
        SendMessageAction sendMessageAction = (SendMessageAction) callingBehavior.getBehavioralElements().get(callingBehavior.getBehavioralElements().size() - 1);

        Attribute targetAttribute = BehaviorHelper.getMessageTargetClass(model, message).getAttribute(message.getName());
        if (targetAttribute == null) {
            // local variable
            LocalVariable var = BehaviorHelper.getOrCreateLocalVariable(model, callingBehavior, message.getName(), sendMessageAction.getRelatedMethod().getReturnType());
            return DercsConstructors.newAssignmentAction(var, sendMessageAction);
        } else {
            // attribute
            return DercsConstructors.newAssignmentAction(null, targetAttribute, sendMessageAction);
        }
    }

    @Override
    protected void customAddAction(InProgressDercsModel model, Action newAction, Behavior behavior) throws DuplicatedBehaviorException {
        // replace last element
        Behavior callingBehavior = getCompiler().getCallingBehavior();
        callingBehavior.getBehavioralElements().remove(callingBehavior.getBehavioralElements().size() - 1);
        callingBehavior.getBehavioralElements().add(newAction);

        getCompiler().getCallingMethod().markModified();
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getMessageSort() == MessageSort.REPLY_LITERAL;
    }
}
