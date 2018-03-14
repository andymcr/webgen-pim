/**
 */
package work.andycarpenter.webgen.pims.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Display Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.base.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.base.BasePackage#getNamedDisplayElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedDisplayElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Label</em>' attribute.
	 * @see #setDisplayLabel(String)
	 * @see work.andycarpenter.webgen.pims.base.BasePackage#getNamedDisplayElement_DisplayLabel()
	 * @model
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.base.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

} // NamedDisplayElement
