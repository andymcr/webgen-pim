/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import work.andycarpenter.webgen.pims.webui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebuiFactoryImpl extends EFactoryImpl implements WebuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebuiFactory init() {
		try {
			WebuiFactory theWebuiFactory = (WebuiFactory)EPackage.Registry.INSTANCE.getEFactory(WebuiPackage.eNS_URI);
			if (theWebuiFactory != null) {
				return theWebuiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebuiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebuiPackage.WEB_UI: return createWebUI();
			case WebuiPackage.NAVIGATION: return createNavigation();
			case WebuiPackage.MENU: return createMenu();
			case WebuiPackage.SUBMENU_ENTRY: return createSubmenuEntry();
			case WebuiPackage.ACTION_MENU_ENTRY: return createActionMenuEntry();
			case WebuiPackage.EDIT_STATIC_TEXT_MENU_ENTRY: return createEditStaticTextMenuEntry();
			case WebuiPackage.MENU_FEATURE: return createMenuFeature();
			case WebuiPackage.COLLECTION_UNIT_STYLES: return createCollectionUnitStyles();
			case WebuiPackage.DEFAULT_UNIT_STYLES: return createDefaultUnitStyles();
			case WebuiPackage.CARDS_UNIT_STYLES: return createCardsUnitStyles();
			case WebuiPackage.DETAILS_UNIT_STYLES: return createDetailsUnitStyles();
			case WebuiPackage.FORM_UNIT_STYLES: return createFormUnitStyles();
			case WebuiPackage.STATIC_UNIT_STYLES: return createStaticUnitStyles();
			case WebuiPackage.TABULAR_UNIT_STYLES: return createTabularUnitStyles();
			case WebuiPackage.CONTROLLER_LINK: return createControllerLink();
			case WebuiPackage.SINGLE_PAGE_CONTROLLER: return createSinglePageController();
			case WebuiPackage.MULTI_PAGE_CONTROLLER: return createMultiPageController();
			case WebuiPackage.STATIC_UNIT: return createStaticUnit();
			case WebuiPackage.CREATE_SITEMAP_UNIT: return createCreateSitemapUnit();
			case WebuiPackage.ROUTE_ACTUAL: return createRouteActual();
			case WebuiPackage.UNIT_ELEMENT: return createUnitElement();
			case WebuiPackage.UNIT_RESOURCE: return createUnitResource();
			case WebuiPackage.UNIT_ASSOCIATION: return createUnitAssociation();
			case WebuiPackage.UNIT_LABEL: return createUnitLabel();
			case WebuiPackage.DATA_TYPE_FIELD: return createDataTypeField();
			case WebuiPackage.DATE_FIELD: return createDateField();
			case WebuiPackage.ARRAY_FILTER: return createArrayFilter();
			case WebuiPackage.BOOLEAN_FILTER: return createBooleanFilter();
			case WebuiPackage.CHOICE_FILTER: return createChoiceFilter();
			case WebuiPackage.COMPARISION_FILTER: return createComparisionFilter();
			case WebuiPackage.DATE_TIME_FILTER: return createDateTimeFilter();
			case WebuiPackage.ENTITY_FILTER: return createEntityFilter();
			case WebuiPackage.NULL_FILTER: return createNullFilter();
			case WebuiPackage.NUMERIC_FILTER: return createNumericFilter();
			case WebuiPackage.TEXT_FILTER: return createTextFilter();
			case WebuiPackage.CREATE_UNIT: return createCreateUnit();
			case WebuiPackage.UPDATE_UNIT: return createUpdateUnit();
			case WebuiPackage.CREATE_UPDATE_UNIT: return createCreateUpdateUnit();
			case WebuiPackage.MAP_UNIT: return createMapUnit();
			case WebuiPackage.DETAILS_UNIT: return createDetailsUnit();
			case WebuiPackage.TABULAR_UNIT: return createTabularUnit();
			case WebuiPackage.BADGE: return createBadge();
			case WebuiPackage.TEXT_CARDS_UNIT: return createTextCardsUnit();
			case WebuiPackage.DATE_CARDS_UNIT: return createDateCardsUnit();
			case WebuiPackage.IMAGE_CARDS_UNIT: return createImageCardsUnit();
			case WebuiPackage.SLIDER_UNIT: return createSliderUnit();
			case WebuiPackage.GALLERY_UNIT: return createGalleryUnit();
			case WebuiPackage.SEARCH_UNIT: return createSearchUnit();
			case WebuiPackage.REGISTRATION_UNIT: return createRegistrationUnit();
			case WebuiPackage.LOGIN_UNIT: return createLoginUnit();
			case WebuiPackage.LOGOUT_UNIT: return createLogoutUnit();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT: return createForgottenPasswordUnit();
			case WebuiPackage.RESET_PASSWORD_UNIT: return createResetPasswordUnit();
			case WebuiPackage.ASSOCIATION_DISPLAY_VALUE: return createAssociationDisplayValue();
			case WebuiPackage.ATTRIBUTE_DISPLAY_VALUE: return createAttributeDisplayValue();
			case WebuiPackage.LABEL_DISPLAY_VALUE: return createLabelDisplayValue();
			case WebuiPackage.RESOURCE_DISPLAY_VALUE: return createResourceDisplayValue();
			case WebuiPackage.SECURITY_ACTION: return createSecurityAction();
			case WebuiPackage.DELETE_ACTION: return createDeleteAction();
			case WebuiPackage.CONTAINER_SELECT_ACTION: return createContainerSelectAction();
			case WebuiPackage.INSTANCE_SELECT_ACTION: return createInstanceSelectAction();
			case WebuiPackage.TARGET_ACTION: return createTargetAction();
			case WebuiPackage.CONTAINER_OPERATION_ACTION: return createContainerOperationAction();
			case WebuiPackage.INSTANCE_OPERATION_ACTION: return createInstanceOperationAction();
			case WebuiPackage.GENERAL_OPERATION_ACTION: return createGeneralOperationAction();
			case WebuiPackage.MESSAGE: return createMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WebuiPackage.AUTHENTICATION_MENU_PLACEMENT:
				return createAuthenticationMenuPlacementFromString(eDataType, initialValue);
			case WebuiPackage.PAGE_TOP_MENU_OPTIONS:
				return createPageTopMenuOptionsFromString(eDataType, initialValue);
			case WebuiPackage.COLLECTION_DISPLAY_OPTIONS:
				return createCollectionDisplayOptionsFromString(eDataType, initialValue);
			case WebuiPackage.CONTAINER_ACTIONS_PLACEMENT:
				return createContainerActionsPlacementFromString(eDataType, initialValue);
			case WebuiPackage.INSTANCE_ACTIONS_PLACEMENT:
				return createInstanceActionsPlacementFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WebuiPackage.AUTHENTICATION_MENU_PLACEMENT:
				return convertAuthenticationMenuPlacementToString(eDataType, instanceValue);
			case WebuiPackage.PAGE_TOP_MENU_OPTIONS:
				return convertPageTopMenuOptionsToString(eDataType, instanceValue);
			case WebuiPackage.COLLECTION_DISPLAY_OPTIONS:
				return convertCollectionDisplayOptionsToString(eDataType, instanceValue);
			case WebuiPackage.CONTAINER_ACTIONS_PLACEMENT:
				return convertContainerActionsPlacementToString(eDataType, instanceValue);
			case WebuiPackage.INSTANCE_ACTIONS_PLACEMENT:
				return convertInstanceActionsPlacementToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebUI createWebUI() {
		WebUIImpl webUI = new WebUIImpl();
		return webUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navigation createNavigation() {
		NavigationImpl navigation = new NavigationImpl();
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubmenuEntry createSubmenuEntry() {
		SubmenuEntryImpl submenuEntry = new SubmenuEntryImpl();
		return submenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionMenuEntry createActionMenuEntry() {
		ActionMenuEntryImpl actionMenuEntry = new ActionMenuEntryImpl();
		return actionMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditStaticTextMenuEntry createEditStaticTextMenuEntry() {
		EditStaticTextMenuEntryImpl editStaticTextMenuEntry = new EditStaticTextMenuEntryImpl();
		return editStaticTextMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuFeature createMenuFeature() {
		MenuFeatureImpl menuFeature = new MenuFeatureImpl();
		return menuFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionUnitStyles createCollectionUnitStyles() {
		CollectionUnitStylesImpl collectionUnitStyles = new CollectionUnitStylesImpl();
		return collectionUnitStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultUnitStyles createDefaultUnitStyles() {
		DefaultUnitStylesImpl defaultUnitStyles = new DefaultUnitStylesImpl();
		return defaultUnitStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardsUnitStyles createCardsUnitStyles() {
		CardsUnitStylesImpl cardsUnitStyles = new CardsUnitStylesImpl();
		return cardsUnitStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailsUnitStyles createDetailsUnitStyles() {
		DetailsUnitStylesImpl detailsUnitStyles = new DetailsUnitStylesImpl();
		return detailsUnitStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormUnitStyles createFormUnitStyles() {
		FormUnitStylesImpl formUnitStyles = new FormUnitStylesImpl();
		return formUnitStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticUnitStyles createStaticUnitStyles() {
		StaticUnitStylesImpl staticUnitStyles = new StaticUnitStylesImpl();
		return staticUnitStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TabularUnitStyles createTabularUnitStyles() {
		TabularUnitStylesImpl tabularUnitStyles = new TabularUnitStylesImpl();
		return tabularUnitStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControllerLink createControllerLink() {
		ControllerLinkImpl controllerLink = new ControllerLinkImpl();
		return controllerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SinglePageController createSinglePageController() {
		SinglePageControllerImpl singlePageController = new SinglePageControllerImpl();
		return singlePageController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPageController createMultiPageController() {
		MultiPageControllerImpl multiPageController = new MultiPageControllerImpl();
		return multiPageController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteActual createRouteActual() {
		RouteActualImpl routeActual = new RouteActualImpl();
		return routeActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticUnit createStaticUnit() {
		StaticUnitImpl staticUnit = new StaticUnitImpl();
		return staticUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateSitemapUnit createCreateSitemapUnit() {
		CreateSitemapUnitImpl createSitemapUnit = new CreateSitemapUnitImpl();
		return createSitemapUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitElement createUnitElement() {
		UnitElementImpl unitElement = new UnitElementImpl();
		return unitElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitResource createUnitResource() {
		UnitResourceImpl unitResource = new UnitResourceImpl();
		return unitResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitAssociation createUnitAssociation() {
		UnitAssociationImpl unitAssociation = new UnitAssociationImpl();
		return unitAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitLabel createUnitLabel() {
		UnitLabelImpl unitLabel = new UnitLabelImpl();
		return unitLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTypeField createDataTypeField() {
		DataTypeFieldImpl dataTypeField = new DataTypeFieldImpl();
		return dataTypeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateField createDateField() {
		DateFieldImpl dateField = new DateFieldImpl();
		return dateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayFilter createArrayFilter() {
		ArrayFilterImpl arrayFilter = new ArrayFilterImpl();
		return arrayFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanFilter createBooleanFilter() {
		BooleanFilterImpl booleanFilter = new BooleanFilterImpl();
		return booleanFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoiceFilter createChoiceFilter() {
		ChoiceFilterImpl choiceFilter = new ChoiceFilterImpl();
		return choiceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisionFilter createComparisionFilter() {
		ComparisionFilterImpl comparisionFilter = new ComparisionFilterImpl();
		return comparisionFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimeFilter createDateTimeFilter() {
		DateTimeFilterImpl dateTimeFilter = new DateTimeFilterImpl();
		return dateTimeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityFilter createEntityFilter() {
		EntityFilterImpl entityFilter = new EntityFilterImpl();
		return entityFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullFilter createNullFilter() {
		NullFilterImpl nullFilter = new NullFilterImpl();
		return nullFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericFilter createNumericFilter() {
		NumericFilterImpl numericFilter = new NumericFilterImpl();
		return numericFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextFilter createTextFilter() {
		TextFilterImpl textFilter = new TextFilterImpl();
		return textFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateUnit createCreateUnit() {
		CreateUnitImpl createUnit = new CreateUnitImpl();
		return createUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateUpdateUnit createCreateUpdateUnit() {
		CreateUpdateUnitImpl createUpdateUnit = new CreateUpdateUnitImpl();
		return createUpdateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateUnit createUpdateUnit() {
		UpdateUnitImpl updateUnit = new UpdateUnitImpl();
		return updateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapUnit createMapUnit() {
		MapUnitImpl mapUnit = new MapUnitImpl();
		return mapUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailsUnit createDetailsUnit() {
		DetailsUnitImpl detailsUnit = new DetailsUnitImpl();
		return detailsUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TabularUnit createTabularUnit() {
		TabularUnitImpl tabularUnit = new TabularUnitImpl();
		return tabularUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextCardsUnit createTextCardsUnit() {
		TextCardsUnitImpl textCardsUnit = new TextCardsUnitImpl();
		return textCardsUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateCardsUnit createDateCardsUnit() {
		DateCardsUnitImpl dateCardsUnit = new DateCardsUnitImpl();
		return dateCardsUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageCardsUnit createImageCardsUnit() {
		ImageCardsUnitImpl imageCardsUnit = new ImageCardsUnitImpl();
		return imageCardsUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchUnit createSearchUnit() {
		SearchUnitImpl searchUnit = new SearchUnitImpl();
		return searchUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegistrationUnit createRegistrationUnit() {
		RegistrationUnitImpl registrationUnit = new RegistrationUnitImpl();
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoginUnit createLoginUnit() {
		LoginUnitImpl loginUnit = new LoginUnitImpl();
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogoutUnit createLogoutUnit() {
		LogoutUnitImpl logoutUnit = new LogoutUnitImpl();
		return logoutUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForgottenPasswordUnit createForgottenPasswordUnit() {
		ForgottenPasswordUnitImpl forgottenPasswordUnit = new ForgottenPasswordUnitImpl();
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResetPasswordUnit createResetPasswordUnit() {
		ResetPasswordUnitImpl resetPasswordUnit = new ResetPasswordUnitImpl();
		return resetPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationDisplayValue createAssociationDisplayValue() {
		AssociationDisplayValueImpl associationDisplayValue = new AssociationDisplayValueImpl();
		return associationDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeDisplayValue createAttributeDisplayValue() {
		AttributeDisplayValueImpl attributeDisplayValue = new AttributeDisplayValueImpl();
		return attributeDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelDisplayValue createLabelDisplayValue() {
		LabelDisplayValueImpl labelDisplayValue = new LabelDisplayValueImpl();
		return labelDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceDisplayValue createResourceDisplayValue() {
		ResourceDisplayValueImpl resourceDisplayValue = new ResourceDisplayValueImpl();
		return resourceDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityAction createSecurityAction() {
		SecurityActionImpl securityAction = new SecurityActionImpl();
		return securityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SliderUnit createSliderUnit() {
		SliderUnitImpl sliderUnit = new SliderUnitImpl();
		return sliderUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GalleryUnit createGalleryUnit() {
		GalleryUnitImpl galleryUnit = new GalleryUnitImpl();
		return galleryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteAction createDeleteAction() {
		DeleteActionImpl deleteAction = new DeleteActionImpl();
		return deleteAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerSelectAction createContainerSelectAction() {
		ContainerSelectActionImpl containerSelectAction = new ContainerSelectActionImpl();
		return containerSelectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceSelectAction createInstanceSelectAction() {
		InstanceSelectActionImpl instanceSelectAction = new InstanceSelectActionImpl();
		return instanceSelectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetAction createTargetAction() {
		TargetActionImpl targetAction = new TargetActionImpl();
		return targetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceOperationAction createInstanceOperationAction() {
		InstanceOperationActionImpl instanceOperationAction = new InstanceOperationActionImpl();
		return instanceOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerOperationAction createContainerOperationAction() {
		ContainerOperationActionImpl containerOperationAction = new ContainerOperationActionImpl();
		return containerOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralOperationAction createGeneralOperationAction() {
		GeneralOperationActionImpl generalOperationAction = new GeneralOperationActionImpl();
		return generalOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationMenuPlacement createAuthenticationMenuPlacementFromString(EDataType eDataType, String initialValue) {
		AuthenticationMenuPlacement result = AuthenticationMenuPlacement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthenticationMenuPlacementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Badge createBadge() {
		BadgeImpl badge = new BadgeImpl();
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageTopMenuOptions createPageTopMenuOptionsFromString(EDataType eDataType, String initialValue) {
		PageTopMenuOptions result = PageTopMenuOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageTopMenuOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDisplayOptions createCollectionDisplayOptionsFromString(EDataType eDataType, String initialValue) {
		CollectionDisplayOptions result = CollectionDisplayOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionDisplayOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerActionsPlacement createContainerActionsPlacementFromString(EDataType eDataType, String initialValue) {
		ContainerActionsPlacement result = ContainerActionsPlacement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerActionsPlacementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceActionsPlacement createInstanceActionsPlacementFromString(EDataType eDataType, String initialValue) {
		InstanceActionsPlacement result = InstanceActionsPlacement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceActionsPlacementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebuiPackage getWebuiPackage() {
		return (WebuiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebuiPackage getPackage() {
		return WebuiPackage.eINSTANCE;
	}

} //WebuiFactoryImpl
