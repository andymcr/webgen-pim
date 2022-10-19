/**
 */
package work.andycarpenter.webgen.pims.webui.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.expression.ExpressionFactory;
import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.WebuiFactory;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.DynamicUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicUnitItemProvider extends ContentUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnitItemProvider(AdapterFactory adapterFactory) {
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

			addContainerActionsPlacementPropertyDescriptor(object);
			addInstanceActionsPlacementPropertyDescriptor(object);
			addActionNavigationClassPropertyDescriptor(object);
			addContentTypePropertyDescriptor(object);
			addContainingTypePropertyDescriptor(object);
			addHasWhenFieldsEmptyAddImplicitFieldsPropertyDescriptor(object);
			addMessageWhenHiddenPropertyDescriptor(object);
			addHeaderPropertyDescriptor(object);
			addFooterPropertyDescriptor(object);
			addLocalFieldListClassPropertyDescriptor(object);
			addLocalFieldLabelClassPropertyDescriptor(object);
			addLocalFieldValueClassPropertyDescriptor(object);
			addLocalControlClassPropertyDescriptor(object);
			addLocalInstanceControlClassPropertyDescriptor(object);
			addLocalAnchorClassPropertyDescriptor(object);
			addLocalInstanceAnchorClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Container Actions Placement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerActionsPlacementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_containerActionsPlacement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_containerActionsPlacement_feature", "_UI_ActionContainer_type"),
				 WebuiPackage.Literals.ACTION_CONTAINER__CONTAINER_ACTIONS_PLACEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Actions Placement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceActionsPlacementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_instanceActionsPlacement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_instanceActionsPlacement_feature", "_UI_ActionContainer_type"),
				 WebuiPackage.Literals.ACTION_CONTAINER__INSTANCE_ACTIONS_PLACEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Navigation Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionNavigationClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_actionNavigationClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_actionNavigationClass_feature", "_UI_ActionContainer_type"),
				 WebuiPackage.Literals.ACTION_CONTAINER__ACTION_NAVIGATION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_contentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_contentType_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__CONTENT_TYPE,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_ModelPropertyCategory"),
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
				 getString("_UI_DynamicUnit_containingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_containingType_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__CONTAINING_TYPE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has When Fields Empty Add Implicit Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasWhenFieldsEmptyAddImplicitFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasWhenFieldsEmptyAddImplicitFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasWhenFieldsEmptyAddImplicitFields_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Message When Hidden feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageWhenHiddenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_messageWhenHidden_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_messageWhenHidden_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_header_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_header_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__HEADER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFooterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_footer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_footer_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__FOOTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localFieldListClass_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localFieldLabelClass_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localFieldValueClass_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localControlClass_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__LOCAL_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localInstanceControlClass_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localAnchorClass_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localInstanceAnchorClass_feature", "_UI_DynamicUnit_type"),
				 WebuiPackage.Literals.DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
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
			childrenFeatures.add(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS);
			childrenFeatures.add(WebuiPackage.Literals.DYNAMIC_UNIT__ROUTE_ACTUALS);
			childrenFeatures.add(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS);
			childrenFeatures.add(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN);
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
		String label = ((DynamicUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DynamicUnit_type") :
			getString("_UI_DynamicUnit_type") + " " + label;
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

		switch (notification.getFeatureID(DynamicUnit.class)) {
			case WebuiPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT:
			case WebuiPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT:
			case WebuiPackage.DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS:
			case WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPE:
			case WebuiPackage.DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS:
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS:
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS:
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS:
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_CONTROL_CLASS:
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS:
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS:
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.DYNAMIC_UNIT__ACTIONS:
			case WebuiPackage.DYNAMIC_UNIT__ROUTE_ACTUALS:
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
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
				(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createSecurityAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createContainerSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createInstanceSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createTargetAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createContainerOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createInstanceOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createGeneralOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__ROUTE_ACTUALS,
				 WebuiFactory.eINSTANCE.createRouteActual()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createUnitElement()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createUnitAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createUnitLabel()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createDataTypeField()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS,
				 WebuiFactory.eINSTANCE.createDateField()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));
	}

}
