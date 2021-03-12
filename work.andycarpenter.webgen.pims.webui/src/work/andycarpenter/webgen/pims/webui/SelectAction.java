/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SelectAction#getTarget <em>Target</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SelectAction#getValuePath <em>Value Path</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSelectAction()
 * @model abstract="true"
 * @generated
 */
public interface SelectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SelectableUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSelectAction_Target()
	 * @model required="true"
	 * @generated
	 */
	SelectableUnit getTarget();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SelectAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SelectableUnit value);

	/**
	 * Returns the value of the '<em><b>Value Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Path</em>' containment reference.
	 * @see #setValuePath(FeaturePath)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSelectAction_ValuePath()
	 * @model containment="true"
	 * @generated
	 */
	FeaturePath getValuePath();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SelectAction#getValuePath <em>Value Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Path</em>' containment reference.
	 * @see #getValuePath()
	 * @generated
	 */
	void setValuePath(FeaturePath value);

} // SelectAction
