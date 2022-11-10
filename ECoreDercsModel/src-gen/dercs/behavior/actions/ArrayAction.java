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

import dercs.behavior.LocalVariable;

import dercs.structure.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents actions that handle arrays, such as insertion and removal of elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.ArrayAction#getArrayVariable <em>Array Variable</em>}</li>
 *   <li>{@link dercs.behavior.actions.ArrayAction#getArrayElement <em>Array Element</em>}</li>
 *   <li>{@link dercs.behavior.actions.ArrayAction#getArrayAttribute <em>Array Attribute</em>}</li>
 *   <li>{@link dercs.behavior.actions.ArrayAction#getArrayObject <em>Array Object</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getArrayAction()
 * @model abstract="true"
 * @generated
 */
public interface ArrayAction extends ActionWithOutput {
	/**
	 * Returns the value of the '<em><b>Array Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The array variable to which the action is related (if the array is a local variable)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Variable</em>' reference.
	 * @see #setArrayVariable(LocalVariable)
	 * @see dercs.behavior.actions.ActionsPackage#getArrayAction_ArrayVariable()
	 * @model
	 * @generated
	 */
	LocalVariable getArrayVariable();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.ArrayAction#getArrayVariable <em>Array Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Variable</em>' reference.
	 * @see #getArrayVariable()
	 * @generated
	 */
	void setArrayVariable(LocalVariable value);

	/**
	 * Returns the value of the '<em><b>Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The index of the array element to which the action is related
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Element</em>' attribute.
	 * @see #setArrayElement(String)
	 * @see dercs.behavior.actions.ActionsPackage#getArrayAction_ArrayElement()
	 * @model
	 * @generated
	 */
	String getArrayElement();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.ArrayAction#getArrayElement <em>Array Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Element</em>' attribute.
	 * @see #getArrayElement()
	 * @generated
	 */
	void setArrayElement(String value);

	/**
	 * Returns the value of the '<em><b>Array Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute containing the array to which this action is related (If the array is an attribute)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Attribute</em>' reference.
	 * @see #setArrayAttribute(Attribute)
	 * @see dercs.behavior.actions.ActionsPackage#getArrayAction_ArrayAttribute()
	 * @model
	 * @generated
	 */
	Attribute getArrayAttribute();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.ArrayAction#getArrayAttribute <em>Array Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Attribute</em>' reference.
	 * @see #getArrayAttribute()
	 * @generated
	 */
	void setArrayAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Array Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object whose attribute is an array (If the array is an attribute)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Object</em>' reference.
	 * @see #setArrayObject(dercs.structure.runtime.Object)
	 * @see dercs.behavior.actions.ActionsPackage#getArrayAction_ArrayObject()
	 * @model
	 * @generated
	 */
	dercs.structure.runtime.Object getArrayObject();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.ArrayAction#getArrayObject <em>Array Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Object</em>' reference.
	 * @see #getArrayObject()
	 * @generated
	 */
	void setArrayObject(dercs.structure.runtime.Object value);

} // ArrayAction
