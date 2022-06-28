/**
 */
package dercs.structure.impl;

import dercs.datatypes.DataType;
import dercs.structure.Attribute;
import dercs.structure.StructurePackage;
import dercs.structure.Visibility;

import dercs.structure.runtime.RuntimeElement;
import dercs.structure.runtime.RuntimePackage;
import dercs.structure.runtime.impl.RuntimeElementImpl;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.structure.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link dercs.structure.impl.AttributeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link dercs.structure.impl.AttributeImpl#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link dercs.structure.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link dercs.structure.impl.AttributeImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends RuntimeElementImpl implements Attribute {
	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ATTRIBUTE__DEFAULT_VALUE,
					oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ATTRIBUTE__VISIBILITY, oldVisibility,
					visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dercs.structure.Class getOwnerClass() {
		if (eContainerFeatureID() != StructurePackage.ATTRIBUTE__OWNER_CLASS)
			return null;
		return (dercs.structure.Class) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(dercs.structure.Class newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwnerClass, StructurePackage.ATTRIBUTE__OWNER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerClass(dercs.structure.Class newOwnerClass) {
		if (newOwnerClass != eInternalContainer()
				|| (eContainerFeatureID() != StructurePackage.ATTRIBUTE__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject) newOwnerClass).eInverseAdd(this, StructurePackage.CLASS__ATTRIBUTES,
						dercs.structure.Class.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ATTRIBUTE__OWNER_CLASS,
					newOwnerClass, newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject) dataType;
			dataType = (DataType) eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.ATTRIBUTE__DATA_TYPE,
							oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ATTRIBUTE__DATA_TYPE, oldDataType,
					dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ATTRIBUTE__READ_ONLY, oldReadOnly,
					readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObject() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.ATTRIBUTE__OWNER_CLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwnerClass((dercs.structure.Class) otherEnd, msgs);
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
		case StructurePackage.ATTRIBUTE__OWNER_CLASS:
			return basicSetOwnerClass(null, msgs);
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
		case StructurePackage.ATTRIBUTE__OWNER_CLASS:
			return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS__ATTRIBUTES,
					dercs.structure.Class.class, msgs);
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
		case StructurePackage.ATTRIBUTE__DEFAULT_VALUE:
			return getDefaultValue();
		case StructurePackage.ATTRIBUTE__VISIBILITY:
			return getVisibility();
		case StructurePackage.ATTRIBUTE__OWNER_CLASS:
			return getOwnerClass();
		case StructurePackage.ATTRIBUTE__DATA_TYPE:
			if (resolve)
				return getDataType();
			return basicGetDataType();
		case StructurePackage.ATTRIBUTE__READ_ONLY:
			return isReadOnly();
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
		case StructurePackage.ATTRIBUTE__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case StructurePackage.ATTRIBUTE__VISIBILITY:
			setVisibility((Visibility) newValue);
			return;
		case StructurePackage.ATTRIBUTE__OWNER_CLASS:
			setOwnerClass((dercs.structure.Class) newValue);
			return;
		case StructurePackage.ATTRIBUTE__DATA_TYPE:
			setDataType((DataType) newValue);
			return;
		case StructurePackage.ATTRIBUTE__READ_ONLY:
			setReadOnly((Boolean) newValue);
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
		case StructurePackage.ATTRIBUTE__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case StructurePackage.ATTRIBUTE__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case StructurePackage.ATTRIBUTE__OWNER_CLASS:
			setOwnerClass((dercs.structure.Class) null);
			return;
		case StructurePackage.ATTRIBUTE__DATA_TYPE:
			setDataType((DataType) null);
			return;
		case StructurePackage.ATTRIBUTE__READ_ONLY:
			setReadOnly(READ_ONLY_EDEFAULT);
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
		case StructurePackage.ATTRIBUTE__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case StructurePackage.ATTRIBUTE__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case StructurePackage.ATTRIBUTE__OWNER_CLASS:
			return getOwnerClass() != null;
		case StructurePackage.ATTRIBUTE__DATA_TYPE:
			return dataType != null;
		case StructurePackage.ATTRIBUTE__READ_ONLY:
			return readOnly != READ_ONLY_EDEFAULT;
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
				return StructurePackage.ATTRIBUTE___IS_OBJECT;
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
		case StructurePackage.ATTRIBUTE___IS_OBJECT:
			return isObject();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
