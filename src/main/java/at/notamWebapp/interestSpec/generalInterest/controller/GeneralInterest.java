package at.notamWebapp.interestSpec.generalInterest.controller;

import at.notamWebapp.interestSpec.generalInterest.model.GeneralInterestModel;
import at.notamWebapp.interestSpec.generalInterest.view.GeneralInterestForm;
import at.notamWebapp.interestSpec.generalInterest.view.windows.ElementLoadWindow;
import at.notamWebapp.util.xmlHandler.XMLUnmarshaller;
import com.frequentis.semnotam.schema._1.CodeSpatialRelevanceType;
import com.frequentis.semnotam.schema._1.CodeTemporalRelevanceType;
import com.frequentis.semnotam.schema._1.InterestPropertyType;
import com.frequentis.semnotam.schema._1.IntersectionInterestType;
import com.frequentis.semnotam.ws.generalInterest.GeneralInterestWS;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by khoef on 27.03.2017.
 */
public class GeneralInterest implements Button.ClickListener, ItemClickEvent.ItemClickListener {

    private GeneralInterestForm view;
    private GeneralInterestModel model;
    private String ontologyUri;

    public GeneralInterest(){
        model = new GeneralInterestModel();
        view = new GeneralInterestForm(this);
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        Button clickedButton = clickEvent.getButton();
        switch (clickedButton.getId()){
            case "gi1":
                List<String> temporalFacet = new ArrayList<>();
                temporalFacet.add("NONE");
                temporalFacet.add("VALID_TIME");
                temporalFacet.add("ACTIVE_TIME");
                view.setElw(new ElementLoadWindow(this, temporalFacet, 1));
                break;
            case "gi2":
                List<String> temporalConcept = GeneralInterestWS.selectConceptForFacet("http://www.SemNotam.com/ontology/Temporal");
                ontologyUri = temporalConcept.get(0);
                temporalConcept.remove(0);
                view.setElw(new ElementLoadWindow(this, temporalConcept,2));
                break;
            case "gi3":
                List<String> spatialFilterFacet = new ArrayList<>();
                spatialFilterFacet.add("NONE");
                spatialFilterFacet.add("BOUNDING_BOX");
                spatialFilterFacet.add("SHAPE");
                view.setElw(new ElementLoadWindow(this, spatialFilterFacet, 3));
                break;
            case "gi4":
                List<String> spatialConcept = GeneralInterestWS.selectConceptForFacet("http://www.SemNotam.com/ontology/Spatial");
                ontologyUri = spatialConcept.get(0);
                spatialConcept.remove(0);
                view.setElw(new ElementLoadWindow(this, spatialConcept, 4));
                break;
            case "gi5":
                List<String> spatial4dDim = GeneralInterestWS.selectConceptForFacet("http://www.SemNotam.com/ontology/Spatial4D");
                ontologyUri = spatial4dDim.get(0);
                spatial4dDim.remove(0);
                view.setElw(new ElementLoadWindow(this, spatial4dDim, 5));
                break;
            case "gi6":
                List<String> aircraftTypeList = GeneralInterestWS.selectConceptForFacet("http://www.SemNotam.com/ontology/AircraftType");
                ontologyUri = aircraftTypeList.get(0);
                aircraftTypeList.remove(0);
                view.setElw(new ElementLoadWindow(this, aircraftTypeList ,6));
                break;
            case "gi7":
                List<String> dataModel = new ArrayList<>();
                dataModel.add("AIXM");
                dataModel.add("WXXM");
                dataModel.add("FIXM");
                view.setElw(new ElementLoadWindow(this, dataModel, 7));
                break;
            case "gi8":
                List<String> dataType = new ArrayList<>();
                dataType.add("DNOTAM");
                dataType.add("METAR");
                dataType.add("TAF");
                view.setElw(new ElementLoadWindow(this, dataType, 8));
                break;
            //Delete Button click handling
            case "del1":
                view.getTfTempFilterDim().clear();
                view.getbTempDim().setEnabled(false);
                model.getRelevanceOption().setTemporalRelevanceRules(null);
                model.getRelevanceOption().setTemporalRelevanceRules(CodeTemporalRelevanceType.VALID_TIME);
                buttonClick(new Button.ClickEvent(view.getDelTempDim()));
                break;
            case "del2":
                List<InterestPropertyType> interestList;
                interestList = model.getIntersectionInterest().getHasMember().stream()
                        .filter(ipt -> ipt.getPeriodOfInterest() == null)
                        .collect(Collectors.toList());
                model.getIntersectionInterest().getHasMember().clear();
                model.getIntersectionInterest().getHasMember().addAll(interestList);

                view.getTfTempDim().clear();
                if(view.getTfSpatialDim().isEmpty()){
                    view.getbSpatial4dDim().setEnabled(true);
                }

                break;
            case "del3":
                view.getTfSpatialFilterDim().clear();
                view.getbSpatialDim().setEnabled(false);
                model.getRelevanceOption().setSpatialRelevanceRules(null);
                model.getRelevanceOption().setSpatialRelevanceRules(CodeSpatialRelevanceType.SHAPE);
                buttonClick(new Button.ClickEvent(view.getDelSpatialDim()));
                break;
            case "del4":
                interestList = model.getIntersectionInterest().getHasMember().stream()
                        .filter(ipt -> ipt.getShapeArea() == null)
                        .collect(Collectors.toList());
                model.getIntersectionInterest().getHasMember().clear();
                model.getIntersectionInterest().getHasMember().addAll(interestList);

                view.getTfSpatialDim().clear();
                if(view.getTfTempDim().isEmpty()){
                    view.getbSpatial4dDim().setEnabled(true);
                }
                break;
            case "del5":
                interestList = model.getIntersectionInterest().getHasMember().stream()
                        .filter(ipt -> ipt.getShapeArea() == null)
                        .collect(Collectors.toList());
                model.getIntersectionInterest().getHasMember().clear();
                model.getIntersectionInterest().getHasMember().addAll(interestList);

                view.getTfSpatial4dDim().clear();
                view.getTfSpatialDim().setEnabled(true);
                view.getTfTempDim().setEnabled(true);
                break;
            case "del6":
                interestList = model.getIntersectionInterest().getHasMember().stream()
                        .filter(ipt -> ipt.getAircraftOfInterest() == null)
                        .collect(Collectors.toList());
                model.getIntersectionInterest().getHasMember().clear();
                model.getIntersectionInterest().getHasMember().addAll(interestList);

                view.getTfAircraftDim().clear();
                break;
            case "del7":
                view.getTfDataFormat().clear();
                break;
            case "del8":
                view.getTfDataType().clear();
                break;
        }
    }

    public GeneralInterestForm getForm(){
        return view;
    }

    public InterestPropertyType getInterest(){
        return model.getInterest();
    }

    public IntersectionInterestType getGeneralIntersectionInterest(){
        return model.getIntersectionInterest();
    }

    @Override
    public void itemClick(ItemClickEvent itemClickEvent) {
        Table table = (Table) itemClickEvent.getComponent();
        String id = table.getId();
        String value;
        switch (table.getId()){
            case "1":
                value = itemClickEvent.getItem().toString();
                if(!value.isEmpty()) {
                    model.getRelevanceOption().setTemporalRelevanceRules(CodeTemporalRelevanceType.fromValue(value));
                } else{
                    model.getRelevanceOption().setTemporalRelevanceRules(CodeTemporalRelevanceType.VALID_TIME);
                }
                view.getTfTempFilterDim().setValue(value);
                if(!value.equals("NONE") && view.getTfSpatial4dDim().isEmpty()) {
                    view.getbTempDim().setEnabled(true);
                }
                break;
            case "2":
                value = itemClickEvent.getItem().toString();
                view.getTfTempDim().setValue(getDim(value));
                setGeneralInterestData(this.ontologyUri, value);
                view.getbSpatial4dDim().setEnabled(false);
                break;
            case "3":
                value = itemClickEvent.getItem().toString();
                if(!value.isEmpty()) {
                    model.getRelevanceOption().setSpatialRelevanceRules(CodeSpatialRelevanceType.fromValue(value));
                } else{
                    model.getRelevanceOption().setSpatialRelevanceRules(CodeSpatialRelevanceType.SHAPE);
                }
                view.getTfSpatialFilterDim().setValue(value);
                if(!value.equals("NONE") && view.getTfSpatial4dDim().isEmpty()) {
                    view.getbSpatialDim().setEnabled(true);
                }
                break;
            case "4":
                value = itemClickEvent.getItem().toString();
                view.getTfSpatialDim().setValue(getDim(value));
                setGeneralInterestData(this.ontologyUri, value);
                view.getbSpatial4dDim().setEnabled(false);
                break;
            case "5":
                value = itemClickEvent.getItem().toString();
                view.getTfSpatial4dDim().setValue(getDim(value));
                setGeneralInterestData(this.ontologyUri, value);
                if(view.getTfSpatialDim().getValue().equals("NONE") || view.getTfTempDim().getValue().equals("NONE")) {
                    view.getbTempDim().setEnabled(false);
                }
                view.getbSpatialDim().setEnabled(false);
                view.getbTempDim().setEnabled(false);
                break;
            case "6":
                value = itemClickEvent.getItem().toString();
                view.getTfAircraftDim().setValue(getDim(value));
                setGeneralInterestData(this.ontologyUri, value);
                break;
            case "7":
                value = itemClickEvent.getItem().toString();
                view.getTfDataFormat().setValue(value);
                model.setDataModel(value);
                break;
            case "8":
                value = itemClickEvent.getItem().toString();
                view.getTfDataType().setValue(value);
                model.setDataType(value);
                break;
        }
        view.getElw().setVisible(false);
        view.removeWindow();
    }

    //get only Dim-Value from whole Path
    private String getDim(String value) {
        int i = value.lastIndexOf('/');
        return value.substring(i+1, value.length());
    }

    public void setGeneralInterestData(String ontologyUri, String conceptUri) {
        String generalInterestPropertyXML = GeneralInterestWS.getInterestFromConcept(ontologyUri, conceptUri);
        model.getIntersectionInterest().getHasMember().add(XMLUnmarshaller.unmarshalGeneralInterestData(generalInterestPropertyXML));
    }

    public GeneralInterestModel getModel() {
        return model;
    }
}