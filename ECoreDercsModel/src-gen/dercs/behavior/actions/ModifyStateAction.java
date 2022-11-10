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
package dercs.behavior.actions;

import dercs.behavior.StateTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify State Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the action of performing a state transition on an object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.ModifyStateAction#getRelatedTransition <em>Related Transition</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getModifyStateAction()
 * @model
 * @generated
 */
public interface ModifyStateAction extends ObjectAction {
	/**
	 * Returns the value of the '<em><b>Related Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state transition performed by the action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Transition</em>' reference.
	 * @see #setRelatedTransition(StateTransition)
	 * @see dercs.behavior.actions.ActionsPackage#getModifyStateAction_RelatedTransition()
	 * @model
	 * @generated
	 */
	StateTransition getRelatedTransition();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.ModifyStateAction#getRelatedTransition <em>Related Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Transition</em>' reference.
	 * @see #getRelatedTransition()
	 * @generated
	 */
	void setRelatedTransition(StateTransition value);

} // ModifyStateAction
