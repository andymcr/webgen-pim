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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.webui.Badge;
import work.andycarpenter.webgen.pims.webui.CollectionUnit;
import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.InlineAction;
import work.andycarpenter.webgen.pims.webui.SingletonUnit;
import work.andycarpenter.webgen.pims.webui.UnitField;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.FeaturePath} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturePathItemProvider 
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
	public FeaturePathItemProvider(AdapterFactory adapterFactory) {
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

			addSuffixesPropertyDescriptor(object);
			addRootContainerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Suffixes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuffixesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Expression_suffixes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Expression_suffixes_feature", "_UI_Expression_type"),
				 ExpressionPackage.Literals.EXPRESSION__SUFFIXES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ExpressionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Expression_rootContainer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Expression_rootContainer_feature", "_UI_Expression_type"),
				 ExpressionPackage.Literals.EXPRESSION__ROOT_CONTAINER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FeaturePath_type");
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

		switch (notification.getFeatureID(FeaturePath.class)) {
			case WebuiPackage.FEATURE_PATH__SUFFIXES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

	protected Set<Entity> getParentTypes(final FeaturePath path) {
		if (path.eContainer() instanceof DynamicUnit) {
			return getParentTypes((DynamicUnit) path.eContainer());

		} else if (path.eContainer() instanceof UnitField) {
			return getParentTypes((UnitField) path.eContainer());

		} else if (path.eContainer() instanceof InlineAction) {
			return getParentTypes((InlineAction) path.eContainer());

		} else if (path.eContainer() instanceof Badge) {
			return getParentTypes((Badge) path.eContainer());

		} else if (path.eContainer() instanceof Expression) {
			return getParentTypes((Expression) path.eContainer());

		} else {
			return Collections.emptySet();
		}
	}

	protected Set<Entity> getParentTypes(final DynamicUnit unit) {
		final Set<Entity> parentTypes = new HashSet<Entity>();
		if (unit instanceof SingletonUnit) {
			final SingletonUnit singleton = (SingletonUnit) unit;
			if (singleton.getContentType() != null) {
				parentTypes.add(singleton.getContentType());
			}
		}

		if (unit instanceof CollectionUnit) {
			final CollectionUnit collection = (CollectionUnit) unit;
			if (collection.getContainingType() != null) {
				parentTypes.add(collection.getContainingType());
			}
		}

		return parentTypes;
	}

	protected Set<Entity> getParentTypes(final UnitField field) {
		return getContentTypes(field.getDisplayedOn());
	}

	protected Set<Entity> getParentTypes(final InlineAction action) {
		final Set<Entity> parentTypes = new HashSet<Entity>();
		if (action.getUsedBy() instanceof CollectionUnit) {
			final CollectionUnit unit = (CollectionUnit) action.getUsedBy();
			parentTypes.addAll(getParentTypes(unit));
		} else if (action.getUsedBy() instanceof UnitField) {
			final UnitField field = (UnitField) action.getUsedBy();
			parentTypes.addAll(getParentTypes(field));
		}
		return parentTypes;
	}

	protected Set<Entity> getParentTypes(final Badge badge) {
		return getContentTypes(badge.getDisplayedOn());
	}

	protected Set<Entity> getParentTypes(final Expression expression) {
		if (expression.eContainer() instanceof DynamicUnit) {
			return getParentTypes((DynamicUnit) expression.eContainer());

		} else if (expression.eContainer() instanceof UnitField) {
			return getContentTypes(((UnitField) expression.eContainer()).getDisplayedOn());

		} else if (expression.eContainer() instanceof InlineAction) {
			return getParentTypes((InlineAction) expression.eContainer());

		} else if (expression.eContainer() instanceof Badge) {
			return getParentTypes((Badge) expression.eContainer());

		} else if (expression.eContainer() instanceof Expression) {
			return getParentTypes((Expression) expression.eContainer());

		} else {
			return Collections.emptySet();
		}
	}

	protected Set<Entity> getContentTypes(final DynamicUnit unit) {
		final Set<Entity> contentTypes = new HashSet<Entity>();
		if (unit instanceof SingletonUnit) {
			final SingletonUnit singleton = (SingletonUnit) unit;
			if (singleton.getContentType() != null) {
				contentTypes.add(singleton.getContentType());
			}
		}

		if (unit instanceof CollectionUnit) {
			final CollectionUnit collection = (CollectionUnit) unit;
			if (!collection.getContentType().isEmpty()) {
				contentTypes.addAll(collection.getContentType());
			}
		}

		return contentTypes;
	}

}
