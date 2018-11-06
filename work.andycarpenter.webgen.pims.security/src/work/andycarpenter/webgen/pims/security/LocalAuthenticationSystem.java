/**
 */
package work.andycarpenter.webgen.pims.security;

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
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isTrackLoginAttempts <em>Track Login Attempts</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='captchaRequiresKeys'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL captchaRequiresKeys='-- useCaptcha implies not authenticates.captchaSiteKey.oclIsUndefined() and not authenticates.captchaSecretKey.oclIsUndefined()\r\ntrue'"
 * @generated
 */
public interface LocalAuthenticationSystem extends Authentication {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' reference.
	 * @see #setAuthentication(Entity)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_Authentication()
	 * @model ordered="false"
	 * @generated
	 */
	Entity getAuthentication();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthentication <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Entity value);

	/**
	 * Returns the value of the '<em><b>Authentication Key</b></em>' attribute.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.security.AuthenticationKeyTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Key</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.security.AuthenticationKeyTypes
	 * @see #setAuthenticationKey(AuthenticationKeyTypes)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getLocalAuthenticationSystem_AuthenticationKey()
	 * @model required="true"
	 * @generated
	 */
	AuthenticationKeyTypes getAuthenticationKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Key</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.security.AuthenticationKeyTypes
	 * @see #getAuthenticationKey()
	 * @generated
	 */
	void setAuthenticationKey(AuthenticationKeyTypes value);

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
