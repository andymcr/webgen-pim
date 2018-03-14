/**
 */
package work.andycarpenter.webgen.pims.service;

import work.andycarpenter.webgen.pims.base.NamedElement;

import work.andycarpenter.webgen.pims.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Constant#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Constant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.service.Service#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' container reference.
	 * @see #setDefinedBy(Service)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getConstant_DefinedBy()
	 * @see work.andycarpenter.webgen.pims.service.Service#getConstants
	 * @model opposite="constants" required="true" transient="false"
	 * @generated
	 */
	Service getDefinedBy();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.Constant#getDefinedBy <em>Defined By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By</em>' container reference.
	 * @see #getDefinedBy()
	 * @generated
	 */
	void setDefinedBy(Service value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getConstant_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.Constant#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // Constant
