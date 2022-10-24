/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl;

import work.andycarpenter.webgen.pims.webui.ContentUnit;
import work.andycarpenter.webgen.pims.webui.Controller;
import work.andycarpenter.webgen.pims.webui.ControllerLink;
import work.andycarpenter.webgen.pims.webui.WebUI;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ControllerImpl#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ControllerImpl#getParentController <em>Parent Controller</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ControllerImpl#getChildControllers <em>Child Controllers</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ControllerImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ControllerImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ControllerImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControllerImpl extends NamedDisplayElementImpl implements Controller {
	/**
	 * The cached value of the '{@link #getParentController() <em>Parent Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentController()
	 * @generated
	 * @ordered
	 */
	protected ControllerLink parentController;

	/**
	 * The cached value of the '{@link #getChildControllers() <em>Child Controllers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerLink> childControllers;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentUnit> units;

	/**
	 * The default value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_ELEMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected String uriElement = URI_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebUI getWebUI() {
		if (eContainerFeatureID() != WebuiPackage.CONTROLLER__WEB_UI) return null;
		return (WebUI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebUI(WebUI newWebUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWebUI, WebuiPackage.CONTROLLER__WEB_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUI(WebUI newWebUI) {
		if (newWebUI != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.CONTROLLER__WEB_UI && newWebUI != null)) {
			if (EcoreUtil.isAncestor(this, newWebUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWebUI != null)
				msgs = ((InternalEObject)newWebUI).eInverseAdd(this, WebuiPackage.WEB_UI__CONTROLLERS, WebUI.class, msgs);
			msgs = basicSetWebUI(newWebUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTROLLER__WEB_UI, newWebUI, newWebUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControllerLink getParentController() {
		return parentController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentController(ControllerLink newParentController, NotificationChain msgs) {
		ControllerLink oldParentController = parentController;
		parentController = newParentController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTROLLER__PARENT_CONTROLLER, oldParentController, newParentController);
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
	public void setParentController(ControllerLink newParentController) {
		if (newParentController != parentController) {
			NotificationChain msgs = null;
			if (parentController != null)
				msgs = ((InternalEObject)parentController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.CONTROLLER__PARENT_CONTROLLER, null, msgs);
			if (newParentController != null)
				msgs = ((InternalEObject)newParentController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.CONTROLLER__PARENT_CONTROLLER, null, msgs);
			msgs = basicSetParentController(newParentController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTROLLER__PARENT_CONTROLLER, newParentController, newParentController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControllerLink> getChildControllers() {
		if (childControllers == null) {
			childControllers = new EObjectWithInverseResolvingEList<ControllerLink>(ControllerLink.class, this, WebuiPackage.CONTROLLER__CHILD_CONTROLLERS, WebuiPackage.CONTROLLER_LINK__TARGET_CONTROLLER);
		}
		return childControllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentUnit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentWithInverseEList<ContentUnit>(ContentUnit.class, this, WebuiPackage.CONTROLLER__UNITS, WebuiPackage.CONTENT_UNIT__CONTROLLER);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriElement() {
		return uriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriElement(String newUriElement) {
		String oldUriElement = uriElement;
		uriElement = newUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTROLLER__URI_ELEMENT, oldUriElement, uriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTROLLER__STYLE_CLASS, oldStyleClass, styleClass));
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
			case WebuiPackage.CONTROLLER__WEB_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWebUI((WebUI)otherEnd, msgs);
			case WebuiPackage.CONTROLLER__CHILD_CONTROLLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildControllers()).basicAdd(otherEnd, msgs);
			case WebuiPackage.CONTROLLER__UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnits()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.CONTROLLER__WEB_UI:
				return basicSetWebUI(null, msgs);
			case WebuiPackage.CONTROLLER__PARENT_CONTROLLER:
				return basicSetParentController(null, msgs);
			case WebuiPackage.CONTROLLER__CHILD_CONTROLLERS:
				return ((InternalEList<?>)getChildControllers()).basicRemove(otherEnd, msgs);
			case WebuiPackage.CONTROLLER__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebuiPackage.CONTROLLER__WEB_UI:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.WEB_UI__CONTROLLERS, WebUI.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.CONTROLLER__WEB_UI:
				return getWebUI();
			case WebuiPackage.CONTROLLER__PARENT_CONTROLLER:
				return getParentController();
			case WebuiPackage.CONTROLLER__CHILD_CONTROLLERS:
				return getChildControllers();
			case WebuiPackage.CONTROLLER__UNITS:
				return getUnits();
			case WebuiPackage.CONTROLLER__URI_ELEMENT:
				return getUriElement();
			case WebuiPackage.CONTROLLER__STYLE_CLASS:
				return getStyleClass();
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
			case WebuiPackage.CONTROLLER__WEB_UI:
				setWebUI((WebUI)newValue);
				return;
			case WebuiPackage.CONTROLLER__PARENT_CONTROLLER:
				setParentController((ControllerLink)newValue);
				return;
			case WebuiPackage.CONTROLLER__CHILD_CONTROLLERS:
				getChildControllers().clear();
				getChildControllers().addAll((Collection<? extends ControllerLink>)newValue);
				return;
			case WebuiPackage.CONTROLLER__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends ContentUnit>)newValue);
				return;
			case WebuiPackage.CONTROLLER__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case WebuiPackage.CONTROLLER__STYLE_CLASS:
				setStyleClass((String)newValue);
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
			case WebuiPackage.CONTROLLER__WEB_UI:
				setWebUI((WebUI)null);
				return;
			case WebuiPackage.CONTROLLER__PARENT_CONTROLLER:
				setParentController((ControllerLink)null);
				return;
			case WebuiPackage.CONTROLLER__CHILD_CONTROLLERS:
				getChildControllers().clear();
				return;
			case WebuiPackage.CONTROLLER__UNITS:
				getUnits().clear();
				return;
			case WebuiPackage.CONTROLLER__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.CONTROLLER__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
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
			case WebuiPackage.CONTROLLER__WEB_UI:
				return getWebUI() != null;
			case WebuiPackage.CONTROLLER__PARENT_CONTROLLER:
				return parentController != null;
			case WebuiPackage.CONTROLLER__CHILD_CONTROLLERS:
				return childControllers != null && !childControllers.isEmpty();
			case WebuiPackage.CONTROLLER__UNITS:
				return units != null && !units.isEmpty();
			case WebuiPackage.CONTROLLER__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case WebuiPackage.CONTROLLER__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uriElement: ");
		result.append(uriElement);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
