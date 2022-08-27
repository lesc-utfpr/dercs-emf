package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.AssignmentAction;
import dercs.behavior.actions.CreateObjectAction;
import dercs.datatypes.ClassDataType;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.behavior.MessageModelInfo;
import dercs.loader.exception.*;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.util.DercsCreationHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.ValueSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CreateObjectActionCreator extends BaseActionCreator {
    private final Logger LOGGER = LoggerFactory.getLogger("CreateObjectActionCreator");

    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        MessageModelInfo messageInfo = new MessageModelInfo(message, behavior, model);
        AssignmentAction result;

        // need to create the target object if it doesn't exist yet
        if (messageInfo.getToObject() == null) {
            if (messageInfo.getTargetAttribute() != null) {
                // create related object for attribute
                messageInfo.setToObject(DercsCreationHelper.createAttributeRelatedObject(messageInfo.getTargetAttribute(), true));
                // need to change class if attribute is a superclass
                if (messageInfo.getToObject().getInstanceOfClass() != messageInfo.getTargetClass()) {
                    if (messageInfo.getToObject().getInstanceOfClass().isSuperClassOf(messageInfo.getTargetClass())) {
                        messageInfo.getToObject().setInstanceOfClass(messageInfo.getTargetClass());
                    } else {
                        throw new InvalidChildClassException(messageInfo.getTargetClass().getName());
                    }
                }

            } else if (messageInfo.getTargetVariable() != null) {
                // create related object for variable
                messageInfo.setToObject(DercsCreationHelper.createLocalRelatedObject(messageInfo.getTargetVariable(), true));

            } else {
                // create new local variable
                LocalVariable newVar = behavior.addLocalVariable(messageInfo.getTargetAttribute().getName(), DercsConstructors.newClassDataType(messageInfo.getMethod().getOwnerClass()));
                messageInfo.setTargetVariable(newVar);
                messageInfo.setToObject(DercsCreationHelper.createLocalRelatedObject(messageInfo.getTargetVariable(), true));
            }
            model.getModel().getObjects().add(messageInfo.getToObject());
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

        CreateObjectAction createAction = DercsConstructors.newCreateObjectAction(messageInfo.getToObject());

        if (messageInfo.getTargetAttribute() != null) {
            result = DercsConstructors.newAssignmentAction(null, messageInfo.getTargetAttribute(), createAction);
        } else {
            if (messageInfo.getTargetVariable() != null) {
                result = DercsConstructors.newAssignmentAction(messageInfo.getTargetVariable(), createAction);
            } else {
                throw new InvalidAttributeReferenceException(messageInfo.getTargetLifeline().getName());
            }
        }

        // check if the assignment already exists, e.g. due to compositions creating their required objects.
        List<AssignmentAction> existingEquivalentActions = BehaviorHelper.findEquivalentAssignmentActions(behavior, result);
        if (existingEquivalentActions.size() > 0) {
            LOGGER.warn(
                    "Reusing existing assignment of '{}' in constructor of '{}', because it already exists.",
                    result.isAttributeAssignment() ? result.getDestinationAttribute().getName() : result.getDestinationVariable().getName(),
                    messageInfo.getMethod().getOwnerClass().getName()
            );
            result = existingEquivalentActions.get(0);
        }

        // === add parameters ===

        if (messageInfo.getMethod().getParameters().size() != message.getArguments().size()) {
            throw new ArgumentNumberDoesNotMatchException(message.getQualifiedName(), message.getOwner().toString(), message.getArguments().size(), messageInfo.getMethod());
        }

        for (ValueSpecification valueSpec : message.getArguments()) {
            String value = valueSpec.stringValue();
            if (value == null) {
                throw new UnexpectedArgumentException(message.getQualifiedName(), message.getOwner().toString(), message.getArguments().indexOf(valueSpec), valueSpec.getClass().getSimpleName());
            }
            value = value.trim();

            // try to get value
            Attribute attribute = messageInfo.getMethod().getOwnerClass().getAttribute(value);
            LocalVariable localVariable = BehaviorHelper.getLocalVariableRecursive(behavior, value);
            if (attribute != null) {
                // add name of attribute
                ((CreateObjectAction)result.getResultOfAction()).getParameterValues().add(attribute.getName());
            } else if (localVariable != null) {
                // add name of local var
                ((CreateObjectAction)result.getResultOfAction()).getParameterValues().add(localVariable.getName());
            } else {
                // add value as string
                ((CreateObjectAction)result.getResultOfAction()).getParameterValues().add(value);
            }
        }

        model.deployObject(messageInfo.getToObject());
        model.deployObject(messageInfo.getFromObject());

        return result;
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getMessageSort() == MessageSort.CREATE_MESSAGE_LITERAL;
    }
}
