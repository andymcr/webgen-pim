/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabular Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getHeaderClassOverride <em>Header Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getFooterClassOverride <em>Footer Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getRowClasses <em>Row Classes</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getTabularUnit()
 * @model
 * @generated
 */
public interface TabularUnit extends CollectionUnit {
	/**
	 * Returns the value of the '<em><b>Header Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class Override</em>' attribute.
	 * @see #setHeaderClassOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getTabularUnit_HeaderClassOverride()
	 * @model
	 * @generated
	 */
	String getHeaderClassOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getHeaderClassOverride <em>Header Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class Override</em>' attribute.
	 * @see #getHeaderClassOverride()
	 * @generated
	 */
	void setHeaderClassOverride(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class Override</em>' attribute.
	 * @see #setFooterClassOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getTabularUnit_FooterClassOverride()
	 * @model
	 * @generated
	 */
	String getFooterClassOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getFooterClassOverride <em>Footer Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class Override</em>' attribute.
	 * @see #getFooterClassOverride()
	 * @generated
	 */
	void setFooterClassOverride(String value);

	/**
	 * Returns the value of the '<em><b>Row Classes</b></em>' attribute.
	 * The default value is <code>"odd_row,even_row"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Classes</em>' attribute.
	 * @see #setRowClasses(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getTabularUnit_RowClasses()
	 * @model default="odd_row,even_row" ordered="false"
	 * @generated
	 */
	String getRowClasses();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getRowClasses <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Classes</em>' attribute.
	 * @see #getRowClasses()
	 * @generated
	 */
	void setRowClasses(String value);

} // TabularUnit
