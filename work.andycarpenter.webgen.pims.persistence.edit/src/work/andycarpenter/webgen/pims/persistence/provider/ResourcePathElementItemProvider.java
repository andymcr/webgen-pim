/**
 */
package work.andycarpenter.webgen.pims.persistence.provider;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.ResourceFeature;
import work.andycarpenter.webgen.pims.persistence.ResourcePathElement;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.persistence.ResourcePathElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcePathElementItemProvider extends PathItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePathElementItemProvider(AdapterFactory adapterFactory) {
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

			addResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourcePathElement_resource_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ResourcePathElement_resource_feature", "_UI_ResourcePathElement_type"),
			PersistencePackage.Literals.RESOURCE_PATH_ELEMENT__RESOURCE,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					final Set<ResourceFeature> resources = new HashSet<ResourceFeature>();
					if (object instanceof ResourcePathElement) {
						final ResourcePathElement resource = (ResourcePathElement) object;
						if (resource.contextEntity() != null) {
							for (Feature feature : resource.contextEntity().getFeatures()) {
								if (feature instanceof ResourceFeature) {
									resources.add((ResourceFeature) feature);
								}
							}
						}
					}
			
					return resources;
				}
			});
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		ResourcePathElement resourcePathElement = (ResourcePathElement)object;
		return getString("_UI_ResourcePathElement_type") + " " + resourcePathElement.name();
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

}
