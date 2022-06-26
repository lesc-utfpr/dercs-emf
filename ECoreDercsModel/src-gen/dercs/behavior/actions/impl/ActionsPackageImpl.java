/**
 */
package dercs.behavior.actions.impl;

import dercs.AO.AOPackage;
import dercs.AO.impl.AOPackageImpl;
import dercs.DercsPackage;
import dercs.behavior.BehaviorPackage;

import dercs.behavior.actions.Action;
import dercs.behavior.actions.ActionWithOutput;
import dercs.behavior.actions.ActionsFactory;
import dercs.behavior.actions.ActionsPackage;
import dercs.behavior.actions.ArrayAction;
import dercs.behavior.actions.AssignmentAction;
import dercs.behavior.actions.CreateObjectAction;
import dercs.behavior.actions.DestroyObjectAction;
import dercs.behavior.actions.ExpressionAction;
import dercs.behavior.actions.GetArrayElementAction;
import dercs.behavior.actions.GetArrayLengthAction;
import dercs.behavior.actions.InsertArrayElementAction;
import dercs.behavior.actions.ModifyStateAction;
import dercs.behavior.actions.ObjectAction;
import dercs.behavior.actions.RemoveArrayElementAction;
import dercs.behavior.actions.ReturnAction;
import dercs.behavior.actions.SendMessageAction;

import dercs.behavior.actions.SetArrayElementAction;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionsPackageImpl extends EPackageImpl implements ActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionWithOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMessageActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getArrayElementActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getArrayLengthActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertArrayElementActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeArrayElementActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setArrayElementActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyStateActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentActionEClass = null;

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
	 * @see dercs.behavior.actions.ActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionsPackageImpl() {
		super(eNS_URI, ActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionsPackage init() {
		if (isInited)
			return (ActionsPackage) EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredActionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ActionsPackageImpl theActionsPackage = registeredActionsPackage instanceof ActionsPackageImpl
				? (ActionsPackageImpl) registeredActionsPackage
				: new ActionsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl) (registeredPackage instanceof EventsPackageImpl
				? registeredPackage
				: EventsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AOPackage.eNS_URI);
		AOPackageImpl theAOPackage = (AOPackageImpl) (registeredPackage instanceof AOPackageImpl ? registeredPackage
				: AOPackage.eINSTANCE);

		// Create package meta-data objects
		theActionsPackage.createPackageContents();
		theDercsPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theAOPackage.createPackageContents();

		// Initialize created meta-data
		theActionsPackage.initializePackageContents();
		theDercsPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theAOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionsPackage.eNS_URI, theActionsPackage);
		return theActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionWithOutput() {
		return actionWithOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionWithOutput_OutputReceiverAction() {
		return (EReference) actionWithOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendMessageAction() {
		return sendMessageActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendMessageAction_RelatedMethod() {
		return (EReference) sendMessageActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendMessageAction_FromObject() {
		return (EReference) sendMessageActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendMessageAction_ToObject() {
		return (EReference) sendMessageActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendMessageAction_ParameterValues() {
		return (EAttribute) sendMessageActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendMessageAction_MessageSort() {
		return (EAttribute) sendMessageActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayAction() {
		return arrayActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayAction_ArrayVariable() {
		return (EReference) arrayActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayAction_ArrayElement() {
		return (EAttribute) arrayActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayAction_ArrayAttribute() {
		return (EReference) arrayActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayAction_ArrayObject() {
		return (EReference) arrayActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectAction() {
		return objectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectAction_RelatedObject() {
		return (EReference) objectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateObjectAction() {
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateObjectAction_ParameterValues() {
		return (EAttribute) createObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDestroyObjectAction() {
		return destroyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetArrayElementAction() {
		return getArrayElementActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetArrayLengthAction() {
		return getArrayLengthActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsertArrayElementAction() {
		return insertArrayElementActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsertArrayElementAction_Value() {
		return (EAttribute) insertArrayElementActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoveArrayElementAction() {
		return removeArrayElementActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetArrayElementAction() {
		return setArrayElementActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetArrayElementAction_Value() {
		return (EAttribute) setArrayElementActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnAction() {
		return returnActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAction_Method() {
		return (EReference) returnActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifyStateAction() {
		return modifyStateActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifyStateAction_RelatedTransition() {
		return (EReference) modifyStateActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionAction() {
		return expressionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionAction_Expression() {
		return (EAttribute) expressionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignmentAction() {
		return assignmentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignmentAction_Value() {
		return (EAttribute) assignmentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentAction_DestinationVariable() {
		return (EReference) assignmentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentAction_DestinationAttribute() {
		return (EReference) assignmentActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentAction_DestinationObject() {
		return (EReference) assignmentActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignmentAction_DestinationArrayElement() {
		return (EAttribute) assignmentActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentAction_ResultOfAction() {
		return (EReference) assignmentActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionsFactory getActionsFactory() {
		return (ActionsFactory) getEFactoryInstance();
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
		actionEClass = createEClass(ACTION);

		actionWithOutputEClass = createEClass(ACTION_WITH_OUTPUT);
		createEReference(actionWithOutputEClass, ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION);

		sendMessageActionEClass = createEClass(SEND_MESSAGE_ACTION);
		createEReference(sendMessageActionEClass, SEND_MESSAGE_ACTION__RELATED_METHOD);
		createEReference(sendMessageActionEClass, SEND_MESSAGE_ACTION__FROM_OBJECT);
		createEReference(sendMessageActionEClass, SEND_MESSAGE_ACTION__TO_OBJECT);
		createEAttribute(sendMessageActionEClass, SEND_MESSAGE_ACTION__PARAMETER_VALUES);
		createEAttribute(sendMessageActionEClass, SEND_MESSAGE_ACTION__MESSAGE_SORT);

		arrayActionEClass = createEClass(ARRAY_ACTION);
		createEReference(arrayActionEClass, ARRAY_ACTION__ARRAY_VARIABLE);
		createEAttribute(arrayActionEClass, ARRAY_ACTION__ARRAY_ELEMENT);
		createEReference(arrayActionEClass, ARRAY_ACTION__ARRAY_ATTRIBUTE);
		createEReference(arrayActionEClass, ARRAY_ACTION__ARRAY_OBJECT);

		objectActionEClass = createEClass(OBJECT_ACTION);
		createEReference(objectActionEClass, OBJECT_ACTION__RELATED_OBJECT);

		createObjectActionEClass = createEClass(CREATE_OBJECT_ACTION);
		createEAttribute(createObjectActionEClass, CREATE_OBJECT_ACTION__PARAMETER_VALUES);

		destroyObjectActionEClass = createEClass(DESTROY_OBJECT_ACTION);

		getArrayElementActionEClass = createEClass(GET_ARRAY_ELEMENT_ACTION);

		getArrayLengthActionEClass = createEClass(GET_ARRAY_LENGTH_ACTION);

		insertArrayElementActionEClass = createEClass(INSERT_ARRAY_ELEMENT_ACTION);
		createEAttribute(insertArrayElementActionEClass, INSERT_ARRAY_ELEMENT_ACTION__VALUE);

		removeArrayElementActionEClass = createEClass(REMOVE_ARRAY_ELEMENT_ACTION);

		setArrayElementActionEClass = createEClass(SET_ARRAY_ELEMENT_ACTION);
		createEAttribute(setArrayElementActionEClass, SET_ARRAY_ELEMENT_ACTION__VALUE);

		returnActionEClass = createEClass(RETURN_ACTION);
		createEReference(returnActionEClass, RETURN_ACTION__METHOD);

		modifyStateActionEClass = createEClass(MODIFY_STATE_ACTION);
		createEReference(modifyStateActionEClass, MODIFY_STATE_ACTION__RELATED_TRANSITION);

		expressionActionEClass = createEClass(EXPRESSION_ACTION);
		createEAttribute(expressionActionEClass, EXPRESSION_ACTION__EXPRESSION);

		assignmentActionEClass = createEClass(ASSIGNMENT_ACTION);
		createEAttribute(assignmentActionEClass, ASSIGNMENT_ACTION__VALUE);
		createEReference(assignmentActionEClass, ASSIGNMENT_ACTION__DESTINATION_VARIABLE);
		createEReference(assignmentActionEClass, ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE);
		createEReference(assignmentActionEClass, ASSIGNMENT_ACTION__DESTINATION_OBJECT);
		createEAttribute(assignmentActionEClass, ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT);
		createEReference(assignmentActionEClass, ASSIGNMENT_ACTION__RESULT_OF_ACTION);
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
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		actionWithOutputEClass.getESuperTypes().add(this.getAction());
		sendMessageActionEClass.getESuperTypes().add(this.getActionWithOutput());
		arrayActionEClass.getESuperTypes().add(this.getActionWithOutput());
		objectActionEClass.getESuperTypes().add(this.getActionWithOutput());
		createObjectActionEClass.getESuperTypes().add(this.getObjectAction());
		destroyObjectActionEClass.getESuperTypes().add(this.getObjectAction());
		getArrayElementActionEClass.getESuperTypes().add(this.getArrayAction());
		getArrayLengthActionEClass.getESuperTypes().add(this.getArrayAction());
		insertArrayElementActionEClass.getESuperTypes().add(this.getArrayAction());
		removeArrayElementActionEClass.getESuperTypes().add(this.getArrayAction());
		setArrayElementActionEClass.getESuperTypes().add(this.getArrayAction());
		returnActionEClass.getESuperTypes().add(this.getAssignmentAction());
		modifyStateActionEClass.getESuperTypes().add(this.getObjectAction());
		expressionActionEClass.getESuperTypes().add(this.getActionWithOutput());
		assignmentActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionWithOutputEClass, ActionWithOutput.class, "ActionWithOutput", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionWithOutput_OutputReceiverAction(), this.getAction(), null, "outputReceiverAction", null,
				0, 1, ActionWithOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendMessageActionEClass, SendMessageAction.class, "SendMessageAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendMessageAction_RelatedMethod(), theStructurePackage.getMethod(), null, "relatedMethod",
				null, 0, 1, SendMessageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendMessageAction_FromObject(), theRuntimePackage.getRuntimeElement(), null, "fromObject",
				null, 0, 1, SendMessageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendMessageAction_ToObject(), theRuntimePackage.getRuntimeElement(), null, "toObject", null,
				0, 1, SendMessageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendMessageAction_ParameterValues(), ecorePackage.getEJavaObject(), "parameterValues", null,
				0, -1, SendMessageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendMessageAction_MessageSort(), theBehaviorPackage.getMessageSort(), "messageSort", null, 0,
				1, SendMessageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayActionEClass, ArrayAction.class, "ArrayAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayAction_ArrayVariable(), theBehaviorPackage.getLocalVariable(), null, "arrayVariable",
				null, 0, 1, ArrayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrayAction_ArrayElement(), ecorePackage.getEString(), "arrayElement", null, 0, 1,
				ArrayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getArrayAction_ArrayAttribute(), theStructurePackage.getAttribute(), null, "arrayAttribute",
				null, 0, 1, ArrayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayAction_ArrayObject(), theRuntimePackage.getObject(), null, "arrayObject", null, 0, 1,
				ArrayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectActionEClass, ObjectAction.class, "ObjectAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectAction_RelatedObject(), theRuntimePackage.getObject(), null, "relatedObject", null, 0,
				1, ObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateObjectAction_ParameterValues(), ecorePackage.getEString(), "parameterValues", null, 0,
				-1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destroyObjectActionEClass, DestroyObjectAction.class, "DestroyObjectAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getArrayElementActionEClass, GetArrayElementAction.class, "GetArrayElementAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getArrayLengthActionEClass, GetArrayLengthAction.class, "GetArrayLengthAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(insertArrayElementActionEClass, InsertArrayElementAction.class, "InsertArrayElementAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertArrayElementAction_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				InsertArrayElementAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeArrayElementActionEClass, RemoveArrayElementAction.class, "RemoveArrayElementAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setArrayElementActionEClass, SetArrayElementAction.class, "SetArrayElementAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetArrayElementAction_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				SetArrayElementAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnActionEClass, ReturnAction.class, "ReturnAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnAction_Method(), theStructurePackage.getMethod(), null, "method", null, 0, 1,
				ReturnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyStateActionEClass, ModifyStateAction.class, "ModifyStateAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifyStateAction_RelatedTransition(), theBehaviorPackage.getStateTransition(), null,
				"relatedTransition", null, 0, 1, ModifyStateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionActionEClass, ExpressionAction.class, "ExpressionAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionAction_Expression(), ecorePackage.getEString(), "expression", null, 0, 1,
				ExpressionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(assignmentActionEClass, AssignmentAction.class, "AssignmentAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignmentAction_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				AssignmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentAction_DestinationVariable(), theBehaviorPackage.getLocalVariable(), null,
				"destinationVariable", null, 0, 1, AssignmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentAction_DestinationAttribute(), theStructurePackage.getAttribute(), null,
				"destinationAttribute", null, 0, 1, AssignmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentAction_DestinationObject(), theRuntimePackage.getObject(), null,
				"destinationObject", null, 0, 1, AssignmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignmentAction_DestinationArrayElement(), ecorePackage.getEInt(), "destinationArrayElement",
				null, 0, 1, AssignmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentAction_ResultOfAction(), this.getActionWithOutput(), null, "resultOfAction", null,
				0, 1, AssignmentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ActionsPackageImpl
