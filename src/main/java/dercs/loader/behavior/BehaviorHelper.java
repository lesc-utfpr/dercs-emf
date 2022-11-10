/***************************************************************************************
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Copyright Contributors to the DERCS-EMF Project.
 * 
 ****************************************************************************************/
package dercs.loader.behavior;

import dercs.behavior.Behavior;
import dercs.behavior.LocalVariable;
import dercs.behavior.actions.CreateObjectAction;
import dercs.behavior.actions.*;
import dercs.datatypes.ClassDataType;
import dercs.loader.exception.DuplicateElementNameException;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.util.DercsCreationHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.Attribute;
import dercs.structure.runtime.Object;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.*;

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

            if (recvs.size() > 1 || sends.size() != 1) {
                continue;
            }

            List<InteractionFragment> replySends = sends.stream()
                    .filter(frag -> ((MessageOccurrenceSpecification)frag).getMessage().getMessageSort() == MessageSort.REPLY_LITERAL)
                    .collect(Collectors.toList());

            List<InteractionFragment> nonReplyRecvs = recvs.stream()
                    .filter(frag -> ((MessageOccurrenceSpecification)frag).getMessage().getMessageSort() != MessageSort.REPLY_LITERAL)
                    .collect(Collectors.toList());

            if (replySends.size() != 0 || nonReplyRecvs.size() > 0) {
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
                } else if (occurrence.isSend() && occurrence.getMessage() != null) {
                    if (occurrence.getMessage().getReceiveEvent() == null) {
                        throw new RuntimeException("Invalid diagram. MessageOccurrence '" + occurrence.getName() + "' has no receive event.");
                    }

                    // is send -> goto other lifeline
                    Lifeline receiverLifeline = ((MessageOccurrenceSpecification) occurrence.getMessage().getReceiveEvent()).getCovered();
                    lifelineCallstack.push(receiverLifeline);
                }
            }
        }

        return allFragments;
    }

    /**
     * Gets the local variable, while also searching parent behaviors.
     *
     * @param behavior the behavior whose local variable to get
     * @param name     the name of the variable
     * @return the variable with the given name or a new one if it did not exist
     */
    public static LocalVariable getLocalVariableRecursive(Behavior behavior, String name) {
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

        return var;
    }

    /**
     * Gets the local variable with the given name, while also searching parent behaviors or creates it if it does not exist.
     * @param model the DERCS model
     * @param behavior the behavior whose local variable to get
     * @param name the name of the variable
     * @param type the datatype of the variable
     * @return the variable with the given name or a new one if it did not exist
     */
    public static LocalVariable getOrCreateLocalVariableRecursive(InProgressDercsModel model, Behavior behavior, String name, dercs.datatypes.DataType type) {
        LocalVariable var = getLocalVariableRecursive(behavior, name);

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
        String guardString = guardSpec == null ? "else" : guardSpec.stringValue() == null ? null : guardSpec.stringValue().trim();
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
                behavior.setExitCondition(String.format("!(%s)", parts[1].trim())); //FIXME: hardcoded negation
            } else {
                // while loop with condition in guard
                behavior.setExitCondition(String.format("!(%s)", guardString));
            }

        } else if (operatorKind == InteractionOperatorKind.ALT_LITERAL) {
            if (guardString == null || guardString.isEmpty() || guardString.equalsIgnoreCase("else")) {
                behavior.setEnterCondition(" ");
            } else {
                behavior.setEnterCondition(guardString);
            }
        }
    }

    /**
     * Tries to find the DERCS object represented by a UML lifeline.
     * @param model the DERCS model
     * @param lifeline the UML lifeline
     * @return the DERCS object, or {@code null} if none could be found
     */
    public static Object getObjectFromLifeline(InProgressDercsModel model, Lifeline lifeline) throws DuplicateElementNameException {
        if (lifeline.getRepresents() == null) {
            return null;
        }

        if (lifeline.getRepresents() instanceof Property) {
            Property prop = (Property) lifeline.getRepresents();
            if (prop.getOwner() instanceof Class && !(prop.getOwner() instanceof Interaction)) {
                // represents attribute of a class
                Attribute dercsAttribute = model.getCorrespondingDercsElement(prop);
                return DercsAccessHelper.getObjectRelatedTo(dercsAttribute, model);
            }
        }

        return null;
    }

    /**
     * Finds existing assignment actions in the given behavior, that perform the same action as the given assignment action
     * @param behavior the behavior to search
     * @param assignmentAction the assignment action to check
     * @return the list of equivalent assignment actions
     */
    public static List<AssignmentAction> findEquivalentAssignmentActions(Behavior behavior, AssignmentAction assignmentAction) {
        List<AssignmentAction> matchingDestination = behavior.getBehavioralElements().stream()
                .filter(elem -> elem instanceof AssignmentAction)
                .map(elem -> (AssignmentAction)elem)
                .filter(elem -> elem.getDestinationAttribute() == assignmentAction.getDestinationAttribute() || elem.getDestinationVariable() == assignmentAction.getDestinationVariable())
                .collect(Collectors.toList());

        List<AssignmentAction> matchingActions = new ArrayList<>();

        for (AssignmentAction otherAssignment : matchingDestination) {
            if (otherAssignment.isAssignmentOfValue() && assignmentAction.isAssignmentOfValue() && otherAssignment.getValue().equals(assignmentAction.getValue())) {
                matchingActions.add(otherAssignment);
                continue;
            }

            if (otherAssignment.isAssignmentOfActionResult() && assignmentAction.isAssignmentOfActionResult()) {
                // check source action
                ActionWithOutput source1 = otherAssignment.getResultOfAction();
                ActionWithOutput source2 = assignmentAction.getResultOfAction();

                if (source1.getClass() != source2.getClass()) {
                    continue;
                }

                if (source1 instanceof ObjectAction) {
                    ObjectAction _source1 = (ObjectAction) source1;
                    ObjectAction _source2 = (ObjectAction) source2;
                    if (_source1.getRelatedObject() != _source2.getRelatedObject()) {
                        continue;
                    }

                    if (_source1 instanceof CreateObjectAction) {
                        if (Arrays.equals(((CreateObjectAction)_source1).getParameterValues().toArray(), ((CreateObjectAction)_source2).getParameterValues().toArray())) {
                            matchingActions.add(otherAssignment);
                        }
                    } else {
                        matchingActions.add(otherAssignment);
                    }

                } else if (source1 instanceof ExpressionAction) {
                    ExpressionAction _source1 = (ExpressionAction) source1;
                    ExpressionAction _source2 = (ExpressionAction) source2;
                    if (Objects.equals(_source1.getExpression(), _source2.getExpression())) {
                        matchingActions.add(otherAssignment);
                    }

                } else if (source1 instanceof ArrayAction) {
                    ArrayAction _source1 = (ArrayAction) source1;
                    ArrayAction _source2 = (ArrayAction) source2;
                    if (Objects.equals(_source1.getArrayElement(), _source2.getArrayElement())) {
                        matchingActions.add(otherAssignment);
                    }

                } else if (source1 instanceof SendMessageAction) {
                    SendMessageAction _source1 = (SendMessageAction) source1;
                    SendMessageAction _source2 = (SendMessageAction) source2;
                    if (_source1.getFromObject() != _source2.getFromObject() || _source1.getToObject() != _source2.getToObject()) {
                        continue;
                    }

                    if (_source1.getRelatedMethod() != _source2.getRelatedMethod() || _source1.getMessageSort() != _source2.getMessageSort()) {
                        continue;
                    }

                    if (Arrays.equals(_source1.getParameterValues().toArray(), _source2.getParameterValues().toArray())) {
                        matchingActions.add(otherAssignment);
                    }
                }
            }
        }

        return matchingActions;
    }
}
