/**
 */
package dercs.AO.impl;

import dercs.AO.AOPackage;
import dercs.AO.Aspect;
import dercs.AO.BehavioralAdaptation;
import dercs.AO.Crosscutting;
import dercs.AO.Pointcut;
import dercs.AO.StructuralAdaptation;

import dercs.structure.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.impl.AspectImpl#getStructuralAdaptations <em>Structural Adaptations</em>}</li>
 *   <li>{@link dercs.AO.impl.AspectImpl#getBehavioralAdaptations <em>Behavioral Adaptations</em>}</li>
 *   <li>{@link dercs.AO.impl.AspectImpl#getPointcuts <em>Pointcuts</em>}</li>
 *   <li>{@link dercs.AO.impl.AspectImpl#getCrosscutting <em>Crosscutting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AspectImpl extends NamedElementImpl implements Aspect {
	/**
	 * The cached value of the '{@link #getStructuralAdaptations() <em>Structural Adaptations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralAdaptations()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralAdaptation> structuralAdaptations;

	/**
	 * The cached value of the '{@link #getBehavioralAdaptations() <em>Behavioral Adaptations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralAdaptations()
	 * @generated
	 * @ordered
	 */
	protected EList<BehavioralAdaptation> behavioralAdaptations;

	/**
	 * The cached value of the '{@link #getPointcuts() <em>Pointcuts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcuts()
	 * @generated
	 * @ordered
	 */
	protected EList<Pointcut> pointcuts;

	/**
	 * The cached value of the '{@link #getCrosscutting() <em>Crosscutting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrosscutting()
	 * @generated
	 * @ordered
	 */
	protected EList<Crosscutting> crosscutting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AOPackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructuralAdaptation> getStructuralAdaptations() {
		if (structuralAdaptations == null) {
			structuralAdaptations = new EObjectContainmentEList<StructuralAdaptation>(StructuralAdaptation.class, this,
					AOPackage.ASPECT__STRUCTURAL_ADAPTATIONS);
		}
		return structuralAdaptations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehavioralAdaptation> getBehavioralAdaptations() {
		if (behavioralAdaptations == null) {
			behavioralAdaptations = new EObjectContainmentEList<BehavioralAdaptation>(BehavioralAdaptation.class, this,
					AOPackage.ASPECT__BEHAVIORAL_ADAPTATIONS);
		}
		return behavioralAdaptations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pointcut> getPointcuts() {
		if (pointcuts == null) {
			pointcuts = new EObjectResolvingEList<Pointcut>(Pointcut.class, this, AOPackage.ASPECT__POINTCUTS);
		}
		return pointcuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Crosscutting> getCrosscutting() {
		if (crosscutting == null) {
			crosscutting = new EObjectContainmentWithInverseEList<Crosscutting>(Crosscutting.class, this,
					AOPackage.ASPECT__CROSSCUTTING, AOPackage.CROSSCUTTING__ASSOCIATED_ASPECT);
		}
		return crosscutting;
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
		case AOPackage.ASPECT__CROSSCUTTING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCrosscutting()).basicAdd(otherEnd, msgs);
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
		case AOPackage.ASPECT__STRUCTURAL_ADAPTATIONS:
			return ((InternalEList<?>) getStructuralAdaptations()).basicRemove(otherEnd, msgs);
		case AOPackage.ASPECT__BEHAVIORAL_ADAPTATIONS:
			return ((InternalEList<?>) getBehavioralAdaptations()).basicRemove(otherEnd, msgs);
		case AOPackage.ASPECT__CROSSCUTTING:
			return ((InternalEList<?>) getCrosscutting()).basicRemove(otherEnd, msgs);
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
		case AOPackage.ASPECT__STRUCTURAL_ADAPTATIONS:
			return getStructuralAdaptations();
		case AOPackage.ASPECT__BEHAVIORAL_ADAPTATIONS:
			return getBehavioralAdaptations();
		case AOPackage.ASPECT__POINTCUTS:
			return getPointcuts();
		case AOPackage.ASPECT__CROSSCUTTING:
			return getCrosscutting();
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
		case AOPackage.ASPECT__STRUCTURAL_ADAPTATIONS:
			getStructuralAdaptations().clear();
			getStructuralAdaptations().addAll((Collection<? extends StructuralAdaptation>) newValue);
			return;
		case AOPackage.ASPECT__BEHAVIORAL_ADAPTATIONS:
			getBehavioralAdaptations().clear();
			getBehavioralAdaptations().addAll((Collection<? extends BehavioralAdaptation>) newValue);
			return;
		case AOPackage.ASPECT__POINTCUTS:
			getPointcuts().clear();
			getPointcuts().addAll((Collection<? extends Pointcut>) newValue);
			return;
		case AOPackage.ASPECT__CROSSCUTTING:
			getCrosscutting().clear();
			getCrosscutting().addAll((Collection<? extends Crosscutting>) newValue);
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
		case AOPackage.ASPECT__STRUCTURAL_ADAPTATIONS:
			getStructuralAdaptations().clear();
			return;
		case AOPackage.ASPECT__BEHAVIORAL_ADAPTATIONS:
			getBehavioralAdaptations().clear();
			return;
		case AOPackage.ASPECT__POINTCUTS:
			getPointcuts().clear();
			return;
		case AOPackage.ASPECT__CROSSCUTTING:
			getCrosscutting().clear();
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
		case AOPackage.ASPECT__STRUCTURAL_ADAPTATIONS:
			return structuralAdaptations != null && !structuralAdaptations.isEmpty();
		case AOPackage.ASPECT__BEHAVIORAL_ADAPTATIONS:
			return behavioralAdaptations != null && !behavioralAdaptations.isEmpty();
		case AOPackage.ASPECT__POINTCUTS:
			return pointcuts != null && !pointcuts.isEmpty();
		case AOPackage.ASPECT__CROSSCUTTING:
			return crosscutting != null && !crosscutting.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AspectImpl
