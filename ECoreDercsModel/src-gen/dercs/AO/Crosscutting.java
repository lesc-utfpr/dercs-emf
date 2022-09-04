/**
 */
package dercs.AO;

import dercs.structure.BaseElement;
import dercs.structure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crosscutting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents information inserted by an aspect in an object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.AO.Crosscutting#getAffectedElement <em>Affected Element</em>}</li>
 *   <li>{@link dercs.AO.Crosscutting#getCrosscuttingInformations <em>Crosscutting Informations</em>}</li>
 *   <li>{@link dercs.AO.Crosscutting#getAssociatedAspect <em>Associated Aspect</em>}</li>
 * </ul>
 *
 * @see dercs.AO.AOPackage#getCrosscutting()
 * @model
 * @generated
 */
public interface Crosscutting extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element affected by the aspect
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affected Element</em>' reference.
	 * @see #setAffectedElement(BaseElement)
	 * @see dercs.AO.AOPackage#getCrosscutting_AffectedElement()
	 * @model
	 * @generated
	 */
	BaseElement getAffectedElement();

	/**
	 * Sets the value of the '{@link dercs.AO.Crosscutting#getAffectedElement <em>Affected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Element</em>' reference.
	 * @see #getAffectedElement()
	 * @generated
	 */
	void setAffectedElement(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Crosscutting Informations</b></em>' reference list.
	 * The list contents are of type {@link dercs.AO.CrosscuttingInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The information inserted by the aspect
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crosscutting Informations</em>' reference list.
	 * @see dercs.AO.AOPackage#getCrosscutting_CrosscuttingInformations()
	 * @model
	 * @generated
	 */
	EList<CrosscuttingInformation> getCrosscuttingInformations();

	/**
	 * Returns the value of the '<em><b>Associated Aspect</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dercs.AO.Aspect#getCrosscutting <em>Crosscutting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aspect that affects the element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Aspect</em>' container reference.
	 * @see #setAssociatedAspect(Aspect)
	 * @see dercs.AO.AOPackage#getCrosscutting_AssociatedAspect()
	 * @see dercs.AO.Aspect#getCrosscutting
	 * @model opposite="crosscutting" transient="false"
	 * @generated
	 */
	Aspect getAssociatedAspect();

	/**
	 * Sets the value of the '{@link dercs.AO.Crosscutting#getAssociatedAspect <em>Associated Aspect</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Aspect</em>' container reference.
	 * @see #getAssociatedAspect()
	 * @generated
	 */
	void setAssociatedAspect(Aspect value);

	// MANUALLY ADDED

	/**
	 * Add a crosscutting information to an element.
	 * @param name Name of the crosscutting information.
	 * @param value Value of the crosscutting information.
	 * @generated NOT
	 */
	default CrosscuttingInformation addInformation(String name, String value) {
		CrosscuttingInformation result = AOFactory.eINSTANCE.createCrosscuttingInformation();
		result.setName(name);
		result.setValue(value);
		this.getCrosscuttingInformations().add(result);
		return result;
	}

	// === COMPATIBILITY ===

	/**
	 * @generated NOT
	 */
	default CrosscuttingInformation getInformationByName(String name) {
		for(CrosscuttingInformation info : getCrosscuttingInformations()) {
			if (info.getName().equals(name)) {
				return info;
			}
		}

		return null;
	}

	/**
	 * @generated NOT
	 */
	default String getValueOf(String name) {
		CrosscuttingInformation result = getInformationByName(name);
		if (result != null)
			return result.getValue();
		else
			return "";
	}

} // Crosscutting
