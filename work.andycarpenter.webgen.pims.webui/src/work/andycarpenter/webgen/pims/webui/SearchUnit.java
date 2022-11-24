/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SearchUnit#getResultsDestination <em>Results Destination</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSearchUnit()
 * @model
 * @generated
 */
public interface SearchUnit extends ControlUnit {
	/**
	 * Returns the value of the '<em><b>Results Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Destination</em>' reference.
	 * @see #setResultsDestination(TabularUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSearchUnit_ResultsDestination()
	 * @model required="true"
	 * @generated
	 */
	TabularUnit getResultsDestination();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SearchUnit#getResultsDestination <em>Results Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Destination</em>' reference.
	 * @see #getResultsDestination()
	 * @generated
	 */
	void setResultsDestination(TabularUnit value);

} // SearchUnit
