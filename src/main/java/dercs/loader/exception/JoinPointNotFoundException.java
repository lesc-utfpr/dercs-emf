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

import dercs.AO.Aspect;

public class JoinPointNotFoundException extends DercsLoaderException {
    private Aspect m_Aspect;
    private String m_Pointcut;

    public JoinPointNotFoundException(Aspect aspect, String pointcut) {
        super(ERROR_523 + " [" + aspect.getName() + "." + pointcut + "]");
        m_Aspect = aspect;
        m_Pointcut = pointcut;
    }
}
