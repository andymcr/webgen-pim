/**
 */
package work.andycarpenter.webgen.pims.persistence.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.base.BaseFactory;
import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.base.provider.NamedElementItemProvider;
import work.andycarpenter.webgen.pims.expression.ExpressionFactory;
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.Selection;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.persistence.Selection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionItemProvider 
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionItemProvider(AdapterFactory adapterFactory) {
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

			addDistinctPropertyDescriptor(object);
			addFieldsPropertyDescriptor(object);
			addJoinsPropertyDescriptor(object);
			addLimitPropertyDescriptor(object);
			addGroupingPropertyDescriptor(object);
			addSelectPathPropertyDescriptor(object);
			addPathTypePropertyDescriptor(object);
			addMethodNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Distinct feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistinctPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_distinct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_distinct_feature", "_UI_Selection_type"),
				 PersistencePackage.Literals.SELECTION__DISTINCT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DataAccessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Selection_fields_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Selection_fields_feature", "_UI_Selection_type"),
			PersistencePackage.Literals.SELECTION__FIELDS,
			true, false, true, null,
			getString("_UI_DataAccessPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof Selection) {
					final Selection selection = (Selection) object;
					return selection.getDefinedBy().getServes().getAllFeatures();
				}

				return Collections.emptySet();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Joins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addJoinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Selection_joins_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Selection_joins_feature", "_UI_Selection_type"),
			PersistencePackage.Literals.SELECTION__JOINS,
			true, false, true, null,
			getString("_UI_DataAccessPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof Selection) {
					final Selection selection = (Selection) object;
					final Set<Association> associations = new HashSet<Association>();
					for (Entity entity : getEntities(selection)) {
						associations.addAll(entity.getAllAssociations());
					}

					return associations;
				}

				return Collections.emptySet();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_limit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_limit_feature", "_UI_Selection_type"),
				 PersistencePackage.Literals.SELECTION__LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_DataAccessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Grouping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_grouping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_grouping_feature", "_UI_Selection_type"),
				 PersistencePackage.Literals.SELECTION__GROUPING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grouing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addGrouingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Selection_grouping_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Selection_grouping_feature", "_UI_Selection_type"),
			PersistencePackage.Literals.SELECTION__GROUPING,
			true, false, true, null,
			getString("_UI_DataAccessPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof Selection) {
					final Selection selection = (Selection) object;
					final Set<Feature> features = new HashSet<Feature>();
					for (Entity entity : getEntities(selection)) {
						features.addAll(entity.getFeatures());
					}

					return features;
				}

				return Collections.emptySet();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Select Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSelectPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Selection_selectPath_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Selection_selectPath_feature", "_UI_Selection_type"),
			PersistencePackage.Literals.SELECTION__SELECT_PATH,
			true, false, true, null,
			getString("_UI_DataAccessPropertyCategory"),
			null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof Selection) {
					final Selection selection = (Selection) object;
					if (selection.getPathType() == null) {
						return selection.getDefinedBy().getServes().getAllAssociations();
					} else {
						return selection.getPathType().getAllAssociations();
					}
				}

				return Collections.emptySet();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Path Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_pathType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_pathType_feature", "_UI_Selection_type"),
				 PersistencePackage.Literals.SELECTION__PATH_TYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Method Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Selection_methodName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Selection_methodName_feature", "_UI_Selection_type"),
				 PersistencePackage.Literals.SELECTION__METHOD_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DataAccessPropertyCategory"),
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
			childrenFeatures.add(BasePackage.Literals.FORMAL_PARAMETER_LIST__PARAMETERS);
			childrenFeatures.add(PersistencePackage.Literals.SELECTION__CONDITION);
			childrenFeatures.add(PersistencePackage.Literals.SELECTION__ORDERING);
			childrenFeatures.add(PersistencePackage.Literals.SELECTION__FILTERS);
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
	 * This returns Selection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Selection.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Selection)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Selection_type") :
			getString("_UI_Selection_type") + " " + label;
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

		switch (notification.getFeatureID(Selection.class)) {
			case PersistencePackage.SELECTION__DISTINCT:
			case PersistencePackage.SELECTION__LIMIT:
			case PersistencePackage.SELECTION__METHOD_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PersistencePackage.SELECTION__PARAMETERS:
			case PersistencePackage.SELECTION__CONDITION:
			case PersistencePackage.SELECTION__ORDERING:
			case PersistencePackage.SELECTION__FILTERS:
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
				(BasePackage.Literals.FORMAL_PARAMETER_LIST__PARAMETERS,
				 BaseFactory.eINSTANCE.createFormalParameter()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__CONDITION,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__ORDERING,
				 PersistenceFactory.eINSTANCE.createAsc()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__ORDERING,
				 PersistenceFactory.eINSTANCE.createDesc()));

		newChildDescriptors.add
			(createChildParameter
				(PersistencePackage.Literals.SELECTION__FILTERS,
				 PersistenceFactory.eINSTANCE.createFilter()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PersistenceEditPlugin.INSTANCE;
	}

	protected Set<Entity> getEntities(final Selection selection) {
		final Set<Entity> entities = new HashSet<Entity>();
		entities.add(selection.getDefinedBy().getServes());
		for (Association join : selection.getJoins()) {
			entities.add(join.getPartOf());
			entities.add(join.getTargetEntity());
		}

		return entities;
	}

}
