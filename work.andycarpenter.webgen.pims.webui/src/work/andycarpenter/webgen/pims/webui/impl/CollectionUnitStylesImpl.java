/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.CollectionUnitStyles;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Unit Styles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitStylesImpl#getInstanceControlClass <em>Instance Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitStylesImpl#getInstanceAnchorClass <em>Instance Anchor Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionUnitStylesImpl extends DynamicUnitStylesImpl implements CollectionUnitStyles {
	/**
	 * The default value of the '{@link #getInstanceControlClass() <em>Instance Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInstanceControlClass() <em>Instance Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceControlClass()
	 * @generated
	 * @ordered
	 */
	protected String instanceControlClass = INSTANCE_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceAnchorClass() <em>Instance Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInstanceAnchorClass() <em>Instance Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String instanceAnchorClass = INSTANCE_ANCHOR_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionUnitStylesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.COLLECTION_UNIT_STYLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceControlClass() {
		return instanceControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceControlClass(String newInstanceControlClass) {
		String oldInstanceControlClass = instanceControlClass;
		instanceControlClass = newInstanceControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS, oldInstanceControlClass, instanceControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceAnchorClass() {
		return instanceAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceAnchorClass(String newInstanceAnchorClass) {
		String oldInstanceAnchorClass = instanceAnchorClass;
		instanceAnchorClass = newInstanceAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS, oldInstanceAnchorClass, instanceAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS:
				return getInstanceControlClass();
			case WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS:
				return getInstanceAnchorClass();
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
			case WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS:
				setInstanceControlClass((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS:
				setInstanceAnchorClass((String)newValue);
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
			case WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS:
				setInstanceControlClass(INSTANCE_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS:
				setInstanceAnchorClass(INSTANCE_ANCHOR_CLASS_EDEFAULT);
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
			case WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_CONTROL_CLASS:
				return INSTANCE_CONTROL_CLASS_EDEFAULT == null ? instanceControlClass != null : !INSTANCE_CONTROL_CLASS_EDEFAULT.equals(instanceControlClass);
			case WebuiPackage.COLLECTION_UNIT_STYLES__INSTANCE_ANCHOR_CLASS:
				return INSTANCE_ANCHOR_CLASS_EDEFAULT == null ? instanceAnchorClass != null : !INSTANCE_ANCHOR_CLASS_EDEFAULT.equals(instanceAnchorClass);
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
		result.append(" (instanceControlClass: ");
		result.append(instanceControlClass);
		result.append(", instanceAnchorClass: ");
		result.append(instanceAnchorClass);
		result.append(')');
		return result.toString();
	}

} //CollectionUnitStylesImpl
