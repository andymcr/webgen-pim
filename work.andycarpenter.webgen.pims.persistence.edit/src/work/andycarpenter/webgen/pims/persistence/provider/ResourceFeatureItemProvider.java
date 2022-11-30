/**
 */
package work.andycarpenter.webgen.pims.persistence.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.ResourceFeature;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.persistence.ResourceFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceFeatureItemProvider extends FeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addMaximumUploadSizePropertyDescriptor(object);
			addValidUploadMimeTypesPropertyDescriptor(object);
			addValidUploadExtensionsPropertyDescriptor(object);
			addUriPrefixPropertyDescriptor(object);
			addBaseUploadDirectoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Maximum Upload Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumUploadSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceFeature_maximumUploadSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceFeature_maximumUploadSize_feature", "_UI_ResourceFeature_type"),
				 PersistencePackage.Literals.RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Upload Mime Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidUploadMimeTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceFeature_validUploadMimeTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceFeature_validUploadMimeTypes_feature", "_UI_ResourceFeature_type"),
				 PersistencePackage.Literals.RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Upload Extensions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidUploadExtensionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceFeature_validUploadExtensions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceFeature_validUploadExtensions_feature", "_UI_ResourceFeature_type"),
				 PersistencePackage.Literals.RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceFeature_uriPrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceFeature_uriPrefix_feature", "_UI_ResourceFeature_type"),
				 PersistencePackage.Literals.RESOURCE_FEATURE__URI_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ResourcePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Upload Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseUploadDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceFeature_baseUploadDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceFeature_baseUploadDirectory_feature", "_UI_ResourceFeature_type"),
				 PersistencePackage.Literals.RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_MoelPropertyCategory"),
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
			childrenFeatures.add(PersistencePackage.Literals.RESOURCE_FEATURE__DIRECTORY_NAMER);
			childrenFeatures.add(PersistencePackage.Literals.RESOURCE_FEATURE__FILE_NAMER);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceFeature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceFeature_type") :
			getString("_UI_ResourceFeature_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceFeature.class)) {
			case PersistencePackage.RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE:
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES:
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS:
			case PersistencePackage.RESOURCE_FEATURE__URI_PREFIX:
			case PersistencePackage.RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER:
			case PersistencePackage.RESOURCE_FEATURE__FILE_NAMER:
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
				(PersistencePackage.Literals.RESOURCE_FEATURE__DIRECTORY_NAMER,
				 PersistenceFactory.eINSTANCE.createSubDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__DIRECTORY_NAMER,
				 PersistenceFactory.eINSTANCE.createPropertyDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__DIRECTORY_NAMER,
				 PersistenceFactory.eINSTANCE.createDateTimeDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__FILE_NAMER,
				 PersistenceFactory.eINSTANCE.createUniqueIdNamer()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__FILE_NAMER,
				 PersistenceFactory.eINSTANCE.createOriginalNamer()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__FILE_NAMER,
				 PersistenceFactory.eINSTANCE.createPropertyNamer()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__FILE_NAMER,
				 PersistenceFactory.eINSTANCE.createHashNamer()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__FILE_NAMER,
				 PersistenceFactory.eINSTANCE.createBase64Namer()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__FILE_NAMER,
				 PersistenceFactory.eINSTANCE.createSmartUniqueNamer()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.RESOURCE_FEATURE__FILE_NAMER,
				 PersistenceFactory.eINSTANCE.createSlugNamer()));
	}

}
