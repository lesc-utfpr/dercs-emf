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
package dercs.structure.runtime.impl;

import dercs.AO.AOPackage;
import dercs.AO.impl.AOPackageImpl;
import dercs.DercsPackage;
import dercs.behavior.BehaviorPackage;
import dercs.behavior.actions.ActionsPackage;
import dercs.behavior.actions.impl.ActionsPackageImpl;
import dercs.behavior.events.EventsPackage;
import dercs.behavior.events.impl.EventsPackageImpl;
import dercs.behavior.impl.BehaviorPackageImpl;
import dercs.datatypes.DatatypesPackage;

import dercs.datatypes.impl.DatatypesPackageImpl;

import dercs.impl.DercsPackageImpl;
import dercs.structure.StructurePackage;

import dercs.structure.impl.StructurePackageImpl;

import dercs.structure.runtime.ActiveObject;
import dercs.structure.runtime.AttributeRuntimeInformation;
import dercs.structure.runtime.LocalVariableRuntimeInformation;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.ParameterRuntimeInformation;
import dercs.structure.runtime.PassiveObject;
import dercs.structure.runtime.RuntimeElement;
import dercs.structure.runtime.RuntimeFactory;
import dercs.structure.runtime.RuntimeInformation;
import dercs.structure.runtime.RuntimePackage;
import dercs.structure.runtime.State;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRuntimeInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRuntimeInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableRuntimeInformationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dercs.structure.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackageImpl() {
		super(eNS_URI, RuntimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init() {
		if (isInited)
			return (RuntimePackage) EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRuntimePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RuntimePackageImpl theRuntimePackage = registeredRuntimePackage instanceof RuntimePackageImpl
				? (RuntimePackageImpl) registeredRuntimePackage
				: new RuntimePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DercsPackage.eNS_URI);
		DercsPackageImpl theDercsPackage = (DercsPackageImpl) (registeredPackage instanceof DercsPackageImpl
				? registeredPackage
				: DercsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl) (registeredPackage instanceof StructurePackageImpl
				? registeredPackage
				: StructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (registeredPackage instanceof DatatypesPackageImpl
				? registeredPackage
				: DatatypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl) (registeredPackage instanceof BehaviorPackageImpl
				? registeredPackage
				: BehaviorPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl) (registeredPackage instanceof ActionsPackageImpl
				? registeredPackage
				: ActionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl) (registeredPackage instanceof EventsPackageImpl
				? registeredPackage
				: EventsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AOPackage.eNS_URI);
		AOPackageImpl theAOPackage = (AOPackageImpl) (registeredPackage instanceof AOPackageImpl ? registeredPackage
				: AOPackage.eINSTANCE);

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();
		theDercsPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theAOPackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();
		theDercsPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theAOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuntimeElement() {
		return runtimeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeElement_AssociatedElement() {
		return (EReference) runtimeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRuntimeElement__IsObject() {
		return runtimeElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_PlatformName() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_DeployedObjects() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_Node() {
		return (EReference) objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_InstanceOfClass() {
		return (EReference) objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObject_RuntimeInformation() {
		return (EReference) objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getObject__IsObject() {
		return objectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Name() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuntimeInformation() {
		return runtimeInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuntimeInformation_Value() {
		return (EAttribute) runtimeInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuntimeInformation_Array() {
		return (EAttribute) runtimeInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterRuntimeInformation() {
		return parameterRuntimeInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterRuntimeInformation_Parameter() {
		return (EReference) parameterRuntimeInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassiveObject() {
		return passiveObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActiveObject() {
		return activeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActiveObject_MainBehaviour() {
		return (EReference) activeObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeRuntimeInformation() {
		return attributeRuntimeInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeRuntimeInformation_RelatedObject() {
		return (EReference) attributeRuntimeInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeRuntimeInformation_RelatedAttribute() {
		return (EReference) attributeRuntimeInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalVariableRuntimeInformation() {
		return localVariableRuntimeInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalVariableRuntimeInformation_LocalVariable() {
		return (EReference) localVariableRuntimeInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeFactory getRuntimeFactory() {
		return (RuntimeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		runtimeElementEClass = createEClass(RUNTIME_ELEMENT);
		createEReference(runtimeElementEClass, RUNTIME_ELEMENT__ASSOCIATED_ELEMENT);
		createEOperation(runtimeElementEClass, RUNTIME_ELEMENT___IS_OBJECT);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__PLATFORM_NAME);
		createEReference(nodeEClass, NODE__DEPLOYED_OBJECTS);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__NODE);
		createEReference(objectEClass, OBJECT__INSTANCE_OF_CLASS);
		createEReference(objectEClass, OBJECT__RUNTIME_INFORMATION);
		createEOperation(objectEClass, OBJECT___IS_OBJECT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);

		runtimeInformationEClass = createEClass(RUNTIME_INFORMATION);
		createEAttribute(runtimeInformationEClass, RUNTIME_INFORMATION__VALUE);
		createEAttribute(runtimeInformationEClass, RUNTIME_INFORMATION__ARRAY);

		parameterRuntimeInformationEClass = createEClass(PARAMETER_RUNTIME_INFORMATION);
		createEReference(parameterRuntimeInformationEClass, PARAMETER_RUNTIME_INFORMATION__PARAMETER);

		passiveObjectEClass = createEClass(PASSIVE_OBJECT);

		activeObjectEClass = createEClass(ACTIVE_OBJECT);
		createEReference(activeObjectEClass, ACTIVE_OBJECT__MAIN_BEHAVIOUR);

		attributeRuntimeInformationEClass = createEClass(ATTRIBUTE_RUNTIME_INFORMATION);
		createEReference(attributeRuntimeInformationEClass, ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT);
		createEReference(attributeRuntimeInformationEClass, ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE);

		localVariableRuntimeInformationEClass = createEClass(LOCAL_VARIABLE_RUNTIME_INFORMATION);
		createEReference(localVariableRuntimeInformationEClass, LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimeElementEClass.getESuperTypes().add(theStructurePackage.getBaseElement());
		nodeEClass.getESuperTypes().add(theStructurePackage.getBaseElement());
		objectEClass.getESuperTypes().add(this.getRuntimeElement());
		parameterRuntimeInformationEClass.getESuperTypes().add(this.getRuntimeInformation());
		passiveObjectEClass.getESuperTypes().add(this.getObject());
		activeObjectEClass.getESuperTypes().add(this.getObject());
		attributeRuntimeInformationEClass.getESuperTypes().add(this.getRuntimeInformation());
		localVariableRuntimeInformationEClass.getESuperTypes().add(this.getRuntimeInformation());

		// Initialize classes, features, and operations; add parameters
		initEClass(runtimeElementEClass, RuntimeElement.class, "RuntimeElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeElement_AssociatedElement(), this.getRuntimeElement(), null, "associatedElement", null,
				0, 1, RuntimeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRuntimeElement__IsObject(), ecorePackage.getEBoolean(), "isObject", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_PlatformName(), ecorePackage.getEString(), "platformName", null, 0, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_DeployedObjects(), this.getObject(), this.getObject_Node(), "deployedObjects", null, 0,
				-1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, dercs.structure.runtime.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_Node(), this.getNode(), this.getNode_DeployedObjects(), "node", null, 0, 1,
				dercs.structure.runtime.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_InstanceOfClass(), theStructurePackage.getClass_(), null, "instanceOfClass", null, 0,
				1, dercs.structure.runtime.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_RuntimeInformation(), this.getAttributeRuntimeInformation(), null,
				"runtimeInformation", null, 0, -1, dercs.structure.runtime.Object.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObject__IsObject(), ecorePackage.getEBoolean(), "isObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeInformationEClass, RuntimeInformation.class, "RuntimeInformation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeInformation_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				RuntimeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeInformation_Array(), ecorePackage.getEJavaObject(), "array", null, 0, 1,
				RuntimeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterRuntimeInformationEClass, ParameterRuntimeInformation.class, "ParameterRuntimeInformation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterRuntimeInformation_Parameter(), theStructurePackage.getParameter(), null,
				"parameter", null, 0, 1, ParameterRuntimeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passiveObjectEClass, PassiveObject.class, "PassiveObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(activeObjectEClass, ActiveObject.class, "ActiveObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActiveObject_MainBehaviour(), theStructurePackage.getMethod(), null, "mainBehaviour", null, 0,
				1, ActiveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeRuntimeInformationEClass, AttributeRuntimeInformation.class, "AttributeRuntimeInformation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeRuntimeInformation_RelatedObject(), this.getObject(), null, "relatedObject", null, 0,
				1, AttributeRuntimeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeRuntimeInformation_RelatedAttribute(), theStructurePackage.getAttribute(), null,
				"relatedAttribute", null, 0, 1, AttributeRuntimeInformation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localVariableRuntimeInformationEClass, LocalVariableRuntimeInformation.class,
				"LocalVariableRuntimeInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalVariableRuntimeInformation_LocalVariable(), theBehaviorPackage.getLocalVariable(), null,
				"localVariable", null, 0, 1, LocalVariableRuntimeInformation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RuntimePackageImpl
