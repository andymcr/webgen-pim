/**
 */
package work.andycarpenter.webgen.pims.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import work.andycarpenter.webgen.pims.image.ImageManipulation;

import work.andycarpenter.webgen.pims.website.FrameworkTechnologies;
import work.andycarpenter.webgen.pims.website.WebsitePackage;
import work.andycarpenter.webgen.pims.website.WebsiteProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getLogoImage <em>Logo Image</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getLogoFilters <em>Logo Filters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#isUseDbSessionStorage <em>Use Db Session Storage</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getTextEditorURL <em>Text Editor URL</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getSecurityFromEmail <em>Security From Email</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#getSecurityFromName <em>Security From Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.impl.WebsitePropertiesImpl#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebsitePropertiesImpl extends EObjectImpl implements WebsiteProperties {
	/**
	 * The default value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected String siteName = SITE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteTitle() <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteTitle() <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTitle()
	 * @generated
	 * @ordered
	 */
	protected String siteTitle = SITE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = "en";

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebmasterEmail() <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebmasterEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBMASTER_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebmasterEmail() <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebmasterEmail()
	 * @generated
	 * @ordered
	 */
	protected String webmasterEmail = WEBMASTER_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected String copyrightText = COPYRIGHT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaDescription() <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String META_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaDescription() <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDescription()
	 * @generated
	 * @ordered
	 */
	protected String metaDescription = META_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoImage() <em>Logo Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoImage()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogoImage() <em>Logo Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoImage()
	 * @generated
	 * @ordered
	 */
	protected String logoImage = LOGO_IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogoFilters() <em>Logo Filters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoFilters()
	 * @generated
	 * @ordered
	 */
	protected ImageManipulation logoFilters;

	/**
	 * The default value of the '{@link #getFrameworkTechnology() <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final FrameworkTechnologies FRAMEWORK_TECHNOLOGY_EDEFAULT = FrameworkTechnologies.KOHANA;

	/**
	 * The cached value of the '{@link #getFrameworkTechnology() <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkTechnology()
	 * @generated
	 * @ordered
	 */
	protected FrameworkTechnologies frameworkTechnology = FRAMEWORK_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseDbSessionStorage() <em>Use Db Session Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDbSessionStorage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DB_SESSION_STORAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseDbSessionStorage() <em>Use Db Session Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDbSessionStorage()
	 * @generated
	 * @ordered
	 */
	protected boolean useDbSessionStorage = USE_DB_SESSION_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextEditorURL() <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEditorURL()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDITOR_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextEditorURL() <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEditorURL()
	 * @generated
	 * @ordered
	 */
	protected String textEditorURL = TEXT_EDITOR_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteTemplate() <em>Site Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteTemplate() <em>Site Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTemplate()
	 * @generated
	 * @ordered
	 */
	protected String siteTemplate = SITE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityFromEmail() <em>Security From Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityFromEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_FROM_EMAIL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSecurityFromEmail() <em>Security From Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityFromEmail()
	 * @generated
	 * @ordered
	 */
	protected String securityFromEmail = SECURITY_FROM_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityFromName() <em>Security From Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityFromName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_FROM_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSecurityFromName() <em>Security From Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityFromName()
	 * @generated
	 * @ordered
	 */
	protected String securityFromName = SECURITY_FROM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isStaticUnitsEditable() <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticUnitsEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_UNITS_EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStaticUnitsEditable() <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticUnitsEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean staticUnitsEditable = STATIC_UNITS_EDITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsitePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEBSITE_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteName() {
		return siteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteName(String newSiteName) {
		String oldSiteName = siteName;
		siteName = newSiteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__SITE_NAME, oldSiteName, siteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteTitle() {
		return siteTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteTitle(String newSiteTitle) {
		String oldSiteTitle = siteTitle;
		siteTitle = newSiteTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE, oldSiteTitle, siteTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebmasterEmail() {
		return webmasterEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebmasterEmail(String newWebmasterEmail) {
		String oldWebmasterEmail = webmasterEmail;
		webmasterEmail = newWebmasterEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL, oldWebmasterEmail, webmasterEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCopyrightText() {
		return copyrightText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyrightText(String newCopyrightText) {
		String oldCopyrightText = copyrightText;
		copyrightText = newCopyrightText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT, oldCopyrightText, copyrightText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetaDescription() {
		return metaDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaDescription(String newMetaDescription) {
		String oldMetaDescription = metaDescription;
		metaDescription = newMetaDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION, oldMetaDescription, metaDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogoImage() {
		return logoImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoImage(String newLogoImage) {
		String oldLogoImage = logoImage;
		logoImage = newLogoImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__LOGO_IMAGE, oldLogoImage, logoImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageManipulation getLogoFilters() {
		if (logoFilters != null && logoFilters.eIsProxy()) {
			InternalEObject oldLogoFilters = (InternalEObject)logoFilters;
			logoFilters = (ImageManipulation)eResolveProxy(oldLogoFilters);
			if (logoFilters != oldLogoFilters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.WEBSITE_PROPERTIES__LOGO_FILTERS, oldLogoFilters, logoFilters));
			}
		}
		return logoFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation basicGetLogoFilters() {
		return logoFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoFilters(ImageManipulation newLogoFilters) {
		ImageManipulation oldLogoFilters = logoFilters;
		logoFilters = newLogoFilters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__LOGO_FILTERS, oldLogoFilters, logoFilters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameworkTechnologies getFrameworkTechnology() {
		return frameworkTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrameworkTechnology(FrameworkTechnologies newFrameworkTechnology) {
		FrameworkTechnologies oldFrameworkTechnology = frameworkTechnology;
		frameworkTechnology = newFrameworkTechnology == null ? FRAMEWORK_TECHNOLOGY_EDEFAULT : newFrameworkTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY, oldFrameworkTechnology, frameworkTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseDbSessionStorage() {
		return useDbSessionStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseDbSessionStorage(boolean newUseDbSessionStorage) {
		boolean oldUseDbSessionStorage = useDbSessionStorage;
		useDbSessionStorage = newUseDbSessionStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__USE_DB_SESSION_STORAGE, oldUseDbSessionStorage, useDbSessionStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextEditorURL() {
		return textEditorURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextEditorURL(String newTextEditorURL) {
		String oldTextEditorURL = textEditorURL;
		textEditorURL = newTextEditorURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL, oldTextEditorURL, textEditorURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteTemplate() {
		return siteTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteTemplate(String newSiteTemplate) {
		String oldSiteTemplate = siteTemplate;
		siteTemplate = newSiteTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE, oldSiteTemplate, siteTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityFromEmail() {
		return securityFromEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityFromEmail(String newSecurityFromEmail) {
		String oldSecurityFromEmail = securityFromEmail;
		securityFromEmail = newSecurityFromEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_EMAIL, oldSecurityFromEmail, securityFromEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityFromName() {
		return securityFromName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityFromName(String newSecurityFromName) {
		String oldSecurityFromName = securityFromName;
		securityFromName = newSecurityFromName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_NAME, oldSecurityFromName, securityFromName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStaticUnitsEditable() {
		return staticUnitsEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaticUnitsEditable(boolean newStaticUnitsEditable) {
		boolean oldStaticUnitsEditable = staticUnitsEditable;
		staticUnitsEditable = newStaticUnitsEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE, oldStaticUnitsEditable, staticUnitsEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_NAME:
				return getSiteName();
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
				return getSiteTitle();
			case WebsitePackage.WEBSITE_PROPERTIES__LOCALE:
				return getLocale();
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
				return getWebmasterEmail();
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
				return getCopyrightText();
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
				return getMetaDescription();
			case WebsitePackage.WEBSITE_PROPERTIES__LOGO_IMAGE:
				return getLogoImage();
			case WebsitePackage.WEBSITE_PROPERTIES__LOGO_FILTERS:
				if (resolve) return getLogoFilters();
				return basicGetLogoFilters();
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				return getFrameworkTechnology();
			case WebsitePackage.WEBSITE_PROPERTIES__USE_DB_SESSION_STORAGE:
				return isUseDbSessionStorage();
			case WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL:
				return getTextEditorURL();
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE:
				return getSiteTemplate();
			case WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_EMAIL:
				return getSecurityFromEmail();
			case WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_NAME:
				return getSecurityFromName();
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
				return isStaticUnitsEditable();
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
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_NAME:
				setSiteName((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
				setSiteTitle((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__LOCALE:
				setLocale((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
				setWebmasterEmail((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
				setCopyrightText((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
				setMetaDescription((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__LOGO_IMAGE:
				setLogoImage((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__LOGO_FILTERS:
				setLogoFilters((ImageManipulation)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology((FrameworkTechnologies)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__USE_DB_SESSION_STORAGE:
				setUseDbSessionStorage((Boolean)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL:
				setTextEditorURL((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE:
				setSiteTemplate((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_EMAIL:
				setSecurityFromEmail((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_NAME:
				setSecurityFromName((String)newValue);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable((Boolean)newValue);
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
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_NAME:
				setSiteName(SITE_NAME_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
				setSiteTitle(SITE_TITLE_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__LOCALE:
				setLocale(LOCALE_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
				setWebmasterEmail(WEBMASTER_EMAIL_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
				setMetaDescription(META_DESCRIPTION_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__LOGO_IMAGE:
				setLogoImage(LOGO_IMAGE_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__LOGO_FILTERS:
				setLogoFilters((ImageManipulation)null);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology(FRAMEWORK_TECHNOLOGY_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__USE_DB_SESSION_STORAGE:
				setUseDbSessionStorage(USE_DB_SESSION_STORAGE_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL:
				setTextEditorURL(TEXT_EDITOR_URL_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE:
				setSiteTemplate(SITE_TEMPLATE_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_EMAIL:
				setSecurityFromEmail(SECURITY_FROM_EMAIL_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_NAME:
				setSecurityFromName(SECURITY_FROM_NAME_EDEFAULT);
				return;
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable(STATIC_UNITS_EDITABLE_EDEFAULT);
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
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_NAME:
				return SITE_NAME_EDEFAULT == null ? siteName != null : !SITE_NAME_EDEFAULT.equals(siteName);
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TITLE:
				return SITE_TITLE_EDEFAULT == null ? siteTitle != null : !SITE_TITLE_EDEFAULT.equals(siteTitle);
			case WebsitePackage.WEBSITE_PROPERTIES__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
			case WebsitePackage.WEBSITE_PROPERTIES__WEBMASTER_EMAIL:
				return WEBMASTER_EMAIL_EDEFAULT == null ? webmasterEmail != null : !WEBMASTER_EMAIL_EDEFAULT.equals(webmasterEmail);
			case WebsitePackage.WEBSITE_PROPERTIES__COPYRIGHT_TEXT:
				return COPYRIGHT_TEXT_EDEFAULT == null ? copyrightText != null : !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case WebsitePackage.WEBSITE_PROPERTIES__META_DESCRIPTION:
				return META_DESCRIPTION_EDEFAULT == null ? metaDescription != null : !META_DESCRIPTION_EDEFAULT.equals(metaDescription);
			case WebsitePackage.WEBSITE_PROPERTIES__LOGO_IMAGE:
				return LOGO_IMAGE_EDEFAULT == null ? logoImage != null : !LOGO_IMAGE_EDEFAULT.equals(logoImage);
			case WebsitePackage.WEBSITE_PROPERTIES__LOGO_FILTERS:
				return logoFilters != null;
			case WebsitePackage.WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
				return frameworkTechnology != FRAMEWORK_TECHNOLOGY_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__USE_DB_SESSION_STORAGE:
				return useDbSessionStorage != USE_DB_SESSION_STORAGE_EDEFAULT;
			case WebsitePackage.WEBSITE_PROPERTIES__TEXT_EDITOR_URL:
				return TEXT_EDITOR_URL_EDEFAULT == null ? textEditorURL != null : !TEXT_EDITOR_URL_EDEFAULT.equals(textEditorURL);
			case WebsitePackage.WEBSITE_PROPERTIES__SITE_TEMPLATE:
				return SITE_TEMPLATE_EDEFAULT == null ? siteTemplate != null : !SITE_TEMPLATE_EDEFAULT.equals(siteTemplate);
			case WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_EMAIL:
				return SECURITY_FROM_EMAIL_EDEFAULT == null ? securityFromEmail != null : !SECURITY_FROM_EMAIL_EDEFAULT.equals(securityFromEmail);
			case WebsitePackage.WEBSITE_PROPERTIES__SECURITY_FROM_NAME:
				return SECURITY_FROM_NAME_EDEFAULT == null ? securityFromName != null : !SECURITY_FROM_NAME_EDEFAULT.equals(securityFromName);
			case WebsitePackage.WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE:
				return staticUnitsEditable != STATIC_UNITS_EDITABLE_EDEFAULT;
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
		result.append(" (siteName: ");
		result.append(siteName);
		result.append(", siteTitle: ");
		result.append(siteTitle);
		result.append(", locale: ");
		result.append(locale);
		result.append(", webmasterEmail: ");
		result.append(webmasterEmail);
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(", metaDescription: ");
		result.append(metaDescription);
		result.append(", logoImage: ");
		result.append(logoImage);
		result.append(", frameworkTechnology: ");
		result.append(frameworkTechnology);
		result.append(", useDbSessionStorage: ");
		result.append(useDbSessionStorage);
		result.append(", textEditorURL: ");
		result.append(textEditorURL);
		result.append(", siteTemplate: ");
		result.append(siteTemplate);
		result.append(", securityFromEmail: ");
		result.append(securityFromEmail);
		result.append(", securityFromName: ");
		result.append(securityFromName);
		result.append(", staticUnitsEditable: ");
		result.append(staticUnitsEditable);
		result.append(')');
		return result.toString();
	}

} //WebsitePropertiesImpl
