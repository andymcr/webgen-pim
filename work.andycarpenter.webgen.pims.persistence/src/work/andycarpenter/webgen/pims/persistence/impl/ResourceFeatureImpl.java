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

import work.andycarpenter.webgen.pims.persistence.DirectoryNamer;
import work.andycarpenter.webgen.pims.persistence.FileNamer;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.ResourceFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl#getMaximumUploadSize <em>Maximum Upload Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl#getValidUploadExtensions <em>Valid Upload Extensions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl#getUriPrefix <em>Uri Prefix</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl#getBaseUploadDirectory <em>Base Upload Directory</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl#getDirectoryNamer <em>Directory Namer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl#getFileNamer <em>File Namer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceFeatureImpl extends FeatureImpl implements ResourceFeature {
	/**
	 * The default value of the '{@link #getMaximumUploadSize() <em>Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_UPLOAD_SIZE_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getMaximumUploadSize() <em>Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected String maximumUploadSize = MAXIMUM_UPLOAD_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getUriPrefix() <em>Uri Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriPrefix() <em>Uri Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriPrefix()
	 * @generated
	 * @ordered
	 */
	protected String uriPrefix = URI_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseUploadDirectory() <em>Base Upload Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUploadDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_UPLOAD_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUploadDirectory() <em>Base Upload Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUploadDirectory()
	 * @generated
	 * @ordered
	 */
	protected String baseUploadDirectory = BASE_UPLOAD_DIRECTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirectoryNamer() <em>Directory Namer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryNamer()
	 * @generated
	 * @ordered
	 */
	protected DirectoryNamer directoryNamer;

	/**
	 * The cached value of the '{@link #getFileNamer() <em>File Namer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileNamer()
	 * @generated
	 * @ordered
	 */
	protected FileNamer fileNamer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.RESOURCE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximumUploadSize() {
		return maximumUploadSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumUploadSize(String newMaximumUploadSize) {
		String oldMaximumUploadSize = maximumUploadSize;
		maximumUploadSize = newMaximumUploadSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE, oldMaximumUploadSize, maximumUploadSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValidUploadMimeTypes() {
		if (validUploadMimeTypes == null) {
			validUploadMimeTypes = new EDataTypeUniqueEList<String>(String.class, this, PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES);
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
			validUploadExtensions = new EDataTypeUniqueEList<String>(String.class, this, PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS);
		}
		return validUploadExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriPrefix() {
		return uriPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriPrefix(String newUriPrefix) {
		String oldUriPrefix = uriPrefix;
		uriPrefix = newUriPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_FEATURE__URI_PREFIX, oldUriPrefix, uriPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseUploadDirectory() {
		return baseUploadDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseUploadDirectory(String newBaseUploadDirectory) {
		String oldBaseUploadDirectory = baseUploadDirectory;
		baseUploadDirectory = newBaseUploadDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY, oldBaseUploadDirectory, baseUploadDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectoryNamer getDirectoryNamer() {
		return directoryNamer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectoryNamer(DirectoryNamer newDirectoryNamer, NotificationChain msgs) {
		DirectoryNamer oldDirectoryNamer = directoryNamer;
		directoryNamer = newDirectoryNamer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER, oldDirectoryNamer, newDirectoryNamer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryNamer(DirectoryNamer newDirectoryNamer) {
		if (newDirectoryNamer != directoryNamer) {
			NotificationChain msgs = null;
			if (directoryNamer != null)
				msgs = ((InternalEObject)directoryNamer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER, null, msgs);
			if (newDirectoryNamer != null)
				msgs = ((InternalEObject)newDirectoryNamer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER, null, msgs);
			msgs = basicSetDirectoryNamer(newDirectoryNamer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER, newDirectoryNamer, newDirectoryNamer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileNamer getFileNamer() {
		return fileNamer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileNamer(FileNamer newFileNamer, NotificationChain msgs) {
		FileNamer oldFileNamer = fileNamer;
		fileNamer = newFileNamer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_FEATURE__FILE_NAMER, oldFileNamer, newFileNamer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileNamer(FileNamer newFileNamer) {
		if (newFileNamer != fileNamer) {
			NotificationChain msgs = null;
			if (fileNamer != null)
				msgs = ((InternalEObject)fileNamer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.RESOURCE_FEATURE__FILE_NAMER, null, msgs);
			if (newFileNamer != null)
				msgs = ((InternalEObject)newFileNamer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.RESOURCE_FEATURE__FILE_NAMER, null, msgs);
			msgs = basicSetFileNamer(newFileNamer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE_FEATURE__FILE_NAMER, newFileNamer, newFileNamer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER:
				return basicSetDirectoryNamer(null, msgs);
			case PersistencePackage.RESOURCE_FEATURE__FILE_NAMER:
				return basicSetFileNamer(null, msgs);
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
			case PersistencePackage.RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE:
				return getMaximumUploadSize();
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES:
				return getValidUploadMimeTypes();
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS:
				return getValidUploadExtensions();
			case PersistencePackage.RESOURCE_FEATURE__URI_PREFIX:
				return getUriPrefix();
			case PersistencePackage.RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY:
				return getBaseUploadDirectory();
			case PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER:
				return getDirectoryNamer();
			case PersistencePackage.RESOURCE_FEATURE__FILE_NAMER:
				return getFileNamer();
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
			case PersistencePackage.RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE:
				setMaximumUploadSize((String)newValue);
				return;
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES:
				getValidUploadMimeTypes().clear();
				getValidUploadMimeTypes().addAll((Collection<? extends String>)newValue);
				return;
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS:
				getValidUploadExtensions().clear();
				getValidUploadExtensions().addAll((Collection<? extends String>)newValue);
				return;
			case PersistencePackage.RESOURCE_FEATURE__URI_PREFIX:
				setUriPrefix((String)newValue);
				return;
			case PersistencePackage.RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY:
				setBaseUploadDirectory((String)newValue);
				return;
			case PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER:
				setDirectoryNamer((DirectoryNamer)newValue);
				return;
			case PersistencePackage.RESOURCE_FEATURE__FILE_NAMER:
				setFileNamer((FileNamer)newValue);
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
			case PersistencePackage.RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE:
				setMaximumUploadSize(MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES:
				getValidUploadMimeTypes().clear();
				return;
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS:
				getValidUploadExtensions().clear();
				return;
			case PersistencePackage.RESOURCE_FEATURE__URI_PREFIX:
				setUriPrefix(URI_PREFIX_EDEFAULT);
				return;
			case PersistencePackage.RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY:
				setBaseUploadDirectory(BASE_UPLOAD_DIRECTORY_EDEFAULT);
				return;
			case PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER:
				setDirectoryNamer((DirectoryNamer)null);
				return;
			case PersistencePackage.RESOURCE_FEATURE__FILE_NAMER:
				setFileNamer((FileNamer)null);
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
			case PersistencePackage.RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE:
				return MAXIMUM_UPLOAD_SIZE_EDEFAULT == null ? maximumUploadSize != null : !MAXIMUM_UPLOAD_SIZE_EDEFAULT.equals(maximumUploadSize);
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES:
				return validUploadMimeTypes != null && !validUploadMimeTypes.isEmpty();
			case PersistencePackage.RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS:
				return validUploadExtensions != null && !validUploadExtensions.isEmpty();
			case PersistencePackage.RESOURCE_FEATURE__URI_PREFIX:
				return URI_PREFIX_EDEFAULT == null ? uriPrefix != null : !URI_PREFIX_EDEFAULT.equals(uriPrefix);
			case PersistencePackage.RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY:
				return BASE_UPLOAD_DIRECTORY_EDEFAULT == null ? baseUploadDirectory != null : !BASE_UPLOAD_DIRECTORY_EDEFAULT.equals(baseUploadDirectory);
			case PersistencePackage.RESOURCE_FEATURE__DIRECTORY_NAMER:
				return directoryNamer != null;
			case PersistencePackage.RESOURCE_FEATURE__FILE_NAMER:
				return fileNamer != null;
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
		result.append(", uriPrefix: ");
		result.append(uriPrefix);
		result.append(", baseUploadDirectory: ");
		result.append(baseUploadDirectory);
		result.append(')');
		return result.toString();
	}

} //ResourceFeatureImpl
