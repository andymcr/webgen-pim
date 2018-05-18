/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.persistence.EntityOrView;

import work.andycarpenter.webgen.pims.persistence.Label;
import work.andycarpenter.webgen.pims.webui.SingletonUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.SingletonUnitImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.SingletonUnitImpl#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SingletonUnitImpl extends DynamicUnitImpl implements SingletonUnit {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Label title;
	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView contentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingletonUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.SINGLETON_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (Label)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.SINGLETON_UNIT__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Label newTitle) {
		Label oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.SINGLETON_UNIT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (EntityOrView)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.SINGLETON_UNIT__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(EntityOrView newContentType) {
		EntityOrView oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.SINGLETON_UNIT__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.SINGLETON_UNIT__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case WebuiPackage.SINGLETON_UNIT__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
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
			case WebuiPackage.SINGLETON_UNIT__TITLE:
				setTitle((Label)newValue);
				return;
			case WebuiPackage.SINGLETON_UNIT__CONTENT_TYPE:
				setContentType((EntityOrView)newValue);
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
			case WebuiPackage.SINGLETON_UNIT__TITLE:
				setTitle((Label)null);
				return;
			case WebuiPackage.SINGLETON_UNIT__CONTENT_TYPE:
				setContentType((EntityOrView)null);
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
			case WebuiPackage.SINGLETON_UNIT__TITLE:
				return title != null;
			case WebuiPackage.SINGLETON_UNIT__CONTENT_TYPE:
				return contentType != null;
		}
		return super.eIsSet(featureID);
	}

} //SingletonUnitImpl
