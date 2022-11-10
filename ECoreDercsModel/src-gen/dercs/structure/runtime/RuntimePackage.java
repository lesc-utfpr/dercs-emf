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
package dercs.structure.runtime;

import dercs.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see dercs.structure.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://utfpr.edu.br/dercs/structure/runtime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = dercs.structure.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.RuntimeElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.RuntimeElementImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getRuntimeElement()
	 * @generated
	 */
	int RUNTIME_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__NAME = StructurePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__TAGS = StructurePackage.BASE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__STATIC = StructurePackage.BASE_ELEMENT__STATIC;

	/**
	 * The feature id for the '<em><b>Associated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__ASSOCIATED_ELEMENT = StructurePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT_FEATURE_COUNT = StructurePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT___IS_OBJECT = StructurePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT_OPERATION_COUNT = StructurePackage.BASE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.NodeImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = StructurePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TAGS = StructurePackage.BASE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STATIC = StructurePackage.BASE_ELEMENT__STATIC;

	/**
	 * The feature id for the '<em><b>Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PLATFORM_NAME = StructurePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployed Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DEPLOYED_OBJECTS = StructurePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = StructurePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = StructurePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.ObjectImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = RUNTIME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TAGS = RUNTIME_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__STATIC = RUNTIME_ELEMENT__STATIC;

	/**
	 * The feature id for the '<em><b>Associated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ASSOCIATED_ELEMENT = RUNTIME_ELEMENT__ASSOCIATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NODE = RUNTIME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Of Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__INSTANCE_OF_CLASS = RUNTIME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runtime Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__RUNTIME_INFORMATION = RUNTIME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = RUNTIME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT___IS_OBJECT = RUNTIME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = RUNTIME_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.StateImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.RuntimeInformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.RuntimeInformationImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getRuntimeInformation()
	 * @generated
	 */
	int RUNTIME_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION__ARRAY = 1;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.ParameterRuntimeInformationImpl <em>Parameter Runtime Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.ParameterRuntimeInformationImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getParameterRuntimeInformation()
	 * @generated
	 */
	int PARAMETER_RUNTIME_INFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RUNTIME_INFORMATION__VALUE = RUNTIME_INFORMATION__VALUE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RUNTIME_INFORMATION__ARRAY = RUNTIME_INFORMATION__ARRAY;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RUNTIME_INFORMATION__PARAMETER = RUNTIME_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Runtime Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RUNTIME_INFORMATION_FEATURE_COUNT = RUNTIME_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Runtime Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_RUNTIME_INFORMATION_OPERATION_COUNT = RUNTIME_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.PassiveObjectImpl <em>Passive Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.PassiveObjectImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getPassiveObject()
	 * @generated
	 */
	int PASSIVE_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT__TAGS = OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT__STATIC = OBJECT__STATIC;

	/**
	 * The feature id for the '<em><b>Associated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT__ASSOCIATED_ELEMENT = OBJECT__ASSOCIATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT__NODE = OBJECT__NODE;

	/**
	 * The feature id for the '<em><b>Instance Of Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT__INSTANCE_OF_CLASS = OBJECT__INSTANCE_OF_CLASS;

	/**
	 * The feature id for the '<em><b>Runtime Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT__RUNTIME_INFORMATION = OBJECT__RUNTIME_INFORMATION;

	/**
	 * The number of structural features of the '<em>Passive Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT___IS_OBJECT = OBJECT___IS_OBJECT;

	/**
	 * The number of operations of the '<em>Passive Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OBJECT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.ActiveObjectImpl <em>Active Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.ActiveObjectImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getActiveObject()
	 * @generated
	 */
	int ACTIVE_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT__TAGS = OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT__STATIC = OBJECT__STATIC;

	/**
	 * The feature id for the '<em><b>Associated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT__ASSOCIATED_ELEMENT = OBJECT__ASSOCIATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT__NODE = OBJECT__NODE;

	/**
	 * The feature id for the '<em><b>Instance Of Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT__INSTANCE_OF_CLASS = OBJECT__INSTANCE_OF_CLASS;

	/**
	 * The feature id for the '<em><b>Runtime Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT__RUNTIME_INFORMATION = OBJECT__RUNTIME_INFORMATION;

	/**
	 * The feature id for the '<em><b>Main Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT__MAIN_BEHAVIOUR = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT___IS_OBJECT = OBJECT___IS_OBJECT;

	/**
	 * The number of operations of the '<em>Active Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OBJECT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.AttributeRuntimeInformationImpl <em>Attribute Runtime Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.AttributeRuntimeInformationImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getAttributeRuntimeInformation()
	 * @generated
	 */
	int ATTRIBUTE_RUNTIME_INFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RUNTIME_INFORMATION__VALUE = RUNTIME_INFORMATION__VALUE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RUNTIME_INFORMATION__ARRAY = RUNTIME_INFORMATION__ARRAY;

	/**
	 * The feature id for the '<em><b>Related Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT = RUNTIME_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE = RUNTIME_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Runtime Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RUNTIME_INFORMATION_FEATURE_COUNT = RUNTIME_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Runtime Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RUNTIME_INFORMATION_OPERATION_COUNT = RUNTIME_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.structure.runtime.impl.LocalVariableRuntimeInformationImpl <em>Local Variable Runtime Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.structure.runtime.impl.LocalVariableRuntimeInformationImpl
	 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getLocalVariableRuntimeInformation()
	 * @generated
	 */
	int LOCAL_VARIABLE_RUNTIME_INFORMATION = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_RUNTIME_INFORMATION__VALUE = RUNTIME_INFORMATION__VALUE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_RUNTIME_INFORMATION__ARRAY = RUNTIME_INFORMATION__ARRAY;

	/**
	 * The feature id for the '<em><b>Local Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE = RUNTIME_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Variable Runtime Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_RUNTIME_INFORMATION_FEATURE_COUNT = RUNTIME_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local Variable Runtime Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_RUNTIME_INFORMATION_OPERATION_COUNT = RUNTIME_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.RuntimeElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see dercs.structure.runtime.RuntimeElement
	 * @generated
	 */
	EClass getRuntimeElement();

	/**
	 * Returns the meta object for the reference '{@link dercs.structure.runtime.RuntimeElement#getAssociatedElement <em>Associated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Element</em>'.
	 * @see dercs.structure.runtime.RuntimeElement#getAssociatedElement()
	 * @see #getRuntimeElement()
	 * @generated
	 */
	EReference getRuntimeElement_AssociatedElement();

	/**
	 * Returns the meta object for the '{@link dercs.structure.runtime.RuntimeElement#isObject() <em>Is Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Object</em>' operation.
	 * @see dercs.structure.runtime.RuntimeElement#isObject()
	 * @generated
	 */
	EOperation getRuntimeElement__IsObject();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see dercs.structure.runtime.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link dercs.structure.runtime.Node#getPlatformName <em>Platform Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Name</em>'.
	 * @see dercs.structure.runtime.Node#getPlatformName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_PlatformName();

	/**
	 * Returns the meta object for the containment reference list '{@link dercs.structure.runtime.Node#getDeployedObjects <em>Deployed Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Objects</em>'.
	 * @see dercs.structure.runtime.Node#getDeployedObjects()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_DeployedObjects();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see dercs.structure.runtime.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the container reference '{@link dercs.structure.runtime.Object#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see dercs.structure.runtime.Object#getNode()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Node();

	/**
	 * Returns the meta object for the reference '{@link dercs.structure.runtime.Object#getInstanceOfClass <em>Instance Of Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of Class</em>'.
	 * @see dercs.structure.runtime.Object#getInstanceOfClass()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_InstanceOfClass();

	/**
	 * Returns the meta object for the reference list '{@link dercs.structure.runtime.Object#getRuntimeInformation <em>Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runtime Information</em>'.
	 * @see dercs.structure.runtime.Object#getRuntimeInformation()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_RuntimeInformation();

	/**
	 * Returns the meta object for the '{@link dercs.structure.runtime.Object#isObject() <em>Is Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Object</em>' operation.
	 * @see dercs.structure.runtime.Object#isObject()
	 * @generated
	 */
	EOperation getObject__IsObject();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see dercs.structure.runtime.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link dercs.structure.runtime.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dercs.structure.runtime.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.RuntimeInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see dercs.structure.runtime.RuntimeInformation
	 * @generated
	 */
	EClass getRuntimeInformation();

	/**
	 * Returns the meta object for the attribute '{@link dercs.structure.runtime.RuntimeInformation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dercs.structure.runtime.RuntimeInformation#getValue()
	 * @see #getRuntimeInformation()
	 * @generated
	 */
	EAttribute getRuntimeInformation_Value();

	/**
	 * Returns the meta object for the attribute '{@link dercs.structure.runtime.RuntimeInformation#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see dercs.structure.runtime.RuntimeInformation#getArray()
	 * @see #getRuntimeInformation()
	 * @generated
	 */
	EAttribute getRuntimeInformation_Array();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.ParameterRuntimeInformation <em>Parameter Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Runtime Information</em>'.
	 * @see dercs.structure.runtime.ParameterRuntimeInformation
	 * @generated
	 */
	EClass getParameterRuntimeInformation();

	/**
	 * Returns the meta object for the reference '{@link dercs.structure.runtime.ParameterRuntimeInformation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see dercs.structure.runtime.ParameterRuntimeInformation#getParameter()
	 * @see #getParameterRuntimeInformation()
	 * @generated
	 */
	EReference getParameterRuntimeInformation_Parameter();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.PassiveObject <em>Passive Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Object</em>'.
	 * @see dercs.structure.runtime.PassiveObject
	 * @generated
	 */
	EClass getPassiveObject();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.ActiveObject <em>Active Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Object</em>'.
	 * @see dercs.structure.runtime.ActiveObject
	 * @generated
	 */
	EClass getActiveObject();

	/**
	 * Returns the meta object for the reference '{@link dercs.structure.runtime.ActiveObject#getMainBehaviour <em>Main Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Behaviour</em>'.
	 * @see dercs.structure.runtime.ActiveObject#getMainBehaviour()
	 * @see #getActiveObject()
	 * @generated
	 */
	EReference getActiveObject_MainBehaviour();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.AttributeRuntimeInformation <em>Attribute Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Runtime Information</em>'.
	 * @see dercs.structure.runtime.AttributeRuntimeInformation
	 * @generated
	 */
	EClass getAttributeRuntimeInformation();

	/**
	 * Returns the meta object for the reference '{@link dercs.structure.runtime.AttributeRuntimeInformation#getRelatedObject <em>Related Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Object</em>'.
	 * @see dercs.structure.runtime.AttributeRuntimeInformation#getRelatedObject()
	 * @see #getAttributeRuntimeInformation()
	 * @generated
	 */
	EReference getAttributeRuntimeInformation_RelatedObject();

	/**
	 * Returns the meta object for the reference '{@link dercs.structure.runtime.AttributeRuntimeInformation#getRelatedAttribute <em>Related Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Attribute</em>'.
	 * @see dercs.structure.runtime.AttributeRuntimeInformation#getRelatedAttribute()
	 * @see #getAttributeRuntimeInformation()
	 * @generated
	 */
	EReference getAttributeRuntimeInformation_RelatedAttribute();

	/**
	 * Returns the meta object for class '{@link dercs.structure.runtime.LocalVariableRuntimeInformation <em>Local Variable Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable Runtime Information</em>'.
	 * @see dercs.structure.runtime.LocalVariableRuntimeInformation
	 * @generated
	 */
	EClass getLocalVariableRuntimeInformation();

	/**
	 * Returns the meta object for the reference '{@link dercs.structure.runtime.LocalVariableRuntimeInformation#getLocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Variable</em>'.
	 * @see dercs.structure.runtime.LocalVariableRuntimeInformation#getLocalVariable()
	 * @see #getLocalVariableRuntimeInformation()
	 * @generated
	 */
	EReference getLocalVariableRuntimeInformation_LocalVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.RuntimeElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.RuntimeElementImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getRuntimeElement()
		 * @generated
		 */
		EClass RUNTIME_ELEMENT = eINSTANCE.getRuntimeElement();

		/**
		 * The meta object literal for the '<em><b>Associated Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_ELEMENT__ASSOCIATED_ELEMENT = eINSTANCE.getRuntimeElement_AssociatedElement();

		/**
		 * The meta object literal for the '<em><b>Is Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUNTIME_ELEMENT___IS_OBJECT = eINSTANCE.getRuntimeElement__IsObject();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.NodeImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Platform Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PLATFORM_NAME = eINSTANCE.getNode_PlatformName();

		/**
		 * The meta object literal for the '<em><b>Deployed Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__DEPLOYED_OBJECTS = eINSTANCE.getNode_DeployedObjects();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.ObjectImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__NODE = eINSTANCE.getObject_Node();

		/**
		 * The meta object literal for the '<em><b>Instance Of Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__INSTANCE_OF_CLASS = eINSTANCE.getObject_InstanceOfClass();

		/**
		 * The meta object literal for the '<em><b>Runtime Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__RUNTIME_INFORMATION = eINSTANCE.getObject_RuntimeInformation();

		/**
		 * The meta object literal for the '<em><b>Is Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT___IS_OBJECT = eINSTANCE.getObject__IsObject();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.StateImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.RuntimeInformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.RuntimeInformationImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getRuntimeInformation()
		 * @generated
		 */
		EClass RUNTIME_INFORMATION = eINSTANCE.getRuntimeInformation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INFORMATION__VALUE = eINSTANCE.getRuntimeInformation_Value();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INFORMATION__ARRAY = eINSTANCE.getRuntimeInformation_Array();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.ParameterRuntimeInformationImpl <em>Parameter Runtime Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.ParameterRuntimeInformationImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getParameterRuntimeInformation()
		 * @generated
		 */
		EClass PARAMETER_RUNTIME_INFORMATION = eINSTANCE.getParameterRuntimeInformation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_RUNTIME_INFORMATION__PARAMETER = eINSTANCE.getParameterRuntimeInformation_Parameter();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.PassiveObjectImpl <em>Passive Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.PassiveObjectImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getPassiveObject()
		 * @generated
		 */
		EClass PASSIVE_OBJECT = eINSTANCE.getPassiveObject();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.ActiveObjectImpl <em>Active Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.ActiveObjectImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getActiveObject()
		 * @generated
		 */
		EClass ACTIVE_OBJECT = eINSTANCE.getActiveObject();

		/**
		 * The meta object literal for the '<em><b>Main Behaviour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_OBJECT__MAIN_BEHAVIOUR = eINSTANCE.getActiveObject_MainBehaviour();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.AttributeRuntimeInformationImpl <em>Attribute Runtime Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.AttributeRuntimeInformationImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getAttributeRuntimeInformation()
		 * @generated
		 */
		EClass ATTRIBUTE_RUNTIME_INFORMATION = eINSTANCE.getAttributeRuntimeInformation();

		/**
		 * The meta object literal for the '<em><b>Related Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT = eINSTANCE
				.getAttributeRuntimeInformation_RelatedObject();

		/**
		 * The meta object literal for the '<em><b>Related Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE = eINSTANCE
				.getAttributeRuntimeInformation_RelatedAttribute();

		/**
		 * The meta object literal for the '{@link dercs.structure.runtime.impl.LocalVariableRuntimeInformationImpl <em>Local Variable Runtime Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.structure.runtime.impl.LocalVariableRuntimeInformationImpl
		 * @see dercs.structure.runtime.impl.RuntimePackageImpl#getLocalVariableRuntimeInformation()
		 * @generated
		 */
		EClass LOCAL_VARIABLE_RUNTIME_INFORMATION = eINSTANCE.getLocalVariableRuntimeInformation();

		/**
		 * The meta object literal for the '<em><b>Local Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE = eINSTANCE
				.getLocalVariableRuntimeInformation_LocalVariable();

	}

} //RuntimePackage
