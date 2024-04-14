/**
 */
package work.andycarpenter.webgen.pims.persistence.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.webgen.pims.base.provider.NamedDisplayElementItemProvider;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.persistence.Feature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider extends NamedDisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureItemProvider(AdapterFactory adapterFactory) {
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

			addCardinalityPropertyDescriptor(object);
			addOrderedPropertyDescriptor(object);
			addPrimaryKeyPropertyDescriptor(object);
			addDerivedPropertyDescriptor(object);
			addCustomiseSetPropertyDescriptor(object);
			addBooleanIsHasChoicePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addCollectionOrmAllowAddPropertyDescriptor(object);
			addCollectionOrmAllowRemovePropertyDescriptor(object);
			addDefaultDisplayValuePropertyDescriptor(object);
			addEmptyDisplayValuePropertyDescriptor(object);
			addEncodeUriKeyPropertyDescriptor(object);
			addSingletonNamePropertyDescriptor(object);
			addPluralisedNamePropertyDescriptor(object);
			addColumnNamePropertyDescriptor(object);
			addSerializationGroupsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_cardinality_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_ordered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_ordered_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__ORDERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_primaryKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_primaryKey_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__PRIMARY_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_PersistencePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_derived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_derived_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__DERIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Customise Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomiseSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_customiseSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_customiseSet_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__CUSTOMISE_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Boolean Is Has Choice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanIsHasChoicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_booleanIsHasChoice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_booleanIsHasChoice_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__BOOLEAN_IS_HAS_CHOICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_title_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Orm Allow Add feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionOrmAllowAddPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_collectionOrmAllowAdd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_collectionOrmAllowAdd_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__COLLECTION_ORM_ALLOW_ADD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Orm Allow Remove feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionOrmAllowRemovePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_collectionOrmAllowRemove_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_collectionOrmAllowRemove_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__COLLECTION_ORM_ALLOW_REMOVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Display Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDisplayValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_defaultDisplayValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_defaultDisplayValue_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__DEFAULT_DISPLAY_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Empty Display Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmptyDisplayValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_emptyDisplayValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_emptyDisplayValue_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__EMPTY_DISPLAY_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Encode Uri Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodeUriKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_encodeUriKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_encodeUriKey_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__ENCODE_URI_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
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
				 getString("_UI_Feature_singletonName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_singletonName_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__SINGLETON_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
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
				 getString("_UI_Feature_pluralisedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_pluralisedName_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__PLURALISED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_columnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_columnName_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__COLUMN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_PersistencePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Serialization Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSerializationGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_serializationGroups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_serializationGroups_feature", "_UI_Feature_type"),
				 PersistencePackage.Literals.FEATURE__SERIALIZATION_GROUPS,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_SerializationPropertyCategory"),
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Feature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Feature_type") :
			getString("_UI_Feature_type") + " " + label;
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

		switch (notification.getFeatureID(Feature.class)) {
			case PersistencePackage.FEATURE__CARDINALITY:
			case PersistencePackage.FEATURE__ORDERED:
			case PersistencePackage.FEATURE__PRIMARY_KEY:
			case PersistencePackage.FEATURE__DERIVED:
			case PersistencePackage.FEATURE__CUSTOMISE_SET:
			case PersistencePackage.FEATURE__BOOLEAN_IS_HAS_CHOICE:
			case PersistencePackage.FEATURE__TITLE:
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD:
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
			case PersistencePackage.FEATURE__DEFAULT_DISPLAY_VALUE:
			case PersistencePackage.FEATURE__EMPTY_DISPLAY_VALUE:
			case PersistencePackage.FEATURE__ENCODE_URI_KEY:
			case PersistencePackage.FEATURE__SINGLETON_NAME:
			case PersistencePackage.FEATURE__PLURALISED_NAME:
			case PersistencePackage.FEATURE__COLUMN_NAME:
			case PersistencePackage.FEATURE__SERIALIZATION_GROUPS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
