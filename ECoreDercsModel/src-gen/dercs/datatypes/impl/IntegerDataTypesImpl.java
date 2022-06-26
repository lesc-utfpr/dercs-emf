/**
 */
package dercs.datatypes.impl;

import dercs.datatypes.DatatypesPackage;
import dercs.datatypes.IntegerDataTypes;

import java.lang.Boolean;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Data Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.datatypes.impl.IntegerDataTypesImpl#isIsSignal <em>Is Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IntegerDataTypesImpl extends DataTypeImpl implements IntegerDataTypes {
	/**
	 * The default value of the '{@link #isIsSignal() <em>Is Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSignal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIGNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSignal() <em>Is Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSignal()
	 * @generated
	 * @ordered
	 */
	protected boolean isSignal = IS_SIGNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerDataTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.INTEGER_DATA_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSignal() {
		return isSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSignal(boolean newIsSignal) {
		boolean oldIsSignal = isSignal;
		isSignal = newIsSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.INTEGER_DATA_TYPES__IS_SIGNAL,
					oldIsSignal, isSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSigned() {
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
		case DatatypesPackage.INTEGER_DATA_TYPES__IS_SIGNAL:
			return isIsSignal();
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
		case DatatypesPackage.INTEGER_DATA_TYPES__IS_SIGNAL:
			setIsSignal((Boolean) newValue);
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
		case DatatypesPackage.INTEGER_DATA_TYPES__IS_SIGNAL:
			setIsSignal(IS_SIGNAL_EDEFAULT);
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
		case DatatypesPackage.INTEGER_DATA_TYPES__IS_SIGNAL:
			return isSignal != IS_SIGNAL_EDEFAULT;
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
		case DatatypesPackage.INTEGER_DATA_TYPES___IS_SIGNED:
			return isSigned();
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
		result.append(" (isSignal: ");
		result.append(isSignal);
		result.append(')');
		return result.toString();
	}

} //IntegerDataTypesImpl
