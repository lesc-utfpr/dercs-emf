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
package dercs.behavior;

import dercs.structure.runtime.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.StateTransition#getFromState <em>From State</em>}</li>
 *   <li>{@link dercs.behavior.StateTransition#getToState <em>To State</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.BehaviorPackage#getStateTransition()
 * @model
 * @generated
 */
public interface StateTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>From State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From State</em>' reference.
	 * @see #setFromState(State)
	 * @see dercs.behavior.BehaviorPackage#getStateTransition_FromState()
	 * @model
	 * @generated
	 */
	State getFromState();

	/**
	 * Sets the value of the '{@link dercs.behavior.StateTransition#getFromState <em>From State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From State</em>' reference.
	 * @see #getFromState()
	 * @generated
	 */
	void setFromState(State value);

	/**
	 * Returns the value of the '<em><b>To State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The new state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To State</em>' reference.
	 * @see #setToState(State)
	 * @see dercs.behavior.BehaviorPackage#getStateTransition_ToState()
	 * @model
	 * @generated
	 */
	State getToState();

	/**
	 * Sets the value of the '{@link dercs.behavior.StateTransition#getToState <em>To State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To State</em>' reference.
	 * @see #getToState()
	 * @generated
	 */
	void setToState(State value);

} // StateTransition
