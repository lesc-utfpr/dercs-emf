/**
 */
package dercs.structure.runtime.impl;

import dercs.structure.Attribute;

import dercs.structure.runtime.AttributeRuntimeInformation;
import dercs.structure.runtime.RuntimePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Runtime Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.runtime.impl.AttributeRuntimeInformationImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link dercs.structure.runtime.impl.AttributeRuntimeInformationImpl#getRelatedAttribute <em>Related Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeRuntimeInformationImpl extends RuntimeInformationImpl implements AttributeRuntimeInformation {
	/**
	 * The cached value of the '{@link #getRelatedObject() <em>Related Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObject()
	 * @generated
	 * @ordered
	 */
	protected dercs.structure.runtime.Object relatedObject;

	/**
	 * The cached value of the '{@link #getRelatedAttribute() <em>Related Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute relatedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeRuntimeInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.ATTRIBUTE_RUNTIME_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.runtime.Object getRelatedObject() {
		if (relatedObject != null && relatedObject.eIsProxy()) {
			InternalEObject oldRelatedObject = (InternalEObject) relatedObject;
			relatedObject = (dercs.structure.runtime.Object) eResolveProxy(oldRelatedObject);
			if (relatedObject != oldRelatedObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT, oldRelatedObject,
							relatedObject));
			}
		}
		return relatedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dercs.structure.runtime.Object basicGetRelatedObject() {
		return relatedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedObject(dercs.structure.runtime.Object newRelatedObject) {
		dercs.structure.runtime.Object oldRelatedObject = relatedObject;
		relatedObject = newRelatedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT, oldRelatedObject, relatedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getRelatedAttribute() {
		if (relatedAttribute != null && relatedAttribute.eIsProxy()) {
			InternalEObject oldRelatedAttribute = (InternalEObject) relatedAttribute;
			relatedAttribute = (Attribute) eResolveProxy(oldRelatedAttribute);
			if (relatedAttribute != oldRelatedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE, oldRelatedAttribute,
							relatedAttribute));
			}
		}
		return relatedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRelatedAttribute() {
		return relatedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedAttribute(Attribute newRelatedAttribute) {
		Attribute oldRelatedAttribute = relatedAttribute;
		relatedAttribute = newRelatedAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE, oldRelatedAttribute,
					relatedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT:
			if (resolve)
				return getRelatedObject();
			return basicGetRelatedObject();
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE:
			if (resolve)
				return getRelatedAttribute();
			return basicGetRelatedAttribute();
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
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT:
			setRelatedObject((dercs.structure.runtime.Object) newValue);
			return;
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE:
			setRelatedAttribute((Attribute) newValue);
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
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT:
			setRelatedObject((dercs.structure.runtime.Object) null);
			return;
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE:
			setRelatedAttribute((Attribute) null);
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
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_OBJECT:
			return relatedObject != null;
		case RuntimePackage.ATTRIBUTE_RUNTIME_INFORMATION__RELATED_ATTRIBUTE:
			return relatedAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeRuntimeInformationImpl
