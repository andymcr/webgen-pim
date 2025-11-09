/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import work.andycarpenter.webgen.pims.persistence.Persistence;
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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getNavigation <em>Navigation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getServices <em>Services</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getControllers <em>Controllers</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#isUseFormFloatingLabels <em>Use Form Floating Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateFormat <em>Default Date Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTimeFormat <em>Default Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDateTimeFormat <em>Default Date Time Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCancelLabel <em>Default Cancel Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCancelIcon <em>Default Cancel Icon</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultClearLabel <em>Default Clear Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultClearIcon <em>Default Clear Icon</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSaveLabel <em>Default Save Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSaveIcon <em>Default Save Icon</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSearchLabel <em>Default Search Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSearchIcon <em>Default Search Icon</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultPageStyleClass <em>Default Page Style Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultStyles <em>Default Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardsStyles <em>Default Cards Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCollectionStyles <em>Default Collection Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultImageCardsStyles <em>Default Image Cards Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDetailsStyles <em>Default Details Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFormStyles <em>Default Form Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultGalleryStyles <em>Default Gallery Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSliderStyles <em>Default Slider Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultStaticStyles <em>Default Static Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTabularStyles <em>Default Tabular Styles</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='controllerNameUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL controllerNameUnique='controllers-&gt;isUnique(name)'"
 * @generated
 */
public interface WebUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' reference.
	 * @see #setPersistence(Persistence)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_Persistence()
	 * @model
	 * @generated
	 */
	Persistence getPersistence();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getPersistence <em>Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(Persistence value);

	/**
	 * Returns the value of the '<em><b>Navigation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Navigation#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation</em>' containment reference.
	 * @see #setNavigation(Navigation)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_Navigation()
	 * @see work.andycarpenter.webgen.pims.webui.Navigation#getPartOf
	 * @model opposite="partOf" containment="true" required="true"
	 * @generated
	 */
	Navigation getNavigation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getNavigation <em>Navigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation</em>' containment reference.
	 * @see #getNavigation()
	 * @generated
	 */
	void setNavigation(Navigation value);

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
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.Controller}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Controller#getWebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_Controllers()
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getWebUI
	 * @model opposite="webUI" containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Use Form Floating Labels</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Form Floating Labels</em>' attribute.
	 * @see #setUseFormFloatingLabels(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_UseFormFloatingLabels()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUseFormFloatingLabels();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#isUseFormFloatingLabels <em>Use Form Floating Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Form Floating Labels</em>' attribute.
	 * @see #isUseFormFloatingLabels()
	 * @generated
	 */
	void setUseFormFloatingLabels(boolean value);

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
	 * @model default="jS F Y"
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
	 * @model default="G.i"
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
	 * @model default="jS F Y G.i"
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
	 * Returns the value of the '<em><b>Default Cancel Label</b></em>' attribute.
	 * The default value is <code>"Cancel"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cancel Label</em>' attribute.
	 * @see #setDefaultCancelLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultCancelLabel()
	 * @model default="Cancel"
	 * @generated
	 */
	String getDefaultCancelLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCancelLabel <em>Default Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cancel Label</em>' attribute.
	 * @see #getDefaultCancelLabel()
	 * @generated
	 */
	void setDefaultCancelLabel(String value);

	/**
	 * Returns the value of the '<em><b>Default Cancel Icon</b></em>' attribute.
	 * The default value is <code>"Cancel"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cancel Icon</em>' attribute.
	 * @see #setDefaultCancelIcon(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultCancelIcon()
	 * @model default="Cancel"
	 * @generated
	 */
	String getDefaultCancelIcon();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCancelIcon <em>Default Cancel Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cancel Icon</em>' attribute.
	 * @see #getDefaultCancelIcon()
	 * @generated
	 */
	void setDefaultCancelIcon(String value);

	/**
	 * Returns the value of the '<em><b>Default Clear Label</b></em>' attribute.
	 * The default value is <code>"Cancel"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Clear Label</em>' attribute.
	 * @see #setDefaultClearLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultClearLabel()
	 * @model default="Cancel"
	 * @generated
	 */
	String getDefaultClearLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultClearLabel <em>Default Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Clear Label</em>' attribute.
	 * @see #getDefaultClearLabel()
	 * @generated
	 */
	void setDefaultClearLabel(String value);

	/**
	 * Returns the value of the '<em><b>Default Clear Icon</b></em>' attribute.
	 * The default value is <code>"Cancel"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Clear Icon</em>' attribute.
	 * @see #setDefaultClearIcon(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultClearIcon()
	 * @model default="Cancel"
	 * @generated
	 */
	String getDefaultClearIcon();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultClearIcon <em>Default Clear Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Clear Icon</em>' attribute.
	 * @see #getDefaultClearIcon()
	 * @generated
	 */
	void setDefaultClearIcon(String value);

	/**
	 * Returns the value of the '<em><b>Default Save Label</b></em>' attribute.
	 * The default value is <code>"Save"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Save Label</em>' attribute.
	 * @see #setDefaultSaveLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultSaveLabel()
	 * @model default="Save"
	 * @generated
	 */
	String getDefaultSaveLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSaveLabel <em>Default Save Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Save Label</em>' attribute.
	 * @see #getDefaultSaveLabel()
	 * @generated
	 */
	void setDefaultSaveLabel(String value);

	/**
	 * Returns the value of the '<em><b>Default Save Icon</b></em>' attribute.
	 * The default value is <code>"Save"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Save Icon</em>' attribute.
	 * @see #setDefaultSaveIcon(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultSaveIcon()
	 * @model default="Save"
	 * @generated
	 */
	String getDefaultSaveIcon();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSaveIcon <em>Default Save Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Save Icon</em>' attribute.
	 * @see #getDefaultSaveIcon()
	 * @generated
	 */
	void setDefaultSaveIcon(String value);

	/**
	 * Returns the value of the '<em><b>Default Search Label</b></em>' attribute.
	 * The default value is <code>"Save"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Search Label</em>' attribute.
	 * @see #setDefaultSearchLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultSearchLabel()
	 * @model default="Save"
	 * @generated
	 */
	String getDefaultSearchLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSearchLabel <em>Default Search Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Search Label</em>' attribute.
	 * @see #getDefaultSearchLabel()
	 * @generated
	 */
	void setDefaultSearchLabel(String value);

	/**
	 * Returns the value of the '<em><b>Default Search Icon</b></em>' attribute.
	 * The default value is <code>"Cancel"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Search Icon</em>' attribute.
	 * @see #setDefaultSearchIcon(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultSearchIcon()
	 * @model default="Cancel"
	 * @generated
	 */
	String getDefaultSearchIcon();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSearchIcon <em>Default Search Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Search Icon</em>' attribute.
	 * @see #getDefaultSearchIcon()
	 * @generated
	 */
	void setDefaultSearchIcon(String value);

	/**
	 * Returns the value of the '<em><b>Default Page Style Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Page Style Class</em>' attribute.
	 * @see #setDefaultPageStyleClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultPageStyleClass()
	 * @model default=""
	 * @generated
	 */
	String getDefaultPageStyleClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultPageStyleClass <em>Default Page Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Page Style Class</em>' attribute.
	 * @see #getDefaultPageStyleClass()
	 * @generated
	 */
	void setDefaultPageStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Default Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Styles</em>' containment reference.
	 * @see #setDefaultStyles(DefaultUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DefaultUnitStyles getDefaultStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultStyles <em>Default Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Styles</em>' containment reference.
	 * @see #getDefaultStyles()
	 * @generated
	 */
	void setDefaultStyles(DefaultUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Cards Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cards Styles</em>' containment reference.
	 * @see #setDefaultCardsStyles(CardsUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultCardsStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CardsUnitStyles getDefaultCardsStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCardsStyles <em>Default Cards Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cards Styles</em>' containment reference.
	 * @see #getDefaultCardsStyles()
	 * @generated
	 */
	void setDefaultCardsStyles(CardsUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Collection Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Collection Styles</em>' containment reference.
	 * @see #setDefaultCollectionStyles(CollectionUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultCollectionStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionUnitStyles getDefaultCollectionStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultCollectionStyles <em>Default Collection Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Collection Styles</em>' containment reference.
	 * @see #getDefaultCollectionStyles()
	 * @generated
	 */
	void setDefaultCollectionStyles(CollectionUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Image Cards Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Image Cards Styles</em>' containment reference.
	 * @see #setDefaultImageCardsStyles(ImageCardsUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultImageCardsStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ImageCardsUnitStyles getDefaultImageCardsStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultImageCardsStyles <em>Default Image Cards Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Image Cards Styles</em>' containment reference.
	 * @see #getDefaultImageCardsStyles()
	 * @generated
	 */
	void setDefaultImageCardsStyles(ImageCardsUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Details Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Details Styles</em>' containment reference.
	 * @see #setDefaultDetailsStyles(DetailsUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultDetailsStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DetailsUnitStyles getDefaultDetailsStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultDetailsStyles <em>Default Details Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Details Styles</em>' containment reference.
	 * @see #getDefaultDetailsStyles()
	 * @generated
	 */
	void setDefaultDetailsStyles(DetailsUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Form Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Form Styles</em>' containment reference.
	 * @see #setDefaultFormStyles(FormUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultFormStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormUnitStyles getDefaultFormStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultFormStyles <em>Default Form Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Form Styles</em>' containment reference.
	 * @see #getDefaultFormStyles()
	 * @generated
	 */
	void setDefaultFormStyles(FormUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Gallery Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Gallery Styles</em>' containment reference.
	 * @see #setDefaultGalleryStyles(GalleryUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultGalleryStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GalleryUnitStyles getDefaultGalleryStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultGalleryStyles <em>Default Gallery Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Gallery Styles</em>' containment reference.
	 * @see #getDefaultGalleryStyles()
	 * @generated
	 */
	void setDefaultGalleryStyles(GalleryUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Slider Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Slider Styles</em>' containment reference.
	 * @see #setDefaultSliderStyles(SliderUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultSliderStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SliderUnitStyles getDefaultSliderStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultSliderStyles <em>Default Slider Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Slider Styles</em>' containment reference.
	 * @see #getDefaultSliderStyles()
	 * @generated
	 */
	void setDefaultSliderStyles(SliderUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Static Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Static Styles</em>' containment reference.
	 * @see #setDefaultStaticStyles(StaticUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultStaticStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StaticUnitStyles getDefaultStaticStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultStaticStyles <em>Default Static Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Static Styles</em>' containment reference.
	 * @see #getDefaultStaticStyles()
	 * @generated
	 */
	void setDefaultStaticStyles(StaticUnitStyles value);

	/**
	 * Returns the value of the '<em><b>Default Tabular Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Tabular Styles</em>' containment reference.
	 * @see #setDefaultTabularStyles(TabularUnitStyles)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultTabularStyles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TabularUnitStyles getDefaultTabularStyles();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultTabularStyles <em>Default Tabular Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Tabular Styles</em>' containment reference.
	 * @see #getDefaultTabularStyles()
	 * @generated
	 */
	void setDefaultTabularStyles(TabularUnitStyles value);

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
	 * @see #setDefaultMaximumUploadSize(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getWebUI_DefaultMaximumUploadSize()
	 * @model default="2000000" required="true"
	 * @generated
	 */
	String getDefaultMaximumUploadSize();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.WebUI#getDefaultMaximumUploadSize <em>Default Maximum Upload Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Maximum Upload Size</em>' attribute.
	 * @see #getDefaultMaximumUploadSize()
	 * @generated
	 */
	void setDefaultMaximumUploadSize(String value);

} // WebUI
