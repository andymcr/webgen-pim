/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAttribute#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAttribute()
 * @model
 * @generated
 */
public interface PathAttribute extends Path {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAttribute#getAttribute <em>Attribute</em>}' reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAttribute_Name()
	 * @model unsettable="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if attribute.oclIsUndefined() then\n\t\'\'\nelse\n\tattribute.name\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAttribute#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // PathAttribute
