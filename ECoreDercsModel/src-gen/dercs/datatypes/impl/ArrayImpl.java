/**
 */
package dercs.datatypes.impl;

import dercs.datatypes.Array;
import dercs.datatypes.DataType;
import dercs.datatypes.DatatypesPackage;

import java.lang.Integer;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.datatypes.impl.ArrayImpl#getSize <em>Size</em>}</li>
 *   <li>{@link dercs.datatypes.impl.ArrayImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link dercs.datatypes.impl.ArrayImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link dercs.datatypes.impl.ArrayImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayImpl extends DataTypeImpl implements Array {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerValue() <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected int lowerValue = LOWER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperValue() <em>Upper Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected int upperValue = UPPER_VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ARRAY__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerValue(int newLowerValue) {
		int oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ARRAY__LOWER_VALUE, oldLowerValue,
					lowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperValue(int newUpperValue) {
		int oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ARRAY__UPPER_VALUE, oldUpperValue,
					upperValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.ARRAY__DATA_TYPE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ARRAY__DATA_TYPE, oldDataType,
					dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimitive() {
		return dataType.isPrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatatypesPackage.ARRAY__SIZE:
			return getSize();
		case DatatypesPackage.ARRAY__LOWER_VALUE:
			return getLowerValue();
		case DatatypesPackage.ARRAY__UPPER_VALUE:
			return getUpperValue();
		case DatatypesPackage.ARRAY__DATA_TYPE:
			if (resolve)
				return getDataType();
			return basicGetDataType();
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
		case DatatypesPackage.ARRAY__SIZE:
			setSize((Integer) newValue);
			return;
		case DatatypesPackage.ARRAY__LOWER_VALUE:
			setLowerValue((Integer) newValue);
			return;
		case DatatypesPackage.ARRAY__UPPER_VALUE:
			setUpperValue((Integer) newValue);
			return;
		case DatatypesPackage.ARRAY__DATA_TYPE:
			setDataType((DataType) newValue);
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
		case DatatypesPackage.ARRAY__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case DatatypesPackage.ARRAY__LOWER_VALUE:
			setLowerValue(LOWER_VALUE_EDEFAULT);
			return;
		case DatatypesPackage.ARRAY__UPPER_VALUE:
			setUpperValue(UPPER_VALUE_EDEFAULT);
			return;
		case DatatypesPackage.ARRAY__DATA_TYPE:
			setDataType((DataType) null);
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
		case DatatypesPackage.ARRAY__SIZE:
			return size != SIZE_EDEFAULT;
		case DatatypesPackage.ARRAY__LOWER_VALUE:
			return lowerValue != LOWER_VALUE_EDEFAULT;
		case DatatypesPackage.ARRAY__UPPER_VALUE:
			return upperValue != UPPER_VALUE_EDEFAULT;
		case DatatypesPackage.ARRAY__DATA_TYPE:
			return dataType != null;
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
		if (baseClass == DataType.class) {
			switch (baseOperationID) {
			case DatatypesPackage.DATA_TYPE___IS_PRIMITIVE:
				return DatatypesPackage.ARRAY___IS_PRIMITIVE;
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
		case DatatypesPackage.ARRAY___IS_PRIMITIVE:
			return isPrimitive();
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
		result.append(" (size: ");
		result.append(size);
		result.append(", lowerValue: ");
		result.append(lowerValue);
		result.append(", upperValue: ");
		result.append(upperValue);
		result.append(')');
		return result.toString();
	}

} //ArrayImpl
