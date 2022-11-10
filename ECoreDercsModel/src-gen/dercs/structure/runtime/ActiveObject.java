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

import dercs.structure.Method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents active objects, i.e. objects with their own thread of execution.
 * Active object execution can be periodic or aperiodic, and its WCET must meet 
 * its deadline. Additionaly, active objects have a priority of execution. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.ActiveObject#getMainBehaviour <em>Main Behaviour</em>}</li>
 * </ul>
 *
 * @see dercs.structure.runtime.RuntimePackage#getActiveObject()
 * @model
 * @generated
 */
public interface ActiveObject extends dercs.structure.runtime.Object {
	/**
	 * Returns the value of the '<em><b>Main Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method representing the main behaviour of the active object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Behaviour</em>' reference.
	 * @see #setMainBehaviour(Method)
	 * @see dercs.structure.runtime.RuntimePackage#getActiveObject_MainBehaviour()
	 * @model
	 * @generated
	 */
	Method getMainBehaviour();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.ActiveObject#getMainBehaviour <em>Main Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Behaviour</em>' reference.
	 * @see #getMainBehaviour()
	 * @generated
	 */
	void setMainBehaviour(Method value);

} // ActiveObject
