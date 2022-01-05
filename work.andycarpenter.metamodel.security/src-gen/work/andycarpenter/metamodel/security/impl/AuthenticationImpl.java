/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import work.andycarpenter.metamodel.orm.Attribute;
import work.andycarpenter.metamodel.orm.Entity;

import work.andycarpenter.metamodel.security.Authentication;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationImpl#getUserModel <em>User Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationImpl#getUserKey <em>User Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AuthenticationImpl extends MinimalEObjectImpl.Container implements Authentication {
	/**
	 * The cached value of the '{@link #getUserModel() <em>User Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserModel()
	 * @generated
	 * @ordered
	 */
	protected Entity userModel;

	/**
	 * The cached value of the '{@link #getUserKey() <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserKey()
	 * @generated
	 * @ordered
	 */
	protected Attribute userKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getUserModel() {
		if (userModel != null && userModel.eIsProxy()) {
			InternalEObject oldUserModel = (InternalEObject)userModel;
			userModel = (Entity)eResolveProxy(oldUserModel);
			if (userModel != oldUserModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.AUTHENTICATION__USER_MODEL, oldUserModel, userModel));
			}
		}
		return userModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetUserModel() {
		return userModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserModel(Entity newUserModel) {
		Entity oldUserModel = userModel;
		userModel = newUserModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__USER_MODEL, oldUserModel, userModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getUserKey() {
		if (userKey != null && userKey.eIsProxy()) {
			InternalEObject oldUserKey = (InternalEObject)userKey;
			userKey = (Attribute)eResolveProxy(oldUserKey);
			if (userKey != oldUserKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.AUTHENTICATION__USER_KEY, oldUserKey, userKey));
			}
		}
		return userKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetUserKey() {
		return userKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserKey(Attribute newUserKey) {
		Attribute oldUserKey = userKey;
		userKey = newUserKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__USER_KEY, oldUserKey, userKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__USER_MODEL:
				if (resolve) return getUserModel();
				return basicGetUserModel();
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				if (resolve) return getUserKey();
				return basicGetUserKey();
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
			case SecurityPackage.AUTHENTICATION__USER_MODEL:
				setUserModel((Entity)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				setUserKey((Attribute)newValue);
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
			case SecurityPackage.AUTHENTICATION__USER_MODEL:
				setUserModel((Entity)null);
				return;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				setUserKey((Attribute)null);
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
			case SecurityPackage.AUTHENTICATION__USER_MODEL:
				return userModel != null;
			case SecurityPackage.AUTHENTICATION__USER_KEY:
				return userKey != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthenticationImpl
