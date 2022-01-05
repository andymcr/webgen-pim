/**
 */
package work.andycarpenter.metamodel.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cas Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.CasAuthentication#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.CasAuthentication#getLogoutLabel <em>Logout Label</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getCasAuthentication()
 * @model
 * @generated
 */
public interface CasAuthentication extends Authentication {
	/**
	 * Returns the value of the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Label</em>' attribute.
	 * @see #setLoginLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getCasAuthentication_LoginLabel()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getLoginLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.CasAuthentication#getLoginLabel <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Label</em>' attribute.
	 * @see #getLoginLabel()
	 * @generated
	 */
	void setLoginLabel(String value);

	/**
	 * Returns the value of the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Label</em>' attribute.
	 * @see #setLogoutLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getCasAuthentication_LogoutLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getLogoutLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.CasAuthentication#getLogoutLabel <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Label</em>' attribute.
	 * @see #getLogoutLabel()
	 * @generated
	 */
	void setLogoutLabel(String value);

} // CasAuthentication
