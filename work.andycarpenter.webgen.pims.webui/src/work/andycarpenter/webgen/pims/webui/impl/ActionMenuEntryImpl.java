/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl;
import work.andycarpenter.webgen.pims.webui.ActionMenuEntry;
import work.andycarpenter.webgen.pims.webui.ContentUnit;
import work.andycarpenter.webgen.pims.webui.Menu;
import work.andycarpenter.webgen.pims.webui.MenuEntry;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionMenuEntryImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionMenuEntryImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionMenuEntryImpl#isAlwaysVisible <em>Always Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionMenuEntryImpl extends NamedDisplayElementImpl implements ActionMenuEntry {
	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected ContentUnit destination;

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
	protected ActionMenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.ACTION_MENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Menu getPartOf() {
		if (eContainerFeatureID() != WebuiPackage.ACTION_MENU_ENTRY__PART_OF) return null;
		return (Menu)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Menu newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebuiPackage.ACTION_MENU_ENTRY__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartOf(Menu newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.ACTION_MENU_ENTRY__PART_OF && newPartOf != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION_MENU_ENTRY__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentUnit getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (ContentUnit)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.ACTION_MENU_ENTRY__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentUnit basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(ContentUnit newDestination) {
		ContentUnit oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION_MENU_ENTRY__DESTINATION, oldDestination, destination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION_MENU_ENTRY__ALWAYS_VISIBLE, oldAlwaysVisible, alwaysVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.ACTION_MENU_ENTRY__PART_OF:
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
			case WebuiPackage.ACTION_MENU_ENTRY__PART_OF:
				return basicSetPartOf(null, msgs);
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
			case WebuiPackage.ACTION_MENU_ENTRY__PART_OF:
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
			case WebuiPackage.ACTION_MENU_ENTRY__PART_OF:
				return getPartOf();
			case WebuiPackage.ACTION_MENU_ENTRY__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case WebuiPackage.ACTION_MENU_ENTRY__ALWAYS_VISIBLE:
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
			case WebuiPackage.ACTION_MENU_ENTRY__PART_OF:
				setPartOf((Menu)newValue);
				return;
			case WebuiPackage.ACTION_MENU_ENTRY__DESTINATION:
				setDestination((ContentUnit)newValue);
				return;
			case WebuiPackage.ACTION_MENU_ENTRY__ALWAYS_VISIBLE:
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
			case WebuiPackage.ACTION_MENU_ENTRY__PART_OF:
				setPartOf((Menu)null);
				return;
			case WebuiPackage.ACTION_MENU_ENTRY__DESTINATION:
				setDestination((ContentUnit)null);
				return;
			case WebuiPackage.ACTION_MENU_ENTRY__ALWAYS_VISIBLE:
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
			case WebuiPackage.ACTION_MENU_ENTRY__PART_OF:
				return getPartOf() != null;
			case WebuiPackage.ACTION_MENU_ENTRY__DESTINATION:
				return destination != null;
			case WebuiPackage.ACTION_MENU_ENTRY__ALWAYS_VISIBLE:
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
				case WebuiPackage.ACTION_MENU_ENTRY__PART_OF: return WebuiPackage.MENU_ENTRY__PART_OF;
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
				case WebuiPackage.MENU_ENTRY__PART_OF: return WebuiPackage.ACTION_MENU_ENTRY__PART_OF;
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

} //ActionMenuEntryImpl
