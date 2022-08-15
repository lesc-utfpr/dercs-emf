package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.behavior.actions.AssignmentAction;
import dercs.datatypes.ClassDataType;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidActionSyntaxException;
import dercs.loader.exception.InvalidAttributeReferenceException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.structure.Class;
import dercs.structure.runtime.Object;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

public class AssignActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        String[] params = BehaviorHelper.getParametersFromMethodString(message.getName());
        if (params[0].isEmpty()) {
            throw new InvalidActionSyntaxException(message.getName() + " -> Left Side");
        }
        if (params[1].isEmpty()) {
            throw new InvalidActionSyntaxException(message.getName() + " -> Right Side");
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
        AssignmentAction newAction;

        if (attribute != null) {
            // attribute
            Object obj = DercsAccessHelper.getObjectRelatedTo(attribute, model.getModel());
            if ((obj == null) && (attribute.getDataType() instanceof ClassDataType)) {
                throw new InvalidAttributeReferenceException(params[0]);
            }
            //TODO: actually parse right side of assignment
            newAction = DercsConstructors.newAssignmentAction(obj, attribute, params[1]);
        } else {
            // local variable
            String type = null;
            String name = null;
            String[] datatypeAndName = params[0].split("\\s");
            if (datatypeAndName.length > 1) {
                type = datatypeAndName[0];
                name = datatypeAndName[1];
            } else {
                name = params[0];
            }

            LocalVariable localVar;
            if (type != null) {
                localVar = BehaviorHelper.getOrCreateLocalVariable(model, behavior, name, DatatypeHelper.getDercsTypeFromName(model, type));
            } else {
                localVar = BehaviorHelper.getOrCreateLocalVariable(model, behavior, name, null);
            }

            //TODO: actually parse right side of assignment
            newAction = DercsConstructors.newAssignmentAction(localVar, params[1]);
        }

        //TODO: set right hand side to expression if datatype does not match left side
        // See old DERCS: MDOA_DERCSLoader.fixAssignActionsWithExpression();

        return newAction;
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.ASSIGN_ACTION);
    }
}
