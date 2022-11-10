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

public class ArgumentNumberDoesNotMatchException extends DercsLoaderException {
    private String m_MessageName;
    private String m_InteractionName;
    private Method M_Method;
    private int m_ArgumentsNumber = -1;

    public ArgumentNumberDoesNotMatchException(String messageName, String interactionName, int argumentsNumber, Method method) {
        super(ERROR_518 + "\n[" + interactionName + "_" + messageName + " (" +
                argumentsNumber + ") - " + method.getOwnerClass().getName() +
                "." + method.getName() + " (" + method.getParameters().size() + ")]");
        m_MessageName = messageName;
        m_InteractionName = interactionName;
        M_Method = method;
        m_ArgumentsNumber = argumentsNumber;
    }
}
