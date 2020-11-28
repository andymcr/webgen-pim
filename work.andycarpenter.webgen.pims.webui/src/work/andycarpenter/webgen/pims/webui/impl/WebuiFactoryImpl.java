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
			case WebuiPackage.MENU: return createMenu();
			case WebuiPackage.SUBMENU_ENTRY: return createSubmenuEntry();
			case WebuiPackage.ACTION_MENU_ENTRY: return createActionMenuEntry();
			case WebuiPackage.EDIT_STATIC_TEXT_MENU_ENTRY: return createEditStaticTextMenuEntry();
			case WebuiPackage.MENU_FEATURE: return createMenuFeature();
			case WebuiPackage.QUERY: return createQuery();
			case WebuiPackage.QUERY_PARAMETER: return createQueryParameter();
			case WebuiPackage.PAGE: return createPage();
			case WebuiPackage.PAGE_LINK: return createPageLink();
			case WebuiPackage.ROUTE_ACTUAL: return createRouteActual();
			case WebuiPackage.STATIC_UNIT: return createStaticUnit();
			case WebuiPackage.CREATE_SITEMAP_UNIT: return createCreateSitemapUnit();
			case WebuiPackage.UNIT_ELEMENT: return createUnitElement();
			case WebuiPackage.UNIT_ASSOCIATION: return createUnitAssociation();
			case WebuiPackage.CHILD_PATH_ATTRIBUTE: return createChildPathAttribute();
			case WebuiPackage.CHILD_PATH_ASSOCIATION: return createChildPathAssociation();
			case WebuiPackage.FEATURE_PATH_ATTRIBUTE: return createFeaturePathAttribute();
			case WebuiPackage.FEATURE_PATH_ASSOCIATION: return createFeaturePathAssociation();
			case WebuiPackage.FEATURE_PATH_LABEL: return createFeaturePathLabel();
			case WebuiPackage.UNIT_LABEL: return createUnitLabel();
			case WebuiPackage.DATA_TYPE_FIELD: return createDataTypeField();
			case WebuiPackage.DATE_FIELD: return createDateField();
			case WebuiPackage.CAPTCHA_FIELD: return createCaptchaField();
			case WebuiPackage.UNIT_SUPPORT_ACTION: return createUnitSupportAction();
			case WebuiPackage.CREATE_UNIT: return createCreateUnit();
			case WebuiPackage.CREATE_UPDATE_UNIT: return createCreateUpdateUnit();
			case WebuiPackage.UPDATE_UNIT: return createUpdateUnit();
			case WebuiPackage.MAP_UNIT: return createMapUnit();
			case WebuiPackage.DETAILS_UNIT: return createDetailsUnit();
			case WebuiPackage.INDEX_UNIT: return createIndexUnit();
			case WebuiPackage.BADGE: return createBadge();
			case WebuiPackage.TEXT_CARDS_UNIT: return createTextCardsUnit();
			case WebuiPackage.DATE_CARDS_UNIT: return createDateCardsUnit();
			case WebuiPackage.IMAGE_CARDS_UNIT: return createImageCardsUnit();
			case WebuiPackage.SLIDER_UNIT: return createSliderUnit();
			case WebuiPackage.GALLERY_UNIT: return createGalleryUnit();
			case WebuiPackage.SEARCH_UNIT: return createSearchUnit();
			case WebuiPackage.SELECT_ACTION: return createSelectAction();
			case WebuiPackage.DELETE_ACTION: return createDeleteAction();
			case WebuiPackage.FEATURE_SUPPORT_ACTION: return createFeatureSupportAction();
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
			case WebuiPackage.INPUT_TECHNOLOGIES:
				return createInputTechnologiesFromString(eDataType, initialValue);
			case WebuiPackage.AJAX_TECHNOLOGIES:
				return createAjaxTechnologiesFromString(eDataType, initialValue);
			case WebuiPackage.PAGE_TOP_MENU_OPTIONS:
				return createPageTopMenuOptionsFromString(eDataType, initialValue);
			case WebuiPackage.COLLECTION_DISPLAY_OPTIONS:
				return createCollectionDisplayOptionsFromString(eDataType, initialValue);
			case WebuiPackage.PAGINATION_CONTROL_PLACEMENTS:
				return createPaginationControlPlacementsFromString(eDataType, initialValue);
			case WebuiPackage.INDEX_DISPLAY_OPTION:
				return createIndexDisplayOptionFromString(eDataType, initialValue);
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
			case WebuiPackage.INPUT_TECHNOLOGIES:
				return convertInputTechnologiesToString(eDataType, instanceValue);
			case WebuiPackage.AJAX_TECHNOLOGIES:
				return convertAjaxTechnologiesToString(eDataType, instanceValue);
			case WebuiPackage.PAGE_TOP_MENU_OPTIONS:
				return convertPageTopMenuOptionsToString(eDataType, instanceValue);
			case WebuiPackage.COLLECTION_DISPLAY_OPTIONS:
				return convertCollectionDisplayOptionsToString(eDataType, instanceValue);
			case WebuiPackage.PAGINATION_CONTROL_PLACEMENTS:
				return convertPaginationControlPlacementsToString(eDataType, instanceValue);
			case WebuiPackage.INDEX_DISPLAY_OPTION:
				return convertIndexDisplayOptionToString(eDataType, instanceValue);
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
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryParameter createQueryParameter() {
		QueryParameterImpl queryParameter = new QueryParameterImpl();
		return queryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageLink createPageLink() {
		PageLinkImpl pageLink = new PageLinkImpl();
		return pageLink;
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
	public ChildPathAttribute createChildPathAttribute() {
		ChildPathAttributeImpl childPathAttribute = new ChildPathAttributeImpl();
		return childPathAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildPathAssociation createChildPathAssociation() {
		ChildPathAssociationImpl childPathAssociation = new ChildPathAssociationImpl();
		return childPathAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePathAttribute createFeaturePathAttribute() {
		FeaturePathAttributeImpl featurePathAttribute = new FeaturePathAttributeImpl();
		return featurePathAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePathAssociation createFeaturePathAssociation() {
		FeaturePathAssociationImpl featurePathAssociation = new FeaturePathAssociationImpl();
		return featurePathAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePathLabel createFeaturePathLabel() {
		FeaturePathLabelImpl featurePathLabel = new FeaturePathLabelImpl();
		return featurePathLabel;
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
	public CaptchaField createCaptchaField() {
		CaptchaFieldImpl captchaField = new CaptchaFieldImpl();
		return captchaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitSupportAction createUnitSupportAction() {
		UnitSupportActionImpl unitSupportAction = new UnitSupportActionImpl();
		return unitSupportAction;
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
	public IndexUnit createIndexUnit() {
		IndexUnitImpl indexUnit = new IndexUnitImpl();
		return indexUnit;
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
	public SelectAction createSelectAction() {
		SelectActionImpl selectAction = new SelectActionImpl();
		return selectAction;
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
	public FeatureSupportAction createFeatureSupportAction() {
		FeatureSupportActionImpl featureSupportAction = new FeatureSupportActionImpl();
		return featureSupportAction;
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
	public InputTechnologies createInputTechnologiesFromString(EDataType eDataType, String initialValue) {
		InputTechnologies result = InputTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjaxTechnologies createAjaxTechnologiesFromString(EDataType eDataType, String initialValue) {
		AjaxTechnologies result = AjaxTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAjaxTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public PaginationControlPlacements createPaginationControlPlacementsFromString(EDataType eDataType, String initialValue) {
		PaginationControlPlacements result = PaginationControlPlacements.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaginationControlPlacementsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexDisplayOption createIndexDisplayOptionFromString(EDataType eDataType, String initialValue) {
		IndexDisplayOption result = IndexDisplayOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexDisplayOptionToString(EDataType eDataType, Object instanceValue) {
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
