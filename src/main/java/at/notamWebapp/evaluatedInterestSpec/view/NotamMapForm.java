package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.GoogleMapsDrawer;
import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.evaluatedInterestSpec.model.EvaluatedInterestService;
import at.notamWebapp.evaluatedInterestSpec.model.NotamTableRow;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import java.util.List;

/**
 * Created by khoef on 23.03.2017.
 */
public class NotamMapForm extends Panel {
    private GoogleMap googleMap;
    private VerticalLayout mainLayout;
    private GoogleMapsDrawer googleMapsDrawer;
    private List<String> filterList;

    public NotamMapForm(EvalNotamController controller){
        googleMap = new GoogleMap(null, null, null);
        googleMap.setCenter(new LatLon(48.335930, 14.320391));
        googleMap.setZoom(15);
        googleMap.setSizeFull();
        mainLayout = new VerticalLayout();
        mainLayout.addComponent(googleMap);
        mainLayout.setWidth("100%");
        mainLayout.setHeight("600px");
        setContent(mainLayout);
        setSizeFull();
    }



    public void drawMapElements(EvaluatedInterestService model) {
        if(googleMapsDrawer == null){
            googleMapsDrawer = new GoogleMapsDrawer();
        }
        googleMapsDrawer.drawFlightPath(googleMap, model.getFlightPath());
        googleMapsDrawer.drawNotamMarkers(googleMap, model.getNotamTableValues());
    }

    public void filterNotamMap(List<NotamTableRow> filteredNotamList) {
        googleMapsDrawer.drawNotamMarkers(googleMap, filteredNotamList);
    }


}
