/**
 */
package work.andycarpenter.webgen.pims.website;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.webgen.pims.image.ImageManipulation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getLogoImage <em>Logo Image</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getLogoFilters <em>Logo Filters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#isUseDbSessionStorage <em>Use Db Session Storage</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getTextEditorURL <em>Text Editor URL</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getSiteTemplate <em>Site Template</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties()
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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_SiteTitle()
	 * @model required="true"
	 * @generated
	 */
	String getSiteTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getSiteTitle <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Title</em>' attribute.
	 * @see #getSiteTitle()
	 * @generated
	 */
	void setSiteTitle(String value);

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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_WebmasterEmail()
	 * @model required="true"
	 * @generated
	 */
	String getWebmasterEmail();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getWebmasterEmail <em>Webmaster Email</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_CopyrightText()
	 * @model ordered="false"
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getCopyrightText <em>Copyright Text</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_MetaDescription()
	 * @model ordered="false"
	 * @generated
	 */
	String getMetaDescription();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getMetaDescription <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Description</em>' attribute.
	 * @see #getMetaDescription()
	 * @generated
	 */
	void setMetaDescription(String value);

	/**
	 * Returns the value of the '<em><b>Logo Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logo Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo Image</em>' attribute.
	 * @see #setLogoImage(String)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_LogoImage()
	 * @model
	 * @generated
	 */
	String getLogoImage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getLogoImage <em>Logo Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo Image</em>' attribute.
	 * @see #getLogoImage()
	 * @generated
	 */
	void setLogoImage(String value);

	/**
	 * Returns the value of the '<em><b>Logo Filters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logo Filters</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo Filters</em>' reference.
	 * @see #setLogoFilters(ImageManipulation)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_LogoFilters()
	 * @model
	 * @generated
	 */
	ImageManipulation getLogoFilters();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getLogoFilters <em>Logo Filters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo Filters</em>' reference.
	 * @see #getLogoFilters()
	 * @generated
	 */
	void setLogoFilters(ImageManipulation value);

	/**
	 * Returns the value of the '<em><b>Framework Technology</b></em>' attribute.
	 * The default value is <code>"Kohana"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.website.FrameworkTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Technology</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.website.FrameworkTechnologies
	 * @see #setFrameworkTechnology(FrameworkTechnologies)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_FrameworkTechnology()
	 * @model default="Kohana" required="true" ordered="false"
	 * @generated
	 */
	FrameworkTechnologies getFrameworkTechnology();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getFrameworkTechnology <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Technology</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.website.FrameworkTechnologies
	 * @see #getFrameworkTechnology()
	 * @generated
	 */
	void setFrameworkTechnology(FrameworkTechnologies value);

	/**
	 * Returns the value of the '<em><b>Use Db Session Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Db Session Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Db Session Storage</em>' attribute.
	 * @see #setUseDbSessionStorage(boolean)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_UseDbSessionStorage()
	 * @model
	 * @generated
	 */
	boolean isUseDbSessionStorage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#isUseDbSessionStorage <em>Use Db Session Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Db Session Storage</em>' attribute.
	 * @see #isUseDbSessionStorage()
	 * @generated
	 */
	void setUseDbSessionStorage(boolean value);

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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_TextEditorURL()
	 * @model
	 * @generated
	 */
	String getTextEditorURL();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getTextEditorURL <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Editor URL</em>' attribute.
	 * @see #getTextEditorURL()
	 * @generated
	 */
	void setTextEditorURL(String value);

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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_SiteTemplate()
	 * @model
	 * @generated
	 */
	String getSiteTemplate();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#getSiteTemplate <em>Site Template</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebsiteProperties_StaticUnitsEditable()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isStaticUnitsEditable();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebsiteProperties#isStaticUnitsEditable <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Units Editable</em>' attribute.
	 * @see #isStaticUnitsEditable()
	 * @generated
	 */
	void setStaticUnitsEditable(boolean value);

} // WebsiteProperties
