package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.datatypes.ClassDataType;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidActionSyntaxException;
import dercs.loader.exception.InvalidAttributeReferenceException;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.structure.Class;
import dercs.structure.runtime.Object;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

public class ReturnActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        // try to get the returned information
        String[] params = BehaviorHelper.getParametersFromMethodString(message.getName());
        if (params[0].isEmpty()) {
            throw new InvalidActionSyntaxException(message.getName());
        }

        Class sourceClass = BehaviorHelper.getMessageSourceClass(model, message);
        if (sourceClass == null) {
            throw new ClassNotFoundException(((MessageOccurrenceSpecification) message.getSendEvent()).getCovered().getName());
        }

        // remove array brackets if they exist
        if (params[0].contains("[")) {
            params[0] = params[0].substring(0, params[0].indexOf("["));
        }
        params[0] = params[0].trim();

        Attribute attribute = sourceClass.getAttribute(params[0]);

        //TODO: what about literal values?
        if (attribute != null) {
            // attribute
            // now try to check if there is an object that refers to this attribute
            Object obj = DercsAccessHelper.getObjectRelatedTo(attribute, model);
            if ((obj == null) && (attribute.getDataType() instanceof ClassDataType)) {
                throw new InvalidAttributeReferenceException(params[0]);
            }
        } else {
            // local variable
            LocalVariable localVar = BehaviorHelper.getOrCreateLocalVariableRecursive(model, behavior, params[0], null);
        }

        // TEMPORARY: there is no information on the method associated to the return action
        Action newAction = DercsConstructors.newReturnAction(null, params[0]);

        //TODO: set input to expression if method is null ?
        // see old DERCS: MDO_DERCSLoader.fixReturnActionsWithExpression();

        return newAction;
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.RETURN_ACTION);
    }
}
