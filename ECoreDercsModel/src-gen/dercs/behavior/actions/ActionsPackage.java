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
package dercs.behavior.actions;

import dercs.behavior.BehaviorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see dercs.behavior.actions.ActionsFactory
 * @model kind="package"
 * @generated
 */
public interface ActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "actions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://utfpr.edu.br/dercs/behavior/actions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "actions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsPackage eINSTANCE = dercs.behavior.actions.impl.ActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.ActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = BehaviorPackage.BEHAVIORAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TAGS = BehaviorPackage.BEHAVIORAL_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STATIC = BehaviorPackage.BEHAVIORAL_ELEMENT__STATIC;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BehaviorPackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = BehaviorPackage.BEHAVIORAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.ActionWithOutputImpl <em>Action With Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.ActionWithOutputImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getActionWithOutput()
	 * @generated
	 */
	int ACTION_WITH_OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_WITH_OUTPUT__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_WITH_OUTPUT__TAGS = ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_WITH_OUTPUT__STATIC = ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action With Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_WITH_OUTPUT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action With Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_WITH_OUTPUT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.SendMessageActionImpl <em>Send Message Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.SendMessageActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getSendMessageAction()
	 * @generated
	 */
	int SEND_MESSAGE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__NAME = ACTION_WITH_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__TAGS = ACTION_WITH_OUTPUT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__STATIC = ACTION_WITH_OUTPUT__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__OUTPUT_RECEIVER_ACTION = ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Related Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__RELATED_METHOD = ACTION_WITH_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__FROM_OBJECT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__TO_OBJECT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__PARAMETER_VALUES = ACTION_WITH_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__MESSAGE_SORT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Send Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION_FEATURE_COUNT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Send Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION_OPERATION_COUNT = ACTION_WITH_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.ArrayActionImpl <em>Array Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.ArrayActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getArrayAction()
	 * @generated
	 */
	int ARRAY_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION__NAME = ACTION_WITH_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION__TAGS = ACTION_WITH_OUTPUT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION__STATIC = ACTION_WITH_OUTPUT__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION__OUTPUT_RECEIVER_ACTION = ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Array Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION__ARRAY_VARIABLE = ACTION_WITH_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION__ARRAY_ELEMENT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Array Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION__ARRAY_ATTRIBUTE = ACTION_WITH_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Array Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION__ARRAY_OBJECT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Array Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION_FEATURE_COUNT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Array Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACTION_OPERATION_COUNT = ACTION_WITH_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.ObjectActionImpl <em>Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.ObjectActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getObjectAction()
	 * @generated
	 */
	int OBJECT_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__NAME = ACTION_WITH_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__TAGS = ACTION_WITH_OUTPUT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__STATIC = ACTION_WITH_OUTPUT__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__OUTPUT_RECEIVER_ACTION = ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Related Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__RELATED_OBJECT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION_FEATURE_COUNT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION_OPERATION_COUNT = ACTION_WITH_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.CreateObjectActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getCreateObjectAction()
	 * @generated
	 */
	int CREATE_OBJECT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__NAME = OBJECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__TAGS = OBJECT_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__STATIC = OBJECT_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OUTPUT_RECEIVER_ACTION = OBJECT_ACTION__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Related Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__RELATED_OBJECT = OBJECT_ACTION__RELATED_OBJECT;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__PARAMETER_VALUES = OBJECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_FEATURE_COUNT = OBJECT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_OPERATION_COUNT = OBJECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.DestroyObjectActionImpl <em>Destroy Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.DestroyObjectActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getDestroyObjectAction()
	 * @generated
	 */
	int DESTROY_OBJECT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__NAME = OBJECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__TAGS = OBJECT_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__STATIC = OBJECT_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OUTPUT_RECEIVER_ACTION = OBJECT_ACTION__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Related Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__RELATED_OBJECT = OBJECT_ACTION__RELATED_OBJECT;

	/**
	 * The number of structural features of the '<em>Destroy Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION_FEATURE_COUNT = OBJECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Destroy Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION_OPERATION_COUNT = OBJECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.GetArrayElementActionImpl <em>Get Array Element Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.GetArrayElementActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getGetArrayElementAction()
	 * @generated
	 */
	int GET_ARRAY_ELEMENT_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION__NAME = ARRAY_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION__TAGS = ARRAY_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION__STATIC = ARRAY_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION__OUTPUT_RECEIVER_ACTION = ARRAY_ACTION__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Array Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION__ARRAY_VARIABLE = ARRAY_ACTION__ARRAY_VARIABLE;

	/**
	 * The feature id for the '<em><b>Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION__ARRAY_ELEMENT = ARRAY_ACTION__ARRAY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Array Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION__ARRAY_ATTRIBUTE = ARRAY_ACTION__ARRAY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Array Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION__ARRAY_OBJECT = ARRAY_ACTION__ARRAY_OBJECT;

	/**
	 * The number of structural features of the '<em>Get Array Element Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION_FEATURE_COUNT = ARRAY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Array Element Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_ELEMENT_ACTION_OPERATION_COUNT = ARRAY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.GetArrayLengthActionImpl <em>Get Array Length Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.GetArrayLengthActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getGetArrayLengthAction()
	 * @generated
	 */
	int GET_ARRAY_LENGTH_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION__NAME = ARRAY_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION__TAGS = ARRAY_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION__STATIC = ARRAY_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION__OUTPUT_RECEIVER_ACTION = ARRAY_ACTION__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Array Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION__ARRAY_VARIABLE = ARRAY_ACTION__ARRAY_VARIABLE;

	/**
	 * The feature id for the '<em><b>Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION__ARRAY_ELEMENT = ARRAY_ACTION__ARRAY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Array Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION__ARRAY_ATTRIBUTE = ARRAY_ACTION__ARRAY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Array Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION__ARRAY_OBJECT = ARRAY_ACTION__ARRAY_OBJECT;

	/**
	 * The number of structural features of the '<em>Get Array Length Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION_FEATURE_COUNT = ARRAY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Array Length Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ARRAY_LENGTH_ACTION_OPERATION_COUNT = ARRAY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.InsertArrayElementActionImpl <em>Insert Array Element Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.InsertArrayElementActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getInsertArrayElementAction()
	 * @generated
	 */
	int INSERT_ARRAY_ELEMENT_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__NAME = ARRAY_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__TAGS = ARRAY_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__STATIC = ARRAY_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__OUTPUT_RECEIVER_ACTION = ARRAY_ACTION__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Array Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__ARRAY_VARIABLE = ARRAY_ACTION__ARRAY_VARIABLE;

	/**
	 * The feature id for the '<em><b>Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__ARRAY_ELEMENT = ARRAY_ACTION__ARRAY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Array Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__ARRAY_ATTRIBUTE = ARRAY_ACTION__ARRAY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Array Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__ARRAY_OBJECT = ARRAY_ACTION__ARRAY_OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION__VALUE = ARRAY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insert Array Element Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION_FEATURE_COUNT = ARRAY_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Insert Array Element Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ARRAY_ELEMENT_ACTION_OPERATION_COUNT = ARRAY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.RemoveArrayElementActionImpl <em>Remove Array Element Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.RemoveArrayElementActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getRemoveArrayElementAction()
	 * @generated
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION__NAME = ARRAY_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION__TAGS = ARRAY_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION__STATIC = ARRAY_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION__OUTPUT_RECEIVER_ACTION = ARRAY_ACTION__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Array Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION__ARRAY_VARIABLE = ARRAY_ACTION__ARRAY_VARIABLE;

	/**
	 * The feature id for the '<em><b>Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION__ARRAY_ELEMENT = ARRAY_ACTION__ARRAY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Array Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION__ARRAY_ATTRIBUTE = ARRAY_ACTION__ARRAY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Array Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION__ARRAY_OBJECT = ARRAY_ACTION__ARRAY_OBJECT;

	/**
	 * The number of structural features of the '<em>Remove Array Element Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION_FEATURE_COUNT = ARRAY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove Array Element Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ARRAY_ELEMENT_ACTION_OPERATION_COUNT = ARRAY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.SetArrayElementActionImpl <em>Set Array Element Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.SetArrayElementActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getSetArrayElementAction()
	 * @generated
	 */
	int SET_ARRAY_ELEMENT_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__NAME = ARRAY_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__TAGS = ARRAY_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__STATIC = ARRAY_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__OUTPUT_RECEIVER_ACTION = ARRAY_ACTION__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Array Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__ARRAY_VARIABLE = ARRAY_ACTION__ARRAY_VARIABLE;

	/**
	 * The feature id for the '<em><b>Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__ARRAY_ELEMENT = ARRAY_ACTION__ARRAY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Array Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__ARRAY_ATTRIBUTE = ARRAY_ACTION__ARRAY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Array Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__ARRAY_OBJECT = ARRAY_ACTION__ARRAY_OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION__VALUE = ARRAY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Array Element Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION_FEATURE_COUNT = ARRAY_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Array Element Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ARRAY_ELEMENT_ACTION_OPERATION_COUNT = ARRAY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.ReturnActionImpl <em>Return Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.ReturnActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getReturnAction()
	 * @generated
	 */
	int RETURN_ACTION = 12;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.ModifyStateActionImpl <em>Modify State Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.ModifyStateActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getModifyStateAction()
	 * @generated
	 */
	int MODIFY_STATE_ACTION = 13;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.ExpressionActionImpl <em>Expression Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.ExpressionActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getExpressionAction()
	 * @generated
	 */
	int EXPRESSION_ACTION = 14;

	/**
	 * The meta object id for the '{@link dercs.behavior.actions.impl.AssignmentActionImpl <em>Assignment Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dercs.behavior.actions.impl.AssignmentActionImpl
	 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getAssignmentAction()
	 * @generated
	 */
	int ASSIGNMENT_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__TAGS = ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__STATIC = ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__DESTINATION_VARIABLE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__DESTINATION_OBJECT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Result Of Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION__RESULT_OF_ACTION = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Assignment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Assignment Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__NAME = ASSIGNMENT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__TAGS = ASSIGNMENT_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__STATIC = ASSIGNMENT_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__VALUE = ASSIGNMENT_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Destination Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__DESTINATION_VARIABLE = ASSIGNMENT_ACTION__DESTINATION_VARIABLE;

	/**
	 * The feature id for the '<em><b>Destination Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__DESTINATION_ATTRIBUTE = ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Destination Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__DESTINATION_OBJECT = ASSIGNMENT_ACTION__DESTINATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Destination Array Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__DESTINATION_ARRAY_ELEMENT = ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Result Of Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__RESULT_OF_ACTION = ASSIGNMENT_ACTION__RESULT_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION__METHOD = ASSIGNMENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION_FEATURE_COUNT = ASSIGNMENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ACTION_OPERATION_COUNT = ASSIGNMENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STATE_ACTION__NAME = OBJECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STATE_ACTION__TAGS = OBJECT_ACTION__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STATE_ACTION__STATIC = OBJECT_ACTION__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STATE_ACTION__OUTPUT_RECEIVER_ACTION = OBJECT_ACTION__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Related Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STATE_ACTION__RELATED_OBJECT = OBJECT_ACTION__RELATED_OBJECT;

	/**
	 * The feature id for the '<em><b>Related Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STATE_ACTION__RELATED_TRANSITION = OBJECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modify State Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STATE_ACTION_FEATURE_COUNT = OBJECT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modify State Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STATE_ACTION_OPERATION_COUNT = OBJECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION__NAME = ACTION_WITH_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION__TAGS = ACTION_WITH_OUTPUT__TAGS;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION__STATIC = ACTION_WITH_OUTPUT__STATIC;

	/**
	 * The feature id for the '<em><b>Output Receiver Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION__OUTPUT_RECEIVER_ACTION = ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION__EXPRESSION = ACTION_WITH_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION_FEATURE_COUNT = ACTION_WITH_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION_OPERATION_COUNT = ACTION_WITH_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dercs.behavior.actions.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.ActionWithOutput <em>Action With Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action With Output</em>'.
	 * @see dercs.behavior.actions.ActionWithOutput
	 * @generated
	 */
	EClass getActionWithOutput();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.ActionWithOutput#getOutputReceiverAction <em>Output Receiver Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Receiver Action</em>'.
	 * @see dercs.behavior.actions.ActionWithOutput#getOutputReceiverAction()
	 * @see #getActionWithOutput()
	 * @generated
	 */
	EReference getActionWithOutput_OutputReceiverAction();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.SendMessageAction <em>Send Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message Action</em>'.
	 * @see dercs.behavior.actions.SendMessageAction
	 * @generated
	 */
	EClass getSendMessageAction();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.SendMessageAction#getRelatedMethod <em>Related Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Method</em>'.
	 * @see dercs.behavior.actions.SendMessageAction#getRelatedMethod()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EReference getSendMessageAction_RelatedMethod();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.SendMessageAction#getFromObject <em>From Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Object</em>'.
	 * @see dercs.behavior.actions.SendMessageAction#getFromObject()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EReference getSendMessageAction_FromObject();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.SendMessageAction#getToObject <em>To Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Object</em>'.
	 * @see dercs.behavior.actions.SendMessageAction#getToObject()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EReference getSendMessageAction_ToObject();

	/**
	 * Returns the meta object for the attribute list '{@link dercs.behavior.actions.SendMessageAction#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Values</em>'.
	 * @see dercs.behavior.actions.SendMessageAction#getParameterValues()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EAttribute getSendMessageAction_ParameterValues();

	/**
	 * Returns the meta object for the attribute '{@link dercs.behavior.actions.SendMessageAction#getMessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see dercs.behavior.actions.SendMessageAction#getMessageSort()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EAttribute getSendMessageAction_MessageSort();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.ArrayAction <em>Array Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Action</em>'.
	 * @see dercs.behavior.actions.ArrayAction
	 * @generated
	 */
	EClass getArrayAction();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.ArrayAction#getArrayVariable <em>Array Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Variable</em>'.
	 * @see dercs.behavior.actions.ArrayAction#getArrayVariable()
	 * @see #getArrayAction()
	 * @generated
	 */
	EReference getArrayAction_ArrayVariable();

	/**
	 * Returns the meta object for the attribute '{@link dercs.behavior.actions.ArrayAction#getArrayElement <em>Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Element</em>'.
	 * @see dercs.behavior.actions.ArrayAction#getArrayElement()
	 * @see #getArrayAction()
	 * @generated
	 */
	EAttribute getArrayAction_ArrayElement();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.ArrayAction#getArrayAttribute <em>Array Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Attribute</em>'.
	 * @see dercs.behavior.actions.ArrayAction#getArrayAttribute()
	 * @see #getArrayAction()
	 * @generated
	 */
	EReference getArrayAction_ArrayAttribute();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.ArrayAction#getArrayObject <em>Array Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Object</em>'.
	 * @see dercs.behavior.actions.ArrayAction#getArrayObject()
	 * @see #getArrayAction()
	 * @generated
	 */
	EReference getArrayAction_ArrayObject();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.ObjectAction <em>Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Action</em>'.
	 * @see dercs.behavior.actions.ObjectAction
	 * @generated
	 */
	EClass getObjectAction();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.ObjectAction#getRelatedObject <em>Related Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Object</em>'.
	 * @see dercs.behavior.actions.ObjectAction#getRelatedObject()
	 * @see #getObjectAction()
	 * @generated
	 */
	EReference getObjectAction_RelatedObject();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Object Action</em>'.
	 * @see dercs.behavior.actions.CreateObjectAction
	 * @generated
	 */
	EClass getCreateObjectAction();

	/**
	 * Returns the meta object for the attribute list '{@link dercs.behavior.actions.CreateObjectAction#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Values</em>'.
	 * @see dercs.behavior.actions.CreateObjectAction#getParameterValues()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EAttribute getCreateObjectAction_ParameterValues();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Object Action</em>'.
	 * @see dercs.behavior.actions.DestroyObjectAction
	 * @generated
	 */
	EClass getDestroyObjectAction();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.GetArrayElementAction <em>Get Array Element Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Array Element Action</em>'.
	 * @see dercs.behavior.actions.GetArrayElementAction
	 * @generated
	 */
	EClass getGetArrayElementAction();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.GetArrayLengthAction <em>Get Array Length Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Array Length Action</em>'.
	 * @see dercs.behavior.actions.GetArrayLengthAction
	 * @generated
	 */
	EClass getGetArrayLengthAction();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.InsertArrayElementAction <em>Insert Array Element Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Array Element Action</em>'.
	 * @see dercs.behavior.actions.InsertArrayElementAction
	 * @generated
	 */
	EClass getInsertArrayElementAction();

	/**
	 * Returns the meta object for the attribute '{@link dercs.behavior.actions.InsertArrayElementAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dercs.behavior.actions.InsertArrayElementAction#getValue()
	 * @see #getInsertArrayElementAction()
	 * @generated
	 */
	EAttribute getInsertArrayElementAction_Value();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.RemoveArrayElementAction <em>Remove Array Element Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Array Element Action</em>'.
	 * @see dercs.behavior.actions.RemoveArrayElementAction
	 * @generated
	 */
	EClass getRemoveArrayElementAction();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.SetArrayElementAction <em>Set Array Element Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Array Element Action</em>'.
	 * @see dercs.behavior.actions.SetArrayElementAction
	 * @generated
	 */
	EClass getSetArrayElementAction();

	/**
	 * Returns the meta object for the attribute '{@link dercs.behavior.actions.SetArrayElementAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dercs.behavior.actions.SetArrayElementAction#getValue()
	 * @see #getSetArrayElementAction()
	 * @generated
	 */
	EAttribute getSetArrayElementAction_Value();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.ReturnAction <em>Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Action</em>'.
	 * @see dercs.behavior.actions.ReturnAction
	 * @generated
	 */
	EClass getReturnAction();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.ReturnAction#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see dercs.behavior.actions.ReturnAction#getMethod()
	 * @see #getReturnAction()
	 * @generated
	 */
	EReference getReturnAction_Method();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.ModifyStateAction <em>Modify State Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify State Action</em>'.
	 * @see dercs.behavior.actions.ModifyStateAction
	 * @generated
	 */
	EClass getModifyStateAction();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.ModifyStateAction#getRelatedTransition <em>Related Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Transition</em>'.
	 * @see dercs.behavior.actions.ModifyStateAction#getRelatedTransition()
	 * @see #getModifyStateAction()
	 * @generated
	 */
	EReference getModifyStateAction_RelatedTransition();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.ExpressionAction <em>Expression Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Action</em>'.
	 * @see dercs.behavior.actions.ExpressionAction
	 * @generated
	 */
	EClass getExpressionAction();

	/**
	 * Returns the meta object for the attribute '{@link dercs.behavior.actions.ExpressionAction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see dercs.behavior.actions.ExpressionAction#getExpression()
	 * @see #getExpressionAction()
	 * @generated
	 */
	EAttribute getExpressionAction_Expression();

	/**
	 * Returns the meta object for class '{@link dercs.behavior.actions.AssignmentAction <em>Assignment Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Action</em>'.
	 * @see dercs.behavior.actions.AssignmentAction
	 * @generated
	 */
	EClass getAssignmentAction();

	/**
	 * Returns the meta object for the attribute '{@link dercs.behavior.actions.AssignmentAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dercs.behavior.actions.AssignmentAction#getValue()
	 * @see #getAssignmentAction()
	 * @generated
	 */
	EAttribute getAssignmentAction_Value();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.AssignmentAction#getDestinationVariable <em>Destination Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Variable</em>'.
	 * @see dercs.behavior.actions.AssignmentAction#getDestinationVariable()
	 * @see #getAssignmentAction()
	 * @generated
	 */
	EReference getAssignmentAction_DestinationVariable();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.AssignmentAction#getDestinationAttribute <em>Destination Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Attribute</em>'.
	 * @see dercs.behavior.actions.AssignmentAction#getDestinationAttribute()
	 * @see #getAssignmentAction()
	 * @generated
	 */
	EReference getAssignmentAction_DestinationAttribute();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.AssignmentAction#getDestinationObject <em>Destination Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Object</em>'.
	 * @see dercs.behavior.actions.AssignmentAction#getDestinationObject()
	 * @see #getAssignmentAction()
	 * @generated
	 */
	EReference getAssignmentAction_DestinationObject();

	/**
	 * Returns the meta object for the attribute '{@link dercs.behavior.actions.AssignmentAction#getDestinationArrayElement <em>Destination Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Array Element</em>'.
	 * @see dercs.behavior.actions.AssignmentAction#getDestinationArrayElement()
	 * @see #getAssignmentAction()
	 * @generated
	 */
	EAttribute getAssignmentAction_DestinationArrayElement();

	/**
	 * Returns the meta object for the reference '{@link dercs.behavior.actions.AssignmentAction#getResultOfAction <em>Result Of Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Of Action</em>'.
	 * @see dercs.behavior.actions.AssignmentAction#getResultOfAction()
	 * @see #getAssignmentAction()
	 * @generated
	 */
	EReference getAssignmentAction_ResultOfAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionsFactory getActionsFactory();

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
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.ActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.ActionWithOutputImpl <em>Action With Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.ActionWithOutputImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getActionWithOutput()
		 * @generated
		 */
		EClass ACTION_WITH_OUTPUT = eINSTANCE.getActionWithOutput();

		/**
		 * The meta object literal for the '<em><b>Output Receiver Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_WITH_OUTPUT__OUTPUT_RECEIVER_ACTION = eINSTANCE.getActionWithOutput_OutputReceiverAction();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.SendMessageActionImpl <em>Send Message Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.SendMessageActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getSendMessageAction()
		 * @generated
		 */
		EClass SEND_MESSAGE_ACTION = eINSTANCE.getSendMessageAction();

		/**
		 * The meta object literal for the '<em><b>Related Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE_ACTION__RELATED_METHOD = eINSTANCE.getSendMessageAction_RelatedMethod();

		/**
		 * The meta object literal for the '<em><b>From Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE_ACTION__FROM_OBJECT = eINSTANCE.getSendMessageAction_FromObject();

		/**
		 * The meta object literal for the '<em><b>To Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE_ACTION__TO_OBJECT = eINSTANCE.getSendMessageAction_ToObject();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE_ACTION__PARAMETER_VALUES = eINSTANCE.getSendMessageAction_ParameterValues();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE_ACTION__MESSAGE_SORT = eINSTANCE.getSendMessageAction_MessageSort();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.ArrayActionImpl <em>Array Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.ArrayActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getArrayAction()
		 * @generated
		 */
		EClass ARRAY_ACTION = eINSTANCE.getArrayAction();

		/**
		 * The meta object literal for the '<em><b>Array Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACTION__ARRAY_VARIABLE = eINSTANCE.getArrayAction_ArrayVariable();

		/**
		 * The meta object literal for the '<em><b>Array Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_ACTION__ARRAY_ELEMENT = eINSTANCE.getArrayAction_ArrayElement();

		/**
		 * The meta object literal for the '<em><b>Array Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACTION__ARRAY_ATTRIBUTE = eINSTANCE.getArrayAction_ArrayAttribute();

		/**
		 * The meta object literal for the '<em><b>Array Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACTION__ARRAY_OBJECT = eINSTANCE.getArrayAction_ArrayObject();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.ObjectActionImpl <em>Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.ObjectActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getObjectAction()
		 * @generated
		 */
		EClass OBJECT_ACTION = eINSTANCE.getObjectAction();

		/**
		 * The meta object literal for the '<em><b>Related Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ACTION__RELATED_OBJECT = eINSTANCE.getObjectAction_RelatedObject();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.CreateObjectActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getCreateObjectAction()
		 * @generated
		 */
		EClass CREATE_OBJECT_ACTION = eINSTANCE.getCreateObjectAction();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_OBJECT_ACTION__PARAMETER_VALUES = eINSTANCE.getCreateObjectAction_ParameterValues();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.DestroyObjectActionImpl <em>Destroy Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.DestroyObjectActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getDestroyObjectAction()
		 * @generated
		 */
		EClass DESTROY_OBJECT_ACTION = eINSTANCE.getDestroyObjectAction();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.GetArrayElementActionImpl <em>Get Array Element Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.GetArrayElementActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getGetArrayElementAction()
		 * @generated
		 */
		EClass GET_ARRAY_ELEMENT_ACTION = eINSTANCE.getGetArrayElementAction();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.GetArrayLengthActionImpl <em>Get Array Length Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.GetArrayLengthActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getGetArrayLengthAction()
		 * @generated
		 */
		EClass GET_ARRAY_LENGTH_ACTION = eINSTANCE.getGetArrayLengthAction();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.InsertArrayElementActionImpl <em>Insert Array Element Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.InsertArrayElementActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getInsertArrayElementAction()
		 * @generated
		 */
		EClass INSERT_ARRAY_ELEMENT_ACTION = eINSTANCE.getInsertArrayElementAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ARRAY_ELEMENT_ACTION__VALUE = eINSTANCE.getInsertArrayElementAction_Value();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.RemoveArrayElementActionImpl <em>Remove Array Element Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.RemoveArrayElementActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getRemoveArrayElementAction()
		 * @generated
		 */
		EClass REMOVE_ARRAY_ELEMENT_ACTION = eINSTANCE.getRemoveArrayElementAction();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.SetArrayElementActionImpl <em>Set Array Element Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.SetArrayElementActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getSetArrayElementAction()
		 * @generated
		 */
		EClass SET_ARRAY_ELEMENT_ACTION = eINSTANCE.getSetArrayElementAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ARRAY_ELEMENT_ACTION__VALUE = eINSTANCE.getSetArrayElementAction_Value();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.ReturnActionImpl <em>Return Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.ReturnActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getReturnAction()
		 * @generated
		 */
		EClass RETURN_ACTION = eINSTANCE.getReturnAction();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ACTION__METHOD = eINSTANCE.getReturnAction_Method();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.ModifyStateActionImpl <em>Modify State Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.ModifyStateActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getModifyStateAction()
		 * @generated
		 */
		EClass MODIFY_STATE_ACTION = eINSTANCE.getModifyStateAction();

		/**
		 * The meta object literal for the '<em><b>Related Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY_STATE_ACTION__RELATED_TRANSITION = eINSTANCE.getModifyStateAction_RelatedTransition();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.ExpressionActionImpl <em>Expression Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.ExpressionActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getExpressionAction()
		 * @generated
		 */
		EClass EXPRESSION_ACTION = eINSTANCE.getExpressionAction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_ACTION__EXPRESSION = eINSTANCE.getExpressionAction_Expression();

		/**
		 * The meta object literal for the '{@link dercs.behavior.actions.impl.AssignmentActionImpl <em>Assignment Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dercs.behavior.actions.impl.AssignmentActionImpl
		 * @see dercs.behavior.actions.impl.ActionsPackageImpl#getAssignmentAction()
		 * @generated
		 */
		EClass ASSIGNMENT_ACTION = eINSTANCE.getAssignmentAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_ACTION__VALUE = eINSTANCE.getAssignmentAction_Value();

		/**
		 * The meta object literal for the '<em><b>Destination Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_ACTION__DESTINATION_VARIABLE = eINSTANCE.getAssignmentAction_DestinationVariable();

		/**
		 * The meta object literal for the '<em><b>Destination Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_ACTION__DESTINATION_ATTRIBUTE = eINSTANCE.getAssignmentAction_DestinationAttribute();

		/**
		 * The meta object literal for the '<em><b>Destination Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_ACTION__DESTINATION_OBJECT = eINSTANCE.getAssignmentAction_DestinationObject();

		/**
		 * The meta object literal for the '<em><b>Destination Array Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_ACTION__DESTINATION_ARRAY_ELEMENT = eINSTANCE
				.getAssignmentAction_DestinationArrayElement();

		/**
		 * The meta object literal for the '<em><b>Result Of Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_ACTION__RESULT_OF_ACTION = eINSTANCE.getAssignmentAction_ResultOfAction();

	}

} //ActionsPackage
