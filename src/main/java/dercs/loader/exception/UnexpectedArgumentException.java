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

public class UnexpectedArgumentException extends DercsLoaderException {
    private String m_MessageName;
    private String m_InteractionName;
    private String m_ArgumentType;
    private int m_ArgumentPosition;

    public UnexpectedArgumentException(String messageName, String interactionName, int argumentPosition, String argumentType) {
        super(ERROR_519 + "[" + interactionName + "_" + messageName + " (" +
                argumentPosition + ", " + argumentType + ")]");
        m_MessageName = messageName;
        m_InteractionName = interactionName;
        m_ArgumentType = argumentType;
        m_ArgumentPosition = argumentPosition;
    }
}
