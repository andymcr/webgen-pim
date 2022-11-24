/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ChildPath#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPath()
 * @model abstract="true"
 * @generated
 */
public interface ChildPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.PathAssociation#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(PathAssociation)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPath_Parent()
	 * @see work.andycarpenter.webgen.pims.webui.PathAssociation#getChildFeature
	 * @model opposite="childFeature" required="true" transient="false"
	 * @generated
	 */
	PathAssociation getParent();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ChildPath#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(PathAssociation value);

} // ChildPath
