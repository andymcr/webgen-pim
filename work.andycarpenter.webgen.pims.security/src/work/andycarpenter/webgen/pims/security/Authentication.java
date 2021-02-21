/**
 */
package work.andycarpenter.webgen.pims.security;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getSecurity <em>Security</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getUser <em>User</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getUserKey <em>User Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getRegistrationName <em>Registration Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getRegistrationLabel <em>Registration Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getRegistrationUri <em>Registration Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getLoginName <em>Login Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getLoginUri <em>Login Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getLogoutName <em>Logout Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getLogoutLabel <em>Logout Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getLogoutUri <em>Logout Uri</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='userKeyFromUser userKeyRequiredAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL userKeyFromUser='not user.oclIsUndefined() and not userKey.oclIsUndefined() implies\r\n\tuser.features-&gt;includes(userKey)' userKeyRequiredAttribute='not userKey.oclIsUndefined() implies\n\tuserKey.cardinality = persistence::Cardinality::Required'"
 * @generated
 */
public interface Authentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Security</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.security.Security#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' container reference.
	 * @see #setSecurity(Security)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_Security()
	 * @see work.andycarpenter.webgen.pims.security.Security#getAuthentication
	 * @model opposite="authentication" required="true" transient="false"
	 * @generated
	 */
	Security getSecurity();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getSecurity <em>Security</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' container reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(Entity)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Entity getUser();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(Entity value);

	/**
	 * Returns the value of the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Key</em>' reference.
	 * @see #setUserKey(Attribute)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_UserKey()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getUserKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getUserKey <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Key</em>' reference.
	 * @see #getUserKey()
	 * @generated
	 */
	void setUserKey(Attribute value);

	/**
	 * Returns the value of the '<em><b>Registration Name</b></em>' attribute.
	 * The default value is <code>"registration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Name</em>' attribute.
	 * @see #setRegistrationName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_RegistrationName()
	 * @model default="registration" ordered="false"
	 * @generated
	 */
	String getRegistrationName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getRegistrationName <em>Registration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Name</em>' attribute.
	 * @see #getRegistrationName()
	 * @generated
	 */
	void setRegistrationName(String value);

	/**
	 * Returns the value of the '<em><b>Registration Label</b></em>' attribute.
	 * The default value is <code>"Register"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Label</em>' attribute.
	 * @see #setRegistrationLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_RegistrationLabel()
	 * @model default="Register" ordered="false"
	 * @generated
	 */
	String getRegistrationLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getRegistrationLabel <em>Registration Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Label</em>' attribute.
	 * @see #getRegistrationLabel()
	 * @generated
	 */
	void setRegistrationLabel(String value);

	/**
	 * Returns the value of the '<em><b>Registration Uri</b></em>' attribute.
	 * The default value is <code>"register"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Uri</em>' attribute.
	 * @see #setRegistrationUri(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_RegistrationUri()
	 * @model default="register" ordered="false"
	 * @generated
	 */
	String getRegistrationUri();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getRegistrationUri <em>Registration Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Uri</em>' attribute.
	 * @see #getRegistrationUri()
	 * @generated
	 */
	void setRegistrationUri(String value);

	/**
	 * Returns the value of the '<em><b>Login Name</b></em>' attribute.
	 * The default value is <code>"login"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Name</em>' attribute.
	 * @see #setLoginName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_LoginName()
	 * @model default="login" ordered="false"
	 * @generated
	 */
	String getLoginName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getLoginName <em>Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Name</em>' attribute.
	 * @see #getLoginName()
	 * @generated
	 */
	void setLoginName(String value);

	/**
	 * Returns the value of the '<em><b>Login Label</b></em>' attribute.
	 * The default value is <code>"Login"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Label</em>' attribute.
	 * @see #setLoginLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_LoginLabel()
	 * @model default="Login" ordered="false"
	 * @generated
	 */
	String getLoginLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getLoginLabel <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Label</em>' attribute.
	 * @see #getLoginLabel()
	 * @generated
	 */
	void setLoginLabel(String value);

	/**
	 * Returns the value of the '<em><b>Login Uri</b></em>' attribute.
	 * The default value is <code>"login"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Uri</em>' attribute.
	 * @see #setLoginUri(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_LoginUri()
	 * @model default="login" ordered="false"
	 * @generated
	 */
	String getLoginUri();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getLoginUri <em>Login Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Uri</em>' attribute.
	 * @see #getLoginUri()
	 * @generated
	 */
	void setLoginUri(String value);

	/**
	 * Returns the value of the '<em><b>Logout Name</b></em>' attribute.
	 * The default value is <code>"logout"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Name</em>' attribute.
	 * @see #setLogoutName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_LogoutName()
	 * @model default="logout" ordered="false"
	 * @generated
	 */
	String getLogoutName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getLogoutName <em>Logout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Name</em>' attribute.
	 * @see #getLogoutName()
	 * @generated
	 */
	void setLogoutName(String value);

	/**
	 * Returns the value of the '<em><b>Logout Label</b></em>' attribute.
	 * The default value is <code>"Logout"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logout Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Label</em>' attribute.
	 * @see #setLogoutLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_LogoutLabel()
	 * @model default="Logout" ordered="false"
	 * @generated
	 */
	String getLogoutLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getLogoutLabel <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Label</em>' attribute.
	 * @see #getLogoutLabel()
	 * @generated
	 */
	void setLogoutLabel(String value);

	/**
	 * Returns the value of the '<em><b>Logout Uri</b></em>' attribute.
	 * The default value is <code>"logout"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Uri</em>' attribute.
	 * @see #setLogoutUri(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_LogoutUri()
	 * @model default="logout" ordered="false"
	 * @generated
	 */
	String getLogoutUri();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getLogoutUri <em>Logout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Uri</em>' attribute.
	 * @see #getLogoutUri()
	 * @generated
	 */
	void setLogoutUri(String value);

} // Authentication
