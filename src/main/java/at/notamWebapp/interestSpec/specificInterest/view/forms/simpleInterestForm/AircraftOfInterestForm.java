package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import com.frequentis.semnotam.schema._1.AircraftOfInterestType;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.event.FieldEvents;
import com.vaadin.ui.*;

import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.11.2016.
 */
public class AircraftOfInterestForm extends Panel{
    private final BeanFieldGroup<AircraftOfInterestType> binder;

    public AircraftOfInterestForm(SemNotamController controller, int id, AircraftOfInterestType aircraft,
                                  List<String> predefindeAircrafts){
        setId("AIRC"+id);
        Label id1 = new Label();
        id1.setValue(getId());
        setCaption("Aircraft of Interest");

        ComboBox cbAircraftType = new ComboBox("Choose Aircraft:");
        ComboBox cbILSCat = new ComboBox("Choose ILS Category:");
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
        cbILSCat.setNewItemsAllowed(false);
        cbILSCat.setId("160");
        cbILSCat.addItems("I", "II", "III");
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
        idLayout.addComponents(id1, deleteAircraftForm);
        VerticalLayout aircraftLayout = new VerticalLayout(idLayout, aoifHorizLayout);
        aircraftLayout.setMargin(true);
        aircraftLayout.setSpacing(true);
        setContent(aircraftLayout);
    }
}
