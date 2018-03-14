/**
 */
package work.andycarpenter.webgen.pims.website;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.webgen.pims.api.API;

import work.andycarpenter.webgen.pims.image.Image;

import work.andycarpenter.webgen.pims.persistence.Persistence;

import work.andycarpenter.webgen.pims.security.Security;

import work.andycarpenter.webgen.pims.service.Services;

import work.andycarpenter.webgen.pims.webui.WebUI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Gen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getWebsiteProperties <em>Website Properties</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getServices <em>Services</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getImages <em>Images</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getApi <em>Api</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.website.WebGenModel#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel()
 * @model
 * @generated
 */
public interface WebGenModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Website Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website Properties</em>' containment reference.
	 * @see #setWebsiteProperties(WebsiteProperties)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_WebsiteProperties()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	WebsiteProperties getWebsiteProperties();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getWebsiteProperties <em>Website Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website Properties</em>' containment reference.
	 * @see #getWebsiteProperties()
	 * @generated
	 */
	void setWebsiteProperties(WebsiteProperties value);

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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_FrameworkTechnology()
	 * @model default="Kohana" required="true" ordered="false"
	 * @generated
	 */
	FrameworkTechnologies getFrameworkTechnology();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getFrameworkTechnology <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Technology</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.website.FrameworkTechnologies
	 * @see #getFrameworkTechnology()
	 * @generated
	 */
	void setFrameworkTechnology(FrameworkTechnologies value);

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
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_CopyrightText()
	 * @model ordered="false"
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	void setCopyrightText(String value);

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' containment reference.
	 * @see #setPersistence(Persistence)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_Persistence()
	 * @model containment="true"
	 * @generated
	 */
	Persistence getPersistence();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getPersistence <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' containment reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(Persistence value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(Services)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_Services()
	 * @model containment="true"
	 * @generated
	 */
	Services getServices();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Services value);

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference.
	 * @see #setImages(Image)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_Images()
	 * @model containment="true"
	 * @generated
	 */
	Image getImages();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getImages <em>Images</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Images</em>' containment reference.
	 * @see #getImages()
	 * @generated
	 */
	void setImages(Image value);

	/**
	 * Returns the value of the '<em><b>Web UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web UI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web UI</em>' containment reference.
	 * @see #setWebUI(WebUI)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_WebUI()
	 * @model containment="true"
	 * @generated
	 */
	WebUI getWebUI();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getWebUI <em>Web UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web UI</em>' containment reference.
	 * @see #getWebUI()
	 * @generated
	 */
	void setWebUI(WebUI value);

	/**
	 * Returns the value of the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' containment reference.
	 * @see #setApi(API)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_Api()
	 * @model containment="true"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getApi <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' containment reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(Security)
	 * @see work.andycarpenter.webgen.pims.website.WebsitePackage#getWebGenModel_Security()
	 * @model containment="true"
	 * @generated
	 */
	Security getSecurity();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.website.WebGenModel#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);

} // WebGenModel
