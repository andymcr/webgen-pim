/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.MenuEntry#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getMenuEntry()
 * @model abstract="true"
 * @generated
 */
public interface MenuEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Menu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(Menu)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getMenuEntry_PartOf()
	 * @see work.andycarpenter.webgen.pims.webui.Menu#getEntries
	 * @model opposite="entries" required="true" transient="false"
	 * @generated
	 */
	Menu getPartOf();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.MenuEntry#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Menu value);

} // MenuEntry
