/**
 */
package work.andycarpenter.webgen.pims.webui.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import work.andycarpenter.webgen.pims.base.util.BaseValidator;
import work.andycarpenter.webgen.pims.webui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage
 * @generated
 */
public class WebuiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebuiValidator INSTANCE = new WebuiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "work.andycarpenter.webgen.pims.webui";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseValidator baseValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebuiValidator() {
		super();
		baseValidator = BaseValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WebuiPackage.eINSTANCE;
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
			case WebuiPackage.WEB_UI:
				return validateWebUI((WebUI)value, diagnostics, context);
			case WebuiPackage.NAVIGATION:
				return validateNavigation((Navigation)value, diagnostics, context);
			case WebuiPackage.MENU:
				return validateMenu((Menu)value, diagnostics, context);
			case WebuiPackage.MENU_ENTRY:
				return validateMenuEntry((MenuEntry)value, diagnostics, context);
			case WebuiPackage.SUBMENU_ENTRY:
				return validateSubmenuEntry((SubmenuEntry)value, diagnostics, context);
			case WebuiPackage.ACTION_MENU_ENTRY:
				return validateActionMenuEntry((ActionMenuEntry)value, diagnostics, context);
			case WebuiPackage.EDIT_STATIC_TEXT_MENU_ENTRY:
				return validateEditStaticTextMenuEntry((EditStaticTextMenuEntry)value, diagnostics, context);
			case WebuiPackage.MENU_FEATURE:
				return validateMenuFeature((MenuFeature)value, diagnostics, context);
			case WebuiPackage.CONTENT_UNIT_STYLES:
				return validateContentUnitStyles((ContentUnitStyles)value, diagnostics, context);
			case WebuiPackage.DYNAMIC_UNIT_STYLES:
				return validateDynamicUnitStyles((DynamicUnitStyles)value, diagnostics, context);
			case WebuiPackage.DEFAULT_UNIT_STYLES:
				return validateDefaultUnitStyles((DefaultUnitStyles)value, diagnostics, context);
			case WebuiPackage.CARDS_UNIT_STYLES:
				return validateCardsUnitStyles((CardsUnitStyles)value, diagnostics, context);
			case WebuiPackage.DETAILS_UNIT_STYLES:
				return validateDetailsUnitStyles((DetailsUnitStyles)value, diagnostics, context);
			case WebuiPackage.FORM_UNIT_STYLES:
				return validateFormUnitStyles((FormUnitStyles)value, diagnostics, context);
			case WebuiPackage.GALLERY_UNIT_STYLES:
				return validateGalleryUnitStyles((GalleryUnitStyles)value, diagnostics, context);
			case WebuiPackage.SLIDER_UNIT_STYLES:
				return validateSliderUnitStyles((SliderUnitStyles)value, diagnostics, context);
			case WebuiPackage.STATIC_UNIT_STYLES:
				return validateStaticUnitStyles((StaticUnitStyles)value, diagnostics, context);
			case WebuiPackage.TABULAR_UNIT_STYLES:
				return validateTabularUnitStyles((TabularUnitStyles)value, diagnostics, context);
			case WebuiPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case WebuiPackage.PAGE_LINK:
				return validatePageLink((PageLink)value, diagnostics, context);
			case WebuiPackage.CONTENT_UNIT:
				return validateContentUnit((ContentUnit)value, diagnostics, context);
			case WebuiPackage.STATIC_UNIT:
				return validateStaticUnit((StaticUnit)value, diagnostics, context);
			case WebuiPackage.CREATE_SITEMAP_UNIT:
				return validateCreateSitemapUnit((CreateSitemapUnit)value, diagnostics, context);
			case WebuiPackage.DYNAMIC_UNIT:
				return validateDynamicUnit((DynamicUnit)value, diagnostics, context);
			case WebuiPackage.ROUTE_ACTUAL:
				return validateRouteActual((RouteActual)value, diagnostics, context);
			case WebuiPackage.UNIT_FIELD:
				return validateUnitField((UnitField)value, diagnostics, context);
			case WebuiPackage.UNIT_FEATURE:
				return validateUnitFeature((UnitFeature)value, diagnostics, context);
			case WebuiPackage.UNIT_ELEMENT:
				return validateUnitElement((UnitElement)value, diagnostics, context);
			case WebuiPackage.UNIT_ASSOCIATION:
				return validateUnitAssociation((UnitAssociation)value, diagnostics, context);
			case WebuiPackage.CHILD_PATH_ATTRIBUTE:
				return validateChildPathAttribute((ChildPathAttribute)value, diagnostics, context);
			case WebuiPackage.CHILD_PATH_ASSOCIATION:
				return validateChildPathAssociation((ChildPathAssociation)value, diagnostics, context);
			case WebuiPackage.FEATURE_PATH:
				return validateFeaturePath((FeaturePath)value, diagnostics, context);
			case WebuiPackage.FEATURE_PATH_ATTRIBUTE:
				return validateFeaturePathAttribute((FeaturePathAttribute)value, diagnostics, context);
			case WebuiPackage.FEATURE_PATH_ASSOCIATION:
				return validateFeaturePathAssociation((FeaturePathAssociation)value, diagnostics, context);
			case WebuiPackage.FEATURE_PATH_LABEL:
				return validateFeaturePathLabel((FeaturePathLabel)value, diagnostics, context);
			case WebuiPackage.UNIT_LABEL:
				return validateUnitLabel((UnitLabel)value, diagnostics, context);
			case WebuiPackage.INTERFACE_FIELD:
				return validateInterfaceField((InterfaceField)value, diagnostics, context);
			case WebuiPackage.DATA_TYPE_FIELD:
				return validateDataTypeField((DataTypeField)value, diagnostics, context);
			case WebuiPackage.DATE_FIELD:
				return validateDateField((DateField)value, diagnostics, context);
			case WebuiPackage.SELECTABLE_UNIT:
				return validateSelectableUnit((SelectableUnit)value, diagnostics, context);
			case WebuiPackage.SINGLETON_UNIT:
				return validateSingletonUnit((SingletonUnit)value, diagnostics, context);
			case WebuiPackage.COLLECTION_UNIT:
				return validateCollectionUnit((CollectionUnit)value, diagnostics, context);
			case WebuiPackage.EDIT_UNIT:
				return validateEditUnit((EditUnit)value, diagnostics, context);
			case WebuiPackage.CREATE_UNIT:
				return validateCreateUnit((CreateUnit)value, diagnostics, context);
			case WebuiPackage.UPDATE_UNIT:
				return validateUpdateUnit((UpdateUnit)value, diagnostics, context);
			case WebuiPackage.CREATE_UPDATE_UNIT:
				return validateCreateUpdateUnit((CreateUpdateUnit)value, diagnostics, context);
			case WebuiPackage.MAP_UNIT:
				return validateMapUnit((MapUnit)value, diagnostics, context);
			case WebuiPackage.DETAILS_UNIT:
				return validateDetailsUnit((DetailsUnit)value, diagnostics, context);
			case WebuiPackage.TABULAR_UNIT:
				return validateTabularUnit((TabularUnit)value, diagnostics, context);
			case WebuiPackage.CARDS_UNIT:
				return validateCardsUnit((CardsUnit)value, diagnostics, context);
			case WebuiPackage.BADGE:
				return validateBadge((Badge)value, diagnostics, context);
			case WebuiPackage.TEXT_CARDS_UNIT:
				return validateTextCardsUnit((TextCardsUnit)value, diagnostics, context);
			case WebuiPackage.DATE_CARDS_UNIT:
				return validateDateCardsUnit((DateCardsUnit)value, diagnostics, context);
			case WebuiPackage.IMAGE_UNIT:
				return validateImageUnit((ImageUnit)value, diagnostics, context);
			case WebuiPackage.IMAGE_CARDS_UNIT:
				return validateImageCardsUnit((ImageCardsUnit)value, diagnostics, context);
			case WebuiPackage.SLIDER_UNIT:
				return validateSliderUnit((SliderUnit)value, diagnostics, context);
			case WebuiPackage.GALLERY_UNIT:
				return validateGalleryUnit((GalleryUnit)value, diagnostics, context);
			case WebuiPackage.CONTROL_UNIT:
				return validateControlUnit((ControlUnit)value, diagnostics, context);
			case WebuiPackage.SEARCH_UNIT:
				return validateSearchUnit((SearchUnit)value, diagnostics, context);
			case WebuiPackage.REGISTRATION_UNIT:
				return validateRegistrationUnit((RegistrationUnit)value, diagnostics, context);
			case WebuiPackage.LOGIN_UNIT:
				return validateLoginUnit((LoginUnit)value, diagnostics, context);
			case WebuiPackage.LOGOUT_UNIT:
				return validateLogoutUnit((LogoutUnit)value, diagnostics, context);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT:
				return validateForgottenPasswordUnit((ForgottenPasswordUnit)value, diagnostics, context);
			case WebuiPackage.RESET_PASSWORD_UNIT:
				return validateResetPasswordUnit((ResetPasswordUnit)value, diagnostics, context);
			case WebuiPackage.ACTION_CONTAINER:
				return validateActionContainer((ActionContainer)value, diagnostics, context);
			case WebuiPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case WebuiPackage.SECURITY_ACTION:
				return validateSecurityAction((SecurityAction)value, diagnostics, context);
			case WebuiPackage.DELETE_ACTION:
				return validateDeleteAction((DeleteAction)value, diagnostics, context);
			case WebuiPackage.SELECT_ACTION:
				return validateSelectAction((SelectAction)value, diagnostics, context);
			case WebuiPackage.CONTAINER_SELECT_ACTION:
				return validateContainerSelectAction((ContainerSelectAction)value, diagnostics, context);
			case WebuiPackage.INSTANCE_SELECT_ACTION:
				return validateInstanceSelectAction((InstanceSelectAction)value, diagnostics, context);
			case WebuiPackage.OPERATION_ACTION:
				return validateOperationAction((OperationAction)value, diagnostics, context);
			case WebuiPackage.CONTAINER_OPERATION_ACTION:
				return validateContainerOperationAction((ContainerOperationAction)value, diagnostics, context);
			case WebuiPackage.INSTANCE_OPERATION_ACTION:
				return validateInstanceOperationAction((InstanceOperationAction)value, diagnostics, context);
			case WebuiPackage.GENERAL_OPERATION_ACTION:
				return validateGeneralOperationAction((GeneralOperationAction)value, diagnostics, context);
			case WebuiPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case WebuiPackage.AUTHENTICATION_MENU_PLACEMENT:
				return validateAuthenticationMenuPlacement((AuthenticationMenuPlacement)value, diagnostics, context);
			case WebuiPackage.PAGE_TOP_MENU_OPTIONS:
				return validatePageTopMenuOptions((PageTopMenuOptions)value, diagnostics, context);
			case WebuiPackage.COLLECTION_DISPLAY_OPTIONS:
				return validateCollectionDisplayOptions((CollectionDisplayOptions)value, diagnostics, context);
			case WebuiPackage.PAGINATION_CONTROL_PLACEMENTS:
				return validatePaginationControlPlacements((PaginationControlPlacements)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebUI(WebUI webUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webUI, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webUI, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebUI_pageNameUnique(webUI, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the pageNameUnique constraint of '<em>Web UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_UI__PAGE_NAME_UNIQUE__EEXPRESSION = "pages->isUnique(name)";

	/**
	 * Validates the pageNameUnique constraint of '<em>Web UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebUI_pageNameUnique(WebUI webUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.WEB_UI,
				 webUI,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "pageNameUnique",
				 WEB_UI__PAGE_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigation(Navigation navigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNavigation_menuNameUnique(navigation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the menuNameUnique constraint of '<em>Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAVIGATION__MENU_NAME_UNIQUE__EEXPRESSION = "menus->isUnique(name)";

	/**
	 * Validates the menuNameUnique constraint of '<em>Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigation_menuNameUnique(Navigation navigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.NAVIGATION,
				 navigation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "menuNameUnique",
				 NAVIGATION__MENU_NAME_UNIQUE__EEXPRESSION,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(menu, diagnostics, context);
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
	public boolean validateSubmenuEntry(SubmenuEntry submenuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(submenuEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(submenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(submenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(submenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(submenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(submenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(submenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(submenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(submenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(submenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionMenuEntry(ActionMenuEntry actionMenuEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionMenuEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionMenuEntry, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(actionMenuEntry, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(editStaticTextMenuEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuFeature(MenuFeature menuFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentUnitStyles(ContentUnitStyles contentUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnitStyles(DynamicUnitStyles dynamicUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultUnitStyles(DefaultUnitStyles defaultUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardsUnitStyles(CardsUnitStyles cardsUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cardsUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailsUnitStyles(DetailsUnitStyles detailsUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detailsUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormUnitStyles(FormUnitStyles formUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGalleryUnitStyles(GalleryUnitStyles galleryUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(galleryUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSliderUnitStyles(SliderUnitStyles sliderUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sliderUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticUnitStyles(StaticUnitStyles staticUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticUnitStyles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabularUnitStyles(TabularUnitStyles tabularUnitStyles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tabularUnitStyles, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_contentUnitNameUniqueWithinPage(page, diagnostics, context);
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
				(WebuiPackage.Literals.PAGE,
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(contentUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRouteActual(RouteActual routeActual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(routeActual, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(staticUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(createSitemapUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(dynamicUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(dynamicUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the featuresMustBeFromContentType constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DYNAMIC_UNIT__FEATURES_MUST_BE_FROM_CONTENT_TYPE__EEXPRESSION = "displayFields\n" +
		"\t->select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\n" +
		"\t->select(f | \n" +
		"\t\tif f.oclIsTypeOf(UnitElement) then\n" +
		"\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\n" +
		"\t\telse\n" +
		"\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\n" +
		"\t\tendif)\n" +
		"\t->forAll(f | \n" +
		"\t\tif f.oclIsTypeOf(UnitElement) then\n" +
		"\t\t\tcontentType.features->includes(f.oclAsType(UnitElement).attribute)\n" +
		"\t\telse\n" +
		"\t\t\tcontentType.features->includes(f.oclAsType(UnitAssociation).association)\n" +
		"\t\tendif)";

	/**
	 * Validates the featuresMustBeFromContentType constraint of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicUnit_featuresMustBeFromContentType(DynamicUnit dynamicUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.DYNAMIC_UNIT,
				 dynamicUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "featuresMustBeFromContentType",
				 DYNAMIC_UNIT__FEATURES_MUST_BE_FROM_CONTENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(unitFeature, diagnostics, context);
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
				(WebuiPackage.Literals.UNIT_FEATURE,
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
				(WebuiPackage.Literals.UNIT_FEATURE,
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
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_atMostOneSelectAction(unitElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_noDeleteActions(unitElement, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_atMostOneSelectAction(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitFeature_noDeleteActions(unitAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnitAssociation_optionsValidChoice(unitAssociation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the optionsValidChoice constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT_ASSOCIATION__OPTIONS_VALID_CHOICE__EEXPRESSION = "not options.oclIsUndefined() implies\n" +
		"\tdisplayedOn.pageDisplayedOn.webUI.persistence.repositories\n" +
		"\t\t->select(r : persistence::Repository | r.serves = targetEntity)\n" +
		"\t\t->collect(r : persistence::Repository | r.selections)\n" +
		"\t\t->includes(options)";

	/**
	 * Validates the optionsValidChoice constraint of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitAssociation_optionsValidChoice(UnitAssociation unitAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.UNIT_ASSOCIATION,
				 unitAssociation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "optionsValidChoice",
				 UNIT_ASSOCIATION__OPTIONS_VALID_CHOICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChildPathAttribute(ChildPathAttribute childPathAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childPathAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChildPathAssociation(ChildPathAssociation childPathAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(childPathAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturePath(FeaturePath featurePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featurePath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturePathAttribute(FeaturePathAttribute featurePathAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featurePathAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturePathAssociation(FeaturePathAssociation featurePathAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featurePathAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturePathLabel(FeaturePathLabel featurePathLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featurePathLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitLabel(UnitLabel unitLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitLabel, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(interfaceField, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dataTypeField, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dateField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectableUnit(SelectableUnit selectableUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectableUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonUnit(SingletonUnit singletonUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singletonUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(singletonUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(singletonUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the canOnlyTitleWithSingletons constraint of '<em>Singleton Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SINGLETON_UNIT__CAN_ONLY_TITLE_WITH_SINGLETONS__EEXPRESSION = "not title.oclIsUndefined() implies \n" +
		"\tif title.oclIsKindOf(persistence::Attribute) then\n" +
		"\t\ttitle.oclAsType(persistence::Attribute).cardinality <> persistence::Cardinality::Many\n" +
		"\telse\n" +
		"\t\ttrue\n" +
		"\tendif";

	/**
	 * Validates the canOnlyTitleWithSingletons constraint of '<em>Singleton Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonUnit_canOnlyTitleWithSingletons(SingletonUnit singletonUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.SINGLETON_UNIT,
				 singletonUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyTitleWithSingletons",
				 SINGLETON_UNIT__CAN_ONLY_TITLE_WITH_SINGLETONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionUnit(CollectionUnit collectionUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(collectionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(collectionUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the canOnlyTitleWithSingletons constraint of '<em>Collection Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLLECTION_UNIT__CAN_ONLY_TITLE_WITH_SINGLETONS__EEXPRESSION = "not unitTitle.oclIsUndefined() implies \n" +
		"\tif unitTitle.oclIsKindOf(persistence::Attribute) then\n" +
		"\t\tunitTitle.oclAsType(persistence::Attribute).cardinality <> persistence::Cardinality::Many\n" +
		"\telse\n" +
		"\t\ttrue\n" +
		"\tendif";

	/**
	 * Validates the canOnlyTitleWithSingletons constraint of '<em>Collection Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionUnit_canOnlyTitleWithSingletons(CollectionUnit collectionUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.COLLECTION_UNIT,
				 collectionUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyTitleWithSingletons",
				 COLLECTION_UNIT__CAN_ONLY_TITLE_WITH_SINGLETONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selectionMustNotBeSingleton constraint of '<em>Collection Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLLECTION_UNIT__SELECTION_MUST_NOT_BE_SINGLETON__EEXPRESSION = "not selection.oclIsUndefined() implies\r\n" +
		"\tselection.limit <> 1";

	/**
	 * Validates the selectionMustNotBeSingleton constraint of '<em>Collection Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionUnit_selectionMustNotBeSingleton(CollectionUnit collectionUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.COLLECTION_UNIT,
				 collectionUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionMustNotBeSingleton",
				 COLLECTION_UNIT__SELECTION_MUST_NOT_BE_SINGLETON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(editUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(editUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(createUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(createUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(createUpdateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(createUpdateUnit, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(updateUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(updateUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(mapUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(mapUnit, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDetailsUnit_selectionValidChoice(detailsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDetailsUnit_selectionMustBeSingleton(detailsUnit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the selectionValidChoice constraint of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DETAILS_UNIT__SELECTION_VALID_CHOICE__EEXPRESSION = "not selection.oclIsUndefined() implies\n" +
		"\tpageDisplayedOn.webUI.persistence.repositories\n" +
		"\t\t->select(s : persistence::Repository | not s.serves.oclIsUndefined())\n" +
		"\t\t->select(s : persistence::Repository | contentType = s.serves)\n" +
		"\t\t->collect(s : persistence::Repository | s.selections)\n" +
		"\t\t->includes(selection)";

	/**
	 * Validates the selectionValidChoice constraint of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailsUnit_selectionValidChoice(DetailsUnit detailsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.DETAILS_UNIT,
				 detailsUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionValidChoice",
				 DETAILS_UNIT__SELECTION_VALID_CHOICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selectionMustBeSingleton constraint of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DETAILS_UNIT__SELECTION_MUST_BE_SINGLETON__EEXPRESSION = "not selection.oclIsUndefined() implies\r\n" +
		"\tselection.limit = 1";

	/**
	 * Validates the selectionMustBeSingleton constraint of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailsUnit_selectionMustBeSingleton(DetailsUnit detailsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.DETAILS_UNIT,
				 detailsUnit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selectionMustBeSingleton",
				 DETAILS_UNIT__SELECTION_MUST_BE_SINGLETON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabularUnit(TabularUnit tabularUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tabularUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(tabularUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(tabularUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardsUnit(CardsUnit cardsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cardsUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(cardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(cardsUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextCardsUnit(TextCardsUnit textCardsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textCardsUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(textCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(textCardsUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateCardsUnit(DateCardsUnit dateCardsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateCardsUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(dateCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(dateCardsUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(controlUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(controlUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(searchUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(searchUnit, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(registrationUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(registrationUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(loginUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(loginUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogoutUnit(LogoutUnit logoutUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(logoutUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(logoutUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(logoutUnit, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(forgottenPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(forgottenPasswordUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetPasswordUnit(ResetPasswordUnit resetPasswordUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resetPasswordUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(resetPasswordUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingletonUnit_canOnlyTitleWithSingletons(resetPasswordUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionContainer(ActionContainer actionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(actionContainer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atMostOneDeleteAction constraint of '<em>Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION_CONTAINER__AT_MOST_ONE_DELETE_ACTION__EEXPRESSION = "actions->select(a | a.oclIsKindOf(DeleteAction))->size() < 2";

	/**
	 * Validates the atMostOneDeleteAction constraint of '<em>Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionContainer_atMostOneDeleteAction(ActionContainer actionContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.ACTION_CONTAINER,
				 actionContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "atMostOneDeleteAction",
				 ACTION_CONTAINER__AT_MOST_ONE_DELETE_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageUnit(ImageUnit imageUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imageUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(imageUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(imageUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageCardsUnit(ImageCardsUnit imageCardsUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imageCardsUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(imageCardsUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(imageCardsUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSliderUnit(SliderUnit sliderUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sliderUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(sliderUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(sliderUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGalleryUnit(GalleryUnit galleryUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(galleryUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionContainer_atMostOneDeleteAction(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDynamicUnit_featuresMustBeFromContentType(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_canOnlyTitleWithSingletons(galleryUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollectionUnit_selectionMustNotBeSingleton(galleryUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(action, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityAction(SecurityAction securityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securityAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(securityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(securityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(securityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(securityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(securityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(securityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(securityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(securityAction, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(securityAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationAction(OperationAction operationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationAction, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(operationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceOperationAction(InstanceOperationAction instanceOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceOperationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(instanceOperationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerOperationAction(ContainerOperationAction containerOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(containerOperationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(containerOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(containerOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(containerOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(containerOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(containerOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(containerOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(containerOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(containerOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(containerOperationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralOperationAction(GeneralOperationAction generalOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalOperationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(generalOperationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticationMenuPlacement(AuthenticationMenuPlacement authenticationMenuPlacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(selectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerSelectAction(ContainerSelectAction containerSelectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(containerSelectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(containerSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(containerSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(containerSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(containerSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(containerSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(containerSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(containerSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(containerSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(containerSelectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSelectAction(InstanceSelectAction instanceSelectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceSelectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceSelectAction, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(instanceSelectAction, diagnostics, context);
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
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(deleteAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeleteAction_canOnlyDeleteSingletons(deleteAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the canOnlyDeleteSingletons constraint of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELETE_ACTION__CAN_ONLY_DELETE_SINGLETONS__EEXPRESSION = "if usedBy.oclIsKindOf(UnitElement) then\n" +
		"\tusedBy.oclAsType(UnitElement).attribute.cardinality <> persistence::Cardinality::Many\n" +
		"else if usedBy.oclIsKindOf(UnitAssociation) then\n" +
		"\tusedBy.oclAsType(UnitAssociation).association.cardinality <> persistence::Cardinality::Many\n" +
		"else\n" +
		"\tusedBy.oclIsKindOf(CollectionUnit)\n" +
		"endif endif\n" +
		"";

	/**
	 * Validates the canOnlyDeleteSingletons constraint of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteAction_canOnlyDeleteSingletons(DeleteAction deleteAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebuiPackage.Literals.DELETE_ACTION,
				 deleteAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "canOnlyDeleteSingletons",
				 DELETE_ACTION__CAN_ONLY_DELETE_SINGLETONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBadge(Badge badge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(badge, diagnostics, context);
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
	public boolean validatePaginationControlPlacements(PaginationControlPlacements paginationControlPlacements, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //WebuiValidator
