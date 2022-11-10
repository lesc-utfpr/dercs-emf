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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action With Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents actions which produce a result as a consequence of their execution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.ActionWithOutput#getOutputReceiverAction <em>Output Receiver Action</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getActionWithOutput()
 * @model abstract="true"
 * @generated
 */
public interface ActionWithOutput extends Action {
	/**
	 * Returns the value of the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action that receives the output of this action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Receiver Action</em>' reference.
	 * @see #setOutputReceiverAction(Action)
	 * @see dercs.behavior.actions.ActionsPackage#getActionWithOutput_OutputReceiverAction()
	 * @model
	 * @generated
	 */
	Action getOutputReceiverAction();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.ActionWithOutput#getOutputReceiverAction <em>Output Receiver Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Receiver Action</em>' reference.
	 * @see #getOutputReceiverAction()
	 * @generated
	 */
	void setOutputReceiverAction(Action value);

} // ActionWithOutput
