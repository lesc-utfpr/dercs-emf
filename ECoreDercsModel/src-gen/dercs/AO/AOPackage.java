/**
 */
package dercs.AO;

import dercs.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dercs.AO.AOFactory
 * @model kind="package"
 * @generated
 */
public interface AOPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AO";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://utfpr.edu.br/dercs/AO";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AO";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AOPackage eINSTANCE = dercs.AO.impl.AOPackageImpl.init();

	/**
	 * The meta object id for the '{@link dercs.AO.impl.AspectAdaptationImpl <em>Aspect Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.impl.AspectAdaptationImpl
	 * @see dercs.AO.impl.AOPackageImpl#getAspectAdaptation()
	 * @generated
	 */
	int ASPECT_ADAPTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ADAPTATION__NAME = StructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ADAPTATION__TAGS = StructurePackage.NAMED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ADAPTATION__OWNER = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aspect Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ADAPTATION_FEATURE_COUNT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aspect Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_ADAPTATION_OPERATION_COUNT = StructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.AO.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.impl.AspectImpl
	 * @see dercs.AO.impl.AOPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = StructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__TAGS = StructurePackage.NAMED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Structural Adaptations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__STRUCTURAL_ADAPTATIONS = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavioral Adaptations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__BEHAVIORAL_ADAPTATIONS = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pointcuts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__POINTCUTS = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crosscutting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__CROSSCUTTING = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = StructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.AO.impl.BehavioralAdaptationImpl <em>Behavioral Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.impl.BehavioralAdaptationImpl
	 * @see dercs.AO.impl.AOPackageImpl#getBehavioralAdaptation()
	 * @generated
	 */
	int BEHAVIORAL_ADAPTATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ADAPTATION__NAME = ASPECT_ADAPTATION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ADAPTATION__TAGS = ASPECT_ADAPTATION__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ADAPTATION__OWNER = ASPECT_ADAPTATION__OWNER;

	/**
	 * The number of structural features of the '<em>Behavioral Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ADAPTATION_FEATURE_COUNT = ASPECT_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Behavioral Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ADAPTATION_OPERATION_COUNT = ASPECT_ADAPTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.AO.impl.StructuralAdaptationImpl <em>Structural Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.impl.StructuralAdaptationImpl
	 * @see dercs.AO.impl.AOPackageImpl#getStructuralAdaptation()
	 * @generated
	 */
	int STRUCTURAL_ADAPTATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTATION__NAME = ASPECT_ADAPTATION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTATION__TAGS = ASPECT_ADAPTATION__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTATION__OWNER = ASPECT_ADAPTATION__OWNER;

	/**
	 * The number of structural features of the '<em>Structural Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTATION_FEATURE_COUNT = ASPECT_ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structural Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTATION_OPERATION_COUNT = ASPECT_ADAPTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.AO.impl.JoinPointImpl <em>Join Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.impl.JoinPointImpl
	 * @see dercs.AO.impl.AOPackageImpl#getJoinPoint()
	 * @generated
	 */
	int JOIN_POINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__NAME = StructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__TAGS = StructurePackage.NAMED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Selected Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__SELECTED_ELEMENTS = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__MODEL = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Selection Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__ELEMENT_SELECTION_KIND = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Join Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT_FEATURE_COUNT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Join Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT_OPERATION_COUNT = StructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.AO.impl.PointcutImpl <em>Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.impl.PointcutImpl
	 * @see dercs.AO.impl.AOPackageImpl#getPointcut()
	 * @generated
	 */
	int POINTCUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__NAME = StructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__TAGS = StructurePackage.NAMED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Join Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__JOIN_POINTS = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspect Adaptation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__ASPECT_ADAPTATION = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relative Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__RELATIVE_POSITION = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_FEATURE_COUNT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_OPERATION_COUNT = StructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.AO.impl.CrosscuttingImpl <em>Crosscutting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.impl.CrosscuttingImpl
	 * @see dercs.AO.impl.AOPackageImpl#getCrosscutting()
	 * @generated
	 */
	int CROSSCUTTING = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__NAME = StructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__TAGS = StructurePackage.NAMED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__AFFECTED_ELEMENT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Crosscutting Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__CROSSCUTTING_INFORMATIONS = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associated Aspect</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING__ASSOCIATED_ASPECT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Crosscutting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_FEATURE_COUNT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Crosscutting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_OPERATION_COUNT = StructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.AO.impl.CrosscuttingInformationImpl <em>Crosscutting Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.impl.CrosscuttingInformationImpl
	 * @see dercs.AO.impl.AOPackageImpl#getCrosscuttingInformation()
	 * @generated
	 */
	int CROSSCUTTING_INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_INFORMATION__NAME = StructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_INFORMATION__TAGS = StructurePackage.NAMED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_INFORMATION__VALUE = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Crosscutting Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_INFORMATION_FEATURE_COUNT = StructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Crosscutting Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUTTING_INFORMATION_OPERATION_COUNT = StructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.AO.RelativePosition <em>Relative Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.RelativePosition
	 * @see dercs.AO.impl.AOPackageImpl#getRelativePosition()
	 * @generated
	 */
	int RELATIVE_POSITION = 8;

	/**
	 * The meta object id for the '{@link dercs.AO.ElementSelectionKind <em>Element Selection Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.AO.ElementSelectionKind
	 * @see dercs.AO.impl.AOPackageImpl#getElementSelectionKind()
	 * @generated
	 */
	int ELEMENT_SELECTION_KIND = 9;

	/**
	 * Returns the meta object for class '{@link dercs.AO.AspectAdaptation <em>Aspect Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Adaptation</em>'.
	 * @see dercs.AO.AspectAdaptation
	 * @generated
	 */
	EClass getAspectAdaptation();

	/**
	 * Returns the meta object for the reference '{@link dercs.AO.AspectAdaptation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see dercs.AO.AspectAdaptation#getOwner()
	 * @see #getAspectAdaptation()
	 * @generated
	 */
	EReference getAspectAdaptation_Owner();

	/**
	 * Returns the meta object for class '{@link dercs.AO.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see dercs.AO.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the containment reference list '{@link dercs.AO.Aspect#getStructuralAdaptations <em>Structural Adaptations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structural Adaptations</em>'.
	 * @see dercs.AO.Aspect#getStructuralAdaptations()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_StructuralAdaptations();

	/**
	 * Returns the meta object for the containment reference list '{@link dercs.AO.Aspect#getBehavioralAdaptations <em>Behavioral Adaptations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavioral Adaptations</em>'.
	 * @see dercs.AO.Aspect#getBehavioralAdaptations()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_BehavioralAdaptations();

	/**
	 * Returns the meta object for the reference list '{@link dercs.AO.Aspect#getPointcuts <em>Pointcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pointcuts</em>'.
	 * @see dercs.AO.Aspect#getPointcuts()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Pointcuts();

	/**
	 * Returns the meta object for the containment reference list '{@link dercs.AO.Aspect#getCrosscutting <em>Crosscutting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crosscutting</em>'.
	 * @see dercs.AO.Aspect#getCrosscutting()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Crosscutting();

	/**
	 * Returns the meta object for class '{@link dercs.AO.BehavioralAdaptation <em>Behavioral Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Adaptation</em>'.
	 * @see dercs.AO.BehavioralAdaptation
	 * @generated
	 */
	EClass getBehavioralAdaptation();

	/**
	 * Returns the meta object for class '{@link dercs.AO.StructuralAdaptation <em>Structural Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Adaptation</em>'.
	 * @see dercs.AO.StructuralAdaptation
	 * @generated
	 */
	EClass getStructuralAdaptation();

	/**
	 * Returns the meta object for class '{@link dercs.AO.JoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Point</em>'.
	 * @see dercs.AO.JoinPoint
	 * @generated
	 */
	EClass getJoinPoint();

	/**
	 * Returns the meta object for the reference list '{@link dercs.AO.JoinPoint#getSelectedElements <em>Selected Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Elements</em>'.
	 * @see dercs.AO.JoinPoint#getSelectedElements()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EReference getJoinPoint_SelectedElements();

	/**
	 * Returns the meta object for the reference '{@link dercs.AO.JoinPoint#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see dercs.AO.JoinPoint#getModel()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EReference getJoinPoint_Model();

	/**
	 * Returns the meta object for the attribute '{@link dercs.AO.JoinPoint#getElementSelectionKind <em>Element Selection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Selection Kind</em>'.
	 * @see dercs.AO.JoinPoint#getElementSelectionKind()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EAttribute getJoinPoint_ElementSelectionKind();

	/**
	 * Returns the meta object for class '{@link dercs.AO.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut</em>'.
	 * @see dercs.AO.Pointcut
	 * @generated
	 */
	EClass getPointcut();

	/**
	 * Returns the meta object for the reference list '{@link dercs.AO.Pointcut#getJoinPoints <em>Join Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Join Points</em>'.
	 * @see dercs.AO.Pointcut#getJoinPoints()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_JoinPoints();

	/**
	 * Returns the meta object for the reference '{@link dercs.AO.Pointcut#getAspectAdaptation <em>Aspect Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aspect Adaptation</em>'.
	 * @see dercs.AO.Pointcut#getAspectAdaptation()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_AspectAdaptation();

	/**
	 * Returns the meta object for the attribute '{@link dercs.AO.Pointcut#getRelativePosition <em>Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Position</em>'.
	 * @see dercs.AO.Pointcut#getRelativePosition()
	 * @see #getPointcut()
	 * @generated
	 */
	EAttribute getPointcut_RelativePosition();

	/**
	 * Returns the meta object for class '{@link dercs.AO.Crosscutting <em>Crosscutting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crosscutting</em>'.
	 * @see dercs.AO.Crosscutting
	 * @generated
	 */
	EClass getCrosscutting();

	/**
	 * Returns the meta object for the reference '{@link dercs.AO.Crosscutting#getAffectedElement <em>Affected Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Element</em>'.
	 * @see dercs.AO.Crosscutting#getAffectedElement()
	 * @see #getCrosscutting()
	 * @generated
	 */
	EReference getCrosscutting_AffectedElement();

	/**
	 * Returns the meta object for the reference list '{@link dercs.AO.Crosscutting#getCrosscuttingInformations <em>Crosscutting Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crosscutting Informations</em>'.
	 * @see dercs.AO.Crosscutting#getCrosscuttingInformations()
	 * @see #getCrosscutting()
	 * @generated
	 */
	EReference getCrosscutting_CrosscuttingInformations();

	/**
	 * Returns the meta object for the container reference '{@link dercs.AO.Crosscutting#getAssociatedAspect <em>Associated Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Associated Aspect</em>'.
	 * @see dercs.AO.Crosscutting#getAssociatedAspect()
	 * @see #getCrosscutting()
	 * @generated
	 */
	EReference getCrosscutting_AssociatedAspect();

	/**
	 * Returns the meta object for class '{@link dercs.AO.CrosscuttingInformation <em>Crosscutting Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crosscutting Information</em>'.
	 * @see dercs.AO.CrosscuttingInformation
	 * @generated
	 */
	EClass getCrosscuttingInformation();

	/**
	 * Returns the meta object for the attribute '{@link dercs.AO.CrosscuttingInformation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dercs.AO.CrosscuttingInformation#getValue()
	 * @see #getCrosscuttingInformation()
	 * @generated
	 */
	EAttribute getCrosscuttingInformation_Value();

	/**
	 * Returns the meta object for enum '{@link dercs.AO.RelativePosition <em>Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relative Position</em>'.
	 * @see dercs.AO.RelativePosition
	 * @generated
	 */
	EEnum getRelativePosition();

	/**
	 * Returns the meta object for enum '{@link dercs.AO.ElementSelectionKind <em>Element Selection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Selection Kind</em>'.
	 * @see dercs.AO.ElementSelectionKind
	 * @generated
	 */
	EEnum getElementSelectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AOFactory getAOFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dercs.AO.impl.AspectAdaptationImpl <em>Aspect Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.impl.AspectAdaptationImpl
		 * @see dercs.AO.impl.AOPackageImpl#getAspectAdaptation()
		 * @generated
		 */
		EClass ASPECT_ADAPTATION = eINSTANCE.getAspectAdaptation();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_ADAPTATION__OWNER = eINSTANCE.getAspectAdaptation_Owner();

		/**
		 * The meta object literal for the '{@link dercs.AO.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.impl.AspectImpl
		 * @see dercs.AO.impl.AOPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Structural Adaptations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__STRUCTURAL_ADAPTATIONS = eINSTANCE.getAspect_StructuralAdaptations();

		/**
		 * The meta object literal for the '<em><b>Behavioral Adaptations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__BEHAVIORAL_ADAPTATIONS = eINSTANCE.getAspect_BehavioralAdaptations();

		/**
		 * The meta object literal for the '<em><b>Pointcuts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__POINTCUTS = eINSTANCE.getAspect_Pointcuts();

		/**
		 * The meta object literal for the '<em><b>Crosscutting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__CROSSCUTTING = eINSTANCE.getAspect_Crosscutting();

		/**
		 * The meta object literal for the '{@link dercs.AO.impl.BehavioralAdaptationImpl <em>Behavioral Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.impl.BehavioralAdaptationImpl
		 * @see dercs.AO.impl.AOPackageImpl#getBehavioralAdaptation()
		 * @generated
		 */
		EClass BEHAVIORAL_ADAPTATION = eINSTANCE.getBehavioralAdaptation();

		/**
		 * The meta object literal for the '{@link dercs.AO.impl.StructuralAdaptationImpl <em>Structural Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.impl.StructuralAdaptationImpl
		 * @see dercs.AO.impl.AOPackageImpl#getStructuralAdaptation()
		 * @generated
		 */
		EClass STRUCTURAL_ADAPTATION = eINSTANCE.getStructuralAdaptation();

		/**
		 * The meta object literal for the '{@link dercs.AO.impl.JoinPointImpl <em>Join Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.impl.JoinPointImpl
		 * @see dercs.AO.impl.AOPackageImpl#getJoinPoint()
		 * @generated
		 */
		EClass JOIN_POINT = eINSTANCE.getJoinPoint();

		/**
		 * The meta object literal for the '<em><b>Selected Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT__SELECTED_ELEMENTS = eINSTANCE.getJoinPoint_SelectedElements();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT__MODEL = eINSTANCE.getJoinPoint_Model();

		/**
		 * The meta object literal for the '<em><b>Element Selection Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_POINT__ELEMENT_SELECTION_KIND = eINSTANCE.getJoinPoint_ElementSelectionKind();

		/**
		 * The meta object literal for the '{@link dercs.AO.impl.PointcutImpl <em>Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.impl.PointcutImpl
		 * @see dercs.AO.impl.AOPackageImpl#getPointcut()
		 * @generated
		 */
		EClass POINTCUT = eINSTANCE.getPointcut();

		/**
		 * The meta object literal for the '<em><b>Join Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__JOIN_POINTS = eINSTANCE.getPointcut_JoinPoints();

		/**
		 * The meta object literal for the '<em><b>Aspect Adaptation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__ASPECT_ADAPTATION = eINSTANCE.getPointcut_AspectAdaptation();

		/**
		 * The meta object literal for the '<em><b>Relative Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTCUT__RELATIVE_POSITION = eINSTANCE.getPointcut_RelativePosition();

		/**
		 * The meta object literal for the '{@link dercs.AO.impl.CrosscuttingImpl <em>Crosscutting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.impl.CrosscuttingImpl
		 * @see dercs.AO.impl.AOPackageImpl#getCrosscutting()
		 * @generated
		 */
		EClass CROSSCUTTING = eINSTANCE.getCrosscutting();

		/**
		 * The meta object literal for the '<em><b>Affected Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUTTING__AFFECTED_ELEMENT = eINSTANCE.getCrosscutting_AffectedElement();

		/**
		 * The meta object literal for the '<em><b>Crosscutting Informations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUTTING__CROSSCUTTING_INFORMATIONS = eINSTANCE.getCrosscutting_CrosscuttingInformations();

		/**
		 * The meta object literal for the '<em><b>Associated Aspect</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUTTING__ASSOCIATED_ASPECT = eINSTANCE.getCrosscutting_AssociatedAspect();

		/**
		 * The meta object literal for the '{@link dercs.AO.impl.CrosscuttingInformationImpl <em>Crosscutting Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.impl.CrosscuttingInformationImpl
		 * @see dercs.AO.impl.AOPackageImpl#getCrosscuttingInformation()
		 * @generated
		 */
		EClass CROSSCUTTING_INFORMATION = eINSTANCE.getCrosscuttingInformation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSCUTTING_INFORMATION__VALUE = eINSTANCE.getCrosscuttingInformation_Value();

		/**
		 * The meta object literal for the '{@link dercs.AO.RelativePosition <em>Relative Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.RelativePosition
		 * @see dercs.AO.impl.AOPackageImpl#getRelativePosition()
		 * @generated
		 */
		EEnum RELATIVE_POSITION = eINSTANCE.getRelativePosition();

		/**
		 * The meta object literal for the '{@link dercs.AO.ElementSelectionKind <em>Element Selection Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.AO.ElementSelectionKind
		 * @see dercs.AO.impl.AOPackageImpl#getElementSelectionKind()
		 * @generated
		 */
		EEnum ELEMENT_SELECTION_KIND = eINSTANCE.getElementSelectionKind();

	}

} //AOPackage
