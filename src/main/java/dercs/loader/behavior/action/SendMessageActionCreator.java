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
import dercs.datatypes.Array;
import dercs.datatypes.ClassDataType;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.behavior.MessageModelInfo;
import dercs.loader.exception.ArgumentNumberDoesNotMatchException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidMessageTargetException;
import dercs.loader.exception.UnexpectedArgumentException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.util.DercsCreationHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.util.DercsConstructors;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ValueSpecification;

public class SendMessageActionCreator extends BaseActionCreator {
    @Override
    protected Action createAction(InProgressDercsModel model, Message message, Behavior behavior) throws DercsLoaderException {
        MessageModelInfo messageInfo = new MessageModelInfo(message, behavior, model);
        SendMessageAction result;

        // need to create the target object if it doesn't exist yet
        if (messageInfo.getToObject() == null) {
            if (messageInfo.getSourceClass() == messageInfo.getTargetClass()) {
                // self-call
                messageInfo.setToObject(DercsCreationHelper.createDummyObject(messageInfo.getTargetClass()));

            } else if (!messageInfo.getMethod().isStatic()) {
                // only need to find target if method is not static
                if (messageInfo.getTargetAttribute() == null) {
                    // target lifeline must represent an attribute of the source class
                    throw new InvalidMessageTargetException(messageInfo.getTargetLifeline().getName() + "." + messageInfo.getTargetClass().getName());
                }

                // need to create object in attribute
                if (messageInfo.getTargetAttribute().getDataType() instanceof Array) {
                    // find index from name or lifeline selector
                    String name = messageInfo.getTargetLifeline().getName();
                    String index;

                    if (!name.contains("[") || !name.contains("]")) {
                        ValueSpecification selector = messageInfo.getTargetLifeline().getSelector();
                        index = selector.stringValue();
                    } else {
                        index = name.substring(name.indexOf("[")+1, name.indexOf("]")).trim();
                    }

                    if (index == null || index.isEmpty()) {
                        throw new InvalidMessageTargetException(messageInfo.getTargetLifeline().getName());
                    }

                    messageInfo.setToObject(DercsCreationHelper.createAttributeRelatedObject(messageInfo.getTargetAttribute(), index, false));

                } else {
                    messageInfo.setToObject(DercsCreationHelper.createAttributeRelatedObject(messageInfo.getTargetAttribute(), true));
                }
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

        if (messageInfo.getFromObject() == null) {
            messageInfo.setFromObject(DercsCreationHelper.createDummyObject(messageInfo.getSourceClass()));
        }
        result = DercsConstructors.newSendMessageAction(messageInfo.getMethod(), messageInfo.getFromObject(), messageInfo.getToObject(), DatatypeHelper.convertMessageSort(message.getMessageSort()));

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
                result.getParameterValues().add(attribute.getName());
            } else if (localVariable != null) {
                // add name of local var
                result.getParameterValues().add(localVariable.getName());
            } else {
                // add value as string
                result.getParameterValues().add(value);
            }
        }

        model.deployObject(messageInfo.getToObject());
        model.deployObject(messageInfo.getFromObject());

        return result;
    }

    @Override
    public boolean canHandleMessage(Message message) {
        return message.getSignature() != null && message.getSignature() instanceof Operation;
    }
}
