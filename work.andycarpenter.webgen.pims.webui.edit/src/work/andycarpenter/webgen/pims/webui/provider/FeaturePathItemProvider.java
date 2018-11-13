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
import org.eclipse.emf.ecore.EObject;
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
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.service.Selection;
import work.andycarpenter.webgen.pims.webui.Badge;
import work.andycarpenter.webgen.pims.webui.CollectionUnit;
import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.FeaturePathAssociation;
import work.andycarpenter.webgen.pims.webui.InlineAction;
import work.andycarpenter.webgen.pims.webui.InlineActionContainer;
import work.andycarpenter.webgen.pims.webui.SingletonUnit;
import work.andycarpenter.webgen.pims.webui.UnitAssociation;
import work.andycarpenter.webgen.pims.webui.UnitElement;
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
			return getContentTypes((DynamicUnit) path.eContainer());

		} else if (path.eContainer() instanceof InlineAction) {
			return getEntities((InlineActionContainer) path.eContainer().eContainer());

		} else if (path.eContainer() instanceof Expression) {
			return getEntities((Expression) path.eContainer());

		} else if (path.eContainer() instanceof Badge) {
			return getEntities((Badge) path.eContainer());

		} else {
			return Collections.emptySet();
		}
	}

	protected Set<Entity> getTargets(final FeaturePathAssociation path) {
		if (path.eContainer() instanceof DynamicUnit) {
			final Set<Entity> targets = new HashSet<Entity>();
			targets.add(getTarget(path.getAssociation(), (DynamicUnit) path.eContainer()));
			return targets;

		} else if (path.eContainer() instanceof InlineAction) {
			final Set<Entity> targets = new HashSet<Entity>();
			final Set<Entity> entities
				= getEntities((InlineActionContainer) path.eContainer().eContainer());
			if (entities.contains(path.getAssociation().getPartOf())) {
				targets.add(path.getAssociation().getTargetEntity());
			} else{
				targets.add(path.getAssociation().getPartOf());
			}
			return targets;

		} else if (path.eContainer() instanceof Expression) {
			return getEntities((Expression) path.eContainer());

		} else {
			return Collections.emptySet();
		}
	}

	protected Entity getTarget(final Association association, final DynamicUnit unit) {
		final Set<Entity> contentType = getContentTypes(unit);
		if (contentType.contains(association.getPartOf())) {
			return association.getTargetEntity();
		} else{
			return association.getPartOf();
		}
	}

	protected Set<Entity> getContentTypes(final DynamicUnit unit) {
		final Set<Entity> contentType = new HashSet<Entity>();

		if (unit instanceof SingletonUnit) {
			final SingletonUnit singleton = (SingletonUnit) unit;
			if (singleton.getContentType() != null) {
				contentType.add(singleton.getContentType());
				return contentType;
			}
		}

		if (unit instanceof CollectionUnit) {
			final CollectionUnit collection = (CollectionUnit) unit;
			contentType.addAll(collection.getContentType());
			if ((collection.getSelection() != null)
					&& (collection.getSelection().getSelectPath().size() > 0)) {
				contentType.add(getSelectType(collection.getSelection(), collection.getContentType()));
			}
			return contentType;
		}

		return contentType;
	}

	protected Entity getSelectType(final Selection selection, final List<Entity> parentTypes) {
		Entity type = null;
		boolean first = true;
		for (Association association : selection.getSelectPath()) {
			if (first) {
				if (parentTypes.contains(association.getPartOf())) {
					type = association.getTargetEntity();
				} else {
					type = association.getPartOf();
				}
			} else {
				if (association.getPartOf().equals(type)) {
					type = association.getTargetEntity();
				} else {
					type = association.getPartOf();
				}
			}
			first = false;
		}

		return type;
	}

	protected Set<Entity> getEntities(final InlineActionContainer container) {
		final Set<Entity> entities = new HashSet<Entity>();
		if (container instanceof CollectionUnit) {
			entities.addAll(((CollectionUnit) container).getContentType());
		} else if (container instanceof UnitElement) {
			entities.add(getParentType(
				((UnitElement) container).getAttribute()));
		} else if (container instanceof UnitAssociation) {
			entities.add(((UnitAssociation) container).getAssociation().getPartOf());
		}

		return entities;
	}

	protected Set<Entity> getEntities(final Badge badge) {
		final Set<Entity> entities = new HashSet<Entity>();
		if (badge.eContainer() instanceof CollectionUnit) {
			entities.addAll(((CollectionUnit) badge.eContainer()).getContentType());
		} else if (badge.eContainer() instanceof UnitElement) {
			entities.add(getParentType(
				((UnitElement) badge.eContainer()).getAttribute()));
		} else if (badge.eContainer() instanceof UnitAssociation) {
			entities.add(((UnitAssociation) badge.eContainer()).getAssociation().getPartOf());
		}

		return entities;
	}

	protected Set<Entity> getEntities(final Expression expression) {
		final DynamicUnit unit = getDynamicUnitContext(expression);
		if (unit != null) {
			return getContentTypes(unit);
		}

		final InlineActionContainer action = getActionContext(expression);
		if (action != null) {
			return getEntities(action);
		}

		final Badge badge = getBadgeContext(expression);
		if (badge != null) {
			return getEntities(badge);
		}

		return Collections.emptySet();
	}

	protected Entity getParentType(final Attribute attribute) {
		return attribute.getPartOf();
	}

	protected Object getContext(final Object object) {
		if (object instanceof EObject) {
			return ((EObject) object).eContainer();
		} else {
			return null;
		}
	}

	protected DynamicUnit getDynamicUnitContext(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof DynamicUnit) {
				return (DynamicUnit) container;
			}
			container = getContext(container);
		}

		return null;
	}

	protected UnitField getUnitFieldContext(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof UnitField) {
				return (UnitField) container;
			}
			container = getContext(container);
		}

		return null;
	}

	protected InlineActionContainer getActionContext(final Object object) { 
	Object container = getContext(object); 
 		while (container != null) { 
 			if (container instanceof InlineActionContainer) { 
 				return (InlineActionContainer) container; 
 			} 
 			container = getContext(container); 
 		} 
 
 		return null; 
	}
 
	protected Badge getBadgeContext(final Object object) { 
	Object container = getContext(object); 
 		while (container != null) { 
 			if (container instanceof Badge) { 
 				return (Badge) container; 
 			} 
 			container = getContext(container); 
 		} 
 
 		return null; 
	}
 
}
