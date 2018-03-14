/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ModelLabelFeature#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getModelLabelFeature()
 * @model abstract="true"
 * @generated
 */
public interface ModelLabelFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(ModelLabel)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getModelLabelFeature_PartOf()
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	ModelLabel getPartOf();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelFeature#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(ModelLabel value);

} // ModelLabelFeature
