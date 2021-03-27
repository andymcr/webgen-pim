/**
 */
package work.andycarpenter.webgen.pims.security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.security.Authentication;
import work.andycarpenter.webgen.pims.security.Security;
import work.andycarpenter.webgen.pims.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getUser <em>User</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getUserKey <em>User Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitRegistrationName <em>Implicit Registration Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitRegistrationUnitLabel <em>Implicit Registration Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitRegistrationActionLabel <em>Implicit Registration Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitRegistrationConfirmLabel <em>Implicit Registration Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitRegistrationUri <em>Implicit Registration Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLoginName <em>Implicit Login Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLoginUnitLabel <em>Implicit Login Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLoginActionLabel <em>Implicit Login Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLoginConfirmLabel <em>Implicit Login Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLoginUri <em>Implicit Login Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLogoutName <em>Implicit Logout Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLogoutUnitLabel <em>Implicit Logout Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLogoutActionLabel <em>Implicit Logout Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLogoutConfirmLabel <em>Implicit Logout Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitLogoutUri <em>Implicit Logout Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordName <em>Implicit Forgotten Password Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordUnitLabel <em>Implicit Forgotten Password Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordActionLabel <em>Implicit Forgotten Password Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordConfirmLabel <em>Implicit Forgotten Password Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordUriRequest <em>Implicit Forgotten Password Uri Request</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordUriEmailSent <em>Implicit Forgotten Password Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordEmailSubject <em>Implicit Forgotten Password Email Subject</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordEmailMessage <em>Implicit Forgotten Password Email Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordEmailSentCaption <em>Implicit Forgotten Password Email Sent Caption</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitForgottenPasswordEmailSentMessage <em>Implicit Forgotten Password Email Sent Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitResetPasswordName <em>Implicit Reset Password Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitResetPasswordUnitLabel <em>Implicit Reset Password Unit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitResetPasswordActionLabel <em>Implicit Reset Password Action Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitResetPasswordConfirmLabel <em>Implicit Reset Password Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getImplicitResetPasswordUri <em>Implicit Reset Password Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AuthenticationImpl extends MinimalEObjectImpl.Container implements Authentication {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected Entity user;

	/**
	 * The cached value of the '{@link #getUserKey() <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserKey()
	 * @generated
	 * @ordered
	 */
	protected Attribute userKey;

	/**
	 * The default value of the '{@link #getImplicitRegistrationName() <em>Implicit Registration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_REGISTRATION_NAME_EDEFAULT = "registration";

	/**
	 * The cached value of the '{@link #getImplicitRegistrationName() <em>Implicit Registration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationName()
	 * @generated
	 * @ordered
	 */
	protected String implicitRegistrationName = IMPLICIT_REGISTRATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitRegistrationUnitLabel() <em>Implicit Registration Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_REGISTRATION_UNIT_LABEL_EDEFAULT = "Create Account";

	/**
	 * The cached value of the '{@link #getImplicitRegistrationUnitLabel() <em>Implicit Registration Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitRegistrationUnitLabel = IMPLICIT_REGISTRATION_UNIT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitRegistrationActionLabel() <em>Implicit Registration Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_REGISTRATION_ACTION_LABEL_EDEFAULT = "Create Account";

	/**
	 * The cached value of the '{@link #getImplicitRegistrationActionLabel() <em>Implicit Registration Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitRegistrationActionLabel = IMPLICIT_REGISTRATION_ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitRegistrationConfirmLabel() <em>Implicit Registration Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_REGISTRATION_CONFIRM_LABEL_EDEFAULT = "Create Account";

	/**
	 * The cached value of the '{@link #getImplicitRegistrationConfirmLabel() <em>Implicit Registration Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitRegistrationConfirmLabel = IMPLICIT_REGISTRATION_CONFIRM_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitRegistrationUri() <em>Implicit Registration Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationUri()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_REGISTRATION_URI_EDEFAULT = "register";

	/**
	 * The cached value of the '{@link #getImplicitRegistrationUri() <em>Implicit Registration Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRegistrationUri()
	 * @generated
	 * @ordered
	 */
	protected String implicitRegistrationUri = IMPLICIT_REGISTRATION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLoginName() <em>Implicit Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGIN_NAME_EDEFAULT = "login";

	/**
	 * The cached value of the '{@link #getImplicitLoginName() <em>Implicit Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginName()
	 * @generated
	 * @ordered
	 */
	protected String implicitLoginName = IMPLICIT_LOGIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLoginUnitLabel() <em>Implicit Login Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGIN_UNIT_LABEL_EDEFAULT = "Login";

	/**
	 * The cached value of the '{@link #getImplicitLoginUnitLabel() <em>Implicit Login Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitLoginUnitLabel = IMPLICIT_LOGIN_UNIT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLoginActionLabel() <em>Implicit Login Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGIN_ACTION_LABEL_EDEFAULT = "Login";

	/**
	 * The cached value of the '{@link #getImplicitLoginActionLabel() <em>Implicit Login Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitLoginActionLabel = IMPLICIT_LOGIN_ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLoginConfirmLabel() <em>Implicit Login Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGIN_CONFIRM_LABEL_EDEFAULT = "Login";

	/**
	 * The cached value of the '{@link #getImplicitLoginConfirmLabel() <em>Implicit Login Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitLoginConfirmLabel = IMPLICIT_LOGIN_CONFIRM_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLoginUri() <em>Implicit Login Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginUri()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGIN_URI_EDEFAULT = "login";

	/**
	 * The cached value of the '{@link #getImplicitLoginUri() <em>Implicit Login Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLoginUri()
	 * @generated
	 * @ordered
	 */
	protected String implicitLoginUri = IMPLICIT_LOGIN_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLogoutName() <em>Implicit Logout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGOUT_NAME_EDEFAULT = "logout";

	/**
	 * The cached value of the '{@link #getImplicitLogoutName() <em>Implicit Logout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutName()
	 * @generated
	 * @ordered
	 */
	protected String implicitLogoutName = IMPLICIT_LOGOUT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLogoutUnitLabel() <em>Implicit Logout Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGOUT_UNIT_LABEL_EDEFAULT = "Logout";

	/**
	 * The cached value of the '{@link #getImplicitLogoutUnitLabel() <em>Implicit Logout Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitLogoutUnitLabel = IMPLICIT_LOGOUT_UNIT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLogoutActionLabel() <em>Implicit Logout Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGOUT_ACTION_LABEL_EDEFAULT = "Logout";

	/**
	 * The cached value of the '{@link #getImplicitLogoutActionLabel() <em>Implicit Logout Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitLogoutActionLabel = IMPLICIT_LOGOUT_ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLogoutConfirmLabel() <em>Implicit Logout Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGOUT_CONFIRM_LABEL_EDEFAULT = "Logout";

	/**
	 * The cached value of the '{@link #getImplicitLogoutConfirmLabel() <em>Implicit Logout Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitLogoutConfirmLabel = IMPLICIT_LOGOUT_CONFIRM_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitLogoutUri() <em>Implicit Logout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutUri()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_LOGOUT_URI_EDEFAULT = "logout";

	/**
	 * The cached value of the '{@link #getImplicitLogoutUri() <em>Implicit Logout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitLogoutUri()
	 * @generated
	 * @ordered
	 */
	protected String implicitLogoutUri = IMPLICIT_LOGOUT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordName() <em>Implicit Forgotten Password Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_NAME_EDEFAULT = "forgotten";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordName() <em>Implicit Forgotten Password Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordName()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordName = IMPLICIT_FORGOTTEN_PASSWORD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordUnitLabel() <em>Implicit Forgotten Password Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL_EDEFAULT = "Reset Password Request";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordUnitLabel() <em>Implicit Forgotten Password Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordUnitLabel = IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordActionLabel() <em>Implicit Forgotten Password Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL_EDEFAULT = "Forgotten Password";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordActionLabel() <em>Implicit Forgotten Password Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordActionLabel = IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordConfirmLabel() <em>Implicit Forgotten Password Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL_EDEFAULT = "Reset Password";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordConfirmLabel() <em>Implicit Forgotten Password Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordConfirmLabel = IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordUriRequest() <em>Implicit Forgotten Password Uri Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordUriRequest()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST_EDEFAULT = "reset-password";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordUriRequest() <em>Implicit Forgotten Password Uri Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordUriRequest()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordUriRequest = IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordUriEmailSent() <em>Implicit Forgotten Password Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordUriEmailSent()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT_EDEFAULT = "check-email";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordUriEmailSent() <em>Implicit Forgotten Password Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordUriEmailSent()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordUriEmailSent = IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordEmailSubject() <em>Implicit Forgotten Password Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordEmailSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT_EDEFAULT = "Your password reset request";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordEmailSubject() <em>Implicit Forgotten Password Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordEmailSubject()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordEmailSubject = IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordEmailMessage() <em>Implicit Forgotten Password Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordEmailMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE_EDEFAULT = "Your password reset request";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordEmailMessage() <em>Implicit Forgotten Password Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordEmailMessage()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordEmailMessage = IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordEmailSentCaption() <em>Implicit Forgotten Password Email Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordEmailSentCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION_EDEFAULT = "Your password reset request";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordEmailSentCaption() <em>Implicit Forgotten Password Email Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordEmailSentCaption()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordEmailSentCaption = IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitForgottenPasswordEmailSentMessage() <em>Implicit Forgotten Password Email Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordEmailSentMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE_EDEFAULT = "Your password reset request";

	/**
	 * The cached value of the '{@link #getImplicitForgottenPasswordEmailSentMessage() <em>Implicit Forgotten Password Email Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitForgottenPasswordEmailSentMessage()
	 * @generated
	 * @ordered
	 */
	protected String implicitForgottenPasswordEmailSentMessage = IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitResetPasswordName() <em>Implicit Reset Password Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_RESET_PASSWORD_NAME_EDEFAULT = "reset";

	/**
	 * The cached value of the '{@link #getImplicitResetPasswordName() <em>Implicit Reset Password Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordName()
	 * @generated
	 * @ordered
	 */
	protected String implicitResetPasswordName = IMPLICIT_RESET_PASSWORD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitResetPasswordUnitLabel() <em>Implicit Reset Password Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_RESET_PASSWORD_UNIT_LABEL_EDEFAULT = "Reset Password";

	/**
	 * The cached value of the '{@link #getImplicitResetPasswordUnitLabel() <em>Implicit Reset Password Unit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordUnitLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitResetPasswordUnitLabel = IMPLICIT_RESET_PASSWORD_UNIT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitResetPasswordActionLabel() <em>Implicit Reset Password Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_RESET_PASSWORD_ACTION_LABEL_EDEFAULT = "Reset Password";

	/**
	 * The cached value of the '{@link #getImplicitResetPasswordActionLabel() <em>Implicit Reset Password Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordActionLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitResetPasswordActionLabel = IMPLICIT_RESET_PASSWORD_ACTION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitResetPasswordConfirmLabel() <em>Implicit Reset Password Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL_EDEFAULT = "Set Password";

	/**
	 * The cached value of the '{@link #getImplicitResetPasswordConfirmLabel() <em>Implicit Reset Password Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected String implicitResetPasswordConfirmLabel = IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplicitResetPasswordUri() <em>Implicit Reset Password Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordUri()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICIT_RESET_PASSWORD_URI_EDEFAULT = "reset";

	/**
	 * The cached value of the '{@link #getImplicitResetPasswordUri() <em>Implicit Reset Password Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitResetPasswordUri()
	 * @generated
	 * @ordered
	 */
	protected String implicitResetPasswordUri = IMPLICIT_RESET_PASSWORD_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security getSecurity() {
		if (eContainerFeatureID() != SecurityPackage.AUTHENTICATION__SECURITY) return null;
		return (Security)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(Security newSecurity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSecurity, SecurityPackage.AUTHENTICATION__SECURITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Security newSecurity) {
		if (newSecurity != eInternalContainer() || (eContainerFeatureID() != SecurityPackage.AUTHENTICATION__SECURITY && newSecurity != null)) {
			if (EcoreUtil.isAncestor(this, newSecurity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, SecurityPackage.SECURITY__AUTHENTICATION, Security.class, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (Entity)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.AUTHENTICATION__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(Entity newUser) {
		Entity oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getUserKey() {
		if (userKey != null && userKey.eIsProxy()) {
			InternalEObject oldUserKey = (InternalEObject)userKey;
			userKey = (Attribute)eResolveProxy(oldUserKey);
			if (userKey != oldUserKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.AUTHENTICATION__USER_KEY, oldUserKey, userKey));
			}
		}
		return userKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetUserKey() {
		return userKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserKey(Attribute newUserKey) {
		Attribute oldUserKey = userKey;
		userKey = newUserKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__USER_KEY, oldUserKey, userKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitRegistrationName() {
		return implicitRegistrationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitRegistrationName(String newImplicitRegistrationName) {
		String oldImplicitRegistrationName = implicitRegistrationName;
		implicitRegistrationName = newImplicitRegistrationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_NAME, oldImplicitRegistrationName, implicitRegistrationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitRegistrationUnitLabel() {
		return implicitRegistrationUnitLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitRegistrationUnitLabel(String newImplicitRegistrationUnitLabel) {
		String oldImplicitRegistrationUnitLabel = implicitRegistrationUnitLabel;
		implicitRegistrationUnitLabel = newImplicitRegistrationUnitLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL, oldImplicitRegistrationUnitLabel, implicitRegistrationUnitLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitRegistrationActionLabel() {
		return implicitRegistrationActionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitRegistrationActionLabel(String newImplicitRegistrationActionLabel) {
		String oldImplicitRegistrationActionLabel = implicitRegistrationActionLabel;
		implicitRegistrationActionLabel = newImplicitRegistrationActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL, oldImplicitRegistrationActionLabel, implicitRegistrationActionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitRegistrationConfirmLabel() {
		return implicitRegistrationConfirmLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitRegistrationConfirmLabel(String newImplicitRegistrationConfirmLabel) {
		String oldImplicitRegistrationConfirmLabel = implicitRegistrationConfirmLabel;
		implicitRegistrationConfirmLabel = newImplicitRegistrationConfirmLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL, oldImplicitRegistrationConfirmLabel, implicitRegistrationConfirmLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitRegistrationUri() {
		return implicitRegistrationUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitRegistrationUri(String newImplicitRegistrationUri) {
		String oldImplicitRegistrationUri = implicitRegistrationUri;
		implicitRegistrationUri = newImplicitRegistrationUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_URI, oldImplicitRegistrationUri, implicitRegistrationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLoginName() {
		return implicitLoginName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLoginName(String newImplicitLoginName) {
		String oldImplicitLoginName = implicitLoginName;
		implicitLoginName = newImplicitLoginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_NAME, oldImplicitLoginName, implicitLoginName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLoginUnitLabel() {
		return implicitLoginUnitLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLoginUnitLabel(String newImplicitLoginUnitLabel) {
		String oldImplicitLoginUnitLabel = implicitLoginUnitLabel;
		implicitLoginUnitLabel = newImplicitLoginUnitLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL, oldImplicitLoginUnitLabel, implicitLoginUnitLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLoginActionLabel() {
		return implicitLoginActionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLoginActionLabel(String newImplicitLoginActionLabel) {
		String oldImplicitLoginActionLabel = implicitLoginActionLabel;
		implicitLoginActionLabel = newImplicitLoginActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL, oldImplicitLoginActionLabel, implicitLoginActionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLoginConfirmLabel() {
		return implicitLoginConfirmLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLoginConfirmLabel(String newImplicitLoginConfirmLabel) {
		String oldImplicitLoginConfirmLabel = implicitLoginConfirmLabel;
		implicitLoginConfirmLabel = newImplicitLoginConfirmLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL, oldImplicitLoginConfirmLabel, implicitLoginConfirmLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLoginUri() {
		return implicitLoginUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLoginUri(String newImplicitLoginUri) {
		String oldImplicitLoginUri = implicitLoginUri;
		implicitLoginUri = newImplicitLoginUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_URI, oldImplicitLoginUri, implicitLoginUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLogoutName() {
		return implicitLogoutName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLogoutName(String newImplicitLogoutName) {
		String oldImplicitLogoutName = implicitLogoutName;
		implicitLogoutName = newImplicitLogoutName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_NAME, oldImplicitLogoutName, implicitLogoutName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLogoutUnitLabel() {
		return implicitLogoutUnitLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLogoutUnitLabel(String newImplicitLogoutUnitLabel) {
		String oldImplicitLogoutUnitLabel = implicitLogoutUnitLabel;
		implicitLogoutUnitLabel = newImplicitLogoutUnitLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL, oldImplicitLogoutUnitLabel, implicitLogoutUnitLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLogoutActionLabel() {
		return implicitLogoutActionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLogoutActionLabel(String newImplicitLogoutActionLabel) {
		String oldImplicitLogoutActionLabel = implicitLogoutActionLabel;
		implicitLogoutActionLabel = newImplicitLogoutActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL, oldImplicitLogoutActionLabel, implicitLogoutActionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLogoutConfirmLabel() {
		return implicitLogoutConfirmLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLogoutConfirmLabel(String newImplicitLogoutConfirmLabel) {
		String oldImplicitLogoutConfirmLabel = implicitLogoutConfirmLabel;
		implicitLogoutConfirmLabel = newImplicitLogoutConfirmLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL, oldImplicitLogoutConfirmLabel, implicitLogoutConfirmLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitLogoutUri() {
		return implicitLogoutUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitLogoutUri(String newImplicitLogoutUri) {
		String oldImplicitLogoutUri = implicitLogoutUri;
		implicitLogoutUri = newImplicitLogoutUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_URI, oldImplicitLogoutUri, implicitLogoutUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordName() {
		return implicitForgottenPasswordName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordName(String newImplicitForgottenPasswordName) {
		String oldImplicitForgottenPasswordName = implicitForgottenPasswordName;
		implicitForgottenPasswordName = newImplicitForgottenPasswordName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME, oldImplicitForgottenPasswordName, implicitForgottenPasswordName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordUnitLabel() {
		return implicitForgottenPasswordUnitLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordUnitLabel(String newImplicitForgottenPasswordUnitLabel) {
		String oldImplicitForgottenPasswordUnitLabel = implicitForgottenPasswordUnitLabel;
		implicitForgottenPasswordUnitLabel = newImplicitForgottenPasswordUnitLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL, oldImplicitForgottenPasswordUnitLabel, implicitForgottenPasswordUnitLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordActionLabel() {
		return implicitForgottenPasswordActionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordActionLabel(String newImplicitForgottenPasswordActionLabel) {
		String oldImplicitForgottenPasswordActionLabel = implicitForgottenPasswordActionLabel;
		implicitForgottenPasswordActionLabel = newImplicitForgottenPasswordActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL, oldImplicitForgottenPasswordActionLabel, implicitForgottenPasswordActionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordConfirmLabel() {
		return implicitForgottenPasswordConfirmLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordConfirmLabel(String newImplicitForgottenPasswordConfirmLabel) {
		String oldImplicitForgottenPasswordConfirmLabel = implicitForgottenPasswordConfirmLabel;
		implicitForgottenPasswordConfirmLabel = newImplicitForgottenPasswordConfirmLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL, oldImplicitForgottenPasswordConfirmLabel, implicitForgottenPasswordConfirmLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordUriRequest() {
		return implicitForgottenPasswordUriRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordUriRequest(String newImplicitForgottenPasswordUriRequest) {
		String oldImplicitForgottenPasswordUriRequest = implicitForgottenPasswordUriRequest;
		implicitForgottenPasswordUriRequest = newImplicitForgottenPasswordUriRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST, oldImplicitForgottenPasswordUriRequest, implicitForgottenPasswordUriRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordUriEmailSent() {
		return implicitForgottenPasswordUriEmailSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordUriEmailSent(String newImplicitForgottenPasswordUriEmailSent) {
		String oldImplicitForgottenPasswordUriEmailSent = implicitForgottenPasswordUriEmailSent;
		implicitForgottenPasswordUriEmailSent = newImplicitForgottenPasswordUriEmailSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT, oldImplicitForgottenPasswordUriEmailSent, implicitForgottenPasswordUriEmailSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordEmailSubject() {
		return implicitForgottenPasswordEmailSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordEmailSubject(String newImplicitForgottenPasswordEmailSubject) {
		String oldImplicitForgottenPasswordEmailSubject = implicitForgottenPasswordEmailSubject;
		implicitForgottenPasswordEmailSubject = newImplicitForgottenPasswordEmailSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT, oldImplicitForgottenPasswordEmailSubject, implicitForgottenPasswordEmailSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordEmailMessage() {
		return implicitForgottenPasswordEmailMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordEmailMessage(String newImplicitForgottenPasswordEmailMessage) {
		String oldImplicitForgottenPasswordEmailMessage = implicitForgottenPasswordEmailMessage;
		implicitForgottenPasswordEmailMessage = newImplicitForgottenPasswordEmailMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE, oldImplicitForgottenPasswordEmailMessage, implicitForgottenPasswordEmailMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordEmailSentCaption() {
		return implicitForgottenPasswordEmailSentCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordEmailSentCaption(String newImplicitForgottenPasswordEmailSentCaption) {
		String oldImplicitForgottenPasswordEmailSentCaption = implicitForgottenPasswordEmailSentCaption;
		implicitForgottenPasswordEmailSentCaption = newImplicitForgottenPasswordEmailSentCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION, oldImplicitForgottenPasswordEmailSentCaption, implicitForgottenPasswordEmailSentCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitForgottenPasswordEmailSentMessage() {
		return implicitForgottenPasswordEmailSentMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitForgottenPasswordEmailSentMessage(String newImplicitForgottenPasswordEmailSentMessage) {
		String oldImplicitForgottenPasswordEmailSentMessage = implicitForgottenPasswordEmailSentMessage;
		implicitForgottenPasswordEmailSentMessage = newImplicitForgottenPasswordEmailSentMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE, oldImplicitForgottenPasswordEmailSentMessage, implicitForgottenPasswordEmailSentMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitResetPasswordName() {
		return implicitResetPasswordName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitResetPasswordName(String newImplicitResetPasswordName) {
		String oldImplicitResetPasswordName = implicitResetPasswordName;
		implicitResetPasswordName = newImplicitResetPasswordName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME, oldImplicitResetPasswordName, implicitResetPasswordName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitResetPasswordUnitLabel() {
		return implicitResetPasswordUnitLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitResetPasswordUnitLabel(String newImplicitResetPasswordUnitLabel) {
		String oldImplicitResetPasswordUnitLabel = implicitResetPasswordUnitLabel;
		implicitResetPasswordUnitLabel = newImplicitResetPasswordUnitLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL, oldImplicitResetPasswordUnitLabel, implicitResetPasswordUnitLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitResetPasswordActionLabel() {
		return implicitResetPasswordActionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitResetPasswordActionLabel(String newImplicitResetPasswordActionLabel) {
		String oldImplicitResetPasswordActionLabel = implicitResetPasswordActionLabel;
		implicitResetPasswordActionLabel = newImplicitResetPasswordActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL, oldImplicitResetPasswordActionLabel, implicitResetPasswordActionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitResetPasswordConfirmLabel() {
		return implicitResetPasswordConfirmLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitResetPasswordConfirmLabel(String newImplicitResetPasswordConfirmLabel) {
		String oldImplicitResetPasswordConfirmLabel = implicitResetPasswordConfirmLabel;
		implicitResetPasswordConfirmLabel = newImplicitResetPasswordConfirmLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL, oldImplicitResetPasswordConfirmLabel, implicitResetPasswordConfirmLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplicitResetPasswordUri() {
		return implicitResetPasswordUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitResetPasswordUri(String newImplicitResetPasswordUri) {
		String oldImplicitResetPasswordUri = implicitResetPasswordUri;
		implicitResetPasswordUri = newImplicitResetPasswordUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI, oldImplicitResetPasswordUri, implicitResetPasswordUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSecurity((Security)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				return basicSetSecurity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				return eInternalContainer().eInverseRemove(this, SecurityPackage.SECURITY__AUTHENTICATION, Security.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				return getSecurity();
			case SecurityPackage.AUTHENTICATION__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				if (resolve) return getUserKey();
				return basicGetUserKey();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_NAME:
				return getImplicitRegistrationName();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL:
				return getImplicitRegistrationUnitLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL:
				return getImplicitRegistrationActionLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL:
				return getImplicitRegistrationConfirmLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_URI:
				return getImplicitRegistrationUri();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_NAME:
				return getImplicitLoginName();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL:
				return getImplicitLoginUnitLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL:
				return getImplicitLoginActionLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL:
				return getImplicitLoginConfirmLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_URI:
				return getImplicitLoginUri();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_NAME:
				return getImplicitLogoutName();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL:
				return getImplicitLogoutUnitLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL:
				return getImplicitLogoutActionLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL:
				return getImplicitLogoutConfirmLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_URI:
				return getImplicitLogoutUri();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME:
				return getImplicitForgottenPasswordName();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL:
				return getImplicitForgottenPasswordUnitLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL:
				return getImplicitForgottenPasswordActionLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL:
				return getImplicitForgottenPasswordConfirmLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST:
				return getImplicitForgottenPasswordUriRequest();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT:
				return getImplicitForgottenPasswordUriEmailSent();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT:
				return getImplicitForgottenPasswordEmailSubject();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE:
				return getImplicitForgottenPasswordEmailMessage();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION:
				return getImplicitForgottenPasswordEmailSentCaption();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE:
				return getImplicitForgottenPasswordEmailSentMessage();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME:
				return getImplicitResetPasswordName();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL:
				return getImplicitResetPasswordUnitLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL:
				return getImplicitResetPasswordActionLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL:
				return getImplicitResetPasswordConfirmLabel();
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI:
				return getImplicitResetPasswordUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				setSecurity((Security)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__USER:
				setUser((Entity)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				setUserKey((Attribute)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_NAME:
				setImplicitRegistrationName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL:
				setImplicitRegistrationUnitLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL:
				setImplicitRegistrationActionLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL:
				setImplicitRegistrationConfirmLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_URI:
				setImplicitRegistrationUri((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_NAME:
				setImplicitLoginName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL:
				setImplicitLoginUnitLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL:
				setImplicitLoginActionLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL:
				setImplicitLoginConfirmLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_URI:
				setImplicitLoginUri((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_NAME:
				setImplicitLogoutName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL:
				setImplicitLogoutUnitLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL:
				setImplicitLogoutActionLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL:
				setImplicitLogoutConfirmLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_URI:
				setImplicitLogoutUri((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME:
				setImplicitForgottenPasswordName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL:
				setImplicitForgottenPasswordUnitLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL:
				setImplicitForgottenPasswordActionLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL:
				setImplicitForgottenPasswordConfirmLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST:
				setImplicitForgottenPasswordUriRequest((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT:
				setImplicitForgottenPasswordUriEmailSent((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT:
				setImplicitForgottenPasswordEmailSubject((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE:
				setImplicitForgottenPasswordEmailMessage((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION:
				setImplicitForgottenPasswordEmailSentCaption((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE:
				setImplicitForgottenPasswordEmailSentMessage((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME:
				setImplicitResetPasswordName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL:
				setImplicitResetPasswordUnitLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL:
				setImplicitResetPasswordActionLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL:
				setImplicitResetPasswordConfirmLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI:
				setImplicitResetPasswordUri((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				setSecurity((Security)null);
				return;
			case SecurityPackage.AUTHENTICATION__USER:
				setUser((Entity)null);
				return;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				setUserKey((Attribute)null);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_NAME:
				setImplicitRegistrationName(IMPLICIT_REGISTRATION_NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL:
				setImplicitRegistrationUnitLabel(IMPLICIT_REGISTRATION_UNIT_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL:
				setImplicitRegistrationActionLabel(IMPLICIT_REGISTRATION_ACTION_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL:
				setImplicitRegistrationConfirmLabel(IMPLICIT_REGISTRATION_CONFIRM_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_URI:
				setImplicitRegistrationUri(IMPLICIT_REGISTRATION_URI_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_NAME:
				setImplicitLoginName(IMPLICIT_LOGIN_NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL:
				setImplicitLoginUnitLabel(IMPLICIT_LOGIN_UNIT_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL:
				setImplicitLoginActionLabel(IMPLICIT_LOGIN_ACTION_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL:
				setImplicitLoginConfirmLabel(IMPLICIT_LOGIN_CONFIRM_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_URI:
				setImplicitLoginUri(IMPLICIT_LOGIN_URI_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_NAME:
				setImplicitLogoutName(IMPLICIT_LOGOUT_NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL:
				setImplicitLogoutUnitLabel(IMPLICIT_LOGOUT_UNIT_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL:
				setImplicitLogoutActionLabel(IMPLICIT_LOGOUT_ACTION_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL:
				setImplicitLogoutConfirmLabel(IMPLICIT_LOGOUT_CONFIRM_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_URI:
				setImplicitLogoutUri(IMPLICIT_LOGOUT_URI_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME:
				setImplicitForgottenPasswordName(IMPLICIT_FORGOTTEN_PASSWORD_NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL:
				setImplicitForgottenPasswordUnitLabel(IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL:
				setImplicitForgottenPasswordActionLabel(IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL:
				setImplicitForgottenPasswordConfirmLabel(IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST:
				setImplicitForgottenPasswordUriRequest(IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT:
				setImplicitForgottenPasswordUriEmailSent(IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT:
				setImplicitForgottenPasswordEmailSubject(IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE:
				setImplicitForgottenPasswordEmailMessage(IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION:
				setImplicitForgottenPasswordEmailSentCaption(IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE:
				setImplicitForgottenPasswordEmailSentMessage(IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME:
				setImplicitResetPasswordName(IMPLICIT_RESET_PASSWORD_NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL:
				setImplicitResetPasswordUnitLabel(IMPLICIT_RESET_PASSWORD_UNIT_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL:
				setImplicitResetPasswordActionLabel(IMPLICIT_RESET_PASSWORD_ACTION_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL:
				setImplicitResetPasswordConfirmLabel(IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI:
				setImplicitResetPasswordUri(IMPLICIT_RESET_PASSWORD_URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__SECURITY:
				return getSecurity() != null;
			case SecurityPackage.AUTHENTICATION__USER:
				return user != null;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				return userKey != null;
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_NAME:
				return IMPLICIT_REGISTRATION_NAME_EDEFAULT == null ? implicitRegistrationName != null : !IMPLICIT_REGISTRATION_NAME_EDEFAULT.equals(implicitRegistrationName);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL:
				return IMPLICIT_REGISTRATION_UNIT_LABEL_EDEFAULT == null ? implicitRegistrationUnitLabel != null : !IMPLICIT_REGISTRATION_UNIT_LABEL_EDEFAULT.equals(implicitRegistrationUnitLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL:
				return IMPLICIT_REGISTRATION_ACTION_LABEL_EDEFAULT == null ? implicitRegistrationActionLabel != null : !IMPLICIT_REGISTRATION_ACTION_LABEL_EDEFAULT.equals(implicitRegistrationActionLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL:
				return IMPLICIT_REGISTRATION_CONFIRM_LABEL_EDEFAULT == null ? implicitRegistrationConfirmLabel != null : !IMPLICIT_REGISTRATION_CONFIRM_LABEL_EDEFAULT.equals(implicitRegistrationConfirmLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_URI:
				return IMPLICIT_REGISTRATION_URI_EDEFAULT == null ? implicitRegistrationUri != null : !IMPLICIT_REGISTRATION_URI_EDEFAULT.equals(implicitRegistrationUri);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_NAME:
				return IMPLICIT_LOGIN_NAME_EDEFAULT == null ? implicitLoginName != null : !IMPLICIT_LOGIN_NAME_EDEFAULT.equals(implicitLoginName);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL:
				return IMPLICIT_LOGIN_UNIT_LABEL_EDEFAULT == null ? implicitLoginUnitLabel != null : !IMPLICIT_LOGIN_UNIT_LABEL_EDEFAULT.equals(implicitLoginUnitLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL:
				return IMPLICIT_LOGIN_ACTION_LABEL_EDEFAULT == null ? implicitLoginActionLabel != null : !IMPLICIT_LOGIN_ACTION_LABEL_EDEFAULT.equals(implicitLoginActionLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL:
				return IMPLICIT_LOGIN_CONFIRM_LABEL_EDEFAULT == null ? implicitLoginConfirmLabel != null : !IMPLICIT_LOGIN_CONFIRM_LABEL_EDEFAULT.equals(implicitLoginConfirmLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_URI:
				return IMPLICIT_LOGIN_URI_EDEFAULT == null ? implicitLoginUri != null : !IMPLICIT_LOGIN_URI_EDEFAULT.equals(implicitLoginUri);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_NAME:
				return IMPLICIT_LOGOUT_NAME_EDEFAULT == null ? implicitLogoutName != null : !IMPLICIT_LOGOUT_NAME_EDEFAULT.equals(implicitLogoutName);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL:
				return IMPLICIT_LOGOUT_UNIT_LABEL_EDEFAULT == null ? implicitLogoutUnitLabel != null : !IMPLICIT_LOGOUT_UNIT_LABEL_EDEFAULT.equals(implicitLogoutUnitLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL:
				return IMPLICIT_LOGOUT_ACTION_LABEL_EDEFAULT == null ? implicitLogoutActionLabel != null : !IMPLICIT_LOGOUT_ACTION_LABEL_EDEFAULT.equals(implicitLogoutActionLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL:
				return IMPLICIT_LOGOUT_CONFIRM_LABEL_EDEFAULT == null ? implicitLogoutConfirmLabel != null : !IMPLICIT_LOGOUT_CONFIRM_LABEL_EDEFAULT.equals(implicitLogoutConfirmLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_URI:
				return IMPLICIT_LOGOUT_URI_EDEFAULT == null ? implicitLogoutUri != null : !IMPLICIT_LOGOUT_URI_EDEFAULT.equals(implicitLogoutUri);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME:
				return IMPLICIT_FORGOTTEN_PASSWORD_NAME_EDEFAULT == null ? implicitForgottenPasswordName != null : !IMPLICIT_FORGOTTEN_PASSWORD_NAME_EDEFAULT.equals(implicitForgottenPasswordName);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL:
				return IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL_EDEFAULT == null ? implicitForgottenPasswordUnitLabel != null : !IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL_EDEFAULT.equals(implicitForgottenPasswordUnitLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL:
				return IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL_EDEFAULT == null ? implicitForgottenPasswordActionLabel != null : !IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL_EDEFAULT.equals(implicitForgottenPasswordActionLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL:
				return IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL_EDEFAULT == null ? implicitForgottenPasswordConfirmLabel != null : !IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL_EDEFAULT.equals(implicitForgottenPasswordConfirmLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST:
				return IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST_EDEFAULT == null ? implicitForgottenPasswordUriRequest != null : !IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST_EDEFAULT.equals(implicitForgottenPasswordUriRequest);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT:
				return IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT_EDEFAULT == null ? implicitForgottenPasswordUriEmailSent != null : !IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT_EDEFAULT.equals(implicitForgottenPasswordUriEmailSent);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT:
				return IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT_EDEFAULT == null ? implicitForgottenPasswordEmailSubject != null : !IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT_EDEFAULT.equals(implicitForgottenPasswordEmailSubject);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE:
				return IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE_EDEFAULT == null ? implicitForgottenPasswordEmailMessage != null : !IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE_EDEFAULT.equals(implicitForgottenPasswordEmailMessage);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION:
				return IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION_EDEFAULT == null ? implicitForgottenPasswordEmailSentCaption != null : !IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION_EDEFAULT.equals(implicitForgottenPasswordEmailSentCaption);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE:
				return IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE_EDEFAULT == null ? implicitForgottenPasswordEmailSentMessage != null : !IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE_EDEFAULT.equals(implicitForgottenPasswordEmailSentMessage);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME:
				return IMPLICIT_RESET_PASSWORD_NAME_EDEFAULT == null ? implicitResetPasswordName != null : !IMPLICIT_RESET_PASSWORD_NAME_EDEFAULT.equals(implicitResetPasswordName);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL:
				return IMPLICIT_RESET_PASSWORD_UNIT_LABEL_EDEFAULT == null ? implicitResetPasswordUnitLabel != null : !IMPLICIT_RESET_PASSWORD_UNIT_LABEL_EDEFAULT.equals(implicitResetPasswordUnitLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL:
				return IMPLICIT_RESET_PASSWORD_ACTION_LABEL_EDEFAULT == null ? implicitResetPasswordActionLabel != null : !IMPLICIT_RESET_PASSWORD_ACTION_LABEL_EDEFAULT.equals(implicitResetPasswordActionLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL:
				return IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL_EDEFAULT == null ? implicitResetPasswordConfirmLabel != null : !IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL_EDEFAULT.equals(implicitResetPasswordConfirmLabel);
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI:
				return IMPLICIT_RESET_PASSWORD_URI_EDEFAULT == null ? implicitResetPasswordUri != null : !IMPLICIT_RESET_PASSWORD_URI_EDEFAULT.equals(implicitResetPasswordUri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (implicitRegistrationName: ");
		result.append(implicitRegistrationName);
		result.append(", implicitRegistrationUnitLabel: ");
		result.append(implicitRegistrationUnitLabel);
		result.append(", implicitRegistrationActionLabel: ");
		result.append(implicitRegistrationActionLabel);
		result.append(", implicitRegistrationConfirmLabel: ");
		result.append(implicitRegistrationConfirmLabel);
		result.append(", implicitRegistrationUri: ");
		result.append(implicitRegistrationUri);
		result.append(", implicitLoginName: ");
		result.append(implicitLoginName);
		result.append(", implicitLoginUnitLabel: ");
		result.append(implicitLoginUnitLabel);
		result.append(", implicitLoginActionLabel: ");
		result.append(implicitLoginActionLabel);
		result.append(", implicitLoginConfirmLabel: ");
		result.append(implicitLoginConfirmLabel);
		result.append(", implicitLoginUri: ");
		result.append(implicitLoginUri);
		result.append(", implicitLogoutName: ");
		result.append(implicitLogoutName);
		result.append(", implicitLogoutUnitLabel: ");
		result.append(implicitLogoutUnitLabel);
		result.append(", implicitLogoutActionLabel: ");
		result.append(implicitLogoutActionLabel);
		result.append(", implicitLogoutConfirmLabel: ");
		result.append(implicitLogoutConfirmLabel);
		result.append(", implicitLogoutUri: ");
		result.append(implicitLogoutUri);
		result.append(", implicitForgottenPasswordName: ");
		result.append(implicitForgottenPasswordName);
		result.append(", implicitForgottenPasswordUnitLabel: ");
		result.append(implicitForgottenPasswordUnitLabel);
		result.append(", implicitForgottenPasswordActionLabel: ");
		result.append(implicitForgottenPasswordActionLabel);
		result.append(", implicitForgottenPasswordConfirmLabel: ");
		result.append(implicitForgottenPasswordConfirmLabel);
		result.append(", implicitForgottenPasswordUriRequest: ");
		result.append(implicitForgottenPasswordUriRequest);
		result.append(", implicitForgottenPasswordUriEmailSent: ");
		result.append(implicitForgottenPasswordUriEmailSent);
		result.append(", implicitForgottenPasswordEmailSubject: ");
		result.append(implicitForgottenPasswordEmailSubject);
		result.append(", implicitForgottenPasswordEmailMessage: ");
		result.append(implicitForgottenPasswordEmailMessage);
		result.append(", implicitForgottenPasswordEmailSentCaption: ");
		result.append(implicitForgottenPasswordEmailSentCaption);
		result.append(", implicitForgottenPasswordEmailSentMessage: ");
		result.append(implicitForgottenPasswordEmailSentMessage);
		result.append(", implicitResetPasswordName: ");
		result.append(implicitResetPasswordName);
		result.append(", implicitResetPasswordUnitLabel: ");
		result.append(implicitResetPasswordUnitLabel);
		result.append(", implicitResetPasswordActionLabel: ");
		result.append(implicitResetPasswordActionLabel);
		result.append(", implicitResetPasswordConfirmLabel: ");
		result.append(implicitResetPasswordConfirmLabel);
		result.append(", implicitResetPasswordUri: ");
		result.append(implicitResetPasswordUri);
		result.append(')');
		return result.toString();
	}

} //AuthenticationImpl
