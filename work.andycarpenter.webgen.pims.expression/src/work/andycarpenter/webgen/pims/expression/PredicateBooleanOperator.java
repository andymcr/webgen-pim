/**
 */
package work.andycarpenter.webgen.pims.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateBooleanOperator()
 * @model
 * @generated
 */
public interface PredicateBooleanOperator extends Predicate {
	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.expression.Predicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateBooleanOperator_Predicates()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Predicate> getPredicates();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"And"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.expression.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.expression.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateBooleanOperator_Operator()
	 * @model default="And" unique="false" required="true"
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.expression.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // PredicateBooleanOperator
