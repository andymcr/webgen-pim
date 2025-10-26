/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import work.andycarpenter.webgen.pims.base.impl.NamedElementImpl;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.webui.CollectionFilter;
import work.andycarpenter.webgen.pims.webui.CollectionUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionFilterImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionFilterImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionFilterImpl#getPlaceholderOverride <em>Placeholder Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionFilterImpl#getTitleOverride <em>Title Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionFilterImpl#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CollectionFilterImpl extends NamedElementImpl implements CollectionFilter {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;
	/**
	 * The default value of the '{@link #getPlaceholderOverride() <em>Placeholder Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_OVERRIDE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getPlaceholderOverride() <em>Placeholder Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderOverride()
	 * @generated
	 * @ordered
	 */
	protected String placeholderOverride = PLACEHOLDER_OVERRIDE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTitleOverride() <em>Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_OVERRIDE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getTitleOverride() <em>Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOverride()
	 * @generated
	 * @ordered
	 */
	protected String titleOverride = TITLE_OVERRIDE_EDEFAULT;
	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected String help = HELP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.COLLECTION_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionUnit getAffects() {
		if (eContainerFeatureID() != WebuiPackage.COLLECTION_FILTER__AFFECTS) return null;
		return (CollectionUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffects(CollectionUnit newAffects, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAffects, WebuiPackage.COLLECTION_FILTER__AFFECTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffects(CollectionUnit newAffects) {
		if (newAffects != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.COLLECTION_FILTER__AFFECTS && newAffects != null)) {
			if (EcoreUtil.isAncestor(this, newAffects))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAffects != null)
				msgs = ((InternalEObject)newAffects).eInverseAdd(this, WebuiPackage.COLLECTION_UNIT__FILTERS, CollectionUnit.class, msgs);
			msgs = basicSetAffects(newAffects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_FILTER__AFFECTS, newAffects, newAffects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.COLLECTION_FILTER__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_FILTER__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlaceholderOverride() {
		return placeholderOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceholderOverride(String newPlaceholderOverride) {
		String oldPlaceholderOverride = placeholderOverride;
		placeholderOverride = newPlaceholderOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_FILTER__PLACEHOLDER_OVERRIDE, oldPlaceholderOverride, placeholderOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleOverride() {
		return titleOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleOverride(String newTitleOverride) {
		String oldTitleOverride = titleOverride;
		titleOverride = newTitleOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_FILTER__TITLE_OVERRIDE, oldTitleOverride, titleOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelp(String newHelp) {
		String oldHelp = help;
		help = newHelp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_FILTER__HELP, oldHelp, help));
	}

	/**
	 * The cached invocation delegate for the '{@link #referencableEntities() <em>Referencable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #referencableEntities()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REFERENCABLE_ENTITIES__EINVOCATION_DELEGATE = ((EOperation.Internal)WebuiPackage.Literals.COLLECTION_FILTER___REFERENCABLE_ENTITIES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entity> referencableEntities() {
		try {
			return (EList<Entity>)REFERENCABLE_ENTITIES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.COLLECTION_FILTER__AFFECTS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAffects((CollectionUnit)otherEnd, msgs);
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
			case WebuiPackage.COLLECTION_FILTER__AFFECTS:
				return basicSetAffects(null, msgs);
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
			case WebuiPackage.COLLECTION_FILTER__AFFECTS:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.COLLECTION_UNIT__FILTERS, CollectionUnit.class, msgs);
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
			case WebuiPackage.COLLECTION_FILTER__AFFECTS:
				return getAffects();
			case WebuiPackage.COLLECTION_FILTER__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case WebuiPackage.COLLECTION_FILTER__PLACEHOLDER_OVERRIDE:
				return getPlaceholderOverride();
			case WebuiPackage.COLLECTION_FILTER__TITLE_OVERRIDE:
				return getTitleOverride();
			case WebuiPackage.COLLECTION_FILTER__HELP:
				return getHelp();
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
			case WebuiPackage.COLLECTION_FILTER__AFFECTS:
				setAffects((CollectionUnit)newValue);
				return;
			case WebuiPackage.COLLECTION_FILTER__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case WebuiPackage.COLLECTION_FILTER__PLACEHOLDER_OVERRIDE:
				setPlaceholderOverride((String)newValue);
				return;
			case WebuiPackage.COLLECTION_FILTER__TITLE_OVERRIDE:
				setTitleOverride((String)newValue);
				return;
			case WebuiPackage.COLLECTION_FILTER__HELP:
				setHelp((String)newValue);
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
			case WebuiPackage.COLLECTION_FILTER__AFFECTS:
				setAffects((CollectionUnit)null);
				return;
			case WebuiPackage.COLLECTION_FILTER__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case WebuiPackage.COLLECTION_FILTER__PLACEHOLDER_OVERRIDE:
				setPlaceholderOverride(PLACEHOLDER_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_FILTER__TITLE_OVERRIDE:
				setTitleOverride(TITLE_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_FILTER__HELP:
				setHelp(HELP_EDEFAULT);
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
			case WebuiPackage.COLLECTION_FILTER__AFFECTS:
				return getAffects() != null;
			case WebuiPackage.COLLECTION_FILTER__ATTRIBUTE:
				return attribute != null;
			case WebuiPackage.COLLECTION_FILTER__PLACEHOLDER_OVERRIDE:
				return PLACEHOLDER_OVERRIDE_EDEFAULT == null ? placeholderOverride != null : !PLACEHOLDER_OVERRIDE_EDEFAULT.equals(placeholderOverride);
			case WebuiPackage.COLLECTION_FILTER__TITLE_OVERRIDE:
				return TITLE_OVERRIDE_EDEFAULT == null ? titleOverride != null : !TITLE_OVERRIDE_EDEFAULT.equals(titleOverride);
			case WebuiPackage.COLLECTION_FILTER__HELP:
				return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebuiPackage.COLLECTION_FILTER___REFERENCABLE_ENTITIES:
				return referencableEntities();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (placeholderOverride: ");
		result.append(placeholderOverride);
		result.append(", titleOverride: ");
		result.append(titleOverride);
		result.append(", help: ");
		result.append(help);
		result.append(')');
		return result.toString();
	}

} //CollectionFilterImpl
