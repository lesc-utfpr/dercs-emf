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
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.SendMessageAction;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.exception.DuplicatedBehaviorException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageSort;

public class ReplyActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) {
        Behavior callingBehavior = getCompiler().getCallingBehavior();
        // if we were the first called method, then don't try to create anything in the parent
        if (callingBehavior == null) {
            return null;
        }

        SendMessageAction sendMessageAction = (SendMessageAction) callingBehavior.getBehavioralElements().get(callingBehavior.getBehavioralElements().size() - 1);

        if (message.getName() == null || message.getName().isEmpty()) {
            return null;
        }

        Attribute targetAttribute = ActionHelper.getMessageTargetClass(model, message).getAttribute(message.getName());
        if (targetAttribute == null) {
            // local variable
            LocalVariable var = BehaviorHelper.getOrCreateLocalVariableRecursive(model, callingBehavior, message.getName(), sendMessageAction.getRelatedMethod().getReturnType());
            return DercsConstructors.newAssignmentAction(var, sendMessageAction);
        } else {
            // attribute
            return DercsConstructors.newAssignmentAction(null, targetAttribute, sendMessageAction);
        }
    }

    @Override
    protected void customAddAction(InProgressDercsModel model, Action newAction, Behavior behavior) throws DuplicatedBehaviorException {
        if (newAction == null) {
            return;
        }

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
