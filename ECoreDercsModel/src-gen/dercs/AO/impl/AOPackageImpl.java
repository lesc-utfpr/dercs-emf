/**
 */
package dercs.AO.impl;

import dercs.AO.AOFactory;
import dercs.AO.AOPackage;
import dercs.AO.Aspect;
import dercs.AO.AspectAdaptation;
import dercs.AO.BehavioralAdaptation;
import dercs.AO.Crosscutting;
import dercs.AO.CrosscuttingInformation;
import dercs.AO.ElementSelectionKind;
import dercs.AO.JoinPoint;
import dercs.AO.Pointcut;
import dercs.AO.RelativePosition;
import dercs.AO.StructuralAdaptation;

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

import dercs.structure.runtime.RuntimePackage;

import dercs.structure.runtime.impl.RuntimePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AOPackageImpl extends EPackageImpl implements AOPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointcutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crosscuttingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crosscuttingInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relativePositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementSelectionKindEEnum = null;

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
	 * @see dercs.AO.AOPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AOPackageImpl() {
		super(eNS_URI, AOFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AOPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AOPackage init() {
		if (isInited)
			return (AOPackage) EPackage.Registry.INSTANCE.getEPackage(AOPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAOPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AOPackageImpl theAOPackage = registeredAOPackage instanceof AOPackageImpl ? (AOPackageImpl) registeredAOPackage
				: new AOPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl) (registeredPackage instanceof RuntimePackageImpl
				? registeredPackage
				: RuntimePackage.eINSTANCE);
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

		// Create package meta-data objects
		theAOPackage.createPackageContents();
		theDercsPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theEventsPackage.createPackageContents();

		// Initialize created meta-data
		theAOPackage.initializePackageContents();
		theDercsPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAOPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AOPackage.eNS_URI, theAOPackage);
		return theAOPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAspectAdaptation() {
		return aspectAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAspectAdaptation_Owner() {
		return (EReference) aspectAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAspect_StructuralAdaptations() {
		return (EReference) aspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAspect_BehavioralAdaptations() {
		return (EReference) aspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAspect_Pointcuts() {
		return (EReference) aspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAspect_Crosscutting() {
		return (EReference) aspectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehavioralAdaptation() {
		return behavioralAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructuralAdaptation() {
		return structuralAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoinPoint() {
		return joinPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoinPoint_SelectedElements() {
		return (EReference) joinPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoinPoint_Model() {
		return (EReference) joinPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJoinPoint_ElementSelectionKind() {
		return (EAttribute) joinPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointcut() {
		return pointcutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointcut_JoinPoints() {
		return (EReference) pointcutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointcut_AspectAdaptation() {
		return (EReference) pointcutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointcut_RelativePosition() {
		return (EAttribute) pointcutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrosscutting() {
		return crosscuttingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrosscutting_AffectedElement() {
		return (EReference) crosscuttingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrosscutting_CrosscuttingInformations() {
		return (EReference) crosscuttingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrosscutting_AssociatedAspect() {
		return (EReference) crosscuttingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrosscuttingInformation() {
		return crosscuttingInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrosscuttingInformation_Value() {
		return (EAttribute) crosscuttingInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelativePosition() {
		return relativePositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getElementSelectionKind() {
		return elementSelectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AOFactory getAOFactory() {
		return (AOFactory) getEFactoryInstance();
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
		aspectAdaptationEClass = createEClass(ASPECT_ADAPTATION);
		createEReference(aspectAdaptationEClass, ASPECT_ADAPTATION__OWNER);

		aspectEClass = createEClass(ASPECT);
		createEReference(aspectEClass, ASPECT__STRUCTURAL_ADAPTATIONS);
		createEReference(aspectEClass, ASPECT__BEHAVIORAL_ADAPTATIONS);
		createEReference(aspectEClass, ASPECT__POINTCUTS);
		createEReference(aspectEClass, ASPECT__CROSSCUTTING);

		behavioralAdaptationEClass = createEClass(BEHAVIORAL_ADAPTATION);

		structuralAdaptationEClass = createEClass(STRUCTURAL_ADAPTATION);

		joinPointEClass = createEClass(JOIN_POINT);
		createEReference(joinPointEClass, JOIN_POINT__SELECTED_ELEMENTS);
		createEReference(joinPointEClass, JOIN_POINT__MODEL);
		createEAttribute(joinPointEClass, JOIN_POINT__ELEMENT_SELECTION_KIND);

		pointcutEClass = createEClass(POINTCUT);
		createEReference(pointcutEClass, POINTCUT__JOIN_POINTS);
		createEReference(pointcutEClass, POINTCUT__ASPECT_ADAPTATION);
		createEAttribute(pointcutEClass, POINTCUT__RELATIVE_POSITION);

		crosscuttingEClass = createEClass(CROSSCUTTING);
		createEReference(crosscuttingEClass, CROSSCUTTING__AFFECTED_ELEMENT);
		createEReference(crosscuttingEClass, CROSSCUTTING__CROSSCUTTING_INFORMATIONS);
		createEReference(crosscuttingEClass, CROSSCUTTING__ASSOCIATED_ASPECT);

		crosscuttingInformationEClass = createEClass(CROSSCUTTING_INFORMATION);
		createEAttribute(crosscuttingInformationEClass, CROSSCUTTING_INFORMATION__VALUE);

		// Create enums
		relativePositionEEnum = createEEnum(RELATIVE_POSITION);
		elementSelectionKindEEnum = createEEnum(ELEMENT_SELECTION_KIND);
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
		DercsPackage theDercsPackage = (DercsPackage) EPackage.Registry.INSTANCE.getEPackage(DercsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aspectAdaptationEClass.getESuperTypes().add(theStructurePackage.getNamedElement());
		aspectEClass.getESuperTypes().add(theStructurePackage.getNamedElement());
		behavioralAdaptationEClass.getESuperTypes().add(this.getAspectAdaptation());
		structuralAdaptationEClass.getESuperTypes().add(this.getAspectAdaptation());
		joinPointEClass.getESuperTypes().add(theStructurePackage.getNamedElement());
		pointcutEClass.getESuperTypes().add(theStructurePackage.getNamedElement());
		crosscuttingEClass.getESuperTypes().add(theStructurePackage.getNamedElement());
		crosscuttingInformationEClass.getESuperTypes().add(theStructurePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(aspectAdaptationEClass, AspectAdaptation.class, "AspectAdaptation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspectAdaptation_Owner(), this.getAspect(), null, "owner", null, 0, 1, AspectAdaptation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspect_StructuralAdaptations(), this.getStructuralAdaptation(), null, "structuralAdaptations",
				null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_BehavioralAdaptations(), this.getBehavioralAdaptation(), null, "behavioralAdaptations",
				null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Pointcuts(), this.getPointcut(), null, "pointcuts", null, 0, -1, Aspect.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Crosscutting(), this.getCrosscutting(), this.getCrosscutting_AssociatedAspect(),
				"crosscutting", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behavioralAdaptationEClass, BehavioralAdaptation.class, "BehavioralAdaptation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralAdaptationEClass, StructuralAdaptation.class, "StructuralAdaptation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinPointEClass, JoinPoint.class, "JoinPoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinPoint_SelectedElements(), theStructurePackage.getBaseElement(), null, "selectedElements",
				null, 0, -1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinPoint_Model(), theDercsPackage.getModel(), theDercsPackage.getModel_JoinPoints(), "model",
				null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinPoint_ElementSelectionKind(), this.getElementSelectionKind(), "elementSelectionKind",
				null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointcut_JoinPoints(), this.getJoinPoint(), null, "joinPoints", null, 0, -1, Pointcut.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointcut_AspectAdaptation(), this.getAspectAdaptation(), null, "aspectAdaptation", null, 0, 1,
				Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointcut_RelativePosition(), this.getRelativePosition(), "relativePosition", null, 0, 1,
				Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(crosscuttingEClass, Crosscutting.class, "Crosscutting", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrosscutting_AffectedElement(), theStructurePackage.getBaseElement(), null, "affectedElement",
				null, 0, 1, Crosscutting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrosscutting_CrosscuttingInformations(), this.getCrosscuttingInformation(), null,
				"crosscuttingInformations", null, 0, -1, Crosscutting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrosscutting_AssociatedAspect(), this.getAspect(), this.getAspect_Crosscutting(),
				"associatedAspect", null, 0, 1, Crosscutting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crosscuttingInformationEClass, CrosscuttingInformation.class, "CrosscuttingInformation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrosscuttingInformation_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				CrosscuttingInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relativePositionEEnum, RelativePosition.class, "RelativePosition");
		addEEnumLiteral(relativePositionEEnum, RelativePosition.BEFORE);
		addEEnumLiteral(relativePositionEEnum, RelativePosition.AFTER);
		addEEnumLiteral(relativePositionEEnum, RelativePosition.AROUND);
		addEEnumLiteral(relativePositionEEnum, RelativePosition.REPLACE);
		addEEnumLiteral(relativePositionEEnum, RelativePosition.ADD_NEW_FEATURE);
		addEEnumLiteral(relativePositionEEnum, RelativePosition.MODIFY_STRUCTURE);

		initEEnum(elementSelectionKindEEnum, ElementSelectionKind.class, "ElementSelectionKind");
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.UNKNOWN);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.CLASS);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.ATTRIBUTE);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.METHOD);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.OBJECT);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.NODE);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.ACTION_MESSAGE_SENDING);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.ACTION_RETURN);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.ACTION_OBJECT_CREATION);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.ACTION_OBJECT_DESTRUCTION);
		addEEnumLiteral(elementSelectionKindEEnum, ElementSelectionKind.BEHAVIOR);
	}

} //AOPackageImpl
