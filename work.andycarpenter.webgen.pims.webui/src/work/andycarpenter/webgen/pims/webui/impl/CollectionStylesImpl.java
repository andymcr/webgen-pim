/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.CollectionStyles;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Styles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionStylesImpl#getFiltersClass <em>Filters Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionStylesImpl#getFiltersActionClass <em>Filters Action Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionStylesImpl#getFiltersBodyClass <em>Filters Body Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionStylesImpl#getFiltersControlClass <em>Filters Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionStylesImpl#getInstanceActionClass <em>Instance Action Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionStylesImpl#getInstanceControlClass <em>Instance Control Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CollectionStylesImpl extends DynamicUnitStylesImpl implements CollectionStyles {
	/**
	 * The default value of the '{@link #getFiltersClass() <em>Filters Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTERS_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFiltersClass() <em>Filters Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersClass()
	 * @generated
	 * @ordered
	 */
	protected String filtersClass = FILTERS_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiltersActionClass() <em>Filters Action Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersActionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTERS_ACTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFiltersActionClass() <em>Filters Action Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersActionClass()
	 * @generated
	 * @ordered
	 */
	protected String filtersActionClass = FILTERS_ACTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiltersBodyClass() <em>Filters Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersBodyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTERS_BODY_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFiltersBodyClass() <em>Filters Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersBodyClass()
	 * @generated
	 * @ordered
	 */
	protected String filtersBodyClass = FILTERS_BODY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiltersControlClass() <em>Filters Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTERS_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFiltersControlClass() <em>Filters Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltersControlClass()
	 * @generated
	 * @ordered
	 */
	protected String filtersControlClass = FILTERS_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceActionClass() <em>Instance Action Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceActionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ACTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInstanceActionClass() <em>Instance Action Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceActionClass()
	 * @generated
	 * @ordered
	 */
	protected String instanceActionClass = INSTANCE_ACTION_CLASS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionStylesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.COLLECTION_STYLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFiltersClass() {
		return filtersClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiltersClass(String newFiltersClass) {
		String oldFiltersClass = filtersClass;
		filtersClass = newFiltersClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_STYLES__FILTERS_CLASS, oldFiltersClass, filtersClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFiltersActionClass() {
		return filtersActionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiltersActionClass(String newFiltersActionClass) {
		String oldFiltersActionClass = filtersActionClass;
		filtersActionClass = newFiltersActionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_STYLES__FILTERS_ACTION_CLASS, oldFiltersActionClass, filtersActionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFiltersBodyClass() {
		return filtersBodyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiltersBodyClass(String newFiltersBodyClass) {
		String oldFiltersBodyClass = filtersBodyClass;
		filtersBodyClass = newFiltersBodyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_STYLES__FILTERS_BODY_CLASS, oldFiltersBodyClass, filtersBodyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFiltersControlClass() {
		return filtersControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiltersControlClass(String newFiltersControlClass) {
		String oldFiltersControlClass = filtersControlClass;
		filtersControlClass = newFiltersControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_STYLES__FILTERS_CONTROL_CLASS, oldFiltersControlClass, filtersControlClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_STYLES__INSTANCE_CONTROL_CLASS, oldInstanceControlClass, instanceControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceActionClass() {
		return instanceActionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceActionClass(String newInstanceActionClass) {
		String oldInstanceActionClass = instanceActionClass;
		instanceActionClass = newInstanceActionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_STYLES__INSTANCE_ACTION_CLASS, oldInstanceActionClass, instanceActionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.COLLECTION_STYLES__FILTERS_CLASS:
				return getFiltersClass();
			case WebuiPackage.COLLECTION_STYLES__FILTERS_ACTION_CLASS:
				return getFiltersActionClass();
			case WebuiPackage.COLLECTION_STYLES__FILTERS_BODY_CLASS:
				return getFiltersBodyClass();
			case WebuiPackage.COLLECTION_STYLES__FILTERS_CONTROL_CLASS:
				return getFiltersControlClass();
			case WebuiPackage.COLLECTION_STYLES__INSTANCE_ACTION_CLASS:
				return getInstanceActionClass();
			case WebuiPackage.COLLECTION_STYLES__INSTANCE_CONTROL_CLASS:
				return getInstanceControlClass();
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
			case WebuiPackage.COLLECTION_STYLES__FILTERS_CLASS:
				setFiltersClass((String)newValue);
				return;
			case WebuiPackage.COLLECTION_STYLES__FILTERS_ACTION_CLASS:
				setFiltersActionClass((String)newValue);
				return;
			case WebuiPackage.COLLECTION_STYLES__FILTERS_BODY_CLASS:
				setFiltersBodyClass((String)newValue);
				return;
			case WebuiPackage.COLLECTION_STYLES__FILTERS_CONTROL_CLASS:
				setFiltersControlClass((String)newValue);
				return;
			case WebuiPackage.COLLECTION_STYLES__INSTANCE_ACTION_CLASS:
				setInstanceActionClass((String)newValue);
				return;
			case WebuiPackage.COLLECTION_STYLES__INSTANCE_CONTROL_CLASS:
				setInstanceControlClass((String)newValue);
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
			case WebuiPackage.COLLECTION_STYLES__FILTERS_CLASS:
				setFiltersClass(FILTERS_CLASS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_STYLES__FILTERS_ACTION_CLASS:
				setFiltersActionClass(FILTERS_ACTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_STYLES__FILTERS_BODY_CLASS:
				setFiltersBodyClass(FILTERS_BODY_CLASS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_STYLES__FILTERS_CONTROL_CLASS:
				setFiltersControlClass(FILTERS_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_STYLES__INSTANCE_ACTION_CLASS:
				setInstanceActionClass(INSTANCE_ACTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_STYLES__INSTANCE_CONTROL_CLASS:
				setInstanceControlClass(INSTANCE_CONTROL_CLASS_EDEFAULT);
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
			case WebuiPackage.COLLECTION_STYLES__FILTERS_CLASS:
				return FILTERS_CLASS_EDEFAULT == null ? filtersClass != null : !FILTERS_CLASS_EDEFAULT.equals(filtersClass);
			case WebuiPackage.COLLECTION_STYLES__FILTERS_ACTION_CLASS:
				return FILTERS_ACTION_CLASS_EDEFAULT == null ? filtersActionClass != null : !FILTERS_ACTION_CLASS_EDEFAULT.equals(filtersActionClass);
			case WebuiPackage.COLLECTION_STYLES__FILTERS_BODY_CLASS:
				return FILTERS_BODY_CLASS_EDEFAULT == null ? filtersBodyClass != null : !FILTERS_BODY_CLASS_EDEFAULT.equals(filtersBodyClass);
			case WebuiPackage.COLLECTION_STYLES__FILTERS_CONTROL_CLASS:
				return FILTERS_CONTROL_CLASS_EDEFAULT == null ? filtersControlClass != null : !FILTERS_CONTROL_CLASS_EDEFAULT.equals(filtersControlClass);
			case WebuiPackage.COLLECTION_STYLES__INSTANCE_ACTION_CLASS:
				return INSTANCE_ACTION_CLASS_EDEFAULT == null ? instanceActionClass != null : !INSTANCE_ACTION_CLASS_EDEFAULT.equals(instanceActionClass);
			case WebuiPackage.COLLECTION_STYLES__INSTANCE_CONTROL_CLASS:
				return INSTANCE_CONTROL_CLASS_EDEFAULT == null ? instanceControlClass != null : !INSTANCE_CONTROL_CLASS_EDEFAULT.equals(instanceControlClass);
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
		result.append(" (filtersClass: ");
		result.append(filtersClass);
		result.append(", filtersActionClass: ");
		result.append(filtersActionClass);
		result.append(", filtersBodyClass: ");
		result.append(filtersBodyClass);
		result.append(", filtersControlClass: ");
		result.append(filtersControlClass);
		result.append(", instanceActionClass: ");
		result.append(instanceActionClass);
		result.append(", instanceControlClass: ");
		result.append(instanceControlClass);
		result.append(')');
		return result.toString();
	}

} //CollectionStylesImpl
