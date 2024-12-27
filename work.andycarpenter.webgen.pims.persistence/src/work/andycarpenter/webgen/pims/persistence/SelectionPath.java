/**
 */
package work.andycarpenter.webgen.pims.persistence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.SelectionPath#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelectionPath()
 * @model
 * @generated
 */
public interface SelectionPath extends AssociationPathElement {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Selection#getSelectPath <em>Select Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' container reference.
	 * @see #setSelection(Selection)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelectionPath_Selection()
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getSelectPath
	 * @model opposite="selectPath" required="true" transient="false"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.SelectionPath#getSelection <em>Selection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' container reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

} // SelectionPath
