/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Child Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.FeatureChildPath#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeatureChildPath()
 * @model abstract="true"
 * @generated
 */
public interface FeatureChildPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(AssociationReference)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeatureChildPath_PartOf()
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationReference#getChildFeature
	 * @model opposite="childFeature" transient="false"
	 * @generated
	 */
	AssociationReference getPartOf();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.FeatureChildPath#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(AssociationReference value);

} // FeatureChildPath
