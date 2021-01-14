/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.service.Service;

import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.UnitField;
import work.andycarpenter.webgen.pims.webui.UnitSupportAction;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getContentTypes <em>Content Types</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getServicesUsed <em>Services Used</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getMessageWhenHidden <em>Message When Hidden</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getSupportActions <em>Support Actions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getFieldListClass <em>Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getUnitFieldLabelClass <em>Unit Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getUnitFieldValueClass <em>Unit Field Value Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DynamicUnitImpl extends ContentUnitImpl implements DynamicUnit {
	/**
	 * The cached setting delegate for the '{@link #getContentTypes() <em>Content Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTENT_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.DYNAMIC_UNIT__CONTENT_TYPES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDisplayFields() <em>Display Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFields()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitField> displayFields;

	/**
	 * The cached value of the '{@link #getServicesUsed() <em>Services Used</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> servicesUsed;

	/**
	 * The cached value of the '{@link #getHideWhen() <em>Hide When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHideWhen()
	 * @generated
	 * @ordered
	 */
	protected Predicate hideWhen;

	/**
	 * The default value of the '{@link #getMessageWhenHidden() <em>Message When Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWhenHidden()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_WHEN_HIDDEN_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getMessageWhenHidden() <em>Message When Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWhenHidden()
	 * @generated
	 * @ordered
	 */
	protected String messageWhenHidden = MESSAGE_WHEN_HIDDEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportActions() <em>Support Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportActions()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitSupportAction> supportActions;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = "unit_header";

	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlClass() <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_CLASS_EDEFAULT = "unit_control";

	/**
	 * The cached value of the '{@link #getControlClass() <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlClass()
	 * @generated
	 * @ordered
	 */
	protected String controlClass = CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = "unit_footer";

	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldListClass() <em>Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_LIST_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFieldListClass() <em>Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected String fieldListClass = FIELD_LIST_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitFieldLabelClass() <em>Unit Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitFieldLabelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_FIELD_LABEL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUnitFieldLabelClass() <em>Unit Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitFieldLabelClass()
	 * @generated
	 * @ordered
	 */
	protected String unitFieldLabelClass = UNIT_FIELD_LABEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitFieldValueClass() <em>Unit Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitFieldValueClass()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_FIELD_VALUE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUnitFieldValueClass() <em>Unit Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitFieldValueClass()
	 * @generated
	 * @ordered
	 */
	protected String unitFieldValueClass = UNIT_FIELD_VALUE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.DYNAMIC_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entity> getContentTypes() {
		return (EList<Entity>)CONTENT_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnitField> getDisplayFields() {
		if (displayFields == null) {
			displayFields = new EObjectContainmentWithInverseEList<UnitField>(UnitField.class, this, WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS, WebuiPackage.UNIT_FIELD__DISPLAYED_ON);
		}
		return displayFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServicesUsed() {
		if (servicesUsed == null) {
			servicesUsed = new EObjectResolvingEList<Service>(Service.class, this, WebuiPackage.DYNAMIC_UNIT__SERVICES_USED);
		}
		return servicesUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getHideWhen() {
		return hideWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHideWhen(Predicate newHideWhen, NotificationChain msgs) {
		Predicate oldHideWhen = hideWhen;
		hideWhen = newHideWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN, oldHideWhen, newHideWhen);
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
	public void setHideWhen(Predicate newHideWhen) {
		if (newHideWhen != hideWhen) {
			NotificationChain msgs = null;
			if (hideWhen != null)
				msgs = ((InternalEObject)hideWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN, null, msgs);
			if (newHideWhen != null)
				msgs = ((InternalEObject)newHideWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN, null, msgs);
			msgs = basicSetHideWhen(newHideWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN, newHideWhen, newHideWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageWhenHidden() {
		return messageWhenHidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageWhenHidden(String newMessageWhenHidden) {
		String oldMessageWhenHidden = messageWhenHidden;
		messageWhenHidden = newMessageWhenHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN, oldMessageWhenHidden, messageWhenHidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnitSupportAction> getSupportActions() {
		if (supportActions == null) {
			supportActions = new EObjectContainmentEList<UnitSupportAction>(UnitSupportAction.class, this, WebuiPackage.DYNAMIC_UNIT__SUPPORT_ACTIONS);
		}
		return supportActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__FOOTER, oldFooter, footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getControlClass() {
		return controlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlClass(String newControlClass) {
		String oldControlClass = controlClass;
		controlClass = newControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__CONTROL_CLASS, oldControlClass, controlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldListClass() {
		return fieldListClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldListClass(String newFieldListClass) {
		String oldFieldListClass = fieldListClass;
		fieldListClass = newFieldListClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__FIELD_LIST_CLASS, oldFieldListClass, fieldListClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnitFieldLabelClass() {
		return unitFieldLabelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitFieldLabelClass(String newUnitFieldLabelClass) {
		String oldUnitFieldLabelClass = unitFieldLabelClass;
		unitFieldLabelClass = newUnitFieldLabelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS, oldUnitFieldLabelClass, unitFieldLabelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnitFieldValueClass() {
		return unitFieldValueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitFieldValueClass(String newUnitFieldValueClass) {
		String oldUnitFieldValueClass = unitFieldValueClass;
		unitFieldValueClass = newUnitFieldValueClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS, oldUnitFieldValueClass, unitFieldValueClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisplayFields()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return ((InternalEList<?>)getDisplayFields()).basicRemove(otherEnd, msgs);
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				return basicSetHideWhen(null, msgs);
			case WebuiPackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				return ((InternalEList<?>)getSupportActions()).basicRemove(otherEnd, msgs);
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
			case WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPES:
				return getContentTypes();
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return getDisplayFields();
			case WebuiPackage.DYNAMIC_UNIT__SERVICES_USED:
				return getServicesUsed();
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				return getHideWhen();
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
				return getMessageWhenHidden();
			case WebuiPackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				return getSupportActions();
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
				return getHeader();
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
				return getFooter();
			case WebuiPackage.DYNAMIC_UNIT__HEADER_CLASS:
				return getHeaderClass();
			case WebuiPackage.DYNAMIC_UNIT__CONTROL_CLASS:
				return getControlClass();
			case WebuiPackage.DYNAMIC_UNIT__FOOTER_CLASS:
				return getFooterClass();
			case WebuiPackage.DYNAMIC_UNIT__FIELD_LIST_CLASS:
				return getFieldListClass();
			case WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS:
				return getUnitFieldLabelClass();
			case WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS:
				return getUnitFieldValueClass();
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
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				getDisplayFields().addAll((Collection<? extends UnitField>)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__SERVICES_USED:
				getServicesUsed().clear();
				getServicesUsed().addAll((Collection<? extends Service>)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				setHideWhen((Predicate)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
				setMessageWhenHidden((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				getSupportActions().clear();
				getSupportActions().addAll((Collection<? extends UnitSupportAction>)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
				setHeader((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
				setFooter((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__CONTROL_CLASS:
				setControlClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__FIELD_LIST_CLASS:
				setFieldListClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS:
				setUnitFieldLabelClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS:
				setUnitFieldValueClass((String)newValue);
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
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				return;
			case WebuiPackage.DYNAMIC_UNIT__SERVICES_USED:
				getServicesUsed().clear();
				return;
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				setHideWhen((Predicate)null);
				return;
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
				setMessageWhenHidden(MESSAGE_WHEN_HIDDEN_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				getSupportActions().clear();
				return;
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__CONTROL_CLASS:
				setControlClass(CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__FIELD_LIST_CLASS:
				setFieldListClass(FIELD_LIST_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS:
				setUnitFieldLabelClass(UNIT_FIELD_LABEL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS:
				setUnitFieldValueClass(UNIT_FIELD_VALUE_CLASS_EDEFAULT);
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
			case WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPES:
				return CONTENT_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return displayFields != null && !displayFields.isEmpty();
			case WebuiPackage.DYNAMIC_UNIT__SERVICES_USED:
				return servicesUsed != null && !servicesUsed.isEmpty();
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				return hideWhen != null;
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
				return MESSAGE_WHEN_HIDDEN_EDEFAULT == null ? messageWhenHidden != null : !MESSAGE_WHEN_HIDDEN_EDEFAULT.equals(messageWhenHidden);
			case WebuiPackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				return supportActions != null && !supportActions.isEmpty();
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebuiPackage.DYNAMIC_UNIT__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebuiPackage.DYNAMIC_UNIT__CONTROL_CLASS:
				return CONTROL_CLASS_EDEFAULT == null ? controlClass != null : !CONTROL_CLASS_EDEFAULT.equals(controlClass);
			case WebuiPackage.DYNAMIC_UNIT__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebuiPackage.DYNAMIC_UNIT__FIELD_LIST_CLASS:
				return FIELD_LIST_CLASS_EDEFAULT == null ? fieldListClass != null : !FIELD_LIST_CLASS_EDEFAULT.equals(fieldListClass);
			case WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_LABEL_CLASS:
				return UNIT_FIELD_LABEL_CLASS_EDEFAULT == null ? unitFieldLabelClass != null : !UNIT_FIELD_LABEL_CLASS_EDEFAULT.equals(unitFieldLabelClass);
			case WebuiPackage.DYNAMIC_UNIT__UNIT_FIELD_VALUE_CLASS:
				return UNIT_FIELD_VALUE_CLASS_EDEFAULT == null ? unitFieldValueClass != null : !UNIT_FIELD_VALUE_CLASS_EDEFAULT.equals(unitFieldValueClass);
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
		result.append(" (messageWhenHidden: ");
		result.append(messageWhenHidden);
		result.append(", header: ");
		result.append(header);
		result.append(", footer: ");
		result.append(footer);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", controlClass: ");
		result.append(controlClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(", fieldListClass: ");
		result.append(fieldListClass);
		result.append(", unitFieldLabelClass: ");
		result.append(unitFieldLabelClass);
		result.append(", unitFieldValueClass: ");
		result.append(unitFieldValueClass);
		result.append(')');
		return result.toString();
	}

} //DynamicUnitImpl
