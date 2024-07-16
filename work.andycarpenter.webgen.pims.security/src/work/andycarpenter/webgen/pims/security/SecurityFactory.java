/**
 */
package work.andycarpenter.webgen.pims.security;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.security.SecurityPackage
 * @generated
 */
public interface SecurityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityFactory eINSTANCE = work.andycarpenter.webgen.pims.security.impl.SecurityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security</em>'.
	 * @generated
	 */
	Security createSecurity();

	/**
	 * Returns a new object of class '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Authentication System</em>'.
	 * @generated
	 */
	LocalAuthenticationSystem createLocalAuthenticationSystem();

	/**
	 * Returns a new object of class '<em>Cas Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cas Authentication</em>'.
	 * @generated
	 */
	CasAuthentication createCasAuthentication();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Is Granted Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Granted Role</em>'.
	 * @generated
	 */
	IsGrantedRole createIsGrantedRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPackage getSecurityPackage();

} //SecurityFactory
