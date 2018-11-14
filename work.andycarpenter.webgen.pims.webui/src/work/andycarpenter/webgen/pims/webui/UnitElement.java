/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.persistence.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitElement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitElement#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitElement#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitElement#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitElement#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitElement()
 * @model
 * @generated
 */
public interface UnitElement extends UnitFeature {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitElement_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitElement_Name()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if attribute.oclIsUndefined() then\n\t\'\'\nelse\n\tattribute.name\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Expression)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitElement_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obfuscate Form Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #setObfuscateFormFields(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitElement_ObfuscateFormFields()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isObfuscateFormFields();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #isObfuscateFormFields()
	 * @generated
	 */
	void setObfuscateFormFields(boolean value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitElement_Placeholder()
	 * @model ordered="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Pattern</em>' attribute.
	 * @see #setValidationPattern(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitElement_ValidationPattern()
	 * @model ordered="false"
	 * @generated
	 */
	String getValidationPattern();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitElement#getValidationPattern <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Pattern</em>' attribute.
	 * @see #getValidationPattern()
	 * @generated
	 */
	void setValidationPattern(String value);

} // UnitElement
