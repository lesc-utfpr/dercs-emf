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
package dercs.loader.processor;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import AMoDERT.AspectsModeling.Crosscut;
import dercs.AO.Aspect;
import dercs.AO.Crosscutting;
import dercs.AO.CrosscuttingInformation;
import dercs.loader.exception.AttributeNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidCrosscuttingInfoException;
import dercs.loader.exception.InvalidDataTypeException;
import dercs.loader.processor.base.AbstractModelProcessor;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrosscuttingExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("CrosscuttingExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        for (Aspect aspect : model().getAspects()) {
            Class umlClass = inProgressModel().getCorrespondingUmlElement(aspect);
            handleAspect(aspect, umlClass);
        }
    }

    private void handleAspect(Aspect aspect, Class umlClass) throws DercsLoaderException{
        for (Property attribute : umlClass.getOwnedAttributes()) {

            if (getAppliedStereotype(attribute.getAssociation(), AspectsModelingPackage.Literals.CROSSCUT) == null) {
                // skip if the association is not a crosscut
                continue;
            }

            // find class of other association end
            Type otherEndType = attribute.getType();

            if (!(otherEndType instanceof Class)) {
                throw new InvalidDataTypeException(attribute.getType().getName());
            }
            dercs.structure.Class endClass = inProgressModel().getCorrespondingDercsElement(otherEndType);
            LOGGER.info("Creating Crosscutting Info of '{}' for aspect '{}'.", endClass.getName(), aspect.getName());
            Crosscutting newCrosscutting = aspect.addCrosscuting(endClass);

            addCrosscuttingInfo(attribute.getAssociation(), newCrosscutting, endClass);
        }
    }

    private void addCrosscuttingInfo(Association association, Crosscutting newCrosscutting, dercs.structure.Class otherEndClass) throws DercsLoaderException {
        Crosscut crosscutAspect = getAppliedStereotype(association, AspectsModelingPackage.Literals.CROSSCUT);
        String assocName = association.getName();

        // get all attribute values
        for (String attributeValue : crosscutAspect.getAttributes()) {
            // values should take the form 'AttributeName=Value'
            String[] parts = attributeValue.split("=");
            if (parts.length == 1 && parts[0].trim().isEmpty()) {
                continue;
            } else if (parts.length != 2) {
                throw new InvalidCrosscuttingInfoException(attributeValue);
            }
            String attribName = parts[0].trim();
            String attribValue = parts[1].trim();

            if (assocName == null || assocName.isEmpty()) {
                // add info directly
                CrosscuttingInformation crossInfo = newCrosscutting.addInformation(attribName, attribValue);
                LOGGER.info(" - Adding Information: '{} = {}'", crossInfo.getName(), crossInfo.getValue());
            } else {
                // search target class for named attribute/method
                for (String namePart : assocName.split(",")) {
                    String nameToFind = namePart.trim();

                    if ((otherEndClass.getAttribute(nameToFind) == null) && (otherEndClass.getMethod(nameToFind) == null)) {
                        throw new AttributeNotFoundException(nameToFind);
                    }

                    CrosscuttingInformation crossInfo = newCrosscutting.addInformation(nameToFind + "." + attribName, attribValue);
                    LOGGER.info(" - Adding Information: '{} = {}'", crossInfo.getName(), crossInfo.getValue());
                }
            }
        }
    }

    @Override
    public String getName() {
        return "CroscuttingExtractor";
    }
}
