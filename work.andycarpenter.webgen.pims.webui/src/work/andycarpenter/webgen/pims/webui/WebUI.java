/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import work.andycarpenter.webgen.pims.service.Services;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getServices <em>Services</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getMenus <em>Menus</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getPages <em>Pages</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardClass <em>Default Card Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardHeaderClass <em>Default Card Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardFooterClass <em>Default Card Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultActionNavigationClass <em>Default Action Navigation Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultAnchorClass <em>Default Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldListClass <em>Default Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldLabelClass <em>Default Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldValueClass <em>Default Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputGroupClass <em>Default Input Group Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputLabelClass <em>Default Input Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputValueClass <em>Default Input Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getInputTechnology <em>Input Technology</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getAjaxTechnology <em>Ajax Technology</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='pageNameUnique menuNameUnique '"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL pageNameUnique='pages-&gt;isUnique(name)' menuNameUnique='menus-&gt;isUnique(name)'"
 * @generated
 */
public interface WebUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference.
	 * @see #setServices(Services)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_Services()
	 * @model
	 * @generated
	 */
	Services getServices();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getServices <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Services value);

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.Page}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Page#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_Pages()
	 * @see work.andycarpenter.webgen.pims.webui.Page#getWebUI
	 * @model opposite="webUI" containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Default Date Format</b></em>' attribute.
	 * The default value is <code>"jS F Y"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Date Format</em>' attribute.
	 * @see #setDefaultDateFormat(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultDateFormat()
	 * @model default="jS F Y" ordered="false"
	 * @generated
	 */
	String getDefaultDateFormat();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateFormat <em>Default Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Date Format</em>' attribute.
	 * @see #getDefaultDateFormat()
	 * @generated
	 */
	void setDefaultDateFormat(String value);

	/**
	 * Returns the value of the '<em><b>Default Time Format</b></em>' attribute.
	 * The default value is <code>"G.i"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Time Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Time Format</em>' attribute.
	 * @see #setDefaultTimeFormat(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultTimeFormat()
	 * @model default="G.i" ordered="false"
	 * @generated
	 */
	String getDefaultTimeFormat();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTimeFormat <em>Default Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Time Format</em>' attribute.
	 * @see #getDefaultTimeFormat()
	 * @generated
	 */
	void setDefaultTimeFormat(String value);

	/**
	 * Returns the value of the '<em><b>Default Date Time Format</b></em>' attribute.
	 * The default value is <code>"jS F Y G.i"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Date Time Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Date Time Format</em>' attribute.
	 * @see #setDefaultDateTimeFormat(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultDateTimeFormat()
	 * @model default="jS F Y G.i" ordered="false"
	 * @generated
	 */
	String getDefaultDateTimeFormat();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateTimeFormat <em>Default Date Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Date Time Format</em>' attribute.
	 * @see #getDefaultDateTimeFormat()
	 * @generated
	 */
	void setDefaultDateTimeFormat(String value);

	/**
	 * Returns the value of the '<em><b>Default Card Class</b></em>' attribute.
	 * The default value is <code>"card rounded shadow-sm h-100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Card Class</em>' attribute.
	 * @see #setDefaultCardClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultCardClass()
	 * @model default="card rounded shadow-sm h-100" ordered="false"
	 * @generated
	 */
	String getDefaultCardClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardClass <em>Default Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Card Class</em>' attribute.
	 * @see #getDefaultCardClass()
	 * @generated
	 */
	void setDefaultCardClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Card Header Class</b></em>' attribute.
	 * The default value is <code>"card-header"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Card Header Class</em>' attribute.
	 * @see #setDefaultCardHeaderClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultCardHeaderClass()
	 * @model default="card-header" ordered="false"
	 * @generated
	 */
	String getDefaultCardHeaderClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardHeaderClass <em>Default Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Card Header Class</em>' attribute.
	 * @see #getDefaultCardHeaderClass()
	 * @generated
	 */
	void setDefaultCardHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Card Footer Class</b></em>' attribute.
	 * The default value is <code>"card-footer"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Card Footer Class</em>' attribute.
	 * @see #setDefaultCardFooterClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultCardFooterClass()
	 * @model default="card-footer" ordered="false"
	 * @generated
	 */
	String getDefaultCardFooterClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardFooterClass <em>Default Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Card Footer Class</em>' attribute.
	 * @see #getDefaultCardFooterClass()
	 * @generated
	 */
	void setDefaultCardFooterClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Action Navigation Class</b></em>' attribute.
	 * The default value is <code>"nav"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Action Navigation Class</em>' attribute.
	 * @see #setDefaultActionNavigationClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultActionNavigationClass()
	 * @model default="nav" ordered="false"
	 * @generated
	 */
	String getDefaultActionNavigationClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultActionNavigationClass <em>Default Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Action Navigation Class</em>' attribute.
	 * @see #getDefaultActionNavigationClass()
	 * @generated
	 */
	void setDefaultActionNavigationClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Anchor Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Anchor Class</em>' attribute.
	 * @see #setDefaultAnchorClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultAnchorClass()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getDefaultAnchorClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultAnchorClass <em>Default Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Anchor Class</em>' attribute.
	 * @see #getDefaultAnchorClass()
	 * @generated
	 */
	void setDefaultAnchorClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Field List Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Field List Class</em>' attribute.
	 * @see #setDefaultFieldListClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultFieldListClass()
	 * @model default=""
	 * @generated
	 */
	String getDefaultFieldListClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldListClass <em>Default Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Field List Class</em>' attribute.
	 * @see #getDefaultFieldListClass()
	 * @generated
	 */
	void setDefaultFieldListClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Field Label Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Field Label Class</em>' attribute.
	 * @see #setDefaultFieldLabelClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultFieldLabelClass()
	 * @model default=""
	 * @generated
	 */
	String getDefaultFieldLabelClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldLabelClass <em>Default Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Field Label Class</em>' attribute.
	 * @see #getDefaultFieldLabelClass()
	 * @generated
	 */
	void setDefaultFieldLabelClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Field Value Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Field Value Class</em>' attribute.
	 * @see #setDefaultFieldValueClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultFieldValueClass()
	 * @model default=""
	 * @generated
	 */
	String getDefaultFieldValueClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFieldValueClass <em>Default Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Field Value Class</em>' attribute.
	 * @see #getDefaultFieldValueClass()
	 * @generated
	 */
	void setDefaultFieldValueClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Input Group Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Input Group Class</em>' attribute.
	 * @see #setDefaultInputGroupClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultInputGroupClass()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getDefaultInputGroupClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputGroupClass <em>Default Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Input Group Class</em>' attribute.
	 * @see #getDefaultInputGroupClass()
	 * @generated
	 */
	void setDefaultInputGroupClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Input Label Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Input Label Class</em>' attribute.
	 * @see #setDefaultInputLabelClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultInputLabelClass()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getDefaultInputLabelClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputLabelClass <em>Default Input Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Input Label Class</em>' attribute.
	 * @see #getDefaultInputLabelClass()
	 * @generated
	 */
	void setDefaultInputLabelClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Input Value Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Input Value Class</em>' attribute.
	 * @see #setDefaultInputValueClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultInputValueClass()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getDefaultInputValueClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultInputValueClass <em>Default Input Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Input Value Class</em>' attribute.
	 * @see #getDefaultInputValueClass()
	 * @generated
	 */
	void setDefaultInputValueClass(String value);

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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultMaximumUploadSize()
	 * @model default="2000000" ordered="false"
	 * @generated
	 */
	int getDefaultMaximumUploadSize();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Maximum Upload Size</em>' attribute.
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 */
	void setDefaultMaximumUploadSize(int value);

	/**
	 * Returns the value of the '<em><b>Input Technology</b></em>' attribute.
	 * The default value is <code>"Html"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.webui.InputTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Technology</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.InputTechnologies
	 * @see #setInputTechnology(InputTechnologies)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_InputTechnology()
	 * @model default="Html"
	 * @generated
	 */
	InputTechnologies getInputTechnology();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getInputTechnology <em>Input Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Technology</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.InputTechnologies
	 * @see #getInputTechnology()
	 * @generated
	 */
	void setInputTechnology(InputTechnologies value);

	/**
	 * Returns the value of the '<em><b>Ajax Technology</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.webui.AjaxTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Technology</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.AjaxTechnologies
	 * @see #setAjaxTechnology(AjaxTechnologies)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_AjaxTechnology()
	 * @model default="None"
	 * @generated
	 */
	AjaxTechnologies getAjaxTechnology();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getAjaxTechnology <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Technology</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.AjaxTechnologies
	 * @see #getAjaxTechnology()
	 * @generated
	 */
	void setAjaxTechnology(AjaxTechnologies value);

} // WebUI
