/**
 */
package work.andycarpenter.webgen.pims.persistence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ChildFeature#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getChildFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ChildFeature extends Path {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AssociationPathElement)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getChildFeature_Parent()
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getChildFeature
	 * @model opposite="childFeature" transient="false"
	 * @generated
	 */
	AssociationPathElement getParent();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ChildFeature#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AssociationPathElement value);

} // ChildFeature
