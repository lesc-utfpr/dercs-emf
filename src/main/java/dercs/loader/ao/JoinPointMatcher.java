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
package dercs.loader.ao;

import dercs.loader.ao.matcher.*;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Used to find matching elements for a given {@link JoinPointDefinition}.
 */
public class JoinPointMatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger("JoinPointMatcher");
    private final InProgressDercsModel model;

    /**
     * A map that holds the corresponding matcher for each element selection kind.
     */
    private final List<ISpecializedJoinPointMatcher> matchers;

    public JoinPointMatcher(InProgressDercsModel model) {
        this.model = model;
        matchers = new ArrayList<>();

        registerMatchers();
    }

    private void registerMatchers() {
        Collections.addAll(matchers,
                new ClassMatcher(),
                new AttributeMatcher(),
                new CreateDestroyMessageMatcher(),
                new MethodMatcher(),
                new BehaviorMatcher(),
                new NodeMatcher(),
                new ObjectMatcher(),
                new CreateObjectActionMatcher(),
                new DestroyObjectActionMatcher(),
                new ReturnActionMatcher(),
                new SendMessageActionMatcher()
        );
    }

    public List<? extends BaseElement> getSelectedElements(JoinPointDefinition joinPoint) throws DercsLoaderException {
        // dispatch on join point type
        for (ISpecializedJoinPointMatcher matcher : this.matchers) {
            if (matcher.canHandle(joinPoint)) {
                return matcher.match(model, joinPoint);
            }
        }

        LOGGER.warn("No JoinPointMatcher implemented for selection kind '{}'. Skipping.", joinPoint.getSelectionKind());
        return Collections.emptyList();
    }
}
