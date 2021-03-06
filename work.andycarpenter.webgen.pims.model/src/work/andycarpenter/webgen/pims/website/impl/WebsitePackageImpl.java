/**
 */
package work.andycarpenter.webgen.pims.website.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import work.andycarpenter.webgen.pims.api.ApiPackage;

import work.andycarpenter.webgen.pims.base.BasePackage;

import work.andycarpenter.webgen.pims.expression.ExpressionPackage;

import work.andycarpenter.webgen.pims.image.ImagePackage;

import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

import work.andycarpenter.webgen.pims.security.SecurityPackage;

import work.andycarpenter.webgen.pims.service.ServicePackage;

import work.andycarpenter.webgen.pims.website.FrameworkTechnologies;
import work.andycarpenter.webgen.pims.website.WebGenModel;
import work.andycarpenter.webgen.pims.website.WebsiteFactory;
import work.andycarpenter.webgen.pims.website.WebsitePackage;
import work.andycarpenter.webgen.pims.website.WebsiteProperties;

import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsitePackageImpl extends EPackageImpl implements WebsitePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webGenModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass websitePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frameworkTechnologiesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebsitePackageImpl() {
		super(eNS_URI, WebsiteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WebsitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebsitePackage init() {
		if (isInited) return (WebsitePackage)EPackage.Registry.INSTANCE.getEPackage(WebsitePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWebsitePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WebsitePackageImpl theWebsitePackage = registeredWebsitePackage instanceof WebsitePackageImpl ? (WebsitePackageImpl)registeredWebsitePackage : new WebsitePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ApiPackage.eINSTANCE.eClass();
		BasePackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();
		ImagePackage.eINSTANCE.eClass();
		PersistencePackage.eINSTANCE.eClass();
		SecurityPackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();
		WebuiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebsitePackage.createPackageContents();

		// Initialize created meta-data
		theWebsitePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebsitePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebsitePackage.eNS_URI, theWebsitePackage);
		return theWebsitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebGenModel() {
		return webGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebGenModel_WebsiteProperties() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebGenModel_FrameworkTechnology() {
		return (EAttribute)webGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebGenModel_CopyrightText() {
		return (EAttribute)webGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebGenModel_Persistence() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebGenModel_Services() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebGenModel_Images() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebGenModel_WebUI() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebGenModel_Api() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebGenModel_Security() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebsiteProperties() {
		return websitePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_SiteName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_SiteTitle() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_Locale() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_WebmasterEmail() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_CopyrightText() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_MetaDescription() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_LogoImage() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebsiteProperties_LogoFilters() {
		return (EReference)websitePropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_FrameworkTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_UseDbSessionStorage() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_TextEditorURL() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_SiteTemplate() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_SecurityFromEmail() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_SecurityFromName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebsiteProperties_StaticUnitsEditable() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFrameworkTechnologies() {
		return frameworkTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebsiteFactory getWebsiteFactory() {
		return (WebsiteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		webGenModelEClass = createEClass(WEB_GEN_MODEL);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__WEBSITE_PROPERTIES);
		createEAttribute(webGenModelEClass, WEB_GEN_MODEL__FRAMEWORK_TECHNOLOGY);
		createEAttribute(webGenModelEClass, WEB_GEN_MODEL__COPYRIGHT_TEXT);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__PERSISTENCE);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__SERVICES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__IMAGES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__WEB_UI);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__API);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__SECURITY);

		websitePropertiesEClass = createEClass(WEBSITE_PROPERTIES);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SITE_NAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SITE_TITLE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__LOCALE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__WEBMASTER_EMAIL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__COPYRIGHT_TEXT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__META_DESCRIPTION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__LOGO_IMAGE);
		createEReference(websitePropertiesEClass, WEBSITE_PROPERTIES__LOGO_FILTERS);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__USE_DB_SESSION_STORAGE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TEXT_EDITOR_URL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SITE_TEMPLATE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SECURITY_FROM_EMAIL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SECURITY_FROM_NAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE);

		// Create enums
		frameworkTechnologiesEEnum = createEEnum(FRAMEWORK_TECHNOLOGIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PersistencePackage thePersistencePackage = (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ImagePackage theImagePackage = (ImagePackage)EPackage.Registry.INSTANCE.getEPackage(ImagePackage.eNS_URI);
		WebuiPackage theWebuiPackage = (WebuiPackage)EPackage.Registry.INSTANCE.getEPackage(WebuiPackage.eNS_URI);
		ApiPackage theApiPackage = (ApiPackage)EPackage.Registry.INSTANCE.getEPackage(ApiPackage.eNS_URI);
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(webGenModelEClass, WebGenModel.class, "WebGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebGenModel_WebsiteProperties(), this.getWebsiteProperties(), null, "websiteProperties", null, 1, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebGenModel_FrameworkTechnology(), this.getFrameworkTechnologies(), "frameworkTechnology", "Kohana", 1, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebGenModel_CopyrightText(), ecorePackage.getEString(), "copyrightText", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebGenModel_Persistence(), thePersistencePackage.getPersistence(), null, "persistence", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Services(), theServicePackage.getServices(), null, "services", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Images(), theImagePackage.getImage(), null, "images", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_WebUI(), theWebuiPackage.getWebUI(), null, "webUI", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Api(), theApiPackage.getAPI(), null, "api", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Security(), theSecurityPackage.getSecurity(), null, "security", null, 0, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(websitePropertiesEClass, WebsiteProperties.class, "WebsiteProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebsiteProperties_SiteName(), ecorePackage.getEString(), "siteName", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_SiteTitle(), ecorePackage.getEString(), "siteTitle", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_Locale(), ecorePackage.getEString(), "locale", "en", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_WebmasterEmail(), ecorePackage.getEString(), "webmasterEmail", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_CopyrightText(), ecorePackage.getEString(), "copyrightText", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_MetaDescription(), ecorePackage.getEString(), "metaDescription", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_LogoImage(), ecorePackage.getEString(), "logoImage", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsiteProperties_LogoFilters(), theImagePackage.getImageManipulation(), null, "logoFilters", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_FrameworkTechnology(), this.getFrameworkTechnologies(), "frameworkTechnology", "Kohana", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_UseDbSessionStorage(), ecorePackage.getEBoolean(), "useDbSessionStorage", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TextEditorURL(), ecorePackage.getEString(), "textEditorURL", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_SiteTemplate(), ecorePackage.getEString(), "siteTemplate", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_SecurityFromEmail(), ecorePackage.getEString(), "securityFromEmail", "", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_SecurityFromName(), ecorePackage.getEString(), "securityFromName", "", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_StaticUnitsEditable(), ecorePackage.getEBoolean(), "staticUnitsEditable", "false", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(frameworkTechnologiesEEnum, FrameworkTechnologies.class, "FrameworkTechnologies");
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.JSF);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.CAKE_PHP);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.CODE_IGNITER);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.KOHANA);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.LARAVEL);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.SYMFONY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //WebsitePackageImpl
