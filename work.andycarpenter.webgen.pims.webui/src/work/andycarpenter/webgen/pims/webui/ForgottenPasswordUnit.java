/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.security.SecurityUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forgotten Password Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getResetPasswordUnit <em>Reset Password Unit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getUriEmailSent <em>Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSubject <em>Email Subject</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailMessage <em>Email Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSentCaption <em>Email Sent Caption</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSentMessage <em>Email Sent Message</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit()
 * @model
 * @generated
 */
public interface ForgottenPasswordUnit extends EditUnit, SecurityUnit {

	/**
	 * Returns the value of the '<em><b>Reset Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Password Unit</em>' reference.
	 * @see #setResetPasswordUnit(ResetPasswordUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit_ResetPasswordUnit()
	 * @model required="true"
	 * @generated
	 */
	ResetPasswordUnit getResetPasswordUnit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getResetPasswordUnit <em>Reset Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Password Unit</em>' reference.
	 * @see #getResetPasswordUnit()
	 * @generated
	 */
	void setResetPasswordUnit(ResetPasswordUnit value);

	/**
	 * Returns the value of the '<em><b>Uri Email Sent</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Email Sent</em>' attribute.
	 * @see #setUriEmailSent(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit_UriEmailSent()
	 * @model default="" required="true"
	 * @generated
	 */
	String getUriEmailSent();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getUriEmailSent <em>Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Email Sent</em>' attribute.
	 * @see #getUriEmailSent()
	 * @generated
	 */
	void setUriEmailSent(String value);

	/**
	 * Returns the value of the '<em><b>Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Subject</em>' attribute.
	 * @see #setEmailSubject(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit_EmailSubject()
	 * @model required="true"
	 * @generated
	 */
	String getEmailSubject();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSubject <em>Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Subject</em>' attribute.
	 * @see #getEmailSubject()
	 * @generated
	 */
	void setEmailSubject(String value);

	/**
	 * Returns the value of the '<em><b>Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Message</em>' attribute.
	 * @see #setEmailMessage(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit_EmailMessage()
	 * @model required="true"
	 * @generated
	 */
	String getEmailMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailMessage <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Message</em>' attribute.
	 * @see #getEmailMessage()
	 * @generated
	 */
	void setEmailMessage(String value);

	/**
	 * Returns the value of the '<em><b>Email Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Sent Caption</em>' attribute.
	 * @see #setEmailSentCaption(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit_EmailSentCaption()
	 * @model required="true"
	 * @generated
	 */
	String getEmailSentCaption();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSentCaption <em>Email Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Sent Caption</em>' attribute.
	 * @see #getEmailSentCaption()
	 * @generated
	 */
	void setEmailSentCaption(String value);

	/**
	 * Returns the value of the '<em><b>Email Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Sent Message</em>' attribute.
	 * @see #setEmailSentMessage(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit_EmailSentMessage()
	 * @model required="true"
	 * @generated
	 */
	String getEmailSentMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSentMessage <em>Email Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Sent Message</em>' attribute.
	 * @see #getEmailSentMessage()
	 * @generated
	 */
	void setEmailSentMessage(String value);
} // ForgottenPasswordUnit
