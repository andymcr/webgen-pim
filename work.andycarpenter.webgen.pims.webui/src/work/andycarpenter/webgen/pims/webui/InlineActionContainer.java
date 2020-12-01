/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Action Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer#getActions <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer#getActionNavigationClass <em>Action Navigation Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer#getDefaultLocalAnchorClass <em>Default Local Anchor Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInlineActionContainer()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atMostOneDeleteAction'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL atMostOneDeleteAction='actions-&gt;select(a | a.oclIsKindOf(DeleteAction))-&gt;size() &lt; 2'"
 * @generated
 */
public interface InlineActionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.InlineAction}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInlineActionContainer_Actions()
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getUsedBy
	 * @model opposite="usedBy" containment="true"
	 * @generated
	 */
	EList<InlineAction> getActions();

	/**
	 * Returns the value of the '<em><b>Action Navigation Class</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Navigation Class</em>' attribute.
	 * @see #setActionNavigationClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInlineActionContainer_ActionNavigationClass()
	 * @model default=" "
	 * @generated
	 */
	String getActionNavigationClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer#getActionNavigationClass <em>Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Navigation Class</em>' attribute.
	 * @see #getActionNavigationClass()
	 * @generated
	 */
	void setActionNavigationClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Local Anchor Class</em>' attribute.
	 * @see #setDefaultLocalAnchorClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInlineActionContainer_DefaultLocalAnchorClass()
	 * @model default=" "
	 * @generated
	 */
	String getDefaultLocalAnchorClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer#getDefaultLocalAnchorClass <em>Default Local Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Local Anchor Class</em>' attribute.
	 * @see #getDefaultLocalAnchorClass()
	 * @generated
	 */
	void setDefaultLocalAnchorClass(String value);

} // InlineActionContainer
