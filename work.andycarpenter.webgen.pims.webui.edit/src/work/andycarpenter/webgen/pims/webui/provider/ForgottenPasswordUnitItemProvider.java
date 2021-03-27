/**
 */
package work.andycarpenter.webgen.pims.webui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.webgen.pims.webui.ForgottenPasswordUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForgottenPasswordUnitItemProvider extends EditUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnitItemProvider(AdapterFactory adapterFactory) {
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

			addResetPasswordUnitPropertyDescriptor(object);
			addUriEmailSentPropertyDescriptor(object);
			addEmailSubjectPropertyDescriptor(object);
			addEmailMessagePropertyDescriptor(object);
			addEmailSentCaptionPropertyDescriptor(object);
			addEmailSentMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ForgottenPasswordUnit_resetPasswordUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordUnit_resetPasswordUnit_feature", "_UI_ForgottenPasswordUnit_type"),
				 WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT__RESET_PASSWORD_UNIT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Email Sent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriEmailSentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordUnit_uriEmailSent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordUnit_uriEmailSent_feature", "_UI_ForgottenPasswordUnit_type"),
				 WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Subject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailSubjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordUnit_emailSubject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordUnit_emailSubject_feature", "_UI_ForgottenPasswordUnit_type"),
				 WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SecurityPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordUnit_emailMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordUnit_emailMessage_feature", "_UI_ForgottenPasswordUnit_type"),
				 WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SecurityPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Sent Caption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailSentCaptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordUnit_emailSentCaption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordUnit_emailSentCaption_feature", "_UI_ForgottenPasswordUnit_type"),
				 WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Sent Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailSentMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordUnit_emailSentMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordUnit_emailSentMessage_feature", "_UI_ForgottenPasswordUnit_type"),
				 WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This returns ForgottenPasswordUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ForgottenPasswordUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ForgottenPasswordUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ForgottenPasswordUnit_type") :
			getString("_UI_ForgottenPasswordUnit_type") + " " + label;
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

		switch (notification.getFeatureID(ForgottenPasswordUnit.class)) {
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_EMAIL_SENT:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SUBJECT:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_MESSAGE:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_CAPTION:
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__EMAIL_SENT_MESSAGE:
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
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WebuiPackage.Literals.DYNAMIC_UNIT__HIDE_WHEN ||
			childFeature == WebuiPackage.Literals.EDIT_UNIT__DISABLE_WHEN ||
			childFeature == WebuiPackage.Literals.EDIT_UNIT__CONFIRM_MESSAGE ||
			childFeature == WebuiPackage.Literals.EDIT_UNIT__SUCCESS_MESSAGE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
