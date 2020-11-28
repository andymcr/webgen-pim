/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit#getElementDate <em>Element Date</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDateCardsUnit()
 * @model
 * @generated
 */
public interface DateCardsUnit extends CardsUnit {
	/**
	 * Returns the value of the '<em><b>Element Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Date</em>' containment reference.
	 * @see #setElementDate(FeaturePath)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDateCardsUnit_ElementDate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeaturePath getElementDate();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit#getElementDate <em>Element Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Date</em>' containment reference.
	 * @see #getElementDate()
	 * @generated
	 */
	void setElementDate(FeaturePath value);

} // DateCardsUnit
