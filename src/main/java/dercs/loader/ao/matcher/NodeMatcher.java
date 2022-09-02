package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.ao.StereotypeMatcher;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidNodenameException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import dercs.structure.runtime.Node;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Lifeline;

import java.util.ArrayList;
import java.util.List;

public class NodeMatcher implements ISpecializedJoinPointMatcher {
    @Override
    public List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) throws DercsLoaderException {
        String matchName;
        if (joinPoint.getMatchedElement() instanceof Artifact) {
            matchName = ((Artifact) joinPoint.getMatchedElement()).getName();
        } else if (joinPoint.getMatchedElement() instanceof Lifeline) {
            String lifelineName = ((Lifeline) joinPoint.getMatchedElement()).getName();
            if (lifelineName.contains(":")) {
                matchName = lifelineName.split(":")[0].trim();
            } else {
                matchName = lifelineName;
            }
        } else {
            throw new RuntimeException("Unexpected element type.");
        }

        List<Node> matched = new ArrayList<>();

        for (Node node : model.getModel().getNodes()) {
            if (!nodeMatches(node, matchName)) {
                continue;
            }

            // check stereotypes
            List<EObject> stereotypes = getStereotypesFromDercsElement(model, node);
            if (!StereotypeMatcher.stereotypesMatch(model, stereotypes, joinPoint.getRequiredStereotypes())) {
                continue;
            }

            matched.add(node);
        }

        return matched;
    }

    private boolean nodeMatches(Node node, String matchName) throws InvalidNodenameException {
        if (!matchName.contains(".")) {
            throw new InvalidNodenameException(matchName);
        }

        // node_name.platform_name
        String[] parts = matchName.split("\\.");
        if (parts[0].trim().equals("local") || parts[0].trim().equals("remote")) {
            return true;
        } else {
            return nameMatches(node.getName(), parts[0].trim()) && nameMatches(node.getPlatformName(), parts[1].trim());
        }

    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.NODE;
    }
}
