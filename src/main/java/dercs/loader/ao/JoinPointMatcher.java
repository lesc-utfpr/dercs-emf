package dercs.loader.ao;

import dercs.AO.ElementSelectionKind;
import dercs.loader.ao.matcher.JoinPointSpecificElementMatcher;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to find matching elements for a given {@link JoinPointDefinition}.
 */
public class JoinPointMatcher {
    private final InProgressDercsModel model;

    /**
     * A map that holds the corresponding matcher for each element selection kind.
     */
    private final Map<ElementSelectionKind, JoinPointSpecificElementMatcher> matcherForSelectionKind;

    public JoinPointMatcher(InProgressDercsModel model) {
        this.model = model;
        matcherForSelectionKind = new HashMap<>();

        // registerMatcher(new ClassMatcher());
        // registerMatcher(new AttributeMatcher());
        // ...
    }

    private void registerMatcher(JoinPointSpecificElementMatcher matcher) {
        matcherForSelectionKind.put(matcher.forSelectionKind(), matcher);
    }

    public List<BaseElement> getSelectedElements(JoinPointDefinition joinPoint) {
        JoinPointSpecificElementMatcher matcher = matcherForSelectionKind.get(joinPoint.getSelectionKind());
        return matcher.match(model, joinPoint);
    }
}
