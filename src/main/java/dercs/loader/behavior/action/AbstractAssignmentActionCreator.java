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
import dercs.behavior.actions.AssignmentAction;
import dercs.datatypes.ClassDataType;
import dercs.loader.behavior.BehaviorHelper;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidAttributeReferenceException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.structure.Class;
import dercs.structure.runtime.Object;
import dercs.util.DercsConstructors;

/**
 * Contains shared behavior for creating assignment actions to a certain target.
 */
public abstract class AbstractAssignmentActionCreator extends BaseActionCreator {
    protected AssignmentAction findTargetAndCreateEmptyAssignment(InProgressDercsModel model, Class sourceClass, Behavior behavior, String leftSide) throws DercsLoaderException {
        // remove array brackets if they exist
        if (leftSide.contains("[")) {
            leftSide = leftSide.substring(0, leftSide.indexOf("["));
        }
        leftSide = leftSide.trim();
        Attribute attribute = sourceClass.getAttribute(leftSide);

        if (attribute != null) {
            // attribute
            Object obj = DercsAccessHelper.getObjectRelatedTo(attribute, model);
            if ((obj == null) && (attribute.getDataType() instanceof ClassDataType)) {
                throw new InvalidAttributeReferenceException(leftSide);
            }

            return DercsConstructors.newAssignmentAction(obj, attribute, (String)null);
        } else {
            // local variable
            String type = null;
            String name = null;
            String[] datatypeAndName = leftSide.split("\\s");
            if (datatypeAndName.length > 1) {
                type = datatypeAndName[0];
                name = datatypeAndName[1];
            } else {
                name = leftSide;
            }

            LocalVariable localVar;
            if (type != null) {
                localVar = BehaviorHelper.getOrCreateLocalVariableRecursive(model, behavior, name, DatatypeHelper.getDercsTypeFromName(model, type));
            } else {
                localVar = BehaviorHelper.getOrCreateLocalVariableRecursive(model, behavior, name, null);
            }

            return DercsConstructors.newAssignmentAction(localVar, (String)null);
        }
    }
}
