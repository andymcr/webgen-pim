/**
 */
package work.andycarpenter.webgen.pims.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.PropertyDirectory#getAttribte <em>Attribte</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getPropertyDirectory()
 * @model
 * @generated
 */
public interface PropertyDirectory extends DirectoryNamer {
	/**
	 * Returns the value of the '<em><b>Attribte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribte</em>' reference.
	 * @see #setAttribte(Attribute)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getPropertyDirectory_Attribte()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribte();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.PropertyDirectory#getAttribte <em>Attribte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribte</em>' reference.
	 * @see #getAttribte()
	 * @generated
	 */
	void setAttribte(Attribute value);

} // PropertyDirectory
