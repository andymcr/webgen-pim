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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.persistence.Persistence;
import work.andycarpenter.webgen.pims.service.Services;
import work.andycarpenter.webgen.pims.webui.CardsUnitStyles;
import work.andycarpenter.webgen.pims.webui.Controller;
import work.andycarpenter.webgen.pims.webui.DefaultUnitStyles;
import work.andycarpenter.webgen.pims.webui.DetailsUnitStyles;
import work.andycarpenter.webgen.pims.webui.FormUnitStyles;
import work.andycarpenter.webgen.pims.webui.GalleryUnitStyles;
import work.andycarpenter.webgen.pims.webui.Navigation;
import work.andycarpenter.webgen.pims.webui.SliderUnitStyles;
import work.andycarpenter.webgen.pims.webui.StaticUnitStyles;
import work.andycarpenter.webgen.pims.webui.TabularUnitStyles;
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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getNavigation <em>Navigation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getServices <em>Services</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#isUseFormFloatingLabels <em>Use Form Floating Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCancelLabel <em>Default Cancel Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultSaveLabel <em>Default Save Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultPageStyleClass <em>Default Page Style Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultStyles <em>Default Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultCardsStyles <em>Default Cards Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultDetailsStyles <em>Default Details Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultFormStyles <em>Default Form Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultGalleryStyles <em>Default Gallery Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultSliderStyles <em>Default Slider Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultStaticStyles <em>Default Static Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultTabularStyles <em>Default Tabular Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.WebUIImpl#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebUIImpl extends MinimalEObjectImpl.Container implements WebUI {
	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected Persistence persistence;

	/**
	 * The cached value of the '{@link #getNavigation() <em>Navigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigation()
	 * @generated
	 * @ordered
	 */
	protected Navigation navigation;

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
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllers;

	/**
	 * The default value of the '{@link #isUseFormFloatingLabels() <em>Use Form Floating Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFormFloatingLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FORM_FLOATING_LABELS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFormFloatingLabels() <em>Use Form Floating Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFormFloatingLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean useFormFloatingLabels = USE_FORM_FLOATING_LABELS_EDEFAULT;

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
	 * The default value of the '{@link #getDefaultCancelLabel() <em>Default Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCancelLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CANCEL_LABEL_EDEFAULT = "Cancel";

	/**
	 * The cached value of the '{@link #getDefaultCancelLabel() <em>Default Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCancelLabel()
	 * @generated
	 * @ordered
	 */
	protected String defaultCancelLabel = DEFAULT_CANCEL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultSaveLabel() <em>Default Save Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSaveLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SAVE_LABEL_EDEFAULT = "Save";

	/**
	 * The cached value of the '{@link #getDefaultSaveLabel() <em>Default Save Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSaveLabel()
	 * @generated
	 * @ordered
	 */
	protected String defaultSaveLabel = DEFAULT_SAVE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPageStyleClass() <em>Default Page Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPageStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PAGE_STYLE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultPageStyleClass() <em>Default Page Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPageStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultPageStyleClass = DEFAULT_PAGE_STYLE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultStyles() <em>Default Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStyles()
	 * @generated
	 * @ordered
	 */
	protected DefaultUnitStyles defaultStyles;

	/**
	 * The cached value of the '{@link #getDefaultCardsStyles() <em>Default Cards Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCardsStyles()
	 * @generated
	 * @ordered
	 */
	protected CardsUnitStyles defaultCardsStyles;

	/**
	 * The cached value of the '{@link #getDefaultDetailsStyles() <em>Default Details Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsStyles()
	 * @generated
	 * @ordered
	 */
	protected DetailsUnitStyles defaultDetailsStyles;

	/**
	 * The cached value of the '{@link #getDefaultFormStyles() <em>Default Form Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFormStyles()
	 * @generated
	 * @ordered
	 */
	protected FormUnitStyles defaultFormStyles;

	/**
	 * The cached value of the '{@link #getDefaultGalleryStyles() <em>Default Gallery Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGalleryStyles()
	 * @generated
	 * @ordered
	 */
	protected GalleryUnitStyles defaultGalleryStyles;

	/**
	 * The cached value of the '{@link #getDefaultSliderStyles() <em>Default Slider Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSliderStyles()
	 * @generated
	 * @ordered
	 */
	protected SliderUnitStyles defaultSliderStyles;

	/**
	 * The cached value of the '{@link #getDefaultStaticStyles() <em>Default Static Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStaticStyles()
	 * @generated
	 * @ordered
	 */
	protected StaticUnitStyles defaultStaticStyles;

	/**
	 * The cached value of the '{@link #getDefaultTabularStyles() <em>Default Tabular Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTabularStyles()
	 * @generated
	 * @ordered
	 */
	protected TabularUnitStyles defaultTabularStyles;

	/**
	 * The default value of the '{@link #getDefaultMaximumUploadSize() <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT = "2000000";

	/**
	 * The cached value of the '{@link #getDefaultMaximumUploadSize() <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 * @ordered
	 */
	protected String defaultMaximumUploadSize = DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT;

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
	public Persistence getPersistence() {
		if (persistence != null && persistence.eIsProxy()) {
			InternalEObject oldPersistence = (InternalEObject)persistence;
			persistence = (Persistence)eResolveProxy(oldPersistence);
			if (persistence != oldPersistence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.WEB_UI__PERSISTENCE, oldPersistence, persistence));
			}
		}
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistence basicGetPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistence(Persistence newPersistence) {
		Persistence oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__PERSISTENCE, oldPersistence, persistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navigation getNavigation() {
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigation(Navigation newNavigation, NotificationChain msgs) {
		Navigation oldNavigation = navigation;
		navigation = newNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__NAVIGATION, oldNavigation, newNavigation);
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
	public void setNavigation(Navigation newNavigation) {
		if (newNavigation != navigation) {
			NotificationChain msgs = null;
			if (navigation != null)
				msgs = ((InternalEObject)navigation).eInverseRemove(this, WebuiPackage.NAVIGATION__PART_OF, Navigation.class, msgs);
			if (newNavigation != null)
				msgs = ((InternalEObject)newNavigation).eInverseAdd(this, WebuiPackage.NAVIGATION__PART_OF, Navigation.class, msgs);
			msgs = basicSetNavigation(newNavigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__NAVIGATION, newNavigation, newNavigation));
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
	public EList<Controller> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentWithInverseEList<Controller>(Controller.class, this, WebuiPackage.WEB_UI__CONTROLLERS, WebuiPackage.CONTROLLER__WEB_UI);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseFormFloatingLabels() {
		return useFormFloatingLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseFormFloatingLabels(boolean newUseFormFloatingLabels) {
		boolean oldUseFormFloatingLabels = useFormFloatingLabels;
		useFormFloatingLabels = newUseFormFloatingLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__USE_FORM_FLOATING_LABELS, oldUseFormFloatingLabels, useFormFloatingLabels));
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
	public String getDefaultSaveLabel() {
		return defaultSaveLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSaveLabel(String newDefaultSaveLabel) {
		String oldDefaultSaveLabel = defaultSaveLabel;
		defaultSaveLabel = newDefaultSaveLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL, oldDefaultSaveLabel, defaultSaveLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultPageStyleClass() {
		return defaultPageStyleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPageStyleClass(String newDefaultPageStyleClass) {
		String oldDefaultPageStyleClass = defaultPageStyleClass;
		defaultPageStyleClass = newDefaultPageStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_PAGE_STYLE_CLASS, oldDefaultPageStyleClass, defaultPageStyleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultUnitStyles getDefaultStyles() {
		return defaultStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultStyles(DefaultUnitStyles newDefaultStyles, NotificationChain msgs) {
		DefaultUnitStyles oldDefaultStyles = defaultStyles;
		defaultStyles = newDefaultStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_STYLES, oldDefaultStyles, newDefaultStyles);
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
	public void setDefaultStyles(DefaultUnitStyles newDefaultStyles) {
		if (newDefaultStyles != defaultStyles) {
			NotificationChain msgs = null;
			if (defaultStyles != null)
				msgs = ((InternalEObject)defaultStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_STYLES, null, msgs);
			if (newDefaultStyles != null)
				msgs = ((InternalEObject)newDefaultStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_STYLES, null, msgs);
			msgs = basicSetDefaultStyles(newDefaultStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_STYLES, newDefaultStyles, newDefaultStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardsUnitStyles getDefaultCardsStyles() {
		return defaultCardsStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultCardsStyles(CardsUnitStyles newDefaultCardsStyles, NotificationChain msgs) {
		CardsUnitStyles oldDefaultCardsStyles = defaultCardsStyles;
		defaultCardsStyles = newDefaultCardsStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES, oldDefaultCardsStyles, newDefaultCardsStyles);
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
	public void setDefaultCardsStyles(CardsUnitStyles newDefaultCardsStyles) {
		if (newDefaultCardsStyles != defaultCardsStyles) {
			NotificationChain msgs = null;
			if (defaultCardsStyles != null)
				msgs = ((InternalEObject)defaultCardsStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES, null, msgs);
			if (newDefaultCardsStyles != null)
				msgs = ((InternalEObject)newDefaultCardsStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES, null, msgs);
			msgs = basicSetDefaultCardsStyles(newDefaultCardsStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES, newDefaultCardsStyles, newDefaultCardsStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailsUnitStyles getDefaultDetailsStyles() {
		return defaultDetailsStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultDetailsStyles(DetailsUnitStyles newDefaultDetailsStyles, NotificationChain msgs) {
		DetailsUnitStyles oldDefaultDetailsStyles = defaultDetailsStyles;
		defaultDetailsStyles = newDefaultDetailsStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES, oldDefaultDetailsStyles, newDefaultDetailsStyles);
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
	public void setDefaultDetailsStyles(DetailsUnitStyles newDefaultDetailsStyles) {
		if (newDefaultDetailsStyles != defaultDetailsStyles) {
			NotificationChain msgs = null;
			if (defaultDetailsStyles != null)
				msgs = ((InternalEObject)defaultDetailsStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES, null, msgs);
			if (newDefaultDetailsStyles != null)
				msgs = ((InternalEObject)newDefaultDetailsStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES, null, msgs);
			msgs = basicSetDefaultDetailsStyles(newDefaultDetailsStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES, newDefaultDetailsStyles, newDefaultDetailsStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormUnitStyles getDefaultFormStyles() {
		return defaultFormStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultFormStyles(FormUnitStyles newDefaultFormStyles, NotificationChain msgs) {
		FormUnitStyles oldDefaultFormStyles = defaultFormStyles;
		defaultFormStyles = newDefaultFormStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES, oldDefaultFormStyles, newDefaultFormStyles);
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
	public void setDefaultFormStyles(FormUnitStyles newDefaultFormStyles) {
		if (newDefaultFormStyles != defaultFormStyles) {
			NotificationChain msgs = null;
			if (defaultFormStyles != null)
				msgs = ((InternalEObject)defaultFormStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES, null, msgs);
			if (newDefaultFormStyles != null)
				msgs = ((InternalEObject)newDefaultFormStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES, null, msgs);
			msgs = basicSetDefaultFormStyles(newDefaultFormStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES, newDefaultFormStyles, newDefaultFormStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GalleryUnitStyles getDefaultGalleryStyles() {
		return defaultGalleryStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultGalleryStyles(GalleryUnitStyles newDefaultGalleryStyles, NotificationChain msgs) {
		GalleryUnitStyles oldDefaultGalleryStyles = defaultGalleryStyles;
		defaultGalleryStyles = newDefaultGalleryStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES, oldDefaultGalleryStyles, newDefaultGalleryStyles);
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
	public void setDefaultGalleryStyles(GalleryUnitStyles newDefaultGalleryStyles) {
		if (newDefaultGalleryStyles != defaultGalleryStyles) {
			NotificationChain msgs = null;
			if (defaultGalleryStyles != null)
				msgs = ((InternalEObject)defaultGalleryStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES, null, msgs);
			if (newDefaultGalleryStyles != null)
				msgs = ((InternalEObject)newDefaultGalleryStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES, null, msgs);
			msgs = basicSetDefaultGalleryStyles(newDefaultGalleryStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES, newDefaultGalleryStyles, newDefaultGalleryStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SliderUnitStyles getDefaultSliderStyles() {
		return defaultSliderStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultSliderStyles(SliderUnitStyles newDefaultSliderStyles, NotificationChain msgs) {
		SliderUnitStyles oldDefaultSliderStyles = defaultSliderStyles;
		defaultSliderStyles = newDefaultSliderStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES, oldDefaultSliderStyles, newDefaultSliderStyles);
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
	public void setDefaultSliderStyles(SliderUnitStyles newDefaultSliderStyles) {
		if (newDefaultSliderStyles != defaultSliderStyles) {
			NotificationChain msgs = null;
			if (defaultSliderStyles != null)
				msgs = ((InternalEObject)defaultSliderStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES, null, msgs);
			if (newDefaultSliderStyles != null)
				msgs = ((InternalEObject)newDefaultSliderStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES, null, msgs);
			msgs = basicSetDefaultSliderStyles(newDefaultSliderStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES, newDefaultSliderStyles, newDefaultSliderStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticUnitStyles getDefaultStaticStyles() {
		return defaultStaticStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultStaticStyles(StaticUnitStyles newDefaultStaticStyles, NotificationChain msgs) {
		StaticUnitStyles oldDefaultStaticStyles = defaultStaticStyles;
		defaultStaticStyles = newDefaultStaticStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES, oldDefaultStaticStyles, newDefaultStaticStyles);
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
	public void setDefaultStaticStyles(StaticUnitStyles newDefaultStaticStyles) {
		if (newDefaultStaticStyles != defaultStaticStyles) {
			NotificationChain msgs = null;
			if (defaultStaticStyles != null)
				msgs = ((InternalEObject)defaultStaticStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES, null, msgs);
			if (newDefaultStaticStyles != null)
				msgs = ((InternalEObject)newDefaultStaticStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES, null, msgs);
			msgs = basicSetDefaultStaticStyles(newDefaultStaticStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES, newDefaultStaticStyles, newDefaultStaticStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TabularUnitStyles getDefaultTabularStyles() {
		return defaultTabularStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultTabularStyles(TabularUnitStyles newDefaultTabularStyles, NotificationChain msgs) {
		TabularUnitStyles oldDefaultTabularStyles = defaultTabularStyles;
		defaultTabularStyles = newDefaultTabularStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES, oldDefaultTabularStyles, newDefaultTabularStyles);
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
	public void setDefaultTabularStyles(TabularUnitStyles newDefaultTabularStyles) {
		if (newDefaultTabularStyles != defaultTabularStyles) {
			NotificationChain msgs = null;
			if (defaultTabularStyles != null)
				msgs = ((InternalEObject)defaultTabularStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES, null, msgs);
			if (newDefaultTabularStyles != null)
				msgs = ((InternalEObject)newDefaultTabularStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES, null, msgs);
			msgs = basicSetDefaultTabularStyles(newDefaultTabularStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES, newDefaultTabularStyles, newDefaultTabularStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCancelLabel() {
		return defaultCancelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCancelLabel(String newDefaultCancelLabel) {
		String oldDefaultCancelLabel = defaultCancelLabel;
		defaultCancelLabel = newDefaultCancelLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL, oldDefaultCancelLabel, defaultCancelLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultMaximumUploadSize() {
		return defaultMaximumUploadSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultMaximumUploadSize(String newDefaultMaximumUploadSize) {
		String oldDefaultMaximumUploadSize = defaultMaximumUploadSize;
		defaultMaximumUploadSize = newDefaultMaximumUploadSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE, oldDefaultMaximumUploadSize, defaultMaximumUploadSize));
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
			case WebuiPackage.WEB_UI__NAVIGATION:
				if (navigation != null)
					msgs = ((InternalEObject)navigation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.WEB_UI__NAVIGATION, null, msgs);
				return basicSetNavigation((Navigation)otherEnd, msgs);
			case WebuiPackage.WEB_UI__CONTROLLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControllers()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.WEB_UI__NAVIGATION:
				return basicSetNavigation(null, msgs);
			case WebuiPackage.WEB_UI__CONTROLLERS:
				return ((InternalEList<?>)getControllers()).basicRemove(otherEnd, msgs);
			case WebuiPackage.WEB_UI__DEFAULT_STYLES:
				return basicSetDefaultStyles(null, msgs);
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES:
				return basicSetDefaultCardsStyles(null, msgs);
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES:
				return basicSetDefaultDetailsStyles(null, msgs);
			case WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES:
				return basicSetDefaultFormStyles(null, msgs);
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES:
				return basicSetDefaultGalleryStyles(null, msgs);
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES:
				return basicSetDefaultSliderStyles(null, msgs);
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES:
				return basicSetDefaultStaticStyles(null, msgs);
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES:
				return basicSetDefaultTabularStyles(null, msgs);
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
			case WebuiPackage.WEB_UI__PERSISTENCE:
				if (resolve) return getPersistence();
				return basicGetPersistence();
			case WebuiPackage.WEB_UI__NAVIGATION:
				return getNavigation();
			case WebuiPackage.WEB_UI__SERVICES:
				if (resolve) return getServices();
				return basicGetServices();
			case WebuiPackage.WEB_UI__CONTROLLERS:
				return getControllers();
			case WebuiPackage.WEB_UI__USE_FORM_FLOATING_LABELS:
				return isUseFormFloatingLabels();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return getDefaultDateFormat();
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return getDefaultTimeFormat();
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return getDefaultDateTimeFormat();
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
				return getDefaultCancelLabel();
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
				return getDefaultSaveLabel();
			case WebuiPackage.WEB_UI__DEFAULT_PAGE_STYLE_CLASS:
				return getDefaultPageStyleClass();
			case WebuiPackage.WEB_UI__DEFAULT_STYLES:
				return getDefaultStyles();
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES:
				return getDefaultCardsStyles();
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES:
				return getDefaultDetailsStyles();
			case WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES:
				return getDefaultFormStyles();
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES:
				return getDefaultGalleryStyles();
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES:
				return getDefaultSliderStyles();
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES:
				return getDefaultStaticStyles();
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES:
				return getDefaultTabularStyles();
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return getDefaultMaximumUploadSize();
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
			case WebuiPackage.WEB_UI__PERSISTENCE:
				setPersistence((Persistence)newValue);
				return;
			case WebuiPackage.WEB_UI__NAVIGATION:
				setNavigation((Navigation)newValue);
				return;
			case WebuiPackage.WEB_UI__SERVICES:
				setServices((Services)newValue);
				return;
			case WebuiPackage.WEB_UI__CONTROLLERS:
				getControllers().clear();
				getControllers().addAll((Collection<? extends Controller>)newValue);
				return;
			case WebuiPackage.WEB_UI__USE_FORM_FLOATING_LABELS:
				setUseFormFloatingLabels((Boolean)newValue);
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
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
				setDefaultCancelLabel((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
				setDefaultSaveLabel((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_PAGE_STYLE_CLASS:
				setDefaultPageStyleClass((String)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STYLES:
				setDefaultStyles((DefaultUnitStyles)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES:
				setDefaultCardsStyles((CardsUnitStyles)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES:
				setDefaultDetailsStyles((DetailsUnitStyles)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES:
				setDefaultFormStyles((FormUnitStyles)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES:
				setDefaultGalleryStyles((GalleryUnitStyles)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES:
				setDefaultSliderStyles((SliderUnitStyles)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES:
				setDefaultStaticStyles((StaticUnitStyles)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES:
				setDefaultTabularStyles((TabularUnitStyles)newValue);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize((String)newValue);
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
			case WebuiPackage.WEB_UI__PERSISTENCE:
				setPersistence((Persistence)null);
				return;
			case WebuiPackage.WEB_UI__NAVIGATION:
				setNavigation((Navigation)null);
				return;
			case WebuiPackage.WEB_UI__SERVICES:
				setServices((Services)null);
				return;
			case WebuiPackage.WEB_UI__CONTROLLERS:
				getControllers().clear();
				return;
			case WebuiPackage.WEB_UI__USE_FORM_FLOATING_LABELS:
				setUseFormFloatingLabels(USE_FORM_FLOATING_LABELS_EDEFAULT);
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
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
				setDefaultCancelLabel(DEFAULT_CANCEL_LABEL_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
				setDefaultSaveLabel(DEFAULT_SAVE_LABEL_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_PAGE_STYLE_CLASS:
				setDefaultPageStyleClass(DEFAULT_PAGE_STYLE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STYLES:
				setDefaultStyles((DefaultUnitStyles)null);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES:
				setDefaultCardsStyles((CardsUnitStyles)null);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES:
				setDefaultDetailsStyles((DetailsUnitStyles)null);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES:
				setDefaultFormStyles((FormUnitStyles)null);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES:
				setDefaultGalleryStyles((GalleryUnitStyles)null);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES:
				setDefaultSliderStyles((SliderUnitStyles)null);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES:
				setDefaultStaticStyles((StaticUnitStyles)null);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES:
				setDefaultTabularStyles((TabularUnitStyles)null);
				return;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				setDefaultMaximumUploadSize(DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT);
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
			case WebuiPackage.WEB_UI__PERSISTENCE:
				return persistence != null;
			case WebuiPackage.WEB_UI__NAVIGATION:
				return navigation != null;
			case WebuiPackage.WEB_UI__SERVICES:
				return services != null;
			case WebuiPackage.WEB_UI__CONTROLLERS:
				return controllers != null && !controllers.isEmpty();
			case WebuiPackage.WEB_UI__USE_FORM_FLOATING_LABELS:
				return useFormFloatingLabels != USE_FORM_FLOATING_LABELS_EDEFAULT;
			case WebuiPackage.WEB_UI__DEFAULT_DATE_FORMAT:
				return DEFAULT_DATE_FORMAT_EDEFAULT == null ? defaultDateFormat != null : !DEFAULT_DATE_FORMAT_EDEFAULT.equals(defaultDateFormat);
			case WebuiPackage.WEB_UI__DEFAULT_TIME_FORMAT:
				return DEFAULT_TIME_FORMAT_EDEFAULT == null ? defaultTimeFormat != null : !DEFAULT_TIME_FORMAT_EDEFAULT.equals(defaultTimeFormat);
			case WebuiPackage.WEB_UI__DEFAULT_DATE_TIME_FORMAT:
				return DEFAULT_DATE_TIME_FORMAT_EDEFAULT == null ? defaultDateTimeFormat != null : !DEFAULT_DATE_TIME_FORMAT_EDEFAULT.equals(defaultDateTimeFormat);
			case WebuiPackage.WEB_UI__DEFAULT_CANCEL_LABEL:
				return DEFAULT_CANCEL_LABEL_EDEFAULT == null ? defaultCancelLabel != null : !DEFAULT_CANCEL_LABEL_EDEFAULT.equals(defaultCancelLabel);
			case WebuiPackage.WEB_UI__DEFAULT_SAVE_LABEL:
				return DEFAULT_SAVE_LABEL_EDEFAULT == null ? defaultSaveLabel != null : !DEFAULT_SAVE_LABEL_EDEFAULT.equals(defaultSaveLabel);
			case WebuiPackage.WEB_UI__DEFAULT_PAGE_STYLE_CLASS:
				return DEFAULT_PAGE_STYLE_CLASS_EDEFAULT == null ? defaultPageStyleClass != null : !DEFAULT_PAGE_STYLE_CLASS_EDEFAULT.equals(defaultPageStyleClass);
			case WebuiPackage.WEB_UI__DEFAULT_STYLES:
				return defaultStyles != null;
			case WebuiPackage.WEB_UI__DEFAULT_CARDS_STYLES:
				return defaultCardsStyles != null;
			case WebuiPackage.WEB_UI__DEFAULT_DETAILS_STYLES:
				return defaultDetailsStyles != null;
			case WebuiPackage.WEB_UI__DEFAULT_FORM_STYLES:
				return defaultFormStyles != null;
			case WebuiPackage.WEB_UI__DEFAULT_GALLERY_STYLES:
				return defaultGalleryStyles != null;
			case WebuiPackage.WEB_UI__DEFAULT_SLIDER_STYLES:
				return defaultSliderStyles != null;
			case WebuiPackage.WEB_UI__DEFAULT_STATIC_STYLES:
				return defaultStaticStyles != null;
			case WebuiPackage.WEB_UI__DEFAULT_TABULAR_STYLES:
				return defaultTabularStyles != null;
			case WebuiPackage.WEB_UI__DEFAULT_MAXIMUM_UPLOAD_SIZE:
				return DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT == null ? defaultMaximumUploadSize != null : !DEFAULT_MAXIMUM_UPLOAD_SIZE_EDEFAULT.equals(defaultMaximumUploadSize);
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
		result.append(" (useFormFloatingLabels: ");
		result.append(useFormFloatingLabels);
		result.append(", defaultDateFormat: ");
		result.append(defaultDateFormat);
		result.append(", defaultTimeFormat: ");
		result.append(defaultTimeFormat);
		result.append(", defaultDateTimeFormat: ");
		result.append(defaultDateTimeFormat);
		result.append(", defaultCancelLabel: ");
		result.append(defaultCancelLabel);
		result.append(", defaultSaveLabel: ");
		result.append(defaultSaveLabel);
		result.append(", defaultPageStyleClass: ");
		result.append(defaultPageStyleClass);
		result.append(", defaultMaximumUploadSize: ");
		result.append(defaultMaximumUploadSize);
		result.append(')');
		return result.toString();
	}

} //WebUIImpl
