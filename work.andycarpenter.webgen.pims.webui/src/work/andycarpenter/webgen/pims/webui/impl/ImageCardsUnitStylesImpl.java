/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.ImageCardsUnitStyles;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Cards Unit Styles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitStylesImpl#getImageActionClass <em>Image Action Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageCardsUnitStylesImpl extends CardsUnitStylesImpl implements ImageCardsUnitStyles {
	/**
	 * The default value of the '{@link #getImageActionClass() <em>Image Action Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageActionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ACTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getImageActionClass() <em>Image Action Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageActionClass()
	 * @generated
	 * @ordered
	 */
	protected String imageActionClass = IMAGE_ACTION_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageCardsUnitStylesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.IMAGE_CARDS_UNIT_STYLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageActionClass() {
		return imageActionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageActionClass(String newImageActionClass) {
		String oldImageActionClass = imageActionClass;
		imageActionClass = newImageActionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT_STYLES__IMAGE_ACTION_CLASS, oldImageActionClass, imageActionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.IMAGE_CARDS_UNIT_STYLES__IMAGE_ACTION_CLASS:
				return getImageActionClass();
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
			case WebuiPackage.IMAGE_CARDS_UNIT_STYLES__IMAGE_ACTION_CLASS:
				setImageActionClass((String)newValue);
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
			case WebuiPackage.IMAGE_CARDS_UNIT_STYLES__IMAGE_ACTION_CLASS:
				setImageActionClass(IMAGE_ACTION_CLASS_EDEFAULT);
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
			case WebuiPackage.IMAGE_CARDS_UNIT_STYLES__IMAGE_ACTION_CLASS:
				return IMAGE_ACTION_CLASS_EDEFAULT == null ? imageActionClass != null : !IMAGE_ACTION_CLASS_EDEFAULT.equals(imageActionClass);
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
		result.append(" (imageActionClass: ");
		result.append(imageActionClass);
		result.append(')');
		return result.toString();
	}

} //ImageCardsUnitStylesImpl
