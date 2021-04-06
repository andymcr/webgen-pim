/**
 */
package work.andycarpenter.webgen.pims.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.base.DataType#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.DataType#getOrmType <em>Orm Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.DataType#getWafType <em>Waf Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.DataType#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.DataType#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.base.BasePackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Classifier {
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
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getDataType_PersistentType()
	 * @model
	 * @generated
	 */
	String getPersistentType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.DataType#getPersistentType <em>Persistent Type</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getDataType_OrmType()
	 * @model default=""
	 * @generated
	 */
	String getOrmType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.DataType#getOrmType <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Type</em>' attribute.
	 * @see #getOrmType()
	 * @generated
	 */
	void setOrmType(String value);

	/**
	 * Returns the value of the '<em><b>Waf Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waf Type</em>' attribute.
	 * @see #setWafType(String)
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getDataType_WafType()
	 * @model default=""
	 * @generated
	 */
	String getWafType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.DataType#getWafType <em>Waf Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waf Type</em>' attribute.
	 * @see #getWafType()
	 * @generated
	 */
	void setWafType(String value);

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
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getDataType_InterfaceType()
	 * @model default=""
	 * @generated
	 */
	String getInterfaceType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.DataType#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(String value);

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
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getDataType_ValidationPattern()
	 * @model ordered="false"
	 * @generated
	 */
	String getValidationPattern();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.DataType#getValidationPattern <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Pattern</em>' attribute.
	 * @see #getValidationPattern()
	 * @generated
	 */
	void setValidationPattern(String value);

} // DataType
