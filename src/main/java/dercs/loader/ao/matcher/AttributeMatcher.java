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
import dercs.loader.ao.StereotypeMatcher;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.structure.BaseElement;
import dercs.structure.Class;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Property;

import java.util.ArrayList;
import java.util.List;

public class AttributeMatcher extends ClassMatcher implements ISpecializedJoinPointMatcher {
    @Override
    public List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) {
        org.eclipse.uml2.uml.Class containingClass = ((Property) joinPoint.getMatchedElement()).getClass_();
        List<Class> matchingClasses = findMatchingClasses(model, containingClass.getName(), model.getSourceResource().getAppliedStereotypes(containingClass));

        Property jpddAttribute = (org.eclipse.uml2.uml.Property) joinPoint.getMatchedElement();

        List<Attribute> matched = new ArrayList<>();

        for (Class cls : matchingClasses) {
            for (Attribute attribute : cls.getAttributes()) {
                // check name
                if (!attributeMatches(attribute, jpddAttribute)) {
                    continue;
                }

                // check stereotypes
                List<EObject> stereotypes = getStereotypesFromDercsElement(model, attribute);
                if (!StereotypeMatcher.stereotypesMatch(model, stereotypes, joinPoint.getRequiredStereotypes())) {
                    continue;
                }

                matched.add(attribute);
            }
        }

        return matched;
    }

    private boolean attributeMatches(Attribute dercsAttribute, Property jpddAttribute) {
        if (jpddAttribute.getType() != null) {
            return nameMatches(dercsAttribute.getName(), jpddAttribute.getName()) && typeMatches(dercsAttribute.getDataType(), jpddAttribute.getType());
        } else {
            String[] parts = jpddAttribute.getName().split(":");
            return nameMatches(dercsAttribute.getName(), parts[0].trim()) && nameMatches(DatatypeHelper.getDatatypeName(dercsAttribute.getDataType()), parts[1].trim());
        }
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.ATTRIBUTE;
    }
}
