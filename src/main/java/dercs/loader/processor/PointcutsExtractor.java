package dercs.loader.processor;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import dercs.AO.*;
import dercs.loader.exception.*;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.loader.util.DercsAccessHelper;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PointcutsExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("PointcutsExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        for (Aspect aspect : model().getAspects()) {
            Class umlClass = inProgressModel().getCorrespondingUmlElement(aspect);
            handleAspect(aspect, umlClass);
        }
    }

    private void handleAspect(Aspect aspect, Class umlClass) throws DercsLoaderException {
        for (Operation operation : umlClass.getOwnedOperations()) {
            if (getAppliedStereotype(operation, AspectsModelingPackage.Literals.POINTCUT) == null) {
                // ignore if it is not a pointcut
                continue;
            }

            int numberOfParameters = operation.getOwnedParameters().size();
            if (numberOfParameters != 2 && numberOfParameters != 3) {
                // specification must follow format
                // (join_point_name, adaptation_name) or (join_point_name, adaptation_name, relative_position)
                throw new InvalidPointcutSpecificationException(aspect, operation.getName());
            }

            LOGGER.info("Creating Pointcut '{}' for aspect '{}'.", operation.getName(), aspect.getName());
            Pointcut newPointcut = AOFactory.eINSTANCE.createPointcut();
            newPointcut.setName(operation.getName());

            // get joinpoints
            String joinPointParam = operation.getOwnedParameters().get(0).getName().trim();
            // multiple joinpoints are separated by plus characters
            for (String joinPointName : joinPointParam.split("\\+")) {
                JoinPoint joinPoint = DercsAccessHelper.findNamedElement(model().getJoinPoints(), joinPointName);
                if (joinPoint == null) {
                    throw new JoinPointNotFoundException(aspect, joinPointName);
                }

                LOGGER.info(" - Adding JoinPoint '{}'.", joinPoint.getName());
                newPointcut.getJoinPoints().add(joinPoint);
            }

            // get relative position
            if (numberOfParameters == 3) {
                String relPositionParameter = operation.getOwnedParameters().get(2).getName();
                RelativePosition relPosition = RelativePosition.get(relPositionParameter);
                if (relPosition == null) {
                    throw new InvalidRelativePositionException(relPositionParameter);
                }

                LOGGER.info(" - Setting relative position: '{}'", relPosition.getName());
                newPointcut.setRelativePosition(relPosition);
            }

            // get adaptations and add pointcut to aspect
            String adaptationParam = operation.getOwnedParameters().get(1).getName().trim();
            String[] adaptations = adaptationParam.split("\\+");
            // we need to react differently depending on if there are multiple adaptations
            for (int i = 0; i < adaptations.length; i++) {
                // if there are multiple adaptations, each one need a separate pointcut
                Pointcut currentPointcut = newPointcut;
                if (i > 0) {
                    // not the first adaptation
                    currentPointcut = newPointcut.clonePointcut();
                    // this can cause name collisions if we don't pick something unique
                    currentPointcut.setName(newPointcut.getName() + i + "___");
                    LOGGER.info("Cloning Pointcut for additional Adaptations. New name: '{}'", currentPointcut.getName());

                }

                // try to find adaptation in aspect. search both behavioral and structural
                BehavioralAdaptation behavioralAdaptation = DercsAccessHelper.findNamedElement(aspect.getBehavioralAdaptations(), adaptations[i]);
                StructuralAdaptation structuralAdaptation = DercsAccessHelper.findNamedElement(aspect.getStructuralAdaptations(), adaptations[i]);
                if (behavioralAdaptation == null && structuralAdaptation == null) {
                    // none found
                    throw new AspectAdaptationNotFoundException(aspect, adaptations[i]);
                } else if (behavioralAdaptation != null && structuralAdaptation != null) {
                    // both found
                    throw new DuplicateElementNameException(adaptations[i], aspect.getName());
                }

                if (behavioralAdaptation != null) {
                    LOGGER.info(" - Setting Adaptation : '{}'", behavioralAdaptation.getName());
                    currentPointcut.setAspectAdaptation(behavioralAdaptation);
                } else {
                    LOGGER.info(" - Setting Adaptation : '{}'", structuralAdaptation.getName());
                    currentPointcut.setAspectAdaptation(structuralAdaptation);
                }

                aspect.getPointcuts().add(currentPointcut);
            }


        }
    }

    @Override
    public String getName() {
        return "PointcutsExtractor";
    }
}
