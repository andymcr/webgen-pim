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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.webui.AuthenticationMenuPlacement;
import work.andycarpenter.webgen.pims.webui.Menu;
import work.andycarpenter.webgen.pims.webui.Navigation;
import work.andycarpenter.webgen.pims.webui.WebUI;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.NavigationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.NavigationImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.NavigationImpl#getNavbarClass <em>Navbar Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.NavigationImpl#getAuthenticationMenuPlacement <em>Authentication Menu Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.NavigationImpl#getAuthenticationBarClass <em>Authentication Bar Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationImpl extends MinimalEObjectImpl.Container implements Navigation {
	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

	/**
	 * The default value of the '{@link #getNavbarClass() <em>Navbar Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavbarClass()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVBAR_CLASS_EDEFAULT = "navbar";

	/**
	 * The cached value of the '{@link #getNavbarClass() <em>Navbar Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavbarClass()
	 * @generated
	 * @ordered
	 */
	protected String navbarClass = NAVBAR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationMenuPlacement() <em>Authentication Menu Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMenuPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationMenuPlacement AUTHENTICATION_MENU_PLACEMENT_EDEFAULT = AuthenticationMenuPlacement.ABOVE;

	/**
	 * The cached value of the '{@link #getAuthenticationMenuPlacement() <em>Authentication Menu Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMenuPlacement()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationMenuPlacement authenticationMenuPlacement = AUTHENTICATION_MENU_PLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationBarClass() <em>Authentication Bar Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationBarClass()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_BAR_CLASS_EDEFAULT = "nav";

	/**
	 * The cached value of the '{@link #getAuthenticationBarClass() <em>Authentication Bar Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationBarClass()
	 * @generated
	 * @ordered
	 */
	protected String authenticationBarClass = AUTHENTICATION_BAR_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebUI getPartOf() {
		if (eContainerFeatureID() != WebuiPackage.NAVIGATION__PART_OF) return null;
		return (WebUI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(WebUI newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebuiPackage.NAVIGATION__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartOf(WebUI newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.NAVIGATION__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WebuiPackage.WEB_UI__NAVIGATION, WebUI.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.NAVIGATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, WebuiPackage.NAVIGATION__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNavbarClass() {
		return navbarClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavbarClass(String newNavbarClass) {
		String oldNavbarClass = navbarClass;
		navbarClass = newNavbarClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.NAVIGATION__NAVBAR_CLASS, oldNavbarClass, navbarClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationMenuPlacement getAuthenticationMenuPlacement() {
		return authenticationMenuPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationMenuPlacement(AuthenticationMenuPlacement newAuthenticationMenuPlacement) {
		AuthenticationMenuPlacement oldAuthenticationMenuPlacement = authenticationMenuPlacement;
		authenticationMenuPlacement = newAuthenticationMenuPlacement == null ? AUTHENTICATION_MENU_PLACEMENT_EDEFAULT : newAuthenticationMenuPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.NAVIGATION__AUTHENTICATION_MENU_PLACEMENT, oldAuthenticationMenuPlacement, authenticationMenuPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthenticationBarClass() {
		return authenticationBarClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationBarClass(String newAuthenticationBarClass) {
		String oldAuthenticationBarClass = authenticationBarClass;
		authenticationBarClass = newAuthenticationBarClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.NAVIGATION__AUTHENTICATION_BAR_CLASS, oldAuthenticationBarClass, authenticationBarClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.NAVIGATION__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((WebUI)otherEnd, msgs);
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
			case WebuiPackage.NAVIGATION__PART_OF:
				return basicSetPartOf(null, msgs);
			case WebuiPackage.NAVIGATION__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
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
			case WebuiPackage.NAVIGATION__PART_OF:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.WEB_UI__NAVIGATION, WebUI.class, msgs);
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
			case WebuiPackage.NAVIGATION__PART_OF:
				return getPartOf();
			case WebuiPackage.NAVIGATION__MENUS:
				return getMenus();
			case WebuiPackage.NAVIGATION__NAVBAR_CLASS:
				return getNavbarClass();
			case WebuiPackage.NAVIGATION__AUTHENTICATION_MENU_PLACEMENT:
				return getAuthenticationMenuPlacement();
			case WebuiPackage.NAVIGATION__AUTHENTICATION_BAR_CLASS:
				return getAuthenticationBarClass();
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
			case WebuiPackage.NAVIGATION__PART_OF:
				setPartOf((WebUI)newValue);
				return;
			case WebuiPackage.NAVIGATION__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case WebuiPackage.NAVIGATION__NAVBAR_CLASS:
				setNavbarClass((String)newValue);
				return;
			case WebuiPackage.NAVIGATION__AUTHENTICATION_MENU_PLACEMENT:
				setAuthenticationMenuPlacement((AuthenticationMenuPlacement)newValue);
				return;
			case WebuiPackage.NAVIGATION__AUTHENTICATION_BAR_CLASS:
				setAuthenticationBarClass((String)newValue);
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
			case WebuiPackage.NAVIGATION__PART_OF:
				setPartOf((WebUI)null);
				return;
			case WebuiPackage.NAVIGATION__MENUS:
				getMenus().clear();
				return;
			case WebuiPackage.NAVIGATION__NAVBAR_CLASS:
				setNavbarClass(NAVBAR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.NAVIGATION__AUTHENTICATION_MENU_PLACEMENT:
				setAuthenticationMenuPlacement(AUTHENTICATION_MENU_PLACEMENT_EDEFAULT);
				return;
			case WebuiPackage.NAVIGATION__AUTHENTICATION_BAR_CLASS:
				setAuthenticationBarClass(AUTHENTICATION_BAR_CLASS_EDEFAULT);
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
			case WebuiPackage.NAVIGATION__PART_OF:
				return getPartOf() != null;
			case WebuiPackage.NAVIGATION__MENUS:
				return menus != null && !menus.isEmpty();
			case WebuiPackage.NAVIGATION__NAVBAR_CLASS:
				return NAVBAR_CLASS_EDEFAULT == null ? navbarClass != null : !NAVBAR_CLASS_EDEFAULT.equals(navbarClass);
			case WebuiPackage.NAVIGATION__AUTHENTICATION_MENU_PLACEMENT:
				return authenticationMenuPlacement != AUTHENTICATION_MENU_PLACEMENT_EDEFAULT;
			case WebuiPackage.NAVIGATION__AUTHENTICATION_BAR_CLASS:
				return AUTHENTICATION_BAR_CLASS_EDEFAULT == null ? authenticationBarClass != null : !AUTHENTICATION_BAR_CLASS_EDEFAULT.equals(authenticationBarClass);
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
		result.append(" (navbarClass: ");
		result.append(navbarClass);
		result.append(", authenticationMenuPlacement: ");
		result.append(authenticationMenuPlacement);
		result.append(", authenticationBarClass: ");
		result.append(authenticationBarClass);
		result.append(')');
		return result.toString();
	}

} //NavigationImpl
