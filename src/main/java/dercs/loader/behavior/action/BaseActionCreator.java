package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.actions.Action;
import dercs.loader.behavior.InteractionCompiler;
import dercs.loader.behavior.MessageProcessor;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import org.eclipse.uml2.uml.Message;

/**
 * Creates a new {@link Action} from the given message and adds it to the given behavior.
 */
public abstract class BaseActionCreator {
    private MessageProcessor parent;

    /**
     * Creates a new {@link Action} from the given message and adds it to the given behavior.
     * @param model the DERCS model
     * @param message the message to process
     * @param currentBehavior the behavior to add to
     * @return the newly created {@link Action}
     */
    public final Action addAction(InProgressDercsModel model, Message message, Behavior currentBehavior) throws DercsLoaderException{
        Action newAction = createAction(model, message, currentBehavior);
        customAddAction(model, newAction, currentBehavior);
        return newAction;
    }

    /**
     * Creates the {@link Action} from the given message
     * @param model the DERCS model
     * @param message the message to process
     * @param behavior the current behavior
     * @return the newly created {@link Action}
     */
    protected abstract Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException;

    /**
     * Checks whether the given message can be handled by this creator.
     * @param message the message to check
     * @return {@code true} if this message can be handled, {@code false} otherwise
     */
    public abstract boolean canHandleMessage(Message message);

    /**
     * Adds the newly created action to the given behavior.
     * @apiNote this may be overridden if this creator requires special handling to add the new action
     * @param model the DERCS model
     * @param newAction the newly created action
     * @param behavior the behavior to add to
     */
    protected void customAddAction(InProgressDercsModel model, Action newAction, Behavior behavior) throws DercsLoaderException {
        if (newAction == null) {
            return;
        }
        behavior.getBehavioralElements().add(newAction);
        //TODO: is this correct in all cases? it should be correct that we are always modifying the top method, even if we are in a fragment
        getCompiler().getMethodCallstack().peek().markModified();
    }

    /**
     * Used by the message processor to provide a reference to itself.
     * This is not a constructor parameter to prevent subclasses from having to declare the constructor again.
     * @param parent the parent message processor
     */
    public final void setParent(MessageProcessor parent) {
        this.parent = parent;
    }

    /**
     * Allows access to the interaction compiler to inspect the method or fragment stacks.
     * @return the interaction compiler
     */
    protected InteractionCompiler getCompiler() {
        return this.parent.getCompiler();
    }
}
