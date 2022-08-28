package dercs.loader.behavior;

import dercs.loader.exception.InvalidActionSyntaxException;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Method;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.*;

/**
 * Contains helper functions for operations involving DERCS Actions and UML messages.
 */
public class ActionHelper {
    /**
     * Returns the DERCS method/constructor/destructor represented by the given message.
     * @param model the DERCS model
     * @param message the message to process
     * @return the method/constructor/destructor represented by the message, or {@code null} if it does not represent any method
     */
    public static Method getMethodFromMessage(InProgressDercsModel model, Message message) {
        NamedElement signature = message.getSignature();

        // normal methods
        if (signature instanceof Operation) {
            return model.getCorrespondingDercsElement(signature);
        }

        // create and delete messages
        dercs.structure.Class dercsClass = getMessageTargetClass(model, message);

        if (message.getMessageSort() == MessageSort.CREATE_MESSAGE_LITERAL) {
            if (dercsClass == null) {
                throw new RuntimeException();
            }
            return DercsAccessHelper.getConstructor(dercsClass);
        } else if (message.getMessageSort() == MessageSort.DELETE_MESSAGE_LITERAL) {
            if (dercsClass == null) {
                throw new RuntimeException();
            }
            return DercsAccessHelper.getDestructor(dercsClass);
        }

        return null;
    }

    /**
     * Gets the parameters from a string of the form: METH(p1, p2, p3, ...)
     * @param methodString the string from which the parameters should be parsed
     * @return the parameters
     */
    public static String[] getParametersFromMethodString(String methodString) {
        int startIdx = methodString.indexOf('(');
        int endIdx = methodString.lastIndexOf(')');
        String[] params = methodString.substring(startIdx + 1, endIdx).split(",");

        for (int i = 0; i < params.length; i++) {
            params[i] = params[i].trim();
        }

        return params;
    }

    /**
     * Gets the parameters from a string of the form: METH(p1, p2, p3, ...)
     * Also verifies, that the argument count is correct.
     * @param methodString the string from which the parameters should be parsed
     * @param expectedCount the expected argument count
     * @return the parameters
     */
    public static String[] getParametersFromMethodString(String methodString, int expectedCount) throws InvalidActionSyntaxException {
        String[] params = getParametersFromMethodString(methodString);
        if (params.length != expectedCount) {
            throw new InvalidActionSyntaxException(methodString);
        }

        for (int i = 0; i < params.length; i++) {
            if (params[i].trim().isEmpty()) {
                throw new InvalidActionSyntaxException(methodString + " -> Parameter " + (i + 1));
            }
        }

        return params;
    }

    /**
     * Gets the DERCS class that is the source of this message.
     * @param model the DERCS model
     * @param message the message to process
     * @return the source DERCS class, or {@code null} if the source is not a class
     */
    public static dercs.structure.Class getMessageSourceClass(InProgressDercsModel model, Message message) {
        Lifeline lifeline = ((MessageOccurrenceSpecification) message.getSendEvent()).getCovered();
        if (!(lifeline.getRepresents() instanceof Property) || !(lifeline.getRepresents().getType() instanceof org.eclipse.uml2.uml.Class)) {
            // target lifeline does not represent a class
            return null;
        }
        org.eclipse.uml2.uml.Class reprClass = ((org.eclipse.uml2.uml.Class) lifeline.getRepresents().getType());
        return model.getCorrespondingDercsElement(reprClass);
    }

    /**
     * Gets the DERCS class that is the target of this message.
     * @param model the DERCS model
     * @param message the message to process
     * @return the target DERCS class, or {@code null} if the target is not a class
     */
    public static dercs.structure.Class getMessageTargetClass(InProgressDercsModel model, Message message) {
        Lifeline lifeline = ((MessageOccurrenceSpecification) message.getReceiveEvent()).getCovered();
        if (!(lifeline.getRepresents() instanceof Property) || !(lifeline.getRepresents().getType() instanceof org.eclipse.uml2.uml.Class)) {
            // target lifeline does not represent a class
            return null;
        }
        org.eclipse.uml2.uml.Class reprClass = ((Class) lifeline.getRepresents().getType());
        return model.getCorrespondingDercsElement(reprClass);
    }
}
