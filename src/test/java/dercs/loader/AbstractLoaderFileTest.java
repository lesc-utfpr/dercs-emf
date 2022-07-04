package dercs.loader;

import dercs.Model;
import dercs.datatypes.Array;
import dercs.datatypes.ClassDataType;
import dercs.datatypes.DataType;
import dercs.datatypes.Enumeration;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.WrappedUmlResource;
import dercs.structure.Attribute;
import dercs.structure.Class;
import dercs.structure.NamedElement;
import dercs.structure.Visibility;
import org.junit.jupiter.api.TestInstance;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

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
    private final Pattern attributeSignaturePattern = Pattern.compile("(?<vis>[+\\-~])(?<name>[a-zA-Z_][\\d\\w-]*)(?:\\[(?<lower>-?\\d+),(?<upper>-?\\d+)])?:(?<type>[a-zA-Z][\\da-zA-Z_-]*)(?:=(?<default>[\\d\\w-]+))?");

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

    /**
     * Checks for the existence and properties of an attribute described by the signature.
     * The structure of the signature is <p>
     * <code>(VIS)NAME[LBOUND,UBOUND]:TYPE=(DEF)</code>
     * <table>
     *  <tr>(VIS) - one of '+' (public), '-' (private), '~' (protected)</tr>
     *  <tr>NAME - attribute name</tr>
     *  <tr>LBOUND - upper bound</tr>
     *  <tr>UBOUND - lower bound</tr>
     *  <tr>TYPE - datatype name</tr>
     *  <tr>(DEF) - default value</tr>
     * </table>
     * where [LBOUND,UBOUND] and =(DEF) are both optional
     * @param cls the class in which to check the attribute
     * @param signature signature of the attribute to check for
     */
    protected void assertAttributeSignature(Class cls, String signature) {
        Matcher match = attributeSignaturePattern.matcher(signature);
        if (!match.matches()) {
            throw new AssertionError();
        }
        String visibility = match.group("vis");
        String name = match.group("name");
        String lowerBound = match.group("lower");
        String upperBound = match.group("upper");
        String type = match.group("type");
        String defaultValue = match.group("default");

        // find attribute
        Attribute attrib = cls.getAttribute(name);
        assertNotNull(attrib, "Could not find attribute: " + name);
        assertSame(cls, attrib.getOwnerClass(), "Attribute has incorrect owner class.");

        // array checks
        if (lowerBound != null && upperBound != null) {
            int lower = Integer.parseInt(lowerBound);
            int upper = Integer.parseInt(upperBound);

            assertInstanceOf(Array.class, attrib.getDataType(), "Attribute should be an array.");
            Array attributeArray = (Array) attrib.getDataType();
            assertEquals(lower, attributeArray.getLowerValue(), "Attribute has incorrect lower bound.");
            assertEquals(upper, attributeArray.getUpperValue(), "Attribute has incorrect upper bound.");
        }

        // type and visibility
        assertEquals(type, getDatatypeName(attrib.getDataType()), "Attribute has incorrect type.");
        Visibility expectedVis = visibility.equals("+") ? Visibility.PUBLIC : (visibility.equals("-") ? Visibility.PRIVATE : (visibility.equals("~") ? Visibility.PROTECTED : null));
        assertEquals(expectedVis, attrib.getVisibility(), "Attribute has incorrect visibility.");

        // default value
        if (defaultValue != null) {
            assertEquals(defaultValue, attrib.getDefaultValue(), "Attribute has incorrect default value.");
        }
    }

    private String getDatatypeName(DataType type) {
        if (type instanceof ClassDataType) {
            return ((ClassDataType)type).getRepresents().getName();
        } else if (type instanceof Array) {
            return getDatatypeName(((Array)type).getDataType());
        } else if (type instanceof Enumeration) {
            return ((Enumeration)type).getName();
        } else {
            String className = type.getClass().getSimpleName();
            return className.substring(0, className.indexOf("Impl"));
        }
    }
}
