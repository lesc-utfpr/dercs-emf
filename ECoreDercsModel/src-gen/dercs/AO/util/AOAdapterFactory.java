/**
 */
package dercs.AO.util;

import dercs.AO.*;

import dercs.structure.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dercs.AO.AOPackage
 * @generated
 */
public class AOAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AOPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AOAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AOPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AOSwitch<Adapter> modelSwitch = new AOSwitch<Adapter>() {
		@Override
		public Adapter caseAspectAdaptation(AspectAdaptation object) {
			return createAspectAdaptationAdapter();
		}

		@Override
		public Adapter caseAspect(Aspect object) {
			return createAspectAdapter();
		}

		@Override
		public Adapter caseBehavioralAdaptation(BehavioralAdaptation object) {
			return createBehavioralAdaptationAdapter();
		}

		@Override
		public Adapter caseStructuralAdaptation(StructuralAdaptation object) {
			return createStructuralAdaptationAdapter();
		}

		@Override
		public Adapter caseJoinPoint(JoinPoint object) {
			return createJoinPointAdapter();
		}

		@Override
		public Adapter casePointcut(Pointcut object) {
			return createPointcutAdapter();
		}

		@Override
		public Adapter caseCrosscutting(Crosscutting object) {
			return createCrosscuttingAdapter();
		}

		@Override
		public Adapter caseCrosscuttingInformation(CrosscuttingInformation object) {
			return createCrosscuttingInformationAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.AO.AspectAdaptation <em>Aspect Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.AO.AspectAdaptation
	 * @generated
	 */
	public Adapter createAspectAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.AO.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.AO.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.AO.BehavioralAdaptation <em>Behavioral Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.AO.BehavioralAdaptation
	 * @generated
	 */
	public Adapter createBehavioralAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.AO.StructuralAdaptation <em>Structural Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.AO.StructuralAdaptation
	 * @generated
	 */
	public Adapter createStructuralAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.AO.JoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.AO.JoinPoint
	 * @generated
	 */
	public Adapter createJoinPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.AO.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.AO.Pointcut
	 * @generated
	 */
	public Adapter createPointcutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.AO.Crosscutting <em>Crosscutting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.AO.Crosscutting
	 * @generated
	 */
	public Adapter createCrosscuttingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.AO.CrosscuttingInformation <em>Crosscutting Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.AO.CrosscuttingInformation
	 * @generated
	 */
	public Adapter createCrosscuttingInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AOAdapterFactory
