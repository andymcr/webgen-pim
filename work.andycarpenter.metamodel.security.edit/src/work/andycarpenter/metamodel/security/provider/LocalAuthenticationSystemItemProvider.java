/**
 */
package work.andycarpenter.metamodel.security.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.security.AuthenticationKeyTypes;
import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalAuthenticationSystemItemProvider extends AuthenticationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAuthenticationModelPropertyDescriptor(object);
			addAuthenticationKeyPropertyDescriptor(object);
			addResetPasswordRequestModelPropertyDescriptor(object);
			addRegistrationUnitPropertyDescriptor(object);
			addLoginUnitPropertyDescriptor(object);
			addLogoutUnitPropertyDescriptor(object);
			addForgottenPasswordUnitPropertyDescriptor(object);
			addResetPasswordUnitPropertyDescriptor(object);
			addUseCaptchaPropertyDescriptor(object);
			addAllowRememberMePropertyDescriptor(object);
			addAllowSelfRegistrationPropertyDescriptor(object);
			addUseEmailActivationPropertyDescriptor(object);
			addSendWelcomeEmailPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Authentication Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_authenticationModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_authenticationModel_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authentication Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_authenticationKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_authenticationKey_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Password Request Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetPasswordRequestModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_resetPasswordRequestModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_resetPasswordRequestModel_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Registration Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistrationUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_registrationUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_registrationUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Login Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_loginUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_loginUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logout Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogoutUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_logoutUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_logoutUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Forgotten Password Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForgottenPasswordUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_forgottenPasswordUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_forgottenPasswordUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Password Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetPasswordUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_resetPasswordUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_resetPasswordUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Captcha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseCaptchaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_useCaptcha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_useCaptcha_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Remember Me feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowRememberMePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_allowRememberMe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_allowRememberMe_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Self Registration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowSelfRegistrationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_allowSelfRegistration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_allowSelfRegistration_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Email Activation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseEmailActivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_useEmailActivation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_useEmailActivation_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Send Welcome Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendWelcomeEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_sendWelcomeEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_sendWelcomeEmail_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LocalAuthenticationSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocalAuthenticationSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AuthenticationKeyTypes labelValue = ((LocalAuthenticationSystem)object).getAuthenticationKey();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_LocalAuthenticationSystem_type") :
			getString("_UI_LocalAuthenticationSystem_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LocalAuthenticationSystem.class)) {
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
