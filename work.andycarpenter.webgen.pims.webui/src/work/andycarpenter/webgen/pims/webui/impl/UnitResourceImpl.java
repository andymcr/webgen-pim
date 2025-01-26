/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.persistence.ImageResource;
import work.andycarpenter.webgen.pims.persistence.Path;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.ResourceFeature;

import work.andycarpenter.webgen.pims.persistence.ResourcePathElement;
import work.andycarpenter.webgen.pims.webui.UnitFeature;
import work.andycarpenter.webgen.pims.webui.UnitResource;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl#isIsDeletable <em>Is Deletable</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl#isIsDownloadable <em>Is Downloadable</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl#isShowImageWhenEditing <em>Show Image When Editing</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitResourceImpl#getImageFilter <em>Image Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitResourceImpl extends UnitFeatureImpl implements UnitResource {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected ResourceFeature resource;

	/**
	 * The default value of the '{@link #isIsDeletable() <em>Is Deletable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeletable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DELETABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsDeletable() <em>Is Deletable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeletable()
	 * @generated
	 * @ordered
	 */
	protected boolean isDeletable = IS_DELETABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDownloadable() <em>Is Downloadable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDownloadable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DOWNLOADABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsDownloadable() <em>Is Downloadable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDownloadable()
	 * @generated
	 * @ordered
	 */
	protected boolean isDownloadable = IS_DOWNLOADABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowImageWhenEditing() <em>Show Image When Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowImageWhenEditing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_IMAGE_WHEN_EDITING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowImageWhenEditing() <em>Show Image When Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowImageWhenEditing()
	 * @generated
	 * @ordered
	 */
	protected boolean showImageWhenEditing = SHOW_IMAGE_WHEN_EDITING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImageFilter() <em>Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFilter()
	 * @generated
	 * @ordered
	 */
	protected ImageResource imageFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.UNIT_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceFeature getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (ResourceFeature)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.UNIT_RESOURCE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceFeature basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(ResourceFeature newResource) {
		ResourceFeature oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_RESOURCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDeletable() {
		return isDeletable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDeletable(boolean newIsDeletable) {
		boolean oldIsDeletable = isDeletable;
		isDeletable = newIsDeletable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_RESOURCE__IS_DELETABLE, oldIsDeletable, isDeletable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDownloadable() {
		return isDownloadable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDownloadable(boolean newIsDownloadable) {
		boolean oldIsDownloadable = isDownloadable;
		isDownloadable = newIsDownloadable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_RESOURCE__IS_DOWNLOADABLE, oldIsDownloadable, isDownloadable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowImageWhenEditing() {
		return showImageWhenEditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowImageWhenEditing(boolean newShowImageWhenEditing) {
		boolean oldShowImageWhenEditing = showImageWhenEditing;
		showImageWhenEditing = newShowImageWhenEditing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_RESOURCE__SHOW_IMAGE_WHEN_EDITING, oldShowImageWhenEditing, showImageWhenEditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageResource getImageFilter() {
		if (imageFilter != null && imageFilter.eIsProxy()) {
			InternalEObject oldImageFilter = (InternalEObject)imageFilter;
			imageFilter = (ImageResource)eResolveProxy(oldImageFilter);
			if (imageFilter != oldImageFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.UNIT_RESOURCE__IMAGE_FILTER, oldImageFilter, imageFilter));
			}
		}
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageResource basicGetImageFilter() {
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageFilter(ImageResource newImageFilter) {
		ImageResource oldImageFilter = imageFilter;
		imageFilter = newImageFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_RESOURCE__IMAGE_FILTER, oldImageFilter, imageFilter));
	}

	/**
	 * The cached invocation delegate for the '{@link #name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #name()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)PersistencePackage.Literals.RESOURCE_PATH_ELEMENT___NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String name() {
		try {
			return (String)NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.UNIT_RESOURCE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case WebuiPackage.UNIT_RESOURCE__IS_DELETABLE:
				return isIsDeletable();
			case WebuiPackage.UNIT_RESOURCE__IS_DOWNLOADABLE:
				return isIsDownloadable();
			case WebuiPackage.UNIT_RESOURCE__SHOW_IMAGE_WHEN_EDITING:
				return isShowImageWhenEditing();
			case WebuiPackage.UNIT_RESOURCE__IMAGE_FILTER:
				if (resolve) return getImageFilter();
				return basicGetImageFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebuiPackage.UNIT_RESOURCE__RESOURCE:
				setResource((ResourceFeature)newValue);
				return;
			case WebuiPackage.UNIT_RESOURCE__IS_DELETABLE:
				setIsDeletable((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_RESOURCE__IS_DOWNLOADABLE:
				setIsDownloadable((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_RESOURCE__SHOW_IMAGE_WHEN_EDITING:
				setShowImageWhenEditing((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_RESOURCE__IMAGE_FILTER:
				setImageFilter((ImageResource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebuiPackage.UNIT_RESOURCE__RESOURCE:
				setResource((ResourceFeature)null);
				return;
			case WebuiPackage.UNIT_RESOURCE__IS_DELETABLE:
				setIsDeletable(IS_DELETABLE_EDEFAULT);
				return;
			case WebuiPackage.UNIT_RESOURCE__IS_DOWNLOADABLE:
				setIsDownloadable(IS_DOWNLOADABLE_EDEFAULT);
				return;
			case WebuiPackage.UNIT_RESOURCE__SHOW_IMAGE_WHEN_EDITING:
				setShowImageWhenEditing(SHOW_IMAGE_WHEN_EDITING_EDEFAULT);
				return;
			case WebuiPackage.UNIT_RESOURCE__IMAGE_FILTER:
				setImageFilter((ImageResource)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebuiPackage.UNIT_RESOURCE__RESOURCE:
				return resource != null;
			case WebuiPackage.UNIT_RESOURCE__IS_DELETABLE:
				return isDeletable != IS_DELETABLE_EDEFAULT;
			case WebuiPackage.UNIT_RESOURCE__IS_DOWNLOADABLE:
				return isDownloadable != IS_DOWNLOADABLE_EDEFAULT;
			case WebuiPackage.UNIT_RESOURCE__SHOW_IMAGE_WHEN_EDITING:
				return showImageWhenEditing != SHOW_IMAGE_WHEN_EDITING_EDEFAULT;
			case WebuiPackage.UNIT_RESOURCE__IMAGE_FILTER:
				return imageFilter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourcePathElement.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UNIT_RESOURCE__RESOURCE: return PersistencePackage.RESOURCE_PATH_ELEMENT__RESOURCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourcePathElement.class) {
			switch (baseFeatureID) {
				case PersistencePackage.RESOURCE_PATH_ELEMENT__RESOURCE: return WebuiPackage.UNIT_RESOURCE__RESOURCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Path.class) {
			switch (baseOperationID) {
				case PersistencePackage.PATH___NAME: return WebuiPackage.UNIT_RESOURCE___NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == UnitFeature.class) {
			switch (baseOperationID) {
				case WebuiPackage.UNIT_FEATURE___NAME: return WebuiPackage.UNIT_RESOURCE___NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ResourcePathElement.class) {
			switch (baseOperationID) {
				case PersistencePackage.RESOURCE_PATH_ELEMENT___NAME: return WebuiPackage.UNIT_RESOURCE___NAME;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebuiPackage.UNIT_RESOURCE___NAME:
				return name();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDeletable: ");
		result.append(isDeletable);
		result.append(", isDownloadable: ");
		result.append(isDownloadable);
		result.append(", showImageWhenEditing: ");
		result.append(showImageWhenEditing);
		result.append(')');
		return result.toString();
	}

} //UnitResourceImpl
