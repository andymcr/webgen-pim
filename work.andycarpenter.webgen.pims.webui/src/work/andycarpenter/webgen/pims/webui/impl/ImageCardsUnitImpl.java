/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.image.ImageManipulation;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.ImageCardsUnit;
import work.andycarpenter.webgen.pims.webui.ImageUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl#getImagePathFeature <em>Image Path Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl#getMissingImagePath <em>Missing Image Path</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl#getShowMissingImageWhen <em>Show Missing Image When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl#getImageFilter <em>Image Filter</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl#isOverlayTitle <em>Overlay Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl#isEnableImageEnlargement <em>Enable Image Enlargement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ImageCardsUnitImpl#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageCardsUnitImpl extends CardsUnitImpl implements ImageCardsUnit {
	/**
	 * The cached value of the '{@link #getImagePathFeature() <em>Image Path Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathFeature()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath imagePathFeature;

	/**
	 * The default value of the '{@link #getMissingImagePath() <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissingImagePath() <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImagePath()
	 * @generated
	 * @ordered
	 */
	protected String missingImagePath = MISSING_IMAGE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShowMissingImageWhen() <em>Show Missing Image When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowMissingImageWhen()
	 * @generated
	 * @ordered
	 */
	protected Predicate showMissingImageWhen;

	/**
	 * The cached value of the '{@link #getImageFilter() <em>Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFilter()
	 * @generated
	 * @ordered
	 */
	protected ImageManipulation imageFilter;

	/**
	 * The default value of the '{@link #isOverlayTitle() <em>Overlay Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverlayTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERLAY_TITLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverlayTitle() <em>Overlay Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverlayTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean overlayTitle = OVERLAY_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableImageEnlargement() <em>Enable Image Enlargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableImageEnlargement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_IMAGE_ENLARGEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableImageEnlargement() <em>Enable Image Enlargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableImageEnlargement()
	 * @generated
	 * @ordered
	 */
	protected boolean enableImageEnlargement = ENABLE_IMAGE_ENLARGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRevealUntruncatedContent() <em>Reveal Untruncated Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRevealUntruncatedContent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVEAL_UNTRUNCATED_CONTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRevealUntruncatedContent() <em>Reveal Untruncated Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRevealUntruncatedContent()
	 * @generated
	 * @ordered
	 */
	protected boolean revealUntruncatedContent = REVEAL_UNTRUNCATED_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageCardsUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.IMAGE_CARDS_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePath getImagePathFeature() {
		return imagePathFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePathFeature(FeaturePath newImagePathFeature, NotificationChain msgs) {
		FeaturePath oldImagePathFeature = imagePathFeature;
		imagePathFeature = newImagePathFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE, oldImagePathFeature, newImagePathFeature);
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
	public void setImagePathFeature(FeaturePath newImagePathFeature) {
		if (newImagePathFeature != imagePathFeature) {
			NotificationChain msgs = null;
			if (imagePathFeature != null)
				msgs = ((InternalEObject)imagePathFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE, null, msgs);
			if (newImagePathFeature != null)
				msgs = ((InternalEObject)newImagePathFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE, null, msgs);
			msgs = basicSetImagePathFeature(newImagePathFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE, newImagePathFeature, newImagePathFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageManipulation getImageFilter() {
		if (imageFilter != null && imageFilter.eIsProxy()) {
			InternalEObject oldImageFilter = (InternalEObject)imageFilter;
			imageFilter = (ImageManipulation)eResolveProxy(oldImageFilter);
			if (imageFilter != oldImageFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_FILTER, oldImageFilter, imageFilter));
			}
		}
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation basicGetImageFilter() {
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageFilter(ImageManipulation newImageFilter) {
		ImageManipulation oldImageFilter = imageFilter;
		imageFilter = newImageFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_FILTER, oldImageFilter, imageFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMissingImagePath() {
		return missingImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMissingImagePath(String newMissingImagePath) {
		String oldMissingImagePath = missingImagePath;
		missingImagePath = newMissingImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH, oldMissingImagePath, missingImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getShowMissingImageWhen() {
		return showMissingImageWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShowMissingImageWhen(Predicate newShowMissingImageWhen, NotificationChain msgs) {
		Predicate oldShowMissingImageWhen = showMissingImageWhen;
		showMissingImageWhen = newShowMissingImageWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN, oldShowMissingImageWhen, newShowMissingImageWhen);
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
	public void setShowMissingImageWhen(Predicate newShowMissingImageWhen) {
		if (newShowMissingImageWhen != showMissingImageWhen) {
			NotificationChain msgs = null;
			if (showMissingImageWhen != null)
				msgs = ((InternalEObject)showMissingImageWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN, null, msgs);
			if (newShowMissingImageWhen != null)
				msgs = ((InternalEObject)newShowMissingImageWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN, null, msgs);
			msgs = basicSetShowMissingImageWhen(newShowMissingImageWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN, newShowMissingImageWhen, newShowMissingImageWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOverlayTitle() {
		return overlayTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverlayTitle(boolean newOverlayTitle) {
		boolean oldOverlayTitle = overlayTitle;
		overlayTitle = newOverlayTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__OVERLAY_TITLE, oldOverlayTitle, overlayTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableImageEnlargement() {
		return enableImageEnlargement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableImageEnlargement(boolean newEnableImageEnlargement) {
		boolean oldEnableImageEnlargement = enableImageEnlargement;
		enableImageEnlargement = newEnableImageEnlargement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT, oldEnableImageEnlargement, enableImageEnlargement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRevealUntruncatedContent() {
		return revealUntruncatedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevealUntruncatedContent(boolean newRevealUntruncatedContent) {
		boolean oldRevealUntruncatedContent = revealUntruncatedContent;
		revealUntruncatedContent = newRevealUntruncatedContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT, oldRevealUntruncatedContent, revealUntruncatedContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE:
				return basicSetImagePathFeature(null, msgs);
			case WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN:
				return basicSetShowMissingImageWhen(null, msgs);
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
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE:
				return getImagePathFeature();
			case WebuiPackage.IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH:
				return getMissingImagePath();
			case WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN:
				return getShowMissingImageWhen();
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_FILTER:
				if (resolve) return getImageFilter();
				return basicGetImageFilter();
			case WebuiPackage.IMAGE_CARDS_UNIT__OVERLAY_TITLE:
				return isOverlayTitle();
			case WebuiPackage.IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT:
				return isEnableImageEnlargement();
			case WebuiPackage.IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT:
				return isRevealUntruncatedContent();
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
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE:
				setImagePathFeature((FeaturePath)newValue);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH:
				setMissingImagePath((String)newValue);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN:
				setShowMissingImageWhen((Predicate)newValue);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_FILTER:
				setImageFilter((ImageManipulation)newValue);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__OVERLAY_TITLE:
				setOverlayTitle((Boolean)newValue);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT:
				setEnableImageEnlargement((Boolean)newValue);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT:
				setRevealUntruncatedContent((Boolean)newValue);
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
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE:
				setImagePathFeature((FeaturePath)null);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH:
				setMissingImagePath(MISSING_IMAGE_PATH_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN:
				setShowMissingImageWhen((Predicate)null);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_FILTER:
				setImageFilter((ImageManipulation)null);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__OVERLAY_TITLE:
				setOverlayTitle(OVERLAY_TITLE_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT:
				setEnableImageEnlargement(ENABLE_IMAGE_ENLARGEMENT_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT:
				setRevealUntruncatedContent(REVEAL_UNTRUNCATED_CONTENT_EDEFAULT);
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
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE:
				return imagePathFeature != null;
			case WebuiPackage.IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH:
				return MISSING_IMAGE_PATH_EDEFAULT == null ? missingImagePath != null : !MISSING_IMAGE_PATH_EDEFAULT.equals(missingImagePath);
			case WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN:
				return showMissingImageWhen != null;
			case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_FILTER:
				return imageFilter != null;
			case WebuiPackage.IMAGE_CARDS_UNIT__OVERLAY_TITLE:
				return overlayTitle != OVERLAY_TITLE_EDEFAULT;
			case WebuiPackage.IMAGE_CARDS_UNIT__ENABLE_IMAGE_ENLARGEMENT:
				return enableImageEnlargement != ENABLE_IMAGE_ENLARGEMENT_EDEFAULT;
			case WebuiPackage.IMAGE_CARDS_UNIT__REVEAL_UNTRUNCATED_CONTENT:
				return revealUntruncatedContent != REVEAL_UNTRUNCATED_CONTENT_EDEFAULT;
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
		if (baseClass == ImageUnit.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE: return WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE;
				case WebuiPackage.IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH: return WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_PATH;
				case WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN: return WebuiPackage.IMAGE_UNIT__SHOW_MISSING_IMAGE_WHEN;
				case WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_FILTER: return WebuiPackage.IMAGE_UNIT__IMAGE_FILTER;
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
		if (baseClass == ImageUnit.class) {
			switch (baseFeatureID) {
				case WebuiPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE: return WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_PATH_FEATURE;
				case WebuiPackage.IMAGE_UNIT__MISSING_IMAGE_PATH: return WebuiPackage.IMAGE_CARDS_UNIT__MISSING_IMAGE_PATH;
				case WebuiPackage.IMAGE_UNIT__SHOW_MISSING_IMAGE_WHEN: return WebuiPackage.IMAGE_CARDS_UNIT__SHOW_MISSING_IMAGE_WHEN;
				case WebuiPackage.IMAGE_UNIT__IMAGE_FILTER: return WebuiPackage.IMAGE_CARDS_UNIT__IMAGE_FILTER;
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
		result.append(" (missingImagePath: ");
		result.append(missingImagePath);
		result.append(", overlayTitle: ");
		result.append(overlayTitle);
		result.append(", enableImageEnlargement: ");
		result.append(enableImageEnlargement);
		result.append(", revealUntruncatedContent: ");
		result.append(revealUntruncatedContent);
		result.append(')');
		return result.toString();
	}

} //ImageCardsUnitImpl
