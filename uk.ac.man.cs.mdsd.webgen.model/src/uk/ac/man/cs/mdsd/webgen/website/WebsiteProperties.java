/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsiteProperties.java,v 1.19 2014/01/06 14:30:33 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies;
import uk.ac.man.cs.mdsd.webgen.webui.Menu;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isDevelopmentVersion <em>Development Version</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isRewriteURLs <em>Rewrite UR Ls</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTestProjectName <em>Test Project Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTextEditorURL <em>Text Editor URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isResponsiveTopMenu <em>Responsive Top Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties()
 * @model
 * @generated
 */
public interface WebsiteProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Site Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Title</em>' attribute.
	 * @see #setSiteTitle(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_SiteTitle()
	 * @model required="true"
	 * @generated
	 */
	String getSiteTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTitle <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Title</em>' attribute.
	 * @see #getSiteTitle()
	 * @generated
	 */
	void setSiteTitle(String value);

	/**
	 * Returns the value of the '<em><b>Development Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Version</em>' attribute.
	 * @see #setDevelopmentVersion(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DevelopmentVersion()
	 * @model
	 * @generated
	 */
	boolean isDevelopmentVersion();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isDevelopmentVersion <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Version</em>' attribute.
	 * @see #isDevelopmentVersion()
	 * @generated
	 */
	void setDevelopmentVersion(boolean value);

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_BaseURL()
	 * @model
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Rewrite UR Ls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite UR Ls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #setRewriteURLs(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_RewriteURLs()
	 * @model
	 * @generated
	 */
	boolean isRewriteURLs();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isRewriteURLs <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #isRewriteURLs()
	 * @generated
	 */
	void setRewriteURLs(boolean value);

	/**
	 * Returns the value of the '<em><b>Webmaster Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webmaster Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webmaster Email</em>' attribute.
	 * @see #setWebmasterEmail(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_WebmasterEmail()
	 * @model required="true"
	 * @generated
	 */
	String getWebmasterEmail();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getWebmasterEmail <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webmaster Email</em>' attribute.
	 * @see #getWebmasterEmail()
	 * @generated
	 */
	void setWebmasterEmail(String value);

	/**
	 * Returns the value of the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Text</em>' attribute.
	 * @see #setCopyrightText(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_CopyrightText()
	 * @model ordered="false"
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	void setCopyrightText(String value);

	/**
	 * Returns the value of the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Description</em>' attribute.
	 * @see #setMetaDescription(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_MetaDescription()
	 * @model ordered="false"
	 * @generated
	 */
	String getMetaDescription();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getMetaDescription <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Description</em>' attribute.
	 * @see #getMetaDescription()
	 * @generated
	 */
	void setMetaDescription(String value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_ProjectName()
	 * @model required="true"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Test Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Project Name</em>' attribute.
	 * @see #setTestProjectName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_TestProjectName()
	 * @model
	 * @generated
	 */
	String getTestProjectName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTestProjectName <em>Test Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Project Name</em>' attribute.
	 * @see #getTestProjectName()
	 * @generated
	 */
	void setTestProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Default Maximum Upload Size</b></em>' attribute.
	 * The default value is <code>"2000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Maximum Upload Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Maximum Upload Size</em>' attribute.
	 * @see #setDefaultMaximumUploadSize(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_DefaultMaximumUploadSize()
	 * @model default="2000000" ordered="false"
	 * @generated
	 */
	int getDefaultMaximumUploadSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Maximum Upload Size</em>' attribute.
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 */
	void setDefaultMaximumUploadSize(int value);

	/**
	 * Returns the value of the '<em><b>Framework Technology</b></em>' attribute.
	 * The default value is <code>"Kohana"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies
	 * @see #setFrameworkTechnology(FrameworkTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_FrameworkTechnology()
	 * @model default="Kohana" required="true" ordered="false"
	 * @generated
	 */
	FrameworkTechnologies getFrameworkTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getFrameworkTechnology <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies
	 * @see #getFrameworkTechnology()
	 * @generated
	 */
	void setFrameworkTechnology(FrameworkTechnologies value);

	/**
	 * Returns the value of the '<em><b>Input Technology</b></em>' attribute.
	 * The default value is <code>"Html"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies
	 * @see #setInputTechnology(InputTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_InputTechnology()
	 * @model default="Html"
	 * @generated
	 */
	InputTechnologies getInputTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getInputTechnology <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.InputTechnologies
	 * @see #getInputTechnology()
	 * @generated
	 */
	void setInputTechnology(InputTechnologies value);

	/**
	 * Returns the value of the '<em><b>Ajax Technology</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies
	 * @see #setAjaxTechnology(AjaxTechnologies)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_AjaxTechnology()
	 * @model default="None"
	 * @generated
	 */
	AjaxTechnologies getAjaxTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getAjaxTechnology <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.AjaxTechnologies
	 * @see #getAjaxTechnology()
	 * @generated
	 */
	void setAjaxTechnology(AjaxTechnologies value);

	/**
	 * Returns the value of the '<em><b>Captcha Site Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captcha Site Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha Site Key</em>' attribute.
	 * @see #setCaptchaSiteKey(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_CaptchaSiteKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getCaptchaSiteKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCaptchaSiteKey <em>Captcha Site Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Site Key</em>' attribute.
	 * @see #getCaptchaSiteKey()
	 * @generated
	 */
	void setCaptchaSiteKey(String value);

	/**
	 * Returns the value of the '<em><b>Captcha Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captcha Secret Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #setCaptchaSecretKey(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_CaptchaSecretKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getCaptchaSecretKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getCaptchaSecretKey <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #getCaptchaSecretKey()
	 * @generated
	 */
	void setCaptchaSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Text Editor URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Editor URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Editor URL</em>' attribute.
	 * @see #setTextEditorURL(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_TextEditorURL()
	 * @model
	 * @generated
	 */
	String getTextEditorURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTextEditorURL <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Editor URL</em>' attribute.
	 * @see #getTextEditorURL()
	 * @generated
	 */
	void setTextEditorURL(String value);

	/**
	 * Returns the value of the '<em><b>Responsive Top Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsive Top Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsive Top Menu</em>' attribute.
	 * @see #setResponsiveTopMenu(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_ResponsiveTopMenu()
	 * @model
	 * @generated
	 */
	boolean isResponsiveTopMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isResponsiveTopMenu <em>Responsive Top Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsive Top Menu</em>' attribute.
	 * @see #isResponsiveTopMenu()
	 * @generated
	 */
	void setResponsiveTopMenu(boolean value);

	/**
	 * Returns the value of the '<em><b>Top Navigation Id</b></em>' attribute.
	 * The default value is <code>"topnav"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Navigation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Navigation Id</em>' attribute.
	 * @see #setTopNavigationId(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_TopNavigationId()
	 * @model default="topnav" required="true" ordered="false"
	 * @generated
	 */
	String getTopNavigationId();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getTopNavigationId <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Navigation Id</em>' attribute.
	 * @see #getTopNavigationId()
	 * @generated
	 */
	void setTopNavigationId(String value);

	/**
	 * Returns the value of the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Menu</em>' reference.
	 * @see #setSideMenu(Menu)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_SideMenu()
	 * @model ordered="false"
	 * @generated
	 */
	Menu getSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSideMenu <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Menu</em>' reference.
	 * @see #getSideMenu()
	 * @generated
	 */
	void setSideMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Site Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Template</em>' attribute.
	 * @see #setSiteTemplate(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_SiteTemplate()
	 * @model
	 * @generated
	 */
	String getSiteTemplate();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getSiteTemplate <em>Site Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Template</em>' attribute.
	 * @see #getSiteTemplate()
	 * @generated
	 */
	void setSiteTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Static Units Editable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Units Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Units Editable</em>' attribute.
	 * @see #setStaticUnitsEditable(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getWebsiteProperties_StaticUnitsEditable()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isStaticUnitsEditable();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#isStaticUnitsEditable <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Units Editable</em>' attribute.
	 * @see #isStaticUnitsEditable()
	 * @generated
	 */
	void setStaticUnitsEditable(boolean value);

} // WebsiteProperties
