package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.datatypes.DataType;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidDataTypeException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Type;

import java.util.List;

/**
 * Matches a specific kind of DERCS element according to a {@link JoinPointDefinition}.
 * For example, one version might match only join points with the selection kind "CLASS"
 */
public interface ISpecializedJoinPointMatcher {
    /**
     * Attempts to find matching elements for the given join point in the DERCS model.
     * @param model the DERCS model
     * @param joinPoint the join point to match against
     * @return found elements matching the join point
     */
    List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) throws DercsLoaderException;

    /**
     * Checks whether the given join point can be handled by this matcher.
     * @param joinPoint the join point to check
     * @return {@code true} if this join point can be handled, {@code false} otherwise
     */
    boolean canHandle(JoinPointDefinition joinPoint);

    default List<EObject> getStereotypesFromDercsElement(InProgressDercsModel model, BaseElement element) {
        return model.getSourceResource().getAppliedStereotypes(model.getCorrespondingUmlElement(element));
    }

    default boolean nameMatches(String elementName, String matchName) {
        matchName = matchName.trim();
        if (matchName.equals("*") || matchName.equals("..")) {
            return true;
        }

//        if (selectionKind == ElementSelectionKind.NODE && (matchName.equals("local") || matchName.equals("remote"))) {
//            return true;
//        }

        if (matchName.startsWith("*")) {
            return elementName.endsWith(matchName.substring(matchName.indexOf("*") + 1).trim());
        } else if (matchName.endsWith("*")) {
            return elementName.startsWith(matchName.substring(0,matchName.lastIndexOf("*")).trim());
        } else {
            return elementName.equals(matchName);
        }
    }

    default boolean typeMatches(DataType dercsType, Type jpddType) {
        String dercsName = DatatypeHelper.getDatatypeName(dercsType);
        if (jpddType instanceof PrimitiveType) {
            try {
                String jpddName = DatatypeHelper.getDatatypeName(DatatypeHelper.convertPrimitiveType((PrimitiveType) jpddType));
                return dercsName.equals(jpddName);
            } catch (InvalidDataTypeException ex) {
                throw new RuntimeException(ex);
            }
        } else {
            String jpddName = jpddType.getName();
            return nameMatches(dercsName, jpddName);
        }

    }
}
