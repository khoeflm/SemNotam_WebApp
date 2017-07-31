package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.evaluatedInterestSpec.model.EvaluatedInterestService;
import at.notamWebapp.evaluatedInterestSpec.model.NotamTableRow;
import at.notamWebapp.util.GoogleMapsDrawer;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import java.util.List;

/**
 * Created by khoef on 23.03.2017.
 */
public class NotamMapForm extends Panel {
    private VerticalLayout mainLayout;
    private GoogleMapsDrawer googleMapsDrawer;
    private List<String> filterList;

    public NotamMapForm(EvalNotamController controller){
        GoogleMap googleMap = new GoogleMap(null, null, null);
        googleMap.setCenter(new LatLon(48.335930, 14.320391));
        googleMap.setZoom(15);
        googleMap.setSizeFull();
        mainLayout = new VerticalLayout();
        mainLayout.addComponent(googleMap);
        mainLayout.setWidth("100%");
        mainLayout.setHeight("600px");
        googleMapsDrawer = new GoogleMapsDrawer(controller, googleMap);
        setContent(mainLayout);
        setSizeFull();
    }


    public void drawMapElements(EvaluatedInterestService model) {
        googleMapsDrawer.drawFlightPath(model.getFlightPath());
        googleMapsDrawer.drawNotamMarkers(model.getNotamTableValues());
    }

    public void filterNotamMap(List<NotamTableRow> filteredNotamList) {
        googleMapsDrawer.drawNotamMarkers(filteredNotamList);
    }

    public void fitToBounds(List<LatLon> notamPosition) {
        googleMapsDrawer.fitToBounds(notamPosition);
    }

    public void setInfoWindow(NotamTableRow selectedNotam) {
        googleMapsDrawer.setInfoWindow(selectedNotam);
    }

    public void closeInfoWindow(){
        googleMapsDrawer.closeInfoWindow();
    }
}
