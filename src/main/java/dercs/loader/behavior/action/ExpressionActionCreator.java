/***************************************************************************************
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Copyright Contributors to the DERCS-EMF Project.
 * 
 ****************************************************************************************/
package dercs.loader.behavior.action;

import dercs.behavior.Behavior;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionNames;
import dercs.behavior.actions.AssignmentAction;
import dercs.behavior.actions.ExpressionAction;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidActionSyntaxException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Class;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

//TODO: unfinished
public class ExpressionActionCreator extends AbstractAssignmentActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        String[] params = ActionHelper.getParametersFromMethodString(message.getName());

        Class sourceClass = ActionHelper.getMessageSourceClass(model, message);
        if (sourceClass == null) {
            throw new ClassNotFoundException(((MessageOccurrenceSpecification) message.getSendEvent()).getCovered().getName());
        }

        if (params.length == 1) {
            // just evaluate expression
            return DercsConstructors.newExpressionAction(params[0].trim());
        } else if (params.length == 2) {
            // evaluate and assign
            ExpressionAction expr = DercsConstructors.newExpressionAction(params[1].trim());
            AssignmentAction assignment = findTargetAndCreateEmptyAssignment(model, sourceClass, behavior, params[0]);
            assignment.setResultOfAction(expr);
            return assignment;
        } else {
            throw new InvalidActionSyntaxException(message.getName());
        }
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.EXPRESSION_ACTION);
    }
}
