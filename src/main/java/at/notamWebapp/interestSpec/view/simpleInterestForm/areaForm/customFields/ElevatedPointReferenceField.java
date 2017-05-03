package at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.customFields;

import com.frequentis.semnotam.schema._1.ElevatedPointReferencePropertyType;
import com.vaadin.data.Validator;
import com.vaadin.ui.*;

/**
 * Created by khoef on 29.01.2017.
 */
public class ElevatedPointReferenceField extends CustomField<ElevatedPointReferencePropertyType> {
    private TextField x = new TextField();
    private TextField y = new TextField();
    @Override
    protected Component initContent() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addComponents(x, y);
        horizontalLayout.setComponentAlignment(x, Alignment.BOTTOM_LEFT);
        horizontalLayout.setComponentAlignment(y, Alignment.BOTTOM_RIGHT);
        x.setImmediate(true);
        y.setImmediate(true);
        this.setImmediate(true);
        x.setWidth("95%");
        y.setWidth("95%");
        x.addValueChangeListener(valueChangeEvent -> commit());
        y.addValueChangeListener(valueChangeEvent -> commit());
        setSizeFull();
        horizontalLayout.setSizeFull();
        return horizontalLayout;
    }

    @Override
    public void commit() throws SourceException, Validator.InvalidValueException {
        super.commit();
    }


    @Override
    public void setCaption(String caption) {
        x.setCaption(caption);
    }


    @Override
    public Class getType() {
        return ElevatedPointReferencePropertyType.class;
    }

    @Override
    protected void setInternalValue(ElevatedPointReferencePropertyType newValue) {
        if(newValue.getHref() != "") {
            String[] values = newValue.getHref().split("\\s+");
            x.setValue(values[0]);
            y.setValue(values[1]);
        }else{
            x.setValue("");
            y.setValue("");
        }
        super.setInternalValue(newValue);
    }

    @Override
    protected ElevatedPointReferencePropertyType getInternalValue() {
        ElevatedPointReferencePropertyType point = new ElevatedPointReferencePropertyType();
        point.setHref(x.getValue()+" "+y.getValue());
        return point;
    }

}
