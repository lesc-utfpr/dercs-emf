/**
 */
package dercs.AO;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element Selection Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Represents the element kind that is selected by the join point.
 * <!-- end-model-doc -->
 * @see dercs.AO.AOPackage#getElementSelectionKind()
 * @model
 * @generated
 */
public enum ElementSelectionKind implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(1, "CLASS", "CLASS"),

	/**
	 * The '<em><b>ATTRIBUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE(2, "ATTRIBUTE", "ATTRIBUTE"),

	/**
	 * The '<em><b>METHOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD(3, "METHOD", "METHOD"),

	/**
	 * The '<em><b>OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT(4, "OBJECT", "OBJECT"),

	/**
	 * The '<em><b>NODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_VALUE
	 * @generated
	 * @ordered
	 */
	NODE(5, "NODE", "NODE"),

	/**
	 * The '<em><b>ACTION MESSAGE SENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_MESSAGE_SENDING_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_MESSAGE_SENDING(100, "ACTION_MESSAGE_SENDING", "ACTION_MESSAGE_SENDING"),

	/**
	 * The '<em><b>ACTION RETURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_RETURN_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_RETURN(101, "ACTION_RETURN", "ACTION_RETURN"),

	/**
	 * The '<em><b>ACTION OBJECT CREATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_OBJECT_CREATION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_OBJECT_CREATION(102, "ACTION_OBJECT_CREATION", "ACTION_OBJECT_CREATION"),

	/**
	 * The '<em><b>ACTION OBJECT DESTRUCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_OBJECT_DESTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_OBJECT_DESTRUCTION(103, "ACTION_OBJECT_DESTRUCTION", "ACTION_OBJECT_DESTRUCTION"),

	/**
	 * The '<em><b>BEHAVIOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIOR(104, "BEHAVIOR", "BEHAVIOR");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 1;

	/**
	 * The '<em><b>ATTRIBUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_VALUE = 2;

	/**
	 * The '<em><b>METHOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_VALUE = 3;

	/**
	 * The '<em><b>OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_VALUE = 4;

	/**
	 * The '<em><b>NODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NODE_VALUE = 5;

	/**
	 * The '<em><b>ACTION MESSAGE SENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_MESSAGE_SENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_MESSAGE_SENDING_VALUE = 100;

	/**
	 * The '<em><b>ACTION RETURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_RETURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_RETURN_VALUE = 101;

	/**
	 * The '<em><b>ACTION OBJECT CREATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_OBJECT_CREATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_OBJECT_CREATION_VALUE = 102;

	/**
	 * The '<em><b>ACTION OBJECT DESTRUCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_OBJECT_DESTRUCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_OBJECT_DESTRUCTION_VALUE = 103;

	/**
	 * The '<em><b>BEHAVIOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_VALUE = 104;

	/**
	 * An array of all the '<em><b>Element Selection Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ElementSelectionKind[] VALUES_ARRAY = new ElementSelectionKind[] { UNKNOWN, CLASS, ATTRIBUTE,
			METHOD, OBJECT, NODE, ACTION_MESSAGE_SENDING, ACTION_RETURN, ACTION_OBJECT_CREATION,
			ACTION_OBJECT_DESTRUCTION, BEHAVIOR, };

	/**
	 * A public read-only list of all the '<em><b>Element Selection Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ElementSelectionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Selection Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementSelectionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementSelectionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Selection Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementSelectionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementSelectionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Selection Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementSelectionKind get(int value) {
		switch (value) {
		case UNKNOWN_VALUE:
			return UNKNOWN;
		case CLASS_VALUE:
			return CLASS;
		case ATTRIBUTE_VALUE:
			return ATTRIBUTE;
		case METHOD_VALUE:
			return METHOD;
		case OBJECT_VALUE:
			return OBJECT;
		case NODE_VALUE:
			return NODE;
		case ACTION_MESSAGE_SENDING_VALUE:
			return ACTION_MESSAGE_SENDING;
		case ACTION_RETURN_VALUE:
			return ACTION_RETURN;
		case ACTION_OBJECT_CREATION_VALUE:
			return ACTION_OBJECT_CREATION;
		case ACTION_OBJECT_DESTRUCTION_VALUE:
			return ACTION_OBJECT_DESTRUCTION;
		case BEHAVIOR_VALUE:
			return BEHAVIOR;
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
	private ElementSelectionKind(int value, String name, String literal) {
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

} //ElementSelectionKind
