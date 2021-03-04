/**
 */
package work.andycarpenter.webgen.pims.persistence.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.base.provider.ClassifierItemProvider;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.persistence.Entity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityItemProvider extends ClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityItemProvider(AdapterFactory adapterFactory) {
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

			addSingletonNamePropertyDescriptor(object);
			addPluralisedNamePropertyDescriptor(object);
			addAttributesPropertyDescriptor(object);
			addAssociationsPropertyDescriptor(object);
			addAllFeaturesPropertyDescriptor(object);
			addAllAssociationsPropertyDescriptor(object);
			addContainingAssociationPropertyDescriptor(object);
			addContainingTypePropertyDescriptor(object);
			addKeysPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addContainerUniquePropertyDescriptor(object);
			addRepositoryPropertyDescriptor(object);
			addTableNamePropertyDescriptor(object);
			addAutoKeyNamePropertyDescriptor(object);
			addAutoKeyPersistentTypePropertyDescriptor(object);
			addAutoKeyGenerationStrategyPropertyDescriptor(object);
			addImplementsUserInterfacePropertyDescriptor(object);
			addAllowFormTypeCustomisationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Singleton Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSingletonNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_singletonName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_singletonName_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__SINGLETON_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pluralised Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluralisedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_pluralisedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_pluralisedName_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__PLURALISED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_keys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_keys_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__KEYS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_attributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_attributes_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__ATTRIBUTES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_associations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_associations_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__ASSOCIATIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_allFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_allFeatures_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__ALL_FEATURES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_allAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_allAssociations_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__ALL_ASSOCIATIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containing Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainingAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_containingAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_containingAssociation_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__CONTAINING_ASSOCIATION,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Containing Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_containingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_containingType_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__CONTAINING_TYPE,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_unique_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__UNIQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_containerUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_containerUnique_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__CONTAINER_UNIQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_repository_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_repository_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__REPOSITORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_tableName_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_autoKeyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_autoKeyName_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__AUTO_KEY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Persistent Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyPersistentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_autoKeyPersistentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_autoKeyPersistentType_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__AUTO_KEY_PERSISTENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Generation Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyGenerationStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_autoKeyGenerationStrategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_autoKeyGenerationStrategy_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__AUTO_KEY_GENERATION_STRATEGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implements User Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsUserInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_implementsUserInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_implementsUserInterface_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__IMPLEMENTS_USER_INTERFACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Form Type Customisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowFormTypeCustomisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_allowFormTypeCustomisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_allowFormTypeCustomisation_feature", "_UI_Entity_type"),
				 PersistencePackage.Literals.ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(PersistencePackage.Literals.ENTITY__FEATURES);
			childrenFeatures.add(PersistencePackage.Literals.ENTITY__LABELS);
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
	 * This returns Entity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Entity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Entity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Entity_type") :
			getString("_UI_Entity_type") + " " + label;
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

		switch (notification.getFeatureID(Entity.class)) {
			case PersistencePackage.ENTITY__SINGLETON_NAME:
			case PersistencePackage.ENTITY__PLURALISED_NAME:
			case PersistencePackage.ENTITY__TABLE_NAME:
			case PersistencePackage.ENTITY__AUTO_KEY_NAME:
			case PersistencePackage.ENTITY__AUTO_KEY_PERSISTENT_TYPE:
			case PersistencePackage.ENTITY__AUTO_KEY_GENERATION_STRATEGY:
			case PersistencePackage.ENTITY__IMPLEMENTS_USER_INTERFACE:
			case PersistencePackage.ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PersistencePackage.ENTITY__FEATURES:
			case PersistencePackage.ENTITY__LABELS:
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
				(PersistencePackage.Literals.ENTITY__FEATURES,
				 PersistenceFactory.eINSTANCE.createDataTypeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.ENTITY__FEATURES,
				 PersistenceFactory.eINSTANCE.createDateAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.ENTITY__FEATURES,
				 PersistenceFactory.eINSTANCE.createUrlAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.ENTITY__FEATURES,
				 PersistenceFactory.eINSTANCE.createFileAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.ENTITY__FEATURES,
				 PersistenceFactory.eINSTANCE.createImageAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.ENTITY__FEATURES,
				 PersistenceFactory.eINSTANCE.createLocationAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.ENTITY__FEATURES,
				 PersistenceFactory.eINSTANCE.createAssociationWithoutContainment()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.ENTITY__FEATURES,
				 PersistenceFactory.eINSTANCE.createAssociationWithContainment()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.ENTITY__LABELS,
				 PersistenceFactory.eINSTANCE.createModelLabel()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PersistenceEditPlugin.INSTANCE;
	}

}
