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

import dercs.structure.runtime.ActiveObject;
import dercs.structure.runtime.AttributeRuntimeInformation;
import dercs.structure.runtime.LocalVariableRuntimeInformation;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.ParameterRuntimeInformation;
import dercs.structure.runtime.PassiveObject;
import dercs.structure.runtime.RuntimeFactory;
import dercs.structure.runtime.RuntimePackage;
import dercs.structure.runtime.State;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeFactoryImpl extends EFactoryImpl implements RuntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuntimeFactory init() {
		try {
			RuntimeFactory theRuntimeFactory = (RuntimeFactory) EPackage.Registry.INSTANCE
					.getEFactory(RuntimePackage.eNS_URI);
			if (theRuntimeFactory != null) {
				return theRuntimeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RuntimePackage.NODE:
			return createNode();
		case RuntimePackage.OBJECT:
			return createObject();
		case RuntimePackage.STATE:
			return createState();
		case RuntimePackage.PARAMETER_RUNTIME_INFORMATION:
			return createParameterRuntimeInformation();
		case RuntimePackage.PASSIVE_OBJECT:
			return createPassiveObject();
		case RuntimePackage.ACTIVE_OBJECT:
			return createActiveObject();
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION:
			return createAttributeRuntimeInformation();
		case RuntimePackage.LOCAL_VARIABLE_RUNTIME_INFORMATION:
			return createLocalVariableRuntimeInformation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.runtime.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterRuntimeInformation createParameterRuntimeInformation() {
		ParameterRuntimeInformationImpl parameterRuntimeInformation = new ParameterRuntimeInformationImpl();
		return parameterRuntimeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassiveObject createPassiveObject() {
		PassiveObjectImpl passiveObject = new PassiveObjectImpl();
		return passiveObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActiveObject createActiveObject() {
		ActiveObjectImpl activeObject = new ActiveObjectImpl();
		return activeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeRuntimeInformation createAttributeRuntimeInformation() {
		AttributeRuntimeInformationImpl attributeRuntimeInformation = new AttributeRuntimeInformationImpl();
		return attributeRuntimeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalVariableRuntimeInformation createLocalVariableRuntimeInformation() {
		LocalVariableRuntimeInformationImpl localVariableRuntimeInformation = new LocalVariableRuntimeInformationImpl();
		return localVariableRuntimeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimePackage getRuntimePackage() {
		return (RuntimePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuntimePackage getPackage() {
		return RuntimePackage.eINSTANCE;
	}

} //RuntimeFactoryImpl
