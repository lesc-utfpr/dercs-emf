package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.datatypes.Array;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidActionSyntaxException;
import dercs.loader.exception.InvalidAttributeReferenceException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.structure.Class;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

/**
 * Contains shared behavior required for every array action.
 * Subclasses only have to override gathering of parameters and creation of the actual Action object.
 */
public abstract class AbstractArrayActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        String[] params = getAndVerifyParameters(message);

        Class sourceClass = ActionHelper.getMessageSourceClass(model, message);
        if (sourceClass == null) {
            throw new ClassNotFoundException(((MessageOccurrenceSpecification) message.getSendEvent()).getCovered().getName());
        }

        Attribute attribute = sourceClass.getAttribute(params[0]);
        LocalVariable localVar = BehaviorHelper.getLocalVariableRecursive(behavior, params[0]);

        if (attribute != null) {
            // attribute
            if (!(attribute.getDataType() instanceof Array)) {
                throw new InvalidAttributeReferenceException(params[0]);
            }
            return createForAttribute(attribute, message, params);

        } else if (localVar != null) {
            // local variable
            return createForLocalVariable(localVar, message, params);
        } else {
            throw new InvalidAttributeReferenceException(params[0]);
        }
    }

    protected abstract String[] getAndVerifyParameters(Message message) throws InvalidActionSyntaxException;
    protected abstract Action createForAttribute(Attribute attribute, Message message, String[] params);
    protected abstract Action createForLocalVariable(LocalVariable localVariable, Message message, String[] params);
}
