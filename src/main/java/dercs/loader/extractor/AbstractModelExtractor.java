package dercs.loader.extractor;

import dercs.Model;
import dercs.loader.resource.WrappedUmlResource;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

import java.util.List;

/**
 * A Model Extractor is responsible for extracting certain elements
 * from the UML resource and adding them to the model.
 *
 * Each Extractor should handle a separate kind of element if possible.
 */
public abstract class AbstractModelExtractor {
    protected Model dercsModel;
    protected WrappedUmlResource umlResource;

    public AbstractModelExtractor() {

    }

    /**
     * Perform the extraction on the resource and modify the model.
     * @param umlResource the resource to extract from
     * @param dercsModel the model to modify
     */
    public final void apply(WrappedUmlResource umlResource, Model dercsModel) {
        this.umlResource = umlResource;
        this.dercsModel = dercsModel;

        run();
    }

    /**
     * Run the actual extraction logic.
     * This needs to be overwritten by subclasses.
     *
     * The resource and model can be accessed through the members
     * {@link AbstractModelExtractor#dercsModel} and {@link AbstractModelExtractor#umlResource}
     */
    protected abstract void run();

    /**
     * Returns the name of this extractor
     * @return the name of this extractor
     */
    public abstract String getName();

    /**
     * Forwards to {@link WrappedUmlResource#getAppliedStereotype(Element, EClassifier)}
     * <p>
     * This is provided purely for convenience.
     * @param element the element to check
     * @param stereotypeType the classifier of the stereotype to test for
     * @return the applied stereotype object, or {@code null} if none exists
     */
    protected <T> T getAppliedStereotype(Element element, EClassifier stereotypeType) {
        return this.umlResource.getAppliedStereotype(element, stereotypeType);
    }

    /**
     * Forwards to {@link WrappedUmlResource#getAppliedStereotypes(Element)}
     * <p>
     * This is provided purely for convenience.
     * @param element the element to check
     * @return the list of applied stereotypes
     */
    protected List<EObject> getAppliedStereotypes(Element element) {
        return this.umlResource.getAppliedStereotypes(element);
    }
}
