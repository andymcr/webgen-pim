/**
 */
package work.andycarpenter.webgen.pims.security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.security.CasAuthentication;
import work.andycarpenter.webgen.pims.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cas Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.CasAuthenticationImpl#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.impl.CasAuthenticationImpl#getLogoutLabel <em>Logout Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasAuthenticationImpl extends AuthenticationImpl implements CasAuthentication {
	/**
	 * The default value of the '{@link #getLoginLabel() <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_LABEL_EDEFAULT = "login";
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
	 * The default value of the '{@link #getLogoutLabel() <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGOUT_LABEL_EDEFAULT = "logout";
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.CAS_AUTHENTICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CAS_AUTHENTICATION__LOGIN_LABEL, oldLoginLabel, loginLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.CAS_AUTHENTICATION__LOGOUT_LABEL, oldLogoutLabel, logoutLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.CAS_AUTHENTICATION__LOGIN_LABEL:
				return getLoginLabel();
			case SecurityPackage.CAS_AUTHENTICATION__LOGOUT_LABEL:
				return getLogoutLabel();
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
			case SecurityPackage.CAS_AUTHENTICATION__LOGIN_LABEL:
				setLoginLabel((String)newValue);
				return;
			case SecurityPackage.CAS_AUTHENTICATION__LOGOUT_LABEL:
				setLogoutLabel((String)newValue);
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
			case SecurityPackage.CAS_AUTHENTICATION__LOGIN_LABEL:
				setLoginLabel(LOGIN_LABEL_EDEFAULT);
				return;
			case SecurityPackage.CAS_AUTHENTICATION__LOGOUT_LABEL:
				setLogoutLabel(LOGOUT_LABEL_EDEFAULT);
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
			case SecurityPackage.CAS_AUTHENTICATION__LOGIN_LABEL:
				return LOGIN_LABEL_EDEFAULT == null ? loginLabel != null : !LOGIN_LABEL_EDEFAULT.equals(loginLabel);
			case SecurityPackage.CAS_AUTHENTICATION__LOGOUT_LABEL:
				return LOGOUT_LABEL_EDEFAULT == null ? logoutLabel != null : !LOGOUT_LABEL_EDEFAULT.equals(logoutLabel);
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
		result.append(" (loginLabel: ");
		result.append(loginLabel);
		result.append(", logoutLabel: ");
		result.append(logoutLabel);
		result.append(')');
		return result.toString();
	}

} //CasAuthenticationImpl
