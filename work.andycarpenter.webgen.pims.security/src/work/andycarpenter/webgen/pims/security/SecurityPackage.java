/**
 */
package work.andycarpenter.webgen.pims.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see work.andycarpenter.webgen.pims.security.SecurityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	String eNS_URI = "http://andycarpenter.work/pim/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.security.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.security.impl.SecurityImpl
	 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 0;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__AUTHENTICATION = 0;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl
	 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 1;

	/**
	 * The feature id for the '<em><b>Security</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__SECURITY = 0;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USER_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Implicit Registration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_REGISTRATION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Implicit Registration Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Implicit Registration Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Implicit Registration Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL = 5;

	/**
	 * The feature id for the '<em><b>Implicit Registration Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_REGISTRATION_URI = 6;

	/**
	 * The feature id for the '<em><b>Implicit Login Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGIN_NAME = 7;

	/**
	 * The feature id for the '<em><b>Implicit Login Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Implicit Login Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL = 9;

	/**
	 * The feature id for the '<em><b>Implicit Login Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL = 10;

	/**
	 * The feature id for the '<em><b>Implicit Login Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGIN_URI = 11;

	/**
	 * The feature id for the '<em><b>Implicit Logout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGOUT_NAME = 12;

	/**
	 * The feature id for the '<em><b>Implicit Logout Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL = 13;

	/**
	 * The feature id for the '<em><b>Implicit Logout Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL = 14;

	/**
	 * The feature id for the '<em><b>Implicit Logout Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL = 15;

	/**
	 * The feature id for the '<em><b>Implicit Logout Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_LOGOUT_URI = 16;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME = 17;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL = 18;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL = 19;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL = 20;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Uri Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST = 21;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Uri Email Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT = 22;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT = 23;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE = 24;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION = 25;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE = 26;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME = 27;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL = 28;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL = 29;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL = 30;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI = 31;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 32;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl
	 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getLocalAuthenticationSystem()
	 * @generated
	 */
	int LOCAL_AUTHENTICATION_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Security</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SECURITY = AUTHENTICATION__SECURITY;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_MODEL = AUTHENTICATION__USER_MODEL;

	/**
	 * The feature id for the '<em><b>Implicit Registration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_REGISTRATION_NAME = AUTHENTICATION__IMPLICIT_REGISTRATION_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Registration Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_REGISTRATION_UNIT_LABEL = AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Registration Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_REGISTRATION_ACTION_LABEL = AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Registration Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_REGISTRATION_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Registration Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_REGISTRATION_URI = AUTHENTICATION__IMPLICIT_REGISTRATION_URI;

	/**
	 * The feature id for the '<em><b>Implicit Login Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGIN_NAME = AUTHENTICATION__IMPLICIT_LOGIN_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Login Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGIN_UNIT_LABEL = AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Login Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGIN_ACTION_LABEL = AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Login Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGIN_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Login Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGIN_URI = AUTHENTICATION__IMPLICIT_LOGIN_URI;

	/**
	 * The feature id for the '<em><b>Implicit Logout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGOUT_NAME = AUTHENTICATION__IMPLICIT_LOGOUT_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Logout Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGOUT_UNIT_LABEL = AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Logout Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGOUT_ACTION_LABEL = AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Logout Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGOUT_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Logout Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_LOGOUT_URI = AUTHENTICATION__IMPLICIT_LOGOUT_URI;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_NAME = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Uri Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Uri Email Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_RESET_PASSWORD_NAME = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_RESET_PASSWORD_UNIT_LABEL = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_RESET_PASSWORD_ACTION_LABEL = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IMPLICIT_RESET_PASSWORD_URI = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI;

	/**
	 * The feature id for the '<em><b>Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authentication Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_NAME = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_KEY = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Identifier Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE = AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Password Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE = AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reset Password Request Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL = AUTHENTICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reset Password Request Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_NAME = AUTHENTICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Registration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT = AUTHENTICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Login Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT = AUTHENTICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Logout Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT = AUTHENTICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Forgotten Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT = AUTHENTICATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reset Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT = AUTHENTICATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>View Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__VIEW_ROLE = AUTHENTICATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Edit Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__EDIT_ROLE = AUTHENTICATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA = AUTHENTICATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Allow Remember Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME = AUTHENTICATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = AUTHENTICATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Track Login Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS = AUTHENTICATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Use Email Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = AUTHENTICATION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Send Welcome Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = AUTHENTICATION_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.security.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.security.impl.CasAuthenticationImpl
	 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getCasAuthentication()
	 * @generated
	 */
	int CAS_AUTHENTICATION = 3;

	/**
	 * The feature id for the '<em><b>Security</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__SECURITY = AUTHENTICATION__SECURITY;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__USER_MODEL = AUTHENTICATION__USER_MODEL;

	/**
	 * The feature id for the '<em><b>Implicit Registration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_REGISTRATION_NAME = AUTHENTICATION__IMPLICIT_REGISTRATION_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Registration Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL = AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Registration Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL = AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Registration Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Registration Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_REGISTRATION_URI = AUTHENTICATION__IMPLICIT_REGISTRATION_URI;

	/**
	 * The feature id for the '<em><b>Implicit Login Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGIN_NAME = AUTHENTICATION__IMPLICIT_LOGIN_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Login Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL = AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Login Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL = AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Login Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Login Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGIN_URI = AUTHENTICATION__IMPLICIT_LOGIN_URI;

	/**
	 * The feature id for the '<em><b>Implicit Logout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGOUT_NAME = AUTHENTICATION__IMPLICIT_LOGOUT_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Logout Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL = AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Logout Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL = AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Logout Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Logout Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_LOGOUT_URI = AUTHENTICATION__IMPLICIT_LOGOUT_URI;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Uri Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Uri Email Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION;

	/**
	 * The feature id for the '<em><b>Implicit Forgotten Password Email Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE = AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Implicit Reset Password Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI = AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.security.SecurityUnit <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.security.SecurityUnit
	 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getSecurityUnit()
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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.security.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.security.Security#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Security#getAuthentication()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_Authentication();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.security.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.security.Authentication#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Security</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getSecurity()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_Security();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.Authentication#getUserModel <em>User Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Model</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getUserModel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_UserModel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationName <em>Implicit Registration Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Registration Name</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationName()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitRegistrationName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUnitLabel <em>Implicit Registration Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Registration Unit Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUnitLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitRegistrationUnitLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationActionLabel <em>Implicit Registration Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Registration Action Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationActionLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitRegistrationActionLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationConfirmLabel <em>Implicit Registration Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Registration Confirm Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationConfirmLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitRegistrationConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUri <em>Implicit Registration Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Registration Uri</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitRegistrationUri()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitRegistrationUri();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginName <em>Implicit Login Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Login Name</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginName()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLoginName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUnitLabel <em>Implicit Login Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Login Unit Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUnitLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLoginUnitLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginActionLabel <em>Implicit Login Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Login Action Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginActionLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLoginActionLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginConfirmLabel <em>Implicit Login Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Login Confirm Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginConfirmLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLoginConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUri <em>Implicit Login Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Login Uri</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLoginUri()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLoginUri();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutName <em>Implicit Logout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Logout Name</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutName()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLogoutName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUnitLabel <em>Implicit Logout Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Logout Unit Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUnitLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLogoutUnitLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutActionLabel <em>Implicit Logout Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Logout Action Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutActionLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLogoutActionLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutConfirmLabel <em>Implicit Logout Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Logout Confirm Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutConfirmLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLogoutConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUri <em>Implicit Logout Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Logout Uri</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitLogoutUri()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitLogoutUri();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordName <em>Implicit Forgotten Password Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Name</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordName()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUnitLabel <em>Implicit Forgotten Password Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Unit Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUnitLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordUnitLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordActionLabel <em>Implicit Forgotten Password Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Action Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordActionLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordActionLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordConfirmLabel <em>Implicit Forgotten Password Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Confirm Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordConfirmLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriRequest <em>Implicit Forgotten Password Uri Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Uri Request</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriRequest()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordUriRequest();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriEmailSent <em>Implicit Forgotten Password Uri Email Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Uri Email Sent</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordUriEmailSent()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordUriEmailSent();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailSubject <em>Implicit Forgotten Password Email Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Email Subject</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailSubject()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordEmailSubject();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailMessage <em>Implicit Forgotten Password Email Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Email Message</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailMessage()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordEmailMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailSentCaption <em>Implicit Forgotten Password Email Sent Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Email Sent Caption</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailSentCaption()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordEmailSentCaption();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailSentMessage <em>Implicit Forgotten Password Email Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Forgotten Password Email Sent Message</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitForgottenPasswordEmailSentMessage()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitForgottenPasswordEmailSentMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordName <em>Implicit Reset Password Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Reset Password Name</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordName()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitResetPasswordName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordUnitLabel <em>Implicit Reset Password Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Reset Password Unit Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordUnitLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitResetPasswordUnitLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordActionLabel <em>Implicit Reset Password Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Reset Password Action Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordActionLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitResetPasswordActionLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordConfirmLabel <em>Implicit Reset Password Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Reset Password Confirm Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordConfirmLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitResetPasswordConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordUri <em>Implicit Reset Password Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Reset Password Uri</em>'.
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getImplicitResetPasswordUri()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_ImplicitResetPasswordUri();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem <em>Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Authentication System</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem
	 * @generated
	 */
	EClass getLocalAuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication Model</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationModel()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_AuthenticationModel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationName <em>Authentication Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Name</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationName()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AuthenticationName();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getUserKey <em>User Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Key</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getUserKey()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_UserKey();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication Key</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getAuthenticationKey()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_AuthenticationKey();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getIdentifierFeature <em>Identifier Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getIdentifierFeature()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_IdentifierFeature();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getPasswordFeature <em>Password Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Password Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getPasswordFeature()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_PasswordFeature();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset Password Request Model</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordRequestModel()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ResetPasswordRequestModel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordRequestName <em>Reset Password Request Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Password Request Name</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordRequestName()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_ResetPasswordRequestName();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registration Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getRegistrationUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_RegistrationUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getLoginUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LoginUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getLogoutUnit <em>Logout Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logout Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getLogoutUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LogoutUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forgotten Password Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getForgottenPasswordUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ForgottenPasswordUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordUnit <em>Reset Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset Password Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getResetPasswordUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ResetPasswordUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getViewRole <em>View Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Role</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getViewRole()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_ViewRole();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getEditRole <em>Edit Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Role</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#getEditRole()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_EditRole();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseCaptcha <em>Use Captcha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Captcha</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseCaptcha()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_UseCaptcha();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Remember Me</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowRememberMe()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowRememberMe();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Self Registration</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isAllowSelfRegistration()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowSelfRegistration();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isTrackLoginAttempts <em>Track Login Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Login Attempts</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isTrackLoginAttempts()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_TrackLoginAttempts();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Email Activation</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isUseEmailActivation()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_UseEmailActivation();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Welcome Email</em>'.
	 * @see work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem#isSendWelcomeEmail()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_SendWelcomeEmail();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.security.CasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cas Authentication</em>'.
	 * @see work.andycarpenter.webgen.pims.security.CasAuthentication
	 * @generated
	 */
	EClass getCasAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.CasAuthentication#getLoginLabel <em>Login Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.CasAuthentication#getLoginLabel()
	 * @see #getCasAuthentication()
	 * @generated
	 */
	EAttribute getCasAuthentication_LoginLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.security.CasAuthentication#getLogoutLabel <em>Logout Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logout Label</em>'.
	 * @see work.andycarpenter.webgen.pims.security.CasAuthentication#getLogoutLabel()
	 * @see #getCasAuthentication()
	 * @generated
	 */
	EAttribute getCasAuthentication_LogoutLabel();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.security.SecurityUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.security.SecurityUnit
	 * @generated
	 */
	EClass getSecurityUnit();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.security.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.security.impl.SecurityImpl
		 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__AUTHENTICATION = eINSTANCE.getSecurity_Authentication();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl
		 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__SECURITY = eINSTANCE.getAuthentication_Security();

		/**
		 * The meta object literal for the '<em><b>User Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__USER_MODEL = eINSTANCE.getAuthentication_UserModel();

		/**
		 * The meta object literal for the '<em><b>Implicit Registration Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_REGISTRATION_NAME = eINSTANCE.getAuthentication_ImplicitRegistrationName();

		/**
		 * The meta object literal for the '<em><b>Implicit Registration Unit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL = eINSTANCE.getAuthentication_ImplicitRegistrationUnitLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Registration Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL = eINSTANCE.getAuthentication_ImplicitRegistrationActionLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Registration Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL = eINSTANCE.getAuthentication_ImplicitRegistrationConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Registration Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_REGISTRATION_URI = eINSTANCE.getAuthentication_ImplicitRegistrationUri();

		/**
		 * The meta object literal for the '<em><b>Implicit Login Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGIN_NAME = eINSTANCE.getAuthentication_ImplicitLoginName();

		/**
		 * The meta object literal for the '<em><b>Implicit Login Unit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL = eINSTANCE.getAuthentication_ImplicitLoginUnitLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Login Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL = eINSTANCE.getAuthentication_ImplicitLoginActionLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Login Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL = eINSTANCE.getAuthentication_ImplicitLoginConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Login Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGIN_URI = eINSTANCE.getAuthentication_ImplicitLoginUri();

		/**
		 * The meta object literal for the '<em><b>Implicit Logout Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGOUT_NAME = eINSTANCE.getAuthentication_ImplicitLogoutName();

		/**
		 * The meta object literal for the '<em><b>Implicit Logout Unit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL = eINSTANCE.getAuthentication_ImplicitLogoutUnitLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Logout Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL = eINSTANCE.getAuthentication_ImplicitLogoutActionLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Logout Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL = eINSTANCE.getAuthentication_ImplicitLogoutConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Logout Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_LOGOUT_URI = eINSTANCE.getAuthentication_ImplicitLogoutUri();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME = eINSTANCE.getAuthentication_ImplicitForgottenPasswordName();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Unit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL = eINSTANCE.getAuthentication_ImplicitForgottenPasswordUnitLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL = eINSTANCE.getAuthentication_ImplicitForgottenPasswordActionLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL = eINSTANCE.getAuthentication_ImplicitForgottenPasswordConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Uri Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST = eINSTANCE.getAuthentication_ImplicitForgottenPasswordUriRequest();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Uri Email Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT = eINSTANCE.getAuthentication_ImplicitForgottenPasswordUriEmailSent();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Email Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT = eINSTANCE.getAuthentication_ImplicitForgottenPasswordEmailSubject();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Email Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE = eINSTANCE.getAuthentication_ImplicitForgottenPasswordEmailMessage();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Email Sent Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION = eINSTANCE.getAuthentication_ImplicitForgottenPasswordEmailSentCaption();

		/**
		 * The meta object literal for the '<em><b>Implicit Forgotten Password Email Sent Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE = eINSTANCE.getAuthentication_ImplicitForgottenPasswordEmailSentMessage();

		/**
		 * The meta object literal for the '<em><b>Implicit Reset Password Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME = eINSTANCE.getAuthentication_ImplicitResetPasswordName();

		/**
		 * The meta object literal for the '<em><b>Implicit Reset Password Unit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL = eINSTANCE.getAuthentication_ImplicitResetPasswordUnitLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Reset Password Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL = eINSTANCE.getAuthentication_ImplicitResetPasswordActionLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Reset Password Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL = eINSTANCE.getAuthentication_ImplicitResetPasswordConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Implicit Reset Password Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI = eINSTANCE.getAuthentication_ImplicitResetPasswordUri();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl
		 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getLocalAuthenticationSystem()
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
		 * The meta object literal for the '<em><b>Authentication Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_NAME = eINSTANCE.getLocalAuthenticationSystem_AuthenticationName();

		/**
		 * The meta object literal for the '<em><b>User Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__USER_KEY = eINSTANCE.getLocalAuthenticationSystem_UserKey();

		/**
		 * The meta object literal for the '<em><b>Authentication Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = eINSTANCE.getLocalAuthenticationSystem_AuthenticationKey();

		/**
		 * The meta object literal for the '<em><b>Identifier Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE = eINSTANCE.getLocalAuthenticationSystem_IdentifierFeature();

		/**
		 * The meta object literal for the '<em><b>Password Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE = eINSTANCE.getLocalAuthenticationSystem_PasswordFeature();

		/**
		 * The meta object literal for the '<em><b>Reset Password Request Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL = eINSTANCE.getLocalAuthenticationSystem_ResetPasswordRequestModel();

		/**
		 * The meta object literal for the '<em><b>Reset Password Request Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_NAME = eINSTANCE.getLocalAuthenticationSystem_ResetPasswordRequestName();

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
		 * The meta object literal for the '<em><b>View Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__VIEW_ROLE = eINSTANCE.getLocalAuthenticationSystem_ViewRole();

		/**
		 * The meta object literal for the '<em><b>Edit Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__EDIT_ROLE = eINSTANCE.getLocalAuthenticationSystem_EditRole();

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
		 * The meta object literal for the '<em><b>Track Login Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS = eINSTANCE.getLocalAuthenticationSystem_TrackLoginAttempts();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.security.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.security.impl.CasAuthenticationImpl
		 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getCasAuthentication()
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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.security.SecurityUnit <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.security.SecurityUnit
		 * @see work.andycarpenter.webgen.pims.security.impl.SecurityPackageImpl#getSecurityUnit()
		 * @generated
		 */
		EClass SECURITY_UNIT = eINSTANCE.getSecurityUnit();

	}

} //SecurityPackage
