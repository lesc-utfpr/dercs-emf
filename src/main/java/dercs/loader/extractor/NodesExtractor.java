package dercs.loader.extractor;

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidDeployedElementException;
import dercs.loader.exception.InvalidNodenameException;
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
public class NodesExtractor extends AbstractModelExtractor {
    private static final Logger LOGGER = LoggerFactory.getLogger("NodesExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        List<Node> umlNodes =  resource().getAllModelElementsOfType(UMLPackage.Literals.NODE);

        for (Node node : umlNodes) {
            // handle explicit "deployment" edges
            for (Deployment deployment : node.getDeployments()) {
                for (DeployedArtifact artifact : deployment.getDeployedArtifacts()) {
                    createNode(artifact, node);
                }
            }

            // handle nested artifacts
            for (Classifier nested : node.getNestedClassifiers()) {
                if (nested instanceof DeployedArtifact) {
                    createNode((DeployedArtifact) nested, node);
                }
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
        resource().registerDercsUmlElementPair(newNode, artifact);
    }

    @Override
    public String getName() {
        return "NodesExtractor";
    }
}
