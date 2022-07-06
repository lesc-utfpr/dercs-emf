package dercs.loader;

import dercs.behavior.actions.AssignmentAction;
import dercs.datatypes.Array;
import dercs.datatypes.ClassDataType;
import dercs.datatypes.DataType;
import dercs.datatypes.Enumeration;
import dercs.loader.util.DercsAccessHelper;
import dercs.structure.Attribute;
import dercs.structure.Class;
import dercs.structure.Method;
import dercs.structure.Visibility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class DercsAssertions {
    private static final Pattern attributeSignaturePattern = Pattern.compile("(?<vis>[+\\-~])(?<name>[a-zA-Z_][\\d\\w-]*)(?:\\[(?<lower>-?\\d+),(?<upper>-?\\d+)])?:(?<type>[a-zA-Z][\\da-zA-Z_-]*)(?:=(?<default>[\\d\\w-]+))?");

    /**
     * Checks for the existence and properties of an attribute described by the signature.
     * The structure of the signature is <p>
     * <code>(VIS)NAME[LBOUND,UBOUND]:TYPE=(DEF)</code>
     * <table>
     *  <tr>(VIS) - one of '+' (public), '-' (private), '~' (protected)</tr>
     *  <tr>NAME - attribute name</tr>
     *  <tr>LBOUND - lower bound</tr>
     *  <tr>UBOUND - upper bound</tr>
     *  <tr>TYPE - datatype name</tr>
     *  <tr>(DEF) - default value</tr>
     * </table>
     * where [LBOUND,UBOUND] and =(DEF) are both optional
     * @param cls the class in which to check the attribute
     * @param signature signature of the attribute to check for
     */
    public static void assertAttributeSignature(Class cls, String signature) {
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

    /**
     * Checks for the existence of getters and setters for the association attribute.
     * If the association is 1-1 it must also have a parameter and assignment in the constructor.
     * @param cls the DERCS class containing the attribute
     * @param attributeName the name of the association attribute to check
     */
    public static void assertAssociationGettersSettersExist(Class cls, String attributeName) {
        Attribute attribute = cls.getAttribute(attributeName);
        Method getter =  cls.getMethod("get" + attributeName);
        Method setter =  cls.getMethod("set" + attributeName);
        Method constructor = DercsAccessHelper.getConstructor(cls);

        assertNotNull(getter, "Getter does not exist.");
        assertNotNull(setter, "Setter does not exist.");

        if (attribute.getDataType() instanceof Array) {
            // multiple
            assertFalse(constructor.getParameters().stream().anyMatch(p -> p.getName().equals("_" + attributeName)), "Association should not have a constructor parameter.");
            assertEquals(1, getter.getParameters().size(), "Getter should have exactly 1 parameter.");
            assertEquals(2, setter.getParameters().size(), "Setter should have exactly 2 parameters.");
        } else {
            // single
            assertTrue(constructor.getParameters().stream().anyMatch(p -> p.getName().equals("_" + attributeName)), "Association should have a constructor parameter.");
            assertEquals(0, getter.getParameters().size(), "Getter should have no parameters.");
            assertEquals(1, setter.getParameters().size(), "Setter should have exactly 1 parameter.");
        }
    }

    /**
     * Checks for the creation of the lower bound of composition element in the constructor.
     * If the composition is unbounded, it must also have an "add[attribute-name]()" method.
     * @param cls
     * @param attributeName
     */
    public static void assertCompositionMethodsExist(Class cls, String attributeName) {
        Attribute attribute = cls.getAttribute(attributeName);
        Method constructor = DercsAccessHelper.getConstructor(cls);

        long numberOfConstructorAssignments = constructor
                .getTriggeredBehavior()
                .getBehavioralElements()
                .stream()
                .filter(e -> e instanceof AssignmentAction && ((AssignmentAction)e).getDestinationAttribute().getName().equals(attributeName))
                .count();

        int lowerBound = attribute.getDataType() instanceof Array ? ((Array)attribute.getDataType()).getLowerValue() : 1;
        assertEquals(lowerBound, numberOfConstructorAssignments, "Composition attribute should have lower bound number of objects created.");

        if (attribute.getDataType() instanceof Array) {
            // should have the "add[attribute_name]()" method
            Method adderMethod = cls.getMethod("add" + attributeName);
            assertNotNull(adderMethod);

            if (((Array)attribute.getDataType()).getUpperValue() == 0) {
                // unbounded
                assertNotNull(adderMethod.getTriggeredBehavior().getEnterCondition());
                assertNotNull(adderMethod.getTriggeredBehavior().getAlternateBehavior());
            } else {
                // bounded
                assertNull(adderMethod.getTriggeredBehavior().getEnterCondition());
            }
        }
    }

    private static String getDatatypeName(DataType type) {
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
