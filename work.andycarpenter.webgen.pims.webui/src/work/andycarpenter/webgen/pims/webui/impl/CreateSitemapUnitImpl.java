/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.CreateSitemapUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Sitemap Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CreateSitemapUnitImpl#getDeployedURL <em>Deployed URL</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CreateSitemapUnitImpl#getFilename <em>Filename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateSitemapUnitImpl extends ContentUnitImpl implements CreateSitemapUnit {
	/**
	 * The default value of the '{@link #getDeployedURL() <em>Deployed URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedURL()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYED_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployedURL() <em>Deployed URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedURL()
	 * @generated
	 * @ordered
	 */
	protected String deployedURL = DEPLOYED_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = "sitemap.xml";

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateSitemapUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CREATE_SITEMAP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeployedURL() {
		return deployedURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployedURL(String newDeployedURL) {
		String oldDeployedURL = deployedURL;
		deployedURL = newDeployedURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL, oldDeployedURL, deployedURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				return getDeployedURL();
			case WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME:
				return getFilename();
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
			case WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				setDeployedURL((String)newValue);
				return;
			case WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME:
				setFilename((String)newValue);
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
			case WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				setDeployedURL(DEPLOYED_URL_EDEFAULT);
				return;
			case WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME:
				setFilename(FILENAME_EDEFAULT);
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
			case WebuiPackage.CREATE_SITEMAP_UNIT__DEPLOYED_URL:
				return DEPLOYED_URL_EDEFAULT == null ? deployedURL != null : !DEPLOYED_URL_EDEFAULT.equals(deployedURL);
			case WebuiPackage.CREATE_SITEMAP_UNIT__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
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
		result.append(" (deployedURL: ");
		result.append(deployedURL);
		result.append(", filename: ");
		result.append(filename);
		result.append(')');
		return result.toString();
	}

} //CreateSitemapUnitImpl
