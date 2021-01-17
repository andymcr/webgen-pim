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
 *   <li>{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateBooleanVariable()
 * @model
 * @generated
 */
public interface PredicateBooleanVariable extends Predicate {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Variable)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateBooleanVariable_Feature()
	 * @model containment="true"
	 * @generated
	 */
	Variable getFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Variable value);

} // PredicateBooleanVariable
