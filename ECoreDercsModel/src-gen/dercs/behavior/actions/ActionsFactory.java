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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dercs.behavior.actions.ActionsPackage
 * @generated
 */
public interface ActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsFactory eINSTANCE = dercs.behavior.actions.impl.ActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Send Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Message Action</em>'.
	 * @generated
	 */
	SendMessageAction createSendMessageAction();

	/**
	 * Returns a new object of class '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Object Action</em>'.
	 * @generated
	 */
	CreateObjectAction createCreateObjectAction();

	/**
	 * Returns a new object of class '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy Object Action</em>'.
	 * @generated
	 */
	DestroyObjectAction createDestroyObjectAction();

	/**
	 * Returns a new object of class '<em>Get Array Element Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Array Element Action</em>'.
	 * @generated
	 */
	GetArrayElementAction createGetArrayElementAction();

	/**
	 * Returns a new object of class '<em>Get Array Length Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Array Length Action</em>'.
	 * @generated
	 */
	GetArrayLengthAction createGetArrayLengthAction();

	/**
	 * Returns a new object of class '<em>Insert Array Element Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert Array Element Action</em>'.
	 * @generated
	 */
	InsertArrayElementAction createInsertArrayElementAction();

	/**
	 * Returns a new object of class '<em>Remove Array Element Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Array Element Action</em>'.
	 * @generated
	 */
	RemoveArrayElementAction createRemoveArrayElementAction();

	/**
	 * Returns a new object of class '<em>Set Array Element Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Array Element Action</em>'.
	 * @generated
	 */
	SetArrayElementAction createSetArrayElementAction();

	/**
	 * Returns a new object of class '<em>Return Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Action</em>'.
	 * @generated
	 */
	ReturnAction createReturnAction();

	/**
	 * Returns a new object of class '<em>Modify State Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify State Action</em>'.
	 * @generated
	 */
	ModifyStateAction createModifyStateAction();

	/**
	 * Returns a new object of class '<em>Expression Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Action</em>'.
	 * @generated
	 */
	ExpressionAction createExpressionAction();

	/**
	 * Returns a new object of class '<em>Assignment Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Action</em>'.
	 * @generated
	 */
	AssignmentAction createAssignmentAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionsPackage getActionsPackage();

} //ActionsFactory
