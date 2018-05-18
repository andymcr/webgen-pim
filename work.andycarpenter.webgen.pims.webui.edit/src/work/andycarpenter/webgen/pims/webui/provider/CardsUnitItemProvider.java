/**
 */
package work.andycarpenter.webgen.pims.webui.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.persistence.AssociationWithContainment;
import work.andycarpenter.webgen.pims.persistence.EntityOrView;
import work.andycarpenter.webgen.pims.persistence.Label;
import work.andycarpenter.webgen.pims.webui.CardsUnit;
import work.andycarpenter.webgen.pims.webui.WebuiFactory;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.CardsUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CardsUnitItemProvider extends CollectionUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardsUnitItemProvider(AdapterFactory adapterFactory) {
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

			addUnitTitlePropertyDescriptor(object);
			addOmitFieldLabelsPropertyDescriptor(object);
			addOverlaySingleSelectActionPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addColumnClassPropertyDescriptor(object);
			addCardClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unit Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addUnitTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CardsUnit_unitTitle_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_unitTitle_feature", "_UI_CardsUnit_type"),
			WebuiPackage.Literals.CARDS_UNIT__UNIT_TITLE,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof CardsUnit) {
						final CardsUnit unit = (CardsUnit) object;
						if (unit.isOmitContainerLoad()) {
							return Collections.emptySet();
						}
						final Set<Label> labels = new HashSet<Label>();
						final EntityOrView selectType = getSelectType(unit);
						if (selectType != null) {
							labels.addAll(selectType.getAttributes());
							labels.addAll(selectType.getLabels());
						} else if (unit.getContentType().size() > 0){
							final AssociationWithContainment containingAssociation
								= getContainingAssociation(unit.getContentType().get(0));
							if (containingAssociation != null) {
								labels.addAll(containingAssociation.getPartOf().getAttributes());
								labels.addAll(containingAssociation.getPartOf().getLabels());
							}
						}
						return labels;
					}

					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Omit Field Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOmitFieldLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_omitFieldLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_omitFieldLabels_feature", "_UI_CardsUnit_type"),
				 WebuiPackage.Literals.CARDS_UNIT__OMIT_FIELD_LABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overlay Single Select Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverlaySingleSelectActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_overlaySingleSelectAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_overlaySingleSelectAction_feature", "_UI_CardsUnit_type"),
				 WebuiPackage.Literals.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_contentClass_feature", "_UI_CardsUnit_type"),
				 WebuiPackage.Literals.CARDS_UNIT__CONTENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_columnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_columnClass_feature", "_UI_CardsUnit_type"),
				 WebuiPackage.Literals.CARDS_UNIT__COLUMN_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardClass_feature", "_UI_CardsUnit_type"),
				 WebuiPackage.Literals.CARDS_UNIT__CARD_CLASS,
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
			childrenFeatures.add(WebuiPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS);
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
		String label = ((CardsUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CardsUnit_type") :
			getString("_UI_CardsUnit_type") + " " + label;
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

		switch (notification.getFeatureID(CardsUnit.class)) {
			case WebuiPackage.CARDS_UNIT__OMIT_FIELD_LABELS:
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
			case WebuiPackage.CARDS_UNIT__CONTENT_CLASS:
			case WebuiPackage.CARDS_UNIT__COLUMN_CLASS:
			case WebuiPackage.CARDS_UNIT__CARD_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.CARDS_UNIT__ACTIONS:
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
				(WebuiPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WebuiFactory.eINSTANCE.createFeatureSupportAction()));
	}

}
