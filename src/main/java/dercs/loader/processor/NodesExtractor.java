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

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidDeployedElementException;
import dercs.loader.exception.InvalidNodenameException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.loader.util.UmlAccessHelper;
import dercs.structure.runtime.RuntimeFactory;
import org.eclipse.uml2.uml.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Creates all DERCS nodes.
 * Every DERCS node is actually equivalent to an artifact inside a UML node.
 * The artifact-node combination in UML represents the platform and name of a DERCS node.
 * <p>
 * Result:
 * <ul>
 *     <li>every DERCS class has the correct superClass</li>
 * </ul>
 */
public class NodesExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("NodesExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        List<Node> umlNodes =  resource().getAllModelElementsOfType(UMLPackage.Literals.NODE);

        for (Node node : umlNodes) {
            for (DeployedArtifact artifact : UmlAccessHelper.getAllNodeArtifacts(node)) {
                createNode(artifact, node);
            }
        }
    }

    private void createNode(DeployedArtifact artifact, Node node) throws DercsLoaderException {
        if (!artifact.getName().contains(".")) {
            throw new InvalidNodenameException(artifact.getName());
        }

        if (!(artifact instanceof Artifact)) {
            // fail if the artifact is not specifically of the normal Artifact class
            throw new InvalidDeployedElementException(node.getName(), artifact.getName());
        }

        String[] name = artifact.getName().split("\\.");
        LOGGER.info("Creating node '{}' (Platform: '{}').", name[1], name[0]);

        dercs.structure.runtime.Node newNode = RuntimeFactory.eINSTANCE.createNode();
        newNode.setName(name[1]);
        newNode.setPlatformName(name[0]);

        model().getNodes().add(newNode);
        inProgressModel().registerDercsUmlElementPair(newNode, artifact);
    }

    @Override
    public String getName() {
        return "NodesExtractor";
    }
}
