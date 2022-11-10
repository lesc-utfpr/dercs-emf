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

import dercs.behavior.LocalVariable;

import dercs.structure.runtime.LocalVariableRuntimeInformation;
import dercs.structure.runtime.RuntimePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Variable Runtime Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.impl.LocalVariableRuntimeInformationImpl#getLocalVariable <em>Local Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalVariableRuntimeInformationImpl extends RuntimeInformationImpl
		implements LocalVariableRuntimeInformation {
	/**
	 * The cached value of the '{@link #getLocalVariable() <em>Local Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariable()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable localVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalVariableRuntimeInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.LOCAL_VARIABLE_RUNTIME_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalVariable getLocalVariable() {
		if (localVariable != null && localVariable.eIsProxy()) {
			InternalEObject oldLocalVariable = (InternalEObject) localVariable;
			localVariable = (LocalVariable) eResolveProxy(oldLocalVariable);
			if (localVariable != oldLocalVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RuntimePackage.LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE, oldLocalVariable,
							localVariable));
			}
		}
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable basicGetLocalVariable() {
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalVariable(LocalVariable newLocalVariable) {
		LocalVariable oldLocalVariable = localVariable;
		localVariable = newLocalVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RuntimePackage.LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE, oldLocalVariable,
					localVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RuntimePackage.LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE:
			if (resolve)
				return getLocalVariable();
			return basicGetLocalVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RuntimePackage.LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE:
			setLocalVariable((LocalVariable) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RuntimePackage.LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE:
			setLocalVariable((LocalVariable) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RuntimePackage.LOCAL_VARIABLE_RUNTIME_INFORMATION__LOCAL_VARIABLE:
			return localVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalVariableRuntimeInformationImpl
