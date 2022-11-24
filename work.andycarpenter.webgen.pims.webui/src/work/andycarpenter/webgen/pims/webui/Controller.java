/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;

import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Controller#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Controller#getParentController <em>Parent Controller</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Controller#getChildControllers <em>Child Controllers</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Controller#getUnits <em>Units</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Controller#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Controller#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getController()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='contentUnitNameUniqueWithinController'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL contentUnitNameUniqueWithinController='units-&gt;isUnique(name)'"
 * @generated
 */
public interface Controller extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Web UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.WebUI#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web UI</em>' container reference.
	 * @see #setWebUI(WebUI)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getController_WebUI()
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getControllers
	 * @model opposite="controllers" required="true" transient="false"
	 * @generated
	 */
	WebUI getWebUI();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Controller#getWebUI <em>Web UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web UI</em>' container reference.
	 * @see #getWebUI()
	 * @generated
	 */
	void setWebUI(WebUI value);

	/**
	 * Returns the value of the '<em><b>Parent Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Controller</em>' containment reference.
	 * @see #setParentController(ControllerLink)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getController_ParentController()
	 * @model containment="true"
	 * @generated
	 */
	ControllerLink getParentController();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Controller#getParentController <em>Parent Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Controller</em>' containment reference.
	 * @see #getParentController()
	 * @generated
	 */
	void setParentController(ControllerLink value);

	/**
	 * Returns the value of the '<em><b>Child Controllers</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.ControllerLink}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.ControllerLink#getTargetController <em>Target Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Controllers</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getController_ChildControllers()
	 * @see work.andycarpenter.webgen.pims.webui.ControllerLink#getTargetController
	 * @model opposite="targetController"
	 * @generated
	 */
	EList<ControllerLink> getChildControllers();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.ContentUnit}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getController_Units()
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getController
	 * @model opposite="controller" containment="true"
	 * @generated
	 */
	EList<ContentUnit> getUnits();

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getController_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Controller#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getController_StyleClass()
	 * @model default=""
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Controller#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // Controller
