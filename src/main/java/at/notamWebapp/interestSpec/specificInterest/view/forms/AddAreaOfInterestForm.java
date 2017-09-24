package at.notamWebapp.interestSpec.specificInterest.view.forms;


import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 22.11.2016.
 */
public class AddAreaOfInterestForm extends Panel{
    private Button bAddArea = new Button("Add");
    private ComboBox cbAreaInterest = new ComboBox("Area Interest Type");

    public AddAreaOfInterestForm(SemNotamController controller, String id){
        setId(id);
        Upload upload = new Upload("FlightPlan Uploader", controller);
        upload.setId(getId());
        bAddArea.setId("addAreaInterest");
        bAddArea.addClickListener(controller);
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

    public ComboBox getCbAreaInterest() {
        return cbAreaInterest;
    }

}
