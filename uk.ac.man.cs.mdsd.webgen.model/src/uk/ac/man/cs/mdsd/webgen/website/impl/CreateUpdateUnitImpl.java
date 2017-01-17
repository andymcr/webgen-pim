/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.SelectableUnit;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CreateUpdateUnitImpl#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CreateUpdateUnitImpl#getCreateUriElement <em>Create Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CreateUpdateUnitImpl#getClearLabel <em>Clear Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CreateUpdateUnitImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateUpdateUnitImpl extends EditUnitImpl implements CreateUpdateUnit {
	/**
	 * The cached value of the '{@link #getSelectionType() <em>Selection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView selectionType;

	/**
	 * The default value of the '{@link #getCreateUriElement() <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_URI_ELEMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCreateUriElement() <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUriElement()
	 * @generated
	 * @ordered
	 */
	protected String createUriElement = CREATE_URI_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected String clearLabel = CLEAR_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,create_unit,update_unit";

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
	protected CreateUpdateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.CREATE_UPDATE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getSelectionType() {
		if (selectionType != null && selectionType.eIsProxy()) {
			InternalEObject oldSelectionType = (InternalEObject)selectionType;
			selectionType = (EntityOrView)eResolveProxy(oldSelectionType);
			if (selectionType != oldSelectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.CREATE_UPDATE_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
			}
		}
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetSelectionType() {
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionType(EntityOrView newSelectionType) {
		EntityOrView oldSelectionType = selectionType;
		selectionType = newSelectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CREATE_UPDATE_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateUriElement() {
		return createUriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateUriElement(String newCreateUriElement) {
		String oldCreateUriElement = createUriElement;
		createUriElement = newCreateUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT, oldCreateUriElement, createUriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClearLabel() {
		return clearLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearLabel(String newClearLabel) {
		String oldClearLabel = clearLabel;
		clearLabel = newClearLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CREATE_UPDATE_UNIT__CLEAR_LABEL, oldClearLabel, clearLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CREATE_UPDATE_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.CREATE_UPDATE_UNIT__SELECTION_TYPE:
				if (resolve) return getSelectionType();
				return basicGetSelectionType();
			case WebsitePackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				return getCreateUriElement();
			case WebsitePackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return getClearLabel();
			case WebsitePackage.CREATE_UPDATE_UNIT__STYLE_CLASS:
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
			case WebsitePackage.CREATE_UPDATE_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)newValue);
				return;
			case WebsitePackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				setCreateUriElement((String)newValue);
				return;
			case WebsitePackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel((String)newValue);
				return;
			case WebsitePackage.CREATE_UPDATE_UNIT__STYLE_CLASS:
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
			case WebsitePackage.CREATE_UPDATE_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)null);
				return;
			case WebsitePackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				setCreateUriElement(CREATE_URI_ELEMENT_EDEFAULT);
				return;
			case WebsitePackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel(CLEAR_LABEL_EDEFAULT);
				return;
			case WebsitePackage.CREATE_UPDATE_UNIT__STYLE_CLASS:
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
			case WebsitePackage.CREATE_UPDATE_UNIT__SELECTION_TYPE:
				return selectionType != null;
			case WebsitePackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				return CREATE_URI_ELEMENT_EDEFAULT == null ? createUriElement != null : !CREATE_URI_ELEMENT_EDEFAULT.equals(createUriElement);
			case WebsitePackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return CLEAR_LABEL_EDEFAULT == null ? clearLabel != null : !CLEAR_LABEL_EDEFAULT.equals(clearLabel);
			case WebsitePackage.CREATE_UPDATE_UNIT__STYLE_CLASS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SelectableUnit.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.CREATE_UPDATE_UNIT__SELECTION_TYPE: return WebsitePackage.SELECTABLE_UNIT__SELECTION_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SelectableUnit.class) {
			switch (baseFeatureID) {
				case WebsitePackage.SELECTABLE_UNIT__SELECTION_TYPE: return WebsitePackage.CREATE_UPDATE_UNIT__SELECTION_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (createUriElement: ");
		result.append(createUriElement);
		result.append(", clearLabel: ");
		result.append(clearLabel);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //CreateUpdateUnitImpl
