package at.notamWebapp.interestSpec.specificInterest.view;

import at.notamWebapp.interestSpec.generalInterest.controller.GeneralInterest;
import at.notamWebapp.interestSpec.generalInterest.view.GeneralInterestForm;
import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.interestSpec.specificInterest.view.forms.AddAreaOfInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.FormValidatorInterface;
import at.notamWebapp.interestSpec.specificInterest.view.forms.InterestMenuBarForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms.*;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.AircraftOfInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.AttributeOfInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.PeriodOfInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.windows.AlreadyExistingFileWindow;
import at.notamWebapp.interestSpec.specificInterest.view.windows.LoadInterestWindow;
import com.frequentis.semnotam.schema._1.*;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Page;
import com.vaadin.ui.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by khoef on 18.11.2016.
 * Starting Page of the Application
 */
public class InterestSpecificationForm extends FormLayout implements View{
    //Instance has its own controller. MenuBar is Standard in the Application.
    // Following Interests (FlightPlan Interest, Period Interest,...) are saved in the "interestList"
    private SemNotamController controller;
    private InterestMenuBarForm imbForm;
    private LinkedList<Panel> interestList = new LinkedList<>();
    private TextField interestSpecID;
    private CheckBox disableGeneral, disableSpecific;
    private GeneralInterestForm generalInterest;
    private VerticalLayout interestForms = new VerticalLayout();
    private LoadInterestWindow loadInterestWindow;
    private AlreadyExistingFileWindow alreadyExistingFileWindow;

    //Constructor of the StartingPage
    //Two Title labels... Instantiation of the UI Object
    //MenuBar is Added
    InterestSpecificationForm(){
        setWidth("99% ");
        generalInterest = new GeneralInterest().getForm();
        controller = new SemNotamController(this);
        interestSpecID = new TextField("InterestSpecificationID:");
        imbForm = new InterestMenuBarForm(controller);
        disableGeneral = new CheckBox("Disable General Interest");
        disableSpecific = new CheckBox("Disable Specific Interest");


        Label lTitle1 = new Label("SemNOTAM - Web Application");
        HorizontalLayout isStartMenuHorLay = new HorizontalLayout();
        Panel interestSpec1 = new Panel();
        interestSpec1.setContent(isStartMenuHorLay);
        Button bLoadInterestSpec = new Button("Load IS");
        Button bSaveInterestSpec = new Button("Save IS");
        Button bEvaluateInterestSpec = new Button("Eval IS");
        Button bValidateInterestSpec = new Button("Validate IS");

        //Set Button Id's
        bLoadInterestSpec.setId("loadIS");
        bSaveInterestSpec.setId("saveIS");
        bEvaluateInterestSpec.setId("evalIS");
        bValidateInterestSpec.setId("valIS");

        bSaveInterestSpec.addClickListener(controller);
        bLoadInterestSpec.addClickListener(controller);
        bEvaluateInterestSpec.addClickListener(controller);
        bValidateInterestSpec.addClickListener(controller);

        isStartMenuHorLay.addComponents(interestSpecID, bSaveInterestSpec, bLoadInterestSpec, bEvaluateInterestSpec,
                bValidateInterestSpec);
        isStartMenuHorLay.setMargin(true);
        isStartMenuHorLay.setSpacing(true);
        isStartMenuHorLay.setComponentAlignment(bLoadInterestSpec, Alignment.BOTTOM_CENTER);
        isStartMenuHorLay.setComponentAlignment(bSaveInterestSpec, Alignment.BOTTOM_CENTER);
        isStartMenuHorLay.setComponentAlignment(bEvaluateInterestSpec, Alignment.BOTTOM_CENTER);
        isStartMenuHorLay.setComponentAlignment(bValidateInterestSpec, Alignment.BOTTOM_CENTER);

        disableGeneral.addValueChangeListener(
                valueChangeEvent -> {
                    if(valueChangeEvent.getProperty().getValue().equals(true)){
                        generalInterest.setVisible(false);
                    }
                    else {
                        generalInterest.setVisible(true);
                    }
                }
        );

        disableSpecific.addValueChangeListener(
                valueChangeEvent -> {
                    if (valueChangeEvent.getProperty().getValue().equals(true)) {
                        imbForm.setVisible(false);
                        interestForms.setVisible(false);
                    } else {
                        imbForm.setVisible(true);
                        interestForms.setVisible(true);
                    }
                }
        );
        addComponent(lTitle1);
        addComponent(interestSpec1);
        addComponent(disableGeneral);
        addComponent(generalInterest);
        addComponent(disableSpecific);
        addComponents(imbForm, interestForms);

        interestSpecID.addValidator(new StringLengthValidator("Wrong length",1,35,false));
        interestSpecID.addValidator(new RegexpValidator("\\w+","Only [A-Z],[a-z],[0-9] and [_] are allowed"));
        interestSpecID.setValidationVisible(false);
    }

    public GeneralInterestForm getGeneralInterestForm() {
        return generalInterest;
    }

    public LinkedList<Panel> getInterestList() {
        return interestList;
    }

    public TextField getInterestSpecID() {
        return interestSpecID;
    }

    public InterestMenuBarForm getImbForm() {
        return imbForm;
    }

    public FlightPathInterestForm getFlightPathInterestForm(String id){
        FlightPathInterestForm fpif;
        for(Panel interest : interestList){
            if(interest.getId().equals(id.substring(0,5))){
                fpif = (FlightPathInterestForm) interest ;
                return fpif;
            }
        }
        return null;
    }

    public AddAreaOfInterestForm getAddAreaOfInterestForm(String id){
        FlightPathInterestForm fpif = getFlightPathInterestForm(id);
        if(fpif!=null){
            return fpif.getAddAreaForm();
        }
        else return null;
    }


    /*================================================================================================================
    ================================================================================================================*/

    public FlightPlanInterestForm addFlightPlanInterest(int id, FlightPlanInterestType flightPlan,
                                                        List<String> predefinedAircrafts) {
        FlightPlanInterestForm fpiForm = new FlightPlanInterestForm(controller, id, flightPlan, predefinedAircrafts);
        fpiForm.setCaption("FlightPlanInterest");
        interestList.add(fpiForm);
        interestList.add(fpiForm.getPoiForm());
        interestList.add(fpiForm.getAoiForm());
        interestList.add(fpiForm.getFpiForm());
        interestForms.addComponent(fpiForm);
        return fpiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public PeriodOfInterestForm addPeriodInterest(int id, PeriodOfInterestType period) {
        PeriodOfInterestForm poiForm = new PeriodOfInterestForm(controller, id, period);
        interestList.add(poiForm);
        interestForms.addComponent(poiForm);
        return poiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public AircraftOfInterestForm addAircraftInterest(int id, AircraftOfInterestType aircraft, List<String> predefinedAircrafts) {
        AircraftOfInterestForm aoiForm = new AircraftOfInterestForm(controller, id, aircraft, predefinedAircrafts);
        interestList.add(aoiForm);
        interestForms.addComponent(aoiForm);
        return aoiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public FlightPathInterestForm addFlightPathInterest(int id, FlightPathInterestType flightPath) {
        FlightPathInterestForm fpiForm = new FlightPathInterestForm(controller, id);
        interestList.add(fpiForm);
        interestForms.addComponent(fpiForm);
        fpiForm.addAllAreas(flightPath);
        for(Panel area : fpiForm.getFlightPath()){
            interestList.add(area);
        }
        return fpiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public AttributeOfInterestForm addAttributeOfInterest(int id, AttributeOfInterestType attribute, List<String> predefinedConcepts) {
        AttributeOfInterestForm aoiForm = new AttributeOfInterestForm(controller, id, attribute, predefinedConcepts);
        interestList.add(aoiForm);
        interestForms.addComponent(aoiForm);
        return aoiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public BinaryInterestForm addBinaryUnion(int id) {
        BinaryUnionForm binaryUnionForm = new BinaryUnionForm(controller, id);
        interestList.add(binaryUnionForm);
        interestForms.addComponent(binaryUnionForm);
        return binaryUnionForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public BinaryInterestForm addBinaryIntersect(int id) {
        BinaryIntersectForm binaryIntersectForm = new BinaryIntersectForm(controller, id);
        interestList.add(binaryIntersectForm);
        interestForms.addComponent(binaryIntersectForm);
        return binaryIntersectForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public GroupInterestForm addGroupIntersect(int id) {
        GroupIntersectForm groupIntersectForm = new GroupIntersectForm(controller, id);
        interestList.add(groupIntersectForm);
        interestForms.addComponent(groupIntersectForm);
        return groupIntersectForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public GroupInterestForm addGroupUnion(int id) {
        GroupUnionForm groupUnionForm = new GroupUnionForm(controller, id);
        interestList.add(groupUnionForm);
        interestForms.addComponent(groupUnionForm);
        return groupUnionForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    // GETTER METHODS:

    public String getRootElement(){
        if(!disableSpecific.getValue()) {
            if (interestForms.getComponentCount() > 1) {
                new Notification("There is more than one Root Element for the Specific Interest").show(Page.getCurrent());
                return ">1";
            } else if (interestForms.getComponentCount() < 1) {
                new Notification("There is no Specific Interest").show(Page.getCurrent());
                return "<1";
            } else {
                return interestForms.getComponent(0).getId();
            }
        }
        return "-1";
    }

    public Panel getInterestForm(String id) {
        for(Panel interest : interestList){
            if(interest.getId().equals(id)){
                return interest;
            }
        }
        return null;
    }

    public VerticalLayout getInterestForms() {
        return interestForms;
    }

    public CheckBox getDisableGeneral() {
        return disableGeneral;
    }

    public CheckBox getDisableSpecific() {
        return disableSpecific;
    }

    /*================================================================================================================
    ================================================================================================================*/

    // Add and Remove Load Interest Window to/from UI

    public void addLoadInterestWindow() {
        loadInterestWindow = new LoadInterestWindow(controller);
        getUI().addWindow(loadInterestWindow);
    }

    public void removeLoadInterestWindow() {
        getUI().removeWindow(loadInterestWindow);
    }

    /*================================================================================================================
    ================================================================================================================*/

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }

    public void setAlreadyExistingFileWindow(String filename) {
        alreadyExistingFileWindow = new AlreadyExistingFileWindow(filename, controller);
        getUI().addWindow(alreadyExistingFileWindow);
    }

    public void removeExistingFileWindow() {
        getUI().removeWindow(alreadyExistingFileWindow);
    }


    public boolean isSpecificInterestFormValid() {
        boolean isValid = true;
        for(Panel p : interestList){
            if(p instanceof FormValidatorInterface){
                if(!((FormValidatorInterface) p).isValid()) {
                    isValid = false;
                }
            }
        }
        return interestSpecID.isValid() && isValid && (interestForms.getComponentCount() == 1 || disableSpecific.getValue());
    }
}
