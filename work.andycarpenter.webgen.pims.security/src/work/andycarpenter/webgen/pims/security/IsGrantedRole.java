/**
 */
package work.andycarpenter.webgen.pims.security;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Granted Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.security.IsGrantedRole#isNegated <em>Negated</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.IsGrantedRole#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getIsGrantedRole()
 * @model
 * @generated
 */
public interface IsGrantedRole extends AuthorisationExpression {
	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getIsGrantedRole_Negated()
	 * @model default="false"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.IsGrantedRole#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getIsGrantedRole_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.IsGrantedRole#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // IsGrantedRole
