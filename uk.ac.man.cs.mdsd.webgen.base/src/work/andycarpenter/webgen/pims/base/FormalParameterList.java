/**
 */
package work.andycarpenter.webgen.pims.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.base.FormalParameterList#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.base.BasePackage#getFormalParameterList()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FormalParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.base.FormalParameter}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.base.FormalParameter#getFormalFor <em>Formal For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getFormalParameterList_Parameters()
	 * @see work.andycarpenter.webgen.pims.base.FormalParameter#getFormalFor
	 * @model opposite="formalFor" containment="true"
	 * @generated
	 */
	EList<FormalParameter> getParameters();

} // FormalParameterList
