package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.interestSpec.specificInterest.view.forms.FormValidatorInterface;
import com.frequentis.semnotam.schema._1.AircraftOfInterestType;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.event.FieldEvents;
import com.vaadin.ui.*;

import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.11.2016.
 */
public class AircraftOfInterestForm extends Panel implements FormValidatorInterface{
    private final BeanFieldGroup<AircraftOfInterestType> binder;
    private ComboBox cbAircraftType;
    private ComboBox cbILSCat;

    public AircraftOfInterestForm(SemNotamController controller, int id, AircraftOfInterestType aircraft,
                                  List<String> predefinedAircrafts){
        setId("AIRC"+id);
        Label id1 = new Label();
        id1.setValue(getId());
        setCaption("Aircraft of Interest");

        cbAircraftType = new ComboBox("Choose Aircraft:");
        cbILSCat = new ComboBox("Choose ILS Category:");
        HorizontalLayout aoifHorizLayout = new HorizontalLayout(cbAircraftType, cbILSCat);
        HorizontalLayout idLayout = new HorizontalLayout();

        binder = new BeanFieldGroup<>(AircraftOfInterestType.class);
        binder.setItemDataSource(new BeanItem<>(aircraft));
        binder.bind(cbAircraftType, "aircraftTypeName");
        binder.bind(cbILSCat, "ilsCat.value");

        cbAircraftType.addItems(predefinedAircrafts);
        cbAircraftType.setTextInputAllowed(true);
        cbAircraftType.setNewItemsAllowed(true);
        cbAircraftType.setId("160");
        cbAircraftType.setRequired(true);
        cbAircraftType.setRequiredError("Required");
        cbAircraftType.setValidationVisible(false);
        cbAircraftType.addBlurListener((FieldEvents.BlurListener) blurEvent -> {
            /*try {
                if(cbAircraftType.getValue() != null) {
                        binder.commit();
                }
            } catch (FieldGroup.CommitException e) {
                e.printStackTrace();
            }*/
            if(cbAircraftType.getValue() != null) {
                cbAircraftType.commit();
            }
        });
        cbILSCat.setTextInputAllowed(true);
        cbILSCat.setNewItemsAllowed(false);
        cbILSCat.setId("160");
        cbILSCat.addItems("I", "II", "III");
        cbILSCat.setRequired(true);
        cbILSCat.setRequiredError("Required");
        cbILSCat.setValidationVisible(false);
        cbILSCat.addBlurListener((FieldEvents.BlurListener) blurEvent -> {
            /*
            try {

                if(cbILSCat.getValue() != null) {
                    binder.commit();
                }

            } catch (FieldGroup.CommitException e) {
                e.printStackTrace();

            }
            */
            if(cbILSCat.getValue() != null) {
                cbILSCat.commit();
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

    @Override
    public boolean isValid() {
        if(!cbAircraftType.isValid()){
            cbAircraftType.setValidationVisible(true);
        }
        if(!cbILSCat.isValid()){
            cbILSCat.setValidationVisible(true);
        }
        return cbAircraftType.isValid() && cbILSCat.isValid();
    }
}
