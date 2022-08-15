package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.actions.Action;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Method;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;

public class SendMessageActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        //TODO: test if this correctly finds methods in superclasses
        Method method = BehaviorHelper.getMethodFromMessage(model, message);

        Lifeline sourceLifeline = ((MessageOccurrenceSpecification) message.getSendEvent()).getCovered();
        Lifeline targetLifeline = ((MessageOccurrenceSpecification) message.getReceiveEvent()).getCovered();

        //TODO: for constructors, check if the creation is already there

        // --- Old DERCS process ---
        // get target attribute or object (from local var, or create a new one)
        // for self message create dummy
        // for constructor, add object to model and local var
        // for destructor, make sure the object exists, if not create (handle if it is superclass)
        // get source object as local variable
        // create the action - constructor:create,assign | destructor:destroy | other:sendmessage
        // add parameters
        //  for constructors - find attributes/locals with same name as parameter, otherwise just pass string
        //  for methods - do the same thing
        // deploy source and target objects

        // dummy for now
        return DercsConstructors.newSendMessageAction(method, null, null, dercs.behavior.MessageSort.SYNCHCALL);
    }

    @Override
    public boolean canHandleMessage(Message message) {
        if (message.getSignature() != null) {
            return true;
        }

        if (message.getMessageSort() == MessageSort.CREATE_MESSAGE_LITERAL || message.getMessageSort() == MessageSort.DELETE_MESSAGE_LITERAL) {
            return true;
        }

        return false;
    }
}
