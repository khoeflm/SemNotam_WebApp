package at.notamWebapp.interestSpec.controller;

import at.notamWebapp.util.*;
import at.notamWebapp.interestSpec.FlightPlanLoader;
import at.notamWebapp.interestSpec.model.InterestSpecificationService;
import at.notamWebapp.interestSpec.view.AddAreaOfInterestForm;
import at.notamWebapp.interestSpec.view.InterestSpecificationForm;
import at.notamWebapp.interestSpec.view.complexInterestForms.BinaryInterestForm;
import at.notamWebapp.interestSpec.view.complexInterestForms.GroupInterestForm;
import at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.AreaOfInterestForm;
import com.frequentis.semnotam.schema._1.*;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;
import com.vaadin.event.FieldEvents;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.server.Page;
import com.vaadin.ui.*;
import skyVectorFlightPlan.FlightPlan;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by khoef on 22.11.2016.
 */
public class SemNotamController implements Button.ClickListener, FieldEvents.FocusListener, FieldEvents.BlurListener,
        Upload.Receiver, Upload.SucceededListener, TabSheet.SelectedTabChangeListener, ItemClickEvent.ItemClickListener {
    private InterestSpecificationForm view;
    private InterestSpecificationService model;
    private FlightPathInterestType flightPathInt;
    private ElevatedDataController elevatedDataController;
    private XMLParserService toXml = new XMLParserService();
    private GoogleMapsDrawer googleMapsDrawer;
    private File file;

    public SemNotamController(InterestSpecificationForm view){
        this.view = view;
        model = new InterestSpecificationService(this);
        flightPathInt = new FlightPathInterestType();
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

    public List<String> loadAircraftIdsFromWS(){
        return SpecificInterestWS.getAircraftTypeIds();
    }

    public List<String> loadATSSegmentsFromWS(){
        return SpecificInterestWS.getATSSegmentIds();
    }

    public List<String> loadAerodromeIdsFromWS(){
        return SpecificInterestWS.getAerodromeIds();
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {

    /*================================================================================================================
    ================================================================================================================*/
    //Save Interest Spec in File
        if(clickEvent.getButton().getId().equals("saveIS")){
            if(view.getGeneralInterestForm().isValid() || view.getDisableGeneral().getValue()) {
                String filename = view.getInterestSpecID().getValue();
                InterestSpecificationType interestSpec = model.getSavableInterestSpec(view.getRootElement(), filename, !view.getDisableSpecific().getValue(),
                        !view.getDisableGeneral().getValue());
                if (interestSpec != null) {
                    if (toXml.noSuchFileExists(filename)) {
                        toXml.createXMLFile(interestSpec, filename);
                    } else {
                        view.setAlreadyExistingFileWindow(filename);
                    }
                }
            } else{
                new Notification("At least one General Interest Dimension has to be chosen!",
                        Notification.Type.ERROR_MESSAGE)
                        .show(Page.getCurrent());
            }
        }
        //Continue the saving off the file although there is an already existing file with the same name
        else if(clickEvent.getButton().getId().equals("contSave")){
            String filename = view.getInterestSpecID().getValue();
            InterestSpecificationType interestSpec = model.getSavableInterestSpec(view.getRootElement(), filename, !view.getDisableSpecific().getValue(),
                    !view.getDisableGeneral().getValue());
            if(interestSpec!=null) {
                toXml.createXMLFile(interestSpec, filename);
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
                model.addInterest(selectedInterest);
            }
        }
        else if(clickEvent.getButton().getId().equals("addAreaInterest")){
            AddAreaOfInterestForm addAreaInterestForm = (AddAreaOfInterestForm) clickEvent.getButton().getParent().getParent();
            String id = addAreaInterestForm.getId();
            if(view.getAddAreaOfInterestForm(id) != null){
                String selectedArea = view.getAddAreaOfInterestForm(id).getCbAreaInterest().getValue().toString();
                model.addAreaInterest(selectedArea, id);
            }
        }
        else if(clickEvent.getButton().getId().equals("hide")){
            // Hide/show area detail
            Button hide = clickEvent.getButton();
            AreaOfInterestForm hideContent = (AreaOfInterestForm) hide.getParent().getParent().getParent();
            hideContent.hide();
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
                model.getChosenComplexInterestStrings().add(id);
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
                model.getChosenComplexInterestStrings().remove(id);
                view.getInterestForms().addComponent(gridLay.getComponent(1, 0));
                int index = biForm.getComboBoxList().indexOf(cb);
                if (parentId.substring(0, 3).equals("BIN") && index == 0) {
                    model.removeComplexInterestLeftChild(parentId);
                } else if (parentId.substring(0, 3).equals("BIN") && index == 1) {
                    model.removeComplexInterestRightChild(parentId);
                } else {
    //              model.addComplexInterestGroupChild(id, parentId);
                    model.removeComplexInterestGroupChild(parentId, id);
                }
            }
        }
        else if(clickEvent.getButton().getId().equals("350")){
            Button refresh = clickEvent.getButton();
            String parentId = refresh.getParent().getParent().getParent().getParent().getId();
        }

        else if(clickEvent.getButton().getId().equals("340")){
            Button deletePath = clickEvent.getButton();
            Panel parent = (Panel) deletePath.getParent().getParent().getParent().getParent();
            String parentId = parent.getId();
            model.getInterestMap().remove(parentId);
            model.getChosenComplexInterestStrings().remove(parentId);
            view.getInterestList().remove(parent);
            view.getInterestForms().removeComponent(parent);
        }

        else if(clickEvent.getButton().getId().equals("370")){
            Button deletePath = clickEvent.getButton();
            Panel parent = (Panel) deletePath.getParent().getParent().getParent();
            String parentId = parent.getId();
            model.getInterestMap().remove(parentId);
            model.getChosenComplexInterestStrings().remove(parentId);
            view.getInterestList().remove(parent);
            view.getInterestForms().removeComponent(parent);
        }

        else if(clickEvent.getButton().getId().equals("360")){
            Button deletePlan = clickEvent.getButton();
            Panel parent = (Panel) deletePlan.getParent().getParent().getParent();
            String parentId = parent.getId();
            model.getInterestMap().remove(parentId);
            model.getChosenComplexInterestStrings().remove(parentId);
            view.getInterestList().remove(parent);
            view.getInterestForms().removeComponent(parent);
            String idNr = parentId.substring(4,5);
            model.getInterestMap().remove("AIRC"+idNr);
            model.getInterestMap().remove("PERI"+idNr);
            model.getInterestMap().remove("PATH"+idNr);
            model.getChosenComplexInterestStrings().remove("AIRC"+idNr);
            model.getChosenComplexInterestStrings().remove("PERI"+idNr);
            model.getChosenComplexInterestStrings().remove("PATH"+idNr);
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
                interestStringList.remove(model.getChosenComplexInterestStrings());
                cb.addItems(interestStringList);

            }
        }
    }

    @Override
    public void blur(FieldEvents.BlurEvent blurEvent) {
        if(blurEvent.getSource() instanceof ComboBox){
            ComboBox cb = (ComboBox) blurEvent.getSource();
            if(cb.getId().equals("160")){
                String parentId = cb.getParent().getParent().getParent().getId();

            }
        }
        if(blurEvent.getSource() instanceof TextField){
            TextField tf = (TextField) blurEvent.getSource();
            if(tf.getId().equals("170")){
                String parentId = tf.getParent().getParent().getParent().getId();
            }
        }
        if(blurEvent.getSource() instanceof DateField){
            DateField df = (DateField) blurEvent.getSource();
            if(df.getId().equals("170")){
                String parentId = df.getParent().getParent().getParent().getId();
            }
        }
    }

    /*================================================================================================================
    ================================================================================================================*/

    public void addLoadedInterestSpec(InterestSpecificationType interestSpec) {
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


    public Panel addLoadedInterestSpec(InterestPropertyType interest) {
        view.addSpecificInterest(interest);
        if(interest.getFlightPlanInterest() != null){
            int id = model.addToInterestMap("FPLA", interest);
            return view.addFlightPlanInterest(id, interest.getFlightPlanInterest());
        }
        else if(interest.getFlightPathInterest() != null){
            int id = model.addToInterestMap("PATH", interest);
            return view.addFlightPathInterest(id, interest.getFlightPathInterest());
        }
        else if(interest.getPeriodOfInterest() != null){
            int id = model.addToInterestMap("PERI", interest);
            return view.addPeriodInterest(id, interest.getPeriodOfInterest());
        }
        else if(interest.getAircraftOfInterest() != null){
            int id = model.addToInterestMap("AIRC", interest);
            return view.addAircraftInterest(id, interest.getAircraftOfInterest());
        }
        else if(interest.getAttributeOfInterest() != null){
            int id = model.addToInterestMap("ATTR", interest);
            return view.addAttributeOfInterest(id, interest.getAttributeOfInterest());
        }
        else if(interest.getBinaryIntersectionInterest() != null){
            int id = model.addToInterestMap("BINI", interest);
            BinaryInterestForm form = view.addBinaryIntersect(id, interest.getBinaryIntersectionInterest());
            form.addLeftInterest(addLoadedInterestSpec(interest.getBinaryIntersectionInterest().getLeftHand()));
            form.addRightInterest(addLoadedInterestSpec(interest.getBinaryIntersectionInterest().getRightHand()));
            return form;
        }
        else if(interest.getBinaryUnionInterest() != null){
            int id = model.addToInterestMap("BINU", interest);
            BinaryInterestForm form = view.addBinaryUnion(id, interest.getBinaryUnionInterest());
            form.addLeftInterest(addLoadedInterestSpec(interest.getBinaryUnionInterest().getLeftHand()));
            form.addRightInterest(addLoadedInterestSpec(interest.getBinaryUnionInterest().getRightHand()));
            return form;
        }
        else if(interest.getIntersectionInterest() != null){
            int id = model.addToInterestMap("GROI", interest);
            GroupInterestForm form = view.addGroupIntersect(id, interest.getIntersectionInterest());
            for(InterestPropertyType i : interest.getIntersectionInterest().getHasMember()){
                form.addInterest(addLoadedInterestSpec(i));
            }
            return form;
        }
        else if(interest.getUnionInterest() != null){
            int id = model.addToInterestMap("GROU", interest);
            GroupInterestForm form = view.addGroupUnion(id, interest.getUnionInterest());
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

        // Parameter: 1 -skyvector Flightplan, 2- flightpathform, 3 - FlightPath Interest
        FlightPlanLoader.addAreasFromFlightPlan(fp, view.getFlightPathInterestForm(pathId) ,
                model.getInterestMap().get(pathId).getFlightPathInterest());
    }

    /*================================================================================================================
    ================================================================================================================*/
    //TAB-CHANGE-LISTENER

    @Override
    public void selectedTabChange(TabSheet.SelectedTabChangeEvent selectedTabChangeEvent) {
        if(googleMapsDrawer == null){
            googleMapsDrawer = new GoogleMapsDrawer();
        }
        String path = selectedTabChangeEvent.getComponent().getParent().getId();
        if(model.getInterestSpec().getInterestSpecificData().size() != 0){
            model.refreshInterestSpecData(path);
            googleMapsDrawer.drawFlightPath(view.getFlightPathInterestForm(path).getGoogleMap(),model.getPosListMap().get(path));
        }
    }


    /*================================================================================================================
    ================================================================================================================*/
    //Load InterestSpec
    @Override
    public void itemClick(ItemClickEvent itemClickEvent) {
        if(itemClickEvent.getComponent().getId().equals("existingISTable")){
            String existingIS = itemClickEvent.getItem().toString();
            DBConnector conn = new DBConnector();
            String interestString = conn.loadExistingInterest(existingIS);
            view.removeLoadInterestWindow();
            InterestSpecificationType interestSpec = XMLUnmarshaller.unmarshalInterestSpecification(
                    new ByteArrayInputStream(interestString.getBytes(StandardCharsets.UTF_8)));
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
