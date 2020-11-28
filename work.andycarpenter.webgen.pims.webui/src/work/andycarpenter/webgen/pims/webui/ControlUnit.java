/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getSubmitLabel <em>Submit Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getCancelLabel <em>Cancel Label</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getControlUnit()
 * @model abstract="true"
 * @generated
 */
public interface ControlUnit extends DynamicUnit {
	/**
	 * Returns the value of the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submit Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit Label</em>' attribute.
	 * @see #setSubmitLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getControlUnit_SubmitLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getSubmitLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getSubmitLabel <em>Submit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submit Label</em>' attribute.
	 * @see #getSubmitLabel()
	 * @generated
	 */
	void setSubmitLabel(String value);

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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getControlUnit_CancelDestination()
	 * @model ordered="false"
	 * @generated
	 */
	Page getCancelDestination();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getCancelDestination <em>Cancel Destination</em>}' reference.
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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getControlUnit_CancelLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getCancelLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getCancelLabel <em>Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Label</em>' attribute.
	 * @see #getCancelLabel()
	 * @generated
	 */
	void setCancelLabel(String value);

} // ControlUnit
