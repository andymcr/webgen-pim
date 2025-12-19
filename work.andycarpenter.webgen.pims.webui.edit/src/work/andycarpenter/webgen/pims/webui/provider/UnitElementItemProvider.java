/**
 */
package work.andycarpenter.webgen.pims.webui.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.base.BaseFactory;

import work.andycarpenter.webgen.pims.expression.ExpressionFactory;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.service.ServiceFactory;
import work.andycarpenter.webgen.pims.webui.UnitElement;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.UnitElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitElementItemProvider extends UnitFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitElementItemProvider(AdapterFactory adapterFactory) {
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

			addAttributePropertyDescriptor(object);
			addObfuscateFormFieldsPropertyDescriptor(object);
			addPlaceholderPropertyDescriptor(object);
			addValidationPatternPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AttributePathElement_attribute_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AttributePathElement_attribute_feature", "_UI_UnitElement_type"),
			PersistencePackage.Literals.ATTRIBUTE_PATH_ELEMENT__ATTRIBUTE,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitElement) {
						final UnitElement attribute = (UnitElement) object;
						if (attribute.contextEntity() == null) {
							return Collections.emptySet();
						} else {
							return attribute.contextEntity().getAttributes();
						}
					}

					return Collections.emptySet();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Obfuscate Form Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObfuscateFormFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitElement_obfuscateFormFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitElement_obfuscateFormFields_feature", "_UI_UnitElement_type"),
				 WebuiPackage.Literals.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitElement_placeholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitElement_placeholder_feature", "_UI_UnitElement_type"),
				 WebuiPackage.Literals.UNIT_ELEMENT__PLACEHOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitElement_validationPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitElement_validationPattern_feature", "_UI_UnitElement_type"),
				 WebuiPackage.Literals.UNIT_ELEMENT__VALIDATION_PATTERN,
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
			childrenFeatures.add(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE);
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
	 * This returns UnitElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataTypeAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnitElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitElement_type") :
			getString("_UI_UnitElement_type") + " " + label;
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

		switch (notification.getFeatureID(UnitElement.class)) {
			case WebuiPackage.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS:
			case WebuiPackage.UNIT_ELEMENT__PLACEHOLDER:
			case WebuiPackage.UNIT_ELEMENT__VALIDATION_PATTERN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.UNIT_ELEMENT__DEFAULT_VALUE:
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
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createCurrentUser()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createCallable()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createReduceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsMemberOf()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 PersistenceFactory.eINSTANCE.createAssociationVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 PersistenceFactory.eINSTANCE.createAttributeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 PersistenceFactory.eINSTANCE.createResourceVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 PersistenceFactory.eINSTANCE.createParameterVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE,
				 ServiceFactory.eINSTANCE.createConstantReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WebuiPackage.Literals.UNIT_FIELD__HIDE_WHEN ||
			childFeature == WebuiPackage.Literals.UNIT_FEATURE__FORCED_VALUE ||
			childFeature == WebuiPackage.Literals.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN ||
			childFeature == WebuiPackage.Literals.UNIT_ELEMENT__DEFAULT_VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
