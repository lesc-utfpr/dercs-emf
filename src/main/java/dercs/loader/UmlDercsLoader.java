package dercs.loader;

import dercs.DercsFactory;
import dercs.Model;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.*;
import dercs.loader.processor.base.IModelProcessor;
import dercs.loader.resource.UmlResourceLoader;
import dercs.loader.wrapper.WrappedUmlResource;
import dercs.loader.wrapper.InProgressDercsModel;
import org.eclipse.emf.ecore.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A DERCS loader that creates a model from a UML2 file created in Eclipse Papyrus.
 */
public class UmlDercsLoader implements IDercsLoader{
    private static final Logger LOGGER = LoggerFactory.getLogger("DercsLoader");

    /**
     * The UML resource that is loaded from the file.
     */
    private final WrappedUmlResource umlResource;

    /**
     * The DERCS model that will be filled.
     */
    private final InProgressDercsModel dercsModel;

    /**
     * The list of processors that will be run on the model.
     */
    private final List<IModelProcessor> modelProcessors = new ArrayList<>();

    /**
     * Create an instance of the loader based on the given UML2 file.
     * @param umlFileUri the URI of the file to be processed
     */
    public UmlDercsLoader(URI umlFileUri) {
        // load resource
        org.eclipse.emf.common.util.URI emfUri = org.eclipse.emf.common.util.URI.createURI(umlFileUri.toString());
        Resource loadedResource = UmlResourceLoader.loadResourceFromFile(emfUri);
        this.umlResource = new WrappedUmlResource(loadedResource);

        this.dercsModel = new InProgressDercsModel(DercsFactory.eINSTANCE.createModel(), this.umlResource);

        registerProcessors();
    }

    /**
     * Load a DERCS model from the given file.
     *
     * @return the loaded DERCS model
     */
    public Model loadDercsModel() throws DercsLoaderException {
        LOGGER.info("===== Beginning to load DERCS model. =====");

        // run processors
        for (IModelProcessor extractor : this.modelProcessors) {
            LOGGER.info("===== Running processor: '{}' =====", extractor.getName());
            extractor.apply(this.dercsModel, this.umlResource);
        }

        LOGGER.info("===== DERCS model loading completed. =====");

        return this.dercsModel.getModel();
    }

    /**
     * Returns the UML resource that is being loaded from
     * @return the UML resource
     */
    public WrappedUmlResource getUmlResource() {
        return this.umlResource;
    }

    /**
     * Instantiate and add all the Model Processors that will be used.
     */
    private void registerProcessors() {
        /* Possible order:
         * - Classes
         * - Nodes
         * - Class hierarchy
         * - Class attributes & associations
         * - Methods
         * - Interaction / Sequence Diagrams
         * - Join Points (+ select Elements)
         * - Aspects, Adaptations, Pointcuts, Crosscutting Info
         */
        Collections.addAll(this.modelProcessors,
                new ClassesExtractor(),
                new NodesExtractor(),
                new ClassHierarchyExtractor(),
                new AttributesExtractor(),
                new AssociationRelatedMethodsExtractor(),
                new MethodStubExtractor(),
                new MethodOverwriteFixer()
        );
    }
}
