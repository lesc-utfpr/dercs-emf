package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.ao.StereotypeMatcher;
import dercs.loader.util.DercsAccessHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import dercs.structure.Class;
import dercs.structure.Method;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CreateDestroyMessageMatcher extends ClassMatcher implements ISpecializedJoinPointMatcher {
    @Override
    public List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) {
        MessageSort messageSort = ((Message) joinPoint.getMatchedElement()).getMessageSort();

        String targetClassName;
        Collection<EObject> targetClassStereotypes;

        MessageOccurrenceSpecification receiveEvent = (MessageOccurrenceSpecification) ((Message) joinPoint.getMatchedElement()).getReceiveEvent();
        targetClassName = receiveEvent.getCovered().getName();
        targetClassStereotypes = model.getSourceResource().getAppliedStereotypes(receiveEvent.getCovered());

        List<Class> matchedClasses = findMatchingClasses(model, targetClassName, targetClassStereotypes);

        List<Method> matched = new ArrayList<>();

        for (Class cls : matchedClasses) {
            Method methodToCheck;
            if (messageSort == MessageSort.CREATE_MESSAGE_LITERAL) {
                methodToCheck = DercsAccessHelper.getConstructor(cls);
            } else if (messageSort == MessageSort.DELETE_MESSAGE_LITERAL) {
                methodToCheck = DercsAccessHelper.getDestructor(cls);
            } else {
                throw new RuntimeException("Unreachable");
            }

            if (!methodMatches(methodToCheck, (Message) joinPoint.getMatchedElement())) {
                continue;
            }

            // check stereotypes
            List<EObject> stereotypes = getStereotypesFromDercsElement(model, methodToCheck);
            if (!StereotypeMatcher.stereotypesMatch(stereotypes, joinPoint.getRequiredStereotypes())) {
                continue;
            }

            matched.add(methodToCheck);
        }

        if (joinPoint.getSelectionKind() == ElementSelectionKind.METHOD) {
            return matched;
        } else {
            return matched.stream().map(Method::getTriggeredBehavior).collect(Collectors.toList());
        }
    }

    private boolean methodMatches(Method dercsMethod, Message jpddMessage) {
        if (jpddMessage.getName().trim().isEmpty() && jpddMessage.getArguments().isEmpty()) {
            return true;
        }

        //TODO: implement parameter matching
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        if (joinPoint.getSelectionKind() != ElementSelectionKind.METHOD && joinPoint.getSelectionKind() != ElementSelectionKind.BEHAVIOR) {
            return false;
        }

        if (joinPoint.getMatchedElement() instanceof Message) {
            MessageSort sort = ((Message) joinPoint.getMatchedElement()).getMessageSort();
            return sort == MessageSort.CREATE_MESSAGE_LITERAL || sort == MessageSort.DELETE_MESSAGE_LITERAL;
        } else {
            return false;
        }
    }
}
