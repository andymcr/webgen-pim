/**
 */
package work.andycarpenter.webgen.pims.persistence;

import work.andycarpenter.webgen.pims.base.FormalParameter;

import work.andycarpenter.webgen.pims.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ParameterVariable#getFormal <em>Formal</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getParameterVariable()
 * @model
 * @generated
 */
public interface ParameterVariable extends PathRoot, Variable {
	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(FormalParameter)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getParameterVariable_Formal()
	 * @model required="true"
	 * @generated
	 */
	FormalParameter getFormal();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ParameterVariable#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(FormalParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Entity contextEntity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String name();

} // ParameterVariable
