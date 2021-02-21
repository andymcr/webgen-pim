/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isDerived <em>Derived</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isCustomiseSet <em>Customise Set</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowAdd <em>Collection Orm Allow Add</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowRemove <em>Collection Orm Allow Remove</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getDefaultDisplayValue <em>Default Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getEmptyDisplayValue <em>Empty Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getSerializationGroups <em>Serialization Groups</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='primaryKeyRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL primaryKeyRequired='primaryKey implies cardinality &lt;&gt; Cardinality::Optional'"
 * @generated
 */
public interface Feature extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Entity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(Entity)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_PartOf()
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	Entity getPartOf();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Entity value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"Optional"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.persistence.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_Cardinality()
	 * @model default="Optional" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_Ordered()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_Derived()
	 * @model default="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Customise Set</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customise Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customise Set</em>' attribute.
	 * @see #setCustomiseSet(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_CustomiseSet()
	 * @model default="false"
	 * @generated
	 */
	boolean isCustomiseSet();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#isCustomiseSet <em>Customise Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customise Set</em>' attribute.
	 * @see #isCustomiseSet()
	 * @generated
	 */
	void setCustomiseSet(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.persistence.isHasChoices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Is Has Choice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Is Has Choice</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.isHasChoices
	 * @see #setBooleanIsHasChoice(isHasChoices)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_BooleanIsHasChoice()
	 * @model
	 * @generated
	 */
	isHasChoices getBooleanIsHasChoice();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Is Has Choice</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.isHasChoices
	 * @see #getBooleanIsHasChoice()
	 * @generated
	 */
	void setBooleanIsHasChoice(isHasChoices value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_Title()
	 * @model default=""
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Orm Allow Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Orm Allow Add</em>' attribute.
	 * @see #setCollectionOrmAllowAdd(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_CollectionOrmAllowAdd()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollectionOrmAllowAdd();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowAdd <em>Collection Orm Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Orm Allow Add</em>' attribute.
	 * @see #isCollectionOrmAllowAdd()
	 * @generated
	 */
	void setCollectionOrmAllowAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Orm Allow Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Orm Allow Remove</em>' attribute.
	 * @see #setCollectionOrmAllowRemove(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_CollectionOrmAllowRemove()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollectionOrmAllowRemove();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowRemove <em>Collection Orm Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Orm Allow Remove</em>' attribute.
	 * @see #isCollectionOrmAllowRemove()
	 * @generated
	 */
	void setCollectionOrmAllowRemove(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Display Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Display Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Display Value</em>' attribute.
	 * @see #setDefaultDisplayValue(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_DefaultDisplayValue()
	 * @model default=""
	 * @generated
	 */
	String getDefaultDisplayValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getDefaultDisplayValue <em>Default Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Display Value</em>' attribute.
	 * @see #getDefaultDisplayValue()
	 * @generated
	 */
	void setDefaultDisplayValue(String value);

	/**
	 * Returns the value of the '<em><b>Empty Display Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Display Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Display Value</em>' attribute.
	 * @see #setEmptyDisplayValue(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_EmptyDisplayValue()
	 * @model default=""
	 * @generated
	 */
	String getEmptyDisplayValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getEmptyDisplayValue <em>Empty Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Display Value</em>' attribute.
	 * @see #getEmptyDisplayValue()
	 * @generated
	 */
	void setEmptyDisplayValue(String value);

	/**
	 * Returns the value of the '<em><b>Encode Uri Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encode Uri Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encode Uri Key</em>' attribute.
	 * @see #setEncodeUriKey(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_EncodeUriKey()
	 * @model default="false"
	 * @generated
	 */
	boolean isEncodeUriKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#isEncodeUriKey <em>Encode Uri Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encode Uri Key</em>' attribute.
	 * @see #isEncodeUriKey()
	 * @generated
	 */
	void setEncodeUriKey(boolean value);

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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_SingletonName()
	 * @model
	 * @generated
	 */
	String getSingletonName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getSingletonName <em>Singleton Name</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_PluralisedName()
	 * @model
	 * @generated
	 */
	String getPluralisedName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getPluralisedName <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluralised Name</em>' attribute.
	 * @see #getPluralisedName()
	 * @generated
	 */
	void setPluralisedName(String value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_ColumnName()
	 * @model ordered="false"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Serialization Groups</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.SerializationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialization Groups</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_SerializationGroups()
	 * @model
	 * @generated
	 */
	EList<SerializationGroup> getSerializationGroups();

} // Feature
