package dercs.loader.behavior;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.datatypes.ClassDataType;
import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.util.DercsCreationHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Method;
import dercs.structure.runtime.Object;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Contains helper functions for operations involving DERCS behaviors and UML interactions.
 */
public class BehaviorHelper {
    /**
     * Returns the lifeline of the given interaction, where execution begins.
     * @param interaction the interaction to check
     * @return the starting lifeline
     */
    public static Lifeline getStartingLifeline(Interaction interaction) {
        Lifeline found = null;

        for (Lifeline lifeline : interaction.getLifelines()) {
            List<InteractionFragment> fragments =  lifeline.getCoveredBys();
            List<InteractionFragment> sends = fragments.stream()
                    .filter(frag -> frag instanceof MessageOccurrenceSpecification && ((MessageOccurrenceSpecification) frag).isSend())
                    .collect(Collectors.toList());
            List<InteractionFragment> recvs = fragments.stream()
                    .filter(frag -> frag instanceof MessageOccurrenceSpecification && ((MessageOccurrenceSpecification) frag).isReceive())
                    .collect(Collectors.toList());

            if (recvs.size() != 0 || sends.size() != 1) {
                continue;
            }

            if (found == null) {
                found = lifeline;
            } else {
                throw new RuntimeException("Multiple possible starting lifelines in interaction '" + interaction.getName() + "'.");
            }
        }

        return found;
    }

    /**
     * Returns all {@link InteractionFragment}s of the given interaction in order.
     * @param interaction the interaction to get the fragments of
     * @return all {@link InteractionFragment}s in order
     */
    public static List<InteractionFragment> getAllFragmentsOrdered(Interaction interaction) {
        Stack<Lifeline> lifelineCallstack = new Stack<>();
        Map<Lifeline, Integer> lifelineContinueIndices = new HashMap<>();

        List<InteractionFragment> allFragments = new ArrayList<>();

        lifelineCallstack.push(BehaviorHelper.getStartingLifeline(interaction));
        interaction.getLifelines().forEach(lifeline -> lifelineContinueIndices.put(lifeline, 0));

        while (!lifelineCallstack.empty()) {
            Lifeline currentLifeline = lifelineCallstack.peek();
            int currentIndex = lifelineContinueIndices.get(currentLifeline);
            List<InteractionFragment> lifelineFragments = currentLifeline.getCoveredBys();

            if (currentIndex >= lifelineFragments.size()) {
                // reached end of lifeline
                lifelineCallstack.pop();
                continue;
            }

            InteractionFragment currentFragment = lifelineFragments.get(currentIndex);
            // increment index
            lifelineContinueIndices.put(currentLifeline, currentIndex + 1);
            // skip ExecutionSpec and ExecutionOccurrenceSpec, because we do not need them
            if (!(currentFragment instanceof ExecutionSpecification || currentFragment instanceof ExecutionOccurrenceSpecification)) {
                allFragments.add(currentFragment);
            }

            if (currentFragment instanceof MessageOccurrenceSpecification) {
                MessageOccurrenceSpecification occurrence = (MessageOccurrenceSpecification) currentFragment;
                if (occurrence.isSend() && occurrence.getMessage().getMessageSort() == MessageSort.REPLY_LITERAL) {
                    // is reply -> return to previous lifeline
                    lifelineCallstack.pop();
                } else if (occurrence.isSend()) {
                    // is send -> goto other lifeline
                    Lifeline receiverLifeline = ((MessageOccurrenceSpecification) occurrence.getMessage().getReceiveEvent()).getCovered();
                    lifelineCallstack.push(receiverLifeline);
                }
            }

        }

        return allFragments;
    }

    /**
     * Returns the DERCS method/constructor/destructor represented by the given message.
     * @param model the DERCS model
     * @param message the message to process
     * @return the method/constructor/destructor represented by the message, or {@code null} if it does not represent any method
     */
    public static Method getMethodFromMessage(InProgressDercsModel model, Message message) throws ClassNotFoundException {
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
     * Gets the DERCS class that is the source of this message.
     * @param model the DERCS model
     * @param message the message to process
     * @return the source DERCS class, or {@code null} if the source is not a class
     */
    public static dercs.structure.Class getMessageSourceClass(InProgressDercsModel model, Message message) {
        Lifeline lifeline = ((MessageOccurrenceSpecification) message.getSendEvent()).getCovered();
        if (!(lifeline.getRepresents() instanceof Property) || !(lifeline.getRepresents().getType() instanceof Class)) {
            // target lifeline does not represent a class
            return null;
        }
        Class reprClass = ((Class) lifeline.getRepresents().getType());
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
        if (!(lifeline.getRepresents() instanceof Property) || !(lifeline.getRepresents().getType() instanceof Class)) {
            // target lifeline does not represent a class
            return null;
        }
        Class reprClass = ((Class) lifeline.getRepresents().getType());
        return model.getCorrespondingDercsElement(reprClass);
    }

    /**
     * Gets the local variable with the given name or creates it if it does not exist.
     * @param model the DERCS model
     * @param behavior the behavior whose local variable to get
     * @param name the name of the variable
     * @return the variable with the given name or a new one if it did not exist
     */
    public static LocalVariable getOrCreateLocalVariable(InProgressDercsModel model, Behavior behavior, String name, dercs.datatypes.DataType type) {
        // also search all parent behaviors for the variable
        LocalVariable var = null;
        Behavior currentBehavior = behavior;
        while (currentBehavior != null) {
            LocalVariable foundVar = currentBehavior.getLocalVariable(name);
            // variables found further in take priority
            if (foundVar != null && var == null) {
                var = foundVar;
            }
            if (currentBehavior.getOwner() instanceof Behavior) {
                currentBehavior = (Behavior) currentBehavior.getOwner();
            } else {
                currentBehavior = null;
            }
        }

        if (var == null) {
            // new variable
            var = behavior.addLocalVariable(name, type);
            if (var.getDataType() instanceof ClassDataType) {
                // if the variable represents a local object,
                // it should be added in the objects list of the model
                // the name is interaction + _ + target lifeline
                // REMARK: this is similar to the construction of an object
                Object obj = DercsCreationHelper.createLocalRelatedObject(var, true);
                model.getModel().getObjects().add(obj);
            }
        }

        return var;
    }

    /**
     * Adds enter/exit conditions to the given behavior according to the guards of the operand.
     * This is intended to set up the behaviors of combined fragments such as LOOP/OPT/ALT.
     * @param behavior the behavior to populate
     * @param operand the operand this behavior belongs to
     * @param operatorKind the kind of the operator
     */
    public static void populateBehaviorConditions(Behavior behavior, InteractionOperand operand, InteractionOperatorKind operatorKind) {
        ValueSpecification guardSpec = operand.getGuard().getSpecification();
        String guardString = guardSpec.stringValue() == null ? null : guardSpec.stringValue().trim();;
        if (operatorKind == InteractionOperatorKind.OPT_LITERAL) {
            behavior.setEnterCondition(guardString);

        } else if (operatorKind == InteractionOperatorKind.LOOP_LITERAL) {
            if (guardString == null) {
                throw new RuntimeException();
            }

            try {
                // for loop with number of repetitions in guard
                behavior.setNumberOfRepetitions(Integer.parseInt(guardString));
                return;
            } catch (NumberFormatException ex) {
                // ignored
            }

            if (guardString.contains(";")) {
                String[] parts = guardString.split(";");
                // for loop of form: "var = init_value; var < limit"
                behavior.setEnterCondition(parts[0].trim());
                behavior.setEnterCondition(parts[1].trim());
            } else {
                // while loop with condition in guard
                // TODO: shouldn't this be inverted?
                behavior.setExitCondition(guardString);
            }

        } else if (operatorKind == InteractionOperatorKind.ALT_LITERAL) {
            if (guardString == null || guardString.isEmpty() || guardString.equalsIgnoreCase("else")) {
                behavior.setEnterCondition(" ");
            } else {
                behavior.setEnterCondition(guardString);
            }
        }
    }
}
