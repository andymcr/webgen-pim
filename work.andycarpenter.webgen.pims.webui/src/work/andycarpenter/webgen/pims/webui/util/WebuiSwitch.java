/**
 */
package work.andycarpenter.webgen.pims.webui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import work.andycarpenter.webgen.pims.base.NamedDisplayElement;
import work.andycarpenter.webgen.pims.base.NamedElement;
import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.Variable;
import work.andycarpenter.webgen.pims.persistence.AssociationReference;
import work.andycarpenter.webgen.pims.persistence.FeatureChildPath;
import work.andycarpenter.webgen.pims.security.SecurityUnit;
import work.andycarpenter.webgen.pims.webui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage
 * @generated
 */
public class WebuiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebuiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebuiSwitch() {
		if (modelPackage == null) {
			modelPackage = WebuiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebuiPackage.WEB_UI: {
				WebUI webUI = (WebUI)theEObject;
				T result = caseWebUI(webUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.NAVIGATION: {
				Navigation navigation = (Navigation)theEObject;
				T result = caseNavigation(navigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseNamedDisplayElement(menu);
				if (result == null) result = caseNamedElement(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MENU_ENTRY: {
				MenuEntry menuEntry = (MenuEntry)theEObject;
				T result = caseMenuEntry(menuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SUBMENU_ENTRY: {
				SubmenuEntry submenuEntry = (SubmenuEntry)theEObject;
				T result = caseSubmenuEntry(submenuEntry);
				if (result == null) result = caseMenu(submenuEntry);
				if (result == null) result = caseMenuEntry(submenuEntry);
				if (result == null) result = caseNamedDisplayElement(submenuEntry);
				if (result == null) result = caseNamedElement(submenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.ACTION_MENU_ENTRY: {
				ActionMenuEntry actionMenuEntry = (ActionMenuEntry)theEObject;
				T result = caseActionMenuEntry(actionMenuEntry);
				if (result == null) result = caseMenuEntry(actionMenuEntry);
				if (result == null) result = caseNamedDisplayElement(actionMenuEntry);
				if (result == null) result = caseNamedElement(actionMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.EDIT_STATIC_TEXT_MENU_ENTRY: {
				EditStaticTextMenuEntry editStaticTextMenuEntry = (EditStaticTextMenuEntry)theEObject;
				T result = caseEditStaticTextMenuEntry(editStaticTextMenuEntry);
				if (result == null) result = caseMenuEntry(editStaticTextMenuEntry);
				if (result == null) result = caseNamedDisplayElement(editStaticTextMenuEntry);
				if (result == null) result = caseNamedElement(editStaticTextMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MENU_FEATURE: {
				MenuFeature menuFeature = (MenuFeature)theEObject;
				T result = caseMenuFeature(menuFeature);
				if (result == null) result = caseMenuEntry(menuFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTENT_UNIT_STYLES: {
				ContentUnitStyles contentUnitStyles = (ContentUnitStyles)theEObject;
				T result = caseContentUnitStyles(contentUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DYNAMIC_UNIT_STYLES: {
				DynamicUnitStyles dynamicUnitStyles = (DynamicUnitStyles)theEObject;
				T result = caseDynamicUnitStyles(dynamicUnitStyles);
				if (result == null) result = caseContentUnitStyles(dynamicUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.COLLECTION_UNIT_STYLES: {
				CollectionUnitStyles collectionUnitStyles = (CollectionUnitStyles)theEObject;
				T result = caseCollectionUnitStyles(collectionUnitStyles);
				if (result == null) result = caseDynamicUnitStyles(collectionUnitStyles);
				if (result == null) result = caseContentUnitStyles(collectionUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DEFAULT_UNIT_STYLES: {
				DefaultUnitStyles defaultUnitStyles = (DefaultUnitStyles)theEObject;
				T result = caseDefaultUnitStyles(defaultUnitStyles);
				if (result == null) result = caseCollectionUnitStyles(defaultUnitStyles);
				if (result == null) result = caseDynamicUnitStyles(defaultUnitStyles);
				if (result == null) result = caseContentUnitStyles(defaultUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CARDS_UNIT_STYLES: {
				CardsUnitStyles cardsUnitStyles = (CardsUnitStyles)theEObject;
				T result = caseCardsUnitStyles(cardsUnitStyles);
				if (result == null) result = caseCollectionUnitStyles(cardsUnitStyles);
				if (result == null) result = caseDynamicUnitStyles(cardsUnitStyles);
				if (result == null) result = caseContentUnitStyles(cardsUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DETAILS_UNIT_STYLES: {
				DetailsUnitStyles detailsUnitStyles = (DetailsUnitStyles)theEObject;
				T result = caseDetailsUnitStyles(detailsUnitStyles);
				if (result == null) result = caseDynamicUnitStyles(detailsUnitStyles);
				if (result == null) result = caseContentUnitStyles(detailsUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FORM_UNIT_STYLES: {
				FormUnitStyles formUnitStyles = (FormUnitStyles)theEObject;
				T result = caseFormUnitStyles(formUnitStyles);
				if (result == null) result = caseDynamicUnitStyles(formUnitStyles);
				if (result == null) result = caseContentUnitStyles(formUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.GALLERY_UNIT_STYLES: {
				GalleryUnitStyles galleryUnitStyles = (GalleryUnitStyles)theEObject;
				T result = caseGalleryUnitStyles(galleryUnitStyles);
				if (result == null) result = caseCollectionUnitStyles(galleryUnitStyles);
				if (result == null) result = caseDynamicUnitStyles(galleryUnitStyles);
				if (result == null) result = caseContentUnitStyles(galleryUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SLIDER_UNIT_STYLES: {
				SliderUnitStyles sliderUnitStyles = (SliderUnitStyles)theEObject;
				T result = caseSliderUnitStyles(sliderUnitStyles);
				if (result == null) result = caseCollectionUnitStyles(sliderUnitStyles);
				if (result == null) result = caseDynamicUnitStyles(sliderUnitStyles);
				if (result == null) result = caseContentUnitStyles(sliderUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.STATIC_UNIT_STYLES: {
				StaticUnitStyles staticUnitStyles = (StaticUnitStyles)theEObject;
				T result = caseStaticUnitStyles(staticUnitStyles);
				if (result == null) result = caseContentUnitStyles(staticUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.TABULAR_UNIT_STYLES: {
				TabularUnitStyles tabularUnitStyles = (TabularUnitStyles)theEObject;
				T result = caseTabularUnitStyles(tabularUnitStyles);
				if (result == null) result = caseCollectionUnitStyles(tabularUnitStyles);
				if (result == null) result = caseDynamicUnitStyles(tabularUnitStyles);
				if (result == null) result = caseContentUnitStyles(tabularUnitStyles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseNamedDisplayElement(controller);
				if (result == null) result = caseNamedElement(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTROLLER_LINK: {
				ControllerLink controllerLink = (ControllerLink)theEObject;
				T result = caseControllerLink(controllerLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SINGLE_PAGE_CONTROLLER: {
				SinglePageController singlePageController = (SinglePageController)theEObject;
				T result = caseSinglePageController(singlePageController);
				if (result == null) result = caseController(singlePageController);
				if (result == null) result = caseNamedDisplayElement(singlePageController);
				if (result == null) result = caseNamedElement(singlePageController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MULTI_PAGE_CONTROLLER: {
				MultiPageController multiPageController = (MultiPageController)theEObject;
				T result = caseMultiPageController(multiPageController);
				if (result == null) result = caseController(multiPageController);
				if (result == null) result = caseNamedDisplayElement(multiPageController);
				if (result == null) result = caseNamedElement(multiPageController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTENT_UNIT: {
				ContentUnit contentUnit = (ContentUnit)theEObject;
				T result = caseContentUnit(contentUnit);
				if (result == null) result = caseNamedDisplayElement(contentUnit);
				if (result == null) result = caseNamedElement(contentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.STATIC_UNIT: {
				StaticUnit staticUnit = (StaticUnit)theEObject;
				T result = caseStaticUnit(staticUnit);
				if (result == null) result = caseContentUnit(staticUnit);
				if (result == null) result = caseNamedDisplayElement(staticUnit);
				if (result == null) result = caseNamedElement(staticUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CREATE_SITEMAP_UNIT: {
				CreateSitemapUnit createSitemapUnit = (CreateSitemapUnit)theEObject;
				T result = caseCreateSitemapUnit(createSitemapUnit);
				if (result == null) result = caseContentUnit(createSitemapUnit);
				if (result == null) result = caseNamedDisplayElement(createSitemapUnit);
				if (result == null) result = caseNamedElement(createSitemapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DYNAMIC_UNIT: {
				DynamicUnit dynamicUnit = (DynamicUnit)theEObject;
				T result = caseDynamicUnit(dynamicUnit);
				if (result == null) result = caseContentUnit(dynamicUnit);
				if (result == null) result = caseActionContainer(dynamicUnit);
				if (result == null) result = caseNamedDisplayElement(dynamicUnit);
				if (result == null) result = caseNamedElement(dynamicUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.ROUTE_ACTUAL: {
				RouteActual routeActual = (RouteActual)theEObject;
				T result = caseRouteActual(routeActual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_FIELD: {
				UnitField unitField = (UnitField)theEObject;
				T result = caseUnitField(unitField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_FEATURE: {
				UnitFeature unitFeature = (UnitFeature)theEObject;
				T result = caseUnitFeature(unitFeature);
				if (result == null) result = caseUnitField(unitFeature);
				if (result == null) result = caseActionContainer(unitFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_ELEMENT: {
				UnitElement unitElement = (UnitElement)theEObject;
				T result = caseUnitElement(unitElement);
				if (result == null) result = caseUnitFeature(unitElement);
				if (result == null) result = caseUnitField(unitElement);
				if (result == null) result = caseActionContainer(unitElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_ASSOCIATION: {
				UnitAssociation unitAssociation = (UnitAssociation)theEObject;
				T result = caseUnitAssociation(unitAssociation);
				if (result == null) result = caseUnitFeature(unitAssociation);
				if (result == null) result = caseAssociationReference(unitAssociation);
				if (result == null) result = caseUnitField(unitAssociation);
				if (result == null) result = caseActionContainer(unitAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CHILD_PATH_ATTRIBUTE: {
				ChildPathAttribute childPathAttribute = (ChildPathAttribute)theEObject;
				T result = caseChildPathAttribute(childPathAttribute);
				if (result == null) result = caseFeatureChildPath(childPathAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CHILD_PATH_ASSOCIATION: {
				ChildPathAssociation childPathAssociation = (ChildPathAssociation)theEObject;
				T result = caseChildPathAssociation(childPathAssociation);
				if (result == null) result = caseFeatureChildPath(childPathAssociation);
				if (result == null) result = caseAssociationReference(childPathAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_PATH: {
				FeaturePath featurePath = (FeaturePath)theEObject;
				T result = caseFeaturePath(featurePath);
				if (result == null) result = caseVariable(featurePath);
				if (result == null) result = caseExpression(featurePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_PATH_ATTRIBUTE: {
				FeaturePathAttribute featurePathAttribute = (FeaturePathAttribute)theEObject;
				T result = caseFeaturePathAttribute(featurePathAttribute);
				if (result == null) result = caseFeaturePath(featurePathAttribute);
				if (result == null) result = caseVariable(featurePathAttribute);
				if (result == null) result = caseExpression(featurePathAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_PATH_ASSOCIATION: {
				FeaturePathAssociation featurePathAssociation = (FeaturePathAssociation)theEObject;
				T result = caseFeaturePathAssociation(featurePathAssociation);
				if (result == null) result = caseFeaturePath(featurePathAssociation);
				if (result == null) result = caseAssociationReference(featurePathAssociation);
				if (result == null) result = caseVariable(featurePathAssociation);
				if (result == null) result = caseExpression(featurePathAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_PATH_LABEL: {
				FeaturePathLabel featurePathLabel = (FeaturePathLabel)theEObject;
				T result = caseFeaturePathLabel(featurePathLabel);
				if (result == null) result = caseFeaturePath(featurePathLabel);
				if (result == null) result = caseVariable(featurePathLabel);
				if (result == null) result = caseExpression(featurePathLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_LABEL: {
				UnitLabel unitLabel = (UnitLabel)theEObject;
				T result = caseUnitLabel(unitLabel);
				if (result == null) result = caseUnitField(unitLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.INTERFACE_FIELD: {
				InterfaceField interfaceField = (InterfaceField)theEObject;
				T result = caseInterfaceField(interfaceField);
				if (result == null) result = caseNamedDisplayElement(interfaceField);
				if (result == null) result = caseUnitField(interfaceField);
				if (result == null) result = caseNamedElement(interfaceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DATA_TYPE_FIELD: {
				DataTypeField dataTypeField = (DataTypeField)theEObject;
				T result = caseDataTypeField(dataTypeField);
				if (result == null) result = caseInterfaceField(dataTypeField);
				if (result == null) result = caseNamedDisplayElement(dataTypeField);
				if (result == null) result = caseUnitField(dataTypeField);
				if (result == null) result = caseNamedElement(dataTypeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DATE_FIELD: {
				DateField dateField = (DateField)theEObject;
				T result = caseDateField(dateField);
				if (result == null) result = caseInterfaceField(dateField);
				if (result == null) result = caseNamedDisplayElement(dateField);
				if (result == null) result = caseUnitField(dateField);
				if (result == null) result = caseNamedElement(dateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SELECTABLE_UNIT: {
				SelectableUnit selectableUnit = (SelectableUnit)theEObject;
				T result = caseSelectableUnit(selectableUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SINGLETON_UNIT: {
				SingletonUnit singletonUnit = (SingletonUnit)theEObject;
				T result = caseSingletonUnit(singletonUnit);
				if (result == null) result = caseDynamicUnit(singletonUnit);
				if (result == null) result = caseContentUnit(singletonUnit);
				if (result == null) result = caseActionContainer(singletonUnit);
				if (result == null) result = caseNamedDisplayElement(singletonUnit);
				if (result == null) result = caseNamedElement(singletonUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.COLLECTION_UNIT: {
				CollectionUnit collectionUnit = (CollectionUnit)theEObject;
				T result = caseCollectionUnit(collectionUnit);
				if (result == null) result = caseDynamicUnit(collectionUnit);
				if (result == null) result = caseSelectableUnit(collectionUnit);
				if (result == null) result = caseContentUnit(collectionUnit);
				if (result == null) result = caseActionContainer(collectionUnit);
				if (result == null) result = caseNamedDisplayElement(collectionUnit);
				if (result == null) result = caseNamedElement(collectionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.EDIT_UNIT: {
				EditUnit editUnit = (EditUnit)theEObject;
				T result = caseEditUnit(editUnit);
				if (result == null) result = caseSingletonUnit(editUnit);
				if (result == null) result = caseDynamicUnit(editUnit);
				if (result == null) result = caseContentUnit(editUnit);
				if (result == null) result = caseActionContainer(editUnit);
				if (result == null) result = caseNamedDisplayElement(editUnit);
				if (result == null) result = caseNamedElement(editUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CREATE_UNIT: {
				CreateUnit createUnit = (CreateUnit)theEObject;
				T result = caseCreateUnit(createUnit);
				if (result == null) result = caseEditUnit(createUnit);
				if (result == null) result = caseSingletonUnit(createUnit);
				if (result == null) result = caseDynamicUnit(createUnit);
				if (result == null) result = caseContentUnit(createUnit);
				if (result == null) result = caseActionContainer(createUnit);
				if (result == null) result = caseNamedDisplayElement(createUnit);
				if (result == null) result = caseNamedElement(createUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UPDATE_UNIT: {
				UpdateUnit updateUnit = (UpdateUnit)theEObject;
				T result = caseUpdateUnit(updateUnit);
				if (result == null) result = caseEditUnit(updateUnit);
				if (result == null) result = caseSelectableUnit(updateUnit);
				if (result == null) result = caseSingletonUnit(updateUnit);
				if (result == null) result = caseDynamicUnit(updateUnit);
				if (result == null) result = caseContentUnit(updateUnit);
				if (result == null) result = caseActionContainer(updateUnit);
				if (result == null) result = caseNamedDisplayElement(updateUnit);
				if (result == null) result = caseNamedElement(updateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CREATE_UPDATE_UNIT: {
				CreateUpdateUnit createUpdateUnit = (CreateUpdateUnit)theEObject;
				T result = caseCreateUpdateUnit(createUpdateUnit);
				if (result == null) result = caseEditUnit(createUpdateUnit);
				if (result == null) result = caseSelectableUnit(createUpdateUnit);
				if (result == null) result = caseSingletonUnit(createUpdateUnit);
				if (result == null) result = caseDynamicUnit(createUpdateUnit);
				if (result == null) result = caseContentUnit(createUpdateUnit);
				if (result == null) result = caseActionContainer(createUpdateUnit);
				if (result == null) result = caseNamedDisplayElement(createUpdateUnit);
				if (result == null) result = caseNamedElement(createUpdateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MAP_UNIT: {
				MapUnit mapUnit = (MapUnit)theEObject;
				T result = caseMapUnit(mapUnit);
				if (result == null) result = caseEditUnit(mapUnit);
				if (result == null) result = caseSelectableUnit(mapUnit);
				if (result == null) result = caseSingletonUnit(mapUnit);
				if (result == null) result = caseDynamicUnit(mapUnit);
				if (result == null) result = caseContentUnit(mapUnit);
				if (result == null) result = caseActionContainer(mapUnit);
				if (result == null) result = caseNamedDisplayElement(mapUnit);
				if (result == null) result = caseNamedElement(mapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DETAILS_UNIT: {
				DetailsUnit detailsUnit = (DetailsUnit)theEObject;
				T result = caseDetailsUnit(detailsUnit);
				if (result == null) result = caseSingletonUnit(detailsUnit);
				if (result == null) result = caseSelectableUnit(detailsUnit);
				if (result == null) result = caseDynamicUnit(detailsUnit);
				if (result == null) result = caseContentUnit(detailsUnit);
				if (result == null) result = caseActionContainer(detailsUnit);
				if (result == null) result = caseNamedDisplayElement(detailsUnit);
				if (result == null) result = caseNamedElement(detailsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.TABULAR_UNIT: {
				TabularUnit tabularUnit = (TabularUnit)theEObject;
				T result = caseTabularUnit(tabularUnit);
				if (result == null) result = caseCollectionUnit(tabularUnit);
				if (result == null) result = caseDynamicUnit(tabularUnit);
				if (result == null) result = caseSelectableUnit(tabularUnit);
				if (result == null) result = caseContentUnit(tabularUnit);
				if (result == null) result = caseActionContainer(tabularUnit);
				if (result == null) result = caseNamedDisplayElement(tabularUnit);
				if (result == null) result = caseNamedElement(tabularUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CARDS_UNIT: {
				CardsUnit cardsUnit = (CardsUnit)theEObject;
				T result = caseCardsUnit(cardsUnit);
				if (result == null) result = caseCollectionUnit(cardsUnit);
				if (result == null) result = caseDynamicUnit(cardsUnit);
				if (result == null) result = caseSelectableUnit(cardsUnit);
				if (result == null) result = caseContentUnit(cardsUnit);
				if (result == null) result = caseActionContainer(cardsUnit);
				if (result == null) result = caseNamedDisplayElement(cardsUnit);
				if (result == null) result = caseNamedElement(cardsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.BADGE: {
				Badge badge = (Badge)theEObject;
				T result = caseBadge(badge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.TEXT_CARDS_UNIT: {
				TextCardsUnit textCardsUnit = (TextCardsUnit)theEObject;
				T result = caseTextCardsUnit(textCardsUnit);
				if (result == null) result = caseCardsUnit(textCardsUnit);
				if (result == null) result = caseCollectionUnit(textCardsUnit);
				if (result == null) result = caseDynamicUnit(textCardsUnit);
				if (result == null) result = caseSelectableUnit(textCardsUnit);
				if (result == null) result = caseContentUnit(textCardsUnit);
				if (result == null) result = caseActionContainer(textCardsUnit);
				if (result == null) result = caseNamedDisplayElement(textCardsUnit);
				if (result == null) result = caseNamedElement(textCardsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DATE_CARDS_UNIT: {
				DateCardsUnit dateCardsUnit = (DateCardsUnit)theEObject;
				T result = caseDateCardsUnit(dateCardsUnit);
				if (result == null) result = caseCardsUnit(dateCardsUnit);
				if (result == null) result = caseCollectionUnit(dateCardsUnit);
				if (result == null) result = caseDynamicUnit(dateCardsUnit);
				if (result == null) result = caseSelectableUnit(dateCardsUnit);
				if (result == null) result = caseContentUnit(dateCardsUnit);
				if (result == null) result = caseActionContainer(dateCardsUnit);
				if (result == null) result = caseNamedDisplayElement(dateCardsUnit);
				if (result == null) result = caseNamedElement(dateCardsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.IMAGE_UNIT: {
				ImageUnit imageUnit = (ImageUnit)theEObject;
				T result = caseImageUnit(imageUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.IMAGE_CARDS_UNIT: {
				ImageCardsUnit imageCardsUnit = (ImageCardsUnit)theEObject;
				T result = caseImageCardsUnit(imageCardsUnit);
				if (result == null) result = caseCardsUnit(imageCardsUnit);
				if (result == null) result = caseImageUnit(imageCardsUnit);
				if (result == null) result = caseCollectionUnit(imageCardsUnit);
				if (result == null) result = caseDynamicUnit(imageCardsUnit);
				if (result == null) result = caseSelectableUnit(imageCardsUnit);
				if (result == null) result = caseContentUnit(imageCardsUnit);
				if (result == null) result = caseActionContainer(imageCardsUnit);
				if (result == null) result = caseNamedDisplayElement(imageCardsUnit);
				if (result == null) result = caseNamedElement(imageCardsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SLIDER_UNIT: {
				SliderUnit sliderUnit = (SliderUnit)theEObject;
				T result = caseSliderUnit(sliderUnit);
				if (result == null) result = caseCollectionUnit(sliderUnit);
				if (result == null) result = caseImageUnit(sliderUnit);
				if (result == null) result = caseDynamicUnit(sliderUnit);
				if (result == null) result = caseSelectableUnit(sliderUnit);
				if (result == null) result = caseContentUnit(sliderUnit);
				if (result == null) result = caseActionContainer(sliderUnit);
				if (result == null) result = caseNamedDisplayElement(sliderUnit);
				if (result == null) result = caseNamedElement(sliderUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.GALLERY_UNIT: {
				GalleryUnit galleryUnit = (GalleryUnit)theEObject;
				T result = caseGalleryUnit(galleryUnit);
				if (result == null) result = caseCollectionUnit(galleryUnit);
				if (result == null) result = caseImageUnit(galleryUnit);
				if (result == null) result = caseDynamicUnit(galleryUnit);
				if (result == null) result = caseSelectableUnit(galleryUnit);
				if (result == null) result = caseContentUnit(galleryUnit);
				if (result == null) result = caseActionContainer(galleryUnit);
				if (result == null) result = caseNamedDisplayElement(galleryUnit);
				if (result == null) result = caseNamedElement(galleryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTROL_UNIT: {
				ControlUnit controlUnit = (ControlUnit)theEObject;
				T result = caseControlUnit(controlUnit);
				if (result == null) result = caseDynamicUnit(controlUnit);
				if (result == null) result = caseContentUnit(controlUnit);
				if (result == null) result = caseActionContainer(controlUnit);
				if (result == null) result = caseNamedDisplayElement(controlUnit);
				if (result == null) result = caseNamedElement(controlUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SEARCH_UNIT: {
				SearchUnit searchUnit = (SearchUnit)theEObject;
				T result = caseSearchUnit(searchUnit);
				if (result == null) result = caseControlUnit(searchUnit);
				if (result == null) result = caseDynamicUnit(searchUnit);
				if (result == null) result = caseContentUnit(searchUnit);
				if (result == null) result = caseActionContainer(searchUnit);
				if (result == null) result = caseNamedDisplayElement(searchUnit);
				if (result == null) result = caseNamedElement(searchUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.REGISTRATION_UNIT: {
				RegistrationUnit registrationUnit = (RegistrationUnit)theEObject;
				T result = caseRegistrationUnit(registrationUnit);
				if (result == null) result = caseEditUnit(registrationUnit);
				if (result == null) result = caseSecurityUnit(registrationUnit);
				if (result == null) result = caseSingletonUnit(registrationUnit);
				if (result == null) result = caseDynamicUnit(registrationUnit);
				if (result == null) result = caseContentUnit(registrationUnit);
				if (result == null) result = caseActionContainer(registrationUnit);
				if (result == null) result = caseNamedDisplayElement(registrationUnit);
				if (result == null) result = caseNamedElement(registrationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.LOGIN_UNIT: {
				LoginUnit loginUnit = (LoginUnit)theEObject;
				T result = caseLoginUnit(loginUnit);
				if (result == null) result = caseEditUnit(loginUnit);
				if (result == null) result = caseSecurityUnit(loginUnit);
				if (result == null) result = caseSingletonUnit(loginUnit);
				if (result == null) result = caseDynamicUnit(loginUnit);
				if (result == null) result = caseContentUnit(loginUnit);
				if (result == null) result = caseActionContainer(loginUnit);
				if (result == null) result = caseNamedDisplayElement(loginUnit);
				if (result == null) result = caseNamedElement(loginUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.LOGOUT_UNIT: {
				LogoutUnit logoutUnit = (LogoutUnit)theEObject;
				T result = caseLogoutUnit(logoutUnit);
				if (result == null) result = caseDynamicUnit(logoutUnit);
				if (result == null) result = caseSecurityUnit(logoutUnit);
				if (result == null) result = caseContentUnit(logoutUnit);
				if (result == null) result = caseActionContainer(logoutUnit);
				if (result == null) result = caseNamedDisplayElement(logoutUnit);
				if (result == null) result = caseNamedElement(logoutUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT: {
				ForgottenPasswordUnit forgottenPasswordUnit = (ForgottenPasswordUnit)theEObject;
				T result = caseForgottenPasswordUnit(forgottenPasswordUnit);
				if (result == null) result = caseEditUnit(forgottenPasswordUnit);
				if (result == null) result = caseSecurityUnit(forgottenPasswordUnit);
				if (result == null) result = caseSingletonUnit(forgottenPasswordUnit);
				if (result == null) result = caseDynamicUnit(forgottenPasswordUnit);
				if (result == null) result = caseContentUnit(forgottenPasswordUnit);
				if (result == null) result = caseActionContainer(forgottenPasswordUnit);
				if (result == null) result = caseNamedDisplayElement(forgottenPasswordUnit);
				if (result == null) result = caseNamedElement(forgottenPasswordUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.RESET_PASSWORD_UNIT: {
				ResetPasswordUnit resetPasswordUnit = (ResetPasswordUnit)theEObject;
				T result = caseResetPasswordUnit(resetPasswordUnit);
				if (result == null) result = caseEditUnit(resetPasswordUnit);
				if (result == null) result = caseSecurityUnit(resetPasswordUnit);
				if (result == null) result = caseSingletonUnit(resetPasswordUnit);
				if (result == null) result = caseDynamicUnit(resetPasswordUnit);
				if (result == null) result = caseContentUnit(resetPasswordUnit);
				if (result == null) result = caseActionContainer(resetPasswordUnit);
				if (result == null) result = caseNamedDisplayElement(resetPasswordUnit);
				if (result == null) result = caseNamedElement(resetPasswordUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.ACTION_CONTAINER: {
				ActionContainer actionContainer = (ActionContainer)theEObject;
				T result = caseActionContainer(actionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedDisplayElement(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SECURITY_ACTION: {
				SecurityAction securityAction = (SecurityAction)theEObject;
				T result = caseSecurityAction(securityAction);
				if (result == null) result = caseAction(securityAction);
				if (result == null) result = caseNamedDisplayElement(securityAction);
				if (result == null) result = caseNamedElement(securityAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DELETE_ACTION: {
				DeleteAction deleteAction = (DeleteAction)theEObject;
				T result = caseDeleteAction(deleteAction);
				if (result == null) result = caseAction(deleteAction);
				if (result == null) result = caseNamedDisplayElement(deleteAction);
				if (result == null) result = caseNamedElement(deleteAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SELECT_ACTION: {
				SelectAction selectAction = (SelectAction)theEObject;
				T result = caseSelectAction(selectAction);
				if (result == null) result = caseAction(selectAction);
				if (result == null) result = caseNamedDisplayElement(selectAction);
				if (result == null) result = caseNamedElement(selectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTAINER_SELECT_ACTION: {
				ContainerSelectAction containerSelectAction = (ContainerSelectAction)theEObject;
				T result = caseContainerSelectAction(containerSelectAction);
				if (result == null) result = caseSelectAction(containerSelectAction);
				if (result == null) result = caseAction(containerSelectAction);
				if (result == null) result = caseNamedDisplayElement(containerSelectAction);
				if (result == null) result = caseNamedElement(containerSelectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.INSTANCE_SELECT_ACTION: {
				InstanceSelectAction instanceSelectAction = (InstanceSelectAction)theEObject;
				T result = caseInstanceSelectAction(instanceSelectAction);
				if (result == null) result = caseSelectAction(instanceSelectAction);
				if (result == null) result = caseAction(instanceSelectAction);
				if (result == null) result = caseNamedDisplayElement(instanceSelectAction);
				if (result == null) result = caseNamedElement(instanceSelectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.TARGET_ACTION: {
				TargetAction targetAction = (TargetAction)theEObject;
				T result = caseTargetAction(targetAction);
				if (result == null) result = caseSelectAction(targetAction);
				if (result == null) result = caseAction(targetAction);
				if (result == null) result = caseNamedDisplayElement(targetAction);
				if (result == null) result = caseNamedElement(targetAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.OPERATION_ACTION: {
				OperationAction operationAction = (OperationAction)theEObject;
				T result = caseOperationAction(operationAction);
				if (result == null) result = caseAction(operationAction);
				if (result == null) result = caseNamedDisplayElement(operationAction);
				if (result == null) result = caseNamedElement(operationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTAINER_OPERATION_ACTION: {
				ContainerOperationAction containerOperationAction = (ContainerOperationAction)theEObject;
				T result = caseContainerOperationAction(containerOperationAction);
				if (result == null) result = caseOperationAction(containerOperationAction);
				if (result == null) result = caseAction(containerOperationAction);
				if (result == null) result = caseNamedDisplayElement(containerOperationAction);
				if (result == null) result = caseNamedElement(containerOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.INSTANCE_OPERATION_ACTION: {
				InstanceOperationAction instanceOperationAction = (InstanceOperationAction)theEObject;
				T result = caseInstanceOperationAction(instanceOperationAction);
				if (result == null) result = caseOperationAction(instanceOperationAction);
				if (result == null) result = caseAction(instanceOperationAction);
				if (result == null) result = caseNamedDisplayElement(instanceOperationAction);
				if (result == null) result = caseNamedElement(instanceOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.GENERAL_OPERATION_ACTION: {
				GeneralOperationAction generalOperationAction = (GeneralOperationAction)theEObject;
				T result = caseGeneralOperationAction(generalOperationAction);
				if (result == null) result = caseOperationAction(generalOperationAction);
				if (result == null) result = caseAction(generalOperationAction);
				if (result == null) result = caseNamedDisplayElement(generalOperationAction);
				if (result == null) result = caseNamedElement(generalOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebUI(WebUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigation(Navigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuEntry(MenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submenu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submenu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmenuEntry(SubmenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionMenuEntry(ActionMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Static Text Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Static Text Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditStaticTextMenuEntry(EditStaticTextMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuFeature(MenuFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentUnitStyles(ContentUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicUnitStyles(DynamicUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultUnitStyles(DefaultUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionUnitStyles(CollectionUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cards Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cards Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardsUnitStyles(CardsUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailsUnitStyles(DetailsUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormUnitStyles(FormUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gallery Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gallery Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGalleryUnitStyles(GalleryUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slider Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slider Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSliderUnitStyles(SliderUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticUnitStyles(StaticUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabular Unit Styles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabular Unit Styles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabularUnitStyles(TabularUnitStyles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerLink(ControllerLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Page Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Page Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinglePageController(SinglePageController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Page Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Page Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPageController(MultiPageController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentUnit(ContentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Actual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Actual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteActual(RouteActual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticUnit(StaticUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Sitemap Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Sitemap Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSitemapUnit(CreateSitemapUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicUnit(DynamicUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitField(UnitField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitFeature(UnitFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitElement(UnitElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitAssociation(UnitAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationReference(AssociationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Child Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Child Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureChildPath(FeatureChildPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityUnit(SecurityUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Path Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Path Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildPathAttribute(ChildPathAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Path Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Path Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildPathAssociation(ChildPathAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePath(FeaturePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePathAttribute(FeaturePathAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePathAssociation(FeaturePathAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePathLabel(FeaturePathLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitLabel(UnitLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceField(InterfaceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeField(DataTypeField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateField(DateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selectable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selectable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectableUnit(SelectableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonUnit(SingletonUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionUnit(CollectionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditUnit(EditUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateUnit(CreateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Update Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateUpdateUnit(CreateUpdateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateUnit(UpdateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapUnit(MapUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailsUnit(DetailsUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabular Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabular Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabularUnit(TabularUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cards Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cards Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardsUnit(CardsUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Cards Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Cards Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextCardsUnit(TextCardsUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Cards Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Cards Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateCardsUnit(DateCardsUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlUnit(ControlUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchUnit(SearchUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registration Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registration Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistrationUnit(RegistrationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginUnit(LoginUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logout Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logout Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogoutUnit(LogoutUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forgotten Password Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forgotten Password Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForgottenPasswordUnit(ForgottenPasswordUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Password Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Password Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetPasswordUnit(ResetPasswordUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionContainer(ActionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageUnit(ImageUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Cards Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Cards Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageCardsUnit(ImageCardsUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slider Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slider Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSliderUnit(SliderUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gallery Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gallery Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGalleryUnit(GalleryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityAction(SecurityAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAction(OperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceOperationAction(InstanceOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerOperationAction(ContainerOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralOperationAction(GeneralOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Display Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Display Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedDisplayElement(NamedDisplayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectAction(SelectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Select Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerSelectAction(ContainerSelectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Select Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSelectAction(InstanceSelectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetAction(TargetAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteAction(DeleteAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBadge(Badge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebuiSwitch
