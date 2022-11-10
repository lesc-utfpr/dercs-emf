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

import dercs.structure.BaseElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents elements that exists at runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.RuntimeElement#getAssociatedElement <em>Associated Element</em>}</li>
 * </ul>
 *
 * @see dercs.structure.runtime.RuntimePackage#getRuntimeElement()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeElement extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Associated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element that is associated with this runtime element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Element</em>' reference.
	 * @see #setAssociatedElement(RuntimeElement)
	 * @see dercs.structure.runtime.RuntimePackage#getRuntimeElement_AssociatedElement()
	 * @model
	 * @generated
	 */
	RuntimeElement getAssociatedElement();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.RuntimeElement#getAssociatedElement <em>Associated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Element</em>' reference.
	 * @see #getAssociatedElement()
	 * @generated
	 */
	void setAssociatedElement(RuntimeElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the runtime element is an object or an attribute
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isObject();

} // RuntimeElement
