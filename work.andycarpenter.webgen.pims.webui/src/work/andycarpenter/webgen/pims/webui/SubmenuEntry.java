/**
 */
package work.andycarpenter.webgen.pims.webui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submenu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SubmenuEntry#isAlwaysVisible <em>Always Visible</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSubmenuEntry()
 * @model
 * @generated
 */
public interface SubmenuEntry extends Menu, MenuEntry {
	/**
	 * Returns the value of the '<em><b>Always Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Visible</em>' attribute.
	 * @see #setAlwaysVisible(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSubmenuEntry_AlwaysVisible()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAlwaysVisible();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SubmenuEntry#isAlwaysVisible <em>Always Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Visible</em>' attribute.
	 * @see #isAlwaysVisible()
	 * @generated
	 */
	void setAlwaysVisible(boolean value);

} // SubmenuEntry
