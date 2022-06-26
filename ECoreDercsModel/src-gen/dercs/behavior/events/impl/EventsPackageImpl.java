/**
 */
package dercs.behavior.events.impl;

import dercs.AO.AOPackage;
import dercs.AO.impl.AOPackageImpl;
import dercs.DercsPackage;
import dercs.behavior.BehaviorPackage;

import dercs.behavior.actions.ActionsPackage;

import dercs.behavior.actions.impl.ActionsPackageImpl;

import dercs.behavior.events.EnterStateEvent;
import dercs.behavior.events.Event;
import dercs.behavior.events.EventsFactory;
import dercs.behavior.events.EventsPackage;
import dercs.behavior.events.ExitStateEvent;
import dercs.behavior.events.InterruptionEvent;
import dercs.behavior.events.MessageEvent;
import dercs.behavior.events.ReceiveMessageEvent;
import dercs.behavior.events.SendMessageEvent;
import dercs.behavior.events.StateEvent;
import dercs.behavior.events.StateTransitionEvent;
import dercs.behavior.events.TriggerKind;

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
public class EventsPackageImpl extends EPackageImpl implements EventsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMessageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveMessageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterStateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitStateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerKindEEnum = null;

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
	 * @see dercs.behavior.events.EventsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EventsPackageImpl() {
		super(eNS_URI, EventsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EventsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EventsPackage init() {
		if (isInited)
			return (EventsPackage) EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEventsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EventsPackageImpl theEventsPackage = registeredEventsPackage instanceof EventsPackageImpl
				? (EventsPackageImpl) registeredEventsPackage
				: new EventsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AOPackage.eNS_URI);
		AOPackageImpl theAOPackage = (AOPackageImpl) (registeredPackage instanceof AOPackageImpl ? registeredPackage
				: AOPackage.eINSTANCE);

		// Create package meta-data objects
		theEventsPackage.createPackageContents();
		theDercsPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theAOPackage.createPackageContents();

		// Initialize created meta-data
		theEventsPackage.initializePackageContents();
		theDercsPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theAOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEventsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EventsPackage.eNS_URI, theEventsPackage);
		return theEventsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_TriggeredBehaviors() {
		return (EReference) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_BehaviorTriggerKind() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageEvent() {
		return messageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageEvent_Action() {
		return (EReference) messageEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendMessageEvent() {
		return sendMessageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReceiveMessageEvent() {
		return receiveMessageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateEvent() {
		return stateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnterStateEvent() {
		return enterStateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExitStateEvent() {
		return exitStateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateTransitionEvent() {
		return stateTransitionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterruptionEvent() {
		return interruptionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTriggerKind() {
		return triggerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventsFactory getEventsFactory() {
		return (EventsFactory) getEFactoryInstance();
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
		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__TRIGGERED_BEHAVIORS);
		createEAttribute(eventEClass, EVENT__BEHAVIOR_TRIGGER_KIND);

		messageEventEClass = createEClass(MESSAGE_EVENT);
		createEReference(messageEventEClass, MESSAGE_EVENT__ACTION);

		sendMessageEventEClass = createEClass(SEND_MESSAGE_EVENT);

		receiveMessageEventEClass = createEClass(RECEIVE_MESSAGE_EVENT);

		stateEventEClass = createEClass(STATE_EVENT);

		enterStateEventEClass = createEClass(ENTER_STATE_EVENT);

		exitStateEventEClass = createEClass(EXIT_STATE_EVENT);

		stateTransitionEventEClass = createEClass(STATE_TRANSITION_EVENT);

		interruptionEventEClass = createEClass(INTERRUPTION_EVENT);

		// Create enums
		triggerKindEEnum = createEEnum(TRIGGER_KIND);
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
		ActionsPackage theActionsPackage = (ActionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ActionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventEClass.getESuperTypes().add(theStructurePackage.getNamedElement());
		messageEventEClass.getESuperTypes().add(this.getEvent());
		sendMessageEventEClass.getESuperTypes().add(this.getMessageEvent());
		receiveMessageEventEClass.getESuperTypes().add(this.getMessageEvent());
		stateEventEClass.getESuperTypes().add(this.getEvent());
		enterStateEventEClass.getESuperTypes().add(this.getStateEvent());
		exitStateEventEClass.getESuperTypes().add(this.getStateEvent());
		stateTransitionEventEClass.getESuperTypes().add(this.getStateEvent());
		interruptionEventEClass.getESuperTypes().add(this.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_TriggeredBehaviors(), theBehaviorPackage.getBehavior(), null, "triggeredBehaviors",
				null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_BehaviorTriggerKind(), this.getTriggerKind(), "behaviorTriggerKind", null, 0, 1,
				Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(messageEventEClass, MessageEvent.class, "MessageEvent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageEvent_Action(), theActionsPackage.getAction(), null, "action", null, 0, 1,
				MessageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendMessageEventEClass, SendMessageEvent.class, "SendMessageEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiveMessageEventEClass, ReceiveMessageEvent.class, "ReceiveMessageEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEventEClass, StateEvent.class, "StateEvent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enterStateEventEClass, EnterStateEvent.class, "EnterStateEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitStateEventEClass, ExitStateEvent.class, "ExitStateEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateTransitionEventEClass, StateTransitionEvent.class, "StateTransitionEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interruptionEventEClass, InterruptionEvent.class, "InterruptionEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(triggerKindEEnum, TriggerKind.class, "TriggerKind");
		addEEnumLiteral(triggerKindEEnum, TriggerKind.SEQUENTIAL);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.PARALLEL);
	}

} //EventsPackageImpl
