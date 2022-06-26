/**
 */
package dercs.AO;

import dercs.structure.BaseElement;
import dercs.structure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an aspect of DERAF. An aspect is a unit of modularization of a 
 * crosscutting concern with respect to another concern. An aspect has 
 * adaptations that are applied into specific elements of a concern (join 
 * points). There is two sorts of adaptations:
 * <br>1. Structural adaptation modifies the structure of the affected concerns 
 * by adding, removing or changing structural charateristics. 
 * <br>2. Behavioral adaptation modifies the behavior of the affected concerns
 * by adding, removing or changing the actions performed within the context
 * of a concern.
 * The link between adaptations and join points is called pointcut.
 * A pointcut can link an adaptation to several distinct join points, indicating
 * a relative position in which the adaptation is applied. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.Aspect#getStructuralAdaptations <em>Structural Adaptations</em>}</li>
 *   <li>{@link dercs.AO.Aspect#getBehavioralAdaptations <em>Behavioral Adaptations</em>}</li>
 *   <li>{@link dercs.AO.Aspect#getPointcuts <em>Pointcuts</em>}</li>
 *   <li>{@link dercs.AO.Aspect#getCrosscutting <em>Crosscutting</em>}</li>
 * </ul>
 *
 * @see dercs.AO.AOPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Structural Adaptations</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.AO.StructuralAdaptation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Adaptations</em>' containment reference list.
	 * @see dercs.AO.AOPackage#getAspect_StructuralAdaptations()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuralAdaptation> getStructuralAdaptations();

	/**
	 * Returns the value of the '<em><b>Behavioral Adaptations</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.AO.BehavioralAdaptation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral Adaptations</em>' containment reference list.
	 * @see dercs.AO.AOPackage#getAspect_BehavioralAdaptations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehavioralAdaptation> getBehavioralAdaptations();

	/**
	 * Returns the value of the '<em><b>Pointcuts</b></em>' reference list.
	 * The list contents are of type {@link dercs.AO.Pointcut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcuts</em>' reference list.
	 * @see dercs.AO.AOPackage#getAspect_Pointcuts()
	 * @model
	 * @generated
	 */
	EList<Pointcut> getPointcuts();

	/**
	 * Returns the value of the '<em><b>Crosscutting</b></em>' containment reference list.
	 * The list contents are of type {@link dercs.AO.Crosscutting}.
	 * It is bidirectional and its opposite is '{@link dercs.AO.Crosscutting#getAssociatedAspect <em>Associated Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crosscutting</em>' containment reference list.
	 * @see dercs.AO.AOPackage#getAspect_Crosscutting()
	 * @see dercs.AO.Crosscutting#getAssociatedAspect
	 * @model opposite="associatedAspect" containment="true"
	 * @generated
	 */
	EList<Crosscutting> getCrosscutting();

	// MANUALLY ADDED

	/**
	 * Get a structural adaptation of the aspect.
	 * @param name Name of the structural adaptation.
	 * @return the structural adaptation.
	 * @generated NOT
	 */
	default StructuralAdaptation getStructuralAdaptation(String name) {
		return this.getStructuralAdaptations().stream().filter(adapt -> adapt.getName().equals(name)).findFirst()
				.orElse(null);
	}

	/**
	 * Get a behavioral adaptation of the aspect.
	 * @param name Name of the behavioral adaptation.
	 * @return the behavioral adaptation.
	 * @generated NOT
	 */
	default BehavioralAdaptation getBehavioralAdaptation(String name) {
		return this.getBehavioralAdaptations().stream().filter(adapt -> adapt.getName().equals(name)).findFirst()
				.orElse(null);
	}

	/**
	 * Add a structural adaptation to the aspect.
	 * @param name Name of the adaptation
	 * @return the created adaptation.
	 * @generated NOT
	 */
	default StructuralAdaptation addStructuralAdaptation(String name) {
		StructuralAdaptation result = AOFactory.eINSTANCE.createStructuralAdaptation();
		result.setName(name);
		result.setOwner(this);
		this.getStructuralAdaptations().add(result);
		return result;
	}

	/**
	 * Add a behavioral adaptation to the aspect.
	 * @param name Name of the adaptation
	 * @return the created adaptation.
	 * @generated NOT
	 */
	default BehavioralAdaptation addBehavioralAdaptation(String name) {
		BehavioralAdaptation result = AOFactory.eINSTANCE.createBehavioralAdaptation();
		result.setName(name);
		result.setOwner(this);
		this.getBehavioralAdaptations().add(result);
		return result;
	}

	/**
	 * Get the crosscutting information associated with an element that is 
	 * affected by the aspect.
	 * @param affectedElement Element that has crosscutting information.
	 * @return The crosscutting object.
	 * @generated NOT
	 */
	default Crosscutting getCrosscutting(BaseElement affectedElement) {
		return this.getCrosscutting().stream().filter(cross -> cross.getAffectedElement() == affectedElement)
				.findFirst().orElse(null);
	}

	/**
	 * Add crosscutting information related to an element that is affected 
	 * by the aspect.
	 * @param affectedElement Element affected by the aspect.
	 * @return The crosscutting object.
	 * @generated NOT
	 */
	default Crosscutting addCrosscuting(BaseElement affectedElement) {
		Crosscutting result = getCrosscutting(affectedElement);
		if (result == null) {
			result = AOFactory.eINSTANCE.createCrosscutting();
			result.setAffectedElement(affectedElement);
			result.setAssociatedAspect(this);
			result.setName("CrosscuttingObject");
			this.getCrosscutting().add(result);
		}
		return result;
	}

} // Aspect
