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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.LocalAuthenticationSystemImpl#getAuthenticationKey <em>Authentication Key</em>}</li>
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
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected Entity authentication;

	/**
	 * The default value of the '{@link #getAuthenticationKey() <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationKeyTypes AUTHENTICATION_KEY_EDEFAULT = AuthenticationKeyTypes.EMAIL;

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
	public Entity getAuthentication() {
		if (authentication != null && authentication.eIsProxy()) {
			InternalEObject oldAuthentication = (InternalEObject)authentication;
			authentication = (Entity)eResolveProxy(oldAuthentication);
			if (authentication != oldAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION, oldAuthentication, authentication));
			}
		}
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthentication(Entity newAuthentication) {
		Entity oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION, oldAuthentication, authentication));
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				if (resolve) return getAuthentication();
				return basicGetAuthentication();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return getAuthenticationKey();
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				setAuthentication((Entity)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey((AuthenticationKeyTypes)newValue);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				setAuthentication((Entity)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey(AUTHENTICATION_KEY_EDEFAULT);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				return authentication != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return authenticationKey != AUTHENTICATION_KEY_EDEFAULT;
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
		result.append(" (authenticationKey: ");
		result.append(authenticationKey);
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
