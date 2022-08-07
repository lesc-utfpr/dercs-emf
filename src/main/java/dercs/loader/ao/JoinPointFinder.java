package dercs.loader.ao;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import AMoDERT.AspectsModeling.JoinPoint;
import dercs.loader.exception.UnsupportedJpddDefinitionException;
import dercs.loader.util.UmlAccessHelper;
import dercs.loader.wrapper.WrappedUmlResource;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;

import java.util.ArrayList;
import java.util.List;

/**
 * Used to find the join point in a JPDD diagram.
 */
public class JoinPointFinder {
    private final WrappedUmlResource resource;

    public JoinPointFinder(WrappedUmlResource resource) {
        this.resource = resource;
    }

    /**
     * Finds the join point in a given JPDD diagram.
     * @param jpddElement the UML element representing the diagram (either interaction or package)
     * @return the {@link JoinPointDefinition} for the found join point
     * @throws UnsupportedJpddDefinitionException if no join point or multiple join point were found
     */
    public JoinPointDefinition findJoinPoint(NamedElement jpddElement) throws UnsupportedJpddDefinitionException {
        if (jpddElement instanceof Interaction) {
            return findSequenceDiagramJoinPoint((Interaction) jpddElement);
        } else if (jpddElement instanceof Package) {
            return findClassDiagramJoinPoint((Package) jpddElement);
        } else {
            throw new UnsupportedJpddDefinitionException(jpddElement.getName());
        }
    }

    /**
     * Finds the join point in a given JPDD class-diagram.
     * @param pckg the package representing the diagram
     * @return the {@link JoinPointDefinition} for the found join point
     * @throws UnsupportedJpddDefinitionException if no join point or multiple join point were found
     */
    private JoinPointDefinition findClassDiagramJoinPoint(Package pckg) throws UnsupportedJpddDefinitionException {
        List<JoinPointDefinition> foundJoinPoints = new ArrayList<>();
        // find join point stereotype in class-diagram
        for (Element ownedElement : pckg.getOwnedElements()) {
            // NOTE: the instanceof checks must be in the order Node -> Class
            // because a lot of UML classes extend Class,
            // it would match the Nodes as well if it were first

            if (ownedElement instanceof Node) {
                // check contents of node
                for (DeployedArtifact artifact : UmlAccessHelper.getAllNodeArtifacts((Node) ownedElement)) {
                    if (isJoinPoint(artifact)) {
                        foundJoinPoints.add(JoinPointDefinition.fromNodeArtifact(artifact, resource.getAppliedStereotypes(artifact)));
                    }
                }

            } else if (ownedElement instanceof Class) {
                // check class
                if (isJoinPoint(ownedElement)) {
                    // select class itself
                    foundJoinPoints.add(JoinPointDefinition.fromClass((Class) ownedElement, resource.getAppliedStereotypes(ownedElement)));
                } else {
                    // otherwise check attributes
                    for (Property attribute : ((Class) ownedElement).getOwnedAttributes()) {
                        if (isJoinPoint(attribute)) {
                            foundJoinPoints.add(JoinPointDefinition.fromAttribute(attribute, resource.getAppliedStereotypes(attribute)));
                        }
                    }

                    // and check methods
                    for (Operation method : ((Class) ownedElement).getOwnedOperations()) {
                        if (isJoinPoint(method)) {
                            foundJoinPoints.add(JoinPointDefinition.fromMethod(method, resource.getAppliedStereotypes(method)));
                        }
                    }
                }


            } else {
                throw new UnsupportedJpddDefinitionException(pckg.getName());
            }
        }

        // should only find exactly one join point
        if (foundJoinPoints.size() != 1) {
            throw new UnsupportedJpddDefinitionException(pckg.getName());
        } else {
            return foundJoinPoints.get(0);
        }
    }

    /**
     * Finds the join point in a given JPDD sequence-diagram.
     * @param interaction the interaction representing the diagram
     * @return the {@link JoinPointDefinition} for the found join point
     * @throws UnsupportedJpddDefinitionException if no join point or multiple join point were found
     */
    private JoinPointDefinition findSequenceDiagramJoinPoint(Interaction interaction) throws UnsupportedJpddDefinitionException {
        List<JoinPointDefinition> foundJoinPoints = new ArrayList<>();
        //TODO: we may have to check the represented objects for stereotypes and add those as well?
        // though, if they are already easily accessible via represents, then we don't even need the stereotype checks
        for (Message message : interaction.getMessages()) {
            if (!isJoinPoint(message)) {
                continue;
            }

            // message is join point -> send/return/create/destroy action, behavior
            if (message.getMessageSort() == MessageSort.REPLY_LITERAL) {
                foundJoinPoints.add(JoinPointDefinition.fromReplyMessage(message, resource.getAppliedStereotypes(message)));

            } else if (isJPBehaviorSelection(message)) {
                // select behavior run in response to message reception
                foundJoinPoints.add(JoinPointDefinition.fromBehavior(message, resource.getAppliedStereotypes(message)));

            } else if (isJPSignatureSelection(message)) {
                // select corresponding send message action
                foundJoinPoints.add(JoinPointDefinition.fromMethodMessage(message, resource.getAppliedStereotypes(message)));

            } else if (message.getMessageSort() == MessageSort.CREATE_MESSAGE_LITERAL) {
                // select creation action
                foundJoinPoints.add(JoinPointDefinition.fromCreateMessage(message, resource.getAppliedStereotypes(message)));

            } else if (message.getMessageSort() == MessageSort.DELETE_MESSAGE_LITERAL) {
                foundJoinPoints.add(JoinPointDefinition.fromDestroyMessage(message, resource.getAppliedStereotypes(message)));
            } else  {
                //if (isJPClassSelection(message)) {
                    //TODO: original dercs had a case here that in the end seems to also just search for send message actions?
                    // check if this makes a difference
                //} else {
                foundJoinPoints.add(JoinPointDefinition.fromSendMessage(message, resource.getAppliedStereotypes(message)));
            }
        }

        for (Lifeline lifeLine : interaction.getLifelines()) {
            if (!isJoinPoint(lifeLine)) {
                continue;
            }

            // lifeline is join point -> class, object or node
            if (isJPNodeSelection(lifeLine)) {
                foundJoinPoints.add(JoinPointDefinition.fromNodeLifeLine(lifeLine, resource.getAppliedStereotypes(lifeLine)));
            } else if (isJPClassSelection(lifeLine)) {
                // lifeline should represent an existing class
                if (lifeLine.getRepresents() instanceof Property && lifeLine.getRepresents().getType() instanceof Class) {
                    Class cls = (Class) lifeLine.getRepresents().getType();
                    foundJoinPoints.add(JoinPointDefinition.fromClass(cls, resource.getAppliedStereotypes(cls)));
                } else {
                    throw new UnsupportedJpddDefinitionException(lifeLine.getQualifiedName());
                }
            } else if (isJPObjectSelection(lifeLine)) {
                foundJoinPoints.add(JoinPointDefinition.fromObjectLifeLine(lifeLine, resource.getAppliedStereotypes(lifeLine)));
            }
        }

        // should only find exactly one join point
        if (foundJoinPoints.size() != 1) {
            throw new UnsupportedJpddDefinitionException(interaction.getName());
        } else {
            return foundJoinPoints.get(0);
        }
    }

    /**
     * Checks if the given element has the JoinPoint stereotype.
     * @param element the element to check
     * @return {@code true} if the element is a join point, {@code false} otherwise
     */
    private boolean isJoinPoint(Element element) {
        return resource.getAppliedStereotype(element, AspectsModelingPackage.Literals.JOIN_POINT) != null;
    }

    /**
     * Indicates if the element selected by the join point is a Behavior.
     * @param el Element to be checked.
     * @return {@code true} if the element selected by the join point is a Behavior,
     * {@code false} otherwise.
     */
    private boolean isJPBehaviorSelection(Element el) {
        JoinPoint stereotype = resource.getAppliedStereotype(el, AspectsModelingPackage.Literals.JOIN_POINT);
        return stereotype.isBehavior();
    }

    /**
     * Indicates if the element selected by the join point is the signature
     * of a message.
     * @param el Element to be checked.
     * @return {@code true} if the element selected by the join point is the signature
     * of a message, {@code false} otherwise.
     */
    private boolean isJPSignatureSelection(Element el) {
        JoinPoint stereotype = resource.getAppliedStereotype(el, AspectsModelingPackage.Literals.JOIN_POINT);
        return stereotype.isMessageDefinition();
    }

    /**
     * Indicates if the element selected by the join point is a Node.
     * @param el Element to be checked.
     * @return {@code true} if the element selected by the join point is a Node,
     * {@code false} otherwise.
     */
    private boolean isJPNodeSelection(Element el) {
        JoinPoint stereotype = resource.getAppliedStereotype(el, AspectsModelingPackage.Literals.JOIN_POINT);
        return stereotype.isNode();
    }

    /**
     * Indicates if the element selected by the join point is an Object.
     * @param el Element to be checked.
     * @return {@code true} if the element selected by the join point is an Object,
     * {@code false} otherwise.
     */
    private boolean isJPObjectSelection(Element el) {
        JoinPoint stereotype = resource.getAppliedStereotype(el, AspectsModelingPackage.Literals.JOIN_POINT);
        return stereotype.isObject();
    }

    /**
     * Indicates if the element selected by the join point is a Class.
     * @param el Element to be checked.
     * @return {@code true} if the element selected by the join point is a Class,
     * {@code false} otherwise.
     */
    private boolean isJPClassSelection(Element el) {
        JoinPoint stereotype = resource.getAppliedStereotype(el, AspectsModelingPackage.Literals.JOIN_POINT);
        return stereotype.isClass();
    }
}
