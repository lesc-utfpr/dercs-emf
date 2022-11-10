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

public class UnsupportedJpddDefinitionException extends DercsLoaderException {

    private String JpddName = "";

    public UnsupportedJpddDefinitionException(String name) {
        super(ERROR_530 + " [" + name + "]");
        JpddName = name;
    }
}