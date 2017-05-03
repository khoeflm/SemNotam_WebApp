package at.notamWebapp.interestSpec.view.simpleInterestForm;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import com.frequentis.semnotam.schema._1.PeriodOfInterestType;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;

/**
 * Created by khoef on 20.11.2016.
 */
public class PeriodOfInterestForm extends Panel {
    private DateField dfOccStartTime = new DateField("Occurance Time (beginPos):");
    private DateField dfOccEndTime = new DateField("Occurance Time (endPos):");
    private DateField dfDetStartTime = new DateField("Departure Time (beginPos):");
    private DateField dfDetEndTime = new DateField("Arrival Time (endPos):");
    private TextField tfOccBufBef = new TextField("Buffer before:");
    private TextField tfOccBufAft = new TextField("Buffer after:");
    private Label id = new Label();
    private final BeanFieldGroup<PeriodOfInterestType> binder;



    public PeriodOfInterestForm(SemNotamController controller, int id, PeriodOfInterestType period){
        setId("PERI"+id);
        this.id.setValue(getId());

        VerticalLayout poifVertLayout = new VerticalLayout();
        HorizontalLayout occfHorizLayout = new HorizontalLayout(dfOccStartTime, dfOccEndTime);
        HorizontalLayout detHorizLayout = new HorizontalLayout(dfDetStartTime, dfDetEndTime);
        HorizontalLayout bufferLayout = new HorizontalLayout(tfOccBufBef, tfOccBufAft);
        Button deletePeriod = new Button("Delete");
        deletePeriod.setId("370");
        deletePeriod.addClickListener(controller);
        HorizontalLayout idLayout = new HorizontalLayout();
        idLayout.setSpacing(true);
        idLayout.addComponents(this.id, deletePeriod);
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
        binder = new BeanFieldGroup<>(PeriodOfInterestType.class);
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
        tfOccBufBef.addValueChangeListener(valueChangeEvent -> tfOccBufBef.commit());
        tfOccBufAft.addValueChangeListener(valueChangeEvent -> tfOccBufAft.commit());
    }
}
