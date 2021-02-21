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
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getRegistrationName <em>Registration Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getRegistrationLabel <em>Registration Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getRegistrationUri <em>Registration Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getLoginName <em>Login Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getLoginUri <em>Login Uri</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getLogoutName <em>Logout Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getLogoutLabel <em>Logout Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.AuthenticationImpl#getLogoutUri <em>Logout Uri</em>}</li>
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
	 * The default value of the '{@link #getRegistrationName() <em>Registration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationName()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_NAME_EDEFAULT = "registration";

	/**
	 * The cached value of the '{@link #getRegistrationName() <em>Registration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationName()
	 * @generated
	 * @ordered
	 */
	protected String registrationName = REGISTRATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistrationLabel() <em>Registration Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_LABEL_EDEFAULT = "Register";

	/**
	 * The cached value of the '{@link #getRegistrationLabel() <em>Registration Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationLabel()
	 * @generated
	 * @ordered
	 */
	protected String registrationLabel = REGISTRATION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistrationUri() <em>Registration Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationUri()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_URI_EDEFAULT = "register";

	/**
	 * The cached value of the '{@link #getRegistrationUri() <em>Registration Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationUri()
	 * @generated
	 * @ordered
	 */
	protected String registrationUri = REGISTRATION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoginName() <em>Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_NAME_EDEFAULT = "login";

	/**
	 * The cached value of the '{@link #getLoginName() <em>Login Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginName()
	 * @generated
	 * @ordered
	 */
	protected String loginName = LOGIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoginLabel() <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_LABEL_EDEFAULT = "Login";

	/**
	 * The cached value of the '{@link #getLoginLabel() <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginLabel()
	 * @generated
	 * @ordered
	 */
	protected String loginLabel = LOGIN_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoginUri() <em>Login Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginUri()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_URI_EDEFAULT = "login";

	/**
	 * The cached value of the '{@link #getLoginUri() <em>Login Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginUri()
	 * @generated
	 * @ordered
	 */
	protected String loginUri = LOGIN_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoutName() <em>Logout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGOUT_NAME_EDEFAULT = "logout";

	/**
	 * The cached value of the '{@link #getLogoutName() <em>Logout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutName()
	 * @generated
	 * @ordered
	 */
	protected String logoutName = LOGOUT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoutLabel() <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGOUT_LABEL_EDEFAULT = "Logout";

	/**
	 * The cached value of the '{@link #getLogoutLabel() <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutLabel()
	 * @generated
	 * @ordered
	 */
	protected String logoutLabel = LOGOUT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoutUri() <em>Logout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutUri()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGOUT_URI_EDEFAULT = "logout";

	/**
	 * The cached value of the '{@link #getLogoutUri() <em>Logout Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutUri()
	 * @generated
	 * @ordered
	 */
	protected String logoutUri = LOGOUT_URI_EDEFAULT;

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
	public String getRegistrationName() {
		return registrationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistrationName(String newRegistrationName) {
		String oldRegistrationName = registrationName;
		registrationName = newRegistrationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__REGISTRATION_NAME, oldRegistrationName, registrationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistrationLabel() {
		return registrationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistrationLabel(String newRegistrationLabel) {
		String oldRegistrationLabel = registrationLabel;
		registrationLabel = newRegistrationLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__REGISTRATION_LABEL, oldRegistrationLabel, registrationLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistrationUri() {
		return registrationUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistrationUri(String newRegistrationUri) {
		String oldRegistrationUri = registrationUri;
		registrationUri = newRegistrationUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__REGISTRATION_URI, oldRegistrationUri, registrationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoginName() {
		return loginName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginName(String newLoginName) {
		String oldLoginName = loginName;
		loginName = newLoginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__LOGIN_NAME, oldLoginName, loginName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoginLabel() {
		return loginLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginLabel(String newLoginLabel) {
		String oldLoginLabel = loginLabel;
		loginLabel = newLoginLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__LOGIN_LABEL, oldLoginLabel, loginLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoginUri() {
		return loginUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginUri(String newLoginUri) {
		String oldLoginUri = loginUri;
		loginUri = newLoginUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__LOGIN_URI, oldLoginUri, loginUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogoutName() {
		return logoutName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoutName(String newLogoutName) {
		String oldLogoutName = logoutName;
		logoutName = newLogoutName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__LOGOUT_NAME, oldLogoutName, logoutName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogoutLabel() {
		return logoutLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoutLabel(String newLogoutLabel) {
		String oldLogoutLabel = logoutLabel;
		logoutLabel = newLogoutLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__LOGOUT_LABEL, oldLogoutLabel, logoutLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogoutUri() {
		return logoutUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoutUri(String newLogoutUri) {
		String oldLogoutUri = logoutUri;
		logoutUri = newLogoutUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__LOGOUT_URI, oldLogoutUri, logoutUri));
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
			case SecurityPackage.AUTHENTICATION__REGISTRATION_NAME:
				return getRegistrationName();
			case SecurityPackage.AUTHENTICATION__REGISTRATION_LABEL:
				return getRegistrationLabel();
			case SecurityPackage.AUTHENTICATION__REGISTRATION_URI:
				return getRegistrationUri();
			case SecurityPackage.AUTHENTICATION__LOGIN_NAME:
				return getLoginName();
			case SecurityPackage.AUTHENTICATION__LOGIN_LABEL:
				return getLoginLabel();
			case SecurityPackage.AUTHENTICATION__LOGIN_URI:
				return getLoginUri();
			case SecurityPackage.AUTHENTICATION__LOGOUT_NAME:
				return getLogoutName();
			case SecurityPackage.AUTHENTICATION__LOGOUT_LABEL:
				return getLogoutLabel();
			case SecurityPackage.AUTHENTICATION__LOGOUT_URI:
				return getLogoutUri();
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
			case SecurityPackage.AUTHENTICATION__REGISTRATION_NAME:
				setRegistrationName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__REGISTRATION_LABEL:
				setRegistrationLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__REGISTRATION_URI:
				setRegistrationUri((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__LOGIN_NAME:
				setLoginName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__LOGIN_LABEL:
				setLoginLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__LOGIN_URI:
				setLoginUri((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__LOGOUT_NAME:
				setLogoutName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__LOGOUT_LABEL:
				setLogoutLabel((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__LOGOUT_URI:
				setLogoutUri((String)newValue);
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
			case SecurityPackage.AUTHENTICATION__REGISTRATION_NAME:
				setRegistrationName(REGISTRATION_NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__REGISTRATION_LABEL:
				setRegistrationLabel(REGISTRATION_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__REGISTRATION_URI:
				setRegistrationUri(REGISTRATION_URI_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__LOGIN_NAME:
				setLoginName(LOGIN_NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__LOGIN_LABEL:
				setLoginLabel(LOGIN_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__LOGIN_URI:
				setLoginUri(LOGIN_URI_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__LOGOUT_NAME:
				setLogoutName(LOGOUT_NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__LOGOUT_LABEL:
				setLogoutLabel(LOGOUT_LABEL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__LOGOUT_URI:
				setLogoutUri(LOGOUT_URI_EDEFAULT);
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
			case SecurityPackage.AUTHENTICATION__REGISTRATION_NAME:
				return REGISTRATION_NAME_EDEFAULT == null ? registrationName != null : !REGISTRATION_NAME_EDEFAULT.equals(registrationName);
			case SecurityPackage.AUTHENTICATION__REGISTRATION_LABEL:
				return REGISTRATION_LABEL_EDEFAULT == null ? registrationLabel != null : !REGISTRATION_LABEL_EDEFAULT.equals(registrationLabel);
			case SecurityPackage.AUTHENTICATION__REGISTRATION_URI:
				return REGISTRATION_URI_EDEFAULT == null ? registrationUri != null : !REGISTRATION_URI_EDEFAULT.equals(registrationUri);
			case SecurityPackage.AUTHENTICATION__LOGIN_NAME:
				return LOGIN_NAME_EDEFAULT == null ? loginName != null : !LOGIN_NAME_EDEFAULT.equals(loginName);
			case SecurityPackage.AUTHENTICATION__LOGIN_LABEL:
				return LOGIN_LABEL_EDEFAULT == null ? loginLabel != null : !LOGIN_LABEL_EDEFAULT.equals(loginLabel);
			case SecurityPackage.AUTHENTICATION__LOGIN_URI:
				return LOGIN_URI_EDEFAULT == null ? loginUri != null : !LOGIN_URI_EDEFAULT.equals(loginUri);
			case SecurityPackage.AUTHENTICATION__LOGOUT_NAME:
				return LOGOUT_NAME_EDEFAULT == null ? logoutName != null : !LOGOUT_NAME_EDEFAULT.equals(logoutName);
			case SecurityPackage.AUTHENTICATION__LOGOUT_LABEL:
				return LOGOUT_LABEL_EDEFAULT == null ? logoutLabel != null : !LOGOUT_LABEL_EDEFAULT.equals(logoutLabel);
			case SecurityPackage.AUTHENTICATION__LOGOUT_URI:
				return LOGOUT_URI_EDEFAULT == null ? logoutUri != null : !LOGOUT_URI_EDEFAULT.equals(logoutUri);
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
		result.append(" (registrationName: ");
		result.append(registrationName);
		result.append(", registrationLabel: ");
		result.append(registrationLabel);
		result.append(", registrationUri: ");
		result.append(registrationUri);
		result.append(", loginName: ");
		result.append(loginName);
		result.append(", loginLabel: ");
		result.append(loginLabel);
		result.append(", loginUri: ");
		result.append(loginUri);
		result.append(", logoutName: ");
		result.append(logoutName);
		result.append(", logoutLabel: ");
		result.append(logoutLabel);
		result.append(", logoutUri: ");
		result.append(logoutUri);
		result.append(')');
		return result.toString();
	}

} //AuthenticationImpl
