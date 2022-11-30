/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.SubDirectory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SubDirectoryImpl#getCharactersPerDirectory <em>Characters Per Directory</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SubDirectoryImpl#getDirectoryCount <em>Directory Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubDirectoryImpl extends DirectoryNamerImpl implements SubDirectory {
	/**
	 * The default value of the '{@link #getCharactersPerDirectory() <em>Characters Per Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharactersPerDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARACTERS_PER_DIRECTORY_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getCharactersPerDirectory() <em>Characters Per Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharactersPerDirectory()
	 * @generated
	 * @ordered
	 */
	protected int charactersPerDirectory = CHARACTERS_PER_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectoryCount() <em>Directory Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryCount()
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECTORY_COUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDirectoryCount() <em>Directory Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryCount()
	 * @generated
	 * @ordered
	 */
	protected int directoryCount = DIRECTORY_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubDirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.SUB_DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCharactersPerDirectory() {
		return charactersPerDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharactersPerDirectory(int newCharactersPerDirectory) {
		int oldCharactersPerDirectory = charactersPerDirectory;
		charactersPerDirectory = newCharactersPerDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.SUB_DIRECTORY__CHARACTERS_PER_DIRECTORY, oldCharactersPerDirectory, charactersPerDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDirectoryCount() {
		return directoryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryCount(int newDirectoryCount) {
		int oldDirectoryCount = directoryCount;
		directoryCount = newDirectoryCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.SUB_DIRECTORY__DIRECTORY_COUNT, oldDirectoryCount, directoryCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.SUB_DIRECTORY__CHARACTERS_PER_DIRECTORY:
				return getCharactersPerDirectory();
			case PersistencePackage.SUB_DIRECTORY__DIRECTORY_COUNT:
				return getDirectoryCount();
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
			case PersistencePackage.SUB_DIRECTORY__CHARACTERS_PER_DIRECTORY:
				setCharactersPerDirectory((Integer)newValue);
				return;
			case PersistencePackage.SUB_DIRECTORY__DIRECTORY_COUNT:
				setDirectoryCount((Integer)newValue);
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
			case PersistencePackage.SUB_DIRECTORY__CHARACTERS_PER_DIRECTORY:
				setCharactersPerDirectory(CHARACTERS_PER_DIRECTORY_EDEFAULT);
				return;
			case PersistencePackage.SUB_DIRECTORY__DIRECTORY_COUNT:
				setDirectoryCount(DIRECTORY_COUNT_EDEFAULT);
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
			case PersistencePackage.SUB_DIRECTORY__CHARACTERS_PER_DIRECTORY:
				return charactersPerDirectory != CHARACTERS_PER_DIRECTORY_EDEFAULT;
			case PersistencePackage.SUB_DIRECTORY__DIRECTORY_COUNT:
				return directoryCount != DIRECTORY_COUNT_EDEFAULT;
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
		result.append(" (charactersPerDirectory: ");
		result.append(charactersPerDirectory);
		result.append(", directoryCount: ");
		result.append(directoryCount);
		result.append(')');
		return result.toString();
	}

} //SubDirectoryImpl
