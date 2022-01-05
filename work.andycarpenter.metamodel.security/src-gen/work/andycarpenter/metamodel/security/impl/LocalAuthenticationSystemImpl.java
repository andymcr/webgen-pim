/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.metamodel.orm.Entity;

import work.andycarpenter.metamodel.security.AuthenticationKeyTypes;
import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.SecurityPackage;
import work.andycarpenter.metamodel.security.SecurityUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getAuthenticationModel <em>Authentication Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getResetPasswordRequestModel <em>Reset Password Request Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getLogoutUnit <em>Logout Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getResetPasswordUnit <em>Reset Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isAllowRememberMe <em>Allow Remember Me</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
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
	 * The default value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CAPTCHA_EDEFAULT = false;

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
	public AuthenticationKeyTypes getAuthenticationKey() {
		return authenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isUseCaptcha() {
		return useCaptcha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isAllowRememberMe() {
		return allowRememberMe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isAllowSelfRegistration() {
		return allowSelfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isUseEmailActivation() {
		return useEmailActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean isSendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return getAuthenticationKey();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				if (resolve) return getResetPasswordRequestModel();
				return basicGetResetPasswordRequestModel();
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				return isUseCaptcha();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				return isAllowRememberMe();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return isAllowSelfRegistration();
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey((AuthenticationKeyTypes)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				setResetPasswordRequestModel((Entity)newValue);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				setUseCaptcha((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				setAllowRememberMe((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration((Boolean)newValue);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey(AUTHENTICATION_KEY_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				setResetPasswordRequestModel((Entity)null);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				setUseCaptcha(USE_CAPTCHA_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				setAllowRememberMe(ALLOW_REMEMBER_ME_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration(ALLOW_SELF_REGISTRATION_EDEFAULT);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return authenticationKey != AUTHENTICATION_KEY_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				return resetPasswordRequestModel != null;
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				return useCaptcha != USE_CAPTCHA_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				return allowRememberMe != ALLOW_REMEMBER_ME_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return allowSelfRegistration != ALLOW_SELF_REGISTRATION_EDEFAULT;
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
		result.append(" (authenticationKey: ");
		result.append(authenticationKey);
		result.append(", useCaptcha: ");
		result.append(useCaptcha);
		result.append(", allowRememberMe: ");
		result.append(allowRememberMe);
		result.append(", allowSelfRegistration: ");
		result.append(allowSelfRegistration);
		result.append(", useEmailActivation: ");
		result.append(useEmailActivation);
		result.append(", sendWelcomeEmail: ");
		result.append(sendWelcomeEmail);
		result.append(')');
		return result.toString();
	}

} //LocalAuthenticationSystemImpl
