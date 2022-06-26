/**
 */
package dercs.structure.runtime.util;

import dercs.structure.BaseElement;
import dercs.structure.NamedElement;

import dercs.structure.runtime.ActiveObject;
import dercs.structure.runtime.AttributeRuntimeInformation;
import dercs.structure.runtime.LocalVariableRuntimeInformation;
import dercs.structure.runtime.Node;
import dercs.structure.runtime.ParameterRuntimeInformation;
import dercs.structure.runtime.PassiveObject;
import dercs.structure.runtime.RuntimeElement;
import dercs.structure.runtime.RuntimeInformation;
import dercs.structure.runtime.RuntimePackage;
import dercs.structure.runtime.State;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dercs.structure.runtime.RuntimePackage
 * @generated
 */
public class RuntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
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
	protected RuntimeSwitch<Adapter> modelSwitch = new RuntimeSwitch<Adapter>() {
		@Override
		public Adapter caseRuntimeElement(RuntimeElement object) {
			return createRuntimeElementAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseObject(dercs.structure.runtime.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseRuntimeInformation(RuntimeInformation object) {
			return createRuntimeInformationAdapter();
		}

		@Override
		public Adapter caseParameterRuntimeInformation(ParameterRuntimeInformation object) {
			return createParameterRuntimeInformationAdapter();
		}

		@Override
		public Adapter casePassiveObject(PassiveObject object) {
			return createPassiveObjectAdapter();
		}

		@Override
		public Adapter caseActiveObject(ActiveObject object) {
			return createActiveObjectAdapter();
		}

		@Override
		public Adapter caseAttributeRuntimeInformation(AttributeRuntimeInformation object) {
			return createAttributeRuntimeInformationAdapter();
		}

		@Override
		public Adapter caseLocalVariableRuntimeInformation(LocalVariableRuntimeInformation object) {
			return createLocalVariableRuntimeInformationAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseBaseElement(BaseElement object) {
			return createBaseElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.RuntimeElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.RuntimeElement
	 * @generated
	 */
	public Adapter createRuntimeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.RuntimeInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.RuntimeInformation
	 * @generated
	 */
	public Adapter createRuntimeInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.ParameterRuntimeInformation <em>Parameter Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.ParameterRuntimeInformation
	 * @generated
	 */
	public Adapter createParameterRuntimeInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.PassiveObject <em>Passive Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.PassiveObject
	 * @generated
	 */
	public Adapter createPassiveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.ActiveObject <em>Active Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.ActiveObject
	 * @generated
	 */
	public Adapter createActiveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.AttributeRuntimeInformation <em>Attribute Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.AttributeRuntimeInformation
	 * @generated
	 */
	public Adapter createAttributeRuntimeInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dercs.structure.runtime.LocalVariableRuntimeInformation <em>Local Variable Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.runtime.LocalVariableRuntimeInformation
	 * @generated
	 */
	public Adapter createLocalVariableRuntimeInformationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link dercs.structure.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dercs.structure.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
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

} //RuntimeAdapterFactory
