/**
 */
package work.andycarpenter.webgen.pims.webui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.webui.ImageCardsUnit;
import work.andycarpenter.webgen.pims.webui.WebuiFactory;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageCardsUnitItemProvider extends CardsUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageCardsUnitItemProvider(AdapterFactory adapterFactory) {
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

			addImageFilterPropertyDescriptor(object);
			addMissingImageFilterPropertyDescriptor(object);
			addMissingImagePathPropertyDescriptor(object);
			addOverlayTitlePropertyDescriptor(object);
			addEnableImageEnlargementPropertyDescriptor(object);
			addRevealUntruncatedContentPropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Image Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_imageFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_imageFilter_feature", "_UI_ImageUnit_type"),
				 WebuiPackage.Literals.IMAGE_UNIT__IMAGE_FILTER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ImagePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Missing Image Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMissingImageFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_missingImageFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_missingImageFilter_feature", "_UI_ImageUnit_type"),
				 WebuiPackage.Literals.IMAGE_UNIT__MISSING_IMAGE_FILTER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ImagePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Missing Image Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMissingImagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_missingImagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_missingImagePath_feature", "_UI_ImageUnit_type"),
				 WebuiPackage.Literals.IMAGE_UNIT__MISSING_IMAGE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ImagePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Overlay Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverlayTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageCardsUnit_overlayTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageCardsUnit_overlayTitle_feature", "_UI_ImageCardsUnit_type"),
				 WebuiPackage.Literals.IMAGE_CARDS_UNIT__OVERLAY_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Image Enlargement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableImageEnlargementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageCardsUnit_enableImageEnlargement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageCardsUnit_enableImageEnlargement_feature", "_UI_ImageCardsUnit_type"),
				 WebuiPackage.Literals.IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Reveal Untruncated Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevealUntruncatedContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageCardsUnit_revealUntruncatedContent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageCardsUnit_revealUntruncatedContent_feature", "_UI_ImageCardsUnit_type"),
				 WebuiPackage.Literals.IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageCardsUnit_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageCardsUnit_styleClass_feature", "_UI_ImageCardsUnit_type"),
				 WebuiPackage.Literals.IMAGE_CARDS_UNIT__STYLE_CLASS,
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
			childrenFeatures.add(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE);
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
	 * This returns ImageCardsUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageCardsUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		final ImageCardsUnit unit = (ImageCardsUnit) object;
		final Object displayedOn = unit.getDisplayedOn();
		String parentLabel = "";
		final IItemLabelProvider provider
			= (IItemLabelProvider) adapterFactory.adapt(displayedOn, IItemLabelProvider.class);
		if (provider != null) {
			parentLabel = provider.getText(displayedOn);
		}
		final String label = unit.getName();
		return parentLabel + ": "
			+ (label == null || label.length() == 0
				? getString("_UI_ImageCardsUnit_type")
				: getString("_UI_ImageCardsUnit_type") + " " + label);
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

		switch (notification.getFeatureID(ImageCardsUnit.class)) {
			case WebuiPackage.IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH:
			case WebuiPackage.IMAGE_CARDS_UNIT__OVERLAY_TITLE:
			case WebuiPackage.IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT:
			case WebuiPackage.IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT:
			case WebuiPackage.IMAGE_CARDS_UNIT__STYLE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE:
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
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WebuiFactory.eINSTANCE.createFeaturePathLabel()));
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
			childFeature == WebuiPackage.Literals.COLLECTION_UNIT__ELEMENT_TITLE ||
			childFeature == WebuiPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
