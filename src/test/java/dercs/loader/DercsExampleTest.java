package dercs.loader;

import dercs.loader.exception.DercsLoaderException;
import dercs.structure.Class;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        //TODO
    }
}
