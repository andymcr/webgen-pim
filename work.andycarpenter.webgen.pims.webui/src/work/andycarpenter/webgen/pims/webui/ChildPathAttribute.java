/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.FeatureChildPath;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Path Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ChildPathAttribute#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ChildPathAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ChildPathAttribute#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPathAttribute()
 * @model
 * @generated
 */
public interface ChildPathAttribute extends FeatureChildPath {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPathAttribute_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if attribute.oclIsUndefined() then\n\t\'\'\nelse\n\tattribute.name\nendif'"
	 * @generated
	 */
	String getName();

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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPathAttribute_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ChildPathAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Type</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPathAttribute_ContainingType()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if partOf.oclIsTypeOf(UnitAssociation) then\n\tpartOf.oclAsType(UnitAssociation).targetEntity\nelse if partOf.oclIsTypeOf(FeaturePathAssociation) then\n\tpartOf.oclAsType(FeaturePathAssociation).targetEntity\nelse\n\tpartOf.oclAsType(ChildPathAssociation).targetEntity\nendif endif'"
	 * @generated
	 */
	Entity getContainingType();

} // ChildPathAttribute
