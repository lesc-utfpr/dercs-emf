/**
 */
package dercs.AO.util;

import dercs.AO.*;

import dercs.structure.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dercs.AO.AOPackage
 * @generated
 */
public class AOSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AOPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AOSwitch() {
		if (modelPackage == null) {
			modelPackage = AOPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AOPackage.ASPECT_ADAPTATION: {
			AspectAdaptation aspectAdaptation = (AspectAdaptation) theEObject;
			T result = caseAspectAdaptation(aspectAdaptation);
			if (result == null)
				result = caseNamedElement(aspectAdaptation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AOPackage.ASPECT: {
			Aspect aspect = (Aspect) theEObject;
			T result = caseAspect(aspect);
			if (result == null)
				result = caseNamedElement(aspect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AOPackage.BEHAVIORAL_ADAPTATION: {
			BehavioralAdaptation behavioralAdaptation = (BehavioralAdaptation) theEObject;
			T result = caseBehavioralAdaptation(behavioralAdaptation);
			if (result == null)
				result = caseAspectAdaptation(behavioralAdaptation);
			if (result == null)
				result = caseNamedElement(behavioralAdaptation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AOPackage.STRUCTURAL_ADAPTATION: {
			StructuralAdaptation structuralAdaptation = (StructuralAdaptation) theEObject;
			T result = caseStructuralAdaptation(structuralAdaptation);
			if (result == null)
				result = caseAspectAdaptation(structuralAdaptation);
			if (result == null)
				result = caseNamedElement(structuralAdaptation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AOPackage.JOIN_POINT: {
			JoinPoint joinPoint = (JoinPoint) theEObject;
			T result = caseJoinPoint(joinPoint);
			if (result == null)
				result = caseNamedElement(joinPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AOPackage.POINTCUT: {
			Pointcut pointcut = (Pointcut) theEObject;
			T result = casePointcut(pointcut);
			if (result == null)
				result = caseNamedElement(pointcut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AOPackage.CROSSCUTTING: {
			Crosscutting crosscutting = (Crosscutting) theEObject;
			T result = caseCrosscutting(crosscutting);
			if (result == null)
				result = caseNamedElement(crosscutting);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AOPackage.CROSSCUTTING_INFORMATION: {
			CrosscuttingInformation crosscuttingInformation = (CrosscuttingInformation) theEObject;
			T result = caseCrosscuttingInformation(crosscuttingInformation);
			if (result == null)
				result = caseNamedElement(crosscuttingInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspectAdaptation(AspectAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralAdaptation(BehavioralAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralAdaptation(StructuralAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinPoint(JoinPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointcut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointcut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointcut(Pointcut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crosscutting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crosscutting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrosscutting(Crosscutting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crosscutting Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crosscutting Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrosscuttingInformation(CrosscuttingInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AOSwitch
