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

import dercs.loader.exception.ClassNotFoundException;
import dercs.loader.exception.DercsLoaderException;
import dercs.loader.exception.MultiInheritanceException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.structure.Class;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Fills superClass fields of all classes according to UML class-hierarchy.
 * <p>
 * Result:
 * <ul>
 *     <li>every DERCS class has the correct superClass</li>
 * </ul>
 */
public class ClassHierarchyExtractor extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("ClassHierarchyExtractor");

    @Override
    protected void run() throws DercsLoaderException{
        for (Class cls : model().getClasses()) {
            handleClass(cls);
        }
    }

    private void handleClass(Class cls) throws DercsLoaderException {
        org.eclipse.uml2.uml.Class umlClass = inProgressModel().getCorrespondingUmlElement(cls);
        if (umlClass.getSuperClasses().isEmpty()) {
            return;
        }

        if (umlClass.getSuperClasses().size() > 1) {
            throw new MultiInheritanceException(cls);
        }

        Class superClass = inProgressModel().getCorrespondingDercsElement(umlClass.getSuperClasses().get(0));
        if (superClass == null) {
            throw new ClassNotFoundException(umlClass.getSuperClasses().get(0).getName());
        }

        LOGGER.info("Setting superclass of '{}' to '{}'.", cls.getName(), superClass.getName());
        cls.setSuperClass(superClass);
    }

    @Override
    public String getName() {
        return "ClassHierarchyExtractor";
    }
}
