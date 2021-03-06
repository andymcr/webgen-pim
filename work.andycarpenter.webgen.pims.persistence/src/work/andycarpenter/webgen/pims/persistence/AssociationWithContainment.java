/**
 */
package work.andycarpenter.webgen.pims.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association With Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationWithContainment#isSourceVisible <em>Source Visible</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationWithContainment()
 * @model
 * @generated
 */
public interface AssociationWithContainment extends Association {
	/**
	 * Returns the value of the '<em><b>Source Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Visible</em>' attribute.
	 * @see #setSourceVisible(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationWithContainment_SourceVisible()
	 * @model default="true"
	 * @generated
	 */
	boolean isSourceVisible();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithContainment#isSourceVisible <em>Source Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Visible</em>' attribute.
	 * @see #isSourceVisible()
	 * @generated
	 */
	void setSourceVisible(boolean value);

} // AssociationWithContainment
