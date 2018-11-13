/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getKeyFor <em>Key For</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationKey()
 * @model
 * @generated
 */
public interface AssociationKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Key For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Association#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key For</em>' container reference.
	 * @see #setKeyFor(Association)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationKey_KeyFor()
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getKeys
	 * @model opposite="keys" required="true" transient="false"
	 * @generated
	 */
	Association getKeyFor();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getKeyFor <em>Key For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key For</em>' container reference.
	 * @see #getKeyFor()
	 * @generated
	 */
	void setKeyFor(Association value);

	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Feature</em>' reference.
	 * @see #setSourceFeature(EntityFeature)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationKey_SourceFeature()
	 * @model required="true"
	 * @generated
	 */
	EntityFeature getSourceFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getSourceFeature <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' reference.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(EntityFeature value);

	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature</em>' reference.
	 * @see #setTargetFeature(EntityFeature)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationKey_TargetFeature()
	 * @model
	 * @generated
	 */
	EntityFeature getTargetFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getTargetFeature <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' reference.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(EntityFeature value);

} // AssociationKey
