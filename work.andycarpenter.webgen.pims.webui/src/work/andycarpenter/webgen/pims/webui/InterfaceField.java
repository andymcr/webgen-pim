/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#isRequired <em>Required</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getValidationPattern <em>Validation Pattern</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#isRepeatedField <em>Repeated Field</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondDisplayLabel <em>Second Display Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondTitle <em>Second Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondPlaceholder <em>Second Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondHelp <em>Second Help</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField()
 * @model abstract="true"
 * @generated
 */
public interface InterfaceField extends NamedDisplayElement, UnitField {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_Required()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_DefaultValue()
	 * @model ordered="false"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_Placeholder()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Repeated Field</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeated Field</em>' attribute.
	 * @see #setRepeatedField(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_RepeatedField()
	 * @model default="false"
	 * @generated
	 */
	boolean isRepeatedField();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#isRepeatedField <em>Repeated Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeated Field</em>' attribute.
	 * @see #isRepeatedField()
	 * @generated
	 */
	void setRepeatedField(boolean value);

	/**
	 * Returns the value of the '<em><b>Second Display Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Display Label</em>' attribute.
	 * @see #setSecondDisplayLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_SecondDisplayLabel()
	 * @model default=""
	 * @generated
	 */
	String getSecondDisplayLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondDisplayLabel <em>Second Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Display Label</em>' attribute.
	 * @see #getSecondDisplayLabel()
	 * @generated
	 */
	void setSecondDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Second Title</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Title</em>' attribute.
	 * @see #setSecondTitle(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_SecondTitle()
	 * @model default=""
	 * @generated
	 */
	String getSecondTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondTitle <em>Second Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Title</em>' attribute.
	 * @see #getSecondTitle()
	 * @generated
	 */
	void setSecondTitle(String value);

	/**
	 * Returns the value of the '<em><b>Second Placeholder</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Placeholder</em>' attribute.
	 * @see #setSecondPlaceholder(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_SecondPlaceholder()
	 * @model default=""
	 * @generated
	 */
	String getSecondPlaceholder();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondPlaceholder <em>Second Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Placeholder</em>' attribute.
	 * @see #getSecondPlaceholder()
	 * @generated
	 */
	void setSecondPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Second Help</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Help</em>' attribute.
	 * @see #setSecondHelp(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_SecondHelp()
	 * @model default=""
	 * @generated
	 */
	String getSecondHelp();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getSecondHelp <em>Second Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Help</em>' attribute.
	 * @see #getSecondHelp()
	 * @generated
	 */
	void setSecondHelp(String value);

	/**
	 * Returns the value of the '<em><b>Validation Pattern</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Pattern</em>' attribute.
	 * @see #setValidationPattern(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getInterfaceField_ValidationPattern()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getValidationPattern();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.InterfaceField#getValidationPattern <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Pattern</em>' attribute.
	 * @see #getValidationPattern()
	 * @generated
	 */
	void setValidationPattern(String value);

} // InterfaceField
