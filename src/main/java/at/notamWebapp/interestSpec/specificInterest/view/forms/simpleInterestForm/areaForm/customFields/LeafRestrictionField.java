package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.customFields;

import com.frequentis.semnotam.schema._1.LeafRestrictionType;
import com.frequentis.semnotam.schema._1.QualifiedRestrictionType;
import com.frequentis.semnotam.schema._1.UnqualifiedRestrictionType;
import com.vaadin.data.validator.DoubleRangeValidator;
import com.vaadin.ui.*;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 11.08.2017.
 */
public class LeafRestrictionField extends VerticalLayout{
    private ComboBox restrictionType, operator, valueType;
    private DateField value_dateTime;
    private TextField value_string;
    private TextField value_decimal;
    private HorizontalLayout valueLayout;
    private LeafRestrictionType leaf;

    LeafRestrictionField(){
        addComponent(initContent());
    }

    private Component initContent() {
        setRestrictionTypeComboBox();
        setOperatorComboBox();
        setValueTypeComboBox();
        setValueStringField();
        setValueDateField();
        setValueDecimalField();

        Panel leafRestrictionPanel = new Panel("LeafRestriction");
        HorizontalLayout leafRestrictionLayout = new HorizontalLayout();
        valueLayout = new HorizontalLayout();

        leafRestrictionLayout.addComponents(restrictionType, valueType, valueLayout, operator);
        leafRestrictionPanel.setContent(leafRestrictionLayout);
        return new VerticalLayout(leafRestrictionPanel);
    }

    private void setRestrictionField() {
        switch (valueType.getValue().toString()) {
            case "String":
                value_decimal.clear();
                value_dateTime.clear();
                valueLayout.removeAllComponents();
                valueLayout.addComponent(value_string);
                break;
            case "Decimal":
                value_string.clear();
                value_dateTime.clear();
                valueLayout.removeAllComponents();
                valueLayout.addComponent(value_decimal);
                break;
            case "Date":
                value_string.clear();
                value_decimal.clear();
                valueLayout.removeAllComponents();
                valueLayout.addComponent(value_dateTime);
                break;
        }
    }

    public Class<? extends LeafRestrictionType> getType() {
        return LeafRestrictionType.class;
    }

    void setInternalValue(LeafRestrictionType newValue) {
        leaf = newValue;
        if(newValue instanceof QualifiedRestrictionType){
            restrictionType.setValue("QualifiedRestriction");
        } else if(newValue instanceof UnqualifiedRestrictionType){
            restrictionType.setValue("UnqualifiedRestriction");
        }
        if(newValue != null) {
            for (JAXBElement<?> obj : newValue.getContent()) {
                if (obj.getName().getLocalPart().equals("value_string")) {
                    valueType.setValue("String");
                    value_string.setValue((String) obj.getValue());
                    valueLayout.addComponent(value_string);
                } else if (obj.getName().getLocalPart().equals("value_decimal")) {
                    valueType.setValue("Decimal");
                    BigDecimal value = (BigDecimal) obj.getValue();
                    value_decimal.setValue(value.toString());
                    valueLayout.addComponent(value_decimal);
                } else if (obj.getName().getLocalPart().equals("value_dateTime")) {
                    valueType.setValue("Date");
                    value_dateTime.setConvertedValue(obj.getValue());
                    valueLayout.addComponent(value_dateTime);
                } else if (obj.getName().getLocalPart().equals("operator")) {
                    operator.setValue(obj.getValue());
                }
            }
        }
    }

    private void setValueDateField() {
        value_dateTime = new DateField("Value");
        value_dateTime.setRequired(true);
        value_dateTime.setRequiredError("Required");
        value_dateTime.setValidationVisible(false);
//        value_dateTime.setImmediate(true);
    }

    private void setValueStringField() {
        value_string = new TextField("Value");
        value_string.setRequired(true);
        value_string.setRequiredError("Required");
        value_string.setValidationVisible(false);
//        value_string.setImmediate(true);
    }

    private void setValueDecimalField() {
        value_decimal = new TextField("Value");
        value_decimal.setRequired(true);
        value_decimal.setRequiredError("Required");
        value_decimal.setValidationVisible(false);
 //       value_decimal.setImmediate(true);
        value_decimal.addValidator(new DoubleRangeValidator("",0.0, 999999999.99));
    }

    private void setValueTypeComboBox() {
        valueType = new ComboBox("Value Type");
        valueType.addItems("String", "Decimal", "Date");
        valueType.setItemCaption("String", "String");
        valueType.setItemCaption("Decimal", "Decimal");
        valueType.setItemCaption("Date", "Date");
        valueType.setNullSelectionItemId("");
        valueType.addValueChangeListener(valueChangeEvent -> setValueField());
    }

    private void setValueField() {
        valueLayout.removeAllComponents();
        switch (valueType.getValue().toString()) {
            case "String":
                valueLayout.addComponent(value_string);
                break;
            case "Decimal":
                valueLayout.addComponent(value_decimal);
                break;
            case "Date":
                valueLayout.addComponent(value_dateTime);
                break;
        }
    }

    private void setRestrictionTypeComboBox() {
        restrictionType = new ComboBox("Restriction Type");
        restrictionType.addItems("QualifiedRestriction", "UnqualifiedRestriction");
        restrictionType.setItemCaption("QualifiedRestriction", "QualifiedRestriction");
        restrictionType.setItemCaption("UnqualifiedRestriction", "UnqualifiedRestriction");
        restrictionType.setRequired(true);
        restrictionType.setRequiredError("Required");
        restrictionType.setValidationVisible(false);
    }


    LeafRestrictionType getInternalValue() {
        this.setImmediate(false);
        if(restrictionType != null && restrictionType.getValue() != null) {
            if (restrictionType.getValue().equals("QualifiedRestriction")) {
                leaf = new QualifiedRestrictionType();
            } else if (restrictionType.getValue().equals("UnqualifiedRestriction")) {
                leaf = new UnqualifiedRestrictionType();
            }
            if (leaf != null) {
                leaf.getContent().add(new JAXBElement<>(
                            new QName("http://semnotam.frequentis.com/schema/1.0", "operator"), String.class,
                            (String) operator.getValue()));
                if(valueType.getValue() != null) {
                    switch ((String) valueType.getValue()) {
                        case "String":
                            leaf.getContent().add(new JAXBElement<>(new QName("http://semnotam.frequentis.com/schema/1.0", "value_string"), String.class,
                                    value_string.getValue()));
                            break;
                        case "Decimal":
                            leaf.getContent().add(new JAXBElement<>(new QName("http://semnotam.frequentis.com/schema/1.0", "value_decimal"), String.class,
                                    value_decimal.getValue()));
                            break;
                        case "Date":
                            leaf.getContent().add(new JAXBElement<>(new QName("http://semnotam.frequentis.com/schema/1.0", "value_dateTime"), XMLGregorianCalendar.class,
                                    (XMLGregorianCalendar) value_dateTime.getConverter().convertToModel(value_dateTime.getValue(), XMLGregorianCalendar.class, null)));
                            break;
                    }
                }
            }
        }
        return leaf;
    }

    public boolean isValid() {
        if(valueLayout.getComponentCount() != 0) {
            TextField valueField = (TextField) valueLayout.getComponent(0);
            if (!valueField.isValid()) {
                valueField.setValidationVisible(true);
            }
            if (valueField.isValid()){
                if( !operator.isValid()) {
                    operator.setValidationVisible(true);
                }
            }
            if(!restrictionType.isValid()){
                operator.setValidationVisible(true);
            }
            return operator.isValid() && valueType.getValue() != null && valueField.isValid() && restrictionType.isValid();
        }
        else return false;
    }

    private void setOperatorComboBox(){
        operator = new ComboBox("Operator");

        operator.setRequired(true);
        operator.setRequiredError("Required");
        operator.setValidationVisible(false);
        operator.addItems("=", "!=", "&lt;", "&gt;", "&lt=", "&gt=");
        operator.setItemCaption("=", "=");
        operator.setItemCaption("!=", "!=");
        operator.setItemCaption("&lt;", "<");
        operator.setItemCaption("&gt;", ">");
        operator.setItemCaption("&lt=", "<=");
        operator.setItemCaption("&gt=", ">=");
    }

    public void addValueChangeListener(RestrictionField listener) {
        restrictionType.addValueChangeListener(listener);
        operator.addValueChangeListener(listener);
        value_string.addValueChangeListener(listener);
        value_decimal.addValueChangeListener(listener);
        value_dateTime.addValueChangeListener(listener);
    }
}
