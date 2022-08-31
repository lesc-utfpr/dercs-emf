package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.ao.StereotypeMatcher;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import dercs.structure.Class;
import org.eclipse.emf.ecore.EObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClassMatcher implements ISpecializedJoinPointMatcher {
    @Override
    public List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) throws DercsLoaderException {
        String matchName = ((org.eclipse.uml2.uml.Class) joinPoint.getMatchedElement()).getName();

        return findMatchingClasses(model, matchName, joinPoint.getRequiredStereotypes());
    }

    protected List<Class> findMatchingClasses(InProgressDercsModel model, String matchName, Collection<EObject> requiredStereotypes) {
        List<Class> matched = new ArrayList<>();

        if (matchName.contains(":")) {
            //TODO: not handling the part before the ':' for now
            matchName = matchName.substring(matchName.indexOf(":") + 1).trim();
        }

        for (Class cls : model.getModel().getClasses()) {
            // check name
            if (!nameMatches(cls.getName(), matchName)) {
                continue;
            }

            // check stereotypes
            List<EObject> stereotypes = getStereotypesFromDercsElement(model, cls);
            if (!StereotypeMatcher.stereotypesMatch(stereotypes, requiredStereotypes)) {
                continue;
            }

            matched.add(cls);
        }

        return matched;
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.CLASS;
    }
}
