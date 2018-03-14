/**
 */
package work.andycarpenter.webgen.pims.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.api.API#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.api.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getAPI_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // API
