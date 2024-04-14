package work.andycarpenter.webgen.pim2psms;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;


public class TransformUsingEmftVm {
	private ResourceSet resourceSet = new ResourceSetImpl();
	private Metamodel securityMetamodel;
	private Metamodel websiteMetamodel;
	private Metamodel ormMetamodel;
	private Metamodel serviceMetamodel;
	private Metamodel apiMetamodel;
	private Metamodel wafMetamodel;
	private IPath websiteModelPath;
	private Model websiteModel;
	private ModuleResolver moduleResolver;

	protected Metamodel getWebsiteMetamodel() {
		if (websiteMetamodel == null) {
			websiteMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			websiteMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://andycarpenter.work/pim/Website"), true));
		}

		return websiteMetamodel;
	}

	protected Metamodel getOrmMetamodel() {
		if (ormMetamodel == null) {
			ormMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			ormMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://andycarpenter.work/metamodel/ObjectRelationalMapping"), true));
		}

		return ormMetamodel;
	}

	protected Metamodel getSecurityMetamodel() {
		if (securityMetamodel == null) {
			securityMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			securityMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://andycarpenter.work/metamodel/security"), true));
		}

		return securityMetamodel;
	}

	protected Metamodel getServiceMetamodel() {
		if (serviceMetamodel == null) {
			serviceMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			serviceMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://andycarpenter.work/metamodel/service"), true));
		}

		return serviceMetamodel;
	}

	protected Metamodel getApiMetamodel() {
		if (apiMetamodel == null) {
			apiMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			apiMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://andycarpenter.work/metamodel/api"), true));
		}

		return apiMetamodel;
	}

	protected Metamodel getWafMetamodel() {
		if (wafMetamodel == null) {
			wafMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			wafMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://andycarpenter.work/metamodel/WebApplicationFramework"), true));
		}

		return wafMetamodel;
	}

	public Model getWebsiteModel() {
		return websiteModel;
	}

	public void setWebsiteModel(final IFile websiteModelFile) {
		websiteModelPath = websiteModelFile.getFullPath();
		websiteModel = EmftvmFactory.eINSTANCE.createModel();
		websiteModel.setResource(resourceSet.getResource(
			URI.createFileURI(websiteModelPath.toString()), true));
	}

	protected ModuleResolver getModuleResolver() {
		if (moduleResolver == null) {
			moduleResolver = new DefaultModuleResolver(
				"platform:/plugin/work.andycarpenter.webgen.pim2psms/transformations/",
				resourceSet);
		}

		return moduleResolver;
	}

	protected URI createModelURI(final String fileExtension) {
		return URI.createFileURI(websiteModelPath
			.removeFileExtension()
			.addFileExtension(fileExtension)
			.toString());
	}

	protected Model createModel(final String modelFileExtension) {
		final Model model = EmftvmFactory.eINSTANCE.createModel();
		model.setResource(resourceSet.createResource(
			createModelURI(modelFileExtension)));
		return model;
	}

	protected ExecEnv createEnvironment() {
		final ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.registerMetaModel("Website", getWebsiteMetamodel());
		env.registerMetaModel("ORM", getOrmMetamodel());
		env.registerMetaModel("Security", getSecurityMetamodel());
		env.registerMetaModel("Service", getServiceMetamodel());
		env.registerMetaModel("API", getApiMetamodel());
		env.registerMetaModel("WAF", getWafMetamodel());

		return env;
		
	}

	protected void executePass(final ExecEnv env, final String moduleName,
			final Map<String, Model> inputModels, final Map<String, Model> inOutModels) {
		for (String inputName : inputModels.keySet()) {
			env.registerInputModel(inputName, inputModels.get(inputName));
		}

		for (String inoutName : inOutModels.keySet()) {
			env.registerInOutModel(inoutName, inOutModels.get(inoutName));
		}

		env.loadModule(getModuleResolver(), moduleName);

		final TimingData timingData = new TimingData();
		env.run(timingData);
		timingData.finish();
	}

	protected Model executePassCreatingOutputModel(final String moduleName,
			final String modelName, final String modelFileExtension,
			final Map<String, Model> inputModels, final Map<String, Model> inOutModels) {
		final ExecEnv env = createEnvironment();

		Model passModel = createModel(modelFileExtension);
		env.registerOutputModel(modelName, passModel);

		executePass(env, moduleName, inputModels, inOutModels);

		return passModel;
	}

	protected void executeRefiningPass(final String moduleName,
			final String modelName, final Model model,
			final Map<String, Model> inputModels, final Map<String, Model> inOutModels) {
		final ExecEnv env = createEnvironment();
		env.registerInOutModel(modelName, model);

		executePass(env, moduleName, inputModels, inOutModels);
	}

	public void execute() throws IOException {
		try {
			final Map<String, Model> ormInputModels = new HashMap<String, Model>();
			ormInputModels.put("website", getWebsiteModel());
			final String ormModelName = "orm";
			final Model ormModel = executePassCreatingOutputModel("PersistenceTypes",
				ormModelName, "orm", ormInputModels, Collections.emptyMap());
			executeRefiningPass("PersistenceEntityFeatures", ormModelName, ormModel,
				ormInputModels, Collections.emptyMap());
			executeRefiningPass("PersistenceEntityLabels", ormModelName, ormModel,
				ormInputModels, Collections.emptyMap());
			executeRefiningPass("PersistenceKeys",
				ormModelName, ormModel, ormInputModels, Collections.emptyMap());
			executeRefiningPass("PersistenceRepositories",
				ormModelName, ormModel, ormInputModels, Collections.emptyMap());
			executeRefiningPass("PersistenceImplicitStatic", ormModelName,
				ormModel, ormInputModels, Collections.emptyMap());
// Next two transformations are separate as dependencies mean cannot do both in one pass
			executeRefiningPass("PersistenceImplicitAuthentication",
					ormModelName, ormModel, ormInputModels, Collections.emptyMap());
			executeRefiningPass("PersistenceImplicitResetPassword",
				ormModelName, ormModel, ormInputModels, Collections.emptyMap());
			executeRefiningPass("PersistenceImplicitRepositories", ormModelName,
					ormModel, ormInputModels, Collections.emptyMap());
			ormModel.getResource().save(Collections.emptyMap());
	
			final Map<String, Model> securityInputModels = new HashMap<String, Model>();
			securityInputModels.put("website", getWebsiteModel());
			securityInputModels.put("orm", ormModel);
			final String securityModelName = "security";
			final Model securityModel = executePassCreatingOutputModel("Security",
				securityModelName, "security", securityInputModels, Collections.emptyMap());
			securityModel.getResource().save(Collections.emptyMap());

			final Map<String, Model> serviceInputModels = new HashMap<String, Model>();
			serviceInputModels.put("website", getWebsiteModel());
			serviceInputModels.put("orm", ormModel);
			final String serviceModelName = "service";
			final Model serviceModel = executePassCreatingOutputModel("ServiceExplicit",
				serviceModelName, "business", serviceInputModels, Collections.emptyMap());
			serviceModel.getResource().save(Collections.emptyMap());
	
			final Map<String, Model> apiInputModels = new HashMap<String, Model>();
			apiInputModels.put("website", getWebsiteModel());
			apiInputModels.put("orm", ormModel);
			apiInputModels.put("service", serviceModel);
			final String apiModelName = "api";
			final Model apiModel = executePassCreatingOutputModel("API",
				apiModelName, "api", apiInputModels, Collections.emptyMap());
			apiModel.getResource().save(Collections.emptyMap());
	
			final Map<String, Model> wafInputModels = new HashMap<String, Model>();
			wafInputModels.put("website", getWebsiteModel());
			wafInputModels.put("orm", ormModel);
			wafInputModels.put("service", serviceModel);
			wafInputModels.put("api", apiModel);
			final Map<String, Model> wafInOutModels = new HashMap<String, Model>();
			wafInOutModels.put("security", securityModel);
			final String wafModelName = "waf";
	
			final Model wafTraceModelP1 = createModel("trace_waf_p1");
			final Model wafModel = executePassCreatingOutputModel("InterfaceExplicit",
				wafModelName, "waf", wafInputModels, wafInOutModels);

			final Model wafTraceModelP5 = createModel("trace_waf_p2");
			executeRefiningPass("InterfaceImplicitStatic", wafModelName,
				wafModel, wafInputModels, wafInOutModels);
	
			final Model wafTraceModelP6 = createModel("trace_waf_p3");
			executeRefiningPass("InterfaceImplicitFields", wafModelName, wafModel,
				wafInputModels, wafInOutModels);
	
			final Model wafTraceModelP7 = createModel("trace_waf_p4");
			executeRefiningPass("PassAuthentication", wafModelName, wafModel,
				wafInputModels, wafInOutModels);
			securityModel.getResource().save(Collections.emptyMap());
			wafModel.getResource().save(Collections.emptyMap());
		} catch (Exception e) {
			System.err.println(e);
			throw new Error(e);
		}
	}

}
