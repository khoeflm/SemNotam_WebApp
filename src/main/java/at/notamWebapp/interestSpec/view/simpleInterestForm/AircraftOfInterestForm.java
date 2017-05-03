package at.notamWebapp.interestSpec.view.simpleInterestForm;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import com.frequentis.semnotam.schema._1.AircraftOfInterestType;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.event.FieldEvents;
import com.vaadin.ui.*;

import java.util.List;

/**
 * Created by khoef on 20.11.2016.
 */
public class AircraftOfInterestForm extends Panel{
    private ComboBox cbAircraftType = new ComboBox("Choose Aircraft:");
    private ComboBox cbILSCat = new ComboBox("Choose ILS Category:");
    private final BeanFieldGroup<AircraftOfInterestType> binder;
    private Label id = new Label();
    private List<String> aircrafts;


    public AircraftOfInterestForm(SemNotamController controller, int id, AircraftOfInterestType aircraft,
                                  List<String> predefindeAircrafts){
        setId("AIRC"+id);
        this.id.setValue(getId());
        setCaption("Aircraft of Interest");

        HorizontalLayout aoifHorizLayout = new HorizontalLayout(cbAircraftType, cbILSCat);
        HorizontalLayout idLayout = new HorizontalLayout();

        binder = new BeanFieldGroup<>(AircraftOfInterestType.class);
        binder.setItemDataSource(new BeanItem<>(aircraft));
        binder.bind(cbAircraftType, "aircraftTypeName");
        binder.bind(cbILSCat, "ilsCat.value");

        cbAircraftType.addItems(predefindeAircrafts);
        cbAircraftType.setTextInputAllowed(true);
        cbAircraftType.setNewItemsAllowed(true);
        cbAircraftType.setId("160");
        cbAircraftType.addBlurListener((FieldEvents.BlurListener) blurEvent -> {
            try {
                binder.commit();
            } catch (FieldGroup.CommitException e) {
                e.printStackTrace();
            }
        });
        cbILSCat.setTextInputAllowed(true);
        cbILSCat.setNewItemsAllowed(true);
        cbILSCat.setId("160");
        cbILSCat.addBlurListener((FieldEvents.BlurListener) blurEvent -> {
            try {
                binder.commit();
            } catch (FieldGroup.CommitException e) {
                e.printStackTrace();
            }
        });

        Button deleteAircraftForm = new Button("Delete");
        deleteAircraftForm.setId("370");
        deleteAircraftForm.addClickListener(controller);

        idLayout.setSpacing(true);
        idLayout.addComponents(this.id, deleteAircraftForm);
        VerticalLayout aircraftLayout = new VerticalLayout(idLayout, aoifHorizLayout);
        aircraftLayout.setMargin(true);
        aircraftLayout.setSpacing(true);
        setContent(aircraftLayout);
    }
}
