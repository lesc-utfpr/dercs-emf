/**
 */
package dercs.structure.runtime.impl;

import dercs.structure.Method;

import dercs.structure.runtime.ActiveObject;
import dercs.structure.runtime.RuntimePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.impl.ActiveObjectImpl#getMainBehaviour <em>Main Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiveObjectImpl extends ObjectImpl implements ActiveObject {
	/**
	 * The cached value of the '{@link #getMainBehaviour() <em>Main Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainBehaviour()
	 * @generated
	 * @ordered
	 */
	protected Method mainBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.ACTIVE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method getMainBehaviour() {
		if (mainBehaviour != null && mainBehaviour.eIsProxy()) {
			InternalEObject oldMainBehaviour = (InternalEObject) mainBehaviour;
			mainBehaviour = (Method) eResolveProxy(oldMainBehaviour);
			if (mainBehaviour != oldMainBehaviour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RuntimePackage.ACTIVE_OBJECT__MAIN_BEHAVIOUR, oldMainBehaviour, mainBehaviour));
			}
		}
		return mainBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMainBehaviour() {
		return mainBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainBehaviour(Method newMainBehaviour) {
		Method oldMainBehaviour = mainBehaviour;
		mainBehaviour = newMainBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.ACTIVE_OBJECT__MAIN_BEHAVIOUR,
					oldMainBehaviour, mainBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RuntimePackage.ACTIVE_OBJECT__MAIN_BEHAVIOUR:
			if (resolve)
				return getMainBehaviour();
			return basicGetMainBehaviour();
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
		case RuntimePackage.ACTIVE_OBJECT__MAIN_BEHAVIOUR:
			setMainBehaviour((Method) newValue);
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
		case RuntimePackage.ACTIVE_OBJECT__MAIN_BEHAVIOUR:
			setMainBehaviour((Method) null);
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
		case RuntimePackage.ACTIVE_OBJECT__MAIN_BEHAVIOUR:
			return mainBehaviour != null;
		}
		return super.eIsSet(featureID);
	}

} //ActiveObjectImpl
