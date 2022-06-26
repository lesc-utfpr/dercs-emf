/**
 */
package dercs.structure.runtime.impl;

import dercs.structure.impl.BaseElementImpl;

import dercs.structure.runtime.RuntimeElement;
import dercs.structure.runtime.RuntimePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.impl.RuntimeElementImpl#getAssociatedElement <em>Associated Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RuntimeElementImpl extends BaseElementImpl implements RuntimeElement {
	/**
	 * The cached value of the '{@link #getAssociatedElement() <em>Associated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedElement()
	 * @generated
	 * @ordered
	 */
	protected RuntimeElement associatedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeElement getAssociatedElement() {
		if (associatedElement != null && associatedElement.eIsProxy()) {
			InternalEObject oldAssociatedElement = (InternalEObject) associatedElement;
			associatedElement = (RuntimeElement) eResolveProxy(oldAssociatedElement);
			if (associatedElement != oldAssociatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RuntimePackage.RUNTIME_ELEMENT__ASSOCIATED_ELEMENT, oldAssociatedElement,
							associatedElement));
			}
		}
		return associatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeElement basicGetAssociatedElement() {
		return associatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociatedElement(RuntimeElement newAssociatedElement) {
		RuntimeElement oldAssociatedElement = associatedElement;
		associatedElement = newAssociatedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_ELEMENT__ASSOCIATED_ELEMENT,
					oldAssociatedElement, associatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isObject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RuntimePackage.RUNTIME_ELEMENT__ASSOCIATED_ELEMENT:
			if (resolve)
				return getAssociatedElement();
			return basicGetAssociatedElement();
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
		case RuntimePackage.RUNTIME_ELEMENT__ASSOCIATED_ELEMENT:
			setAssociatedElement((RuntimeElement) newValue);
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
		case RuntimePackage.RUNTIME_ELEMENT__ASSOCIATED_ELEMENT:
			setAssociatedElement((RuntimeElement) null);
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
		case RuntimePackage.RUNTIME_ELEMENT__ASSOCIATED_ELEMENT:
			return associatedElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RuntimePackage.RUNTIME_ELEMENT___IS_OBJECT:
			return isObject();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RuntimeElementImpl
