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
package dercs.loader.processor.base;

import dercs.loader.exception.DercsLoaderException;
import dercs.loader.wrapper.InProgressDercsModel;
import dercs.loader.wrapper.WrappedUmlResource;

public interface IModelProcessor {
    /**
     * Perform some change on the DERCS model, possibly based on the UML resource.
     *
     * @param dercsModel  the model to modify
     * @param umlResource the resource to extract from
     */
    void apply(InProgressDercsModel dercsModel, WrappedUmlResource umlResource) throws DercsLoaderException;

    /**
     * Returns the name of this processor
     * @return the name of this processor
     */
    String getName();
}
