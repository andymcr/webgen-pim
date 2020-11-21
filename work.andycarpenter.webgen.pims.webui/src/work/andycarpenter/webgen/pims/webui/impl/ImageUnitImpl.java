/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.image.ImageManipulation;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.ImageUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageUnitImpl#getImagePathFeature <em>Image Path Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageUnitImpl#getImageFilter <em>Image Filter</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageUnitImpl#getMissingImageFilter <em>Missing Image Filter</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageUnitImpl#getMissingImagePath <em>Missing Image Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ImageUnitImpl extends CollectionUnitImpl implements ImageUnit {
	/**
	 * The cached value of the '{@link #getImagePathFeature() <em>Image Path Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathFeature()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath imagePathFeature;

	/**
	 * The cached value of the '{@link #getImageFilter() <em>Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFilter()
	 * @generated
	 * @ordered
	 */
	protected ImageManipulation imageFilter;

	/**
	 * The cached value of the '{@link #getMissingImageFilter() <em>Missing Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImageFilter()
	 * @generated
	 * @ordered
	 */
	protected ImageManipulation missingImageFilter;

	/**
	 * The default value of the '{@link #getMissingImagePath() <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissingImagePath() <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImagePath()
	 * @generated
	 * @ordered
	 */
	protected String missingImagePath = MISSING_IMAGE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.IMAGE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePath getImagePathFeature() {
		return imagePathFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePathFeature(FeaturePath newImagePathFeature, NotificationChain msgs) {
		FeaturePath oldImagePathFeature = imagePathFeature;
		imagePathFeature = newImagePathFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, oldImagePathFeature, newImagePathFeature);
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
	public void setImagePathFeature(FeaturePath newImagePathFeature) {
		if (newImagePathFeature != imagePathFeature) {
			NotificationChain msgs = null;
			if (imagePathFeature != null)
				msgs = ((InternalEObject)imagePathFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, null, msgs);
			if (newImagePathFeature != null)
				msgs = ((InternalEObject)newImagePathFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, null, msgs);
			msgs = basicSetImagePathFeature(newImagePathFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, newImagePathFeature, newImagePathFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageManipulation getImageFilter() {
		if (imageFilter != null && imageFilter.eIsProxy()) {
			InternalEObject oldImageFilter = (InternalEObject)imageFilter;
			imageFilter = (ImageManipulation)eResolveProxy(oldImageFilter);
			if (imageFilter != oldImageFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.IMAGE_UNIT__IMAGE_FILTER, oldImageFilter, imageFilter));
			}
		}
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation basicGetImageFilter() {
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageFilter(ImageManipulation newImageFilter) {
		ImageManipulation oldImageFilter = imageFilter;
		imageFilter = newImageFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_UNIT__IMAGE_FILTER, oldImageFilter, imageFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageManipulation getMissingImageFilter() {
		if (missingImageFilter != null && missingImageFilter.eIsProxy()) {
			InternalEObject oldMissingImageFilter = (InternalEObject)missingImageFilter;
			missingImageFilter = (ImageManipulation)eResolveProxy(oldMissingImageFilter);
			if (missingImageFilter != oldMissingImageFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_FILTER, oldMissingImageFilter, missingImageFilter));
			}
		}
		return missingImageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation basicGetMissingImageFilter() {
		return missingImageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMissingImageFilter(ImageManipulation newMissingImageFilter) {
		ImageManipulation oldMissingImageFilter = missingImageFilter;
		missingImageFilter = newMissingImageFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_FILTER, oldMissingImageFilter, missingImageFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMissingImagePath() {
		return missingImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMissingImagePath(String newMissingImagePath) {
		String oldMissingImagePath = missingImagePath;
		missingImagePath = newMissingImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_PATH, oldMissingImagePath, missingImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return basicSetImagePathFeature(null, msgs);
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
			case WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return getImagePathFeature();
			case WebuiPackage.IMAGE_UNIT__IMAGE_FILTER:
				if (resolve) return getImageFilter();
				return basicGetImageFilter();
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_FILTER:
				if (resolve) return getMissingImageFilter();
				return basicGetMissingImageFilter();
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				return getMissingImagePath();
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
			case WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				setImagePathFeature((FeaturePath)newValue);
				return;
			case WebuiPackage.IMAGE_UNIT__IMAGE_FILTER:
				setImageFilter((ImageManipulation)newValue);
				return;
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_FILTER:
				setMissingImageFilter((ImageManipulation)newValue);
				return;
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				setMissingImagePath((String)newValue);
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
			case WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				setImagePathFeature((FeaturePath)null);
				return;
			case WebuiPackage.IMAGE_UNIT__IMAGE_FILTER:
				setImageFilter((ImageManipulation)null);
				return;
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_FILTER:
				setMissingImageFilter((ImageManipulation)null);
				return;
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				setMissingImagePath(MISSING_IMAGE_PATH_EDEFAULT);
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
			case WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return imagePathFeature != null;
			case WebuiPackage.IMAGE_UNIT__IMAGE_FILTER:
				return imageFilter != null;
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_FILTER:
				return missingImageFilter != null;
			case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				return MISSING_IMAGE_PATH_EDEFAULT == null ? missingImagePath != null : !MISSING_IMAGE_PATH_EDEFAULT.equals(missingImagePath);
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
		result.append(" (missingImagePath: ");
		result.append(missingImagePath);
		result.append(')');
		return result.toString();
	}

} //ImageUnitImpl
