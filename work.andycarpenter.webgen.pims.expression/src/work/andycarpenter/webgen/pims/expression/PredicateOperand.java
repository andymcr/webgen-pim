/**
 */
package work.andycarpenter.webgen.pims.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.PredicateOperand#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateOperand()
 * @model
 * @generated
 */
public interface PredicateOperand extends Predicate {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Operand)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateOperand_Operand()
	 * @model containment="true"
	 * @generated
	 */
	Operand getOperand();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.PredicateOperand#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Operand value);

} // PredicateOperand
