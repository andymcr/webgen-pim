/**
 */
package work.andycarpenter.metamodel.security;

import work.andycarpenter.metamodel.orm.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLogoutUnit <em>Logout Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordUnit <em>Reset Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem()
 * @model
 * @generated
 */
public interface LocalAuthenticationSystem extends Authentication {
	/**
	 * Returns the value of the '<em><b>Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Model</em>' reference.
	 * @see #setAuthenticationModel(Entity)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_AuthenticationModel()
	 * @model required="true"
	 * @generated
	 */
	Entity getAuthenticationModel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Model</em>' reference.
	 * @see #getAuthenticationModel()
	 * @generated
	 */
	void setAuthenticationModel(Entity value);

	/**
	 * Returns the value of the '<em><b>Authentication Key</b></em>' attribute.
	 * The literals are from the enumeration {@link work.andycarpenter.metamodel.security.AuthenticationKeyTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Key</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.AuthenticationKeyTypes
	 * @see #setAuthenticationKey(AuthenticationKeyTypes)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_AuthenticationKey()
	 * @model unique="false" required="true"
	 * @generated
	 */
	AuthenticationKeyTypes getAuthenticationKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Key</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.AuthenticationKeyTypes
	 * @see #getAuthenticationKey()
	 * @generated
	 */
	void setAuthenticationKey(AuthenticationKeyTypes value);

	/**
	 * Returns the value of the '<em><b>Reset Password Request Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Password Request Model</em>' reference.
	 * @see #setResetPasswordRequestModel(Entity)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_ResetPasswordRequestModel()
	 * @model required="true"
	 * @generated
	 */
	Entity getResetPasswordRequestModel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Password Request Model</em>' reference.
	 * @see #getResetPasswordRequestModel()
	 * @generated
	 */
	void setResetPasswordRequestModel(Entity value);

	/**
	 * Returns the value of the '<em><b>Registration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Unit</em>' reference.
	 * @see #setRegistrationUnit(SecurityUnit)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_RegistrationUnit()
	 * @model
	 * @generated
	 */
	SecurityUnit getRegistrationUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}' reference.
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
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_LoginUnit()
	 * @model required="true"
	 * @generated
	 */
	SecurityUnit getLoginUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}' reference.
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
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_LogoutUnit()
	 * @model required="true"
	 * @generated
	 */
	SecurityUnit getLogoutUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLogoutUnit <em>Logout Unit</em>}' reference.
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
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_ForgottenPasswordUnit()
	 * @model
	 * @generated
	 */
	SecurityUnit getForgottenPasswordUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}' reference.
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
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_ResetPasswordUnit()
	 * @model required="true"
	 * @generated
	 */
	SecurityUnit getResetPasswordUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordUnit <em>Reset Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Password Unit</em>' reference.
	 * @see #getResetPasswordUnit()
	 * @generated
	 */
	void setResetPasswordUnit(SecurityUnit value);

	/**
	 * Returns the value of the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Captcha</em>' attribute.
	 * @see #setUseCaptcha(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_UseCaptcha()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseCaptcha();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Captcha</em>' attribute.
	 * @see #isUseCaptcha()
	 * @generated
	 */
	void setUseCaptcha(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Remember Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Remember Me</em>' attribute.
	 * @see #setAllowRememberMe(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_AllowRememberMe()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowRememberMe();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Remember Me</em>' attribute.
	 * @see #isAllowRememberMe()
	 * @generated
	 */
	void setAllowRememberMe(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #setAllowSelfRegistration(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_AllowSelfRegistration()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowSelfRegistration();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #isAllowSelfRegistration()
	 * @generated
	 */
	void setAllowSelfRegistration(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Email Activation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Email Activation</em>' attribute.
	 * @see #setUseEmailActivation(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_UseEmailActivation()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseEmailActivation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #setSendWelcomeEmail(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_SendWelcomeEmail()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isSendWelcomeEmail();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #isSendWelcomeEmail()
	 * @generated
	 */
	void setSendWelcomeEmail(boolean value);

} // LocalAuthenticationSystem
