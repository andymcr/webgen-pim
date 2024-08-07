/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry#getDestination <em>Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry#isAlwaysVisible <em>Always Visible</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getActionMenuEntry()
 * @model
 * @generated
 */
public interface ActionMenuEntry extends NamedDisplayElement, MenuEntry {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(ContentUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getActionMenuEntry_Destination()
	 * @model required="true"
	 * @generated
	 */
	ContentUnit getDestination();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ContentUnit value);

	/**
	 * Returns the value of the '<em><b>Always Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Visible</em>' attribute.
	 * @see #setAlwaysVisible(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getActionMenuEntry_AlwaysVisible()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAlwaysVisible();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ActionMenuEntry#isAlwaysVisible <em>Always Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Visible</em>' attribute.
	 * @see #isAlwaysVisible()
	 * @generated
	 */
	void setAlwaysVisible(boolean value);

} // ActionMenuEntry
