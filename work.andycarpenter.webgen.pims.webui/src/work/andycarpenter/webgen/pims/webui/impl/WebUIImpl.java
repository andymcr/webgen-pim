/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.service.Services;

import work.andycarpenter.webgen.pims.webui.AjaxTechnologies;
import work.andycarpenter.webgen.pims.webui.InputTechnologies;
import work.andycarpenter.webgen.pims.webui.Menu;
import work.andycarpenter.webgen.pims.webui.Page;
import work.andycarpenter.webgen.pims.webui.WebUI;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getServices <em>Services</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultActionNavigationClass <em>Default Action Navigation Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultAnchorClass <em>Default Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultInputGroupClass <em>Default Input Group Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultInputLabelClass <em>Default Input Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultInputElementClass <em>Default Input Element Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getAjaxTechnology <em>Ajax Technology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebUIImpl extends MinimalEObjectImpl.Container implements WebUI {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Services services;

	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The default value of the '{@link #getDefaultDateFormat() <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DATE_FORMAT_EDEFAULT = "jS F Y";

	/**
	 * The cached value of the '{@link #getDefaultDateFormat() <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultDateFormat = DEFAULT_DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTimeFormat() <em>Default Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TIME_FORMAT_EDEFAULT = "G.i";

	/**
	 * The cached value of the '{@link #getDefaultTimeFormat() <em>Default Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultTimeFormat = DEFAULT_TIME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDateTimeFormat() <em>Default Date Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DATE_TIME_FORMAT_EDEFAULT = "jS F Y G.i";

	/**
	 * The cached value of the '{@link #getDefaultDateTimeFormat() <em>Default Date Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDateTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected String defaultDateTimeFormat = DEFAULT_DATE_TIME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultActionNavigationClass() <em>Default Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT = "nav";

	/**
	 * The cached value of the '{@link #getDefaultActionNavigationClass() <em>Default Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultActionNavigationClass = DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultAnchorClass() <em>Default Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultAnchorClass() <em>Default Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultAnchorClass = DEFAULT_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInputGroupClass() <em>Default Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INPUT_GROUP_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultInputGroupClass() <em>Default Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultInputGroupClass = DEFAULT_INPUT_GROUP_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInputLabelClass() <em>Default Input Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputLabelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INPUT_LABEL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultInputLabelClass() <em>Default Input Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputLabelClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultInputLabelClass = DEFAULT_INPUT_LABEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInputElementClass() <em>Default Input Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputElementClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INPUT_ELEMENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultInputElementClass() <em>Default Input Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInputElementClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultInputElementClass = DEFAULT_INPUT_ELEMENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMaximumUploadSize() <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT = 2000000;

	/**
	 * The cached value of the '{@link #getDefaultMaximumUploadSize() <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected int defaultMaximumUploadSize = DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputTechnology() <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final InputTechnologies INPUT_TECHNOLOGY_EDEFAULT = InputTechnologies.HTML;

	/**
	 * The cached value of the '{@link #getInputTechnology() <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTechnology()
	 * @generated
	 * @ordered
	 */
	protected InputTechnologies inputTechnology = INPUT_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAjaxTechnology() <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final AjaxTechnologies AJAX_TECHNOLOGY_EDEFAULT = AjaxTechnologies.NONE;

	/**
	 * The cached value of the '{@link #getAjaxTechnology() <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTechnology()
	 * @generated
	 * @ordered
	 */
	protected AjaxTechnologies ajaxTechnology = AJAX_TECHNOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.WEB_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Services getServices() {
		if (services != null && services.eIsProxy()) {
			InternalEObject oldServices = (InternalEObject)services;
			services = (Services)eResolveProxy(oldServices);
			if (services != oldServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.WEB_UI__SERVICES, oldServices, services));
			}
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services basicGetServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServices(Services newServices) {
		Services oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__SERVICES, oldServices, services));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, WebuiPackage.WEB_UI__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<Page>(Page.class, this, WebuiPackage.WEB_UI__PAGES, WebuiPackage.PAGE__WEB_UI);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDateFormat() {
		return defaultDateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDateFormat(String newDefaultDateFormat) {
		String oldDefaultDateFormat = defaultDateFormat;
		defaultDateFormat = newDefaultDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT, oldDefaultDateFormat, defaultDateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultTimeFormat() {
		return defaultTimeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeFormat(String newDefaultTimeFormat) {
		String oldDefaultTimeFormat = defaultTimeFormat;
		defaultTimeFormat = newDefaultTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT, oldDefaultTimeFormat, defaultTimeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDateTimeFormat() {
		return defaultDateTimeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDateTimeFormat(String newDefaultDateTimeFormat) {
		String oldDefaultDateTimeFormat = defaultDateTimeFormat;
		defaultDateTimeFormat = newDefaultDateTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT, oldDefaultDateTimeFormat, defaultDateTimeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultActionNavigationClass() {
		return defaultActionNavigationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultActionNavigationClass(String newDefaultActionNavigationClass) {
		String oldDefaultActionNavigationClass = defaultActionNavigationClass;
		defaultActionNavigationClass = newDefaultActionNavigationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS, oldDefaultActionNavigationClass, defaultActionNavigationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultAnchorClass() {
		return defaultAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultAnchorClass(String newDefaultAnchorClass) {
		String oldDefaultAnchorClass = defaultAnchorClass;
		defaultAnchorClass = newDefaultAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS, oldDefaultAnchorClass, defaultAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultInputGroupClass() {
		return defaultInputGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInputGroupClass(String newDefaultInputGroupClass) {
		String oldDefaultInputGroupClass = defaultInputGroupClass;
		defaultInputGroupClass = newDefaultInputGroupClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS, oldDefaultInputGroupClass, defaultInputGroupClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultInputLabelClass() {
		return defaultInputLabelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInputLabelClass(String newDefaultInputLabelClass) {
		String oldDefaultInputLabelClass = defaultInputLabelClass;
		defaultInputLabelClass = newDefaultInputLabelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS, oldDefaultInputLabelClass, defaultInputLabelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultInputElementClass() {
		return defaultInputElementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInputElementClass(String newDefaultInputElementClass) {
		String oldDefaultInputElementClass = defaultInputElementClass;
		defaultInputElementClass = newDefaultInputElementClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_INPUT_ELEMENT_CLASS, oldDefaultInputElementClass, defaultInputElementClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefaultMaximumUploadSize() {
		return defaultMaximumUploadSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultMaximumUploadSize(int newDefaultMaximumUploadSize) {
		int oldDefaultMaximumUploadSize = defaultMaximumUploadSize;
		defaultMaximumUploadSize = newDefaultMaximumUploadSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE, oldDefaultMaximumUploadSize, defaultMaximumUploadSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputTechnologies getInputTechnology() {
		return inputTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputTechnology(InputTechnologies newInputTechnology) {
		InputTechnologies oldInputTechnology = inputTechnology;
		inputTechnology = newInputTechnology == null ? INPUT_TECHNOLOGY_EDEFAULT : newInputTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__INPUT_TECHNOLOGY, oldInputTechnology, inputTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AjaxTechnologies getAjaxTechnology() {
		return ajaxTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAjaxTechnology(AjaxTechnologies newAjaxTechnology) {
		AjaxTechnologies oldAjaxTechnology = ajaxTechnology;
		ajaxTechnology = newAjaxTechnology == null ? AJAX_TECHNOLOGY_EDEFAULT : newAjaxTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__AJAX_TECHNOLOGY, oldAjaxTechnology, ajaxTechnology));
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
			case WebuiPackage.WEB_UI__PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPages()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.WEB_UI__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
			case WebuiPackage.WEB_UI__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case WebuiPackage.WEB_UI__SERVICES:
				if (resolve) return getServices();
				return basicGetServices();
			case WebuiPackage.WEB_UI__MENUS:
				return getMenus();
			case WebuiPackage.WEB_UI__PAGES:
				return getPages();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return getDefaultDateFormat();
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return getDefaultTimeFormat();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return getDefaultDateTimeFormat();
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
				return getDefaultActionNavigationClass();
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
				return getDefaultAnchorClass();
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
				return getDefaultInputGroupClass();
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
				return getDefaultInputLabelClass();
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_ELEMENT_CLASS:
				return getDefaultInputElementClass();
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return getDefaultMaximumUploadSize();
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				return getInputTechnology();
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				return getAjaxTechnology();
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
			case WebuiPackage.WEB_UI__SERVICES:
				setServices((Services)newValue);
				return;
			case WebuiPackage.WEB_UI__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WebuiPackage.WEB_UI__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
				setDefaultActionNavigationClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
				setDefaultAnchorClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
				setDefaultInputGroupClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
				setDefaultInputLabelClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_ELEMENT_CLASS:
				setDefaultInputElementClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize((Integer)newValue);
				return;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				setInputTechnology((InputTechnologies)newValue);
				return;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				setAjaxTechnology((AjaxTechnologies)newValue);
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
			case WebuiPackage.WEB_UI__SERVICES:
				setServices((Services)null);
				return;
			case WebuiPackage.WEB_UI__MENUS:
				getMenus().clear();
				return;
			case WebuiPackage.WEB_UI__PAGES:
				getPages().clear();
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				setDefaultDateFormat(DEFAULT_DATE_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				setDefaultTimeFormat(DEFAULT_TIME_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				setDefaultDateTimeFormat(DEFAULT_DATE_TIME_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
				setDefaultActionNavigationClass(DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
				setDefaultAnchorClass(DEFAULT_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
				setDefaultInputGroupClass(DEFAULT_INPUT_GROUP_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
				setDefaultInputLabelClass(DEFAULT_INPUT_LABEL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_ELEMENT_CLASS:
				setDefaultInputElementClass(DEFAULT_INPUT_ELEMENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize(DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				setInputTechnology(INPUT_TECHNOLOGY_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				setAjaxTechnology(AJAX_TECHNOLOGY_EDEFAULT);
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
			case WebuiPackage.WEB_UI__SERVICES:
				return services != null;
			case WebuiPackage.WEB_UI__MENUS:
				return menus != null && !menus.isEmpty();
			case WebuiPackage.WEB_UI__PAGES:
				return pages != null && !pages.isEmpty();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return DEFAULT_DATE_FORMAT_EDEFAULT == null ? defaultDateFormat != null : !DEFAULT_DATE_FORMAT_EDEFAULT.equals(defaultDateFormat);
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return DEFAULT_TIME_FORMAT_EDEFAULT == null ? defaultTimeFormat != null : !DEFAULT_TIME_FORMAT_EDEFAULT.equals(defaultTimeFormat);
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return DEFAULT_DATE_TIME_FORMAT_EDEFAULT == null ? defaultDateTimeFormat != null : !DEFAULT_DATE_TIME_FORMAT_EDEFAULT.equals(defaultDateTimeFormat);
			case WebuiPackage.WEB_UI__DEFAULT_ACTION_NAVIGATION_CLASS:
				return DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT == null ? defaultActionNavigationClass != null : !DEFAULT_ACTION_NAVIGATION_CLASS_EDEFAULT.equals(defaultActionNavigationClass);
			case WebuiPackage.WEB_UI__DEFAULT_ANCHOR_CLASS:
				return DEFAULT_ANCHOR_CLASS_EDEFAULT == null ? defaultAnchorClass != null : !DEFAULT_ANCHOR_CLASS_EDEFAULT.equals(defaultAnchorClass);
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_GROUP_CLASS:
				return DEFAULT_INPUT_GROUP_CLASS_EDEFAULT == null ? defaultInputGroupClass != null : !DEFAULT_INPUT_GROUP_CLASS_EDEFAULT.equals(defaultInputGroupClass);
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_LABEL_CLASS:
				return DEFAULT_INPUT_LABEL_CLASS_EDEFAULT == null ? defaultInputLabelClass != null : !DEFAULT_INPUT_LABEL_CLASS_EDEFAULT.equals(defaultInputLabelClass);
			case WebuiPackage.WEB_UI__DEFAULT_INPUT_ELEMENT_CLASS:
				return DEFAULT_INPUT_ELEMENT_CLASS_EDEFAULT == null ? defaultInputElementClass != null : !DEFAULT_INPUT_ELEMENT_CLASS_EDEFAULT.equals(defaultInputElementClass);
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return defaultMaximumUploadSize != DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;
			case WebuiPackage.WEB_UI__INPUT_TECHNOLOGY:
				return inputTechnology != INPUT_TECHNOLOGY_EDEFAULT;
			case WebuiPackage.WEB_UI__AJAX_TECHNOLOGY:
				return ajaxTechnology != AJAX_TECHNOLOGY_EDEFAULT;
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
		result.append(" (defaultDateFormat: ");
		result.append(defaultDateFormat);
		result.append(", defaultTimeFormat: ");
		result.append(defaultTimeFormat);
		result.append(", defaultDateTimeFormat: ");
		result.append(defaultDateTimeFormat);
		result.append(", defaultActionNavigationClass: ");
		result.append(defaultActionNavigationClass);
		result.append(", defaultAnchorClass: ");
		result.append(defaultAnchorClass);
		result.append(", defaultInputGroupClass: ");
		result.append(defaultInputGroupClass);
		result.append(", defaultInputLabelClass: ");
		result.append(defaultInputLabelClass);
		result.append(", defaultInputElementClass: ");
		result.append(defaultInputElementClass);
		result.append(", defaultMaximumUploadSize: ");
		result.append(defaultMaximumUploadSize);
		result.append(", inputTechnology: ");
		result.append(inputTechnology);
		result.append(", ajaxTechnology: ");
		result.append(ajaxTechnology);
		result.append(')');
		return result.toString();
	}

} //WebUIImpl
