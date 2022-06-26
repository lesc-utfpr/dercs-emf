/**
 */
package dercs;

import dercs.AO.Aspect;
import dercs.AO.JoinPoint;
import dercs.behavior.Behavior;
import dercs.behavior.events.Event;
import dercs.datatypes.Enumeration;
import dercs.structure.runtime.Node;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the model of a DERTS. The model is composed of classes,
 * objects, behaviors, events, aspects and join points. Each of these elements
 * has it's own list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.Model#getClasses <em>Classes</em>}</li>
 *   <li>{@link dercs.Model#getObjects <em>Objects</em>}</li>
 *   <li>{@link dercs.Model#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link dercs.Model#getEvents <em>Events</em>}</li>
 *   <li>{@link dercs.Model#getAspects <em>Aspects</em>}</li>
 *   <li>{@link dercs.Model#getJoinPoints <em>Join Points</em>}</li>
 *   <li>{@link dercs.Model#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link dercs.Model#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see dercs.DercsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link dercs.structure.Class}.
	 * It is bidirectional and its opposite is '{@link dercs.structure.Class#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see dercs.DercsPackage#getModel_Classes()
	 * @see dercs.structure.Class#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<dercs.structure.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link dercs.structure.runtime.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see dercs.DercsPackage#getModel_Objects()
	 * @model
	 * @generated
	 */
	EList<dercs.structure.runtime.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' reference list.
	 * The list contents are of type {@link dercs.behavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' reference list.
	 * @see dercs.DercsPackage#getModel_Behaviors()
	 * @model
	 * @generated
	 */
	EList<Behavior> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link dercs.behavior.events.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see dercs.DercsPackage#getModel_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' reference list.
	 * The list contents are of type {@link dercs.AO.Aspect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' reference list.
	 * @see dercs.DercsPackage#getModel_Aspects()
	 * @model
	 * @generated
	 */
	EList<Aspect> getAspects();

	/**
	 * Returns the value of the '<em><b>Join Points</b></em>' reference list.
	 * The list contents are of type {@link dercs.AO.JoinPoint}.
	 * It is bidirectional and its opposite is '{@link dercs.AO.JoinPoint#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Points</em>' reference list.
	 * @see dercs.DercsPackage#getModel_JoinPoints()
	 * @see dercs.AO.JoinPoint#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<JoinPoint> getJoinPoints();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' reference list.
	 * The list contents are of type {@link dercs.datatypes.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' reference list.
	 * @see dercs.DercsPackage#getModel_Enumerations()
	 * @model
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link dercs.structure.runtime.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see dercs.DercsPackage#getModel_Nodes()
	 * @model
	 * @generated
	 */
	EList<Node> getNodes();

	// MANUALLY ADDED

	/**
	 * Get a node from the list of nodes.
	 * @param name Name of the node to be found
	 * @param platform Name of the platform implemented in the node
	 * @return The found node or null if there is no node with such characteristics.
	 * @generated NOT
	 */
	default Node getNode(String name, String platform) {
		return this.getNodes().stream()
				.filter(node -> node.getName().equals(name) && node.getPlatformName().equals(platform)).findFirst()
				.orElse(null);
	}
} // Model
