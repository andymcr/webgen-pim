/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Menu#getEntries <em>Entries</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Menu#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Menu#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Menu#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Menu#getLayoutClass <em>Layout Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.MenuEntry}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.MenuEntry#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getMenu_Entries()
	 * @see work.andycarpenter.webgen.pims.webui.MenuEntry#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<MenuEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Caption</em>' attribute.
	 * @see #setOmitCaption(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getMenu_OmitCaption()
	 * @model required="true"
	 * @generated
	 */
	boolean isOmitCaption();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Menu#isOmitCaption <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Caption</em>' attribute.
	 * @see #isOmitCaption()
	 * @generated
	 */
	void setOmitCaption(boolean value);

	/**
	 * Returns the value of the '<em><b>Caption Class</b></em>' attribute.
	 * The default value is <code>"menu_caption"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class</em>' attribute.
	 * @see #setCaptionClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getMenu_CaptionClass()
	 * @model default="menu_caption"
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Menu#getCaptionClass <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class</em>' attribute.
	 * @see #getCaptionClass()
	 * @generated
	 */
	void setCaptionClass(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"menu"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getMenu_StyleClass()
	 * @model default="menu"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Menu#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Layout Class</b></em>' attribute.
	 * The default value is <code>"collapsible"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Class</em>' attribute.
	 * @see #setLayoutClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getMenu_LayoutClass()
	 * @model default="collapsible"
	 * @generated
	 */
	String getLayoutClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Menu#getLayoutClass <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Class</em>' attribute.
	 * @see #getLayoutClass()
	 * @generated
	 */
	void setLayoutClass(String value);

} // Menu
