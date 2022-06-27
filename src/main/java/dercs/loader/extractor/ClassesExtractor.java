package dercs.loader.extractor;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import dercs.structure.StructureFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

import java.util.Collection;

/**
 * Extracts all class elements from the uml-model.
 * These may represent classes, aspects or join points in DERCS.
 */
public class ClassesExtractor extends AbstractModelExtractor {
    @Override
    protected void run() {
        processOwnedClasses(this.umlResource.getMainModel());
    }

    /**
     * Processes all classes contained the given container. Will also check subpackages recursively.
     *
     * @param owner the container object to check for classes
     */
    private void processOwnedClasses(Element owner) {
        Collection<Package> packages = EcoreUtil.getObjectsByType(owner.getOwnedElements(), UMLPackage.Literals.PACKAGE);
        for (Package subPackage : packages) {
            processOwnedClasses(subPackage);
        }

        Collection<Class> classes = EcoreUtil.getObjectsByType(owner.getOwnedElements(), UMLPackage.Literals.CLASS);

        for (Class cls : classes) {
            //TODO: ignore JPDD classes (by name and JPDD parent diagram?)

            // if the class has the "Aspect" stereotype it should be an aspect instead
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
        dercsClass.setPassiveClass(getAppliedStereotype(umlClass, GRMPackage.Literals.RESOURCE) != null);

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
