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
			addUseFormFloatingLabelsPropertyDescriptor(object);
			addDefaultDateFormatPropertyDescriptor(object);
			addDefaultTimeFormatPropertyDescriptor(object);
			addDefaultDateTimeFormatPropertyDescriptor(object);
			addDefaultCancelLabelPropertyDescriptor(object);
			addDefaultCancelIconPropertyDescriptor(object);
			addDefaultCancelTitlePropertyDescriptor(object);
			addDefaultClearLabelPropertyDescriptor(object);
			addDefaultClearIconPropertyDescriptor(object);
			addDefaultClearTitlePropertyDescriptor(object);
			addDefaultSaveLabelPropertyDescriptor(object);
			addDefaultSaveIconPropertyDescriptor(object);
			addDefaultSaveTitlePropertyDescriptor(object);
			addDefaultSearchLabelPropertyDescriptor(object);
			addDefaultSearchIconPropertyDescriptor(object);
			addDefaultSearchTitlePropertyDescriptor(object);
			addDefaultPageStyleClassPropertyDescriptor(object);
			addDefaultMaximumUploadSizePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Use Form Floating Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseFormFloatingLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_useFormFloatingLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_useFormFloatingLabels_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__USE_FORM_FLOATING_LABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
	 * This adds a property descriptor for the Default Cancel Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCancelIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCancelIcon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCancelIcon_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CANCEL_ICON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Cancel Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCancelTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultCancelTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultCancelTitle_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CANCEL_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Clear Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultClearLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultClearLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultClearLabel_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CLEAR_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Clear Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultClearIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultClearIcon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultClearIcon_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CLEAR_ICON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Clear Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultClearTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultClearTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultClearTitle_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_CLEAR_TITLE,
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
	 * This adds a property descriptor for the Default Save Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSaveIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSaveIcon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSaveIcon_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SAVE_ICON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Save Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSaveTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSaveTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSaveTitle_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SAVE_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Search Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSearchLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSearchLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSearchLabel_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SEARCH_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Search Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSearchIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSearchIcon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSearchIcon_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SEARCH_ICON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Search Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSearchTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultSearchTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultSearchTitle_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_SEARCH_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Page Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPageStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebUI_defaultPageStyleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebUI_defaultPageStyleClass_feature", "_UI_WebUI_type"),
				 WebuiPackage.Literals.WEB_UI__DEFAULT_PAGE_STYLE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__NAVIGATION);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__CONTROLLERS);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__DEFAULT_STYLES);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__DEFAULT_CARDS_STYLES);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__DEFAULT_COLLECTION_STYLES);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__DEFAULT_DETAILS_STYLES);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__DEFAULT_FORM_STYLES);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__DEFAULT_STATIC_STYLES);
			childrenFeatures.add(WebuiPackage.Literals.WEB_UI__DEFAULT_TABULAR_STYLES);
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
		WebUI webUI = (WebUI)object;
		return getString("_UI_WebUI_type") + " " + webUI.isUseFormFloatingLabels();
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
			case WebuiPackage.WEB_UI__USE_FORM_FLOATING_LABELS:
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_ICON:
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_TITLE:
			case WebuiPackage.WEB_UI__DEFAULT_CLEAR_LABEL:
			case WebuiPackage.WEB_UI__DEFAULT_CLEAR_ICON:
			case WebuiPackage.WEB_UI__DEFAULT_CLEAR_TITLE:
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_ICON:
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_TITLE:
			case WebuiPackage.WEB_UI__DEFAULT_SEARCH_LABEL:
			case WebuiPackage.WEB_UI__DEFAULT_SEARCH_ICON:
			case WebuiPackage.WEB_UI__DEFAULT_SEARCH_TITLE:
			case WebuiPackage.WEB_UI__DEFAULT_PAGE_STYLE_CLASS:
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.WEB_UI__NAVIGATION:
			case WebuiPackage.WEB_UI__CONTROLLERS:
			case WebuiPackage.WEB_UI__DEFAULT_STYLES:
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES:
			case WebuiPackage.WEB_UI__DEFAULT_COLLECTION_STYLES:
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES:
			case WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES:
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES:
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES:
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
				(WebuiPackage.Literals.WEB_UI__NAVIGATION,
				 WebuiFactory.eINSTANCE.createNavigation()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__CONTROLLERS,
				 WebuiFactory.eINSTANCE.createSinglePageController()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__CONTROLLERS,
				 WebuiFactory.eINSTANCE.createMultiPageController()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__DEFAULT_STYLES,
				 WebuiFactory.eINSTANCE.createDefaultUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__DEFAULT_CARDS_STYLES,
				 WebuiFactory.eINSTANCE.createCardsUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__DEFAULT_COLLECTION_STYLES,
				 WebuiFactory.eINSTANCE.createCollectionUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__DEFAULT_DETAILS_STYLES,
				 WebuiFactory.eINSTANCE.createDetailsUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__DEFAULT_FORM_STYLES,
				 WebuiFactory.eINSTANCE.createFormUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__DEFAULT_STATIC_STYLES,
				 WebuiFactory.eINSTANCE.createStaticUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.WEB_UI__DEFAULT_TABULAR_STYLES,
				 WebuiFactory.eINSTANCE.createTabularUnitStyles()));
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
