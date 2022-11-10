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

public class InvalidRelativePositionException extends DercsLoaderException {

    private Aspect m_Aspect;
    private String m_Pointcut;
    private String m_RelativePostion;

    public InvalidRelativePositionException(Aspect aspect, String pointcut, String relativePostion) {
        super(ERROR_524 + "[" + aspect.getName() + "." + pointcut + " - " + relativePostion + "]");
        m_Aspect = aspect;
        m_Pointcut = pointcut;
        m_RelativePostion = relativePostion;
    }

    public InvalidRelativePositionException(String relativePostion) {
        super(ERROR_524 + " [" + relativePostion + "]");
        m_RelativePostion = relativePostion;
    }
}
