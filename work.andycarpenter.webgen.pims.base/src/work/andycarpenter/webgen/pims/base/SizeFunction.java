/**
 */
package work.andycarpenter.webgen.pims.base;

import work.andycarpenter.webgen.pims.expression.Operand;
import work.andycarpenter.webgen.pims.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.base.SizeFunction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.base.BasePackage#getSizeFunction()
 * @model
 * @generated
 */
public interface SizeFunction extends Operand {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Variable)
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getSizeFunction_Value()
	 * @model containment="true"
	 * @generated
	 */
	Variable getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.SizeFunction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variable value);
} // SizeFunction
