package uk.ac.man.cs.mdsd.webgen.website.provider;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import uk.ac.man.cs.mdsd.webgen.website.ActionMenuEntry;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.ChildAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ChildAttribute;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Filter;
import uk.ac.man.cs.mdsd.webgen.website.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.website.Query;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitSource;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;

public abstract class WebGenItemProvider extends ItemProviderAdapter {
	public WebGenItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected Set<Feature> getFeatures(final EntityOrView entityOrView) {
		final Set<Feature> features = new HashSet<Feature>();
		if (entityOrView instanceof Entity) {
			for (EntityFeature feature : ((Entity) entityOrView).getAllFeatures()) {
				features.add(feature);
			}
		} else {
			for (ViewFeature feature : ((View) entityOrView).getFeatures()) {
				features.add(feature);
			}
		}

		return features;
	}

	protected Set<Attribute> getAttributes(final EntityOrView entityOrView) {
		final Set<Attribute> attributes = new HashSet<Attribute>();
		if (entityOrView instanceof Entity) {
			for (EntityFeature feature : ((Entity) entityOrView).getFeatures()) {
				if (feature instanceof Attribute) {
					attributes.add((Attribute) feature);
				}
			}
		} else {
			for (ViewFeature feature : ((View) entityOrView).getFeatures()) {
				if (feature instanceof Attribute) {
					attributes.add((Attribute) feature);
				}
			}
		}

		return attributes;
	}

	protected Set<Association> getAssociations(final EntityOrView entityOrView) {
		final Set<Association> associations = new HashSet<Association>();
		if (entityOrView instanceof Entity) {
			final Entity entity = (Entity) entityOrView;
			for (EntityFeature feature : entity.getFeatures()) {
				if (feature instanceof Association) {
					associations.add((Association) feature);
				}
			}
		} else {
			for (ViewFeature feature : ((View) entityOrView).getFeatures()) {
				if (feature instanceof Association) {
					associations.add((Association) feature);
				}
			}
		}

		return associations;
	}

	protected Set<Association> getAllAssociations(final EntityOrView entityOrView) {
		final Set<Association> associations = new HashSet<Association>();
		if (entityOrView instanceof Entity) {
			final Entity entity = (Entity) entityOrView;
			for (EntityFeature feature : entity.getAllFeatures()) {
				if (feature instanceof Association) {
					associations.add((Association) feature);
				}
			}
		} else {
			for (ViewFeature feature : ((View) entityOrView).getFeatures()) {
				if (feature instanceof Association) {
					associations.add((Association) feature);
				}
			}
		}

		return associations;
	}

	protected Set<Attribute> getSourceAttributes(final Association association) {
		final Set<Attribute> attributes = new HashSet<Attribute>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			attributes.addAll(getAttributes(entityAssociation.getPartOf()));
		}

		return attributes;
	}

	protected Set<Association> getSourceAssociations(final Association association) {
		final Set<Association> associations = new HashSet<Association>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			associations.addAll(getAssociations(entityAssociation.getPartOf()));
		}

		return associations;
	}

	protected Set<Association> getAllSourceAssociations(final Association association) {
		final Set<Association> associations = new HashSet<Association>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			associations.addAll(getAllAssociations(entityAssociation.getPartOf()));
		}

		return associations;
	}

	protected Set<Attribute> getTargetAttributes(final Association association) {
		final Set<Attribute> attributes = new HashSet<Attribute>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			attributes.addAll(getAttributes(entityAssociation.getTargetEntity()));
		}

		return attributes;
	}

	protected Set<Association> getTargetAssociations(final Association association) {
		final Set<Association> associations = new HashSet<Association>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			associations.addAll(getAssociations(entityAssociation.getTargetEntity()));
		}

		return associations;
	}

	protected Set<Association> getAllTargetAssociations(final Association association) {
		final Set<Association> associations = new HashSet<Association>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			associations.addAll(getAllAssociations(entityAssociation.getTargetEntity()));
		}

		return associations;
	}

	protected Set<Feature> getTargetFeatures(final Association association,
			final EntityOrView entityOrView) {
		if (entityOrView instanceof Entity) {
			final Entity entity = (Entity) entityOrView;
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			if (entity.getFeatures().contains(association)) {
				return getFeatures(entityAssociation.getTargetEntity());
			} else {
				return getFeatures(entityAssociation.getPartOf());
			}
// TODO handle view
		}
		return Collections.emptySet();
	}

	protected Set<Feature> getFeatures(final Service service) {
		return getFeatures(service.getServes());
	}

	protected Set<Association> getAssociations(final Service service) {
		return getAllAssociations(service.getServes());
	}

	protected Set<Attribute> getAttributes(final DynamicUnit unit) {
		final Set<Attribute> attributes = new HashSet<Attribute>();
		for (EntityOrView entityOrView : unit.getEntities()) {
			attributes.addAll(getAttributes(entityOrView));
		}

		return attributes;
	}

	protected Set<Association> getAssociations(final DynamicUnit unit) {
		final Set<Association> associations = new HashSet<Association>();
		for (EntityOrView entityOrView : unit.getEntities()) {
			associations.addAll(getAllAssociations(entityOrView));
		}

		return associations;
	}

	protected Boolean isSourceAssociation(final UnitAssociation association) {
		for (EntityOrView entityOrView : association.getDisplayedOn().getEntities()) {
			if (getAssociations(entityOrView).contains(association.getAssociation())) {
				return true;
			}
		}

		return false;
	}

	protected Boolean isSourceAssociation(final ChildAssociation association) {
		if (association.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = (UnitAssociation) association.eContainer();
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getTargetAssociations(parent.getAssociation()).contains(association.getAssociation());
				} else {
					return getSourceAssociations(parent.getAssociation()).contains(association.getAssociation());
				}
			}
		} else {
			final ChildAssociation parent = (ChildAssociation) association.eContainer();
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getTargetAssociations(parent.getAssociation()).contains(association.getAssociation());
				} else {
					return getSourceAssociations(parent.getAssociation()).contains(association.getAssociation());
				}
			}
		}

		return false;
	}

	protected Set<Attribute> getAttributes(final ChildAttribute attribute) {
		if (attribute.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = ((UnitAssociation) attribute.eContainer());
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getTargetAttributes(parent.getAssociation());
				} else {
					return getSourceAttributes(parent.getAssociation());
				}
			}
		} else {
			final ChildAssociation parent = (ChildAssociation) attribute.eContainer();
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getTargetAttributes(parent.getAssociation());
				} else {
					return getSourceAttributes(parent.getAssociation());
				}
			}
		}

		return Collections.emptySet();
	}

	protected Set<Association> getAssociations(final ChildAssociation association) {
		if (association.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = ((UnitAssociation) association.eContainer());
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getAllTargetAssociations(parent.getAssociation());
				} else {
					return getAllSourceAssociations(parent.getAssociation());
				}
			}
		} else {
			final ChildAssociation parent = (ChildAssociation) association.eContainer();
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getAllTargetAssociations(parent.getAssociation());
				} else {
					return getAllSourceAssociations(parent.getAssociation());
				}
			}
		}

		return Collections.emptySet();
	}

	protected List<Filter> getFilters(final Query query) {
		if (query.eContainer() instanceof ActionMenuEntry) {
			final ActionMenuEntry entry
				= (ActionMenuEntry) query.eContainer();
			if (entry.getDestination() instanceof IndexUnit) {
				return ((IndexUnit) entry.getDestination()).getFilters();
			}
		}

		return Collections.emptyList();
	}

	protected Set<Selection> getSourceSelections(final DynamicUnit unit) {
		final Set<Selection> selections = new HashSet<Selection>();
		for (UnitSource source : unit.getSource() ) {
			if (source instanceof Service) {
				selections.addAll(((Service) source).getSelections());
			}
		}

		return selections;
	}

	protected Object getCriteriaContext(final Object object) {
		if (object instanceof EObject) {
			return ((EObject) object).eContainer();
		} else {
			return null;
		}
	}

	protected Service getCriteriaServiceContext(final Object object) {
		Object container = getCriteriaContext(object);
		while (container != null) {
			container = getCriteriaContext(container);
			if (container instanceof Service) {
				return (Service) container;
			} else if (container instanceof DynamicUnit) {
				final DynamicUnit containingUnit = (DynamicUnit) container;
				if (containingUnit.getSource() instanceof Service) {
					return (Service) containingUnit.getSource();
				}
			}
		}

		return null;
	}

	protected Selection getCriteriaSelectionContext(final Object object) {
		Object container = getCriteriaContext(object);
		while (container != null) {
			if (container instanceof Selection) {
				return (Selection) container;
			}
			container = getCriteriaContext(container);
		}

		return null;
	}

}
