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
package dercs.AO;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relative Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Represents the position (relative to the join points) where an aspect applies the adaptation associated through it's pointcuts.
 * <!-- end-model-doc -->
 * @see dercs.AO.AOPackage#getRelativePosition()
 * @model
 * @generated
 */
public enum RelativePosition implements Enumerator {
	/**
	 * The '<em><b>BEFORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavioral adaptation is applied before the join point
	 * <!-- end-model-doc -->
	 * @see #BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE(0, "BEFORE", "BEFORE"),

	/**
	 * The '<em><b>AFTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavioral adaptation is applied after the join point
	 * <!-- end-model-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(1, "AFTER", "AFTER"),

	/**
	 * The '<em><b>AROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavioral adaptation wraps the join point
	 * <!-- end-model-doc -->
	 * @see #AROUND_VALUE
	 * @generated
	 * @ordered
	 */
	AROUND(2, "AROUND", "AROUND"),

	/**
	 * The '<em><b>REPLACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavioral adaptation replaces the join point
	 * <!-- end-model-doc -->
	 * @see #REPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE(3, "REPLACE", "REPLACE"),

	/**
	 * The '<em><b>ADD NEW FEATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the structural adaptation adds a new feature (e.g. attributes or methods) to the affected element
	 * <!-- end-model-doc -->
	 * @see #ADD_NEW_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_NEW_FEATURE(4, "ADD_NEW_FEATURE", "ADD_NEW_FEATURE"),

	/**
	 * The '<em><b>MODIFY STRUCTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the structural adaptation modifies the structure of the affected element
	 * <!-- end-model-doc -->
	 * @see #MODIFY_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFY_STRUCTURE(5, "MODIFY_STRUCTURE", "MODIFY_STRUCTURE");

	/**
	 * The '<em><b>BEFORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavioral adaptation is applied before the join point
	 * <!-- end-model-doc -->
	 * @see #BEFORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALUE = 0;

	/**
	 * The '<em><b>AFTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavioral adaptation is applied after the join point
	 * <!-- end-model-doc -->
	 * @see #AFTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 1;

	/**
	 * The '<em><b>AROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavioral adaptation wraps the join point
	 * <!-- end-model-doc -->
	 * @see #AROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AROUND_VALUE = 2;

	/**
	 * The '<em><b>REPLACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavioral adaptation replaces the join point
	 * <!-- end-model-doc -->
	 * @see #REPLACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_VALUE = 3;

	/**
	 * The '<em><b>ADD NEW FEATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the structural adaptation adds a new feature (e.g. attributes or methods) to the affected element
	 * <!-- end-model-doc -->
	 * @see #ADD_NEW_FEATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_NEW_FEATURE_VALUE = 4;

	/**
	 * The '<em><b>MODIFY STRUCTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the structural adaptation modifies the structure of the affected element
	 * <!-- end-model-doc -->
	 * @see #MODIFY_STRUCTURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFY_STRUCTURE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Relative Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelativePosition[] VALUES_ARRAY = new RelativePosition[] { BEFORE, AFTER, AROUND, REPLACE,
			ADD_NEW_FEATURE, MODIFY_STRUCTURE, };

	/**
	 * A public read-only list of all the '<em><b>Relative Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelativePosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relative Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelativePosition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelativePosition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relative Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelativePosition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelativePosition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relative Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelativePosition get(int value) {
		switch (value) {
		case BEFORE_VALUE:
			return BEFORE;
		case AFTER_VALUE:
			return AFTER;
		case AROUND_VALUE:
			return AROUND;
		case REPLACE_VALUE:
			return REPLACE;
		case ADD_NEW_FEATURE_VALUE:
			return ADD_NEW_FEATURE;
		case MODIFY_STRUCTURE_VALUE:
			return MODIFY_STRUCTURE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelativePosition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //RelativePosition
