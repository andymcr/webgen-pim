/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Navigation#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Navigation#getMenus <em>Menus</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Navigation#getNavbarClass <em>Navbar Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Navigation#getAuthenticationMenuPlacement <em>Authentication Menu Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Navigation#getAuthenticationBarClass <em>Authentication Bar Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getNavigation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='menuNameUnique '"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL menuNameUnique='menus-&gt;isUnique(name)'"
 * @generated
 */
public interface Navigation extends EObject {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.WebUI#getNavigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(WebUI)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getNavigation_PartOf()
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getNavigation
	 * @model opposite="navigation" required="true" transient="false"
	 * @generated
	 */
	WebUI getPartOf();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Navigation#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(WebUI value);

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.Menu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getNavigation_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

	/**
	 * Returns the value of the '<em><b>Navbar Class</b></em>' attribute.
	 * The default value is <code>"navbar"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navbar Class</em>' attribute.
	 * @see #setNavbarClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getNavigation_NavbarClass()
	 * @model default="navbar"
	 * @generated
	 */
	String getNavbarClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Navigation#getNavbarClass <em>Navbar Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navbar Class</em>' attribute.
	 * @see #getNavbarClass()
	 * @generated
	 */
	void setNavbarClass(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Menu Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Menu Placement</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement
	 * @see #setAuthenticationMenuPlacement(AuthenticationMenuPlacement)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getNavigation_AuthenticationMenuPlacement()
	 * @model
	 * @generated
	 */
	AuthenticationMenuPlacement getAuthenticationMenuPlacement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Navigation#getAuthenticationMenuPlacement <em>Authentication Menu Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Menu Placement</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement
	 * @see #getAuthenticationMenuPlacement()
	 * @generated
	 */
	void setAuthenticationMenuPlacement(AuthenticationMenuPlacement value);

	/**
	 * Returns the value of the '<em><b>Authentication Bar Class</b></em>' attribute.
	 * The default value is <code>"nav"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Bar Class</em>' attribute.
	 * @see #setAuthenticationBarClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getNavigation_AuthenticationBarClass()
	 * @model default="nav"
	 * @generated
	 */
	String getAuthenticationBarClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Navigation#getAuthenticationBarClass <em>Authentication Bar Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Bar Class</em>' attribute.
	 * @see #getAuthenticationBarClass()
	 * @generated
	 */
	void setAuthenticationBarClass(String value);

} // Navigation
