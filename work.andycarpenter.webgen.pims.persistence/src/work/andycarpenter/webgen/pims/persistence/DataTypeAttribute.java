/**
 */
package work.andycarpenter.webgen.pims.persistence;

import work.andycarpenter.webgen.pims.base.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isCaseInsensitive <em>Case Insensitive</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isEncrypt <em>Encrypt</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getDataTypeAttribute()
 * @model
 * @generated
 */
public interface DataTypeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getDataTypeAttribute_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obfuscate Form Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #setObfuscateFormFields(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getDataTypeAttribute_ObfuscateFormFields()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isObfuscateFormFields();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #isObfuscateFormFields()
	 * @generated
	 */
	void setObfuscateFormFields(boolean value);

	/**
	 * Returns the value of the '<em><b>Case Insensitive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Insensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Insensitive</em>' attribute.
	 * @see #setCaseInsensitive(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getDataTypeAttribute_CaseInsensitive()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isCaseInsensitive();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isCaseInsensitive <em>Case Insensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Insensitive</em>' attribute.
	 * @see #isCaseInsensitive()
	 * @generated
	 */
	void setCaseInsensitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Encrypt</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypt</em>' attribute.
	 * @see #setEncrypt(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getDataTypeAttribute_Encrypt()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isEncrypt();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isEncrypt <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt</em>' attribute.
	 * @see #isEncrypt()
	 * @generated
	 */
	void setEncrypt(boolean value);

} // DataTypeAttribute
