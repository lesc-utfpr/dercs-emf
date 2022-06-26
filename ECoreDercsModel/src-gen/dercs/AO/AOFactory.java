/**
 */
package dercs.AO;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dercs.AO.AOPackage
 * @generated
 */
public interface AOFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AOFactory eINSTANCE = dercs.AO.impl.AOFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect</em>'.
	 * @generated
	 */
	Aspect createAspect();

	/**
	 * Returns a new object of class '<em>Behavioral Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavioral Adaptation</em>'.
	 * @generated
	 */
	BehavioralAdaptation createBehavioralAdaptation();

	/**
	 * Returns a new object of class '<em>Structural Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Adaptation</em>'.
	 * @generated
	 */
	StructuralAdaptation createStructuralAdaptation();

	/**
	 * Returns a new object of class '<em>Join Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Point</em>'.
	 * @generated
	 */
	JoinPoint createJoinPoint();

	/**
	 * Returns a new object of class '<em>Pointcut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointcut</em>'.
	 * @generated
	 */
	Pointcut createPointcut();

	/**
	 * Returns a new object of class '<em>Crosscutting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crosscutting</em>'.
	 * @generated
	 */
	Crosscutting createCrosscutting();

	/**
	 * Returns a new object of class '<em>Crosscutting Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crosscutting Information</em>'.
	 * @generated
	 */
	CrosscuttingInformation createCrosscuttingInformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AOPackage getAOPackage();

} //AOFactory
