package dercs.loader.extractor;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import dercs.structure.StructureFactory;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.UMLPackage;

import java.util.List;

/**
 * Extracts all class elements from the uml-model.
 * These may represent classes, aspects or join points in DERCS.
 * <p>
 * Result:
 * <ul>
 *     <li>every class from the UML models has a corresponding DERCS class with only name and abstract/active/passive state set</li>
 * </ul>
 */
public class ClassesExtractor extends AbstractModelExtractor {
    @Override
    protected void run() {
        List<Class> umlClasses =  this.umlResource.getAllModelElementsOfType(UMLPackage.Literals.CLASS);

        for (Class cls :  umlClasses) {
            // TODO: ignore JPDD classes (by name and JPDD parent diagram?)
            if (getAppliedStereotype(cls, AspectsModelingPackage.Literals.ASPECT) != null) {
                createAspect(cls);
            } else {
                createClass(cls);
            }
        }
    }

    private void createClass(Class umlClass) {
        dercs.structure.Class dercsClass = StructureFactory.eINSTANCE.createClass();
        dercsClass.setName(umlClass.getName());
        dercsClass.setAbstract(umlClass.isAbstract());
        dercsClass.setSuperClass(null);

        dercsClass.setActiveClass(getAppliedStereotype(umlClass, GRMPackage.Literals.SCHEDULABLE_RESOURCE) != null);
        if (!dercsClass.isActiveClass()) {
            dercsClass.setPassiveClass(getAppliedStereotype(umlClass, GRMPackage.Literals.RESOURCE) != null);
        }

        this.dercsModel.getClasses().add(dercsClass);
    }

    private void createAspect(Class umlClass) {
        //TODO: Aspects
    }

    @Override
    public String getName() {
        return "ClassesExtractor";
    }
}
