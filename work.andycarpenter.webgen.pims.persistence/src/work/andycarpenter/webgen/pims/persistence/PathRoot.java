/**
 */
package work.andycarpenter.webgen.pims.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.PathRoot#getChildFeature <em>Child Feature</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getPathRoot()
 * @model
 * @generated
 */
public interface PathRoot extends Path {
	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.ChildFeature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(ChildFeature)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getPathRoot_ChildFeature()
	 * @see work.andycarpenter.webgen.pims.persistence.ChildFeature#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ChildFeature getChildFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.PathRoot#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(ChildFeature value);

} // PathRoot
