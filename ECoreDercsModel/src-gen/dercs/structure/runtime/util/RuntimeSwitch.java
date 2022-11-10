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
package dercs.structure.runtime.util;

import dercs.structure.BaseElement;
import dercs.structure.NamedElement;

import dercs.structure.runtime.ActiveObject;
import dercs.structure.runtime.AttributeRuntimeInformation;
import dercs.structure.runtime.LocalVariableRuntimeInformation;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.ParameterRuntimeInformation;
import dercs.structure.runtime.PassiveObject;
import dercs.structure.runtime.RuntimeElement;
import dercs.structure.runtime.RuntimeInformation;
import dercs.structure.runtime.RuntimePackage;
import dercs.structure.runtime.State;

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
 * @see dercs.structure.runtime.RuntimePackage
 * @generated
 */
public class RuntimeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
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
		case RuntimePackage.RUNTIME_ELEMENT: {
			RuntimeElement runtimeElement = (RuntimeElement) theEObject;
			T result = caseRuntimeElement(runtimeElement);
			if (result == null)
				result = caseBaseElement(runtimeElement);
			if (result == null)
				result = caseNamedElement(runtimeElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = caseBaseElement(node);
			if (result == null)
				result = caseNamedElement(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.OBJECT: {
			dercs.structure.runtime.Object object = (dercs.structure.runtime.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = caseRuntimeElement(object);
			if (result == null)
				result = caseBaseElement(object);
			if (result == null)
				result = caseNamedElement(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.RUNTIME_INFORMATION: {
			RuntimeInformation runtimeInformation = (RuntimeInformation) theEObject;
			T result = caseRuntimeInformation(runtimeInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.PARAMETER_RUNTIME_INFORMATION: {
			ParameterRuntimeInformation parameterRuntimeInformation = (ParameterRuntimeInformation) theEObject;
			T result = caseParameterRuntimeInformation(parameterRuntimeInformation);
			if (result == null)
				result = caseRuntimeInformation(parameterRuntimeInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.PASSIVE_OBJECT: {
			PassiveObject passiveObject = (PassiveObject) theEObject;
			T result = casePassiveObject(passiveObject);
			if (result == null)
				result = caseObject(passiveObject);
			if (result == null)
				result = caseRuntimeElement(passiveObject);
			if (result == null)
				result = caseBaseElement(passiveObject);
			if (result == null)
				result = caseNamedElement(passiveObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.ACTIVE_OBJECT: {
			ActiveObject activeObject = (ActiveObject) theEObject;
			T result = caseActiveObject(activeObject);
			if (result == null)
				result = caseObject(activeObject);
			if (result == null)
				result = caseRuntimeElement(activeObject);
			if (result == null)
				result = caseBaseElement(activeObject);
			if (result == null)
				result = caseNamedElement(activeObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION: {
			AttributeRuntimeInformation attributeRuntimeInformation = (AttributeRuntimeInformation) theEObject;
			T result = caseAttributeRuntimeInformation(attributeRuntimeInformation);
			if (result == null)
				result = caseRuntimeInformation(attributeRuntimeInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RuntimePackage.LOCAL_VARIABLE_RUNTIME_INFORMATION: {
			LocalVariableRuntimeInformation localVariableRuntimeInformation = (LocalVariableRuntimeInformation) theEObject;
			T result = caseLocalVariableRuntimeInformation(localVariableRuntimeInformation);
			if (result == null)
				result = caseRuntimeInformation(localVariableRuntimeInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeElement(RuntimeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(dercs.structure.runtime.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeInformation(RuntimeInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Runtime Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Runtime Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterRuntimeInformation(ParameterRuntimeInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveObject(PassiveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveObject(ActiveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Runtime Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Runtime Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRuntimeInformation(AttributeRuntimeInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable Runtime Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable Runtime Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariableRuntimeInformation(LocalVariableRuntimeInformation object) {
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

} //RuntimeSwitch
