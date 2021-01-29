/**
 */
package work.andycarpenter.webgen.pims.service.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import work.andycarpenter.webgen.pims.base.impl.NamedElementImpl;
import work.andycarpenter.webgen.pims.persistence.Repository;
import work.andycarpenter.webgen.pims.service.BusinessOperation;
import work.andycarpenter.webgen.pims.service.Constant;
import work.andycarpenter.webgen.pims.service.Service;
import work.andycarpenter.webgen.pims.service.ServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.service.impl.ServiceImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.impl.ServiceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.impl.ServiceImpl#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessOperation> operations;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentWithInverseEList<Constant>(Constant.class, this, ServicePackage.SERVICE__CONSTANTS, ServicePackage.CONSTANT__DEFINED_BY);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusinessOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<BusinessOperation>(BusinessOperation.class, this, ServicePackage.SERVICE__OPERATIONS, ServicePackage.BUSINESS_OPERATION__DEFINED_BY);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<Repository>(Repository.class, this, ServicePackage.SERVICE__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE__CONSTANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstants()).basicAdd(otherEnd, msgs);
			case ServicePackage.SERVICE__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE__CONSTANTS:
				return getConstants();
			case ServicePackage.SERVICE__OPERATIONS:
				return getOperations();
			case ServicePackage.SERVICE__USES:
				return getUses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.SERVICE__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
				return;
			case ServicePackage.SERVICE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends BusinessOperation>)newValue);
				return;
			case ServicePackage.SERVICE__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Repository>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicePackage.SERVICE__CONSTANTS:
				getConstants().clear();
				return;
			case ServicePackage.SERVICE__OPERATIONS:
				getOperations().clear();
				return;
			case ServicePackage.SERVICE__USES:
				getUses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicePackage.SERVICE__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case ServicePackage.SERVICE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ServicePackage.SERVICE__USES:
				return uses != null && !uses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
