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
			addImplicitRegistrationUnitLabelPropertyDescriptor(object);
			addImplicitRegistrationActionLabelPropertyDescriptor(object);
			addImplicitRegistrationConfirmLabelPropertyDescriptor(object);
			addImplicitRegistrationUriPropertyDescriptor(object);
			addImplicitLoginNamePropertyDescriptor(object);
			addImplicitLoginUnitLabelPropertyDescriptor(object);
			addImplicitLoginActionLabelPropertyDescriptor(object);
			addImplicitLoginConfirmLabelPropertyDescriptor(object);
			addImplicitLoginUriPropertyDescriptor(object);
			addImplicitLogoutNamePropertyDescriptor(object);
			addImplicitLogoutUnitLabelPropertyDescriptor(object);
			addImplicitLogoutActionLabelPropertyDescriptor(object);
			addImplicitLogoutConfirmLabelPropertyDescriptor(object);
			addImplicitLogoutUriPropertyDescriptor(object);
			addImplicitForgottenPasswordNamePropertyDescriptor(object);
			addImplicitForgottenPasswordUnitLabelPropertyDescriptor(object);
			addImplicitForgottenPasswordActionLabelPropertyDescriptor(object);
			addImplicitForgottenPasswordConfirmLabelPropertyDescriptor(object);
			addImplicitForgottenPasswordUriRequestPropertyDescriptor(object);
			addImplicitForgottenPasswordUriEmailSentPropertyDescriptor(object);
			addImplicitForgottenPasswordEmailSubjectPropertyDescriptor(object);
			addImplicitForgottenPasswordEmailMessagePropertyDescriptor(object);
			addImplicitForgottenPasswordEmailSentCaptionPropertyDescriptor(object);
			addImplicitForgottenPasswordEmailSentMessagePropertyDescriptor(object);
			addImplicitResetPasswordNamePropertyDescriptor(object);
			addImplicitResetPasswordUnitLabelPropertyDescriptor(object);
			addImplicitResetPasswordActionLabelPropertyDescriptor(object);
			addImplicitResetPasswordConfirmLabelPropertyDescriptor(object);
			addImplicitResetPasswordUriPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Implicit Registration Unit Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitRegistrationUnitLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitRegistrationUnitLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitRegistrationUnitLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Registration Action Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitRegistrationActionLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitRegistrationActionLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitRegistrationActionLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Registration Confirm Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitRegistrationConfirmLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitRegistrationConfirmLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitRegistrationConfirmLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL,
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
	 * This adds a property descriptor for the Implicit Login Unit Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLoginUnitLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLoginUnitLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLoginUnitLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Login Action Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLoginActionLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLoginActionLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLoginActionLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Login Confirm Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLoginConfirmLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLoginConfirmLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLoginConfirmLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL,
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
	 * This adds a property descriptor for the Implicit Logout Unit Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLogoutUnitLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLogoutUnitLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLogoutUnitLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Logout Action Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLogoutActionLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLogoutActionLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLogoutActionLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Logout Confirm Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitLogoutConfirmLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitLogoutConfirmLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitLogoutConfirmLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL,
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
	 * This adds a property descriptor for the Implicit Forgotten Password Unit Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordUnitLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordUnitLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordUnitLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Action Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordActionLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordActionLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordActionLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Confirm Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordConfirmLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordConfirmLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordConfirmLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Uri Request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordUriRequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordUriRequest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordUriRequest_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Uri Email Sent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordUriEmailSentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordUriEmailSent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordUriEmailSent_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Email Subject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordEmailSubjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordEmailSubject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordEmailSubject_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SecurityPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Email Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordEmailMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordEmailMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordEmailMessage_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SecurityPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Email Sent Caption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordEmailSentCaptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordEmailSentCaption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordEmailSentCaption_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Forgotten Password Email Sent Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitForgottenPasswordEmailSentMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitForgottenPasswordEmailSentMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitForgottenPasswordEmailSentMessage_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Reset Password Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitResetPasswordNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitResetPasswordName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitResetPasswordName_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Reset Password Unit Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitResetPasswordUnitLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitResetPasswordUnitLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitResetPasswordUnitLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Reset Password Action Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitResetPasswordActionLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitResetPasswordActionLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitResetPasswordActionLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Reset Password Confirm Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitResetPasswordConfirmLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitResetPasswordConfirmLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitResetPasswordConfirmLabel_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implicit Reset Password Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplicitResetPasswordUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Authentication_implicitResetPasswordUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Authentication_implicitResetPasswordUri_feature", "_UI_Authentication_type"),
				 SecurityPackage.Literals.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI,
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
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_UNIT_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_ACTION_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_CONFIRM_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_REGISTRATION_URI:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_NAME:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_UNIT_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_ACTION_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_CONFIRM_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGIN_URI:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_NAME:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_UNIT_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_ACTION_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_CONFIRM_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_LOGOUT_URI:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_NAME:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_UNIT_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_ACTION_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_CONFIRM_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_REQUEST:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_URI_EMAIL_SENT:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SUBJECT:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_MESSAGE:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_CAPTION:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_FORGOTTEN_PASSWORD_EMAIL_SENT_MESSAGE:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_NAME:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_UNIT_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_ACTION_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_CONFIRM_LABEL:
			case SecurityPackage.AUTHENTICATION__IMPLICIT_RESET_PASSWORD_URI:
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
