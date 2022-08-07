package dercs.loader.processor;

import dercs.AO.JoinPoint;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.ao.JoinPointFinder;
import dercs.loader.ao.JoinPointMatcher;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.structure.BaseElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Selects the matching elements for all join points.
 * <p>
 * Result:
 * <ul>
 *     <li>every join point has its list of selected elements populated</li>
 * </ul>
 */
public class JoinPointAffectedElementSelector extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("JoinPointAffectedElementSelector");

    @Override
    protected void run() throws DercsLoaderException {
        JoinPointFinder joinPointFinder = inProgressModel().getJoinPointFinder();
        JoinPointMatcher joinPointMatcher = inProgressModel().getJoinPointMatcher();

        for (JoinPoint joinPoint : model().getJoinPoints()) {
            LOGGER.info("Finding affected elements for join point '{}'.", joinPoint.getName());

            // find join point in diagram and get definition
            EObject umlObject = inProgressModel().getCorrespondingUmlElement(joinPoint);
            JoinPointDefinition foundJoinPointDef = joinPointFinder.findJoinPoint((NamedElement) umlObject);

            // find elements matching definition in model
            //TODO: List<BaseElement> matchingElements = joinPointMatcher.getSelectedElements(foundJoinPointDef);
            List<BaseElement> matchingElements = new ArrayList<>();

            for (BaseElement element : matchingElements) {
                LOGGER.info(" - Selecting element '{}'.", element.getName());
                joinPoint.getSelectedElements().add(element);
            }
        }
    }

    @Override
    public String getName() {
        return "JoinPointAffectedElementSelector";
    }
}
