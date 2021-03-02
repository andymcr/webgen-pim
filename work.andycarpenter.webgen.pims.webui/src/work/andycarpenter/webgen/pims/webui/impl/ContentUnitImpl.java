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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl;

import work.andycarpenter.webgen.pims.webui.ContentUnit;
import work.andycarpenter.webgen.pims.webui.Page;
import work.andycarpenter.webgen.pims.webui.RouteActual;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#isCreateDefaultUriElement <em>Create Default Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getRouteActuals <em>Route Actuals</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getSectionClass <em>Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getLocalCaptionClass <em>Local Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getLocalContentClass <em>Local Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getPageDisplayedOn <em>Page Displayed On</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentUnitImpl extends NamedDisplayElementImpl implements ContentUnit {
	/**
	 * The default value of the '{@link #isCreateDefaultUriElement() <em>Create Default Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateDefaultUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_DEFAULT_URI_ELEMENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreateDefaultUriElement() <em>Create Default Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateDefaultUriElement()
	 * @generated
	 * @ordered
	 */
	protected boolean createDefaultUriElement = CREATE_DEFAULT_URI_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRouteActuals() <em>Route Actuals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteActuals()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteActual> routeActuals;

	/**
	 * The default value of the '{@link #getRequiresRole() <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRole()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRES_ROLE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRequiresRole() <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRole()
	 * @generated
	 * @ordered
	 */
	protected String requiresRole = REQUIRES_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurposeSummary() <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeSummary() <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSummary()
	 * @generated
	 * @ordered
	 */
	protected String purposeSummary = PURPOSE_SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_ELEMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected String uriElement = URI_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternative() <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected String alternative = ALTERNATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionClass() <em>Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSectionClass() <em>Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionClass()
	 * @generated
	 * @ordered
	 */
	protected String sectionClass = SECTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_CAPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected boolean omitCaption = OMIT_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalCaptionClass() <em>Local Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CAPTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalCaptionClass() <em>Local Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected String localCaptionClass = LOCAL_CAPTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalContentClass() <em>Local Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalContentClass() <em>Local Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalContentClass()
	 * @generated
	 * @ordered
	 */
	protected String localContentClass = LOCAL_CONTENT_CLASS_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getPageDisplayedOn() <em>Page Displayed On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageDisplayedOn()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAGE_DISPLAYED_ON__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.CONTENT_UNIT__PAGE_DISPLAYED_ON).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CONTENT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getDisplayedOn() {
		if (eContainerFeatureID() != WebuiPackage.CONTENT_UNIT__DISPLAYED_ON) return null;
		return (Page)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(Page newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebuiPackage.CONTENT_UNIT__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayedOn(Page newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.CONTENT_UNIT__DISPLAYED_ON && newDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDisplayedOn != null)
				msgs = ((InternalEObject)newDisplayedOn).eInverseAdd(this, WebuiPackage.PAGE__UNITS, Page.class, msgs);
			msgs = basicSetDisplayedOn(newDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreateDefaultUriElement() {
		return createDefaultUriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateDefaultUriElement(boolean newCreateDefaultUriElement) {
		boolean oldCreateDefaultUriElement = createDefaultUriElement;
		createDefaultUriElement = newCreateDefaultUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT, oldCreateDefaultUriElement, createDefaultUriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteActual> getRouteActuals() {
		if (routeActuals == null) {
			routeActuals = new EObjectContainmentWithInverseEList<RouteActual>(RouteActual.class, this, WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS, WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR);
		}
		return routeActuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequiresRole() {
		return requiresRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresRole(String newRequiresRole) {
		String oldRequiresRole = requiresRole;
		requiresRole = newRequiresRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__REQUIRES_ROLE, oldRequiresRole, requiresRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurposeSummary() {
		return purposeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurposeSummary(String newPurposeSummary) {
		String oldPurposeSummary = purposeSummary;
		purposeSummary = newPurposeSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY, oldPurposeSummary, purposeSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriElement() {
		return uriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriElement(String newUriElement) {
		String oldUriElement = uriElement;
		uriElement = newUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__URI_ELEMENT, oldUriElement, uriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlternative() {
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternative(String newAlternative) {
		String oldAlternative = alternative;
		alternative = newAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__ALTERNATIVE, oldAlternative, alternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSectionClass() {
		return sectionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSectionClass(String newSectionClass) {
		String oldSectionClass = sectionClass;
		sectionClass = newSectionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__SECTION_CLASS, oldSectionClass, sectionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOmitCaption() {
		return omitCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOmitCaption(boolean newOmitCaption) {
		boolean oldOmitCaption = omitCaption;
		omitCaption = newOmitCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__OMIT_CAPTION, oldOmitCaption, omitCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalCaptionClass() {
		return localCaptionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalCaptionClass(String newLocalCaptionClass) {
		String oldLocalCaptionClass = localCaptionClass;
		localCaptionClass = newLocalCaptionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS, oldLocalCaptionClass, localCaptionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalContentClass() {
		return localContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalContentClass(String newLocalContentClass) {
		String oldLocalContentClass = localContentClass;
		localContentClass = newLocalContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS, oldLocalContentClass, localContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getPageDisplayedOn() {
		return (Page)PAGE_DISPLAYED_ON__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPageDisplayedOn() {
		return (Page)PAGE_DISPLAYED_ON__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPageDisplayedOn() {
		return PAGE_DISPLAYED_ON__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case WebuiPackage.CONTENT_UNIT__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((Page)otherEnd, msgs);
			case WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRouteActuals()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.CONTENT_UNIT__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS:
				return ((InternalEList<?>)getRouteActuals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebuiPackage.CONTENT_UNIT__DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.PAGE__UNITS, Page.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.CONTENT_UNIT__DISPLAYED_ON:
				return getDisplayedOn();
			case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				return isCreateDefaultUriElement();
			case WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS:
				return getRouteActuals();
			case WebuiPackage.CONTENT_UNIT__REQUIRES_ROLE:
				return getRequiresRole();
			case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY:
				return getPurposeSummary();
			case WebuiPackage.CONTENT_UNIT__URI_ELEMENT:
				return getUriElement();
			case WebuiPackage.CONTENT_UNIT__ALTERNATIVE:
				return getAlternative();
			case WebuiPackage.CONTENT_UNIT__SECTION_CLASS:
				return getSectionClass();
			case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION:
				return isOmitCaption();
			case WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS:
				return getLocalCaptionClass();
			case WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS:
				return getLocalContentClass();
			case WebuiPackage.CONTENT_UNIT__PAGE_DISPLAYED_ON:
				if (resolve) return getPageDisplayedOn();
				return basicGetPageDisplayedOn();
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
			case WebuiPackage.CONTENT_UNIT__DISPLAYED_ON:
				setDisplayedOn((Page)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				setCreateDefaultUriElement((Boolean)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS:
				getRouteActuals().clear();
				getRouteActuals().addAll((Collection<? extends RouteActual>)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__REQUIRES_ROLE:
				setRequiresRole((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY:
				setPurposeSummary((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__ALTERNATIVE:
				setAlternative((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__SECTION_CLASS:
				setSectionClass((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION:
				setOmitCaption((Boolean)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS:
				setLocalCaptionClass((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS:
				setLocalContentClass((String)newValue);
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
			case WebuiPackage.CONTENT_UNIT__DISPLAYED_ON:
				setDisplayedOn((Page)null);
				return;
			case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				setCreateDefaultUriElement(CREATE_DEFAULT_URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS:
				getRouteActuals().clear();
				return;
			case WebuiPackage.CONTENT_UNIT__REQUIRES_ROLE:
				setRequiresRole(REQUIRES_ROLE_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY:
				setPurposeSummary(PURPOSE_SUMMARY_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__ALTERNATIVE:
				setAlternative(ALTERNATIVE_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__SECTION_CLASS:
				setSectionClass(SECTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION:
				setOmitCaption(OMIT_CAPTION_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS:
				setLocalCaptionClass(LOCAL_CAPTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS:
				setLocalContentClass(LOCAL_CONTENT_CLASS_EDEFAULT);
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
			case WebuiPackage.CONTENT_UNIT__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				return createDefaultUriElement != CREATE_DEFAULT_URI_ELEMENT_EDEFAULT;
			case WebuiPackage.CONTENT_UNIT__ROUTE_ACTUALS:
				return routeActuals != null && !routeActuals.isEmpty();
			case WebuiPackage.CONTENT_UNIT__REQUIRES_ROLE:
				return REQUIRES_ROLE_EDEFAULT == null ? requiresRole != null : !REQUIRES_ROLE_EDEFAULT.equals(requiresRole);
			case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY:
				return PURPOSE_SUMMARY_EDEFAULT == null ? purposeSummary != null : !PURPOSE_SUMMARY_EDEFAULT.equals(purposeSummary);
			case WebuiPackage.CONTENT_UNIT__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case WebuiPackage.CONTENT_UNIT__ALTERNATIVE:
				return ALTERNATIVE_EDEFAULT == null ? alternative != null : !ALTERNATIVE_EDEFAULT.equals(alternative);
			case WebuiPackage.CONTENT_UNIT__SECTION_CLASS:
				return SECTION_CLASS_EDEFAULT == null ? sectionClass != null : !SECTION_CLASS_EDEFAULT.equals(sectionClass);
			case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION:
				return omitCaption != OMIT_CAPTION_EDEFAULT;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS:
				return LOCAL_CAPTION_CLASS_EDEFAULT == null ? localCaptionClass != null : !LOCAL_CAPTION_CLASS_EDEFAULT.equals(localCaptionClass);
			case WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS:
				return LOCAL_CONTENT_CLASS_EDEFAULT == null ? localContentClass != null : !LOCAL_CONTENT_CLASS_EDEFAULT.equals(localContentClass);
			case WebuiPackage.CONTENT_UNIT__PAGE_DISPLAYED_ON:
				return isSetPageDisplayedOn();
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
		result.append(" (createDefaultUriElement: ");
		result.append(createDefaultUriElement);
		result.append(", requiresRole: ");
		result.append(requiresRole);
		result.append(", purposeSummary: ");
		result.append(purposeSummary);
		result.append(", uriElement: ");
		result.append(uriElement);
		result.append(", alternative: ");
		result.append(alternative);
		result.append(", sectionClass: ");
		result.append(sectionClass);
		result.append(", omitCaption: ");
		result.append(omitCaption);
		result.append(", localCaptionClass: ");
		result.append(localCaptionClass);
		result.append(", localContentClass: ");
		result.append(localContentClass);
		result.append(')');
		return result.toString();
	}

} //ContentUnitImpl
