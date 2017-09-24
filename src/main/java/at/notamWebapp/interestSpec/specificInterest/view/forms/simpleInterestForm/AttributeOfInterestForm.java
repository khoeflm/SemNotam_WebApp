package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.customFields.RestrictionField;
import com.frequentis.semnotam.schema._1.AttributeOfInterestType;
import com.vaadin.data.Property;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 24.11.2016.
 */
public class AttributeOfInterestForm extends Panel implements Property.ValueChangeListener {
    AttributeOfInterestType attribute;
    RestrictionField restriction;
    ComboBox cbConceptName;

    public AttributeOfInterestForm(SemNotamController controller, int id, AttributeOfInterestType attribute){
        cbConceptName = new ComboBox("Concept Name:");
        restriction = new RestrictionField();
        this.attribute = attribute;

        setId("ATTR"+id);

        Label attributeId = new Label();
        attributeId.setValue(getId());
        HorizontalLayout idLayout = new HorizontalLayout();
        Button deleteAttributeForm = new Button("Delete");
        deleteAttributeForm.setId("370");
        deleteAttributeForm.addClickListener(controller);
        idLayout.setSpacing(true);
        idLayout.addComponents(attributeId, deleteAttributeForm);
        HorizontalLayout aoifHorizLayout = new HorizontalLayout(cbConceptName, restriction);
        VerticalLayout aoifVertLayout = new VerticalLayout(idLayout, aoifHorizLayout);
        aoifVertLayout.setSpacing(true);
        aoifVertLayout.setMargin(true);
        setCaption("Attribute of Interest");
        setContent(aoifVertLayout);

        cbConceptName.setValue(attribute.getConceptName());
        cbConceptName.addValueChangeListener(this);

        restriction.setInternalValue(attribute.getRestriction());
        restriction.addValueChangeListener(this);
    }

    @Override
    public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
        attribute.setRestriction(restriction.getInternalValue());
        attribute.setConceptName((String) cbConceptName.getValue());
    }
}
