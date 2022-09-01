package dercs.loader.ao;

import dercs.loader.wrapper.InProgressDercsModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimePackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedEvent;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.ValueSpecification;

import java.util.Collection;
import java.util.Objects;

public class StereotypeMatcher {
    public static boolean stereotypesMatch(InProgressDercsModel model, Collection<EObject> elementStereotypes, Collection<EObject> expectedStereotypes) {
        for (EObject expected : expectedStereotypes) {
            EObject matching = elementStereotypes.stream().filter(s -> s.getClass() == expected.getClass()).findAny().orElse(null);
            if (matching == null) {
                return false;
            }

            if (!valuesMatch(model, matching, expected)) {
                return false;
            }
        }

        return true;
    }

    private static boolean valuesMatch(InProgressDercsModel model, EObject foundStereotype, EObject expectedStereotype) {
        for (EStructuralFeature feature : expectedStereotype.eClass().getEStructuralFeatures()) {
            Object foundValue = foundStereotype.eGet(feature);
            Object expectedValue = expectedStereotype.eGet(feature);

            if (feature.getName().startsWith("base_")) {
                continue;
            }

            // TimeEvents need special  handling, because they have deeper nested information to compare
            if (expectedValue instanceof TimeEvent) {
                return compareTimeEvents(model, (TimeEvent) foundValue, (TimeEvent) expectedValue);
            }

            if (expectedValue instanceof ValueSpecification) {
                foundValue = ((ValueSpecification) foundValue).stringValue();
                expectedValue = ((ValueSpecification) expectedValue).stringValue();
            }
            if (expectedValue != null && !Objects.equals(expectedValue, "*") && !Objects.equals(foundValue, expectedValue)) {
                return false;
            }
        }

        return true;
    }

    private static boolean compareTimeEvents(InProgressDercsModel model, TimeEvent foundValue, TimeEvent expectedValue) {
        TimedEvent foundTimedEventStereotype = model.getSourceResource().getAppliedStereotype(foundValue, TimePackage.Literals.TIMED_EVENT);
        TimedEvent expectedTimedEventStereotype = model.getSourceResource().getAppliedStereotype(expectedValue, TimePackage.Literals.TIMED_EVENT);

        if (expectedTimedEventStereotype == null) {
            return Objects.equals(expectedValue.getWhen().getExpr().stringValue(), "*") || Objects.equals(foundValue.getWhen().getExpr().stringValue(), expectedValue.getWhen().getExpr().stringValue());
        } else {
            if (foundTimedEventStereotype == null) {
                return false;
            } else {
                return valuesMatch(model, foundTimedEventStereotype, expectedTimedEventStereotype);
            }
        }
    }
}
