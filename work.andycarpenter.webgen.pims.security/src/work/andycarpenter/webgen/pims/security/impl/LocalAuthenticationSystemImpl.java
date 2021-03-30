/**
 */
package work.andycarpenter.webgen.pims.security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.security.AuthenticationKeyTypes;
import work.andycarpenter.webgen.pims.security.LocalAuthenticationSystem;
import work.andycarpenter.webgen.pims.security.SecurityPackage;
import work.andycarpenter.webgen.pims.security.SecurityUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getAuthenticationModel <em>Authentication Model</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getAuthenticationName <em>Authentication Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getResetPasswordRequestModel <em>Reset Password Request Model</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getResetPasswordRequestName <em>Reset Password Request Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getLogoutUnit <em>Logout Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getResetPasswordUnit <em>Reset Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getViewRole <em>View Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getEditRole <em>Edit Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#isAllowRememberMe <em>Allow Remember Me</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#isTrackLoginAttempts <em>Track Login Attempts</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalAuthenticationSystemImpl extends AuthenticationImpl implements LocalAuthenticationSystem {
	/**
	 * The cached value of the '{@link #getAuthenticationModel() <em>Authentication Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationModel()
	 * @generated
	 * @ordered
	 */
	protected Entity authenticationModel;

	/**
	 * The default value of the '{@link #getAuthenticationName() <em>Authentication Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_NAME_EDEFAULT = "Authentication";

	/**
	 * The cached value of the '{@link #getAuthenticationName() <em>Authentication Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationName()
	 * @generated
	 * @ordered
	 */
	protected String authenticationName = AUTHENTICATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationKey() <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationKeyTypes AUTHENTICATION_KEY_EDEFAULT = AuthenticationKeyTypes.ANY;

	/**
	 * The cached value of the '{@link #getAuthenticationKey() <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationKeyTypes authenticationKey = AUTHENTICATION_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResetPasswordRequestModel() <em>Reset Password Request Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPasswordRequestModel()
	 * @generated
	 * @ordered
	 */
	protected Entity resetPasswordRequestModel;

	/**
	 * The default value of the '{@link #getResetPasswordRequestName() <em>Reset Password Request Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPasswordRequestName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_PASSWORD_REQUEST_NAME_EDEFAULT = "ResetPasswordRequest";

	/**
	 * The cached value of the '{@link #getResetPasswordRequestName() <em>Reset Password Request Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPasswordRequestName()
	 * @generated
	 * @ordered
	 */
	protected String resetPasswordRequestName = RESET_PASSWORD_REQUEST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegistrationUnit() <em>Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationUnit()
	 * @generated
	 * @ordered
	 */
	protected SecurityUnit registrationUnit;

	/**
	 * The cached value of the '{@link #getLoginUnit() <em>Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginUnit()
	 * @generated
	 * @ordered
	 */
	protected SecurityUnit loginUnit;

	/**
	 * The cached value of the '{@link #getLogoutUnit() <em>Logout Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutUnit()
	 * @generated
	 * @ordered
	 */
	protected SecurityUnit logoutUnit;

	/**
	 * The cached value of the '{@link #getForgottenPasswordUnit() <em>Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 * @ordered
	 */
	protected SecurityUnit forgottenPasswordUnit;

	/**
	 * The cached value of the '{@link #getResetPasswordUnit() <em>Reset Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPasswordUnit()
	 * @generated
	 * @ordered
	 */
	protected SecurityUnit resetPasswordUnit;

	/**
	 * The default value of the '{@link #getViewRole() <em>View Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRole()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_ROLE_EDEFAULT = "ROLE_SECURITY";

	/**
	 * The cached value of the '{@link #getViewRole() <em>View Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRole()
	 * @generated
	 * @ordered
	 */
	protected String viewRole = VIEW_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditRole() <em>Edit Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditRole()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_ROLE_EDEFAULT = "ROLE_SECURITY";

	/**
	 * The cached value of the '{@link #getEditRole() <em>Edit Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditRole()
	 * @generated
	 * @ordered
	 */
	protected String editRole = EDIT_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CAPTCHA_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected boolean useCaptcha = USE_CAPTCHA_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowRememberMe() <em>Allow Remember Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRememberMe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_REMEMBER_ME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowRememberMe() <em>Allow Remember Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRememberMe()
	 * @generated
	 * @ordered
	 */
	protected boolean allowRememberMe = ALLOW_REMEMBER_ME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SELF_REGISTRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected boolean allowSelfRegistration = ALLOW_SELF_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrackLoginAttempts() <em>Track Login Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackLoginAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACK_LOGIN_ATTEMPTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTrackLoginAttempts() <em>Track Login Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackLoginAttempts()
	 * @generated
	 * @ordered
	 */
	protected boolean trackLoginAttempts = TRACK_LOGIN_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseEmailActivation() <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEmailActivation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_EMAIL_ACTIVATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseEmailActivation() <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEmailActivation()
	 * @generated
	 * @ordered
	 */
	protected boolean useEmailActivation = USE_EMAIL_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSendWelcomeEmail() <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendWelcomeEmail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEND_WELCOME_EMAIL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSendWelcomeEmail() <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendWelcomeEmail()
	 * @generated
	 * @ordered
	 */
	protected boolean sendWelcomeEmail = SEND_WELCOME_EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalAuthenticationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getAuthenticationModel() {
		if (authenticationModel != null && authenticationModel.eIsProxy()) {
			InternalEObject oldAuthenticationModel = (InternalEObject)authenticationModel;
			authenticationModel = (Entity)eResolveProxy(oldAuthenticationModel);
			if (authenticationModel != oldAuthenticationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL, oldAuthenticationModel, authenticationModel));
			}
		}
		return authenticationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetAuthenticationModel() {
		return authenticationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationModel(Entity newAuthenticationModel) {
		Entity oldAuthenticationModel = authenticationModel;
		authenticationModel = newAuthenticationModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL, oldAuthenticationModel, authenticationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthenticationName() {
		return authenticationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationName(String newAuthenticationName) {
		String oldAuthenticationName = authenticationName;
		authenticationName = newAuthenticationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_NAME, oldAuthenticationName, authenticationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationKeyTypes getAuthenticationKey() {
		return authenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationKey(AuthenticationKeyTypes newAuthenticationKey) {
		AuthenticationKeyTypes oldAuthenticationKey = authenticationKey;
		authenticationKey = newAuthenticationKey == null ? AUTHENTICATION_KEY_EDEFAULT : newAuthenticationKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY, oldAuthenticationKey, authenticationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getResetPasswordRequestModel() {
		if (resetPasswordRequestModel != null && resetPasswordRequestModel.eIsProxy()) {
			InternalEObject oldResetPasswordRequestModel = (InternalEObject)resetPasswordRequestModel;
			resetPasswordRequestModel = (Entity)eResolveProxy(oldResetPasswordRequestModel);
			if (resetPasswordRequestModel != oldResetPasswordRequestModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL, oldResetPasswordRequestModel, resetPasswordRequestModel));
			}
		}
		return resetPasswordRequestModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetResetPasswordRequestModel() {
		return resetPasswordRequestModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetPasswordRequestModel(Entity newResetPasswordRequestModel) {
		Entity oldResetPasswordRequestModel = resetPasswordRequestModel;
		resetPasswordRequestModel = newResetPasswordRequestModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL, oldResetPasswordRequestModel, resetPasswordRequestModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResetPasswordRequestName() {
		return resetPasswordRequestName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetPasswordRequestName(String newResetPasswordRequestName) {
		String oldResetPasswordRequestName = resetPasswordRequestName;
		resetPasswordRequestName = newResetPasswordRequestName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_NAME, oldResetPasswordRequestName, resetPasswordRequestName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityUnit getRegistrationUnit() {
		if (registrationUnit != null && registrationUnit.eIsProxy()) {
			InternalEObject oldRegistrationUnit = (InternalEObject)registrationUnit;
			registrationUnit = (SecurityUnit)eResolveProxy(oldRegistrationUnit);
			if (registrationUnit != oldRegistrationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, oldRegistrationUnit, registrationUnit));
			}
		}
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityUnit basicGetRegistrationUnit() {
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistrationUnit(SecurityUnit newRegistrationUnit) {
		SecurityUnit oldRegistrationUnit = registrationUnit;
		registrationUnit = newRegistrationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, oldRegistrationUnit, registrationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityUnit getLoginUnit() {
		if (loginUnit != null && loginUnit.eIsProxy()) {
			InternalEObject oldLoginUnit = (InternalEObject)loginUnit;
			loginUnit = (SecurityUnit)eResolveProxy(oldLoginUnit);
			if (loginUnit != oldLoginUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, oldLoginUnit, loginUnit));
			}
		}
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityUnit basicGetLoginUnit() {
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginUnit(SecurityUnit newLoginUnit) {
		SecurityUnit oldLoginUnit = loginUnit;
		loginUnit = newLoginUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, oldLoginUnit, loginUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityUnit getLogoutUnit() {
		if (logoutUnit != null && logoutUnit.eIsProxy()) {
			InternalEObject oldLogoutUnit = (InternalEObject)logoutUnit;
			logoutUnit = (SecurityUnit)eResolveProxy(oldLogoutUnit);
			if (logoutUnit != oldLogoutUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT, oldLogoutUnit, logoutUnit));
			}
		}
		return logoutUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityUnit basicGetLogoutUnit() {
		return logoutUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoutUnit(SecurityUnit newLogoutUnit) {
		SecurityUnit oldLogoutUnit = logoutUnit;
		logoutUnit = newLogoutUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT, oldLogoutUnit, logoutUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityUnit getForgottenPasswordUnit() {
		if (forgottenPasswordUnit != null && forgottenPasswordUnit.eIsProxy()) {
			InternalEObject oldForgottenPasswordUnit = (InternalEObject)forgottenPasswordUnit;
			forgottenPasswordUnit = (SecurityUnit)eResolveProxy(oldForgottenPasswordUnit);
			if (forgottenPasswordUnit != oldForgottenPasswordUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, oldForgottenPasswordUnit, forgottenPasswordUnit));
			}
		}
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityUnit basicGetForgottenPasswordUnit() {
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForgottenPasswordUnit(SecurityUnit newForgottenPasswordUnit) {
		SecurityUnit oldForgottenPasswordUnit = forgottenPasswordUnit;
		forgottenPasswordUnit = newForgottenPasswordUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, oldForgottenPasswordUnit, forgottenPasswordUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityUnit getResetPasswordUnit() {
		if (resetPasswordUnit != null && resetPasswordUnit.eIsProxy()) {
			InternalEObject oldResetPasswordUnit = (InternalEObject)resetPasswordUnit;
			resetPasswordUnit = (SecurityUnit)eResolveProxy(oldResetPasswordUnit);
			if (resetPasswordUnit != oldResetPasswordUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT, oldResetPasswordUnit, resetPasswordUnit));
			}
		}
		return resetPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityUnit basicGetResetPasswordUnit() {
		return resetPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetPasswordUnit(SecurityUnit newResetPasswordUnit) {
		SecurityUnit oldResetPasswordUnit = resetPasswordUnit;
		resetPasswordUnit = newResetPasswordUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT, oldResetPasswordUnit, resetPasswordUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewRole() {
		return viewRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewRole(String newViewRole) {
		String oldViewRole = viewRole;
		viewRole = newViewRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__VIEW_ROLE, oldViewRole, viewRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditRole() {
		return editRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditRole(String newEditRole) {
		String oldEditRole = editRole;
		editRole = newEditRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__EDIT_ROLE, oldEditRole, editRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseCaptcha() {
		return useCaptcha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCaptcha(boolean newUseCaptcha) {
		boolean oldUseCaptcha = useCaptcha;
		useCaptcha = newUseCaptcha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA, oldUseCaptcha, useCaptcha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowRememberMe() {
		return allowRememberMe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowRememberMe(boolean newAllowRememberMe) {
		boolean oldAllowRememberMe = allowRememberMe;
		allowRememberMe = newAllowRememberMe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME, oldAllowRememberMe, allowRememberMe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowSelfRegistration() {
		return allowSelfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowSelfRegistration(boolean newAllowSelfRegistration) {
		boolean oldAllowSelfRegistration = allowSelfRegistration;
		allowSelfRegistration = newAllowSelfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION, oldAllowSelfRegistration, allowSelfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrackLoginAttempts() {
		return trackLoginAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackLoginAttempts(boolean newTrackLoginAttempts) {
		boolean oldTrackLoginAttempts = trackLoginAttempts;
		trackLoginAttempts = newTrackLoginAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS, oldTrackLoginAttempts, trackLoginAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseEmailActivation() {
		return useEmailActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseEmailActivation(boolean newUseEmailActivation) {
		boolean oldUseEmailActivation = useEmailActivation;
		useEmailActivation = newUseEmailActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION, oldUseEmailActivation, useEmailActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendWelcomeEmail(boolean newSendWelcomeEmail) {
		boolean oldSendWelcomeEmail = sendWelcomeEmail;
		sendWelcomeEmail = newSendWelcomeEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL, oldSendWelcomeEmail, sendWelcomeEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL:
				if (resolve) return getAuthenticationModel();
				return basicGetAuthenticationModel();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_NAME:
				return getAuthenticationName();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return getAuthenticationKey();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				if (resolve) return getResetPasswordRequestModel();
				return basicGetResetPasswordRequestModel();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_NAME:
				return getResetPasswordRequestName();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				if (resolve) return getRegistrationUnit();
				return basicGetRegistrationUnit();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				if (resolve) return getLoginUnit();
				return basicGetLoginUnit();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT:
				if (resolve) return getLogoutUnit();
				return basicGetLogoutUnit();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				if (resolve) return getForgottenPasswordUnit();
				return basicGetForgottenPasswordUnit();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT:
				if (resolve) return getResetPasswordUnit();
				return basicGetResetPasswordUnit();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__VIEW_ROLE:
				return getViewRole();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__EDIT_ROLE:
				return getEditRole();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				return isUseCaptcha();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				return isAllowRememberMe();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return isAllowSelfRegistration();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
				return isTrackLoginAttempts();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return isUseEmailActivation();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return isSendWelcomeEmail();
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL:
				setAuthenticationModel((Entity)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_NAME:
				setAuthenticationName((String)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey((AuthenticationKeyTypes)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				setResetPasswordRequestModel((Entity)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_NAME:
				setResetPasswordRequestName((String)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				setRegistrationUnit((SecurityUnit)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				setLoginUnit((SecurityUnit)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT:
				setLogoutUnit((SecurityUnit)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				setForgottenPasswordUnit((SecurityUnit)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT:
				setResetPasswordUnit((SecurityUnit)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__VIEW_ROLE:
				setViewRole((String)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__EDIT_ROLE:
				setEditRole((String)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				setUseCaptcha((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				setAllowRememberMe((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
				setTrackLoginAttempts((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail((Boolean)newValue);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL:
				setAuthenticationModel((Entity)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_NAME:
				setAuthenticationName(AUTHENTICATION_NAME_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey(AUTHENTICATION_KEY_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				setResetPasswordRequestModel((Entity)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_NAME:
				setResetPasswordRequestName(RESET_PASSWORD_REQUEST_NAME_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				setRegistrationUnit((SecurityUnit)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				setLoginUnit((SecurityUnit)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT:
				setLogoutUnit((SecurityUnit)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				setForgottenPasswordUnit((SecurityUnit)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT:
				setResetPasswordUnit((SecurityUnit)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__VIEW_ROLE:
				setViewRole(VIEW_ROLE_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__EDIT_ROLE:
				setEditRole(EDIT_ROLE_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				setUseCaptcha(USE_CAPTCHA_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				setAllowRememberMe(ALLOW_REMEMBER_ME_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration(ALLOW_SELF_REGISTRATION_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
				setTrackLoginAttempts(TRACK_LOGIN_ATTEMPTS_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation(USE_EMAIL_ACTIVATION_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail(SEND_WELCOME_EMAIL_EDEFAULT);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL:
				return authenticationModel != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_NAME:
				return AUTHENTICATION_NAME_EDEFAULT == null ? authenticationName != null : !AUTHENTICATION_NAME_EDEFAULT.equals(authenticationName);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return authenticationKey != AUTHENTICATION_KEY_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				return resetPasswordRequestModel != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_NAME:
				return RESET_PASSWORD_REQUEST_NAME_EDEFAULT == null ? resetPasswordRequestName != null : !RESET_PASSWORD_REQUEST_NAME_EDEFAULT.equals(resetPasswordRequestName);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				return registrationUnit != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				return loginUnit != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT:
				return logoutUnit != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				return forgottenPasswordUnit != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT:
				return resetPasswordUnit != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__VIEW_ROLE:
				return VIEW_ROLE_EDEFAULT == null ? viewRole != null : !VIEW_ROLE_EDEFAULT.equals(viewRole);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__EDIT_ROLE:
				return EDIT_ROLE_EDEFAULT == null ? editRole != null : !EDIT_ROLE_EDEFAULT.equals(editRole);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				return useCaptcha != USE_CAPTCHA_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				return allowRememberMe != ALLOW_REMEMBER_ME_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return allowSelfRegistration != ALLOW_SELF_REGISTRATION_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS:
				return trackLoginAttempts != TRACK_LOGIN_ATTEMPTS_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return useEmailActivation != USE_EMAIL_ACTIVATION_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return sendWelcomeEmail != SEND_WELCOME_EMAIL_EDEFAULT;
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
		result.append(" (authenticationName: ");
		result.append(authenticationName);
		result.append(", authenticationKey: ");
		result.append(authenticationKey);
		result.append(", resetPasswordRequestName: ");
		result.append(resetPasswordRequestName);
		result.append(", viewRole: ");
		result.append(viewRole);
		result.append(", editRole: ");
		result.append(editRole);
		result.append(", useCaptcha: ");
		result.append(useCaptcha);
		result.append(", allowRememberMe: ");
		result.append(allowRememberMe);
		result.append(", allowSelfRegistration: ");
		result.append(allowSelfRegistration);
		result.append(", trackLoginAttempts: ");
		result.append(trackLoginAttempts);
		result.append(", useEmailActivation: ");
		result.append(useEmailActivation);
		result.append(", sendWelcomeEmail: ");
		result.append(sendWelcomeEmail);
		result.append(')');
		return result.toString();
	}

} //LocalAuthenticationSystemImpl
