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

import dercs.structure.impl.BaseElementImpl;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.RuntimePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.impl.NodeImpl#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link dercs.structure.runtime.impl.NodeImpl#getDeployedObjects <em>Deployed Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends BaseElementImpl implements Node {
	/**
	 * The default value of the '{@link #getPlatformName() <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformName() <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformName()
	 * @generated
	 * @ordered
	 */
	protected String platformName = PLATFORM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeployedObjects() <em>Deployed Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<dercs.structure.runtime.Object> deployedObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformName() {
		return platformName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformName(String newPlatformName) {
		String oldPlatformName = platformName;
		platformName = newPlatformName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.NODE__PLATFORM_NAME, oldPlatformName,
					platformName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<dercs.structure.runtime.Object> getDeployedObjects() {
		if (deployedObjects == null) {
			deployedObjects = new EObjectContainmentWithInverseEList<dercs.structure.runtime.Object>(
					dercs.structure.runtime.Object.class, this, RuntimePackage.NODE__DEPLOYED_OBJECTS,
					RuntimePackage.OBJECT__NODE);
		}
		return deployedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RuntimePackage.NODE__DEPLOYED_OBJECTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDeployedObjects()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RuntimePackage.NODE__DEPLOYED_OBJECTS:
			return ((InternalEList<?>) getDeployedObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RuntimePackage.NODE__PLATFORM_NAME:
			return getPlatformName();
		case RuntimePackage.NODE__DEPLOYED_OBJECTS:
			return getDeployedObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RuntimePackage.NODE__PLATFORM_NAME:
			setPlatformName((String) newValue);
			return;
		case RuntimePackage.NODE__DEPLOYED_OBJECTS:
			getDeployedObjects().clear();
			getDeployedObjects().addAll((Collection<? extends dercs.structure.runtime.Object>) newValue);
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
		case RuntimePackage.NODE__PLATFORM_NAME:
			setPlatformName(PLATFORM_NAME_EDEFAULT);
			return;
		case RuntimePackage.NODE__DEPLOYED_OBJECTS:
			getDeployedObjects().clear();
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
		case RuntimePackage.NODE__PLATFORM_NAME:
			return PLATFORM_NAME_EDEFAULT == null ? platformName != null : !PLATFORM_NAME_EDEFAULT.equals(platformName);
		case RuntimePackage.NODE__DEPLOYED_OBJECTS:
			return deployedObjects != null && !deployedObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (platformName: ");
		result.append(platformName);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
