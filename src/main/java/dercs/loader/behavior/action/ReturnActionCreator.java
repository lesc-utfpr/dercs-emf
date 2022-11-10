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
import dercs.behavior.actions.ActionNames;
import dercs.behavior.actions.AssignmentAction;
import dercs.behavior.actions.ExpressionAction;
import dercs.datatypes.*;
import dercs.loader.behavior.ActionHelper;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidAttributeReferenceException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.structure.Class;
import dercs.structure.Method;
import dercs.structure.runtime.Object;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

import java.lang.String;

public class ReturnActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        // try to get the returned information
        String[] params = ActionHelper.getParametersFromMethodString(message.getName(), 1);

        Class sourceClass = ActionHelper.getMessageSourceClass(model, message);
        if (sourceClass == null) {
            throw new ClassNotFoundException(((MessageOccurrenceSpecification) message.getSendEvent()).getCovered().getName());
        }

        // remove array brackets if they exist
        if (params[0].contains("[")) {
            params[0] = params[0].substring(0, params[0].indexOf("["));
        }
        params[0] = params[0].trim();

        Attribute attribute = sourceClass.getAttribute(params[0]);
        LocalVariable localVariable = BehaviorHelper.getLocalVariableRecursive(behavior, params[0]);

        // there is currently no difference in the created action regardless of the value source
        if (attribute != null) {
            // attribute
            // now try to check if there is an object that refers to this attribute
            Object obj = DercsAccessHelper.getObjectRelatedTo(attribute, model);
            if ((obj == null) && (attribute.getDataType() instanceof ClassDataType)) {
                throw new InvalidAttributeReferenceException(params[0]);
            }

        } else if (localVariable != null) {
            // local variable
            // NOTE: this is slightly different to old DERCS, which created a new local variable here
        } else {
            // value

        }

        //TODO: check if this is always the correct method
        Method method = getCompiler().getMethodCallstack().peek().getMethod();
        Action newAction = DercsConstructors.newReturnAction(method, params[0]);

        //TODO: set right side to expression if necessary

        return newAction;
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getName() != null && message.getName().startsWith(ActionNames.RETURN_ACTION);
    }
}
