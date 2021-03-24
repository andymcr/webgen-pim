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
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUnitLabel <em>Implicit Registration Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationActionLabel <em>Implicit Registration Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationConfirmLabel <em>Implicit Registration Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUri <em>Implicit Registration Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginName <em>Implicit Login Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUnitLabel <em>Implicit Login Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginActionLabel <em>Implicit Login Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginConfirmLabel <em>Implicit Login Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUri <em>Implicit Login Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutName <em>Implicit Logout Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUnitLabel <em>Implicit Logout Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutActionLabel <em>Implicit Logout Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutConfirmLabel <em>Implicit Logout Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUri <em>Implicit Logout Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordName <em>Implicit Forgotten Password Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUnitLabel <em>Implicit Forgotten Password Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordActionLabel <em>Implicit Forgotten Password Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordConfirmLabel <em>Implicit Forgotten Password Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriRequest <em>Implicit Forgotten Password Uri Request</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriEmailSent <em>Implicit Forgotten Password Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriReset <em>Implicit Forgotten Password Uri Reset</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailSubject <em>Implicit Forgotten Password Email Subject</em>}</li>
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
	 * Returns the value of the '<em><b>Implicit Registration Unit Label</b></em>' attribute.
	 * The default value is <code>"Create Account"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Registration Unit Label</em>' attribute.
	 * @see #setImplicitRegistrationUnitLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitRegistrationUnitLabel()
	 * @model default="Create Account" ordered="false"
	 * @generated
	 */
	String getImplicitRegistrationUnitLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUnitLabel <em>Implicit Registration Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Registration Unit Label</em>' attribute.
	 * @see #getImplicitRegistrationUnitLabel()
	 * @generated
	 */
	void setImplicitRegistrationUnitLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Registration Action Label</b></em>' attribute.
	 * The default value is <code>"Create Account"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Registration Action Label</em>' attribute.
	 * @see #setImplicitRegistrationActionLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitRegistrationActionLabel()
	 * @model default="Create Account"
	 * @generated
	 */
	String getImplicitRegistrationActionLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationActionLabel <em>Implicit Registration Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Registration Action Label</em>' attribute.
	 * @see #getImplicitRegistrationActionLabel()
	 * @generated
	 */
	void setImplicitRegistrationActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Registration Confirm Label</b></em>' attribute.
	 * The default value is <code>"Create Account"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Registration Confirm Label</em>' attribute.
	 * @see #setImplicitRegistrationConfirmLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitRegistrationConfirmLabel()
	 * @model default="Create Account"
	 * @generated
	 */
	String getImplicitRegistrationConfirmLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationConfirmLabel <em>Implicit Registration Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Registration Confirm Label</em>' attribute.
	 * @see #getImplicitRegistrationConfirmLabel()
	 * @generated
	 */
	void setImplicitRegistrationConfirmLabel(String value);

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
	 * Returns the value of the '<em><b>Implicit Login Unit Label</b></em>' attribute.
	 * The default value is <code>"Login"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Login Unit Label</em>' attribute.
	 * @see #setImplicitLoginUnitLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLoginUnitLabel()
	 * @model default="Login" ordered="false"
	 * @generated
	 */
	String getImplicitLoginUnitLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUnitLabel <em>Implicit Login Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Login Unit Label</em>' attribute.
	 * @see #getImplicitLoginUnitLabel()
	 * @generated
	 */
	void setImplicitLoginUnitLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Login Action Label</b></em>' attribute.
	 * The default value is <code>"Login"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Login Action Label</em>' attribute.
	 * @see #setImplicitLoginActionLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLoginActionLabel()
	 * @model default="Login"
	 * @generated
	 */
	String getImplicitLoginActionLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginActionLabel <em>Implicit Login Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Login Action Label</em>' attribute.
	 * @see #getImplicitLoginActionLabel()
	 * @generated
	 */
	void setImplicitLoginActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Login Confirm Label</b></em>' attribute.
	 * The default value is <code>"Login"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Login Confirm Label</em>' attribute.
	 * @see #setImplicitLoginConfirmLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLoginConfirmLabel()
	 * @model default="Login"
	 * @generated
	 */
	String getImplicitLoginConfirmLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginConfirmLabel <em>Implicit Login Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Login Confirm Label</em>' attribute.
	 * @see #getImplicitLoginConfirmLabel()
	 * @generated
	 */
	void setImplicitLoginConfirmLabel(String value);

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
	 * Returns the value of the '<em><b>Implicit Logout Unit Label</b></em>' attribute.
	 * The default value is <code>"Logout"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Logout Unit Label</em>' attribute.
	 * @see #setImplicitLogoutUnitLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLogoutUnitLabel()
	 * @model default="Logout" ordered="false"
	 * @generated
	 */
	String getImplicitLogoutUnitLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUnitLabel <em>Implicit Logout Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Logout Unit Label</em>' attribute.
	 * @see #getImplicitLogoutUnitLabel()
	 * @generated
	 */
	void setImplicitLogoutUnitLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Logout Action Label</b></em>' attribute.
	 * The default value is <code>"Logout"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Logout Action Label</em>' attribute.
	 * @see #setImplicitLogoutActionLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLogoutActionLabel()
	 * @model default="Logout"
	 * @generated
	 */
	String getImplicitLogoutActionLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutActionLabel <em>Implicit Logout Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Logout Action Label</em>' attribute.
	 * @see #getImplicitLogoutActionLabel()
	 * @generated
	 */
	void setImplicitLogoutActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Logout Confirm Label</b></em>' attribute.
	 * The default value is <code>"Logout"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Logout Confirm Label</em>' attribute.
	 * @see #setImplicitLogoutConfirmLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitLogoutConfirmLabel()
	 * @model default="Logout"
	 * @generated
	 */
	String getImplicitLogoutConfirmLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutConfirmLabel <em>Implicit Logout Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Logout Confirm Label</em>' attribute.
	 * @see #getImplicitLogoutConfirmLabel()
	 * @generated
	 */
	void setImplicitLogoutConfirmLabel(String value);

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
	 * Returns the value of the '<em><b>Implicit Forgotten Password Unit Label</b></em>' attribute.
	 * The default value is <code>"Reset Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Unit Label</em>' attribute.
	 * @see #setImplicitForgottenPasswordUnitLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordUnitLabel()
	 * @model default="Reset Password" ordered="false"
	 * @generated
	 */
	String getImplicitForgottenPasswordUnitLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUnitLabel <em>Implicit Forgotten Password Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Unit Label</em>' attribute.
	 * @see #getImplicitForgottenPasswordUnitLabel()
	 * @generated
	 */
	void setImplicitForgottenPasswordUnitLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Action Label</b></em>' attribute.
	 * The default value is <code>"Forgotten Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Action Label</em>' attribute.
	 * @see #setImplicitForgottenPasswordActionLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordActionLabel()
	 * @model default="Forgotten Password"
	 * @generated
	 */
	String getImplicitForgottenPasswordActionLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordActionLabel <em>Implicit Forgotten Password Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Action Label</em>' attribute.
	 * @see #getImplicitForgottenPasswordActionLabel()
	 * @generated
	 */
	void setImplicitForgottenPasswordActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Confirm Label</b></em>' attribute.
	 * The default value is <code>"Reset Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Confirm Label</em>' attribute.
	 * @see #setImplicitForgottenPasswordConfirmLabel(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordConfirmLabel()
	 * @model default="Reset Password"
	 * @generated
	 */
	String getImplicitForgottenPasswordConfirmLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordConfirmLabel <em>Implicit Forgotten Password Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Confirm Label</em>' attribute.
	 * @see #getImplicitForgottenPasswordConfirmLabel()
	 * @generated
	 */
	void setImplicitForgottenPasswordConfirmLabel(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Uri Request</b></em>' attribute.
	 * The default value is <code>"reset-password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Uri Request</em>' attribute.
	 * @see #setImplicitForgottenPasswordUriRequest(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordUriRequest()
	 * @model default="reset-password" ordered="false"
	 * @generated
	 */
	String getImplicitForgottenPasswordUriRequest();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriRequest <em>Implicit Forgotten Password Uri Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Uri Request</em>' attribute.
	 * @see #getImplicitForgottenPasswordUriRequest()
	 * @generated
	 */
	void setImplicitForgottenPasswordUriRequest(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Uri Email Sent</b></em>' attribute.
	 * The default value is <code>"check-email"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Uri Email Sent</em>' attribute.
	 * @see #setImplicitForgottenPasswordUriEmailSent(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordUriEmailSent()
	 * @model default="check-email" ordered="false"
	 * @generated
	 */
	String getImplicitForgottenPasswordUriEmailSent();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriEmailSent <em>Implicit Forgotten Password Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Uri Email Sent</em>' attribute.
	 * @see #getImplicitForgottenPasswordUriEmailSent()
	 * @generated
	 */
	void setImplicitForgottenPasswordUriEmailSent(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Uri Reset</b></em>' attribute.
	 * The default value is <code>"reset"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Uri Reset</em>' attribute.
	 * @see #setImplicitForgottenPasswordUriReset(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordUriReset()
	 * @model default="reset" ordered="false"
	 * @generated
	 */
	String getImplicitForgottenPasswordUriReset();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriReset <em>Implicit Forgotten Password Uri Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Uri Reset</em>' attribute.
	 * @see #getImplicitForgottenPasswordUriReset()
	 * @generated
	 */
	void setImplicitForgottenPasswordUriReset(String value);

	/**
	 * Returns the value of the '<em><b>Implicit Forgotten Password Email Subject</b></em>' attribute.
	 * The default value is <code>"Your password reset request"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Forgotten Password Email Subject</em>' attribute.
	 * @see #setImplicitForgottenPasswordEmailSubject(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getAuthentication_ImplicitForgottenPasswordEmailSubject()
	 * @model default="Your password reset request" ordered="false"
	 * @generated
	 */
	String getImplicitForgottenPasswordEmailSubject();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailSubject <em>Implicit Forgotten Password Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Forgotten Password Email Subject</em>' attribute.
	 * @see #getImplicitForgottenPasswordEmailSubject()
	 * @generated
	 */
	void setImplicitForgottenPasswordEmailSubject(String value);

} // Authentication
