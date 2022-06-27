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

public class UmlDercsLoader implements IDercsLoader{
    private static final Logger LOGGER = LoggerFactory.getLogger("DercsLoader");

    private final WrappedUmlResource umlResource;
    private final Model dercsModel;

    private final List<AbstractModelExtractor> modelExtractors = new ArrayList<>();
    private final List<AbstractModelFixer> modelFixers = new ArrayList<>();

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
