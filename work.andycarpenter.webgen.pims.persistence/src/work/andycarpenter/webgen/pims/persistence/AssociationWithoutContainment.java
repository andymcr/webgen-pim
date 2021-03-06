/**
 */
package work.andycarpenter.webgen.pims.persistence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Without Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment#isTargetUnique <em>Target Unique</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationWithoutContainment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneToManyAssociationsMustBeBidirectional'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneToManyAssociationsMustBeBidirectional='cardinality = Cardinality::Optional and targetCardinality = Cardinality::Required implies bidirectional'"
 * @generated
 */
public interface AssociationWithoutContainment extends Association {
	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * The default value is <code>"Required"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.persistence.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @see #setTargetCardinality(Cardinality)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationWithoutContainment_TargetCardinality()
	 * @model default="Required" required="true"
	 * @generated
	 */
	Cardinality getTargetCardinality();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Target Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Unique</em>' attribute.
	 * @see #setTargetUnique(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationWithoutContainment_TargetUnique()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isTargetUnique();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment#isTargetUnique <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Unique</em>' attribute.
	 * @see #isTargetUnique()
	 * @generated
	 */
	void setTargetUnique(boolean value);

} // AssociationWithoutContainment
