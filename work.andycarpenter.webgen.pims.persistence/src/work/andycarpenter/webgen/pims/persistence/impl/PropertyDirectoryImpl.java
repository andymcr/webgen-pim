/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.PropertyDirectory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.PropertyDirectoryImpl#getAttribte <em>Attribte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyDirectoryImpl extends DirectoryNamerImpl implements PropertyDirectory {
	/**
	 * The cached value of the '{@link #getAttribte() <em>Attribte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribte()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyDirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.PROPERTY_DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttribte() {
		if (attribte != null && attribte.eIsProxy()) {
			InternalEObject oldAttribte = (InternalEObject)attribte;
			attribte = (Attribute)eResolveProxy(oldAttribte);
			if (attribte != oldAttribte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.PROPERTY_DIRECTORY__ATTRIBTE, oldAttribte, attribte));
			}
		}
		return attribte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribte() {
		return attribte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribte(Attribute newAttribte) {
		Attribute oldAttribte = attribte;
		attribte = newAttribte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PROPERTY_DIRECTORY__ATTRIBTE, oldAttribte, attribte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.PROPERTY_DIRECTORY__ATTRIBTE:
				if (resolve) return getAttribte();
				return basicGetAttribte();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.PROPERTY_DIRECTORY__ATTRIBTE:
				setAttribte((Attribute)newValue);
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
			case PersistencePackage.PROPERTY_DIRECTORY__ATTRIBTE:
				setAttribte((Attribute)null);
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
			case PersistencePackage.PROPERTY_DIRECTORY__ATTRIBTE:
				return attribte != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyDirectoryImpl
