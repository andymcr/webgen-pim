/**
 */
package work.andycarpenter.webgen.pims.base;

import work.andycarpenter.webgen.pims.expression.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.base.IntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.base.BasePackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getIntegerLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.IntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerLiteral
