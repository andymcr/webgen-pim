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

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Label;
import work.andycarpenter.webgen.pims.persistence.Selection;
import work.andycarpenter.webgen.pims.webui.CollectionUnit;
import work.andycarpenter.webgen.pims.webui.WebuiFactory;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.CollectionUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionUnitItemProvider extends DynamicUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionUnitItemProvider(AdapterFactory adapterFactory) {
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

			addValueEntitiesPropertyDescriptor(object);
			addUnitTitlePropertyDescriptor(object);
			addTruncateElementTitlePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addFindContainerSelectionPropertyDescriptor(object);
			addFindElementSelectionPropertyDescriptor(object);
			addFilterPropertyDescriptor(object);
			addFiltersUseAutoSubmitPropertyDescriptor(object);
			addClearLabelOverridePropertyDescriptor(object);
			addClearIconOverridePropertyDescriptor(object);
			addClearTitleOverridePropertyDescriptor(object);
			addSearchLabelOverridePropertyDescriptor(object);
			addSearchIconOverridePropertyDescriptor(object);
			addSearchTitleOverridePropertyDescriptor(object);
			addOmitFieldLabelsPropertyDescriptor(object);
			addDefaultPaginationSizePropertyDescriptor(object);
			addMaximumPaginationSizePropertyDescriptor(object);
			addEmptyMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueEntitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueContext_valueEntities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueContext_valueEntities_feature", "_UI_ValueContext_type"),
				 WebuiPackage.Literals.VALUE_CONTEXT__VALUE_ENTITIES,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addUnitTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_unitTitle_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_unitTitle_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__UNIT_TITLE,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					final Set<Label> labels = new HashSet<Label>();
					if (object instanceof CollectionUnit) {
						final CollectionUnit unit = (CollectionUnit) object;
						for (Entity type : unit.referencableEntities()) {
							labels.addAll(type.getAttributes());
							labels.addAll(type.getLabels());
						}
					}

					return labels;
				}
		});
	}

	/**
	 * This adds a property descriptor for the Truncate Element Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTruncateElementTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_truncateElementTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_truncateElementTitle_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_selection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_selection_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__SELECTION,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof CollectionUnit) {
						final CollectionUnit unit = (CollectionUnit) object;
						if (unit.getContentType() != null) {
							return getSelections(unit.getContentType());
						}
					}
					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Find Container Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFindContainerSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_findContainerSelection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_findContainerSelection_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__FIND_CONTAINER_SELECTION,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof CollectionUnit) {
						final CollectionUnit unit = (CollectionUnit) object;
						if (unit.containingType() != null) {
							return getSelections(unit.containingType());
						}
					}

					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Find Element Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFindElementSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_findElementSelection_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_findElementSelection_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__FIND_ELEMENT_SELECTION,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof CollectionUnit) {
						final CollectionUnit unit = (CollectionUnit) object;
						if (unit.getContentType() != null) {
							return getSelections(unit.getContentType());
						}
					}

					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CollectionUnit_filter_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filter_feature", "_UI_CollectionUnit_type"),
			WebuiPackage.Literals.COLLECTION_UNIT__FILTER,
			true, false, true, null,
			getString("_UI_BusinessPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof CollectionUnit) {
						final CollectionUnit unit = (CollectionUnit) object;
						if (unit.getSelection() != null) {
							return unit.getSelection().getFilters();
						}
					}

					return Collections.emptySet();
				}
		});
	}

	/**
	 * This adds a property descriptor for the Filters Use Auto Submit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltersUseAutoSubmitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_filtersUseAutoSubmit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filtersUseAutoSubmit_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__FILTERS_USE_AUTO_SUBMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Clear Label Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClearLabelOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_clearLabelOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_clearLabelOverride_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__CLEAR_LABEL_OVERRIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Clear Icon Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClearIconOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_clearIconOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_clearIconOverride_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__CLEAR_ICON_OVERRIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Clear Title Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClearTitleOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_clearTitleOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_clearTitleOverride_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__CLEAR_TITLE_OVERRIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Search Label Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSearchLabelOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_searchLabelOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_searchLabelOverride_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__SEARCH_LABEL_OVERRIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Search Icon Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSearchIconOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_searchIconOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_searchIconOverride_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__SEARCH_ICON_OVERRIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Search Title Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSearchTitleOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_searchTitleOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_searchTitleOverride_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__SEARCH_TITLE_OVERRIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Empty Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmptyMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_emptyMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_emptyMessage_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__EMPTY_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Omit Field Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOmitFieldLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_omitFieldLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_omitFieldLabels_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__OMIT_FIELD_LABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Pagination Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPaginationSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_defaultPaginationSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_defaultPaginationSize_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_PaginationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Pagination Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPaginationSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_maximumPaginationSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_maximumPaginationSize_feature", "_UI_CollectionUnit_type"),
				 WebuiPackage.Literals.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_PaginationPropertyCategory"),
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
			childrenFeatures.add(WebuiPackage.Literals.COLLECTION_UNIT__ELEMENT_TITLE);
			childrenFeatures.add(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CollectionUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CollectionUnit_type") :
			getString("_UI_CollectionUnit_type") + " " + label;
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

		switch (notification.getFeatureID(CollectionUnit.class)) {
			case WebuiPackage.COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE:
			case WebuiPackage.COLLECTION_UNIT__FILTERS_USE_AUTO_SUBMIT:
			case WebuiPackage.COLLECTION_UNIT__CLEAR_LABEL_OVERRIDE:
			case WebuiPackage.COLLECTION_UNIT__CLEAR_ICON_OVERRIDE:
			case WebuiPackage.COLLECTION_UNIT__CLEAR_TITLE_OVERRIDE:
			case WebuiPackage.COLLECTION_UNIT__SEARCH_LABEL_OVERRIDE:
			case WebuiPackage.COLLECTION_UNIT__SEARCH_ICON_OVERRIDE:
			case WebuiPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
			case WebuiPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
			case WebuiPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE:
			case WebuiPackage.COLLECTION_UNIT__FILTERS:
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
				(WebuiPackage.Literals.COLLECTION_UNIT__ELEMENT_TITLE,
				 WebuiFactory.eINSTANCE.createAssociationDisplayValue()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__ELEMENT_TITLE,
				 WebuiFactory.eINSTANCE.createAttributeDisplayValue()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__ELEMENT_TITLE,
				 WebuiFactory.eINSTANCE.createLabelDisplayValue()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__ELEMENT_TITLE,
				 WebuiFactory.eINSTANCE.createResourceDisplayValue()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createArrayFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createBooleanFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createChoiceFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createComparisionFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createDateTimeFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createEntityFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createNullFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createNumericFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WebuiPackage.Literals.COLLECTION_UNIT__FILTERS,
				 WebuiFactory.eINSTANCE.createTextFilter()));
	}

	protected List<Selection> getSelections(final Entity entity) {
		if (entity.getRepository() != null) {
			return entity.getRepository().getSelections();
		}

		return Collections.emptyList();
	}

}
