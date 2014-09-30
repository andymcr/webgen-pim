package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeField6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateField6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation16CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement18CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class SearchUnitUnitFieldCompartmentItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SearchUnitUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.SearchUnit_3109);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3215 == req.getElementType()) {
			return getGEFWrapper(new UnitElement18CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3216 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation16CreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3206 == req.getElementType()) {
			return getGEFWrapper(new DataTypeField6CreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3212 == req.getElementType()) {
			return getGEFWrapper(new DateField6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
