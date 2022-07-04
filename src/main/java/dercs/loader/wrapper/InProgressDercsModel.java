package dercs.loader.wrapper;

import dercs.Model;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidDeployedElementException;
import dercs.loader.util.DercsCreationHelper;
import dercs.structure.Class;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.Object;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Manifestation;

/**
 * Wraps a {@link dercs.Model} that is still being created to provide helper functions.
 */
public class InProgressDercsModel {
    private final Model model;
    private final WrappedUmlResource resource;

    /**
     * Create a wrapped model from the given Dercs model, and the UML resource it was created from.
     * @param model the DERCS model to wrap
     * @param resource the source UML resource
     */
    public InProgressDercsModel(Model model, WrappedUmlResource resource) {
        this.model = model;
        this.resource = resource;
    }

    /**
     * Gets the wrapped DERCS model.
     * @return the wrapped DERCS model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * Gets the UML resource this model is created from.
     * @return the UML resource this model is created from
     */
    public WrappedUmlResource getSourceResource() {
        return this.resource;
    }

    // === Utilities ===

    /**
     * Deploys an object into its node according the deployment diagram.
     * @param obj the object to be deployed.
     */
    public Node deployObject(Object obj) throws DercsLoaderException {
        if ((obj != null) && !DercsCreationHelper.isDummyObject(obj)) {
            Node dercsNode = getObjectNode(obj);
            if ((dercsNode != null) && !dercsNode.getDeployedObjects().contains(obj)) {
                dercsNode.getDeployedObjects().add(obj);
                return dercsNode;
            }
        }
        return null;
    }

    /**
     * Check the deployment diagram in order to discover in which node an object was deployed.
     * @param object the object to be checked.
     * @return the node in which the object was deployed.
     */
    public Node getObjectNode(Object object) throws InvalidDeployedElementException {
        for (Node node : this.model.getNodes()) {
            Artifact nodeUmlArtifact = this.resource.getCorrespondingUmlElement(node);
            for (Manifestation manifestation : nodeUmlArtifact.getManifestations()) {
                if (!(manifestation.getUtilizedElement() instanceof InstanceSpecification)) {
                    throw new InvalidDeployedElementException(node.getName(), manifestation.getUtilizedElement().getName());
                }

                InstanceSpecification deployedInstance = (InstanceSpecification) manifestation.getUtilizedElement();
                Class instanceClass = this.resource.getCorrespondingDercsElement(deployedInstance.getClassifiers().get(0));
                if (object.getName().equals(deployedInstance.getName()) && object.getInstanceOfClass() == instanceClass) {
                    return node;
                }
            }
        }

        return null;
    }
}
