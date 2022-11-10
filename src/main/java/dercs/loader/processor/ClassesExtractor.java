/***************************************************************************************
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Copyright Contributors to the DERCS-EMF Project.
 * 
 ****************************************************************************************/
package dercs.loader.processor;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import dercs.AO.AOFactory;
import dercs.AO.Aspect;
import dercs.behavior.Behavior;
import dercs.behavior.BehaviorFactory;
import dercs.datatypes.DatatypesFactory;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.loader.util.DercsBuilders;
import dercs.structure.StructureFactory;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;
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
public class ClassesExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("ClassesExtractor");

    @Override
    protected void run() {
        // Classes
        List<Class> umlClasses =  resource().getAllModelElementsOfType(UMLPackage.Literals.CLASS);

        for (Class cls :  umlClasses) {
            if (isIgnored(cls)) {
                continue;
            }

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

    /**
     * Checks whether a UML class should be ignored for class creation.
     * @return {@code true} if the calss should be ignored, {@code false} otherwise
     */
    private boolean isIgnored(Class cls) {
        if (cls.eClass().getEAllSuperTypes().contains(UMLPackage.Literals.CLASS)) {
            // Behaviour, Activity, etc. are all subclasses of Class but should not be used to generate classes
            return true;
        }

        // ignore JPDD classes by JPDD stereotype on package
        Package owningPackage = cls.getNearestPackage();
        if (getAppliedStereotype(owningPackage, AspectsModelingPackage.Literals.JPDD) != null) {
            return true;
        } else if (owningPackage.getName().startsWith("JPDD")){
            LOGGER.warn("Loading '{}' as class, even though it's package starts with 'JPDD'. Did you forget to add the JPDD stereotype to the package?", cls.getQualifiedName());
        }

        if (cls.getOwnedOperations().isEmpty() && cls.getOwnedAttributes().isEmpty() && cls.getRelationships().isEmpty()) {
            // probably a dummy class
            LOGGER.info("Ignoring UML class '{}' as probable dummy class because it has no attributes, operations or relations.", cls.getQualifiedName());
            return true;
        }

        if (getAppliedStereotype(cls, GRMPackage.Literals.SCHEDULER) != null) {
            // a Scheduler class should only be used in JPDDs
            LOGGER.info("Ignoring UML class '{}' because it has the 'Scheduler' stereotype.", cls.getQualifiedName());
            return true;
        }

        return false;
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
        // the overwritten flag should be set later once all classes have had their methods added
        DercsBuilders.Method.createConstructor(dercsClass.getName())
                .addToClass(dercsClass);
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
        LOGGER.info("Creating aspect '{}'.", umlClass.getName());
        Aspect dercsAspect = AOFactory.eINSTANCE.createAspect();
        dercsAspect.setName(umlClass.getName());

        model().getAspects().add(dercsAspect);
        inProgressModel().registerDercsUmlElementPair(dercsAspect, umlClass);
    }

    @Override
    public String getName() {
        return "ClassesExtractor";
    }
}
