/**
 */
package work.andycarpenter.webgen.pims.persistence;

import work.andycarpenter.webgen.pims.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.FeatureVariable#isUseContainerAsContext <em>Use Container As Context</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeatureVariable()
 * @model abstract="true"
 * @generated
 */
public interface FeatureVariable extends Variable {

	/**
	 * Returns the value of the '<em><b>Use Container As Context</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Container As Context</em>' attribute.
	 * @see #setUseContainerAsContext(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeatureVariable_UseContainerAsContext()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseContainerAsContext();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariable#isUseContainerAsContext <em>Use Container As Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Container As Context</em>' attribute.
	 * @see #isUseContainerAsContext()
	 * @generated
	 */
	void setUseContainerAsContext(boolean value);
} // FeatureVariable
