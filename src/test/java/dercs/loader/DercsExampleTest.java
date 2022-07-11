package dercs.loader;

import dercs.datatypes.Enumeration;
import dercs.loader.exception.DercsLoaderException;
import dercs.structure.Class;
import dercs.structure.runtime.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static dercs.loader.DercsAssertions.*;

public class DercsExampleTest extends AbstractLoaderFileTest {
    public DercsExampleTest() throws DercsLoaderException {
        super("/uml_models/DercsTest.uml");
    }

    @Test
    public void testClassHierarchy() {
        /*
         * Correct inheritance hierarchy:
         * ParentClass1:
         *   ChildClass1
         * ParentClass2:
         *   ChildClass2:
         *     ChildChildClass
         *   ChildClass3
         */
        Class parent1 = findDercsNamedElement(model().getClasses(), "ParentClass1");
        Class parent2 = findDercsNamedElement(model().getClasses(), "ParentClass2");
        Class child1 = findDercsNamedElement(model().getClasses(), "ChildClass1");
        Class child2 = findDercsNamedElement(model().getClasses(), "ChildClass2");
        Class child3 = findDercsNamedElement(model().getClasses(), "ChildClass3");
        Class childChild = findDercsNamedElement(model().getClasses(), "ChildChildClass");

        assertNull(parent1.getSuperClass());
        assertNull(parent2.getSuperClass());
        assertTrue(parent1.isAbstract());

        assertSame(parent1, child1.getSuperClass());
        assertSame(parent2, child2.getSuperClass());
        assertSame(parent2, child3.getSuperClass());
        assertSame(child2, childChild.getSuperClass());

        assertTrue(parent1.isSuperClassOf(child1));
        assertTrue(parent2.isSuperClassOf(child2));
        assertTrue(parent2.isSuperClassOf(child3));
        assertTrue(child2.isSuperClassOf(childChild));
    }

    @Test
    public void testNodes() {
        // we can't find nodes by name, because their names are not unique when they have multiple artifacts
        Node nodeAJava = findDercsElementByPredicate(model().getNodes(),
                node -> node.getName().equals("NodeA") && node.getPlatformName().equals("Java")
        );
        Node nodeBJava = findDercsElementByPredicate(model().getNodes(),
                node -> node.getName().equals("NodeB") && node.getPlatformName().equals("Java")
        );
        Node nodeBCpp = findDercsElementByPredicate(model().getNodes(),
                node -> node.getName().equals("NodeB") && node.getPlatformName().equals("Cpp")
        );

        assertNotNull(nodeAJava);
        assertNotNull(nodeBJava);
        assertNotNull(nodeBCpp);
    }

    @Test
    public void testEnum() {
        // we can't find enums by name the easy way, because they do not derive from NamedElement
        Enumeration testEnum = findDercsElementByPredicate(model().getEnumerations(), e -> e.getName().equals("TestEnum"));

        assertArrayEquals(
                new String[]{"LITERAL_1", "LITERAL_2", "LITERAL_3"},
                testEnum.getValues().toArray()
        );
    }

    @Test
    public void testAttributes() {
        Class child1 = findDercsNamedElement(model().getClasses(), "ChildClass1");
        assertEquals(2, child1.getAttributes().size());
        assertAttributeSignature(child1, "~enumProp:TestEnum=LITERAL_2");
        assertAttributeSignature(child1, "+childclass2:ChildClass2");

        Class childChild = findDercsNamedElement(model().getClasses(), "ChildChildClass");
        assertEquals(2, childChild.getAttributes().size());
        assertAttributeSignature(childChild, "+childclass1[1,0]:ChildClass1");
        assertAttributeSignature(childChild, "+arrayProp[0,10]:Float");

        Class child3 = findDercsNamedElement(model().getClasses(), "ChildClass3");
        assertEquals(1, child3.getAttributes().size());
        assertAttributeSignature(child3, "-childclass1[0,0]:ChildClass1");
    }

    @Test
    public void testAssociationMethods() {
        Class child1 = findDercsNamedElement(model().getClasses(), "ChildClass1");
        assertCompositionMethodsExist(child1, "childclass2");

        Class childChild = findDercsNamedElement(model().getClasses(), "ChildChildClass");
        assertAssociationGettersSettersExist(childChild, "childclass1");

        Class child3 = findDercsNamedElement(model().getClasses(), "ChildClass3");
        assertAssociationGettersSettersExist(child3, "childclass1");
    }

    @Test
    public void testMethods() {
        Class child1 = findDercsNamedElement(model().getClasses(), "ChildClass1");
        assertTrue(child1.getMethod("overridingMethod").isOverwritingMethod());

        Class parent1 = findDercsNamedElement(model().getClasses(), "ParentClass1");
        assertMethodSignature(parent1, "+ baseMethod(): Boolean");
        assertMethodSignature(parent1, "+ overridingMethod(string: String): Integer");

        Class parent2 = findDercsNamedElement(model().getClasses(), "ParentClass2");
        assertMethodSignature(parent2, "+ voidMethod(enumParam: TestEnum)");
    }
}
