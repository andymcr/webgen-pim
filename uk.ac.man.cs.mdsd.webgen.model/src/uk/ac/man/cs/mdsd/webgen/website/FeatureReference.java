/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import uk.ac.man.cs.mdsd.criteria.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference()
 * @model
 * @generated
 */
public interface FeatureReference extends Path {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(IncludedFeature)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference_Field()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IncludedFeature getField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(IncludedFeature value);

} // FeatureReference
