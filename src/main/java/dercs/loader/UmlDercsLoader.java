package dercs.loader;

import dercs.DercsFactory;
import dercs.Model;
import dercs.loader.extractor.AbstractModelExtractor;
import dercs.loader.extractor.ClassesExtractor;
import dercs.loader.fixer.AbstractModelFixer;
import dercs.loader.resource.UmlResourceLoader;
import dercs.loader.resource.WrappedUmlResource;
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
    private final Model dercsModel;

    /**
     * The list of extractors that will be run on the resource.
     */
    private final List<AbstractModelExtractor> modelExtractors = new ArrayList<>();

    /**
     * The list of fixers that will be run on the model.
     */
    private final List<AbstractModelFixer> modelFixers = new ArrayList<>();

    /**
     * Create an instance of the loader based on the given UML2 file.
     * @param umlFileUri the URI of the file to be processed
     */
    public UmlDercsLoader(URI umlFileUri) {
        // load resource
        org.eclipse.emf.common.util.URI emfUri = org.eclipse.emf.common.util.URI.createURI(umlFileUri.toString());
        Resource loadedResource = UmlResourceLoader.loadResourceFromFile(emfUri);
        this.umlResource = new WrappedUmlResource(loadedResource);

        this.dercsModel = DercsFactory.eINSTANCE.createModel();

        registerExtractors();
        registerFixers();
    }

    /**
     * Load a DERCS model from the given file.
     *
     * @return the loaded DERCS model
     */
    public Model loadDercsModel() {
        LOGGER.info("Beginning to load DERCS model.");

        // run extractors
        for (AbstractModelExtractor extractor : modelExtractors) {
            LOGGER.info("Running extractor: '{}'", extractor.getName());
            extractor.apply(umlResource, dercsModel);
        }

        // run fixers
        for (AbstractModelFixer fixer: modelFixers) {
            LOGGER.info("Running fixer: '{}'", fixer.getName());
            fixer.apply(dercsModel);
        }

        LOGGER.info("DERCS model loading completed.");

        return dercsModel;
    }

    /**
     * Returns the UML resource that is being loaded from
     * @return the UML resource
     */
    public WrappedUmlResource getUmlResource() {
        return this.umlResource;
    }

    /**
     * Instantiate and add all the Model Extractors that will be used.
     */
    private void registerExtractors() {
        Collections.addAll(this.modelExtractors,
                new ClassesExtractor()
        );
    }

    /**
     * Instantiate and add all the Model Fixers that will be used.
     */
    private void registerFixers() {
        //modelFixers.add()
    }
}
