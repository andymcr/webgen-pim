/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsiteValidator.java,v 1.101 2014/08/22 14:32:52 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uk.ac.man.cs.mdsd.webgen.website.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage
 * @generated
 */
public class WebsiteValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebsiteValidator INSTANCE = new WebsiteValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uk.ac.man.cs.mdsd.webgen.website";

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
	public WebsiteValidator() {
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
	  return WebsitePackage.eINSTANCE;
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
			case WebsitePackage.WEB_GEN_MODEL:
				return validateWebGenModel((WebGenModel)value, diagnostics, context);
			case WebsitePackage.WEBSITE_PROPERTIES:
				return validateWebsiteProperties((WebsiteProperties)value, diagnostics, context);
			case WebsitePackage.AUTHENTICATION:
				return validateAuthentication((Authentication)value, diagnostics, context);
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM:
				return validateLocalAuthenticationSystem((LocalAuthenticationSystem)value, diagnostics, context);
			case WebsitePackage.CAS_AUTHENTICATION:
				return validateCasAuthentication((CasAuthentication)value, diagnostics, context);
			case WebsitePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case WebsitePackage.NAMED_DISPLAY_ELEMENT:
				return validateNamedDisplayElement((NamedDisplayElement)value, diagnostics, context);
			case WebsitePackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case WebsitePackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case WebsitePackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case WebsitePackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case WebsitePackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case WebsitePackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case WebsitePackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case WebsitePackage.DATA_TYPE_ATTRIBUTE:
				return validateDataTypeAttribute((DataTypeAttribute)value, diagnostics, context);
			case WebsitePackage.DATE_ATTRIBUTE:
				return validateDateAttribute((DateAttribute)value, diagnostics, context);
			case WebsitePackage.RESOURCE_ATTRIBUTE:
				return validateResourceAttribute((ResourceAttribute)value, diagnostics, context);
			case WebsitePackage.FILE_ATTRIBUTE:
				return validateFileAttribute((FileAttribute)value, diagnostics, context);
			case WebsitePackage.IMAGE_ATTRIBUTE:
				return validateImageAttribute((ImageAttribute)value, diagnostics, context);
			case WebsitePackage.LOCATION_ATTRIBUTE:
				return validateLocationAttribute((LocationAttribute)value, diagnostics, context);
			case WebsitePackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT:
				return validateAssociationWithoutContainment((AssociationWithoutContainment)value, diagnostics, context);
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT:
				return validateAssociationWithContainment((AssociationWithContainment)value, diagnostics, context);
			case WebsitePackage.INCLUDED_FEATURE:
				return validateIncludedFeature((IncludedFeature)value, diagnostics, context);
			case WebsitePackage.INCLUDED_ELEMENT:
				return validateIncludedElement((IncludedElement)value, diagnostics, context);
			case WebsitePackage.INCLUDED_ASSOCIATION:
				return validateIncludedAssociation((IncludedAssociation)value, diagnostics, context);
			case WebsitePackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case WebsitePackage.MODEL_LABEL:
				return validateModelLabel((ModelLabel)value, diagnostics, context);
			case WebsitePackage.SELECTION:
				return validateSelection((Selection)value, diagnostics, context);
			case WebsitePackage.SERVICE_FEATURE:
				return validateServiceFeature((ServiceFeature)value, diagnostics, context);
			case WebsitePackage.SERVICE_ENTITY_FEATURE:
				return validateServiceEntityFeature((ServiceEntityFeature)value, diagnostics, context);
			case WebsitePackage.SERVICE_ENTITY_ELEMENT:
				return validateServiceEntityElement((ServiceEntityElement)value, diagnostics, context);
			case WebsitePackage.SERVICE_ASSOCIATION:
				return validateServiceAssociation((ServiceAssociation)value, diagnostics, context);
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION:
				return validateServiceEntityAssociation((ServiceEntityAssociation)value, diagnostics, context);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION:
				return validateServiceViewAssociation((ServiceViewAssociation)value, diagnostics, context);
			case WebsitePackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case WebsitePackage.PAGE_LINK:
				return validatePageLink((PageLink)value, diagnostics, context);
			case WebsitePackage.MENU:
				return validateMenu((Menu)value, diagnostics, context);
			case WebsitePackage.MENU_ENTRY:
				return validateMenuEntry((MenuEntry)value, diagnostics, context);
			case WebsitePackage.STATIC_MENU:
				return validateStaticMenu((StaticMenu)value, diagnostics, context);
			case WebsitePackage.FIXED_PAGE_MENU_ENTRY:
				return validateFixedPageMenuEntry((FixedPageMenuEntry)value, diagnostics, context);
			case WebsitePackage.FIXED_ACTION_MENU_ENTRY:
				return validateFixedActionMenuEntry((FixedActionMenuEntry)value, diagnostics, context);
			case WebsitePackage.FIXED_COMMAND_MENU_ENTRY:
				return validateFixedCommandMenuEntry((FixedCommandMenuEntry)value, diagnostics, context);
			case WebsitePackage.EDIT_STATIC_TEXT_MENU_ENTRY:
				return validateEditStaticTextMenuEntry((EditStaticTextMenuEntry)value, diagnostics, context);
			case WebsitePackage.DYNAMIC_MENU:
				return validateDynamicMenu((DynamicMenu)value, diagnostics, context);
			case WebsitePackage.MENU_INCLUDED_FEATURE:
				return validateMenuIncludedFeature((MenuIncludedFeature)value, diagnostics, context);
			case WebsitePackage.MENU_INCLUDED_ELEMENT:
				return validateMenuIncludedElement((MenuIncludedElement)value, diagnostics, context);
			case WebsitePackage.MENU_INCLUDED_ASSOCIATION:
				return validateMenuIncludedAssociation((MenuIncludedAssociation)value, diagnostics, context);
			case WebsitePackage.UNIT_CONTAINER:
				return validateUnitContainer((UnitContainer)value, diagnostics, context);
			case WebsitePackage.UNIT_SOURCE:
				return validateUnitSource((UnitSource)value, diagnostics, context);
			case WebsitePackage.UNIT_TITLE:
				return validateUnitTitle((UnitTitle)value, diagnostics, context);
			case WebsitePackage.CONTENT_UNIT:
				return validateContentUnit((ContentUnit)value, diagnostics, context);
			case WebsitePackage.STATIC_UNIT:
				return validateStaticUnit((StaticUnit)value, diagnostics, context);
			case WebsitePackage.COMMAND_UNIT:
				return validateCommandUnit((CommandUnit)value, diagnostics, context);
			case WebsitePackage.COMMAND:
				return validateCommand((Command)value, diagnostics, context);
			case WebsitePackage.USER_COMMAND:
				return validateUserCommand((UserCommand)value, diagnostics, context);
			case WebsitePackage.CREATE_SITEMAP_UNIT:
				return validateCreateSitemapUnit((CreateSitemapUnit)value, diagnostics, context);
			case WebsitePackage.DYNAMIC_UNIT:
				return validateDynamicUnit((DynamicUnit)value, diagnostics, context);
			case WebsitePackage.UNIT_FIELD:
				return validateUnitField((UnitField)value, diagnostics, context);
			case WebsitePackage.UNIT_FEATURE:
				return validateUnitFeature((UnitFeature)value, diagnostics, context);
			case WebsitePackage.UNIT_ELEMENT:
				return validateUnitElement((UnitElement)value, diagnostics, context);
			case WebsitePackage.UNIT_ASSOCIATION:
				return validateUnitAssociation((UnitAssociation)value, diagnostics, context);
			case WebsitePackage.UNIT_CHILD_FEATURE:
				return validateUnitChildFeature((UnitChildFeature)value, diagnostics, context);
			case WebsitePackage.UNIT_CHILD_ELEMENT:
				return validateUnitChildElement((UnitChildElement)value, diagnostics, context);
			case WebsitePackage.UNIT_CHILD_ASSOCIATION:
				return validateUnitChildAssociation((UnitChildAssociation)value, diagnostics, context);
			case WebsitePackage.INTERFACE_FIELD:
				return validateInterfaceField((InterfaceField)value, diagnostics, context);
			case WebsitePackage.DATA_TYPE_FIELD:
				return validateDataTypeField((DataTypeField)value, diagnostics, context);
			case WebsitePackage.DATE_FIELD:
				return validateDateField((DateField)value, diagnostics, context);
			case WebsitePackage.CAPTCHA_FIELD:
				return validateCaptchaField((CaptchaField)value, diagnostics, context);
			case WebsitePackage.UNIT_SUPPORT_ACTION:
				return validateUnitSupportAction((UnitSupportAction)value, diagnostics, context);
			case WebsitePackage.EDIT_UNIT:
				return validateEditUnit((EditUnit)value, diagnostics, context);
			case WebsitePackage.CREATE_UNIT:
				return validateCreateUnit((CreateUnit)value, diagnostics, context);
			case WebsitePackage.CREATE_UPDATE_UNIT:
				return validateCreateUpdateUnit((CreateUpdateUnit)value, diagnostics, context);
			case WebsitePackage.UPDATE_UNIT:
				return validateUpdateUnit((UpdateUnit)value, diagnostics, context);
			case WebsitePackage.MAP_UNIT:
				return validateMapUnit((MapUnit)value, diagnostics, context);
			case WebsitePackage.DATA_UNIT:
				return validateDataUnit((DataUnit)value, diagnostics, context);
			case WebsitePackage.DETAILS_UNIT:
				return validateDetailsUnit((DetailsUnit)value, diagnostics, context);
			case WebsitePackage.INDEX_UNIT:
				return validateIndexUnit((IndexUnit)value, diagnostics, context);
			case WebsitePackage.CONTROL_UNIT:
				return validateControlUnit((ControlUnit)value, diagnostics, context);
			case WebsitePackage.SEARCH_UNIT:
				return validateSearchUnit((SearchUnit)value, diagnostics, context);
			case WebsitePackage.ACTION_UNIT:
				return validateActionUnit((ActionUnit)value, diagnostics, context);
			case WebsitePackage.AUTHENTICATION_UNIT:
				return validateAuthenticationUnit((AuthenticationUnit)value, diagnostics, context);
			case WebsitePackage.REGISTRATION_UNIT:
				return validateRegistrationUnit((RegistrationUnit)value, diagnostics, context);
			case WebsitePackage.LOGIN_UNIT:
				return validateLoginUnit((LoginUnit)value, diagnostics, context);
			case WebsitePackage.FORGOTTEN_PASSWORD_UNIT:
				return validateForgottenPasswordUnit((ForgottenPasswordUnit)value, diagnostics, context);
			case WebsitePackage.INLINE_ACTION_CONTAINER:
				return validateInlineActionContainer((InlineActionContainer)value, diagnostics, context);
			case WebsitePackage.INLINE_ACTION:
				return validateInlineAction((InlineAction)value, diagnostics, context);
			case WebsitePackage.SELECT_TARGET:
				return validateSelectTarget((SelectTarget)value, diagnostics, context);
			case WebsitePackage.SELECT_ACTION:
				return validateSelectAction((SelectAction)value, diagnostics, context);
			case WebsitePackage.DELETE_ACTION:
				return validateDeleteAction((DeleteAction)value, diagnostics, context);
			case WebsitePackage.FEATURE_SUPPORT_ACTION:
				return validateFeatureSupportAction((FeatureSupportAction)value, diagnostics, context);
			case WebsitePackage.MODEL_REFERENCE:
				return validateModelReference((ModelReference)value, diagnostics, context);
			case WebsitePackage.FEATURE_REFERENCE:
				return validateFeatureReference((FeatureReference)value, diagnostics, context);
			case WebsitePackage.CURRENT_USER_REFERENCE:
				return validateCurrentUserReference((CurrentUserReference)value, diagnostics, context);
			case WebsitePackage.DATABASE_TECHNOLOGIES:
				return validateDatabaseTechnologies((DatabaseTechnologies)value, diagnostics, context);
			case WebsitePackage.ORM_TECHNOLOGIES:
				return validateOrmTechnologies((OrmTechnologies)value, diagnostics, context);
			case WebsitePackage.FRAMEWORK_TECHNOLOGIES:
				return validateFrameworkTechnologies((FrameworkTechnologies)value, diagnostics, context);
			case WebsitePackage.AJAX_TECHNOLOGIES:
				return validateAjaxTechnologies((AjaxTechnologies)value, diagnostics, context);
			case WebsitePackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case WebsitePackage.DATE_DETAILS:
				return validateDateDetails((DateDetails)value, diagnostics, context);
			case WebsitePackage.PAGE_TOP_MENU_OPTIONS:
				return validatePageTopMenuOptions((PageTopMenuOptions)value, diagnostics, context);
			case WebsitePackage.COLLECTION_DISPLAY_OPTIONS:
				return validateCollectionDisplayOptions((CollectionDisplayOptions)value, diagnostics, context);
			case WebsitePackage.INDEX_DISPLAY_OPTION:
				return validateIndexDisplayOption((IndexDisplayOption)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebGenModel(WebGenModel webGenModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webGenModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebGenModel_classifierNameUnique(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebGenModel_pageNameUnique(webGenModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebGenModel_menuNameUnique(webGenModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the classifierNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_GEN_MODEL__CLASSIFIER_NAME_UNIQUE__EEXPRESSION = "classifiers->isUnique(name)";

	/**
	 * Validates the classifierNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebGenModel_classifierNameUnique(WebGenModel webGenModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.WEB_GEN_MODEL,
				 webGenModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "classifierNameUnique",
				 WEB_GEN_MODEL__CLASSIFIER_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the pageNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_GEN_MODEL__PAGE_NAME_UNIQUE__EEXPRESSION = "pages->isUnique(name)";

	/**
	 * Validates the pageNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebGenModel_pageNameUnique(WebGenModel webGenModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.WEB_GEN_MODEL,
				 webGenModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "pageNameUnique",
				 WEB_GEN_MODEL__PAGE_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the menuNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_GEN_MODEL__MENU_NAME_UNIQUE__EEXPRESSION = "menus->isUnique(name)";

	/**
	 * Validates the menuNameUnique constraint of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebGenModel_menuNameUnique(WebGenModel webGenModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.WEB_GEN_MODEL,
				 webGenModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "menuNameUnique",
				 WEB_GEN_MODEL__MENU_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebsiteProperties(WebsiteProperties websiteProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(websiteProperties, diagnostics, context);
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
				(WebsitePackage.Literals.NAMED_ELEMENT,
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
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_featureNameUniqueWithinEntity(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_displayOnlyLocalFeatures(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_keysFromLocalFeatures(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the featureNameUniqueWithinEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__FEATURE_NAME_UNIQUE_WITHIN_ENTITY__EEXPRESSION = "features->isUnique(name)";

	/**
	 * Validates the featureNameUniqueWithinEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_featureNameUniqueWithinEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "featureNameUniqueWithinEntity",
				 ENTITY__FEATURE_NAME_UNIQUE_WITHIN_ENTITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the displayOnlyLocalFeatures constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__DISPLAY_ONLY_LOCAL_FEATURES__EEXPRESSION = "features->union(associationEnds)->includesAll(displayFeatures)";

	/**
	 * Validates the displayOnlyLocalFeatures constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_displayOnlyLocalFeatures(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "displayOnlyLocalFeatures",
				 ENTITY__DISPLAY_ONLY_LOCAL_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the keysFromLocalFeatures constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__KEYS_FROM_LOCAL_FEATURES__EEXPRESSION = "features->union(associationEnds)->includesAll(keys)";

	/**
	 * Validates the keysFromLocalFeatures constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_keysFromLocalFeatures(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "keysFromLocalFeatures",
				 ENTITY__KEYS_FROM_LOCAL_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(feature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(attribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeAttribute(DataTypeAttribute dataTypeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataTypeAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dataTypeAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateAttribute(DateAttribute dateAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dateAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceAttribute(ResourceAttribute resourceAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(resourceAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileAttribute(FileAttribute fileAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fileAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(fileAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageAttribute(ImageAttribute imageAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imageAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(imageAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationAttribute(LocationAttribute locationAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(locationAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(locationAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(association, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithoutContainment(AssociationWithoutContainment associationWithoutContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationWithoutContainment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationWithoutContainment_oneToManyAssociationsMustBeBidirectional(associationWithoutContainment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneToManyAssociationsMustBeBidirectional constraint of '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION_WITHOUT_CONTAINMENT__ONE_TO_MANY_ASSOCIATIONS_MUST_BE_BIDIRECTIONAL__EEXPRESSION = "cardinality = Cardinality::Optional and targetCardinality = Cardinality::Required implies bidirectional";

	/**
	 * Validates the oneToManyAssociationsMustBeBidirectional constraint of '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithoutContainment_oneToManyAssociationsMustBeBidirectional(AssociationWithoutContainment associationWithoutContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.ASSOCIATION_WITHOUT_CONTAINMENT,
				 associationWithoutContainment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneToManyAssociationsMustBeBidirectional",
				 ASSOCIATION_WITHOUT_CONTAINMENT__ONE_TO_MANY_ASSOCIATIONS_MUST_BE_BIDIRECTIONAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithContainment(AssociationWithContainment associationWithContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationWithContainment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(associationWithContainment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectTarget(SelectTarget selectTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_contentUnitNameUniqueWithinPage(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_contentUnitNameDifferentToPageName(page, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the contentUnitNameUniqueWithinPage constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__CONTENT_UNIT_NAME_UNIQUE_WITHIN_PAGE__EEXPRESSION = "units->isUnique(name)";

	/**
	 * Validates the contentUnitNameUniqueWithinPage constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_contentUnitNameUniqueWithinPage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "contentUnitNameUniqueWithinPage",
				 PAGE__CONTENT_UNIT_NAME_UNIQUE_WITHIN_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the contentUnitNameDifferentToPageName constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__CONTENT_UNIT_NAME_DIFFERENT_TO_PAGE_NAME__EEXPRESSION = "units->collect(name)->select(n | n = name)->isEmpty()";

	/**
	 * Validates the contentUnitNameDifferentToPageName constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_contentUnitNameDifferentToPageName(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "contentUnitNameDifferentToPageName",
				 PAGE__CONTENT_UNIT_NAME_DIFFERENT_TO_PAGE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenu(Menu menu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(menu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(menu, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuEntry(MenuEntry menuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuIncludedFeature(MenuIncludedFeature menuIncludedFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuIncludedFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuIncludedElement(MenuIncludedElement menuIncludedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuIncludedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuIncludedAssociation(MenuIncludedAssociation menuIncludedAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuIncludedAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticMenu(StaticMenu staticMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticMenu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(staticMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticMenu_onlyStaticEntries(staticMenu, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyStaticEntries constraint of '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATIC_MENU__ONLY_STATIC_ENTRIES__EEXPRESSION = "entries->select(e | e.oclIsKindOf(MenuIncludedFeature))->isEmpty()";

	/**
	 * Validates the onlyStaticEntries constraint of '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticMenu_onlyStaticEntries(StaticMenu staticMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.STATIC_MENU,
				 staticMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlyStaticEntries",
				 STATIC_MENU__ONLY_STATIC_ENTRIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedPageMenuEntry(FixedPageMenuEntry fixedPageMenuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fixedPageMenuEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fixedPageMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fixedPageMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fixedPageMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fixedPageMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fixedPageMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fixedPageMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fixedPageMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fixedPageMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(fixedPageMenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedActionMenuEntry(FixedActionMenuEntry fixedActionMenuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fixedActionMenuEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fixedActionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fixedActionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fixedActionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fixedActionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fixedActionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fixedActionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fixedActionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fixedActionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(fixedActionMenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedCommandMenuEntry(FixedCommandMenuEntry fixedCommandMenuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fixedCommandMenuEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fixedCommandMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fixedCommandMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fixedCommandMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fixedCommandMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fixedCommandMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fixedCommandMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fixedCommandMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fixedCommandMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(fixedCommandMenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditStaticTextMenuEntry(EditStaticTextMenuEntry editStaticTextMenuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(editStaticTextMenuEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(editStaticTextMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(editStaticTextMenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicMenu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_entriesMustBeFromSource(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_onlyIncludeFeaturesOnce(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_mustSelectSingleton(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_dynamicTitleFromService(dynamicMenu, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicMenu_canOnlyTitleWithSingletonElement(dynamicMenu, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the entriesMustBeFromSource constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__ENTRIES_MUST_BE_FROM_SOURCE__EEXPRESSION = "let includedFeatures : Collection(ServiceEntityFeature)\r\n" +
		"\t= entries\r\n" +
		"\t\t->select(f | f.oclIsKindOf(MenuIncludedFeature)).oclAsType(MenuIncludedFeature)\r\n" +
		"\t\t->collect(f |\r\n" +
		"\t\t\tif f.oclIsTypeOf(MenuIncludedElement) then\r\n" +
		"\t\t\t\tf.oclAsType(MenuIncludedElement).serviceElement\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tf.oclAsType(MenuIncludedAssociation).serviceAssociation\r\n" +
		"\t\t\tendif)\r\n" +
		"\tin if service.oclIsUndefined() then\r\n" +
		"\t\t\tincludedFeatures->isEmpty()\r\n" +
		"\t\telse\r\n" +
		"\t\t\tservice.features->includesAll(includedFeatures)\r\n" +
		"\t\tendif\r\n" +
		" ";

	/**
	 * Validates the entriesMustBeFromSource constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_entriesMustBeFromSource(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "entriesMustBeFromSource",
				 DYNAMIC_MENU__ENTRIES_MUST_BE_FROM_SOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyIncludeFeaturesOnce constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__ONLY_INCLUDE_FEATURES_ONCE__EEXPRESSION = "entries\r\n" +
		"\t->select(f | f.oclIsKindOf(MenuIncludedFeature))\r\n" +
		"\t.oclAsType(MenuIncludedFeature)\r\n" +
		"\t->isUnique(f |\r\n" +
		"\t\tif f.oclIsTypeOf(MenuIncludedElement) then\r\n" +
		"\t\t\tf.oclAsType(MenuIncludedElement).serviceElement\r\n" +
		"\t\telse\r\n" +
		"\t\t\tf.oclAsType(MenuIncludedAssociation).serviceAssociation\r\n" +
		"\t\tendif)";

	/**
	 * Validates the onlyIncludeFeaturesOnce constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_onlyIncludeFeaturesOnce(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlyIncludeFeaturesOnce",
				 DYNAMIC_MENU__ONLY_INCLUDE_FEATURES_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the mustSelectSingleton constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__MUST_SELECT_SINGLETON__EEXPRESSION = "not selection.oclIsUndefined() implies selection.limit = 1";

	/**
	 * Validates the mustSelectSingleton constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_mustSelectSingleton(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "mustSelectSingleton",
				 DYNAMIC_MENU__MUST_SELECT_SINGLETON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the dynamicTitleFromService constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__DYNAMIC_TITLE_FROM_SERVICE__EEXPRESSION = "not dynamicTitle.oclIsUndefined() implies\r\n" +
		"\tif service.oclIsUndefined() then\r\n" +
		" \t\tfalse\r\n" +
		"\telse\r\n" +
		"\t\tservice.features->includes(dynamicTitle)\r\n" +
		"\tendif";

	/**
	 * Validates the dynamicTitleFromService constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_dynamicTitleFromService(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "dynamicTitleFromService",
				 DYNAMIC_MENU__DYNAMIC_TITLE_FROM_SERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the canOnlyTitleWithSingletonElement constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_MENU__CAN_ONLY_TITLE_WITH_SINGLETON_ELEMENT__EEXPRESSION = "not dynamicTitle.oclIsUndefined() implies dynamicTitle.feature.cardinality <> Cardinality::Many";

	/**
	 * Validates the canOnlyTitleWithSingletonElement constraint of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicMenu_canOnlyTitleWithSingletonElement(DynamicMenu dynamicMenu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_MENU,
				 dynamicMenu,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyTitleWithSingletonElement",
				 DYNAMIC_MENU__CAN_ONLY_TITLE_WITH_SINGLETON_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLink(PageLink pageLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitContainer(UnitContainer unitContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitSource(UnitSource unitSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitTitle(UnitTitle unitTitle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitTitle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitField(UnitField unitField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitFeature(UnitFeature unitFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_atMostOneSelectAction(unitFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_noDeleteActions(unitFeature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atMostOneSelectAction constraint of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_FEATURE__AT_MOST_ONE_SELECT_ACTION__EEXPRESSION = "actions->select(a | a.oclIsKindOf(SelectAction))->size() < 2";

	/**
	 * Validates the atMostOneSelectAction constraint of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitFeature_atMostOneSelectAction(UnitFeature unitFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_FEATURE,
				 unitFeature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "atMostOneSelectAction",
				 UNIT_FEATURE__AT_MOST_ONE_SELECT_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noDeleteActions constraint of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_FEATURE__NO_DELETE_ACTIONS__EEXPRESSION = "actions->select(a | a.oclIsKindOf(DeleteAction))->isEmpty()";

	/**
	 * Validates the noDeleteActions constraint of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitFeature_noDeleteActions(UnitFeature unitFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_FEATURE,
				 unitFeature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noDeleteActions",
				 UNIT_FEATURE__NO_DELETE_ACTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitElement(UnitElement unitElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_atMostOneSelectAction(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_noDeleteActions(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_cannotReduceCardinality(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_canOnlyGiveDefaultValueForSingletons(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_canOnlyForceSingletonValues(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitElement_serviceFeatureMustBeConsistent(unitElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the serviceFeatureMustBeConsistent constraint of '<em>Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_ELEMENT__SERVICE_FEATURE_MUST_BE_CONSISTENT__EEXPRESSION = "not feature.oclIsUndefined() and not serviceFeature.oclIsUndefined()\r\n" +
		"implies feature = serviceFeature.feature";

	/**
	 * Validates the serviceFeatureMustBeConsistent constraint of '<em>Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitElement_serviceFeatureMustBeConsistent(UnitElement unitElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_ELEMENT,
				 unitElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "serviceFeatureMustBeConsistent",
				 UNIT_ELEMENT__SERVICE_FEATURE_MUST_BE_CONSISTENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_atMostOneSelectAction(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_noDeleteActions(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitAssociation_cannotReduceCardinality(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitAssociation_canOnlyForceSingletonValues(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitAssociation_serviceFeatureMustBeConsistent(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitAssociation_selectionFromCorrectService(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitAssociation_entityAssociationsRequireFeature(unitAssociation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the cannotReduceCardinality constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_ASSOCIATION__CANNOT_REDUCE_CARDINALITY__EEXPRESSION = "let featureRequired : Boolean\r\n" +
		"= if feature.oclIsUndefined() then\r\n" +
		"\t\tfalse\r\n" +
		"\telse\r\n" +
		"\t\tlet entities : OrderedSet(Entity)\r\n" +
		"\t\t= if displayedOn.source.oclIsUndefined() then\r\n" +
		"\t\t\t\tOrderedSet{}\r\n" +
		"\t\t\telse if displayedOn.source.oclIsTypeOf(Entity) then\r\n" +
		"\t\t\t\tOrderedSet{displayedOn.source.oclAsType(Entity)}\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tdisplayedOn.source.oclAsType(Service).encapsulates\r\n" +
		"\t\t\tendif endif\r\n" +
		"\t\tin if entities->includes(feature.parentEntity) then\r\n" +
		"\t\t\t\tfeature.cardinality = Cardinality::Required\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n" +
		"\t\t\t\t\ttrue\r\n" +
		"\t\t\t\telse\r\n" +
		"\t\t\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality = Cardinality::Required\r\n" +
		"\t\t\t\tendif\r\n" +
		"\t\t\tendif\r\n" +
		"\t\tendif\r\n" +
		"in if serviceFeature.oclIsUndefined() then\r\n" +
		"\t\ttrue\r\n" +
		"\telse if serviceFeature.oclIsTypeOf(ServiceEntityAssociation) then\r\n" +
		"\t\tfeatureRequired implies serviceFeature.oclAsType(ServiceEntityAssociation).required\r\n" +
		"\telse\r\n" +
		"\t\tfeatureRequired implies true -- serviceFeature.oclAsType(ServiceViewAssociation).cardinality = Cardinality::Required\r\n" +
		"\tendif endif\r\n" +
		"";

	/**
	 * Validates the cannotReduceCardinality constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation_cannotReduceCardinality(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_ASSOCIATION,
				 unitAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannotReduceCardinality",
				 UNIT_ASSOCIATION__CANNOT_REDUCE_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the canOnlyForceSingletonValues constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_ASSOCIATION__CAN_ONLY_FORCE_SINGLETON_VALUES__EEXPRESSION = "not feature.oclIsUndefined() and not forcedValue.oclIsUndefined() implies\r\n" +
		"\tlet entities : OrderedSet(Entity)\r\n" +
		"\t\t= if displayedOn.source.oclIsTypeOf(Entity) then\r\n" +
		"\t\t\t\tOrderedSet{displayedOn.source.oclAsType(Entity)}\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tdisplayedOn.source.oclAsType(Service).encapsulates\r\n" +
		"\t\t\tendif\r\n" +
		"\t\tin if entities->includes(feature.parentEntity) then\r\n" +
		"\t\t\t\tfeature.cardinality <> Cardinality::Many\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n" +
		"\t\t\t\t\ttrue\r\n" +
		"\t\t\t\telse\r\n" +
		"\t\t\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality <> Cardinality::Many\r\n" +
		"\t\t\t\tendif\r\n" +
		"\t\t\tendif";

	/**
	 * Validates the canOnlyForceSingletonValues constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation_canOnlyForceSingletonValues(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_ASSOCIATION,
				 unitAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyForceSingletonValues",
				 UNIT_ASSOCIATION__CAN_ONLY_FORCE_SINGLETON_VALUES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the serviceFeatureMustBeConsistent constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_ASSOCIATION__SERVICE_FEATURE_MUST_BE_CONSISTENT__EEXPRESSION = "not feature.oclIsUndefined() and not serviceFeature.oclIsUndefined()\r\n" +
		"implies if serviceFeature.oclIsTypeOf(ServiceEntityAssociation) then\r\n" +
		"\t\tfeature = serviceFeature.oclAsType(ServiceEntityAssociation).feature\r\n" +
		"\telse\r\n" +
		"\t\ttrue\r\n" +
		"\tendif";

	/**
	 * Validates the serviceFeatureMustBeConsistent constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation_serviceFeatureMustBeConsistent(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_ASSOCIATION,
				 unitAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "serviceFeatureMustBeConsistent",
				 UNIT_ASSOCIATION__SERVICE_FEATURE_MUST_BE_CONSISTENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selectionFromCorrectService constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_ASSOCIATION__SELECTION_FROM_CORRECT_SERVICE__EEXPRESSION = "if selection.oclIsUndefined() then\r\n" +
		"\ttrue\r\n" +
		"else if serviceFeature.oclIsUndefined() then\r\n" +
		"\ttrue\r\n" +
		"else if not serviceFeature.oclIsTypeOf(ServiceEntityAssociation) then\r\n" +
		"\ttrue\r\n" +
		"else if serviceFeature.oclAsType(ServiceEntityAssociation).feature.oclIsUndefined() then\r\n" +
		"\ttrue\r\n" +
		"else\r\n" +
		"\tlet target : Entity\r\n" +
		"\t= if serviceFeature.partOf.encapsulates->includes(serviceFeature.oclAsType(ServiceEntityAssociation).feature.parentEntity) then\r\n" +
		"\t\t\tserviceFeature.oclAsType(ServiceEntityAssociation).feature.targetEntity\r\n" +
		"\t\telse\r\n" +
		"\t\t\tserviceFeature.oclAsType(ServiceEntityAssociation).feature.parentEntity\r\n" +
		"\t\tendif\r\n" +
		"\tin target.servedBy->collect(s | s.selections)->includes(selection)\r\n" +
		"endif endif endif endif";

	/**
	 * Validates the selectionFromCorrectService constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation_selectionFromCorrectService(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_ASSOCIATION,
				 unitAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionFromCorrectService",
				 UNIT_ASSOCIATION__SELECTION_FROM_CORRECT_SERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the entityAssociationsRequireFeature constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_ASSOCIATION__ENTITY_ASSOCIATIONS_REQUIRE_FEATURE__EEXPRESSION = "not serviceFeature.oclIsUndefined() implies\r\n" +
		"\tserviceFeature.oclIsTypeOf(ServiceEntityAssociation) implies\r\n" +
		"\t\tnot feature.oclIsUndefined()";

	/**
	 * Validates the entityAssociationsRequireFeature constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation_entityAssociationsRequireFeature(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.UNIT_ASSOCIATION,
				 unitAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "entityAssociationsRequireFeature",
				 UNIT_ASSOCIATION__ENTITY_ASSOCIATIONS_REQUIRE_FEATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitChildFeature(UnitChildFeature unitChildFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitChildFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitChildElement(UnitChildElement unitChildElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitChildElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitChildAssociation(UnitChildAssociation unitChildAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitChildAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_onlyIncludeFeaturesOnce(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_includedFeaturesMustBeFromEncapsulated(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_multipleEntitiesRequiresModelName(service, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyIncludeFeaturesOnce constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__ONLY_INCLUDE_FEATURES_ONCE__EEXPRESSION = "features->isUnique(f |\r\n" +
		"\tif f.oclIsTypeOf(ServiceEntityElement) then\r\n" +
		"\t\tf.oclAsType(ServiceEntityElement).feature\r\n" +
		"\telse\r\n" +
		"\t\tf.oclAsType(ServiceEntityAssociation).feature\r\n" +
		"\tendif)";

	/**
	 * Validates the onlyIncludeFeaturesOnce constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_onlyIncludeFeaturesOnce(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlyIncludeFeaturesOnce",
				 SERVICE__ONLY_INCLUDE_FEATURES_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the includedFeaturesMustBeFromEncapsulated constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__INCLUDED_FEATURES_MUST_BE_FROM_ENCAPSULATED__EEXPRESSION = "let features : Sequence(Feature)\r\n" +
		"\t= encapsulates->collect(e | e.features)->union(encapsulates->collect(e | e.associationEnds))\r\n" +
		"\tin features\r\n" +
		"\t\t->select(f | f.oclIsKindOf(IncludedFeature))\r\n" +
		"\t\t->forAll(f | features->includes(\r\n" +
		"\t\t\tif f.oclIsTypeOf(ServiceEntityElement) then\r\n" +
		"\t\t\t\tf.oclAsType(ServiceEntityElement).feature\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tf.oclAsType(ServiceEntityAssociation).feature\r\n" +
		"\t\t\tendif))";

	/**
	 * Validates the includedFeaturesMustBeFromEncapsulated constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_includedFeaturesMustBeFromEncapsulated(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "includedFeaturesMustBeFromEncapsulated",
				 SERVICE__INCLUDED_FEATURES_MUST_BE_FROM_ENCAPSULATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multipleEntitiesRequiresModelName constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__MULTIPLE_ENTITIES_REQUIRES_MODEL_NAME__EEXPRESSION = "encapsulates->size() > 1 implies not modelName.oclIsUndefined()";

	/**
	 * Validates the multipleEntitiesRequiresModelName constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_multipleEntitiesRequiresModelName(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multipleEntitiesRequiresModelName",
				 SERVICE__MULTIPLE_ENTITIES_REQUIRES_MODEL_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabel(ModelLabel modelLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelLabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(modelLabel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceFeature(ServiceFeature serviceFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEntityFeature(ServiceEntityFeature serviceEntityFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceEntityFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEntityElement(ServiceEntityElement serviceEntityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceEntityElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_cannotReduceCardinality(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_canOnlyGiveDefaultValueForSingletons(serviceEntityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_canOnlyForceSingletonValues(serviceEntityElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceAssociation(ServiceAssociation serviceAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEntityAssociation(ServiceEntityAssociation serviceEntityAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceEntityAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEntityAssociation_cannotReduceCardinality(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEntityAssociation_canOnlyForceSingletonValues(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEntityAssociation_selectionFromCorrectService(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEntityAssociation_implicitOppositeServiceMustBeUnambiguous(serviceEntityAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEntityAssociation_featureRequired(serviceEntityAssociation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the cannotReduceCardinality constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_ENTITY_ASSOCIATION__CANNOT_REDUCE_CARDINALITY__EEXPRESSION = "not feature.oclIsUndefined() implies\r\n" +
		"\tif partOf.encapsulates->includes(feature.parentEntity) then\r\n" +
		"\t\tfeature.cardinality = Cardinality::Required implies required\r\n" +
		"\telse\r\n" +
		"\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n" +
		"\t\t\trequired\r\n" +
		"\t\telse\r\n" +
		"\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality = Cardinality::Required implies required\r\n" +
		"\t\tendif\r\n" +
		"\tendif";

	/**
	 * Validates the cannotReduceCardinality constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEntityAssociation_cannotReduceCardinality(ServiceEntityAssociation serviceEntityAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION,
				 serviceEntityAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannotReduceCardinality",
				 SERVICE_ENTITY_ASSOCIATION__CANNOT_REDUCE_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the canOnlyForceSingletonValues constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_ENTITY_ASSOCIATION__CAN_ONLY_FORCE_SINGLETON_VALUES__EEXPRESSION = "not feature.oclIsUndefined() and not forcedValue.oclIsUndefined() implies\r\n" +
		"\tif partOf.encapsulates->includes(feature.parentEntity) then\r\n" +
		"\t\tfeature.cardinality <> Cardinality::Many\r\n" +
		"\telse\r\n" +
		"\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n" +
		"\t\t\ttrue\r\n" +
		"\t\telse\r\n" +
		"\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality <> Cardinality::Many\r\n" +
		"\t\tendif\r\n" +
		"\tendif";

	/**
	 * Validates the canOnlyForceSingletonValues constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEntityAssociation_canOnlyForceSingletonValues(ServiceEntityAssociation serviceEntityAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION,
				 serviceEntityAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyForceSingletonValues",
				 SERVICE_ENTITY_ASSOCIATION__CAN_ONLY_FORCE_SINGLETON_VALUES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selectionFromCorrectService constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_ENTITY_ASSOCIATION__SELECTION_FROM_CORRECT_SERVICE__EEXPRESSION = "if selection.oclIsUndefined() then\r\n" +
		"\ttrue\r\n" +
		"else if feature.oclIsUndefined() then\r\n" +
		"\ttrue\r\n" +
		"else\r\n" +
		"\tlet target : Entity\r\n" +
		"\t\t= if partOf.encapsulates->includes(feature.parentEntity) then\r\n" +
		"\t\t\t\tfeature.targetEntity\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tfeature.parentEntity\r\n" +
		"\t\t\tendif\r\n" +
		"\tin target.servedBy->collect(s | s.selections)->includes(selection)\r\n" +
		"endif endif";

	/**
	 * Validates the selectionFromCorrectService constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEntityAssociation_selectionFromCorrectService(ServiceEntityAssociation serviceEntityAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION,
				 serviceEntityAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionFromCorrectService",
				 SERVICE_ENTITY_ASSOCIATION__SELECTION_FROM_CORRECT_SERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the implicitOppositeServiceMustBeUnambiguous constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_ENTITY_ASSOCIATION__IMPLICIT_OPPOSITE_SERVICE_MUST_BE_UNAMBIGUOUS__EEXPRESSION = "oppositeService.oclIsUndefined() and not feature.oclIsUndefined() implies\r\n" +
		"\tlet entity: Entity\r\n" +
		"\t\t= if partOf.encapsulates->includes(feature.parentEntity) then\r\n" +
		"\t\t\t\tfeature.targetEntity\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tfeature.parentEntity\r\n" +
		"\t\t\tendif\r\n" +
		"\tin entity.servedBy->size() < 2";

	/**
	 * Validates the implicitOppositeServiceMustBeUnambiguous constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEntityAssociation_implicitOppositeServiceMustBeUnambiguous(ServiceEntityAssociation serviceEntityAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION,
				 serviceEntityAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "implicitOppositeServiceMustBeUnambiguous",
				 SERVICE_ENTITY_ASSOCIATION__IMPLICIT_OPPOSITE_SERVICE_MUST_BE_UNAMBIGUOUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the featureRequired constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_ENTITY_ASSOCIATION__FEATURE_REQUIRED__EEXPRESSION = "not feature.oclIsUndefined()";

	/**
	 * Validates the featureRequired constraint of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEntityAssociation_featureRequired(ServiceEntityAssociation serviceEntityAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION,
				 serviceEntityAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "featureRequired",
				 SERVICE_ENTITY_ASSOCIATION__FEATURE_REQUIRED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceViewAssociation(ServiceViewAssociation serviceViewAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceViewAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(serviceViewAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceViewAssociation_oppositeMustBeInView(serviceViewAssociation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oppositeMustBeInView constraint of '<em>Service View Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_VIEW_ASSOCIATION__OPPOSITE_MUST_BE_IN_VIEW__EEXPRESSION = "not oppositeFeature.oclIsUndefined() implies oppositeFeature.partOf.view";

	/**
	 * Validates the oppositeMustBeInView constraint of '<em>Service View Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceViewAssociation_oppositeMustBeInView(ServiceViewAssociation serviceViewAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.SERVICE_VIEW_ASSOCIATION,
				 serviceViewAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oppositeMustBeInView",
				 SERVICE_VIEW_ASSOCIATION__OPPOSITE_MUST_BE_IN_VIEW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelection(Selection selection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(selection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentUnit(ContentUnit contentUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contentUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contentUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(contentUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceField(InterfaceField interfaceField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceField, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(interfaceField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeField(DataTypeField dataTypeField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataTypeField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataTypeField, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dataTypeField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateField(DateField dateField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateField, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dateField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptchaField(CaptchaField captchaField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(captchaField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(captchaField, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(captchaField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitSupportAction(UnitSupportAction unitSupportAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitSupportAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(unitSupportAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedFeature(IncludedFeature includedFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includedFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedElement(IncludedElement includedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(includedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_cannotReduceCardinality(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_canOnlyGiveDefaultValueForSingletons(includedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedElement_canOnlyForceSingletonValues(includedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the cannotReduceCardinality constraint of '<em>Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INCLUDED_ELEMENT__CANNOT_REDUCE_CARDINALITY__EEXPRESSION = "not feature.oclIsUndefined()\r\n" +
		"\timplies feature.cardinality = Cardinality::Required implies required";

	/**
	 * Validates the cannotReduceCardinality constraint of '<em>Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedElement_cannotReduceCardinality(IncludedElement includedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.INCLUDED_ELEMENT,
				 includedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannotReduceCardinality",
				 INCLUDED_ELEMENT__CANNOT_REDUCE_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the canOnlyGiveDefaultValueForSingletons constraint of '<em>Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INCLUDED_ELEMENT__CAN_ONLY_GIVE_DEFAULT_VALUE_FOR_SINGLETONS__EEXPRESSION = "not feature.oclIsUndefined() and not defaultValue.oclIsUndefined()\r\n" +
		"\timplies feature.cardinality <> Cardinality::Many";

	/**
	 * Validates the canOnlyGiveDefaultValueForSingletons constraint of '<em>Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedElement_canOnlyGiveDefaultValueForSingletons(IncludedElement includedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.INCLUDED_ELEMENT,
				 includedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyGiveDefaultValueForSingletons",
				 INCLUDED_ELEMENT__CAN_ONLY_GIVE_DEFAULT_VALUE_FOR_SINGLETONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the canOnlyForceSingletonValues constraint of '<em>Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INCLUDED_ELEMENT__CAN_ONLY_FORCE_SINGLETON_VALUES__EEXPRESSION = "not feature.oclIsUndefined() and not forcedValue.oclIsUndefined()\r\n" +
		"\timplies feature.cardinality <> Cardinality::Many";

	/**
	 * Validates the canOnlyForceSingletonValues constraint of '<em>Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedElement_canOnlyForceSingletonValues(IncludedElement includedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.INCLUDED_ELEMENT,
				 includedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyForceSingletonValues",
				 INCLUDED_ELEMENT__CAN_ONLY_FORCE_SINGLETON_VALUES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedAssociation(IncludedAssociation includedAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includedAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditUnit(EditUnit editUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(editUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(editUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateUnit(CreateUnit createUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(createUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateUpdateUnit(CreateUpdateUnit createUpdateUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createUpdateUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(createUpdateUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataUnit(DataUnit dataUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_canOnlyTitleWithSingletonElement(dataUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_selectionFromSource(dataUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the canOnlyTitleWithSingletonElement constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_UNIT__CAN_ONLY_TITLE_WITH_SINGLETON_ELEMENT__EEXPRESSION = "not dynamicTitle.oclIsUndefined() implies \r\n" +
		"if dynamicTitle.oclIsKindOf(Feature) then\r\n" +
		"\tdynamicTitle.oclAsType(Feature).cardinality <> Cardinality::Many\r\n" +
		"else\r\n" +
		"\ttrue\r\n" +
		"endif";

	/**
	 * Validates the canOnlyTitleWithSingletonElement constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataUnit_canOnlyTitleWithSingletonElement(DataUnit dataUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DATA_UNIT,
				 dataUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyTitleWithSingletonElement",
				 DATA_UNIT__CAN_ONLY_TITLE_WITH_SINGLETON_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selectionFromSource constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_UNIT__SELECTION_FROM_SOURCE__EEXPRESSION = "not selection.oclIsUndefined() implies\r\n" +
		"\tif source.oclIsUndefined() then\r\n" +
		"\t\ttrue\r\n" +
		"\telse if source.oclIsTypeOf(Service) then\r\n" +
		"\t\tsource.oclAsType(Service).selections->includes(selection)\r\n" +
		"\telse\r\n" +
		"\t\tfalse\r\n" +
		"\tendif endif";

	/**
	 * Validates the selectionFromSource constraint of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataUnit_selectionFromSource(DataUnit dataUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DATA_UNIT,
				 dataUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionFromSource",
				 DATA_UNIT__SELECTION_FROM_SOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticUnit(StaticUnit staticUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(staticUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandUnit(CommandUnit commandUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(commandUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(commandUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(commandUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(commandUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(commandUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(commandUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(commandUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(commandUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(commandUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(commandUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(command, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(command, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(command, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserCommand(UserCommand userCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(userCommand, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(userCommand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(userCommand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(userCommand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(userCommand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(userCommand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(userCommand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(userCommand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(userCommand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(userCommand, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateSitemapUnit(CreateSitemapUnit createSitemapUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createSitemapUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createSitemapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(createSitemapUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnit(DynamicUnit dynamicUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamicUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(dynamicUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the serviceFeaturesMustBeFromSource constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_UNIT__SERVICE_FEATURES_MUST_BE_FROM_SOURCE__EEXPRESSION = "let features : Collection(Feature)\r\n" +
		"\t= if source.oclIsTypeOf(Entity) then \r\n" +
		"\t\t\tsource.oclAsType(Entity).features\r\n" +
		"\t\t\t\t->union(source.oclAsType(Entity).associationEnds)\r\n" +
		"\t\telse\r\n" +
		"\t\t\tsource.oclAsType(Service).features\r\n" +
		"\t\t\t\t->select(f | f.oclIsKindOf(ServiceEntityFeature))\r\n" +
		"\t\t\t\t->collect(f |\r\n" +
		"\t\t\t\t\tif f.oclIsTypeOf(ServiceEntityElement) then\r\n" +
		"\t\t\t\t\t\tf.oclAsType(ServiceEntityElement).feature\r\n" +
		"\t\t\t\t\telse\r\n" +
		"\t\t\t\t\t\tf.oclAsType(ServiceEntityAssociation).feature\r\n" +
		"\t\t\t\t\tendif)\r\n" +
		"\t\tendif \r\n" +
		"\tin displayFields\r\n" +
		"\t\t->select(f | f.oclIsKindOf(UnitFeature))\r\n" +
		"\t\t.oclAsType(UnitFeature)\r\n" +
		"\t\t->select(f | \r\n" +
		"\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n" +
		"\t\t\t\ttrue\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tf.oclAsType(UnitAssociation).feature.oclIsTypeOf(ServiceEntityAssociation)\r\n" +
		"\t\t\tendif)\r\n" +
		"\t\t->forAll(f | \r\n" +
		"\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n" +
		"\t\t\t\tfeatures->includes(f.oclAsType(UnitElement).feature)\r\n" +
		"\t\t\telse\r\n" +
		"\t\t\t\tfeatures->includes(f.oclAsType(UnitAssociation).feature)\r\n" +
		"\t\t\tendif)";

	/**
	 * Validates the serviceFeaturesMustBeFromSource constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnit_serviceFeaturesMustBeFromSource(DynamicUnit dynamicUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_UNIT,
				 dynamicUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "serviceFeaturesMustBeFromSource",
				 DYNAMIC_UNIT__SERVICE_FEATURES_MUST_BE_FROM_SOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyReferenceFeaturesOnce constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_UNIT__ONLY_REFERENCE_FEATURES_ONCE__EEXPRESSION = "displayFields\r\n" +
		"\t->select(f | f.oclIsKindOf(UnitFeature))\r\n" +
		"\t.oclAsType(UnitFeature)\r\n" +
		"\t->select(f | if not f.oclIsTypeOf(UnitAssociation) then\r\n" +
		"\t\t\ttrue\r\n" +
		"\t\telse\r\n" +
		"\t\t\tf.oclAsType(UnitAssociation).childFeature.oclIsUndefined()\r\n" +
		"\t\tendif)\r\n" +
		"\t->isUnique(f |\r\n" +
		"\t\tif f.oclIsTypeOf(UnitElement) then\r\n" +
		"\t\t\tf.oclAsType(UnitElement).feature\r\n" +
		"\t\telse\r\n" +
		"\t\t\tf.oclAsType(UnitAssociation).feature\r\n" +
		"\t\tendif)";

	/**
	 * Validates the onlyReferenceFeaturesOnce constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnit_onlyReferenceFeaturesOnce(DynamicUnit dynamicUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_UNIT,
				 dynamicUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "onlyReferenceFeaturesOnce",
				 DYNAMIC_UNIT__ONLY_REFERENCE_FEATURES_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the entitySourceOnlyIfNotEncapsulated constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_UNIT__ENTITY_SOURCE_ONLY_IF_NOT_ENCAPSULATED__EEXPRESSION = "source.oclIsTypeOf(Entity) implies source.oclAsType(Entity).servedBy->isEmpty()";

	/**
	 * Validates the entitySourceOnlyIfNotEncapsulated constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(DynamicUnit dynamicUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_UNIT,
				 dynamicUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "entitySourceOnlyIfNotEncapsulated",
				 DYNAMIC_UNIT__ENTITY_SOURCE_ONLY_IF_NOT_ENCAPSULATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the serviceSourceImpliesServiceFeaturesSet constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_UNIT__SERVICE_SOURCE_IMPLIES_SERVICE_FEATURES_SET__EEXPRESSION = "source.oclIsTypeOf(Service) implies \r\n" +
		"displayFields\r\n" +
		"\t->select(f|f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\r\n" +
		"\t->forAll(f |\r\n" +
		"\t\tif f.oclIsTypeOf(UnitElement) then\r\n" +
		"\t\t\tnot f.oclAsType(UnitElement).serviceFeature.oclIsUndefined()\r\n" +
		"\t\telse\r\n" +
		"\t\t\tnot f.oclAsType(UnitAssociation).serviceFeature.oclIsUndefined()\r\n" +
		"\t\tendif)";

	/**
	 * Validates the serviceSourceImpliesServiceFeaturesSet constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(DynamicUnit dynamicUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.DYNAMIC_UNIT,
				 dynamicUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "serviceSourceImpliesServiceFeaturesSet",
				 DYNAMIC_UNIT__SERVICE_SOURCE_IMPLIES_SERVICE_FEATURES_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailsUnit(DetailsUnit detailsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(detailsUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_canOnlyTitleWithSingletonElement(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_selectionFromSource(detailsUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexUnit(IndexUnit indexUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indexUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_canOnlyTitleWithSingletonElement(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataUnit_selectionFromSource(indexUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(indexUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlUnit(ControlUnit controlUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(controlUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchUnit(SearchUnit searchUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(searchUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(searchUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionUnit(ActionUnit actionUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(actionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(actionUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticationUnit(AuthenticationUnit authenticationUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authenticationUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrationUnit(RegistrationUnit registrationUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(registrationUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(registrationUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoginUnit(LoginUnit loginUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loginUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(loginUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForgottenPasswordUnit(ForgottenPasswordUnit forgottenPasswordUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forgottenPasswordUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(forgottenPasswordUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlineActionContainer(InlineActionContainer inlineActionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inlineActionContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inlineActionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineActionContainer_atMostOneDeleteAction(inlineActionContainer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atMostOneDeleteAction constraint of '<em>Inline Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INLINE_ACTION_CONTAINER__AT_MOST_ONE_DELETE_ACTION__EEXPRESSION = "actions->select(a | a.oclIsKindOf(DeleteAction))->size() < 2";

	/**
	 * Validates the atMostOneDeleteAction constraint of '<em>Inline Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlineActionContainer_atMostOneDeleteAction(InlineActionContainer inlineActionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.INLINE_ACTION_CONTAINER,
				 inlineActionContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "atMostOneDeleteAction",
				 INLINE_ACTION_CONTAINER__AT_MOST_ONE_DELETE_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlineAction(InlineAction inlineAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inlineAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(inlineAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineAction_canOnlyLinkToSingletonFeatures(inlineAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the canOnlyLinkToSingletonFeatures constraint of '<em>Inline Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INLINE_ACTION__CAN_ONLY_LINK_TO_SINGLETON_FEATURES__EEXPRESSION = "usedBy.oclIsKindOf(UnitFeature) implies\r\n" +
		"\tif usedBy.oclIsKindOf(UnitElement) then\r\n" +
		"\t\tlet element : UnitElement = usedBy.oclAsType(UnitElement)\r\n" +
		"\t\tin not element.feature.oclIsUndefined() implies element.feature.cardinality <> Cardinality::Many\r\n" +
		"\telse\r\n" +
		"\t\ttrue\r\n" +
		"\tendif";

	/**
	 * Validates the canOnlyLinkToSingletonFeatures constraint of '<em>Inline Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlineAction_canOnlyLinkToSingletonFeatures(InlineAction inlineAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.INLINE_ACTION,
				 inlineAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyLinkToSingletonFeatures",
				 INLINE_ACTION__CAN_ONLY_LINK_TO_SINGLETON_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateUnit(UpdateUnit updateUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(updateUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(updateUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapUnit(MapUnit mapUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceFeaturesMustBeFromSource(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_onlyReferenceFeaturesOnce(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_entitySourceOnlyIfNotEncapsulated(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_serviceSourceImpliesServiceFeaturesSet(mapUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectAction(SelectAction selectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(selectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineAction_canOnlyLinkToSingletonFeatures(selectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteAction(DeleteAction deleteAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deleteAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineAction_canOnlyLinkToSingletonFeatures(deleteAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureSupportAction(FeatureSupportAction featureSupportAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureSupportAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameNeedsAtLeastOneCharacter(featureSupportAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInlineAction_canOnlyLinkToSingletonFeatures(featureSupportAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelReference(ModelReference modelReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureReference(FeatureReference featureReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentUserReference(CurrentUserReference currentUserReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentUserReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseTechnologies(DatabaseTechnologies databaseTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrmTechnologies(OrmTechnologies ormTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameworkTechnologies(FrameworkTechnologies frameworkTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAjaxTechnologies(AjaxTechnologies ajaxTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_entitySourceOnlyIfNotEncapsulated(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_authenticationKeyFromUserSource(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_authenticationKeyRequiredAttribute(localAuthenticationSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalAuthenticationSystem_captchaRequiresKeys(localAuthenticationSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the entitySourceOnlyIfNotEncapsulated constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__ENTITY_SOURCE_ONLY_IF_NOT_ENCAPSULATED__EEXPRESSION = "userSource.oclIsTypeOf(Entity) implies userSource.oclAsType(Entity).servedBy->isEmpty()";

	/**
	 * Validates the entitySourceOnlyIfNotEncapsulated constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_entitySourceOnlyIfNotEncapsulated(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
				 localAuthenticationSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "entitySourceOnlyIfNotEncapsulated",
				 LOCAL_AUTHENTICATION_SYSTEM__ENTITY_SOURCE_ONLY_IF_NOT_ENCAPSULATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the authenticationKeyFromUserSource constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY_FROM_USER_SOURCE__EEXPRESSION = "not userSource.oclIsUndefined() implies\r\n" +
		"let features : Collection(Feature)\r\n" +
		"\t= if userSource.oclIsTypeOf(Entity) then\r\n" +
		"\t\t\tuserSource.oclAsType(Entity).features \r\n" +
		"\t\telse\r\n" +
		"\t\t\tlet service : Service = userSource.oclAsType(Service)\r\n" +
		"\t\t\tin if service.features->isEmpty() then\r\n" +
		"\t\t\t\t\tservice.encapsulates->collect(e | e.features)\r\n" +
		"\t\t\t\telse\r\n" +
		"\t\t\t\t\tservice.features\r\n" +
		"\t\t\t\t\t\t->select(f | f.oclIsKindOf(ServiceEntityFeature))\r\n" +
		"\t\t\t\t\t\t->collect(f |\r\n" +
		"\t\t\t\t\t\t\tif f.oclIsTypeOf(ServiceEntityElement) then\r\n" +
		"\t\t\t\t\t\t\t\tf.oclAsType(ServiceEntityElement).feature\r\n" +
		"\t\t\t\t\t\t\telse\r\n" +
		"\t\t\t\t\t\t\t\tf.oclAsType(ServiceEntityAssociation).feature\r\n" +
		"\t\t\t\t\t\t\tendif) \r\n" +
		"\t\t\t\tendif\r\n" +
		"\t\tendif\r\n" +
		"\tin features->includes(userAuthenticationKey)";

	/**
	 * Validates the authenticationKeyFromUserSource constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_authenticationKeyFromUserSource(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
				 localAuthenticationSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "authenticationKeyFromUserSource",
				 LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY_FROM_USER_SOURCE__EEXPRESSION,
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
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY_REQUIRED_ATTRIBUTE__EEXPRESSION = "if userAuthenticationKey.oclIsUndefined() then false else userAuthenticationKey.cardinality = Cardinality::Required endif";

	/**
	 * Validates the authenticationKeyRequiredAttribute constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_authenticationKeyRequiredAttribute(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
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
	 * The cached validation expression for the captchaRequiresKeys constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA_REQUIRES_KEYS__EEXPRESSION = "useCaptcha implies not authenticates.captchaSiteKey.oclIsUndefined() and not authenticates.captchaSecretKey.oclIsUndefined()";

	/**
	 * Validates the captchaRequiresKeys constraint of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalAuthenticationSystem_captchaRequiresKeys(LocalAuthenticationSystem localAuthenticationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebsitePackage.Literals.LOCAL_AUTHENTICATION_SYSTEM,
				 localAuthenticationSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "captchaRequiresKeys",
				 LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA_REQUIRES_KEYS__EEXPRESSION,
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
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateDetails(DateDetails dateDetails, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageTopMenuOptions(PageTopMenuOptions pageTopMenuOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionDisplayOptions(CollectionDisplayOptions collectionDisplayOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexDisplayOption(IndexDisplayOption indexDisplayOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //WebsiteValidator
