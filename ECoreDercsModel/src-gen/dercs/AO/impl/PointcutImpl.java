/**
 */
package dercs.AO.impl;

import dercs.AO.AOPackage;
import dercs.AO.AspectAdaptation;
import dercs.AO.JoinPoint;
import dercs.AO.Pointcut;
import dercs.AO.RelativePosition;

import dercs.structure.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.impl.PointcutImpl#getJoinPoints <em>Join Points</em>}</li>
 *   <li>{@link dercs.AO.impl.PointcutImpl#getAspectAdaptation <em>Aspect Adaptation</em>}</li>
 *   <li>{@link dercs.AO.impl.PointcutImpl#getRelativePosition <em>Relative Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointcutImpl extends NamedElementImpl implements Pointcut {
	/**
	 * The cached value of the '{@link #getJoinPoints() <em>Join Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinPoint> joinPoints;

	/**
	 * The cached value of the '{@link #getAspectAdaptation() <em>Aspect Adaptation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectAdaptation()
	 * @generated
	 * @ordered
	 */
	protected AspectAdaptation aspectAdaptation;

	/**
	 * The default value of the '{@link #getRelativePosition() <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected static final RelativePosition RELATIVE_POSITION_EDEFAULT = RelativePosition.BEFORE;

	/**
	 * The cached value of the '{@link #getRelativePosition() <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected RelativePosition relativePosition = RELATIVE_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointcutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AOPackage.Literals.POINTCUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JoinPoint> getJoinPoints() {
		if (joinPoints == null) {
			joinPoints = new EObjectResolvingEList<JoinPoint>(JoinPoint.class, this, AOPackage.POINTCUT__JOIN_POINTS);
		}
		return joinPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AspectAdaptation getAspectAdaptation() {
		if (aspectAdaptation != null && aspectAdaptation.eIsProxy()) {
			InternalEObject oldAspectAdaptation = (InternalEObject) aspectAdaptation;
			aspectAdaptation = (AspectAdaptation) eResolveProxy(oldAspectAdaptation);
			if (aspectAdaptation != oldAspectAdaptation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AOPackage.POINTCUT__ASPECT_ADAPTATION,
							oldAspectAdaptation, aspectAdaptation));
			}
		}
		return aspectAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectAdaptation basicGetAspectAdaptation() {
		return aspectAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAspectAdaptation(AspectAdaptation newAspectAdaptation) {
		AspectAdaptation oldAspectAdaptation = aspectAdaptation;
		aspectAdaptation = newAspectAdaptation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AOPackage.POINTCUT__ASPECT_ADAPTATION,
					oldAspectAdaptation, aspectAdaptation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativePosition getRelativePosition() {
		return relativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePosition(RelativePosition newRelativePosition) {
		RelativePosition oldRelativePosition = relativePosition;
		relativePosition = newRelativePosition == null ? RELATIVE_POSITION_EDEFAULT : newRelativePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AOPackage.POINTCUT__RELATIVE_POSITION,
					oldRelativePosition, relativePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AOPackage.POINTCUT__JOIN_POINTS:
			return getJoinPoints();
		case AOPackage.POINTCUT__ASPECT_ADAPTATION:
			if (resolve)
				return getAspectAdaptation();
			return basicGetAspectAdaptation();
		case AOPackage.POINTCUT__RELATIVE_POSITION:
			return getRelativePosition();
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
		case AOPackage.POINTCUT__JOIN_POINTS:
			getJoinPoints().clear();
			getJoinPoints().addAll((Collection<? extends JoinPoint>) newValue);
			return;
		case AOPackage.POINTCUT__ASPECT_ADAPTATION:
			setAspectAdaptation((AspectAdaptation) newValue);
			return;
		case AOPackage.POINTCUT__RELATIVE_POSITION:
			setRelativePosition((RelativePosition) newValue);
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
		case AOPackage.POINTCUT__JOIN_POINTS:
			getJoinPoints().clear();
			return;
		case AOPackage.POINTCUT__ASPECT_ADAPTATION:
			setAspectAdaptation((AspectAdaptation) null);
			return;
		case AOPackage.POINTCUT__RELATIVE_POSITION:
			setRelativePosition(RELATIVE_POSITION_EDEFAULT);
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
		case AOPackage.POINTCUT__JOIN_POINTS:
			return joinPoints != null && !joinPoints.isEmpty();
		case AOPackage.POINTCUT__ASPECT_ADAPTATION:
			return aspectAdaptation != null;
		case AOPackage.POINTCUT__RELATIVE_POSITION:
			return relativePosition != RELATIVE_POSITION_EDEFAULT;
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
		result.append(" (relativePosition: ");
		result.append(relativePosition);
		result.append(')');
		return result.toString();
	}

} //PointcutImpl
