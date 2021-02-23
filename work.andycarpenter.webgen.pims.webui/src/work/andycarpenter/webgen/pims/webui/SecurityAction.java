/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.security.SecurityUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SecurityAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSecurityAction()
 * @model
 * @generated
 */
public interface SecurityAction extends Action {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SecurityUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSecurityAction_Target()
	 * @model required="true"
	 * @generated
	 */
	SecurityUnit getTarget();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SecurityAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SecurityUnit value);

} // SecurityAction
