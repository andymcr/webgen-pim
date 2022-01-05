/**
 */
package work.andycarpenter.metamodel.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see work.andycarpenter.metamodel.security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://andycarpenter.work/metamodel/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = work.andycarpenter.metamodel.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.SecurityModelImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getSecurityModel()
	 * @generated
	 */
	int SECURITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__AUTHENTICATION = 0;

	/**
	 * The feature id for the '<em><b>Is Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__IS_AUTHENTICATED = 1;

	/**
	 * The feature id for the '<em><b>Is Cas Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__IS_CAS_AUTHENTICATED = 2;

	/**
	 * The feature id for the '<em><b>Cas Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__CAS_AUTHENTICATION = 3;

	/**
	 * The feature id for the '<em><b>Is Locally Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__IS_LOCALLY_AUTHENTICATED = 4;

	/**
	 * The feature id for the '<em><b>Local Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__LOCAL_AUTHENTICATION = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.AuthenticationImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 1;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USER_MODEL = 0;

	/**
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USER_KEY = 1;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getLocalAuthenticationSystem()
	 * @generated
	 */
	int LOCAL_AUTHENTICATION_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_MODEL = AUTHENTICATION__USER_MODEL;

	/**
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_KEY = AUTHENTICATION__USER_KEY;

	/**
	 * The feature id for the '<em><b>Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authentication Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reset Password Request Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Login Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT = AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Logout Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT = AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Forgotten Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT = AUTHENTICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reset Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT = AUTHENTICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA = AUTHENTICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Allow Remember Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME = AUTHENTICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = AUTHENTICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Use Email Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = AUTHENTICATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Send Welcome Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = AUTHENTICATION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.CasAuthenticationImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getCasAuthentication()
	 * @generated
	 */
	int CAS_AUTHENTICATION = 3;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__USER_MODEL = AUTHENTICATION__USER_MODEL;

	/**
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__USER_KEY = AUTHENTICATION__USER_KEY;

	/**
	 * The feature id for the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__LOGIN_LABEL = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__LOGOUT_LABEL = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cas Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cas Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.SecurityUnit <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.SecurityUnit
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getSecurityUnit()
	 * @generated
	 */
	int SECURITY_UNIT = 4;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.AuthenticationKeyTypes <em>Authentication Key Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.AuthenticationKeyTypes
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthenticationKeyTypes()
	 * @generated
	 */
	int AUTHENTICATION_KEY_TYPES = 5;


	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.SecurityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel
	 * @generated
	 */
	EClass getSecurityModel();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.metamodel.security.SecurityModel#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel#getAuthentication()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.SecurityModel#isIsAuthenticated <em>Is Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Authenticated</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel#isIsAuthenticated()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EAttribute getSecurityModel_IsAuthenticated();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.SecurityModel#isIsCasAuthenticated <em>Is Cas Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cas Authenticated</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel#isIsCasAuthenticated()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EAttribute getSecurityModel_IsCasAuthenticated();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.SecurityModel#getCasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cas Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel#getCasAuthentication()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_CasAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.SecurityModel#isIsLocallyAuthenticated <em>Is Locally Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Locally Authenticated</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel#isIsLocallyAuthenticated()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EAttribute getSecurityModel_IsLocallyAuthenticated();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.SecurityModel#getLocalAuthentication <em>Local Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel#getLocalAuthentication()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_LocalAuthentication();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.Authentication#getUserModel <em>User Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Model</em>'.
	 * @see work.andycarpenter.metamodel.security.Authentication#getUserModel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_UserModel();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.Authentication#getUserKey <em>User Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Key</em>'.
	 * @see work.andycarpenter.metamodel.security.Authentication#getUserKey()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_UserKey();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem <em>Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Authentication System</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem
	 * @generated
	 */
	EClass getLocalAuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication Model</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationModel()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_AuthenticationModel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Key</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AuthenticationKey();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset Password Request Model</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordRequestModel()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ResetPasswordRequestModel();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registration Unit</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_RegistrationUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Unit</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLoginUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LoginUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLogoutUnit <em>Logout Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logout Unit</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLogoutUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LogoutUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forgotten Password Unit</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ForgottenPasswordUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordUnit <em>Reset Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset Password Unit</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ResetPasswordUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Captcha</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseCaptcha()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_UseCaptcha();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Remember Me</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowRememberMe()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowRememberMe();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Self Registration</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowSelfRegistration()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowSelfRegistration();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Email Activation</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseEmailActivation()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_UseEmailActivation();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Welcome Email</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isSendWelcomeEmail()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_SendWelcomeEmail();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.CasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cas Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.CasAuthentication
	 * @generated
	 */
	EClass getCasAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.CasAuthentication#getLoginLabel <em>Login Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Label</em>'.
	 * @see work.andycarpenter.metamodel.security.CasAuthentication#getLoginLabel()
	 * @see #getCasAuthentication()
	 * @generated
	 */
	EAttribute getCasAuthentication_LoginLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.CasAuthentication#getLogoutLabel <em>Logout Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logout Label</em>'.
	 * @see work.andycarpenter.metamodel.security.CasAuthentication#getLogoutLabel()
	 * @see #getCasAuthentication()
	 * @generated
	 */
	EAttribute getCasAuthentication_LogoutLabel();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.SecurityUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityUnit
	 * @generated
	 */
	EClass getSecurityUnit();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.metamodel.security.AuthenticationKeyTypes <em>Authentication Key Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Key Types</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationKeyTypes
	 * @generated
	 */
	EEnum getAuthenticationKeyTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.SecurityModelImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getSecurityModel()
		 * @generated
		 */
		EClass SECURITY_MODEL = eINSTANCE.getSecurityModel();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__AUTHENTICATION = eINSTANCE.getSecurityModel_Authentication();

		/**
		 * The meta object literal for the '<em><b>Is Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MODEL__IS_AUTHENTICATED = eINSTANCE.getSecurityModel_IsAuthenticated();

		/**
		 * The meta object literal for the '<em><b>Is Cas Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MODEL__IS_CAS_AUTHENTICATED = eINSTANCE.getSecurityModel_IsCasAuthenticated();

		/**
		 * The meta object literal for the '<em><b>Cas Authentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__CAS_AUTHENTICATION = eINSTANCE.getSecurityModel_CasAuthentication();

		/**
		 * The meta object literal for the '<em><b>Is Locally Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MODEL__IS_LOCALLY_AUTHENTICATED = eINSTANCE.getSecurityModel_IsLocallyAuthenticated();

		/**
		 * The meta object literal for the '<em><b>Local Authentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__LOCAL_AUTHENTICATION = eINSTANCE.getSecurityModel_LocalAuthentication();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.AuthenticationImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>User Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__USER_MODEL = eINSTANCE.getAuthentication_UserModel();

		/**
		 * The meta object literal for the '<em><b>User Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__USER_KEY = eINSTANCE.getAuthentication_UserKey();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getLocalAuthenticationSystem()
		 * @generated
		 */
		EClass LOCAL_AUTHENTICATION_SYSTEM = eINSTANCE.getLocalAuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Authentication Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL = eINSTANCE.getLocalAuthenticationSystem_AuthenticationModel();

		/**
		 * The meta object literal for the '<em><b>Authentication Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = eINSTANCE.getLocalAuthenticationSystem_AuthenticationKey();

		/**
		 * The meta object literal for the '<em><b>Reset Password Request Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL = eINSTANCE.getLocalAuthenticationSystem_ResetPasswordRequestModel();

		/**
		 * The meta object literal for the '<em><b>Registration Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT = eINSTANCE.getLocalAuthenticationSystem_RegistrationUnit();

		/**
		 * The meta object literal for the '<em><b>Login Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT = eINSTANCE.getLocalAuthenticationSystem_LoginUnit();

		/**
		 * The meta object literal for the '<em><b>Logout Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT = eINSTANCE.getLocalAuthenticationSystem_LogoutUnit();

		/**
		 * The meta object literal for the '<em><b>Forgotten Password Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getLocalAuthenticationSystem_ForgottenPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Reset Password Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT = eINSTANCE.getLocalAuthenticationSystem_ResetPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Use Captcha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA = eINSTANCE.getLocalAuthenticationSystem_UseCaptcha();

		/**
		 * The meta object literal for the '<em><b>Allow Remember Me</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME = eINSTANCE.getLocalAuthenticationSystem_AllowRememberMe();

		/**
		 * The meta object literal for the '<em><b>Allow Self Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = eINSTANCE.getLocalAuthenticationSystem_AllowSelfRegistration();

		/**
		 * The meta object literal for the '<em><b>Use Email Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = eINSTANCE.getLocalAuthenticationSystem_UseEmailActivation();

		/**
		 * The meta object literal for the '<em><b>Send Welcome Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = eINSTANCE.getLocalAuthenticationSystem_SendWelcomeEmail();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.CasAuthenticationImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getCasAuthentication()
		 * @generated
		 */
		EClass CAS_AUTHENTICATION = eINSTANCE.getCasAuthentication();

		/**
		 * The meta object literal for the '<em><b>Login Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAS_AUTHENTICATION__LOGIN_LABEL = eINSTANCE.getCasAuthentication_LoginLabel();

		/**
		 * The meta object literal for the '<em><b>Logout Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAS_AUTHENTICATION__LOGOUT_LABEL = eINSTANCE.getCasAuthentication_LogoutLabel();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.SecurityUnit <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.SecurityUnit
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getSecurityUnit()
		 * @generated
		 */
		EClass SECURITY_UNIT = eINSTANCE.getSecurityUnit();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.AuthenticationKeyTypes <em>Authentication Key Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.AuthenticationKeyTypes
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthenticationKeyTypes()
		 * @generated
		 */
		EEnum AUTHENTICATION_KEY_TYPES = eINSTANCE.getAuthenticationKeyTypes();

	}

} //SecurityPackage
