package dercs.loader.util;

import dercs.behavior.Behavior;
import dercs.structure.Attribute;
import dercs.structure.BaseElement;
import dercs.structure.Method;
import dercs.structure.runtime.Node;

/**
 * Contains general purpose utility functions.
 */
public class Util {
    /**
     * Represent the given DERCS element in a more readable way.
     * @param element the DERCS element
     * @return the human-readable name of the element
     */
    public static String getHumanReadableElementName(BaseElement element) {
        if (element instanceof Attribute) {
            return ((Attribute) element).getOwnerClass().getName() + "::" + element.getName();

        } else if (element instanceof Method) {
            Method method = (Method) element;
            StringBuilder nameBuilder = new StringBuilder();
            nameBuilder.append(method.getOwnerClass().getName()).append("::").append(element.getName());
            String[] parameterTypeNames = method.getParameters().stream().map(param -> DatatypeHelper.getDatatypeName(param.getDataType())).toArray(String[]::new);
            nameBuilder.append("(").append(String.join(", ", parameterTypeNames)).append(")");
            return nameBuilder.toString();

        } else if (element instanceof Node) {
            return element.getName() + " [" + ((Node) element).getPlatformName() + "]";

        } else if (element instanceof Behavior) {
            if (((Behavior) element).getOwner() instanceof Method) {
                return getHumanReadableElementName((BaseElement) ((Behavior) element).getOwner()) + " [Behavior]";
            } else {
                return getHumanReadableElementName((BaseElement) ((Behavior) element).getOwner()) + " -> SubBehavior";
            }

        } else {
            return element.getName();
        }
    }
}
