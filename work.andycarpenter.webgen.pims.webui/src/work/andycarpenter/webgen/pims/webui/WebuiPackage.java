/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.webui.WebuiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' webgen-base='platform:/resource/work.andycarpenter.webgen.pims.base/model/base.ecore#/' webgen-expression='platform:/resource/work.andycarpenter.webgen.pims.expression/model/expression.ecore#/' webgen-image='platform:/resource/work.andycarpenter.webgen.pims.image/model/image.ecore#/' webgen-persistence='platform:/resource/work.andycarpenter.webgen.pims.presistence/model/persistence.ecore#/' webgen-security='platform:/resource/work.andycarpenter.webgen.pims.security/model/security.ecore#/' webgen-service='platform:/resource/work.andycarpenter.webgen.pims.service/model/service.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface WebuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://andycarpenter.work/pim/webui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-webui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebuiPackage eINSTANCE = work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl <em>Web UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebUIImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getWebUI()
	 * @generated
	 */
	int WEB_UI = 0;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__PERSISTENCE = 0;

	/**
	 * The feature id for the '<em><b>Navigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__NAVIGATION = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__CONTROLLERS = 3;

	/**
	 * The feature id for the '<em><b>Use Form Floating Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__USE_FORM_FLOATING_LABELS = 4;

	/**
	 * The feature id for the '<em><b>Default Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_DATE_FORMAT = 5;

	/**
	 * The feature id for the '<em><b>Default Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_TIME_FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Default Date Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_DATE_TIME_FORMAT = 7;

	/**
	 * The feature id for the '<em><b>Default Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_CANCEL_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Default Save Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_SAVE_LABEL = 9;

	/**
	 * The feature id for the '<em><b>Default Page Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_PAGE_STYLE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Default Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_STYLES = 11;

	/**
	 * The feature id for the '<em><b>Default Cards Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_CARDS_STYLES = 12;

	/**
	 * The feature id for the '<em><b>Default Details Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_DETAILS_STYLES = 13;

	/**
	 * The feature id for the '<em><b>Default Form Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_FORM_STYLES = 14;

	/**
	 * The feature id for the '<em><b>Default Gallery Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_GALLERY_STYLES = 15;

	/**
	 * The feature id for the '<em><b>Default Slider Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_SLIDER_STYLES = 16;

	/**
	 * The feature id for the '<em><b>Default Static Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_STATIC_STYLES = 17;

	/**
	 * The feature id for the '<em><b>Default Tabular Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_TABULAR_STYLES = 18;

	/**
	 * The feature id for the '<em><b>Default Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE = 19;

	/**
	 * The number of structural features of the '<em>Web UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Web UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.NavigationImpl <em>Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.NavigationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getNavigation()
	 * @generated
	 */
	int NAVIGATION = 1;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__PART_OF = 0;

	/**
	 * The feature id for the '<em><b>Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__MENUS = 1;

	/**
	 * The feature id for the '<em><b>Navbar Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__NAVBAR_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Authentication Menu Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__AUTHENTICATION_MENU_PLACEMENT = 3;

	/**
	 * The feature id for the '<em><b>Authentication Bar Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__AUTHENTICATION_BAR_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.MenuImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ENTRIES = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__OMIT_CAPTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__STYLE_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LAYOUT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.MenuEntryImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMenuEntry()
	 * @generated
	 */
	int MENU_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__PART_OF = 0;

	/**
	 * The number of structural features of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SubmenuEntryImpl <em>Submenu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SubmenuEntryImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSubmenuEntry()
	 * @generated
	 */
	int SUBMENU_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__NAME = MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__DISPLAY_LABEL = MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__ENTRIES = MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__OMIT_CAPTION = MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__CAPTION_CLASS = MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__STYLE_CLASS = MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__LAYOUT_CLASS = MENU__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__PART_OF = MENU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__REQUIRES_ROLE = MENU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Always Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY__ALWAYS_VISIBLE = MENU_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Submenu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY_FEATURE_COUNT = MENU_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Submenu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY_OPERATION_COUNT = MENU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ActionMenuEntryImpl <em>Action Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ActionMenuEntryImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getActionMenuEntry()
	 * @generated
	 */
	int ACTION_MENU_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__DESTINATION = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Always Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__ALWAYS_VISIBLE = MENU_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY_OPERATION_COUNT = MENU_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.EditStaticTextMenuEntryImpl <em>Edit Static Text Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.EditStaticTextMenuEntryImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getEditStaticTextMenuEntry()
	 * @generated
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edit Static Text Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edit Static Text Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY_OPERATION_COUNT = MENU_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.MenuFeatureImpl <em>Menu Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.MenuFeatureImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMenuFeature()
	 * @generated
	 */
	int MENU_FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The number of structural features of the '<em>Menu Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_OPERATION_COUNT = MENU_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitStylesImpl <em>Content Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ContentUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContentUnitStyles()
	 * @generated
	 */
	int CONTENT_UNIT_STYLES = 8;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_STYLES__SECTION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_STYLES__CAPTION_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_STYLES__CONTENT_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Content Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_STYLES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Content Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_STYLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl <em>Dynamic Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDynamicUnitStyles()
	 * @generated
	 */
	int DYNAMIC_UNIT_STYLES = 9;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__SECTION_CLASS = CONTENT_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__CAPTION_CLASS = CONTENT_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__CONTENT_CLASS = CONTENT_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS = CONTENT_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = CONTENT_UNIT_STYLES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS = CONTENT_UNIT_STYLES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS = CONTENT_UNIT_STYLES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__CONTROL_CLASS = CONTENT_UNIT_STYLES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS = CONTENT_UNIT_STYLES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES__ANCHOR_CLASS = CONTENT_UNIT_STYLES_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dynamic Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES_FEATURE_COUNT = CONTENT_UNIT_STYLES_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dynamic Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_STYLES_OPERATION_COUNT = CONTENT_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DefaultUnitStylesImpl <em>Default Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DefaultUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDefaultUnitStyles()
	 * @generated
	 */
	int DEFAULT_UNIT_STYLES = 11;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitStylesImpl <em>Collection Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CollectionUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCollectionUnitStyles()
	 * @generated
	 */
	int COLLECTION_UNIT_STYLES = 10;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__SECTION_CLASS = DYNAMIC_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__CAPTION_CLASS = DYNAMIC_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__CONTENT_CLASS = DYNAMIC_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__FIELD_LIST_CLASS = DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__FIELD_LABEL_CLASS = DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__FIELD_VALUE_CLASS = DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__CONTROL_CLASS = DYNAMIC_UNIT_STYLES__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__ACTION_NAVIGATION_CLASS = DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__ANCHOR_CLASS = DYNAMIC_UNIT_STYLES__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS = DYNAMIC_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS = DYNAMIC_UNIT_STYLES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES_FEATURE_COUNT = DYNAMIC_UNIT_STYLES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_STYLES_OPERATION_COUNT = DYNAMIC_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__SECTION_CLASS = COLLECTION_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__CAPTION_CLASS = COLLECTION_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__CONTENT_CLASS = COLLECTION_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__FIELD_LABEL_CLASS = COLLECTION_UNIT_STYLES__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__FIELD_VALUE_CLASS = COLLECTION_UNIT_STYLES__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__CONTROL_CLASS = COLLECTION_UNIT_STYLES__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT_STYLES__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__ANCHOR_CLASS = COLLECTION_UNIT_STYLES__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__INSTANCE_CONTROL_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES__INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS;

	/**
	 * The number of structural features of the '<em>Default Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES_FEATURE_COUNT = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_UNIT_STYLES_OPERATION_COUNT = COLLECTION_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl <em>Cards Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCardsUnitStyles()
	 * @generated
	 */
	int CARDS_UNIT_STYLES = 12;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__SECTION_CLASS = COLLECTION_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__CAPTION_CLASS = COLLECTION_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__CONTENT_CLASS = COLLECTION_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__FIELD_LABEL_CLASS = COLLECTION_UNIT_STYLES__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__FIELD_VALUE_CLASS = COLLECTION_UNIT_STYLES__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__CONTROL_CLASS = COLLECTION_UNIT_STYLES__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT_STYLES__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__ANCHOR_CLASS = COLLECTION_UNIT_STYLES__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__INSTANCE_CONTROL_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__ROW_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__COLUMN_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__CARD_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__CARD_HEADER_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__CARD_BODY_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__CARD_FOOTER_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES__BADGE_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cards Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES_FEATURE_COUNT = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Cards Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_STYLES_OPERATION_COUNT = COLLECTION_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DetailsUnitStylesImpl <em>Details Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DetailsUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDetailsUnitStyles()
	 * @generated
	 */
	int DETAILS_UNIT_STYLES = 13;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__SECTION_CLASS = DYNAMIC_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__CAPTION_CLASS = DYNAMIC_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__CONTENT_CLASS = DYNAMIC_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__FIELD_LIST_CLASS = DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__FIELD_LABEL_CLASS = DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__FIELD_VALUE_CLASS = DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__CONTROL_CLASS = DYNAMIC_UNIT_STYLES__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__ACTION_NAVIGATION_CLASS = DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES__ANCHOR_CLASS = DYNAMIC_UNIT_STYLES__ANCHOR_CLASS;

	/**
	 * The number of structural features of the '<em>Details Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES_FEATURE_COUNT = DYNAMIC_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Details Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_STYLES_OPERATION_COUNT = DYNAMIC_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FormUnitStylesImpl <em>Form Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FormUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFormUnitStyles()
	 * @generated
	 */
	int FORM_UNIT_STYLES = 14;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__SECTION_CLASS = DYNAMIC_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__CAPTION_CLASS = DYNAMIC_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__CONTENT_CLASS = DYNAMIC_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__FIELD_LIST_CLASS = DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__FIELD_LABEL_CLASS = DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__FIELD_VALUE_CLASS = DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__CONTROL_CLASS = DYNAMIC_UNIT_STYLES__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__ACTION_NAVIGATION_CLASS = DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__ANCHOR_CLASS = DYNAMIC_UNIT_STYLES__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES__INPUT_GROUP_CLASS = DYNAMIC_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES_FEATURE_COUNT = DYNAMIC_UNIT_STYLES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UNIT_STYLES_OPERATION_COUNT = DYNAMIC_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.GalleryUnitStylesImpl <em>Gallery Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.GalleryUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getGalleryUnitStyles()
	 * @generated
	 */
	int GALLERY_UNIT_STYLES = 15;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__SECTION_CLASS = COLLECTION_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__CAPTION_CLASS = COLLECTION_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__CONTENT_CLASS = COLLECTION_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__FIELD_LABEL_CLASS = COLLECTION_UNIT_STYLES__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__FIELD_VALUE_CLASS = COLLECTION_UNIT_STYLES__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__CONTROL_CLASS = COLLECTION_UNIT_STYLES__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT_STYLES__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__ANCHOR_CLASS = COLLECTION_UNIT_STYLES__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__INSTANCE_CONTROL_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES__INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS;

	/**
	 * The number of structural features of the '<em>Gallery Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES_FEATURE_COUNT = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gallery Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_STYLES_OPERATION_COUNT = COLLECTION_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SliderUnitStylesImpl <em>Slider Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SliderUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSliderUnitStyles()
	 * @generated
	 */
	int SLIDER_UNIT_STYLES = 16;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__SECTION_CLASS = COLLECTION_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__CAPTION_CLASS = COLLECTION_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__CONTENT_CLASS = COLLECTION_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__FIELD_LABEL_CLASS = COLLECTION_UNIT_STYLES__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__FIELD_VALUE_CLASS = COLLECTION_UNIT_STYLES__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__CONTROL_CLASS = COLLECTION_UNIT_STYLES__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT_STYLES__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__ANCHOR_CLASS = COLLECTION_UNIT_STYLES__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__INSTANCE_CONTROL_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES__INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS;

	/**
	 * The number of structural features of the '<em>Slider Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES_FEATURE_COUNT = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slider Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_STYLES_OPERATION_COUNT = COLLECTION_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.StaticUnitStylesImpl <em>Static Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.StaticUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getStaticUnitStyles()
	 * @generated
	 */
	int STATIC_UNIT_STYLES = 17;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_STYLES__SECTION_CLASS = CONTENT_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_STYLES__CAPTION_CLASS = CONTENT_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_STYLES__CONTENT_CLASS = CONTENT_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The number of structural features of the '<em>Static Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_STYLES_FEATURE_COUNT = CONTENT_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_STYLES_OPERATION_COUNT = CONTENT_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.TabularUnitStylesImpl <em>Tabular Unit Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.TabularUnitStylesImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getTabularUnitStyles()
	 * @generated
	 */
	int TABULAR_UNIT_STYLES = 18;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__SECTION_CLASS = COLLECTION_UNIT_STYLES__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__CAPTION_CLASS = COLLECTION_UNIT_STYLES__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__CONTENT_CLASS = COLLECTION_UNIT_STYLES__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Definition Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = COLLECTION_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__FIELD_LABEL_CLASS = COLLECTION_UNIT_STYLES__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__FIELD_VALUE_CLASS = COLLECTION_UNIT_STYLES__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__CONTROL_CLASS = COLLECTION_UNIT_STYLES__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT_STYLES__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__ANCHOR_CLASS = COLLECTION_UNIT_STYLES__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__INSTANCE_CONTROL_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__HEADER_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES__FOOTER_CLASS = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tabular Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES_FEATURE_COUNT = COLLECTION_UNIT_STYLES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tabular Unit Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_STYLES_OPERATION_COUNT = COLLECTION_UNIT_STYLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ControllerImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Web UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__WEB_UI = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PARENT_CONTROLLER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Controllers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CHILD_CONTROLLERS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__UNITS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__STYLE_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ControllerLinkImpl <em>Controller Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ControllerLinkImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getControllerLink()
	 * @generated
	 */
	int CONTROLLER_LINK = 20;

	/**
	 * The feature id for the '<em><b>Target Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_LINK__TARGET_CONTROLLER = 0;

	/**
	 * The number of structural features of the '<em>Controller Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controller Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SinglePageControllerImpl <em>Single Page Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SinglePageControllerImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSinglePageController()
	 * @generated
	 */
	int SINGLE_PAGE_CONTROLLER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER__DISPLAY_LABEL = CONTROLLER__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Web UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER__WEB_UI = CONTROLLER__WEB_UI;

	/**
	 * The feature id for the '<em><b>Parent Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER__PARENT_CONTROLLER = CONTROLLER__PARENT_CONTROLLER;

	/**
	 * The feature id for the '<em><b>Child Controllers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER__CHILD_CONTROLLERS = CONTROLLER__CHILD_CONTROLLERS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER__UNITS = CONTROLLER__UNITS;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER__URI_ELEMENT = CONTROLLER__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER__STYLE_CLASS = CONTROLLER__STYLE_CLASS;

	/**
	 * The number of structural features of the '<em>Single Page Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Page Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAGE_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.MultiPageControllerImpl <em>Multi Page Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.MultiPageControllerImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMultiPageController()
	 * @generated
	 */
	int MULTI_PAGE_CONTROLLER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER__DISPLAY_LABEL = CONTROLLER__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Web UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER__WEB_UI = CONTROLLER__WEB_UI;

	/**
	 * The feature id for the '<em><b>Parent Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER__PARENT_CONTROLLER = CONTROLLER__PARENT_CONTROLLER;

	/**
	 * The feature id for the '<em><b>Child Controllers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER__CHILD_CONTROLLERS = CONTROLLER__CHILD_CONTROLLERS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER__UNITS = CONTROLLER__UNITS;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER__URI_ELEMENT = CONTROLLER__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER__STYLE_CLASS = CONTROLLER__STYLE_CLASS;

	/**
	 * The number of structural features of the '<em>Multi Page Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Page Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAGE_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl <em>Content Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContentUnit()
	 * @generated
	 */
	int CONTENT_UNIT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CONTROLLER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__REQUIRES_ROLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__PURPOSE_SUMMARY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__URI_PARENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__ALTERNATIVE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__SECTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__OMIT_CAPTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__LOCAL_CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__LOCAL_CONTENT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.RouteActualImpl <em>Route Actual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.RouteActualImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getRouteActual()
	 * @generated
	 */
	int ROUTE_ACTUAL = 27;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.StaticUnitImpl <em>Static Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.StaticUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getStaticUnit()
	 * @generated
	 */
	int STATIC_UNIT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CONTROLLER = CONTENT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__REQUIRES_ROLE = CONTENT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__URI_ELEMENT = CONTENT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__URI_PARENT = CONTENT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__ALTERNATIVE = CONTENT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__SECTION_CLASS = CONTENT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__LOCAL_CAPTION_CLASS = CONTENT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__LOCAL_CONTENT_CLASS = CONTENT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CONTENT = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CreateSitemapUnitImpl <em>Create Sitemap Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CreateSitemapUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCreateSitemapUnit()
	 * @generated
	 */
	int CREATE_SITEMAP_UNIT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CONTROLLER = CONTENT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__REQUIRES_ROLE = CONTENT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__URI_ELEMENT = CONTENT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__URI_PARENT = CONTENT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__ALTERNATIVE = CONTENT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__SECTION_CLASS = CONTENT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__LOCAL_CAPTION_CLASS = CONTENT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__LOCAL_CONTENT_CLASS = CONTENT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Deployed URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DEPLOYED_URL = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__FILENAME = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Sitemap Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Create Sitemap Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl <em>Dynamic Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDynamicUnit()
	 * @generated
	 */
	int DYNAMIC_UNIT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTROLLER = CONTENT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__REQUIRES_ROLE = CONTENT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__URI_ELEMENT = CONTENT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__URI_PARENT = CONTENT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ALTERNATIVE = CONTENT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__SECTION_CLASS = CONTENT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_CAPTION_CLASS = CONTENT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_CONTENT_CLASS = CONTENT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ACTIONS = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS = CONTENT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTENT_TYPE = CONTENT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTAINING_TYPE = CONTENT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ROUTE_ACTUALS = CONTENT_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_FIELDS = CONTENT_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = CONTENT_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HIDE_WHEN = CONTENT_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN = CONTENT_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER = CONTENT_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER = CONTENT_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS = CONTENT_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS = CONTENT_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS = CONTENT_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_CONTROL_CLASS = CONTENT_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = CONTENT_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS = CONTENT_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = CONTENT_UNIT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL__ACTUAL_FOR = 0;

	/**
	 * The feature id for the '<em><b>Route Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL__ROUTE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Route Actual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Route Actual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ACTUAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl <em>Unit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitField()
	 * @generated
	 */
	int UNIT_FIELD = 28;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DISPLAYED_ON = 0;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__REQUIRES_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__HIDE_WHEN = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__HELP = 4;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__ESCAPE_HTML = 5;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__COLLECTION_DISPLAY_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__TRUNCATE = 7;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DATE_FORMAT = 8;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DISABLE_INPUT = 9;

	/**
	 * The number of structural features of the '<em>Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl <em>Unit Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitFeature()
	 * @generated
	 */
	int UNIT_FEATURE = 29;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAYED_ON = UNIT_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__REQUIRES_ROLE = UNIT_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__HIDE_WHEN = UNIT_FIELD__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__TITLE = UNIT_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__HELP = UNIT_FIELD__HELP;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ESCAPE_HTML = UNIT_FIELD__ESCAPE_HTML;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_DISPLAY_OPTION = UNIT_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__TRUNCATE = UNIT_FIELD__TRUNCATE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DATE_FORMAT = UNIT_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISABLE_INPUT = UNIT_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT = UNIT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT = UNIT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ACTIONS = UNIT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ACTION_NAVIGATION_CLASS = UNIT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_LABEL = UNIT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__REQUIRED = UNIT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FORCED_VALUE = UNIT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD = UNIT_FIELD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE = UNIT_FIELD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Collection Maximum Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES = UNIT_FIELD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DEFAULT_DISPLAY_VALUE = UNIT_FIELD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Display Default When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_DEFAULT_WHEN = UNIT_FIELD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__EMPTY_DISPLAY_VALUE = UNIT_FIELD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER = UNIT_FIELD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__AUTOFOCUS = UNIT_FIELD_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__HEADER_CLASS = UNIT_FIELD_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FIELD_LABEL_CLASS = UNIT_FIELD_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FIELD_VALUE_CLASS = UNIT_FIELD_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__INPUT_GROUP_CLASS = UNIT_FIELD_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER_CLASS = UNIT_FIELD_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_FEATURE_COUNT = UNIT_FIELD_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_OPERATION_COUNT = UNIT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitElementImpl <em>Unit Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitElementImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitElement()
	 * @generated
	 */
	int UNIT_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__REQUIRES_ROLE = UNIT_FEATURE__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__HIDE_WHEN = UNIT_FEATURE__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__TITLE = UNIT_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__HELP = UNIT_FEATURE__HELP;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ESCAPE_HTML = UNIT_FEATURE__ESCAPE_HTML;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__COLLECTION_DISPLAY_OPTION = UNIT_FEATURE__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__TRUNCATE = UNIT_FEATURE__TRUNCATE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISABLE_INPUT = UNIT_FEATURE__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__CONTAINER_ACTIONS_PLACEMENT = UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__INSTANCE_ACTIONS_PLACEMENT = UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ACTION_NAVIGATION_CLASS = UNIT_FEATURE__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__REQUIRED = UNIT_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__COLLECTION_UI_ALLOW_ADD = UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__COLLECTION_UI_ALLOW_REMOVE = UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Collection Maximum Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__COLLECTION_MAXIMUM_VALUES = UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DEFAULT_DISPLAY_VALUE = UNIT_FEATURE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Display Default When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAY_DEFAULT_WHEN = UNIT_FEATURE__DISPLAY_DEFAULT_WHEN;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__EMPTY_DISPLAY_VALUE = UNIT_FEATURE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FIELD_LABEL_CLASS = UNIT_FEATURE__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FIELD_VALUE_CLASS = UNIT_FEATURE__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__INPUT_GROUP_CLASS = UNIT_FEATURE__INPUT_GROUP_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ATTRIBUTE = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__NAME = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DEFAULT_VALUE = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__PLACEHOLDER = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__VALIDATION_PATTERN = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT_OPERATION_COUNT = UNIT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl <em>Unit Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitResource()
	 * @generated
	 */
	int UNIT_RESOURCE = 31;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__REQUIRES_ROLE = UNIT_FEATURE__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__HIDE_WHEN = UNIT_FEATURE__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__TITLE = UNIT_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__HELP = UNIT_FEATURE__HELP;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__ESCAPE_HTML = UNIT_FEATURE__ESCAPE_HTML;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__COLLECTION_DISPLAY_OPTION = UNIT_FEATURE__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__TRUNCATE = UNIT_FEATURE__TRUNCATE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__DISABLE_INPUT = UNIT_FEATURE__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__CONTAINER_ACTIONS_PLACEMENT = UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__INSTANCE_ACTIONS_PLACEMENT = UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__ACTION_NAVIGATION_CLASS = UNIT_FEATURE__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__REQUIRED = UNIT_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__COLLECTION_UI_ALLOW_ADD = UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__COLLECTION_UI_ALLOW_REMOVE = UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Collection Maximum Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__COLLECTION_MAXIMUM_VALUES = UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__DEFAULT_DISPLAY_VALUE = UNIT_FEATURE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Display Default When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__DISPLAY_DEFAULT_WHEN = UNIT_FEATURE__DISPLAY_DEFAULT_WHEN;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__EMPTY_DISPLAY_VALUE = UNIT_FEATURE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__FIELD_LABEL_CLASS = UNIT_FEATURE__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__FIELD_VALUE_CLASS = UNIT_FEATURE__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__INPUT_GROUP_CLASS = UNIT_FEATURE__INPUT_GROUP_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__RESOURCE = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__NAME = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Deletable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__IS_DELETABLE = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Downloadable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__IS_DOWNLOADABLE = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show Image When Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__SHOW_IMAGE_WHEN_EDITING = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE__IMAGE_FILTER = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Unit Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Unit Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOURCE_OPERATION_COUNT = UNIT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitAssociation()
	 * @generated
	 */
	int UNIT_ASSOCIATION = 32;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__REQUIRES_ROLE = UNIT_FEATURE__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__HIDE_WHEN = UNIT_FEATURE__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__TITLE = UNIT_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__HELP = UNIT_FEATURE__HELP;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ESCAPE_HTML = UNIT_FEATURE__ESCAPE_HTML;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION = UNIT_FEATURE__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__TRUNCATE = UNIT_FEATURE__TRUNCATE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISABLE_INPUT = UNIT_FEATURE__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__CONTAINER_ACTIONS_PLACEMENT = UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__INSTANCE_ACTIONS_PLACEMENT = UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ACTION_NAVIGATION_CLASS = UNIT_FEATURE__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__REQUIRED = UNIT_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_UI_ALLOW_ADD = UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE = UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Collection Maximum Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_MAXIMUM_VALUES = UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DEFAULT_DISPLAY_VALUE = UNIT_FEATURE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Display Default When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_DEFAULT_WHEN = UNIT_FEATURE__DISPLAY_DEFAULT_WHEN;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__EMPTY_DISPLAY_VALUE = UNIT_FEATURE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FIELD_LABEL_CLASS = UNIT_FEATURE__FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FIELD_VALUE_CLASS = UNIT_FEATURE__FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__INPUT_GROUP_CLASS = UNIT_FEATURE__INPUT_GROUP_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__CONTAINING_TYPE = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ASSOCIATION = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__NAME = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__VALUE_DISPLAY = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__CHILD_FEATURE = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__SOURCE_ENTITY = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__TARGET_ENTITY = UNIT_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__OPTIONS = UNIT_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Collection Sort By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__COLLECTION_SORT_BY = UNIT_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Use Autocomplete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__USE_AUTOCOMPLETE = UNIT_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_OPERATION_COUNT = UNIT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAttributeImpl <em>Child Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathAttributeImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPathAttribute()
	 * @generated
	 */
	int CHILD_PATH_ATTRIBUTE = 68;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl <em>Child Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPathAssociation()
	 * @generated
	 */
	int CHILD_PATH_ASSOCIATION = 67;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl <em>Feature Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePath()
	 * @generated
	 */
	int FEATURE_PATH = 70;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathAttributeImpl <em>Feature Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathAttributeImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathAttribute()
	 * @generated
	 */
	int FEATURE_PATH_ATTRIBUTE = 72;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableImpl <em>Path Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PathVariableImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathVariable()
	 * @generated
	 */
	int PATH_VARIABLE = 75;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableAssociationImpl <em>Path Variable Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PathVariableAssociationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathVariableAssociation()
	 * @generated
	 */
	int PATH_VARIABLE_ASSOCIATION = 76;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableAttributeImpl <em>Path Variable Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PathVariableAttributeImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathVariableAttribute()
	 * @generated
	 */
	int PATH_VARIABLE_ATTRIBUTE = 77;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathAssociationImpl <em>Feature Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathAssociationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathAssociation()
	 * @generated
	 */
	int FEATURE_PATH_ASSOCIATION = 71;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitLabelImpl <em>Unit Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitLabelImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitLabel()
	 * @generated
	 */
	int UNIT_LABEL = 33;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__DISPLAYED_ON = UNIT_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__REQUIRES_ROLE = UNIT_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__HIDE_WHEN = UNIT_FIELD__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__TITLE = UNIT_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__HELP = UNIT_FIELD__HELP;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__ESCAPE_HTML = UNIT_FIELD__ESCAPE_HTML;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__COLLECTION_DISPLAY_OPTION = UNIT_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__TRUNCATE = UNIT_FIELD__TRUNCATE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__DATE_FORMAT = UNIT_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__DISABLE_INPUT = UNIT_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__LABEL = UNIT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL__NAME = UNIT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL_FEATURE_COUNT = UNIT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_LABEL_OPERATION_COUNT = UNIT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl <em>Interface Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInterfaceField()
	 * @generated
	 */
	int INTERFACE_FIELD = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISPLAYED_ON = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__REQUIRES_ROLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__HIDE_WHEN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__TITLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__HELP = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__ESCAPE_HTML = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__TRUNCATE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DATE_FORMAT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISABLE_INPUT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__REQUIRED = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DEFAULT_VALUE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__PLACEHOLDER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__VALIDATION_PATTERN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Repeated Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__REPEATED_FIELD = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Second Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__SECOND_DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Second Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__SECOND_TITLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Second Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__SECOND_PLACEHOLDER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Second Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__SECOND_HELP = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DataTypeFieldImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDataTypeField()
	 * @generated
	 */
	int DATA_TYPE_FIELD = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__REQUIRES_ROLE = INTERFACE_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__HIDE_WHEN = INTERFACE_FIELD__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__HELP = INTERFACE_FIELD__HELP;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__ESCAPE_HTML = INTERFACE_FIELD__ESCAPE_HTML;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__TRUNCATE = INTERFACE_FIELD__TRUNCATE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISABLE_INPUT = INTERFACE_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Repeated Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__REPEATED_FIELD = INTERFACE_FIELD__REPEATED_FIELD;

	/**
	 * The feature id for the '<em><b>Second Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__SECOND_DISPLAY_LABEL = INTERFACE_FIELD__SECOND_DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Second Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__SECOND_TITLE = INTERFACE_FIELD__SECOND_TITLE;

	/**
	 * The feature id for the '<em><b>Second Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__SECOND_PLACEHOLDER = INTERFACE_FIELD__SECOND_PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Second Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__SECOND_HELP = INTERFACE_FIELD__SECOND_HELP;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATA_TYPE = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS = INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__ENCRYPT = INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__INTERFACE_TYPE = INTERFACE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DateFieldImpl <em>Date Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DateFieldImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDateField()
	 * @generated
	 */
	int DATE_FIELD = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__REQUIRES_ROLE = INTERFACE_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__HIDE_WHEN = INTERFACE_FIELD__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__HELP = INTERFACE_FIELD__HELP;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__ESCAPE_HTML = INTERFACE_FIELD__ESCAPE_HTML;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__TRUNCATE = INTERFACE_FIELD__TRUNCATE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISABLE_INPUT = INTERFACE_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Repeated Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__REPEATED_FIELD = INTERFACE_FIELD__REPEATED_FIELD;

	/**
	 * The feature id for the '<em><b>Second Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__SECOND_DISPLAY_LABEL = INTERFACE_FIELD__SECOND_DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Second Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__SECOND_TITLE = INTERFACE_FIELD__SECOND_TITLE;

	/**
	 * The feature id for the '<em><b>Second Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__SECOND_PLACEHOLDER = INTERFACE_FIELD__SECOND_PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Second Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__SECOND_HELP = INTERFACE_FIELD__SECOND_HELP;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DETAILS = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__FORMAT = INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.SelectableUnit <em>Selectable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.SelectableUnit
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSelectableUnit()
	 * @generated
	 */
	int SELECTABLE_UNIT = 37;

	/**
	 * The number of structural features of the '<em>Selectable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Selectable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SingletonUnitImpl <em>Singleton Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SingletonUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSingletonUnit()
	 * @generated
	 */
	int SINGLETON_UNIT = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTROLLER = DYNAMIC_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__URI_PARENT = DYNAMIC_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__SECTION_CLASS = DYNAMIC_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_CAPTION_CLASS = DYNAMIC_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_CONTENT_CLASS = DYNAMIC_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTAINER_ACTIONS_PLACEMENT = DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__INSTANCE_ACTIONS_PLACEMENT = DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__ACTIONS = DYNAMIC_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__ACTION_NAVIGATION_CLASS = DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTENT_TYPE = DYNAMIC_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTAINING_TYPE = DYNAMIC_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__HIDE_WHEN = DYNAMIC_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__MESSAGE_WHEN_HIDDEN = DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_FIELD_LIST_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_FIELD_LABEL_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_FIELD_VALUE_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_CONTROL_CLASS = DYNAMIC_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_ANCHOR_CLASS = DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singleton Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Singleton Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl <em>Collection Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCollectionUnit()
	 * @generated
	 */
	int COLLECTION_UNIT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTROLLER = DYNAMIC_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__URI_PARENT = DYNAMIC_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SECTION_CLASS = DYNAMIC_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_CAPTION_CLASS = DYNAMIC_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_CONTENT_CLASS = DYNAMIC_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTAINER_ACTIONS_PLACEMENT = DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__INSTANCE_ACTIONS_PLACEMENT = DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__ACTIONS = DYNAMIC_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__ACTION_NAVIGATION_CLASS = DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTENT_TYPE = DYNAMIC_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTAINING_TYPE = DYNAMIC_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__HIDE_WHEN = DYNAMIC_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__MESSAGE_WHEN_HIDDEN = DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_FIELD_LIST_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_FIELD_LABEL_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_FIELD_VALUE_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_CONTROL_CLASS = DYNAMIC_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_ANCHOR_CLASS = DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__UNIT_TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__ELEMENT_TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIND_CONTAINER_SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIND_ELEMENT_SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FILTER = DYNAMIC_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SUPPORTED_FILTERS = DYNAMIC_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__EMPTY_MESSAGE = DYNAMIC_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__OMIT_FIELD_LABELS = DYNAMIC_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE = DYNAMIC_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE = DYNAMIC_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT = DYNAMIC_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_NPAGES = DYNAMIC_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_NPAGES = DYNAMIC_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS = DYNAMIC_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = DYNAMIC_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIRST_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIRST_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LAST_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LAST_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>Collection Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 28;

	/**
	 * The number of operations of the '<em>Collection Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl <em>Edit Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getEditUnit()
	 * @generated
	 */
	int EDIT_UNIT = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__NAME = SINGLETON_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_LABEL = SINGLETON_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTROLLER = SINGLETON_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT = SINGLETON_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__REQUIRES_ROLE = SINGLETON_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__PURPOSE_SUMMARY = SINGLETON_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__URI_ELEMENT = SINGLETON_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__URI_PARENT = SINGLETON_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ALTERNATIVE = SINGLETON_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__SECTION_CLASS = SINGLETON_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__OMIT_CAPTION = SINGLETON_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_CAPTION_CLASS = SINGLETON_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_CONTENT_CLASS = SINGLETON_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT = SINGLETON_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT = SINGLETON_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ACTIONS = SINGLETON_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ACTION_NAVIGATION_CLASS = SINGLETON_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTENT_TYPE = SINGLETON_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTAINING_TYPE = SINGLETON_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ROUTE_ACTUALS = SINGLETON_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_FIELDS = SINGLETON_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = SINGLETON_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HIDE_WHEN = SINGLETON_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__MESSAGE_WHEN_HIDDEN = SINGLETON_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HEADER = SINGLETON_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FOOTER = SINGLETON_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_FIELD_LIST_CLASS = SINGLETON_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS = SINGLETON_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS = SINGLETON_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_CONTROL_CLASS = SINGLETON_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = SINGLETON_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_ANCHOR_CLASS = SINGLETON_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = SINGLETON_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__TITLE = SINGLETON_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__USE_CAPTCHA = SINGLETON_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISABLE_WHEN = SINGLETON_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_DESTINATION = SINGLETON_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_LABEL = SINGLETON_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_MESSAGE = SINGLETON_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__SUCCESS_MESSAGE = SINGLETON_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_DESTINATION = SINGLETON_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_LABEL = SINGLETON_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__UNIT_INPUT_GROUP_CLASS = SINGLETON_UNIT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT_FEATURE_COUNT = SINGLETON_UNIT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT_OPERATION_COUNT = SINGLETON_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CreateUnitImpl <em>Create Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CreateUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCreateUnit()
	 * @generated
	 */
	int CREATE_UNIT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTROLLER = EDIT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__URI_PARENT = EDIT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__SECTION_CLASS = EDIT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_CAPTION_CLASS = EDIT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_CONTENT_CLASS = EDIT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTAINER_ACTIONS_PLACEMENT = EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__INSTANCE_ACTIONS_PLACEMENT = EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ACTIONS = EDIT_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ACTION_NAVIGATION_CLASS = EDIT_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTAINING_TYPE = EDIT_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HIDE_WHEN = EDIT_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__MESSAGE_WHEN_HIDDEN = EDIT_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_FIELD_LIST_CLASS = EDIT_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_FIELD_LABEL_CLASS = EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_FIELD_VALUE_CLASS = EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_CONTROL_CLASS = EDIT_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_ANCHOR_CLASS = EDIT_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__USE_CAPTCHA = EDIT_UNIT__USE_CAPTCHA;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISABLE_WHEN = EDIT_UNIT__DISABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_MESSAGE = EDIT_UNIT__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__SUCCESS_MESSAGE = EDIT_UNIT__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__UNIT_INPUT_GROUP_CLASS = EDIT_UNIT__UNIT_INPUT_GROUP_CLASS;

	/**
	 * The number of structural features of the '<em>Create Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CreateUpdateUnitImpl <em>Create Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CreateUpdateUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCreateUpdateUnit()
	 * @generated
	 */
	int CREATE_UPDATE_UNIT = 43;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UpdateUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUpdateUnit()
	 * @generated
	 */
	int UPDATE_UNIT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTROLLER = EDIT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__URI_PARENT = EDIT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SECTION_CLASS = EDIT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_CAPTION_CLASS = EDIT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_CONTENT_CLASS = EDIT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTAINER_ACTIONS_PLACEMENT = EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__INSTANCE_ACTIONS_PLACEMENT = EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ACTIONS = EDIT_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ACTION_NAVIGATION_CLASS = EDIT_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTAINING_TYPE = EDIT_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HIDE_WHEN = EDIT_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__MESSAGE_WHEN_HIDDEN = EDIT_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_FIELD_LIST_CLASS = EDIT_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_FIELD_LABEL_CLASS = EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_FIELD_VALUE_CLASS = EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_CONTROL_CLASS = EDIT_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_ANCHOR_CLASS = EDIT_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__USE_CAPTCHA = EDIT_UNIT__USE_CAPTCHA;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISABLE_WHEN = EDIT_UNIT__DISABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_MESSAGE = EDIT_UNIT__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SUCCESS_MESSAGE = EDIT_UNIT__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__UNIT_INPUT_GROUP_CLASS = EDIT_UNIT__UNIT_INPUT_GROUP_CLASS;

	/**
	 * The feature id for the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Empty Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_EMPTY_FORM = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTROLLER = EDIT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__URI_PARENT = EDIT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SECTION_CLASS = EDIT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_CAPTION_CLASS = EDIT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_CONTENT_CLASS = EDIT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTAINER_ACTIONS_PLACEMENT = EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__INSTANCE_ACTIONS_PLACEMENT = EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ACTIONS = EDIT_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ACTION_NAVIGATION_CLASS = EDIT_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTAINING_TYPE = EDIT_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HIDE_WHEN = EDIT_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__MESSAGE_WHEN_HIDDEN = EDIT_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_FIELD_LIST_CLASS = EDIT_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_FIELD_LABEL_CLASS = EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_FIELD_VALUE_CLASS = EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_CONTROL_CLASS = EDIT_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_ANCHOR_CLASS = EDIT_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__USE_CAPTCHA = EDIT_UNIT__USE_CAPTCHA;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISABLE_WHEN = EDIT_UNIT__DISABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_MESSAGE = EDIT_UNIT__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SUCCESS_MESSAGE = EDIT_UNIT__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__UNIT_INPUT_GROUP_CLASS = EDIT_UNIT__UNIT_INPUT_GROUP_CLASS;

	/**
	 * The feature id for the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__UPDATE_URI_ELEMENT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clear Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CLEAR_LABEL = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Create Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Create Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.MapUnitImpl <em>Map Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.MapUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMapUnit()
	 * @generated
	 */
	int MAP_UNIT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTROLLER = EDIT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__URI_PARENT = EDIT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SECTION_CLASS = EDIT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_CAPTION_CLASS = EDIT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_CONTENT_CLASS = EDIT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTAINER_ACTIONS_PLACEMENT = EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__INSTANCE_ACTIONS_PLACEMENT = EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ACTIONS = EDIT_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ACTION_NAVIGATION_CLASS = EDIT_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTAINING_TYPE = EDIT_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HIDE_WHEN = EDIT_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__MESSAGE_WHEN_HIDDEN = EDIT_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_FIELD_LIST_CLASS = EDIT_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_FIELD_LABEL_CLASS = EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_FIELD_VALUE_CLASS = EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_CONTROL_CLASS = EDIT_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_ANCHOR_CLASS = EDIT_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__USE_CAPTCHA = EDIT_UNIT__USE_CAPTCHA;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISABLE_WHEN = EDIT_UNIT__DISABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_MESSAGE = EDIT_UNIT__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SUCCESS_MESSAGE = EDIT_UNIT__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__UNIT_INPUT_GROUP_CLASS = EDIT_UNIT__UNIT_INPUT_GROUP_CLASS;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__READ_ONLY = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DEFAULT_ZOOM_LEVEL = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCATION = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PLACE_NAME = EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Map Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Map Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DetailsUnitImpl <em>Details Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DetailsUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDetailsUnit()
	 * @generated
	 */
	int DETAILS_UNIT = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__NAME = SINGLETON_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_LABEL = SINGLETON_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTROLLER = SINGLETON_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CREATE_DEFAULT_URI_ELEMENT = SINGLETON_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__REQUIRES_ROLE = SINGLETON_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__PURPOSE_SUMMARY = SINGLETON_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__URI_ELEMENT = SINGLETON_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__URI_PARENT = SINGLETON_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ALTERNATIVE = SINGLETON_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SECTION_CLASS = SINGLETON_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__OMIT_CAPTION = SINGLETON_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_CAPTION_CLASS = SINGLETON_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_CONTENT_CLASS = SINGLETON_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTAINER_ACTIONS_PLACEMENT = SINGLETON_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__INSTANCE_ACTIONS_PLACEMENT = SINGLETON_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ACTIONS = SINGLETON_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ACTION_NAVIGATION_CLASS = SINGLETON_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTENT_TYPE = SINGLETON_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTAINING_TYPE = SINGLETON_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ROUTE_ACTUALS = SINGLETON_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_FIELDS = SINGLETON_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = SINGLETON_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HIDE_WHEN = SINGLETON_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__MESSAGE_WHEN_HIDDEN = SINGLETON_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HEADER = SINGLETON_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FOOTER = SINGLETON_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_FIELD_LIST_CLASS = SINGLETON_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_FIELD_LABEL_CLASS = SINGLETON_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_FIELD_VALUE_CLASS = SINGLETON_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_CONTROL_CLASS = SINGLETON_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = SINGLETON_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_ANCHOR_CLASS = SINGLETON_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = SINGLETON_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__TITLE = SINGLETON_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SELECTION = SINGLETON_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__OMIT_FIELD_LABELS = SINGLETON_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Details Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_FEATURE_COUNT = SINGLETON_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Details Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_OPERATION_COUNT = SINGLETON_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.TabularUnitImpl <em>Tabular Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.TabularUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getTabularUnit()
	 * @generated
	 */
	int TABULAR_UNIT = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__NAME = COLLECTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__DISPLAY_LABEL = COLLECTION_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__CONTROLLER = COLLECTION_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__CREATE_DEFAULT_URI_ELEMENT = COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__REQUIRES_ROLE = COLLECTION_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__PURPOSE_SUMMARY = COLLECTION_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__URI_ELEMENT = COLLECTION_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__URI_PARENT = COLLECTION_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__ALTERNATIVE = COLLECTION_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__SECTION_CLASS = COLLECTION_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__OMIT_CAPTION = COLLECTION_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_CAPTION_CLASS = COLLECTION_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_CONTENT_CLASS = COLLECTION_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__CONTAINER_ACTIONS_PLACEMENT = COLLECTION_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__INSTANCE_ACTIONS_PLACEMENT = COLLECTION_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__ACTIONS = COLLECTION_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__CONTENT_TYPE = COLLECTION_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__CONTAINING_TYPE = COLLECTION_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__ROUTE_ACTUALS = COLLECTION_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__DISPLAY_FIELDS = COLLECTION_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = COLLECTION_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__HIDE_WHEN = COLLECTION_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__MESSAGE_WHEN_HIDDEN = COLLECTION_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__HEADER = COLLECTION_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__FOOTER = COLLECTION_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_FIELD_LIST_CLASS = COLLECTION_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_FIELD_LABEL_CLASS = COLLECTION_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_FIELD_VALUE_CLASS = COLLECTION_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_CONTROL_CLASS = COLLECTION_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = COLLECTION_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_ANCHOR_CLASS = COLLECTION_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__UNIT_TITLE = COLLECTION_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__ELEMENT_TITLE = COLLECTION_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__TRUNCATE_ELEMENT_TITLE = COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__SELECTION = COLLECTION_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__FIND_CONTAINER_SELECTION = COLLECTION_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__FIND_ELEMENT_SELECTION = COLLECTION_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__FILTER = COLLECTION_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__SUPPORTED_FILTERS = COLLECTION_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__EMPTY_MESSAGE = COLLECTION_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__OMIT_FIELD_LABELS = COLLECTION_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__DEFAULT_PAGINATION_SIZE = COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__MAXIMUM_PAGINATION_SIZE = COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__PAGINATION_CONTROL_PLACEMENT = COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__NEXT_NPAGES = COLLECTION_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__PREVIOUS_NPAGES = COLLECTION_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__NEXT_PAGE_LABEL = COLLECTION_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__NEXT_PAGE_ICON_NAME = COLLECTION_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__PREVIOUS_PAGE_LABEL = COLLECTION_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__PREVIOUS_PAGE_ICON_NAME = COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__USE_DISABLED_PAGE_LINKS = COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__USE_FIRST_LAST_PAGE_LINKS = COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__FIRST_PAGE_LABEL = COLLECTION_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__FIRST_PAGE_ICON_NAME = COLLECTION_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LAST_PAGE_LABEL = COLLECTION_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__LAST_PAGE_ICON_NAME = COLLECTION_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__PAGINATION_CLASS = COLLECTION_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__PAGINATION_ELEMENT_CLASS = COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__PAGINATION_ANCHOR_CLASS = COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__HEADER_CLASS_OVERRIDE = COLLECTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Footer Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__FOOTER_CLASS_OVERRIDE = COLLECTION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT__ROW_CLASSES = COLLECTION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tabular Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_FEATURE_COUNT = COLLECTION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tabular Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_UNIT_OPERATION_COUNT = COLLECTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl <em>Cards Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCardsUnit()
	 * @generated
	 */
	int CARDS_UNIT = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__NAME = COLLECTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__DISPLAY_LABEL = COLLECTION_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CONTROLLER = COLLECTION_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT = COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__REQUIRES_ROLE = COLLECTION_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PURPOSE_SUMMARY = COLLECTION_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__URI_ELEMENT = COLLECTION_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__URI_PARENT = COLLECTION_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ALTERNATIVE = COLLECTION_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__SECTION_CLASS = COLLECTION_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__OMIT_CAPTION = COLLECTION_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_CAPTION_CLASS = COLLECTION_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_CONTENT_CLASS = COLLECTION_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CONTAINER_ACTIONS_PLACEMENT = COLLECTION_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__INSTANCE_ACTIONS_PLACEMENT = COLLECTION_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ACTIONS = COLLECTION_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CONTENT_TYPE = COLLECTION_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CONTAINING_TYPE = COLLECTION_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ROUTE_ACTUALS = COLLECTION_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__DISPLAY_FIELDS = COLLECTION_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = COLLECTION_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__HIDE_WHEN = COLLECTION_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__MESSAGE_WHEN_HIDDEN = COLLECTION_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__HEADER = COLLECTION_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__FOOTER = COLLECTION_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_FIELD_LIST_CLASS = COLLECTION_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_FIELD_LABEL_CLASS = COLLECTION_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_FIELD_VALUE_CLASS = COLLECTION_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_CONTROL_CLASS = COLLECTION_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = COLLECTION_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_ANCHOR_CLASS = COLLECTION_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__UNIT_TITLE = COLLECTION_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ELEMENT_TITLE = COLLECTION_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__TRUNCATE_ELEMENT_TITLE = COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__SELECTION = COLLECTION_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__FIND_CONTAINER_SELECTION = COLLECTION_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__FIND_ELEMENT_SELECTION = COLLECTION_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__FILTER = COLLECTION_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__SUPPORTED_FILTERS = COLLECTION_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__EMPTY_MESSAGE = COLLECTION_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__OMIT_FIELD_LABELS = COLLECTION_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__DEFAULT_PAGINATION_SIZE = COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__MAXIMUM_PAGINATION_SIZE = COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PAGINATION_CONTROL_PLACEMENT = COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__NEXT_NPAGES = COLLECTION_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PREVIOUS_NPAGES = COLLECTION_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__NEXT_PAGE_LABEL = COLLECTION_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__NEXT_PAGE_ICON_NAME = COLLECTION_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PREVIOUS_PAGE_LABEL = COLLECTION_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PREVIOUS_PAGE_ICON_NAME = COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__USE_DISABLED_PAGE_LINKS = COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__USE_FIRST_LAST_PAGE_LINKS = COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__FIRST_PAGE_LABEL = COLLECTION_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__FIRST_PAGE_ICON_NAME = COLLECTION_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LAST_PAGE_LABEL = COLLECTION_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LAST_PAGE_ICON_NAME = COLLECTION_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PAGINATION_CLASS = COLLECTION_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PAGINATION_ELEMENT_CLASS = COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PAGINATION_ANCHOR_CLASS = COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Badges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__BADGES = COLLECTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overlay Single Select Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION = COLLECTION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_ROW_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_COLUMN_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_CARD_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Local Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_CARD_HEADER_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Local Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_CARD_BODY_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Local Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__LOCAL_BADGE_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_FEATURE_COUNT = COLLECTION_UNIT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_OPERATION_COUNT = COLLECTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.TextCardsUnitImpl <em>Text Cards Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.TextCardsUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getTextCardsUnit()
	 * @generated
	 */
	int TEXT_CARDS_UNIT = 49;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DateCardsUnitImpl <em>Date Cards Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DateCardsUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDateCardsUnit()
	 * @generated
	 */
	int DATE_CARDS_UNIT = 50;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ControlUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 55;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SearchUnitImpl <em>Search Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SearchUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSearchUnit()
	 * @generated
	 */
	int SEARCH_UNIT = 56;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.ImageUnit <em>Image Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.ImageUnit
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getImageUnit()
	 * @generated
	 */
	int IMAGE_UNIT = 51;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl <em>Image Cards Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getImageCardsUnit()
	 * @generated
	 */
	int IMAGE_CARDS_UNIT = 52;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SliderUnitImpl <em>Slider Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SliderUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSliderUnit()
	 * @generated
	 */
	int SLIDER_UNIT = 53;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.GalleryUnitImpl <em>Gallery Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.GalleryUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getGalleryUnit()
	 * @generated
	 */
	int GALLERY_UNIT = 54;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SelectActionImpl <em>Select Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SelectActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSelectAction()
	 * @generated
	 */
	int SELECT_ACTION = 83;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DeleteActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDeleteAction()
	 * @generated
	 */
	int DELETE_ACTION = 82;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.BadgeImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getBadge()
	 * @generated
	 */
	int BADGE = 48;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__DISPLAYED_ON = 0;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__ICON_NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__DISPLAY_WHEN = 4;

	/**
	 * The feature id for the '<em><b>Local Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__LOCAL_BADGE_CLASS = 5;

	/**
	 * The number of structural features of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__NAME = CARDS_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__DISPLAY_LABEL = CARDS_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CONTROLLER = CARDS_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT = CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__REQUIRES_ROLE = CARDS_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PURPOSE_SUMMARY = CARDS_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__URI_ELEMENT = CARDS_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__URI_PARENT = CARDS_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__ALTERNATIVE = CARDS_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__SECTION_CLASS = CARDS_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__OMIT_CAPTION = CARDS_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_CAPTION_CLASS = CARDS_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_CONTENT_CLASS = CARDS_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CONTAINER_ACTIONS_PLACEMENT = CARDS_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__INSTANCE_ACTIONS_PLACEMENT = CARDS_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__ACTIONS = CARDS_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__ACTION_NAVIGATION_CLASS = CARDS_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CONTENT_TYPE = CARDS_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CONTAINING_TYPE = CARDS_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__ROUTE_ACTUALS = CARDS_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__DISPLAY_FIELDS = CARDS_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = CARDS_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__HIDE_WHEN = CARDS_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__MESSAGE_WHEN_HIDDEN = CARDS_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__HEADER = CARDS_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__FOOTER = CARDS_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_FIELD_LIST_CLASS = CARDS_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_FIELD_LABEL_CLASS = CARDS_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_FIELD_VALUE_CLASS = CARDS_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_CONTROL_CLASS = CARDS_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = CARDS_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_ANCHOR_CLASS = CARDS_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = CARDS_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__UNIT_TITLE = CARDS_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__ELEMENT_TITLE = CARDS_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__TRUNCATE_ELEMENT_TITLE = CARDS_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__SELECTION = CARDS_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__FIND_CONTAINER_SELECTION = CARDS_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__FIND_ELEMENT_SELECTION = CARDS_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__FILTER = CARDS_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__SUPPORTED_FILTERS = CARDS_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__EMPTY_MESSAGE = CARDS_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__OMIT_FIELD_LABELS = CARDS_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__DEFAULT_PAGINATION_SIZE = CARDS_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__MAXIMUM_PAGINATION_SIZE = CARDS_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PAGINATION_CONTROL_PLACEMENT = CARDS_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__NEXT_NPAGES = CARDS_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PREVIOUS_NPAGES = CARDS_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__NEXT_PAGE_LABEL = CARDS_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__NEXT_PAGE_ICON_NAME = CARDS_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PREVIOUS_PAGE_LABEL = CARDS_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PREVIOUS_PAGE_ICON_NAME = CARDS_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__USE_DISABLED_PAGE_LINKS = CARDS_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__USE_FIRST_LAST_PAGE_LINKS = CARDS_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__FIRST_PAGE_LABEL = CARDS_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__FIRST_PAGE_ICON_NAME = CARDS_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LAST_PAGE_LABEL = CARDS_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LAST_PAGE_ICON_NAME = CARDS_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PAGINATION_CLASS = CARDS_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PAGINATION_ELEMENT_CLASS = CARDS_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PAGINATION_ANCHOR_CLASS = CARDS_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Badges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__BADGES = CARDS_UNIT__BADGES;

	/**
	 * The feature id for the '<em><b>Overlay Single Select Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION = CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION;

	/**
	 * The feature id for the '<em><b>Local Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_ROW_CLASS = CARDS_UNIT__LOCAL_ROW_CLASS;

	/**
	 * The feature id for the '<em><b>Local Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_COLUMN_CLASS = CARDS_UNIT__LOCAL_COLUMN_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_CARD_CLASS = CARDS_UNIT__LOCAL_CARD_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_CARD_HEADER_CLASS = CARDS_UNIT__LOCAL_CARD_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_CARD_BODY_CLASS = CARDS_UNIT__LOCAL_CARD_BODY_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS = CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Local Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__LOCAL_BADGE_CLASS = CARDS_UNIT__LOCAL_BADGE_CLASS;

	/**
	 * The number of structural features of the '<em>Text Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT_FEATURE_COUNT = CARDS_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT_OPERATION_COUNT = CARDS_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__NAME = CARDS_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__DISPLAY_LABEL = CARDS_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CONTROLLER = CARDS_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT = CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__REQUIRES_ROLE = CARDS_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PURPOSE_SUMMARY = CARDS_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__URI_ELEMENT = CARDS_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__URI_PARENT = CARDS_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__ALTERNATIVE = CARDS_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__SECTION_CLASS = CARDS_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__OMIT_CAPTION = CARDS_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_CAPTION_CLASS = CARDS_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_CONTENT_CLASS = CARDS_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CONTAINER_ACTIONS_PLACEMENT = CARDS_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__INSTANCE_ACTIONS_PLACEMENT = CARDS_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__ACTIONS = CARDS_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__ACTION_NAVIGATION_CLASS = CARDS_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CONTENT_TYPE = CARDS_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CONTAINING_TYPE = CARDS_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__ROUTE_ACTUALS = CARDS_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__DISPLAY_FIELDS = CARDS_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = CARDS_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__HIDE_WHEN = CARDS_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__MESSAGE_WHEN_HIDDEN = CARDS_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__HEADER = CARDS_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__FOOTER = CARDS_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_FIELD_LIST_CLASS = CARDS_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_FIELD_LABEL_CLASS = CARDS_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_FIELD_VALUE_CLASS = CARDS_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_CONTROL_CLASS = CARDS_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = CARDS_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_ANCHOR_CLASS = CARDS_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = CARDS_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__UNIT_TITLE = CARDS_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__ELEMENT_TITLE = CARDS_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__TRUNCATE_ELEMENT_TITLE = CARDS_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__SELECTION = CARDS_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__FIND_CONTAINER_SELECTION = CARDS_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__FIND_ELEMENT_SELECTION = CARDS_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__FILTER = CARDS_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__SUPPORTED_FILTERS = CARDS_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__EMPTY_MESSAGE = CARDS_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__OMIT_FIELD_LABELS = CARDS_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__DEFAULT_PAGINATION_SIZE = CARDS_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__MAXIMUM_PAGINATION_SIZE = CARDS_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PAGINATION_CONTROL_PLACEMENT = CARDS_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__NEXT_NPAGES = CARDS_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PREVIOUS_NPAGES = CARDS_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__NEXT_PAGE_LABEL = CARDS_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__NEXT_PAGE_ICON_NAME = CARDS_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PREVIOUS_PAGE_LABEL = CARDS_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PREVIOUS_PAGE_ICON_NAME = CARDS_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__USE_DISABLED_PAGE_LINKS = CARDS_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__USE_FIRST_LAST_PAGE_LINKS = CARDS_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__FIRST_PAGE_LABEL = CARDS_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__FIRST_PAGE_ICON_NAME = CARDS_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LAST_PAGE_LABEL = CARDS_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LAST_PAGE_ICON_NAME = CARDS_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PAGINATION_CLASS = CARDS_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PAGINATION_ELEMENT_CLASS = CARDS_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PAGINATION_ANCHOR_CLASS = CARDS_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Badges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__BADGES = CARDS_UNIT__BADGES;

	/**
	 * The feature id for the '<em><b>Overlay Single Select Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION = CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION;

	/**
	 * The feature id for the '<em><b>Local Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_ROW_CLASS = CARDS_UNIT__LOCAL_ROW_CLASS;

	/**
	 * The feature id for the '<em><b>Local Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_COLUMN_CLASS = CARDS_UNIT__LOCAL_COLUMN_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_CARD_CLASS = CARDS_UNIT__LOCAL_CARD_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_CARD_HEADER_CLASS = CARDS_UNIT__LOCAL_CARD_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_CARD_BODY_CLASS = CARDS_UNIT__LOCAL_CARD_BODY_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS = CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Local Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__LOCAL_BADGE_CLASS = CARDS_UNIT__LOCAL_BADGE_CLASS;

	/**
	 * The feature id for the '<em><b>Element Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__ELEMENT_DATE = CARDS_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT_FEATURE_COUNT = CARDS_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT_OPERATION_COUNT = CARDS_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__IMAGE_PATH_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__MISSING_IMAGE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Show Missing Image When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SHOW_MISSING_IMAGE_WHEN = 2;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__IMAGE_FILTER = 3;

	/**
	 * The number of structural features of the '<em>Image Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Image Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__NAME = CARDS_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__DISPLAY_LABEL = CARDS_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CONTROLLER = CARDS_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT = CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__REQUIRES_ROLE = CARDS_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PURPOSE_SUMMARY = CARDS_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__URI_ELEMENT = CARDS_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__URI_PARENT = CARDS_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__ALTERNATIVE = CARDS_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__SECTION_CLASS = CARDS_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__OMIT_CAPTION = CARDS_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_CAPTION_CLASS = CARDS_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_CONTENT_CLASS = CARDS_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CONTAINER_ACTIONS_PLACEMENT = CARDS_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__INSTANCE_ACTIONS_PLACEMENT = CARDS_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__ACTIONS = CARDS_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__ACTION_NAVIGATION_CLASS = CARDS_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CONTENT_TYPE = CARDS_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CONTAINING_TYPE = CARDS_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__ROUTE_ACTUALS = CARDS_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__DISPLAY_FIELDS = CARDS_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = CARDS_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__HIDE_WHEN = CARDS_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__MESSAGE_WHEN_HIDDEN = CARDS_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__HEADER = CARDS_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__FOOTER = CARDS_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_FIELD_LIST_CLASS = CARDS_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_FIELD_LABEL_CLASS = CARDS_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_FIELD_VALUE_CLASS = CARDS_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_CONTROL_CLASS = CARDS_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = CARDS_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_ANCHOR_CLASS = CARDS_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = CARDS_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__UNIT_TITLE = CARDS_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__ELEMENT_TITLE = CARDS_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__TRUNCATE_ELEMENT_TITLE = CARDS_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__SELECTION = CARDS_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__FIND_CONTAINER_SELECTION = CARDS_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__FIND_ELEMENT_SELECTION = CARDS_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__FILTER = CARDS_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__SUPPORTED_FILTERS = CARDS_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__EMPTY_MESSAGE = CARDS_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__OMIT_FIELD_LABELS = CARDS_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__DEFAULT_PAGINATION_SIZE = CARDS_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__MAXIMUM_PAGINATION_SIZE = CARDS_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PAGINATION_CONTROL_PLACEMENT = CARDS_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__NEXT_NPAGES = CARDS_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PREVIOUS_NPAGES = CARDS_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__NEXT_PAGE_LABEL = CARDS_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__NEXT_PAGE_ICON_NAME = CARDS_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PREVIOUS_PAGE_LABEL = CARDS_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PREVIOUS_PAGE_ICON_NAME = CARDS_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__USE_DISABLED_PAGE_LINKS = CARDS_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__USE_FIRST_LAST_PAGE_LINKS = CARDS_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__FIRST_PAGE_LABEL = CARDS_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__FIRST_PAGE_ICON_NAME = CARDS_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LAST_PAGE_LABEL = CARDS_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LAST_PAGE_ICON_NAME = CARDS_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PAGINATION_CLASS = CARDS_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PAGINATION_ELEMENT_CLASS = CARDS_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PAGINATION_ANCHOR_CLASS = CARDS_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Badges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__BADGES = CARDS_UNIT__BADGES;

	/**
	 * The feature id for the '<em><b>Overlay Single Select Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION = CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION;

	/**
	 * The feature id for the '<em><b>Local Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_ROW_CLASS = CARDS_UNIT__LOCAL_ROW_CLASS;

	/**
	 * The feature id for the '<em><b>Local Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_COLUMN_CLASS = CARDS_UNIT__LOCAL_COLUMN_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_CARD_CLASS = CARDS_UNIT__LOCAL_CARD_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_CARD_HEADER_CLASS = CARDS_UNIT__LOCAL_CARD_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_CARD_BODY_CLASS = CARDS_UNIT__LOCAL_CARD_BODY_CLASS;

	/**
	 * The feature id for the '<em><b>Local Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS = CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Local Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__LOCAL_BADGE_CLASS = CARDS_UNIT__LOCAL_BADGE_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE = CARDS_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH = CARDS_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Missing Image When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN = CARDS_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__IMAGE_FILTER = CARDS_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Overlay Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__OVERLAY_TITLE = CARDS_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enable Image Enlargement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT = CARDS_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reveal Untruncated Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT = CARDS_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Image Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT_FEATURE_COUNT = CARDS_UNIT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Image Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT_OPERATION_COUNT = CARDS_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NAME = COLLECTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAY_LABEL = COLLECTION_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTROLLER = COLLECTION_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CREATE_DEFAULT_URI_ELEMENT = COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__REQUIRES_ROLE = COLLECTION_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PURPOSE_SUMMARY = COLLECTION_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__URI_ELEMENT = COLLECTION_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__URI_PARENT = COLLECTION_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ALTERNATIVE = COLLECTION_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SECTION_CLASS = COLLECTION_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__OMIT_CAPTION = COLLECTION_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_CAPTION_CLASS = COLLECTION_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_CONTENT_CLASS = COLLECTION_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTAINER_ACTIONS_PLACEMENT = COLLECTION_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__INSTANCE_ACTIONS_PLACEMENT = COLLECTION_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ACTIONS = COLLECTION_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTENT_TYPE = COLLECTION_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTAINING_TYPE = COLLECTION_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ROUTE_ACTUALS = COLLECTION_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAY_FIELDS = COLLECTION_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = COLLECTION_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HIDE_WHEN = COLLECTION_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MESSAGE_WHEN_HIDDEN = COLLECTION_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HEADER = COLLECTION_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FOOTER = COLLECTION_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_FIELD_LIST_CLASS = COLLECTION_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_FIELD_LABEL_CLASS = COLLECTION_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_FIELD_VALUE_CLASS = COLLECTION_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_CONTROL_CLASS = COLLECTION_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = COLLECTION_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_ANCHOR_CLASS = COLLECTION_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__UNIT_TITLE = COLLECTION_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ELEMENT_TITLE = COLLECTION_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__TRUNCATE_ELEMENT_TITLE = COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SELECTION = COLLECTION_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIND_CONTAINER_SELECTION = COLLECTION_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIND_ELEMENT_SELECTION = COLLECTION_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FILTER = COLLECTION_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SUPPORTED_FILTERS = COLLECTION_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__EMPTY_MESSAGE = COLLECTION_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__OMIT_FIELD_LABELS = COLLECTION_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DEFAULT_PAGINATION_SIZE = COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MAXIMUM_PAGINATION_SIZE = COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_CONTROL_PLACEMENT = COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_NPAGES = COLLECTION_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_NPAGES = COLLECTION_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_PAGE_LABEL = COLLECTION_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_PAGE_ICON_NAME = COLLECTION_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_PAGE_LABEL = COLLECTION_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_PAGE_ICON_NAME = COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__USE_DISABLED_PAGE_LINKS = COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__USE_FIRST_LAST_PAGE_LINKS = COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIRST_PAGE_LABEL = COLLECTION_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIRST_PAGE_ICON_NAME = COLLECTION_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LAST_PAGE_LABEL = COLLECTION_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LAST_PAGE_ICON_NAME = COLLECTION_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_CLASS = COLLECTION_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_ELEMENT_CLASS = COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_ANCHOR_CLASS = COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__IMAGE_PATH_FEATURE = COLLECTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MISSING_IMAGE_PATH = COLLECTION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Missing Image When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SHOW_MISSING_IMAGE_WHEN = COLLECTION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__IMAGE_FILTER = COLLECTION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SHOW_TIME = COLLECTION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__TRANSITION_TIME = COLLECTION_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Slider Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_FEATURE_COUNT = COLLECTION_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Slider Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_OPERATION_COUNT = COLLECTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NAME = COLLECTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAY_LABEL = COLLECTION_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTROLLER = COLLECTION_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CREATE_DEFAULT_URI_ELEMENT = COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__REQUIRES_ROLE = COLLECTION_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PURPOSE_SUMMARY = COLLECTION_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__URI_ELEMENT = COLLECTION_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__URI_PARENT = COLLECTION_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ALTERNATIVE = COLLECTION_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SECTION_CLASS = COLLECTION_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__OMIT_CAPTION = COLLECTION_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_CAPTION_CLASS = COLLECTION_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_CONTENT_CLASS = COLLECTION_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTAINER_ACTIONS_PLACEMENT = COLLECTION_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__INSTANCE_ACTIONS_PLACEMENT = COLLECTION_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ACTIONS = COLLECTION_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTENT_TYPE = COLLECTION_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTAINING_TYPE = COLLECTION_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ROUTE_ACTUALS = COLLECTION_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAY_FIELDS = COLLECTION_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = COLLECTION_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HIDE_WHEN = COLLECTION_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MESSAGE_WHEN_HIDDEN = COLLECTION_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HEADER = COLLECTION_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FOOTER = COLLECTION_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_FIELD_LIST_CLASS = COLLECTION_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_FIELD_LABEL_CLASS = COLLECTION_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_FIELD_VALUE_CLASS = COLLECTION_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_CONTROL_CLASS = COLLECTION_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = COLLECTION_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_ANCHOR_CLASS = COLLECTION_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = COLLECTION_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__UNIT_TITLE = COLLECTION_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ELEMENT_TITLE = COLLECTION_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__TRUNCATE_ELEMENT_TITLE = COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SELECTION = COLLECTION_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIND_CONTAINER_SELECTION = COLLECTION_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIND_ELEMENT_SELECTION = COLLECTION_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FILTER = COLLECTION_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SUPPORTED_FILTERS = COLLECTION_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__EMPTY_MESSAGE = COLLECTION_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__OMIT_FIELD_LABELS = COLLECTION_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DEFAULT_PAGINATION_SIZE = COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MAXIMUM_PAGINATION_SIZE = COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_CONTROL_PLACEMENT = COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_NPAGES = COLLECTION_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_NPAGES = COLLECTION_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_PAGE_LABEL = COLLECTION_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_PAGE_ICON_NAME = COLLECTION_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_PAGE_LABEL = COLLECTION_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_PAGE_ICON_NAME = COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__USE_DISABLED_PAGE_LINKS = COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__USE_FIRST_LAST_PAGE_LINKS = COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIRST_PAGE_LABEL = COLLECTION_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIRST_PAGE_ICON_NAME = COLLECTION_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LAST_PAGE_LABEL = COLLECTION_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LAST_PAGE_ICON_NAME = COLLECTION_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_CLASS = COLLECTION_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_ELEMENT_CLASS = COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_ANCHOR_CLASS = COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__IMAGE_PATH_FEATURE = COLLECTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MISSING_IMAGE_PATH = COLLECTION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Missing Image When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SHOW_MISSING_IMAGE_WHEN = COLLECTION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__IMAGE_FILTER = COLLECTION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Full Size Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FULL_SIZE_FILTER = COLLECTION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SHOW_TIME = COLLECTION_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__TRANSITION_TIME = COLLECTION_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gallery Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_FEATURE_COUNT = COLLECTION_UNIT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Gallery Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_OPERATION_COUNT = COLLECTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTROLLER = DYNAMIC_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__URI_PARENT = DYNAMIC_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SECTION_CLASS = DYNAMIC_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_CAPTION_CLASS = DYNAMIC_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_CONTENT_CLASS = DYNAMIC_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTAINER_ACTIONS_PLACEMENT = DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__INSTANCE_ACTIONS_PLACEMENT = DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ACTIONS = DYNAMIC_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ACTION_NAVIGATION_CLASS = DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTENT_TYPE = DYNAMIC_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTAINING_TYPE = DYNAMIC_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HIDE_WHEN = DYNAMIC_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__MESSAGE_WHEN_HIDDEN = DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_FIELD_LIST_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_FIELD_LABEL_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_FIELD_VALUE_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_CONTROL_CLASS = DYNAMIC_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_ANCHOR_CLASS = DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SUBMIT_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CANCEL_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CANCEL_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTROLLER = CONTROL_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTROL_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__REQUIRES_ROLE = CONTROL_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__URI_ELEMENT = CONTROL_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__URI_PARENT = CONTROL_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ALTERNATIVE = CONTROL_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SECTION_CLASS = CONTROL_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_CAPTION_CLASS = CONTROL_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_CONTENT_CLASS = CONTROL_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTAINER_ACTIONS_PLACEMENT = CONTROL_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__INSTANCE_ACTIONS_PLACEMENT = CONTROL_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ACTIONS = CONTROL_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ACTION_NAVIGATION_CLASS = CONTROL_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTENT_TYPE = CONTROL_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTAINING_TYPE = CONTROL_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ROUTE_ACTUALS = CONTROL_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = CONTROL_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HIDE_WHEN = CONTROL_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__MESSAGE_WHEN_HIDDEN = CONTROL_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_FIELD_LIST_CLASS = CONTROL_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_FIELD_LABEL_CLASS = CONTROL_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_FIELD_VALUE_CLASS = CONTROL_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_CONTROL_CLASS = CONTROL_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = CONTROL_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_ANCHOR_CLASS = CONTROL_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = CONTROL_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Results Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__RESULTS_DESTINATION = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Search Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Search Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT_OPERATION_COUNT = CONTROL_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.RegistrationUnitImpl <em>Registration Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.RegistrationUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getRegistrationUnit()
	 * @generated
	 */
	int REGISTRATION_UNIT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTROLLER = EDIT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__URI_PARENT = EDIT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__SECTION_CLASS = EDIT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_CAPTION_CLASS = EDIT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_CONTENT_CLASS = EDIT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTAINER_ACTIONS_PLACEMENT = EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__INSTANCE_ACTIONS_PLACEMENT = EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ACTIONS = EDIT_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ACTION_NAVIGATION_CLASS = EDIT_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTAINING_TYPE = EDIT_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HIDE_WHEN = EDIT_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__MESSAGE_WHEN_HIDDEN = EDIT_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_FIELD_LIST_CLASS = EDIT_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_FIELD_LABEL_CLASS = EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_FIELD_VALUE_CLASS = EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_CONTROL_CLASS = EDIT_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_ANCHOR_CLASS = EDIT_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__USE_CAPTCHA = EDIT_UNIT__USE_CAPTCHA;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISABLE_WHEN = EDIT_UNIT__DISABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONFIRM_MESSAGE = EDIT_UNIT__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__SUCCESS_MESSAGE = EDIT_UNIT__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__UNIT_INPUT_GROUP_CLASS = EDIT_UNIT__UNIT_INPUT_GROUP_CLASS;

	/**
	 * The number of structural features of the '<em>Registration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Registration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.LoginUnitImpl <em>Login Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.LoginUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getLoginUnit()
	 * @generated
	 */
	int LOGIN_UNIT = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTROLLER = EDIT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__URI_PARENT = EDIT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SECTION_CLASS = EDIT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_CAPTION_CLASS = EDIT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_CONTENT_CLASS = EDIT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTAINER_ACTIONS_PLACEMENT = EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__INSTANCE_ACTIONS_PLACEMENT = EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ACTIONS = EDIT_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ACTION_NAVIGATION_CLASS = EDIT_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTAINING_TYPE = EDIT_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HIDE_WHEN = EDIT_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__MESSAGE_WHEN_HIDDEN = EDIT_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_FIELD_LIST_CLASS = EDIT_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_FIELD_LABEL_CLASS = EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_FIELD_VALUE_CLASS = EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_CONTROL_CLASS = EDIT_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_ANCHOR_CLASS = EDIT_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__USE_CAPTCHA = EDIT_UNIT__USE_CAPTCHA;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISABLE_WHEN = EDIT_UNIT__DISABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONFIRM_MESSAGE = EDIT_UNIT__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SUCCESS_MESSAGE = EDIT_UNIT__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__UNIT_INPUT_GROUP_CLASS = EDIT_UNIT__UNIT_INPUT_GROUP_CLASS;

	/**
	 * The number of structural features of the '<em>Login Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Login Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.LogoutUnitImpl <em>Logout Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.LogoutUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getLogoutUnit()
	 * @generated
	 */
	int LOGOUT_UNIT = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__CONTROLLER = DYNAMIC_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__REQUIRES_ROLE = DYNAMIC_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__URI_ELEMENT = DYNAMIC_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__URI_PARENT = DYNAMIC_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__ALTERNATIVE = DYNAMIC_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__SECTION_CLASS = DYNAMIC_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_CAPTION_CLASS = DYNAMIC_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_CONTENT_CLASS = DYNAMIC_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__CONTAINER_ACTIONS_PLACEMENT = DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__INSTANCE_ACTIONS_PLACEMENT = DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__ACTIONS = DYNAMIC_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__ACTION_NAVIGATION_CLASS = DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__CONTENT_TYPE = DYNAMIC_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__CONTAINING_TYPE = DYNAMIC_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__HIDE_WHEN = DYNAMIC_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__MESSAGE_WHEN_HIDDEN = DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_FIELD_LIST_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_FIELD_LABEL_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_FIELD_VALUE_CLASS = DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_CONTROL_CLASS = DYNAMIC_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_ANCHOR_CLASS = DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The number of structural features of the '<em>Logout Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logout Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_UNIT_OPERATION_COUNT = DYNAMIC_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl <em>Forgotten Password Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getForgottenPasswordUnit()
	 * @generated
	 */
	int FORGOTTEN_PASSWORD_UNIT = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTROLLER = EDIT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__URI_PARENT = EDIT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SECTION_CLASS = EDIT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_CAPTION_CLASS = EDIT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_CONTENT_CLASS = EDIT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTAINER_ACTIONS_PLACEMENT = EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__INSTANCE_ACTIONS_PLACEMENT = EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ACTIONS = EDIT_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ACTION_NAVIGATION_CLASS = EDIT_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTAINING_TYPE = EDIT_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HIDE_WHEN = EDIT_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__MESSAGE_WHEN_HIDDEN = EDIT_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_FIELD_LIST_CLASS = EDIT_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_FIELD_LABEL_CLASS = EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_FIELD_VALUE_CLASS = EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_CONTROL_CLASS = EDIT_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_ANCHOR_CLASS = EDIT_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__USE_CAPTCHA = EDIT_UNIT__USE_CAPTCHA;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISABLE_WHEN = EDIT_UNIT__DISABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONFIRM_MESSAGE = EDIT_UNIT__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SUCCESS_MESSAGE = EDIT_UNIT__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__UNIT_INPUT_GROUP_CLASS = EDIT_UNIT__UNIT_INPUT_GROUP_CLASS;

	/**
	 * The feature id for the '<em><b>Reset Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri Email Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE = EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Email Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION = EDIT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Email Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE = EDIT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Forgotten Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Forgotten Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ResetPasswordUnitImpl <em>Reset Password Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ResetPasswordUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getResetPasswordUnit()
	 * @generated
	 */
	int RESET_PASSWORD_UNIT = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CONTROLLER = EDIT_UNIT__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__REQUIRES_ROLE = EDIT_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__URI_ELEMENT = EDIT_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__URI_PARENT = EDIT_UNIT__URI_PARENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__ALTERNATIVE = EDIT_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__SECTION_CLASS = EDIT_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Local Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_CAPTION_CLASS = EDIT_UNIT__LOCAL_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Local Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_CONTENT_CLASS = EDIT_UNIT__LOCAL_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CONTAINER_ACTIONS_PLACEMENT = EDIT_UNIT__CONTAINER_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__INSTANCE_ACTIONS_PLACEMENT = EDIT_UNIT__INSTANCE_ACTIONS_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__ACTIONS = EDIT_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__ACTION_NAVIGATION_CLASS = EDIT_UNIT__ACTION_NAVIGATION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CONTAINING_TYPE = EDIT_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = EDIT_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__HIDE_WHEN = EDIT_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__MESSAGE_WHEN_HIDDEN = EDIT_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Local Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_FIELD_LIST_CLASS = EDIT_UNIT__LOCAL_FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_FIELD_LABEL_CLASS = EDIT_UNIT__LOCAL_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_FIELD_VALUE_CLASS = EDIT_UNIT__LOCAL_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Local Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_CONTROL_CLASS = EDIT_UNIT__LOCAL_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = EDIT_UNIT__LOCAL_INSTANCE_CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_ANCHOR_CLASS = EDIT_UNIT__LOCAL_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Local Instance Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = EDIT_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Use Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__USE_CAPTCHA = EDIT_UNIT__USE_CAPTCHA;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__DISABLE_WHEN = EDIT_UNIT__DISABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CONFIRM_MESSAGE = EDIT_UNIT__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__SUCCESS_MESSAGE = EDIT_UNIT__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT__UNIT_INPUT_GROUP_CLASS = EDIT_UNIT__UNIT_INPUT_GROUP_CLASS;

	/**
	 * The number of structural features of the '<em>Reset Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reset Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PathImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 62;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__CONTAINING_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathAssociationImpl <em>Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PathAssociationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathAssociation()
	 * @generated
	 */
	int PATH_ASSOCIATION = 63;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION__CONTAINING_TYPE = PATH__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION__ASSOCIATION = PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION__NAME = PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION__VALUE_DISPLAY = PATH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION__CHILD_FEATURE = PATH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = PATH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION__SOURCE_ENTITY = PATH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION__TARGET_ENTITY = PATH_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION_FEATURE_COUNT = PATH_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ASSOCIATION_OPERATION_COUNT = PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathAttributeImpl <em>Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PathAttributeImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathAttribute()
	 * @generated
	 */
	int PATH_ATTRIBUTE = 64;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ATTRIBUTE__CONTAINING_TYPE = PATH__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ATTRIBUTE__ATTRIBUTE = PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ATTRIBUTE__NAME = PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ATTRIBUTE_FEATURE_COUNT = PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ATTRIBUTE_OPERATION_COUNT = PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathResourceImpl <em>Path Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PathResourceImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathResource()
	 * @generated
	 */
	int PATH_RESOURCE = 65;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESOURCE__CONTAINING_TYPE = PATH__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESOURCE__RESOURCE = PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESOURCE__NAME = PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESOURCE_FEATURE_COUNT = PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESOURCE_OPERATION_COUNT = PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathImpl <em>Child Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPath()
	 * @generated
	 */
	int CHILD_PATH = 66;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Child Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Child Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__CONTAINING_TYPE = PATH_ASSOCIATION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__ASSOCIATION = PATH_ASSOCIATION__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__NAME = PATH_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__VALUE_DISPLAY = PATH_ASSOCIATION__VALUE_DISPLAY;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__CHILD_FEATURE = PATH_ASSOCIATION__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__SOURCE_ENTITY = PATH_ASSOCIATION__SOURCE_ENTITY;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__TARGET_ENTITY = PATH_ASSOCIATION__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__PARENT = PATH_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION_FEATURE_COUNT = PATH_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Child Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION_OPERATION_COUNT = PATH_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__CONTAINING_TYPE = PATH_ATTRIBUTE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__ATTRIBUTE = PATH_ATTRIBUTE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__NAME = PATH_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__PARENT = PATH_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE_FEATURE_COUNT = PATH_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Child Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE_OPERATION_COUNT = PATH_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathResourceImpl <em>Child Path Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathResourceImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPathResource()
	 * @generated
	 */
	int CHILD_PATH_RESOURCE = 69;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_RESOURCE__CONTAINING_TYPE = PATH_RESOURCE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_RESOURCE__RESOURCE = PATH_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_RESOURCE__NAME = PATH_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_RESOURCE__PARENT = PATH_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Path Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_RESOURCE_FEATURE_COUNT = PATH_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Child Path Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_RESOURCE_OPERATION_COUNT = PATH_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__CONTAINING_TYPE = PATH_ASSOCIATION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__ASSOCIATION = PATH_ASSOCIATION__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__NAME = PATH_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY = PATH_ASSOCIATION__VALUE_DISPLAY;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__CHILD_FEATURE = PATH_ASSOCIATION__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY = PATH_ASSOCIATION__SOURCE_ENTITY;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__TARGET_ENTITY = PATH_ASSOCIATION__TARGET_ENTITY;

	/**
	 * The number of structural features of the '<em>Feature Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION_FEATURE_COUNT = PATH_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION_OPERATION_COUNT = PATH_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__CONTAINING_TYPE = PATH_ATTRIBUTE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__ATTRIBUTE = PATH_ATTRIBUTE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__NAME = PATH_ATTRIBUTE__NAME;

	/**
	 * The number of structural features of the '<em>Feature Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE_FEATURE_COUNT = PATH_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE_OPERATION_COUNT = PATH_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathLabelImpl <em>Feature Path Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathLabelImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathLabel()
	 * @generated
	 */
	int FEATURE_PATH_LABEL = 73;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_LABEL__LABEL = FEATURE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_LABEL__NAME = FEATURE_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Path Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_LABEL_FEATURE_COUNT = FEATURE_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Path Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_LABEL_OPERATION_COUNT = FEATURE_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathResourceImpl <em>Feature Path Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathResourceImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathResource()
	 * @generated
	 */
	int FEATURE_PATH_RESOURCE = 74;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_RESOURCE__CONTAINING_TYPE = PATH_RESOURCE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_RESOURCE__RESOURCE = PATH_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_RESOURCE__NAME = PATH_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Feature Path Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_RESOURCE_FEATURE_COUNT = PATH_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Path Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_RESOURCE_OPERATION_COUNT = PATH_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE__SUFFIXES = ExpressionPackage.VARIABLE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE__ROOT_CONTAINER = ExpressionPackage.VARIABLE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Use Container As Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE__CONTEXT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__CONTAINING_TYPE = PATH_ASSOCIATION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__ASSOCIATION = PATH_ASSOCIATION__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__NAME = PATH_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__VALUE_DISPLAY = PATH_ASSOCIATION__VALUE_DISPLAY;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__CHILD_FEATURE = PATH_ASSOCIATION__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__IS_SOURCE_ASSOCIATION = PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__SOURCE_ENTITY = PATH_ASSOCIATION__SOURCE_ENTITY;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__TARGET_ENTITY = PATH_ASSOCIATION__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__SUFFIXES = PATH_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__ROOT_CONTAINER = PATH_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Container As Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__USE_CONTAINER_AS_CONTEXT = PATH_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION__CONTEXT = PATH_ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Path Variable Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION_FEATURE_COUNT = PATH_ASSOCIATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Path Variable Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ASSOCIATION_OPERATION_COUNT = PATH_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE__CONTAINING_TYPE = PATH_ATTRIBUTE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE__ATTRIBUTE = PATH_ATTRIBUTE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE__NAME = PATH_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE__SUFFIXES = PATH_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE__ROOT_CONTAINER = PATH_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Container As Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE__USE_CONTAINER_AS_CONTEXT = PATH_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE__CONTEXT = PATH_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Path Variable Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE_FEATURE_COUNT = PATH_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Path Variable Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_ATTRIBUTE_OPERATION_COUNT = PATH_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableResourceImpl <em>Path Variable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PathVariableResourceImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathVariableResource()
	 * @generated
	 */
	int PATH_VARIABLE_RESOURCE = 78;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE__CONTAINING_TYPE = PATH_RESOURCE__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE__RESOURCE = PATH_RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE__NAME = PATH_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE__SUFFIXES = PATH_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE__ROOT_CONTAINER = PATH_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Container As Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE__USE_CONTAINER_AS_CONTEXT = PATH_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE__CONTEXT = PATH_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Path Variable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE_FEATURE_COUNT = PATH_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Path Variable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VARIABLE_RESOURCE_OPERATION_COUNT = PATH_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.ActionContainer <em>Action Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.ActionContainer
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getActionContainer()
	 * @generated
	 */
	int ACTION_CONTAINER = 79;

	/**
	 * The feature id for the '<em><b>Container Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONTAINER__CONTAINER_ACTIONS_PLACEMENT = 0;

	/**
	 * The feature id for the '<em><b>Instance Actions Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONTAINER__INSTANCE_ACTIONS_PLACEMENT = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONTAINER__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONTAINER__ACTION_NAVIGATION_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__USED_BY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARENT_UNIT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ICON_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DISABLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DISPLAY_WHEN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ENABLE_WHEN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONFIRM_MESSAGE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SUCCESS_MESSAGE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FAILURE_MESSAGE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ANCHOR_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HEADER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FOOTER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINING_TYPE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SecurityActionImpl <em>Security Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SecurityActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSecurityAction()
	 * @generated
	 */
	int SECURITY_ACTION = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__DISPLAY_LABEL = ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__USED_BY = ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__PARENT_UNIT = ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__ICON_NAME = ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__DISABLE = ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__DISPLAY_WHEN = ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__ENABLE_WHEN = ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__CONFIRM_MESSAGE = ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__SUCCESS_MESSAGE = ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__FAILURE_MESSAGE = ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__ANCHOR_CLASS = ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__HEADER_CLASS = ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__FOOTER_CLASS = ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__CONTAINING_TYPE = ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION__TARGET = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_LABEL = ACTION__DISPLAY_LABEL;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.OperationActionImpl <em>Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.OperationActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getOperationAction()
	 * @generated
	 */
	int OPERATION_ACTION = 87;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContainerSelectActionImpl <em>Container Select Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ContainerSelectActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContainerSelectAction()
	 * @generated
	 */
	int CONTAINER_SELECT_ACTION = 84;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.InstanceSelectActionImpl <em>Instance Select Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.InstanceSelectActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInstanceSelectAction()
	 * @generated
	 */
	int INSTANCE_SELECT_ACTION = 85;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__USED_BY = ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__PARENT_UNIT = ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__ICON_NAME = ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISABLE = ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_WHEN = ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__ENABLE_WHEN = ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__CONFIRM_MESSAGE = ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__SUCCESS_MESSAGE = ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FAILURE_MESSAGE = ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__ANCHOR_CLASS = ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER_CLASS = ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER_CLASS = ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__CONTAINING_TYPE = ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__REQUIRES_ROLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__URI_ELEMENT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_LABEL = ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__USED_BY = ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__PARENT_UNIT = ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__ICON_NAME = ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISABLE = ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_WHEN = ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__ENABLE_WHEN = ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__CONFIRM_MESSAGE = ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__SUCCESS_MESSAGE = ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FAILURE_MESSAGE = ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__ANCHOR_CLASS = ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER_CLASS = ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER_CLASS = ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__CONTAINING_TYPE = ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__TARGET = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__VALUE_PATH = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__NAME = SELECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__DISPLAY_LABEL = SELECT_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__USED_BY = SELECT_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__PARENT_UNIT = SELECT_ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__ICON_NAME = SELECT_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__DISABLE = SELECT_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__DISPLAY_WHEN = SELECT_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__ENABLE_WHEN = SELECT_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__CONFIRM_MESSAGE = SELECT_ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__SUCCESS_MESSAGE = SELECT_ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__FAILURE_MESSAGE = SELECT_ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__ANCHOR_CLASS = SELECT_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__HEADER_CLASS = SELECT_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__FOOTER_CLASS = SELECT_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__CONTAINING_TYPE = SELECT_ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__TARGET = SELECT_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Value Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION__VALUE_PATH = SELECT_ACTION__VALUE_PATH;

	/**
	 * The number of structural features of the '<em>Container Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION_FEATURE_COUNT = SELECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SELECT_ACTION_OPERATION_COUNT = SELECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__NAME = SELECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__DISPLAY_LABEL = SELECT_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__USED_BY = SELECT_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__PARENT_UNIT = SELECT_ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__ICON_NAME = SELECT_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__DISABLE = SELECT_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__DISPLAY_WHEN = SELECT_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__ENABLE_WHEN = SELECT_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__CONFIRM_MESSAGE = SELECT_ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__SUCCESS_MESSAGE = SELECT_ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__FAILURE_MESSAGE = SELECT_ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__ANCHOR_CLASS = SELECT_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__HEADER_CLASS = SELECT_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__FOOTER_CLASS = SELECT_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__CONTAINING_TYPE = SELECT_ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__TARGET = SELECT_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Value Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION__VALUE_PATH = SELECT_ACTION__VALUE_PATH;

	/**
	 * The number of structural features of the '<em>Instance Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION_FEATURE_COUNT = SELECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECT_ACTION_OPERATION_COUNT = SELECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.TargetActionImpl <em>Target Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.TargetActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getTargetAction()
	 * @generated
	 */
	int TARGET_ACTION = 86;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__NAME = SELECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__DISPLAY_LABEL = SELECT_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__USED_BY = SELECT_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__PARENT_UNIT = SELECT_ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__ICON_NAME = SELECT_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__DISABLE = SELECT_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__DISPLAY_WHEN = SELECT_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__ENABLE_WHEN = SELECT_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__CONFIRM_MESSAGE = SELECT_ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__SUCCESS_MESSAGE = SELECT_ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__FAILURE_MESSAGE = SELECT_ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__ANCHOR_CLASS = SELECT_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__HEADER_CLASS = SELECT_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__FOOTER_CLASS = SELECT_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__CONTAINING_TYPE = SELECT_ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__TARGET = SELECT_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Value Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION__VALUE_PATH = SELECT_ACTION__VALUE_PATH;

	/**
	 * The number of structural features of the '<em>Target Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION_FEATURE_COUNT = SELECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ACTION_OPERATION_COUNT = SELECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__DISPLAY_LABEL = ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__USED_BY = ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__PARENT_UNIT = ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__ICON_NAME = ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__DISABLE = ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__DISPLAY_WHEN = ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__ENABLE_WHEN = ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__CONFIRM_MESSAGE = ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__SUCCESS_MESSAGE = ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__FAILURE_MESSAGE = ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__ANCHOR_CLASS = ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__HEADER_CLASS = ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__FOOTER_CLASS = ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__CONTAINING_TYPE = ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__OPERATION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__REQUIRES_ROLE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__URI_ELEMENT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.InstanceOperationActionImpl <em>Instance Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.InstanceOperationActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInstanceOperationAction()
	 * @generated
	 */
	int INSTANCE_OPERATION_ACTION = 89;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContainerOperationActionImpl <em>Container Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ContainerOperationActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContainerOperationAction()
	 * @generated
	 */
	int CONTAINER_OPERATION_ACTION = 88;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__NAME = OPERATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__DISPLAY_LABEL = OPERATION_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__USED_BY = OPERATION_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__PARENT_UNIT = OPERATION_ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__ICON_NAME = OPERATION_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__DISABLE = OPERATION_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__DISPLAY_WHEN = OPERATION_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__ENABLE_WHEN = OPERATION_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__CONFIRM_MESSAGE = OPERATION_ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__SUCCESS_MESSAGE = OPERATION_ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__FAILURE_MESSAGE = OPERATION_ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__ANCHOR_CLASS = OPERATION_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__HEADER_CLASS = OPERATION_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__FOOTER_CLASS = OPERATION_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__CONTAINING_TYPE = OPERATION_ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__OPERATION = OPERATION_ACTION__OPERATION;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__REQUIRES_ROLE = OPERATION_ACTION__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION__URI_ELEMENT = OPERATION_ACTION__URI_ELEMENT;

	/**
	 * The number of structural features of the '<em>Container Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION_FEATURE_COUNT = OPERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_ACTION_OPERATION_COUNT = OPERATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__NAME = OPERATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__DISPLAY_LABEL = OPERATION_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__USED_BY = OPERATION_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__PARENT_UNIT = OPERATION_ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__ICON_NAME = OPERATION_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__DISABLE = OPERATION_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__DISPLAY_WHEN = OPERATION_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__ENABLE_WHEN = OPERATION_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__CONFIRM_MESSAGE = OPERATION_ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__SUCCESS_MESSAGE = OPERATION_ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__FAILURE_MESSAGE = OPERATION_ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__ANCHOR_CLASS = OPERATION_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__HEADER_CLASS = OPERATION_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__FOOTER_CLASS = OPERATION_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__CONTAINING_TYPE = OPERATION_ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__OPERATION = OPERATION_ACTION__OPERATION;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__REQUIRES_ROLE = OPERATION_ACTION__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION__URI_ELEMENT = OPERATION_ACTION__URI_ELEMENT;

	/**
	 * The number of structural features of the '<em>Instance Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION_FEATURE_COUNT = OPERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_ACTION_OPERATION_COUNT = OPERATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.GeneralOperationActionImpl <em>General Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.GeneralOperationActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getGeneralOperationAction()
	 * @generated
	 */
	int GENERAL_OPERATION_ACTION = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__NAME = OPERATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__DISPLAY_LABEL = OPERATION_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__USED_BY = OPERATION_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__PARENT_UNIT = OPERATION_ACTION__PARENT_UNIT;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__ICON_NAME = OPERATION_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__DISABLE = OPERATION_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__DISPLAY_WHEN = OPERATION_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__ENABLE_WHEN = OPERATION_ACTION__ENABLE_WHEN;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__CONFIRM_MESSAGE = OPERATION_ACTION__CONFIRM_MESSAGE;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__SUCCESS_MESSAGE = OPERATION_ACTION__SUCCESS_MESSAGE;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__FAILURE_MESSAGE = OPERATION_ACTION__FAILURE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__ANCHOR_CLASS = OPERATION_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__HEADER_CLASS = OPERATION_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__FOOTER_CLASS = OPERATION_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__CONTAINING_TYPE = OPERATION_ACTION__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__OPERATION = OPERATION_ACTION__OPERATION;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__REQUIRES_ROLE = OPERATION_ACTION__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION__URI_ELEMENT = OPERATION_ACTION__URI_ELEMENT;

	/**
	 * The number of structural features of the '<em>General Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION_FEATURE_COUNT = OPERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_ACTION_OPERATION_COUNT = OPERATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.MessageImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 91;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement <em>Authentication Menu Placement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getAuthenticationMenuPlacement()
	 * @generated
	 */
	int AUTHENTICATION_MENU_PLACEMENT = 92;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.PageTopMenuOptions
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPageTopMenuOptions()
	 * @generated
	 */
	int PAGE_TOP_MENU_OPTIONS = 93;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCollectionDisplayOptions()
	 * @generated
	 */
	int COLLECTION_DISPLAY_OPTIONS = 94;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.PaginationControlPlacements <em>Pagination Control Placements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.PaginationControlPlacements
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPaginationControlPlacements()
	 * @generated
	 */
	int PAGINATION_CONTROL_PLACEMENTS = 95;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement <em>Container Actions Placement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContainerActionsPlacement()
	 * @generated
	 */
	int CONTAINER_ACTIONS_PLACEMENT = 96;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement <em>Instance Actions Placement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInstanceActionsPlacement()
	 * @generated
	 */
	int INSTANCE_ACTIONS_PLACEMENT = 97;

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.WebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web UI</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI
	 * @generated
	 */
	EClass getWebUI();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persistence</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getPersistence()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_Persistence();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getNavigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigation</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getNavigation()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_Navigation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Services</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getServices()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.WebUI#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getControllers()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_Controllers();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#isUseFormFloatingLabels <em>Use Form Floating Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Form Floating Labels</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#isUseFormFloatingLabels()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_UseFormFloatingLabels();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateFormat <em>Default Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Date Format</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateFormat()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultDateFormat();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTimeFormat <em>Default Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Time Format</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTimeFormat()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultTimeFormat();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateTimeFormat <em>Default Date Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Date Time Format</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateTimeFormat()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultDateTimeFormat();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSaveLabel <em>Default Save Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Save Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSaveLabel()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultSaveLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultPageStyleClass <em>Default Page Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Page Style Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultPageStyleClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultPageStyleClass();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultStyles <em>Default Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultStyles()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_DefaultStyles();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardsStyles <em>Default Cards Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Cards Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardsStyles()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_DefaultCardsStyles();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDetailsStyles <em>Default Details Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Details Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDetailsStyles()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_DefaultDetailsStyles();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFormStyles <em>Default Form Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Form Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFormStyles()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_DefaultFormStyles();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultGalleryStyles <em>Default Gallery Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Gallery Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultGalleryStyles()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_DefaultGalleryStyles();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSliderStyles <em>Default Slider Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Slider Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSliderStyles()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_DefaultSliderStyles();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultStaticStyles <em>Default Static Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Static Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultStaticStyles()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_DefaultStaticStyles();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTabularStyles <em>Default Tabular Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Tabular Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTabularStyles()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_DefaultTabularStyles();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCancelLabel <em>Default Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Cancel Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCancelLabel()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultCancelLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Maximum Upload Size</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultMaximumUploadSize()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultMaximumUploadSize();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Navigation
	 * @generated
	 */
	EClass getNavigation();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.Navigation#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Navigation#getPartOf()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_PartOf();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.Navigation#getMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menus</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Navigation#getMenus()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_Menus();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Navigation#getNavbarClass <em>Navbar Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navbar Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Navigation#getNavbarClass()
	 * @see #getNavigation()
	 * @generated
	 */
	EAttribute getNavigation_NavbarClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Navigation#getAuthenticationMenuPlacement <em>Authentication Menu Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Menu Placement</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Navigation#getAuthenticationMenuPlacement()
	 * @see #getNavigation()
	 * @generated
	 */
	EAttribute getNavigation_AuthenticationMenuPlacement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Navigation#getAuthenticationBarClass <em>Authentication Bar Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Bar Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Navigation#getAuthenticationBarClass()
	 * @see #getNavigation()
	 * @generated
	 */
	EAttribute getNavigation_AuthenticationBarClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.Menu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Menu#getEntries()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Entries();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Menu#isOmitCaption <em>Omit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Caption</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Menu#isOmitCaption()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_OmitCaption();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Menu#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Menu#getCaptionClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Menu#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Menu#getStyleClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Menu#getLayoutClass <em>Layout Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Menu#getLayoutClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_LayoutClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Entry</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MenuEntry
	 * @generated
	 */
	EClass getMenuEntry();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.MenuEntry#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MenuEntry#getPartOf()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_PartOf();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SubmenuEntry <em>Submenu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submenu Entry</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SubmenuEntry
	 * @generated
	 */
	EClass getSubmenuEntry();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.SubmenuEntry#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SubmenuEntry#getRequiresRole()
	 * @see #getSubmenuEntry()
	 * @generated
	 */
	EAttribute getSubmenuEntry_RequiresRole();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.SubmenuEntry#isAlwaysVisible <em>Always Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Always Visible</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SubmenuEntry#isAlwaysVisible()
	 * @see #getSubmenuEntry()
	 * @generated
	 */
	EAttribute getSubmenuEntry_AlwaysVisible();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry <em>Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Menu Entry</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionMenuEntry
	 * @generated
	 */
	EClass getActionMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionMenuEntry#getDestination()
	 * @see #getActionMenuEntry()
	 * @generated
	 */
	EReference getActionMenuEntry_Destination();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry#isAlwaysVisible <em>Always Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Always Visible</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionMenuEntry#isAlwaysVisible()
	 * @see #getActionMenuEntry()
	 * @generated
	 */
	EAttribute getActionMenuEntry_AlwaysVisible();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.EditStaticTextMenuEntry <em>Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Static Text Menu Entry</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditStaticTextMenuEntry
	 * @generated
	 */
	EClass getEditStaticTextMenuEntry();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.MenuFeature <em>Menu Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MenuFeature
	 * @generated
	 */
	EClass getMenuFeature();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles <em>Content Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnitStyles
	 * @generated
	 */
	EClass getContentUnitStyles();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getSectionClass <em>Section Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getSectionClass()
	 * @see #getContentUnitStyles()
	 * @generated
	 */
	EAttribute getContentUnitStyles_SectionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getCaptionClass()
	 * @see #getContentUnitStyles()
	 * @generated
	 */
	EAttribute getContentUnitStyles_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getContentClass()
	 * @see #getContentUnitStyles()
	 * @generated
	 */
	EAttribute getContentUnitStyles_ContentClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles <em>Dynamic Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles
	 * @generated
	 */
	EClass getDynamicUnitStyles();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getFieldListClass <em>Field List Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field List Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getFieldListClass()
	 * @see #getDynamicUnitStyles()
	 * @generated
	 */
	EAttribute getDynamicUnitStyles_FieldListClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getDefinitionFieldListClass <em>Definition Field List Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Field List Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getDefinitionFieldListClass()
	 * @see #getDynamicUnitStyles()
	 * @generated
	 */
	EAttribute getDynamicUnitStyles_DefinitionFieldListClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getFieldLabelClass <em>Field Label Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Label Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getFieldLabelClass()
	 * @see #getDynamicUnitStyles()
	 * @generated
	 */
	EAttribute getDynamicUnitStyles_FieldLabelClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getFieldValueClass <em>Field Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Value Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getFieldValueClass()
	 * @see #getDynamicUnitStyles()
	 * @generated
	 */
	EAttribute getDynamicUnitStyles_FieldValueClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getControlClass <em>Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getControlClass()
	 * @see #getDynamicUnitStyles()
	 * @generated
	 */
	EAttribute getDynamicUnitStyles_ControlClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getActionNavigationClass <em>Action Navigation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Navigation Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getActionNavigationClass()
	 * @see #getDynamicUnitStyles()
	 * @generated
	 */
	EAttribute getDynamicUnitStyles_ActionNavigationClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getAnchorClass <em>Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnitStyles#getAnchorClass()
	 * @see #getDynamicUnitStyles()
	 * @generated
	 */
	EAttribute getDynamicUnitStyles_AnchorClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DefaultUnitStyles <em>Default Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DefaultUnitStyles
	 * @generated
	 */
	EClass getDefaultUnitStyles();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.CollectionUnitStyles <em>Collection Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnitStyles
	 * @generated
	 */
	EClass getCollectionUnitStyles();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnitStyles#getInstanceControlClass <em>Instance Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Control Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnitStyles#getInstanceControlClass()
	 * @see #getCollectionUnitStyles()
	 * @generated
	 */
	EAttribute getCollectionUnitStyles_InstanceControlClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnitStyles#getInstanceAnchorClass <em>Instance Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnitStyles#getInstanceAnchorClass()
	 * @see #getCollectionUnitStyles()
	 * @generated
	 */
	EAttribute getCollectionUnitStyles_InstanceAnchorClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles <em>Cards Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cards Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles
	 * @generated
	 */
	EClass getCardsUnitStyles();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getRowClass <em>Row Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getRowClass()
	 * @see #getCardsUnitStyles()
	 * @generated
	 */
	EAttribute getCardsUnitStyles_RowClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getColumnClass <em>Column Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getColumnClass()
	 * @see #getCardsUnitStyles()
	 * @generated
	 */
	EAttribute getCardsUnitStyles_ColumnClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getCardClass <em>Card Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getCardClass()
	 * @see #getCardsUnitStyles()
	 * @generated
	 */
	EAttribute getCardsUnitStyles_CardClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getCardHeaderClass <em>Card Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getCardHeaderClass()
	 * @see #getCardsUnitStyles()
	 * @generated
	 */
	EAttribute getCardsUnitStyles_CardHeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getCardBodyClass <em>Card Body Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Body Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getCardBodyClass()
	 * @see #getCardsUnitStyles()
	 * @generated
	 */
	EAttribute getCardsUnitStyles_CardBodyClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getCardFooterClass <em>Card Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getCardFooterClass()
	 * @see #getCardsUnitStyles()
	 * @generated
	 */
	EAttribute getCardsUnitStyles_CardFooterClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getBadgeClass <em>Badge Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Badge Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnitStyles#getBadgeClass()
	 * @see #getCardsUnitStyles()
	 * @generated
	 */
	EAttribute getCardsUnitStyles_BadgeClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DetailsUnitStyles <em>Details Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DetailsUnitStyles
	 * @generated
	 */
	EClass getDetailsUnitStyles();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.FormUnitStyles <em>Form Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FormUnitStyles
	 * @generated
	 */
	EClass getFormUnitStyles();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.FormUnitStyles#getInputGroupClass <em>Input Group Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Group Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FormUnitStyles#getInputGroupClass()
	 * @see #getFormUnitStyles()
	 * @generated
	 */
	EAttribute getFormUnitStyles_InputGroupClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.GalleryUnitStyles <em>Gallery Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gallery Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.GalleryUnitStyles
	 * @generated
	 */
	EClass getGalleryUnitStyles();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SliderUnitStyles <em>Slider Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SliderUnitStyles
	 * @generated
	 */
	EClass getSliderUnitStyles();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.StaticUnitStyles <em>Static Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.StaticUnitStyles
	 * @generated
	 */
	EClass getStaticUnitStyles();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.TabularUnitStyles <em>Tabular Unit Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabular Unit Styles</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnitStyles
	 * @generated
	 */
	EClass getTabularUnitStyles();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.TabularUnitStyles#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnitStyles#getHeaderClass()
	 * @see #getTabularUnitStyles()
	 * @generated
	 */
	EAttribute getTabularUnitStyles_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.TabularUnitStyles#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnitStyles#getFooterClass()
	 * @see #getTabularUnitStyles()
	 * @generated
	 */
	EAttribute getTabularUnitStyles_FooterClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.Controller#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Web UI</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getWebUI()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_WebUI();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.Controller#getParentController <em>Parent Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Controller</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getParentController()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ParentController();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.webui.Controller#getChildControllers <em>Child Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Controllers</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getChildControllers()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ChildControllers();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.Controller#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getUnits()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Units();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Controller#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getUriElement()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Controller#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getStyleClass()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_StyleClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ControllerLink <em>Controller Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Link</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ControllerLink
	 * @generated
	 */
	EClass getControllerLink();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ControllerLink#getTargetController <em>Target Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Controller</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ControllerLink#getTargetController()
	 * @see #getControllerLink()
	 * @generated
	 */
	EReference getControllerLink_TargetController();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SinglePageController <em>Single Page Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Page Controller</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SinglePageController
	 * @generated
	 */
	EClass getSinglePageController();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.MultiPageController <em>Multi Page Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Page Controller</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MultiPageController
	 * @generated
	 */
	EClass getMultiPageController();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit
	 * @generated
	 */
	EClass getContentUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#isCreateDefaultUriElement <em>Create Default Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Default Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#isCreateDefaultUriElement()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_CreateDefaultUriElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getRequiresRole()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_RequiresRole();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose Summary</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getPurposeSummary()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_PurposeSummary();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getUriElement()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_UriElement();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getUriParent <em>Uri Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uri Parent</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getUriParent()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_UriParent();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getAlternative()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Alternative();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getSectionClass <em>Section Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getSectionClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_SectionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#isOmitCaption <em>Omit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Caption</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#isOmitCaption()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_OmitCaption();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalCaptionClass <em>Local Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Caption Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalCaptionClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_LocalCaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalContentClass <em>Local Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Content Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalContentClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_LocalContentClass();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Controller</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getController()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_Controller();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.RouteActual <em>Route Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Actual</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.RouteActual
	 * @generated
	 */
	EClass getRouteActual();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.RouteActual#getActualFor <em>Actual For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Actual For</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.RouteActual#getActualFor()
	 * @see #getRouteActual()
	 * @generated
	 */
	EReference getRouteActual_ActualFor();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.RouteActual#getRouteParameter <em>Route Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route Parameter</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.RouteActual#getRouteParameter()
	 * @see #getRouteActual()
	 * @generated
	 */
	EReference getRouteActual_RouteParameter();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.RouteActual#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.RouteActual#getValue()
	 * @see #getRouteActual()
	 * @generated
	 */
	EReference getRouteActual_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.StaticUnit <em>Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.StaticUnit
	 * @generated
	 */
	EClass getStaticUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.StaticUnit#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.StaticUnit#getContent()
	 * @see #getStaticUnit()
	 * @generated
	 */
	EAttribute getStaticUnit_Content();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.CreateSitemapUnit <em>Create Sitemap Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Sitemap Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateSitemapUnit
	 * @generated
	 */
	EClass getCreateSitemapUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CreateSitemapUnit#getDeployedURL <em>Deployed URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployed URL</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateSitemapUnit#getDeployedURL()
	 * @see #getCreateSitemapUnit()
	 * @generated
	 */
	EAttribute getCreateSitemapUnit_DeployedURL();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CreateSitemapUnit#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateSitemapUnit#getFilename()
	 * @see #getCreateSitemapUnit()
	 * @generated
	 */
	EAttribute getCreateSitemapUnit_Filename();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit <em>Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit
	 * @generated
	 */
	EClass getDynamicUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getContentType()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_ContentType();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getContainingType()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_ContainingType();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getRouteActuals <em>Route Actuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Actuals</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getRouteActuals()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_RouteActuals();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getDisplayFields <em>Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Fields</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getDisplayFields()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_DisplayFields();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#isHasWhenFieldsEmptyAddImplicitFields <em>Has When Fields Empty Add Implicit Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has When Fields Empty Add Implicit Fields</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#isHasWhenFieldsEmptyAddImplicitFields()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_HasWhenFieldsEmptyAddImplicitFields();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHideWhen <em>Hide When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hide When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getHideWhen()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_HideWhen();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getMessageWhenHidden <em>Message When Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message When Hidden</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getMessageWhenHidden()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_MessageWhenHidden();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeader()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_Header();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooter()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_Footer();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldListClass <em>Local Field List Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Field List Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldListClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_LocalFieldListClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldLabelClass <em>Local Field Label Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Field Label Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldLabelClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_LocalFieldLabelClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldValueClass <em>Local Field Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Field Value Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldValueClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_LocalFieldValueClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalControlClass <em>Local Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Control Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalControlClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_LocalControlClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalInstanceControlClass <em>Local Instance Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Instance Control Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalInstanceControlClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_LocalInstanceControlClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalAnchorClass <em>Local Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalAnchorClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_LocalAnchorClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalInstanceAnchorClass <em>Local Instance Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Instance Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalInstanceAnchorClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_LocalInstanceAnchorClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UnitField <em>Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Field</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField
	 * @generated
	 */
	EClass getUnitField();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.UnitField#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#getDisplayedOn()
	 * @see #getUnitField()
	 * @generated
	 */
	EReference getUnitField_DisplayedOn();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitField#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#getRequiresRole()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_RequiresRole();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.UnitField#getHideWhen <em>Hide When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hide When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#getHideWhen()
	 * @see #getUnitField()
	 * @generated
	 */
	EReference getUnitField_HideWhen();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitField#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#getTitle()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_Title();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitField#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#getHelp()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_Help();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitField#isEscapeHTML <em>Escape HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escape HTML</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#isEscapeHTML()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_EscapeHTML();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Display Option</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#getCollectionDisplayOption()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_CollectionDisplayOption();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitField#isTruncate <em>Truncate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Truncate</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#isTruncate()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_Truncate();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitField#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#getDateFormat()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_DateFormat();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitField#isDisableInput <em>Disable Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable Input</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#isDisableInput()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_DisableInput();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UnitFeature <em>Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature
	 * @generated
	 */
	EClass getUnitFeature();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayLabel()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_DisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#isRequired()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Required();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getForcedValue <em>Forced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forced Value</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getForcedValue()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EReference getUnitFeature_ForcedValue();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isCollectionUiAllowAdd <em>Collection Ui Allow Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Ui Allow Add</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#isCollectionUiAllowAdd()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_CollectionUiAllowAdd();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isCollectionUiAllowRemove <em>Collection Ui Allow Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Ui Allow Remove</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#isCollectionUiAllowRemove()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_CollectionUiAllowRemove();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getCollectionMaximumValues <em>Collection Maximum Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Maximum Values</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getCollectionMaximumValues()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_CollectionMaximumValues();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDefaultDisplayValue <em>Default Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Display Value</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getDefaultDisplayValue()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_DefaultDisplayValue();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayDefaultWhen <em>Display Default When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Default When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayDefaultWhen()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EReference getUnitFeature_DisplayDefaultWhen();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getEmptyDisplayValue <em>Empty Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty Display Value</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getEmptyDisplayValue()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_EmptyDisplayValue();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getFooter()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Footer();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isAutofocus <em>Autofocus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autofocus</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#isAutofocus()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Autofocus();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getHeaderClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFieldLabelClass <em>Field Label Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Label Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getFieldLabelClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_FieldLabelClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFieldValueClass <em>Field Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Value Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getFieldValueClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_FieldValueClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getInputGroupClass <em>Input Group Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Group Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getInputGroupClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_InputGroupClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getFooterClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_FooterClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UnitElement <em>Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitElement
	 * @generated
	 */
	EClass getUnitElement();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitElement#getAttribute()
	 * @see #getUnitElement()
	 * @generated
	 */
	EReference getUnitElement_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitElement#getName()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitElement#getDefaultValue()
	 * @see #getUnitElement()
	 * @generated
	 */
	EReference getUnitElement_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitElement#isObfuscateFormFields()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitElement#getPlaceholder()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitElement#getValidationPattern()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UnitResource <em>Unit Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitResource
	 * @generated
	 */
	EClass getUnitResource();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitResource#getResource()
	 * @see #getUnitResource()
	 * @generated
	 */
	EReference getUnitResource_Resource();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitResource#getName()
	 * @see #getUnitResource()
	 * @generated
	 */
	EAttribute getUnitResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitResource#isIsDeletable <em>Is Deletable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deletable</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitResource#isIsDeletable()
	 * @see #getUnitResource()
	 * @generated
	 */
	EAttribute getUnitResource_IsDeletable();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitResource#isIsDownloadable <em>Is Downloadable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Downloadable</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitResource#isIsDownloadable()
	 * @see #getUnitResource()
	 * @generated
	 */
	EAttribute getUnitResource_IsDownloadable();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitResource#isShowImageWhenEditing <em>Show Image When Editing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Image When Editing</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitResource#isShowImageWhenEditing()
	 * @see #getUnitResource()
	 * @generated
	 */
	EAttribute getUnitResource_ShowImageWhenEditing();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitResource#getImageFilter <em>Image Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image Filter</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitResource#getImageFilter()
	 * @see #getUnitResource()
	 * @generated
	 */
	EReference getUnitResource_ImageFilter();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation <em>Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation
	 * @generated
	 */
	EClass getUnitAssociation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Options</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation#getOptions()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_Options();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getCollectionSortBy <em>Collection Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection Sort By</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation#getCollectionSortBy()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_CollectionSortBy();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#isUseAutocomplete <em>Use Autocomplete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Autocomplete</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation#isUseAutocomplete()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EAttribute getUnitAssociation_UseAutocomplete();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ChildPathAttribute <em>Child Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPathAttribute
	 * @generated
	 */
	EClass getChildPathAttribute();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ChildPathResource <em>Child Path Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPathResource
	 * @generated
	 */
	EClass getChildPathResource();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ChildPathAssociation <em>Child Path Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPathAssociation
	 * @generated
	 */
	EClass getChildPathAssociation();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.FeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePath
	 * @generated
	 */
	EClass getFeaturePath();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.FeaturePathAttribute <em>Feature Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathAttribute
	 * @generated
	 */
	EClass getFeaturePathAttribute();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.FeaturePathLabel <em>Feature Path Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathLabel
	 * @generated
	 */
	EClass getFeaturePathLabel();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.FeaturePathLabel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathLabel#getLabel()
	 * @see #getFeaturePathLabel()
	 * @generated
	 */
	EReference getFeaturePathLabel_Label();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.FeaturePathLabel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathLabel#getName()
	 * @see #getFeaturePathLabel()
	 * @generated
	 */
	EAttribute getFeaturePathLabel_Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.FeaturePathResource <em>Feature Path Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathResource
	 * @generated
	 */
	EClass getFeaturePathResource();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.PathVariable <em>Path Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathVariable
	 * @generated
	 */
	EClass getPathVariable();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.PathVariable#isUseContainerAsContext <em>Use Container As Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Container As Context</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathVariable#isUseContainerAsContext()
	 * @see #getPathVariable()
	 * @generated
	 */
	EAttribute getPathVariable_UseContainerAsContext();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.PathVariable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathVariable#getContext()
	 * @see #getPathVariable()
	 * @generated
	 */
	EReference getPathVariable_Context();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.PathVariableAssociation <em>Path Variable Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Variable Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathVariableAssociation
	 * @generated
	 */
	EClass getPathVariableAssociation();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.PathVariableAttribute <em>Path Variable Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Variable Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathVariableAttribute
	 * @generated
	 */
	EClass getPathVariableAttribute();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.PathVariableResource <em>Path Variable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Variable Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathVariableResource
	 * @generated
	 */
	EClass getPathVariableResource();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.FeaturePathAssociation <em>Feature Path Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathAssociation
	 * @generated
	 */
	EClass getFeaturePathAssociation();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UnitLabel <em>Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitLabel
	 * @generated
	 */
	EClass getUnitLabel();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitLabel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitLabel#getLabel()
	 * @see #getUnitLabel()
	 * @generated
	 */
	EReference getUnitLabel_Label();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitLabel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitLabel#getName()
	 * @see #getUnitLabel()
	 * @generated
	 */
	EAttribute getUnitLabel_Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.InterfaceField <em>Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Field</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField
	 * @generated
	 */
	EClass getInterfaceField();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#isRequired()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_Required();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getDefaultValue()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getPlaceholder()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#isRepeatedField <em>Repeated Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeated Field</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#isRepeatedField()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_RepeatedField();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondDisplayLabel <em>Second Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Display Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondDisplayLabel()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_SecondDisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondTitle <em>Second Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Title</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondTitle()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_SecondTitle();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondPlaceholder <em>Second Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Placeholder</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondPlaceholder()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_SecondPlaceholder();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondHelp <em>Second Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Help</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondHelp()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_SecondHelp();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getValidationPattern()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Field</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DataTypeField
	 * @generated
	 */
	EClass getDataTypeField();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.DataTypeField#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DataTypeField#getDataType()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EReference getDataTypeField_DataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DataTypeField#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DataTypeField#isObfuscateFormFields()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DataTypeField#isEncrypt <em>Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DataTypeField#isEncrypt()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_Encrypt();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DataTypeField#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DataTypeField#getInterfaceType()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_InterfaceType();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Field</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DateField
	 * @generated
	 */
	EClass getDateField();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DateField#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DateField#getDetails()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Details();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DateField#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DateField#getFormat()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Format();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SelectableUnit <em>Selectable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SelectableUnit
	 * @generated
	 */
	EClass getSelectableUnit();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SingletonUnit <em>Singleton Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SingletonUnit
	 * @generated
	 */
	EClass getSingletonUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.SingletonUnit#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SingletonUnit#getTitle()
	 * @see #getSingletonUnit()
	 * @generated
	 */
	EReference getSingletonUnit_Title();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit <em>Collection Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit
	 * @generated
	 */
	EClass getCollectionUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getUnitTitle <em>Unit Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit Title</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getUnitTitle()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_UnitTitle();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getElementTitle <em>Element Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Title</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getElementTitle()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_ElementTitle();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isTruncateElementTitle <em>Truncate Element Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Truncate Element Title</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#isTruncateElementTitle()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_TruncateElementTitle();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getSelection()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_Selection();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFindContainerSelection <em>Find Container Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Find Container Selection</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getFindContainerSelection()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_FindContainerSelection();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFindElementSelection <em>Find Element Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Find Element Selection</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getFindElementSelection()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_FindElementSelection();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getFilter()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_Filter();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSupportedFilters <em>Supported Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Filters</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getSupportedFilters()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_SupportedFilters();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getEmptyMessage <em>Empty Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getEmptyMessage()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_EmptyMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isOmitFieldLabels <em>Omit Field Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Field Labels</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#isOmitFieldLabels()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_OmitFieldLabels();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Pagination Size</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getDefaultPaginationSize()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_DefaultPaginationSize();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Pagination Size</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getMaximumPaginationSize()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_MaximumPaginationSize();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationControlPlacement <em>Pagination Control Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagination Control Placement</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationControlPlacement()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PaginationControlPlacement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextNpages <em>Next Npages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Npages</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextNpages()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_NextNpages();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Npages</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousNpages()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PreviousNpages();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Page Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_NextPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextPageIconName <em>Next Page Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Page Icon Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextPageIconName()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_NextPageIconName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Page Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PreviousPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousPageIconName <em>Previous Page Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Page Icon Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousPageIconName()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PreviousPageIconName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Disabled Page Links</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#isUseDisabledPageLinks()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_UseDisabledPageLinks();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use First Last Page Links</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#isUseFirstLastPageLinks()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_UseFirstLastPageLinks();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getFirstPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_FirstPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFirstPageIconName <em>First Page Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page Icon Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getFirstPageIconName()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_FirstPageIconName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Page Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getLastPageLabel()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_LastPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getLastPageIconName <em>Last Page Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Page Icon Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getLastPageIconName()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_LastPageIconName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationClass <em>Pagination Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagination Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationClass()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PaginationClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationElementClass <em>Pagination Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagination Element Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationElementClass()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PaginationElementClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationAnchorClass <em>Pagination Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagination Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationAnchorClass()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_PaginationAnchorClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.EditUnit <em>Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit
	 * @generated
	 */
	EClass getEditUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.EditUnit#isUseCaptcha <em>Use Captcha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Captcha</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#isUseCaptcha()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_UseCaptcha();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getDisableWhen <em>Disable When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disable When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#getDisableWhen()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_DisableWhen();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmDestination <em>Confirm Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Confirm Destination</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmDestination()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_ConfirmDestination();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmLabel()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_ConfirmLabel();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confirm Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#getConfirmMessage()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_ConfirmMessage();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getSuccessMessage <em>Success Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Success Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#getSuccessMessage()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_SuccessMessage();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancel Destination</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#getCancelDestination()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getCancelLabel <em>Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#getCancelLabel()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_CancelLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.EditUnit#getUnitInputGroupClass <em>Unit Input Group Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Input Group Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#getUnitInputGroupClass()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_UnitInputGroupClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.CreateUnit <em>Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateUnit
	 * @generated
	 */
	EClass getCreateUnit();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit <em>Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Update Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateUpdateUnit
	 * @generated
	 */
	EClass getCreateUpdateUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Save Continue Editing</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#isOnSaveContinueEditing()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_OnSaveContinueEditing();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getUpdateUriElement <em>Update Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getUpdateUriElement()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_UpdateUriElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getClearLabel()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_ClearLabel();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UpdateUnit <em>Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UpdateUnit
	 * @generated
	 */
	EClass getUpdateUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UpdateUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Save Continue Editing</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UpdateUnit#isOnSaveContinueEditing()
	 * @see #getUpdateUnit()
	 * @generated
	 */
	EAttribute getUpdateUnit_OnSaveContinueEditing();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UpdateUnit#isDisplayEmptyForm <em>Display Empty Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Empty Form</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UpdateUnit#isDisplayEmptyForm()
	 * @see #getUpdateUnit()
	 * @generated
	 */
	EAttribute getUpdateUnit_DisplayEmptyForm();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.MapUnit <em>Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MapUnit
	 * @generated
	 */
	EClass getMapUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.MapUnit#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MapUnit#isReadOnly()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Zoom Level</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MapUnit#getDefaultZoomLevel()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_DefaultZoomLevel();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.MapUnit#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MapUnit#getLocation()
	 * @see #getMapUnit()
	 * @generated
	 */
	EReference getMapUnit_Location();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.MapUnit#getPlaceName <em>Place Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.MapUnit#getPlaceName()
	 * @see #getMapUnit()
	 * @generated
	 */
	EReference getMapUnit_PlaceName();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DetailsUnit <em>Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DetailsUnit
	 * @generated
	 */
	EClass getDetailsUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.DetailsUnit#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DetailsUnit#getSelection()
	 * @see #getDetailsUnit()
	 * @generated
	 */
	EReference getDetailsUnit_Selection();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Field Labels</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DetailsUnit#isOmitFieldLabels()
	 * @see #getDetailsUnit()
	 * @generated
	 */
	EAttribute getDetailsUnit_OmitFieldLabels();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.TabularUnit <em>Tabular Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabular Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnit
	 * @generated
	 */
	EClass getTabularUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getHeaderClassOverride <em>Header Class Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class Override</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnit#getHeaderClassOverride()
	 * @see #getTabularUnit()
	 * @generated
	 */
	EAttribute getTabularUnit_HeaderClassOverride();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getFooterClassOverride <em>Footer Class Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class Override</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnit#getFooterClassOverride()
	 * @see #getTabularUnit()
	 * @generated
	 */
	EAttribute getTabularUnit_FooterClassOverride();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.TabularUnit#getRowClasses <em>Row Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Classes</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TabularUnit#getRowClasses()
	 * @see #getTabularUnit()
	 * @generated
	 */
	EAttribute getTabularUnit_RowClasses();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.CardsUnit <em>Cards Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cards Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit
	 * @generated
	 */
	EClass getCardsUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getBadges <em>Badges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Badges</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getBadges()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EReference getCardsUnit_Badges();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlay Single Select Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#isOverlaySingleSelectAction()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_OverlaySingleSelectAction();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalRowClass <em>Local Row Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Row Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalRowClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_LocalRowClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalColumnClass <em>Local Column Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Column Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalColumnClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_LocalColumnClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardClass <em>Local Card Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Card Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_LocalCardClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardHeaderClass <em>Local Card Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Card Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardHeaderClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_LocalCardHeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardBodyClass <em>Local Card Body Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Card Body Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardBodyClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_LocalCardBodyClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardFooterClass <em>Local Card Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Card Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardFooterClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_LocalCardFooterClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalBadgeClass <em>Local Badge Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Badge Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalBadgeClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_LocalBadgeClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.TextCardsUnit <em>Text Cards Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Cards Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TextCardsUnit
	 * @generated
	 */
	EClass getTextCardsUnit();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit <em>Date Cards Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Cards Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DateCardsUnit
	 * @generated
	 */
	EClass getDateCardsUnit();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit#getElementDate <em>Element Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Date</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DateCardsUnit#getElementDate()
	 * @see #getDateCardsUnit()
	 * @generated
	 */
	EReference getDateCardsUnit_ElementDate();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ControlUnit
	 * @generated
	 */
	EClass getControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getSubmitLabel <em>Submit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ControlUnit#getSubmitLabel()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_SubmitLabel();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancel Destination</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ControlUnit#getCancelDestination()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ControlUnit#getCancelLabel <em>Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Label</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ControlUnit#getCancelLabel()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_CancelLabel();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SearchUnit <em>Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SearchUnit
	 * @generated
	 */
	EClass getSearchUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.SearchUnit#getResultsDestination <em>Results Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results Destination</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SearchUnit#getResultsDestination()
	 * @see #getSearchUnit()
	 * @generated
	 */
	EReference getSearchUnit_ResultsDestination();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.RegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.RegistrationUnit
	 * @generated
	 */
	EClass getRegistrationUnit();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.LoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.LoginUnit
	 * @generated
	 */
	EClass getLoginUnit();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.LogoutUnit <em>Logout Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logout Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.LogoutUnit
	 * @generated
	 */
	EClass getLogoutUnit();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forgotten Password Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit
	 * @generated
	 */
	EClass getForgottenPasswordUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getResetPasswordUnit <em>Reset Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset Password Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getResetPasswordUnit()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EReference getForgottenPasswordUnit_ResetPasswordUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getUriEmailSent <em>Uri Email Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Email Sent</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getUriEmailSent()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EAttribute getForgottenPasswordUnit_UriEmailSent();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSubject <em>Email Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Subject</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSubject()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EAttribute getForgottenPasswordUnit_EmailSubject();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailMessage <em>Email Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailMessage()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EAttribute getForgottenPasswordUnit_EmailMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSentCaption <em>Email Sent Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Sent Caption</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSentCaption()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EAttribute getForgottenPasswordUnit_EmailSentCaption();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSentMessage <em>Email Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Sent Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit#getEmailSentMessage()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EAttribute getForgottenPasswordUnit_EmailSentMessage();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ResetPasswordUnit <em>Reset Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Password Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ResetPasswordUnit
	 * @generated
	 */
	EClass getResetPasswordUnit();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.Path#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Path#getContainingType()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_ContainingType();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.PathAssociation <em>Path Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation
	 * @generated
	 */
	EClass getPathAssociation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation#getAssociation()
	 * @see #getPathAssociation()
	 * @generated
	 */
	EReference getPathAssociation_Association();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation#getName()
	 * @see #getPathAssociation()
	 * @generated
	 */
	EAttribute getPathAssociation_Name();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getValueDisplay <em>Value Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Display</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation#getValueDisplay()
	 * @see #getPathAssociation()
	 * @generated
	 */
	EReference getPathAssociation_ValueDisplay();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation#getChildFeature()
	 * @see #getPathAssociation()
	 * @generated
	 */
	EReference getPathAssociation_ChildFeature();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation#isIsSourceAssociation()
	 * @see #getPathAssociation()
	 * @generated
	 */
	EAttribute getPathAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation#getSourceEntity()
	 * @see #getPathAssociation()
	 * @generated
	 */
	EReference getPathAssociation_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation#getTargetEntity()
	 * @see #getPathAssociation()
	 * @generated
	 */
	EReference getPathAssociation_TargetEntity();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.PathAttribute <em>Path Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAttribute
	 * @generated
	 */
	EClass getPathAttribute();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.PathAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAttribute#getAttribute()
	 * @see #getPathAttribute()
	 * @generated
	 */
	EReference getPathAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.PathAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathAttribute#getName()
	 * @see #getPathAttribute()
	 * @generated
	 */
	EAttribute getPathAttribute_Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.PathResource <em>Path Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathResource
	 * @generated
	 */
	EClass getPathResource();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.PathResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathResource#getResource()
	 * @see #getPathResource()
	 * @generated
	 */
	EReference getPathResource_Resource();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.PathResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PathResource#getName()
	 * @see #getPathResource()
	 * @generated
	 */
	EAttribute getPathResource_Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ChildPath <em>Child Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Path</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPath
	 * @generated
	 */
	EClass getChildPath();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.ChildPath#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPath#getParent()
	 * @see #getChildPath()
	 * @generated
	 */
	EReference getChildPath_Parent();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ActionContainer <em>Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Container</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionContainer
	 * @generated
	 */
	EClass getActionContainer();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getContainerActionsPlacement <em>Container Actions Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Actions Placement</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionContainer#getContainerActionsPlacement()
	 * @see #getActionContainer()
	 * @generated
	 */
	EAttribute getActionContainer_ContainerActionsPlacement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getInstanceActionsPlacement <em>Instance Actions Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Actions Placement</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionContainer#getInstanceActionsPlacement()
	 * @see #getActionContainer()
	 * @generated
	 */
	EAttribute getActionContainer_InstanceActionsPlacement();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionContainer#getActions()
	 * @see #getActionContainer()
	 * @generated
	 */
	EReference getActionContainer_Actions();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getActionNavigationClass <em>Action Navigation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Navigation Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionContainer#getActionNavigationClass()
	 * @see #getActionContainer()
	 * @generated
	 */
	EAttribute getActionContainer_ActionNavigationClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ImageUnit <em>Image Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageUnit
	 * @generated
	 */
	EClass getImageUnit();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Path Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageUnit#getImagePathFeature()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_ImagePathFeature();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getImageFilter <em>Image Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image Filter</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageUnit#getImageFilter()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_ImageFilter();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing Image Path</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageUnit#getMissingImagePath()
	 * @see #getImageUnit()
	 * @generated
	 */
	EAttribute getImageUnit_MissingImagePath();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getShowMissingImageWhen <em>Show Missing Image When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Show Missing Image When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageUnit#getShowMissingImageWhen()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_ShowMissingImageWhen();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit <em>Image Cards Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Cards Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageCardsUnit
	 * @generated
	 */
	EClass getImageCardsUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isOverlayTitle <em>Overlay Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlay Title</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isOverlayTitle()
	 * @see #getImageCardsUnit()
	 * @generated
	 */
	EAttribute getImageCardsUnit_OverlayTitle();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isEnableImageEnlargement <em>Enable Image Enlargement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Image Enlargement</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isEnableImageEnlargement()
	 * @see #getImageCardsUnit()
	 * @generated
	 */
	EAttribute getImageCardsUnit_EnableImageEnlargement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reveal Untruncated Content</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isRevealUntruncatedContent()
	 * @see #getImageCardsUnit()
	 * @generated
	 */
	EAttribute getImageCardsUnit_RevealUntruncatedContent();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SliderUnit <em>Slider Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SliderUnit
	 * @generated
	 */
	EClass getSliderUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.SliderUnit#getShowTime <em>Show Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Time</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SliderUnit#getShowTime()
	 * @see #getSliderUnit()
	 * @generated
	 */
	EAttribute getSliderUnit_ShowTime();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.SliderUnit#getTransitionTime <em>Transition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Time</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SliderUnit#getTransitionTime()
	 * @see #getSliderUnit()
	 * @generated
	 */
	EAttribute getSliderUnit_TransitionTime();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit <em>Gallery Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gallery Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.GalleryUnit
	 * @generated
	 */
	EClass getGalleryUnit();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Full Size Filter</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.GalleryUnit#getFullSizeFilter()
	 * @see #getGalleryUnit()
	 * @generated
	 */
	EReference getGalleryUnit_FullSizeFilter();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getShowTime <em>Show Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Time</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.GalleryUnit#getShowTime()
	 * @see #getGalleryUnit()
	 * @generated
	 */
	EAttribute getGalleryUnit_ShowTime();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getTransitionTime <em>Transition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Time</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.GalleryUnit#getTransitionTime()
	 * @see #getGalleryUnit()
	 * @generated
	 */
	EAttribute getGalleryUnit_TransitionTime();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.Action#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Used By</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getUsedBy()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_UsedBy();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.Action#getParentUnit <em>Parent Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getParentUnit()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ParentUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Action#getIconName <em>Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getIconName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_IconName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Action#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#isDisable()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Disable();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.Action#getDisplayWhen <em>Display When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getDisplayWhen()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_DisplayWhen();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.Action#getEnableWhen <em>Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getEnableWhen()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_EnableWhen();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Action#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getConfirmMessage()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ConfirmMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Action#getSuccessMessage <em>Success Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getSuccessMessage()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_SuccessMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Action#getFailureMessage <em>Failure Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getFailureMessage()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_FailureMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Action#getAnchorClass <em>Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getAnchorClass()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_AnchorClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Action#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getHeaderClass()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Action#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getFooterClass()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_FooterClass();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.Action#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Action#getContainingType()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ContainingType();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SecurityAction <em>Security Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SecurityAction
	 * @generated
	 */
	EClass getSecurityAction();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.SecurityAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SecurityAction#getTarget()
	 * @see #getSecurityAction()
	 * @generated
	 */
	EReference getSecurityAction_Target();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.OperationAction <em>Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.OperationAction
	 * @generated
	 */
	EClass getOperationAction();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.OperationAction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.OperationAction#getOperation()
	 * @see #getOperationAction()
	 * @generated
	 */
	EReference getOperationAction_Operation();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.OperationAction#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.OperationAction#getRequiresRole()
	 * @see #getOperationAction()
	 * @generated
	 */
	EAttribute getOperationAction_RequiresRole();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.OperationAction#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.OperationAction#getUriElement()
	 * @see #getOperationAction()
	 * @generated
	 */
	EAttribute getOperationAction_UriElement();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.InstanceOperationAction <em>Instance Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Operation Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InstanceOperationAction
	 * @generated
	 */
	EClass getInstanceOperationAction();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ContainerOperationAction <em>Container Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Operation Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContainerOperationAction
	 * @generated
	 */
	EClass getContainerOperationAction();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.GeneralOperationAction <em>General Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Operation Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.GeneralOperationAction
	 * @generated
	 */
	EClass getGeneralOperationAction();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Message#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Message#getText()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.Message#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Message#getFeatures()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Features();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement <em>Authentication Menu Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Menu Placement</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement
	 * @generated
	 */
	EEnum getAuthenticationMenuPlacement();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.SelectAction <em>Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SelectAction
	 * @generated
	 */
	EClass getSelectAction();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.SelectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SelectAction#getTarget()
	 * @see #getSelectAction()
	 * @generated
	 */
	EReference getSelectAction_Target();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.SelectAction#getValuePath <em>Value Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Path</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SelectAction#getValuePath()
	 * @see #getSelectAction()
	 * @generated
	 */
	EReference getSelectAction_ValuePath();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.ContainerSelectAction <em>Container Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Select Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContainerSelectAction
	 * @generated
	 */
	EClass getContainerSelectAction();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.InstanceSelectAction <em>Instance Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Select Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InstanceSelectAction
	 * @generated
	 */
	EClass getInstanceSelectAction();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.TargetAction <em>Target Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.TargetAction
	 * @generated
	 */
	EClass getTargetAction();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DeleteAction
	 * @generated
	 */
	EClass getDeleteAction();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DeleteAction#getRequiresRole()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_RequiresRole();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DeleteAction#getUriElement()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_UriElement();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Badge
	 * @generated
	 */
	EClass getBadge();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.Badge#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Badge#getDisplayedOn()
	 * @see #getBadge()
	 * @generated
	 */
	EReference getBadge_DisplayedOn();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Badge#getIconName <em>Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Badge#getIconName()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_IconName();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.Badge#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Badge#getValue()
	 * @see #getBadge()
	 * @generated
	 */
	EReference getBadge_Value();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.Badge#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Badge#getTitle()
	 * @see #getBadge()
	 * @generated
	 */
	EReference getBadge_Title();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.Badge#getDisplayWhen <em>Display When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Badge#getDisplayWhen()
	 * @see #getBadge()
	 * @generated
	 */
	EReference getBadge_DisplayWhen();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Badge#getLocalBadgeClass <em>Local Badge Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Badge Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Badge#getLocalBadgeClass()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_LocalBadgeClass();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.PageTopMenuOptions <em>Page Top Menu Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Page Top Menu Options</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PageTopMenuOptions
	 * @generated
	 */
	EEnum getPageTopMenuOptions();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions <em>Collection Display Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Display Options</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions
	 * @generated
	 */
	EEnum getCollectionDisplayOptions();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.PaginationControlPlacements <em>Pagination Control Placements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pagination Control Placements</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PaginationControlPlacements
	 * @generated
	 */
	EEnum getPaginationControlPlacements();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement <em>Container Actions Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Actions Placement</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement
	 * @generated
	 */
	EEnum getContainerActionsPlacement();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement <em>Instance Actions Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Actions Placement</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement
	 * @generated
	 */
	EEnum getInstanceActionsPlacement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebuiFactory getWebuiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl <em>Web UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebUIImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getWebUI()
		 * @generated
		 */
		EClass WEB_UI = eINSTANCE.getWebUI();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__PERSISTENCE = eINSTANCE.getWebUI_Persistence();

		/**
		 * The meta object literal for the '<em><b>Navigation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__NAVIGATION = eINSTANCE.getWebUI_Navigation();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__SERVICES = eINSTANCE.getWebUI_Services();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__CONTROLLERS = eINSTANCE.getWebUI_Controllers();

		/**
		 * The meta object literal for the '<em><b>Use Form Floating Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__USE_FORM_FLOATING_LABELS = eINSTANCE.getWebUI_UseFormFloatingLabels();

		/**
		 * The meta object literal for the '<em><b>Default Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_DATE_FORMAT = eINSTANCE.getWebUI_DefaultDateFormat();

		/**
		 * The meta object literal for the '<em><b>Default Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_TIME_FORMAT = eINSTANCE.getWebUI_DefaultTimeFormat();

		/**
		 * The meta object literal for the '<em><b>Default Date Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_DATE_TIME_FORMAT = eINSTANCE.getWebUI_DefaultDateTimeFormat();

		/**
		 * The meta object literal for the '<em><b>Default Save Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_SAVE_LABEL = eINSTANCE.getWebUI_DefaultSaveLabel();

		/**
		 * The meta object literal for the '<em><b>Default Page Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_PAGE_STYLE_CLASS = eINSTANCE.getWebUI_DefaultPageStyleClass();

		/**
		 * The meta object literal for the '<em><b>Default Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__DEFAULT_STYLES = eINSTANCE.getWebUI_DefaultStyles();

		/**
		 * The meta object literal for the '<em><b>Default Cards Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__DEFAULT_CARDS_STYLES = eINSTANCE.getWebUI_DefaultCardsStyles();

		/**
		 * The meta object literal for the '<em><b>Default Details Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__DEFAULT_DETAILS_STYLES = eINSTANCE.getWebUI_DefaultDetailsStyles();

		/**
		 * The meta object literal for the '<em><b>Default Form Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__DEFAULT_FORM_STYLES = eINSTANCE.getWebUI_DefaultFormStyles();

		/**
		 * The meta object literal for the '<em><b>Default Gallery Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__DEFAULT_GALLERY_STYLES = eINSTANCE.getWebUI_DefaultGalleryStyles();

		/**
		 * The meta object literal for the '<em><b>Default Slider Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__DEFAULT_SLIDER_STYLES = eINSTANCE.getWebUI_DefaultSliderStyles();

		/**
		 * The meta object literal for the '<em><b>Default Static Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__DEFAULT_STATIC_STYLES = eINSTANCE.getWebUI_DefaultStaticStyles();

		/**
		 * The meta object literal for the '<em><b>Default Tabular Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__DEFAULT_TABULAR_STYLES = eINSTANCE.getWebUI_DefaultTabularStyles();

		/**
		 * The meta object literal for the '<em><b>Default Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_CANCEL_LABEL = eINSTANCE.getWebUI_DefaultCancelLabel();

		/**
		 * The meta object literal for the '<em><b>Default Maximum Upload Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE = eINSTANCE.getWebUI_DefaultMaximumUploadSize();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.NavigationImpl <em>Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.NavigationImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getNavigation()
		 * @generated
		 */
		EClass NAVIGATION = eINSTANCE.getNavigation();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__PART_OF = eINSTANCE.getNavigation_PartOf();

		/**
		 * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__MENUS = eINSTANCE.getNavigation_Menus();

		/**
		 * The meta object literal for the '<em><b>Navbar Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION__NAVBAR_CLASS = eINSTANCE.getNavigation_NavbarClass();

		/**
		 * The meta object literal for the '<em><b>Authentication Menu Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION__AUTHENTICATION_MENU_PLACEMENT = eINSTANCE.getNavigation_AuthenticationMenuPlacement();

		/**
		 * The meta object literal for the '<em><b>Authentication Bar Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION__AUTHENTICATION_BAR_CLASS = eINSTANCE.getNavigation_AuthenticationBarClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.MenuImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ENTRIES = eINSTANCE.getMenu_Entries();

		/**
		 * The meta object literal for the '<em><b>Omit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__OMIT_CAPTION = eINSTANCE.getMenu_OmitCaption();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__CAPTION_CLASS = eINSTANCE.getMenu_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__STYLE_CLASS = eINSTANCE.getMenu_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Layout Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__LAYOUT_CLASS = eINSTANCE.getMenu_LayoutClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.MenuEntryImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMenuEntry()
		 * @generated
		 */
		EClass MENU_ENTRY = eINSTANCE.getMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ENTRY__PART_OF = eINSTANCE.getMenuEntry_PartOf();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.SubmenuEntryImpl <em>Submenu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.SubmenuEntryImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSubmenuEntry()
		 * @generated
		 */
		EClass SUBMENU_ENTRY = eINSTANCE.getSubmenuEntry();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMENU_ENTRY__REQUIRES_ROLE = eINSTANCE.getSubmenuEntry_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Always Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMENU_ENTRY__ALWAYS_VISIBLE = eINSTANCE.getSubmenuEntry_AlwaysVisible();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ActionMenuEntryImpl <em>Action Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ActionMenuEntryImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getActionMenuEntry()
		 * @generated
		 */
		EClass ACTION_MENU_ENTRY = eINSTANCE.getActionMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MENU_ENTRY__DESTINATION = eINSTANCE.getActionMenuEntry_Destination();

		/**
		 * The meta object literal for the '<em><b>Always Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_MENU_ENTRY__ALWAYS_VISIBLE = eINSTANCE.getActionMenuEntry_AlwaysVisible();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.EditStaticTextMenuEntryImpl <em>Edit Static Text Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.EditStaticTextMenuEntryImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getEditStaticTextMenuEntry()
		 * @generated
		 */
		EClass EDIT_STATIC_TEXT_MENU_ENTRY = eINSTANCE.getEditStaticTextMenuEntry();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.MenuFeatureImpl <em>Menu Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.MenuFeatureImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMenuFeature()
		 * @generated
		 */
		EClass MENU_FEATURE = eINSTANCE.getMenuFeature();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitStylesImpl <em>Content Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ContentUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContentUnitStyles()
		 * @generated
		 */
		EClass CONTENT_UNIT_STYLES = eINSTANCE.getContentUnitStyles();

		/**
		 * The meta object literal for the '<em><b>Section Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT_STYLES__SECTION_CLASS = eINSTANCE.getContentUnitStyles_SectionClass();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT_STYLES__CAPTION_CLASS = eINSTANCE.getContentUnitStyles_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT_STYLES__CONTENT_CLASS = eINSTANCE.getContentUnitStyles_ContentClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl <em>Dynamic Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDynamicUnitStyles()
		 * @generated
		 */
		EClass DYNAMIC_UNIT_STYLES = eINSTANCE.getDynamicUnitStyles();

		/**
		 * The meta object literal for the '<em><b>Field List Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS = eINSTANCE.getDynamicUnitStyles_FieldListClass();

		/**
		 * The meta object literal for the '<em><b>Definition Field List Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS = eINSTANCE.getDynamicUnitStyles_DefinitionFieldListClass();

		/**
		 * The meta object literal for the '<em><b>Field Label Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS = eINSTANCE.getDynamicUnitStyles_FieldLabelClass();

		/**
		 * The meta object literal for the '<em><b>Field Value Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS = eINSTANCE.getDynamicUnitStyles_FieldValueClass();

		/**
		 * The meta object literal for the '<em><b>Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT_STYLES__CONTROL_CLASS = eINSTANCE.getDynamicUnitStyles_ControlClass();

		/**
		 * The meta object literal for the '<em><b>Action Navigation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS = eINSTANCE.getDynamicUnitStyles_ActionNavigationClass();

		/**
		 * The meta object literal for the '<em><b>Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT_STYLES__ANCHOR_CLASS = eINSTANCE.getDynamicUnitStyles_AnchorClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DefaultUnitStylesImpl <em>Default Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DefaultUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDefaultUnitStyles()
		 * @generated
		 */
		EClass DEFAULT_UNIT_STYLES = eINSTANCE.getDefaultUnitStyles();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitStylesImpl <em>Collection Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.CollectionUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCollectionUnitStyles()
		 * @generated
		 */
		EClass COLLECTION_UNIT_STYLES = eINSTANCE.getCollectionUnitStyles();

		/**
		 * The meta object literal for the '<em><b>Instance Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS = eINSTANCE.getCollectionUnitStyles_InstanceControlClass();

		/**
		 * The meta object literal for the '<em><b>Instance Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS = eINSTANCE.getCollectionUnitStyles_InstanceAnchorClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl <em>Cards Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCardsUnitStyles()
		 * @generated
		 */
		EClass CARDS_UNIT_STYLES = eINSTANCE.getCardsUnitStyles();

		/**
		 * The meta object literal for the '<em><b>Row Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT_STYLES__ROW_CLASS = eINSTANCE.getCardsUnitStyles_RowClass();

		/**
		 * The meta object literal for the '<em><b>Column Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT_STYLES__COLUMN_CLASS = eINSTANCE.getCardsUnitStyles_ColumnClass();

		/**
		 * The meta object literal for the '<em><b>Card Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT_STYLES__CARD_CLASS = eINSTANCE.getCardsUnitStyles_CardClass();

		/**
		 * The meta object literal for the '<em><b>Card Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT_STYLES__CARD_HEADER_CLASS = eINSTANCE.getCardsUnitStyles_CardHeaderClass();

		/**
		 * The meta object literal for the '<em><b>Card Body Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT_STYLES__CARD_BODY_CLASS = eINSTANCE.getCardsUnitStyles_CardBodyClass();

		/**
		 * The meta object literal for the '<em><b>Card Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT_STYLES__CARD_FOOTER_CLASS = eINSTANCE.getCardsUnitStyles_CardFooterClass();

		/**
		 * The meta object literal for the '<em><b>Badge Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT_STYLES__BADGE_CLASS = eINSTANCE.getCardsUnitStyles_BadgeClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DetailsUnitStylesImpl <em>Details Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DetailsUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDetailsUnitStyles()
		 * @generated
		 */
		EClass DETAILS_UNIT_STYLES = eINSTANCE.getDetailsUnitStyles();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.FormUnitStylesImpl <em>Form Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.FormUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFormUnitStyles()
		 * @generated
		 */
		EClass FORM_UNIT_STYLES = eINSTANCE.getFormUnitStyles();

		/**
		 * The meta object literal for the '<em><b>Input Group Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_UNIT_STYLES__INPUT_GROUP_CLASS = eINSTANCE.getFormUnitStyles_InputGroupClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.GalleryUnitStylesImpl <em>Gallery Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.GalleryUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getGalleryUnitStyles()
		 * @generated
		 */
		EClass GALLERY_UNIT_STYLES = eINSTANCE.getGalleryUnitStyles();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.SliderUnitStylesImpl <em>Slider Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.SliderUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSliderUnitStyles()
		 * @generated
		 */
		EClass SLIDER_UNIT_STYLES = eINSTANCE.getSliderUnitStyles();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.StaticUnitStylesImpl <em>Static Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.StaticUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getStaticUnitStyles()
		 * @generated
		 */
		EClass STATIC_UNIT_STYLES = eINSTANCE.getStaticUnitStyles();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.TabularUnitStylesImpl <em>Tabular Unit Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.TabularUnitStylesImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getTabularUnitStyles()
		 * @generated
		 */
		EClass TABULAR_UNIT_STYLES = eINSTANCE.getTabularUnitStyles();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABULAR_UNIT_STYLES__HEADER_CLASS = eINSTANCE.getTabularUnitStyles_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABULAR_UNIT_STYLES__FOOTER_CLASS = eINSTANCE.getTabularUnitStyles_FooterClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ControllerImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Web UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__WEB_UI = eINSTANCE.getController_WebUI();

		/**
		 * The meta object literal for the '<em><b>Parent Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__PARENT_CONTROLLER = eINSTANCE.getController_ParentController();

		/**
		 * The meta object literal for the '<em><b>Child Controllers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CHILD_CONTROLLERS = eINSTANCE.getController_ChildControllers();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__UNITS = eINSTANCE.getController_Units();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__URI_ELEMENT = eINSTANCE.getController_UriElement();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__STYLE_CLASS = eINSTANCE.getController_StyleClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ControllerLinkImpl <em>Controller Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ControllerLinkImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getControllerLink()
		 * @generated
		 */
		EClass CONTROLLER_LINK = eINSTANCE.getControllerLink();

		/**
		 * The meta object literal for the '<em><b>Target Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_LINK__TARGET_CONTROLLER = eINSTANCE.getControllerLink_TargetController();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.SinglePageControllerImpl <em>Single Page Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.SinglePageControllerImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSinglePageController()
		 * @generated
		 */
		EClass SINGLE_PAGE_CONTROLLER = eINSTANCE.getSinglePageController();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.MultiPageControllerImpl <em>Multi Page Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.MultiPageControllerImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMultiPageController()
		 * @generated
		 */
		EClass MULTI_PAGE_CONTROLLER = eINSTANCE.getMultiPageController();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl <em>Content Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContentUnit()
		 * @generated
		 */
		EClass CONTENT_UNIT = eINSTANCE.getContentUnit();

		/**
		 * The meta object literal for the '<em><b>Create Default Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT = eINSTANCE.getContentUnit_CreateDefaultUriElement();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__REQUIRES_ROLE = eINSTANCE.getContentUnit_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Purpose Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__PURPOSE_SUMMARY = eINSTANCE.getContentUnit_PurposeSummary();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__URI_ELEMENT = eINSTANCE.getContentUnit_UriElement();

		/**
		 * The meta object literal for the '<em><b>Uri Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__URI_PARENT = eINSTANCE.getContentUnit_UriParent();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__ALTERNATIVE = eINSTANCE.getContentUnit_Alternative();

		/**
		 * The meta object literal for the '<em><b>Section Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__SECTION_CLASS = eINSTANCE.getContentUnit_SectionClass();

		/**
		 * The meta object literal for the '<em><b>Omit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__OMIT_CAPTION = eINSTANCE.getContentUnit_OmitCaption();

		/**
		 * The meta object literal for the '<em><b>Local Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__LOCAL_CAPTION_CLASS = eINSTANCE.getContentUnit_LocalCaptionClass();

		/**
		 * The meta object literal for the '<em><b>Local Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__LOCAL_CONTENT_CLASS = eINSTANCE.getContentUnit_LocalContentClass();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__CONTROLLER = eINSTANCE.getContentUnit_Controller();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.RouteActualImpl <em>Route Actual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.RouteActualImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getRouteActual()
		 * @generated
		 */
		EClass ROUTE_ACTUAL = eINSTANCE.getRouteActual();

		/**
		 * The meta object literal for the '<em><b>Actual For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ACTUAL__ACTUAL_FOR = eINSTANCE.getRouteActual_ActualFor();

		/**
		 * The meta object literal for the '<em><b>Route Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ACTUAL__ROUTE_PARAMETER = eINSTANCE.getRouteActual_RouteParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ACTUAL__VALUE = eINSTANCE.getRouteActual_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.StaticUnitImpl <em>Static Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.StaticUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getStaticUnit()
		 * @generated
		 */
		EClass STATIC_UNIT = eINSTANCE.getStaticUnit();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_UNIT__CONTENT = eINSTANCE.getStaticUnit_Content();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.CreateSitemapUnitImpl <em>Create Sitemap Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.CreateSitemapUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCreateSitemapUnit()
		 * @generated
		 */
		EClass CREATE_SITEMAP_UNIT = eINSTANCE.getCreateSitemapUnit();

		/**
		 * The meta object literal for the '<em><b>Deployed URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SITEMAP_UNIT__DEPLOYED_URL = eINSTANCE.getCreateSitemapUnit_DeployedURL();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SITEMAP_UNIT__FILENAME = eINSTANCE.getCreateSitemapUnit_Filename();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl <em>Dynamic Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDynamicUnit()
		 * @generated
		 */
		EClass DYNAMIC_UNIT = eINSTANCE.getDynamicUnit();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__CONTENT_TYPE = eINSTANCE.getDynamicUnit_ContentType();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__CONTAINING_TYPE = eINSTANCE.getDynamicUnit_ContainingType();

		/**
		 * The meta object literal for the '<em><b>Route Actuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__ROUTE_ACTUALS = eINSTANCE.getDynamicUnit_RouteActuals();

		/**
		 * The meta object literal for the '<em><b>Display Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__DISPLAY_FIELDS = eINSTANCE.getDynamicUnit_DisplayFields();

		/**
		 * The meta object literal for the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS = eINSTANCE.getDynamicUnit_HasWhenFieldsEmptyAddImplicitFields();

		/**
		 * The meta object literal for the '<em><b>Hide When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__HIDE_WHEN = eINSTANCE.getDynamicUnit_HideWhen();

		/**
		 * The meta object literal for the '<em><b>Message When Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN = eINSTANCE.getDynamicUnit_MessageWhenHidden();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HEADER = eINSTANCE.getDynamicUnit_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FOOTER = eINSTANCE.getDynamicUnit_Footer();

		/**
		 * The meta object literal for the '<em><b>Local Field List Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS = eINSTANCE.getDynamicUnit_LocalFieldListClass();

		/**
		 * The meta object literal for the '<em><b>Local Field Label Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS = eINSTANCE.getDynamicUnit_LocalFieldLabelClass();

		/**
		 * The meta object literal for the '<em><b>Local Field Value Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS = eINSTANCE.getDynamicUnit_LocalFieldValueClass();

		/**
		 * The meta object literal for the '<em><b>Local Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__LOCAL_CONTROL_CLASS = eINSTANCE.getDynamicUnit_LocalControlClass();

		/**
		 * The meta object literal for the '<em><b>Local Instance Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS = eINSTANCE.getDynamicUnit_LocalInstanceControlClass();

		/**
		 * The meta object literal for the '<em><b>Local Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS = eINSTANCE.getDynamicUnit_LocalAnchorClass();

		/**
		 * The meta object literal for the '<em><b>Local Instance Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS = eINSTANCE.getDynamicUnit_LocalInstanceAnchorClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl <em>Unit Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitField()
		 * @generated
		 */
		EClass UNIT_FIELD = eINSTANCE.getUnitField();

		/**
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FIELD__DISPLAYED_ON = eINSTANCE.getUnitField_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__REQUIRES_ROLE = eINSTANCE.getUnitField_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Hide When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FIELD__HIDE_WHEN = eINSTANCE.getUnitField_HideWhen();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__TITLE = eINSTANCE.getUnitField_Title();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__HELP = eINSTANCE.getUnitField_Help();

		/**
		 * The meta object literal for the '<em><b>Escape HTML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__ESCAPE_HTML = eINSTANCE.getUnitField_EscapeHTML();

		/**
		 * The meta object literal for the '<em><b>Collection Display Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__COLLECTION_DISPLAY_OPTION = eINSTANCE.getUnitField_CollectionDisplayOption();

		/**
		 * The meta object literal for the '<em><b>Truncate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__TRUNCATE = eINSTANCE.getUnitField_Truncate();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__DATE_FORMAT = eINSTANCE.getUnitField_DateFormat();

		/**
		 * The meta object literal for the '<em><b>Disable Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__DISABLE_INPUT = eINSTANCE.getUnitField_DisableInput();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl <em>Unit Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitFeature()
		 * @generated
		 */
		EClass UNIT_FEATURE = eINSTANCE.getUnitFeature();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__DISPLAY_LABEL = eINSTANCE.getUnitFeature_DisplayLabel();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__REQUIRED = eINSTANCE.getUnitFeature_Required();

		/**
		 * The meta object literal for the '<em><b>Forced Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FEATURE__FORCED_VALUE = eINSTANCE.getUnitFeature_ForcedValue();

		/**
		 * The meta object literal for the '<em><b>Collection Ui Allow Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD = eINSTANCE.getUnitFeature_CollectionUiAllowAdd();

		/**
		 * The meta object literal for the '<em><b>Collection Ui Allow Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE = eINSTANCE.getUnitFeature_CollectionUiAllowRemove();

		/**
		 * The meta object literal for the '<em><b>Collection Maximum Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES = eINSTANCE.getUnitFeature_CollectionMaximumValues();

		/**
		 * The meta object literal for the '<em><b>Default Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__DEFAULT_DISPLAY_VALUE = eINSTANCE.getUnitFeature_DefaultDisplayValue();

		/**
		 * The meta object literal for the '<em><b>Display Default When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FEATURE__DISPLAY_DEFAULT_WHEN = eINSTANCE.getUnitFeature_DisplayDefaultWhen();

		/**
		 * The meta object literal for the '<em><b>Empty Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__EMPTY_DISPLAY_VALUE = eINSTANCE.getUnitFeature_EmptyDisplayValue();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__FOOTER = eINSTANCE.getUnitFeature_Footer();

		/**
		 * The meta object literal for the '<em><b>Autofocus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__AUTOFOCUS = eINSTANCE.getUnitFeature_Autofocus();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__HEADER_CLASS = eINSTANCE.getUnitFeature_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Field Label Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__FIELD_LABEL_CLASS = eINSTANCE.getUnitFeature_FieldLabelClass();

		/**
		 * The meta object literal for the '<em><b>Field Value Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__FIELD_VALUE_CLASS = eINSTANCE.getUnitFeature_FieldValueClass();

		/**
		 * The meta object literal for the '<em><b>Input Group Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__INPUT_GROUP_CLASS = eINSTANCE.getUnitFeature_InputGroupClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__FOOTER_CLASS = eINSTANCE.getUnitFeature_FooterClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitElementImpl <em>Unit Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UnitElementImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitElement()
		 * @generated
		 */
		EClass UNIT_ELEMENT = eINSTANCE.getUnitElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ELEMENT__ATTRIBUTE = eINSTANCE.getUnitElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__NAME = eINSTANCE.getUnitElement_Name();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ELEMENT__DEFAULT_VALUE = eINSTANCE.getUnitElement_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS = eINSTANCE.getUnitElement_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__PLACEHOLDER = eINSTANCE.getUnitElement_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__VALIDATION_PATTERN = eINSTANCE.getUnitElement_ValidationPattern();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl <em>Unit Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitResource()
		 * @generated
		 */
		EClass UNIT_RESOURCE = eINSTANCE.getUnitResource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_RESOURCE__RESOURCE = eINSTANCE.getUnitResource_Resource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_RESOURCE__NAME = eINSTANCE.getUnitResource_Name();

		/**
		 * The meta object literal for the '<em><b>Is Deletable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_RESOURCE__IS_DELETABLE = eINSTANCE.getUnitResource_IsDeletable();

		/**
		 * The meta object literal for the '<em><b>Is Downloadable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_RESOURCE__IS_DOWNLOADABLE = eINSTANCE.getUnitResource_IsDownloadable();

		/**
		 * The meta object literal for the '<em><b>Show Image When Editing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_RESOURCE__SHOW_IMAGE_WHEN_EDITING = eINSTANCE.getUnitResource_ShowImageWhenEditing();

		/**
		 * The meta object literal for the '<em><b>Image Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_RESOURCE__IMAGE_FILTER = eINSTANCE.getUnitResource_ImageFilter();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitAssociation()
		 * @generated
		 */
		EClass UNIT_ASSOCIATION = eINSTANCE.getUnitAssociation();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__OPTIONS = eINSTANCE.getUnitAssociation_Options();

		/**
		 * The meta object literal for the '<em><b>Collection Sort By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__COLLECTION_SORT_BY = eINSTANCE.getUnitAssociation_CollectionSortBy();

		/**
		 * The meta object literal for the '<em><b>Use Autocomplete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ASSOCIATION__USE_AUTOCOMPLETE = eINSTANCE.getUnitAssociation_UseAutocomplete();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAttributeImpl <em>Child Path Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathAttributeImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPathAttribute()
		 * @generated
		 */
		EClass CHILD_PATH_ATTRIBUTE = eINSTANCE.getChildPathAttribute();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathResourceImpl <em>Child Path Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathResourceImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPathResource()
		 * @generated
		 */
		EClass CHILD_PATH_RESOURCE = eINSTANCE.getChildPathResource();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl <em>Child Path Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPathAssociation()
		 * @generated
		 */
		EClass CHILD_PATH_ASSOCIATION = eINSTANCE.getChildPathAssociation();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl <em>Feature Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePath()
		 * @generated
		 */
		EClass FEATURE_PATH = eINSTANCE.getFeaturePath();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathAttributeImpl <em>Feature Path Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathAttributeImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathAttribute()
		 * @generated
		 */
		EClass FEATURE_PATH_ATTRIBUTE = eINSTANCE.getFeaturePathAttribute();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathLabelImpl <em>Feature Path Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathLabelImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathLabel()
		 * @generated
		 */
		EClass FEATURE_PATH_LABEL = eINSTANCE.getFeaturePathLabel();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_LABEL__LABEL = eINSTANCE.getFeaturePathLabel_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATH_LABEL__NAME = eINSTANCE.getFeaturePathLabel_Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathResourceImpl <em>Feature Path Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathResourceImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathResource()
		 * @generated
		 */
		EClass FEATURE_PATH_RESOURCE = eINSTANCE.getFeaturePathResource();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableImpl <em>Path Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PathVariableImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathVariable()
		 * @generated
		 */
		EClass PATH_VARIABLE = eINSTANCE.getPathVariable();

		/**
		 * The meta object literal for the '<em><b>Use Container As Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT = eINSTANCE.getPathVariable_UseContainerAsContext();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_VARIABLE__CONTEXT = eINSTANCE.getPathVariable_Context();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableAssociationImpl <em>Path Variable Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PathVariableAssociationImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathVariableAssociation()
		 * @generated
		 */
		EClass PATH_VARIABLE_ASSOCIATION = eINSTANCE.getPathVariableAssociation();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableAttributeImpl <em>Path Variable Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PathVariableAttributeImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathVariableAttribute()
		 * @generated
		 */
		EClass PATH_VARIABLE_ATTRIBUTE = eINSTANCE.getPathVariableAttribute();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableResourceImpl <em>Path Variable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PathVariableResourceImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathVariableResource()
		 * @generated
		 */
		EClass PATH_VARIABLE_RESOURCE = eINSTANCE.getPathVariableResource();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathAssociationImpl <em>Feature Path Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathAssociationImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathAssociation()
		 * @generated
		 */
		EClass FEATURE_PATH_ASSOCIATION = eINSTANCE.getFeaturePathAssociation();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitLabelImpl <em>Unit Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UnitLabelImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitLabel()
		 * @generated
		 */
		EClass UNIT_LABEL = eINSTANCE.getUnitLabel();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_LABEL__LABEL = eINSTANCE.getUnitLabel_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_LABEL__NAME = eINSTANCE.getUnitLabel_Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl <em>Interface Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInterfaceField()
		 * @generated
		 */
		EClass INTERFACE_FIELD = eINSTANCE.getInterfaceField();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__REQUIRED = eINSTANCE.getInterfaceField_Required();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__DEFAULT_VALUE = eINSTANCE.getInterfaceField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__PLACEHOLDER = eINSTANCE.getInterfaceField_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Repeated Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__REPEATED_FIELD = eINSTANCE.getInterfaceField_RepeatedField();

		/**
		 * The meta object literal for the '<em><b>Second Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__SECOND_DISPLAY_LABEL = eINSTANCE.getInterfaceField_SecondDisplayLabel();

		/**
		 * The meta object literal for the '<em><b>Second Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__SECOND_TITLE = eINSTANCE.getInterfaceField_SecondTitle();

		/**
		 * The meta object literal for the '<em><b>Second Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__SECOND_PLACEHOLDER = eINSTANCE.getInterfaceField_SecondPlaceholder();

		/**
		 * The meta object literal for the '<em><b>Second Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__SECOND_HELP = eINSTANCE.getInterfaceField_SecondHelp();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__VALIDATION_PATTERN = eINSTANCE.getInterfaceField_ValidationPattern();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DataTypeFieldImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDataTypeField()
		 * @generated
		 */
		EClass DATA_TYPE_FIELD = eINSTANCE.getDataTypeField();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FIELD__DATA_TYPE = eINSTANCE.getDataTypeField_DataType();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS = eINSTANCE.getDataTypeField_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__ENCRYPT = eINSTANCE.getDataTypeField_Encrypt();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__INTERFACE_TYPE = eINSTANCE.getDataTypeField_InterfaceType();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DateFieldImpl <em>Date Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DateFieldImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDateField()
		 * @generated
		 */
		EClass DATE_FIELD = eINSTANCE.getDateField();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__DETAILS = eINSTANCE.getDateField_Details();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__FORMAT = eINSTANCE.getDateField_Format();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.SelectableUnit <em>Selectable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.SelectableUnit
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSelectableUnit()
		 * @generated
		 */
		EClass SELECTABLE_UNIT = eINSTANCE.getSelectableUnit();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.SingletonUnitImpl <em>Singleton Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.SingletonUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSingletonUnit()
		 * @generated
		 */
		EClass SINGLETON_UNIT = eINSTANCE.getSingletonUnit();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLETON_UNIT__TITLE = eINSTANCE.getSingletonUnit_Title();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl <em>Collection Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCollectionUnit()
		 * @generated
		 */
		EClass COLLECTION_UNIT = eINSTANCE.getCollectionUnit();

		/**
		 * The meta object literal for the '<em><b>Unit Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__UNIT_TITLE = eINSTANCE.getCollectionUnit_UnitTitle();

		/**
		 * The meta object literal for the '<em><b>Element Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__ELEMENT_TITLE = eINSTANCE.getCollectionUnit_ElementTitle();

		/**
		 * The meta object literal for the '<em><b>Truncate Element Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE = eINSTANCE.getCollectionUnit_TruncateElementTitle();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__SELECTION = eINSTANCE.getCollectionUnit_Selection();

		/**
		 * The meta object literal for the '<em><b>Find Container Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__FIND_CONTAINER_SELECTION = eINSTANCE.getCollectionUnit_FindContainerSelection();

		/**
		 * The meta object literal for the '<em><b>Find Element Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__FIND_ELEMENT_SELECTION = eINSTANCE.getCollectionUnit_FindElementSelection();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__FILTER = eINSTANCE.getCollectionUnit_Filter();

		/**
		 * The meta object literal for the '<em><b>Supported Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__SUPPORTED_FILTERS = eINSTANCE.getCollectionUnit_SupportedFilters();

		/**
		 * The meta object literal for the '<em><b>Empty Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__EMPTY_MESSAGE = eINSTANCE.getCollectionUnit_EmptyMessage();

		/**
		 * The meta object literal for the '<em><b>Omit Field Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__OMIT_FIELD_LABELS = eINSTANCE.getCollectionUnit_OmitFieldLabels();

		/**
		 * The meta object literal for the '<em><b>Default Pagination Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE = eINSTANCE.getCollectionUnit_DefaultPaginationSize();

		/**
		 * The meta object literal for the '<em><b>Maximum Pagination Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE = eINSTANCE.getCollectionUnit_MaximumPaginationSize();

		/**
		 * The meta object literal for the '<em><b>Pagination Control Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT = eINSTANCE.getCollectionUnit_PaginationControlPlacement();

		/**
		 * The meta object literal for the '<em><b>Next Npages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__NEXT_NPAGES = eINSTANCE.getCollectionUnit_NextNpages();

		/**
		 * The meta object literal for the '<em><b>Previous Npages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PREVIOUS_NPAGES = eINSTANCE.getCollectionUnit_PreviousNpages();

		/**
		 * The meta object literal for the '<em><b>Next Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__NEXT_PAGE_LABEL = eINSTANCE.getCollectionUnit_NextPageLabel();

		/**
		 * The meta object literal for the '<em><b>Next Page Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__NEXT_PAGE_ICON_NAME = eINSTANCE.getCollectionUnit_NextPageIconName();

		/**
		 * The meta object literal for the '<em><b>Previous Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PREVIOUS_PAGE_LABEL = eINSTANCE.getCollectionUnit_PreviousPageLabel();

		/**
		 * The meta object literal for the '<em><b>Previous Page Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME = eINSTANCE.getCollectionUnit_PreviousPageIconName();

		/**
		 * The meta object literal for the '<em><b>Use Disabled Page Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS = eINSTANCE.getCollectionUnit_UseDisabledPageLinks();

		/**
		 * The meta object literal for the '<em><b>Use First Last Page Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = eINSTANCE.getCollectionUnit_UseFirstLastPageLinks();

		/**
		 * The meta object literal for the '<em><b>First Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__FIRST_PAGE_LABEL = eINSTANCE.getCollectionUnit_FirstPageLabel();

		/**
		 * The meta object literal for the '<em><b>First Page Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__FIRST_PAGE_ICON_NAME = eINSTANCE.getCollectionUnit_FirstPageIconName();

		/**
		 * The meta object literal for the '<em><b>Last Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__LAST_PAGE_LABEL = eINSTANCE.getCollectionUnit_LastPageLabel();

		/**
		 * The meta object literal for the '<em><b>Last Page Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__LAST_PAGE_ICON_NAME = eINSTANCE.getCollectionUnit_LastPageIconName();

		/**
		 * The meta object literal for the '<em><b>Pagination Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PAGINATION_CLASS = eINSTANCE.getCollectionUnit_PaginationClass();

		/**
		 * The meta object literal for the '<em><b>Pagination Element Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS = eINSTANCE.getCollectionUnit_PaginationElementClass();

		/**
		 * The meta object literal for the '<em><b>Pagination Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS = eINSTANCE.getCollectionUnit_PaginationAnchorClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl <em>Edit Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getEditUnit()
		 * @generated
		 */
		EClass EDIT_UNIT = eINSTANCE.getEditUnit();

		/**
		 * The meta object literal for the '<em><b>Use Captcha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__USE_CAPTCHA = eINSTANCE.getEditUnit_UseCaptcha();

		/**
		 * The meta object literal for the '<em><b>Disable When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__DISABLE_WHEN = eINSTANCE.getEditUnit_DisableWhen();

		/**
		 * The meta object literal for the '<em><b>Confirm Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CONFIRM_DESTINATION = eINSTANCE.getEditUnit_ConfirmDestination();

		/**
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CONFIRM_LABEL = eINSTANCE.getEditUnit_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CONFIRM_MESSAGE = eINSTANCE.getEditUnit_ConfirmMessage();

		/**
		 * The meta object literal for the '<em><b>Success Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__SUCCESS_MESSAGE = eINSTANCE.getEditUnit_SuccessMessage();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CANCEL_DESTINATION = eINSTANCE.getEditUnit_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CANCEL_LABEL = eINSTANCE.getEditUnit_CancelLabel();

		/**
		 * The meta object literal for the '<em><b>Unit Input Group Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__UNIT_INPUT_GROUP_CLASS = eINSTANCE.getEditUnit_UnitInputGroupClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.CreateUnitImpl <em>Create Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.CreateUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCreateUnit()
		 * @generated
		 */
		EClass CREATE_UNIT = eINSTANCE.getCreateUnit();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.CreateUpdateUnitImpl <em>Create Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.CreateUpdateUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCreateUpdateUnit()
		 * @generated
		 */
		EClass CREATE_UPDATE_UNIT = eINSTANCE.getCreateUpdateUnit();

		/**
		 * The meta object literal for the '<em><b>On Save Continue Editing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING = eINSTANCE.getCreateUpdateUnit_OnSaveContinueEditing();

		/**
		 * The meta object literal for the '<em><b>Update Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__UPDATE_URI_ELEMENT = eINSTANCE.getCreateUpdateUnit_UpdateUriElement();

		/**
		 * The meta object literal for the '<em><b>Clear Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__CLEAR_LABEL = eINSTANCE.getCreateUpdateUnit_ClearLabel();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UpdateUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUpdateUnit()
		 * @generated
		 */
		EClass UPDATE_UNIT = eINSTANCE.getUpdateUnit();

		/**
		 * The meta object literal for the '<em><b>On Save Continue Editing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING = eINSTANCE.getUpdateUnit_OnSaveContinueEditing();

		/**
		 * The meta object literal for the '<em><b>Display Empty Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_UNIT__DISPLAY_EMPTY_FORM = eINSTANCE.getUpdateUnit_DisplayEmptyForm();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.MapUnitImpl <em>Map Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.MapUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMapUnit()
		 * @generated
		 */
		EClass MAP_UNIT = eINSTANCE.getMapUnit();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__READ_ONLY = eINSTANCE.getMapUnit_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Default Zoom Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__DEFAULT_ZOOM_LEVEL = eINSTANCE.getMapUnit_DefaultZoomLevel();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_UNIT__LOCATION = eINSTANCE.getMapUnit_Location();

		/**
		 * The meta object literal for the '<em><b>Place Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_UNIT__PLACE_NAME = eINSTANCE.getMapUnit_PlaceName();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DetailsUnitImpl <em>Details Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DetailsUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDetailsUnit()
		 * @generated
		 */
		EClass DETAILS_UNIT = eINSTANCE.getDetailsUnit();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILS_UNIT__SELECTION = eINSTANCE.getDetailsUnit_Selection();

		/**
		 * The meta object literal for the '<em><b>Omit Field Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_UNIT__OMIT_FIELD_LABELS = eINSTANCE.getDetailsUnit_OmitFieldLabels();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.TabularUnitImpl <em>Tabular Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.TabularUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getTabularUnit()
		 * @generated
		 */
		EClass TABULAR_UNIT = eINSTANCE.getTabularUnit();

		/**
		 * The meta object literal for the '<em><b>Header Class Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABULAR_UNIT__HEADER_CLASS_OVERRIDE = eINSTANCE.getTabularUnit_HeaderClassOverride();

		/**
		 * The meta object literal for the '<em><b>Footer Class Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABULAR_UNIT__FOOTER_CLASS_OVERRIDE = eINSTANCE.getTabularUnit_FooterClassOverride();

		/**
		 * The meta object literal for the '<em><b>Row Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABULAR_UNIT__ROW_CLASSES = eINSTANCE.getTabularUnit_RowClasses();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl <em>Cards Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCardsUnit()
		 * @generated
		 */
		EClass CARDS_UNIT = eINSTANCE.getCardsUnit();

		/**
		 * The meta object literal for the '<em><b>Badges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDS_UNIT__BADGES = eINSTANCE.getCardsUnit_Badges();

		/**
		 * The meta object literal for the '<em><b>Overlay Single Select Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION = eINSTANCE.getCardsUnit_OverlaySingleSelectAction();

		/**
		 * The meta object literal for the '<em><b>Local Row Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__LOCAL_ROW_CLASS = eINSTANCE.getCardsUnit_LocalRowClass();

		/**
		 * The meta object literal for the '<em><b>Local Column Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__LOCAL_COLUMN_CLASS = eINSTANCE.getCardsUnit_LocalColumnClass();

		/**
		 * The meta object literal for the '<em><b>Local Card Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__LOCAL_CARD_CLASS = eINSTANCE.getCardsUnit_LocalCardClass();

		/**
		 * The meta object literal for the '<em><b>Local Card Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__LOCAL_CARD_HEADER_CLASS = eINSTANCE.getCardsUnit_LocalCardHeaderClass();

		/**
		 * The meta object literal for the '<em><b>Local Card Body Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__LOCAL_CARD_BODY_CLASS = eINSTANCE.getCardsUnit_LocalCardBodyClass();

		/**
		 * The meta object literal for the '<em><b>Local Card Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS = eINSTANCE.getCardsUnit_LocalCardFooterClass();

		/**
		 * The meta object literal for the '<em><b>Local Badge Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__LOCAL_BADGE_CLASS = eINSTANCE.getCardsUnit_LocalBadgeClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.TextCardsUnitImpl <em>Text Cards Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.TextCardsUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getTextCardsUnit()
		 * @generated
		 */
		EClass TEXT_CARDS_UNIT = eINSTANCE.getTextCardsUnit();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DateCardsUnitImpl <em>Date Cards Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DateCardsUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDateCardsUnit()
		 * @generated
		 */
		EClass DATE_CARDS_UNIT = eINSTANCE.getDateCardsUnit();

		/**
		 * The meta object literal for the '<em><b>Element Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_CARDS_UNIT__ELEMENT_DATE = eINSTANCE.getDateCardsUnit_ElementDate();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ControlUnitImpl <em>Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ControlUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getControlUnit()
		 * @generated
		 */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
		 * The meta object literal for the '<em><b>Submit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__SUBMIT_LABEL = eINSTANCE.getControlUnit_SubmitLabel();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__CANCEL_DESTINATION = eINSTANCE.getControlUnit_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__CANCEL_LABEL = eINSTANCE.getControlUnit_CancelLabel();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.SearchUnitImpl <em>Search Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.SearchUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSearchUnit()
		 * @generated
		 */
		EClass SEARCH_UNIT = eINSTANCE.getSearchUnit();

		/**
		 * The meta object literal for the '<em><b>Results Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_UNIT__RESULTS_DESTINATION = eINSTANCE.getSearchUnit_ResultsDestination();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.RegistrationUnitImpl <em>Registration Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.RegistrationUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getRegistrationUnit()
		 * @generated
		 */
		EClass REGISTRATION_UNIT = eINSTANCE.getRegistrationUnit();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.LoginUnitImpl <em>Login Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.LoginUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getLoginUnit()
		 * @generated
		 */
		EClass LOGIN_UNIT = eINSTANCE.getLoginUnit();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.LogoutUnitImpl <em>Logout Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.LogoutUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getLogoutUnit()
		 * @generated
		 */
		EClass LOGOUT_UNIT = eINSTANCE.getLogoutUnit();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl <em>Forgotten Password Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ForgottenPasswordUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getForgottenPasswordUnit()
		 * @generated
		 */
		EClass FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getForgottenPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Reset Password Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT = eINSTANCE.getForgottenPasswordUnit_ResetPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Uri Email Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT = eINSTANCE.getForgottenPasswordUnit_UriEmailSent();

		/**
		 * The meta object literal for the '<em><b>Email Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT = eINSTANCE.getForgottenPasswordUnit_EmailSubject();

		/**
		 * The meta object literal for the '<em><b>Email Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE = eINSTANCE.getForgottenPasswordUnit_EmailMessage();

		/**
		 * The meta object literal for the '<em><b>Email Sent Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION = eINSTANCE.getForgottenPasswordUnit_EmailSentCaption();

		/**
		 * The meta object literal for the '<em><b>Email Sent Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE = eINSTANCE.getForgottenPasswordUnit_EmailSentMessage();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ResetPasswordUnitImpl <em>Reset Password Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ResetPasswordUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getResetPasswordUnit()
		 * @generated
		 */
		EClass RESET_PASSWORD_UNIT = eINSTANCE.getResetPasswordUnit();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PathImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__CONTAINING_TYPE = eINSTANCE.getPath_ContainingType();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathAssociationImpl <em>Path Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PathAssociationImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathAssociation()
		 * @generated
		 */
		EClass PATH_ASSOCIATION = eINSTANCE.getPathAssociation();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ASSOCIATION__ASSOCIATION = eINSTANCE.getPathAssociation_Association();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_ASSOCIATION__NAME = eINSTANCE.getPathAssociation_Name();

		/**
		 * The meta object literal for the '<em><b>Value Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ASSOCIATION__VALUE_DISPLAY = eINSTANCE.getPathAssociation_ValueDisplay();

		/**
		 * The meta object literal for the '<em><b>Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ASSOCIATION__CHILD_FEATURE = eINSTANCE.getPathAssociation_ChildFeature();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getPathAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ASSOCIATION__SOURCE_ENTITY = eINSTANCE.getPathAssociation_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getPathAssociation_TargetEntity();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathAttributeImpl <em>Path Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PathAttributeImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathAttribute()
		 * @generated
		 */
		EClass PATH_ATTRIBUTE = eINSTANCE.getPathAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getPathAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_ATTRIBUTE__NAME = eINSTANCE.getPathAttribute_Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PathResourceImpl <em>Path Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PathResourceImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPathResource()
		 * @generated
		 */
		EClass PATH_RESOURCE = eINSTANCE.getPathResource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RESOURCE__RESOURCE = eINSTANCE.getPathResource_Resource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_RESOURCE__NAME = eINSTANCE.getPathResource_Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathImpl <em>Child Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPath()
		 * @generated
		 */
		EClass CHILD_PATH = eINSTANCE.getChildPath();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH__PARENT = eINSTANCE.getChildPath_Parent();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.ActionContainer <em>Action Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.ActionContainer
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getActionContainer()
		 * @generated
		 */
		EClass ACTION_CONTAINER = eINSTANCE.getActionContainer();

		/**
		 * The meta object literal for the '<em><b>Container Actions Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CONTAINER__CONTAINER_ACTIONS_PLACEMENT = eINSTANCE.getActionContainer_ContainerActionsPlacement();

		/**
		 * The meta object literal for the '<em><b>Instance Actions Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CONTAINER__INSTANCE_ACTIONS_PLACEMENT = eINSTANCE.getActionContainer_InstanceActionsPlacement();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CONTAINER__ACTIONS = eINSTANCE.getActionContainer_Actions();

		/**
		 * The meta object literal for the '<em><b>Action Navigation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CONTAINER__ACTION_NAVIGATION_CLASS = eINSTANCE.getActionContainer_ActionNavigationClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.ImageUnit <em>Image Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.ImageUnit
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getImageUnit()
		 * @generated
		 */
		EClass IMAGE_UNIT = eINSTANCE.getImageUnit();

		/**
		 * The meta object literal for the '<em><b>Image Path Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__IMAGE_PATH_FEATURE = eINSTANCE.getImageUnit_ImagePathFeature();

		/**
		 * The meta object literal for the '<em><b>Image Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__IMAGE_FILTER = eINSTANCE.getImageUnit_ImageFilter();

		/**
		 * The meta object literal for the '<em><b>Missing Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UNIT__MISSING_IMAGE_PATH = eINSTANCE.getImageUnit_MissingImagePath();

		/**
		 * The meta object literal for the '<em><b>Show Missing Image When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__SHOW_MISSING_IMAGE_WHEN = eINSTANCE.getImageUnit_ShowMissingImageWhen();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl <em>Image Cards Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getImageCardsUnit()
		 * @generated
		 */
		EClass IMAGE_CARDS_UNIT = eINSTANCE.getImageCardsUnit();

		/**
		 * The meta object literal for the '<em><b>Overlay Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CARDS_UNIT__OVERLAY_TITLE = eINSTANCE.getImageCardsUnit_OverlayTitle();

		/**
		 * The meta object literal for the '<em><b>Enable Image Enlargement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT = eINSTANCE.getImageCardsUnit_EnableImageEnlargement();

		/**
		 * The meta object literal for the '<em><b>Reveal Untruncated Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT = eINSTANCE.getImageCardsUnit_RevealUntruncatedContent();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.SliderUnitImpl <em>Slider Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.SliderUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSliderUnit()
		 * @generated
		 */
		EClass SLIDER_UNIT = eINSTANCE.getSliderUnit();

		/**
		 * The meta object literal for the '<em><b>Show Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER_UNIT__SHOW_TIME = eINSTANCE.getSliderUnit_ShowTime();

		/**
		 * The meta object literal for the '<em><b>Transition Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDER_UNIT__TRANSITION_TIME = eINSTANCE.getSliderUnit_TransitionTime();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.GalleryUnitImpl <em>Gallery Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.GalleryUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getGalleryUnit()
		 * @generated
		 */
		EClass GALLERY_UNIT = eINSTANCE.getGalleryUnit();

		/**
		 * The meta object literal for the '<em><b>Full Size Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GALLERY_UNIT__FULL_SIZE_FILTER = eINSTANCE.getGalleryUnit_FullSizeFilter();

		/**
		 * The meta object literal for the '<em><b>Show Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY_UNIT__SHOW_TIME = eINSTANCE.getGalleryUnit_ShowTime();

		/**
		 * The meta object literal for the '<em><b>Transition Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY_UNIT__TRANSITION_TIME = eINSTANCE.getGalleryUnit_TransitionTime();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__USED_BY = eINSTANCE.getAction_UsedBy();

		/**
		 * The meta object literal for the '<em><b>Parent Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PARENT_UNIT = eINSTANCE.getAction_ParentUnit();

		/**
		 * The meta object literal for the '<em><b>Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ICON_NAME = eINSTANCE.getAction_IconName();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DISABLE = eINSTANCE.getAction_Disable();

		/**
		 * The meta object literal for the '<em><b>Display When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__DISPLAY_WHEN = eINSTANCE.getAction_DisplayWhen();

		/**
		 * The meta object literal for the '<em><b>Enable When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ENABLE_WHEN = eINSTANCE.getAction_EnableWhen();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CONFIRM_MESSAGE = eINSTANCE.getAction_ConfirmMessage();

		/**
		 * The meta object literal for the '<em><b>Success Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__SUCCESS_MESSAGE = eINSTANCE.getAction_SuccessMessage();

		/**
		 * The meta object literal for the '<em><b>Failure Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FAILURE_MESSAGE = eINSTANCE.getAction_FailureMessage();

		/**
		 * The meta object literal for the '<em><b>Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ANCHOR_CLASS = eINSTANCE.getAction_AnchorClass();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__HEADER_CLASS = eINSTANCE.getAction_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FOOTER_CLASS = eINSTANCE.getAction_FooterClass();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTAINING_TYPE = eINSTANCE.getAction_ContainingType();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.SecurityActionImpl <em>Security Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.SecurityActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSecurityAction()
		 * @generated
		 */
		EClass SECURITY_ACTION = eINSTANCE.getSecurityAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ACTION__TARGET = eINSTANCE.getSecurityAction_Target();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.OperationActionImpl <em>Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.OperationActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getOperationAction()
		 * @generated
		 */
		EClass OPERATION_ACTION = eINSTANCE.getOperationAction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ACTION__OPERATION = eINSTANCE.getOperationAction_Operation();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ACTION__REQUIRES_ROLE = eINSTANCE.getOperationAction_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_ACTION__URI_ELEMENT = eINSTANCE.getOperationAction_UriElement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.InstanceOperationActionImpl <em>Instance Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.InstanceOperationActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInstanceOperationAction()
		 * @generated
		 */
		EClass INSTANCE_OPERATION_ACTION = eINSTANCE.getInstanceOperationAction();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContainerOperationActionImpl <em>Container Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ContainerOperationActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContainerOperationAction()
		 * @generated
		 */
		EClass CONTAINER_OPERATION_ACTION = eINSTANCE.getContainerOperationAction();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.GeneralOperationActionImpl <em>General Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.GeneralOperationActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getGeneralOperationAction()
		 * @generated
		 */
		EClass GENERAL_OPERATION_ACTION = eINSTANCE.getGeneralOperationAction();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.MessageImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TEXT = eINSTANCE.getMessage_Text();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__FEATURES = eINSTANCE.getMessage_Features();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement <em>Authentication Menu Placement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getAuthenticationMenuPlacement()
		 * @generated
		 */
		EEnum AUTHENTICATION_MENU_PLACEMENT = eINSTANCE.getAuthenticationMenuPlacement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.SelectActionImpl <em>Select Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.SelectActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSelectAction()
		 * @generated
		 */
		EClass SELECT_ACTION = eINSTANCE.getSelectAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ACTION__TARGET = eINSTANCE.getSelectAction_Target();

		/**
		 * The meta object literal for the '<em><b>Value Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ACTION__VALUE_PATH = eINSTANCE.getSelectAction_ValuePath();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContainerSelectActionImpl <em>Container Select Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ContainerSelectActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContainerSelectAction()
		 * @generated
		 */
		EClass CONTAINER_SELECT_ACTION = eINSTANCE.getContainerSelectAction();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.InstanceSelectActionImpl <em>Instance Select Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.InstanceSelectActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInstanceSelectAction()
		 * @generated
		 */
		EClass INSTANCE_SELECT_ACTION = eINSTANCE.getInstanceSelectAction();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.TargetActionImpl <em>Target Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.TargetActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getTargetAction()
		 * @generated
		 */
		EClass TARGET_ACTION = eINSTANCE.getTargetAction();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DeleteActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDeleteAction()
		 * @generated
		 */
		EClass DELETE_ACTION = eINSTANCE.getDeleteAction();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__REQUIRES_ROLE = eINSTANCE.getDeleteAction_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__URI_ELEMENT = eINSTANCE.getDeleteAction_UriElement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.BadgeImpl <em>Badge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.BadgeImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getBadge()
		 * @generated
		 */
		EClass BADGE = eINSTANCE.getBadge();

		/**
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BADGE__DISPLAYED_ON = eINSTANCE.getBadge_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__ICON_NAME = eINSTANCE.getBadge_IconName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BADGE__VALUE = eINSTANCE.getBadge_Value();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BADGE__TITLE = eINSTANCE.getBadge_Title();

		/**
		 * The meta object literal for the '<em><b>Display When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BADGE__DISPLAY_WHEN = eINSTANCE.getBadge_DisplayWhen();

		/**
		 * The meta object literal for the '<em><b>Local Badge Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__LOCAL_BADGE_CLASS = eINSTANCE.getBadge_LocalBadgeClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.PageTopMenuOptions
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPageTopMenuOptions()
		 * @generated
		 */
		EEnum PAGE_TOP_MENU_OPTIONS = eINSTANCE.getPageTopMenuOptions();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCollectionDisplayOptions()
		 * @generated
		 */
		EEnum COLLECTION_DISPLAY_OPTIONS = eINSTANCE.getCollectionDisplayOptions();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.PaginationControlPlacements <em>Pagination Control Placements</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.PaginationControlPlacements
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPaginationControlPlacements()
		 * @generated
		 */
		EEnum PAGINATION_CONTROL_PLACEMENTS = eINSTANCE.getPaginationControlPlacements();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement <em>Container Actions Placement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContainerActionsPlacement()
		 * @generated
		 */
		EEnum CONTAINER_ACTIONS_PLACEMENT = eINSTANCE.getContainerActionsPlacement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement <em>Instance Actions Placement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInstanceActionsPlacement()
		 * @generated
		 */
		EEnum INSTANCE_ACTIONS_PLACEMENT = eINSTANCE.getInstanceActionsPlacement();

	}

} //WebuiPackage
