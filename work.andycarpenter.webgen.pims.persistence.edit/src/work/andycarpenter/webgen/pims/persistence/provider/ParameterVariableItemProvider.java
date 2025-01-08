/**
 */
package work.andycarpenter.webgen.pims.persistence.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.base.FormalParameter;
import work.andycarpenter.webgen.pims.base.FormalParameterList;
import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.persistence.ParameterVariable;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.persistence.ParameterVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterVariableItemProvider extends PathItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterVariableItemProvider(AdapterFactory adapterFactory) {
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

			addRootContainerPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addFormalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterVariable_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterVariable_name_feature", "_UI_ParameterVariable_type"),
				 PersistencePackage.Literals.PARAMETER_VARIABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFormalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ParameterVariable_formal_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_ParameterVariable_formal_feature", "_UI_ParameterVariable_type"),
			PersistencePackage.Literals.PARAMETER_VARIABLE__FORMAL,
			true, false, true, null,
			getString("_UI_InterfacePropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof ParameterVariable) {
						final ParameterVariable variable = (ParameterVariable) object;
						final EList<FormalParameter> formals = new BasicEList<FormalParameter>();
						for (FormalParameterList context : parameterContexts(variable)) {
							formals.addAll(context.getParameters());
						}
						return formals;
					}
		
					return Collections.emptyList();
				}
			});
	}

	private EList<FormalParameterList> parameterContexts(ParameterVariable variable) {
		final EList<FormalParameterList> contexts = new BasicEList<FormalParameterList>();
		EObject parent = variable.eContainer();
		while (parent instanceof Expression) {
			if (parent instanceof FormalParameterList) {
				contexts.add((FormalParameterList) parent);
			}
			parent = parent.eContainer();
		}
		
		return contexts;
	}

	
	/**
	 * This returns ParameterVariable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterVariable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ParameterVariable)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ParameterVariable_type") :
			getString("_UI_ParameterVariable_type") + " " + label;
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

		switch (notification.getFeatureID(ParameterVariable.class)) {
			case PersistencePackage.PARAMETER_VARIABLE__NAME:
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

}
