/**
 */
package work.andycarpenter.webgen.pims.base.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import work.andycarpenter.webgen.pims.base.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.base.BasePackage
 * @generated
 */
public class BaseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BaseValidator INSTANCE = new BaseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "work.andycarpenter.webgen.pims.base";

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
	public BaseValidator() {
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
	  return BasePackage.eINSTANCE;
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
			case BasePackage.NULL_LITERAL:
				return validateNullLiteral((NullLiteral)value, diagnostics, context);
			case BasePackage.BOOLEAN_LITERAL:
				return validateBooleanLiteral((BooleanLiteral)value, diagnostics, context);
			case BasePackage.INTEGER_LITERAL:
				return validateIntegerLiteral((IntegerLiteral)value, diagnostics, context);
			case BasePackage.STRING_LITERAL:
				return validateStringLiteral((StringLiteral)value, diagnostics, context);
			case BasePackage.TIME_LITERAL:
				return validateTimeLiteral((TimeLiteral)value, diagnostics, context);
			case BasePackage.CURRENT_TIME:
				return validateCurrentTime((CurrentTime)value, diagnostics, context);
			case BasePackage.CURRENT_USER:
				return validateCurrentUser((CurrentUser)value, diagnostics, context);
			case BasePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case BasePackage.NAMED_DISPLAY_ELEMENT:
				return validateNamedDisplayElement((NamedDisplayElement)value, diagnostics, context);
			case BasePackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case BasePackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case BasePackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case BasePackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case BasePackage.FORMAL_PARAMETER_LIST:
				return validateFormalParameterList((FormalParameterList)value, diagnostics, context);
			case BasePackage.FORMAL_PARAMETER:
				return validateFormalParameter((FormalParameter)value, diagnostics, context);
			case BasePackage.CALLABLE:
				return validateCallable((Callable)value, diagnostics, context);
			case BasePackage.REDUCE_FUNCTION:
				return validateReduceFunction((ReduceFunction)value, diagnostics, context);
			case BasePackage.SIZE_FUNCTION:
				return validateSizeFunction((SizeFunction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullLiteral(NullLiteral nullLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanLiteral(BooleanLiteral booleanLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerLiteral(IntegerLiteral integerLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLiteral(StringLiteral stringLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeLiteral(TimeLiteral timeLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nameNeedsAtLeastOneCharacter constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__NAME_NEEDS_AT_LEAST_ONE_CHARACTER__EEXPRESSION = "not name.oclIsUndefined() implies name.size() > 0";

	/**
	 * Validates the nameNeedsAtLeastOneCharacter constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_nameNeedsAtLeastOneCharacter(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasePackage.Literals.NAMED_ELEMENT,
				 namedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "nameNeedsAtLeastOneCharacter",
				 NAMED_ELEMENT__NAME_NEEDS_AT_LEAST_ONE_CHARACTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedDisplayElement(NamedDisplayElement namedDisplayElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedDisplayElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedDisplayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(namedDisplayElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(classifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(enumerationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(enumerationLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentTime(CurrentTime currentTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentUser(CurrentUser currentUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentUser, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalParameterList(FormalParameterList formalParameterList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formalParameterList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalParameter(FormalParameter formalParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formalParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(formalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(formalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(formalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(formalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(formalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(formalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(formalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(formalParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(formalParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceFunction(ReduceFunction reduceFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reduceFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeFunction(SizeFunction sizeFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sizeFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallable(Callable callable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callable, diagnostics, context);
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

} //BaseValidator
