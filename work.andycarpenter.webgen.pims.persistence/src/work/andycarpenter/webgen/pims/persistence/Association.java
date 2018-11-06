/**
 */
package work.andycarpenter.webgen.pims.persistence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#isPseudo <em>Pseudo</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getSourceEntityX <em>Source Entity X</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetEntityX <em>Target Entity X</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getSerializationMaxDepth <em>Serialization Max Depth</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Association extends Feature {
	/**
	 * Returns the value of the '<em><b>Pseudo</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pseudo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudo</em>' attribute.
	 * @see #setPseudo(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_Pseudo()
	 * @model default="false"
	 * @generated
	 */
	boolean isPseudo();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#isPseudo <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo</em>' attribute.
	 * @see #isPseudo()
	 * @generated
	 */
	void setPseudo(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Class</em>' attribute.
	 * @see #setInputClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_InputClass()
	 * @model
	 * @generated
	 */
	String getInputClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getInputClass <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Class</em>' attribute.
	 * @see #getInputClass()
	 * @generated
	 */
	void setInputClass(String value);

	/**
	 * Returns the value of the '<em><b>Source Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity X</em>' reference.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_SourceEntityX()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsKindOf(EntityAssociation) then\n\tself.oclAsType(EntityAssociation).partOf\nelse\n\tnull\nendif'"
	 * @generated
	 */
	Entity getSourceEntityX();

	/**
	 * Returns the value of the '<em><b>Target Entity X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity X</em>' reference.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetEntityX()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsKindOf(EntityAssociation) then\n\tself.oclAsType(EntityAssociation).targetEntity\nelse\n\tnull\nendif'"
	 * @generated
	 */
	Entity getTargetEntityX();

	/**
	 * Returns the value of the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization Max Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialization Max Depth</em>' attribute.
	 * @see #setSerializationMaxDepth(int)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_SerializationMaxDepth()
	 * @model default="1"
	 * @generated
	 */
	int getSerializationMaxDepth();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getSerializationMaxDepth <em>Serialization Max Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialization Max Depth</em>' attribute.
	 * @see #getSerializationMaxDepth()
	 * @generated
	 */
	void setSerializationMaxDepth(int value);

} // Association
