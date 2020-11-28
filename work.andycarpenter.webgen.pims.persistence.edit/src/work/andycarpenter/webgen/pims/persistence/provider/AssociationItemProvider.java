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

import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.persistence.Association} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationItemProvider extends FeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationItemProvider(AdapterFactory adapterFactory) {
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

			addTargetEntityPropertyDescriptor(object);
			addBidirectionalPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addPivotTableNamePropertyDescriptor(object);
			addTargetFeatureNamePropertyDescriptor(object);
			addTargetPrimaryKeyPropertyDescriptor(object);
			addTargetColumnNamePropertyDescriptor(object);
			addTargetDisplayLabelPropertyDescriptor(object);
			addTargetHeaderClassPropertyDescriptor(object);
			addTargetInputClassPropertyDescriptor(object);
			addTargetDisplayClassPropertyDescriptor(object);
			addTargetFooterClassPropertyDescriptor(object);
			addPseudoPropertyDescriptor(object);
			addSerializationMaxDepthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetEntity_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Bidirectional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBidirectionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_bidirectional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_bidirectional_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__BIDIRECTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
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
				 getString("_UI_Association_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_unique_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pivot Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPivotTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_pivotTableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_pivotTableName_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__PIVOT_TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_PersistencePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Feature Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetFeatureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetFeatureName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetFeatureName_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_FEATURE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Primary Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPrimaryKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetPrimaryKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetPrimaryKey_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_PRIMARY_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_PersistencePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetColumnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetColumnName_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_COLUMN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_PersistencePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Display Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDisplayLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetDisplayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetDisplayLabel_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_DISPLAY_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetHeaderClass_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_HEADER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Input Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetInputClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetInputClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetInputClass_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_INPUT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Display Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDisplayClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetDisplayClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetDisplayClass_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_DISPLAY_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_targetFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_targetFooterClass_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__TARGET_FOOTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pseudo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPseudoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_pseudo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_pseudo_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__PSEUDO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_OrmPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Serialization Max Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSerializationMaxDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_serializationMaxDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_serializationMaxDepth_feature", "_UI_Association_type"),
				 PersistencePackage.Literals.ASSOCIATION__SERIALIZATION_MAX_DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_SerializationPropertyCategory"),
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
			childrenFeatures.add(PersistencePackage.Literals.ASSOCIATION__KEYS);
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
			String label = ((Association)object).getName();
			String targetLabel = ((Association) object).getTargetFeatureName();
			return label == null || label.length() == 0
				? getString("_UI_Association_type")
						+ (targetLabel == null ? "" : " (" + targetLabel + ")")
				: getString("_UI_Association_type") + " " + label;
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

		switch (notification.getFeatureID(Association.class)) {
			case PersistencePackage.ASSOCIATION__BIDIRECTIONAL:
			case PersistencePackage.ASSOCIATION__UNIQUE:
			case PersistencePackage.ASSOCIATION__PIVOT_TABLE_NAME:
			case PersistencePackage.ASSOCIATION__TARGET_FEATURE_NAME:
			case PersistencePackage.ASSOCIATION__TARGET_PRIMARY_KEY:
			case PersistencePackage.ASSOCIATION__TARGET_COLUMN_NAME:
			case PersistencePackage.ASSOCIATION__TARGET_DISPLAY_LABEL:
			case PersistencePackage.ASSOCIATION__TARGET_HEADER_CLASS:
			case PersistencePackage.ASSOCIATION__TARGET_INPUT_CLASS:
			case PersistencePackage.ASSOCIATION__TARGET_DISPLAY_CLASS:
			case PersistencePackage.ASSOCIATION__TARGET_FOOTER_CLASS:
			case PersistencePackage.ASSOCIATION__PSEUDO:
			case PersistencePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PersistencePackage.ASSOCIATION__KEYS:
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
				(PersistencePackage.Literals.ASSOCIATION__KEYS,
				 PersistenceFactory.eINSTANCE.createAssociationKey()));
	}

}
