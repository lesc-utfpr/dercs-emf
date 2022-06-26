/**
 */
package dercs.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the base class for all element which are affected by aspects. 
 * Joinpoint objects contain lists of base elements which were selected through
 * JPDDs within the UML model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.BaseElement#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see dercs.structure.StructurePackage#getBaseElement()
 * @model
 * @generated
 */
public interface BaseElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if this element is an instance or class attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see dercs.structure.StructurePackage#getBaseElement_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link dercs.structure.BaseElement#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // BaseElement
