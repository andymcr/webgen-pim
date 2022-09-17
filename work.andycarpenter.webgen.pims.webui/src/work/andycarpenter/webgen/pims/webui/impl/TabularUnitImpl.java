/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.TabularUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabular Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.TabularUnitImpl#getHeaderClassOverride <em>Header Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.TabularUnitImpl#getFooterClassOverride <em>Footer Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.TabularUnitImpl#getRowClasses <em>Row Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabularUnitImpl extends CollectionUnitImpl implements TabularUnit {
	/**
	 * The default value of the '{@link #getHeaderClassOverride() <em>Header Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClassOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderClassOverride() <em>Header Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClassOverride()
	 * @generated
	 * @ordered
	 */
	protected String headerClassOverride = HEADER_CLASS_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterClassOverride() <em>Footer Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClassOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooterClassOverride() <em>Footer Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClassOverride()
	 * @generated
	 * @ordered
	 */
	protected String footerClassOverride = FOOTER_CLASS_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowClasses() <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowClasses()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_CLASSES_EDEFAULT = "odd_row,even_row";

	/**
	 * The cached value of the '{@link #getRowClasses() <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowClasses()
	 * @generated
	 * @ordered
	 */
	protected String rowClasses = ROW_CLASSES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabularUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.TABULAR_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderClassOverride() {
		return headerClassOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderClassOverride(String newHeaderClassOverride) {
		String oldHeaderClassOverride = headerClassOverride;
		headerClassOverride = newHeaderClassOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.TABULAR_UNIT__HEADER_CLASS_OVERRIDE, oldHeaderClassOverride, headerClassOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFooterClassOverride() {
		return footerClassOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooterClassOverride(String newFooterClassOverride) {
		String oldFooterClassOverride = footerClassOverride;
		footerClassOverride = newFooterClassOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.TABULAR_UNIT__FOOTER_CLASS_OVERRIDE, oldFooterClassOverride, footerClassOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRowClasses() {
		return rowClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowClasses(String newRowClasses) {
		String oldRowClasses = rowClasses;
		rowClasses = newRowClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.TABULAR_UNIT__ROW_CLASSES, oldRowClasses, rowClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.TABULAR_UNIT__HEADER_CLASS_OVERRIDE:
				return getHeaderClassOverride();
			case WebuiPackage.TABULAR_UNIT__FOOTER_CLASS_OVERRIDE:
				return getFooterClassOverride();
			case WebuiPackage.TABULAR_UNIT__ROW_CLASSES:
				return getRowClasses();
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
			case WebuiPackage.TABULAR_UNIT__HEADER_CLASS_OVERRIDE:
				setHeaderClassOverride((String)newValue);
				return;
			case WebuiPackage.TABULAR_UNIT__FOOTER_CLASS_OVERRIDE:
				setFooterClassOverride((String)newValue);
				return;
			case WebuiPackage.TABULAR_UNIT__ROW_CLASSES:
				setRowClasses((String)newValue);
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
			case WebuiPackage.TABULAR_UNIT__HEADER_CLASS_OVERRIDE:
				setHeaderClassOverride(HEADER_CLASS_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.TABULAR_UNIT__FOOTER_CLASS_OVERRIDE:
				setFooterClassOverride(FOOTER_CLASS_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.TABULAR_UNIT__ROW_CLASSES:
				setRowClasses(ROW_CLASSES_EDEFAULT);
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
			case WebuiPackage.TABULAR_UNIT__HEADER_CLASS_OVERRIDE:
				return HEADER_CLASS_OVERRIDE_EDEFAULT == null ? headerClassOverride != null : !HEADER_CLASS_OVERRIDE_EDEFAULT.equals(headerClassOverride);
			case WebuiPackage.TABULAR_UNIT__FOOTER_CLASS_OVERRIDE:
				return FOOTER_CLASS_OVERRIDE_EDEFAULT == null ? footerClassOverride != null : !FOOTER_CLASS_OVERRIDE_EDEFAULT.equals(footerClassOverride);
			case WebuiPackage.TABULAR_UNIT__ROW_CLASSES:
				return ROW_CLASSES_EDEFAULT == null ? rowClasses != null : !ROW_CLASSES_EDEFAULT.equals(rowClasses);
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
		result.append(" (headerClassOverride: ");
		result.append(headerClassOverride);
		result.append(", footerClassOverride: ");
		result.append(footerClassOverride);
		result.append(", rowClasses: ");
		result.append(rowClasses);
		result.append(')');
		return result.toString();
	}

} //TabularUnitImpl
