/**
 */
package dercs.structure;

import dercs.behavior.Behavior;
import dercs.datatypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent the methods (or operations) of a class. A method is a behavior 
 * which can be performed by a class. Methods can be overriden within child
 * classes, however only the behavior changes the and the signature stays unchanged. This
 * property is called polymorphism. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.Method#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link dercs.structure.Method#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link dercs.structure.Method#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link dercs.structure.Method#isActive <em>Active</em>}</li>
 *   <li>{@link dercs.structure.Method#isOverwritingMethod <em>Overwriting Method</em>}</li>
 *   <li>{@link dercs.structure.Method#getTriggeredBehavior <em>Triggered Behavior</em>}</li>
 *   <li>{@link dercs.structure.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link dercs.structure.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dercs.structure.Method#getEvery <em>Every</em>}</li>
 *   <li>{@link dercs.structure.Method#getAssociatedAttribute <em>Associated Attribute</em>}</li>
 * </ul>
 *
 * @see dercs.structure.StructurePackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dercs.structure.Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class that has the attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(dercs.structure.Class)
	 * @see dercs.structure.StructurePackage#getMethod_OwnerClass()
	 * @see dercs.structure.Class#getMethods
	 * @model opposite="methods" transient="false"
	 * @generated
	 */
	dercs.structure.Class getOwnerClass();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(dercs.structure.Class value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link dercs.structure.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of the method
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see dercs.structure.Visibility
	 * @see #setVisibility(Visibility)
	 * @see dercs.structure.StructurePackage#getMethod_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see dercs.structure.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the method is abstract or not
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see dercs.structure.StructurePackage#getMethod_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if a method is the active method when the objects are running in parallel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see dercs.structure.StructurePackage#getMethod_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Overwriting Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the method overwrites an inherited method
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overwriting Method</em>' attribute.
	 * @see #setOverwritingMethod(boolean)
	 * @see dercs.structure.StructurePackage#getMethod_OverwritingMethod()
	 * @model
	 * @generated
	 */
	boolean isOverwritingMethod();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#isOverwritingMethod <em>Overwriting Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overwriting Method</em>' attribute.
	 * @see #isOverwritingMethod()
	 * @generated
	 */
	void setOverwritingMethod(boolean value);

	/**
	 * Returns the value of the '<em><b>Triggered Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior that this method should execute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triggered Behavior</em>' containment reference.
	 * @see #setTriggeredBehavior(Behavior)
	 * @see dercs.structure.StructurePackage#getMethod_TriggeredBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getTriggeredBehavior();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#getTriggeredBehavior <em>Triggered Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered Behavior</em>' containment reference.
	 * @see #getTriggeredBehavior()
	 * @generated
	 */
	void setTriggeredBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The return type of the method
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(DataType)
	 * @see dercs.structure.StructurePackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.structure.Parameter}.
	 * It is bidirectional and its opposite is '{@link dercs.structure.Parameter#getOwnerMethod <em>Owner Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All parameters of the method
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see dercs.structure.StructurePackage#getMethod_Parameters()
	 * @see dercs.structure.Parameter#getOwnerMethod
	 * @model opposite="ownerMethod" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Every</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the method is active, indicates the period between its invocations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Every</em>' attribute.
	 * @see #setEvery(int)
	 * @see dercs.structure.StructurePackage#getMethod_Every()
	 * @model default="0"
	 * @generated
	 */
	int getEvery();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#getEvery <em>Every</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Every</em>' attribute.
	 * @see #getEvery()
	 * @generated
	 */
	void setEvery(int value);

	/**
	 * Returns the value of the '<em><b>Associated Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The related attribute, if the method is i.e. a getter/setter for an attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Attribute</em>' reference.
	 * @see #setAssociatedAttribute(Attribute)
	 * @see dercs.structure.StructurePackage#getMethod_AssociatedAttribute()
	 * @model
	 * @generated
	 */
	Attribute getAssociatedAttribute();

	/**
	 * Sets the value of the '{@link dercs.structure.Method#getAssociatedAttribute <em>Associated Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Attribute</em>' reference.
	 * @see #getAssociatedAttribute()
	 * @generated
	 */
	void setAssociatedAttribute(Attribute value);

	// MANUALLY ADDED

	/**
	 * Tests if two methods have compatible signatures, meaning they have the same name and the same parameter types.
	 * 
	 * @param other the other method to check against
	 * @return TRUE if the method's signatures are comaptible, FALSE otherwise
	 * @generated NOT
	 */
	default boolean signatureMatches(Method other) {
		if (!this.getName().equals(other.getName())) {
			return false;
		}

		if (this.getParameters().size() != other.getParameters().size()) {
			return false;
		}

		for (int i = 0; i < this.getParameters().size(); i++) {
			DataType parameterType1 = this.getParameters().get(i).getDataType();
			DataType parameterType2 = other.getParameters().get(i).getDataType();

			if (!parameterType1.isSameDatatype(parameterType2)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Check is the method passed as parameter is overwriting the current method.
	 * @param other Method to be checked.
	 * @return TRUE if other is overwriting this method, FALSE otherwise.
	 * @generated NOT
	 */
	default boolean isOverwrittenBy(Method other) {
		return other.isOverwritingMethod() && this.getOwnerClass().isSuperClassOf(other.getOwnerClass())
				&& (this.signatureMatches(other));
	}

	/**
	 * Add a parameter to the method.
	 * @param name Name of the Parameter.
	 * @param dataType Primary data type of the Parameter
	 * @param paramKind Kind of parameter
	 * @generated NOT
	 */
	default Parameter addParameter(String name, DataType dataType, ParameterKind paramKind) {
		Parameter result = StructureFactory.eINSTANCE.createParameter();
		result.setName(name);
		result.setDataType(dataType);
		result.setParameterKind(paramKind);

		this.getParameters().add(result);
		// checks if the parameter is an object, if yes, its class should be
		// included (if necessary) into the references list
		if (this.getOwnerClass() != null)
			this.getOwnerClass().checkDataTypeInReferenceList(dataType);
		return result;
	}

	/**
	 * Indicate is the method is associated with an attribute, i.e. the method
	 * is a get/set method for the attribute.
	 * @return TRUE is the method is associated with an attribute, FALSE otherwise.
	 * @generated NOT
	 */
	default boolean isGetSetMethod() {
		return this.getAssociatedAttribute() != null;
	}

	//=== COMPATIBILITY ===

	/**
	 * @generated NOT
	 */
	default int getParametersCount() {
		return getParameters().size();
	}

} // Method
