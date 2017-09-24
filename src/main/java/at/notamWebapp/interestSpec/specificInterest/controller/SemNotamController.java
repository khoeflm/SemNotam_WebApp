package at.notamWebapp.interestSpec.specificInterest.controller;

import at.notamWebapp.util.googleMapsService.GoogleMapsDrawer;
import at.notamWebapp.util.skyVectorFPHandler.FlightPlanLoader;
import at.notamWebapp.interestSpec.generalInterest.model.GeneralInterestModel;
import at.notamWebapp.interestSpec.specificInterest.model.InterestSpecificationService;
import at.notamWebapp.interestSpec.specificInterest.view.forms.AddAreaOfInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.InterestSpecificationForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms.BinaryInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms.FlightPathInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms.GroupInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.AreaOfInterestForm;
import at.notamWebapp.util.validator.Validation;
import at.notamWebapp.util.xmlHandler.XMLParserService;
import at.notamWebapp.util.xmlHandler.XMLUnmarshaller;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.frequentis.semnotam.schema._1.FlightPathInterestType;
import com.frequentis.semnotam.schema._1.InterestPropertyType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;
import com.vaadin.event.FieldEvents;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.server.Page;
import com.vaadin.ui.*;
import at.notamWebapp.util.skyVectorFPHandler.FlightPlan;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 22.11.2016.
 */
public class SemNotamController implements Button.ClickListener, FieldEvents.FocusListener, FieldEvents.BlurListener,
        Upload.Receiver, Upload.SucceededListener, TabSheet.SelectedTabChangeListener, ItemClickEvent.ItemClickListener{
    private InterestSpecificationForm view;
    private InterestSpecificationService model;
    private ElevatedDataController elevatedDataController;
    private File file;
    private int idCounter = 0; // numeric counter for interest identifier
    private ArrayList<String> chosenComplexInterests; //Collection of interests which are already added to complex interests.

    public SemNotamController(InterestSpecificationForm view){
        this.view = view;
        model = new InterestSpecificationService(this);
        chosenComplexInterests = new ArrayList<>();
        elevatedDataController = new ElevatedDataController(view, model);
    }

    public InterestSpecificationForm getView() {
        return view;
    }

    public InterestSpecificationService getModel() {
        return model;
    }

    public ElevatedDataController getElevatedDataController() {
        return elevatedDataController;
    }

    private List<String> loadAircraftIdsFromWS(){
        return SpecificInterestWS.getAircraftTypeIds();
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {

    /*================================================================================================================
    ================================================================================================================*/
    //Save Interest Spec in File
        if(clickEvent.getButton().getId().equals("saveIS")){
            if((view.getGeneralInterestForm().isValid() || view.getDisableGeneral().getValue())
                    && view.isSpecificInterestFormValid()) {
                String filename = view.getInterestSpecID().getValue();
                GeneralInterestModel generalInterest = view.getGeneralInterestForm().getGeneralInterestController().getModel();
                InterestSpecificationType interestSpec = model.getSavableInterestSpec(view.getRootElement(), filename, !view.getDisableSpecific().getValue(),
                        !view.getDisableGeneral().getValue(), generalInterest);
                if (interestSpec != null) {
                    if (XMLParserService.noSuchFileExists(filename, "tmp/InterestSpecification")) {
                        XMLParserService.createXMLFile(interestSpec, filename, "tmp/InterestSpecification");
                    } else {
                        view.setAlreadyExistingFileWindow(filename);
                    }
                }
            }else if(view.getInterestSpecID().getValue().length() == 0){
                view.getInterestSpecID().focus();
                new Notification("You must add a Name for your Interest Specification",
                        Notification.Type.ERROR_MESSAGE)
                        .show(Page.getCurrent());
            }
            else if(view.getInterestSpecID().getValue().length() > 35){
                view.getInterestSpecID().focus();
                new Notification("The name of your InterestSpecification is to long",
                        Notification.Type.ERROR_MESSAGE)
                        .show(Page.getCurrent());
            }
            else if(!view.getInterestSpecID().isValid()){
                view.getInterestSpecID().focus();
                new Notification("Only [A-Z],[a-z],[0-9] and \"_\" are allowed for the Interest Specification ID",
                        Notification.Type.ERROR_MESSAGE)
                        .show(Page.getCurrent());
            }
            else if(view.getRootElement().equals("<1")){
                new Notification("There is no Specific Interest",
                        Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
            }
            else if(view.getRootElement().equals(">1")){
                new Notification("There is more than one Root Element for the Specific Interest",
                        Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
            }
            else if(!view.getGeneralInterestForm().isValid() && !view.getDisableGeneral().getValue()){
                new Notification("At least one General Interest Dimension has to be chosen or General Interest is disabled!",
                        Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
            }else {
                new Notification("Something went wrong. IS not saved",
                        Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
            }
        }
        //Continue the saving off the file although there is an already existing file with the same name
        else if(clickEvent.getButton().getId().equals("contSave")){
            String filename = view.getInterestSpecID().getValue();
            GeneralInterestModel generalInterest =  view.getGeneralInterestForm().getGeneralInterestController().getModel();
            InterestSpecificationType interestSpec = model.getSavableInterestSpec(view.getRootElement(), filename,
                    !view.getDisableSpecific().getValue(), !view.getDisableGeneral().getValue(), generalInterest);
            if(interestSpec!=null) {
                XMLParserService.createXMLFile(interestSpec, filename, "tmp/InterestSpecification");
            }
            view.removeExistingFileWindow();
        }
        //Cancel saving due to already existing filename
        else if(clickEvent.getButton().getId().equals("cancelSave")){
            view.removeExistingFileWindow();
            view.getInterestSpecID().focus();
        }

    /*================================================================================================================
    ================================================================================================================*/
        // Validate Interest Spec
        else if(clickEvent.getButton().getId().equals("valIS")){
            String filename = view.getInterestSpecID().getValue();
            if(!filename.equals("")) {
                try {
                    Validation.validateXmlFile(filename);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


    /*================================================================================================================
    ================================================================================================================*/
    // Load existing Interst
        //open Load Window
        else if(clickEvent.getButton().getId().equals("loadIS")){
            view.addLoadInterestWindow();
        }




    /*================================================================================================================
    ================================================================================================================*/
        else if(clickEvent.getButton().getId().equals(("evalIS"))){
            view.getUI().getNavigator().navigateTo("EvalInterestSpec");
            //view.getMyUI().getMainLayout().removeAllComponents();
            //EvalNotamController evalNotamController = new EvalNotamController(view.getMyUI());

            //view.getMyUI().getMainLayout().addComponent(evalNotamController.getView());
        }
        else if(clickEvent.getButton().getId().equals("addInterest")){
            Object cbValue =  view.getImbForm().getCbNewInterest().getValue();
            if(cbValue != null) {
                String selectedInterest = cbValue.toString();
                idCounter++;
                InterestPropertyType interest = model.addInterest(selectedInterest, idCounter);
                switch (selectedInterest){
                    case "1":
                        view.addFlightPlanInterest(idCounter,interest.getFlightPlanInterest(), loadAircraftIdsFromWS());
                        break;
                    case "2":
                        view.addPeriodInterest(idCounter, interest.getPeriodOfInterest());
                        break;
                    case "3":
                        view.addAircraftInterest(idCounter, interest.getAircraftOfInterest(), loadAircraftIdsFromWS());
                        break;
                    case "4":
                        view.addFlightPathInterest(idCounter, interest.getFlightPathInterest());
                        break;
                    case "5":
                        view.addAttributeOfInterest(idCounter, interest.getAttributeOfInterest());
                        break;
                    case "6":
                        view.addBinaryIntersect(idCounter);
                        break;
                    case "7":
                        view.addBinaryUnion(idCounter);
                        break;
                    case "8":
                        view.addGroupIntersect(idCounter);
                        break;
                    case "9":
                        view.addGroupUnion(idCounter);
                        break;
                    case "10":
                        new Notification("Complement Interest isn't implemented yet!",
                                Notification.Type.ERROR_MESSAGE)
                                .show(Page.getCurrent());
                        break;
                }
            }
        }
        else if(clickEvent.getButton().getId().equals("addAreaInterest")){
            AddAreaOfInterestForm addAreaInterestForm = (AddAreaOfInterestForm) clickEvent.getButton().getParent().getParent();
            String pathId = addAreaInterestForm.getId();
            FlightPathInterestForm fpiForm = view.getFlightPathInterestForm(pathId);
            if(view.getAddAreaOfInterestForm(pathId) != null){
                String selectedArea = view.getAddAreaOfInterestForm(pathId).getCbAreaInterest().getValue().toString();
                AreaOfInterestPropertyType area = model.addAreaInterest(selectedArea, pathId);
                fpiForm.areaForm(area);
            }
        }
        else if(clickEvent.getButton().getId().equals("hide")){
            // Hide/show area detail
            Button hide = clickEvent.getButton();
            AreaOfInterestForm hideContent = (AreaOfInterestForm) hide.getParent().getParent().getParent();
            hideContent.hide();
        }
        else if(clickEvent.getButton().getId().equals("up")){
            // Move area in list dup/Sequence 1 down
            Button up = clickEvent.getButton();
            AreaOfInterestForm area = (AreaOfInterestForm) up.getParent().getParent().getParent();
            FlightPathInterestForm flightPath = (FlightPathInterestForm) area.getParent().getParent().getParent();
            flightPath.moveAreaUp(area);
        }
        else if(clickEvent.getButton().getId().equals("down")){
            // Move area in list down/sequence 1 up
            Button down = clickEvent.getButton();
            AreaOfInterestForm area = (AreaOfInterestForm) down.getParent().getParent().getParent();
            FlightPathInterestForm flightPath = (FlightPathInterestForm) area.getParent().getParent().getParent();
            flightPath.moveAreaDown(area);
        }
        else if(clickEvent.getButton().getId().equals("areaDel")){
            // Delete area from flightpath and from view
            Button delete = clickEvent.getButton();
            AreaOfInterestForm deleteInterest = (AreaOfInterestForm) delete.getParent().getParent().getParent().getParent();
            int i = deleteInterest.getId().indexOf("AREA");
            String pathId = deleteInterest.getId().substring(0,i);
            view.getFlightPathInterestForm(pathId).delete(deleteInterest);
            InterestPropertyType flightpath = model.getInterestMap().get(pathId);
            flightpath.getFlightPathInterest().getHasMember().remove(deleteInterest.getArea());
            model.refreshInterestSpecData(pathId);
        }
        else if(clickEvent.getButton().getId().equals("310")){
            Button addInterestForm = clickEvent.getButton();
            GroupInterestForm gif = (GroupInterestForm) addInterestForm.getParent().getParent();
            gif.addInterestComboBox();
        }
        else if(clickEvent.getButton().getId().equals("320")){
            Button acceptComplexInt = clickEvent.getButton();
            HorizontalLayout cbLay = (HorizontalLayout) acceptComplexInt.getParent();
            Button removeComplexIntButton = (Button) cbLay.getComponent(2);
            ComboBox cb = (ComboBox) cbLay.getComponent(0);
            GridLayout interestLayout = (GridLayout) cbLay.getParent();
            String id = (String) cb.getValue();
            if(id != null) {
                BinaryInterestForm biForm = (BinaryInterestForm) cb.getParent().getParent().getParent().getParent();
                String parentId = cb.getParent().getParent().getParent().getParent().getId();
                chosenComplexInterests.add(id);
                if (interestLayout.getComponentCount() > 1) {
                    removeComplexIntButton.click();
                }
                interestLayout.addComponent(view.getInterestForm(id), 1, 0);
                int index = biForm.getComboBoxList().indexOf(cb);
                if (parentId.substring(0, 3).equals("BIN") && index == 0) {
                    model.addComplexInterestLeftChild(id, parentId);
                } else if (parentId.substring(0, 3).equals("BIN") && index == 1) {
                    model.addComplexInterestRightChild(id, parentId);
                } else {
                    model.addComplexInterestGroupChild(id, parentId);
                }
            }
        }
        else if(clickEvent.getButton().getId().equals("330")){
            //Remove ComplexInterest Child from Complex view and put it back in the base view
            Button removeComplexChild = clickEvent.getButton();
            HorizontalLayout horLayout = (HorizontalLayout) removeComplexChild.getParent();
            GridLayout gridLay = (GridLayout) removeComplexChild.getParent().getParent();
            VerticalLayout vertLayout = (VerticalLayout) gridLay.getParent();
            ComboBox cb = (ComboBox) horLayout.getComponent(0);
            String id = (String) cb.getValue();
            cb.setValue(null);
            BinaryInterestForm biForm = (BinaryInterestForm) vertLayout.getParent();
            String parentId = biForm.getId();
            if(gridLay.getComponent(1,0) != null) {
                chosenComplexInterests.remove(id);
                view.getInterestForms().addComponent(gridLay.getComponent(1, 0));
                int index = biForm.getComboBoxList().indexOf(cb);
                if (parentId.substring(0, 3).equals("BIN") && index == 0) {
                    model.removeComplexInterestLeftChild(parentId);
                } else if (parentId.substring(0, 3).equals("BIN") && index == 1) {
                    model.removeComplexInterestRightChild(parentId);
                } else {
                    model.removeComplexInterestGroupChild(parentId, id);
                }
            }
        }

        else if(clickEvent.getButton().getId().equals("340")){
            Button deletePath = clickEvent.getButton();
            Panel parent = (Panel) deletePath.getParent().getParent().getParent().getParent();
            String parentId = parent.getId();
            model.getInterestMap().remove(parentId);
            chosenComplexInterests.remove(parentId);
            view.getInterestList().remove(parent);
            view.getInterestForms().removeComponent(parent);
        }

        else if(clickEvent.getButton().getId().equals("370")){
            Button deletePath = clickEvent.getButton();
            Panel parent = (Panel) deletePath.getParent().getParent().getParent();
            String parentId = parent.getId();
            model.getInterestMap().remove(parentId);
            chosenComplexInterests.remove(parentId);
            view.getInterestList().remove(parent);
            view.getInterestForms().removeComponent(parent);
        }

        else if(clickEvent.getButton().getId().equals("360")){
            Button deletePlan = clickEvent.getButton();
            Panel parent = (Panel) deletePlan.getParent().getParent().getParent();
            String parentId = parent.getId();
            model.getInterestMap().remove(parentId);
            chosenComplexInterests.remove(parentId);
            view.getInterestList().remove(parent);
            view.getInterestForms().removeComponent(parent);
            String idNr = parentId.substring(4,5);
            model.getInterestMap().remove("AIRC"+idNr);
            model.getInterestMap().remove("PERI"+idNr);
            model.getInterestMap().remove("PATH"+idNr);
            chosenComplexInterests.remove("AIRC"+idNr);
            chosenComplexInterests.remove("PERI"+idNr);
            chosenComplexInterests.remove("PATH"+idNr);
        }

    }

    @Override
    public void focus(FieldEvents.FocusEvent focusEvent) {
        if(focusEvent.getSource() instanceof ComboBox){
            ComboBox cb = (ComboBox) focusEvent.getSource();
            //150 - Complex Interest Combo Boxes
            if(cb.getId().equals("150")){
                cb.removeAllItems();
                ArrayList<String> interestStringList = new ArrayList<>(model.getInterestMap().keySet());
                String panelId = cb.getParent().getParent().getParent().getParent().getId();
                //The panel of the calling cb must not be shown in the cb
                interestStringList.remove(panelId);
                //Already chosen interestPanels must not be shown in the cb
                interestStringList.remove(chosenComplexInterests);
                cb.addItems(interestStringList);

            }
        }
    }

    @Override
    public void blur(FieldEvents.BlurEvent blurEvent) {}

    /*================================================================================================================
    ================================================================================================================*/

    private void addLoadedInterestSpec(InterestSpecificationType interestSpec) {
        view.getDisableSpecific().setValue(false);
        view.getDisableGeneral().setValue(false);
        model.setInterestSpec(interestSpec);
        InterestPropertyType specificInterest = interestSpec.getInterest().getBinaryIntersectionInterest().getRightHand();
        InterestPropertyType generalInterest = interestSpec.getInterest().getBinaryIntersectionInterest().getLeftHand();
        if(generalInterest.getUndefinedInterest() != null){
            view.getDisableGeneral().setValue(true);
        }
        if(specificInterest.getUndefinedInterest() != null){
            view.getDisableSpecific().setValue(true);
        }
        else {
            this.addLoadedInterestSpec(specificInterest);
        }
    }


    private Panel addLoadedInterestSpec(InterestPropertyType interest) {
        if(interest.getFlightPlanInterest() != null){
            model.addToInterestMap("FPLA", interest, idCounter);
            return view.addFlightPlanInterest(idCounter, interest.getFlightPlanInterest(), loadAircraftIdsFromWS());
        }
        else if(interest.getFlightPathInterest() != null){
            model.addToInterestMap("PATH", interest, idCounter);
            return view.addFlightPathInterest(idCounter, interest.getFlightPathInterest());
        }
        else if(interest.getPeriodOfInterest() != null){
            model.addToInterestMap("PERI", interest, idCounter);
            return view.addPeriodInterest(idCounter, interest.getPeriodOfInterest());
        }
        else if(interest.getAircraftOfInterest() != null){
            model.addToInterestMap("AIRC", interest, idCounter);
            return view.addAircraftInterest(idCounter, interest.getAircraftOfInterest(), loadAircraftIdsFromWS());
        }
        else if(interest.getAttributeOfInterest() != null){
            model.addToInterestMap("ATTR", interest, idCounter);
            return view.addAttributeOfInterest(idCounter, interest.getAttributeOfInterest());
        }
        else if(interest.getBinaryIntersectionInterest() != null){
            model.addToInterestMap("BINI", interest, idCounter);
            BinaryInterestForm form = view.addBinaryIntersect(idCounter);
            form.addLeftInterest(addLoadedInterestSpec(interest.getBinaryIntersectionInterest().getLeftHand()));
            form.addRightInterest(addLoadedInterestSpec(interest.getBinaryIntersectionInterest().getRightHand()));
            return form;
        }
        else if(interest.getBinaryUnionInterest() != null){
            model.addToInterestMap("BINU", interest, idCounter);
            BinaryInterestForm form = view.addBinaryUnion(idCounter);
            form.addLeftInterest(addLoadedInterestSpec(interest.getBinaryUnionInterest().getLeftHand()));
            form.addRightInterest(addLoadedInterestSpec(interest.getBinaryUnionInterest().getRightHand()));
            return form;
        }
        else if(interest.getIntersectionInterest() != null){
            model.addToInterestMap("GROI", interest, idCounter);
            GroupInterestForm form = view.addGroupIntersect(idCounter);
            for(InterestPropertyType i : interest.getIntersectionInterest().getHasMember()){
                form.addInterest(addLoadedInterestSpec(i));
            }
            return form;
        }
        else if(interest.getUnionInterest() != null){
            model.addToInterestMap("GROU", interest, idCounter);
            GroupInterestForm form = view.addGroupUnion(idCounter);
            for(InterestPropertyType i : interest.getUnionInterest().getHasMember()){
                form.addInterest(addLoadedInterestSpec(i));
            }
            return form;
        }
        return null;
    }

    /*================================================================================================================
    ================================================================================================================*/
    //UPLOAD CONTROLLER METHODS

    @Override
    public OutputStream receiveUpload(String filename, String mimeType) {
        FileOutputStream fos;
        try {
            file = new File(filename);
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            new Notification("Could not open file<br/>",
                    e.getMessage(),
                    Notification.Type.ERROR_MESSAGE)
                    .show(Page.getCurrent());
            return null;
        }
        return fos;
    }

    @Override
    public void uploadSucceeded(Upload.SucceededEvent succeededEvent) {
        Upload activeUploader = (Upload) succeededEvent.getComponent();
        String pathId = activeUploader.getParent().getParent().getId();
        FlightPlan fp = XMLUnmarshaller.unmarshalFlightPlan(file);
        FlightPathInterestForm fpiform = view.getFlightPathInterestForm(pathId);
        FlightPathInterestType fpiType = model.getInterestMap().get(pathId).getFlightPathInterest();
        // Parameter: 1 -skyvector Flightplan, 2- flightpathform, 3 - FlightPath Interest
        FlightPlanLoader.addAreasFromFlightPlan(fp, view.getFlightPathInterestForm(pathId) ,
                model.getInterestMap().get(pathId).getFlightPathInterest());
    }

    /*================================================================================================================
    ================================================================================================================*/
    //TAB-CHANGE-LISTENER

    @Override
    public void selectedTabChange(TabSheet.SelectedTabChangeEvent selectedTabChangeEvent) {
        String path = selectedTabChangeEvent.getComponent().getParent().getId();
        if(model.getInterestSpec().getInterestSpecificData().size() != 0){
            model.refreshInterestSpecData(path);
            GoogleMapsDrawer googleMapsDrawer = view.getFlightPathInterestForm(path).getGoogleMapsDrawer();
            googleMapsDrawer.drawFlightPath(model.getPosListMap().get(path));
        }
    }


    /*================================================================================================================
    ================================================================================================================*/
    //Load Existing InterestSpec from XML File
    @Override
    public void itemClick(ItemClickEvent itemClickEvent) {
        if(itemClickEvent.getComponent().getId().equals("existingISTable")){
            String existingISName = itemClickEvent.getItem().toString();
            String interestString = XMLUnmarshaller.loadXMLFile(existingISName, "tmp/InterestSpecification/");
            view.removeLoadInterestWindow();
            InterestSpecificationType interestSpec = null;
            if (interestString != null) {
                interestSpec = XMLUnmarshaller.unmarshalInterestSpecification(
                        new ByteArrayInputStream(interestString.getBytes(StandardCharsets.UTF_8)));
            }
            if (interestSpec != null) {
                if(interestSpec.getInterest().getBinaryIntersectionInterest() != null) {
                    this.addLoadedInterestSpec(interestSpec);
                } else {
                    new Notification("File is not in the correct format!<br/> " +
                            "(Root Element has to be Binary Intersection Interest)",
                            Notification.Type.ERROR_MESSAGE)
                            .show(Page.getCurrent());
                }
            }
        }
    }
}
