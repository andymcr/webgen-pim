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

} // InlineActionContainer
