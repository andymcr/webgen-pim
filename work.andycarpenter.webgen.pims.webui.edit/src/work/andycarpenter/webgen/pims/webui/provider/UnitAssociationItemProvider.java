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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.webgen.pims.persistence.AssociationPathElement;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.Repository;
import work.andycarpenter.webgen.pims.persistence.Selection;
import work.andycarpenter.webgen.pims.webui.UnitAssociation;
import work.andycarpenter.webgen.pims.webui.WebUI;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.UnitAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitAssociationItemProvider extends UnitFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addAssociationPropertyDescriptor(object);
			addValueDisplayPropertyDescriptor(object);
			addAssociationSourcePropertyDescriptor(object);
			addAssociationTargetPropertyDescriptor(object);
			addOptionsPropertyDescriptor(object);
			addCollectionSortByPropertyDescriptor(object);
			addUseAutocompletePropertyDescriptor(object);
			addAutocompleteKeysPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Association Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssociationPathElement_associationSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssociationPathElement_associationSource_feature", "_UI_AssociationPathElement_type"),
				 PersistencePackage.Literals.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Association Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssociationPathElement_associationTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssociationPathElement_associationTarget_feature", "_UI_AssociationPathElement_type"),
				 PersistencePackage.Literals.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociationPathElement_association_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AssociationPathElement_association_feature", "_UI_AssociationPathElement_type"),
			PersistencePackage.Literals.ASSOCIATION_PATH_ELEMENT__ASSOCIATION,
			true, false, true, null,
			getString("_UI_ModelPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof AssociationPathElement) {
						final AssociationPathElement association = (AssociationPathElement) object;
						if (association.contextEntity() != null) {
							return association.contextEntity().getAllAssociations();
						}
					}
		
					return Collections.emptyList();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Options feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOptionsPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
//			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//			getResourceLocator(),
//			getString("_UI_UnitAssociation_options_feature"),
//			getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_options_feature", "_UI_UnitAssociation_type"),
//			WebuiPackage.Literals.UNIT_ASSOCIATION__OPTIONS,
//			true, false, true, null,
//			getString("_UI_InterfacePropertyCategory"),
//			null) {
//				@Override
//				public Collection<?> getChoiceOfValues(Object object) {
//					if (object instanceof UnitAssociation) {
//						final UnitAssociation association = (UnitAssociation) object;
//						if (association.getTargetEntity() != null) {
//							return getSelections(association.getDisplayedOn().getController().getWebUI(),
//								association.getTargetEntity());
//						}
//					}
//					return Collections.emptySet();
//				}
//		});
	}

	/**
	 * This adds a property descriptor for the Value Display feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValueDisplayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociationPathElement_valueDisplay_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_AssociationPathElement_valueDisplay_feature", "_UI_UnitAssociation_type"),
			PersistencePackage.Literals.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final UnitAssociation association = (UnitAssociation) object;
						if (association.getAssociationTarget() != null) {
							return association.getAssociationTarget().getLabels();
						}
					}
			
					return Collections.emptyList();
				}
			});
	}

	/**
	 * This adds a property descriptor for the Collection Sort By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCollectionSortByPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
//			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//			getResourceLocator(),
//			getString("_UI_UnitAssociation_collectionSortBy_feature"),
//			getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_collectionSortBy_feature", "_UI_UnitAssociation_type"),
//			WebuiPackage.Literals.UNIT_ASSOCIATION__COLLECTION_SORT_BY,
//			true, false, true, null,
//			getString("_UI_ModelPropertyCategory"),
//			null) {
//				@Override
//				public Collection<?> getChoiceOfValues(Object object) {
//					if (object instanceof UnitAssociation) {
//						final UnitAssociation association = (UnitAssociation) object;
//						return association.getTargetEntity().getAttributes();
//					}
//
//					return Collections.emptySet();
//				}
//			});
	}

	/**
	 * This adds a property descriptor for the Use Autocomplete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseAutocompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_useAutocomplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_useAutocomplete_feature", "_UI_UnitAssociation_type"),
				 WebuiPackage.Literals.UNIT_ASSOCIATION__USE_AUTOCOMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Autocomplete Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAutocompleteKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_UnitAssociation_autocompleteKeys_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_autocompleteKeys_feature", "_UI_UnitAssociation_type"),
			WebuiPackage.Literals.UNIT_ASSOCIATION__AUTOCOMPLETE_KEYS,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof UnitAssociation) {
						final UnitAssociation association = (UnitAssociation) object;
						if (association.getAssociationTarget() != null) {
							final Entity target = association.getAssociationTarget();
							return containedAttributes(target);
						}
					}

					return Collections.emptyList();
				}
			});
	}

	protected Set<Attribute> containedAttributes(final Entity type) {
		final Set<Attribute> attributes = new HashSet<Attribute>();
		attributes.addAll(type.getAttributes());
		if (type.getContainingAssociation() != null) {
			attributes.addAll(containedAttributes(type.getContainingType()));
		}

		return attributes;
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
			childrenFeatures.add(PersistencePackage.Literals.PATH_ROOT__CHILD_FEATURE);
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
	 * This returns UnitAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationWithoutContainment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		UnitAssociation unitAssociation = (UnitAssociation)object;
		return getString("_UI_UnitAssociation_type") + " " + unitAssociation.name();
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

		switch (notification.getFeatureID(UnitAssociation.class)) {
			case WebuiPackage.UNIT_ASSOCIATION__USE_AUTOCOMPLETE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
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
				(PersistencePackage.Literals.PATH_ROOT__CHILD_FEATURE,
				 PersistenceFactory.eINSTANCE.createChildAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.PATH_ROOT__CHILD_FEATURE,
				 PersistenceFactory.eINSTANCE.createChildAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.PATH_ROOT__CHILD_FEATURE,
				 PersistenceFactory.eINSTANCE.createChildResource()));
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
			childFeature == WebuiPackage.Literals.UNIT_FIELD__HIDE_WHEN ||
			childFeature == WebuiPackage.Literals.UNIT_FEATURE__FORCED_VALUE ||
			childFeature == WebuiPackage.Literals.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	protected Set<Selection> getSelections(final WebUI webUI, final Entity contentType) {
		final Set<Selection> selections = new HashSet<Selection>();
		for (Repository repository : webUI.getPersistence().getRepositories()) {
			if (contentType.equals(repository.getServes())) {
				selections.addAll(repository.getSelections());
			}
		}

		return selections;
	}
}
