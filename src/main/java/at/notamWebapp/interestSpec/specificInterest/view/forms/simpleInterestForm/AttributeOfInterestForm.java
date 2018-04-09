package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.interestSpec.specificInterest.view.forms.FormValidatorInterface;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.customFields.RestrictionField;
import com.frequentis.semnotam.schema._1.AttributeOfInterestType;
import com.vaadin.data.Property;
import com.vaadin.ui.*;

import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 24.11.2016.
 */
public class AttributeOfInterestForm extends Panel implements Property.ValueChangeListener, FormValidatorInterface {
    AttributeOfInterestType attribute;
    RestrictionField restriction;
    ComboBox cbConceptName;
    static List<String> predefinedConcepts;

    public AttributeOfInterestForm(SemNotamController controller, int id, AttributeOfInterestType attribute, List<String> predefinedConcepts){
        cbConceptName = new ComboBox("Concept Name:");
        restriction = new RestrictionField();
        this.attribute = attribute;
        this.predefinedConcepts = predefinedConcepts;
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
        String conceptAcronym;
        for(String concept : predefinedConcepts) {
            cbConceptName.addItem(concept);
            int i = concept.lastIndexOf('#');
            int j = concept.lastIndexOf('>');
            conceptAcronym = concept.substring(i+1, j);
            cbConceptName.setItemCaption(concept, conceptAcronym);
        }
        cbConceptName.setTextInputAllowed(true);
        cbConceptName.setNewItemsAllowed(true);

        cbConceptName.setValue(attribute.getConceptName());
        cbConceptName.addValueChangeListener(this);

    //    cbConceptName.setRequired(true);
        cbConceptName.setValidationVisible(false);
        cbConceptName.setRequiredError("Required");

        restriction.setInternalValue(attribute.getRestriction());
        restriction.addValueChangeListener(this);
    }

    @Override
    public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
        attribute.setRestriction(restriction.getInternalValue());
        attribute.setConceptName((String) cbConceptName.getValue());
    }

    @Override
    public boolean isValid() {
        if(!cbConceptName.isValid()){
            cbConceptName.setValidationVisible(true);
        }
        return restriction.isValid() && cbConceptName.isValid();
    }
}
