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

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.processor.base.AbstractModelProcessor;
import dercs.structure.Class;
import dercs.structure.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Correctly sets the "overwritingMethod" attribute of all methods.
 * If a method has the same signature as a method from a prent class, it will have "overwritingMethod" set to true.
 * <p>
 * Result:
 * <ul>
 *     <li>all methods have their "overwritingMethod" attribute set correctly.</li>
 * </ul>
 */
public class MethodOverwriteFixer extends AbstractModelProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger("MethodOverwriteFixer");

    @Override
    protected void run() throws DercsLoaderException {
        for (Class cls : model().getClasses()) {
            handleClass(cls);
        }
    }

    private void handleClass(Class cls) {
        for (Method method : cls.getMethods()) {
            Class currentClass = cls.getSuperClass();

            boolean done = false;
            while (currentClass != null && !done) {
                for (Method otherMethod : currentClass.getMethods()) {
                    if (method.signatureMatches(otherMethod)) {
                        LOGGER.info("Method '{}' in class '{}' is overwriting base method in class '{}'.", method.getName(), cls.getName(), currentClass.getName());
                        method.setOverwritingMethod(true);
                        done = true;
                        break;
                    }
                }

                currentClass = currentClass.getSuperClass();
            }
        }
    }

    @Override
    public String getName() {
        return "MethodOverrideFixer";
    }
}
