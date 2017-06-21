package at.notamWebapp.interestSpec.view.complexInterestForms;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.view.SemNotamForm;
import at.notamWebapp.interestSpec.view.simpleInterestForm.AircraftOfInterestForm;
import at.notamWebapp.interestSpec.view.simpleInterestForm.PeriodOfInterestForm;
import com.frequentis.semnotam.schema._1.FlightPlanInterestType;
import com.vaadin.ui.*;

/**
 * Created by khoef on 22.12.2016.
 */
public class FlightPlanInterestForm extends Panel implements SemNotamForm {
    private FlightPathInterestForm fpiForm;
    private PeriodOfInterestForm poiForm;
    private AircraftOfInterestForm aoiForm;
    private Label id = new Label();

    public FlightPlanInterestForm(SemNotamController controller, int id, FlightPlanInterestType flightPlan) {
        setId("FPLA"+id);
        this.id.setValue(getId());
        poiForm = new PeriodOfInterestForm(controller, id, flightPlan.getPeriod().getPeriodOfInterest());
        poiForm.setSizeFull();
        aoiForm = new AircraftOfInterestForm(controller, id, flightPlan.getAircraft().getAircraftOfInterest(), controller.loadAircraftIdsFromWS());
        aoiForm.setSizeFull();
        fpiForm = new FlightPathInterestForm(controller, id, flightPlan.getArea().getFlightPathInterest());
        fpiForm.setSizeFull();
        fpiForm.addAllAreas(flightPlan.getArea().getFlightPathInterest());
        Button deletePlan = new Button("Delete");
        deletePlan.setId("360");
        deletePlan.addClickListener(controller);
        HorizontalLayout idLayout = new HorizontalLayout();
        idLayout.setSpacing(true);
        idLayout.addComponents(this.id, deletePlan);
        VerticalLayout lfpi = new VerticalLayout(idLayout, poiForm, aoiForm, fpiForm);
        lfpi.setSpacing(true);
        lfpi.setMargin(true);
        lfpi.setSizeFull();
        setContent(lfpi);
    }

    @Override
    public void addController(SemNotamController controller) {

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
