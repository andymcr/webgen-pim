/**
 */
package work.andycarpenter.webgen.pims.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hash Namer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.HashNamer#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.HashNamer#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getHashNamer()
 * @model
 * @generated
 */
public interface HashNamer extends FileNamer {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * The default value is <code>"sha1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getHashNamer_Algorithm()
	 * @model default="sha1"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.HashNamer#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getHashNamer_Length()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.HashNamer#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // HashNamer
