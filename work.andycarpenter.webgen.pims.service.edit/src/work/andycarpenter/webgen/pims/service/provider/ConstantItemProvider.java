/**
 */
package work.andycarpenter.webgen.pims.service.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.base.BaseFactory;

import work.andycarpenter.webgen.pims.base.provider.NamedElementItemProvider;

import work.andycarpenter.webgen.pims.expression.ExpressionFactory;

import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.service.Constant;
import work.andycarpenter.webgen.pims.service.ServiceFactory;
import work.andycarpenter.webgen.pims.service.ServicePackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.service.Constant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstantItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ServicePackage.Literals.CONSTANT__VALUE);
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
	 * This returns Constant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Constant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Constant)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Constant_type") :
			getString("_UI_Constant_type") + " " + label;
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

		switch (notification.getFeatureID(Constant.class)) {
			case ServicePackage.CONSTANT__VALUE:
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
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ServiceFactory.eINSTANCE.createConstantReference()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createCurrentUser()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createCallable()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createReduceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 BaseFactory.eINSTANCE.createSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 ExpressionFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 PersistenceFactory.eINSTANCE.createAssociationVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 PersistenceFactory.eINSTANCE.createAttributeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 PersistenceFactory.eINSTANCE.createResourceVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.CONSTANT__VALUE,
				 PersistenceFactory.eINSTANCE.createParameterVariable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ServiceEditPlugin.INSTANCE;
	}

}
