package uk.ac.man.cs.mdsd.webgen.website.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteModelingAssistantProvider;

/**
 * @generated
 */
public class WebsiteModelingAssistantProviderOfIndexUnit6EditPart extends WebsiteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(WebsiteElementTypes.UnitElement_3195);
		types.add(WebsiteElementTypes.UnitAssociation_3194);
		types.add(WebsiteElementTypes.DataTypeField_3204);
		types.add(WebsiteElementTypes.DateField_3210);
		types.add(WebsiteElementTypes.SelectAction_3153);
		types.add(WebsiteElementTypes.DeleteAction_3154);
		types.add(WebsiteElementTypes.FeatureSupportAction_3266);
		return types;
	}

}
