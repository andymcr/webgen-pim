/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#isHidden <em>Hidden</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#isContainerUnique <em>Container Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#getOrmType <em>Orm Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#getSlugFields <em>Slug Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityAttribute()
 * @model abstract="true"
 * @generated
 */
public interface EntityAttribute extends EntityFeature, Attribute {
	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityAttribute_Hidden()
	 * @model default="false"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Unique</em>' attribute.
	 * @see #setContainerUnique(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityAttribute_ContainerUnique()
	 * @model
	 * @generated
	 */
	boolean isContainerUnique();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#isContainerUnique <em>Container Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Unique</em>' attribute.
	 * @see #isContainerUnique()
	 * @generated
	 */
	void setContainerUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent Type</em>' attribute.
	 * @see #setPersistentType(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityAttribute_PersistentType()
	 * @model
	 * @generated
	 */
	String getPersistentType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#getPersistentType <em>Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent Type</em>' attribute.
	 * @see #getPersistentType()
	 * @generated
	 */
	void setPersistentType(String value);

	/**
	 * Returns the value of the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Type</em>' attribute.
	 * @see #setOrmType(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityAttribute_OrmType()
	 * @model
	 * @generated
	 */
	String getOrmType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#getOrmType <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Type</em>' attribute.
	 * @see #getOrmType()
	 * @generated
	 */
	void setOrmType(String value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see #setInterfaceType(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityAttribute_InterfaceType()
	 * @model
	 * @generated
	 */
	String getInterfaceType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(String value);

	/**
	 * Returns the value of the '<em><b>Slug Fields</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slug Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slug Fields</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityAttribute_SlugFields()
	 * @model
	 * @generated
	 */
	EList<Attribute> getSlugFields();

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntityAttribute_Unique()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.EntityAttribute#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // EntityAttribute
