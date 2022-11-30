/**
 */
package work.andycarpenter.webgen.pims.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.SubDirectory#getCharactersPerDirectory <em>Characters Per Directory</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.SubDirectory#getDirectoryCount <em>Directory Count</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSubDirectory()
 * @model
 * @generated
 */
public interface SubDirectory extends DirectoryNamer {
	/**
	 * Returns the value of the '<em><b>Characters Per Directory</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characters Per Directory</em>' attribute.
	 * @see #setCharactersPerDirectory(int)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSubDirectory_CharactersPerDirectory()
	 * @model default="2"
	 * @generated
	 */
	int getCharactersPerDirectory();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.SubDirectory#getCharactersPerDirectory <em>Characters Per Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characters Per Directory</em>' attribute.
	 * @see #getCharactersPerDirectory()
	 * @generated
	 */
	void setCharactersPerDirectory(int value);

	/**
	 * Returns the value of the '<em><b>Directory Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Count</em>' attribute.
	 * @see #setDirectoryCount(int)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSubDirectory_DirectoryCount()
	 * @model default="1"
	 * @generated
	 */
	int getDirectoryCount();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.SubDirectory#getDirectoryCount <em>Directory Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Count</em>' attribute.
	 * @see #getDirectoryCount()
	 * @generated
	 */
	void setDirectoryCount(int value);

} // SubDirectory
