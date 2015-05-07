/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebGenModelItemProvider.java,v 1.12 2014/06/27 07:52:17 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.website.WebGenModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenModelItemProvider
	extends WebGenItemProvider
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__CLASSIFIERS);
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__SERVICES);
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__PAGES);
			childrenFeatures.add(WebsitePackage.Literals.WEB_GEN_MODEL__MENUS);
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
			case WebsitePackage.WEB_GEN_MODEL__CLASSIFIERS:
			case WebsitePackage.WEB_GEN_MODEL__SERVICES:
			case WebsitePackage.WEB_GEN_MODEL__PAGES:
			case WebsitePackage.WEB_GEN_MODEL__MENUS:
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
				(WebsitePackage.Literals.WEB_GEN_MODEL__CLASSIFIERS,
				 WebsiteFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__CLASSIFIERS,
				 WebsiteFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__CLASSIFIERS,
				 WebsiteFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__SERVICES,
				 WebsiteFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__PAGES,
				 WebsiteFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__MENUS,
				 WebsiteFactory.eINSTANCE.createStaticMenu()));

		newChildDescriptors.add
			(createChildParameter
				(WebsitePackage.Literals.WEB_GEN_MODEL__MENUS,
				 WebsiteFactory.eINSTANCE.createDynamicMenu()));
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
