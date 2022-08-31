package dercs.loader.ao;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.util.Collection;
import java.util.Objects;

public class StereotypeMatcher {
    public static boolean stereotypesMatch(Collection<EObject> elementStereotypes, Collection<EObject> expectedStereotypes) {
        for (EObject expected : expectedStereotypes) {
            EObject matching = elementStereotypes.stream().filter(s -> s.getClass() == expected.getClass()).findAny().orElse(null);
            if (matching == null) {
                return false;
            }

            if (!valuesMatch(matching, expected)) {
                return false;
            }
        }

        return true;
    }

    private static boolean valuesMatch(EObject foundStereotype, EObject expectedStereotype) {
        for (EStructuralFeature feature : expectedStereotype.eClass().getEStructuralFeatures()) {
            Object foundValue = foundStereotype.eGet(feature);
            Object expectedValue = expectedStereotype.eGet(feature);

            if (feature.getName().startsWith("base_")) {
                continue;
            }

            if (expectedValue != null && !Objects.equals(foundValue, expectedValue)) {
                return false;
            }
        }

        return true;
    }
}
