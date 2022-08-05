package dercs.loader.util;

import dercs.loader.exception.DuplicateElementNameException;
import dercs.structure.Class;
import dercs.structure.Constructor;
import dercs.structure.Method;
import dercs.structure.NamedElement;

import java.util.Collection;

/**
 * Contains helper functions for accessing commonly needed DERCS elements.
 */
public class DercsAccessHelper {
    /**
     * Finds the first constructor of the class.
     * @param dercsClass the DERCS class
     * @return the first Constructor that is found
     */
    public static Constructor getConstructor(Class dercsClass) {
        for (Method method : dercsClass.getMethods()) {
            if (method instanceof Constructor) {
                return (Constructor) method;
            }
        }

        return null;
    }

    /**
     * Tries to find an element with the given name in the collection.
     * @param collection the collection to search
     * @param name the name to search for
     * @return the element with the given name if it was found, {@code null} otherwise
     * @throws DuplicateElementNameException if multiple elements with the given name are found
     */
    public static <T extends NamedElement> T findNamedElement(Collection<T> collection, String name) throws DuplicateElementNameException {
        T found = null;
        for (T element : collection) {
            if (element.getName().equals(name)) {
                if (found == null) {
                    found = element;
                } else {
                    throw new DuplicateElementNameException(name, element.getClass());
                }
            }
        }

        return found;
    }
}
