/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.expression.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getDisableWhen <em>Disable When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmDestination <em>Confirm Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelLabelOverride <em>Cancel Label Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelIconOverride <em>Cancel Icon Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getSaveLabelOverride <em>Save Label Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getSaveIconOverride <em>Save Icon Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getSuccessMessage <em>Success Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getUnitInputGroupClass <em>Unit Input Group Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit()
 * @model abstract="true"
 * @generated
 */
public interface EditUnit extends SingletonUnit {
	/**
	 * Returns the value of the '<em><b>Use Captcha</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Captcha</em>' attribute.
	 * @see #setUseCaptcha(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_UseCaptcha()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUseCaptcha();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#isUseCaptcha <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Captcha</em>' attribute.
	 * @see #isUseCaptcha()
	 * @generated
	 */
	void setUseCaptcha(boolean value);

	/**
	 * Returns the value of the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable When</em>' containment reference.
	 * @see #setDisableWhen(Predicate)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_DisableWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getDisableWhen();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getDisableWhen <em>Disable When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable When</em>' containment reference.
	 * @see #getDisableWhen()
	 * @generated
	 */
	void setDisableWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Destination</em>' reference.
	 * @see #setConfirmDestination(ContentUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_ConfirmDestination()
	 * @model
	 * @generated
	 */
	ContentUnit getConfirmDestination();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmDestination <em>Confirm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Destination</em>' reference.
	 * @see #getConfirmDestination()
	 * @generated
	 */
	void setConfirmDestination(ContentUnit value);

	/**
	 * Returns the value of the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Message</em>' containment reference.
	 * @see #setConfirmMessage(Message)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_ConfirmMessage()
	 * @model containment="true"
	 * @generated
	 */
	Message getConfirmMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmMessage <em>Confirm Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Message</em>' containment reference.
	 * @see #getConfirmMessage()
	 * @generated
	 */
	void setConfirmMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Message</em>' containment reference.
	 * @see #setSuccessMessage(Message)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_SuccessMessage()
	 * @model containment="true"
	 * @generated
	 */
	Message getSuccessMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getSuccessMessage <em>Success Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Message</em>' containment reference.
	 * @see #getSuccessMessage()
	 * @generated
	 */
	void setSuccessMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Destination</em>' reference.
	 * @see #setCancelDestination(ContentUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_CancelDestination()
	 * @model
	 * @generated
	 */
	ContentUnit getCancelDestination();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelDestination <em>Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Destination</em>' reference.
	 * @see #getCancelDestination()
	 * @generated
	 */
	void setCancelDestination(ContentUnit value);

	/**
	 * Returns the value of the '<em><b>Cancel Label Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Label Override</em>' attribute.
	 * @see #setCancelLabelOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_CancelLabelOverride()
	 * @model
	 * @generated
	 */
	String getCancelLabelOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelLabelOverride <em>Cancel Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Label Override</em>' attribute.
	 * @see #getCancelLabelOverride()
	 * @generated
	 */
	void setCancelLabelOverride(String value);

	/**
	 * Returns the value of the '<em><b>Cancel Icon Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Icon Override</em>' attribute.
	 * @see #setCancelIconOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_CancelIconOverride()
	 * @model
	 * @generated
	 */
	String getCancelIconOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelIconOverride <em>Cancel Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Icon Override</em>' attribute.
	 * @see #getCancelIconOverride()
	 * @generated
	 */
	void setCancelIconOverride(String value);

	/**
	 * Returns the value of the '<em><b>Save Label Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Label Override</em>' attribute.
	 * @see #setSaveLabelOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_SaveLabelOverride()
	 * @model
	 * @generated
	 */
	String getSaveLabelOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getSaveLabelOverride <em>Save Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Label Override</em>' attribute.
	 * @see #getSaveLabelOverride()
	 * @generated
	 */
	void setSaveLabelOverride(String value);

	/**
	 * Returns the value of the '<em><b>Save Icon Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Icon Override</em>' attribute.
	 * @see #setSaveIconOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_SaveIconOverride()
	 * @model
	 * @generated
	 */
	String getSaveIconOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getSaveIconOverride <em>Save Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Icon Override</em>' attribute.
	 * @see #getSaveIconOverride()
	 * @generated
	 */
	void setSaveIconOverride(String value);

	/**
	 * Returns the value of the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Input Group Class</em>' attribute.
	 * @see #setUnitInputGroupClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_UnitInputGroupClass()
	 * @model default=""
	 * @generated
	 */
	String getUnitInputGroupClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getUnitInputGroupClass <em>Unit Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Input Group Class</em>' attribute.
	 * @see #getUnitInputGroupClass()
	 * @generated
	 */
	void setUnitInputGroupClass(String value);

} // EditUnit
