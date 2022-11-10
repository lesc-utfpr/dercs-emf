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
import dercs.AO.AOFactory;
import dercs.AO.JoinPoint;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class JoinPointsExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("JoinPointsExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        List<Package> packages =  resource().getAllModelElementsOfType(UMLPackage.Literals.PACKAGE);
        for (Package pckg : packages) {
            if (getAppliedStereotype(pckg, AspectsModelingPackage.Literals.JPDD) != null) {
                // class-diagram JPDD
                JoinPoint newJoinPoint = AOFactory.eINSTANCE.createJoinPoint();
                newJoinPoint.setName(pckg.getName());
                LOGGER.info("Creating join point '{}'.", newJoinPoint.getName());
                model().getJoinPoints().add(newJoinPoint);
                inProgressModel().registerDercsUmlElementPair(newJoinPoint, pckg);
            }
        }

        List<Interaction> interactions =  resource().getAllModelElementsOfType(UMLPackage.Literals.INTERACTION);
        for (Interaction interaction : interactions) {
            if (getAppliedStereotype(interaction, AspectsModelingPackage.Literals.JPDD) != null) {
                // sequence-diagram JPDD
                JoinPoint newJoinPoint = AOFactory.eINSTANCE.createJoinPoint();
                newJoinPoint.setName(interaction.getName());
                LOGGER.info("Creating join point '{}'.", newJoinPoint.getName());
                model().getJoinPoints().add(newJoinPoint);
                inProgressModel().registerDercsUmlElementPair(newJoinPoint, interaction);
            }
        }
    }

    @Override
    public String getName() {
        return "JoinPointsExtractor";
    }
}
