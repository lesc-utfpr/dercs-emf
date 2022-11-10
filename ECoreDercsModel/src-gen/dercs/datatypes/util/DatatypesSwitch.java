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
package dercs.datatypes.util;

import dercs.datatypes.Array;
import dercs.datatypes.Char;
import dercs.datatypes.CharacterDataTypes;
import dercs.datatypes.ClassDataType;
import dercs.datatypes.DataType;
import dercs.datatypes.DatatypesPackage;
import dercs.datatypes.DateTime;
import dercs.datatypes.Enumeration;
import dercs.datatypes.FloatingPointDatatypes;
import dercs.datatypes.IntegerDataTypes;

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
 * @see dercs.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
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
		case DatatypesPackage.DATA_TYPE: {
			DataType dataType = (DataType) theEObject;
			T result = caseDataType(dataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.INTEGER_DATA_TYPES: {
			IntegerDataTypes integerDataTypes = (IntegerDataTypes) theEObject;
			T result = caseIntegerDataTypes(integerDataTypes);
			if (result == null)
				result = caseDataType(integerDataTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.FLOATING_POINT_DATATYPES: {
			FloatingPointDatatypes floatingPointDatatypes = (FloatingPointDatatypes) theEObject;
			T result = caseFloatingPointDatatypes(floatingPointDatatypes);
			if (result == null)
				result = caseDataType(floatingPointDatatypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.BOOLEAN: {
			dercs.datatypes.Boolean boolean_ = (dercs.datatypes.Boolean) theEObject;
			T result = caseBoolean(boolean_);
			if (result == null)
				result = caseDataType(boolean_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.ENUMERATION: {
			Enumeration enumeration = (Enumeration) theEObject;
			T result = caseEnumeration(enumeration);
			if (result == null)
				result = caseDataType(enumeration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.VOID: {
			dercs.datatypes.Void void_ = (dercs.datatypes.Void) theEObject;
			T result = caseVoid(void_);
			if (result == null)
				result = caseDataType(void_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.CLASS_DATA_TYPE: {
			ClassDataType classDataType = (ClassDataType) theEObject;
			T result = caseClassDataType(classDataType);
			if (result == null)
				result = caseDataType(classDataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.ARRAY: {
			Array array = (Array) theEObject;
			T result = caseArray(array);
			if (result == null)
				result = caseDataType(array);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.BYTE: {
			dercs.datatypes.Byte byte_ = (dercs.datatypes.Byte) theEObject;
			T result = caseByte(byte_);
			if (result == null)
				result = caseIntegerDataTypes(byte_);
			if (result == null)
				result = caseDataType(byte_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.SHORT: {
			dercs.datatypes.Short short_ = (dercs.datatypes.Short) theEObject;
			T result = caseShort(short_);
			if (result == null)
				result = caseIntegerDataTypes(short_);
			if (result == null)
				result = caseDataType(short_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.LONG: {
			dercs.datatypes.Long long_ = (dercs.datatypes.Long) theEObject;
			T result = caseLong(long_);
			if (result == null)
				result = caseIntegerDataTypes(long_);
			if (result == null)
				result = caseDataType(long_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.INTEGER: {
			dercs.datatypes.Integer integer = (dercs.datatypes.Integer) theEObject;
			T result = caseInteger(integer);
			if (result == null)
				result = caseIntegerDataTypes(integer);
			if (result == null)
				result = caseDataType(integer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.CHARACTER_DATA_TYPES: {
			CharacterDataTypes characterDataTypes = (CharacterDataTypes) theEObject;
			T result = caseCharacterDataTypes(characterDataTypes);
			if (result == null)
				result = caseDataType(characterDataTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.CHAR: {
			Char char_ = (Char) theEObject;
			T result = caseChar(char_);
			if (result == null)
				result = caseCharacterDataTypes(char_);
			if (result == null)
				result = caseDataType(char_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.STRING: {
			dercs.datatypes.String string = (dercs.datatypes.String) theEObject;
			T result = caseString(string);
			if (result == null)
				result = caseCharacterDataTypes(string);
			if (result == null)
				result = caseDataType(string);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.FLOAT: {
			dercs.datatypes.Float float_ = (dercs.datatypes.Float) theEObject;
			T result = caseFloat(float_);
			if (result == null)
				result = caseFloatingPointDatatypes(float_);
			if (result == null)
				result = caseDataType(float_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.DOUBLE: {
			dercs.datatypes.Double double_ = (dercs.datatypes.Double) theEObject;
			T result = caseDouble(double_);
			if (result == null)
				result = caseFloatingPointDatatypes(double_);
			if (result == null)
				result = caseDataType(double_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DatatypesPackage.DATE_TIME: {
			DateTime dateTime = (DateTime) theEObject;
			T result = caseDateTime(dateTime);
			if (result == null)
				result = caseDataType(dateTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Data Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Data Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerDataTypes(IntegerDataTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Point Datatypes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Point Datatypes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingPointDatatypes(FloatingPointDatatypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(dercs.datatypes.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(dercs.datatypes.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDataType(ClassDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByte(dercs.datatypes.Byte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShort(dercs.datatypes.Short object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong(dercs.datatypes.Long object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(dercs.datatypes.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Data Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Data Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterDataTypes(CharacterDataTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChar(Char object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(dercs.datatypes.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(dercs.datatypes.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(dercs.datatypes.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
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

} //DatatypesSwitch
