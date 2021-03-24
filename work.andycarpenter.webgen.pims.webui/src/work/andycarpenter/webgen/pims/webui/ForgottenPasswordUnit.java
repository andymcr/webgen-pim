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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getUriEmailSent <em>Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getUriResetPassword <em>Uri Reset Password</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSubject <em>Email Subject</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit()
 * @model
 * @generated
 */
public interface ForgottenPasswordUnit extends EditUnit, SecurityUnit {

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
	 * Returns the value of the '<em><b>Uri Reset Password</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Reset Password</em>' attribute.
	 * @see #setUriResetPassword(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getForgottenPasswordUnit_UriResetPassword()
	 * @model default="" required="true"
	 * @generated
	 */
	String getUriResetPassword();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getUriResetPassword <em>Uri Reset Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Reset Password</em>' attribute.
	 * @see #getUriResetPassword()
	 * @generated
	 */
	void setUriResetPassword(String value);

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
} // ForgottenPasswordUnit
