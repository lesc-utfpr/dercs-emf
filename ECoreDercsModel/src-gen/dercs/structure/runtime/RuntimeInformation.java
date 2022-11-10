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

import java.lang.Object;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents an association between a DERCS' element and its 
 * corresponding value at a certain time.
 * In other words, this class (and its children) represents the value of a  
 * DERCS' element at a given instant during system runtime.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.RuntimeInformation#getValue <em>Value</em>}</li>
 *   <li>{@link dercs.structure.runtime.RuntimeInformation#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see dercs.structure.runtime.RuntimePackage#getRuntimeInformation()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dercs.structure.runtime.RuntimePackage#getRuntimeInformation_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.RuntimeInformation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The array values of an element (if the element is an array)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(Object)
	 * @see dercs.structure.runtime.RuntimePackage#getRuntimeInformation_Array()
	 * @model
	 * @generated
	 */
	Object getArray();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.RuntimeInformation#getArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(Object value);

} // RuntimeInformation
