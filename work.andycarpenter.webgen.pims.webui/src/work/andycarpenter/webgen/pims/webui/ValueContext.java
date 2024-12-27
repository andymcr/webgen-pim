/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ValueContext#getValueEntities <em>Value Entities</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getValueContext()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ValueContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Entities</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Entities</em>' reference list.
	 * @see #isSetValueEntities()
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getValueContext_ValueEntities()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='valueEntities()'"
	 * @generated
	 */
	EList<Entity> getValueEntities();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.webui.ValueContext#getValueEntities <em>Value Entities</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Entities</em>' reference list is set.
	 * @see #getValueEntities()
	 * @generated
	 */
	boolean isSetValueEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Entity> valueEntities();

} // ValueContext
