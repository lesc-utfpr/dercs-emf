package dercs.loader.extractor;

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidNodenameException;
import dercs.structure.runtime.RuntimeFactory;
import org.eclipse.uml2.uml.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class NodesExtractor extends AbstractModelExtractor {
    private static final Logger LOGGER = LoggerFactory.getLogger("NodesExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        List<Node> umlNodes =  this.umlResource.getAllModelElementsOfType(UMLPackage.Literals.NODE);

        for (Node node :  umlNodes) {
            //TODO: we may want to also check nestedClassifiers to also catch
            // artifacts that aren't explicitly connected with a "deployment" edge
            for (Deployment deployment : node.getDeployments()) {
                for (DeployedArtifact artifact : deployment.getDeployedArtifacts()) {
                    if (!artifact.getName().contains(".")) {
                        throw new InvalidNodenameException(artifact.getName());
                    }

                    createNode(artifact);
                }
            }
        }
    }

    private void createNode(DeployedArtifact artifact) {
        String[] name = artifact.getName().split("\\.");
        LOGGER.info("Creating node '{}' (Platform: '{}').", name[1], name[0]);

        dercs.structure.runtime.Node newNode = RuntimeFactory.eINSTANCE.createNode();
        newNode.setName(name[1]);
        newNode.setPlatformName(name[0]);

        this.dercsModel.getNodes().add(newNode);
        this.umlResource.registerDercsUmlElementPair(newNode, artifact);
    }

    @Override
    public String getName() {
        return "NodesExtractor";
    }
}
