/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import work.andycarpenter.webgen.pims.security.AuthorisationExpression;
import work.andycarpenter.webgen.pims.webui.Menu;
import work.andycarpenter.webgen.pims.webui.MenuEntry;
import work.andycarpenter.webgen.pims.webui.SubmenuEntry;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submenu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.SubmenuEntryImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.SubmenuEntryImpl#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.SubmenuEntryImpl#isAlwaysVisible <em>Always Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmenuEntryImpl extends MenuImpl implements SubmenuEntry {
	/**
	 * The cached value of the '{@link #getAuthorisation() <em>Authorisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorisation()
	 * @generated
	 * @ordered
	 */
	protected AuthorisationExpression authorisation;

	/**
	 * The default value of the '{@link #isAlwaysVisible() <em>Always Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlwaysVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALWAYS_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlwaysVisible() <em>Always Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlwaysVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean alwaysVisible = ALWAYS_VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.SUBMENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Menu getPartOf() {
		if (eContainerFeatureID() != WebuiPackage.SUBMENU_ENTRY__PART_OF) return null;
		return (Menu)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Menu newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebuiPackage.SUBMENU_ENTRY__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartOf(Menu newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.SUBMENU_ENTRY__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WebuiPackage.MENU__ENTRIES, Menu.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.SUBMENU_ENTRY__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorisationExpression getAuthorisation() {
		return authorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorisation(AuthorisationExpression newAuthorisation, NotificationChain msgs) {
		AuthorisationExpression oldAuthorisation = authorisation;
		authorisation = newAuthorisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.SUBMENU_ENTRY__AUTHORISATION, oldAuthorisation, newAuthorisation);
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
	public void setAuthorisation(AuthorisationExpression newAuthorisation) {
		if (newAuthorisation != authorisation) {
			NotificationChain msgs = null;
			if (authorisation != null)
				msgs = ((InternalEObject)authorisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.SUBMENU_ENTRY__AUTHORISATION, null, msgs);
			if (newAuthorisation != null)
				msgs = ((InternalEObject)newAuthorisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.SUBMENU_ENTRY__AUTHORISATION, null, msgs);
			msgs = basicSetAuthorisation(newAuthorisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.SUBMENU_ENTRY__AUTHORISATION, newAuthorisation, newAuthorisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAlwaysVisible() {
		return alwaysVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlwaysVisible(boolean newAlwaysVisible) {
		boolean oldAlwaysVisible = alwaysVisible;
		alwaysVisible = newAlwaysVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.SUBMENU_ENTRY__ALWAYS_VISIBLE, oldAlwaysVisible, alwaysVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.SUBMENU_ENTRY__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((Menu)otherEnd, msgs);
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
			case WebuiPackage.SUBMENU_ENTRY__PART_OF:
				return basicSetPartOf(null, msgs);
			case WebuiPackage.SUBMENU_ENTRY__AUTHORISATION:
				return basicSetAuthorisation(null, msgs);
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
			case WebuiPackage.SUBMENU_ENTRY__PART_OF:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.MENU__ENTRIES, Menu.class, msgs);
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
			case WebuiPackage.SUBMENU_ENTRY__PART_OF:
				return getPartOf();
			case WebuiPackage.SUBMENU_ENTRY__AUTHORISATION:
				return getAuthorisation();
			case WebuiPackage.SUBMENU_ENTRY__ALWAYS_VISIBLE:
				return isAlwaysVisible();
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
			case WebuiPackage.SUBMENU_ENTRY__PART_OF:
				setPartOf((Menu)newValue);
				return;
			case WebuiPackage.SUBMENU_ENTRY__AUTHORISATION:
				setAuthorisation((AuthorisationExpression)newValue);
				return;
			case WebuiPackage.SUBMENU_ENTRY__ALWAYS_VISIBLE:
				setAlwaysVisible((Boolean)newValue);
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
			case WebuiPackage.SUBMENU_ENTRY__PART_OF:
				setPartOf((Menu)null);
				return;
			case WebuiPackage.SUBMENU_ENTRY__AUTHORISATION:
				setAuthorisation((AuthorisationExpression)null);
				return;
			case WebuiPackage.SUBMENU_ENTRY__ALWAYS_VISIBLE:
				setAlwaysVisible(ALWAYS_VISIBLE_EDEFAULT);
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
			case WebuiPackage.SUBMENU_ENTRY__PART_OF:
				return getPartOf() != null;
			case WebuiPackage.SUBMENU_ENTRY__AUTHORISATION:
				return authorisation != null;
			case WebuiPackage.SUBMENU_ENTRY__ALWAYS_VISIBLE:
				return alwaysVisible != ALWAYS_VISIBLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MenuEntry.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.SUBMENU_ENTRY__PART_OF: return WebuiPackage.MENU_ENTRY__PART_OF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MenuEntry.class) {
			switch (baseFeatureID) {
				case WebuiPackage.MENU_ENTRY__PART_OF: return WebuiPackage.SUBMENU_ENTRY__PART_OF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (alwaysVisible: ");
		result.append(alwaysVisible);
		result.append(')');
		return result.toString();
	}

} //SubmenuEntryImpl
