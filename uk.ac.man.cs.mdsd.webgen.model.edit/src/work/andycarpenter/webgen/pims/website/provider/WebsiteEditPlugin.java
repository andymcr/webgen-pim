/**
 */
package work.andycarpenter.webgen.pims.website.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import work.andycarpenter.webgen.pims.api.provider.ApiEditPlugin;

import work.andycarpenter.webgen.pims.base.provider.BaseEditPlugin;

import work.andycarpenter.webgen.pims.expression.provider.ExpressionEditPlugin;

import work.andycarpenter.webgen.pims.image.provider.ImageEditPlugin;

import work.andycarpenter.webgen.pims.persistence.provider.PersistenceEditPlugin;

import work.andycarpenter.webgen.pims.security.provider.SecurityEditPlugin;

import work.andycarpenter.webgen.pims.service.provider.ServiceEditPlugin;

import work.andycarpenter.webgen.pims.webui.provider.WebuiEditPlugin;

/**
 * This is the central singleton for the Website edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class WebsiteEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebsiteEditPlugin INSTANCE = new WebsiteEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ApiEditPlugin.INSTANCE,
		     BaseEditPlugin.INSTANCE,
		     ExpressionEditPlugin.INSTANCE,
		     ImageEditPlugin.INSTANCE,
		     PersistenceEditPlugin.INSTANCE,
		     SecurityEditPlugin.INSTANCE,
		     ServiceEditPlugin.INSTANCE,
		     WebuiEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
