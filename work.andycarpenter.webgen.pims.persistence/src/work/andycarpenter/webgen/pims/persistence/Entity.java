/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.base.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAssociations <em>Associations</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAllFeatures <em>All Features</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAllAssociations <em>All Associations</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getKeys <em>Keys</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getLabels <em>Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getUnique <em>Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getContainerUnique <em>Container Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getTableName <em>Table Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyName <em>Auto Key Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#isImplementsUserInterface <em>Implements User Interface</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#isAllowFormTypeCustomisation <em>Allow Form Type Customisation</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='featureNameUniqueWithinEntity keysFromLocalFeatures'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL featureNameUniqueWithinEntity='features-&gt;isUnique(f | f.name)' keysFromLocalFeatures='allFeatures-&gt;includesAll(keys)'"
 * @generated
 */
public interface Entity extends Classifier {
	/**
	 * Returns the value of the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Name</em>' attribute.
	 * @see #setSingletonName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_SingletonName()
	 * @model
	 * @generated
	 */
	String getSingletonName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Entity#getSingletonName <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Name</em>' attribute.
	 * @see #getSingletonName()
	 * @generated
	 */
	void setSingletonName(String value);

	/**
	 * Returns the value of the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pluralised Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pluralised Name</em>' attribute.
	 * @see #setPluralisedName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_PluralisedName()
	 * @model
	 * @generated
	 */
	String getPluralisedName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Entity#getPluralisedName <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluralised Name</em>' attribute.
	 * @see #getPluralisedName()
	 * @generated
	 */
	void setPluralisedName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.EntityFeature}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_Features()
	 * @see work.andycarpenter.webgen.pims.persistence.EntityFeature#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<EntityFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_Keys()
	 * @model
	 * @generated
	 */
	EList<Feature> getKeys();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_Attributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='features-&gt;select(f | f.oclIsKindOf(Attribute)).oclAsType(Attribute)-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_Associations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='features-&gt;select(f | f.oclIsKindOf(Association)).oclAsType(Association)-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<Association> getAssociations();

	/**
	 * Returns the value of the '<em><b>Association Ends</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.EntityAssociation}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.EntityAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Ends</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_AssociationEnds()
	 * @see work.andycarpenter.webgen.pims.persistence.EntityAssociation#getTargetEntity
	 * @model opposite="targetEntity"
	 * @generated
	 */
	EList<EntityAssociation> getAssociationEnds();

	/**
	 * Returns the value of the '<em><b>All Features</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.EntityFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Features</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_AllFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='features-&gt;union(associationEnds-&gt;select(e | e.bidirectional))-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<EntityFeature> getAllFeatures();

	/**
	 * Returns the value of the '<em><b>All Associations</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Associations</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_AllAssociations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='allFeatures-&gt;select(f | f.oclIsKindOf(Association)).oclAsType(Association)-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<Association> getAllAssociations();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.ModelLabel}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_Labels()
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel#getLabelFor
	 * @model opposite="labelFor" containment="true"
	 * @generated
	 */
	EList<ModelLabel> getLabels();

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.EntityFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_Unique()
	 * @model
	 * @generated
	 */
	EList<EntityFeature> getUnique();

	/**
	 * Returns the value of the '<em><b>Container Unique</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.EntityFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Unique</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Unique</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_ContainerUnique()
	 * @model
	 * @generated
	 */
	EList<EntityFeature> getContainerUnique();

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Entity#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Auto Key Name</b></em>' attribute.
	 * The default value is <code>"id"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Key Name</em>' attribute.
	 * @see #setAutoKeyName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_AutoKeyName()
	 * @model default="id"
	 * @generated
	 */
	String getAutoKeyName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyName <em>Auto Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Key Name</em>' attribute.
	 * @see #getAutoKeyName()
	 * @generated
	 */
	void setAutoKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Auto Key Persistent Type</b></em>' attribute.
	 * The default value is <code>"integer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Key Persistent Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Key Persistent Type</em>' attribute.
	 * @see #setAutoKeyPersistentType(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_AutoKeyPersistentType()
	 * @model default="integer"
	 * @generated
	 */
	String getAutoKeyPersistentType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Key Persistent Type</em>' attribute.
	 * @see #getAutoKeyPersistentType()
	 * @generated
	 */
	void setAutoKeyPersistentType(String value);

	/**
	 * Returns the value of the '<em><b>Auto Key Generation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Key Generation Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Key Generation Strategy</em>' attribute.
	 * @see #setAutoKeyGenerationStrategy(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_AutoKeyGenerationStrategy()
	 * @model
	 * @generated
	 */
	String getAutoKeyGenerationStrategy();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Key Generation Strategy</em>' attribute.
	 * @see #getAutoKeyGenerationStrategy()
	 * @generated
	 */
	void setAutoKeyGenerationStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Implements User Interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements User Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements User Interface</em>' attribute.
	 * @see #setImplementsUserInterface(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_ImplementsUserInterface()
	 * @model default="false"
	 * @generated
	 */
	boolean isImplementsUserInterface();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Entity#isImplementsUserInterface <em>Implements User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements User Interface</em>' attribute.
	 * @see #isImplementsUserInterface()
	 * @generated
	 */
	void setImplementsUserInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Form Type Customisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Form Type Customisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Form Type Customisation</em>' attribute.
	 * @see #setAllowFormTypeCustomisation(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_AllowFormTypeCustomisation()
	 * @model
	 * @generated
	 */
	boolean isAllowFormTypeCustomisation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Entity#isAllowFormTypeCustomisation <em>Allow Form Type Customisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Form Type Customisation</em>' attribute.
	 * @see #isAllowFormTypeCustomisation()
	 * @generated
	 */
	void setAllowFormTypeCustomisation(boolean value);

} // Entity
