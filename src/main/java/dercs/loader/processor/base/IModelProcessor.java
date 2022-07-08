package dercs.loader.processor.base;

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.loader.wrapper.WrappedUmlResource;

public interface IModelProcessor {
    /**
     * Perform some change on the DERCS model, possibly based on the UML resource.
     *
     * @param dercsModel  the model to modify
     * @param umlResource the resource to extract from
     */
    void apply(InProgressDercsModel dercsModel, WrappedUmlResource umlResource) throws DercsLoaderException;

    /**
     * Returns the name of this processor
     * @return the name of this processor
     */
    String getName();
}
