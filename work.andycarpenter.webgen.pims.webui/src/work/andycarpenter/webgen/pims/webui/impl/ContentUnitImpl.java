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
import work.andycarpenter.webgen.pims.security.AuthorisationExpression;
import work.andycarpenter.webgen.pims.webui.ContentUnit;
import work.andycarpenter.webgen.pims.webui.Controller;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getController <em>Controller</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#isCreateDefaultUriElement <em>Create Default Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getUriParent <em>Uri Parent</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getLocalSectionClass <em>Local Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getLocalCaptionClass <em>Local Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ContentUnitImpl#getLocalContentClass <em>Local Content Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentUnitImpl extends NamedDisplayElementImpl implements ContentUnit {
	/**
	 * The default value of the '{@link #isCreateDefaultUriElement() <em>Create Default Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateDefaultUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_DEFAULT_URI_ELEMENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreateDefaultUriElement() <em>Create Default Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateDefaultUriElement()
	 * @generated
	 * @ordered
	 */
	protected boolean createDefaultUriElement = CREATE_DEFAULT_URI_ELEMENT_EDEFAULT;

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
	 * The default value of the '{@link #getPurposeSummary() <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeSummary() <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSummary()
	 * @generated
	 * @ordered
	 */
	protected String purposeSummary = PURPOSE_SUMMARY_EDEFAULT;

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
	 * The cached value of the '{@link #getUriParent() <em>Uri Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriParent()
	 * @generated
	 * @ordered
	 */
	protected ContentUnit uriParent;

	/**
	 * The default value of the '{@link #getAlternative() <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected String alternative = ALTERNATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalSectionClass() <em>Local Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalSectionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_SECTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalSectionClass() <em>Local Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalSectionClass()
	 * @generated
	 * @ordered
	 */
	protected String localSectionClass = LOCAL_SECTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_CAPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected boolean omitCaption = OMIT_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalCaptionClass() <em>Local Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CAPTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalCaptionClass() <em>Local Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected String localCaptionClass = LOCAL_CAPTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalContentClass() <em>Local Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalContentClass() <em>Local Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalContentClass()
	 * @generated
	 * @ordered
	 */
	protected String localContentClass = LOCAL_CONTENT_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CONTENT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreateDefaultUriElement() {
		return createDefaultUriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateDefaultUriElement(boolean newCreateDefaultUriElement) {
		boolean oldCreateDefaultUriElement = createDefaultUriElement;
		createDefaultUriElement = newCreateDefaultUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT, oldCreateDefaultUriElement, createDefaultUriElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__AUTHORISATION, oldAuthorisation, newAuthorisation);
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
				msgs = ((InternalEObject)authorisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.CONTENT_UNIT__AUTHORISATION, null, msgs);
			if (newAuthorisation != null)
				msgs = ((InternalEObject)newAuthorisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.CONTENT_UNIT__AUTHORISATION, null, msgs);
			msgs = basicSetAuthorisation(newAuthorisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__AUTHORISATION, newAuthorisation, newAuthorisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurposeSummary() {
		return purposeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurposeSummary(String newPurposeSummary) {
		String oldPurposeSummary = purposeSummary;
		purposeSummary = newPurposeSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY, oldPurposeSummary, purposeSummary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__URI_ELEMENT, oldUriElement, uriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentUnit getUriParent() {
		if (uriParent != null && uriParent.eIsProxy()) {
			InternalEObject oldUriParent = (InternalEObject)uriParent;
			uriParent = (ContentUnit)eResolveProxy(oldUriParent);
			if (uriParent != oldUriParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.CONTENT_UNIT__URI_PARENT, oldUriParent, uriParent));
			}
		}
		return uriParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentUnit basicGetUriParent() {
		return uriParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriParent(ContentUnit newUriParent) {
		ContentUnit oldUriParent = uriParent;
		uriParent = newUriParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__URI_PARENT, oldUriParent, uriParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlternative() {
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternative(String newAlternative) {
		String oldAlternative = alternative;
		alternative = newAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__ALTERNATIVE, oldAlternative, alternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalSectionClass() {
		return localSectionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalSectionClass(String newLocalSectionClass) {
		String oldLocalSectionClass = localSectionClass;
		localSectionClass = newLocalSectionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__LOCAL_SECTION_CLASS, oldLocalSectionClass, localSectionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOmitCaption() {
		return omitCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOmitCaption(boolean newOmitCaption) {
		boolean oldOmitCaption = omitCaption;
		omitCaption = newOmitCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__OMIT_CAPTION, oldOmitCaption, omitCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalCaptionClass() {
		return localCaptionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalCaptionClass(String newLocalCaptionClass) {
		String oldLocalCaptionClass = localCaptionClass;
		localCaptionClass = newLocalCaptionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS, oldLocalCaptionClass, localCaptionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalContentClass() {
		return localContentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalContentClass(String newLocalContentClass) {
		String oldLocalContentClass = localContentClass;
		localContentClass = newLocalContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS, oldLocalContentClass, localContentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.CONTENT_UNIT__CONTROLLER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetController((Controller)otherEnd, msgs);
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
			case WebuiPackage.CONTENT_UNIT__CONTROLLER:
				return basicSetController(null, msgs);
			case WebuiPackage.CONTENT_UNIT__AUTHORISATION:
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
			case WebuiPackage.CONTENT_UNIT__CONTROLLER:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.CONTROLLER__UNITS, Controller.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getController() {
		if (eContainerFeatureID() != WebuiPackage.CONTENT_UNIT__CONTROLLER) return null;
		return (Controller)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(Controller newController, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newController, WebuiPackage.CONTENT_UNIT__CONTROLLER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setController(Controller newController) {
		if (newController != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.CONTENT_UNIT__CONTROLLER && newController != null)) {
			if (EcoreUtil.isAncestor(this, newController))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newController != null)
				msgs = ((InternalEObject)newController).eInverseAdd(this, WebuiPackage.CONTROLLER__UNITS, Controller.class, msgs);
			msgs = basicSetController(newController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CONTENT_UNIT__CONTROLLER, newController, newController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.CONTENT_UNIT__CONTROLLER:
				return getController();
			case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				return isCreateDefaultUriElement();
			case WebuiPackage.CONTENT_UNIT__AUTHORISATION:
				return getAuthorisation();
			case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY:
				return getPurposeSummary();
			case WebuiPackage.CONTENT_UNIT__URI_ELEMENT:
				return getUriElement();
			case WebuiPackage.CONTENT_UNIT__URI_PARENT:
				if (resolve) return getUriParent();
				return basicGetUriParent();
			case WebuiPackage.CONTENT_UNIT__ALTERNATIVE:
				return getAlternative();
			case WebuiPackage.CONTENT_UNIT__LOCAL_SECTION_CLASS:
				return getLocalSectionClass();
			case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION:
				return isOmitCaption();
			case WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS:
				return getLocalCaptionClass();
			case WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS:
				return getLocalContentClass();
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
			case WebuiPackage.CONTENT_UNIT__CONTROLLER:
				setController((Controller)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				setCreateDefaultUriElement((Boolean)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__AUTHORISATION:
				setAuthorisation((AuthorisationExpression)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY:
				setPurposeSummary((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__URI_PARENT:
				setUriParent((ContentUnit)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__ALTERNATIVE:
				setAlternative((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_SECTION_CLASS:
				setLocalSectionClass((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION:
				setOmitCaption((Boolean)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS:
				setLocalCaptionClass((String)newValue);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS:
				setLocalContentClass((String)newValue);
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
			case WebuiPackage.CONTENT_UNIT__CONTROLLER:
				setController((Controller)null);
				return;
			case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				setCreateDefaultUriElement(CREATE_DEFAULT_URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__AUTHORISATION:
				setAuthorisation((AuthorisationExpression)null);
				return;
			case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY:
				setPurposeSummary(PURPOSE_SUMMARY_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__URI_PARENT:
				setUriParent((ContentUnit)null);
				return;
			case WebuiPackage.CONTENT_UNIT__ALTERNATIVE:
				setAlternative(ALTERNATIVE_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_SECTION_CLASS:
				setLocalSectionClass(LOCAL_SECTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION:
				setOmitCaption(OMIT_CAPTION_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS:
				setLocalCaptionClass(LOCAL_CAPTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS:
				setLocalContentClass(LOCAL_CONTENT_CLASS_EDEFAULT);
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
			case WebuiPackage.CONTENT_UNIT__CONTROLLER:
				return getController() != null;
			case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				return createDefaultUriElement != CREATE_DEFAULT_URI_ELEMENT_EDEFAULT;
			case WebuiPackage.CONTENT_UNIT__AUTHORISATION:
				return authorisation != null;
			case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY:
				return PURPOSE_SUMMARY_EDEFAULT == null ? purposeSummary != null : !PURPOSE_SUMMARY_EDEFAULT.equals(purposeSummary);
			case WebuiPackage.CONTENT_UNIT__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case WebuiPackage.CONTENT_UNIT__URI_PARENT:
				return uriParent != null;
			case WebuiPackage.CONTENT_UNIT__ALTERNATIVE:
				return ALTERNATIVE_EDEFAULT == null ? alternative != null : !ALTERNATIVE_EDEFAULT.equals(alternative);
			case WebuiPackage.CONTENT_UNIT__LOCAL_SECTION_CLASS:
				return LOCAL_SECTION_CLASS_EDEFAULT == null ? localSectionClass != null : !LOCAL_SECTION_CLASS_EDEFAULT.equals(localSectionClass);
			case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION:
				return omitCaption != OMIT_CAPTION_EDEFAULT;
			case WebuiPackage.CONTENT_UNIT__LOCAL_CAPTION_CLASS:
				return LOCAL_CAPTION_CLASS_EDEFAULT == null ? localCaptionClass != null : !LOCAL_CAPTION_CLASS_EDEFAULT.equals(localCaptionClass);
			case WebuiPackage.CONTENT_UNIT__LOCAL_CONTENT_CLASS:
				return LOCAL_CONTENT_CLASS_EDEFAULT == null ? localContentClass != null : !LOCAL_CONTENT_CLASS_EDEFAULT.equals(localContentClass);
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
		result.append(" (createDefaultUriElement: ");
		result.append(createDefaultUriElement);
		result.append(", purposeSummary: ");
		result.append(purposeSummary);
		result.append(", uriElement: ");
		result.append(uriElement);
		result.append(", alternative: ");
		result.append(alternative);
		result.append(", localSectionClass: ");
		result.append(localSectionClass);
		result.append(", omitCaption: ");
		result.append(omitCaption);
		result.append(", localCaptionClass: ");
		result.append(localCaptionClass);
		result.append(", localContentClass: ");
		result.append(localContentClass);
		result.append(')');
		return result.toString();
	}

} //ContentUnitImpl
