/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getKeys <em>Keys</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#isUnique <em>Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetFeatureName <em>Target Feature Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#isTargetPrimaryKey <em>Target Primary Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetColumnName <em>Target Column Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetDisplayLabel <em>Target Display Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetHeaderClass <em>Target Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetInputClass <em>Target Input Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetDisplayClass <em>Target Display Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetFooterClass <em>Target Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#isPseudo <em>Pseudo</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Association#getSerializationMaxDepth <em>Serialization Max Depth</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation()
 * @model abstract="true"
 * @generated
 */
public interface Association extends Feature {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.AssociationKey}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getKeyFor <em>Key For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_Keys()
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationKey#getKeyFor
	 * @model opposite="keyFor" containment="true"
	 * @generated
	 */
	EList<AssociationKey> getKeys();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAssociationEnds <em>Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see #setTargetEntity(Entity)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetEntity()
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAssociationEnds
	 * @model opposite="associationEnds" required="true"
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetEntity <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' reference.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_Bidirectional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_Unique()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pivot Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pivot Table Name</em>' attribute.
	 * @see #setPivotTableName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_PivotTableName()
	 * @model
	 * @generated
	 */
	String getPivotTableName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getPivotTableName <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pivot Table Name</em>' attribute.
	 * @see #getPivotTableName()
	 * @generated
	 */
	void setPivotTableName(String value);

	/**
	 * Returns the value of the '<em><b>Target Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature Name</em>' attribute.
	 * @see #setTargetFeatureName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetFeatureName()
	 * @model
	 * @generated
	 */
	String getTargetFeatureName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetFeatureName <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature Name</em>' attribute.
	 * @see #getTargetFeatureName()
	 * @generated
	 */
	void setTargetFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Target Primary Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Primary Key</em>' attribute.
	 * @see #setTargetPrimaryKey(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetPrimaryKey()
	 * @model default="false"
	 * @generated
	 */
	boolean isTargetPrimaryKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#isTargetPrimaryKey <em>Target Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Primary Key</em>' attribute.
	 * @see #isTargetPrimaryKey()
	 * @generated
	 */
	void setTargetPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Column Name</em>' attribute.
	 * @see #setTargetColumnName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetColumnName()
	 * @model
	 * @generated
	 */
	String getTargetColumnName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetColumnName <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Column Name</em>' attribute.
	 * @see #getTargetColumnName()
	 * @generated
	 */
	void setTargetColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Target Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Display Label</em>' attribute.
	 * @see #setTargetDisplayLabel(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetDisplayLabel()
	 * @model
	 * @generated
	 */
	String getTargetDisplayLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetDisplayLabel <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Display Label</em>' attribute.
	 * @see #getTargetDisplayLabel()
	 * @generated
	 */
	void setTargetDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Header Class</em>' attribute.
	 * @see #setTargetHeaderClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetHeaderClass()
	 * @model
	 * @generated
	 */
	String getTargetHeaderClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetHeaderClass <em>Target Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Header Class</em>' attribute.
	 * @see #getTargetHeaderClass()
	 * @generated
	 */
	void setTargetHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Input Class</b></em>' attribute.
	 * The default value is <code>"input_association"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Input Class</em>' attribute.
	 * @see #setTargetInputClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetInputClass()
	 * @model default="input_association"
	 * @generated
	 */
	String getTargetInputClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetInputClass <em>Target Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Input Class</em>' attribute.
	 * @see #getTargetInputClass()
	 * @generated
	 */
	void setTargetInputClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Display Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Display Class</em>' attribute.
	 * @see #setTargetDisplayClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetDisplayClass()
	 * @model
	 * @generated
	 */
	String getTargetDisplayClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetDisplayClass <em>Target Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Display Class</em>' attribute.
	 * @see #getTargetDisplayClass()
	 * @generated
	 */
	void setTargetDisplayClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Footer Class</em>' attribute.
	 * @see #setTargetFooterClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociation_TargetFooterClass()
	 * @model
	 * @generated
	 */
	String getTargetFooterClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetFooterClass <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Footer Class</em>' attribute.
	 * @see #getTargetFooterClass()
	 * @generated
	 */
	void setTargetFooterClass(String value);

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
