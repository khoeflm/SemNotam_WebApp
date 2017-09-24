package at.notamWebapp.interestSpec.specificInterest.view.forms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.11.2016.
 */
public class InterestMenuBarForm extends Panel{
    private ComboBox cbNewInterest = new ComboBox("Add new Interest:");

    private Button bAddInterest = new Button("Add");

    public InterestMenuBarForm(SemNotamController controller){
        //add all elements of the MenuBar
        cbNewInterest.addItems(1,2,3,4,5,6,7,8,9,10);
        cbNewInterest.setSizeUndefined();
        cbNewInterest.setItemCaption(1, "FlightPlanInterest");
        cbNewInterest.setItemCaption(2, "PeriodOfInterest");
        cbNewInterest.setItemCaption(3, "AircraftOfInterest");
        cbNewInterest.setItemCaption(4, "FlightPathOfInterest");
        cbNewInterest.setItemCaption(5, "AttributeOfInterest");
        cbNewInterest.setItemCaption(6, "BinaryIntersectionInterest");
        cbNewInterest.setItemCaption(7, "BinaryUnionInterest");
        cbNewInterest.setItemCaption(8, "GroupIntersectionInterest");
        cbNewInterest.setItemCaption(9, "GroupUnionInterest");
        cbNewInterest.setItemCaption(10, "ComplementInterest");

        bAddInterest.setId("addInterest");
        bAddInterest.addClickListener(controller);

        HorizontalLayout imbfHorizLayout = new HorizontalLayout(cbNewInterest, bAddInterest);

        imbfHorizLayout.setComponentAlignment(bAddInterest, Alignment.BOTTOM_CENTER);
        imbfHorizLayout.setSpacing(true);
        imbfHorizLayout.setMargin(true);
        setCaption("Interest Specification Menu");
        setContent(imbfHorizLayout);
        imbfHorizLayout.setSpacing(true);
    }

    public ComboBox getCbNewInterest() {
        return cbNewInterest;
    }

}
