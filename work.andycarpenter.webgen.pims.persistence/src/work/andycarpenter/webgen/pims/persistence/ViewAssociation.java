/**
 */
package work.andycarpenter.webgen.pims.persistence;

import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ViewAssociation#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ViewAssociation#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getViewAssociation()
 * @model
 * @generated
 */
public interface ViewAssociation extends NamedDisplayElement, ViewFeature, Association {
	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(EncapsulatedAssociation)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getViewAssociation_Opposite()
	 * @model required="true"
	 * @generated
	 */
	EncapsulatedAssociation getOpposite();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ViewAssociation#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(EncapsulatedAssociation value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"Optional"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.persistence.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getViewAssociation_Cardinality()
	 * @model default="Optional" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ViewAssociation#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // ViewAssociation
