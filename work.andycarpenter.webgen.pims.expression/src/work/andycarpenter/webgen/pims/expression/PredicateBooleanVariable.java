/**
 */
package work.andycarpenter.webgen.pims.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateBooleanVariable()
 * @model
 * @generated
 */
public interface PredicateBooleanVariable extends Predicate {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateBooleanVariable_Variable()
	 * @model containment="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // PredicateBooleanVariable
