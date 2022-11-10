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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents primary datatypes for attributes, method parameters and returns as well as variables.
 * <!-- end-model-doc -->
 *
 *
 * @see dercs.datatypes.DatatypesPackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int compareTo(DataType other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPrimitive();

	// MANUALLY ADDED

	/**
	 * Tests if two datatypes are of the same class.
	 * 
	 * @param other the other datatype to test against
	 * @return TRUE if the datatypes are of the same class, FASLE otherwise
	 * @generated NOT
	 */
	default boolean isSameDatatype(DataType other) {
		return this.getClass() == other.getClass();
	}

	// MANUALLY ADDED

	/**
	 * @generated NOT
	 */
	public static java.lang.String DEFAULT_VALUE = "__DEFAULT_VALUE__";

} // DataType
