package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.customFields;

import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.AttributeOfInterestForm;
import com.frequentis.semnotam.schema._1.LeafRestrictionType;
import com.frequentis.semnotam.schema._1.NestedRestrictionType;
import com.frequentis.semnotam.schema._1.RestrictionPropertyType;
import com.vaadin.data.Property;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 11.08.2017.
 */
public class RestrictionField extends VerticalLayout implements Property.ValueChangeListener {
    private ComboBox restrictionType;
    private HorizontalLayout childLayout;
    private LeafRestrictionField leafField;
    private NestedRestrictionField nestedField;
    private RestrictionPropertyType restriction;
    private Property.ValueChangeListener listener;

    public RestrictionField(){
        addComponent(initContent());
    }

    protected Component initContent() {
        this.setImmediate(false);

        restrictionType = new ComboBox("Type");
        childLayout = new HorizontalLayout();

        Panel restrictionPanel = new Panel(), subRestrictionPanel = new Panel("Restriction");
        VerticalLayout panelLayout = new VerticalLayout(restrictionType, childLayout);

        restrictionPanel.setContent(panelLayout);

        restrictionType.addItems("NestedRestriction", "LeafRestriction");
        restrictionType.setItemCaption("NestedRestriciton", "NestedRestriction");
        restrictionType.setItemCaption("LeafRestriction", "LeafRestriction");
        restrictionType.addValueChangeListener(valueChangeEvent -> setNewRestriction());


        return restrictionPanel;
    }

    public void setInternalValue(RestrictionPropertyType newValue) {
        if(newValue == null){
            newValue = new RestrictionPropertyType();
        }
        restriction = newValue;
        if (newValue.getLeafRestriction() != null) {
            if(leafField == null){
                new LeafRestrictionField();
            }
            restrictionType.setValue("LeafRestriction");
            leafField.setInternalValue(newValue.getLeafRestriction());
            leafField.addValueChangeListener(this);
            childLayout.addComponent(leafField);
        } else if (newValue.getNestedRestriction() != null) {
            if(nestedField == null){
                nestedField = new NestedRestrictionField();
            }
            restrictionType.setValue("NestedRestriction");
            nestedField.setInternalValue(newValue.getNestedRestriction());
            nestedField.addValueChangeListener(this);
            childLayout.addComponent(nestedField);
        }
    }

    public RestrictionPropertyType getInternalValue() {
        if(restrictionType != null && restrictionType.getValue() != null) {
            RestrictionPropertyType restrictionPropertyType = new RestrictionPropertyType();
            if (restrictionType.getValue().equals("NestedRestriction")) {
                if(nestedField == null){
                    nestedField = new NestedRestrictionField();
                }
                restrictionPropertyType.setNestedRestriction(nestedField.getInternalValue());
                restrictionPropertyType.setLeafRestriction(null);
                return restrictionPropertyType;
            } else if (restrictionType.getValue().equals("LeafRestriction")) {
                if(leafField == null){
                    leafField = new LeafRestrictionField();
                }
                restrictionPropertyType.setLeafRestriction(leafField.getInternalValue());
                restrictionPropertyType.setNestedRestriction(null);
                return restrictionPropertyType;
            }
        }
        return null;
    }

    public boolean isValid() {
        if(restrictionType.getValue().equals("NestedRestriction")){
            NestedRestrictionField resField = (NestedRestrictionField) childLayout.getComponent(0);
            return resField.isValid();
        }
        else if (restrictionType.getValue().equals("LeafRestriction")){
            LeafRestrictionField leafField = (LeafRestrictionField) childLayout.getComponent(0);
            return leafField.isValid();
        }
        else return false;
    }

    private void setNewRestriction(){
        if(restrictionType.getValue().equals("NestedRestriction")){
            if(restriction.getNestedRestriction() == null){
                restriction.setNestedRestriction(new NestedRestrictionType());
            }
            if(nestedField == null){
                nestedField = new NestedRestrictionField();
            }
            childLayout.removeAllComponents();
            nestedField.setInternalValue(restriction.getNestedRestriction());
            nestedField.addValueChangeListener(this);
            childLayout.addComponent(nestedField);
        }
        else if (restrictionType.getValue().equals("LeafRestriction")){
            if(restriction.getLeafRestriction() == null){
                restriction.setLeafRestriction(new LeafRestrictionType());
            }
            if(leafField == null){
                leafField = new LeafRestrictionField();
            }
            childLayout.removeAllComponents();
            leafField.setInternalValue(restriction.getLeafRestriction());
            leafField.addValueChangeListener(this);
            childLayout.addComponent(leafField);
        }
    }

    @Override
    public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
        if(leafField != null) {
            LeafRestrictionType leaf = leafField.getInternalValue();
            restriction.setLeafRestriction(leaf);
        }
        else if(nestedField != null) {
             restriction.setNestedRestriction(nestedField.getInternalValue());
        }
        listener.valueChange(valueChangeEvent);
    }

    public void addValueChangeListener(AttributeOfInterestForm listener) {
        this.listener = listener;
    }

    public void addValueChangeListener(NestedRestrictionField listener) {
        this.listener = listener;
    }
}
