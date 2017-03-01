/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

import uk.ac.man.cs.mdsd.webgen.persistence.util.PersistenceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceItemProviderAdapterFactory extends PersistenceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(PersistenceEditPlugin.INSTANCE, PersistencePackage.eNS_URI);

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
	public PersistenceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelItemProvider modelLabelItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelLabelAdapter() {
		if (modelLabelItemProvider == null) {
			modelLabelItemProvider = new ModelLabelItemProvider(this);
		}

		return modelLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelAttributeItemProvider modelLabelAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelLabelAttributeAdapter() {
		if (modelLabelAttributeItemProvider == null) {
			modelLabelAttributeItemProvider = new ModelLabelAttributeItemProvider(this);
		}

		return modelLabelAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelAssociationItemProvider modelLabelAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabelAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelLabelAssociationAdapter() {
		if (modelLabelAssociationItemProvider == null) {
			modelLabelAssociationItemProvider = new ModelLabelAssociationItemProvider(this);
		}

		return modelLabelAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeAttributeItemProvider dataTypeAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.DataTypeAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAttributeAdapter() {
		if (dataTypeAttributeItemProvider == null) {
			dataTypeAttributeItemProvider = new DataTypeAttributeItemProvider(this);
		}

		return dataTypeAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateAttributeItemProvider dateAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateAttributeAdapter() {
		if (dateAttributeItemProvider == null) {
			dateAttributeItemProvider = new DateAttributeItemProvider(this);
		}

		return dateAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.UrlAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrlAttributeItemProvider urlAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.UrlAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUrlAttributeAdapter() {
		if (urlAttributeItemProvider == null) {
			urlAttributeItemProvider = new UrlAttributeItemProvider(this);
		}

		return urlAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.StaticPathElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticPathElementItemProvider staticPathElementItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.StaticPathElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticPathElementAdapter() {
		if (staticPathElementItemProvider == null) {
			staticPathElementItemProvider = new StaticPathElementItemProvider(this);
		}

		return staticPathElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.DatePathElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatePathElementItemProvider datePathElementItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.DatePathElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatePathElementAdapter() {
		if (datePathElementItemProvider == null) {
			datePathElementItemProvider = new DatePathElementItemProvider(this);
		}

		return datePathElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.FileAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileAttributeItemProvider fileAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.FileAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileAttributeAdapter() {
		if (fileAttributeItemProvider == null) {
			fileAttributeItemProvider = new FileAttributeItemProvider(this);
		}

		return fileAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.ImageAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageAttributeItemProvider imageAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.ImageAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAttributeAdapter() {
		if (imageAttributeItemProvider == null) {
			imageAttributeItemProvider = new ImageAttributeItemProvider(this);
		}

		return imageAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.LocationAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationAttributeItemProvider locationAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.LocationAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocationAttributeAdapter() {
		if (locationAttributeItemProvider == null) {
			locationAttributeItemProvider = new LocationAttributeItemProvider(this);
		}

		return locationAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationWithoutContainmentItemProvider associationWithoutContainmentItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationWithoutContainmentAdapter() {
		if (associationWithoutContainmentItemProvider == null) {
			associationWithoutContainmentItemProvider = new AssociationWithoutContainmentItemProvider(this);
		}

		return associationWithoutContainmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationWithContainmentItemProvider associationWithContainmentItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationWithContainmentAdapter() {
		if (associationWithContainmentItemProvider == null) {
			associationWithContainmentItemProvider = new AssociationWithContainmentItemProvider(this);
		}

		return associationWithContainmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationKeyItemProvider associationKeyItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationKeyAdapter() {
		if (associationKeyItemProvider == null) {
			associationKeyItemProvider = new AssociationKeyItemProvider(this);
		}

		return associationKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.View} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewItemProvider viewItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewAdapter() {
		if (viewItemProvider == null) {
			viewItemProvider = new ViewItemProvider(this);
		}

		return viewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedFeatureItemProvider encapsulatedFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEncapsulatedFeatureAdapter() {
		if (encapsulatedFeatureItemProvider == null) {
			encapsulatedFeatureItemProvider = new EncapsulatedFeatureItemProvider(this);
		}

		return encapsulatedFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedAttributeItemProvider encapsulatedAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEncapsulatedAttributeAdapter() {
		if (encapsulatedAttributeItemProvider == null) {
			encapsulatedAttributeItemProvider = new EncapsulatedAttributeItemProvider(this);
		}

		return encapsulatedAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedAssociationItemProvider encapsulatedAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEncapsulatedAssociationAdapter() {
		if (encapsulatedAssociationItemProvider == null) {
			encapsulatedAssociationItemProvider = new EncapsulatedAssociationItemProvider(this);
		}

		return encapsulatedAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewAssociationItemProvider viewAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewAssociationAdapter() {
		if (viewAssociationItemProvider == null) {
			viewAssociationItemProvider = new ViewAssociationItemProvider(this);
		}

		return viewAssociationItemProvider;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
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
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modelLabelItemProvider != null) modelLabelItemProvider.dispose();
		if (modelLabelAttributeItemProvider != null) modelLabelAttributeItemProvider.dispose();
		if (modelLabelAssociationItemProvider != null) modelLabelAssociationItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (dataTypeAttributeItemProvider != null) dataTypeAttributeItemProvider.dispose();
		if (dateAttributeItemProvider != null) dateAttributeItemProvider.dispose();
		if (urlAttributeItemProvider != null) urlAttributeItemProvider.dispose();
		if (staticPathElementItemProvider != null) staticPathElementItemProvider.dispose();
		if (datePathElementItemProvider != null) datePathElementItemProvider.dispose();
		if (fileAttributeItemProvider != null) fileAttributeItemProvider.dispose();
		if (imageAttributeItemProvider != null) imageAttributeItemProvider.dispose();
		if (locationAttributeItemProvider != null) locationAttributeItemProvider.dispose();
		if (associationWithoutContainmentItemProvider != null) associationWithoutContainmentItemProvider.dispose();
		if (associationWithContainmentItemProvider != null) associationWithContainmentItemProvider.dispose();
		if (associationKeyItemProvider != null) associationKeyItemProvider.dispose();
		if (viewItemProvider != null) viewItemProvider.dispose();
		if (encapsulatedFeatureItemProvider != null) encapsulatedFeatureItemProvider.dispose();
		if (encapsulatedAttributeItemProvider != null) encapsulatedAttributeItemProvider.dispose();
		if (encapsulatedAssociationItemProvider != null) encapsulatedAssociationItemProvider.dispose();
		if (viewAssociationItemProvider != null) viewAssociationItemProvider.dispose();
	}

}
