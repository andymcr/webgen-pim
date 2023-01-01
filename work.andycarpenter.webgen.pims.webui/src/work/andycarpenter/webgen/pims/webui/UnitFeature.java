/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isRequired <em>Required</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isCollectionUiAllowAdd <em>Collection Ui Allow Add</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isCollectionUiAllowRemove <em>Collection Ui Allow Remove</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getCollectionMaximumValues <em>Collection Maximum Values</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDefaultDisplayValue <em>Default Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayDefaultWhen <em>Display Default When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getEmptyDisplayValue <em>Empty Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isAutofocus <em>Autofocus</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFieldLabelClass <em>Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFieldValueClass <em>Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getInputGroupClass <em>Input Group Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atMostOneSelectAction noDeleteActions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL atMostOneSelectAction='actions-&gt;select(a | a.oclIsKindOf(SelectAction))-&gt;size() &lt; 2' noDeleteActions='actions-&gt;select(a | a.oclIsKindOf(DeleteAction))-&gt;isEmpty()'"
 * @generated
 */
public interface UnitFeature extends UnitField, ActionContainer {
	/**
	 * Returns the value of the '<em><b>Display Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Label</em>' attribute.
	 * @see #setDisplayLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_DisplayLabel()
	 * @model default=""
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_Required()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forced Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forced Value</em>' containment reference.
	 * @see #setForcedValue(Expression)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_ForcedValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getForcedValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getForcedValue <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forced Value</em>' containment reference.
	 * @see #getForcedValue()
	 * @generated
	 */
	void setForcedValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Collection Ui Allow Add</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Ui Allow Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Ui Allow Add</em>' attribute.
	 * @see #setCollectionUiAllowAdd(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_CollectionUiAllowAdd()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCollectionUiAllowAdd();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isCollectionUiAllowAdd <em>Collection Ui Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Ui Allow Add</em>' attribute.
	 * @see #isCollectionUiAllowAdd()
	 * @generated
	 */
	void setCollectionUiAllowAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Ui Allow Remove</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Ui Allow Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Ui Allow Remove</em>' attribute.
	 * @see #setCollectionUiAllowRemove(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_CollectionUiAllowRemove()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCollectionUiAllowRemove();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isCollectionUiAllowRemove <em>Collection Ui Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Ui Allow Remove</em>' attribute.
	 * @see #isCollectionUiAllowRemove()
	 * @generated
	 */
	void setCollectionUiAllowRemove(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Maximum Values</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Maximum Values</em>' attribute.
	 * @see #setCollectionMaximumValues(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_CollectionMaximumValues()
	 * @model default="0"
	 * @generated
	 */
	int getCollectionMaximumValues();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getCollectionMaximumValues <em>Collection Maximum Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Maximum Values</em>' attribute.
	 * @see #getCollectionMaximumValues()
	 * @generated
	 */
	void setCollectionMaximumValues(int value);

	/**
	 * Returns the value of the '<em><b>Default Display Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Display Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Display Value</em>' attribute.
	 * @see #setDefaultDisplayValue(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_DefaultDisplayValue()
	 * @model default=""
	 * @generated
	 */
	String getDefaultDisplayValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDefaultDisplayValue <em>Default Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Display Value</em>' attribute.
	 * @see #getDefaultDisplayValue()
	 * @generated
	 */
	void setDefaultDisplayValue(String value);

	/**
	 * Returns the value of the '<em><b>Display Default When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Default When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Default When</em>' containment reference.
	 * @see #setDisplayDefaultWhen(Predicate)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_DisplayDefaultWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getDisplayDefaultWhen();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getDisplayDefaultWhen <em>Display Default When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Default When</em>' containment reference.
	 * @see #getDisplayDefaultWhen()
	 * @generated
	 */
	void setDisplayDefaultWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Empty Display Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Display Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Display Value</em>' attribute.
	 * @see #setEmptyDisplayValue(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_EmptyDisplayValue()
	 * @model default=""
	 * @generated
	 */
	String getEmptyDisplayValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getEmptyDisplayValue <em>Empty Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Display Value</em>' attribute.
	 * @see #getEmptyDisplayValue()
	 * @generated
	 */
	void setEmptyDisplayValue(String value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_Footer()
	 * @model
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Autofocus</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autofocus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autofocus</em>' attribute.
	 * @see #setAutofocus(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_Autofocus()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAutofocus();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#isAutofocus <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autofocus</em>' attribute.
	 * @see #isAutofocus()
	 * @generated
	 */
	void setAutofocus(boolean value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_HeaderClass()
	 * @model default=""
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Field Label Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Label Class</em>' attribute.
	 * @see #setFieldLabelClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_FieldLabelClass()
	 * @model default=""
	 * @generated
	 */
	String getFieldLabelClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFieldLabelClass <em>Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Label Class</em>' attribute.
	 * @see #getFieldLabelClass()
	 * @generated
	 */
	void setFieldLabelClass(String value);

	/**
	 * Returns the value of the '<em><b>Field Value Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Value Class</em>' attribute.
	 * @see #setFieldValueClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_FieldValueClass()
	 * @model default=""
	 * @generated
	 */
	String getFieldValueClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFieldValueClass <em>Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Value Class</em>' attribute.
	 * @see #getFieldValueClass()
	 * @generated
	 */
	void setFieldValueClass(String value);

	/**
	 * Returns the value of the '<em><b>Input Group Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Group Class</em>' attribute.
	 * @see #setInputGroupClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_InputGroupClass()
	 * @model default=""
	 * @generated
	 */
	String getInputGroupClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getInputGroupClass <em>Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Group Class</em>' attribute.
	 * @see #getInputGroupClass()
	 * @generated
	 */
	void setInputGroupClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitFeature_FooterClass()
	 * @model default=""
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitFeature#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // UnitFeature
