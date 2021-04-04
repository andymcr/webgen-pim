/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import work.andycarpenter.webgen.pims.base.BasePackage;

import work.andycarpenter.webgen.pims.expression.ExpressionPackage;

import work.andycarpenter.webgen.pims.image.ImagePackage;

import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

import work.andycarpenter.webgen.pims.security.SecurityPackage;
import work.andycarpenter.webgen.pims.service.ServicePackage;

import work.andycarpenter.webgen.pims.webui.Action;
import work.andycarpenter.webgen.pims.webui.ActionContainer;
import work.andycarpenter.webgen.pims.webui.ActionMenuEntry;
import work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement;
import work.andycarpenter.webgen.pims.webui.Badge;
import work.andycarpenter.webgen.pims.webui.CardsUnit;
import work.andycarpenter.webgen.pims.webui.CardsUnitStyles;
import work.andycarpenter.webgen.pims.webui.ChildPathAssociation;
import work.andycarpenter.webgen.pims.webui.ChildPathAttribute;
import work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions;
import work.andycarpenter.webgen.pims.webui.CollectionUnit;
import work.andycarpenter.webgen.pims.webui.CollectionUnitStyles;
import work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement;
import work.andycarpenter.webgen.pims.webui.ContainerOperationAction;
import work.andycarpenter.webgen.pims.webui.ContainerSelectAction;
import work.andycarpenter.webgen.pims.webui.ContentUnit;
import work.andycarpenter.webgen.pims.webui.ContentUnitStyles;
import work.andycarpenter.webgen.pims.webui.ControlUnit;
import work.andycarpenter.webgen.pims.webui.CreateSitemapUnit;
import work.andycarpenter.webgen.pims.webui.CreateUnit;
import work.andycarpenter.webgen.pims.webui.CreateUpdateUnit;
import work.andycarpenter.webgen.pims.webui.DataTypeField;
import work.andycarpenter.webgen.pims.webui.DateCardsUnit;
import work.andycarpenter.webgen.pims.webui.DateField;
import work.andycarpenter.webgen.pims.webui.DefaultUnitStyles;
import work.andycarpenter.webgen.pims.webui.DeleteAction;
import work.andycarpenter.webgen.pims.webui.DetailsUnit;
import work.andycarpenter.webgen.pims.webui.DetailsUnitStyles;
import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.DynamicUnitStyles;
import work.andycarpenter.webgen.pims.webui.EditStaticTextMenuEntry;
import work.andycarpenter.webgen.pims.webui.EditUnit;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.FeaturePathAssociation;
import work.andycarpenter.webgen.pims.webui.FeaturePathAttribute;
import work.andycarpenter.webgen.pims.webui.FeaturePathLabel;
import work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit;
import work.andycarpenter.webgen.pims.webui.FormUnitStyles;
import work.andycarpenter.webgen.pims.webui.GalleryUnit;
import work.andycarpenter.webgen.pims.webui.GalleryUnitStyles;
import work.andycarpenter.webgen.pims.webui.GeneralOperationAction;
import work.andycarpenter.webgen.pims.webui.ImageCardsUnit;
import work.andycarpenter.webgen.pims.webui.ImageUnit;
import work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement;
import work.andycarpenter.webgen.pims.webui.InstanceOperationAction;
import work.andycarpenter.webgen.pims.webui.InstanceSelectAction;
import work.andycarpenter.webgen.pims.webui.InterfaceField;
import work.andycarpenter.webgen.pims.webui.LoginUnit;
import work.andycarpenter.webgen.pims.webui.LogoutUnit;
import work.andycarpenter.webgen.pims.webui.MapUnit;
import work.andycarpenter.webgen.pims.webui.Menu;
import work.andycarpenter.webgen.pims.webui.MenuEntry;
import work.andycarpenter.webgen.pims.webui.MenuFeature;
import work.andycarpenter.webgen.pims.webui.Message;
import work.andycarpenter.webgen.pims.webui.Navigation;
import work.andycarpenter.webgen.pims.webui.OperationAction;
import work.andycarpenter.webgen.pims.webui.Page;
import work.andycarpenter.webgen.pims.webui.PageLink;
import work.andycarpenter.webgen.pims.webui.PageTopMenuOptions;
import work.andycarpenter.webgen.pims.webui.PaginationControlPlacements;
import work.andycarpenter.webgen.pims.webui.RegistrationUnit;
import work.andycarpenter.webgen.pims.webui.ResetPasswordUnit;
import work.andycarpenter.webgen.pims.webui.RouteActual;
import work.andycarpenter.webgen.pims.webui.SearchUnit;
import work.andycarpenter.webgen.pims.webui.SecurityAction;
import work.andycarpenter.webgen.pims.webui.SelectAction;
import work.andycarpenter.webgen.pims.webui.SelectableUnit;
import work.andycarpenter.webgen.pims.webui.SingletonUnit;
import work.andycarpenter.webgen.pims.webui.SliderUnit;
import work.andycarpenter.webgen.pims.webui.SliderUnitStyles;
import work.andycarpenter.webgen.pims.webui.StaticUnit;
import work.andycarpenter.webgen.pims.webui.StaticUnitStyles;
import work.andycarpenter.webgen.pims.webui.SubmenuEntry;
import work.andycarpenter.webgen.pims.webui.TabularUnit;
import work.andycarpenter.webgen.pims.webui.TabularUnitStyles;
import work.andycarpenter.webgen.pims.webui.TextCardsUnit;
import work.andycarpenter.webgen.pims.webui.UnitAssociation;
import work.andycarpenter.webgen.pims.webui.UnitElement;
import work.andycarpenter.webgen.pims.webui.UnitFeature;
import work.andycarpenter.webgen.pims.webui.UnitField;
import work.andycarpenter.webgen.pims.webui.UnitLabel;
import work.andycarpenter.webgen.pims.webui.UpdateUnit;
import work.andycarpenter.webgen.pims.webui.WebUI;
import work.andycarpenter.webgen.pims.webui.WebuiFactory;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

import work.andycarpenter.webgen.pims.webui.util.WebuiValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebuiPackageImpl extends EPackageImpl implements WebuiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editStaticTextMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardsUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass galleryUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliderUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabularUnitStylesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeActualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createSitemapUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childPathAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childPathAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createUpdateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabularUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardsUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textCardsUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateCardsUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logoutUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forgottenPasswordUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetPasswordUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageCardsUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliderUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass galleryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationMenuPlacementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerSelectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSelectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pageTopMenuOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionDisplayOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paginationControlPlacementsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containerActionsPlacementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceActionsPlacementEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebuiPackageImpl() {
		super(eNS_URI, WebuiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WebuiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebuiPackage init() {
		if (isInited) return (WebuiPackage)EPackage.Registry.INSTANCE.getEPackage(WebuiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWebuiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WebuiPackageImpl theWebuiPackage = registeredWebuiPackage instanceof WebuiPackageImpl ? (WebuiPackageImpl)registeredWebuiPackage : new WebuiPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();
		ImagePackage.eINSTANCE.eClass();
		PersistencePackage.eINSTANCE.eClass();
		SecurityPackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebuiPackage.createPackageContents();

		// Initialize created meta-data
		theWebuiPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebuiPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return WebuiValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebuiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebuiPackage.eNS_URI, theWebuiPackage);
		return theWebuiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebUI() {
		return webUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_Persistence() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_Navigation() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_Services() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_Pages() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebUI_UseFormFloatingLabels() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebUI_DefaultDateFormat() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebUI_DefaultTimeFormat() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebUI_DefaultDateTimeFormat() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebUI_DefaultSaveLabel() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebUI_DefaultPageStyleClass() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_DefaultStyles() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_DefaultCardsStyles() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_DefaultDetailsStyles() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_DefaultFormStyles() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_DefaultGalleryStyles() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_DefaultSliderStyles() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_DefaultStaticStyles() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebUI_DefaultTabularStyles() {
		return (EReference)webUIEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebUI_DefaultCancelLabel() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebUI_DefaultMaximumUploadSize() {
		return (EAttribute)webUIEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigation() {
		return navigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNavigation_PartOf() {
		return (EReference)navigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNavigation_Menus() {
		return (EReference)navigationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNavigation_NavbarClass() {
		return (EAttribute)navigationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNavigation_AuthenticationMenuPlacement() {
		return (EAttribute)navigationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNavigation_AuthenticationBarClass() {
		return (EAttribute)navigationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMenu_Entries() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMenu_OmitCaption() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMenu_CaptionClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMenu_StyleClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMenu_LayoutClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMenuEntry() {
		return menuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMenuEntry_PartOf() {
		return (EReference)menuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmenuEntry() {
		return submenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubmenuEntry_RequiresRole() {
		return (EAttribute)submenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionMenuEntry() {
		return actionMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionMenuEntry_Destination() {
		return (EReference)actionMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditStaticTextMenuEntry() {
		return editStaticTextMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMenuFeature() {
		return menuFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentUnitStyles() {
		return contentUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnitStyles_SectionClass() {
		return (EAttribute)contentUnitStylesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnitStyles_CaptionClass() {
		return (EAttribute)contentUnitStylesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnitStyles_ContentClass() {
		return (EAttribute)contentUnitStylesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicUnitStyles() {
		return dynamicUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnitStyles_FieldListClass() {
		return (EAttribute)dynamicUnitStylesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnitStyles_DefinitionFieldListClass() {
		return (EAttribute)dynamicUnitStylesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnitStyles_FieldLabelClass() {
		return (EAttribute)dynamicUnitStylesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnitStyles_FieldValueClass() {
		return (EAttribute)dynamicUnitStylesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnitStyles_ControlClass() {
		return (EAttribute)dynamicUnitStylesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnitStyles_ActionNavigationClass() {
		return (EAttribute)dynamicUnitStylesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnitStyles_AnchorClass() {
		return (EAttribute)dynamicUnitStylesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultUnitStyles() {
		return defaultUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectionUnitStyles() {
		return collectionUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnitStyles_InstanceControlClass() {
		return (EAttribute)collectionUnitStylesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnitStyles_InstanceAnchorClass() {
		return (EAttribute)collectionUnitStylesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardsUnitStyles() {
		return cardsUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnitStyles_RowClass() {
		return (EAttribute)cardsUnitStylesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnitStyles_ColumnClass() {
		return (EAttribute)cardsUnitStylesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnitStyles_CardClass() {
		return (EAttribute)cardsUnitStylesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnitStyles_CardHeaderClass() {
		return (EAttribute)cardsUnitStylesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnitStyles_CardBodyClass() {
		return (EAttribute)cardsUnitStylesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnitStyles_CardFooterClass() {
		return (EAttribute)cardsUnitStylesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnitStyles_BadgeClass() {
		return (EAttribute)cardsUnitStylesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetailsUnitStyles() {
		return detailsUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormUnitStyles() {
		return formUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormUnitStyles_InputGroupClass() {
		return (EAttribute)formUnitStylesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGalleryUnitStyles() {
		return galleryUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSliderUnitStyles() {
		return sliderUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticUnitStyles() {
		return staticUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTabularUnitStyles() {
		return tabularUnitStylesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_WebUI() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_ParentPage() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_ChildPages() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Units() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_UriElement() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_StyleClass() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageLink() {
		return pageLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageLink_TargetPage() {
		return (EReference)pageLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentUnit() {
		return contentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentUnit_DisplayedOn() {
		return (EReference)contentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_CreateDefaultUriElement() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_RequiresRole() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_PurposeSummary() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_UriElement() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Alternative() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_SectionClass() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_OmitCaption() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_LocalCaptionClass() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_LocalContentClass() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentUnit_PageDisplayedOn() {
		return (EReference)contentUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouteActual() {
		return routeActualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouteActual_ActualFor() {
		return (EReference)routeActualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouteActual_RouteParameter() {
		return (EReference)routeActualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouteActual_Value() {
		return (EReference)routeActualEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticUnit() {
		return staticUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaticUnit_Content() {
		return (EAttribute)staticUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateSitemapUnit() {
		return createSitemapUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateSitemapUnit_DeployedURL() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateSitemapUnit_Filename() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicUnit() {
		return dynamicUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicUnit_ContentType() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicUnit_ContainingType() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicUnit_RouteActuals() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicUnit_DisplayFields() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_HasWhenFieldsEmptyAddImplicitFields() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicUnit_HideWhen() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_MessageWhenHidden() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_Header() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_Footer() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_HeaderClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_LocalFieldListClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_LocalFieldLabelClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_LocalFieldValueClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_LocalControlClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_LocalInstanceControlClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_LocalAnchorClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_LocalInstanceAnchorClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDynamicUnit_FooterClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitField() {
		return unitFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitField_DisplayedOn() {
		return (EReference)unitFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitField_RequiresRole() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitField_HideWhen() {
		return (EReference)unitFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitField_Title() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitField_Help() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitField_EscapeHTML() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitField_CollectionDisplayOption() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitField_Truncate() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitField_DateFormat() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitField_DisableInput() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitFeature() {
		return unitFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_DisplayLabel() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_Required() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitFeature_ForcedValue() {
		return (EReference)unitFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_CollectionUiAllowAdd() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_CollectionUiAllowRemove() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_DefaultDisplayValue() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitFeature_DisplayDefaultWhen() {
		return (EReference)unitFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_EmptyDisplayValue() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_Footer() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_Autofocus() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_HeaderClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_FieldLabelClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_FieldValueClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_InputGroupClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitFeature_FooterClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitElement() {
		return unitElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitElement_Attribute() {
		return (EReference)unitElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitElement_Name() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitElement_DefaultValue() {
		return (EReference)unitElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitElement_ObfuscateFormFields() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitElement_Placeholder() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitElement_ValidationPattern() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitAssociation() {
		return unitAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitAssociation_ContainingType() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitAssociation_IsSourceAssociation() {
		return (EAttribute)unitAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitAssociation_TargetEntity() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitAssociation_Options() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitAssociation_OptionsFilter() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildPathAttribute() {
		return childPathAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChildPathAttribute_Name() {
		return (EAttribute)childPathAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildPathAttribute_Attribute() {
		return (EReference)childPathAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildPathAttribute_ContainingType() {
		return (EReference)childPathAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildPathAssociation() {
		return childPathAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChildPathAssociation_IsSourceAssociation() {
		return (EAttribute)childPathAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildPathAssociation_TargetEntity() {
		return (EReference)childPathAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildPathAssociation_ContainingType() {
		return (EReference)childPathAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePath() {
		return featurePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturePath_ContainingType() {
		return (EReference)featurePathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePath_UseContainerAsContext() {
		return (EAttribute)featurePathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePathAttribute() {
		return featurePathAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePathAttribute_Name() {
		return (EAttribute)featurePathAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturePathAttribute_Attribute() {
		return (EReference)featurePathAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePathAssociation() {
		return featurePathAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePathAssociation_IsSourceAssociation() {
		return (EAttribute)featurePathAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturePathAssociation_TargetEntity() {
		return (EReference)featurePathAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePathLabel() {
		return featurePathLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePathLabel_Name() {
		return (EAttribute)featurePathLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturePathLabel_Label() {
		return (EReference)featurePathLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitLabel() {
		return unitLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitLabel_Label() {
		return (EReference)unitLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitLabel_Name() {
		return (EAttribute)unitLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceField() {
		return interfaceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_Required() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_DefaultValue() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_Placeholder() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_RepeatedField() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_SecondDisplayLabel() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_SecondTitle() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_SecondPlaceholder() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_SecondHelp() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceField_ValidationPattern() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTypeField() {
		return dataTypeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataTypeField_DataType() {
		return (EReference)dataTypeFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTypeField_ObfuscateFormFields() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTypeField_Encrypt() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTypeField_InterfaceType() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateField() {
		return dateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateField_Details() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateField_Format() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectableUnit() {
		return selectableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingletonUnit() {
		return singletonUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingletonUnit_Title() {
		return (EReference)singletonUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectionUnit() {
		return collectionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionUnit_UnitTitle() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionUnit_ElementTitle() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_TruncateElementTitle() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionUnit_Selection() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionUnit_FindContainerSelection() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionUnit_FindElementSelection() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionUnit_Filter() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionUnit_SupportedFilters() {
		return (EReference)collectionUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_EmptyMessage() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_OmitFieldLabels() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_DefaultPaginationSize() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_MaximumPaginationSize() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_PaginationControlPlacement() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_NextNpages() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_PreviousNpages() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_NextPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_NextPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_PreviousPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_PreviousPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_UseDisabledPageLinks() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_UseFirstLastPageLinks() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_FirstPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_FirstPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_LastPageLabel() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_LastPageIconName() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_PaginationClass() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_PaginationElementClass() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollectionUnit_PaginationAnchorClass() {
		return (EAttribute)collectionUnitEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEditUnit() {
		return editUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEditUnit_UseCaptcha() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEditUnit_DisableWhen() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEditUnit_ConfirmDestination() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEditUnit_ConfirmLabel() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEditUnit_ConfirmMessage() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEditUnit_SuccessMessage() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEditUnit_CancelDestination() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEditUnit_CancelLabel() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEditUnit_UnitInputGroupClass() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateUnit() {
		return createUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateUpdateUnit() {
		return createUpdateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateUpdateUnit_OnSaveContinueEditing() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateUpdateUnit_UpdateUriElement() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateUpdateUnit_ClearLabel() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateUnit() {
		return updateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateUnit_OnSaveContinueEditing() {
		return (EAttribute)updateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateUnit_DisplayEmptyForm() {
		return (EAttribute)updateUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapUnit() {
		return mapUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapUnit_ReadOnly() {
		return (EAttribute)mapUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapUnit_DefaultZoomLevel() {
		return (EAttribute)mapUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapUnit_Location() {
		return (EReference)mapUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapUnit_PlaceName() {
		return (EReference)mapUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetailsUnit() {
		return detailsUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetailsUnit_Selection() {
		return (EReference)detailsUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailsUnit_OmitFieldLabels() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTabularUnit() {
		return tabularUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTabularUnit_RowClasses() {
		return (EAttribute)tabularUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardsUnit() {
		return cardsUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCardsUnit_Badges() {
		return (EReference)cardsUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnit_OverlaySingleSelectAction() {
		return (EAttribute)cardsUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnit_LocalRowClass() {
		return (EAttribute)cardsUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnit_LocalColumnClass() {
		return (EAttribute)cardsUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnit_LocalCardClass() {
		return (EAttribute)cardsUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnit_LocalCardHeaderClass() {
		return (EAttribute)cardsUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnit_LocalCardBodyClass() {
		return (EAttribute)cardsUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnit_LocalCardFooterClass() {
		return (EAttribute)cardsUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardsUnit_LocalBadgeClass() {
		return (EAttribute)cardsUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextCardsUnit() {
		return textCardsUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateCardsUnit() {
		return dateCardsUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDateCardsUnit_ElementDate() {
		return (EReference)dateCardsUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlUnit() {
		return controlUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlUnit_SubmitLabel() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlUnit_CancelDestination() {
		return (EReference)controlUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlUnit_CancelLabel() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSearchUnit() {
		return searchUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSearchUnit_ResultsDestination() {
		return (EReference)searchUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegistrationUnit() {
		return registrationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoginUnit() {
		return loginUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogoutUnit() {
		return logoutUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForgottenPasswordUnit() {
		return forgottenPasswordUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForgottenPasswordUnit_ResetPasswordUnit() {
		return (EReference)forgottenPasswordUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForgottenPasswordUnit_UriEmailSent() {
		return (EAttribute)forgottenPasswordUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForgottenPasswordUnit_EmailSubject() {
		return (EAttribute)forgottenPasswordUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForgottenPasswordUnit_EmailMessage() {
		return (EAttribute)forgottenPasswordUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForgottenPasswordUnit_EmailSentCaption() {
		return (EAttribute)forgottenPasswordUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForgottenPasswordUnit_EmailSentMessage() {
		return (EAttribute)forgottenPasswordUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResetPasswordUnit() {
		return resetPasswordUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionContainer() {
		return actionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionContainer_ContainerActionsPlacement() {
		return (EAttribute)actionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionContainer_InstanceActionsPlacement() {
		return (EAttribute)actionContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionContainer_Actions() {
		return (EReference)actionContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionContainer_ActionNavigationClass() {
		return (EAttribute)actionContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageUnit() {
		return imageUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageUnit_ImagePathFeature() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageUnit_ImageFilter() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageUnit_MissingImageFilter() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageUnit_MissingImagePath() {
		return (EAttribute)imageUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageCardsUnit() {
		return imageCardsUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageCardsUnit_OverlayTitle() {
		return (EAttribute)imageCardsUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageCardsUnit_EnableImageEnlargement() {
		return (EAttribute)imageCardsUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageCardsUnit_RevealUntruncatedContent() {
		return (EAttribute)imageCardsUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSliderUnit() {
		return sliderUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSliderUnit_ShowTime() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSliderUnit_TransitionTime() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGalleryUnit() {
		return galleryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGalleryUnit_FullSizeFilter() {
		return (EReference)galleryUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGalleryUnit_ShowTime() {
		return (EAttribute)galleryUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGalleryUnit_TransitionTime() {
		return (EAttribute)galleryUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_UsedBy() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_IconName() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Disable() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_DisplayWhen() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_EnableWhen() {
		return (EReference)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_ConfirmMessage() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_SuccessMessage() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_FailureMessage() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_AnchorClass() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_HeaderClass() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_FooterClass() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_ContainingType() {
		return (EReference)actionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityAction() {
		return securityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityAction_Target() {
		return (EReference)securityActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationAction() {
		return operationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationAction_Operation() {
		return (EReference)operationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationAction_FileExtension() {
		return (EAttribute)operationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationAction_RequiresRole() {
		return (EAttribute)operationActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationAction_UriElement() {
		return (EAttribute)operationActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceOperationAction() {
		return instanceOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerOperationAction() {
		return containerOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralOperationAction() {
		return generalOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Text() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Features() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthenticationMenuPlacement() {
		return authenticationMenuPlacementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectAction() {
		return selectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelectAction_Target() {
		return (EReference)selectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelectAction_ValuePath() {
		return (EReference)selectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerSelectAction() {
		return containerSelectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceSelectAction() {
		return instanceSelectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeleteAction() {
		return deleteActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeleteAction_RequiresRole() {
		return (EAttribute)deleteActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeleteAction_UriElement() {
		return (EAttribute)deleteActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBadge() {
		return badgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBadge_DisplayedOn() {
		return (EReference)badgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBadge_IconName() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBadge_Value() {
		return (EReference)badgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBadge_Title() {
		return (EReference)badgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBadge_DisplayWhen() {
		return (EReference)badgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBadge_LocalBadgeClass() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPageTopMenuOptions() {
		return pageTopMenuOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCollectionDisplayOptions() {
		return collectionDisplayOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaginationControlPlacements() {
		return paginationControlPlacementsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContainerActionsPlacement() {
		return containerActionsPlacementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInstanceActionsPlacement() {
		return instanceActionsPlacementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebuiFactory getWebuiFactory() {
		return (WebuiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		webUIEClass = createEClass(WEB_UI);
		createEReference(webUIEClass, WEB_UI__PERSISTENCE);
		createEReference(webUIEClass, WEB_UI__NAVIGATION);
		createEReference(webUIEClass, WEB_UI__SERVICES);
		createEReference(webUIEClass, WEB_UI__PAGES);
		createEAttribute(webUIEClass, WEB_UI__USE_FORM_FLOATING_LABELS);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_DATE_FORMAT);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_TIME_FORMAT);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_DATE_TIME_FORMAT);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_CANCEL_LABEL);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_SAVE_LABEL);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_PAGE_STYLE_CLASS);
		createEReference(webUIEClass, WEB_UI__DEFAULT_STYLES);
		createEReference(webUIEClass, WEB_UI__DEFAULT_CARDS_STYLES);
		createEReference(webUIEClass, WEB_UI__DEFAULT_DETAILS_STYLES);
		createEReference(webUIEClass, WEB_UI__DEFAULT_FORM_STYLES);
		createEReference(webUIEClass, WEB_UI__DEFAULT_GALLERY_STYLES);
		createEReference(webUIEClass, WEB_UI__DEFAULT_SLIDER_STYLES);
		createEReference(webUIEClass, WEB_UI__DEFAULT_STATIC_STYLES);
		createEReference(webUIEClass, WEB_UI__DEFAULT_TABULAR_STYLES);
		createEAttribute(webUIEClass, WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE);

		navigationEClass = createEClass(NAVIGATION);
		createEReference(navigationEClass, NAVIGATION__PART_OF);
		createEReference(navigationEClass, NAVIGATION__MENUS);
		createEAttribute(navigationEClass, NAVIGATION__NAVBAR_CLASS);
		createEAttribute(navigationEClass, NAVIGATION__AUTHENTICATION_MENU_PLACEMENT);
		createEAttribute(navigationEClass, NAVIGATION__AUTHENTICATION_BAR_CLASS);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ENTRIES);
		createEAttribute(menuEClass, MENU__OMIT_CAPTION);
		createEAttribute(menuEClass, MENU__CAPTION_CLASS);
		createEAttribute(menuEClass, MENU__STYLE_CLASS);
		createEAttribute(menuEClass, MENU__LAYOUT_CLASS);

		menuEntryEClass = createEClass(MENU_ENTRY);
		createEReference(menuEntryEClass, MENU_ENTRY__PART_OF);

		submenuEntryEClass = createEClass(SUBMENU_ENTRY);
		createEAttribute(submenuEntryEClass, SUBMENU_ENTRY__REQUIRES_ROLE);

		actionMenuEntryEClass = createEClass(ACTION_MENU_ENTRY);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__DESTINATION);

		editStaticTextMenuEntryEClass = createEClass(EDIT_STATIC_TEXT_MENU_ENTRY);

		menuFeatureEClass = createEClass(MENU_FEATURE);

		contentUnitStylesEClass = createEClass(CONTENT_UNIT_STYLES);
		createEAttribute(contentUnitStylesEClass, CONTENT_UNIT_STYLES__SECTION_CLASS);
		createEAttribute(contentUnitStylesEClass, CONTENT_UNIT_STYLES__CAPTION_CLASS);
		createEAttribute(contentUnitStylesEClass, CONTENT_UNIT_STYLES__CONTENT_CLASS);

		dynamicUnitStylesEClass = createEClass(DYNAMIC_UNIT_STYLES);
		createEAttribute(dynamicUnitStylesEClass, DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS);
		createEAttribute(dynamicUnitStylesEClass, DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS);
		createEAttribute(dynamicUnitStylesEClass, DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS);
		createEAttribute(dynamicUnitStylesEClass, DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS);
		createEAttribute(dynamicUnitStylesEClass, DYNAMIC_UNIT_STYLES__CONTROL_CLASS);
		createEAttribute(dynamicUnitStylesEClass, DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS);
		createEAttribute(dynamicUnitStylesEClass, DYNAMIC_UNIT_STYLES__ANCHOR_CLASS);

		collectionUnitStylesEClass = createEClass(COLLECTION_UNIT_STYLES);
		createEAttribute(collectionUnitStylesEClass, COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS);
		createEAttribute(collectionUnitStylesEClass, COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS);

		defaultUnitStylesEClass = createEClass(DEFAULT_UNIT_STYLES);

		cardsUnitStylesEClass = createEClass(CARDS_UNIT_STYLES);
		createEAttribute(cardsUnitStylesEClass, CARDS_UNIT_STYLES__ROW_CLASS);
		createEAttribute(cardsUnitStylesEClass, CARDS_UNIT_STYLES__COLUMN_CLASS);
		createEAttribute(cardsUnitStylesEClass, CARDS_UNIT_STYLES__CARD_CLASS);
		createEAttribute(cardsUnitStylesEClass, CARDS_UNIT_STYLES__CARD_HEADER_CLASS);
		createEAttribute(cardsUnitStylesEClass, CARDS_UNIT_STYLES__CARD_BODY_CLASS);
		createEAttribute(cardsUnitStylesEClass, CARDS_UNIT_STYLES__CARD_FOOTER_CLASS);
		createEAttribute(cardsUnitStylesEClass, CARDS_UNIT_STYLES__BADGE_CLASS);

		detailsUnitStylesEClass = createEClass(DETAILS_UNIT_STYLES);

		formUnitStylesEClass = createEClass(FORM_UNIT_STYLES);
		createEAttribute(formUnitStylesEClass, FORM_UNIT_STYLES__INPUT_GROUP_CLASS);

		galleryUnitStylesEClass = createEClass(GALLERY_UNIT_STYLES);

		sliderUnitStylesEClass = createEClass(SLIDER_UNIT_STYLES);

		staticUnitStylesEClass = createEClass(STATIC_UNIT_STYLES);

		tabularUnitStylesEClass = createEClass(TABULAR_UNIT_STYLES);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__WEB_UI);
		createEReference(pageEClass, PAGE__PARENT_PAGE);
		createEReference(pageEClass, PAGE__CHILD_PAGES);
		createEReference(pageEClass, PAGE__UNITS);
		createEAttribute(pageEClass, PAGE__URI_ELEMENT);
		createEAttribute(pageEClass, PAGE__STYLE_CLASS);

		pageLinkEClass = createEClass(PAGE_LINK);
		createEReference(pageLinkEClass, PAGE_LINK__TARGET_PAGE);

		contentUnitEClass = createEClass(CONTENT_UNIT);
		createEReference(contentUnitEClass, CONTENT_UNIT__DISPLAYED_ON);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__REQUIRES_ROLE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__PURPOSE_SUMMARY);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__URI_ELEMENT);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__ALTERNATIVE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__SECTION_CLASS);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__OMIT_CAPTION);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__LOCAL_CAPTION_CLASS);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__LOCAL_CONTENT_CLASS);
		createEReference(contentUnitEClass, CONTENT_UNIT__PAGE_DISPLAYED_ON);

		staticUnitEClass = createEClass(STATIC_UNIT);
		createEAttribute(staticUnitEClass, STATIC_UNIT__CONTENT);

		createSitemapUnitEClass = createEClass(CREATE_SITEMAP_UNIT);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__DEPLOYED_URL);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__FILENAME);

		dynamicUnitEClass = createEClass(DYNAMIC_UNIT);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__CONTENT_TYPE);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__CONTAINING_TYPE);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__ROUTE_ACTUALS);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__DISPLAY_FIELDS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__HIDE_WHEN);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HEADER);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__FOOTER);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HEADER_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__LOCAL_CONTROL_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__FOOTER_CLASS);

		routeActualEClass = createEClass(ROUTE_ACTUAL);
		createEReference(routeActualEClass, ROUTE_ACTUAL__ACTUAL_FOR);
		createEReference(routeActualEClass, ROUTE_ACTUAL__ROUTE_PARAMETER);
		createEReference(routeActualEClass, ROUTE_ACTUAL__VALUE);

		unitFieldEClass = createEClass(UNIT_FIELD);
		createEReference(unitFieldEClass, UNIT_FIELD__DISPLAYED_ON);
		createEAttribute(unitFieldEClass, UNIT_FIELD__REQUIRES_ROLE);
		createEReference(unitFieldEClass, UNIT_FIELD__HIDE_WHEN);
		createEAttribute(unitFieldEClass, UNIT_FIELD__TITLE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__HELP);
		createEAttribute(unitFieldEClass, UNIT_FIELD__ESCAPE_HTML);
		createEAttribute(unitFieldEClass, UNIT_FIELD__COLLECTION_DISPLAY_OPTION);
		createEAttribute(unitFieldEClass, UNIT_FIELD__TRUNCATE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__DATE_FORMAT);
		createEAttribute(unitFieldEClass, UNIT_FIELD__DISABLE_INPUT);

		unitFeatureEClass = createEClass(UNIT_FEATURE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__DISPLAY_LABEL);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__REQUIRED);
		createEReference(unitFeatureEClass, UNIT_FEATURE__FORCED_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__DEFAULT_DISPLAY_VALUE);
		createEReference(unitFeatureEClass, UNIT_FEATURE__DISPLAY_DEFAULT_WHEN);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__EMPTY_DISPLAY_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__AUTOFOCUS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__HEADER_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FIELD_LABEL_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FIELD_VALUE_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__INPUT_GROUP_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER_CLASS);

		unitElementEClass = createEClass(UNIT_ELEMENT);
		createEReference(unitElementEClass, UNIT_ELEMENT__ATTRIBUTE);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__NAME);
		createEReference(unitElementEClass, UNIT_ELEMENT__DEFAULT_VALUE);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__PLACEHOLDER);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__VALIDATION_PATTERN);

		unitAssociationEClass = createEClass(UNIT_ASSOCIATION);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__CONTAINING_TYPE);
		createEAttribute(unitAssociationEClass, UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__TARGET_ENTITY);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__OPTIONS);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__OPTIONS_FILTER);

		childPathAttributeEClass = createEClass(CHILD_PATH_ATTRIBUTE);
		createEAttribute(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__NAME);
		createEReference(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__ATTRIBUTE);
		createEReference(childPathAttributeEClass, CHILD_PATH_ATTRIBUTE__CONTAINING_TYPE);

		childPathAssociationEClass = createEClass(CHILD_PATH_ASSOCIATION);
		createEAttribute(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__TARGET_ENTITY);
		createEReference(childPathAssociationEClass, CHILD_PATH_ASSOCIATION__CONTAINING_TYPE);

		featurePathEClass = createEClass(FEATURE_PATH);
		createEReference(featurePathEClass, FEATURE_PATH__CONTAINING_TYPE);
		createEAttribute(featurePathEClass, FEATURE_PATH__USE_CONTAINER_AS_CONTEXT);

		featurePathAttributeEClass = createEClass(FEATURE_PATH_ATTRIBUTE);
		createEAttribute(featurePathAttributeEClass, FEATURE_PATH_ATTRIBUTE__NAME);
		createEReference(featurePathAttributeEClass, FEATURE_PATH_ATTRIBUTE__ATTRIBUTE);

		featurePathAssociationEClass = createEClass(FEATURE_PATH_ASSOCIATION);
		createEAttribute(featurePathAssociationEClass, FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEReference(featurePathAssociationEClass, FEATURE_PATH_ASSOCIATION__TARGET_ENTITY);

		featurePathLabelEClass = createEClass(FEATURE_PATH_LABEL);
		createEAttribute(featurePathLabelEClass, FEATURE_PATH_LABEL__NAME);
		createEReference(featurePathLabelEClass, FEATURE_PATH_LABEL__LABEL);

		unitLabelEClass = createEClass(UNIT_LABEL);
		createEReference(unitLabelEClass, UNIT_LABEL__LABEL);
		createEAttribute(unitLabelEClass, UNIT_LABEL__NAME);

		interfaceFieldEClass = createEClass(INTERFACE_FIELD);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__REQUIRED);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__DEFAULT_VALUE);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__PLACEHOLDER);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__VALIDATION_PATTERN);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__REPEATED_FIELD);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__SECOND_DISPLAY_LABEL);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__SECOND_TITLE);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__SECOND_PLACEHOLDER);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__SECOND_HELP);

		dataTypeFieldEClass = createEClass(DATA_TYPE_FIELD);
		createEReference(dataTypeFieldEClass, DATA_TYPE_FIELD__DATA_TYPE);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__ENCRYPT);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__INTERFACE_TYPE);

		dateFieldEClass = createEClass(DATE_FIELD);
		createEAttribute(dateFieldEClass, DATE_FIELD__DETAILS);
		createEAttribute(dateFieldEClass, DATE_FIELD__FORMAT);

		selectableUnitEClass = createEClass(SELECTABLE_UNIT);

		singletonUnitEClass = createEClass(SINGLETON_UNIT);
		createEReference(singletonUnitEClass, SINGLETON_UNIT__TITLE);

		collectionUnitEClass = createEClass(COLLECTION_UNIT);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__UNIT_TITLE);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__ELEMENT_TITLE);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__SELECTION);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__FIND_CONTAINER_SELECTION);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__FIND_ELEMENT_SELECTION);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__FILTER);
		createEReference(collectionUnitEClass, COLLECTION_UNIT__SUPPORTED_FILTERS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__EMPTY_MESSAGE);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__OMIT_FIELD_LABELS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__NEXT_NPAGES);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PREVIOUS_NPAGES);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__NEXT_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__NEXT_PAGE_ICON_NAME);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PREVIOUS_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__FIRST_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__FIRST_PAGE_ICON_NAME);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__LAST_PAGE_LABEL);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__LAST_PAGE_ICON_NAME);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PAGINATION_CLASS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS);
		createEAttribute(collectionUnitEClass, COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS);

		editUnitEClass = createEClass(EDIT_UNIT);
		createEAttribute(editUnitEClass, EDIT_UNIT__USE_CAPTCHA);
		createEReference(editUnitEClass, EDIT_UNIT__DISABLE_WHEN);
		createEReference(editUnitEClass, EDIT_UNIT__CONFIRM_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CONFIRM_LABEL);
		createEReference(editUnitEClass, EDIT_UNIT__CONFIRM_MESSAGE);
		createEReference(editUnitEClass, EDIT_UNIT__SUCCESS_MESSAGE);
		createEReference(editUnitEClass, EDIT_UNIT__CANCEL_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CANCEL_LABEL);
		createEAttribute(editUnitEClass, EDIT_UNIT__UNIT_INPUT_GROUP_CLASS);

		createUnitEClass = createEClass(CREATE_UNIT);

		updateUnitEClass = createEClass(UPDATE_UNIT);
		createEAttribute(updateUnitEClass, UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING);
		createEAttribute(updateUnitEClass, UPDATE_UNIT__DISPLAY_EMPTY_FORM);

		createUpdateUnitEClass = createEClass(CREATE_UPDATE_UNIT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__UPDATE_URI_ELEMENT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CLEAR_LABEL);

		mapUnitEClass = createEClass(MAP_UNIT);
		createEAttribute(mapUnitEClass, MAP_UNIT__READ_ONLY);
		createEAttribute(mapUnitEClass, MAP_UNIT__DEFAULT_ZOOM_LEVEL);
		createEReference(mapUnitEClass, MAP_UNIT__LOCATION);
		createEReference(mapUnitEClass, MAP_UNIT__PLACE_NAME);

		detailsUnitEClass = createEClass(DETAILS_UNIT);
		createEReference(detailsUnitEClass, DETAILS_UNIT__SELECTION);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__OMIT_FIELD_LABELS);

		tabularUnitEClass = createEClass(TABULAR_UNIT);
		createEAttribute(tabularUnitEClass, TABULAR_UNIT__ROW_CLASSES);

		cardsUnitEClass = createEClass(CARDS_UNIT);
		createEReference(cardsUnitEClass, CARDS_UNIT__BADGES);
		createEAttribute(cardsUnitEClass, CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION);
		createEAttribute(cardsUnitEClass, CARDS_UNIT__LOCAL_ROW_CLASS);
		createEAttribute(cardsUnitEClass, CARDS_UNIT__LOCAL_COLUMN_CLASS);
		createEAttribute(cardsUnitEClass, CARDS_UNIT__LOCAL_CARD_CLASS);
		createEAttribute(cardsUnitEClass, CARDS_UNIT__LOCAL_CARD_HEADER_CLASS);
		createEAttribute(cardsUnitEClass, CARDS_UNIT__LOCAL_CARD_BODY_CLASS);
		createEAttribute(cardsUnitEClass, CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS);
		createEAttribute(cardsUnitEClass, CARDS_UNIT__LOCAL_BADGE_CLASS);

		badgeEClass = createEClass(BADGE);
		createEReference(badgeEClass, BADGE__DISPLAYED_ON);
		createEAttribute(badgeEClass, BADGE__ICON_NAME);
		createEReference(badgeEClass, BADGE__VALUE);
		createEReference(badgeEClass, BADGE__TITLE);
		createEReference(badgeEClass, BADGE__DISPLAY_WHEN);
		createEAttribute(badgeEClass, BADGE__LOCAL_BADGE_CLASS);

		textCardsUnitEClass = createEClass(TEXT_CARDS_UNIT);

		dateCardsUnitEClass = createEClass(DATE_CARDS_UNIT);
		createEReference(dateCardsUnitEClass, DATE_CARDS_UNIT__ELEMENT_DATE);

		imageUnitEClass = createEClass(IMAGE_UNIT);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_PATH_FEATURE);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_FILTER);
		createEReference(imageUnitEClass, IMAGE_UNIT__MISSING_IMAGE_FILTER);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__MISSING_IMAGE_PATH);

		imageCardsUnitEClass = createEClass(IMAGE_CARDS_UNIT);
		createEAttribute(imageCardsUnitEClass, IMAGE_CARDS_UNIT__OVERLAY_TITLE);
		createEAttribute(imageCardsUnitEClass, IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT);
		createEAttribute(imageCardsUnitEClass, IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT);

		sliderUnitEClass = createEClass(SLIDER_UNIT);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__SHOW_TIME);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__TRANSITION_TIME);

		galleryUnitEClass = createEClass(GALLERY_UNIT);
		createEReference(galleryUnitEClass, GALLERY_UNIT__FULL_SIZE_FILTER);
		createEAttribute(galleryUnitEClass, GALLERY_UNIT__SHOW_TIME);
		createEAttribute(galleryUnitEClass, GALLERY_UNIT__TRANSITION_TIME);

		controlUnitEClass = createEClass(CONTROL_UNIT);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__SUBMIT_LABEL);
		createEReference(controlUnitEClass, CONTROL_UNIT__CANCEL_DESTINATION);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__CANCEL_LABEL);

		searchUnitEClass = createEClass(SEARCH_UNIT);
		createEReference(searchUnitEClass, SEARCH_UNIT__RESULTS_DESTINATION);

		registrationUnitEClass = createEClass(REGISTRATION_UNIT);

		loginUnitEClass = createEClass(LOGIN_UNIT);

		logoutUnitEClass = createEClass(LOGOUT_UNIT);

		forgottenPasswordUnitEClass = createEClass(FORGOTTEN_PASSWORD_UNIT);
		createEReference(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT);
		createEAttribute(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT);
		createEAttribute(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT);
		createEAttribute(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE);
		createEAttribute(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION);
		createEAttribute(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE);

		resetPasswordUnitEClass = createEClass(RESET_PASSWORD_UNIT);

		actionContainerEClass = createEClass(ACTION_CONTAINER);
		createEAttribute(actionContainerEClass, ACTION_CONTAINER__CONTAINER_ACTIONS_PLACEMENT);
		createEAttribute(actionContainerEClass, ACTION_CONTAINER__INSTANCE_ACTIONS_PLACEMENT);
		createEReference(actionContainerEClass, ACTION_CONTAINER__ACTIONS);
		createEAttribute(actionContainerEClass, ACTION_CONTAINER__ACTION_NAVIGATION_CLASS);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__USED_BY);
		createEAttribute(actionEClass, ACTION__ICON_NAME);
		createEAttribute(actionEClass, ACTION__DISABLE);
		createEReference(actionEClass, ACTION__DISPLAY_WHEN);
		createEReference(actionEClass, ACTION__ENABLE_WHEN);
		createEAttribute(actionEClass, ACTION__CONFIRM_MESSAGE);
		createEAttribute(actionEClass, ACTION__SUCCESS_MESSAGE);
		createEAttribute(actionEClass, ACTION__FAILURE_MESSAGE);
		createEAttribute(actionEClass, ACTION__ANCHOR_CLASS);
		createEAttribute(actionEClass, ACTION__HEADER_CLASS);
		createEAttribute(actionEClass, ACTION__FOOTER_CLASS);
		createEReference(actionEClass, ACTION__CONTAINING_TYPE);

		securityActionEClass = createEClass(SECURITY_ACTION);
		createEReference(securityActionEClass, SECURITY_ACTION__TARGET);

		deleteActionEClass = createEClass(DELETE_ACTION);
		createEAttribute(deleteActionEClass, DELETE_ACTION__REQUIRES_ROLE);
		createEAttribute(deleteActionEClass, DELETE_ACTION__URI_ELEMENT);

		selectActionEClass = createEClass(SELECT_ACTION);
		createEReference(selectActionEClass, SELECT_ACTION__TARGET);
		createEReference(selectActionEClass, SELECT_ACTION__VALUE_PATH);

		containerSelectActionEClass = createEClass(CONTAINER_SELECT_ACTION);

		instanceSelectActionEClass = createEClass(INSTANCE_SELECT_ACTION);

		operationActionEClass = createEClass(OPERATION_ACTION);
		createEReference(operationActionEClass, OPERATION_ACTION__OPERATION);
		createEAttribute(operationActionEClass, OPERATION_ACTION__FILE_EXTENSION);
		createEAttribute(operationActionEClass, OPERATION_ACTION__REQUIRES_ROLE);
		createEAttribute(operationActionEClass, OPERATION_ACTION__URI_ELEMENT);

		containerOperationActionEClass = createEClass(CONTAINER_OPERATION_ACTION);

		instanceOperationActionEClass = createEClass(INSTANCE_OPERATION_ACTION);

		generalOperationActionEClass = createEClass(GENERAL_OPERATION_ACTION);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__TEXT);
		createEReference(messageEClass, MESSAGE__FEATURES);

		// Create enums
		authenticationMenuPlacementEEnum = createEEnum(AUTHENTICATION_MENU_PLACEMENT);
		pageTopMenuOptionsEEnum = createEEnum(PAGE_TOP_MENU_OPTIONS);
		collectionDisplayOptionsEEnum = createEEnum(COLLECTION_DISPLAY_OPTIONS);
		paginationControlPlacementsEEnum = createEEnum(PAGINATION_CONTROL_PLACEMENTS);
		containerActionsPlacementEEnum = createEEnum(CONTAINER_ACTIONS_PLACEMENT);
		instanceActionsPlacementEEnum = createEEnum(INSTANCE_ACTIONS_PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PersistencePackage thePersistencePackage = (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		ImagePackage theImagePackage = (ImagePackage)EPackage.Registry.INSTANCE.getEPackage(ImagePackage.eNS_URI);
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		menuEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		submenuEntryEClass.getESuperTypes().add(this.getMenu());
		submenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		actionMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		actionMenuEntryEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		editStaticTextMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		editStaticTextMenuEntryEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		menuFeatureEClass.getESuperTypes().add(this.getMenuEntry());
		dynamicUnitStylesEClass.getESuperTypes().add(this.getContentUnitStyles());
		collectionUnitStylesEClass.getESuperTypes().add(this.getDynamicUnitStyles());
		defaultUnitStylesEClass.getESuperTypes().add(this.getCollectionUnitStyles());
		cardsUnitStylesEClass.getESuperTypes().add(this.getCollectionUnitStyles());
		detailsUnitStylesEClass.getESuperTypes().add(this.getDynamicUnitStyles());
		formUnitStylesEClass.getESuperTypes().add(this.getDynamicUnitStyles());
		galleryUnitStylesEClass.getESuperTypes().add(this.getCollectionUnitStyles());
		sliderUnitStylesEClass.getESuperTypes().add(this.getCollectionUnitStyles());
		staticUnitStylesEClass.getESuperTypes().add(this.getContentUnitStyles());
		tabularUnitStylesEClass.getESuperTypes().add(this.getCollectionUnitStyles());
		pageEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		contentUnitEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		staticUnitEClass.getESuperTypes().add(this.getContentUnit());
		createSitemapUnitEClass.getESuperTypes().add(this.getContentUnit());
		dynamicUnitEClass.getESuperTypes().add(this.getContentUnit());
		dynamicUnitEClass.getESuperTypes().add(this.getActionContainer());
		unitFeatureEClass.getESuperTypes().add(this.getUnitField());
		unitFeatureEClass.getESuperTypes().add(this.getActionContainer());
		unitElementEClass.getESuperTypes().add(this.getUnitFeature());
		unitAssociationEClass.getESuperTypes().add(this.getUnitFeature());
		unitAssociationEClass.getESuperTypes().add(thePersistencePackage.getAssociationReference());
		childPathAttributeEClass.getESuperTypes().add(thePersistencePackage.getFeatureChildPath());
		childPathAssociationEClass.getESuperTypes().add(thePersistencePackage.getFeatureChildPath());
		childPathAssociationEClass.getESuperTypes().add(thePersistencePackage.getAssociationReference());
		featurePathEClass.getESuperTypes().add(theExpressionPackage.getVariable());
		featurePathAttributeEClass.getESuperTypes().add(this.getFeaturePath());
		featurePathAssociationEClass.getESuperTypes().add(this.getFeaturePath());
		featurePathAssociationEClass.getESuperTypes().add(thePersistencePackage.getAssociationReference());
		featurePathLabelEClass.getESuperTypes().add(this.getFeaturePath());
		unitLabelEClass.getESuperTypes().add(this.getUnitField());
		interfaceFieldEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		interfaceFieldEClass.getESuperTypes().add(this.getUnitField());
		dataTypeFieldEClass.getESuperTypes().add(this.getInterfaceField());
		dateFieldEClass.getESuperTypes().add(this.getInterfaceField());
		singletonUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		collectionUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		collectionUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		editUnitEClass.getESuperTypes().add(this.getSingletonUnit());
		createUnitEClass.getESuperTypes().add(this.getEditUnit());
		updateUnitEClass.getESuperTypes().add(this.getEditUnit());
		updateUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		createUpdateUnitEClass.getESuperTypes().add(this.getEditUnit());
		createUpdateUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		mapUnitEClass.getESuperTypes().add(this.getEditUnit());
		mapUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		detailsUnitEClass.getESuperTypes().add(this.getSingletonUnit());
		detailsUnitEClass.getESuperTypes().add(this.getSelectableUnit());
		tabularUnitEClass.getESuperTypes().add(this.getCollectionUnit());
		cardsUnitEClass.getESuperTypes().add(this.getCollectionUnit());
		textCardsUnitEClass.getESuperTypes().add(this.getCardsUnit());
		dateCardsUnitEClass.getESuperTypes().add(this.getCardsUnit());
		imageUnitEClass.getESuperTypes().add(this.getCollectionUnit());
		imageCardsUnitEClass.getESuperTypes().add(this.getCardsUnit());
		imageCardsUnitEClass.getESuperTypes().add(this.getImageUnit());
		sliderUnitEClass.getESuperTypes().add(this.getImageUnit());
		galleryUnitEClass.getESuperTypes().add(this.getImageUnit());
		controlUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		searchUnitEClass.getESuperTypes().add(this.getControlUnit());
		registrationUnitEClass.getESuperTypes().add(this.getEditUnit());
		registrationUnitEClass.getESuperTypes().add(theSecurityPackage.getSecurityUnit());
		loginUnitEClass.getESuperTypes().add(this.getEditUnit());
		loginUnitEClass.getESuperTypes().add(theSecurityPackage.getSecurityUnit());
		logoutUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		logoutUnitEClass.getESuperTypes().add(theSecurityPackage.getSecurityUnit());
		forgottenPasswordUnitEClass.getESuperTypes().add(this.getEditUnit());
		forgottenPasswordUnitEClass.getESuperTypes().add(theSecurityPackage.getSecurityUnit());
		resetPasswordUnitEClass.getESuperTypes().add(this.getEditUnit());
		resetPasswordUnitEClass.getESuperTypes().add(theSecurityPackage.getSecurityUnit());
		actionEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		securityActionEClass.getESuperTypes().add(this.getAction());
		deleteActionEClass.getESuperTypes().add(this.getAction());
		selectActionEClass.getESuperTypes().add(this.getAction());
		containerSelectActionEClass.getESuperTypes().add(this.getSelectAction());
		instanceSelectActionEClass.getESuperTypes().add(this.getSelectAction());
		operationActionEClass.getESuperTypes().add(this.getAction());
		containerOperationActionEClass.getESuperTypes().add(this.getOperationAction());
		instanceOperationActionEClass.getESuperTypes().add(this.getOperationAction());
		generalOperationActionEClass.getESuperTypes().add(this.getOperationAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(webUIEClass, WebUI.class, "WebUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebUI_Persistence(), thePersistencePackage.getPersistence(), null, "persistence", null, 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_Navigation(), this.getNavigation(), this.getNavigation_PartOf(), "navigation", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_Services(), theServicePackage.getServices(), null, "services", null, 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_Pages(), this.getPage(), this.getPage_WebUI(), "pages", null, 0, -1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebUI_UseFormFloatingLabels(), ecorePackage.getEBoolean(), "useFormFloatingLabels", "false", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebUI_DefaultDateFormat(), ecorePackage.getEString(), "defaultDateFormat", "jS F Y", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebUI_DefaultTimeFormat(), ecorePackage.getEString(), "defaultTimeFormat", "G.i", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebUI_DefaultDateTimeFormat(), ecorePackage.getEString(), "defaultDateTimeFormat", "jS F Y G.i", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebUI_DefaultCancelLabel(), ecorePackage.getEString(), "defaultCancelLabel", "Cancel", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebUI_DefaultSaveLabel(), ecorePackage.getEString(), "defaultSaveLabel", "Save", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebUI_DefaultPageStyleClass(), ecorePackage.getEString(), "defaultPageStyleClass", "", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_DefaultStyles(), this.getDefaultUnitStyles(), null, "defaultStyles", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_DefaultCardsStyles(), this.getCardsUnitStyles(), null, "defaultCardsStyles", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_DefaultDetailsStyles(), this.getDetailsUnitStyles(), null, "defaultDetailsStyles", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_DefaultFormStyles(), this.getFormUnitStyles(), null, "defaultFormStyles", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_DefaultGalleryStyles(), this.getGalleryUnitStyles(), null, "defaultGalleryStyles", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_DefaultSliderStyles(), this.getSliderUnitStyles(), null, "defaultSliderStyles", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_DefaultStaticStyles(), this.getStaticUnitStyles(), null, "defaultStaticStyles", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebUI_DefaultTabularStyles(), this.getTabularUnitStyles(), null, "defaultTabularStyles", null, 1, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebUI_DefaultMaximumUploadSize(), ecorePackage.getEInt(), "defaultMaximumUploadSize", "2000000", 0, 1, WebUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(navigationEClass, Navigation.class, "Navigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigation_PartOf(), this.getWebUI(), this.getWebUI_Navigation(), "partOf", null, 1, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigation_Menus(), this.getMenu(), null, "menus", null, 0, -1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigation_NavbarClass(), ecorePackage.getEString(), "navbarClass", "navbar", 0, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigation_AuthenticationMenuPlacement(), this.getAuthenticationMenuPlacement(), "authenticationMenuPlacement", null, 0, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavigation_AuthenticationBarClass(), ecorePackage.getEString(), "authenticationBarClass", "nav", 0, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Entries(), this.getMenuEntry(), this.getMenuEntry_PartOf(), "entries", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_OmitCaption(), ecorePackage.getEBoolean(), "omitCaption", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_CaptionClass(), ecorePackage.getEString(), "captionClass", "menu_caption", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_StyleClass(), ecorePackage.getEString(), "styleClass", "menu", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMenu_LayoutClass(), ecorePackage.getEString(), "layoutClass", "collapsible", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(menuEntryEClass, MenuEntry.class, "MenuEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuEntry_PartOf(), this.getMenu(), this.getMenu_Entries(), "partOf", null, 1, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(submenuEntryEClass, SubmenuEntry.class, "SubmenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmenuEntry_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, SubmenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionMenuEntryEClass, ActionMenuEntry.class, "ActionMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionMenuEntry_Destination(), this.getContentUnit(), null, "destination", null, 1, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(editStaticTextMenuEntryEClass, EditStaticTextMenuEntry.class, "EditStaticTextMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuFeatureEClass, MenuFeature.class, "MenuFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentUnitStylesEClass, ContentUnitStyles.class, "ContentUnitStyles", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentUnitStyles_SectionClass(), ecorePackage.getEString(), "sectionClass", "", 0, 1, ContentUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnitStyles_CaptionClass(), ecorePackage.getEString(), "captionClass", "", 0, 1, ContentUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnitStyles_ContentClass(), ecorePackage.getEString(), "contentClass", "", 0, 1, ContentUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicUnitStylesEClass, DynamicUnitStyles.class, "DynamicUnitStyles", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicUnitStyles_FieldListClass(), ecorePackage.getEString(), "fieldListClass", "", 0, 1, DynamicUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnitStyles_DefinitionFieldListClass(), ecorePackage.getEString(), "definitionFieldListClass", "", 0, 1, DynamicUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnitStyles_FieldLabelClass(), ecorePackage.getEString(), "fieldLabelClass", "", 0, 1, DynamicUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnitStyles_FieldValueClass(), ecorePackage.getEString(), "fieldValueClass", "", 0, 1, DynamicUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnitStyles_ControlClass(), ecorePackage.getEString(), "controlClass", "", 0, 1, DynamicUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnitStyles_ActionNavigationClass(), ecorePackage.getEString(), "actionNavigationClass", "", 0, 1, DynamicUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnitStyles_AnchorClass(), ecorePackage.getEString(), "anchorClass", "", 0, 1, DynamicUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionUnitStylesEClass, CollectionUnitStyles.class, "CollectionUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionUnitStyles_InstanceControlClass(), ecorePackage.getEString(), "instanceControlClass", "", 0, 1, CollectionUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnitStyles_InstanceAnchorClass(), ecorePackage.getEString(), "instanceAnchorClass", "", 0, 1, CollectionUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultUnitStylesEClass, DefaultUnitStyles.class, "DefaultUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardsUnitStylesEClass, CardsUnitStyles.class, "CardsUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardsUnitStyles_RowClass(), ecorePackage.getEString(), "rowClass", "row", 0, 1, CardsUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnitStyles_ColumnClass(), ecorePackage.getEString(), "columnClass", "col", 0, 1, CardsUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnitStyles_CardClass(), ecorePackage.getEString(), "cardClass", "card", 0, 1, CardsUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnitStyles_CardHeaderClass(), ecorePackage.getEString(), "cardHeaderClass", "card-heder", 0, 1, CardsUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnitStyles_CardBodyClass(), ecorePackage.getEString(), "cardBodyClass", "card-body", 0, 1, CardsUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnitStyles_CardFooterClass(), ecorePackage.getEString(), "cardFooterClass", "card-footer", 0, 1, CardsUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnitStyles_BadgeClass(), ecorePackage.getEString(), "badgeClass", "badge", 0, 1, CardsUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailsUnitStylesEClass, DetailsUnitStyles.class, "DetailsUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formUnitStylesEClass, FormUnitStyles.class, "FormUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormUnitStyles_InputGroupClass(), ecorePackage.getEString(), "inputGroupClass", "", 0, 1, FormUnitStyles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(galleryUnitStylesEClass, GalleryUnitStyles.class, "GalleryUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sliderUnitStylesEClass, SliderUnitStyles.class, "SliderUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticUnitStylesEClass, StaticUnitStyles.class, "StaticUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabularUnitStylesEClass, TabularUnitStyles.class, "TabularUnitStyles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_WebUI(), this.getWebUI(), this.getWebUI_Pages(), "webUI", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_ParentPage(), this.getPageLink(), null, "parentPage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_ChildPages(), this.getPageLink(), this.getPageLink_TargetPage(), "childPages", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Units(), this.getContentUnit(), this.getContentUnit_DisplayedOn(), "units", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_StyleClass(), ecorePackage.getEString(), "styleClass", "", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pageLinkEClass, PageLink.class, "PageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageLink_TargetPage(), this.getPage(), this.getPage_ChildPages(), "targetPage", null, 1, 1, PageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentUnitEClass, ContentUnit.class, "ContentUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentUnit_DisplayedOn(), this.getPage(), this.getPage_Units(), "displayedOn", null, 1, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContentUnit_CreateDefaultUriElement(), ecorePackage.getEBoolean(), "createDefaultUriElement", "true", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_PurposeSummary(), ecorePackage.getEString(), "purposeSummary", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Alternative(), ecorePackage.getEString(), "alternative", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_SectionClass(), ecorePackage.getEString(), "sectionClass", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContentUnit_OmitCaption(), ecorePackage.getEBoolean(), "omitCaption", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_LocalCaptionClass(), ecorePackage.getEString(), "localCaptionClass", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_LocalContentClass(), ecorePackage.getEString(), "localContentClass", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContentUnit_PageDisplayedOn(), this.getPage(), null, "pageDisplayedOn", null, 0, 1, ContentUnit.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(staticUnitEClass, StaticUnit.class, "StaticUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticUnit_Content(), ecorePackage.getEString(), "content", null, 0, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(createSitemapUnitEClass, CreateSitemapUnit.class, "CreateSitemapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateSitemapUnit_DeployedURL(), ecorePackage.getEString(), "deployedURL", null, 1, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateSitemapUnit_Filename(), ecorePackage.getEString(), "filename", "sitemap.xml", 1, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dynamicUnitEClass, DynamicUnit.class, "DynamicUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicUnit_ContentType(), thePersistencePackage.getEntity(), null, "contentType", null, 1, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_ContainingType(), thePersistencePackage.getEntity(), null, "containingType", null, 0, 1, DynamicUnit.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_RouteActuals(), this.getRouteActual(), this.getRouteActual_ActualFor(), "routeActuals", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_DisplayFields(), this.getUnitField(), this.getUnitField_DisplayedOn(), "displayFields", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_HasWhenFieldsEmptyAddImplicitFields(), ecorePackage.getEBoolean(), "hasWhenFieldsEmptyAddImplicitFields", "true", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_HideWhen(), theExpressionPackage.getPredicate(), null, "hideWhen", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_MessageWhenHidden(), ecorePackage.getEString(), "messageWhenHidden", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Header(), ecorePackage.getEString(), "header", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_HeaderClass(), ecorePackage.getEString(), "headerClass", "unit_header", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_LocalFieldListClass(), ecorePackage.getEString(), "localFieldListClass", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_LocalFieldLabelClass(), ecorePackage.getEString(), "localFieldLabelClass", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_LocalFieldValueClass(), ecorePackage.getEString(), "localFieldValueClass", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_LocalControlClass(), ecorePackage.getEString(), "localControlClass", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_LocalInstanceControlClass(), ecorePackage.getEString(), "localInstanceControlClass", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_LocalAnchorClass(), ecorePackage.getEString(), "localAnchorClass", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_LocalInstanceAnchorClass(), ecorePackage.getEString(), "localInstanceAnchorClass", "", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_FooterClass(), ecorePackage.getEString(), "footerClass", "unit_footer", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeActualEClass, RouteActual.class, "RouteActual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteActual_ActualFor(), this.getDynamicUnit(), this.getDynamicUnit_RouteActuals(), "actualFor", null, 1, 1, RouteActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteActual_RouteParameter(), thePersistencePackage.getAttribute(), null, "routeParameter", null, 1, 1, RouteActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteActual_Value(), theExpressionPackage.getExpression(), null, "value", null, 1, 1, RouteActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFieldEClass, UnitField.class, "UnitField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitField_DisplayedOn(), this.getDynamicUnit(), this.getDynamicUnit_DisplayFields(), "displayedOn", null, 1, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitField_HideWhen(), theExpressionPackage.getPredicate(), null, "hideWhen", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_Title(), ecorePackage.getEString(), "title", "", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_Help(), ecorePackage.getEString(), "help", "", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_EscapeHTML(), ecorePackage.getEBoolean(), "escapeHTML", "true", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_CollectionDisplayOption(), this.getCollectionDisplayOptions(), "collectionDisplayOption", "LineDirection", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_Truncate(), ecorePackage.getEBoolean(), "truncate", "false", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_DateFormat(), ecorePackage.getEString(), "dateFormat", "", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_DisableInput(), ecorePackage.getEBoolean(), "disableInput", "false", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFeatureEClass, UnitFeature.class, "UnitFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitFeature_DisplayLabel(), ecorePackage.getEString(), "displayLabel", "", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitFeature_ForcedValue(), theExpressionPackage.getExpression(), null, "forcedValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_CollectionUiAllowAdd(), ecorePackage.getEBoolean(), "collectionUiAllowAdd", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_CollectionUiAllowRemove(), ecorePackage.getEBoolean(), "collectionUiAllowRemove", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_DefaultDisplayValue(), ecorePackage.getEString(), "defaultDisplayValue", "", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitFeature_DisplayDefaultWhen(), theExpressionPackage.getPredicate(), null, "displayDefaultWhen", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_EmptyDisplayValue(), ecorePackage.getEString(), "emptyDisplayValue", "", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_Autofocus(), ecorePackage.getEBoolean(), "autofocus", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_HeaderClass(), ecorePackage.getEString(), "headerClass", "", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_FieldLabelClass(), ecorePackage.getEString(), "fieldLabelClass", "", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_FieldValueClass(), ecorePackage.getEString(), "fieldValueClass", "", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_InputGroupClass(), ecorePackage.getEString(), "inputGroupClass", "", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_FooterClass(), ecorePackage.getEString(), "footerClass", "", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitElementEClass, UnitElement.class, "UnitElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitElement_Attribute(), thePersistencePackage.getAttribute(), null, "attribute", null, 1, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnitElement.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitElement_DefaultValue(), theExpressionPackage.getExpression(), null, "defaultValue", null, 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_Placeholder(), ecorePackage.getEString(), "placeholder", "", 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_ValidationPattern(), ecorePackage.getEString(), "validationPattern", "", 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitAssociationEClass, UnitAssociation.class, "UnitAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitAssociation_ContainingType(), thePersistencePackage.getEntity(), null, "containingType", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, UnitAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_TargetEntity(), thePersistencePackage.getEntity(), null, "targetEntity", null, 0, 1, UnitAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_Options(), thePersistencePackage.getSelection(), null, "options", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_OptionsFilter(), thePersistencePackage.getFilter(), null, "optionsFilter", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childPathAttributeEClass, ChildPathAttribute.class, "ChildPathAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildPathAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChildPathAttribute.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getChildPathAttribute_Attribute(), thePersistencePackage.getAttribute(), null, "attribute", null, 1, 1, ChildPathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChildPathAttribute_ContainingType(), thePersistencePackage.getEntity(), null, "containingType", null, 0, 1, ChildPathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(childPathAssociationEClass, ChildPathAssociation.class, "ChildPathAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildPathAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, ChildPathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChildPathAssociation_TargetEntity(), thePersistencePackage.getEntity(), null, "targetEntity", null, 0, 1, ChildPathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChildPathAssociation_ContainingType(), thePersistencePackage.getEntity(), null, "containingType", null, 0, 1, ChildPathAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featurePathEClass, FeaturePath.class, "FeaturePath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturePath_ContainingType(), thePersistencePackage.getEntity(), null, "containingType", null, 0, 1, FeaturePath.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeaturePath_UseContainerAsContext(), ecorePackage.getEBoolean(), "useContainerAsContext", "false", 0, 1, FeaturePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePathAttributeEClass, FeaturePathAttribute.class, "FeaturePathAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeaturePathAttribute.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeaturePathAttribute_Attribute(), thePersistencePackage.getAttribute(), null, "attribute", null, 1, 1, FeaturePathAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePathAssociationEClass, FeaturePathAssociation.class, "FeaturePathAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, FeaturePathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeaturePathAssociation_TargetEntity(), thePersistencePackage.getEntity(), null, "targetEntity", null, 0, 1, FeaturePathAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featurePathLabelEClass, FeaturePathLabel.class, "FeaturePathLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePathLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeaturePathLabel.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeaturePathLabel_Label(), thePersistencePackage.getModelLabel(), null, "label", null, 1, 1, FeaturePathLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitLabelEClass, UnitLabel.class, "UnitLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitLabel_Label(), thePersistencePackage.getModelLabel(), null, "label", null, 1, 1, UnitLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnitLabel.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceFieldEClass, InterfaceField.class, "InterfaceField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceField_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_Placeholder(), ecorePackage.getEString(), "placeholder", "", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_ValidationPattern(), ecorePackage.getEString(), "validationPattern", "", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_RepeatedField(), ecorePackage.getEBoolean(), "repeatedField", "false", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceField_SecondDisplayLabel(), ecorePackage.getEString(), "secondDisplayLabel", "", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceField_SecondTitle(), ecorePackage.getEString(), "secondTitle", "", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceField_SecondPlaceholder(), ecorePackage.getEString(), "secondPlaceholder", "", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceField_SecondHelp(), ecorePackage.getEString(), "secondHelp", "", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeFieldEClass, DataTypeField.class, "DataTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeField_DataType(), theBasePackage.getDataType(), null, "dataType", null, 1, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_Encrypt(), ecorePackage.getEBoolean(), "encrypt", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_InterfaceType(), ecorePackage.getEString(), "interfaceType", null, 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateFieldEClass, DateField.class, "DateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateField_Details(), thePersistencePackage.getDateDetails(), "details", "DateOnly", 1, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateField_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selectableUnitEClass, SelectableUnit.class, "SelectableUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singletonUnitEClass, SingletonUnit.class, "SingletonUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingletonUnit_Title(), thePersistencePackage.getLabel(), null, "title", null, 0, 1, SingletonUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionUnitEClass, CollectionUnit.class, "CollectionUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionUnit_UnitTitle(), thePersistencePackage.getLabel(), null, "unitTitle", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollectionUnit_ElementTitle(), this.getFeaturePath(), null, "elementTitle", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_TruncateElementTitle(), ecorePackage.getEBoolean(), "truncateElementTitle", "false", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Selection(), thePersistencePackage.getSelection(), null, "selection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_FindContainerSelection(), thePersistencePackage.getSelection(), null, "findContainerSelection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_FindElementSelection(), thePersistencePackage.getSelection(), null, "findElementSelection", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_Filter(), thePersistencePackage.getFilter(), null, "filter", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionUnit_SupportedFilters(), thePersistencePackage.getFilter(), null, "supportedFilters", null, 0, -1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_EmptyMessage(), ecorePackage.getEString(), "emptyMessage", null, 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_OmitFieldLabels(), ecorePackage.getEBoolean(), "omitFieldLabels", "false", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_DefaultPaginationSize(), ecorePackage.getEInt(), "defaultPaginationSize", "10", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_MaximumPaginationSize(), ecorePackage.getEInt(), "maximumPaginationSize", "0", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_PaginationControlPlacement(), this.getPaginationControlPlacements(), "paginationControlPlacement", "Below", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_NextNpages(), ecorePackage.getEInt(), "nextNpages", "2", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousNpages(), ecorePackage.getEInt(), "previousNpages", "2", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_NextPageLabel(), ecorePackage.getEString(), "nextPageLabel", "&gt;", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_NextPageIconName(), ecorePackage.getEString(), "nextPageIconName", "chevron_right", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousPageLabel(), ecorePackage.getEString(), "previousPageLabel", "&lt;", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_PreviousPageIconName(), ecorePackage.getEString(), "previousPageIconName", "chevron_left", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_UseDisabledPageLinks(), ecorePackage.getEBoolean(), "useDisabledPageLinks", "true", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_UseFirstLastPageLinks(), ecorePackage.getEBoolean(), "useFirstLastPageLinks", "false", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_FirstPageLabel(), ecorePackage.getEString(), "firstPageLabel", "<<", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_FirstPageIconName(), ecorePackage.getEString(), "firstPageIconName", "first_page", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_LastPageLabel(), ecorePackage.getEString(), "lastPageLabel", ">>", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionUnit_LastPageIconName(), ecorePackage.getEString(), "lastPageIconName", "last_page", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PaginationClass(), ecorePackage.getEString(), "paginationClass", "pagination", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PaginationElementClass(), ecorePackage.getEString(), "paginationElementClass", "page-item", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionUnit_PaginationAnchorClass(), ecorePackage.getEString(), "paginationAnchorClass", "page-link", 0, 1, CollectionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editUnitEClass, EditUnit.class, "EditUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEditUnit_UseCaptcha(), ecorePackage.getEBoolean(), "useCaptcha", "false", 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_DisableWhen(), theExpressionPackage.getPredicate(), null, "disableWhen", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_ConfirmDestination(), this.getPage(), null, "confirmDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_ConfirmLabel(), ecorePackage.getEString(), "confirmLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEditUnit_ConfirmMessage(), this.getMessage(), null, "confirmMessage", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_SuccessMessage(), this.getMessage(), null, "successMessage", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_CancelLabel(), ecorePackage.getEString(), "cancelLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_UnitInputGroupClass(), ecorePackage.getEString(), "unitInputGroupClass", "", 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createUnitEClass, CreateUnit.class, "CreateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateUnitEClass, UpdateUnit.class, "UpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateUnit_OnSaveContinueEditing(), ecorePackage.getEBoolean(), "onSaveContinueEditing", "false", 0, 1, UpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateUnit_DisplayEmptyForm(), ecorePackage.getEBoolean(), "displayEmptyForm", "true", 0, 1, UpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createUpdateUnitEClass, CreateUpdateUnit.class, "CreateUpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUpdateUnit_OnSaveContinueEditing(), ecorePackage.getEBoolean(), "onSaveContinueEditing", "false", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_UpdateUriElement(), ecorePackage.getEString(), "updateUriElement", "", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_ClearLabel(), ecorePackage.getEString(), "clearLabel", null, 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mapUnitEClass, MapUnit.class, "MapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapUnit_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", "true", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapUnit_DefaultZoomLevel(), ecorePackage.getEInt(), "defaultZoomLevel", "12", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapUnit_Location(), thePersistencePackage.getLocationAttribute(), null, "location", null, 1, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapUnit_PlaceName(), thePersistencePackage.getAttribute(), null, "placeName", null, 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailsUnitEClass, DetailsUnit.class, "DetailsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetailsUnit_Selection(), thePersistencePackage.getSelection(), null, "selection", null, 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailsUnit_OmitFieldLabels(), ecorePackage.getEBoolean(), "omitFieldLabels", "false", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tabularUnitEClass, TabularUnit.class, "TabularUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabularUnit_RowClasses(), ecorePackage.getEString(), "rowClasses", "odd_row,even_row", 0, 1, TabularUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cardsUnitEClass, CardsUnit.class, "CardsUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardsUnit_Badges(), this.getBadge(), this.getBadge_DisplayedOn(), "badges", null, 0, -1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnit_OverlaySingleSelectAction(), ecorePackage.getEBoolean(), "overlaySingleSelectAction", null, 0, 1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnit_LocalRowClass(), ecorePackage.getEString(), "localRowClass", "", 0, 1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCardsUnit_LocalColumnClass(), ecorePackage.getEString(), "localColumnClass", "", 0, 1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCardsUnit_LocalCardClass(), ecorePackage.getEString(), "localCardClass", "", 0, 1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCardsUnit_LocalCardHeaderClass(), ecorePackage.getEString(), "localCardHeaderClass", "", 0, 1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnit_LocalCardBodyClass(), ecorePackage.getEString(), "localCardBodyClass", "", 0, 1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnit_LocalCardFooterClass(), ecorePackage.getEString(), "localCardFooterClass", "", 0, 1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardsUnit_LocalBadgeClass(), ecorePackage.getEString(), "localBadgeClass", "", 0, 1, CardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBadge_DisplayedOn(), this.getCardsUnit(), this.getCardsUnit_Badges(), "displayedOn", null, 1, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_IconName(), ecorePackage.getEString(), "iconName", "", 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_Value(), this.getFeaturePath(), null, "value", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_Title(), thePersistencePackage.getAttribute(), null, "title", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBadge_DisplayWhen(), theExpressionPackage.getPredicate(), null, "displayWhen", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBadge_LocalBadgeClass(), ecorePackage.getEString(), "localBadgeClass", "", 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textCardsUnitEClass, TextCardsUnit.class, "TextCardsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateCardsUnitEClass, DateCardsUnit.class, "DateCardsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDateCardsUnit_ElementDate(), this.getFeaturePath(), null, "elementDate", null, 1, 1, DateCardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageUnitEClass, ImageUnit.class, "ImageUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageUnit_ImagePathFeature(), this.getFeaturePath(), null, "imagePathFeature", null, 1, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImageFilter(), theImagePackage.getImageManipulation(), null, "imageFilter", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_MissingImageFilter(), theImagePackage.getImageManipulation(), null, "missingImageFilter", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_MissingImagePath(), ecorePackage.getEString(), "missingImagePath", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageCardsUnitEClass, ImageCardsUnit.class, "ImageCardsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageCardsUnit_OverlayTitle(), ecorePackage.getEBoolean(), "overlayTitle", "false", 0, 1, ImageCardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageCardsUnit_EnableImageEnlargement(), ecorePackage.getEBoolean(), "enableImageEnlargement", null, 0, 1, ImageCardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageCardsUnit_RevealUntruncatedContent(), ecorePackage.getEBoolean(), "revealUntruncatedContent", "false", 0, 1, ImageCardsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliderUnitEClass, SliderUnit.class, "SliderUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSliderUnit_ShowTime(), ecorePackage.getEInt(), "showTime", "-1", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSliderUnit_TransitionTime(), ecorePackage.getEInt(), "transitionTime", "-1", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(galleryUnitEClass, GalleryUnit.class, "GalleryUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGalleryUnit_FullSizeFilter(), theImagePackage.getImageManipulation(), null, "fullSizeFilter", null, 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalleryUnit_ShowTime(), ecorePackage.getEInt(), "showTime", "-1", 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalleryUnit_TransitionTime(), ecorePackage.getEInt(), "transitionTime", "-1", 0, 1, GalleryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlUnitEClass, ControlUnit.class, "ControlUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlUnit_SubmitLabel(), ecorePackage.getEString(), "submitLabel", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getControlUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControlUnit_CancelLabel(), ecorePackage.getEString(), "cancelLabel", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(searchUnitEClass, SearchUnit.class, "SearchUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchUnit_ResultsDestination(), this.getTabularUnit(), null, "resultsDestination", null, 1, 1, SearchUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(registrationUnitEClass, RegistrationUnit.class, "RegistrationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loginUnitEClass, LoginUnit.class, "LoginUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logoutUnitEClass, LogoutUnit.class, "LogoutUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forgottenPasswordUnitEClass, ForgottenPasswordUnit.class, "ForgottenPasswordUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForgottenPasswordUnit_ResetPasswordUnit(), this.getResetPasswordUnit(), null, "resetPasswordUnit", null, 1, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordUnit_UriEmailSent(), ecorePackage.getEString(), "uriEmailSent", "", 1, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordUnit_EmailSubject(), ecorePackage.getEString(), "emailSubject", null, 1, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordUnit_EmailMessage(), ecorePackage.getEString(), "emailMessage", null, 1, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordUnit_EmailSentCaption(), ecorePackage.getEString(), "emailSentCaption", null, 1, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordUnit_EmailSentMessage(), ecorePackage.getEString(), "emailSentMessage", null, 1, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetPasswordUnitEClass, ResetPasswordUnit.class, "ResetPasswordUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionContainerEClass, ActionContainer.class, "ActionContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionContainer_ContainerActionsPlacement(), this.getContainerActionsPlacement(), "containerActionsPlacement", null, 0, 1, ActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionContainer_InstanceActionsPlacement(), this.getInstanceActionsPlacement(), "instanceActionsPlacement", null, 0, 1, ActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionContainer_Actions(), this.getAction(), this.getAction_UsedBy(), "actions", null, 0, -1, ActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionContainer_ActionNavigationClass(), ecorePackage.getEString(), "actionNavigationClass", " ", 0, 1, ActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_UsedBy(), this.getActionContainer(), this.getActionContainer_Actions(), "usedBy", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAction_IconName(), ecorePackage.getEString(), "iconName", "", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_DisplayWhen(), theExpressionPackage.getPredicate(), null, "displayWhen", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_EnableWhen(), theExpressionPackage.getPredicate(), null, "enableWhen", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", "", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAction_SuccessMessage(), ecorePackage.getEString(), "successMessage", "", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_FailureMessage(), ecorePackage.getEString(), "failureMessage", "", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_AnchorClass(), ecorePackage.getEString(), "anchorClass", "", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_ContainingType(), thePersistencePackage.getEntity(), null, "containingType", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityActionEClass, SecurityAction.class, "SecurityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityAction_Target(), theSecurityPackage.getSecurityUnit(), null, "target", null, 1, 1, SecurityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteActionEClass, DeleteAction.class, "DeleteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteAction_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectActionEClass, SelectAction.class, "SelectAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectAction_Target(), this.getSelectableUnit(), null, "target", null, 1, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectAction_ValuePath(), this.getFeaturePath(), null, "valuePath", null, 0, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerSelectActionEClass, ContainerSelectAction.class, "ContainerSelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceSelectActionEClass, InstanceSelectAction.class, "InstanceSelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationActionEClass, OperationAction.class, "OperationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationAction_Operation(), theServicePackage.getBusinessOperation(), null, "operation", null, 1, 1, OperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationAction_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 0, 1, OperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationAction_RequiresRole(), ecorePackage.getEString(), "requiresRole", "", 0, 1, OperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationAction_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, OperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerOperationActionEClass, ContainerOperationAction.class, "ContainerOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceOperationActionEClass, InstanceOperationAction.class, "InstanceOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalOperationActionEClass, GeneralOperationAction.class, "GeneralOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Text(), ecorePackage.getEString(), "text", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Features(), this.getFeaturePath(), null, "features", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authenticationMenuPlacementEEnum, AuthenticationMenuPlacement.class, "AuthenticationMenuPlacement");
		addEEnumLiteral(authenticationMenuPlacementEEnum, AuthenticationMenuPlacement.ABOVE);
		addEEnumLiteral(authenticationMenuPlacementEEnum, AuthenticationMenuPlacement.BELOW);
		addEEnumLiteral(authenticationMenuPlacementEEnum, AuthenticationMenuPlacement.INTEGRATED);

		initEEnum(pageTopMenuOptionsEEnum, PageTopMenuOptions.class, "PageTopMenuOptions");
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.NEVER_INCLUDE);
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.ALWAYS_INCLUDE);
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.INCLUDE_WHEN_AUTHENTICATED);

		initEEnum(collectionDisplayOptionsEEnum, CollectionDisplayOptions.class, "CollectionDisplayOptions");
		addEEnumLiteral(collectionDisplayOptionsEEnum, CollectionDisplayOptions.LINE_DIRECTION);
		addEEnumLiteral(collectionDisplayOptionsEEnum, CollectionDisplayOptions.PAGE_DIRECTION);

		initEEnum(paginationControlPlacementsEEnum, PaginationControlPlacements.class, "PaginationControlPlacements");
		addEEnumLiteral(paginationControlPlacementsEEnum, PaginationControlPlacements.BELOW);
		addEEnumLiteral(paginationControlPlacementsEEnum, PaginationControlPlacements.ABOVE);
		addEEnumLiteral(paginationControlPlacementsEEnum, PaginationControlPlacements.ABOVE_AND_BELOW);

		initEEnum(containerActionsPlacementEEnum, ContainerActionsPlacement.class, "ContainerActionsPlacement");
		addEEnumLiteral(containerActionsPlacementEEnum, ContainerActionsPlacement.ABOVE);
		addEEnumLiteral(containerActionsPlacementEEnum, ContainerActionsPlacement.BELOW);
		addEEnumLiteral(containerActionsPlacementEEnum, ContainerActionsPlacement.FLOAT);

		initEEnum(instanceActionsPlacementEEnum, InstanceActionsPlacement.class, "InstanceActionsPlacement");
		addEEnumLiteral(instanceActionsPlacementEEnum, InstanceActionsPlacement.FOOTER);
		addEEnumLiteral(instanceActionsPlacementEEnum, InstanceActionsPlacement.FLOAT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
		addAnnotation
		  (webUIEClass,
		   source,
		   new String[] {
			   "constraints", "pageNameUnique"
		   });
		addAnnotation
		  (navigationEClass,
		   source,
		   new String[] {
			   "constraints", "menuNameUnique "
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "constraints", "contentUnitNameUniqueWithinPage"
		   });
		addAnnotation
		  (dynamicUnitEClass,
		   source,
		   new String[] {
			   "constraints", "featuresMustBeFromContentType"
		   });
		addAnnotation
		  (unitFeatureEClass,
		   source,
		   new String[] {
			   "constraints", "atMostOneSelectAction noDeleteActions"
		   });
		addAnnotation
		  (unitAssociationEClass,
		   source,
		   new String[] {
			   "constraints", "optionsValidChoice"
		   });
		addAnnotation
		  (singletonUnitEClass,
		   source,
		   new String[] {
			   "constraints", "canOnlyTitleWithSingletons"
		   });
		addAnnotation
		  (collectionUnitEClass,
		   source,
		   new String[] {
			   "constraints", "canOnlyTitleWithSingletons selectionMustNotBeSingleton"
		   });
		addAnnotation
		  (detailsUnitEClass,
		   source,
		   new String[] {
			   "constraints", "selectionValidChoice selectionMustBeSingleton"
		   });
		addAnnotation
		  (actionContainerEClass,
		   source,
		   new String[] {
			   "constraints", "atMostOneDeleteAction"
		   });
		addAnnotation
		  (deleteActionEClass,
		   source,
		   new String[] {
			   "constraints", "canOnlyDeleteSingletons"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (webUIEClass,
		   source,
		   new String[] {
			   "pageNameUnique", "pages->isUnique(name)"
		   });
		addAnnotation
		  (navigationEClass,
		   source,
		   new String[] {
			   "menuNameUnique", "menus->isUnique(name)"
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "contentUnitNameUniqueWithinPage", "units->isUnique(name)"
		   });
		addAnnotation
		  (getContentUnit_PageDisplayedOn(),
		   source,
		   new String[] {
			   "derivation", "if displayedOn.oclIsTypeOf(Page) then\r\n\tdisplayedOn.oclAsType(Page)\r\nelse\r\n\tdisplayedOn.oclAsType(UnitAssociation).displayedOn.pageDisplayedOn\r\nendif"
		   });
		addAnnotation
		  (dynamicUnitEClass,
		   source,
		   new String[] {
			   "featuresMustBeFromContentType", "displayFields\n\t->select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\n\t->select(f | \n\t\tif f.oclIsTypeOf(UnitElement) then\n\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\n\t\telse\n\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\n\t\tendif)\n\t->forAll(f | \n\t\tif f.oclIsTypeOf(UnitElement) then\n\t\t\tcontentType.features->includes(f.oclAsType(UnitElement).attribute)\n\t\telse\n\t\t\tcontentType.features->includes(f.oclAsType(UnitAssociation).association)\n\t\tendif)"
		   });
		addAnnotation
		  (getDynamicUnit_ContainingType(),
		   source,
		   new String[] {
			   "derivation", "if self.oclIsKindOf(CollectionUnit) then\n\tlet collectionUnit : CollectionUnit = self.oclAsType(CollectionUnit)\n\tin if not collectionUnit.findContainerSelection.oclIsUndefined() then\n\t\t\tcollectionUnit.findContainerSelection.definedBy.serves\n\t\telse if not collectionUnit.selection.oclIsUndefined() then\n\t\t\tif collectionUnit.selection.selectPath->notEmpty() then\n\t\t\t\tcollectionUnit.selection.pathType\n\t\t\telse\n\t\t\t\tcontentType.containingType\n\t\t\tendif\n\t\telse\n\t\t\tcontentType.containingType\n\t\tendif endif\n else if self.oclIsKindOf(DetailsUnit) then\n\tlet detailsUnit : DetailsUnit = self.oclAsType(DetailsUnit)\n\tin if not detailsUnit.selection.oclIsUndefined() then\n\t\tif detailsUnit.selection.selectPath->notEmpty() then\n\t\t\tdetailsUnit.selection.pathType\n\t\telse\n\t\t\tdetailsUnit.contentType.containingType\n\t\tendif\n\telse\n\t\tcontentType.containingType\n\tendif\nelse\n\tcontentType.containingType\nendif endif\n"
		   });
		addAnnotation
		  (unitFeatureEClass,
		   source,
		   new String[] {
			   "atMostOneSelectAction", "actions->select(a | a.oclIsKindOf(SelectAction))->size() < 2",
			   "noDeleteActions", "actions->select(a | a.oclIsKindOf(DeleteAction))->isEmpty()"
		   });
		addAnnotation
		  (getUnitElement_Name(),
		   source,
		   new String[] {
			   "derivation", "if attribute.oclIsUndefined() then\n\t\'\'\nelse\n\tattribute.name\nendif"
		   });
		addAnnotation
		  (unitAssociationEClass,
		   source,
		   new String[] {
			   "optionsValidChoice", "not options.oclIsUndefined() implies\n\tdisplayedOn.pageDisplayedOn.webUI.persistence.repositories\n\t\t->select(r : persistence::Repository | r.serves = targetEntity)\n\t\t->collect(r : persistence::Repository | r.selections)\n\t\t->includes(options)"
		   });
		addAnnotation
		  (getUnitAssociation_ContainingType(),
		   source,
		   new String[] {
			   "derivation", "displayedOn.contentType"
		   });
		addAnnotation
		  (getUnitAssociation_IsSourceAssociation(),
		   source,
		   new String[] {
			   "derivation", "not association.oclIsUndefined() implies\n\tcontainingType = association.partOf"
		   });
		addAnnotation
		  (getUnitAssociation_TargetEntity(),
		   source,
		   new String[] {
			   "derivation", "if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif"
		   });
		addAnnotation
		  (getChildPathAttribute_Name(),
		   source,
		   new String[] {
			   "derivation", "if attribute.oclIsUndefined() then\n\t\'\'\nelse\n\tattribute.name\nendif"
		   });
		addAnnotation
		  (getChildPathAttribute_ContainingType(),
		   source,
		   new String[] {
			   "derivation", "if partOf.oclIsTypeOf(UnitAssociation) then\n\tpartOf.oclAsType(UnitAssociation).targetEntity\nelse if partOf.oclIsTypeOf(FeaturePathAssociation) then\n\tpartOf.oclAsType(FeaturePathAssociation).targetEntity\nelse\n\tpartOf.oclAsType(ChildPathAssociation).targetEntity\nendif endif"
		   });
		addAnnotation
		  (getChildPathAssociation_IsSourceAssociation(),
		   source,
		   new String[] {
			   "derivation", "not association.oclIsUndefined() implies\n\tcontainingType.associations->includes(association)"
		   });
		addAnnotation
		  (getChildPathAssociation_TargetEntity(),
		   source,
		   new String[] {
			   "derivation", "if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif"
		   });
		addAnnotation
		  (getChildPathAssociation_ContainingType(),
		   source,
		   new String[] {
			   "derivation", "if partOf.oclIsTypeOf(UnitAssociation) then\n\tpartOf.oclAsType(UnitAssociation).targetEntity\nelse if partOf.oclIsTypeOf(FeaturePathAssociation) then\n\tpartOf.oclAsType(FeaturePathAssociation).targetEntity\nelse\n\tpartOf.oclAsType(ChildPathAssociation).targetEntity\nendif endif"
		   });
		addAnnotation
		  (getFeaturePath_ContainingType(),
		   source,
		   new String[] {
			   "derivation", "if rootContainer.oclIsKindOf(DynamicUnit) then\n\tif useContainerAsContext then\n\t\trootContainer.oclAsType(DynamicUnit).containingType\n\telse\n\t\trootContainer.oclAsType(DynamicUnit).contentType\n\tendif\nelse\n\tlet directType : persistence::Entity\n\t\t= if rootContainer.oclIsKindOf(UnitField) then\n\t\t\t\trootContainer.oclAsType(UnitField).displayedOn.contentType\n\t\t\telse if rootContainer.oclIsKindOf(Action) then\n\t\t\t\trootContainer.oclAsType(Action).containingType\n\t\t\telse if rootContainer.oclIsTypeOf(Badge) then\n\t\t\t\trootContainer.oclAsType(Badge).displayedOn.contentType\n\t\t\telse\n\t\t\t\tnull\n\t\t\tendif endif endif\n\t\tin if useContainerAsContext then\n\t\t\t\tif directType.oclIsUndefined() then\n\t\t\t\t\tnull\n\t\t\t\telse\n\t\t\t\t\tdirectType.containingType\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\tdirectType\n\t\t\tendif\nendif"
		   });
		addAnnotation
		  (getFeaturePathAttribute_Name(),
		   source,
		   new String[] {
			   "derivation", "if attribute.oclIsUndefined() then\n\t\'\'\nelse\n\tattribute.name\nendif\n"
		   });
		addAnnotation
		  (getFeaturePathAssociation_IsSourceAssociation(),
		   source,
		   new String[] {
			   "derivation", "not association.oclIsUndefined() implies\n\tcontainingType = association.partOf"
		   });
		addAnnotation
		  (getFeaturePathAssociation_TargetEntity(),
		   source,
		   new String[] {
			   "derivation", "if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif"
		   });
		addAnnotation
		  (getFeaturePathLabel_Name(),
		   source,
		   new String[] {
			   "derivation", "if label.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tlabel.name\r\nendif\r\n"
		   });
		addAnnotation
		  (getUnitLabel_Name(),
		   source,
		   new String[] {
			   "derivation", "if label.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tlabel.name\r\nendif\r\n"
		   });
		addAnnotation
		  (singletonUnitEClass,
		   source,
		   new String[] {
			   "canOnlyTitleWithSingletons", "not title.oclIsUndefined() implies \n\tif title.oclIsKindOf(persistence::Attribute) then\n\t\ttitle.oclAsType(persistence::Attribute).cardinality <> persistence::Cardinality::Many\n\telse\n\t\ttrue\n\tendif"
		   });
		addAnnotation
		  (collectionUnitEClass,
		   source,
		   new String[] {
			   "canOnlyTitleWithSingletons", "not unitTitle.oclIsUndefined() implies \n\tif unitTitle.oclIsKindOf(persistence::Attribute) then\n\t\tunitTitle.oclAsType(persistence::Attribute).cardinality <> persistence::Cardinality::Many\n\telse\n\t\ttrue\n\tendif",
			   "selectionMustNotBeSingleton", "not selection.oclIsUndefined() implies\r\n\tselection.limit <> 1"
		   });
		addAnnotation
		  (detailsUnitEClass,
		   source,
		   new String[] {
			   "selectionMustBeSingleton", "not selection.oclIsUndefined() implies\r\n\tselection.limit = 1",
			   "selectionValidChoice", "not selection.oclIsUndefined() implies\n\tpageDisplayedOn.webUI.persistence.repositories\n\t\t->select(s : persistence::Repository | not s.serves.oclIsUndefined())\n\t\t->select(s : persistence::Repository | contentType = s.serves)\n\t\t->collect(s : persistence::Repository | s.selections)\n\t\t->includes(selection)"
		   });
		addAnnotation
		  (actionContainerEClass,
		   source,
		   new String[] {
			   "atMostOneDeleteAction", "actions->select(a | a.oclIsKindOf(DeleteAction))->size() < 2"
		   });
		addAnnotation
		  (getAction_ContainingType(),
		   source,
		   new String[] {
			   "derivation", "if usedBy.oclIsKindOf(DynamicUnit) then\n\tusedBy.oclAsType(DynamicUnit).contentType\nelse if usedBy.oclIsKindOf(UnitFeature) then\n\tusedBy.oclAsType(UnitFeature).displayedOn.contentType\nelse\n\tnull\nendif endif"
		   });
		addAnnotation
		  (deleteActionEClass,
		   source,
		   new String[] {
			   "canOnlyDeleteSingletons", "if usedBy.oclIsKindOf(UnitElement) then\n\tusedBy.oclAsType(UnitElement).attribute.cardinality <> persistence::Cardinality::Many\nelse if usedBy.oclIsKindOf(UnitAssociation) then\n\tusedBy.oclAsType(UnitAssociation).association.cardinality <> persistence::Cardinality::Many\nelse\n\tusedBy.oclIsKindOf(CollectionUnit)\nendif endif\n"
		   });
	}

} //WebuiPackageImpl
