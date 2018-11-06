/**
 */
package work.andycarpenter.webgen.pims.persistence;

import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#isCustomiseSet <em>Customise Set</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='primaryKeyRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL primaryKeyRequired='primaryKey implies cardinality &lt;&gt; Cardinality::Optional'"
 * @generated
 */
public interface EntityFeature extends NamedDisplayElement, Feature {
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_PartOf()
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	Entity getPartOf();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getPartOf <em>Part Of</em>}' container reference.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_Cardinality()
	 * @model default="Optional" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getCardinality <em>Cardinality</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_Ordered()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#isOrdered <em>Ordered</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#isPrimaryKey <em>Primary Key</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_Derived()
	 * @model default="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#isDerived <em>Derived</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_CustomiseSet()
	 * @model default="false"
	 * @generated
	 */
	boolean isCustomiseSet();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#isCustomiseSet <em>Customise Set</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_BooleanIsHasChoice()
	 * @model
	 * @generated
	 */
	isHasChoices getBooleanIsHasChoice();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Is Has Choice</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.isHasChoices
	 * @see #getBooleanIsHasChoice()
	 * @generated
	 */
	void setBooleanIsHasChoice(isHasChoices value);

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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_SingletonName()
	 * @model
	 * @generated
	 */
	String getSingletonName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getSingletonName <em>Singleton Name</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_PluralisedName()
	 * @model
	 * @generated
	 */
	String getPluralisedName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getPluralisedName <em>Pluralised Name</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityFeature_ColumnName()
	 * @model ordered="false"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

} // EntityFeature
