/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ControllerLink#getTargetController <em>Target Controller</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getControllerLink()
 * @model
 * @generated
 */
public interface ControllerLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Controller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Controller#getChildControllers <em>Child Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Controller</em>' reference.
	 * @see #setTargetController(Controller)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getControllerLink_TargetController()
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getChildControllers
	 * @model opposite="childControllers" required="true"
	 * @generated
	 */
	Controller getTargetController();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ControllerLink#getTargetController <em>Target Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Controller</em>' reference.
	 * @see #getTargetController()
	 * @generated
	 */
	void setTargetController(Controller value);

} // ControllerLink
