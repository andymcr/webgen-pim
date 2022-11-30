/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getMaximumUploadSize <em>Maximum Upload Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getValidUploadExtensions <em>Valid Upload Extensions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getUriPrefix <em>Uri Prefix</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getBaseUploadDirectory <em>Base Upload Directory</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getDirectoryNamer <em>Directory Namer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getFileNamer <em>File Namer</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourceFeature()
 * @model abstract="true"
 * @generated
 */
public interface ResourceFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Upload Size</em>' attribute.
	 * @see #setMaximumUploadSize(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourceFeature_MaximumUploadSize()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	String getMaximumUploadSize();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getMaximumUploadSize <em>Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Upload Size</em>' attribute.
	 * @see #getMaximumUploadSize()
	 * @generated
	 */
	void setMaximumUploadSize(String value);

	/**
	 * Returns the value of the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Upload Mime Types</em>' attribute list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourceFeature_ValidUploadMimeTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getValidUploadMimeTypes();

	/**
	 * Returns the value of the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Upload Extensions</em>' attribute list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourceFeature_ValidUploadExtensions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getValidUploadExtensions();

	/**
	 * Returns the value of the '<em><b>Uri Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Prefix</em>' attribute.
	 * @see #setUriPrefix(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourceFeature_UriPrefix()
	 * @model ordered="false"
	 * @generated
	 */
	String getUriPrefix();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getUriPrefix <em>Uri Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Prefix</em>' attribute.
	 * @see #getUriPrefix()
	 * @generated
	 */
	void setUriPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Base Upload Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Upload Directory</em>' attribute.
	 * @see #setBaseUploadDirectory(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourceFeature_BaseUploadDirectory()
	 * @model required="true"
	 * @generated
	 */
	String getBaseUploadDirectory();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getBaseUploadDirectory <em>Base Upload Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Upload Directory</em>' attribute.
	 * @see #getBaseUploadDirectory()
	 * @generated
	 */
	void setBaseUploadDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Directory Namer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Namer</em>' containment reference.
	 * @see #setDirectoryNamer(DirectoryNamer)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourceFeature_DirectoryNamer()
	 * @model containment="true"
	 * @generated
	 */
	DirectoryNamer getDirectoryNamer();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getDirectoryNamer <em>Directory Namer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Namer</em>' containment reference.
	 * @see #getDirectoryNamer()
	 * @generated
	 */
	void setDirectoryNamer(DirectoryNamer value);

	/**
	 * Returns the value of the '<em><b>File Namer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Namer</em>' containment reference.
	 * @see #setFileNamer(FileNamer)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourceFeature_FileNamer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileNamer getFileNamer();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getFileNamer <em>File Namer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Namer</em>' containment reference.
	 * @see #getFileNamer()
	 * @generated
	 */
	void setFileNamer(FileNamer value);

} // ResourceFeature
