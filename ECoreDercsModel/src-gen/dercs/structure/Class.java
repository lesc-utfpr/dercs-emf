/**
 */
package dercs.structure;

import dercs.Model;
import dercs.behavior.Behavior;
import dercs.behavior.events.Event;
import dercs.behavior.events.EventsFactory;
import dercs.behavior.events.TriggerKind;
import dercs.datatypes.ClassDataType;
import dercs.datatypes.DataType;
import dercs.datatypes.DatatypesFactory;
import dercs.structure.runtime.RuntimeFactory;
import dercs.structure.runtime.State;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the main element of static struture of DERTS. Follows the same
 * semantics of Object-Oriented (OO) paradigm, i.e. a class defines the abstract 
 * characteristics of objects, including the their characteristics (e.g. 
 * attributes, fields or properties) and behaviors (what they do or methods). 
 * Classes can inherit characteristics and behavior from other classes, as well 
 * as specialize (overwrite) behavior of their ancessor classes. 
 * <br>Classes provide modularity and structure, and they should be relatively 
 * self-contained. The encapsulation of a class should not be violated, i.e. 
 * their attributes should be accessed (readed/written) only by methods of the 
 * same class. Objects should use public messages (i.e. methods) to interate 
 * with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link dercs.structure.Class#isActiveClass <em>Active Class</em>}</li>
 *   <li>{@link dercs.structure.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link dercs.structure.Class#isPassiveClass <em>Passive Class</em>}</li>
 *   <li>{@link dercs.structure.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dercs.structure.Class#getReferencedClasses <em>Referenced Classes</em>}</li>
 *   <li>{@link dercs.structure.Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link dercs.structure.Class#getStates <em>States</em>}</li>
 *   <li>{@link dercs.structure.Class#getEvents <em>Events</em>}</li>
 *   <li>{@link dercs.structure.Class#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see dercs.structure.StructurePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent class of this class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(Class)
	 * @see dercs.structure.StructurePackage#getClass_SuperClass()
	 * @model
	 * @generated
	 */
	Class getSuperClass();

	/**
	 * Sets the value of the '{@link dercs.structure.Class#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(Class value);

	/**
	 * Returns the value of the '<em><b>Active Class</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this class is active
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Class</em>' attribute.
	 * @see #setActiveClass(boolean)
	 * @see dercs.structure.StructurePackage#getClass_ActiveClass()
	 * @model default="false"
	 */
	boolean isActiveClass();

	/**
	 * Sets the value of the '{@link dercs.structure.Class#isActiveClass <em>Active Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Class</em>' attribute.
	 * @see #isActiveClass()
	 * @generated
	 */
	void setActiveClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this class is abstract
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see dercs.structure.StructurePackage#getClass_Abstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link dercs.structure.Class#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Passive Class</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this class is passive
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Class</em>' attribute.
	 * @see #setPassiveClass(boolean)
	 * @see dercs.structure.StructurePackage#getClass_PassiveClass()
	 * @model default="false"
	 * @generated
	 */
	boolean isPassiveClass();

	/**
	 * Sets the value of the '{@link dercs.structure.Class#isPassiveClass <em>Passive Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive Class</em>' attribute.
	 * @see #isPassiveClass()
	 * @generated
	 */
	void setPassiveClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.structure.Attribute}.
	 * It is bidirectional and its opposite is '{@link dercs.structure.Attribute#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of attributes of this class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see dercs.structure.StructurePackage#getClass_Attributes()
	 * @see dercs.structure.Attribute#getOwnerClass
	 * @model opposite="ownerClass" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Referenced Classes</b></em>' reference list.
	 * The list contents are of type {@link dercs.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of classes that are referenced as attributes or parameter types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Classes</em>' reference list.
	 * @see dercs.structure.StructurePackage#getClass_ReferencedClasses()
	 * @model
	 * @generated
	 */
	EList<Class> getReferencedClasses();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.structure.Method}.
	 * It is bidirectional and its opposite is '{@link dercs.structure.Method#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of behaviors that the class can perform
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see dercs.structure.StructurePackage#getClass_Methods()
	 * @see dercs.structure.Method#getOwnerClass
	 * @model opposite="ownerClass" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.structure.runtime.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of all possible states, which an isntance of this class can be in in a given instant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see dercs.structure.StructurePackage#getClass_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.behavior.events.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of events associated with this class. The events are handled by this classes methods
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see dercs.structure.StructurePackage#getClass_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dercs.Model#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model that owns this class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Model)
	 * @see dercs.structure.StructurePackage#getClass_Owner()
	 * @see dercs.Model#getClasses
	 * @model opposite="classes"
	 * @generated
	 */
	Model getOwner();

	/**
	 * Sets the value of the '{@link dercs.structure.Class#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Model value);

	// MANUALLY ADDED

	/**
	 * Add an attribute to this class.
	 * @param name Name of the attribute.
	 * @param dataType Primary data type of the attribute
	 * @param visibility Visibility of the attribute
	 * @return the newly added attribute
	 * @generated NOT
	 */
	default Attribute addAttribute(String name, DataType dataType, Visibility visibility, boolean isStatic,
			String defaultValue, boolean isReadOnly) {
		Attribute result = StructureFactory.eINSTANCE.createAttribute();
		result.setName(name);
		result.setDataType(dataType);
		result.setVisibility(visibility);
		result.setStatic(isStatic);
		result.setDefaultValue(defaultValue);
		result.setReadOnly(isReadOnly);

		this.getAttributes().add(result);
		checkDataTypeInReferenceList(dataType);
		return result;
	}

	/**
	 * Return the attribute with the specified name.
	 * @param name Attribute's name.
	 * @return The indicated attribute, NULL if it could not be found. 
	 * @generated NOT
	 */
	default Attribute getAttribute(String name) {
		if ((name.contains("[")) && (name.contains("]"))) {
			name = name.substring(0, name.indexOf("["));
		}

		for (Attribute attribute : this.getAttributes()) {
			if (attribute.getName().equals(name)) {
				return attribute;
			}
		}

		return null;
	}

	/**
	 * Add a method to the class.
	 * @param name Name of the method
	 * @param returnType Return data type of the method
	 * @param visibility Visibility of the method
	 * @param overwroteMethod Indicates whether the method overwrites some 
	 * inherited method
	 * @param isAbstracts Indicates whether the method is abstract or not
	 * @param triggeredBehavior Behavior which is triggered by the method
	 * @return the newly added method
	 * @generated NOT
	 */
	default Method addMethod(String name, DataType returnType, Visibility visibility, boolean overwroteMethod,
			boolean isAbstract, Behavior triggeredBehavior) {
		Method result = StructureFactory.eINSTANCE.createMethod();
		result.setName(name);
		result.setReturnType(returnType);
		result.setVisibility(visibility);
		result.setOverwritingMethod(overwroteMethod);
		result.setAbstract(isAbstract);
		result.setTriggeredBehavior(triggeredBehavior);

		this.getMethods().add(result);
		checkDataTypeInReferenceList(returnType);
		return result;
	}

	/**
	 * Add a method that overwrites another method of any superclass in the classes
	 * hierarchy tree.
	 * @param method Method to be overwritten
	 * @param visibility Visibility of the method
	 * @param triggeredBehavior Behavior which is triggered by the method
	 * @return the newly added method
	 * @generated NOT
	 */
	default Method addOverwriteMethod(Method method, Visibility visibility, Behavior triggeredBehavior) {
		Method result = StructureFactory.eINSTANCE.createMethod();
		result.setName(method.getName());
		result.setReturnType(method.getReturnType());
		result.setVisibility(visibility);
		result.setOverwritingMethod(true);
		result.setAbstract(false);
		result.setTriggeredBehavior(triggeredBehavior);

		this.getMethods().add(result);
		checkDataTypeInReferenceList(method.getReturnType());
		return result;
	}

	/**
	 * Add a constructor to the class.
	 * @param name Name of the constructor
	 * @param overwroteMethod Indicates whether the constructor overwrites some 
	 * inherited constructor
	 * @param triggeredBehavior Behavior which is triggered by the constructor
	 * @return the newly added constructor
	 * @generated NOT
	 */
	default Constructor addConstructor(String name, boolean overwroteMethod, Behavior triggeredBehavior) {
		// constructors are always public and do not return any value
		Constructor result = StructureFactory.eINSTANCE.createConstructor();
		result.setName(name);
		result.setReturnType(DatatypesFactory.eINSTANCE.createVoid());
		result.setVisibility(Visibility.PUBLIC);
		result.setOverwritingMethod(overwroteMethod);
		result.setTriggeredBehavior(triggeredBehavior);
		this.getMethods().add(result);
		return result;
	}

	/**
	 * Add a destructor to the class.
	 * @param name Name of the destructor
	 * @param overwroteMethod Indicates whether the destructor overwrites some 
	 * inherited destructor
	 * @param triggeredBehavior Behavior which is triggered by the destructor
	 * @return the newly added destructor
	 * @generated NOT
	 */
	default Destructor addDestructor(String name, boolean overwroteMethod, Behavior triggeredBehavior) {
		// destructors are always public and do not return any value
		Destructor result = StructureFactory.eINSTANCE.createDestructor();
		result.setName(name);
		result.setReturnType(DatatypesFactory.eINSTANCE.createVoid());
		result.setVisibility(Visibility.PUBLIC);
		result.setOverwritingMethod(overwroteMethod);
		result.setTriggeredBehavior(triggeredBehavior);
		this.getMethods().add(result);
		return result;
	}

	/**
	 * Get the method that has a given name.
	 * @param name Name of the method to be found.
	 * @return The method found, or NULL if there is no method with the given name.
	 * @generated NOT
	 */
	default Method getMethod(String name) {
		for (Method method : this.getMethods()) {
			if (method.getName().equals(name)) {
				return method;
			}
		}

		if (this.getSuperClass() != null) {
			return this.getSuperClass().getMethod(name);
		} else {
			return null;
		}
	}

	/**
	 * Get the method that has the same signature as the one passed as parameter.
	 * @param mth Method to be looked for.
	 * @return The method found, or NULL if there is no method with the same 
	 * characteristics.
	 * @generated NOT
	 */
	default Method getMethod(Method methodToFind) {
		for (Method method : this.getMethods()) {
			if (method.signatureMatches(methodToFind)) {
				return method;
			}
		}

		return null;
	}

	/**
	 * Add a state in which an instance of a class can be in a determined 
	 * instant of time.
	 * @param name Name of the state
	 * @return the newly added state
	 * @generated NOT
	 */
	default State addState(String name) {
		State result = RuntimeFactory.eINSTANCE.createState();
		result.setName(name);
		this.getStates().add(result);
		return result;
	}

	/**
	 * Check if a data type is in the references list. Typically class data types
	 * should be included into the references list because in most programming
	 * they represent different source code files.
	 * @param dataType Data type to be checked
	 * @generated NOT
	 */
	default void checkDataTypeInReferenceList(DataType dataType) {
		if (dataType instanceof ClassDataType) {
			Class typeClass = ((ClassDataType) dataType).getRepresents();

			if (!this.getReferencedClasses().contains(typeClass))
				this.getReferencedClasses().add(typeClass);
		}
	}

	/**
	 * Indicates if the class is super class of another class.
	 * @param otherClass Child class to be checked.
	 * @return TRUE if the class is super class of otherClass, FALSE otherwise.
	 * @generated NOT
	 */
	default boolean isSuperClassOf(Class otherClass) {
		if (otherClass == null) {
			return false;
		}

		Class superClass = otherClass.getSuperClass();

		while (superClass != null) {
			if (superClass == this) {
				return true;
			}
			superClass = superClass.getSuperClass();
		}

		return false;
	}

	/**
	 * Adds a new interruption event to this classes events.
	 * @param handler
	 * @return the newly added interruption event
	 * @generated NOT
	 */
	default Event addInterruptEvent(Method handler) {
		Event event = EventsFactory.eINSTANCE.createInterruptionEvent();
		event.setName(handler.getName());
		event.getTriggeredBehaviors().add(handler.getTriggeredBehavior());
		event.setBehaviorTriggerKind(TriggerKind.PARALLEL);

		this.getEvents().add(event);
		return event;
	}

} // Class
