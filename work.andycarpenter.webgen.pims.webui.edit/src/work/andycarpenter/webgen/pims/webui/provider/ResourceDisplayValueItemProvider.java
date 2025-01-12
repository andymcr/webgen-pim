/**
 */
package work.andycarpenter.webgen.pims.webui.provider;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.ResourceFeature;
import work.andycarpenter.webgen.pims.persistence.provider.ResourcePathElementItemProvider;
import work.andycarpenter.webgen.pims.webui.ResourceDisplayValue;
import work.andycarpenter.webgen.pims.webui.ValueContext;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.ResourceDisplayValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDisplayValueItemProvider extends ResourcePathElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDisplayValueItemProvider(AdapterFactory adapterFactory) {
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
	 * This adds a property descriptor for the Association feature.
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
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					final Set<ResourceFeature> resources = new HashSet<ResourceFeature>();
					if (object instanceof ResourceDisplayValue) {
						final ResourceDisplayValue value = (ResourceDisplayValue) object;
						if (value.eContainer() instanceof ValueContext) {
							final ValueContext context = (ValueContext) value.eContainer();
							for (Entity entity : context.valueEntities()) {
								for (Feature feature : entity.getFeatures()) {
									if (feature instanceof ResourceFeature) {
										resources.add((ResourceFeature) feature);
									}
								}
							}
						}
					}
		
					return resources;
				}
			});
	}

	/**
	 * This returns ResourceDisplayValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceDisplayValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceDisplayValue)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceDisplayValue_type") :
			getString("_UI_ResourceDisplayValue_type") + " " + label;
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
