/**
 */
package work.andycarpenter.webgen.pims.security;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Security#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.security.Security#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getSecurity()
 * @model
 * @generated
 */
public interface Security extends EObject {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.security.Authentication#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getSecurity_Authentication()
	 * @see work.andycarpenter.webgen.pims.security.Authentication#getSecurity
	 * @model opposite="security" containment="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.security.Security#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.security.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.security.SecurityPackage#getSecurity_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Security
