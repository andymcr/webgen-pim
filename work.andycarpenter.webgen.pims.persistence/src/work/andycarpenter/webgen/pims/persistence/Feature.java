/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowAdd <em>Collection Orm Allow Add</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowRemove <em>Collection Orm Allow Remove</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getDefaultDisplayValue <em>Default Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getEmptyDisplayValue <em>Empty Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Feature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_Title()
	 * @model
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
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_Placeholder()
	 * @model ordered="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Display Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Display Value</em>' attribute.
	 * @see #setDefaultDisplayValue(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_DefaultDisplayValue()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Display Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Display Value</em>' attribute.
	 * @see #setEmptyDisplayValue(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_EmptyDisplayValue()
	 * @model
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

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_HeaderClass()
	 * @model
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Class</em>' attribute.
	 * @see #setDisplayClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_DisplayClass()
	 * @model
	 * @generated
	 */
	String getDisplayClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getDisplayClass <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Class</em>' attribute.
	 * @see #getDisplayClass()
	 * @generated
	 */
	void setDisplayClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeature_FooterClass()
	 * @model
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Feature#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // Feature
