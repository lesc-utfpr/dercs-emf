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

public class DuplicateElementNameException extends DercsLoaderException {
    public DuplicateElementNameException(String name, Class<?> type) {
        super("Found multiple elements of type '" + type.getName() + "' while searching for name '" + name + "'.");
    }

    public DuplicateElementNameException(String name, String in) {
        super("Found multiple elements matching '" + name + "' in '" + in + "'.");
    }
}
