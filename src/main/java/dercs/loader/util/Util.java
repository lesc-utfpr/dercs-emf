package dercs.loader.util;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.AssignmentAction;
import dercs.behavior.actions.ObjectAction;
import dercs.behavior.actions.SendMessageAction;
import dercs.structure.Attribute;
import dercs.structure.BaseElement;
import dercs.structure.Method;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.Object;

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

        } else if (element instanceof Action) {
            return getHumanReadableActionName((Action) element);

        } else if (element instanceof Object) {
            return "{" + element.getName() + " : " + ((Object) element).getInstanceOfClass().getName() + "}";

        } else if (element instanceof LocalVariable){
            return "{Local " + element.getName() + "}";

        } else {
            return element.getName();
        }
    }

    private static String getHumanReadableActionName(Action action) {
        if (action == null) {
            return "null";
        }
        String className = action.getClass().getSimpleName();
        className = className.substring(0, className.indexOf("Impl"));
        if (action instanceof ObjectAction) {
            Object relatedObject = ((ObjectAction) action).getRelatedObject();
            return className + " [obj=" + getHumanReadableElementName(relatedObject) + "]";
        } else if (action instanceof AssignmentAction) {
            Action sourceAction = ((AssignmentAction) action).getResultOfAction();
            BaseElement target = ((AssignmentAction) action).getDestinationAttribute() != null ? ((AssignmentAction) action).getDestinationAttribute() : ((AssignmentAction) action).getDestinationVariable();
            return className + " [target=" + getHumanReadableElementName(target) + ", srcAction=" + getHumanReadableActionName(sourceAction) + ", val=" + ((AssignmentAction) action).getValue() + "]";
        } else if (action instanceof SendMessageAction) {
            Method method = ((SendMessageAction) action).getRelatedMethod();
            return className + " [mth=" + getHumanReadableElementName(method) + ", toObj=" + getHumanReadableElementName(((SendMessageAction) action).getToObject()) + "]";
        } else {
            return className;
        }
    }
}
