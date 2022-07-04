package dercs.loader.extractor;

import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.MultiInheritanceException;
import dercs.structure.Class;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Fills superClass fields of all classes according to UML class-hierarchy.
 * <p>
 * Result:
 * <ul>
 *     <li>every DERCS class has the correct superClass</li>
 * </ul>
 */
public class ClassHierarchyExtractor extends AbstractModelExtractor {
    private static final Logger LOGGER = LoggerFactory.getLogger("ClassHierarchyExtractor");

    @Override
    protected void run() throws DercsLoaderException{
        for (Class cls : model().getClasses()) {
            handleClass(cls);
        }
    }

    private void handleClass(Class cls) throws DercsLoaderException {
        org.eclipse.uml2.uml.Class umlClass = resource().getCorrespondingUmlElement(cls);
        if (umlClass.getSuperClasses().isEmpty()) {
            return;
        }

        if (umlClass.getSuperClasses().size() > 1) {
            throw new MultiInheritanceException(cls);
        }

        Class superClass = resource().getCorrespondingDercsElement(umlClass.getSuperClasses().get(0));
        if (superClass == null) {
            throw new ClassNotFoundException(umlClass.getSuperClasses().get(0).getName());
        }

        LOGGER.info("Setting superclass of '{}' to '{}'.", cls.getName(), superClass.getName());
        cls.setSuperClass(superClass);
    }

    @Override
    public String getName() {
        return "ClassHierarchyExtractor";
    }
}
