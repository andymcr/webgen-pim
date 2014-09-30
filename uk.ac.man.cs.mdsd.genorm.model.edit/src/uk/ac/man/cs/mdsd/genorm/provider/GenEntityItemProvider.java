/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenEntityItemProvider.java,v 1.15 2014/06/27 07:51:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.genorm.GenEntity;
import uk.ac.man.cs.mdsd.genorm.GenOrmFactory;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenEntityItemProvider
	extends GenClassifierItemProvider
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
	public GenEntityItemProvider(AdapterFactory adapterFactory) {
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

			addTableNamePropertyDescriptor(object);
			addKeyNamePropertyDescriptor(object);
			addXmlTransientPropertyDescriptor(object);
			addXmlRootElementPropertyDescriptor(object);
			addXmlNamespacePropertyDescriptor(object);
			addXmlNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_GenEntity_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEntity_tableName_feature", "_UI_GenEntity_type"),
				 GenOrmPackage.Literals.GEN_ENTITY__TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_RelationalPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEntity_keyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEntity_keyName_feature", "_UI_GenEntity_type"),
				 GenOrmPackage.Literals.GEN_ENTITY__KEY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_RelationalPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml Transient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEntity_xmlTransient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEntity_xmlTransient_feature", "_UI_GenEntity_type"),
				 GenOrmPackage.Literals.GEN_ENTITY__XML_TRANSIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_XMLBindingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml Root Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlRootElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEntity_xmlRootElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEntity_xmlRootElement_feature", "_UI_GenEntity_type"),
				 GenOrmPackage.Literals.GEN_ENTITY__XML_ROOT_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_XMLBindingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEntity_xmlNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEntity_xmlNamespace_feature", "_UI_GenEntity_type"),
				 GenOrmPackage.Literals.GEN_ENTITY__XML_NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_XMLBindingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenEntity_xmlName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenEntity_xmlName_feature", "_UI_GenEntity_type"),
				 GenOrmPackage.Literals.GEN_ENTITY__XML_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_XMLBindingPropertyCategory"),
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
			childrenFeatures.add(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES);
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
	 * This returns GenEntity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenEntity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenEntity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenEntity_type") :
			getString("_UI_GenEntity_type") + " " + label;
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

		switch (notification.getFeatureID(GenEntity.class)) {
			case GenOrmPackage.GEN_ENTITY__DEFAULT_TABLE_NAME:
			case GenOrmPackage.GEN_ENTITY__TABLE_NAME:
			case GenOrmPackage.GEN_ENTITY__KEY_NAME:
			case GenOrmPackage.GEN_ENTITY__XML_TRANSIENT:
			case GenOrmPackage.GEN_ENTITY__XML_ROOT_ELEMENT:
			case GenOrmPackage.GEN_ENTITY__XML_NAMESPACE:
			case GenOrmPackage.GEN_ENTITY__XML_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GenOrmPackage.GEN_ENTITY__GEN_FEATURES:
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
				(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES,
				 GenOrmFactory.eINSTANCE.createGenSingletonElement()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES,
				 GenOrmFactory.eINSTANCE.createGenCollectionElement()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES,
				 GenOrmFactory.eINSTANCE.createGenSingletonDate()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES,
				 GenOrmFactory.eINSTANCE.createGenCollectionDate()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES,
				 GenOrmFactory.eINSTANCE.createGenSingletonFile()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES,
				 GenOrmFactory.eINSTANCE.createGenSingletonLocation()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES,
				 GenOrmFactory.eINSTANCE.createGenSingletonAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ENTITY__GEN_FEATURES,
				 GenOrmFactory.eINSTANCE.createGenCollectionAssociation()));
	}

}
