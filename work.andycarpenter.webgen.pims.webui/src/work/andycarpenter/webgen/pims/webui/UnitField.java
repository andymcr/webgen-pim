/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;
import work.andycarpenter.webgen.pims.expression.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#getHelp <em>Help</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#isEscapeHTML <em>Escape HTML</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#isTruncate <em>Truncate</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitField#isDisableInput <em>Disable Input</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField()
 * @model abstract="true"
 * @generated
 */
public interface UnitField extends EObject {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getDisplayFields <em>Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(DynamicUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_DisplayedOn()
	 * @see work.andycarpenter.webgen.pims.webui.DynamicUnit#getDisplayFields
	 * @model opposite="displayFields" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DynamicUnit getDisplayedOn();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#getDisplayedOn <em>Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed On</em>' container reference.
	 * @see #getDisplayedOn()
	 * @generated
	 */
	void setDisplayedOn(DynamicUnit value);

	/**
	 * Returns the value of the '<em><b>Requires Role</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Role</em>' attribute.
	 * @see #setRequiresRole(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_RequiresRole()
	 * @model default=""
	 * @generated
	 */
	String getRequiresRole();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#getRequiresRole <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Role</em>' attribute.
	 * @see #getRequiresRole()
	 * @generated
	 */
	void setRequiresRole(String value);

	/**
	 * Returns the value of the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide When</em>' containment reference.
	 * @see #setHideWhen(Predicate)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_HideWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getHideWhen();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#getHideWhen <em>Hide When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide When</em>' containment reference.
	 * @see #getHideWhen()
	 * @generated
	 */
	void setHideWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_Title()
	 * @model default=""
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see #setHelp(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_Help()
	 * @model default=""
	 * @generated
	 */
	String getHelp();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#getHelp <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help</em>' attribute.
	 * @see #getHelp()
	 * @generated
	 */
	void setHelp(String value);

	/**
	 * Returns the value of the '<em><b>Escape HTML</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escape HTML</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape HTML</em>' attribute.
	 * @see #setEscapeHTML(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_EscapeHTML()
	 * @model default="true"
	 * @generated
	 */
	boolean isEscapeHTML();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#isEscapeHTML <em>Escape HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape HTML</em>' attribute.
	 * @see #isEscapeHTML()
	 * @generated
	 */
	void setEscapeHTML(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Display Option</b></em>' attribute.
	 * The default value is <code>"LineDirection"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Display Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Display Option</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions
	 * @see #setCollectionDisplayOption(CollectionDisplayOptions)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_CollectionDisplayOption()
	 * @model default="LineDirection" ordered="false"
	 * @generated
	 */
	CollectionDisplayOptions getCollectionDisplayOption();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Display Option</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions
	 * @see #getCollectionDisplayOption()
	 * @generated
	 */
	void setCollectionDisplayOption(CollectionDisplayOptions value);

	/**
	 * Returns the value of the '<em><b>Truncate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Truncate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truncate</em>' attribute.
	 * @see #setTruncate(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_Truncate()
	 * @model default="false"
	 * @generated
	 */
	boolean isTruncate();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#isTruncate <em>Truncate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truncate</em>' attribute.
	 * @see #isTruncate()
	 * @generated
	 */
	void setTruncate(boolean value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see #setDateFormat(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_DateFormat()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getDateFormat();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(String value);

	/**
	 * Returns the value of the '<em><b>Disable Input</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Input</em>' attribute.
	 * @see #setDisableInput(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitField_DisableInput()
	 * @model default="false"
	 * @generated
	 */
	boolean isDisableInput();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitField#isDisableInput <em>Disable Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Input</em>' attribute.
	 * @see #isDisableInput()
	 * @generated
	 */
	void setDisableInput(boolean value);

} // UnitField
