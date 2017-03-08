package uk.ac.man.cs.mdsd.webgen.service.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceElementTypes;
import uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceModelingAssistantProvider;

/**
 * @generated
 */
public class ServiceModelingAssistantProviderOfServicesEditPart extends ServiceModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ServiceElementTypes.Service_2001);
		return types;
	}

}
