/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit;
import work.andycarpenter.webgen.pims.webui.ResetPasswordUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forgotten Password Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getResetPasswordUnit <em>Reset Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getUriEmailSent <em>Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getEmailSubject <em>Email Subject</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getEmailMessage <em>Email Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getEmailSentCaption <em>Email Sent Caption</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl#getEmailSentMessage <em>Email Sent Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForgottenPasswordUnitImpl extends EditUnitImpl implements ForgottenPasswordUnit {
	/**
	 * The cached value of the '{@link #getResetPasswordUnit() <em>Reset Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPasswordUnit()
	 * @generated
	 * @ordered
	 */
	protected ResetPasswordUnit resetPasswordUnit;
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
	 * The default value of the '{@link #getEmailMessage() <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmailMessage() <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailMessage()
	 * @generated
	 * @ordered
	 */
	protected String emailMessage = EMAIL_MESSAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getEmailSentCaption() <em>Email Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSentCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SENT_CAPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmailSentCaption() <em>Email Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSentCaption()
	 * @generated
	 * @ordered
	 */
	protected String emailSentCaption = EMAIL_SENT_CAPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getEmailSentMessage() <em>Email Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSentMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SENT_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmailSentMessage() <em>Email Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSentMessage()
	 * @generated
	 * @ordered
	 */
	protected String emailSentMessage = EMAIL_SENT_MESSAGE_EDEFAULT;

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
	public ResetPasswordUnit getResetPasswordUnit() {
		if (resetPasswordUnit != null && resetPasswordUnit.eIsProxy()) {
			InternalEObject oldResetPasswordUnit = (InternalEObject)resetPasswordUnit;
			resetPasswordUnit = (ResetPasswordUnit)eResolveProxy(oldResetPasswordUnit);
			if (resetPasswordUnit != oldResetPasswordUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT, oldResetPasswordUnit, resetPasswordUnit));
			}
		}
		return resetPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetPasswordUnit basicGetResetPasswordUnit() {
		return resetPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetPasswordUnit(ResetPasswordUnit newResetPasswordUnit) {
		ResetPasswordUnit oldResetPasswordUnit = resetPasswordUnit;
		resetPasswordUnit = newResetPasswordUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT, oldResetPasswordUnit, resetPasswordUnit));
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
	public String getEmailMessage() {
		return emailMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailMessage(String newEmailMessage) {
		String oldEmailMessage = emailMessage;
		emailMessage = newEmailMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE, oldEmailMessage, emailMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailSentCaption() {
		return emailSentCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailSentCaption(String newEmailSentCaption) {
		String oldEmailSentCaption = emailSentCaption;
		emailSentCaption = newEmailSentCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION, oldEmailSentCaption, emailSentCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailSentMessage() {
		return emailSentMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailSentMessage(String newEmailSentMessage) {
		String oldEmailSentMessage = emailSentMessage;
		emailSentMessage = newEmailSentMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE, oldEmailSentMessage, emailSentMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT:
				if (resolve) return getResetPasswordUnit();
				return basicGetResetPasswordUnit();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
				return getUriEmailSent();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
				return getEmailSubject();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE:
				return getEmailMessage();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION:
				return getEmailSentCaption();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE:
				return getEmailSentMessage();
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT:
				setResetPasswordUnit((ResetPasswordUnit)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
				setUriEmailSent((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
				setEmailSubject((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE:
				setEmailMessage((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION:
				setEmailSentCaption((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE:
				setEmailSentMessage((String)newValue);
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT:
				setResetPasswordUnit((ResetPasswordUnit)null);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
				setUriEmailSent(URI_EMAIL_SENT_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
				setEmailSubject(EMAIL_SUBJECT_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE:
				setEmailMessage(EMAIL_MESSAGE_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION:
				setEmailSentCaption(EMAIL_SENT_CAPTION_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE:
				setEmailSentMessage(EMAIL_SENT_MESSAGE_EDEFAULT);
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT:
				return resetPasswordUnit != null;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
				return URI_EMAIL_SENT_EDEFAULT == null ? uriEmailSent != null : !URI_EMAIL_SENT_EDEFAULT.equals(uriEmailSent);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
				return EMAIL_SUBJECT_EDEFAULT == null ? emailSubject != null : !EMAIL_SUBJECT_EDEFAULT.equals(emailSubject);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE:
				return EMAIL_MESSAGE_EDEFAULT == null ? emailMessage != null : !EMAIL_MESSAGE_EDEFAULT.equals(emailMessage);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION:
				return EMAIL_SENT_CAPTION_EDEFAULT == null ? emailSentCaption != null : !EMAIL_SENT_CAPTION_EDEFAULT.equals(emailSentCaption);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE:
				return EMAIL_SENT_MESSAGE_EDEFAULT == null ? emailSentMessage != null : !EMAIL_SENT_MESSAGE_EDEFAULT.equals(emailSentMessage);
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
		result.append(", emailSubject: ");
		result.append(emailSubject);
		result.append(", emailMessage: ");
		result.append(emailMessage);
		result.append(", emailSentCaption: ");
		result.append(emailSentCaption);
		result.append(", emailSentMessage: ");
		result.append(emailSentMessage);
		result.append(')');
		return result.toString();
	}

} //ForgottenPasswordUnitImpl
