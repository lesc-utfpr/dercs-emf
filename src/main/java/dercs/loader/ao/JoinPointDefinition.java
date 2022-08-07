package dercs.loader.ao;

import AMoDERT.AspectsModeling.JoinPoint;
import dercs.AO.ElementSelectionKind;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Contains all information on a join point, the UML element it was applied to, selection kind and required stereotypes.
 */
public class JoinPointDefinition {
    /**
     * The UML element representing the join point.
     * Depending on the {@link JoinPointDefinition#selectionKind} this can be one of several types:
     * <ul>
     *     <li>CLASS - uml class</li>
     *     <li>NODE - uml deployed artifact OR lifeline with specific name</li>
     *     <li>ATTRIBUTE - uml property</li>
     *     <li>METHOD - uml operation OR message with specific name</li>
     *     <li>OBJECT - uml lifeline</li>
     *     <li>BEHAVIOR - uml message</li>
     *     <li>ACTION_* - uml message</li>
     * </ul>
     */
    private final Element matchedElement;

    /**
     * The selection kind of this join point.
     */
    private final ElementSelectionKind selectionKind;

    /**
     * The stereotypes that were applied to the UML element, other than the JoinPoint stereotype itself
     */
    private final Set<EObject> requiredStereotypes;

    private JoinPointDefinition(Element matchedElement, ElementSelectionKind selectionKind) {
        this.matchedElement = matchedElement;
        this.selectionKind = selectionKind;
        this.requiredStereotypes = new HashSet<>();
    }

    public ElementSelectionKind getSelectionKind() {
        return selectionKind;
    }

    public Element getMatchedElement() {
        return matchedElement;
    }

    public Set<EObject> getRequiredStereotypes() {
        return requiredStereotypes;
    }

    public static JoinPointDefinition fromClass(Class cls, List<EObject> stereotypes) {
        return fromInternal(cls, ElementSelectionKind.CLASS, stereotypes);
    }

    public static JoinPointDefinition fromNodeArtifact(DeployedArtifact artifact, List<EObject> stereotypes) {
        return fromInternal(artifact, ElementSelectionKind.NODE, stereotypes);
    }

    public static JoinPointDefinition fromAttribute(Property attribute, List<EObject> stereotypes) {
        return fromInternal(attribute, ElementSelectionKind.ATTRIBUTE, stereotypes);
    }

    public static JoinPointDefinition fromMethod(Operation method, List<EObject> stereotypes) {
        return fromInternal(method, ElementSelectionKind.METHOD, stereotypes);
    }

    public static JoinPointDefinition fromMethodMessage(Message message, List<EObject> stereotypes) {
        return fromInternal(message, ElementSelectionKind.METHOD, stereotypes);
    }

    public static JoinPointDefinition fromNodeLifeLine(Lifeline lifeline, List<EObject> stereotypes) {
        return fromInternal(lifeline, ElementSelectionKind.NODE, stereotypes);
    }

    public static JoinPointDefinition fromObjectLifeLine(Lifeline lifeline, List<EObject> stereotypes) {
        return fromInternal(lifeline, ElementSelectionKind.OBJECT, stereotypes);
    }

    public static JoinPointDefinition fromCreateMessage(Message message, List<EObject> stereotypes) {
        return fromInternal(message, ElementSelectionKind.ACTION_OBJECT_CREATION, stereotypes);
    }

    public static JoinPointDefinition fromDestroyMessage(Message message, List<EObject> stereotypes) {
        return fromInternal(message, ElementSelectionKind.ACTION_OBJECT_DESTRUCTION, stereotypes);
    }

    public static JoinPointDefinition fromReplyMessage(Message message, List<EObject> stereotypes) {
        return fromInternal(message, ElementSelectionKind.ACTION_RETURN, stereotypes);
    }

    public static JoinPointDefinition fromSendMessage(Message message, List<EObject> stereotypes) {
        return fromInternal(message, ElementSelectionKind.ACTION_MESSAGE_SENDING, stereotypes);
    }

    public static JoinPointDefinition fromBehavior(Message message, List<EObject> stereotypes) {
        return fromInternal(message, ElementSelectionKind.BEHAVIOR, stereotypes);
    }

    private static JoinPointDefinition fromInternal(NamedElement element, ElementSelectionKind kind, List<EObject> stereotypes) {
        JoinPointDefinition def = new JoinPointDefinition(element, kind);
        for (EObject stereotype : stereotypes) {
            if (!(stereotype instanceof JoinPoint)) {
                def.addRequiredStereotype(stereotype);
            }
        }
        return def;
    }

    private void addRequiredStereotype(EObject stereotype) {
        this.requiredStereotypes.add(stereotype);
    }

}
