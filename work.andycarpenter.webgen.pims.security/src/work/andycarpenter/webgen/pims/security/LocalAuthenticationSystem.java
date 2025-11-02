/**
 */
package work.andycarpenter.webgen.pims.security;

import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationName <em>Authentication Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getUserKey <em>User Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getIdentifierFeature <em>Identifier Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getPasswordFeature <em>Password Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordRequestName <em>Reset Password Request Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getLogoutUnit <em>Logout Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordUnit <em>Reset Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getViewRole <em>View Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getEditRole <em>Edit Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isTrackLoginAttempts <em>Track Login Attempts</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='authenticationKeyFromUserModel authenticationKeyRequiredAttribute userKeyFromAuthhenticationModel userKeyRequiredAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL authenticationKeyFromUserModel='not userModel.oclIsUndefined() and not authenticationKey.oclIsUndefined() implies\n\tuserModel.features-&gt;includes(authenticationKey)' authenticationKeyRequiredAttribute='not authenticationKey.oclIsUndefined() implies\n\tauthenticationKey.cardinality = persistence::Cardinality::Required' userKeyFromAuthhenticationModel='not authenticationModel.oclIsUndefined() and not userKey.oclIsUndefined() implies\n\tauthenticationModel.features-&gt;includes(userKey)' userKeyRequiredAttribute='not userKey.oclIsUndefined() implies\n\tuserKey.cardinality = persistence::Cardinality::Required'"
 * @generated
 */
public interface LocalAuthenticationSystem extends Authentication {
	/**
	 * Returns the value of the '<em><b>Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Model</em>' reference.
	 * @see #setAuthenticationModel(Entity)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_AuthenticationModel()
	 * @model ordered="false"
	 * @generated
	 */
	Entity getAuthenticationModel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Model</em>' reference.
	 * @see #getAuthenticationModel()
	 * @generated
	 */
	void setAuthenticationModel(Entity value);

	/**
	 * Returns the value of the '<em><b>Authentication Name</b></em>' attribute.
	 * The default value is <code>"Authentication"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Name</em>' attribute.
	 * @see #setAuthenticationName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_AuthenticationName()
	 * @model default="Authentication"
	 * @generated
	 */
	String getAuthenticationName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationName <em>Authentication Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Name</em>' attribute.
	 * @see #getAuthenticationName()
	 * @generated
	 */
	void setAuthenticationName(String value);

	/**
	 * Returns the value of the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Key</em>' reference.
	 * @see #setUserKey(Attribute)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_UserKey()
	 * @model
	 * @generated
	 */
	Attribute getUserKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getUserKey <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Key</em>' reference.
	 * @see #getUserKey()
	 * @generated
	 */
	void setUserKey(Attribute value);

	/**
	 * Returns the value of the '<em><b>Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Key</em>' reference.
	 * @see #setAuthenticationKey(Attribute)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_AuthenticationKey()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getAuthenticationKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Key</em>' reference.
	 * @see #getAuthenticationKey()
	 * @generated
	 */
	void setAuthenticationKey(Attribute value);

	/**
	 * Returns the value of the '<em><b>Identifier Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Feature</em>' reference.
	 * @see #setIdentifierFeature(Attribute)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_IdentifierFeature()
	 * @model
	 * @generated
	 */
	Attribute getIdentifierFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getIdentifierFeature <em>Identifier Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Feature</em>' reference.
	 * @see #getIdentifierFeature()
	 * @generated
	 */
	void setIdentifierFeature(Attribute value);

	/**
	 * Returns the value of the '<em><b>Password Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Feature</em>' reference.
	 * @see #setPasswordFeature(Attribute)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_PasswordFeature()
	 * @model
	 * @generated
	 */
	Attribute getPasswordFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getPasswordFeature <em>Password Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Feature</em>' reference.
	 * @see #getPasswordFeature()
	 * @generated
	 */
	void setPasswordFeature(Attribute value);

	/**
	 * Returns the value of the '<em><b>Reset Password Request Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Password Request Model</em>' reference.
	 * @see #setResetPasswordRequestModel(Entity)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_ResetPasswordRequestModel()
	 * @model
	 * @generated
	 */
	Entity getResetPasswordRequestModel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Password Request Model</em>' reference.
	 * @see #getResetPasswordRequestModel()
	 * @generated
	 */
	void setResetPasswordRequestModel(Entity value);

	/**
	 * Returns the value of the '<em><b>Reset Password Request Name</b></em>' attribute.
	 * The default value is <code>"ResetPasswordRequest"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Password Request Name</em>' attribute.
	 * @see #setResetPasswordRequestName(String)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_ResetPasswordRequestName()
	 * @model default="ResetPasswordRequest"
	 * @generated
	 */
	String getResetPasswordRequestName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordRequestName <em>Reset Password Request Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Password Request Name</em>' attribute.
	 * @see #getResetPasswordRequestName()
	 * @generated
	 */
	void setResetPasswordRequestName(String value);

	/**
	 * Returns the value of the '<em><b>Registration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Unit</em>' reference.
	 * @see #setRegistrationUnit(SecurityUnit)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_RegistrationUnit()
	 * @model
	 * @generated
	 */
	SecurityUnit getRegistrationUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Unit</em>' reference.
	 * @see #getRegistrationUnit()
	 * @generated
	 */
	void setRegistrationUnit(SecurityUnit value);

	/**
	 * Returns the value of the '<em><b>Login Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Unit</em>' reference.
	 * @see #setLoginUnit(SecurityUnit)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_LoginUnit()
	 * @model
	 * @generated
	 */
	SecurityUnit getLoginUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Unit</em>' reference.
	 * @see #getLoginUnit()
	 * @generated
	 */
	void setLoginUnit(SecurityUnit value);

	/**
	 * Returns the value of the '<em><b>Logout Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Unit</em>' reference.
	 * @see #setLogoutUnit(SecurityUnit)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_LogoutUnit()
	 * @model
	 * @generated
	 */
	SecurityUnit getLogoutUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getLogoutUnit <em>Logout Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Unit</em>' reference.
	 * @see #getLogoutUnit()
	 * @generated
	 */
	void setLogoutUnit(SecurityUnit value);

	/**
	 * Returns the value of the '<em><b>Forgotten Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forgotten Password Unit</em>' reference.
	 * @see #setForgottenPasswordUnit(SecurityUnit)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_ForgottenPasswordUnit()
	 * @model
	 * @generated
	 */
	SecurityUnit getForgottenPasswordUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forgotten Password Unit</em>' reference.
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	void setForgottenPasswordUnit(SecurityUnit value);

	/**
	 * Returns the value of the '<em><b>Reset Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Password Unit</em>' reference.
	 * @see #setResetPasswordUnit(SecurityUnit)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_ResetPasswordUnit()
	 * @model
	 * @generated
	 */
	SecurityUnit getResetPasswordUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordUnit <em>Reset Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Password Unit</em>' reference.
	 * @see #getResetPasswordUnit()
	 * @generated
	 */
	void setResetPasswordUnit(SecurityUnit value);

	/**
	 * Returns the value of the '<em><b>View Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Role</em>' reference.
	 * @see #setViewRole(Role)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_ViewRole()
	 * @model
	 * @generated
	 */
	Role getViewRole();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getViewRole <em>View Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Role</em>' reference.
	 * @see #getViewRole()
	 * @generated
	 */
	void setViewRole(Role value);

	/**
	 * Returns the value of the '<em><b>Edit Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Role</em>' reference.
	 * @see #setEditRole(Role)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_EditRole()
	 * @model
	 * @generated
	 */
	Role getEditRole();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getEditRole <em>Edit Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Role</em>' reference.
	 * @see #getEditRole()
	 * @generated
	 */
	void setEditRole(Role value);

	/**
	 * Returns the value of the '<em><b>Use Captcha</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Captcha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Captcha</em>' attribute.
	 * @see #setUseCaptcha(boolean)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_UseCaptcha()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isUseCaptcha();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Captcha</em>' attribute.
	 * @see #isUseCaptcha()
	 * @generated
	 */
	void setUseCaptcha(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Remember Me</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Remember Me</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Remember Me</em>' attribute.
	 * @see #setAllowRememberMe(boolean)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_AllowRememberMe()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowRememberMe();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Remember Me</em>' attribute.
	 * @see #isAllowRememberMe()
	 * @generated
	 */
	void setAllowRememberMe(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Self Registration</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Self Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #setAllowSelfRegistration(boolean)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_AllowSelfRegistration()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowSelfRegistration();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #isAllowSelfRegistration()
	 * @generated
	 */
	void setAllowSelfRegistration(boolean value);

	/**
	 * Returns the value of the '<em><b>Track Login Attempts</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Login Attempts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Login Attempts</em>' attribute.
	 * @see #setTrackLoginAttempts(boolean)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_TrackLoginAttempts()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isTrackLoginAttempts();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isTrackLoginAttempts <em>Track Login Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Login Attempts</em>' attribute.
	 * @see #isTrackLoginAttempts()
	 * @generated
	 */
	void setTrackLoginAttempts(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Email Activation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Email Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Email Activation</em>' attribute.
	 * @see #setUseEmailActivation(boolean)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_UseEmailActivation()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isUseEmailActivation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Email Activation</em>' attribute.
	 * @see #isUseEmailActivation()
	 * @generated
	 */
	void setUseEmailActivation(boolean value);

	/**
	 * Returns the value of the '<em><b>Send Welcome Email</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Welcome Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #setSendWelcomeEmail(boolean)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_SendWelcomeEmail()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isSendWelcomeEmail();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #isSendWelcomeEmail()
	 * @generated
	 */
	void setSendWelcomeEmail(boolean value);

} // LocalAuthenticationSystem
