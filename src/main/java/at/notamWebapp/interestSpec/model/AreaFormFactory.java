package at.notamWebapp.interestSpec.model;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.*;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;

/**
 * Created by khoef on 24.01.2017.
 */
public class AreaFormFactory{

    private SemNotamController controller;
    public AreaFormFactory(SemNotamController controller){
        this.controller = controller;
    }

    public AreaOfInterestForm initAreaForm(AreaOfInterestPropertyType area, String areaId, Class areaClass){
        AreaOfInterestForm areaForm = new AreaOfInterestForm(areaId, controller, areaClass, area);
        switch (areaClass.getSimpleName()){
            case "DepartureAerodromeAreaType":case "DestinationAerodromeAreaType":case"DepartureAlternateAerodromeAreaType":
            case "EnRouteAlternateAerodromeAreaType":case "DestinationAlternateAerodromeAreaType":
                areaForm.getAreaFormLayout().addComponent(new AerodromeAreaFields(area, areaId), 0,0);
                break;
            case"FirAreaType":
                areaForm.getAreaFormLayout().addComponent(new FirAreaFields(area, areaId), 0, 0);
            case "ShapeAreaType":
                areaForm.getAreaFormLayout().addComponent(new ShapeAreaFields(area, areaId), 0,0);
                break;
            case "ConceptDefinedAreaType":
                areaForm.getAreaFormLayout().addComponent(new ConceptDefinedAreaFields(controller, area, areaId), 0,0);
                break;
            case "AtsAreaType":
                areaForm.getAreaFormLayout().addComponent(new AtsAreaFields(area, areaId, SpecificInterestWS.getATSSegmentIds(), controller), 0, 0);
                break;
            case "DepartureAreaType":case "DestinationApproachAreaType":case "DepartureAlternateApproachAreaType":
            case"EnRouteAlternateApproachAreaType":case "DestinationAlternateApproachAreaType":
                areaForm.getAreaFormLayout().addComponent(new TransitionAreaFields(area, areaId,
                        SpecificInterestWS.getTransitionSegmentIds(), SpecificInterestWS.getAerodromeIds(), controller),0,0);
                break;
        }
        return areaForm;
    }


}
