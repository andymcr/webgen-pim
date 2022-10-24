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
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.base.provider.NamedDisplayElementItemProvider;

import work.andycarpenter.webgen.pims.webui.Controller;
import work.andycarpenter.webgen.pims.webui.WebuiFactory;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.Controller} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerItemProvider extends NamedDisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerItemProvider(AdapterFactory adapterFactory) {
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

			addUriElementPropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_uriElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_uriElement_feature", "_UI_Controller_type"),
				 WebuiPackage.Literals.CONTROLLER__URI_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
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
				 getString("_UI_Controller_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_styleClass_feature", "_UI_Controller_type"),
				 WebuiPackage.Literals.CONTROLLER__STYLE_CLASS,
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
			childrenFeatures.add(WebuiPackage.Literals.CONTROLLER__PARENT_CONTROLLER);
			childrenFeatures.add(WebuiPackage.Literals.CONTROLLER__UNITS);
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
	 * This returns Controller.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Controller"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Controller)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Controller_type") :
			getString("_UI_Controller_type") + " " + label;
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

		switch (notification.getFeatureID(Controller.class)) {
			case WebuiPackage.CONTROLLER__URI_ELEMENT:
			case WebuiPackage.CONTROLLER__STYLE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.CONTROLLER__PARENT_CONTROLLER:
			case WebuiPackage.CONTROLLER__UNITS:
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
				(WebuiPackage.Literals.CONTROLLER__PARENT_CONTROLLER,
				 WebuiFactory.eINSTANCE.createControllerLink()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createCreateSitemapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createTabularUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createTextCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createDateCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createImageCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createSliderUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createGalleryUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createLogoutUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createForgottenPasswordUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.CONTROLLER__UNITS,
				 WebuiFactory.eINSTANCE.createResetPasswordUnit()));
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
