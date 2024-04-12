/**
 */
package work.andycarpenter.webgen.pims.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.SizeFunction#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getSizeFunction()
 * @model
 * @generated
 */
public interface SizeFunction extends Expression {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Variable)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getSizeFunction_Feature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.SizeFunction#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Variable value);

} // SizeFunction
