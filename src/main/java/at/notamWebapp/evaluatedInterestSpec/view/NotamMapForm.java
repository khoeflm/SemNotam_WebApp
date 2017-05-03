package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by khoef on 23.03.2017.
 */
public class NotamMapForm extends Panel {
    private GoogleMap googleMap;
    private VerticalLayout mainLayout;

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
    }
}
