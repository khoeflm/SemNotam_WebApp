package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import com.frequentis.semnotam.schema._1.PeriodOfInterestType;
import com.vaadin.data.Validator;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.11.2016.
 */
public class PeriodOfInterestForm extends Panel {
    private DateField dfOccStartTime = new DateField("Occurence Time (beginPos):");
    private DateField dfOccEndTime = new DateField("Occurence Time (endPos):");
    private DateField dfDetStartTime = new DateField("Detection Time (beginPos):");
    private DateField dfDetEndTime = new DateField("Detection Time (endPos):");
    private TextField tfOccBufBef = new TextField("Buffer before: [min]");
    private TextField tfOccBufAft = new TextField("Buffer after: [min]");


    public PeriodOfInterestForm(SemNotamController controller, int id, PeriodOfInterestType period){
        setId("PERI"+id);
        Label id1 = new Label();
        id1.setValue(getId());

        VerticalLayout poifVertLayout = new VerticalLayout();
        HorizontalLayout occfHorizLayout = new HorizontalLayout(dfOccStartTime, dfOccEndTime);
        HorizontalLayout detHorizLayout = new HorizontalLayout(dfDetStartTime, dfDetEndTime);
        HorizontalLayout bufferLayout = new HorizontalLayout(tfOccBufBef, tfOccBufAft);
        Button deletePeriod = new Button("Delete");
        deletePeriod.setId("370");
        deletePeriod.addClickListener(controller);
        HorizontalLayout idLayout = new HorizontalLayout();
        idLayout.setSpacing(true);
        idLayout.addComponents(id1, deletePeriod);
        poifVertLayout.addComponents(idLayout, occfHorizLayout, detHorizLayout, bufferLayout);
        poifVertLayout.setSpacing(true);
        poifVertLayout.setMargin(true);
        occfHorizLayout.setSpacing(true);
        detHorizLayout.setSpacing(true);
        bufferLayout.setSpacing(true);
        dfOccStartTime.setResolution(Resolution.MINUTE);
        dfOccEndTime.setResolution(Resolution.MINUTE);
        dfDetEndTime.setResolution(Resolution.MINUTE);
        dfDetStartTime.setResolution(Resolution.MINUTE);

        setCaption("Period of Interest");
        setContent(poifVertLayout);
        BeanItem item = new BeanItem(period);
        BeanFieldGroup<PeriodOfInterestType> binder = new BeanFieldGroup<>(PeriodOfInterestType.class);
        binder.setItemDataSource(item);
        binder.bind(dfDetStartTime, "detTime.timeInterval.beginPosition");
        binder.bind(dfDetEndTime, "detTime.timeInterval.endPosition");
        binder.bind(dfOccStartTime, "occTime.timeInterval.beginPosition");
        binder.bind(dfOccEndTime, "occTime.timeInterval.endPosition");
        binder.bind(tfOccBufBef, "timeBuffer.temporalBuffer.before");
        binder.bind(tfOccBufAft, "timeBuffer.temporalBuffer.after");

        dfOccStartTime.addValueChangeListener(valueChangeEvent -> dfOccStartTime.commit());
        dfOccEndTime.addValueChangeListener(valueChangeEvent -> dfOccEndTime.commit());
        dfDetStartTime.addValueChangeListener(valueChangeEvent -> dfDetStartTime.commit());
        dfDetEndTime.addValueChangeListener(valueChangeEvent -> dfDetEndTime.commit());
        tfOccBufBef.addValueChangeListener(valueChangeEvent ->
                    {
                        try{
                            tfOccBufBef.commit();
                        } catch (Validator.InvalidValueException e){
                        //    tfOccBufBef.setComponentError(new UserError("Only numeric values allowed"));
                        }
                    });
        tfOccBufAft.addValueChangeListener(valueChangeEvent ->
                    {
                        try{
                            tfOccBufAft.commit();
                        } catch (Validator.InvalidValueException e){
                        //    tfOccBufAft.setComponentError(new UserError("Only numeric values allowed"));
                        }
                    });

        //Validation of Start and End Time
        dfDetEndTime.addValueChangeListener(valueChangeEvent ->
                {
                    if(dfDetStartTime.getValue() != null && dfDetEndTime.getValue().before(dfDetStartTime.getValue())){
                        dfDetEndTime.setValue(dfOccStartTime.getValue());
                        new Notification(
                                "Attention",
                                "End date must be after start date",
                                Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
                    }else dfDetEndTime.commit();
                }
        );

        dfDetStartTime.addValueChangeListener(valueChangeEvent ->
                {

                    if(dfDetEndTime.getValue() != null && dfDetStartTime.getValue().after(dfDetEndTime.getValue())){
                        dfDetStartTime.setValue(dfDetEndTime.getValue());
                        new Notification(
                                "Attention",
                                "End date must be after start date",
                                Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
                    }else dfDetStartTime.commit();
                }
        );

        //Validation of Start and End Time
        dfOccEndTime.addValueChangeListener(valueChangeEvent ->
                {
                    if(dfOccStartTime.getValue() != null && dfOccEndTime.getValue().before(dfOccStartTime.getValue())){
                        dfOccEndTime.setValue(dfOccStartTime.getValue());
                        new Notification(
                                "Attention",
                                "End date must be after start date",
                                Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
                    }else dfOccEndTime.commit();
                }
        );

        dfOccStartTime.addValueChangeListener(valueChangeEvent ->
                {

                    if(dfOccEndTime.getValue() != null && dfOccStartTime.getValue().after(dfOccEndTime.getValue())){
                        dfOccStartTime.setValue(dfOccEndTime.getValue());
                        new Notification(
                                "Attention",
                                "End date must be after start date",
                                Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
                    }else dfOccStartTime.commit();
                }
        );
    }
}
