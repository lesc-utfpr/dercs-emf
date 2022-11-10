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

import dercs.behavior.MessageSort;

import dercs.structure.Method;

import dercs.structure.runtime.RuntimeElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the action of sending a message to another object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.SendMessageAction#getRelatedMethod <em>Related Method</em>}</li>
 *   <li>{@link dercs.behavior.actions.SendMessageAction#getFromObject <em>From Object</em>}</li>
 *   <li>{@link dercs.behavior.actions.SendMessageAction#getToObject <em>To Object</em>}</li>
 *   <li>{@link dercs.behavior.actions.SendMessageAction#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link dercs.behavior.actions.SendMessageAction#getMessageSort <em>Message Sort</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getSendMessageAction()
 * @model
 * @generated
 */
public interface SendMessageAction extends ActionWithOutput {
	/**
	 * Returns the value of the '<em><b>Related Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method that caused this message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Method</em>' reference.
	 * @see #setRelatedMethod(Method)
	 * @see dercs.behavior.actions.ActionsPackage#getSendMessageAction_RelatedMethod()
	 * @model
	 * @generated
	 */
	Method getRelatedMethod();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.SendMessageAction#getRelatedMethod <em>Related Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Method</em>' reference.
	 * @see #getRelatedMethod()
	 * @generated
	 */
	void setRelatedMethod(Method value);

	/**
	 * Returns the value of the '<em><b>From Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender of the message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Object</em>' reference.
	 * @see #setFromObject(RuntimeElement)
	 * @see dercs.behavior.actions.ActionsPackage#getSendMessageAction_FromObject()
	 * @model
	 * @generated
	 */
	RuntimeElement getFromObject();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.SendMessageAction#getFromObject <em>From Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Object</em>' reference.
	 * @see #getFromObject()
	 * @generated
	 */
	void setFromObject(RuntimeElement value);

	/**
	 * Returns the value of the '<em><b>To Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiver of the message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Object</em>' reference.
	 * @see #setToObject(RuntimeElement)
	 * @see dercs.behavior.actions.ActionsPackage#getSendMessageAction_ToObject()
	 * @model
	 * @generated
	 */
	RuntimeElement getToObject();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.SendMessageAction#getToObject <em>To Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Object</em>' reference.
	 * @see #getToObject()
	 * @generated
	 */
	void setToObject(RuntimeElement value);

	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of values for the message's parameters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Values</em>' attribute list.
	 * @see dercs.behavior.actions.ActionsPackage#getSendMessageAction_ParameterValues()
	 * @model
	 * @generated
	 */
	EList<Object> getParameterValues();

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link dercs.behavior.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see dercs.behavior.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see dercs.behavior.actions.ActionsPackage#getSendMessageAction_MessageSort()
	 * @model
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.SendMessageAction#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see dercs.behavior.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	// === COMPATIBILITY ===

	/**
	 * @generated NOT
	 */
	default EList<Object> getParametersValues() {
		return getParameterValues();
	}

	/**
	 * @generated NOT
	 */
	default int getParametersValuesCount() {
		return getParameterValues().size();
	}

	/**
	 * @generated NOT
	 */
	default boolean isParameterValue(int index) {
		return getParameterValues().get(index) instanceof String;
	}

	/**
	 * @generated NOT
	 */
	default boolean isParameterVariable(int index) {
		return getParameterValues().get(index) instanceof dercs.behavior.LocalVariable;
	}

	/**
	 * @generated NOT
	 */
	default boolean isParameterAttribute(int index) {
		return getParameterValues().get(index) instanceof dercs.structure.Attribute;
	}

	/**
	 * @generated NOT
	 */
	default boolean isParameterObject(int index) {
		return getParameterValues().get(index) instanceof dercs.structure.runtime.Object;
	}

} // SendMessageAction
