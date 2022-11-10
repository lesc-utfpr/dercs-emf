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
package dercs.behavior.actions.impl;

import dercs.behavior.actions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionsFactoryImpl extends EFactoryImpl implements ActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionsFactory init() {
		try {
			ActionsFactory theActionsFactory = (ActionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(ActionsPackage.eNS_URI);
			if (theActionsFactory != null) {
				return theActionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ActionsPackage.SEND_MESSAGE_ACTION:
			return createSendMessageAction();
		case ActionsPackage.CREATE_OBJECT_ACTION:
			return createCreateObjectAction();
		case ActionsPackage.DESTROY_OBJECT_ACTION:
			return createDestroyObjectAction();
		case ActionsPackage.GET_ARRAY_ELEMENT_ACTION:
			return createGetArrayElementAction();
		case ActionsPackage.GET_ARRAY_LENGTH_ACTION:
			return createGetArrayLengthAction();
		case ActionsPackage.INSERT_ARRAY_ELEMENT_ACTION:
			return createInsertArrayElementAction();
		case ActionsPackage.REMOVE_ARRAY_ELEMENT_ACTION:
			return createRemoveArrayElementAction();
		case ActionsPackage.SET_ARRAY_ELEMENT_ACTION:
			return createSetArrayElementAction();
		case ActionsPackage.RETURN_ACTION:
			return createReturnAction();
		case ActionsPackage.MODIFY_STATE_ACTION:
			return createModifyStateAction();
		case ActionsPackage.EXPRESSION_ACTION:
			return createExpressionAction();
		case ActionsPackage.ASSIGNMENT_ACTION:
			return createAssignmentAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendMessageAction createSendMessageAction() {
		SendMessageActionImpl sendMessageAction = new SendMessageActionImpl();
		return sendMessageAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateObjectAction createCreateObjectAction() {
		CreateObjectActionImpl createObjectAction = new CreateObjectActionImpl();
		return createObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestroyObjectAction createDestroyObjectAction() {
		DestroyObjectActionImpl destroyObjectAction = new DestroyObjectActionImpl();
		return destroyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetArrayElementAction createGetArrayElementAction() {
		GetArrayElementActionImpl getArrayElementAction = new GetArrayElementActionImpl();
		return getArrayElementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetArrayLengthAction createGetArrayLengthAction() {
		GetArrayLengthActionImpl getArrayLengthAction = new GetArrayLengthActionImpl();
		return getArrayLengthAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertArrayElementAction createInsertArrayElementAction() {
		InsertArrayElementActionImpl insertArrayElementAction = new InsertArrayElementActionImpl();
		return insertArrayElementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveArrayElementAction createRemoveArrayElementAction() {
		RemoveArrayElementActionImpl removeArrayElementAction = new RemoveArrayElementActionImpl();
		return removeArrayElementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetArrayElementAction createSetArrayElementAction() {
		SetArrayElementActionImpl setArrayElementAction = new SetArrayElementActionImpl();
		return setArrayElementAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnAction createReturnAction() {
		ReturnActionImpl returnAction = new ReturnActionImpl();
		return returnAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifyStateAction createModifyStateAction() {
		ModifyStateActionImpl modifyStateAction = new ModifyStateActionImpl();
		return modifyStateAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionAction createExpressionAction() {
		ExpressionActionImpl expressionAction = new ExpressionActionImpl();
		return expressionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentAction createAssignmentAction() {
		AssignmentActionImpl assignmentAction = new AssignmentActionImpl();
		return assignmentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionsPackage getActionsPackage() {
		return (ActionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionsPackage getPackage() {
		return ActionsPackage.eINSTANCE;
	}

} //ActionsFactoryImpl
