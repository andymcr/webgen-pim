/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.webui.IndexDisplayOption;
import work.andycarpenter.webgen.pims.webui.IndexUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.IndexUnitImpl#getDisplayOption <em>Display Option</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.IndexUnitImpl#getRowClasses <em>Row Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexUnitImpl extends CollectionUnitImpl implements IndexUnit {
	/**
	 * The default value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final IndexDisplayOption DISPLAY_OPTION_EDEFAULT = IndexDisplayOption.GRID;

	/**
	 * The cached value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected IndexDisplayOption displayOption = DISPLAY_OPTION_EDEFAULT;

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
	protected IndexUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.INDEX_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexDisplayOption getDisplayOption() {
		return displayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayOption(IndexDisplayOption newDisplayOption) {
		IndexDisplayOption oldDisplayOption = displayOption;
		displayOption = newDisplayOption == null ? DISPLAY_OPTION_EDEFAULT : newDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INDEX_UNIT__DISPLAY_OPTION, oldDisplayOption, displayOption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INDEX_UNIT__ROW_CLASSES, oldRowClasses, rowClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.INDEX_UNIT__DISPLAY_OPTION:
				return getDisplayOption();
			case WebuiPackage.INDEX_UNIT__ROW_CLASSES:
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
			case WebuiPackage.INDEX_UNIT__DISPLAY_OPTION:
				setDisplayOption((IndexDisplayOption)newValue);
				return;
			case WebuiPackage.INDEX_UNIT__ROW_CLASSES:
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
			case WebuiPackage.INDEX_UNIT__DISPLAY_OPTION:
				setDisplayOption(DISPLAY_OPTION_EDEFAULT);
				return;
			case WebuiPackage.INDEX_UNIT__ROW_CLASSES:
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
			case WebuiPackage.INDEX_UNIT__DISPLAY_OPTION:
				return displayOption != DISPLAY_OPTION_EDEFAULT;
			case WebuiPackage.INDEX_UNIT__ROW_CLASSES:
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
		result.append(" (displayOption: ");
		result.append(displayOption);
		result.append(", rowClasses: ");
		result.append(rowClasses);
		result.append(')');
		return result.toString();
	}

} //IndexUnitImpl
