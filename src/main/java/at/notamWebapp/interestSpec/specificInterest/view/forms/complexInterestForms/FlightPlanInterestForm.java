package at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.AircraftOfInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.PeriodOfInterestForm;
import com.frequentis.semnotam.schema._1.FlightPlanInterestType;
import com.vaadin.ui.*;

import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 22.12.2016.
 */
public class FlightPlanInterestForm extends Panel {
    private FlightPathInterestForm fpiForm;
    private PeriodOfInterestForm poiForm;
    private AircraftOfInterestForm aoiForm;

    public FlightPlanInterestForm(SemNotamController controller, int id, FlightPlanInterestType flightPlan,
                                  List<String> predefinedAircrafts) {
        setId("FPLA"+id);
        Label id1 = new Label();
        id1.setValue(getId());
        poiForm = new PeriodOfInterestForm(controller, id, flightPlan.getPeriod().getPeriodOfInterest());
        poiForm.setSizeFull();
        aoiForm = new AircraftOfInterestForm(controller, id, flightPlan.getAircraft().getAircraftOfInterest(),
                predefinedAircrafts);
        aoiForm.setSizeFull();
        fpiForm = new FlightPathInterestForm(controller, id);
        fpiForm.setSizeFull();
        fpiForm.addAllAreas(flightPlan.getArea().getFlightPathInterest());
        Button deletePlan = new Button("Delete");
        deletePlan.setId("360");
        deletePlan.addClickListener(controller);
        HorizontalLayout idLayout = new HorizontalLayout();
        idLayout.setSpacing(true);
        idLayout.addComponents(id1, deletePlan);
        VerticalLayout lfpi = new VerticalLayout(idLayout, poiForm, aoiForm, fpiForm);
        lfpi.setSpacing(true);
        lfpi.setMargin(true);
        lfpi.setSizeFull();
        setContent(lfpi);
    }

    public FlightPathInterestForm getFpiForm() {
        return fpiForm;
    }

    public AircraftOfInterestForm getAoiForm() {
        return aoiForm;
    }

    public PeriodOfInterestForm getPoiForm() {
        return poiForm;
    }
}
