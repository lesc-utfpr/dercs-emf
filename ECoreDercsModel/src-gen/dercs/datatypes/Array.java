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
package dercs.datatypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an array of the specified data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.datatypes.Array#getSize <em>Size</em>}</li>
 *   <li>{@link dercs.datatypes.Array#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link dercs.datatypes.Array#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link dercs.datatypes.Array#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see dercs.datatypes.DatatypesPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends DataType {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the array
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see dercs.datatypes.DatatypesPackage#getArray_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link dercs.datatypes.Array#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Value</em>' attribute.
	 * @see #setLowerValue(int)
	 * @see dercs.datatypes.DatatypesPackage#getArray_LowerValue()
	 * @model
	 * @generated
	 */
	int getLowerValue();

	/**
	 * Sets the value of the '{@link dercs.datatypes.Array#getLowerValue <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' attribute.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(int value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Value</em>' attribute.
	 * @see #setUpperValue(int)
	 * @see dercs.datatypes.DatatypesPackage#getArray_UpperValue()
	 * @model
	 * @generated
	 */
	int getUpperValue();

	/**
	 * Sets the value of the '{@link dercs.datatypes.Array#getUpperValue <em>Upper Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' attribute.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(int value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of the array
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see dercs.datatypes.DatatypesPackage#getArray_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link dercs.datatypes.Array#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // Array
