package at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.interestSpec.specificInterest.view.forms.AddAreaOfInterestForm;
import at.notamWebapp.interestSpec.specificInterest.view.forms.FormValidatorInterface;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.AreaFormFactory;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.AreaOfInterestForm;
import at.notamWebapp.util.googleMapsService.GoogleMapsDrawer;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.frequentis.semnotam.schema._1.FlightPathInterestType;
import com.vaadin.server.ExternalResource;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.ui.*;

import java.util.LinkedList;


/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.11.2016.
 */
public class FlightPathInterestForm extends Panel implements FormValidatorInterface{

    private AddAreaOfInterestForm addAreaForm;
    private VerticalLayout fpiLayout = new VerticalLayout();
    private LinkedList<AreaOfInterestForm> flightPath = new LinkedList<>();
    private SemNotamController controller;
    private static int areaIndex;
    private GoogleMapsDrawer googleMapsDrawer;
    private HorizontalLayout idLayout = new HorizontalLayout();


    public FlightPathInterestForm(SemNotamController controller, int id) {
        setId("PATH"+id);
        areaIndex = 0;
        Label id1 = new Label();
        id1.setValue(getId());
        Button deletePath = new Button("Delete");
        deletePath.setId("340");
        deletePath.addClickListener(controller);

        TabSheet tabs = new TabSheet();
        tabs.setSizeFull();
        addAreaForm = new AddAreaOfInterestForm(controller, getId());
        GoogleMap googleMap = new GoogleMap(null, null, null);
        Embedded skyvector = new Embedded("",new ExternalResource("https://skyvector.com/"));

        googleMapsDrawer = new GoogleMapsDrawer(googleMap);
        googleMap.setCenter(new LatLon(48.335930, 14.320391));
        googleMap.setZoom(10);
        googleMap.setSizeFull();
        GridLayout screenLayout = new GridLayout(1, 2);
        screenLayout.addComponent(googleMap, 0, 1);
        this.controller = controller;
        skyvector.setType(Embedded.TYPE_BROWSER);
        skyvector.setWidth("100%");
        skyvector.setHeight("800px");
        CssLayout mapLayout = new CssLayout();
        mapLayout.setWidth("100%");
        mapLayout.setHeight("800px");
        mapLayout.addComponent(googleMap);
        idLayout.setSpacing(true);
        idLayout.addComponents(id1, deletePath);
        fpiLayout.addComponents(idLayout, addAreaForm);
        fpiLayout.setComponentAlignment(idLayout, Alignment.MIDDLE_LEFT);
        tabs.addTab(fpiLayout, "Flightplan List");
        tabs.addTab(skyvector, "Skyvector");
        tabs.addTab(mapLayout, "Flightplan Map");
        //screenLayout.addComponent(fpiLayout,0,0);
        setContent(tabs);
        setCaption("FlightPathOfInterest");
        fpiLayout.setSpacing(true);
        fpiLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        tabs.addSelectedTabChangeListener(controller);
    }

    public AddAreaOfInterestForm getAddAreaForm() {
        return addAreaForm;
    }

    public void delete(AreaOfInterestForm area){
        flightPath.remove(area);
        fpiLayout.removeComponent(area);
    }

    public LinkedList<AreaOfInterestForm> getFlightPath() {
        return flightPath;
    }

    public void areaForm(AreaOfInterestPropertyType area) {
        AreaFormFactory areaFormFactory = new AreaFormFactory(controller);
        areaIndex++;
        AreaOfInterestForm  areaForm = areaFormFactory.initAreaForm(area, getId()+"AREA"+areaIndex);
        fpiLayout.addComponent(areaForm);
        flightPath.add(areaForm);
    //    setContent(areaForm);
    }

    public void addAllAreas(FlightPathInterestType flightPath) {
        fpiLayout.removeAllComponents();
        fpiLayout.addComponents(idLayout, addAreaForm);
        fpiLayout.setComponentAlignment(idLayout, Alignment.MIDDLE_LEFT);
        for(AreaOfInterestPropertyType area : flightPath.getHasMember()){
            areaForm(area);
        }
    }

    public void moveAreaUp(AreaOfInterestForm area){
        int i = fpiLayout.getComponentIndex(area);
        if(i > 2) {
            fpiLayout.removeComponent(area);
            fpiLayout.addComponent(area, i - 1);
        }
    }

    public void moveAreaDown(AreaOfInterestForm area){
        int i = fpiLayout.getComponentIndex(area);
        if(i == fpiLayout.getComponentCount()-1){
            fpiLayout.removeComponent(area);
            fpiLayout.addComponent(area);
        }else if(i < fpiLayout.getComponentCount()) {
            fpiLayout.removeComponent(area);
            fpiLayout.addComponent(area, i + 1);
        }
    }

    public GoogleMapsDrawer getGoogleMapsDrawer() {
        return googleMapsDrawer;
    }

    public boolean isValid(){
        boolean isValid = true;
        for(AreaOfInterestForm area : flightPath){
            if(!((FormValidatorInterface) area).isValid()){
                isValid = false;
            }
        }
        return isValid;
    }
}
