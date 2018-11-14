/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Page#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Page#getParentPage <em>Parent Page</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Page#getChildPages <em>Child Pages</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Page#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Page#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='contentUnitNameUniqueWithinPage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL contentUnitNameUniqueWithinPage='units-&gt;isUnique(name)'"
 * @generated
 */
public interface Page extends NamedDisplayElement, UnitContainer {
	/**
	 * Returns the value of the '<em><b>Web UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.WebUI#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web UI</em>' container reference.
	 * @see #setWebUI(WebUI)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPage_WebUI()
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getPages
	 * @model opposite="pages" required="true" transient="false"
	 * @generated
	 */
	WebUI getWebUI();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Page#getWebUI <em>Web UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web UI</em>' container reference.
	 * @see #getWebUI()
	 * @generated
	 */
	void setWebUI(WebUI value);

	/**
	 * Returns the value of the '<em><b>Parent Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Page</em>' containment reference.
	 * @see #setParentPage(PageLink)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPage_ParentPage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PageLink getParentPage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Page#getParentPage <em>Parent Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Page</em>' containment reference.
	 * @see #getParentPage()
	 * @generated
	 */
	void setParentPage(PageLink value);

	/**
	 * Returns the value of the '<em><b>Child Pages</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.PageLink}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.PageLink#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Pages</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPage_ChildPages()
	 * @see work.andycarpenter.webgen.pims.webui.PageLink#getTargetPage
	 * @model opposite="targetPage"
	 * @generated
	 */
	EList<PageLink> getChildPages();

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPage_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Page#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPage_StyleClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Page#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // Page
