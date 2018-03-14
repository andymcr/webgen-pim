/**
 */
package work.andycarpenter.webgen.pims.base.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import work.andycarpenter.webgen.pims.base.BaseFactory;

import work.andycarpenter.webgen.pims.base.util.BaseAdapterFactory;

import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator;
import work.andycarpenter.webgen.pims.expression.PredicateEqualityOperator;
import work.andycarpenter.webgen.pims.expression.PredicateInOperator;
import work.andycarpenter.webgen.pims.expression.PredicateIsEmpty;
import work.andycarpenter.webgen.pims.expression.PredicateIsNull;
import work.andycarpenter.webgen.pims.expression.PredicateIsOperator;
import work.andycarpenter.webgen.pims.expression.PredicateLikeOperator;

import work.andycarpenter.webgen.pims.expression.util.ExpressionSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseItemProviderAdapterFactory extends BaseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.webgen.pims.base.DataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeItemProvider dataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.webgen.pims.base.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this);
		}

		return dataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.webgen.pims.base.EnumerationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeItemProvider enumerationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.webgen.pims.base.EnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationTypeAdapter() {
		if (enumerationTypeItemProvider == null) {
			enumerationTypeItemProvider = new EnumerationTypeItemProvider(this);
		}

		return enumerationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.webgen.pims.base.EnumerationLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralItemProvider enumerationLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.webgen.pims.base.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this);
		}

		return enumerationLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.webgen.pims.base.CurrentTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentTimeItemProvider currentTimeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.webgen.pims.base.CurrentTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCurrentTimeAdapter() {
		if (currentTimeItemProvider == null) {
			currentTimeItemProvider = new CurrentTimeItemProvider(this);
		}

		return currentTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.webgen.pims.base.CurrentUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentUserItemProvider currentUserItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.webgen.pims.base.CurrentUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCurrentUserAdapter() {
		if (currentUserItemProvider == null) {
			currentUserItemProvider = new CurrentUserItemProvider(this);
		}

		return currentUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.webgen.pims.base.FormalParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterItemProvider formalParameterItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.webgen.pims.base.FormalParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormalParameterAdapter() {
		if (formalParameterItemProvider == null) {
			formalParameterItemProvider = new FormalParameterItemProvider(this);
		}

		return formalParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.webgen.pims.base.ParameterReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterReferenceItemProvider parameterReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.webgen.pims.base.ParameterReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterReferenceAdapter() {
		if (parameterReferenceItemProvider == null) {
			parameterReferenceItemProvider = new ParameterReferenceItemProvider(this);
		}

		return parameterReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * A child creation extender for the {@link ExpressionPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ExpressionChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ExpressionSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateEqualityOperator(PredicateEqualityOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateComparisonOperator(PredicateComparisonOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateInOperator(PredicateInOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateIsOperator(PredicateIsOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateLikeOperator(PredicateLikeOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createParameterReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateIsEmpty(PredicateIsEmpty object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_EMPTY__FEATURE,
						 BaseFactory.eINSTANCE.createParameterReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateIsNull(PredicateIsNull object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_NULL__FEATURE,
						 BaseFactory.eINSTANCE.createParameterReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return BaseEditPlugin.INSTANCE;
		}
	}

}
