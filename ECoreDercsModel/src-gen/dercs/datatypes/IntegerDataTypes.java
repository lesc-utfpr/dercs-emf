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
 * A representation of the model object '<em><b>Integer Data Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents integer data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.datatypes.IntegerDataTypes#isSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see dercs.datatypes.DatatypesPackage#getIntegerDataTypes()
 * @model abstract="true"
 * @generated
 */
public interface IntegerDataTypes extends DataType {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the number is a signal bit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' attribute.
	 * @see #setSignal(boolean)
	 * @see dercs.datatypes.DatatypesPackage#getIntegerDataTypes_Signal()
	 * @model
	 * @generated
	 */
	boolean isSignal();

	/**
	 * Sets the value of the '{@link dercs.datatypes.IntegerDataTypes#isSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see #isSignal()
	 * @generated
	 */
	void setSignal(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSigned();

} // IntegerDataTypes
