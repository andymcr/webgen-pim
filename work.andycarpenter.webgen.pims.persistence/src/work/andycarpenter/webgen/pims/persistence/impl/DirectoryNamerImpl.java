/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import work.andycarpenter.webgen.pims.persistence.DirectoryNamer;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory Namer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DirectoryNamerImpl extends MinimalEObjectImpl.Container implements DirectoryNamer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectoryNamerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.DIRECTORY_NAMER;
	}

} //DirectoryNamerImpl
