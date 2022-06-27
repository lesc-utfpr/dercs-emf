package dercs.loader.resource;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import AMoDERT.Utils.UtilsPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class UmlResourceLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger("UmlResourceLoader");

    /**
     * Tries to load a {@link Resource} from a given UML file.
     * @param fileUri the URI of the file to load. (e.g. {@link URI#createFileURI(String)})
     * @return the resource loaded from the file
     */
    public static Resource loadResourceFromFile(URI fileUri) {
        ResourceSet resSet = setupLoaderResourceSet();

        LOGGER.info("Trying to load UML file from path '{}'", fileUri.toFileString());

        Resource result = resSet.getResource(fileUri, true);

        // TODO: make specific exceptions
        if (result == null) {
            LOGGER.error("Failed to load resource.");
            throw new RuntimeException();
        }

        // find all contained models
        Collection<Object> models = EcoreUtil.getObjectsByType(result.getContents(), UMLPackage.Literals.MODEL);

        if (models.size() == 0) {
            LOGGER.warn("Resource does not contain a model.");
        } else if (models.size() > 1) {
            LOGGER.warn("Resource contains multiple models.");
        }

        LOGGER.info("Successfully read resource from file.");
        return result;
    }

    /**
     * Sets up a {@link ResourceSet} for UML2 resources with the correct extensions, factories and namespaces.
     * @return a {@link ResourceSet} that may be used to load UML2 resources
     */
    private static ResourceSet setupLoaderResourceSet() {
        ResourceSet resSet = new ResourceSetImpl();
        UMLUtil.init(resSet);
        resSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
        resSet.getPackageRegistry().put(MARTEPackage.eNS_URI, MARTEPackage.eINSTANCE);
        resSet.getPackageRegistry().put(AspectsModelingPackage.eNS_URI, AspectsModelingPackage.eINSTANCE);
        resSet.getPackageRegistry().put(UtilsPackage.eNS_URI, UtilsPackage.eINSTANCE);

        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
        //Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

        java.util.Map<Object, Object> loadOptions = resSet.getLoadOptions();
        loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT,  Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION,  Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.FALSE);

        return resSet;
    }
}
