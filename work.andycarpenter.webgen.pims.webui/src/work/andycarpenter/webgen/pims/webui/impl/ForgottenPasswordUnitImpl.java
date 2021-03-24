/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forgotten Password Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getUriEmailSent <em>Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getUriResetPassword <em>Uri Reset Password</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getEmailSubject <em>Email Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForgottenPasswordUnitImpl extends EditUnitImpl implements ForgottenPasswordUnit {
	/**
	 * The default value of the '{@link #getUriEmailSent() <em>Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriEmailSent()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EMAIL_SENT_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getUriEmailSent() <em>Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriEmailSent()
	 * @generated
	 * @ordered
	 */
	protected String uriEmailSent = URI_EMAIL_SENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getUriResetPassword() <em>Uri Reset Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriResetPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_RESET_PASSWORD_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getUriResetPassword() <em>Uri Reset Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriResetPassword()
	 * @generated
	 * @ordered
	 */
	protected String uriResetPassword = URI_RESET_PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getEmailSubject() <em>Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SUBJECT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmailSubject() <em>Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSubject()
	 * @generated
	 * @ordered
	 */
	protected String emailSubject = EMAIL_SUBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForgottenPasswordUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriEmailSent() {
		return uriEmailSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriEmailSent(String newUriEmailSent) {
		String oldUriEmailSent = uriEmailSent;
		uriEmailSent = newUriEmailSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT, oldUriEmailSent, uriEmailSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriResetPassword() {
		return uriResetPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriResetPassword(String newUriResetPassword) {
		String oldUriResetPassword = uriResetPassword;
		uriResetPassword = newUriResetPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_RESET_PASSWORD, oldUriResetPassword, uriResetPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailSubject() {
		return emailSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailSubject(String newEmailSubject) {
		String oldEmailSubject = emailSubject;
		emailSubject = newEmailSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT, oldEmailSubject, emailSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
				return getUriEmailSent();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_RESET_PASSWORD:
				return getUriResetPassword();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
				return getEmailSubject();
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
				setUriEmailSent((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_RESET_PASSWORD:
				setUriResetPassword((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
				setEmailSubject((String)newValue);
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
				setUriEmailSent(URI_EMAIL_SENT_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_RESET_PASSWORD:
				setUriResetPassword(URI_RESET_PASSWORD_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
				setEmailSubject(EMAIL_SUBJECT_EDEFAULT);
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
				return URI_EMAIL_SENT_EDEFAULT == null ? uriEmailSent != null : !URI_EMAIL_SENT_EDEFAULT.equals(uriEmailSent);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_RESET_PASSWORD:
				return URI_RESET_PASSWORD_EDEFAULT == null ? uriResetPassword != null : !URI_RESET_PASSWORD_EDEFAULT.equals(uriResetPassword);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
				return EMAIL_SUBJECT_EDEFAULT == null ? emailSubject != null : !EMAIL_SUBJECT_EDEFAULT.equals(emailSubject);
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
		result.append(" (uriEmailSent: ");
		result.append(uriEmailSent);
		result.append(", uriResetPassword: ");
		result.append(uriResetPassword);
		result.append(", emailSubject: ");
		result.append(emailSubject);
		result.append(')');
		return result.toString();
	}

} //ForgottenPasswordUnitImpl
