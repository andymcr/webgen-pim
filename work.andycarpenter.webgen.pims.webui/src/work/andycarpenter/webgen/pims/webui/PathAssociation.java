/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAssociation()
 * @model abstract="true"
 * @generated
 */
public interface PathAssociation extends Path {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAssociation_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAssociation_Name()
	 * @model unsettable="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\t\'\'\nelse\n\tassociation.name\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Display</em>' reference.
	 * @see #setValueDisplay(ModelLabel)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAssociation_ValueDisplay()
	 * @model
	 * @generated
	 */
	ModelLabel getValueDisplay();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getValueDisplay <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Display</em>' reference.
	 * @see #getValueDisplay()
	 * @generated
	 */
	void setValueDisplay(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.ChildPath#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(ChildPath)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAssociation_ChildFeature()
	 * @see work.andycarpenter.webgen.pims.webui.ChildPath#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ChildPath getChildFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(ChildPath value);

	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\n\tcontainingType.associations-&gt;includes(association)'"
	 * @generated
	 */
	boolean isIsSourceAssociation();

	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAssociation_SourceEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.partOf\n\telse\n\t\tassociation.targetEntity\n\tendif\nendif'"
	 * @generated
	 */
	Entity getSourceEntity();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathAssociation_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif'"
	 * @generated
	 */
	Entity getTargetEntity();

} // PathAssociation
