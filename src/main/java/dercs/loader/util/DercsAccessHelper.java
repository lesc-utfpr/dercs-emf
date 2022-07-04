package dercs.loader.util;

import dercs.structure.Class;
import dercs.structure.Constructor;
import dercs.structure.Method;

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
}
