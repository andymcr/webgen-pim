/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import work.andycarpenter.webgen.pims.base.impl.NamedElementImpl;

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.Repository;
import work.andycarpenter.webgen.pims.persistence.Selection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.RepositoryImpl#getServes <em>Serves</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.RepositoryImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.RepositoryImpl#getFindAll <em>Find All</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.RepositoryImpl#getFindOne <em>Find One</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends NamedElementImpl implements Repository {
	/**
	 * The cached value of the '{@link #getServes() <em>Serves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServes()
	 * @generated
	 * @ordered
	 */
	protected Entity serves;

	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> selections;

	/**
	 * The cached value of the '{@link #getFindAll() <em>Find All</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindAll()
	 * @generated
	 * @ordered
	 */
	protected Selection findAll;

	/**
	 * The cached value of the '{@link #getFindOne() <em>Find One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindOne()
	 * @generated
	 * @ordered
	 */
	protected Selection findOne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getServes() {
		if (serves != null && serves.eIsProxy()) {
			InternalEObject oldServes = (InternalEObject)serves;
			serves = (Entity)eResolveProxy(oldServes);
			if (serves != oldServes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.REPOSITORY__SERVES, oldServes, serves));
			}
		}
		return serves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetServes() {
		return serves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServes(Entity newServes, NotificationChain msgs) {
		Entity oldServes = serves;
		serves = newServes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.REPOSITORY__SERVES, oldServes, newServes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServes(Entity newServes) {
		if (newServes != serves) {
			NotificationChain msgs = null;
			if (serves != null)
				msgs = ((InternalEObject)serves).eInverseRemove(this, PersistencePackage.ENTITY__REPOSITORY, Entity.class, msgs);
			if (newServes != null)
				msgs = ((InternalEObject)newServes).eInverseAdd(this, PersistencePackage.ENTITY__REPOSITORY, Entity.class, msgs);
			msgs = basicSetServes(newServes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.REPOSITORY__SERVES, newServes, newServes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Selection> getSelections() {
		if (selections == null) {
			selections = new EObjectContainmentWithInverseEList<Selection>(Selection.class, this, PersistencePackage.REPOSITORY__SELECTIONS, PersistencePackage.SELECTION__DEFINED_BY);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection getFindAll() {
		if (findAll != null && findAll.eIsProxy()) {
			InternalEObject oldFindAll = (InternalEObject)findAll;
			findAll = (Selection)eResolveProxy(oldFindAll);
			if (findAll != oldFindAll) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.REPOSITORY__FIND_ALL, oldFindAll, findAll));
			}
		}
		return findAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetFindAll() {
		return findAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFindAll(Selection newFindAll) {
		Selection oldFindAll = findAll;
		findAll = newFindAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.REPOSITORY__FIND_ALL, oldFindAll, findAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection getFindOne() {
		if (findOne != null && findOne.eIsProxy()) {
			InternalEObject oldFindOne = (InternalEObject)findOne;
			findOne = (Selection)eResolveProxy(oldFindOne);
			if (findOne != oldFindOne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.REPOSITORY__FIND_ONE, oldFindOne, findOne));
			}
		}
		return findOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetFindOne() {
		return findOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFindOne(Selection newFindOne) {
		Selection oldFindOne = findOne;
		findOne = newFindOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.REPOSITORY__FIND_ONE, oldFindOne, findOne));
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
			case PersistencePackage.REPOSITORY__SERVES:
				if (serves != null)
					msgs = ((InternalEObject)serves).eInverseRemove(this, PersistencePackage.ENTITY__REPOSITORY, Entity.class, msgs);
				return basicSetServes((Entity)otherEnd, msgs);
			case PersistencePackage.REPOSITORY__SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelections()).basicAdd(otherEnd, msgs);
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
			case PersistencePackage.REPOSITORY__SERVES:
				return basicSetServes(null, msgs);
			case PersistencePackage.REPOSITORY__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
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
			case PersistencePackage.REPOSITORY__SERVES:
				if (resolve) return getServes();
				return basicGetServes();
			case PersistencePackage.REPOSITORY__SELECTIONS:
				return getSelections();
			case PersistencePackage.REPOSITORY__FIND_ALL:
				if (resolve) return getFindAll();
				return basicGetFindAll();
			case PersistencePackage.REPOSITORY__FIND_ONE:
				if (resolve) return getFindOne();
				return basicGetFindOne();
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
			case PersistencePackage.REPOSITORY__SERVES:
				setServes((Entity)newValue);
				return;
			case PersistencePackage.REPOSITORY__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case PersistencePackage.REPOSITORY__FIND_ALL:
				setFindAll((Selection)newValue);
				return;
			case PersistencePackage.REPOSITORY__FIND_ONE:
				setFindOne((Selection)newValue);
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
			case PersistencePackage.REPOSITORY__SERVES:
				setServes((Entity)null);
				return;
			case PersistencePackage.REPOSITORY__SELECTIONS:
				getSelections().clear();
				return;
			case PersistencePackage.REPOSITORY__FIND_ALL:
				setFindAll((Selection)null);
				return;
			case PersistencePackage.REPOSITORY__FIND_ONE:
				setFindOne((Selection)null);
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
			case PersistencePackage.REPOSITORY__SERVES:
				return serves != null;
			case PersistencePackage.REPOSITORY__SELECTIONS:
				return selections != null && !selections.isEmpty();
			case PersistencePackage.REPOSITORY__FIND_ALL:
				return findAll != null;
			case PersistencePackage.REPOSITORY__FIND_ONE:
				return findOne != null;
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
