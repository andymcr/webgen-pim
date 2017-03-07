/**
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import security.SecurityFactory;
import uk.ac.man.cs.mdsd.webgen.base.BaseFactory;
import uk.ac.man.cs.mdsd.webgen.image.ImageFactory;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistenceFactory;
import uk.ac.man.cs.mdsd.webgen.service.ServiceFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiFactory;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenModelItemProvider 
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
	public WebGenModelItemProvider(AdapterFactory adapterFactory) {
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

			addClassifiersPropertyDescriptor(object);
			addServicesPropertyDescriptor(object);
			addPagesPropertyDescriptor(object);
			addMenusPropertyDescriptor(object);
			addAllowTypeCustomisationPropertyDescriptor(object);
			addImageManipulationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Classifiers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifiersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebGenModel_classifiers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebGenModel_classifiers_feature", "_UI_WebGenModel_type"),
				 WebsitePackage.Literals.WEB_GEN_MODEL__CLASSIFIERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebGenModel_services_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebGenModel_services_feature", "_UI_WebGenModel_type"),
				 WebsitePackage.Literals.WEB_GEN_MODEL__SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebGenModel_pages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebGenModel_pages_feature", "_UI_WebGenModel_type"),
				 WebsitePackage.Literals.WEB_GEN_MODEL__PAGES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Menus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMenusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebGenModel_menus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebGenModel_menus_feature", "_UI_WebGenModel_type"),
				 WebsitePackage.Literals.WEB_GEN_MODEL__MENUS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Type Customisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowTypeCustomisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebGenModel_allowTypeCustomisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebGenModel_allowTypeCustomisation_feature", "_UI_WebGenModel_type"),
				 WebsitePackage.Literals.WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Manipulations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageManipulationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebGenModel_imageManipulations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebGenModel_imageManipulations_feature", "_UI_WebGenModel_type"),
				 WebsitePackage.Literals.WEB_GEN_MODEL__IMAGE_MANIPULATIONS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__WEBSITE_PROPERTIES);
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__PERSISTENCE);
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__SERVICES_X);
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__WEB_UI);
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__IMAGES);
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__SECURITY);
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
	 * This returns WebGenModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebGenModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_WebGenModel_type");
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

		switch (notification.getFeatureID(WebGenModel.class)) {
			case WebsitePackage.WEB_GEN_MODEL__WEBSITE_PROPERTIES:
			case WebsitePackage.WEB_GEN_MODEL__PERSISTENCE:
			case WebsitePackage.WEB_GEN_MODEL__SERVICES_X:
			case WebsitePackage.WEB_GEN_MODEL__WEB_UI:
			case WebsitePackage.WEB_GEN_MODEL__IMAGES:
			case WebsitePackage.WEB_GEN_MODEL__SECURITY:
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
				(WebsitePackage.Literals.WEB_GEN_MODEL__WEBSITE_PROPERTIES,
				 WebsiteFactory.eINSTANCE.createWebsiteProperties()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__PERSISTENCE,
				 PersistenceFactory.eINSTANCE.createPersistence()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__SERVICES_X,
				 ServiceFactory.eINSTANCE.createServices()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__WEB_UI,
				 WebuiFactory.eINSTANCE.createWebUI()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__IMAGES,
				 ImageFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__SECURITY,
				 SecurityFactory.eINSTANCE.createSecurity()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WebsiteEditPlugin.INSTANCE;
	}

}
