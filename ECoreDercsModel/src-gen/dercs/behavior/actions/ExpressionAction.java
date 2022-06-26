/**
 */
package dercs.behavior.actions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an action which evaluates a mathematical or boolean expression
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dercs.behavior.actions.ExpressionAction#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see dercs.behavior.actions.ActionsPackage#getExpressionAction()
 * @model
 * @generated
 */
public interface ExpressionAction extends ActionWithOutput {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression which will be evaluated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see dercs.behavior.actions.ActionsPackage#getExpressionAction_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link dercs.behavior.actions.ExpressionAction#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // ExpressionAction
