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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getDisableWhen <em>Disable When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmDestination <em>Confirm Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getSuccessMessage <em>Success Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelLabel <em>Cancel Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#isCustomiseValues <em>Customise Values</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.EditUnit#getUnitInputGroupClass <em>Unit Input Group Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit()
 * @model abstract="true"
 * @generated
 */
public interface EditUnit extends SingletonUnit {
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
	 * @see #setConfirmDestination(Page)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_ConfirmDestination()
	 * @model ordered="false"
	 * @generated
	 */
	Page getConfirmDestination();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmDestination <em>Confirm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Destination</em>' reference.
	 * @see #getConfirmDestination()
	 * @generated
	 */
	void setConfirmDestination(Page value);

	/**
	 * Returns the value of the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Label</em>' attribute.
	 * @see #setConfirmLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_ConfirmLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getConfirmLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmLabel <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Label</em>' attribute.
	 * @see #getConfirmLabel()
	 * @generated
	 */
	void setConfirmLabel(String value);

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
	 * @see #setCancelDestination(Page)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_CancelDestination()
	 * @model ordered="false"
	 * @generated
	 */
	Page getCancelDestination();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelDestination <em>Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Destination</em>' reference.
	 * @see #getCancelDestination()
	 * @generated
	 */
	void setCancelDestination(Page value);

	/**
	 * Returns the value of the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Label</em>' attribute.
	 * @see #setCancelLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_CancelLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getCancelLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelLabel <em>Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Label</em>' attribute.
	 * @see #getCancelLabel()
	 * @generated
	 */
	void setCancelLabel(String value);

	/**
	 * Returns the value of the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customise Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customise Values</em>' attribute.
	 * @see #setCustomiseValues(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getEditUnit_CustomiseValues()
	 * @model
	 * @generated
	 */
	boolean isCustomiseValues();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.EditUnit#isCustomiseValues <em>Customise Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customise Values</em>' attribute.
	 * @see #isCustomiseValues()
	 * @generated
	 */
	void setCustomiseValues(boolean value);

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
