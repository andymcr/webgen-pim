/**
 */
package work.andycarpenter.webgen.pims.webui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.webui.WebUI;
import work.andycarpenter.webgen.pims.webui.WebuiFactory;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.WebUI} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebUIItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebUIItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPersistencePropertyDescriptor(object);
			addServicesPropertyDescriptor(object);
			addDefaultDateFormatPropertyDescriptor(object);
			addDefaultTimeFormatPropertyDescriptor(object);
			addDefaultDateTimeFormatPropertyDescriptor(object);
			addDefaultCancelLabelPropertyDescriptor(object);
			addDefaultSaveLabelPropertyDescriptor(object);
			addDefaultStyleClassPropertyDescriptor(object);
			addDefaultSectionClassPropertyDescriptor(object);
			addDefaultCaptionClassPropertyDescriptor(object);
			addDefaultContentClassPropertyDescriptor(object);
			addDefaultDetailsContentClassPropertyDescriptor(object);
			addDefaultTabularContentClassPropertyDescriptor(object);
			addDefaultCardsContentClassPropertyDescriptor(object);
			addDefaultFormContentClassPropertyDescriptor(object);
			addDefaultSliderContentClassPropertyDescriptor(object);
			addDefaultGalleryContentClassPropertyDescriptor(object);
			addDefaultStaticContentClassPropertyDescriptor(object);
			addDefaultFieldListClassPropertyDescriptor(object);
			addDefaultDefinitionFieldListClassPropertyDescriptor(object);
			addDefaultFieldLabelClassPropertyDescriptor(object);
			addDefaultFieldValueClassPropertyDescriptor(object);
			addDefaultInputGroupClassPropertyDescriptor(object);
			addDefaultInputLabelClassPropertyDescriptor(object);
			addDefaultInputValueClassPropertyDescriptor(object);
			addDefaultRowClassPropertyDescriptor(object);
			addDefaultColumnClassPropertyDescriptor(object);
			addDefaultCardClassPropertyDescriptor(object);
			addDefaultCardHeaderClassPropertyDescriptor(object);
			addDefaultCardBodyClassPropertyDescriptor(object);
			addDefaultCardFooterClassPropertyDescriptor(object);
			addDefaultBadgeClassPropertyDescriptor(object);
			addDefaultControlClassPropertyDescriptor(object);
			addDefaultDetailsControlClassPropertyDescriptor(object);
			addDefaultTabularControlClassPropertyDescriptor(object);
			addDefaultCardsControlClassPropertyDescriptor(object);
			addDefaultFormControlClassPropertyDescriptor(object);
			addDefaultSliderControlClassPropertyDescriptor(object);
			addDefaultGalleryControlClassPropertyDescriptor(object);
			addDefaultStaticControlClassPropertyDescriptor(object);
			addDefaultActionNavigationClassPropertyDescriptor(object);
			addDefaultAnchorClassPropertyDescriptor(object);
			addDefaultDetailsAnchorClassPropertyDescriptor(object);
			addDefaultTabularAnchorClassPropertyDescriptor(object);
			addDefaultCardsAnchorClassPropertyDescriptor(object);
			addDefaultFormAnchorClassPropertyDescriptor(object);
			addDefaultSliderAnchorClassPropertyDescriptor(object);
			addDefaultGalleryAnchorClassPropertyDescriptor(object);
			addDefaultStaticAnchorClassPropertyDescriptor(object);
			addDefaultMaximumUploadSizePropertyDescriptor(object);
			addInputTechnologyPropertyDescriptor(object);
			addAjaxTechnologyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Persistence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_persistence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_persistence_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__PERSISTENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_services_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_services_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__SERVICES,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Date Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDateFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultDateFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultDateFormat_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_DATE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Time Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTimeFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultTimeFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultTimeFormat_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_TIME_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Date Time Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDateTimeFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultDateTimeFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultDateTimeFormat_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_DATE_TIME_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Save Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSaveLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSaveLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSaveLabel_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SAVE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Cancel Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCancelLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCancelLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCancelLabel_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CANCEL_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultStyleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultStyleClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_STYLE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Section Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSectionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSectionClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SECTION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Caption Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCaptionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCaptionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCaptionClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CAPTION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultContentClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Details Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDetailsContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultDetailsContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultDetailsContentClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_DETAILS_CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Tabular Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTabularContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultTabularContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultTabularContentClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_TABULAR_CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Cards Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCardsContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCardsContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCardsContentClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CARDS_CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Form Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFormContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultFormContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultFormContentClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_FORM_CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Slider Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSliderContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSliderContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSliderContentClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SLIDER_CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Gallery Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultGalleryContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultGalleryContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultGalleryContentClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_GALLERY_CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Static Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultStaticContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultStaticContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultStaticContentClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_STATIC_CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Row Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultRowClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultRowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultRowClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_ROW_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Column Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultColumnClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultColumnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultColumnClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_COLUMN_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Card Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCardClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CARD_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Card Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCardHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCardHeaderClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CARD_HEADER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Card Body Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCardBodyClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCardBodyClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CARD_BODY_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Card Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCardFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCardFooterClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CARD_FOOTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Badge Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultBadgeClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultBadgeClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultBadgeClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_BADGE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultControlClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Details Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDetailsControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultDetailsControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultDetailsControlClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_DETAILS_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Tabular Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTabularControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultTabularControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultTabularControlClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_TABULAR_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Cards Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCardsControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCardsControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCardsControlClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CARDS_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Form Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFormControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultFormControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultFormControlClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_FORM_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Slider Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSliderControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSliderControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSliderControlClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SLIDER_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Gallery Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultGalleryControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultGalleryControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultGalleryControlClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_GALLERY_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Static Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultStaticControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultStaticControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultStaticControlClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_STATIC_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultAnchorClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Details Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDetailsAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultDetailsAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultDetailsAnchorClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_DETAILS_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Tabular Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTabularAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultTabularAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultTabularAnchorClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_TABULAR_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Cards Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCardsAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCardsAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCardsAnchorClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CARDS_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Form Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFormAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultFormAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultFormAnchorClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_FORM_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Slider Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSliderAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSliderAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSliderAnchorClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SLIDER_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Gallery Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultGalleryAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultGalleryAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultGalleryAnchorClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_GALLERY_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Static Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultStaticAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultStaticAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultStaticAnchorClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_STATIC_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultFieldListClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_FIELD_LIST_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultDefinitionFieldListClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_DEFINITION_FIELD_LIST_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultFieldLabelClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_FIELD_LABEL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultFieldValueClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_FIELD_VALUE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Input Group Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultInputGroupClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultInputGroupClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultInputGroupClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_INPUT_GROUP_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Input Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultInputLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultInputLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultInputLabelClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_INPUT_LABEL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Input Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultInputValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultInputValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultInputValueClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_INPUT_VALUE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Action Navigation Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultActionNavigationClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultActionNavigationClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultActionNavigationClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Maximum Upload Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultMaximumUploadSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultMaximumUploadSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultMaximumUploadSize_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_inputTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_inputTechnology_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__INPUT_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ajax Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAjaxTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_ajaxTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_ajaxTechnology_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__AJAX_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__MENUS);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__PAGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WebUI.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebUI"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WebUI)object).getDefaultDateFormat();
		return label == null || label.length() == 0 ?
			getString("_UI_WebUI_type") :
			getString("_UI_WebUI_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(WebUI.class)) {
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
			case WebuiPackage.WEB_UI__DEFAULT_STYLE_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_SECTION_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CAPTION_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CONTENT_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTENT_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_CONTENT_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTENT_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTENT_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTENT_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTENT_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTENT_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LIST_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_DEFINITION_FIELD_LIST_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_LABEL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_FIELD_VALUE_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_VALUE_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_ROW_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_COLUMN_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CARD_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CARD_HEADER_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CARD_BODY_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CARD_FOOTER_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_BADGE_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CONTROL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_CONTROL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_CONTROL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_CONTROL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_FORM_CONTROL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_CONTROL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_CONTROL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_CONTROL_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_ANCHOR_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_ANCHOR_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_ANCHOR_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_FORM_ANCHOR_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_ANCHOR_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_ANCHOR_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_ANCHOR_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.WEB_UI__MENUS:
			case WebuiPackage.WEB_UI__PAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__MENUS,
				 WebuiFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__MENUS,
				 WebuiFactory.eINSTANCE.createSubmenuEntry()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__PAGES,
				 WebuiFactory.eINSTANCE.createPage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WebuiEditPlugin.INSTANCE;
	}

}
