/**
 */
package work.andycarpenter.webgen.pims.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.FunctionCall#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.FunctionCall#getActuals <em>Actuals</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getFunctionCall_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.FunctionCall#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actuals</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.expression.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuals</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getFunctionCall_Actuals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getActuals();

} // FunctionCall
