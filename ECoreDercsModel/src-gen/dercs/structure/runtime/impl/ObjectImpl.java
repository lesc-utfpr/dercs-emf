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

import dercs.structure.runtime.AttributeRuntimeInformation;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.RuntimeElement;
import dercs.structure.runtime.RuntimePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.impl.ObjectImpl#getNode <em>Node</em>}</li>
 *   <li>{@link dercs.structure.runtime.impl.ObjectImpl#getInstanceOfClass <em>Instance Of Class</em>}</li>
 *   <li>{@link dercs.structure.runtime.impl.ObjectImpl#getRuntimeInformation <em>Runtime Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends RuntimeElementImpl implements dercs.structure.runtime.Object {
	/**
	 * The cached value of the '{@link #getInstanceOfClass() <em>Instance Of Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOfClass()
	 * @generated
	 * @ordered
	 */
	protected dercs.structure.Class instanceOfClass;

	/**
	 * The cached value of the '{@link #getRuntimeInformation() <em>Runtime Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeRuntimeInformation> runtimeInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getNode() {
		if (eContainerFeatureID() != RuntimePackage.OBJECT__NODE)
			return null;
		return (Node) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newNode, RuntimePackage.OBJECT__NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNode(Node newNode) {
		if (newNode != eInternalContainer()
				|| (eContainerFeatureID() != RuntimePackage.OBJECT__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject) newNode).eInverseAdd(this, RuntimePackage.NODE__DEPLOYED_OBJECTS, Node.class,
						msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.OBJECT__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.Class getInstanceOfClass() {
		if (instanceOfClass != null && instanceOfClass.eIsProxy()) {
			InternalEObject oldInstanceOfClass = (InternalEObject) instanceOfClass;
			instanceOfClass = (dercs.structure.Class) eResolveProxy(oldInstanceOfClass);
			if (instanceOfClass != oldInstanceOfClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.OBJECT__INSTANCE_OF_CLASS,
							oldInstanceOfClass, instanceOfClass));
			}
		}
		return instanceOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dercs.structure.Class basicGetInstanceOfClass() {
		return instanceOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOfClass(dercs.structure.Class newInstanceOfClass) {
		dercs.structure.Class oldInstanceOfClass = instanceOfClass;
		instanceOfClass = newInstanceOfClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.OBJECT__INSTANCE_OF_CLASS,
					oldInstanceOfClass, instanceOfClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeRuntimeInformation> getRuntimeInformation() {
		if (runtimeInformation == null) {
			runtimeInformation = new EObjectResolvingEList<AttributeRuntimeInformation>(
					AttributeRuntimeInformation.class, this, RuntimePackage.OBJECT__RUNTIME_INFORMATION);
		}
		return runtimeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObject() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RuntimePackage.OBJECT__NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetNode((Node) otherEnd, msgs);
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
		case RuntimePackage.OBJECT__NODE:
			return basicSetNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RuntimePackage.OBJECT__NODE:
			return eInternalContainer().eInverseRemove(this, RuntimePackage.NODE__DEPLOYED_OBJECTS, Node.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RuntimePackage.OBJECT__NODE:
			return getNode();
		case RuntimePackage.OBJECT__INSTANCE_OF_CLASS:
			if (resolve)
				return getInstanceOfClass();
			return basicGetInstanceOfClass();
		case RuntimePackage.OBJECT__RUNTIME_INFORMATION:
			return getRuntimeInformation();
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
		case RuntimePackage.OBJECT__NODE:
			setNode((Node) newValue);
			return;
		case RuntimePackage.OBJECT__INSTANCE_OF_CLASS:
			setInstanceOfClass((dercs.structure.Class) newValue);
			return;
		case RuntimePackage.OBJECT__RUNTIME_INFORMATION:
			getRuntimeInformation().clear();
			getRuntimeInformation().addAll((Collection<? extends AttributeRuntimeInformation>) newValue);
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
		case RuntimePackage.OBJECT__NODE:
			setNode((Node) null);
			return;
		case RuntimePackage.OBJECT__INSTANCE_OF_CLASS:
			setInstanceOfClass((dercs.structure.Class) null);
			return;
		case RuntimePackage.OBJECT__RUNTIME_INFORMATION:
			getRuntimeInformation().clear();
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
		case RuntimePackage.OBJECT__NODE:
			return getNode() != null;
		case RuntimePackage.OBJECT__INSTANCE_OF_CLASS:
			return instanceOfClass != null;
		case RuntimePackage.OBJECT__RUNTIME_INFORMATION:
			return runtimeInformation != null && !runtimeInformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RuntimeElement.class) {
			switch (baseOperationID) {
			case RuntimePackage.RUNTIME_ELEMENT___IS_OBJECT:
				return RuntimePackage.OBJECT___IS_OBJECT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RuntimePackage.OBJECT___IS_OBJECT:
			return isObject();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectImpl
