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

import dercs.structure.Method;

public class DuplicatedBehaviorException extends DercsLoaderException {

    private dercs.structure.Method Method;

    public DuplicatedBehaviorException(Method method) {
        super(ERROR_513 + "[" + method.getOwnerClass().getName() + "." + method.getName() + "]");
        Method = method;
    }
}
