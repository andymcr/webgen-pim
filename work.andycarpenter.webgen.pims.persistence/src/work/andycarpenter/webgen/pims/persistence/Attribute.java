/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#isHidden <em>Hidden</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#isContainerUnique <em>Container Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getOrmType <em>Orm Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getSlugFields <em>Slug Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#isUnique <em>Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getValidationPattern <em>Validation Pattern</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getInputColumnClass <em>Input Column Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Attribute#getInputElementClass <em>Input Element Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends Feature, Label {
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_Hidden()
	 * @model default="false"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#isHidden <em>Hidden</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_ContainerUnique()
	 * @model
	 * @generated
	 */
	boolean isContainerUnique();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#isContainerUnique <em>Container Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Unique</em>' attribute.
	 * @see #isContainerUnique()
	 * @generated
	 */
	void setContainerUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistent Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent Type</em>' attribute.
	 * @see #setPersistentType(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_PersistentType()
	 * @model default=""
	 * @generated
	 */
	String getPersistentType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getPersistentType <em>Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent Type</em>' attribute.
	 * @see #getPersistentType()
	 * @generated
	 */
	void setPersistentType(String value);

	/**
	 * Returns the value of the '<em><b>Orm Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Type</em>' attribute.
	 * @see #setOrmType(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_OrmType()
	 * @model default=""
	 * @generated
	 */
	String getOrmType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getOrmType <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Type</em>' attribute.
	 * @see #getOrmType()
	 * @generated
	 */
	void setOrmType(String value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see #setInterfaceType(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_InterfaceType()
	 * @model default=""
	 * @generated
	 */
	String getInterfaceType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getInterfaceType <em>Interface Type</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_SlugFields()
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_Unique()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Expression)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_Placeholder()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Pattern</em>' attribute.
	 * @see #setValidationPattern(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_ValidationPattern()
	 * @model ordered="false"
	 * @generated
	 */
	String getValidationPattern();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getValidationPattern <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Pattern</em>' attribute.
	 * @see #getValidationPattern()
	 * @generated
	 */
	void setValidationPattern(String value);

	/**
	 * Returns the value of the '<em><b>Input Column Class</b></em>' attribute.
	 * The default value is <code>"input-field,col,s12 m12 l12"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Column Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Column Class</em>' attribute.
	 * @see #setInputColumnClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_InputColumnClass()
	 * @model default="input-field,col,s12 m12 l12" ordered="false"
	 * @generated
	 */
	String getInputColumnClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getInputColumnClass <em>Input Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Column Class</em>' attribute.
	 * @see #getInputColumnClass()
	 * @generated
	 */
	void setInputColumnClass(String value);

	/**
	 * Returns the value of the '<em><b>Input Element Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Element Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Element Class</em>' attribute.
	 * @see #setInputElementClass(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAttribute_InputElementClass()
	 * @model default=""
	 * @generated
	 */
	String getInputElementClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getInputElementClass <em>Input Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Element Class</em>' attribute.
	 * @see #getInputElementClass()
	 * @generated
	 */
	void setInputElementClass(String value);

} // Attribute
