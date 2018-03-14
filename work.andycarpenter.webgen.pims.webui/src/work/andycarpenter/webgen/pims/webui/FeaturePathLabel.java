/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.ModelLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Path Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePathLabel#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePathLabel#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePathLabel()
 * @model
 * @generated
 */
public interface FeaturePathLabel extends FeaturePath {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePathLabel_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if label.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tlabel.name\r\nendif\r\n'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(ModelLabel)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePathLabel_Label()
	 * @model required="true"
	 * @generated
	 */
	ModelLabel getLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.FeaturePathLabel#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(ModelLabel value);

} // FeaturePathLabel
