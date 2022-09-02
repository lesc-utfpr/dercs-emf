package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import dercs.structure.runtime.Object;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.MutualExclusionResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.SchedulableResource;
import org.eclipse.uml2.uml.Lifeline;

import java.util.ArrayList;
import java.util.List;

public class ObjectMatcher implements ISpecializedJoinPointMatcher {
    @Override
    public List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) throws DercsLoaderException {
        if (!(joinPoint.getMatchedElement() instanceof Lifeline)) {
            throw new RuntimeException("Unexpected element type.");
        }

        Lifeline lifeline = (Lifeline) joinPoint.getMatchedElement();
        String objectMatchName = getMatchNameFromLifeline(lifeline);
        List<EObject> lifelineStereotypes = model.getSourceResource().getAppliedStereotypes(lifeline);
        String[] parts = objectMatchName.split(":");

        List<Object> matchingObjects = new ArrayList<>();

        for (Object object : model.getModel().getObjects()) {

            if (objectMatches(object, parts[0].trim(), parts[1].trim(), lifelineStereotypes)) {
                matchingObjects.add(object);
            }
        }

        return matchingObjects;
    }

    private boolean objectMatches(Object object, String expectedObjectName, String expectedClassName, List<EObject> lifelineStereotypes) {
        if (!nameMatches(object.getName(), expectedObjectName) || !nameMatches(object.getInstanceOfClass().getName(), expectedClassName)) {
            return false;
        }

        // check for active/passive stereotypes
        for (EObject stereotype : lifelineStereotypes) {
            if (stereotype instanceof SchedulableResource && !object.getInstanceOfClass().isActiveClass()) {
                return false;
            } else if (stereotype instanceof MutualExclusionResource && !object.getInstanceOfClass().isPassiveClass()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.OBJECT;
    }
}
