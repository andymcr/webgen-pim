/**
 */
package work.andycarpenter.webgen.pims.webui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import work.andycarpenter.webgen.pims.base.NamedDisplayElement;
import work.andycarpenter.webgen.pims.base.NamedElement;
import work.andycarpenter.webgen.pims.persistence.AssociationPathElement;
import work.andycarpenter.webgen.pims.persistence.AttributePathElement;
import work.andycarpenter.webgen.pims.persistence.FeatureVariableContext;
import work.andycarpenter.webgen.pims.persistence.Path;
import work.andycarpenter.webgen.pims.persistence.ResourcePathElement;
import work.andycarpenter.webgen.pims.security.SecurityUnit;
import work.andycarpenter.webgen.pims.webui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage
 * @generated
 */
public class WebuiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebuiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebuiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebuiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebuiSwitch<Adapter> modelSwitch =
		new WebuiSwitch<Adapter>() {
			@Override
			public Adapter caseWebUI(WebUI object) {
				return createWebUIAdapter();
			}
			@Override
			public Adapter caseNavigation(Navigation object) {
				return createNavigationAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseMenuEntry(MenuEntry object) {
				return createMenuEntryAdapter();
			}
			@Override
			public Adapter caseSubmenuEntry(SubmenuEntry object) {
				return createSubmenuEntryAdapter();
			}
			@Override
			public Adapter caseActionMenuEntry(ActionMenuEntry object) {
				return createActionMenuEntryAdapter();
			}
			@Override
			public Adapter caseEditStaticTextMenuEntry(EditStaticTextMenuEntry object) {
				return createEditStaticTextMenuEntryAdapter();
			}
			@Override
			public Adapter caseMenuFeature(MenuFeature object) {
				return createMenuFeatureAdapter();
			}
			@Override
			public Adapter caseContentUnitStyles(ContentUnitStyles object) {
				return createContentUnitStylesAdapter();
			}
			@Override
			public Adapter caseDynamicUnitStyles(DynamicUnitStyles object) {
				return createDynamicUnitStylesAdapter();
			}
			@Override
			public Adapter caseCollectionUnitStyles(CollectionUnitStyles object) {
				return createCollectionUnitStylesAdapter();
			}
			@Override
			public Adapter caseDefaultUnitStyles(DefaultUnitStyles object) {
				return createDefaultUnitStylesAdapter();
			}
			@Override
			public Adapter caseCardsUnitStyles(CardsUnitStyles object) {
				return createCardsUnitStylesAdapter();
			}
			@Override
			public Adapter caseDetailsUnitStyles(DetailsUnitStyles object) {
				return createDetailsUnitStylesAdapter();
			}
			@Override
			public Adapter caseFormUnitStyles(FormUnitStyles object) {
				return createFormUnitStylesAdapter();
			}
			@Override
			public Adapter caseGalleryUnitStyles(GalleryUnitStyles object) {
				return createGalleryUnitStylesAdapter();
			}
			@Override
			public Adapter caseSliderUnitStyles(SliderUnitStyles object) {
				return createSliderUnitStylesAdapter();
			}
			@Override
			public Adapter caseStaticUnitStyles(StaticUnitStyles object) {
				return createStaticUnitStylesAdapter();
			}
			@Override
			public Adapter caseTabularUnitStyles(TabularUnitStyles object) {
				return createTabularUnitStylesAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseControllerLink(ControllerLink object) {
				return createControllerLinkAdapter();
			}
			@Override
			public Adapter caseSinglePageController(SinglePageController object) {
				return createSinglePageControllerAdapter();
			}
			@Override
			public Adapter caseMultiPageController(MultiPageController object) {
				return createMultiPageControllerAdapter();
			}
			@Override
			public Adapter caseContentUnit(ContentUnit object) {
				return createContentUnitAdapter();
			}
			@Override
			public Adapter caseStaticUnit(StaticUnit object) {
				return createStaticUnitAdapter();
			}
			@Override
			public Adapter caseCreateSitemapUnit(CreateSitemapUnit object) {
				return createCreateSitemapUnitAdapter();
			}
			@Override
			public Adapter caseDynamicUnit(DynamicUnit object) {
				return createDynamicUnitAdapter();
			}
			@Override
			public Adapter caseRouteActual(RouteActual object) {
				return createRouteActualAdapter();
			}
			@Override
			public Adapter caseUnitField(UnitField object) {
				return createUnitFieldAdapter();
			}
			@Override
			public Adapter caseUnitFeature(UnitFeature object) {
				return createUnitFeatureAdapter();
			}
			@Override
			public Adapter caseUnitElement(UnitElement object) {
				return createUnitElementAdapter();
			}
			@Override
			public Adapter caseUnitResource(UnitResource object) {
				return createUnitResourceAdapter();
			}
			@Override
			public Adapter caseUnitAssociation(UnitAssociation object) {
				return createUnitAssociationAdapter();
			}
			@Override
			public Adapter caseUnitLabel(UnitLabel object) {
				return createUnitLabelAdapter();
			}
			@Override
			public Adapter caseInterfaceField(InterfaceField object) {
				return createInterfaceFieldAdapter();
			}
			@Override
			public Adapter caseDataTypeField(DataTypeField object) {
				return createDataTypeFieldAdapter();
			}
			@Override
			public Adapter caseDateField(DateField object) {
				return createDateFieldAdapter();
			}
			@Override
			public Adapter caseSelectableUnit(SelectableUnit object) {
				return createSelectableUnitAdapter();
			}
			@Override
			public Adapter caseSingletonUnit(SingletonUnit object) {
				return createSingletonUnitAdapter();
			}
			@Override
			public Adapter caseCollectionUnit(CollectionUnit object) {
				return createCollectionUnitAdapter();
			}
			@Override
			public Adapter caseEditUnit(EditUnit object) {
				return createEditUnitAdapter();
			}
			@Override
			public Adapter caseCreateUnit(CreateUnit object) {
				return createCreateUnitAdapter();
			}
			@Override
			public Adapter caseUpdateUnit(UpdateUnit object) {
				return createUpdateUnitAdapter();
			}
			@Override
			public Adapter caseCreateUpdateUnit(CreateUpdateUnit object) {
				return createCreateUpdateUnitAdapter();
			}
			@Override
			public Adapter caseMapUnit(MapUnit object) {
				return createMapUnitAdapter();
			}
			@Override
			public Adapter caseDetailsUnit(DetailsUnit object) {
				return createDetailsUnitAdapter();
			}
			@Override
			public Adapter caseTabularUnit(TabularUnit object) {
				return createTabularUnitAdapter();
			}
			@Override
			public Adapter caseCardsUnit(CardsUnit object) {
				return createCardsUnitAdapter();
			}
			@Override
			public Adapter caseBadge(Badge object) {
				return createBadgeAdapter();
			}
			@Override
			public Adapter caseTextCardsUnit(TextCardsUnit object) {
				return createTextCardsUnitAdapter();
			}
			@Override
			public Adapter caseDateCardsUnit(DateCardsUnit object) {
				return createDateCardsUnitAdapter();
			}
			@Override
			public Adapter caseImageUnit(ImageUnit object) {
				return createImageUnitAdapter();
			}
			@Override
			public Adapter caseImageCardsUnit(ImageCardsUnit object) {
				return createImageCardsUnitAdapter();
			}
			@Override
			public Adapter caseSliderUnit(SliderUnit object) {
				return createSliderUnitAdapter();
			}
			@Override
			public Adapter caseGalleryUnit(GalleryUnit object) {
				return createGalleryUnitAdapter();
			}
			@Override
			public Adapter caseControlUnit(ControlUnit object) {
				return createControlUnitAdapter();
			}
			@Override
			public Adapter caseSearchUnit(SearchUnit object) {
				return createSearchUnitAdapter();
			}
			@Override
			public Adapter caseRegistrationUnit(RegistrationUnit object) {
				return createRegistrationUnitAdapter();
			}
			@Override
			public Adapter caseLoginUnit(LoginUnit object) {
				return createLoginUnitAdapter();
			}
			@Override
			public Adapter caseLogoutUnit(LogoutUnit object) {
				return createLogoutUnitAdapter();
			}
			@Override
			public Adapter caseForgottenPasswordUnit(ForgottenPasswordUnit object) {
				return createForgottenPasswordUnitAdapter();
			}
			@Override
			public Adapter caseResetPasswordUnit(ResetPasswordUnit object) {
				return createResetPasswordUnitAdapter();
			}
			@Override
			public Adapter caseValueContext(ValueContext object) {
				return createValueContextAdapter();
			}
			@Override
			public Adapter caseDisplayValue(DisplayValue object) {
				return createDisplayValueAdapter();
			}
			@Override
			public Adapter caseAssociationDisplayValue(AssociationDisplayValue object) {
				return createAssociationDisplayValueAdapter();
			}
			@Override
			public Adapter caseAttributeDisplayValue(AttributeDisplayValue object) {
				return createAttributeDisplayValueAdapter();
			}
			@Override
			public Adapter caseLabelDisplayValue(LabelDisplayValue object) {
				return createLabelDisplayValueAdapter();
			}
			@Override
			public Adapter caseResourceDisplayValue(ResourceDisplayValue object) {
				return createResourceDisplayValueAdapter();
			}
			@Override
			public Adapter caseActionContainer(ActionContainer object) {
				return createActionContainerAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseSecurityAction(SecurityAction object) {
				return createSecurityActionAdapter();
			}
			@Override
			public Adapter caseDeleteAction(DeleteAction object) {
				return createDeleteActionAdapter();
			}
			@Override
			public Adapter caseSelectAction(SelectAction object) {
				return createSelectActionAdapter();
			}
			@Override
			public Adapter caseContainerSelectAction(ContainerSelectAction object) {
				return createContainerSelectActionAdapter();
			}
			@Override
			public Adapter caseInstanceSelectAction(InstanceSelectAction object) {
				return createInstanceSelectActionAdapter();
			}
			@Override
			public Adapter caseTargetAction(TargetAction object) {
				return createTargetActionAdapter();
			}
			@Override
			public Adapter caseOperationAction(OperationAction object) {
				return createOperationActionAdapter();
			}
			@Override
			public Adapter caseContainerOperationAction(ContainerOperationAction object) {
				return createContainerOperationActionAdapter();
			}
			@Override
			public Adapter caseInstanceOperationAction(InstanceOperationAction object) {
				return createInstanceOperationActionAdapter();
			}
			@Override
			public Adapter caseGeneralOperationAction(GeneralOperationAction object) {
				return createGeneralOperationActionAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamedDisplayElement(NamedDisplayElement object) {
				return createNamedDisplayElementAdapter();
			}
			@Override
			public Adapter caseFeatureVariableContext(FeatureVariableContext object) {
				return createFeatureVariableContextAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter caseAssociationPathElement(AssociationPathElement object) {
				return createAssociationPathElementAdapter();
			}
			@Override
			public Adapter caseSecurityUnit(SecurityUnit object) {
				return createSecurityUnitAdapter();
			}
			@Override
			public Adapter caseAttributePathElement(AttributePathElement object) {
				return createAttributePathElementAdapter();
			}
			@Override
			public Adapter caseResourcePathElement(ResourcePathElement object) {
				return createResourcePathElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.WebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI
	 * @generated
	 */
	public Adapter createWebUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.Navigation
	 * @generated
	 */
	public Adapter createNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.MenuEntry
	 * @generated
	 */
	public Adapter createMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SubmenuEntry <em>Submenu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SubmenuEntry
	 * @generated
	 */
	public Adapter createSubmenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry <em>Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ActionMenuEntry
	 * @generated
	 */
	public Adapter createActionMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.EditStaticTextMenuEntry <em>Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.EditStaticTextMenuEntry
	 * @generated
	 */
	public Adapter createEditStaticTextMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.MenuFeature <em>Menu Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.MenuFeature
	 * @generated
	 */
	public Adapter createMenuFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles <em>Content Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnitStyles
	 * @generated
	 */
	public Adapter createContentUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles <em>Dynamic Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles
	 * @generated
	 */
	public Adapter createDynamicUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DefaultUnitStyles <em>Default Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DefaultUnitStyles
	 * @generated
	 */
	public Adapter createDefaultUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.CollectionUnitStyles <em>Collection Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnitStyles
	 * @generated
	 */
	public Adapter createCollectionUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles <em>Cards Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles
	 * @generated
	 */
	public Adapter createCardsUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DetailsUnitStyles <em>Details Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DetailsUnitStyles
	 * @generated
	 */
	public Adapter createDetailsUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.FormUnitStyles <em>Form Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.FormUnitStyles
	 * @generated
	 */
	public Adapter createFormUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.GalleryUnitStyles <em>Gallery Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.GalleryUnitStyles
	 * @generated
	 */
	public Adapter createGalleryUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SliderUnitStyles <em>Slider Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SliderUnitStyles
	 * @generated
	 */
	public Adapter createSliderUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.StaticUnitStyles <em>Static Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.StaticUnitStyles
	 * @generated
	 */
	public Adapter createStaticUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.TabularUnitStyles <em>Tabular Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnitStyles
	 * @generated
	 */
	public Adapter createTabularUnitStylesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ControllerLink <em>Controller Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ControllerLink
	 * @generated
	 */
	public Adapter createControllerLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SinglePageController <em>Single Page Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SinglePageController
	 * @generated
	 */
	public Adapter createSinglePageControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.MultiPageController <em>Multi Page Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.MultiPageController
	 * @generated
	 */
	public Adapter createMultiPageControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit
	 * @generated
	 */
	public Adapter createContentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.RouteActual <em>Route Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.RouteActual
	 * @generated
	 */
	public Adapter createRouteActualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.StaticUnit <em>Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.StaticUnit
	 * @generated
	 */
	public Adapter createStaticUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.CreateSitemapUnit <em>Create Sitemap Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.CreateSitemapUnit
	 * @generated
	 */
	public Adapter createCreateSitemapUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit <em>Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit
	 * @generated
	 */
	public Adapter createDynamicUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.UnitField <em>Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField
	 * @generated
	 */
	public Adapter createUnitFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.UnitFeature <em>Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature
	 * @generated
	 */
	public Adapter createUnitFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.UnitElement <em>Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.UnitElement
	 * @generated
	 */
	public Adapter createUnitElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.UnitResource <em>Unit Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.UnitResource
	 * @generated
	 */
	public Adapter createUnitResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation <em>Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation
	 * @generated
	 */
	public Adapter createUnitAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.security.SecurityUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.security.SecurityUnit
	 * @generated
	 */
	public Adapter createSecurityUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.AttributePathElement <em>Attribute Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.AttributePathElement
	 * @generated
	 */
	public Adapter createAttributePathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.ResourcePathElement <em>Resource Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourcePathElement
	 * @generated
	 */
	public Adapter createResourcePathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.UnitLabel <em>Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.UnitLabel
	 * @generated
	 */
	public Adapter createUnitLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.InterfaceField <em>Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField
	 * @generated
	 */
	public Adapter createInterfaceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DataTypeField
	 * @generated
	 */
	public Adapter createDataTypeFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DateField
	 * @generated
	 */
	public Adapter createDateFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SelectableUnit <em>Selectable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SelectableUnit
	 * @generated
	 */
	public Adapter createSelectableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SingletonUnit <em>Singleton Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SingletonUnit
	 * @generated
	 */
	public Adapter createSingletonUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit <em>Collection Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit
	 * @generated
	 */
	public Adapter createCollectionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.EditUnit <em>Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit
	 * @generated
	 */
	public Adapter createEditUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.CreateUnit <em>Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.CreateUnit
	 * @generated
	 */
	public Adapter createCreateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit <em>Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.CreateUpdateUnit
	 * @generated
	 */
	public Adapter createCreateUpdateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.UpdateUnit <em>Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.UpdateUnit
	 * @generated
	 */
	public Adapter createUpdateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.MapUnit <em>Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.MapUnit
	 * @generated
	 */
	public Adapter createMapUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DetailsUnit <em>Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DetailsUnit
	 * @generated
	 */
	public Adapter createDetailsUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.TabularUnit <em>Tabular Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnit
	 * @generated
	 */
	public Adapter createTabularUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.CardsUnit <em>Cards Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit
	 * @generated
	 */
	public Adapter createCardsUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.TextCardsUnit <em>Text Cards Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.TextCardsUnit
	 * @generated
	 */
	public Adapter createTextCardsUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit <em>Date Cards Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DateCardsUnit
	 * @generated
	 */
	public Adapter createDateCardsUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ControlUnit
	 * @generated
	 */
	public Adapter createControlUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SearchUnit <em>Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SearchUnit
	 * @generated
	 */
	public Adapter createSearchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.RegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.RegistrationUnit
	 * @generated
	 */
	public Adapter createRegistrationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.LoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.LoginUnit
	 * @generated
	 */
	public Adapter createLoginUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.LogoutUnit <em>Logout Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.LogoutUnit
	 * @generated
	 */
	public Adapter createLogoutUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit
	 * @generated
	 */
	public Adapter createForgottenPasswordUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ResetPasswordUnit <em>Reset Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ResetPasswordUnit
	 * @generated
	 */
	public Adapter createResetPasswordUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ValueContext <em>Value Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ValueContext
	 * @generated
	 */
	public Adapter createValueContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DisplayValue <em>Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DisplayValue
	 * @generated
	 */
	public Adapter createDisplayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.AssociationDisplayValue <em>Association Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.AssociationDisplayValue
	 * @generated
	 */
	public Adapter createAssociationDisplayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.AttributeDisplayValue <em>Attribute Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.AttributeDisplayValue
	 * @generated
	 */
	public Adapter createAttributeDisplayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.LabelDisplayValue <em>Label Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.LabelDisplayValue
	 * @generated
	 */
	public Adapter createLabelDisplayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ResourceDisplayValue <em>Resource Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ResourceDisplayValue
	 * @generated
	 */
	public Adapter createResourceDisplayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ActionContainer <em>Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ActionContainer
	 * @generated
	 */
	public Adapter createActionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ImageUnit <em>Image Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ImageUnit
	 * @generated
	 */
	public Adapter createImageUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit <em>Image Cards Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ImageCardsUnit
	 * @generated
	 */
	public Adapter createImageCardsUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SliderUnit <em>Slider Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SliderUnit
	 * @generated
	 */
	public Adapter createSliderUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit <em>Gallery Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.GalleryUnit
	 * @generated
	 */
	public Adapter createGalleryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SecurityAction <em>Security Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SecurityAction
	 * @generated
	 */
	public Adapter createSecurityActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.OperationAction <em>Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.OperationAction
	 * @generated
	 */
	public Adapter createOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.InstanceOperationAction <em>Instance Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.InstanceOperationAction
	 * @generated
	 */
	public Adapter createInstanceOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ContainerOperationAction <em>Container Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ContainerOperationAction
	 * @generated
	 */
	public Adapter createContainerOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.GeneralOperationAction <em>General Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.GeneralOperationAction
	 * @generated
	 */
	public Adapter createGeneralOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.base.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.base.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.base.NamedDisplayElement <em>Named Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.base.NamedDisplayElement
	 * @generated
	 */
	public Adapter createNamedDisplayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariableContext <em>Feature Variable Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureVariableContext
	 * @generated
	 */
	public Adapter createFeatureVariableContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement <em>Association Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement
	 * @generated
	 */
	public Adapter createAssociationPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.SelectAction <em>Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.SelectAction
	 * @generated
	 */
	public Adapter createSelectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.ContainerSelectAction <em>Container Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.ContainerSelectAction
	 * @generated
	 */
	public Adapter createContainerSelectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.InstanceSelectAction <em>Instance Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.InstanceSelectAction
	 * @generated
	 */
	public Adapter createInstanceSelectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.TargetAction <em>Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.TargetAction
	 * @generated
	 */
	public Adapter createTargetActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.DeleteAction
	 * @generated
	 */
	public Adapter createDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.webui.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.webui.Badge
	 * @generated
	 */
	public Adapter createBadgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebuiAdapterFactory
