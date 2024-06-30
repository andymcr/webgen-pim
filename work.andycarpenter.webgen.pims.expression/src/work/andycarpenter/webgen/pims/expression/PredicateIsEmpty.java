/**
 */
package work.andycarpenter.webgen.pims.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Is Empty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.PredicateIsEmpty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateIsEmpty()
 * @model
 * @generated
 */
public interface PredicateIsEmpty extends Predicate {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Operand)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateIsEmpty_Value()
	 * @model containment="true"
	 * @generated
	 */
	Operand getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.PredicateIsEmpty#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Operand value);

} // PredicateIsEmpty
