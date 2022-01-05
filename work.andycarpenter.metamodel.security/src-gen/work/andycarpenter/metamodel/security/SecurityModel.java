/**
 */
package work.andycarpenter.metamodel.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.SecurityModel#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.SecurityModel#isIsAuthenticated <em>Is Authenticated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.SecurityModel#isIsCasAuthenticated <em>Is Cas Authenticated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.SecurityModel#getCasAuthentication <em>Cas Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.SecurityModel#isIsLocallyAuthenticated <em>Is Locally Authenticated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.SecurityModel#getLocalAuthentication <em>Local Authentication</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel()
 * @model
 * @generated
 */
public interface SecurityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel_Authentication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.SecurityModel#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Is Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authenticated</em>' attribute.
	 * @see #isSetIsAuthenticated()
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel_IsAuthenticated()
	 * @model unique="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsAuthenticated();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.metamodel.security.SecurityModel#isIsAuthenticated <em>Is Authenticated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Authenticated</em>' attribute is set.
	 * @see #isIsAuthenticated()
	 * @generated
	 */
	boolean isSetIsAuthenticated();

	/**
	 * Returns the value of the '<em><b>Is Cas Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cas Authenticated</em>' attribute.
	 * @see #isSetIsCasAuthenticated()
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel_IsCasAuthenticated()
	 * @model unique="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsCasAuthenticated();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.metamodel.security.SecurityModel#isIsCasAuthenticated <em>Is Cas Authenticated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Cas Authenticated</em>' attribute is set.
	 * @see #isIsCasAuthenticated()
	 * @generated
	 */
	boolean isSetIsCasAuthenticated();

	/**
	 * Returns the value of the '<em><b>Cas Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cas Authentication</em>' reference.
	 * @see #isSetCasAuthentication()
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel_CasAuthentication()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CasAuthentication getCasAuthentication();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.metamodel.security.SecurityModel#getCasAuthentication <em>Cas Authentication</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cas Authentication</em>' reference is set.
	 * @see #getCasAuthentication()
	 * @generated
	 */
	boolean isSetCasAuthentication();

	/**
	 * Returns the value of the '<em><b>Is Locally Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Locally Authenticated</em>' attribute.
	 * @see #isSetIsLocallyAuthenticated()
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel_IsLocallyAuthenticated()
	 * @model unique="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsLocallyAuthenticated();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.metamodel.security.SecurityModel#isIsLocallyAuthenticated <em>Is Locally Authenticated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Locally Authenticated</em>' attribute is set.
	 * @see #isIsLocallyAuthenticated()
	 * @generated
	 */
	boolean isSetIsLocallyAuthenticated();

	/**
	 * Returns the value of the '<em><b>Local Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Authentication</em>' reference.
	 * @see #isSetLocalAuthentication()
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel_LocalAuthentication()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	LocalAuthenticationSystem getLocalAuthentication();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.metamodel.security.SecurityModel#getLocalAuthentication <em>Local Authentication</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local Authentication</em>' reference is set.
	 * @see #getLocalAuthentication()
	 * @generated
	 */
	boolean isSetLocalAuthentication();

} // SecurityModel
