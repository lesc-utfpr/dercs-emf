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
package dercs.loader.util;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains helper functions for accessing commonly needed UML elements.
 */
public class UmlAccessHelper {
    /**
     * Gets all the deployed artifacts of a given node.
     * This helper is used since there are multiple ways for a node to deploy artifacts (the explicit deployment edge and nesting).
     * @param node the node to check
     * @return the given nodes deployed artifacts
     */
    public static List<DeployedArtifact> getAllNodeArtifacts(Node node) {
        List<DeployedArtifact> artifacts = new ArrayList<>();

        // handle explicit "deployment" edges
        for (Deployment deployment : node.getDeployments()) {
            for (DeployedArtifact artifact : deployment.getDeployedArtifacts()) {
                artifacts.add(artifact);
            }
        }

        // handle nested artifacts
        for (Classifier nested : node.getNestedClassifiers()) {
            if (nested instanceof DeployedArtifact) {
                artifacts.add((DeployedArtifact) nested);
            }
        }

        return artifacts;
    }
}
