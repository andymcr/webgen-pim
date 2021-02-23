/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.persistence.Persistence;
import work.andycarpenter.webgen.pims.service.Services;

import work.andycarpenter.webgen.pims.webui.AjaxTechnologies;
import work.andycarpenter.webgen.pims.webui.InputTechnologies;
import work.andycarpenter.webgen.pims.webui.Menu;
import work.andycarpenter.webgen.pims.webui.Page;
import work.andycarpenter.webgen.pims.webui.WebUI;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getServices <em>Services</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCancelLabel <em>Default Cancel Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultSaveLabel <em>Default Save Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultStyleClass <em>Default Style Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultSectionClass <em>Default Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCaptionClass <em>Default Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultContentClass <em>Default Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDetailsContentClass <em>Default Details Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultIndexContentClass <em>Default Index Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCardsContentClass <em>Default Cards Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultFormContentClass <em>Default Form Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultSliderContentClass <em>Default Slider Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultGalleryContentClass <em>Default Gallery Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultStaticContentClass <em>Default Static Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultFieldListClass <em>Default Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultRowClass <em>Default Row Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultColumnClass <em>Default Column Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCardClass <em>Default Card Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCardHeaderClass <em>Default Card Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCardBodyClass <em>Default Card Body Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCardFooterClass <em>Default Card Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultBadgeClass <em>Default Badge Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultControlClass <em>Default Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDetailsControlClass <em>Default Details Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultIndexControlClass <em>Default Index Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCardsControlClass <em>Default Cards Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultFormControlClass <em>Default Form Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultSliderControlClass <em>Default Slider Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultGalleryControlClass <em>Default Gallery Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultStaticControlClass <em>Default Static Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultFieldLabelClass <em>Default Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultFieldValueClass <em>Default Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultInputGroupClass <em>Default Input Group Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultInputLabelClass <em>Default Input Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultInputValueClass <em>Default Input Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultActionNavigationClass <em>Default Action Navigation Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultAnchorClass <em>Default Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDetailsAnchorClass <em>Default Details Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultIndexAnchorClass <em>Default Index Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCardsAnchorClass <em>Default Cards Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultFormAnchorClass <em>Default Form Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultSliderAnchorClass <em>Default Slider Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultGalleryAnchorClass <em>Default Gallery Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultStaticAnchorClass <em>Default Static Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getAjaxTechnology <em>Ajax Technology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebUIImpl extends MinimalEObjectImpl.Container implements WebUI {
	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected Persistence persistence;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Services services;

	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The default value of the '{@link #getDefaultDateFormat() <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DATE_FORMAT_EDEFAULT = "jS F Y";

	/**
	 * The cached value of the '{@link #getDefaultDateFormat() <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultDateFormat = DEFAULT_DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTimeFormat() <em>Default Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TIME_FORMAT_EDEFAULT = "G.i";

	/**
	 * The cached value of the '{@link #getDefaultTimeFormat() <em>Default Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultTimeFormat = DEFAULT_TIME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDateTimeFormat() <em>Default Date Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DATE_TIME_FORMAT_EDEFAULT = "jS F Y G.i";

	/**
	 * The cached value of the '{@link #getDefaultDateTimeFormat() <em>Default Date Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultDateTimeFormat = DEFAULT_DATE_TIME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCancelLabel() <em>Default Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCancelLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CANCEL_LABEL_EDEFAULT = "Cancel";

	/**
	 * The cached value of the '{@link #getDefaultCancelLabel() <em>Default Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCancelLabel()
	 * @generated
	 * @ordered
	 */
	protected String defaultCancelLabel = DEFAULT_CANCEL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultSaveLabel() <em>Default Save Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSaveLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SAVE_LABEL_EDEFAULT = "Save";

	/**
	 * The cached value of the '{@link #getDefaultSaveLabel() <em>Default Save Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSaveLabel()
	 * @generated
	 * @ordered
	 */
	protected String defaultSaveLabel = DEFAULT_SAVE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultStyleClass() <em>Default Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_STYLE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultStyleClass() <em>Default Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultStyleClass = DEFAULT_STYLE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultSectionClass() <em>Default Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSectionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SECTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultSectionClass() <em>Default Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSectionClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultSectionClass = DEFAULT_SECTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCaptionClass() <em>Default Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CAPTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultCaptionClass() <em>Default Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultCaptionClass = DEFAULT_CAPTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultContentClass() <em>Default Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultContentClass() <em>Default Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultContentClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultContentClass = DEFAULT_CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDetailsContentClass() <em>Default Details Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DETAILS_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultDetailsContentClass() <em>Default Details Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsContentClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultDetailsContentClass = DEFAULT_DETAILS_CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultIndexContentClass() <em>Default Index Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIndexContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INDEX_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultIndexContentClass() <em>Default Index Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIndexContentClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultIndexContentClass = DEFAULT_INDEX_CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCardsContentClass() <em>Default Cards Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardsContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CARDS_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultCardsContentClass() <em>Default Cards Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardsContentClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultCardsContentClass = DEFAULT_CARDS_CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFormContentClass() <em>Default Form Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFormContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FORM_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultFormContentClass() <em>Default Form Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFormContentClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultFormContentClass = DEFAULT_FORM_CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultSliderContentClass() <em>Default Slider Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSliderContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SLIDER_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultSliderContentClass() <em>Default Slider Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSliderContentClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultSliderContentClass = DEFAULT_SLIDER_CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultGalleryContentClass() <em>Default Gallery Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGalleryContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_GALLERY_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultGalleryContentClass() <em>Default Gallery Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGalleryContentClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultGalleryContentClass = DEFAULT_GALLERY_CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultStaticContentClass() <em>Default Static Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStaticContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_STATIC_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultStaticContentClass() <em>Default Static Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStaticContentClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultStaticContentClass = DEFAULT_STATIC_CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFieldListClass() <em>Default Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FIELD_LIST_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultFieldListClass() <em>Default Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultFieldListClass = DEFAULT_FIELD_LIST_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultRowClass() <em>Default Row Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRowClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ROW_CLASS_EDEFAULT = "row";

	/**
	 * The cached value of the '{@link #getDefaultRowClass() <em>Default Row Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRowClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultRowClass = DEFAULT_ROW_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultColumnClass() <em>Default Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultColumnClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_COLUMN_CLASS_EDEFAULT = "col";

	/**
	 * The cached value of the '{@link #getDefaultColumnClass() <em>Default Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultColumnClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultColumnClass = DEFAULT_COLUMN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCardClass() <em>Default Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CARD_CLASS_EDEFAULT = "card rounded shadow-sm h-100";

	/**
	 * The cached value of the '{@link #getDefaultCardClass() <em>Default Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultCardClass = DEFAULT_CARD_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCardHeaderClass() <em>Default Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CARD_HEADER_CLASS_EDEFAULT = "card-header";

	/**
	 * The cached value of the '{@link #getDefaultCardHeaderClass() <em>Default Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultCardHeaderClass = DEFAULT_CARD_HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCardBodyClass() <em>Default Card Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardBodyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CARD_BODY_CLASS_EDEFAULT = "card-body";

	/**
	 * The cached value of the '{@link #getDefaultCardBodyClass() <em>Default Card Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardBodyClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultCardBodyClass = DEFAULT_CARD_BODY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCardFooterClass() <em>Default Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CARD_FOOTER_CLASS_EDEFAULT = "card-footer";

	/**
	 * The cached value of the '{@link #getDefaultCardFooterClass() <em>Default Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultCardFooterClass = DEFAULT_CARD_FOOTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultBadgeClass() <em>Default Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBadgeClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_BADGE_CLASS_EDEFAULT = "badge";

	/**
	 * The cached value of the '{@link #getDefaultBadgeClass() <em>Default Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBadgeClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultBadgeClass = DEFAULT_BADGE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultControlClass() <em>Default Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultControlClass() <em>Default Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultControlClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultControlClass = DEFAULT_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDetailsControlClass() <em>Default Details Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DETAILS_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultDetailsControlClass() <em>Default Details Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsControlClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultDetailsControlClass = DEFAULT_DETAILS_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultIndexControlClass() <em>Default Index Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIndexControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INDEX_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultIndexControlClass() <em>Default Index Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIndexControlClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultIndexControlClass = DEFAULT_INDEX_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCardsControlClass() <em>Default Cards Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardsControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CARDS_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultCardsControlClass() <em>Default Cards Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardsControlClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultCardsControlClass = DEFAULT_CARDS_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFormControlClass() <em>Default Form Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFormControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FORM_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultFormControlClass() <em>Default Form Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFormControlClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultFormControlClass = DEFAULT_FORM_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultSliderControlClass() <em>Default Slider Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSliderControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SLIDER_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultSliderControlClass() <em>Default Slider Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSliderControlClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultSliderControlClass = DEFAULT_SLIDER_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultGalleryControlClass() <em>Default Gallery Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGalleryControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_GALLERY_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultGalleryControlClass() <em>Default Gallery Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGalleryControlClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultGalleryControlClass = DEFAULT_GALLERY_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultStaticControlClass() <em>Default Static Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStaticControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_STATIC_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultStaticControlClass() <em>Default Static Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStaticControlClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultStaticControlClass = DEFAULT_STATIC_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFieldLabelClass() <em>Default Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFieldLabelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FIELD_LABEL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultFieldLabelClass() <em>Default Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFieldLabelClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultFieldLabelClass = DEFAULT_FIELD_LABEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFieldValueClass() <em>Default Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFieldValueClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FIELD_VALUE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultFieldValueClass() <em>Default Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFieldValueClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultFieldValueClass = DEFAULT_FIELD_VALUE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInputGroupClass() <em>Default Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INPUT_GROUP_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultInputGroupClass() <em>Default Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultInputGroupClass = DEFAULT_INPUT_GROUP_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInputLabelClass() <em>Default Input Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputLabelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INPUT_LABEL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultInputLabelClass() <em>Default Input Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputLabelClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultInputLabelClass = DEFAULT_INPUT_LABEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInputValueClass() <em>Default Input Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputValueClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INPUT_VALUE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultInputValueClass() <em>Default Input Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputValueClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultInputValueClass = DEFAULT_INPUT_VALUE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultActionNavigationClass() <em>Default Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultActionNavigationClass() <em>Default Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultActionNavigationClass = DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultAnchorClass() <em>Default Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultAnchorClass() <em>Default Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultAnchorClass = DEFAULT_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDetailsAnchorClass() <em>Default Details Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DETAILS_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultDetailsAnchorClass() <em>Default Details Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultDetailsAnchorClass = DEFAULT_DETAILS_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultIndexAnchorClass() <em>Default Index Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIndexAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INDEX_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultIndexAnchorClass() <em>Default Index Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIndexAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultIndexAnchorClass = DEFAULT_INDEX_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCardsAnchorClass() <em>Default Cards Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardsAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CARDS_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultCardsAnchorClass() <em>Default Cards Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardsAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultCardsAnchorClass = DEFAULT_CARDS_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFormAnchorClass() <em>Default Form Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFormAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FORM_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultFormAnchorClass() <em>Default Form Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFormAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultFormAnchorClass = DEFAULT_FORM_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultSliderAnchorClass() <em>Default Slider Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSliderAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SLIDER_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultSliderAnchorClass() <em>Default Slider Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSliderAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultSliderAnchorClass = DEFAULT_SLIDER_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultGalleryAnchorClass() <em>Default Gallery Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGalleryAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_GALLERY_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultGalleryAnchorClass() <em>Default Gallery Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGalleryAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultGalleryAnchorClass = DEFAULT_GALLERY_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultStaticAnchorClass() <em>Default Static Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStaticAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_STATIC_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultStaticAnchorClass() <em>Default Static Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStaticAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultStaticAnchorClass = DEFAULT_STATIC_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMaximumUploadSize() <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT = 2000000;

	/**
	 * The cached value of the '{@link #getDefaultMaximumUploadSize() <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected int defaultMaximumUploadSize = DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputTechnology() <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final InputTechnologies INPUT_TECHNOLOGY_EDEFAULT = InputTechnologies.HTML;

	/**
	 * The cached value of the '{@link #getInputTechnology() <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTechnology()
	 * @generated
	 * @ordered
	 */
	protected InputTechnologies inputTechnology = INPUT_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAjaxTechnology() <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final AjaxTechnologies AJAX_TECHNOLOGY_EDEFAULT = AjaxTechnologies.NONE;

	/**
	 * The cached value of the '{@link #getAjaxTechnology() <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTechnology()
	 * @generated
	 * @ordered
	 */
	protected AjaxTechnologies ajaxTechnology = AJAX_TECHNOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.WEB_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persistence getPersistence() {
		if (persistence != null && persistence.eIsProxy()) {
			InternalEObject oldPersistence = (InternalEObject)persistence;
			persistence = (Persistence)eResolveProxy(oldPersistence);
			if (persistence != oldPersistence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.WEB_UI__PERSISTENCE, oldPersistence, persistence));
			}
		}
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistence basicGetPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistence(Persistence newPersistence) {
		Persistence oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__PERSISTENCE, oldPersistence, persistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Services getServices() {
		if (services != null && services.eIsProxy()) {
			InternalEObject oldServices = (InternalEObject)services;
			services = (Services)eResolveProxy(oldServices);
			if (services != oldServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.WEB_UI__SERVICES, oldServices, services));
			}
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services basicGetServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServices(Services newServices) {
		Services oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__SERVICES, oldServices, services));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, WebuiPackage.WEB_UI__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<Page>(Page.class, this, WebuiPackage.WEB_UI__PAGES, WebuiPackage.PAGE__WEB_UI);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDateFormat() {
		return defaultDateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDateFormat(String newDefaultDateFormat) {
		String oldDefaultDateFormat = defaultDateFormat;
		defaultDateFormat = newDefaultDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT, oldDefaultDateFormat, defaultDateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultTimeFormat() {
		return defaultTimeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeFormat(String newDefaultTimeFormat) {
		String oldDefaultTimeFormat = defaultTimeFormat;
		defaultTimeFormat = newDefaultTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT, oldDefaultTimeFormat, defaultTimeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDateTimeFormat() {
		return defaultDateTimeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDateTimeFormat(String newDefaultDateTimeFormat) {
		String oldDefaultDateTimeFormat = defaultDateTimeFormat;
		defaultDateTimeFormat = newDefaultDateTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT, oldDefaultDateTimeFormat, defaultDateTimeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultSaveLabel() {
		return defaultSaveLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSaveLabel(String newDefaultSaveLabel) {
		String oldDefaultSaveLabel = defaultSaveLabel;
		defaultSaveLabel = newDefaultSaveLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL, oldDefaultSaveLabel, defaultSaveLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCancelLabel() {
		return defaultCancelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCancelLabel(String newDefaultCancelLabel) {
		String oldDefaultCancelLabel = defaultCancelLabel;
		defaultCancelLabel = newDefaultCancelLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL, oldDefaultCancelLabel, defaultCancelLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultStyleClass() {
		return defaultStyleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultStyleClass(String newDefaultStyleClass) {
		String oldDefaultStyleClass = defaultStyleClass;
		defaultStyleClass = newDefaultStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_STYLE_CLASS, oldDefaultStyleClass, defaultStyleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultSectionClass() {
		return defaultSectionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSectionClass(String newDefaultSectionClass) {
		String oldDefaultSectionClass = defaultSectionClass;
		defaultSectionClass = newDefaultSectionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_SECTION_CLASS, oldDefaultSectionClass, defaultSectionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCaptionClass() {
		return defaultCaptionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCaptionClass(String newDefaultCaptionClass) {
		String oldDefaultCaptionClass = defaultCaptionClass;
		defaultCaptionClass = newDefaultCaptionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CAPTION_CLASS, oldDefaultCaptionClass, defaultCaptionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultContentClass() {
		return defaultContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultContentClass(String newDefaultContentClass) {
		String oldDefaultContentClass = defaultContentClass;
		defaultContentClass = newDefaultContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CONTENT_CLASS, oldDefaultContentClass, defaultContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDetailsContentClass() {
		return defaultDetailsContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDetailsContentClass(String newDefaultDetailsContentClass) {
		String oldDefaultDetailsContentClass = defaultDetailsContentClass;
		defaultDetailsContentClass = newDefaultDetailsContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTENT_CLASS, oldDefaultDetailsContentClass, defaultDetailsContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultIndexContentClass() {
		return defaultIndexContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultIndexContentClass(String newDefaultIndexContentClass) {
		String oldDefaultIndexContentClass = defaultIndexContentClass;
		defaultIndexContentClass = newDefaultIndexContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTENT_CLASS, oldDefaultIndexContentClass, defaultIndexContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCardsContentClass() {
		return defaultCardsContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCardsContentClass(String newDefaultCardsContentClass) {
		String oldDefaultCardsContentClass = defaultCardsContentClass;
		defaultCardsContentClass = newDefaultCardsContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTENT_CLASS, oldDefaultCardsContentClass, defaultCardsContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultFormContentClass() {
		return defaultFormContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFormContentClass(String newDefaultFormContentClass) {
		String oldDefaultFormContentClass = defaultFormContentClass;
		defaultFormContentClass = newDefaultFormContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_FORM_CONTENT_CLASS, oldDefaultFormContentClass, defaultFormContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultSliderContentClass() {
		return defaultSliderContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSliderContentClass(String newDefaultSliderContentClass) {
		String oldDefaultSliderContentClass = defaultSliderContentClass;
		defaultSliderContentClass = newDefaultSliderContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTENT_CLASS, oldDefaultSliderContentClass, defaultSliderContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultGalleryContentClass() {
		return defaultGalleryContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultGalleryContentClass(String newDefaultGalleryContentClass) {
		String oldDefaultGalleryContentClass = defaultGalleryContentClass;
		defaultGalleryContentClass = newDefaultGalleryContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTENT_CLASS, oldDefaultGalleryContentClass, defaultGalleryContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultStaticContentClass() {
		return defaultStaticContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultStaticContentClass(String newDefaultStaticContentClass) {
		String oldDefaultStaticContentClass = defaultStaticContentClass;
		defaultStaticContentClass = newDefaultStaticContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTENT_CLASS, oldDefaultStaticContentClass, defaultStaticContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultRowClass() {
		return defaultRowClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultRowClass(String newDefaultRowClass) {
		String oldDefaultRowClass = defaultRowClass;
		defaultRowClass = newDefaultRowClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_ROW_CLASS, oldDefaultRowClass, defaultRowClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultColumnClass() {
		return defaultColumnClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultColumnClass(String newDefaultColumnClass) {
		String oldDefaultColumnClass = defaultColumnClass;
		defaultColumnClass = newDefaultColumnClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_COLUMN_CLASS, oldDefaultColumnClass, defaultColumnClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCardClass() {
		return defaultCardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCardClass(String newDefaultCardClass) {
		String oldDefaultCardClass = defaultCardClass;
		defaultCardClass = newDefaultCardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARD_CLASS, oldDefaultCardClass, defaultCardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCardHeaderClass() {
		return defaultCardHeaderClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCardHeaderClass(String newDefaultCardHeaderClass) {
		String oldDefaultCardHeaderClass = defaultCardHeaderClass;
		defaultCardHeaderClass = newDefaultCardHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARD_HEADER_CLASS, oldDefaultCardHeaderClass, defaultCardHeaderClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCardBodyClass() {
		return defaultCardBodyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCardBodyClass(String newDefaultCardBodyClass) {
		String oldDefaultCardBodyClass = defaultCardBodyClass;
		defaultCardBodyClass = newDefaultCardBodyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARD_BODY_CLASS, oldDefaultCardBodyClass, defaultCardBodyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCardFooterClass() {
		return defaultCardFooterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCardFooterClass(String newDefaultCardFooterClass) {
		String oldDefaultCardFooterClass = defaultCardFooterClass;
		defaultCardFooterClass = newDefaultCardFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARD_FOOTER_CLASS, oldDefaultCardFooterClass, defaultCardFooterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultBadgeClass() {
		return defaultBadgeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultBadgeClass(String newDefaultBadgeClass) {
		String oldDefaultBadgeClass = defaultBadgeClass;
		defaultBadgeClass = newDefaultBadgeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_BADGE_CLASS, oldDefaultBadgeClass, defaultBadgeClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultControlClass() {
		return defaultControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultControlClass(String newDefaultControlClass) {
		String oldDefaultControlClass = defaultControlClass;
		defaultControlClass = newDefaultControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CONTROL_CLASS, oldDefaultControlClass, defaultControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDetailsControlClass() {
		return defaultDetailsControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDetailsControlClass(String newDefaultDetailsControlClass) {
		String oldDefaultDetailsControlClass = defaultDetailsControlClass;
		defaultDetailsControlClass = newDefaultDetailsControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTROL_CLASS, oldDefaultDetailsControlClass, defaultDetailsControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultIndexControlClass() {
		return defaultIndexControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultIndexControlClass(String newDefaultIndexControlClass) {
		String oldDefaultIndexControlClass = defaultIndexControlClass;
		defaultIndexControlClass = newDefaultIndexControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTROL_CLASS, oldDefaultIndexControlClass, defaultIndexControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCardsControlClass() {
		return defaultCardsControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCardsControlClass(String newDefaultCardsControlClass) {
		String oldDefaultCardsControlClass = defaultCardsControlClass;
		defaultCardsControlClass = newDefaultCardsControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTROL_CLASS, oldDefaultCardsControlClass, defaultCardsControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultFormControlClass() {
		return defaultFormControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFormControlClass(String newDefaultFormControlClass) {
		String oldDefaultFormControlClass = defaultFormControlClass;
		defaultFormControlClass = newDefaultFormControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_FORM_CONTROL_CLASS, oldDefaultFormControlClass, defaultFormControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultSliderControlClass() {
		return defaultSliderControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSliderControlClass(String newDefaultSliderControlClass) {
		String oldDefaultSliderControlClass = defaultSliderControlClass;
		defaultSliderControlClass = newDefaultSliderControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTROL_CLASS, oldDefaultSliderControlClass, defaultSliderControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultGalleryControlClass() {
		return defaultGalleryControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultGalleryControlClass(String newDefaultGalleryControlClass) {
		String oldDefaultGalleryControlClass = defaultGalleryControlClass;
		defaultGalleryControlClass = newDefaultGalleryControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTROL_CLASS, oldDefaultGalleryControlClass, defaultGalleryControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultStaticControlClass() {
		return defaultStaticControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultStaticControlClass(String newDefaultStaticControlClass) {
		String oldDefaultStaticControlClass = defaultStaticControlClass;
		defaultStaticControlClass = newDefaultStaticControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTROL_CLASS, oldDefaultStaticControlClass, defaultStaticControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultAnchorClass() {
		return defaultAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultAnchorClass(String newDefaultAnchorClass) {
		String oldDefaultAnchorClass = defaultAnchorClass;
		defaultAnchorClass = newDefaultAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS, oldDefaultAnchorClass, defaultAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDetailsAnchorClass() {
		return defaultDetailsAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDetailsAnchorClass(String newDefaultDetailsAnchorClass) {
		String oldDefaultDetailsAnchorClass = defaultDetailsAnchorClass;
		defaultDetailsAnchorClass = newDefaultDetailsAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DETAILS_ANCHOR_CLASS, oldDefaultDetailsAnchorClass, defaultDetailsAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultIndexAnchorClass() {
		return defaultIndexAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultIndexAnchorClass(String newDefaultIndexAnchorClass) {
		String oldDefaultIndexAnchorClass = defaultIndexAnchorClass;
		defaultIndexAnchorClass = newDefaultIndexAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INDEX_ANCHOR_CLASS, oldDefaultIndexAnchorClass, defaultIndexAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCardsAnchorClass() {
		return defaultCardsAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCardsAnchorClass(String newDefaultCardsAnchorClass) {
		String oldDefaultCardsAnchorClass = defaultCardsAnchorClass;
		defaultCardsAnchorClass = newDefaultCardsAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARDS_ANCHOR_CLASS, oldDefaultCardsAnchorClass, defaultCardsAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultFormAnchorClass() {
		return defaultFormAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFormAnchorClass(String newDefaultFormAnchorClass) {
		String oldDefaultFormAnchorClass = defaultFormAnchorClass;
		defaultFormAnchorClass = newDefaultFormAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_FORM_ANCHOR_CLASS, oldDefaultFormAnchorClass, defaultFormAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultSliderAnchorClass() {
		return defaultSliderAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSliderAnchorClass(String newDefaultSliderAnchorClass) {
		String oldDefaultSliderAnchorClass = defaultSliderAnchorClass;
		defaultSliderAnchorClass = newDefaultSliderAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_SLIDER_ANCHOR_CLASS, oldDefaultSliderAnchorClass, defaultSliderAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultGalleryAnchorClass() {
		return defaultGalleryAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultGalleryAnchorClass(String newDefaultGalleryAnchorClass) {
		String oldDefaultGalleryAnchorClass = defaultGalleryAnchorClass;
		defaultGalleryAnchorClass = newDefaultGalleryAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_GALLERY_ANCHOR_CLASS, oldDefaultGalleryAnchorClass, defaultGalleryAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultStaticAnchorClass() {
		return defaultStaticAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultStaticAnchorClass(String newDefaultStaticAnchorClass) {
		String oldDefaultStaticAnchorClass = defaultStaticAnchorClass;
		defaultStaticAnchorClass = newDefaultStaticAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_STATIC_ANCHOR_CLASS, oldDefaultStaticAnchorClass, defaultStaticAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultFieldListClass() {
		return defaultFieldListClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFieldListClass(String newDefaultFieldListClass) {
		String oldDefaultFieldListClass = defaultFieldListClass;
		defaultFieldListClass = newDefaultFieldListClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_FIELD_LIST_CLASS, oldDefaultFieldListClass, defaultFieldListClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultFieldLabelClass() {
		return defaultFieldLabelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFieldLabelClass(String newDefaultFieldLabelClass) {
		String oldDefaultFieldLabelClass = defaultFieldLabelClass;
		defaultFieldLabelClass = newDefaultFieldLabelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_FIELD_LABEL_CLASS, oldDefaultFieldLabelClass, defaultFieldLabelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultFieldValueClass() {
		return defaultFieldValueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFieldValueClass(String newDefaultFieldValueClass) {
		String oldDefaultFieldValueClass = defaultFieldValueClass;
		defaultFieldValueClass = newDefaultFieldValueClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_FIELD_VALUE_CLASS, oldDefaultFieldValueClass, defaultFieldValueClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultInputGroupClass() {
		return defaultInputGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInputGroupClass(String newDefaultInputGroupClass) {
		String oldDefaultInputGroupClass = defaultInputGroupClass;
		defaultInputGroupClass = newDefaultInputGroupClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS, oldDefaultInputGroupClass, defaultInputGroupClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultInputLabelClass() {
		return defaultInputLabelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInputLabelClass(String newDefaultInputLabelClass) {
		String oldDefaultInputLabelClass = defaultInputLabelClass;
		defaultInputLabelClass = newDefaultInputLabelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS, oldDefaultInputLabelClass, defaultInputLabelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultInputValueClass() {
		return defaultInputValueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInputValueClass(String newDefaultInputValueClass) {
		String oldDefaultInputValueClass = defaultInputValueClass;
		defaultInputValueClass = newDefaultInputValueClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INPUT_VALUE_CLASS, oldDefaultInputValueClass, defaultInputValueClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultActionNavigationClass() {
		return defaultActionNavigationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultActionNavigationClass(String newDefaultActionNavigationClass) {
		String oldDefaultActionNavigationClass = defaultActionNavigationClass;
		defaultActionNavigationClass = newDefaultActionNavigationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS, oldDefaultActionNavigationClass, defaultActionNavigationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefaultMaximumUploadSize() {
		return defaultMaximumUploadSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultMaximumUploadSize(int newDefaultMaximumUploadSize) {
		int oldDefaultMaximumUploadSize = defaultMaximumUploadSize;
		defaultMaximumUploadSize = newDefaultMaximumUploadSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE, oldDefaultMaximumUploadSize, defaultMaximumUploadSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputTechnologies getInputTechnology() {
		return inputTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputTechnology(InputTechnologies newInputTechnology) {
		InputTechnologies oldInputTechnology = inputTechnology;
		inputTechnology = newInputTechnology == null ? INPUT_TECHNOLOGY_EDEFAULT : newInputTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__INPUT_TECHNOLOGY, oldInputTechnology, inputTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AjaxTechnologies getAjaxTechnology() {
		return ajaxTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAjaxTechnology(AjaxTechnologies newAjaxTechnology) {
		AjaxTechnologies oldAjaxTechnology = ajaxTechnology;
		ajaxTechnology = newAjaxTechnology == null ? AJAX_TECHNOLOGY_EDEFAULT : newAjaxTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__AJAX_TECHNOLOGY, oldAjaxTechnology, ajaxTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.WEB_UI__PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.WEB_UI__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
			case WebuiPackage.WEB_UI__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.WEB_UI__PERSISTENCE:
				if (resolve) return getPersistence();
				return basicGetPersistence();
			case WebuiPackage.WEB_UI__SERVICES:
				if (resolve) return getServices();
				return basicGetServices();
			case WebuiPackage.WEB_UI__MENUS:
				return getMenus();
			case WebuiPackage.WEB_UI__PAGES:
				return getPages();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return getDefaultDateFormat();
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return getDefaultTimeFormat();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return getDefaultDateTimeFormat();
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
				return getDefaultCancelLabel();
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
				return getDefaultSaveLabel();
			case WebuiPackage.WEB_UI__DEFAULT_STYLE_CLASS:
				return getDefaultStyleClass();
			case WebuiPackage.WEB_UI__DEFAULT_SECTION_CLASS:
				return getDefaultSectionClass();
			case WebuiPackage.WEB_UI__DEFAULT_CAPTION_CLASS:
				return getDefaultCaptionClass();
			case WebuiPackage.WEB_UI__DEFAULT_CONTENT_CLASS:
				return getDefaultContentClass();
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTENT_CLASS:
				return getDefaultDetailsContentClass();
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTENT_CLASS:
				return getDefaultIndexContentClass();
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTENT_CLASS:
				return getDefaultCardsContentClass();
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTENT_CLASS:
				return getDefaultFormContentClass();
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTENT_CLASS:
				return getDefaultSliderContentClass();
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTENT_CLASS:
				return getDefaultGalleryContentClass();
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTENT_CLASS:
				return getDefaultStaticContentClass();
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LIST_CLASS:
				return getDefaultFieldListClass();
			case WebuiPackage.WEB_UI__DEFAULT_ROW_CLASS:
				return getDefaultRowClass();
			case WebuiPackage.WEB_UI__DEFAULT_COLUMN_CLASS:
				return getDefaultColumnClass();
			case WebuiPackage.WEB_UI__DEFAULT_CARD_CLASS:
				return getDefaultCardClass();
			case WebuiPackage.WEB_UI__DEFAULT_CARD_HEADER_CLASS:
				return getDefaultCardHeaderClass();
			case WebuiPackage.WEB_UI__DEFAULT_CARD_BODY_CLASS:
				return getDefaultCardBodyClass();
			case WebuiPackage.WEB_UI__DEFAULT_CARD_FOOTER_CLASS:
				return getDefaultCardFooterClass();
			case WebuiPackage.WEB_UI__DEFAULT_BADGE_CLASS:
				return getDefaultBadgeClass();
			case WebuiPackage.WEB_UI__DEFAULT_CONTROL_CLASS:
				return getDefaultControlClass();
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTROL_CLASS:
				return getDefaultDetailsControlClass();
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTROL_CLASS:
				return getDefaultIndexControlClass();
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTROL_CLASS:
				return getDefaultCardsControlClass();
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTROL_CLASS:
				return getDefaultFormControlClass();
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTROL_CLASS:
				return getDefaultSliderControlClass();
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTROL_CLASS:
				return getDefaultGalleryControlClass();
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTROL_CLASS:
				return getDefaultStaticControlClass();
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LABEL_CLASS:
				return getDefaultFieldLabelClass();
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_VALUE_CLASS:
				return getDefaultFieldValueClass();
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
				return getDefaultInputGroupClass();
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
				return getDefaultInputLabelClass();
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_VALUE_CLASS:
				return getDefaultInputValueClass();
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
				return getDefaultActionNavigationClass();
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
				return getDefaultAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_ANCHOR_CLASS:
				return getDefaultDetailsAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_ANCHOR_CLASS:
				return getDefaultIndexAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_ANCHOR_CLASS:
				return getDefaultCardsAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_FORM_ANCHOR_CLASS:
				return getDefaultFormAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_ANCHOR_CLASS:
				return getDefaultSliderAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_ANCHOR_CLASS:
				return getDefaultGalleryAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_ANCHOR_CLASS:
				return getDefaultStaticAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return getDefaultMaximumUploadSize();
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				return getInputTechnology();
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				return getAjaxTechnology();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebuiPackage.WEB_UI__PERSISTENCE:
				setPersistence((Persistence)newValue);
				return;
			case WebuiPackage.WEB_UI__SERVICES:
				setServices((Services)newValue);
				return;
			case WebuiPackage.WEB_UI__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WebuiPackage.WEB_UI__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
				setDefaultCancelLabel((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
				setDefaultSaveLabel((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STYLE_CLASS:
				setDefaultStyleClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SECTION_CLASS:
				setDefaultSectionClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CAPTION_CLASS:
				setDefaultCaptionClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CONTENT_CLASS:
				setDefaultContentClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTENT_CLASS:
				setDefaultDetailsContentClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTENT_CLASS:
				setDefaultIndexContentClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTENT_CLASS:
				setDefaultCardsContentClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTENT_CLASS:
				setDefaultFormContentClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTENT_CLASS:
				setDefaultSliderContentClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTENT_CLASS:
				setDefaultGalleryContentClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTENT_CLASS:
				setDefaultStaticContentClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LIST_CLASS:
				setDefaultFieldListClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ROW_CLASS:
				setDefaultRowClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_COLUMN_CLASS:
				setDefaultColumnClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARD_CLASS:
				setDefaultCardClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARD_HEADER_CLASS:
				setDefaultCardHeaderClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARD_BODY_CLASS:
				setDefaultCardBodyClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARD_FOOTER_CLASS:
				setDefaultCardFooterClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_BADGE_CLASS:
				setDefaultBadgeClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CONTROL_CLASS:
				setDefaultControlClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTROL_CLASS:
				setDefaultDetailsControlClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTROL_CLASS:
				setDefaultIndexControlClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTROL_CLASS:
				setDefaultCardsControlClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTROL_CLASS:
				setDefaultFormControlClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTROL_CLASS:
				setDefaultSliderControlClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTROL_CLASS:
				setDefaultGalleryControlClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTROL_CLASS:
				setDefaultStaticControlClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LABEL_CLASS:
				setDefaultFieldLabelClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_VALUE_CLASS:
				setDefaultFieldValueClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
				setDefaultInputGroupClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
				setDefaultInputLabelClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_VALUE_CLASS:
				setDefaultInputValueClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
				setDefaultActionNavigationClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
				setDefaultAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_ANCHOR_CLASS:
				setDefaultDetailsAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_ANCHOR_CLASS:
				setDefaultIndexAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_ANCHOR_CLASS:
				setDefaultCardsAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_ANCHOR_CLASS:
				setDefaultFormAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_ANCHOR_CLASS:
				setDefaultSliderAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_ANCHOR_CLASS:
				setDefaultGalleryAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_ANCHOR_CLASS:
				setDefaultStaticAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize((Integer)newValue);
				return;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				setInputTechnology((InputTechnologies)newValue);
				return;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				setAjaxTechnology((AjaxTechnologies)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebuiPackage.WEB_UI__PERSISTENCE:
				setPersistence((Persistence)null);
				return;
			case WebuiPackage.WEB_UI__SERVICES:
				setServices((Services)null);
				return;
			case WebuiPackage.WEB_UI__MENUS:
				getMenus().clear();
				return;
			case WebuiPackage.WEB_UI__PAGES:
				getPages().clear();
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat(DEFAULT_DATE_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat(DEFAULT_TIME_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat(DEFAULT_DATE_TIME_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
				setDefaultCancelLabel(DEFAULT_CANCEL_LABEL_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
				setDefaultSaveLabel(DEFAULT_SAVE_LABEL_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STYLE_CLASS:
				setDefaultStyleClass(DEFAULT_STYLE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SECTION_CLASS:
				setDefaultSectionClass(DEFAULT_SECTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CAPTION_CLASS:
				setDefaultCaptionClass(DEFAULT_CAPTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CONTENT_CLASS:
				setDefaultContentClass(DEFAULT_CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTENT_CLASS:
				setDefaultDetailsContentClass(DEFAULT_DETAILS_CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTENT_CLASS:
				setDefaultIndexContentClass(DEFAULT_INDEX_CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTENT_CLASS:
				setDefaultCardsContentClass(DEFAULT_CARDS_CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTENT_CLASS:
				setDefaultFormContentClass(DEFAULT_FORM_CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTENT_CLASS:
				setDefaultSliderContentClass(DEFAULT_SLIDER_CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTENT_CLASS:
				setDefaultGalleryContentClass(DEFAULT_GALLERY_CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTENT_CLASS:
				setDefaultStaticContentClass(DEFAULT_STATIC_CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LIST_CLASS:
				setDefaultFieldListClass(DEFAULT_FIELD_LIST_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ROW_CLASS:
				setDefaultRowClass(DEFAULT_ROW_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_COLUMN_CLASS:
				setDefaultColumnClass(DEFAULT_COLUMN_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARD_CLASS:
				setDefaultCardClass(DEFAULT_CARD_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARD_HEADER_CLASS:
				setDefaultCardHeaderClass(DEFAULT_CARD_HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARD_BODY_CLASS:
				setDefaultCardBodyClass(DEFAULT_CARD_BODY_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARD_FOOTER_CLASS:
				setDefaultCardFooterClass(DEFAULT_CARD_FOOTER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_BADGE_CLASS:
				setDefaultBadgeClass(DEFAULT_BADGE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CONTROL_CLASS:
				setDefaultControlClass(DEFAULT_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTROL_CLASS:
				setDefaultDetailsControlClass(DEFAULT_DETAILS_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTROL_CLASS:
				setDefaultIndexControlClass(DEFAULT_INDEX_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTROL_CLASS:
				setDefaultCardsControlClass(DEFAULT_CARDS_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTROL_CLASS:
				setDefaultFormControlClass(DEFAULT_FORM_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTROL_CLASS:
				setDefaultSliderControlClass(DEFAULT_SLIDER_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTROL_CLASS:
				setDefaultGalleryControlClass(DEFAULT_GALLERY_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTROL_CLASS:
				setDefaultStaticControlClass(DEFAULT_STATIC_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LABEL_CLASS:
				setDefaultFieldLabelClass(DEFAULT_FIELD_LABEL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_VALUE_CLASS:
				setDefaultFieldValueClass(DEFAULT_FIELD_VALUE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
				setDefaultInputGroupClass(DEFAULT_INPUT_GROUP_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
				setDefaultInputLabelClass(DEFAULT_INPUT_LABEL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_VALUE_CLASS:
				setDefaultInputValueClass(DEFAULT_INPUT_VALUE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
				setDefaultActionNavigationClass(DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
				setDefaultAnchorClass(DEFAULT_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_ANCHOR_CLASS:
				setDefaultDetailsAnchorClass(DEFAULT_DETAILS_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_ANCHOR_CLASS:
				setDefaultIndexAnchorClass(DEFAULT_INDEX_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_ANCHOR_CLASS:
				setDefaultCardsAnchorClass(DEFAULT_CARDS_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_ANCHOR_CLASS:
				setDefaultFormAnchorClass(DEFAULT_FORM_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_ANCHOR_CLASS:
				setDefaultSliderAnchorClass(DEFAULT_SLIDER_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_ANCHOR_CLASS:
				setDefaultGalleryAnchorClass(DEFAULT_GALLERY_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_ANCHOR_CLASS:
				setDefaultStaticAnchorClass(DEFAULT_STATIC_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize(DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				setInputTechnology(INPUT_TECHNOLOGY_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				setAjaxTechnology(AJAX_TECHNOLOGY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebuiPackage.WEB_UI__PERSISTENCE:
				return persistence != null;
			case WebuiPackage.WEB_UI__SERVICES:
				return services != null;
			case WebuiPackage.WEB_UI__MENUS:
				return menus != null && !menus.isEmpty();
			case WebuiPackage.WEB_UI__PAGES:
				return pages != null && !pages.isEmpty();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return DEFAULT_DATE_FORMAT_EDEFAULT == null ? defaultDateFormat != null : !DEFAULT_DATE_FORMAT_EDEFAULT.equals(defaultDateFormat);
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return DEFAULT_TIME_FORMAT_EDEFAULT == null ? defaultTimeFormat != null : !DEFAULT_TIME_FORMAT_EDEFAULT.equals(defaultTimeFormat);
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return DEFAULT_DATE_TIME_FORMAT_EDEFAULT == null ? defaultDateTimeFormat != null : !DEFAULT_DATE_TIME_FORMAT_EDEFAULT.equals(defaultDateTimeFormat);
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
				return DEFAULT_CANCEL_LABEL_EDEFAULT == null ? defaultCancelLabel != null : !DEFAULT_CANCEL_LABEL_EDEFAULT.equals(defaultCancelLabel);
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
				return DEFAULT_SAVE_LABEL_EDEFAULT == null ? defaultSaveLabel != null : !DEFAULT_SAVE_LABEL_EDEFAULT.equals(defaultSaveLabel);
			case WebuiPackage.WEB_UI__DEFAULT_STYLE_CLASS:
				return DEFAULT_STYLE_CLASS_EDEFAULT == null ? defaultStyleClass != null : !DEFAULT_STYLE_CLASS_EDEFAULT.equals(defaultStyleClass);
			case WebuiPackage.WEB_UI__DEFAULT_SECTION_CLASS:
				return DEFAULT_SECTION_CLASS_EDEFAULT == null ? defaultSectionClass != null : !DEFAULT_SECTION_CLASS_EDEFAULT.equals(defaultSectionClass);
			case WebuiPackage.WEB_UI__DEFAULT_CAPTION_CLASS:
				return DEFAULT_CAPTION_CLASS_EDEFAULT == null ? defaultCaptionClass != null : !DEFAULT_CAPTION_CLASS_EDEFAULT.equals(defaultCaptionClass);
			case WebuiPackage.WEB_UI__DEFAULT_CONTENT_CLASS:
				return DEFAULT_CONTENT_CLASS_EDEFAULT == null ? defaultContentClass != null : !DEFAULT_CONTENT_CLASS_EDEFAULT.equals(defaultContentClass);
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTENT_CLASS:
				return DEFAULT_DETAILS_CONTENT_CLASS_EDEFAULT == null ? defaultDetailsContentClass != null : !DEFAULT_DETAILS_CONTENT_CLASS_EDEFAULT.equals(defaultDetailsContentClass);
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTENT_CLASS:
				return DEFAULT_INDEX_CONTENT_CLASS_EDEFAULT == null ? defaultIndexContentClass != null : !DEFAULT_INDEX_CONTENT_CLASS_EDEFAULT.equals(defaultIndexContentClass);
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTENT_CLASS:
				return DEFAULT_CARDS_CONTENT_CLASS_EDEFAULT == null ? defaultCardsContentClass != null : !DEFAULT_CARDS_CONTENT_CLASS_EDEFAULT.equals(defaultCardsContentClass);
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTENT_CLASS:
				return DEFAULT_FORM_CONTENT_CLASS_EDEFAULT == null ? defaultFormContentClass != null : !DEFAULT_FORM_CONTENT_CLASS_EDEFAULT.equals(defaultFormContentClass);
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTENT_CLASS:
				return DEFAULT_SLIDER_CONTENT_CLASS_EDEFAULT == null ? defaultSliderContentClass != null : !DEFAULT_SLIDER_CONTENT_CLASS_EDEFAULT.equals(defaultSliderContentClass);
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTENT_CLASS:
				return DEFAULT_GALLERY_CONTENT_CLASS_EDEFAULT == null ? defaultGalleryContentClass != null : !DEFAULT_GALLERY_CONTENT_CLASS_EDEFAULT.equals(defaultGalleryContentClass);
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTENT_CLASS:
				return DEFAULT_STATIC_CONTENT_CLASS_EDEFAULT == null ? defaultStaticContentClass != null : !DEFAULT_STATIC_CONTENT_CLASS_EDEFAULT.equals(defaultStaticContentClass);
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LIST_CLASS:
				return DEFAULT_FIELD_LIST_CLASS_EDEFAULT == null ? defaultFieldListClass != null : !DEFAULT_FIELD_LIST_CLASS_EDEFAULT.equals(defaultFieldListClass);
			case WebuiPackage.WEB_UI__DEFAULT_ROW_CLASS:
				return DEFAULT_ROW_CLASS_EDEFAULT == null ? defaultRowClass != null : !DEFAULT_ROW_CLASS_EDEFAULT.equals(defaultRowClass);
			case WebuiPackage.WEB_UI__DEFAULT_COLUMN_CLASS:
				return DEFAULT_COLUMN_CLASS_EDEFAULT == null ? defaultColumnClass != null : !DEFAULT_COLUMN_CLASS_EDEFAULT.equals(defaultColumnClass);
			case WebuiPackage.WEB_UI__DEFAULT_CARD_CLASS:
				return DEFAULT_CARD_CLASS_EDEFAULT == null ? defaultCardClass != null : !DEFAULT_CARD_CLASS_EDEFAULT.equals(defaultCardClass);
			case WebuiPackage.WEB_UI__DEFAULT_CARD_HEADER_CLASS:
				return DEFAULT_CARD_HEADER_CLASS_EDEFAULT == null ? defaultCardHeaderClass != null : !DEFAULT_CARD_HEADER_CLASS_EDEFAULT.equals(defaultCardHeaderClass);
			case WebuiPackage.WEB_UI__DEFAULT_CARD_BODY_CLASS:
				return DEFAULT_CARD_BODY_CLASS_EDEFAULT == null ? defaultCardBodyClass != null : !DEFAULT_CARD_BODY_CLASS_EDEFAULT.equals(defaultCardBodyClass);
			case WebuiPackage.WEB_UI__DEFAULT_CARD_FOOTER_CLASS:
				return DEFAULT_CARD_FOOTER_CLASS_EDEFAULT == null ? defaultCardFooterClass != null : !DEFAULT_CARD_FOOTER_CLASS_EDEFAULT.equals(defaultCardFooterClass);
			case WebuiPackage.WEB_UI__DEFAULT_BADGE_CLASS:
				return DEFAULT_BADGE_CLASS_EDEFAULT == null ? defaultBadgeClass != null : !DEFAULT_BADGE_CLASS_EDEFAULT.equals(defaultBadgeClass);
			case WebuiPackage.WEB_UI__DEFAULT_CONTROL_CLASS:
				return DEFAULT_CONTROL_CLASS_EDEFAULT == null ? defaultControlClass != null : !DEFAULT_CONTROL_CLASS_EDEFAULT.equals(defaultControlClass);
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTROL_CLASS:
				return DEFAULT_DETAILS_CONTROL_CLASS_EDEFAULT == null ? defaultDetailsControlClass != null : !DEFAULT_DETAILS_CONTROL_CLASS_EDEFAULT.equals(defaultDetailsControlClass);
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_CONTROL_CLASS:
				return DEFAULT_INDEX_CONTROL_CLASS_EDEFAULT == null ? defaultIndexControlClass != null : !DEFAULT_INDEX_CONTROL_CLASS_EDEFAULT.equals(defaultIndexControlClass);
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTROL_CLASS:
				return DEFAULT_CARDS_CONTROL_CLASS_EDEFAULT == null ? defaultCardsControlClass != null : !DEFAULT_CARDS_CONTROL_CLASS_EDEFAULT.equals(defaultCardsControlClass);
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTROL_CLASS:
				return DEFAULT_FORM_CONTROL_CLASS_EDEFAULT == null ? defaultFormControlClass != null : !DEFAULT_FORM_CONTROL_CLASS_EDEFAULT.equals(defaultFormControlClass);
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTROL_CLASS:
				return DEFAULT_SLIDER_CONTROL_CLASS_EDEFAULT == null ? defaultSliderControlClass != null : !DEFAULT_SLIDER_CONTROL_CLASS_EDEFAULT.equals(defaultSliderControlClass);
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTROL_CLASS:
				return DEFAULT_GALLERY_CONTROL_CLASS_EDEFAULT == null ? defaultGalleryControlClass != null : !DEFAULT_GALLERY_CONTROL_CLASS_EDEFAULT.equals(defaultGalleryControlClass);
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTROL_CLASS:
				return DEFAULT_STATIC_CONTROL_CLASS_EDEFAULT == null ? defaultStaticControlClass != null : !DEFAULT_STATIC_CONTROL_CLASS_EDEFAULT.equals(defaultStaticControlClass);
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LABEL_CLASS:
				return DEFAULT_FIELD_LABEL_CLASS_EDEFAULT == null ? defaultFieldLabelClass != null : !DEFAULT_FIELD_LABEL_CLASS_EDEFAULT.equals(defaultFieldLabelClass);
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_VALUE_CLASS:
				return DEFAULT_FIELD_VALUE_CLASS_EDEFAULT == null ? defaultFieldValueClass != null : !DEFAULT_FIELD_VALUE_CLASS_EDEFAULT.equals(defaultFieldValueClass);
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
				return DEFAULT_INPUT_GROUP_CLASS_EDEFAULT == null ? defaultInputGroupClass != null : !DEFAULT_INPUT_GROUP_CLASS_EDEFAULT.equals(defaultInputGroupClass);
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
				return DEFAULT_INPUT_LABEL_CLASS_EDEFAULT == null ? defaultInputLabelClass != null : !DEFAULT_INPUT_LABEL_CLASS_EDEFAULT.equals(defaultInputLabelClass);
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_VALUE_CLASS:
				return DEFAULT_INPUT_VALUE_CLASS_EDEFAULT == null ? defaultInputValueClass != null : !DEFAULT_INPUT_VALUE_CLASS_EDEFAULT.equals(defaultInputValueClass);
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
				return DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT == null ? defaultActionNavigationClass != null : !DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT.equals(defaultActionNavigationClass);
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
				return DEFAULT_ANCHOR_CLASS_EDEFAULT == null ? defaultAnchorClass != null : !DEFAULT_ANCHOR_CLASS_EDEFAULT.equals(defaultAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_ANCHOR_CLASS:
				return DEFAULT_DETAILS_ANCHOR_CLASS_EDEFAULT == null ? defaultDetailsAnchorClass != null : !DEFAULT_DETAILS_ANCHOR_CLASS_EDEFAULT.equals(defaultDetailsAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_INDEX_ANCHOR_CLASS:
				return DEFAULT_INDEX_ANCHOR_CLASS_EDEFAULT == null ? defaultIndexAnchorClass != null : !DEFAULT_INDEX_ANCHOR_CLASS_EDEFAULT.equals(defaultIndexAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_ANCHOR_CLASS:
				return DEFAULT_CARDS_ANCHOR_CLASS_EDEFAULT == null ? defaultCardsAnchorClass != null : !DEFAULT_CARDS_ANCHOR_CLASS_EDEFAULT.equals(defaultCardsAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_FORM_ANCHOR_CLASS:
				return DEFAULT_FORM_ANCHOR_CLASS_EDEFAULT == null ? defaultFormAnchorClass != null : !DEFAULT_FORM_ANCHOR_CLASS_EDEFAULT.equals(defaultFormAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_ANCHOR_CLASS:
				return DEFAULT_SLIDER_ANCHOR_CLASS_EDEFAULT == null ? defaultSliderAnchorClass != null : !DEFAULT_SLIDER_ANCHOR_CLASS_EDEFAULT.equals(defaultSliderAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_ANCHOR_CLASS:
				return DEFAULT_GALLERY_ANCHOR_CLASS_EDEFAULT == null ? defaultGalleryAnchorClass != null : !DEFAULT_GALLERY_ANCHOR_CLASS_EDEFAULT.equals(defaultGalleryAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_ANCHOR_CLASS:
				return DEFAULT_STATIC_ANCHOR_CLASS_EDEFAULT == null ? defaultStaticAnchorClass != null : !DEFAULT_STATIC_ANCHOR_CLASS_EDEFAULT.equals(defaultStaticAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return defaultMaximumUploadSize != DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				return inputTechnology != INPUT_TECHNOLOGY_EDEFAULT;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				return ajaxTechnology != AJAX_TECHNOLOGY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (defaultDateFormat: ");
		result.append(defaultDateFormat);
		result.append(", defaultTimeFormat: ");
		result.append(defaultTimeFormat);
		result.append(", defaultDateTimeFormat: ");
		result.append(defaultDateTimeFormat);
		result.append(", defaultCancelLabel: ");
		result.append(defaultCancelLabel);
		result.append(", defaultSaveLabel: ");
		result.append(defaultSaveLabel);
		result.append(", defaultStyleClass: ");
		result.append(defaultStyleClass);
		result.append(", defaultSectionClass: ");
		result.append(defaultSectionClass);
		result.append(", defaultCaptionClass: ");
		result.append(defaultCaptionClass);
		result.append(", defaultContentClass: ");
		result.append(defaultContentClass);
		result.append(", defaultDetailsContentClass: ");
		result.append(defaultDetailsContentClass);
		result.append(", defaultIndexContentClass: ");
		result.append(defaultIndexContentClass);
		result.append(", defaultCardsContentClass: ");
		result.append(defaultCardsContentClass);
		result.append(", defaultFormContentClass: ");
		result.append(defaultFormContentClass);
		result.append(", defaultSliderContentClass: ");
		result.append(defaultSliderContentClass);
		result.append(", defaultGalleryContentClass: ");
		result.append(defaultGalleryContentClass);
		result.append(", defaultStaticContentClass: ");
		result.append(defaultStaticContentClass);
		result.append(", defaultFieldListClass: ");
		result.append(defaultFieldListClass);
		result.append(", defaultRowClass: ");
		result.append(defaultRowClass);
		result.append(", defaultColumnClass: ");
		result.append(defaultColumnClass);
		result.append(", defaultCardClass: ");
		result.append(defaultCardClass);
		result.append(", defaultCardHeaderClass: ");
		result.append(defaultCardHeaderClass);
		result.append(", defaultCardBodyClass: ");
		result.append(defaultCardBodyClass);
		result.append(", defaultCardFooterClass: ");
		result.append(defaultCardFooterClass);
		result.append(", defaultBadgeClass: ");
		result.append(defaultBadgeClass);
		result.append(", defaultControlClass: ");
		result.append(defaultControlClass);
		result.append(", defaultDetailsControlClass: ");
		result.append(defaultDetailsControlClass);
		result.append(", defaultIndexControlClass: ");
		result.append(defaultIndexControlClass);
		result.append(", defaultCardsControlClass: ");
		result.append(defaultCardsControlClass);
		result.append(", defaultFormControlClass: ");
		result.append(defaultFormControlClass);
		result.append(", defaultSliderControlClass: ");
		result.append(defaultSliderControlClass);
		result.append(", defaultGalleryControlClass: ");
		result.append(defaultGalleryControlClass);
		result.append(", defaultStaticControlClass: ");
		result.append(defaultStaticControlClass);
		result.append(", defaultFieldLabelClass: ");
		result.append(defaultFieldLabelClass);
		result.append(", defaultFieldValueClass: ");
		result.append(defaultFieldValueClass);
		result.append(", defaultInputGroupClass: ");
		result.append(defaultInputGroupClass);
		result.append(", defaultInputLabelClass: ");
		result.append(defaultInputLabelClass);
		result.append(", defaultInputValueClass: ");
		result.append(defaultInputValueClass);
		result.append(", defaultActionNavigationClass: ");
		result.append(defaultActionNavigationClass);
		result.append(", defaultAnchorClass: ");
		result.append(defaultAnchorClass);
		result.append(", defaultDetailsAnchorClass: ");
		result.append(defaultDetailsAnchorClass);
		result.append(", defaultIndexAnchorClass: ");
		result.append(defaultIndexAnchorClass);
		result.append(", defaultCardsAnchorClass: ");
		result.append(defaultCardsAnchorClass);
		result.append(", defaultFormAnchorClass: ");
		result.append(defaultFormAnchorClass);
		result.append(", defaultSliderAnchorClass: ");
		result.append(defaultSliderAnchorClass);
		result.append(", defaultGalleryAnchorClass: ");
		result.append(defaultGalleryAnchorClass);
		result.append(", defaultStaticAnchorClass: ");
		result.append(defaultStaticAnchorClass);
		result.append(", defaultMaximumUploadSize: ");
		result.append(defaultMaximumUploadSize);
		result.append(", inputTechnology: ");
		result.append(inputTechnology);
		result.append(", ajaxTechnology: ");
		result.append(ajaxTechnology);
		result.append(')');
		return result.toString();
	}

} //WebUIImpl
