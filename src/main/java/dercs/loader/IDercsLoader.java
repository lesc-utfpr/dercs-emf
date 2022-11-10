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
package dercs.loader;

import dercs.Model;
import dercs.loader.exception.DercsLoaderException;

/**
 * Common interface for DERCS model loaders.
 */
public interface IDercsLoader {
    /**
     * Load a DERCS model from a previously supplied source.
     *
     * @return the loaded DERCS model
     */
    Model loadDercsModel() throws DercsLoaderException;
}
