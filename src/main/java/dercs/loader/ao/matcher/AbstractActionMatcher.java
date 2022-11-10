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
package dercs.loader.ao.matcher;

import dercs.behavior.Behavior;
import dercs.behavior.BehavioralElement;
import dercs.behavior.actions.Action;
import dercs.behavior.actions.AssignmentAction;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import dercs.structure.Class;
import dercs.structure.Method;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class AbstractActionMatcher extends MethodMatcher implements ISpecializedJoinPointMatcher {
    private String targetLifelineName;
    private List<EObject> targetClassStereotypes;
    private Set<EObject> joinPointRequiredStereotypes;

    @Override
    public List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) throws DercsLoaderException {
        if (!(joinPoint.getMatchedElement() instanceof Message)) {
            throw new RuntimeException("Unexpected element type.");
        }
        Message message = (Message) joinPoint.getMatchedElement();
        joinPointRequiredStereotypes = joinPoint.getRequiredStereotypes();

        // get target class properties
        Lifeline targetLifeline = ((MessageOccurrenceSpecification) ((Message) joinPoint.getMatchedElement()).getReceiveEvent()).getCovered();

        targetLifelineName = getMatchNameFromLifeline(targetLifeline);
        targetClassStereotypes = model.getSourceResource().getAppliedStereotypes(targetLifeline);

        // find candidate classes according to source lifeline
        Lifeline sourceLifeline = ((MessageOccurrenceSpecification) message.getSendEvent()).getCovered();
        String sourceClassName = getMatchNameFromLifeline(sourceLifeline);
        List<EObject> sourceClassStereotypes = model.getSourceResource().getAppliedStereotypes(sourceLifeline);

        List<Action> matchingActions = new ArrayList<>();

        // iterate through all methods of all classes
        for (Class cls : findMatchingClasses(model, sourceClassName, sourceClassStereotypes)) {
            for (Method method : cls.getMethods()) {
                if (!isCandidateMethod(model, method, message)) {
                    continue;
                }

                Behavior behavior = method.getTriggeredBehavior();
                if (behavior != null) {
                    matchingActions.addAll(findMatchingActions(model, behavior, message));
                }
            }
        }
        return matchingActions;
    }

    private List<Action> findMatchingActions(InProgressDercsModel model, Behavior behavior, Message message) throws DercsLoaderException {
        List<Action> matchingActions = new ArrayList<>();
        for (BehavioralElement element : behavior.getBehavioralElements()) {
            if (element instanceof Behavior) {
                matchingActions.addAll(findMatchingActions(model, (Behavior) element, message));
                continue;
            }

            if (!(element instanceof Action)) {
                throw new RuntimeException("Unexpected element type.");
            }

            if (actionMatches(model, (Action) element, message)) {
                matchingActions.add((Action) element);
            }

            if (element instanceof AssignmentAction) {
                if (actionMatches(model, ((AssignmentAction) element).getResultOfAction(), message)) {
                    matchingActions.add(((AssignmentAction) element).getResultOfAction());
                }
            }
        }

        if (behavior.hasAlternativeBehavior()) {
            matchingActions.addAll(findMatchingActions(model, behavior.getAlternateBehavior(), message));
        }

        return matchingActions;
    }

    protected String getTargetLifelineName() {
        return this.targetLifelineName;
    }

    protected List<EObject> getRequiredTargetClassStereotypes() {
        return targetClassStereotypes;
    }

    protected Set<EObject> getJoinPointRequiredStereotypes() {
        return joinPointRequiredStereotypes;
    }

    protected boolean isCandidateMethod(InProgressDercsModel model, Method method, Message message) {
        return true;
    }

    abstract protected boolean actionMatches(InProgressDercsModel model, Action action, Message message) throws DercsLoaderException;

    @Override
    abstract public boolean canHandle(JoinPointDefinition joinPointDefinition);
}
