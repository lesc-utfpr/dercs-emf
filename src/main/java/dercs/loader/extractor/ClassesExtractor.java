package dercs.loader.extractor;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import dercs.behavior.Behavior;
import dercs.behavior.BehaviorFactory;
import dercs.datatypes.DatatypesFactory;
import dercs.structure.StructureFactory;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.UMLPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Extracts all class and enum elements from the uml-model.
 * UML Classes may represent classes, aspects or join points in DERCS.
 * <p>
 * Result:
 * <ul>
 *     <li>every class from the UML model has a corresponding DERCS class with only name and abstract/active/passive state set</li>
 *     <li>every enum from the UML model has a corresponding DERCS enum</li>
 * </ul>
 */
public class ClassesExtractor extends AbstractModelExtractor {
    private static final Logger LOGGER = LoggerFactory.getLogger("ClassesExtractor");

    @Override
    protected void run() {
        // Classes
        List<Class> umlClasses =  resource().getAllModelElementsOfType(UMLPackage.Literals.CLASS);

        for (Class cls :  umlClasses) {
            if (cls.eClass().getEAllSuperTypes().contains(UMLPackage.Literals.CLASS)) {
                // Behaviour, Activity, etc. are all subclasses of Class
                continue;
            }

            // TODO: ignore JPDD classes (by name and JPDD parent diagram?)
            if (getAppliedStereotype(cls, AspectsModelingPackage.Literals.ASPECT) != null) {
                createAspect(cls);
            } else {
                createClass(cls);
            }
        }

        // Enums
        List<Enumeration> umlEnums =  resource().getAllModelElementsOfType(UMLPackage.Literals.ENUMERATION);
        for (Enumeration umlEnum :  umlEnums) {
            createEnum(umlEnum);
        }
    }

    private void createClass(Class umlClass) {
        LOGGER.info("Creating class '{}'.", umlClass.getName());
        dercs.structure.Class dercsClass = StructureFactory.eINSTANCE.createClass();
        dercsClass.setName(umlClass.getName());
        dercsClass.setAbstract(umlClass.isAbstract());
        dercsClass.setSuperClass(null);

        dercsClass.setActiveClass(getAppliedStereotype(umlClass, GRMPackage.Literals.SCHEDULABLE_RESOURCE) != null);
        if (!dercsClass.isActiveClass()) {
            dercsClass.setPassiveClass(getAppliedStereotype(umlClass, GRMPackage.Literals.RESOURCE) != null);
        }

        model().getClasses().add(dercsClass);
        inProgressModel().registerDercsUmlElementPair(dercsClass, umlClass);

        // create constructor
        Behavior newConstructor = BehaviorFactory.eINSTANCE.createBehavior();
        newConstructor.setName("Behavior");
        newConstructor.setNumberOfRepetitions(0);
        //the overwritten flag should be set later once all classes have had their methods added
        dercsClass.addConstructor(dercsClass.getName(), false, newConstructor);
    }

    private void createEnum(Enumeration umlEnum) {
        LOGGER.info("Creating enum '{}'.", umlEnum.getName());
        dercs.datatypes.Enumeration dercsEnum = DatatypesFactory.eINSTANCE.createEnumeration();
        dercsEnum.setName(umlEnum.getName());
        for (EnumerationLiteral literal : umlEnum.getOwnedLiterals()) {
            dercsEnum.getValues().add(literal.getName());
        }

        model().getEnumerations().add(dercsEnum);
        inProgressModel().registerDercsUmlElementPair(dercsEnum, umlEnum);
    }

    private void createAspect(Class umlClass) {
        //TODO: Aspects
        throw new RuntimeException("Not implemented");
    }

    @Override
    public String getName() {
        return "ClassesExtractor";
    }
}
