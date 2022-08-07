package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;

import java.util.List;

/**
 * Matches a specific kind of DERCS element according to a {@link JoinPointDefinition}.
 * For example, one version might match only joi points with the selection kind "CLASS"
 */
public interface JoinPointSpecificElementMatcher {
    /**
     * Attempts to find matching elements for the given join point in the DERCS model.
     * @param model the DERCS model
     * @param joinPoint the join point to match against
     * @return found elements matching the join point
     */
    List<BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint);

    /**
     * Specifies for what {@link ElementSelectionKind} this matcher should run.
     * There should only be one matcher for each selection kind.
     * @return the selection kind for which this matcher should run.
     */
    ElementSelectionKind forSelectionKind();
}
