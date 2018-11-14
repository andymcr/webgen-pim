/**
 */
package work.andycarpenter.webgen.pims.service;

import work.andycarpenter.webgen.pims.expression.Variable;

import work.andycarpenter.webgen.pims.persistence.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.service.ServiceFeatureReference#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.ServiceFeatureReference#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getServiceFeatureReference()
 * @model
 * @generated
 */
public interface ServiceFeatureReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getServiceFeatureReference_Name()
	 * @model default="" unsettable="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if feature.oclIsUndefined() then\n\t\'\'\nelse\n\tfeature.name\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.service.ServiceFeatureReference#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getServiceFeatureReference_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.ServiceFeatureReference#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // ServiceFeatureReference
