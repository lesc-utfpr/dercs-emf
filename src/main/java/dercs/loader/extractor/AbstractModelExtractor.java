package dercs.loader.extractor;

import dercs.Model;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A Model Extractor is responsible for extracting certain elements
 * from the UML resource and adding them to the model.
 *
 * Each Extractor should handle a separate kind of element if possible.
 */
public abstract class AbstractModelExtractor {
    protected Model dercsModel;
    protected Resource umlResource;

    public AbstractModelExtractor() {

    }

    /**
     * Perform the extraction on the resource and modify the model.
     * @param umlResource the resource to extract from
     * @param dercsModel the model to modify
     */
    public final void apply(Resource umlResource, Model dercsModel) {
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
}
