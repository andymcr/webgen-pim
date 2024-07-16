/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.security.AuthorisationExpression;
import work.andycarpenter.webgen.pims.service.BusinessOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.OperationAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.OperationAction#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.OperationAction#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.OperationAction#getUriElement <em>Uri Element</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getOperationAction()
 * @model abstract="true"
 * @generated
 */
public interface OperationAction extends Action {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(BusinessOperation)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getOperationAction_Operation()
	 * @model required="true"
	 * @generated
	 */
	BusinessOperation getOperation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.OperationAction#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(BusinessOperation value);

	/**
	 * Returns the value of the '<em><b>Requires Role</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Role</em>' attribute.
	 * @see #setRequiresRole(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getOperationAction_RequiresRole()
	 * @model default=""
	 * @generated
	 */
	String getRequiresRole();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.OperationAction#getRequiresRole <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Role</em>' attribute.
	 * @see #getRequiresRole()
	 * @generated
	 */
	void setRequiresRole(String value);

	/**
	 * Returns the value of the '<em><b>Authorisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorisation</em>' containment reference.
	 * @see #setAuthorisation(AuthorisationExpression)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getOperationAction_Authorisation()
	 * @model containment="true"
	 * @generated
	 */
	AuthorisationExpression getAuthorisation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.OperationAction#getAuthorisation <em>Authorisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorisation</em>' containment reference.
	 * @see #getAuthorisation()
	 * @generated
	 */
	void setAuthorisation(AuthorisationExpression value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getOperationAction_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.OperationAction#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

} // OperationAction
