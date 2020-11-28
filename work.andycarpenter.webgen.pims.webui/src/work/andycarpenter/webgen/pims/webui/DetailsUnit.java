/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Details Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DetailsUnit#getSelection <em>Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDetailsUnit()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionValidChoice selectionMustBeSingleton'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL selectionMustBeSingleton='not selection.oclIsUndefined() implies\r\n\tselection.limit = 1' selectionValidChoice='not selection.oclIsUndefined() implies\n\tpageDisplayedOn.webUI.services.services\n\t\t-&gt;select(s : service::Service | not s.serves.oclIsUndefined())\n\t\t-&gt;select(s : service::Service | contentType = s.serves)\n\t\t-&gt;collect(s : service::Service | s.selections)\n\t\t-&gt;includes(selection)'"
 * @generated
 */
public interface DetailsUnit extends SingletonUnit, SelectableUnit {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDetailsUnit_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DetailsUnit#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Omit Field Labels</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Field Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #setOmitFieldLabels(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDetailsUnit_OmitFieldLabels()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOmitFieldLabels();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #isOmitFieldLabels()
	 * @generated
	 */
	void setOmitFieldLabels(boolean value);

} // DetailsUnit
