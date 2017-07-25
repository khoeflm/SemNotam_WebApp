package at.notamWebapp.interestSpec.view;


import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.util.XMLUnmarshaller;
import com.vaadin.ui.*;

/**
 * Created by khoef on 22.11.2016.
 */
public class AddAreaOfInterestForm extends Panel implements SemNotamForm{
    private Button bAddArea = new Button("Add");
    private ComboBox cbAreaInterest = new ComboBox("Area Interest Type");
    private Upload upload;
    XMLUnmarshaller xmlUnmarshaller;

    public AddAreaOfInterestForm(SemNotamController controller, String id){
        setId(id);
        this.addController(controller);
        this.xmlUnmarshaller = xmlUnmarshaller;
        upload = new Upload("FlightPlan Uploader", controller);
        upload.setId(getId());
        bAddArea.setId("addAreaInterest");
        cbAreaInterest.addItems(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        cbAreaInterest.setItemCaption(1,  "DepartureAerodromeArea");
        cbAreaInterest.setItemCaption(2,  "DestinationAerodromeArea");
        cbAreaInterest.setItemCaption(3,  "DepartureAlternateAerodromeArea");
        cbAreaInterest.setItemCaption(4,  "EnRouteAlternateAerodromeArea");
        cbAreaInterest.setItemCaption(5,  "DestinationAlternateAerodromeArea");
        cbAreaInterest.setItemCaption(6,  "FirArea");
        cbAreaInterest.setItemCaption(7,  "ShapeArea");
        cbAreaInterest.setItemCaption(8,  "ConceptDefinedArea");
        cbAreaInterest.setItemCaption(9,  "AtsArea");
        cbAreaInterest.setItemCaption(10, "DepartureArea");
        cbAreaInterest.setItemCaption(11, "DestinationApproachArea");
        cbAreaInterest.setItemCaption(12, "DepartureAlternateApproachArea");
        cbAreaInterest.setItemCaption(13, "EnRouteAlternateApproachArea");
        cbAreaInterest.setItemCaption(14, "DestinationAlternateApproachArea");
        upload.addSucceededListener(controller);
        HorizontalLayout aaoifLayout = new HorizontalLayout(cbAreaInterest, bAddArea, upload);
        aaoifLayout.setComponentAlignment(bAddArea, Alignment.BOTTOM_CENTER);
        setCaption("Add new AreaOfInterest");
        setContent(aaoifLayout);
        setWidth("100%");
    }

    @Override
    public void addController(SemNotamController controller) {
        bAddArea.addClickListener(controller);
    }

    public ComboBox getCbAreaInterest() {
        return cbAreaInterest;
    }


}
