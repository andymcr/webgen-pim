/**
 */
package work.andycarpenter.webgen.pims.security.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import work.andycarpenter.webgen.pims.security.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.security.SecurityPackage
 * @generated
 */
public class SecurityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SecurityValidator INSTANCE = new SecurityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "work.andycarpenter.webgen.pims.security";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SecurityPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SecurityPackage.SECURITY:
				return validateSecurity((Security)value, diagnostics, context);
			case SecurityPackage.AUTHENTICATION:
				return validateAuthentication((Authentication)value, diagnostics, context);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM:
				return validateLocalAuthenticationSystem((LocalAuthenticationSystem)value, diagnostics, context);
			case SecurityPackage.CAS_AUTHENTICATION:
				return validateCasAuthentication((CasAuthentication)value, diagnostics, context);
			case SecurityPackage.SECURITY_UNIT:
				return validateSecurityUnit((SecurityUnit)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurity(Security security, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(security, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication(Authentication authentication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authentication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localAuthenticationSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_authenticationKeyFromUserModel(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_authenticationKeyRequiredAttribute(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_userKeyFromAuthhenticationModel(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_userKeyRequiredAttribute(localAuthenticationSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the authenticationKeyFromUserModel constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY_FROM_USER_MODEL__EEXPRESSION = "not userModel.oclIsUndefined() and not authenticationKey.oclIsUndefined() implies\n" +
		"\tuserModel.features->includes(authenticationKey)";

	/**
	 * Validates the authenticationKeyFromUserModel constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_authenticationKeyFromUserModel(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
				 localAuthenticationSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "authenticationKeyFromUserModel",
				 LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY_FROM_USER_MODEL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the authenticationKeyRequiredAttribute constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY_REQUIRED_ATTRIBUTE__EEXPRESSION = "not authenticationKey.oclIsUndefined() implies\n" +
		"\tauthenticationKey.cardinality = persistence::Cardinality::Required";

	/**
	 * Validates the authenticationKeyRequiredAttribute constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_authenticationKeyRequiredAttribute(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
				 localAuthenticationSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "authenticationKeyRequiredAttribute",
				 LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY_REQUIRED_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the userKeyFromAuthhenticationModel constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__USER_KEY_FROM_AUTHHENTICATION_MODEL__EEXPRESSION = "not authenticationModel.oclIsUndefined() and not userKey.oclIsUndefined() implies\n" +
		"\tauthenticationModel.features->includes(userKey)";

	/**
	 * Validates the userKeyFromAuthhenticationModel constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_userKeyFromAuthhenticationModel(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
				 localAuthenticationSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "userKeyFromAuthhenticationModel",
				 LOCAL_AUTHENTICATION_SYSTEM__USER_KEY_FROM_AUTHHENTICATION_MODEL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the userKeyRequiredAttribute constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__USER_KEY_REQUIRED_ATTRIBUTE__EEXPRESSION = "not userKey.oclIsUndefined() implies\n" +
		"\tuserKey.cardinality = persistence::Cardinality::Required";

	/**
	 * Validates the userKeyRequiredAttribute constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_userKeyRequiredAttribute(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
				 localAuthenticationSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "userKeyRequiredAttribute",
				 LOCAL_AUTHENTICATION_SYSTEM__USER_KEY_REQUIRED_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCasAuthentication(CasAuthentication casAuthentication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(casAuthentication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityUnit(SecurityUnit securityUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityUnit, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SecurityValidator
