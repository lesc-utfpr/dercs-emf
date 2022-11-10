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
package dercs.loader.behavior;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.datatypes.ClassDataType;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.structure.Class;
import dercs.structure.Method;
import dercs.structure.runtime.Object;
import org.eclipse.uml2.uml.*;

/**
 * Contains information on model-elements related to a UML message, such as lifelines, classes or objects.
 */
public class MessageModelInfo {
    private final Method method;

    private final Lifeline sourceLifeline;
    private final Lifeline targetLifeline;

    private final Class sourceClass;
    private final Class targetClass;

    private Object fromObject;
    private Object toObject;

    private Attribute targetAttribute;
    private LocalVariable targetVariable;

    /**
     * Creates a new instance from the given message.
     * This constructor will never create new associated objects.
     * @param message the message to create the info for
     * @param behavior the current behavior (for finding local variables)
     * @param model the DERCS model
     */
    public MessageModelInfo(Message message, Behavior behavior, InProgressDercsModel model) throws DercsLoaderException {
        method = ActionHelper.getMethodFromMessage(model, message);

        sourceLifeline = ((MessageOccurrenceSpecification) message.getSendEvent()).getCovered();
        targetLifeline = ((MessageOccurrenceSpecification) message.getReceiveEvent()).getCovered();

        sourceClass = ActionHelper.getMessageSourceClass(model, message);
        targetClass = ActionHelper.getMessageTargetClass(model, message);

        if (targetClass == null) {
            throw new ClassNotFoundException(targetLifeline.getName());
        }

        fromObject = BehaviorHelper.getObjectFromLifeline(model, sourceLifeline);

        // try to find target attribute
        targetAttribute = null;
        if (targetLifeline.getRepresents() instanceof Property) {
            Property prop = (Property) targetLifeline.getRepresents();
            if (prop.getOwner() instanceof org.eclipse.uml2.uml.Class && !(prop.getOwner() instanceof Interaction)) {
                // target lifeline is attribute of a class
                Attribute attribute = model.getCorrespondingDercsElement(prop);
                if (attribute.getOwnerClass() == sourceClass) {
                    targetAttribute = model.getCorrespondingDercsElement(prop);
                }
            }
        }

        // get object from attribute, if it exists
        toObject = BehaviorHelper.getObjectFromLifeline(model, targetLifeline);
        // try to find target variable
        targetVariable = null;
        if (targetAttribute == null) {
            targetVariable = BehaviorHelper.getLocalVariableRecursive(behavior, targetLifeline.getName());
            if (targetVariable != null && (targetVariable.getDataType() instanceof ClassDataType) && (((ClassDataType)targetVariable.getDataType()).getRepresents() == targetClass)) {
                toObject = DercsAccessHelper.getObjectRelatedTo(targetVariable, model);
            }
        }
    }

    public Method getMethod() {
        return method;
    }

    public Lifeline getSourceLifeline() {
        return sourceLifeline;
    }

    public Lifeline getTargetLifeline() {
        return targetLifeline;
    }

    public Class getSourceClass() {
        return sourceClass;
    }

    public Class getTargetClass() {
        return targetClass;
    }

    public Object getFromObject() {
        return fromObject;
    }

    public Object getToObject() {
        return toObject;
    }

    public Attribute getTargetAttribute() {
        return targetAttribute;
    }

    public LocalVariable getTargetVariable() {
        return targetVariable;
    }

    public void setFromObject(Object fromObject) {
        this.fromObject = fromObject;
    }

    public void setToObject(Object toObject) {
        this.toObject = toObject;
    }

    public void setTargetAttribute(Attribute targetAttribute) {
        this.targetAttribute = targetAttribute;
    }

    public void setTargetVariable(LocalVariable targetVariable) {
        this.targetVariable = targetVariable;
    }
}