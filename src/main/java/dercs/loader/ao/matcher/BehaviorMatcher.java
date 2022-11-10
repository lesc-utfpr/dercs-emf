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
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import dercs.structure.Method;
import org.eclipse.emf.ecore.EObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BehaviorMatcher extends MethodMatcher {
    @Override
    @SuppressWarnings("unchecked")
    public List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) throws DercsLoaderException {
        List<Method> matchingMethods = (List<Method>) super.match(model, joinPoint);
        return matchingMethods.stream().map(Method::getTriggeredBehavior).collect(Collectors.toList());
    }

    @Override
    public List<EObject> getStereotypesFromDercsElement(InProgressDercsModel model, BaseElement element) {
        List<EObject> stereotypes = super.getStereotypesFromDercsElement(model, element);
        if (element instanceof Method) {
            stereotypes = new ArrayList<>(stereotypes);
            stereotypes.addAll(model.getMethodBehaviorStereotypes((Method) element));
        }
        return stereotypes;
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.BEHAVIOR;
    }
}
