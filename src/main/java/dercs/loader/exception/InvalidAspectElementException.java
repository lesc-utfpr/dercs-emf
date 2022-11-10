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

public class InvalidAspectElementException extends DercsLoaderException {

    private Aspect m_Aspect;
    private String m_ElementName;

    public InvalidAspectElementException(Aspect aspect, String elementName) {
        super(ERROR_520 + " [" + aspect.getName() + "." + elementName + "]");
        m_Aspect = aspect;
        m_ElementName = elementName;
    }
}
