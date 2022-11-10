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
package dercs.structure.runtime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passive Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents passive objects, i.e. their behavior is executed within the context
 * of an active object. More than one active object can solicit the execution
 * of passive object's behavior, so mechanism to protect shared data must be used. 
 * <!-- end-model-doc -->
 *
 *
 * @see dercs.structure.runtime.RuntimePackage#getPassiveObject()
 * @model
 * @generated
 */
public interface PassiveObject extends dercs.structure.runtime.Object {
} // PassiveObject
