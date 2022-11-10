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
package dercs.loader.wrapper;

import dercs.Model;
import dercs.datatypes.DataType;
import dercs.loader.ao.JoinPointFinder;
import dercs.loader.ao.JoinPointMatcher;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidDeployedElementException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsCreationHelper;
import dercs.structure.Class;
import dercs.structure.Method;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.Object;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Manifestation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Wraps a {@link dercs.Model} that is still being created to provide helper functions.
 */
public class InProgressDercsModel {
    private final Logger LOGGER = LoggerFactory.getLogger("InProgressDercsModel");

    /**
     * The wrapped DERCS model.
     */
    private final Model model;

    /**
     * The UML resource this model is being created from.
     */
    private final WrappedUmlResource resource;

    // This may be somewhat inefficient compared to using a real Bimap,
    // but since we will never remove elements and likely won't store more than a few thousand objects,
    // I don't think we need to depend on guava just for a Bimap.
    /**
     * A map from UML elements to their corresponding DERCS elements.
     */
    private final Map<Element, EObject> elementPairsUmlToDercs;

    /**
     * A map from DERCS elements to their corresponding UML elements.
     */
    private final Map<EObject, Element> elementPairsDercsToUml;

    /**
     * Additional method stereotypes that are discovered while processing a method's sequence diagram.
     */
    private final Map<Method, List<EObject>> additionalMethodStereotypes;

    /**
     * Create a wrapped model from the given Dercs model, and the UML resource it was created from.
     * @param model the DERCS model to wrap
     * @param resource the source UML resource
     */
    public InProgressDercsModel(Model model, WrappedUmlResource resource) {
        this.model = model;
        this.resource = resource;

        this.elementPairsUmlToDercs = new IdentityHashMap<>();
        this.elementPairsDercsToUml = new IdentityHashMap<>();
        this.additionalMethodStereotypes = new IdentityHashMap<>();
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

    /**
     * Get an instance of {@link JoinPointFinder} bound to this model.
     * (This is necessary because the finder needs to access the stereotypes from this model's resource.)
     * @return an instance of {@link JoinPointFinder}
     */
    public JoinPointFinder getJoinPointFinder() {
        return new JoinPointFinder(this.resource);
    }

    /**
     * Get an instance of {@link JoinPointMatcher} bound to this model.
     * (This is necessary because the matcher needs to access the model to search it.)
     * @return an instance of {@link JoinPointMatcher}
     */
    public JoinPointMatcher getJoinPointMatcher() {
        return new JoinPointMatcher(this);
    }

    // === Model pairs ===

    /**
     * Register a pairing between a DERCS element and a UML element.
     * This can later be used to look up the corresponding element in the other model.
     * @param dercsElement the element of the DERCS model
     * @param umlElement the element of the UML model
     */
    public void registerDercsUmlElementPair(EObject dercsElement, Element umlElement) {
        java.lang.Object prevValueDercs = this.elementPairsUmlToDercs.put(umlElement, dercsElement);
        java.lang.Object prevValueUml = this.elementPairsDercsToUml.put(dercsElement, umlElement);

        if (prevValueDercs != null || prevValueUml != null) {
            LOGGER.warn("Overwrote existing entry in element pairs map!");
        }
    }

    /**
     * Returns the DERCS element's corresponding UML element, if it has been registered.
     * @param dercsElement the DERCS element
     * @return the corresponding UML element if one was registered, otherwise {@code null}
     */
    @SuppressWarnings("unchecked")
    public <T extends Element> T getCorrespondingUmlElement(EObject dercsElement) {
        Objects.requireNonNull(dercsElement, "Tried to get element pair of null DERCS element!");
        return (T) this.elementPairsDercsToUml.get(dercsElement);
    }

    /**
     * Returns the UML element's corresponding DERCS element, if it has been registered.
     * @param umlElement the UML element
     * @return the corresponding DERCS element if one was registered, otherwise {@code null}
     */
    @SuppressWarnings("unchecked")
    public <T extends EObject> T getCorrespondingDercsElement(Element umlElement) {
        Objects.requireNonNull(umlElement, "Tried to get element pair of null UML element!");
        return (T) this.elementPairsUmlToDercs.get(umlElement);
    }

    /**
     * Register additional stereotypes for a method.
     * These may be found during loading of sequence diagrams.
     * @param method the DERCS method
     * @param stereotypes the additonal stereotypes to add
     */
    public void registerMethodBehaviorStereotypes(Method method, List<EObject> stereotypes) {
        this.additionalMethodStereotypes.merge(method, stereotypes, (oldVal, newVal) -> {oldVal.addAll(newVal); return oldVal;});
    }

    /**
     * Returns the additional stereotypes registered for this method
     * @param method the DERCS method
     * @return the registered additional stereotypes
     */
    public List<EObject> getMethodBehaviorStereotypes(Method method) {
        return this.additionalMethodStereotypes.getOrDefault(method, Collections.emptyList());
    }

    // === Utilities ===

    /**
     * Gets the corresponding DERCS datatype for a given UML datatype
     * @param umlType the UML type to convert
     * @return the corresponding DERCS datatype
     */
    public DataType getDercsDatatype(org.eclipse.uml2.uml.Type umlType) throws DercsLoaderException {
        return DatatypeHelper.getDercsDatatype(this, umlType);
    }

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
            Artifact nodeUmlArtifact = this.getCorrespondingUmlElement(node);
            for (Manifestation manifestation : nodeUmlArtifact.getManifestations()) {
                if (!(manifestation.getUtilizedElement() instanceof InstanceSpecification)) {
                    throw new InvalidDeployedElementException(node.getName(), manifestation.getUtilizedElement().getName());
                }

                InstanceSpecification deployedInstance = (InstanceSpecification) manifestation.getUtilizedElement();
                Class instanceClass = this.getCorrespondingDercsElement(deployedInstance.getClassifiers().get(0));
                if (object.getName().equals(deployedInstance.getName()) && object.getInstanceOfClass() == instanceClass) {
                    return node;
                }
            }
        }

        return null;
    }
}
