package at.notamWebapp.interestSpec.view.complexInterestForms;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.util.XMLUnmarshaller;
import at.notamWebapp.interestSpec.view.AddAreaOfInterestForm;
import at.notamWebapp.interestSpec.view.SemNotamForm;
import at.notamWebapp.interestSpec.model.AreaFormFactory;
import at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.AreaOfInterestForm;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.frequentis.semnotam.schema._1.FlightPathInterestType;
import com.vaadin.server.ExternalResource;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.ui.*;

import java.util.LinkedList;


/**
 * Created by khoef on 20.11.2016.
 */
public class FlightPathInterestForm extends Panel implements SemNotamForm {

    private AddAreaOfInterestForm addAreaForm;
    private VerticalLayout fpiLayout = new VerticalLayout();
    private GridLayout screenLayout = new GridLayout(1,2);
    private LinkedList<AreaOfInterestForm> flightPath = new LinkedList<>();
    private SemNotamController controller;
    private XMLUnmarshaller xmlUnmarshaller;
    private Button deletePath;
    private GoogleMap googleMap;
    private static int areaIndex = 0;
    private Label id = new Label();
    HorizontalLayout idLayout = new HorizontalLayout();


    public FlightPathInterestForm(SemNotamController controller, int id, FlightPathInterestType flightPathInterest) {
        setId("PATH"+id);
        this.id.setValue(getId());
        deletePath = new Button("Delete");
        deletePath.setId("340");
        deletePath.addClickListener(controller);

        TabSheet tabs = new TabSheet();
        tabs.setSizeFull();
        xmlUnmarshaller = new XMLUnmarshaller(controller);
        addAreaForm = new AddAreaOfInterestForm(controller, getId());
        googleMap = new GoogleMap(null, null, null);
        Embedded skyvector = new Embedded("",new ExternalResource("https://skyvector.com/"));

        googleMap.setCenter(new LatLon(48.335930, 14.320391));
        googleMap.setZoom(10);
        googleMap.setSizeFull();
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
        idLayout.addComponents(this.id, deletePath);
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

    @Override
    public void addController(SemNotamController controller) {
    }

    public void delete(AreaOfInterestForm area){
        flightPath.remove(area);
        fpiLayout.removeComponent(area);
        int i = 0;
    }

    public XMLUnmarshaller getXmlUnmarshaller() {
        return xmlUnmarshaller;
    }

    public LinkedList<AreaOfInterestForm> getFlightPath() {
        return flightPath;
    }

    public void areaForm(AreaOfInterestPropertyType area) {
        AreaFormFactory areaFormFactory = new AreaFormFactory(controller);
        areaIndex++;
        AreaOfInterestForm  areaForm = areaFormFactory.initAreaForm(area, getId()+"AREA"+areaIndex);
        fpiLayout.addComponent(areaForm);
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

    public GoogleMap getGoogleMap() {
        return googleMap;
    }
}
