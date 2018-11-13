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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.webui.Badge;
import work.andycarpenter.webgen.pims.webui.ChildPath;
import work.andycarpenter.webgen.pims.webui.ChildPathAssociation;
import work.andycarpenter.webgen.pims.webui.CollectionUnit;
import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.FeaturePathAssociation;
import work.andycarpenter.webgen.pims.webui.InlineAction;
import work.andycarpenter.webgen.pims.webui.InlineActionContainer;
import work.andycarpenter.webgen.pims.webui.SingletonUnit;
import work.andycarpenter.webgen.pims.webui.UnitAssociation;
import work.andycarpenter.webgen.pims.webui.UnitElement;
import work.andycarpenter.webgen.pims.webui.UnitField;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.ChildPath} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChildPathItemProvider 
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
	public ChildPathItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ChildPath_type");
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

	protected Entity getParentType(final ChildPath child) {
		Entity parentTarget;
		if (child.getPartOf() instanceof UnitAssociation) {
			parentTarget = getTarget((UnitAssociation) child.getPartOf());
		} else if (child.getPartOf() instanceof FeaturePathAssociation) {
			parentTarget = getTarget((FeaturePathAssociation) child.getPartOf());
		} else {
			final ChildPathAssociation parent = (ChildPathAssociation) child.getPartOf();
			if (getParentType(parent).equals(parent.getAssociation().getPartOf())) {
				parentTarget = parent.getAssociation().getTargetEntity();
			} else {
				parentTarget = parent.getAssociation().getPartOf();
			}
		}
		return parentTarget;
	}

	protected Entity getTarget(final UnitAssociation association) {
		final Set<Entity> entities = getContentTypes(association.getDisplayedOn());
		if (entities.contains(association.getAssociation().getPartOf())) {
			return association.getAssociation().getTargetEntity();
		} else{
			return association.getAssociation().getPartOf();
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
			return contentType;
		}

		return contentType;
	}

	protected Entity getTarget(final FeaturePathAssociation path) {
		if (path.eContainer() instanceof DynamicUnit) {
			final Set<Entity> contentType
				= getContentTypes((DynamicUnit) path.eContainer());
			if (contentType.contains(path.getAssociation().getPartOf())) {
				return path.getAssociation().getTargetEntity();
			} else{
				return path.getAssociation().getPartOf();
			}

		} else if (path.eContainer() instanceof InlineAction) {
			final Set<Entity> entities
				= getEntities((InlineActionContainer) path.eContainer().eContainer());
			if (entities.contains(path.getAssociation().getPartOf())) {
				return path.getAssociation().getTargetEntity();
			} else{
				return path.getAssociation().getPartOf();
			}

		} else if (path.eContainer() instanceof Expression) {
			final Set<Entity> entities
				= getEntities((Expression) path.eContainer());
			if (entities.contains(path.getAssociation().getPartOf())) {
				return path.getAssociation().getTargetEntity();
			} else{
				return path.getAssociation().getPartOf();
			}

		} else {
			return null;
		}
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
