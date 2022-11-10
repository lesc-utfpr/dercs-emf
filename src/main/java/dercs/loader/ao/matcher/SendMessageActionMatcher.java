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
package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.SendMessageAction;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.ao.StereotypeMatcher;
import dercs.loader.exception.UnsupportedJpddDefinitionException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.runtime.Object;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Message;

import java.util.List;
import java.util.Set;

public class SendMessageActionMatcher extends AbstractActionMatcher {
    @Override
    protected boolean actionMatches(InProgressDercsModel model, Action action, Message message) throws UnsupportedJpddDefinitionException {
        if (!(action instanceof SendMessageAction)) {
            return false;
        }

        SendMessageAction sendMessageAction = (SendMessageAction) action;
        String methodMatchName = message.getName();

        try {
            if (!methodMatches(sendMessageAction.getRelatedMethod(), methodMatchName)) {
                return false;
            }
        } catch (UnsupportedJpddDefinitionException e) {
            throw new UnsupportedJpddDefinitionException(message.getQualifiedName());
        }

        // check target class stereotypes
        List<EObject> targetClassStereotypes = getStereotypesFromDercsElement(model, ((Object) sendMessageAction.getToObject()).getInstanceOfClass());
        if (!StereotypeMatcher.stereotypesMatch(model, targetClassStereotypes, getRequiredTargetClassStereotypes())) {
            return false;
        }

        // check method stereotypes
        List<EObject> stereotypes = getStereotypesFromDercsElement(model, sendMessageAction.getRelatedMethod());
        Set<EObject> requiredStereotypes = getJoinPointRequiredStereotypes();
        if (!StereotypeMatcher.stereotypesMatch(model, stereotypes, requiredStereotypes)) {
            return false;
        }

        //TODO: check parameters

        return true;
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.ACTION_MESSAGE_SENDING;
    }
}
