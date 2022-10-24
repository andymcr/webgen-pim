/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import work.andycarpenter.webgen.pims.webui.Controller;
import work.andycarpenter.webgen.pims.webui.ControllerLink;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ControllerLinkImpl#getTargetController <em>Target Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerLinkImpl extends MinimalEObjectImpl.Container implements ControllerLink {
	/**
	 * The cached value of the '{@link #getTargetController() <em>Target Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetController()
	 * @generated
	 * @ordered
	 */
	protected Controller targetController;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CONTROLLER_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getTargetController() {
		if (targetController != null && targetController.eIsProxy()) {
			InternalEObject oldTargetController = (InternalEObject)targetController;
			targetController = (Controller)eResolveProxy(oldTargetController);
			if (targetController != oldTargetController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER, oldTargetController, targetController));
			}
		}
		return targetController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetTargetController() {
		return targetController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetController(Controller newTargetController, NotificationChain msgs) {
		Controller oldTargetController = targetController;
		targetController = newTargetController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER, oldTargetController, newTargetController);
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
	public void setTargetController(Controller newTargetController) {
		if (newTargetController != targetController) {
			NotificationChain msgs = null;
			if (targetController != null)
				msgs = ((InternalEObject)targetController).eInverseRemove(this, WebuiPackage.CONTROLLER__CHILD_CONTROLLERS, Controller.class, msgs);
			if (newTargetController != null)
				msgs = ((InternalEObject)newTargetController).eInverseAdd(this, WebuiPackage.CONTROLLER__CHILD_CONTROLLERS, Controller.class, msgs);
			msgs = basicSetTargetController(newTargetController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER, newTargetController, newTargetController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER:
				if (targetController != null)
					msgs = ((InternalEObject)targetController).eInverseRemove(this, WebuiPackage.CONTROLLER__CHILD_CONTROLLERS, Controller.class, msgs);
				return basicSetTargetController((Controller)otherEnd, msgs);
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
			case WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER:
				return basicSetTargetController(null, msgs);
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
			case WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER:
				if (resolve) return getTargetController();
				return basicGetTargetController();
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
			case WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER:
				setTargetController((Controller)newValue);
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
			case WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER:
				setTargetController((Controller)null);
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
			case WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER:
				return targetController != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerLinkImpl
