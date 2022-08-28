package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.behavior.actions.AssignmentAction;
import dercs.behavior.actions.ExpressionAction;
import dercs.datatypes.CharacterDataTypes;
import dercs.datatypes.DataType;
import dercs.datatypes.FloatingPointDatatypes;
import dercs.datatypes.IntegerDataTypes;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Class;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

public class AssignActionCreator extends AbstractAssignmentActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        // verify arguments
        String[] params = ActionHelper.getParametersFromMethodString(message.getName(), 2);

        Class sourceClass = ActionHelper.getMessageSourceClass(model, message);
        if (sourceClass == null) {
            throw new ClassNotFoundException(((MessageOccurrenceSpecification) message.getSendEvent()).getCovered().getName());
        }

        AssignmentAction newAction = findTargetAndCreateEmptyAssignment(model, sourceClass, behavior, params[0]);
        newAction.setValue(params[1]);

        fixRightSideExpression(newAction);

        return newAction;
    }

    /**
     * If the data types of left and right side don't match, convert the right side to an expression.
     * @param assignmentAction the action to check
     */
    private void fixRightSideExpression(AssignmentAction assignmentAction) {
        DataType leftSideType = null;
        if (assignmentAction.isAttributeAssignment()) {
            leftSideType = assignmentAction.getDestinationAttribute().getDataType();
        } else if (assignmentAction.isVariableAssignment()) {
            leftSideType = assignmentAction.getDestinationVariable().getDataType();
        }

        if (assignmentAction.isAssignmentOfValue()) {
            String value = assignmentAction.getValue();

            if ((leftSideType instanceof FloatingPointDatatypes ||leftSideType instanceof IntegerDataTypes) && DatatypeHelper.isNumber(value)) {
                return;
            }

            if ((DatatypeHelper.isExpression(value)) || (!(leftSideType instanceof CharacterDataTypes) && (DatatypeHelper.isIdentifier(value)))) {
                ExpressionAction ea = DercsConstructors.newExpressionAction(value);
                assignmentAction.setResultOfAction(ea);
                assignmentAction.setValue(null);
            }
        }
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.ASSIGN_ACTION);
    }
}
