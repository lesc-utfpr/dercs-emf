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
package dercs.behavior.actions.util;

import dercs.behavior.BehavioralElement;

import dercs.behavior.actions.*;

import dercs.structure.BaseElement;
import dercs.structure.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dercs.behavior.actions.ActionsPackage
 * @generated
 */
public class ActionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ActionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ActionsPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = caseBehavioralElement(action);
			if (result == null)
				result = caseBaseElement(action);
			if (result == null)
				result = caseNamedElement(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.ACTION_WITH_OUTPUT: {
			ActionWithOutput actionWithOutput = (ActionWithOutput) theEObject;
			T result = caseActionWithOutput(actionWithOutput);
			if (result == null)
				result = caseAction(actionWithOutput);
			if (result == null)
				result = caseBehavioralElement(actionWithOutput);
			if (result == null)
				result = caseBaseElement(actionWithOutput);
			if (result == null)
				result = caseNamedElement(actionWithOutput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.SEND_MESSAGE_ACTION: {
			SendMessageAction sendMessageAction = (SendMessageAction) theEObject;
			T result = caseSendMessageAction(sendMessageAction);
			if (result == null)
				result = caseActionWithOutput(sendMessageAction);
			if (result == null)
				result = caseAction(sendMessageAction);
			if (result == null)
				result = caseBehavioralElement(sendMessageAction);
			if (result == null)
				result = caseBaseElement(sendMessageAction);
			if (result == null)
				result = caseNamedElement(sendMessageAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.ARRAY_ACTION: {
			ArrayAction arrayAction = (ArrayAction) theEObject;
			T result = caseArrayAction(arrayAction);
			if (result == null)
				result = caseActionWithOutput(arrayAction);
			if (result == null)
				result = caseAction(arrayAction);
			if (result == null)
				result = caseBehavioralElement(arrayAction);
			if (result == null)
				result = caseBaseElement(arrayAction);
			if (result == null)
				result = caseNamedElement(arrayAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.OBJECT_ACTION: {
			ObjectAction objectAction = (ObjectAction) theEObject;
			T result = caseObjectAction(objectAction);
			if (result == null)
				result = caseActionWithOutput(objectAction);
			if (result == null)
				result = caseAction(objectAction);
			if (result == null)
				result = caseBehavioralElement(objectAction);
			if (result == null)
				result = caseBaseElement(objectAction);
			if (result == null)
				result = caseNamedElement(objectAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.CREATE_OBJECT_ACTION: {
			CreateObjectAction createObjectAction = (CreateObjectAction) theEObject;
			T result = caseCreateObjectAction(createObjectAction);
			if (result == null)
				result = caseObjectAction(createObjectAction);
			if (result == null)
				result = caseActionWithOutput(createObjectAction);
			if (result == null)
				result = caseAction(createObjectAction);
			if (result == null)
				result = caseBehavioralElement(createObjectAction);
			if (result == null)
				result = caseBaseElement(createObjectAction);
			if (result == null)
				result = caseNamedElement(createObjectAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.DESTROY_OBJECT_ACTION: {
			DestroyObjectAction destroyObjectAction = (DestroyObjectAction) theEObject;
			T result = caseDestroyObjectAction(destroyObjectAction);
			if (result == null)
				result = caseObjectAction(destroyObjectAction);
			if (result == null)
				result = caseActionWithOutput(destroyObjectAction);
			if (result == null)
				result = caseAction(destroyObjectAction);
			if (result == null)
				result = caseBehavioralElement(destroyObjectAction);
			if (result == null)
				result = caseBaseElement(destroyObjectAction);
			if (result == null)
				result = caseNamedElement(destroyObjectAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.GET_ARRAY_ELEMENT_ACTION: {
			GetArrayElementAction getArrayElementAction = (GetArrayElementAction) theEObject;
			T result = caseGetArrayElementAction(getArrayElementAction);
			if (result == null)
				result = caseArrayAction(getArrayElementAction);
			if (result == null)
				result = caseActionWithOutput(getArrayElementAction);
			if (result == null)
				result = caseAction(getArrayElementAction);
			if (result == null)
				result = caseBehavioralElement(getArrayElementAction);
			if (result == null)
				result = caseBaseElement(getArrayElementAction);
			if (result == null)
				result = caseNamedElement(getArrayElementAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.GET_ARRAY_LENGTH_ACTION: {
			GetArrayLengthAction getArrayLengthAction = (GetArrayLengthAction) theEObject;
			T result = caseGetArrayLengthAction(getArrayLengthAction);
			if (result == null)
				result = caseArrayAction(getArrayLengthAction);
			if (result == null)
				result = caseActionWithOutput(getArrayLengthAction);
			if (result == null)
				result = caseAction(getArrayLengthAction);
			if (result == null)
				result = caseBehavioralElement(getArrayLengthAction);
			if (result == null)
				result = caseBaseElement(getArrayLengthAction);
			if (result == null)
				result = caseNamedElement(getArrayLengthAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.INSERT_ARRAY_ELEMENT_ACTION: {
			InsertArrayElementAction insertArrayElementAction = (InsertArrayElementAction) theEObject;
			T result = caseInsertArrayElementAction(insertArrayElementAction);
			if (result == null)
				result = caseArrayAction(insertArrayElementAction);
			if (result == null)
				result = caseActionWithOutput(insertArrayElementAction);
			if (result == null)
				result = caseAction(insertArrayElementAction);
			if (result == null)
				result = caseBehavioralElement(insertArrayElementAction);
			if (result == null)
				result = caseBaseElement(insertArrayElementAction);
			if (result == null)
				result = caseNamedElement(insertArrayElementAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.REMOVE_ARRAY_ELEMENT_ACTION: {
			RemoveArrayElementAction removeArrayElementAction = (RemoveArrayElementAction) theEObject;
			T result = caseRemoveArrayElementAction(removeArrayElementAction);
			if (result == null)
				result = caseArrayAction(removeArrayElementAction);
			if (result == null)
				result = caseActionWithOutput(removeArrayElementAction);
			if (result == null)
				result = caseAction(removeArrayElementAction);
			if (result == null)
				result = caseBehavioralElement(removeArrayElementAction);
			if (result == null)
				result = caseBaseElement(removeArrayElementAction);
			if (result == null)
				result = caseNamedElement(removeArrayElementAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.SET_ARRAY_ELEMENT_ACTION: {
			SetArrayElementAction setArrayElementAction = (SetArrayElementAction) theEObject;
			T result = caseSetArrayElementAction(setArrayElementAction);
			if (result == null)
				result = caseArrayAction(setArrayElementAction);
			if (result == null)
				result = caseActionWithOutput(setArrayElementAction);
			if (result == null)
				result = caseAction(setArrayElementAction);
			if (result == null)
				result = caseBehavioralElement(setArrayElementAction);
			if (result == null)
				result = caseBaseElement(setArrayElementAction);
			if (result == null)
				result = caseNamedElement(setArrayElementAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.RETURN_ACTION: {
			ReturnAction returnAction = (ReturnAction) theEObject;
			T result = caseReturnAction(returnAction);
			if (result == null)
				result = caseAssignmentAction(returnAction);
			if (result == null)
				result = caseAction(returnAction);
			if (result == null)
				result = caseBehavioralElement(returnAction);
			if (result == null)
				result = caseBaseElement(returnAction);
			if (result == null)
				result = caseNamedElement(returnAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.MODIFY_STATE_ACTION: {
			ModifyStateAction modifyStateAction = (ModifyStateAction) theEObject;
			T result = caseModifyStateAction(modifyStateAction);
			if (result == null)
				result = caseObjectAction(modifyStateAction);
			if (result == null)
				result = caseActionWithOutput(modifyStateAction);
			if (result == null)
				result = caseAction(modifyStateAction);
			if (result == null)
				result = caseBehavioralElement(modifyStateAction);
			if (result == null)
				result = caseBaseElement(modifyStateAction);
			if (result == null)
				result = caseNamedElement(modifyStateAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.EXPRESSION_ACTION: {
			ExpressionAction expressionAction = (ExpressionAction) theEObject;
			T result = caseExpressionAction(expressionAction);
			if (result == null)
				result = caseActionWithOutput(expressionAction);
			if (result == null)
				result = caseAction(expressionAction);
			if (result == null)
				result = caseBehavioralElement(expressionAction);
			if (result == null)
				result = caseBaseElement(expressionAction);
			if (result == null)
				result = caseNamedElement(expressionAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActionsPackage.ASSIGNMENT_ACTION: {
			AssignmentAction assignmentAction = (AssignmentAction) theEObject;
			T result = caseAssignmentAction(assignmentAction);
			if (result == null)
				result = caseAction(assignmentAction);
			if (result == null)
				result = caseBehavioralElement(assignmentAction);
			if (result == null)
				result = caseBaseElement(assignmentAction);
			if (result == null)
				result = caseNamedElement(assignmentAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action With Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action With Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionWithOutput(ActionWithOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Message Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendMessageAction(SendMessageAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAction(ArrayAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAction(ObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateObjectAction(CreateObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyObjectAction(DestroyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Array Element Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Array Element Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetArrayElementAction(GetArrayElementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Array Length Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Array Length Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetArrayLengthAction(GetArrayLengthAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Array Element Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Array Element Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertArrayElementAction(InsertArrayElementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Array Element Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Array Element Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveArrayElementAction(RemoveArrayElementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Array Element Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Array Element Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetArrayElementAction(SetArrayElementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnAction(ReturnAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify State Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify State Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyStateAction(ModifyStateAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionAction(ExpressionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentAction(AssignmentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseElement(BaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralElement(BehavioralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActionsSwitch
