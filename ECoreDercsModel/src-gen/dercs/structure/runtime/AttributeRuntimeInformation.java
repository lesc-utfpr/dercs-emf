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

import dercs.structure.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Runtime Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the runtime information of an attribute of a given object.
 * More specifically, it stores the current value of an object's attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.AttributeRuntimeInformation#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link dercs.structure.runtime.AttributeRuntimeInformation#getRelatedAttribute <em>Related Attribute</em>}</li>
 * </ul>
 *
 * @see dercs.structure.runtime.RuntimePackage#getAttributeRuntimeInformation()
 * @model
 * @generated
 */
public interface AttributeRuntimeInformation extends RuntimeInformation {
	/**
	 * Returns the value of the '<em><b>Related Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object that owns the attribute's value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Object</em>' reference.
	 * @see #setRelatedObject(dercs.structure.runtime.Object)
	 * @see dercs.structure.runtime.RuntimePackage#getAttributeRuntimeInformation_RelatedObject()
	 * @model
	 * @generated
	 */
	dercs.structure.runtime.Object getRelatedObject();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.AttributeRuntimeInformation#getRelatedObject <em>Related Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Object</em>' reference.
	 * @see #getRelatedObject()
	 * @generated
	 */
	void setRelatedObject(dercs.structure.runtime.Object value);

	/**
	 * Returns the value of the '<em><b>Related Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associated attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Attribute</em>' reference.
	 * @see #setRelatedAttribute(Attribute)
	 * @see dercs.structure.runtime.RuntimePackage#getAttributeRuntimeInformation_RelatedAttribute()
	 * @model
	 * @generated
	 */
	Attribute getRelatedAttribute();

	/**
	 * Sets the value of the '{@link dercs.structure.runtime.AttributeRuntimeInformation#getRelatedAttribute <em>Related Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Attribute</em>' reference.
	 * @see #getRelatedAttribute()
	 * @generated
	 */
	void setRelatedAttribute(Attribute value);

} // AttributeRuntimeInformation
