package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.customFields;

import com.frequentis.semnotam.schema._1.NestedRestrictionType;
import com.vaadin.data.Property;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 11.08.2017.
 */
public class NestedRestrictionField extends VerticalLayout implements Property.ValueChangeListener {
    private TextField nestedAttributeIri;
    private RestrictionField restrictionField;
    private NestedRestrictionType nested;
    private Property.ValueChangeListener listener;

    NestedRestrictionField(){
        addComponent(initContent());
    }

    protected Component initContent() {
        nestedAttributeIri = new TextField("Field");
        restrictionField = new RestrictionField();

        nestedAttributeIri.setRequired(true);
        nestedAttributeIri.setValidationVisible(false);
        nestedAttributeIri.setRequiredError("Required");
        nestedAttributeIri.setImmediate(true);

        HorizontalLayout panelLayout = new HorizontalLayout(nestedAttributeIri, restrictionField);
        Panel nestedRestrictionPanel = new Panel("NestedRestriction");
        nestedRestrictionPanel.setContent(panelLayout);

        this.setImmediate(true);
        return nestedRestrictionPanel;
    }

    protected void setInternalValue(NestedRestrictionType newValue) {
        nested = newValue;
        nestedAttributeIri.setValue(newValue.getAttributeIri());
        restrictionField.setInternalValue(newValue.getRestriction());
    }

    public NestedRestrictionType getInternalValue() {
        if(nested == null){
            nested = new NestedRestrictionType();
        }
        nested.setAttributeIri(nestedAttributeIri.getValue());
        nested.setRestriction(restrictionField.getInternalValue());
        return nested;
    }

    public boolean isValid() {
        if(!nestedAttributeIri.isValid()) {
            nestedAttributeIri.setValidationVisible(true);
        }
        return nestedAttributeIri.getValue() != null && restrictionField.isValid();
    }

    public void addValueChangeListener(RestrictionField listener) {
        this.listener = listener;
        if(nestedAttributeIri!= null) {
            nestedAttributeIri.addValueChangeListener(listener);
            restrictionField.addValueChangeListener(this);
        }
    }

    @Override
    public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
        listener.valueChange(valueChangeEvent);
    }
}
