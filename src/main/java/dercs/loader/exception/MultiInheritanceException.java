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
package dercs.loader.exception;

import dercs.structure.Class;

import java.util.List;

public class MultiInheritanceException extends DercsLoaderException {
    Class dercsClass;
    //List<Class> superClasses;

    public MultiInheritanceException(Class cls/*, List<Class> superClasses*/) {
        super(ERROR_501 + "\t[" + cls.getName() + "]");
        this.dercsClass = cls;
        //this.superClasses = superClasses;
    }
}
