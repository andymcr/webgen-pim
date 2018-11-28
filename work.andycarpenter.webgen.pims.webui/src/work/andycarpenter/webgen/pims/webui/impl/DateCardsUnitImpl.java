/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.DateCardsUnit;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DateCardsUnitImpl#getElementDate <em>Element Date</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DateCardsUnitImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateCardsUnitImpl extends CardsUnitImpl implements DateCardsUnit {
	/**
	 * The cached value of the '{@link #getElementDate() <em>Element Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementDate()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath elementDate;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,cards_unit,date_cards_unit";

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateCardsUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.DATE_CARDS_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePath getElementDate() {
		return elementDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementDate(FeaturePath newElementDate, NotificationChain msgs) {
		FeaturePath oldElementDate = elementDate;
		elementDate = newElementDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE, oldElementDate, newElementDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementDate(FeaturePath newElementDate) {
		if (newElementDate != elementDate) {
			NotificationChain msgs = null;
			if (elementDate != null)
				msgs = ((InternalEObject)elementDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE, null, msgs);
			if (newElementDate != null)
				msgs = ((InternalEObject)newElementDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE, null, msgs);
			msgs = basicSetElementDate(newElementDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE, newElementDate, newElementDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DATE_CARDS_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE:
				return basicSetElementDate(null, msgs);
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
			case WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE:
				return getElementDate();
			case WebuiPackage.DATE_CARDS_UNIT__STYLE_CLASS:
				return getStyleClass();
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
			case WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE:
				setElementDate((FeaturePath)newValue);
				return;
			case WebuiPackage.DATE_CARDS_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
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
			case WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE:
				setElementDate((FeaturePath)null);
				return;
			case WebuiPackage.DATE_CARDS_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
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
			case WebuiPackage.DATE_CARDS_UNIT__ELEMENT_DATE:
				return elementDate != null;
			case WebuiPackage.DATE_CARDS_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
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
		result.append(" (styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //DateCardsUnitImpl
