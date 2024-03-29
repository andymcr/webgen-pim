/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getUpdateUriElement <em>Update Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCreateUpdateUnit()
 * @model
 * @generated
 */
public interface CreateUpdateUnit extends EditUnit, SelectableUnit {
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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCreateUpdateUnit_OnSaveContinueEditing()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOnSaveContinueEditing();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Save Continue Editing</em>' attribute.
	 * @see #isOnSaveContinueEditing()
	 * @generated
	 */
	void setOnSaveContinueEditing(boolean value);

	/**
	 * Returns the value of the '<em><b>Update Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Uri Element</em>' attribute.
	 * @see #setUpdateUriElement(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCreateUpdateUnit_UpdateUriElement()
	 * @model default=""
	 * @generated
	 */
	String getUpdateUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getUpdateUriElement <em>Update Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Uri Element</em>' attribute.
	 * @see #getUpdateUriElement()
	 * @generated
	 */
	void setUpdateUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Clear Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Label</em>' attribute.
	 * @see #setClearLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCreateUpdateUnit_ClearLabel()
	 * @model
	 * @generated
	 */
	String getClearLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Label</em>' attribute.
	 * @see #getClearLabel()
	 * @generated
	 */
	void setClearLabel(String value);

} // CreateUpdateUnit
