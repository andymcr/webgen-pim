/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.DateDetails;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DateField#getDetails <em>Details</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DateField#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDateField()
 * @model
 * @generated
 */
public interface DateField extends InterfaceField {
	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * The default value is <code>"DateOnly"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.persistence.DateDetails}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.DateDetails
	 * @see #setDetails(DateDetails)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDateField_Details()
	 * @model default="DateOnly" required="true" ordered="false"
	 * @generated
	 */
	DateDetails getDetails();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DateField#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.DateDetails
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(DateDetails value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDateField_Format()
	 * @model ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DateField#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // DateField
