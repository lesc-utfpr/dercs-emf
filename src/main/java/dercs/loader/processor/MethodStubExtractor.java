package dercs.loader.processor;

import AMoDERT.Utils.Getter;
import AMoDERT.Utils.Setter;
import AMoDERT.Utils.UtilsPackage;
import dercs.datatypes.DataType;
import dercs.loader.exception.AttributeNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.loader.util.DatatypeHelper;
import dercs.loader.util.DercsCreationHelper;
import dercs.structure.*;
import dercs.structure.Class;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimePackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedEvent;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Creates method stubs for all methods of all classes.
 * If the method is annotated with the "Getter" or "Setter" stereotypes, the behavior will be generated immediately.
 * <p>
 * Result:
 * <ul>
 *     <li>all classes have stubs generated (behavior-less signatures) for all methods.</li>
 *     <li>methods with interruption triggers or TimedEvent triggers, have the relevant attributes set.</li>
 *     <li>explicitly annotated getters and setters are fully generated.</li>
 * </ul>
 */
public class MethodStubExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("MethodStubExtractor");

    @Override
    protected void run() throws DercsLoaderException {
        for (Class cls : model().getClasses()) {
            org.eclipse.uml2.uml.Class umlClass = inProgressModel().getCorrespondingUmlElement(cls);
            handleClass(cls, umlClass);
        }
    }

    private void handleClass(Class dercsClass, org.eclipse.uml2.uml.Class umlClass) throws DercsLoaderException {
        for (Operation operation : umlClass.getOwnedOperations()) {
            Getter getterAspect =  resource().getAppliedStereotype(operation, UtilsPackage.Literals.GETTER);
            if (getterAspect != null) {
                createGetter(dercsClass, operation, getterAspect);
                continue;
            }

            Setter setterAspect =  resource().getAppliedStereotype(operation, UtilsPackage.Literals.SETTER);
            if (setterAspect != null) {
                createSetter(dercsClass, operation, setterAspect);
                continue;
            }

            // normal method
            createMethod(dercsClass, operation);
        }
    }

    private void createMethod(Class dercsClass, Operation operation) throws DercsLoaderException {
        DataType returnType = DatatypeHelper.getDercsDatatype(inProgressModel(), operation.getType());
        Visibility visibility = DatatypeHelper.convertVisibility(operation.getVisibility());
        boolean isAbstract = operation.isAbstract();

        LOGGER.info("Creating method '{}() -> {}' in class '{}'.", operation.getName(), DatatypeHelper.getDatatypeName(returnType), dercsClass.getName());
        Method newMethod = dercsClass.addMethod(operation.getName(), returnType, visibility, false, isAbstract, null);
        newMethod.setStatic(operation.isStatic());

        // add parameters
        for (Parameter parameter : operation.getOwnedParameters()) {
            // ignore the return parameter
            if (parameter.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
                continue;
            }

            DataType parameterType = DatatypeHelper.getDercsDatatype(inProgressModel(), parameter.getType());
            ParameterKind parameterKind = DatatypeHelper.convertParameterDirection(parameter.getDirection());
            LOGGER.info(" - Adding parameter '{}: {}'.", parameter.getName(), DatatypeHelper.getDatatypeName(parameterType));
            newMethod.addParameter(parameter.getName(), parameterType, parameterKind);
        }

        //TODO: interruption events

        // handle TimedEvent aka active methods
        TimedEvent timedEventStereotype = getAppliedStereotype(operation, TimePackage.Literals.TIMED_EVENT);
        if (timedEventStereotype != null) {
            newMethod.setActive(true);
            newMethod.getTags().add("TimedEvent");

            // only LiteralInteger every values are accepted
            int every = timedEventStereotype.getEvery().integerValue();
            LOGGER.info(" - Setting active due to timed event. (every = {})", every);
            newMethod.setEvery(every);
        }
    }

    private void createGetter(Class dercsClass, Operation operation, Getter getterAspect) throws AttributeNotFoundException {
        Property forUmlAttribute = getterAspect.getForAttribute();
        Attribute forAttribute = inProgressModel().getCorrespondingDercsElement(forUmlAttribute);
        if (forAttribute == null) {
            throw new AttributeNotFoundException(forUmlAttribute.getName());
        }

        LOGGER.info("Creating getter method '{}' in class '{}'.", operation.getName(), dercsClass.getName());
        Method getter = DercsCreationHelper.addGetter(dercsClass, forAttribute, false);
        getter.setName(operation.getName());
        getter.setStatic(operation.isStatic());
    }

    private void createSetter(Class dercsClass, Operation operation, Setter setterAspect) throws AttributeNotFoundException {
        Property forUmlAttribute = setterAspect.getForAttribute();
        Attribute forAttribute = inProgressModel().getCorrespondingDercsElement(forUmlAttribute);
        if (forAttribute == null) {
            throw new AttributeNotFoundException(forUmlAttribute.getName());
        }

        LOGGER.info("Creating setter method '{}' in class '{}'.", operation.getName(), dercsClass.getName());
        Method setter = DercsCreationHelper.addSetter(dercsClass, forAttribute, false);
        setter.setName(operation.getName());
        setter.setStatic(operation.isStatic());
    }

    @Override
    public String getName() {
        return "MethodStubExtractor";
    }
}
