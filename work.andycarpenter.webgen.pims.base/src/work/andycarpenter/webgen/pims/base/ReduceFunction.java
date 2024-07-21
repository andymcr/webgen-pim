/**
 */
package work.andycarpenter.webgen.pims.base;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.Operand;
import work.andycarpenter.webgen.pims.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getValue <em>Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getCallback <em>Callback</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.base.BasePackage#getReduceFunction()
 * @model
 * @generated
 */
public interface ReduceFunction extends Operand {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Variable)
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getReduceFunction_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variable value);

	/**
	 * Returns the value of the '<em><b>Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback</em>' containment reference.
	 * @see #setCallback(Callable)
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getReduceFunction_Callback()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Callable getCallback();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getCallback <em>Callback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback</em>' containment reference.
	 * @see #getCallback()
	 * @generated
	 */
	void setCallback(Callable value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(Expression)
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getReduceFunction_Initial()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitial();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Expression value);
} // ReduceFunction
