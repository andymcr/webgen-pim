/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UpdateUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UpdateUnit#isDisplayEmptyForm <em>Display Empty Form</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUpdateUnit()
 * @model
 * @generated
 */
public interface UpdateUnit extends EditUnit, SelectableUnit {
	/**
	 * Returns the value of the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Save Continue Editing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Save Continue Editing</em>' attribute.
	 * @see #setOnSaveContinueEditing(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUpdateUnit_OnSaveContinueEditing()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOnSaveContinueEditing();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UpdateUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Save Continue Editing</em>' attribute.
	 * @see #isOnSaveContinueEditing()
	 * @generated
	 */
	void setOnSaveContinueEditing(boolean value);

	/**
	 * Returns the value of the '<em><b>Display Empty Form</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Empty Form</em>' attribute.
	 * @see #setDisplayEmptyForm(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUpdateUnit_DisplayEmptyForm()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isDisplayEmptyForm();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UpdateUnit#isDisplayEmptyForm <em>Display Empty Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Empty Form</em>' attribute.
	 * @see #isDisplayEmptyForm()
	 * @generated
	 */
	void setDisplayEmptyForm(boolean value);

} // UpdateUnit
