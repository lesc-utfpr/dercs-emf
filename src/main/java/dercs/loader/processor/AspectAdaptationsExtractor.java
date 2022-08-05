package dercs.loader.processor;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import dercs.AO.Aspect;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.InvalidAspectElementException;
import dercs.loader.processor.base.AbstractModelProcessor;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspectAdaptationsExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("AspectAdaptationsExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        for (Aspect aspect : model().getAspects()) {
            Class umlClass = inProgressModel().getCorrespondingUmlElement(aspect);
            handleAspect(aspect, umlClass);
        }
    }

    private void handleAspect(Aspect aspect, Class umlClass) throws DercsLoaderException{
        for (Operation operation : umlClass.getOwnedOperations()) {
            if (getAppliedStereotype(operation, AspectsModelingPackage.Literals.BEHAVIORAL_ADAPTATION) != null) {
                // behavioral
                LOGGER.info("Adding behavioral adaptation '{}' to aspect '{}'.", operation.getName(), aspect.getName());
                aspect.addBehavioralAdaptation(operation.getName());

            } else if (getAppliedStereotype(operation, AspectsModelingPackage.Literals.STRUCTURAL_ADAPTATION) != null) {
                // structural
                LOGGER.info("Adding structural adaptation '{}' to aspect '{}'.", operation.getName(), aspect.getName());
                aspect.addStructuralAdaptation(operation.getName());

            } else if (getAppliedStereotype(operation, AspectsModelingPackage.Literals.POINTCUT) == null) {
                // not a pointcut -> invalid
                throw new InvalidAspectElementException(aspect, operation.getName());
            }
        }
    }

    @Override
    public String getName() {
        return "AspectAdaptationsExtractor";
    }
}
