/**
 */
package work.andycarpenter.webgen.pims.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Is Member Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.PredicateIsMemberOf#getLeft <em>Left</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.PredicateIsMemberOf#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateIsMemberOf()
 * @model
 * @generated
 */
public interface PredicateIsMemberOf extends Predicate {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Variable)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateIsMemberOf_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getLeft();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.PredicateIsMemberOf#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Variable value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Variable)
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getPredicateIsMemberOf_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getRight();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.expression.PredicateIsMemberOf#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Variable value);

} // PredicateIsMemberOf
