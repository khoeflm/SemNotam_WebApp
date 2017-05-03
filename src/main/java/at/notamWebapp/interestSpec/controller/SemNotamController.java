package at.notamWebapp.interestSpec.controller;

import at.notamWebapp.DBConnector;
import at.notamWebapp.XMLUnmarshaller;
import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.interestSpec.model.InterestSpecificationService;
import at.notamWebapp.interestSpec.view.AddAreaOfInterestForm;
import at.notamWebapp.interestSpec.view.InterestSpecificationForm;
import at.notamWebapp.interestSpec.view.SemNotamUI;
import at.notamWebapp.interestSpec.view.complexInterestForms.BinaryInterestForm;
import at.notamWebapp.interestSpec.view.complexInterestForms.GroupInterestForm;
import at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.AreaOfInterestForm;
import com.frequentis.semnotam.schema._1.FlightPathInterestType;
import com.frequentis.semnotam.schema._1.InterestPropertyType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;
import com.vaadin.event.FieldEvents;
import com.vaadin.ui.*;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by khoef on 22.11.2016.
 */
public class SemNotamController implements Button.ClickListener, FieldEvents.FocusListener, FieldEvents.BlurListener {
    private InterestSpecificationForm view;
    private InterestSpecificationService model;
    private FlightPathInterestType flightPathInt;
    private ElevatedDataController elevatedDataController;

    public SemNotamController(SemNotamUI ui){
        view = new InterestSpecificationForm(ui, this);
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
        if(clickEvent.getButton().getId().equals("saveIS")){
           model.saveInterestSpec();
        }
        else if(clickEvent.getButton().getId().equals("loadIS")){
            view.addLoadInterestWindow();
            view.getLoadInterestWindow().setVisible(true);
        }
        else if(clickEvent.getButton().getId().equals("queryIS")){
            FormLayout lay = (FormLayout) clickEvent.getButton().getParent();
            TextField txtName = (TextField) lay.getComponent(1);
            String isName = txtName.getValue();
            DBConnector dbconn = new DBConnector();
            String interestString = null;
            InterestSpecificationType interestSpec = null;

            try {
                interestString =  dbconn.loadInterest(isName);
                if(interestString.equals("-1")){view.getLoadInterestWindow().showLoadErrorMessage(interestString);}
                else{
                    view.getLoadInterestWindow().setVisible(false);
                    view.removeLoadInterestWindow();
                    interestSpec = XMLUnmarshaller.unmarshalInterestSpecification(
                            new ByteArrayInputStream(interestString.getBytes(StandardCharsets.UTF_8)));
                    this.addLoadedInterestSpec(interestSpec);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if(clickEvent.getButton().getId().equals(("evalIS"))){
            view.getMyUI().getMainLayout().removeAllComponents();
            EvalNotamController evalNotamController = new EvalNotamController(view.getMyUI());

            view.getMyUI().getMainLayout().addComponent(evalNotamController.getView());
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
            String pathId = deleteInterest.getId().substring(0,5);
            view.getFlightPathInterestForm(pathId).delete(deleteInterest);
            InterestPropertyType flightpath = model.getInterestMap().get(pathId);
            flightpath.getFlightPathInterest().getHasMember().remove(deleteInterest.getArea());
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
/*
    public void addAreasFromFlightPlan(String pathId) {
        //Flugplan aus Datei laden
        FlightPlan fpl = view.getFlightPathInterestForm(pathId).getXmlUnmarshaller().getFlightPlan();
        FlightPlan.WaypointTable wpt = fpl.getWaypointTable();

        HashMap<String, String> values = new HashMap<>();
        AreaOfInterestPropertyType area = new AreaOfInterestPropertyType();
        List<Field> fields;

        float lastLat = wpt.getWaypoint().get(wpt.getWaypoint().size()-1).getLat();
        float lastLon = wpt.getWaypoint().get(wpt.getWaypoint().size()-1).getLon();

        for(FlightPlan.WaypointTable.Waypoint w : wpt.getWaypoint()) {

            if(wpt.getWaypoint().indexOf(w) == 0){
                //1. Station des Flugplans (Abflughafen) laden
                values.put("aerodromeDesignator", w.getIdentifier());
                DepartureAerodromeAreaType depaat = new DepartureAerodromeAreaType();
                depaat.setDesignator(wpt.getWaypoint().get(0).getIdentifier());
                fields = InterestSpecificationService.getAllInterestFields(depaat.getClass());
                view.getFlightPathInterestForm(pathId).areaForm(fields, depaat.getClass(), values);

                values.put("startPointX", Float.toString(wpt.getWaypoint().get(0).getLat()));
                values.put("startPointY", Float.toString(wpt.getWaypoint().get(0).getLon()));
            }
            else if(wpt.getWaypoint().indexOf(w) == 1){
                values.put("endPointX", Float.toString(w.getLat()));
                values.put("endPointY", Float.toString(w.getLon()));
                DepartureAreaType dat = new DepartureAreaType();
                values.put("designator", w.getIdentifier());
                dat.setIdentifier(w.getIdentifier());
                dat.setSegmentShape(FormValueParser.getSegmentShape(values));
                area.setDepartureArea(dat);
                flightPathInt.getHasMember().add(area);
                fields = InterestSpecificationService.getAllInterestFields(dat.getClass());
                view.getFlightPathInterestForm(pathId).areaForm(fields, dat.getClass(), values);
                values.put("startPointX", Float.toString(w.getLat()));
                values.put("startPointY", Float.toString(w.getLon()));
            }
            else if (wpt.getWaypoint().indexOf(w) != wpt.getWaypoint().size() - 1) {
                values.put("endPointX", Float.toString(w.getLat()));
                values.put("endPointY", Float.toString(w.getLon()));
                AtsAreaType aat = new AtsAreaType();
                values.put("identifier", w.getIdentifier());
                aat.setIdentifier(w.getIdentifier());
                aat.setSegmentShape(FormValueParser.getSegmentShape(values));
                area.setAtsArea(aat);
                flightPathInt.getHasMember().add(area);
                fields = InterestSpecificationService.getAllInterestFields(aat.getClass());
                view.getFlightPathInterestForm(pathId).areaForm(fields, aat.getClass(), values);
                values.put("startPointX", Float.toString(w.getLat()));
                values.put("startPointY", Float.toString(w.getLon()));
            }
            else {
                //Destination Approach Area
                values.remove("identifier");
                values.put("endPointX", Float.toString(w.getLat()));
                values.put("endPointY", Float.toString(w.getLon()));
                DestinationApproachAreaType dat = new DestinationApproachAreaType();
                values.put("aerodromeDesignator", w.getIdentifier());
                dat.setIdentifier(w.getIdentifier());
                dat.setSegmentShape(FormValueParser.getSegmentShape(values));
                area.setDestinationApproachArea(dat);
                flightPathInt.getHasMember().add(area);
                fields = InterestSpecificationService.getAllInterestFields(dat.getClass());
                view.getFlightPathInterestForm(pathId).areaForm(fields, dat.getClass(), values);
                //Zielflughafen laden
                values.put("designator", w.getIdentifier());
                values.put("endPointX", Float.toString(lastLat));
                values.put("endPointY", Float.toString(lastLon));
                DestinationAerodromeAreaType desaat = new DestinationAerodromeAreaType();
                desaat.setDesignator(wpt.getWaypoint().get(wpt.getWaypoint().size()-1).getIdentifier());
                fields = InterestSpecificationService.getAllInterestFields(desaat.getClass());
                view.getFlightPathInterestForm(pathId).areaForm();
            }

        }
    }
*/
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
        InterestPropertyType specificInterest = interestSpec.getInterest().getBinaryIntersectionInterest().getRightHand();
        model.setInterestSpec(interestSpec);
        this.addLoadedInterestSpec(specificInterest);
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
}
