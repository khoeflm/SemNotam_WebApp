package at.notamWebapp.interestSpec.view;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.generalInterest.controller.GeneralInterest;
import at.notamWebapp.interestSpec.generalInterest.view.GeneralInterestForm;
import at.notamWebapp.interestSpec.view.complexInterestForms.*;
import at.notamWebapp.interestSpec.view.simpleInterestForm.AircraftOfInterestForm;
import at.notamWebapp.interestSpec.view.simpleInterestForm.AttributeOfInterestForm;
import at.notamWebapp.interestSpec.view.simpleInterestForm.PeriodOfInterestForm;
import at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.AreaOfInterestForm;
import com.frequentis.semnotam.schema._1.*;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Page;
import com.vaadin.ui.*;

import java.util.LinkedList;

/**
 * Created by khoef on 18.11.2016.
 * Starting Page of the Application
 */
public class InterestSpecificationForm extends FormLayout implements SemNotamForm, View{
    //Instance has its own controller. MenuBar is Standard in the Application.
    // Following Interests (FlightPlan Interest, Period Interest,...) are saved in the "interestList"
    private SemNotamController controller;
    private InterestMenuBarForm imbForm;
    private LinkedList<Panel> interestList = new LinkedList<>();
    private TextField interestSpecID;
    private CheckBox disableGeneral, disableSpecific;
    private GeneralInterestForm generalInterest;
    private VerticalLayout interestForms = new VerticalLayout();
    private Button bLoadInterestSpec = new Button("Load IS");
    private Button bSaveInterestSpec = new Button("Save IS");
    private Button bEvaluateInterestSpec = new Button("Eval IS");
    private LoadInterestWindow loadInterestWindow;
    private AlreadyExistingFileWindow alreadyExistingFileWindow;

    //Constructor of the StartingPage
    //Two Title labels... Instantiation of the UI Object
    //MenuBar is Added
    public InterestSpecificationForm(){
        setWidth("99% ");
        this.controller = new SemNotamController(this);
        Label lTitle1 = new Label("SemNOTAM - Web Application");
        HorizontalLayout isStartMenuHorLay = new HorizontalLayout();
        Panel interestSpec1 = new Panel();
        interestSpec1.setContent(isStartMenuHorLay);
        interestSpecID = new TextField("InterestSpecificationID:");
        bLoadInterestSpec.setId("loadIS");
        bSaveInterestSpec.setId("saveIS");
        bEvaluateInterestSpec.setId("evalIS");
        bSaveInterestSpec.addClickListener(controller);
        bLoadInterestSpec.addClickListener(controller);
        bEvaluateInterestSpec.addClickListener(controller);
        isStartMenuHorLay.addComponents(interestSpecID, bSaveInterestSpec, bLoadInterestSpec, bEvaluateInterestSpec);
        isStartMenuHorLay.setMargin(true);
        isStartMenuHorLay.setSpacing(true);
        isStartMenuHorLay.setComponentAlignment(bLoadInterestSpec, Alignment.BOTTOM_CENTER);
        isStartMenuHorLay.setComponentAlignment(bSaveInterestSpec, Alignment.BOTTOM_CENTER);
        isStartMenuHorLay.setComponentAlignment(bEvaluateInterestSpec, Alignment.BOTTOM_CENTER);

        imbForm = new InterestMenuBarForm(controller);
        generalInterest = new GeneralInterest().getForm();
        disableGeneral = new CheckBox("Disable General Interest");
        disableSpecific = new CheckBox("Disable Specific Interest");

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
    }

    @Override
    public void addController(SemNotamController controller) {
    }

    public GeneralInterestForm getGeneralInterestForm() {
        return generalInterest;
    }

    public LinkedList<Panel> getInterestList() {
        return interestList;
    }

    public void setInterestSpecID(TextField interestSpecID) {
        this.interestSpecID = interestSpecID;
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

    public BinaryInterestForm getComplexInterestForm(String id){
        BinaryInterestForm cif;
        for (Panel interest : interestList){
            if(interest.getId().equals(id)){
                cif = (BinaryInterestForm) interest;
                return cif;
            }
        }
        return null;
    }

    public AircraftOfInterestForm getAircraftOfInterestForm(String id){
        AircraftOfInterestForm aoif;
        for(Panel interest : interestList){
            if(interest.getId().equals(id)){
                aoif = (AircraftOfInterestForm) interest ;
                return aoif;
            }
        }
        return null;
    }

    public PeriodOfInterestForm getPeriodOfInterestForm(String id){
        PeriodOfInterestForm poif;
        for(Panel interest : interestList){
            if(interest.getId().equals(id)){
                poif = (PeriodOfInterestForm) interest ;
                return poif;
            }
        }
        return null;
    }

    public AttributeOfInterestForm getAttributeOfInterestForm(String id){
        for(Panel interest : interestList){
            if(interest instanceof AttributeOfInterestForm){
                return (AttributeOfInterestForm) interest ;
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


    public FlightPlanInterestForm addFlightPlanInterest(int id, FlightPlanInterestType flightPlan) {
        return addFlightPlanInterest(id, flightPlan, interestForms);
    }

    public FlightPlanInterestForm addFlightPlanInterest(int id, FlightPlanInterestType flightPlan, Layout lay) {
        FlightPlanInterestForm fpiForm = new FlightPlanInterestForm(controller, id, flightPlan);
        fpiForm.setCaption("FlightPlanInterest");
        interestList.add(fpiForm);
        interestList.add(fpiForm.getPoiForm());
        interestList.add(fpiForm.getAoiForm());
        interestList.add(fpiForm.getFpiForm());
        lay.addComponent(fpiForm);
        return fpiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/


    public PeriodOfInterestForm addPeriodInterest(int id, PeriodOfInterestType period) {
        return addPeriodInterest(id, period, interestForms);
    }

    public PeriodOfInterestForm addPeriodInterest(int id, PeriodOfInterestType period, Layout lay) {
        PeriodOfInterestForm poiForm = new PeriodOfInterestForm(controller, id, period);
        interestList.add(poiForm);
        lay.addComponent(poiForm);
        return poiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public AircraftOfInterestForm addAircraftInterest(int id, AircraftOfInterestType aircraft) {
        return addAircraftInterest(id, aircraft, interestForms);
    }

    public AircraftOfInterestForm addAircraftInterest(int id, AircraftOfInterestType aircraft, Layout lay) {
        AircraftOfInterestForm aoiForm = new AircraftOfInterestForm(controller, id, aircraft, controller.loadAircraftIdsFromWS());
        interestList.add(aoiForm);
        lay.addComponent(aoiForm);
        return aoiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public FlightPathInterestForm addFlightPathInterest(int id, FlightPathInterestType flightPath) {
        return addFlightPathInterest(id, flightPath, interestForms);
    }

    public FlightPathInterestForm addFlightPathInterest(int id, FlightPathInterestType flightPath, Layout lay) {
        FlightPathInterestForm fpiForm = new FlightPathInterestForm(controller, id, flightPath);
        interestList.add(fpiForm);
        lay.addComponent(fpiForm);
        for(Panel area : fpiForm.getFlightPath()){
            interestList.add(area);
        }
        return fpiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public AttributeOfInterestForm addAttributeOfInterest(int id, AttributeOfInterestType attributeOfInterest) {
        return addAttributeOfInterest(id, attributeOfInterest, interestForms);
    }

    public AttributeOfInterestForm addAttributeOfInterest(int id, AttributeOfInterestType attribute, Layout lay) {
        AttributeOfInterestForm aoiForm = new AttributeOfInterestForm(controller, id, attribute);
        interestList.add(aoiForm);
        lay.addComponent(aoiForm);
        return aoiForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public BinaryInterestForm addBinaryUnion(int id, BinaryUnionInterestType binaryUnionInterest) {
        return addBinaryUnion(id, binaryUnionInterest, interestForms);
    }

    public BinaryInterestForm addBinaryUnion(int id, BinaryUnionInterestType binaryUnionInterest, Layout lay) {
        BinaryUnionForm binaryUnionForm = new BinaryUnionForm(controller, id);
        interestList.add(binaryUnionForm);
        lay.addComponent(binaryUnionForm);
        return binaryUnionForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public BinaryInterestForm addBinaryIntersect(int id, BinaryIntersectionInterestType binaryIntersectionInterest) {
        return addBinaryIntersect(id, binaryIntersectionInterest, interestForms);
    }

    public BinaryInterestForm addBinaryIntersect(int id, BinaryIntersectionInterestType binaryIntersectionInterest, Layout lay) {
        BinaryIntersectForm binaryIntersectForm = new BinaryIntersectForm(controller, id);
        interestList.add(binaryIntersectForm);
        lay.addComponent(binaryIntersectForm);
        return binaryIntersectForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public GroupInterestForm addGroupIntersect(int id, IntersectionInterestType intersectionInterest) {
        return addGroupIntersect(id, intersectionInterest, interestForms);
    }

    public GroupInterestForm addGroupIntersect(int id, IntersectionInterestType intersectionInterest, Layout lay) {
        GroupIntersectForm groupIntersectForm = new GroupIntersectForm(controller, id);
        interestList.add(groupIntersectForm);
        lay.addComponent(groupIntersectForm);
        return groupIntersectForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public GroupInterestForm addGroupUnion(int id, UnionInterestType unionInterest) {
        return addGroupUnion(id, unionInterest, interestForms);
    }

    public GroupInterestForm addGroupUnion(int id, UnionInterestType unionInterest, Layout lay) {
        GroupUnionForm groupUnionForm = new GroupUnionForm(controller, id);
        interestList.add(groupUnionForm);
        interestForms.addComponent(groupUnionForm);
        return groupUnionForm;
    }

    /*================================================================================================================
    ================================================================================================================*/

    public void saveNotification() {
        new Notification("Added Interest to Flightpath").show(Page.getCurrent());
    }

    /*================================================================================================================
    ================================================================================================================*/

    // GETTER METHODS:

    public String getRootElement(){
        if(interestForms.getComponentCount() > 1){
            new Notification("There is more than one Root Element for the Specific Interest").show(Page.getCurrent());
            return "-1";
        }
        else if(interestForms.getComponentCount() < 1){
            new Notification("There is no Specific Interest").show(Page.getCurrent());
            return "-1";
        }
        else {
            String rootElement = interestForms.getComponent(0).getId();
            return rootElement;
        }
    }

    public Panel getInterestForm(String id) {
        for(Panel interest : interestList){
            if(interest.getId().equals(id)){
                return interest;
            }
        }
        return null;
    }

    public LinkedList<AreaOfInterestForm> getAreaOfInterestFormList(String id) {
        FlightPathInterestForm flightpath = getFlightPathInterestForm(id);
        return flightpath.getFlightPath();
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

    public LoadInterestWindow getLoadInterestWindow() {
        return loadInterestWindow;
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

    public void addSpecificInterest(InterestPropertyType specificInterest) {

    }

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
}
