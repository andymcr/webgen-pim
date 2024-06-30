/**
 */
package work.andycarpenter.webgen.pims.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperation#getOperands <em>Operands</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getArithmeticOperation()
 * @model
 * @generated
 */
public interface ArithmeticOperation extends Expression {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.expression.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getArithmeticOperation_Operands()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Expression> getOperands();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.expression.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.expression.ArithmeticOperator
	 * @see #setOperator(ArithmeticOperator)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getArithmeticOperation_Operator()
	 * @model required="true"
	 * @generated
	 */
	ArithmeticOperator getOperator();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.expression.ArithmeticOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ArithmeticOperator value);

} // ArithmeticOperation
