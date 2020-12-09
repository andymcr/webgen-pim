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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	String eNS_URI = "http://cs.man.ac.uk/mdsd/webgen/webui";

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
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__MENUS = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__PAGES = 2;

	/**
	 * The feature id for the '<em><b>Default Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_DATE_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Default Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_TIME_FORMAT = 4;

	/**
	 * The feature id for the '<em><b>Default Date Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_DATE_TIME_FORMAT = 5;

	/**
	 * The feature id for the '<em><b>Default Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_CARD_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Default Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_CARD_HEADER_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Default Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_CARD_BODY_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Default Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_CARD_FOOTER_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Default Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_BADGE_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Default Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Default Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_ANCHOR_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Default Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_FIELD_LIST_CLASS = 13;

	/**
	 * The feature id for the '<em><b>Default Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_FIELD_LABEL_CLASS = 14;

	/**
	 * The feature id for the '<em><b>Default Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_FIELD_VALUE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>Default Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_INPUT_GROUP_CLASS = 16;

	/**
	 * The feature id for the '<em><b>Default Input Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_INPUT_LABEL_CLASS = 17;

	/**
	 * The feature id for the '<em><b>Default Input Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_INPUT_VALUE_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Default Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE = 19;

	/**
	 * The feature id for the '<em><b>Input Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__INPUT_TECHNOLOGY = 20;

	/**
	 * The feature id for the '<em><b>Ajax Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__AJAX_TECHNOLOGY = 21;

	/**
	 * The number of structural features of the '<em>Web UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Web UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.MenuImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 1;

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
	int MENU_ENTRY = 2;

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
	int SUBMENU_ENTRY = 3;

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
	 * The number of structural features of the '<em>Submenu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_ENTRY_FEATURE_COUNT = MENU_FEATURE_COUNT + 2;

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
	int ACTION_MENU_ENTRY = 4;

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
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MENU_ENTRY__QUERY = MENU_ENTRY_FEATURE_COUNT + 3;

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
	int EDIT_STATIC_TEXT_MENU_ENTRY = 5;

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
	int MENU_FEATURE = 6;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.QueryImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 7;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.QueryParameterImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getQueryParameter()
	 * @generated
	 */
	int QUERY_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PageImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Web UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__WEB_UI = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PARENT_PAGE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CHILD_PAGES = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNITS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__STYLE_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.PageLinkImpl <em>Page Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.PageLinkImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPageLink()
	 * @generated
	 */
	int PAGE_LINK = 10;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK__TARGET_PAGE = 0;

	/**
	 * The number of structural features of the '<em>Page Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Page Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl <em>Content Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getContentUnit()
	 * @generated
	 */
	int CONTENT_UNIT = 11;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__DISPLAYED_ON = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__ROUTE_ACTUALS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__REQUIRES_ROLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__PURPOSE_SUMMARY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CONTENT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__PAGE_DISPLAYED_ON = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 12;

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
	int ROUTE_ACTUAL = 12;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.StaticUnitImpl <em>Static Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.StaticUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getStaticUnit()
	 * @generated
	 */
	int STATIC_UNIT = 13;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__ROUTE_ACTUALS = CONTENT_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CONTENT_CLASS = CONTENT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__PAGE_DISPLAYED_ON = CONTENT_UNIT__PAGE_DISPLAYED_ON;

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
	int CREATE_SITEMAP_UNIT = 14;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__ROUTE_ACTUALS = CONTENT_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CONTENT_CLASS = CONTENT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__PAGE_DISPLAYED_ON = CONTENT_UNIT__PAGE_DISPLAYED_ON;

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
	int DYNAMIC_UNIT = 15;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ROUTE_ACTUALS = CONTENT_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTENT_CLASS = CONTENT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__PAGE_DISPLAYED_ON = CONTENT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_FIELDS = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__SERVICES_USED = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HIDE_WHEN = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN = CONTENT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__SUPPORT_ACTIONS = CONTENT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER = CONTENT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER = CONTENT_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER_CLASS = CONTENT_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTROL_CLASS = CONTENT_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER_CLASS = CONTENT_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FIELD_LIST_CLASS = CONTENT_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS = CONTENT_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS = CONTENT_UNIT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_OPERATION_COUNT = CONTENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl <em>Unit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitField()
	 * @generated
	 */
	int UNIT_FIELD = 16;

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
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__ESCAPE_HTML = 4;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__COLLECTION_DISPLAY_OPTION = 5;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__TRUNCATE = 6;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DATE_FORMAT = 7;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DISABLE_INPUT = 8;

	/**
	 * The number of structural features of the '<em>Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD_FEATURE_COUNT = 9;

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
	int UNIT_FEATURE = 17;

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
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ACTIONS = UNIT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ACTION_NAVIGATION_CLASS = UNIT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS = UNIT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_LABEL = UNIT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__REQUIRED = UNIT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FORCED_VALUE = UNIT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD = UNIT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE = UNIT_FIELD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DEFAULT_DISPLAY_VALUE = UNIT_FIELD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Display Default When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_DEFAULT_WHEN = UNIT_FIELD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__EMPTY_DISPLAY_VALUE = UNIT_FIELD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER = UNIT_FIELD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__AUTOFOCUS = UNIT_FIELD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__HEADER_CLASS = UNIT_FIELD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FIELD_LABEL_CLASS = UNIT_FIELD_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FIELD_VALUE_CLASS = UNIT_FIELD_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__INPUT_GROUP_CLASS = UNIT_FIELD_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_CLASS = UNIT_FIELD_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER_CLASS = UNIT_FIELD_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_FEATURE_COUNT = UNIT_FIELD_FEATURE_COUNT + 19;

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
	int UNIT_ELEMENT = 18;

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
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DEFAULT_LOCAL_ANCHOR_CLASS = UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS;

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
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAY_CLASS = UNIT_FEATURE__DISPLAY_CLASS;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitAssociation()
	 * @generated
	 */
	int UNIT_ASSOCIATION = 19;

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
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DEFAULT_LOCAL_ANCHOR_CLASS = UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS;

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
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_CLASS = UNIT_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__NAME = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ASSOCIATION = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__VALUE_DISPLAY = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__CHILD_FEATURE = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__SOURCE_ENTITY = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__TARGET_ENTITY = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__OPTIONS = UNIT_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Filtered Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FILTERED_OPTIONS = UNIT_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_OPERATION_COUNT = UNIT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.AssociationReference <em>Association Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.AssociationReference
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getAssociationReference()
	 * @generated
	 */
	int ASSOCIATION_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__VALUE_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE__CHILD_FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Association Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Association Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathImpl <em>Child Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPath()
	 * @generated
	 */
	int CHILD_PATH = 21;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH__PART_OF = 0;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAttributeImpl <em>Child Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathAttributeImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPathAttribute()
	 * @generated
	 */
	int CHILD_PATH_ATTRIBUTE = 22;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__PART_OF = CHILD_PATH__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__NAME = CHILD_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE__ATTRIBUTE = CHILD_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Child Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE_FEATURE_COUNT = CHILD_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Child Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ATTRIBUTE_OPERATION_COUNT = CHILD_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl <em>Child Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getChildPathAssociation()
	 * @generated
	 */
	int CHILD_PATH_ASSOCIATION = 23;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__PART_OF = CHILD_PATH__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__NAME = CHILD_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__ASSOCIATION = CHILD_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__VALUE_DISPLAY = CHILD_PATH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__CHILD_FEATURE = CHILD_PATH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = CHILD_PATH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__SOURCE_ENTITY = CHILD_PATH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION__TARGET_ENTITY = CHILD_PATH_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Child Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION_FEATURE_COUNT = CHILD_PATH_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Child Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_PATH_ASSOCIATION_OPERATION_COUNT = CHILD_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl <em>Feature Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePath()
	 * @generated
	 */
	int FEATURE_PATH = 24;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH__SUFFIXES = ExpressionPackage.VARIABLE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH__ROOT_CONTAINER = ExpressionPackage.VARIABLE__ROOT_CONTAINER;

	/**
	 * The number of structural features of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathAttributeImpl <em>Feature Path Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathAttributeImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathAttribute()
	 * @generated
	 */
	int FEATURE_PATH_ATTRIBUTE = 25;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__SUFFIXES = FEATURE_PATH__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__ROOT_CONTAINER = FEATURE_PATH__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__NAME = FEATURE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE__ATTRIBUTE = FEATURE_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE_FEATURE_COUNT = FEATURE_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Path Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ATTRIBUTE_OPERATION_COUNT = FEATURE_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathAssociationImpl <em>Feature Path Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathAssociationImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathAssociation()
	 * @generated
	 */
	int FEATURE_PATH_ASSOCIATION = 26;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__SUFFIXES = FEATURE_PATH__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__ROOT_CONTAINER = FEATURE_PATH__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__NAME = FEATURE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__ASSOCIATION = FEATURE_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY = FEATURE_PATH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__CHILD_FEATURE = FEATURE_PATH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = FEATURE_PATH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY = FEATURE_PATH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION__TARGET_ENTITY = FEATURE_PATH_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION_FEATURE_COUNT = FEATURE_PATH_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Feature Path Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_ASSOCIATION_OPERATION_COUNT = FEATURE_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathLabelImpl <em>Feature Path Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeaturePathLabelImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeaturePathLabel()
	 * @generated
	 */
	int FEATURE_PATH_LABEL = 27;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_LABEL__SUFFIXES = FEATURE_PATH__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_LABEL__ROOT_CONTAINER = FEATURE_PATH__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_LABEL__NAME = FEATURE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_LABEL__LABEL = FEATURE_PATH_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitLabelImpl <em>Unit Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitLabelImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitLabel()
	 * @generated
	 */
	int UNIT_LABEL = 28;

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
	int INTERFACE_FIELD = 29;

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
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__ESCAPE_HTML = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__TRUNCATE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DATE_FORMAT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISABLE_INPUT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__REQUIRED = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DEFAULT_VALUE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__MUST_MATCH = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__INPUT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__PLACEHOLDER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__VALIDATION_PATTERN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 15;

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
	int DATA_TYPE_FIELD = 30;

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
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

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
	int DATE_FIELD = 31;

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
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CaptchaFieldImpl <em>Captcha Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CaptchaFieldImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCaptchaField()
	 * @generated
	 */
	int CAPTCHA_FIELD = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__REQUIRES_ROLE = INTERFACE_FIELD__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__HIDE_WHEN = INTERFACE_FIELD__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__TITLE = INTERFACE_FIELD__TITLE;

	/**
	 * The feature id for the '<em><b>Escape HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__ESCAPE_HTML = INTERFACE_FIELD__ESCAPE_HTML;

	/**
	 * The feature id for the '<em><b>Collection Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__COLLECTION_DISPLAY_OPTION = INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__TRUNCATE = INTERFACE_FIELD__TRUNCATE;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Disable Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISABLE_INPUT = INTERFACE_FIELD__DISABLE_INPUT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__REQUIRED = INTERFACE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__PLACEHOLDER = INTERFACE_FIELD__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__VALIDATION_PATTERN = INTERFACE_FIELD__VALIDATION_PATTERN;

	/**
	 * The number of structural features of the '<em>Captcha Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Captcha Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD_OPERATION_COUNT = INTERFACE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitSupportActionImpl <em>Unit Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UnitSupportActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitSupportAction()
	 * @generated
	 */
	int UNIT_SUPPORT_ACTION = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__DISABLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.SelectableUnit <em>Selectable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.SelectableUnit
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSelectableUnit()
	 * @generated
	 */
	int SELECTABLE_UNIT = 34;

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
	int SINGLETON_UNIT = 35;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTENT_CLASS = DYNAMIC_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__PAGE_DISPLAYED_ON = DYNAMIC_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__SERVICES_USED = DYNAMIC_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__FIELD_LIST_CLASS = DYNAMIC_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__UNIT_FIELD_LABEL_CLASS = DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__UNIT_FIELD_VALUE_CLASS = DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT__CONTENT_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Singleton Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 2;

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
	int COLLECTION_UNIT = 36;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTENT_CLASS = DYNAMIC_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGE_DISPLAYED_ON = DYNAMIC_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SERVICES_USED = DYNAMIC_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIELD_LIST_CLASS = DYNAMIC_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__UNIT_FIELD_LABEL_CLASS = DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__UNIT_FIELD_VALUE_CLASS = DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS;

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
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTENT_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SELECT_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__CONTAINING_TYPE = DYNAMIC_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIND_CONTAINER_SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__OMIT_CONTAINER_LOAD = DYNAMIC_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIND_ELEMENT_SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FILTER = DYNAMIC_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__SUPPORTED_FILTERS = DYNAMIC_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__EMPTY_MESSAGE = DYNAMIC_UNIT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__OMIT_FIELD_LABELS = DYNAMIC_UNIT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE = DYNAMIC_UNIT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE = DYNAMIC_UNIT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT = DYNAMIC_UNIT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_NPAGES = DYNAMIC_UNIT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_NPAGES = DYNAMIC_UNIT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__NEXT_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS = DYNAMIC_UNIT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = DYNAMIC_UNIT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIRST_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__FIRST_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LAST_PAGE_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__LAST_PAGE_ICON_NAME = DYNAMIC_UNIT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS = DYNAMIC_UNIT_FEATURE_COUNT + 31;

	/**
	 * The number of structural features of the '<em>Collection Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 32;

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
	int EDIT_UNIT = 37;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAYED_ON = SINGLETON_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT = SINGLETON_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ROUTE_ACTUALS = SINGLETON_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CAPTION_CLASS = SINGLETON_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTENT_CLASS = SINGLETON_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__PAGE_DISPLAYED_ON = SINGLETON_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_FIELDS = SINGLETON_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__SERVICES_USED = SINGLETON_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__SUPPORT_ACTIONS = SINGLETON_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HEADER_CLASS = SINGLETON_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTROL_CLASS = SINGLETON_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FOOTER_CLASS = SINGLETON_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FIELD_LIST_CLASS = SINGLETON_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__UNIT_FIELD_LABEL_CLASS = SINGLETON_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__UNIT_FIELD_VALUE_CLASS = SINGLETON_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__TITLE = SINGLETON_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTENT_TYPE = SINGLETON_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Disable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISABLE_WHEN = SINGLETON_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_DESTINATION = SINGLETON_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_LABEL = SINGLETON_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_DESTINATION = SINGLETON_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_LABEL = SINGLETON_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CUSTOMISE_VALUES = SINGLETON_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unit Input Group Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__UNIT_INPUT_GROUP_CLASS = SINGLETON_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT_FEATURE_COUNT = SINGLETON_UNIT_FEATURE_COUNT + 7;

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
	int CREATE_UNIT = 38;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__PAGE_DISPLAYED_ON = EDIT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__SERVICES_USED = EDIT_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FIELD_LIST_CLASS = EDIT_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__UNIT_FIELD_LABEL_CLASS = EDIT_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__UNIT_FIELD_VALUE_CLASS = EDIT_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

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
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

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
	int CREATE_UPDATE_UNIT = 39;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__PAGE_DISPLAYED_ON = EDIT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SERVICES_USED = EDIT_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FIELD_LIST_CLASS = EDIT_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__UNIT_FIELD_LABEL_CLASS = EDIT_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__UNIT_FIELD_VALUE_CLASS = EDIT_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

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
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

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
	 * The feature id for the '<em><b>Create Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT = EDIT_UNIT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.UpdateUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUpdateUnit()
	 * @generated
	 */
	int UPDATE_UNIT = 40;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__PAGE_DISPLAYED_ON = EDIT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SERVICES_USED = EDIT_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FIELD_LIST_CLASS = EDIT_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__UNIT_FIELD_LABEL_CLASS = EDIT_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__UNIT_FIELD_VALUE_CLASS = EDIT_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

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
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

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
	 * The number of structural features of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_OPERATION_COUNT = EDIT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.MapUnitImpl <em>Map Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.MapUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getMapUnit()
	 * @generated
	 */
	int MAP_UNIT = 41;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CREATE_DEFAULT_URI_ELEMENT = EDIT_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ROUTE_ACTUALS = EDIT_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTENT_CLASS = EDIT_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PAGE_DISPLAYED_ON = EDIT_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SERVICES_USED = EDIT_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FIELD_LIST_CLASS = EDIT_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__UNIT_FIELD_LABEL_CLASS = EDIT_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__UNIT_FIELD_VALUE_CLASS = EDIT_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__TITLE = EDIT_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTENT_TYPE = EDIT_UNIT__CONTENT_TYPE;

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
	 * The feature id for the '<em><b>Customise Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CUSTOMISE_VALUES = EDIT_UNIT__CUSTOMISE_VALUES;

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
	int DETAILS_UNIT = 42;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAYED_ON = SINGLETON_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CREATE_DEFAULT_URI_ELEMENT = SINGLETON_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ROUTE_ACTUALS = SINGLETON_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CAPTION_CLASS = SINGLETON_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTENT_CLASS = SINGLETON_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__PAGE_DISPLAYED_ON = SINGLETON_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_FIELDS = SINGLETON_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SERVICES_USED = SINGLETON_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SUPPORT_ACTIONS = SINGLETON_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HEADER_CLASS = SINGLETON_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTROL_CLASS = SINGLETON_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FOOTER_CLASS = SINGLETON_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FIELD_LIST_CLASS = SINGLETON_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__UNIT_FIELD_LABEL_CLASS = SINGLETON_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__UNIT_FIELD_VALUE_CLASS = SINGLETON_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__TITLE = SINGLETON_UNIT__TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTENT_TYPE = SINGLETON_UNIT__CONTENT_TYPE;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.IndexUnitImpl <em>Index Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.IndexUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getIndexUnit()
	 * @generated
	 */
	int INDEX_UNIT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NAME = COLLECTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_LABEL = COLLECTION_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAYED_ON = COLLECTION_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CREATE_DEFAULT_URI_ELEMENT = COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ROUTE_ACTUALS = COLLECTION_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__REQUIRES_ROLE = COLLECTION_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PURPOSE_SUMMARY = COLLECTION_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__URI_ELEMENT = COLLECTION_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ALTERNATIVE = COLLECTION_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SECTION_CLASS = COLLECTION_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_CAPTION = COLLECTION_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CAPTION_CLASS = COLLECTION_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTENT_CLASS = COLLECTION_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGE_DISPLAYED_ON = COLLECTION_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_FIELDS = COLLECTION_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SERVICES_USED = COLLECTION_UNIT__SERVICES_USED;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HIDE_WHEN = COLLECTION_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__MESSAGE_WHEN_HIDDEN = COLLECTION_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SUPPORT_ACTIONS = COLLECTION_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HEADER = COLLECTION_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FOOTER = COLLECTION_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HEADER_CLASS = COLLECTION_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTROL_CLASS = COLLECTION_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FOOTER_CLASS = COLLECTION_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIELD_LIST_CLASS = COLLECTION_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__UNIT_FIELD_LABEL_CLASS = COLLECTION_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__UNIT_FIELD_VALUE_CLASS = COLLECTION_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__UNIT_TITLE = COLLECTION_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ELEMENT_TITLE = COLLECTION_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__TRUNCATE_ELEMENT_TITLE = COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTENT_TYPE = COLLECTION_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SELECT_TYPE = COLLECTION_UNIT__SELECT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTAINING_TYPE = COLLECTION_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SELECTION = COLLECTION_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIND_CONTAINER_SELECTION = COLLECTION_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_CONTAINER_LOAD = COLLECTION_UNIT__OMIT_CONTAINER_LOAD;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIND_ELEMENT_SELECTION = COLLECTION_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FILTER = COLLECTION_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SUPPORTED_FILTERS = COLLECTION_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__EMPTY_MESSAGE = COLLECTION_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_FIELD_LABELS = COLLECTION_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DEFAULT_PAGINATION_SIZE = COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__MAXIMUM_PAGINATION_SIZE = COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGINATION_CONTROL_PLACEMENT = COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_NPAGES = COLLECTION_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_NPAGES = COLLECTION_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_PAGE_LABEL = COLLECTION_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_PAGE_ICON_NAME = COLLECTION_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_PAGE_LABEL = COLLECTION_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_PAGE_ICON_NAME = COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__USE_DISABLED_PAGE_LINKS = COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS = COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIRST_PAGE_LABEL = COLLECTION_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIRST_PAGE_ICON_NAME = COLLECTION_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__LAST_PAGE_LABEL = COLLECTION_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__LAST_PAGE_ICON_NAME = COLLECTION_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGINATION_CLASS = COLLECTION_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGINATION_ELEMENT_CLASS = COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PAGINATION_ANCHOR_CLASS = COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ACTIONS = COLLECTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_OPTION = COLLECTION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ROW_CLASSES = COLLECTION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT_FEATURE_COUNT = COLLECTION_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT_OPERATION_COUNT = COLLECTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl <em>Cards Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCardsUnit()
	 * @generated
	 */
	int CARDS_UNIT = 44;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__DISPLAYED_ON = COLLECTION_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT = COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ROUTE_ACTUALS = COLLECTION_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CAPTION_CLASS = COLLECTION_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CONTENT_CLASS = COLLECTION_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__PAGE_DISPLAYED_ON = COLLECTION_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__DISPLAY_FIELDS = COLLECTION_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__SERVICES_USED = COLLECTION_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__SUPPORT_ACTIONS = COLLECTION_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__HEADER_CLASS = COLLECTION_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CONTROL_CLASS = COLLECTION_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__FOOTER_CLASS = COLLECTION_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__FIELD_LIST_CLASS = COLLECTION_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__UNIT_FIELD_LABEL_CLASS = COLLECTION_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__UNIT_FIELD_VALUE_CLASS = COLLECTION_UNIT__UNIT_FIELD_VALUE_CLASS;

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
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CONTENT_TYPE = COLLECTION_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__SELECT_TYPE = COLLECTION_UNIT__SELECT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CONTAINING_TYPE = COLLECTION_UNIT__CONTAINING_TYPE;

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
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__OMIT_CONTAINER_LOAD = COLLECTION_UNIT__OMIT_CONTAINER_LOAD;

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
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ACTIONS = COLLECTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ACTION_NAVIGATION_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Badges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__BADGES = COLLECTION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Overlay Single Select Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION = COLLECTION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__ROW_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__COLUMN_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CARD_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CARD_HEADER_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CARD_BODY_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__CARD_FOOTER_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Unit Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT__UNIT_BADGE_CLASS = COLLECTION_UNIT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Cards Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_UNIT_FEATURE_COUNT = COLLECTION_UNIT_FEATURE_COUNT + 12;

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
	int TEXT_CARDS_UNIT = 46;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DateCardsUnitImpl <em>Date Cards Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DateCardsUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDateCardsUnit()
	 * @generated
	 */
	int DATE_CARDS_UNIT = 47;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ControlUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 52;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SearchUnitImpl <em>Search Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SearchUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSearchUnit()
	 * @generated
	 */
	int SEARCH_UNIT = 53;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ImageUnitImpl <em>Image Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ImageUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getImageUnit()
	 * @generated
	 */
	int IMAGE_UNIT = 48;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl <em>Image Cards Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getImageCardsUnit()
	 * @generated
	 */
	int IMAGE_CARDS_UNIT = 49;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SliderUnitImpl <em>Slider Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SliderUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSliderUnit()
	 * @generated
	 */
	int SLIDER_UNIT = 50;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.GalleryUnitImpl <em>Gallery Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.GalleryUnitImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getGalleryUnit()
	 * @generated
	 */
	int GALLERY_UNIT = 51;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer <em>Inline Action Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.InlineActionContainer
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInlineActionContainer()
	 * @generated
	 */
	int INLINE_ACTION_CONTAINER = 54;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl <em>Inline Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInlineAction()
	 * @generated
	 */
	int INLINE_ACTION = 55;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.SelectActionImpl <em>Select Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.SelectActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getSelectAction()
	 * @generated
	 */
	int SELECT_ACTION = 56;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.DeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.DeleteActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDeleteAction()
	 * @generated
	 */
	int DELETE_ACTION = 57;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeatureSupportActionImpl <em>Feature Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.FeatureSupportActionImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeatureSupportAction()
	 * @generated
	 */
	int FEATURE_SUPPORT_ACTION = 58;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.impl.BadgeImpl
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getBadge()
	 * @generated
	 */
	int BADGE = 45;

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
	 * The feature id for the '<em><b>Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__BADGE_CLASS = 5;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__DISPLAYED_ON = CARDS_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT = CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__ROUTE_ACTUALS = CARDS_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CAPTION_CLASS = CARDS_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CONTENT_CLASS = CARDS_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__PAGE_DISPLAYED_ON = CARDS_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__DISPLAY_FIELDS = CARDS_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__SERVICES_USED = CARDS_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__SUPPORT_ACTIONS = CARDS_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__HEADER_CLASS = CARDS_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CONTROL_CLASS = CARDS_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__FOOTER_CLASS = CARDS_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__FIELD_LIST_CLASS = CARDS_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__UNIT_FIELD_LABEL_CLASS = CARDS_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__UNIT_FIELD_VALUE_CLASS = CARDS_UNIT__UNIT_FIELD_VALUE_CLASS;

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
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CONTENT_TYPE = CARDS_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__SELECT_TYPE = CARDS_UNIT__SELECT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CONTAINING_TYPE = CARDS_UNIT__CONTAINING_TYPE;

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
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__OMIT_CONTAINER_LOAD = CARDS_UNIT__OMIT_CONTAINER_LOAD;

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
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS = CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS;

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
	 * The feature id for the '<em><b>Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__ROW_CLASS = CARDS_UNIT__ROW_CLASS;

	/**
	 * The feature id for the '<em><b>Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__COLUMN_CLASS = CARDS_UNIT__COLUMN_CLASS;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CARD_CLASS = CARDS_UNIT__CARD_CLASS;

	/**
	 * The feature id for the '<em><b>Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CARD_HEADER_CLASS = CARDS_UNIT__CARD_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CARD_BODY_CLASS = CARDS_UNIT__CARD_BODY_CLASS;

	/**
	 * The feature id for the '<em><b>Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__CARD_FOOTER_CLASS = CARDS_UNIT__CARD_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CARDS_UNIT__UNIT_BADGE_CLASS = CARDS_UNIT__UNIT_BADGE_CLASS;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__DISPLAYED_ON = CARDS_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT = CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__ROUTE_ACTUALS = CARDS_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CAPTION_CLASS = CARDS_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CONTENT_CLASS = CARDS_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__PAGE_DISPLAYED_ON = CARDS_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__DISPLAY_FIELDS = CARDS_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__SERVICES_USED = CARDS_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__SUPPORT_ACTIONS = CARDS_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__HEADER_CLASS = CARDS_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CONTROL_CLASS = CARDS_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__FOOTER_CLASS = CARDS_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__FIELD_LIST_CLASS = CARDS_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__UNIT_FIELD_LABEL_CLASS = CARDS_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__UNIT_FIELD_VALUE_CLASS = CARDS_UNIT__UNIT_FIELD_VALUE_CLASS;

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
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CONTENT_TYPE = CARDS_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__SELECT_TYPE = CARDS_UNIT__SELECT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CONTAINING_TYPE = CARDS_UNIT__CONTAINING_TYPE;

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
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__OMIT_CONTAINER_LOAD = CARDS_UNIT__OMIT_CONTAINER_LOAD;

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
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS = CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS;

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
	 * The feature id for the '<em><b>Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__ROW_CLASS = CARDS_UNIT__ROW_CLASS;

	/**
	 * The feature id for the '<em><b>Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__COLUMN_CLASS = CARDS_UNIT__COLUMN_CLASS;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CARD_CLASS = CARDS_UNIT__CARD_CLASS;

	/**
	 * The feature id for the '<em><b>Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CARD_HEADER_CLASS = CARDS_UNIT__CARD_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CARD_BODY_CLASS = CARDS_UNIT__CARD_BODY_CLASS;

	/**
	 * The feature id for the '<em><b>Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__CARD_FOOTER_CLASS = CARDS_UNIT__CARD_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CARDS_UNIT__UNIT_BADGE_CLASS = CARDS_UNIT__UNIT_BADGE_CLASS;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NAME = COLLECTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAY_LABEL = COLLECTION_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAYED_ON = COLLECTION_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CREATE_DEFAULT_URI_ELEMENT = COLLECTION_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ROUTE_ACTUALS = COLLECTION_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__REQUIRES_ROLE = COLLECTION_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PURPOSE_SUMMARY = COLLECTION_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__URI_ELEMENT = COLLECTION_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ALTERNATIVE = COLLECTION_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SECTION_CLASS = COLLECTION_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__OMIT_CAPTION = COLLECTION_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CAPTION_CLASS = COLLECTION_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTENT_CLASS = COLLECTION_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGE_DISPLAYED_ON = COLLECTION_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DISPLAY_FIELDS = COLLECTION_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SERVICES_USED = COLLECTION_UNIT__SERVICES_USED;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__HIDE_WHEN = COLLECTION_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__MESSAGE_WHEN_HIDDEN = COLLECTION_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SUPPORT_ACTIONS = COLLECTION_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__HEADER = COLLECTION_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FOOTER = COLLECTION_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__HEADER_CLASS = COLLECTION_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTROL_CLASS = COLLECTION_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FOOTER_CLASS = COLLECTION_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FIELD_LIST_CLASS = COLLECTION_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__UNIT_FIELD_LABEL_CLASS = COLLECTION_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__UNIT_FIELD_VALUE_CLASS = COLLECTION_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__UNIT_TITLE = COLLECTION_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__ELEMENT_TITLE = COLLECTION_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__TRUNCATE_ELEMENT_TITLE = COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTENT_TYPE = COLLECTION_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SELECT_TYPE = COLLECTION_UNIT__SELECT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__CONTAINING_TYPE = COLLECTION_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SELECTION = COLLECTION_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FIND_CONTAINER_SELECTION = COLLECTION_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__OMIT_CONTAINER_LOAD = COLLECTION_UNIT__OMIT_CONTAINER_LOAD;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FIND_ELEMENT_SELECTION = COLLECTION_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FILTER = COLLECTION_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__SUPPORTED_FILTERS = COLLECTION_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__EMPTY_MESSAGE = COLLECTION_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__OMIT_FIELD_LABELS = COLLECTION_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__DEFAULT_PAGINATION_SIZE = COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE = COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGINATION_CONTROL_PLACEMENT = COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NEXT_NPAGES = COLLECTION_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PREVIOUS_NPAGES = COLLECTION_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NEXT_PAGE_LABEL = COLLECTION_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__NEXT_PAGE_ICON_NAME = COLLECTION_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PREVIOUS_PAGE_LABEL = COLLECTION_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME = COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__USE_DISABLED_PAGE_LINKS = COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS = COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FIRST_PAGE_LABEL = COLLECTION_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__FIRST_PAGE_ICON_NAME = COLLECTION_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__LAST_PAGE_LABEL = COLLECTION_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__LAST_PAGE_ICON_NAME = COLLECTION_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGINATION_CLASS = COLLECTION_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGINATION_ELEMENT_CLASS = COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__PAGINATION_ANCHOR_CLASS = COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__IMAGE_PATH_FEATURE = COLLECTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__IMAGE_FILTER = COLLECTION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Missing Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__MISSING_IMAGE_FILTER = COLLECTION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT__MISSING_IMAGE_PATH = COLLECTION_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Image Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT_FEATURE_COUNT = COLLECTION_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Image Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UNIT_OPERATION_COUNT = COLLECTION_UNIT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__DISPLAYED_ON = CARDS_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT = CARDS_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__ROUTE_ACTUALS = CARDS_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CAPTION_CLASS = CARDS_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CONTENT_CLASS = CARDS_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__PAGE_DISPLAYED_ON = CARDS_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__DISPLAY_FIELDS = CARDS_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__SERVICES_USED = CARDS_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__SUPPORT_ACTIONS = CARDS_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__HEADER_CLASS = CARDS_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CONTROL_CLASS = CARDS_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__FOOTER_CLASS = CARDS_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__FIELD_LIST_CLASS = CARDS_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__UNIT_FIELD_LABEL_CLASS = CARDS_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__UNIT_FIELD_VALUE_CLASS = CARDS_UNIT__UNIT_FIELD_VALUE_CLASS;

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
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CONTENT_TYPE = CARDS_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__SELECT_TYPE = CARDS_UNIT__SELECT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CONTAINING_TYPE = CARDS_UNIT__CONTAINING_TYPE;

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
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__OMIT_CONTAINER_LOAD = CARDS_UNIT__OMIT_CONTAINER_LOAD;

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
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS = CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS;

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
	 * The feature id for the '<em><b>Row Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__ROW_CLASS = CARDS_UNIT__ROW_CLASS;

	/**
	 * The feature id for the '<em><b>Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__COLUMN_CLASS = CARDS_UNIT__COLUMN_CLASS;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CARD_CLASS = CARDS_UNIT__CARD_CLASS;

	/**
	 * The feature id for the '<em><b>Card Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CARD_HEADER_CLASS = CARDS_UNIT__CARD_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Card Body Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CARD_BODY_CLASS = CARDS_UNIT__CARD_BODY_CLASS;

	/**
	 * The feature id for the '<em><b>Card Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__CARD_FOOTER_CLASS = CARDS_UNIT__CARD_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Badge Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__UNIT_BADGE_CLASS = CARDS_UNIT__UNIT_BADGE_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE = CARDS_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__IMAGE_FILTER = CARDS_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Missing Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__MISSING_IMAGE_FILTER = CARDS_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH = CARDS_UNIT_FEATURE_COUNT + 3;

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
	int SLIDER_UNIT__NAME = IMAGE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAY_LABEL = IMAGE_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAYED_ON = IMAGE_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CREATE_DEFAULT_URI_ELEMENT = IMAGE_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ROUTE_ACTUALS = IMAGE_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__REQUIRES_ROLE = IMAGE_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PURPOSE_SUMMARY = IMAGE_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__URI_ELEMENT = IMAGE_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ALTERNATIVE = IMAGE_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SECTION_CLASS = IMAGE_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__OMIT_CAPTION = IMAGE_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CAPTION_CLASS = IMAGE_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTENT_CLASS = IMAGE_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGE_DISPLAYED_ON = IMAGE_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DISPLAY_FIELDS = IMAGE_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SERVICES_USED = IMAGE_UNIT__SERVICES_USED;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HIDE_WHEN = IMAGE_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MESSAGE_WHEN_HIDDEN = IMAGE_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SUPPORT_ACTIONS = IMAGE_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HEADER = IMAGE_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FOOTER = IMAGE_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__HEADER_CLASS = IMAGE_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTROL_CLASS = IMAGE_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FOOTER_CLASS = IMAGE_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIELD_LIST_CLASS = IMAGE_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__UNIT_FIELD_LABEL_CLASS = IMAGE_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__UNIT_FIELD_VALUE_CLASS = IMAGE_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__UNIT_TITLE = IMAGE_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__ELEMENT_TITLE = IMAGE_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__TRUNCATE_ELEMENT_TITLE = IMAGE_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTENT_TYPE = IMAGE_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SELECT_TYPE = IMAGE_UNIT__SELECT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__CONTAINING_TYPE = IMAGE_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SELECTION = IMAGE_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIND_CONTAINER_SELECTION = IMAGE_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__OMIT_CONTAINER_LOAD = IMAGE_UNIT__OMIT_CONTAINER_LOAD;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIND_ELEMENT_SELECTION = IMAGE_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FILTER = IMAGE_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SUPPORTED_FILTERS = IMAGE_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__EMPTY_MESSAGE = IMAGE_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__OMIT_FIELD_LABELS = IMAGE_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__DEFAULT_PAGINATION_SIZE = IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MAXIMUM_PAGINATION_SIZE = IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_CONTROL_PLACEMENT = IMAGE_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_NPAGES = IMAGE_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_NPAGES = IMAGE_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_PAGE_LABEL = IMAGE_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__NEXT_PAGE_ICON_NAME = IMAGE_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_PAGE_LABEL = IMAGE_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PREVIOUS_PAGE_ICON_NAME = IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__USE_DISABLED_PAGE_LINKS = IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__USE_FIRST_LAST_PAGE_LINKS = IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIRST_PAGE_LABEL = IMAGE_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__FIRST_PAGE_ICON_NAME = IMAGE_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LAST_PAGE_LABEL = IMAGE_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__LAST_PAGE_ICON_NAME = IMAGE_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_CLASS = IMAGE_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_ELEMENT_CLASS = IMAGE_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__PAGINATION_ANCHOR_CLASS = IMAGE_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__IMAGE_PATH_FEATURE = IMAGE_UNIT__IMAGE_PATH_FEATURE;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__IMAGE_FILTER = IMAGE_UNIT__IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Missing Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MISSING_IMAGE_FILTER = IMAGE_UNIT__MISSING_IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__MISSING_IMAGE_PATH = IMAGE_UNIT__MISSING_IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__SHOW_TIME = IMAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT__TRANSITION_TIME = IMAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slider Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_FEATURE_COUNT = IMAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slider Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_UNIT_OPERATION_COUNT = IMAGE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NAME = IMAGE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAY_LABEL = IMAGE_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAYED_ON = IMAGE_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CREATE_DEFAULT_URI_ELEMENT = IMAGE_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ROUTE_ACTUALS = IMAGE_UNIT__ROUTE_ACTUALS;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__REQUIRES_ROLE = IMAGE_UNIT__REQUIRES_ROLE;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PURPOSE_SUMMARY = IMAGE_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__URI_ELEMENT = IMAGE_UNIT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ALTERNATIVE = IMAGE_UNIT__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SECTION_CLASS = IMAGE_UNIT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__OMIT_CAPTION = IMAGE_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CAPTION_CLASS = IMAGE_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTENT_CLASS = IMAGE_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGE_DISPLAYED_ON = IMAGE_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DISPLAY_FIELDS = IMAGE_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SERVICES_USED = IMAGE_UNIT__SERVICES_USED;

	/**
	 * The feature id for the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HIDE_WHEN = IMAGE_UNIT__HIDE_WHEN;

	/**
	 * The feature id for the '<em><b>Message When Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MESSAGE_WHEN_HIDDEN = IMAGE_UNIT__MESSAGE_WHEN_HIDDEN;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SUPPORT_ACTIONS = IMAGE_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HEADER = IMAGE_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FOOTER = IMAGE_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__HEADER_CLASS = IMAGE_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTROL_CLASS = IMAGE_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FOOTER_CLASS = IMAGE_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIELD_LIST_CLASS = IMAGE_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__UNIT_FIELD_LABEL_CLASS = IMAGE_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__UNIT_FIELD_VALUE_CLASS = IMAGE_UNIT__UNIT_FIELD_VALUE_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__UNIT_TITLE = IMAGE_UNIT__UNIT_TITLE;

	/**
	 * The feature id for the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__ELEMENT_TITLE = IMAGE_UNIT__ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Truncate Element Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__TRUNCATE_ELEMENT_TITLE = IMAGE_UNIT__TRUNCATE_ELEMENT_TITLE;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTENT_TYPE = IMAGE_UNIT__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SELECT_TYPE = IMAGE_UNIT__SELECT_TYPE;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__CONTAINING_TYPE = IMAGE_UNIT__CONTAINING_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SELECTION = IMAGE_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIND_CONTAINER_SELECTION = IMAGE_UNIT__FIND_CONTAINER_SELECTION;

	/**
	 * The feature id for the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__OMIT_CONTAINER_LOAD = IMAGE_UNIT__OMIT_CONTAINER_LOAD;

	/**
	 * The feature id for the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIND_ELEMENT_SELECTION = IMAGE_UNIT__FIND_ELEMENT_SELECTION;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FILTER = IMAGE_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Supported Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SUPPORTED_FILTERS = IMAGE_UNIT__SUPPORTED_FILTERS;

	/**
	 * The feature id for the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__EMPTY_MESSAGE = IMAGE_UNIT__EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__OMIT_FIELD_LABELS = IMAGE_UNIT__OMIT_FIELD_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__DEFAULT_PAGINATION_SIZE = IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MAXIMUM_PAGINATION_SIZE = IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_CONTROL_PLACEMENT = IMAGE_UNIT__PAGINATION_CONTROL_PLACEMENT;

	/**
	 * The feature id for the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_NPAGES = IMAGE_UNIT__NEXT_NPAGES;

	/**
	 * The feature id for the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_NPAGES = IMAGE_UNIT__PREVIOUS_NPAGES;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_PAGE_LABEL = IMAGE_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__NEXT_PAGE_ICON_NAME = IMAGE_UNIT__NEXT_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_PAGE_LABEL = IMAGE_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PREVIOUS_PAGE_ICON_NAME = IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__USE_DISABLED_PAGE_LINKS = IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__USE_FIRST_LAST_PAGE_LINKS = IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIRST_PAGE_LABEL = IMAGE_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>First Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FIRST_PAGE_ICON_NAME = IMAGE_UNIT__FIRST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LAST_PAGE_LABEL = IMAGE_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__LAST_PAGE_ICON_NAME = IMAGE_UNIT__LAST_PAGE_ICON_NAME;

	/**
	 * The feature id for the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_CLASS = IMAGE_UNIT__PAGINATION_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_ELEMENT_CLASS = IMAGE_UNIT__PAGINATION_ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__PAGINATION_ANCHOR_CLASS = IMAGE_UNIT__PAGINATION_ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__IMAGE_PATH_FEATURE = IMAGE_UNIT__IMAGE_PATH_FEATURE;

	/**
	 * The feature id for the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__IMAGE_FILTER = IMAGE_UNIT__IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Missing Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MISSING_IMAGE_FILTER = IMAGE_UNIT__MISSING_IMAGE_FILTER;

	/**
	 * The feature id for the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__MISSING_IMAGE_PATH = IMAGE_UNIT__MISSING_IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Full Size Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__FULL_SIZE_FILTER = IMAGE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__SHOW_TIME = IMAGE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT__TRANSITION_TIME = IMAGE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gallery Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_FEATURE_COUNT = IMAGE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gallery Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_UNIT_OPERATION_COUNT = IMAGE_UNIT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CREATE_DEFAULT_URI_ELEMENT = DYNAMIC_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ROUTE_ACTUALS = DYNAMIC_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTENT_CLASS = DYNAMIC_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PAGE_DISPLAYED_ON = DYNAMIC_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SERVICES_USED = DYNAMIC_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FIELD_LIST_CLASS = DYNAMIC_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__UNIT_FIELD_LABEL_CLASS = DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__UNIT_FIELD_VALUE_CLASS = DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS;

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
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CREATE_DEFAULT_URI_ELEMENT = CONTROL_UNIT__CREATE_DEFAULT_URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Route Actuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ROUTE_ACTUALS = CONTROL_UNIT__ROUTE_ACTUALS;

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
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTENT_CLASS = CONTROL_UNIT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__PAGE_DISPLAYED_ON = CONTROL_UNIT__PAGE_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Services Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SERVICES_USED = CONTROL_UNIT__SERVICES_USED;

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
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Field List Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FIELD_LIST_CLASS = CONTROL_UNIT__FIELD_LIST_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Label Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__UNIT_FIELD_LABEL_CLASS = CONTROL_UNIT__UNIT_FIELD_LABEL_CLASS;

	/**
	 * The feature id for the '<em><b>Unit Field Value Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__UNIT_FIELD_VALUE_CLASS = CONTROL_UNIT__UNIT_FIELD_VALUE_CLASS;

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
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Action Navigation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER__ACTION_NAVIGATION_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Default Local Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER__DEFAULT_LOCAL_ANCHOR_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Inline Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inline Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__USED_BY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__ICON_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISABLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISPLAY_WHEN = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__HEADER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__FOOTER = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__ANCHOR_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__HEADER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__FOOTER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Inline Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Inline Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__ICON_NAME = INLINE_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__ANCHOR_CLASS = INLINE_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__TARGET = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__VALUE_PATH = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__ICON_NAME = INLINE_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__ANCHOR_CLASS = INLINE_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DESTINATION = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__CONFIRM_MESSAGE = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__REQUIRES_ROLE = INLINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__ENABLE_WHEN = INLINE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__URI_ELEMENT = INLINE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__ICON_NAME = INLINE_ACTION__ICON_NAME;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISABLE = INLINE_ACTION__DISABLE;

	/**
	 * The feature id for the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISPLAY_WHEN = INLINE_ACTION__DISPLAY_WHEN;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Anchor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__ANCHOR_CLASS = INLINE_ACTION__ANCHOR_CLASS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__OPERATION = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FILE_EXTENSION = INLINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__REQUIRES_ROLE = INLINE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__ENABLE_WHEN = INLINE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__URI_ELEMENT = INLINE_ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Feature Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Feature Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION_OPERATION_COUNT = INLINE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.InputTechnologies <em>Input Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.InputTechnologies
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInputTechnologies()
	 * @generated
	 */
	int INPUT_TECHNOLOGIES = 59;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.AjaxTechnologies <em>Ajax Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.AjaxTechnologies
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getAjaxTechnologies()
	 * @generated
	 */
	int AJAX_TECHNOLOGIES = 60;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.PageTopMenuOptions
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPageTopMenuOptions()
	 * @generated
	 */
	int PAGE_TOP_MENU_OPTIONS = 61;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCollectionDisplayOptions()
	 * @generated
	 */
	int COLLECTION_DISPLAY_OPTIONS = 62;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.PaginationControlPlacements <em>Pagination Control Placements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.PaginationControlPlacements
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPaginationControlPlacements()
	 * @generated
	 */
	int PAGINATION_CONTROL_PLACEMENTS = 63;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.webui.IndexDisplayOption <em>Index Display Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.webui.IndexDisplayOption
	 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getIndexDisplayOption()
	 * @generated
	 */
	int INDEX_DISPLAY_OPTION = 64;


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
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.WebUI#getMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menus</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getMenus()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_Menus();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.WebUI#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getPages()
	 * @see #getWebUI()
	 * @generated
	 */
	EReference getWebUI_Pages();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardClass <em>Default Card Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Card Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultCardClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardHeaderClass <em>Default Card Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Card Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardHeaderClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultCardHeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardBodyClass <em>Default Card Body Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Card Body Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardBodyClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultCardBodyClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardFooterClass <em>Default Card Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Card Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardFooterClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultCardFooterClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultBadgeClass <em>Default Badge Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Badge Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultBadgeClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultBadgeClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultActionNavigationClass <em>Default Action Navigation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Action Navigation Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultActionNavigationClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultActionNavigationClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultAnchorClass <em>Default Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultAnchorClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultAnchorClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldListClass <em>Default Field List Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Field List Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldListClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultFieldListClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldLabelClass <em>Default Field Label Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Field Label Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldLabelClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultFieldLabelClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldValueClass <em>Default Field Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Field Value Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldValueClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultFieldValueClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputGroupClass <em>Default Input Group Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Input Group Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputGroupClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultInputGroupClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputLabelClass <em>Default Input Label Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Input Label Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputLabelClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultInputLabelClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputValueClass <em>Default Input Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Input Value Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputValueClass()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_DefaultInputValueClass();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getInputTechnology <em>Input Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Technology</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getInputTechnology()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_InputTechnology();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.WebUI#getAjaxTechnology <em>Ajax Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ajax Technology</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.WebUI#getAjaxTechnology()
	 * @see #getWebUI()
	 * @generated
	 */
	EAttribute getWebUI_AjaxTechnology();

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
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ActionMenuEntry#getQuery()
	 * @see #getActionMenuEntry()
	 * @generated
	 */
	EReference getActionMenuEntry_Query();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.Query#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Query#getFilter()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.Query#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Query#getParameters()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Parameters();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.QueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.QueryParameter
	 * @generated
	 */
	EClass getQueryParameter();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.QueryParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.QueryParameter#getValue()
	 * @see #getQueryParameter()
	 * @generated
	 */
	EAttribute getQueryParameter_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.Page#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Web UI</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Page#getWebUI()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_WebUI();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.Page#getParentPage <em>Parent Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Page</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Page#getParentPage()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ParentPage();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.webui.Page#getChildPages <em>Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Pages</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Page#getChildPages()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ChildPages();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.Page#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Page#getUnits()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Units();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Page#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Page#getUriElement()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Page#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Page#getStyleClass()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_StyleClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.PageLink <em>Page Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Link</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PageLink
	 * @generated
	 */
	EClass getPageLink();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.PageLink#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Page</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.PageLink#getTargetPage()
	 * @see #getPageLink()
	 * @generated
	 */
	EReference getPageLink_TargetPage();

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
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getDisplayedOn()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_DisplayedOn();

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
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getRouteActuals <em>Route Actuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Actuals</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getRouteActuals()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_RouteActuals();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getCaptionClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getContentClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_ContentClass();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getPageDisplayedOn <em>Page Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Displayed On</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ContentUnit#getPageDisplayedOn()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_PageDisplayedOn();

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
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getServicesUsed <em>Services Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services Used</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getServicesUsed()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_ServicesUsed();

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
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getSupportActions <em>Support Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Support Actions</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getSupportActions()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_SupportActions();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeaderClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getControlClass <em>Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getControlClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_ControlClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooterClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_FooterClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFieldListClass <em>Field List Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field List Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getFieldListClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_FieldListClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getUnitFieldLabelClass <em>Unit Field Label Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Field Label Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getUnitFieldLabelClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_UnitFieldLabelClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getUnitFieldValueClass <em>Unit Field Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Field Value Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getUnitFieldValueClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_UnitFieldValueClass();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayClass <em>Display Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayClass()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_DisplayClass();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation <em>Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation
	 * @generated
	 */
	EClass getUnitAssociation();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation#isIsSourceAssociation()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EAttribute getUnitAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation#getSourceEntity()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation#getTargetEntity()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_TargetEntity();

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
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getFilteredOptions <em>Filtered Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filtered Options</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitAssociation#getFilteredOptions()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_FilteredOptions();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.AssociationReference <em>Association Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Reference</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.AssociationReference
	 * @generated
	 */
	EClass getAssociationReference();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.AssociationReference#getName()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EAttribute getAssociationReference_Name();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.AssociationReference#getAssociation()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_Association();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getValueDisplay <em>Value Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Display</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.AssociationReference#getValueDisplay()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_ValueDisplay();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.AssociationReference#getChildFeature()
	 * @see #getAssociationReference()
	 * @generated
	 */
	EReference getAssociationReference_ChildFeature();

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
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.ChildPath#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPath#getPartOf()
	 * @see #getChildPath()
	 * @generated
	 */
	EReference getChildPath_PartOf();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ChildPathAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPathAttribute#getName()
	 * @see #getChildPathAttribute()
	 * @generated
	 */
	EAttribute getChildPathAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ChildPathAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPathAttribute#getAttribute()
	 * @see #getChildPathAttribute()
	 * @generated
	 */
	EReference getChildPathAttribute_Attribute();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.ChildPathAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPathAssociation#isIsSourceAssociation()
	 * @see #getChildPathAssociation()
	 * @generated
	 */
	EAttribute getChildPathAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ChildPathAssociation#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPathAssociation#getSourceEntity()
	 * @see #getChildPathAssociation()
	 * @generated
	 */
	EReference getChildPathAssociation_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ChildPathAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ChildPathAssociation#getTargetEntity()
	 * @see #getChildPathAssociation()
	 * @generated
	 */
	EReference getChildPathAssociation_TargetEntity();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.FeaturePathAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathAttribute#getName()
	 * @see #getFeaturePathAttribute()
	 * @generated
	 */
	EAttribute getFeaturePathAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.FeaturePathAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathAttribute#getAttribute()
	 * @see #getFeaturePathAttribute()
	 * @generated
	 */
	EReference getFeaturePathAttribute_Attribute();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#isIsSourceAssociation()
	 * @see #getFeaturePathAssociation()
	 * @generated
	 */
	EAttribute getFeaturePathAssociation_IsSourceAssociation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#getSourceEntity()
	 * @see #getFeaturePathAssociation()
	 * @generated
	 */
	EReference getFeaturePathAssociation_SourceEntity();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#getTargetEntity()
	 * @see #getFeaturePathAssociation()
	 * @generated
	 */
	EReference getFeaturePathAssociation_TargetEntity();

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
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getMustMatch <em>Must Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Must Match</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getMustMatch()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EReference getInterfaceField_MustMatch();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InterfaceField#getInputClass()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_InputClass();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.CaptchaField <em>Captcha Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Captcha Field</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CaptchaField
	 * @generated
	 */
	EClass getCaptchaField();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.UnitSupportAction <em>Unit Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Support Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitSupportAction
	 * @generated
	 */
	EClass getUnitSupportAction();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitSupportAction#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitSupportAction#isDisable()
	 * @see #getUnitSupportAction()
	 * @generated
	 */
	EAttribute getUnitSupportAction_Disable();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.UnitSupportAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.UnitSupportAction#getConfirmMessage()
	 * @see #getUnitSupportAction()
	 * @generated
	 */
	EAttribute getUnitSupportAction_ConfirmMessage();

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
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.SingletonUnit#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.SingletonUnit#getContentType()
	 * @see #getSingletonUnit()
	 * @generated
	 */
	EReference getSingletonUnit_ContentType();

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
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getContentType()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_ContentType();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSelectType <em>Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getSelectType()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_SelectType();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Type</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getContainingType()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EReference getCollectionUnit_ContainingType();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isOmitContainerLoad <em>Omit Container Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Container Load</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#isOmitContainerLoad()
	 * @see #getCollectionUnit()
	 * @generated
	 */
	EAttribute getCollectionUnit_OmitContainerLoad();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.EditUnit#isCustomiseValues <em>Customise Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customise Values</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.EditUnit#isCustomiseValues()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_CustomiseValues();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getCreateUriElement <em>Create Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CreateUpdateUnit#getCreateUriElement()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_CreateUriElement();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.IndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Unit</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.IndexUnit
	 * @generated
	 */
	EClass getIndexUnit();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.IndexUnit#getDisplayOption <em>Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Option</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.IndexUnit#getDisplayOption()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_DisplayOption();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.IndexUnit#getRowClasses <em>Row Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Classes</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.IndexUnit#getRowClasses()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_RowClasses();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getRowClass <em>Row Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getRowClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_RowClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getColumnClass <em>Column Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getColumnClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_ColumnClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardClass <em>Card Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getCardClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_CardClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardHeaderClass <em>Card Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getCardHeaderClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_CardHeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardBodyClass <em>Card Body Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Body Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getCardBodyClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_CardBodyClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardFooterClass <em>Card Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getCardFooterClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_CardFooterClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getUnitBadgeClass <em>Unit Badge Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Badge Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getUnitBadgeClass()
	 * @see #getCardsUnit()
	 * @generated
	 */
	EAttribute getCardsUnit_UnitBadgeClass();

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
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getMissingImageFilter <em>Missing Image Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Missing Image Filter</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.ImageUnit#getMissingImageFilter()
	 * @see #getImageUnit()
	 * @generated
	 */
	EReference getImageUnit_MissingImageFilter();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer <em>Inline Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Action Container</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineActionContainer
	 * @generated
	 */
	EClass getInlineActionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineActionContainer#getActions()
	 * @see #getInlineActionContainer()
	 * @generated
	 */
	EReference getInlineActionContainer_Actions();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer#getActionNavigationClass <em>Action Navigation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Navigation Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineActionContainer#getActionNavigationClass()
	 * @see #getInlineActionContainer()
	 * @generated
	 */
	EAttribute getInlineActionContainer_ActionNavigationClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer#getDefaultLocalAnchorClass <em>Default Local Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Local Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineActionContainer#getDefaultLocalAnchorClass()
	 * @see #getInlineActionContainer()
	 * @generated
	 */
	EAttribute getInlineActionContainer_DefaultLocalAnchorClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.InlineAction <em>Inline Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction
	 * @generated
	 */
	EClass getInlineAction();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Used By</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getUsedBy()
	 * @see #getInlineAction()
	 * @generated
	 */
	EReference getInlineAction_UsedBy();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getIconName <em>Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Name</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getIconName()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_IconName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineAction#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#isDisable()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Disable();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getDisplayWhen <em>Display When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getDisplayWhen()
	 * @see #getInlineAction()
	 * @generated
	 */
	EReference getInlineAction_DisplayWhen();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getHeader()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Header();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getFooter()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Footer();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getAnchorClass <em>Anchor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getAnchorClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_AnchorClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getHeaderClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.InlineAction#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InlineAction#getFooterClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_FooterClass();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DeleteAction
	 * @generated
	 */
	EClass getDeleteAction();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DeleteAction#getDestination()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EReference getDeleteAction_Destination();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DeleteAction#getConfirmMessage()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_ConfirmMessage();

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
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getEnableWhen <em>Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.DeleteAction#getEnableWhen()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EReference getDeleteAction_EnableWhen();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.webui.FeatureSupportAction <em>Feature Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Support Action</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeatureSupportAction
	 * @generated
	 */
	EClass getFeatureSupportAction();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getOperation()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EReference getFeatureSupportAction_Operation();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getConfirmMessage()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_ConfirmMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getFileExtension()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_FileExtension();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getRequiresRole <em>Requires Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Role</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getRequiresRole()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_RequiresRole();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getEnableWhen <em>Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enable When</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getEnableWhen()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EReference getFeatureSupportAction_EnableWhen();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.FeatureSupportAction#getUriElement()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_UriElement();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.webui.Badge#getBadgeClass <em>Badge Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Badge Class</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.Badge#getBadgeClass()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_BadgeClass();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.InputTechnologies <em>Input Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Technologies</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.InputTechnologies
	 * @generated
	 */
	EEnum getInputTechnologies();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.AjaxTechnologies <em>Ajax Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ajax Technologies</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.AjaxTechnologies
	 * @generated
	 */
	EEnum getAjaxTechnologies();

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
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.webui.IndexDisplayOption <em>Index Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Index Display Option</em>'.
	 * @see work.andycarpenter.webgen.pims.webui.IndexDisplayOption
	 * @generated
	 */
	EEnum getIndexDisplayOption();

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
		 * The meta object literal for the '<em><b>Services</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__SERVICES = eINSTANCE.getWebUI_Services();

		/**
		 * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__MENUS = eINSTANCE.getWebUI_Menus();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_UI__PAGES = eINSTANCE.getWebUI_Pages();

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
		 * The meta object literal for the '<em><b>Default Card Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_CARD_CLASS = eINSTANCE.getWebUI_DefaultCardClass();

		/**
		 * The meta object literal for the '<em><b>Default Card Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_CARD_HEADER_CLASS = eINSTANCE.getWebUI_DefaultCardHeaderClass();

		/**
		 * The meta object literal for the '<em><b>Default Card Body Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_CARD_BODY_CLASS = eINSTANCE.getWebUI_DefaultCardBodyClass();

		/**
		 * The meta object literal for the '<em><b>Default Card Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_CARD_FOOTER_CLASS = eINSTANCE.getWebUI_DefaultCardFooterClass();

		/**
		 * The meta object literal for the '<em><b>Default Badge Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_BADGE_CLASS = eINSTANCE.getWebUI_DefaultBadgeClass();

		/**
		 * The meta object literal for the '<em><b>Default Action Navigation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS = eINSTANCE.getWebUI_DefaultActionNavigationClass();

		/**
		 * The meta object literal for the '<em><b>Default Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_ANCHOR_CLASS = eINSTANCE.getWebUI_DefaultAnchorClass();

		/**
		 * The meta object literal for the '<em><b>Default Field List Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_FIELD_LIST_CLASS = eINSTANCE.getWebUI_DefaultFieldListClass();

		/**
		 * The meta object literal for the '<em><b>Default Field Label Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_FIELD_LABEL_CLASS = eINSTANCE.getWebUI_DefaultFieldLabelClass();

		/**
		 * The meta object literal for the '<em><b>Default Field Value Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_FIELD_VALUE_CLASS = eINSTANCE.getWebUI_DefaultFieldValueClass();

		/**
		 * The meta object literal for the '<em><b>Default Input Group Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_INPUT_GROUP_CLASS = eINSTANCE.getWebUI_DefaultInputGroupClass();

		/**
		 * The meta object literal for the '<em><b>Default Input Label Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_INPUT_LABEL_CLASS = eINSTANCE.getWebUI_DefaultInputLabelClass();

		/**
		 * The meta object literal for the '<em><b>Default Input Value Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_INPUT_VALUE_CLASS = eINSTANCE.getWebUI_DefaultInputValueClass();

		/**
		 * The meta object literal for the '<em><b>Default Maximum Upload Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE = eINSTANCE.getWebUI_DefaultMaximumUploadSize();

		/**
		 * The meta object literal for the '<em><b>Input Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__INPUT_TECHNOLOGY = eINSTANCE.getWebUI_InputTechnology();

		/**
		 * The meta object literal for the '<em><b>Ajax Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_UI__AJAX_TECHNOLOGY = eINSTANCE.getWebUI_AjaxTechnology();

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
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MENU_ENTRY__QUERY = eINSTANCE.getActionMenuEntry_Query();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.QueryImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__FILTER = eINSTANCE.getQuery_Filter();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__PARAMETERS = eINSTANCE.getQuery_Parameters();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.QueryParameterImpl <em>Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.QueryParameterImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getQueryParameter()
		 * @generated
		 */
		EClass QUERY_PARAMETER = eINSTANCE.getQueryParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAMETER__VALUE = eINSTANCE.getQueryParameter_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PageImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Web UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__WEB_UI = eINSTANCE.getPage_WebUI();

		/**
		 * The meta object literal for the '<em><b>Parent Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PARENT_PAGE = eINSTANCE.getPage_ParentPage();

		/**
		 * The meta object literal for the '<em><b>Child Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CHILD_PAGES = eINSTANCE.getPage_ChildPages();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__UNITS = eINSTANCE.getPage_Units();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__URI_ELEMENT = eINSTANCE.getPage_UriElement();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__STYLE_CLASS = eINSTANCE.getPage_StyleClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.PageLinkImpl <em>Page Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.PageLinkImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getPageLink()
		 * @generated
		 */
		EClass PAGE_LINK = eINSTANCE.getPageLink();

		/**
		 * The meta object literal for the '<em><b>Target Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_LINK__TARGET_PAGE = eINSTANCE.getPageLink_TargetPage();

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
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__DISPLAYED_ON = eINSTANCE.getContentUnit_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Create Default Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT = eINSTANCE.getContentUnit_CreateDefaultUriElement();

		/**
		 * The meta object literal for the '<em><b>Route Actuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__ROUTE_ACTUALS = eINSTANCE.getContentUnit_RouteActuals();

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
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CAPTION_CLASS = eINSTANCE.getContentUnit_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CONTENT_CLASS = eINSTANCE.getContentUnit_ContentClass();

		/**
		 * The meta object literal for the '<em><b>Page Displayed On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__PAGE_DISPLAYED_ON = eINSTANCE.getContentUnit_PageDisplayedOn();

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
		 * The meta object literal for the '<em><b>Display Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__DISPLAY_FIELDS = eINSTANCE.getDynamicUnit_DisplayFields();

		/**
		 * The meta object literal for the '<em><b>Services Used</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__SERVICES_USED = eINSTANCE.getDynamicUnit_ServicesUsed();

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
		 * The meta object literal for the '<em><b>Support Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__SUPPORT_ACTIONS = eINSTANCE.getDynamicUnit_SupportActions();

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
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HEADER_CLASS = eINSTANCE.getDynamicUnit_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__CONTROL_CLASS = eINSTANCE.getDynamicUnit_ControlClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FOOTER_CLASS = eINSTANCE.getDynamicUnit_FooterClass();

		/**
		 * The meta object literal for the '<em><b>Field List Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FIELD_LIST_CLASS = eINSTANCE.getDynamicUnit_FieldListClass();

		/**
		 * The meta object literal for the '<em><b>Unit Field Label Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS = eINSTANCE.getDynamicUnit_UnitFieldLabelClass();

		/**
		 * The meta object literal for the '<em><b>Unit Field Value Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS = eINSTANCE.getDynamicUnit_UnitFieldValueClass();

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
		 * The meta object literal for the '<em><b>Display Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__DISPLAY_CLASS = eINSTANCE.getUnitFeature_DisplayClass();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitAssociation()
		 * @generated
		 */
		EClass UNIT_ASSOCIATION = eINSTANCE.getUnitAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getUnitAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__SOURCE_ENTITY = eINSTANCE.getUnitAssociation_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getUnitAssociation_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__OPTIONS = eINSTANCE.getUnitAssociation_Options();

		/**
		 * The meta object literal for the '<em><b>Filtered Options</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__FILTERED_OPTIONS = eINSTANCE.getUnitAssociation_FilteredOptions();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.AssociationReference <em>Association Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.AssociationReference
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getAssociationReference()
		 * @generated
		 */
		EClass ASSOCIATION_REFERENCE = eINSTANCE.getAssociationReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_REFERENCE__NAME = eINSTANCE.getAssociationReference_Name();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__ASSOCIATION = eINSTANCE.getAssociationReference_Association();

		/**
		 * The meta object literal for the '<em><b>Value Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__VALUE_DISPLAY = eINSTANCE.getAssociationReference_ValueDisplay();

		/**
		 * The meta object literal for the '<em><b>Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REFERENCE__CHILD_FEATURE = eINSTANCE.getAssociationReference_ChildFeature();

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
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH__PART_OF = eINSTANCE.getChildPath_PartOf();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD_PATH_ATTRIBUTE__NAME = eINSTANCE.getChildPathAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getChildPathAttribute_Attribute();

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
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getChildPathAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH_ASSOCIATION__SOURCE_ENTITY = eINSTANCE.getChildPathAssociation_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_PATH_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getChildPathAssociation_TargetEntity();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATH_ATTRIBUTE__NAME = eINSTANCE.getFeaturePathAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getFeaturePathAttribute_Attribute();

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
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getFeaturePathAssociation_IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY = eINSTANCE.getFeaturePathAssociation_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_ASSOCIATION__TARGET_ENTITY = eINSTANCE.getFeaturePathAssociation_TargetEntity();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATH_LABEL__NAME = eINSTANCE.getFeaturePathLabel_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_LABEL__LABEL = eINSTANCE.getFeaturePathLabel_Label();

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
		 * The meta object literal for the '<em><b>Must Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_FIELD__MUST_MATCH = eINSTANCE.getInterfaceField_MustMatch();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__INPUT_CLASS = eINSTANCE.getInterfaceField_InputClass();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__PLACEHOLDER = eINSTANCE.getInterfaceField_Placeholder();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.CaptchaFieldImpl <em>Captcha Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.CaptchaFieldImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getCaptchaField()
		 * @generated
		 */
		EClass CAPTCHA_FIELD = eINSTANCE.getCaptchaField();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.UnitSupportActionImpl <em>Unit Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.UnitSupportActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getUnitSupportAction()
		 * @generated
		 */
		EClass UNIT_SUPPORT_ACTION = eINSTANCE.getUnitSupportAction();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_SUPPORT_ACTION__DISABLE = eINSTANCE.getUnitSupportAction_Disable();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE = eINSTANCE.getUnitSupportAction_ConfirmMessage();

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
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLETON_UNIT__CONTENT_TYPE = eINSTANCE.getSingletonUnit_ContentType();

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
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__CONTENT_TYPE = eINSTANCE.getCollectionUnit_ContentType();

		/**
		 * The meta object literal for the '<em><b>Select Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__SELECT_TYPE = eINSTANCE.getCollectionUnit_SelectType();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_UNIT__CONTAINING_TYPE = eINSTANCE.getCollectionUnit_ContainingType();

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
		 * The meta object literal for the '<em><b>Omit Container Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_UNIT__OMIT_CONTAINER_LOAD = eINSTANCE.getCollectionUnit_OmitContainerLoad();

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
		 * The meta object literal for the '<em><b>Customise Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CUSTOMISE_VALUES = eINSTANCE.getEditUnit_CustomiseValues();

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
		 * The meta object literal for the '<em><b>Create Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT = eINSTANCE.getCreateUpdateUnit_CreateUriElement();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.IndexUnitImpl <em>Index Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.IndexUnitImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getIndexUnit()
		 * @generated
		 */
		EClass INDEX_UNIT = eINSTANCE.getIndexUnit();

		/**
		 * The meta object literal for the '<em><b>Display Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__DISPLAY_OPTION = eINSTANCE.getIndexUnit_DisplayOption();

		/**
		 * The meta object literal for the '<em><b>Row Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__ROW_CLASSES = eINSTANCE.getIndexUnit_RowClasses();

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
		 * The meta object literal for the '<em><b>Row Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__ROW_CLASS = eINSTANCE.getCardsUnit_RowClass();

		/**
		 * The meta object literal for the '<em><b>Column Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__COLUMN_CLASS = eINSTANCE.getCardsUnit_ColumnClass();

		/**
		 * The meta object literal for the '<em><b>Card Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__CARD_CLASS = eINSTANCE.getCardsUnit_CardClass();

		/**
		 * The meta object literal for the '<em><b>Card Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__CARD_HEADER_CLASS = eINSTANCE.getCardsUnit_CardHeaderClass();

		/**
		 * The meta object literal for the '<em><b>Card Body Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__CARD_BODY_CLASS = eINSTANCE.getCardsUnit_CardBodyClass();

		/**
		 * The meta object literal for the '<em><b>Card Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__CARD_FOOTER_CLASS = eINSTANCE.getCardsUnit_CardFooterClass();

		/**
		 * The meta object literal for the '<em><b>Unit Badge Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS_UNIT__UNIT_BADGE_CLASS = eINSTANCE.getCardsUnit_UnitBadgeClass();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.ImageUnitImpl <em>Image Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.ImageUnitImpl
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
		 * The meta object literal for the '<em><b>Missing Image Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_UNIT__MISSING_IMAGE_FILTER = eINSTANCE.getImageUnit_MissingImageFilter();

		/**
		 * The meta object literal for the '<em><b>Missing Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UNIT__MISSING_IMAGE_PATH = eINSTANCE.getImageUnit_MissingImagePath();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.InlineActionContainer <em>Inline Action Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.InlineActionContainer
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInlineActionContainer()
		 * @generated
		 */
		EClass INLINE_ACTION_CONTAINER = eINSTANCE.getInlineActionContainer();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION_CONTAINER__ACTIONS = eINSTANCE.getInlineActionContainer_Actions();

		/**
		 * The meta object literal for the '<em><b>Action Navigation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION_CONTAINER__ACTION_NAVIGATION_CLASS = eINSTANCE.getInlineActionContainer_ActionNavigationClass();

		/**
		 * The meta object literal for the '<em><b>Default Local Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION_CONTAINER__DEFAULT_LOCAL_ANCHOR_CLASS = eINSTANCE.getInlineActionContainer_DefaultLocalAnchorClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl <em>Inline Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInlineAction()
		 * @generated
		 */
		EClass INLINE_ACTION = eINSTANCE.getInlineAction();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION__USED_BY = eINSTANCE.getInlineAction_UsedBy();

		/**
		 * The meta object literal for the '<em><b>Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__ICON_NAME = eINSTANCE.getInlineAction_IconName();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__DISABLE = eINSTANCE.getInlineAction_Disable();

		/**
		 * The meta object literal for the '<em><b>Display When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION__DISPLAY_WHEN = eINSTANCE.getInlineAction_DisplayWhen();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__HEADER = eINSTANCE.getInlineAction_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__FOOTER = eINSTANCE.getInlineAction_Footer();

		/**
		 * The meta object literal for the '<em><b>Anchor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__ANCHOR_CLASS = eINSTANCE.getInlineAction_AnchorClass();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__HEADER_CLASS = eINSTANCE.getInlineAction_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__FOOTER_CLASS = eINSTANCE.getInlineAction_FooterClass();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.DeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.DeleteActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getDeleteAction()
		 * @generated
		 */
		EClass DELETE_ACTION = eINSTANCE.getDeleteAction();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ACTION__DESTINATION = eINSTANCE.getDeleteAction_Destination();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__CONFIRM_MESSAGE = eINSTANCE.getDeleteAction_ConfirmMessage();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__REQUIRES_ROLE = eINSTANCE.getDeleteAction_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Enable When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ACTION__ENABLE_WHEN = eINSTANCE.getDeleteAction_EnableWhen();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__URI_ELEMENT = eINSTANCE.getDeleteAction_UriElement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.impl.FeatureSupportActionImpl <em>Feature Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.impl.FeatureSupportActionImpl
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getFeatureSupportAction()
		 * @generated
		 */
		EClass FEATURE_SUPPORT_ACTION = eINSTANCE.getFeatureSupportAction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SUPPORT_ACTION__OPERATION = eINSTANCE.getFeatureSupportAction_Operation();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE = eINSTANCE.getFeatureSupportAction_ConfirmMessage();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__FILE_EXTENSION = eINSTANCE.getFeatureSupportAction_FileExtension();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__REQUIRES_ROLE = eINSTANCE.getFeatureSupportAction_RequiresRole();

		/**
		 * The meta object literal for the '<em><b>Enable When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SUPPORT_ACTION__ENABLE_WHEN = eINSTANCE.getFeatureSupportAction_EnableWhen();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__URI_ELEMENT = eINSTANCE.getFeatureSupportAction_UriElement();

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
		 * The meta object literal for the '<em><b>Badge Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__BADGE_CLASS = eINSTANCE.getBadge_BadgeClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.InputTechnologies <em>Input Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.InputTechnologies
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getInputTechnologies()
		 * @generated
		 */
		EEnum INPUT_TECHNOLOGIES = eINSTANCE.getInputTechnologies();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.AjaxTechnologies <em>Ajax Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.AjaxTechnologies
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getAjaxTechnologies()
		 * @generated
		 */
		EEnum AJAX_TECHNOLOGIES = eINSTANCE.getAjaxTechnologies();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.webui.IndexDisplayOption <em>Index Display Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.webui.IndexDisplayOption
		 * @see work.andycarpenter.webgen.pims.webui.impl.WebuiPackageImpl#getIndexDisplayOption()
		 * @generated
		 */
		EEnum INDEX_DISPLAY_OPTION = eINSTANCE.getIndexDisplayOption();

	}

} //WebuiPackage
