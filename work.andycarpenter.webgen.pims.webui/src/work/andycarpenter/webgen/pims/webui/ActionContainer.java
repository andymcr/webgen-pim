/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getContainerActionsPlacement <em>Container Actions Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getInstanceActionsPlacement <em>Instance Actions Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getActions <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getActionNavigationClass <em>Action Navigation Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getActionContainer()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atMostOneDeleteAction'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL atMostOneDeleteAction='actions-&gt;select(a | a.oclIsKindOf(DeleteAction))-&gt;size() &lt; 2'"
 * @generated
 */
public interface ActionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Actions Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Actions Placement</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement
	 * @see #setContainerActionsPlacement(ContainerActionsPlacement)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getActionContainer_ContainerActionsPlacement()
	 * @model
	 * @generated
	 */
	ContainerActionsPlacement getContainerActionsPlacement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getContainerActionsPlacement <em>Container Actions Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Actions Placement</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement
	 * @see #getContainerActionsPlacement()
	 * @generated
	 */
	void setContainerActionsPlacement(ContainerActionsPlacement value);

	/**
	 * Returns the value of the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Actions Placement</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement
	 * @see #setInstanceActionsPlacement(InstanceActionsPlacement)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getActionContainer_InstanceActionsPlacement()
	 * @model
	 * @generated
	 */
	InstanceActionsPlacement getInstanceActionsPlacement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getInstanceActionsPlacement <em>Instance Actions Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Actions Placement</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement
	 * @see #getInstanceActionsPlacement()
	 * @generated
	 */
	void setInstanceActionsPlacement(InstanceActionsPlacement value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.Action}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Action#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getActionContainer_Actions()
	 * @see work.andycarpenter.webgen.pims.webui.Action#getUsedBy
	 * @model opposite="usedBy" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Action Navigation Class</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Navigation Class</em>' attribute.
	 * @see #setActionNavigationClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getActionContainer_ActionNavigationClass()
	 * @model default=" "
	 * @generated
	 */
	String getActionNavigationClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getActionNavigationClass <em>Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Navigation Class</em>' attribute.
	 * @see #getActionNavigationClass()
	 * @generated
	 */
	void setActionNavigationClass(String value);

} // ActionContainer
