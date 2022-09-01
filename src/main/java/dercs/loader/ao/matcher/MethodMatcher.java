package dercs.loader.ao.matcher;

import dercs.AO.ElementSelectionKind;
import dercs.loader.ao.JoinPointDefinition;
import dercs.loader.ao.StereotypeMatcher;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.UnsupportedJpddDefinitionException;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.structure.BaseElement;
import dercs.structure.Class;
import dercs.structure.Method;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MethodMatcher extends ClassMatcher implements ISpecializedJoinPointMatcher {
    @Override
    public List<? extends BaseElement> match(InProgressDercsModel model, JoinPointDefinition joinPoint) throws DercsLoaderException {
        String targetClassName;
        String methodMatchName;
        Collection<EObject> targetClassStereotypes;

        if (joinPoint.getMatchedElement() instanceof Operation) {
            targetClassName = ((Operation) joinPoint.getMatchedElement()).getClass_().getName();
            targetClassStereotypes = model.getSourceResource().getAppliedStereotypes(((Operation) joinPoint.getMatchedElement()).getClass_());
            methodMatchName = getMethodString(((Operation) joinPoint.getMatchedElement()));
        } else if (joinPoint.getMatchedElement() instanceof Message) {
            MessageOccurrenceSpecification receiveEvent = (MessageOccurrenceSpecification) ((Message) joinPoint.getMatchedElement()).getReceiveEvent();
            targetClassName = receiveEvent.getCovered().getName();
            targetClassStereotypes = model.getSourceResource().getAppliedStereotypes(receiveEvent.getCovered());
            methodMatchName = ((Message) joinPoint.getMatchedElement()).getName();
        } else {
            throw new RuntimeException("Unexpected type '" + joinPoint.getMatchedElement().getClass().getName() + "' for method join point.");
        }

        List<Class> matchedClasses = findMatchingClasses(model, targetClassName, targetClassStereotypes);

        List<Method> matched = new ArrayList<>();

        for (Class cls : matchedClasses) {
            for (Method method : cls.getMethods()) {
                // check name

                try {
                    if (!methodMatches(method, methodMatchName)) {
                        continue;
                    }
                } catch (UnsupportedJpddDefinitionException e) {
                    throw new UnsupportedJpddDefinitionException(((NamedElement) joinPoint.getMatchedElement()).getQualifiedName());
                }

                // check stereotypes
                List<EObject> stereotypes = getStereotypesFromDercsElement(model, method);
                if (!StereotypeMatcher.stereotypesMatch(model, stereotypes, joinPoint.getRequiredStereotypes())) {
                    continue;
                }

                matched.add(method);
            }
        }

        return matched;
    }

    private boolean methodMatches(Method dercsMethod, String jpddMethodName) throws UnsupportedJpddDefinitionException {
        if (!jpddMethodName.contains("(") ||  !jpddMethodName.contains(")") || !jpddMethodName.contains(":")) {
            throw new UnsupportedJpddDefinitionException("");
        }

        String methodName = jpddMethodName.substring(0, jpddMethodName.indexOf("(")).trim();
        String methodReturn = jpddMethodName.substring(jpddMethodName.indexOf(":") + 1).trim();
        String[] methodParams = jpddMethodName.substring(jpddMethodName.indexOf("(") + 1, jpddMethodName.indexOf(")")).split(",");

        if (!nameMatches(dercsMethod.getName(), methodName) || !nameMatches(DatatypeHelper.getDatatypeName(dercsMethod.getReturnType()), methodReturn)) {
            return false;
        }

        if (methodParams.length == 1 && methodParams[0].equals("..")) {
            return true;
        }

        if (methodParams.length != dercsMethod.getParameters().size()) {
            return false;
        }

        //TODO: implement parameter matching
        throw new RuntimeException("Not implemented.");
    }

    private String getMethodString(Operation umlMethod) {
        StringBuilder nameBuilder = new StringBuilder();
        nameBuilder.append(umlMethod.getName());

        if (umlMethod.getOwnedParameters().size() > 0) {
            nameBuilder.append("(");
            String[] paramNames = umlMethod.getOwnedParameters().stream()
                    .filter(param -> param.getDirection() != ParameterDirectionKind.RETURN_LITERAL)
                    .map(NamedElement::getName)
                    .toArray(String[]::new);

            nameBuilder.append(String.join(",", paramNames));
            nameBuilder.append(")");

            Parameter returnParam = umlMethod.getOwnedParameters().stream()
                    .filter(param -> param.getDirection() != ParameterDirectionKind.RETURN_LITERAL)
                    .findAny()
                    .orElse(null);
            if (returnParam != null) {
                if (returnParam.getType() == null) {
                    nameBuilder.append(":").append(returnParam.getName());
                } else {
                    nameBuilder.append(":").append(returnParam.getType().getName());
                }
            }
        }

        return nameBuilder.toString();
    }

    @Override
    public boolean canHandle(JoinPointDefinition joinPoint) {
        return joinPoint.getSelectionKind() == ElementSelectionKind.METHOD;
    }
}
