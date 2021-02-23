/**
 */
package work.andycarpenter.webgen.pims.security.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.webgen.pims.security.Authentication;
import work.andycarpenter.webgen.pims.security.SecurityPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.security.Authentication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthenticationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationItemProvider(AdapterFactory adapterFactory) {
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

			addSecurityPropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addUserKeyPropertyDescriptor(object);
			addImplicitRegistrationNamePropertyDescriptor(object);
			addImplicitRegistrationLabelPropertyDescriptor(object);
			addImplicitRegistrationUriPropertyDescriptor(object);
			addImplicitLoginNamePropertyDescriptor(object);
			addImplicitLoginLabelPropertyDescriptor(object);
			addImplicitLoginUriPropertyDescriptor(object);
			addImplicitLogoutNamePropertyDescriptor(object);
			addImplicitLogoutLabelPropertyDescriptor(object);
			addImplicitLogoutUriPropertyDescriptor(object);
			addImplicitForgottenPasswordNamePropertyDescriptor(object);
			addImplicitForgottenPasswordLabelPropertyDescriptor(object);
			addImplicitForgottenPasswordUriPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Security feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_security_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_security_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__SECURITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_user_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_user_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__USER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SecurityPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the User Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addUserKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Authentication_userKey_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Authentication_userKey_feature", "_UI_Authentication_type"),
			SecurityPackage.Literals.AUTHENTICATION__USER_KEY,
			true, false, true, null,
			getString("_UI_SecurityPropertyCategory"),
			null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					if (object instanceof Authentication) {
						final Authentication authentication = (Authentication) object;
						if (authentication.getUser() != null) {
							return authentication.getUser().getAttributes();
						}
					}

					return super.getChoiceOfValues(object);
				}
			});
	}

	/**
	 * This adds a property descriptor for the Implicit Registration Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitRegistrationNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitRegistrationName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitRegistrationName_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_REGISTRATION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Registration Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitRegistrationLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitRegistrationLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitRegistrationLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_REGISTRATION_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Registration Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitRegistrationUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitRegistrationUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitRegistrationUri_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_REGISTRATION_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Login Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLoginNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLoginName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLoginName_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGIN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Login Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLoginLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLoginLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLoginLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGIN_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Login Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLoginUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLoginUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLoginUri_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGIN_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Logout Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLogoutNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLogoutName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLogoutName_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGOUT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Logout Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLogoutLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLogoutLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLogoutLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGOUT_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Logout Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLogoutUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLogoutUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLogoutUri_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGOUT_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordName_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordUri_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Authentication)object).getImplicitRegistrationName();
		return label == null || label.length() == 0 ?
			getString("_UI_Authentication_type") :
			getString("_UI_Authentication_type") + " " + label;
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

		switch (notification.getFeatureID(Authentication.class)) {
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_NAME:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_URI:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_NAME:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_URI:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_NAME:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_URI:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SecurityEditPlugin.INSTANCE;
	}

}
