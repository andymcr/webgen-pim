/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import work.andycarpenter.webgen.pims.persistence.PathElement;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PathElementImpl extends MinimalEObjectImpl.Container implements PathElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.PATH_ELEMENT;
	}

} //PathElementImpl
