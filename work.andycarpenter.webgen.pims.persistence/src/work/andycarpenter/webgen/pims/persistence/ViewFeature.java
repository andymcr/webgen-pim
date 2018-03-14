/**
 */
package work.andycarpenter.webgen.pims.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ViewFeature#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getViewFeature()
 * @model abstract="true"
 * @generated
 */
public interface ViewFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.View#getViewFeatures <em>View Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(View)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getViewFeature_PartOf()
	 * @see work.andycarpenter.webgen.pims.persistence.View#getViewFeatures
	 * @model opposite="viewFeatures" required="true" transient="false"
	 * @generated
	 */
	View getPartOf();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ViewFeature#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(View value);

} // ViewFeature
