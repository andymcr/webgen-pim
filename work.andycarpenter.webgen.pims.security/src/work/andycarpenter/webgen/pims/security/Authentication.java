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
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationName <em>Implicit Registration Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationLabel <em>Implicit Registration Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUri <em>Implicit Registration Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginName <em>Implicit Login Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginLabel <em>Implicit Login Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUri <em>Implicit Login Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutName <em>Implicit Logout Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutLabel <em>Implicit Logout Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUri <em>Implicit Logout Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordName <em>Implicit Forgotten Password Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordLabel <em>Implicit Forgotten Password Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUri <em>Implicit Forgotten Password Uri</em>}</li>
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
	 * Returns the value of the '<em><b>Implicit Registration Name</b></em>' attribute.
	 * The default value is <code>"registration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Registration Name</em>' attribute.
	 * @see #setImplicitRegistrationName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitRegistrationName()
	 * @model default="registration" ordered="false"
	 * @generated
	 */
	String getImplicitRegistrationName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationName <em>Implicit Registration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Registration Name</em>' attribute.
	 * @see #getImplicitRegistrationName()
	 * @generated
	 */
	void setImplicitRegistrationName(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Registration Label</b></em>' attribute.
	 * The default value is <code>"Create Account"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Registration Label</em>' attribute.
	 * @see #setImplicitRegistrationLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitRegistrationLabel()
	 * @model default="Create Account" ordered="false"
	 * @generated
	 */
	String getImplicitRegistrationLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationLabel <em>Implicit Registration Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Registration Label</em>' attribute.
	 * @see #getImplicitRegistrationLabel()
	 * @generated
	 */
	void setImplicitRegistrationLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Registration Uri</b></em>' attribute.
	 * The default value is <code>"register"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Registration Uri</em>' attribute.
	 * @see #setImplicitRegistrationUri(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitRegistrationUri()
	 * @model default="register" ordered="false"
	 * @generated
	 */
	String getImplicitRegistrationUri();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUri <em>Implicit Registration Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Registration Uri</em>' attribute.
	 * @see #getImplicitRegistrationUri()
	 * @generated
	 */
	void setImplicitRegistrationUri(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Login Name</b></em>' attribute.
	 * The default value is <code>"login"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Login Name</em>' attribute.
	 * @see #setImplicitLoginName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLoginName()
	 * @model default="login" ordered="false"
	 * @generated
	 */
	String getImplicitLoginName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginName <em>Implicit Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Login Name</em>' attribute.
	 * @see #getImplicitLoginName()
	 * @generated
	 */
	void setImplicitLoginName(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Login Label</b></em>' attribute.
	 * The default value is <code>"Login"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Login Label</em>' attribute.
	 * @see #setImplicitLoginLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLoginLabel()
	 * @model default="Login" ordered="false"
	 * @generated
	 */
	String getImplicitLoginLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginLabel <em>Implicit Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Login Label</em>' attribute.
	 * @see #getImplicitLoginLabel()
	 * @generated
	 */
	void setImplicitLoginLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Login Uri</b></em>' attribute.
	 * The default value is <code>"login"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Login Uri</em>' attribute.
	 * @see #setImplicitLoginUri(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLoginUri()
	 * @model default="login" ordered="false"
	 * @generated
	 */
	String getImplicitLoginUri();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUri <em>Implicit Login Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Login Uri</em>' attribute.
	 * @see #getImplicitLoginUri()
	 * @generated
	 */
	void setImplicitLoginUri(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Logout Name</b></em>' attribute.
	 * The default value is <code>"logout"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Logout Name</em>' attribute.
	 * @see #setImplicitLogoutName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLogoutName()
	 * @model default="logout" ordered="false"
	 * @generated
	 */
	String getImplicitLogoutName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutName <em>Implicit Logout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Logout Name</em>' attribute.
	 * @see #getImplicitLogoutName()
	 * @generated
	 */
	void setImplicitLogoutName(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Logout Label</b></em>' attribute.
	 * The default value is <code>"Logout"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Logout Label</em>' attribute.
	 * @see #setImplicitLogoutLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLogoutLabel()
	 * @model default="Logout" ordered="false"
	 * @generated
	 */
	String getImplicitLogoutLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutLabel <em>Implicit Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Logout Label</em>' attribute.
	 * @see #getImplicitLogoutLabel()
	 * @generated
	 */
	void setImplicitLogoutLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Logout Uri</b></em>' attribute.
	 * The default value is <code>"logout"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Logout Uri</em>' attribute.
	 * @see #setImplicitLogoutUri(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLogoutUri()
	 * @model default="logout" ordered="false"
	 * @generated
	 */
	String getImplicitLogoutUri();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUri <em>Implicit Logout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Logout Uri</em>' attribute.
	 * @see #getImplicitLogoutUri()
	 * @generated
	 */
	void setImplicitLogoutUri(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Name</b></em>' attribute.
	 * The default value is <code>"reset"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Name</em>' attribute.
	 * @see #setImplicitForgottenPasswordName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordName()
	 * @model default="reset" ordered="false"
	 * @generated
	 */
	String getImplicitForgottenPasswordName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordName <em>Implicit Forgotten Password Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Name</em>' attribute.
	 * @see #getImplicitForgottenPasswordName()
	 * @generated
	 */
	void setImplicitForgottenPasswordName(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Label</b></em>' attribute.
	 * The default value is <code>"Forgotten Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Label</em>' attribute.
	 * @see #setImplicitForgottenPasswordLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordLabel()
	 * @model default="Forgotten Password" ordered="false"
	 * @generated
	 */
	String getImplicitForgottenPasswordLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordLabel <em>Implicit Forgotten Password Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Label</em>' attribute.
	 * @see #getImplicitForgottenPasswordLabel()
	 * @generated
	 */
	void setImplicitForgottenPasswordLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Uri</b></em>' attribute.
	 * The default value is <code>"reset-password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Uri</em>' attribute.
	 * @see #setImplicitForgottenPasswordUri(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordUri()
	 * @model default="reset-password" ordered="false"
	 * @generated
	 */
	String getImplicitForgottenPasswordUri();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUri <em>Implicit Forgotten Password Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Uri</em>' attribute.
	 * @see #getImplicitForgottenPasswordUri()
	 * @generated
	 */
	void setImplicitForgottenPasswordUri(String value);

} // Authentication
