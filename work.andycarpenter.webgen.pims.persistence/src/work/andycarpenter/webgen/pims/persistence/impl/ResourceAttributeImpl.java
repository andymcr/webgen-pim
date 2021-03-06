/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import work.andycarpenter.webgen.pims.persistence.PathElement;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.ResourceAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl#getMaximumUploadSize <em>Maximum Upload Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl#getValidUploadExtensions <em>Valid Upload Extensions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl#isUploadsWithinWebsite <em>Uploads Within Website</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl#getUploadPath <em>Upload Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceAttributeImpl extends AttributeImpl implements ResourceAttribute {
	/**
	 * The default value of the '{@link #getMaximumUploadSize() <em>Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_UPLOAD_SIZE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaximumUploadSize() <em>Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected int maximumUploadSize = MAXIMUM_UPLOAD_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidUploadMimeTypes() <em>Valid Upload Mime Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUploadMimeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> validUploadMimeTypes;

	/**
	 * The cached value of the '{@link #getValidUploadExtensions() <em>Valid Upload Extensions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUploadExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> validUploadExtensions;

	/**
	 * The default value of the '{@link #isUploadsWithinWebsite() <em>Uploads Within Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUploadsWithinWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPLOADS_WITHIN_WEBSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUploadsWithinWebsite() <em>Uploads Within Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUploadsWithinWebsite()
	 * @generated
	 * @ordered
	 */
	protected boolean uploadsWithinWebsite = UPLOADS_WITHIN_WEBSITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUploadPath() <em>Upload Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PathElement> uploadPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.RESOURCE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximumUploadSize() {
		return maximumUploadSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumUploadSize(int newMaximumUploadSize) {
		int oldMaximumUploadSize = maximumUploadSize;
		maximumUploadSize = newMaximumUploadSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE, oldMaximumUploadSize, maximumUploadSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValidUploadMimeTypes() {
		if (validUploadMimeTypes == null) {
			validUploadMimeTypes = new EDataTypeUniqueEList<String>(String.class, this, PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES);
		}
		return validUploadMimeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValidUploadExtensions() {
		if (validUploadExtensions == null) {
			validUploadExtensions = new EDataTypeUniqueEList<String>(String.class, this, PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS);
		}
		return validUploadExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUploadsWithinWebsite() {
		return uploadsWithinWebsite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUploadsWithinWebsite(boolean newUploadsWithinWebsite) {
		boolean oldUploadsWithinWebsite = uploadsWithinWebsite;
		uploadsWithinWebsite = newUploadsWithinWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE, oldUploadsWithinWebsite, uploadsWithinWebsite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PathElement> getUploadPath() {
		if (uploadPath == null) {
			uploadPath = new EObjectContainmentEList<PathElement>(PathElement.class, this, PersistencePackage.RESOURCE_ATTRIBUTE__UPLOAD_PATH);
		}
		return uploadPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOAD_PATH:
				return ((InternalEList<?>)getUploadPath()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE:
				return getMaximumUploadSize();
			case PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES:
				return getValidUploadMimeTypes();
			case PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS:
				return getValidUploadExtensions();
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE:
				return isUploadsWithinWebsite();
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOAD_PATH:
				return getUploadPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE:
				setMaximumUploadSize((Integer)newValue);
				return;
			case PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES:
				getValidUploadMimeTypes().clear();
				getValidUploadMimeTypes().addAll((Collection<? extends String>)newValue);
				return;
			case PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS:
				getValidUploadExtensions().clear();
				getValidUploadExtensions().addAll((Collection<? extends String>)newValue);
				return;
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE:
				setUploadsWithinWebsite((Boolean)newValue);
				return;
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOAD_PATH:
				getUploadPath().clear();
				getUploadPath().addAll((Collection<? extends PathElement>)newValue);
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
			case PersistencePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE:
				setMaximumUploadSize(MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES:
				getValidUploadMimeTypes().clear();
				return;
			case PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS:
				getValidUploadExtensions().clear();
				return;
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE:
				setUploadsWithinWebsite(UPLOADS_WITHIN_WEBSITE_EDEFAULT);
				return;
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOAD_PATH:
				getUploadPath().clear();
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
			case PersistencePackage.RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE:
				return maximumUploadSize != MAXIMUM_UPLOAD_SIZE_EDEFAULT;
			case PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES:
				return validUploadMimeTypes != null && !validUploadMimeTypes.isEmpty();
			case PersistencePackage.RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS:
				return validUploadExtensions != null && !validUploadExtensions.isEmpty();
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE:
				return uploadsWithinWebsite != UPLOADS_WITHIN_WEBSITE_EDEFAULT;
			case PersistencePackage.RESOURCE_ATTRIBUTE__UPLOAD_PATH:
				return uploadPath != null && !uploadPath.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (maximumUploadSize: ");
		result.append(maximumUploadSize);
		result.append(", validUploadMimeTypes: ");
		result.append(validUploadMimeTypes);
		result.append(", validUploadExtensions: ");
		result.append(validUploadExtensions);
		result.append(", uploadsWithinWebsite: ");
		result.append(uploadsWithinWebsite);
		result.append(')');
		return result.toString();
	}

} //ResourceAttributeImpl
