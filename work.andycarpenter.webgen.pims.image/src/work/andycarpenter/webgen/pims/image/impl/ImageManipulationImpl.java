/**
 */
package work.andycarpenter.webgen.pims.image.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.base.impl.NamedElementImpl;
import work.andycarpenter.webgen.pims.image.ImageFilter;
import work.andycarpenter.webgen.pims.image.ImageManipulation;
import work.andycarpenter.webgen.pims.image.ImagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manipulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.image.impl.ImageManipulationImpl#getJpegQuality <em>Jpeg Quality</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.image.impl.ImageManipulationImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageManipulationImpl extends NamedElementImpl implements ImageManipulation {
	/**
	 * The default value of the '{@link #getJpegQuality() <em>Jpeg Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpegQuality()
	 * @generated
	 * @ordered
	 */
	protected static final int JPEG_QUALITY_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getJpegQuality() <em>Jpeg Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpegQuality()
	 * @generated
	 * @ordered
	 */
	protected int jpegQuality = JPEG_QUALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageFilter> filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageManipulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagePackage.Literals.IMAGE_MANIPULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getJpegQuality() {
		return jpegQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJpegQuality(int newJpegQuality) {
		int oldJpegQuality = jpegQuality;
		jpegQuality = newJpegQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagePackage.IMAGE_MANIPULATION__JPEG_QUALITY, oldJpegQuality, jpegQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImageFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<ImageFilter>(ImageFilter.class, this, ImagePackage.IMAGE_MANIPULATION__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImagePackage.IMAGE_MANIPULATION__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
			case ImagePackage.IMAGE_MANIPULATION__JPEG_QUALITY:
				return getJpegQuality();
			case ImagePackage.IMAGE_MANIPULATION__FILTERS:
				return getFilters();
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
			case ImagePackage.IMAGE_MANIPULATION__JPEG_QUALITY:
				setJpegQuality((Integer)newValue);
				return;
			case ImagePackage.IMAGE_MANIPULATION__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends ImageFilter>)newValue);
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
			case ImagePackage.IMAGE_MANIPULATION__JPEG_QUALITY:
				setJpegQuality(JPEG_QUALITY_EDEFAULT);
				return;
			case ImagePackage.IMAGE_MANIPULATION__FILTERS:
				getFilters().clear();
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
			case ImagePackage.IMAGE_MANIPULATION__JPEG_QUALITY:
				return jpegQuality != JPEG_QUALITY_EDEFAULT;
			case ImagePackage.IMAGE_MANIPULATION__FILTERS:
				return filters != null && !filters.isEmpty();
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
		result.append(" (jpegQuality: ");
		result.append(jpegQuality);
		result.append(')');
		return result.toString();
	}

} //ImageManipulationImpl
