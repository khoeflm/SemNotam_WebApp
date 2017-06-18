package at.notamWebapp.interestSpec.generalInterest.controller;

import at.notamWebapp.XMLUnmarshaller;
import at.notamWebapp.interestSpec.generalInterest.model.GeneralInterestModel;
import at.notamWebapp.interestSpec.generalInterest.view.ElementLoadWindow;
import at.notamWebapp.interestSpec.generalInterest.view.GeneralInterestForm;
import com.frequentis.semnotam.schema._1.InterestPropertyType;
import com.frequentis.semnotam.schema._1.IntersectionInterestType;
import com.frequentis.semnotam.ws.generalInterest.GeneralInterestWS;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;

import java.util.List;

/**
 * Created by khoef on 27.03.2017.
 */
public class GeneralInterest implements Button.ClickListener, ItemClickEvent.ItemClickListener {

    private GeneralInterestForm view;
    private GeneralInterestModel model;
    private String ontologyUri;

    public GeneralInterest(){
        view = new GeneralInterestForm(this);
        model = new GeneralInterestModel();
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        Button clickedButton = clickEvent.getButton();
        switch (clickedButton.getId()){
            case "gi1":

                break;
            case "gi2":
                List<String> temporalConcept = GeneralInterestWS.selectConceptForFacet("http://www.SemNotam.com/ontology/Temporal");
                ontologyUri = temporalConcept.get(0);
                view.setElw(new ElementLoadWindow(this, temporalConcept,2));
                break;
            case "gi3":
                break;
            case "gi4":
                List<String> spatialConcept = GeneralInterestWS.selectConceptForFacet("http://www.SemNotam.com/ontology/Spatial");
                ontologyUri = spatialConcept.get(0);
                view.setElw(new ElementLoadWindow(this, spatialConcept, 4));
                break;
            case "gi5":
                List<String> spatial4dDim = GeneralInterestWS.selectConceptForFacet("http://www.SemNotam.com/ontology/Spatial4D");
                ontologyUri = spatial4dDim.get(0);
                view.setElw(new ElementLoadWindow(this, spatial4dDim, 5));
                break;
            case "gi6":
                List<String> aircraftTypeList = GeneralInterestWS.selectConceptForFacet("http://www.SemNotam.com/ontology/AircraftType");
                ontologyUri = aircraftTypeList.get(0);
                view.setElw(new ElementLoadWindow(this, aircraftTypeList ,6));
                break;
            case "gi7": break;
            case "gi8": break;
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
                break;
            case "2":
                value = itemClickEvent.getItem().toString();
                view.getTfTempDim().setValue(getDim(value));
                setGeneralInterestData(this.ontologyUri, value);
                break;
            case "3": break;
            case "4":
                value = itemClickEvent.getItem().toString();
                view.getTfSpatialDim().setValue(getDim(value));
                setGeneralInterestData(this.ontologyUri, value);
                break;
            case "5":
                value = itemClickEvent.getItem().toString();
                view.getTfSpatial4dDim().setValue(getDim(value));
                setGeneralInterestData(this.ontologyUri, value);
                break;
            case "6":
                value = itemClickEvent.getItem().toString();
                view.getTfAircraftDim().setValue(getDim(value));
                setGeneralInterestData(this.ontologyUri, value);
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
}
