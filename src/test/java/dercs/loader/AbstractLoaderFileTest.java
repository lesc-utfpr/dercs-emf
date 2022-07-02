package dercs.loader;

import dercs.Model;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.resource.WrappedUmlResource;
import dercs.structure.NamedElement;
import org.junit.jupiter.api.TestInstance;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * Abstract test class that provides an already loaded DERCS model to test.
 * Child classes should provide the path to the UML file in their super-constructor call.
 * (path needs to begin with / and be relative to the src/test/resources directory)
 * @implNote The model will only be loaded once for all test methods, so it should not be mutated.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class AbstractLoaderFileTest {

    protected WrappedUmlResource umlResource;
    protected Model dercsModel;

    /**
     * Loads the specified UML file and stores the created model in the {@link AbstractLoaderFileTest#dercsModel} field.
     * @param testFile path of the uml file
     */
    public AbstractLoaderFileTest(String testFile) throws DercsLoaderException {
        URI fileUri;
        try {
            fileUri = getClass().getResource(testFile).toURI();
        } catch (URISyntaxException e) {
            throw new RuntimeException("Could not find test file.", e);
        }
        UmlDercsLoader loader = new UmlDercsLoader(fileUri);

        this.umlResource = loader.getUmlResource();
        this.dercsModel = loader.loadDercsModel();
    }

    // === Shorthand getters for easier access ===

    /**
     * Shorthand getter for the DERCS model.
     * @return the DERCS model
     */
    protected Model model() {
        return this.dercsModel;
    }

    /**
     * Shorthand getter for the UML resource.
     * @return the UML resource
     */
    protected WrappedUmlResource resource() {
        return this.umlResource;
    }

    // === utilities ===

    /**
     * Tries to find a specific element by name in a collection of DERCS NamedElements.
     * @param collection the collection to search in
     * @param name the name to find
     * @return the element if it exists, otherwise {@code null}
     * @throws AssertionError if multiple matching elements are found
     */
    protected <T extends NamedElement> T findDercsNamedElement(Collection<T> collection, String name) {
        T found = null;

        for (T element : collection) {
            if (element.getName().equals(name)) {
                if (found == null) {
                    found = element;
                } else {
                    throw new AssertionError("Found multiple elements with name [" + name + "].");
                }
            }
        }

        return found;
    }

    /**
     * Tries to find the one element in a collection that matches the given predicate.
     * @param collection the collection to search in
     * @param predicate the predicate to check
     * @return the element if it exists, otherwise {@code null}
     * @throws AssertionError if multiple matching elements are found
     */
    protected <T> T findDercsElementByPredicate(Collection<T> collection, Predicate<T> predicate) {
        T found = null;

        for (T element : collection) {
            if (predicate.test(element)) {
                if (found == null) {
                    found = element;
                } else {
                    throw new AssertionError("Found multiple elements matching predicate.");
                }
            }
        }

        return found;
    }
}
