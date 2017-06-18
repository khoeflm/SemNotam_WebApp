package at.notamWebapp.interestSpec.model;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.*;
import com.frequentis.semnotam.schema._1.*;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;

/**
 * Created by khoef on 24.01.2017.
 */
public class AreaFormFactory{

    private SemNotamController controller;
    public AreaFormFactory(SemNotamController controller){
        this.controller = controller;
    }

    public AreaOfInterestForm initAreaForm(AreaOfInterestPropertyType area, String areaId){
        Class areaClass = getAreaClass(area);
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

    private Class getAreaClass(AreaOfInterestPropertyType area) {
        if(area.getDepartureAerodromeArea() != null){
            return DepartureAerodromeAreaType.class;
        }else if(area.getDestinationAerodromeArea() != null){
            return DestinationAerodromeAreaType.class;
        }else if(area.getDepartureAlternateAerodromeArea() != null){
            return DepartureAlternateAerodromeAreaType.class;
        }else if(area.getDestinationAlternateAerodromeArea() != null){
            return DestinationAlternateAerodromeAreaType.class;
        }else if(area.getEnRouteAlternateAerodromeArea() != null){
            return EnRouteAlternateAerodromeAreaType.class;
        }else if(area.getFirArea() != null){
            return FirAreaType.class;
        }else if(area.getShapeArea() != null){
            return ShapeAreaType.class;
        }else if(area.getConceptDefinedArea() != null){
            return ConceptDefinedAreaType.class;
        }else if(area.getAtsArea() != null){
            return AtsAreaType.class;
        }else if(area.getDepartureArea() != null){
            return DepartureAreaType.class;
        }else if(area.getDestinationApproachArea() != null){
            return DestinationApproachAreaType.class;
        }else if(area.getDepartureAlternateApproachArea() != null){
            return DepartureAlternateApproachAreaType.class;
        }else if(area.getEnRouteAlternateApproachArea() != null){
            return EnRouteAlternateApproachAreaType.class;
        }else if(area.getDestinationAlternateApproachArea() != null){
            return DestinationAlternateApproachAreaType.class;
        }
        else return null;
    }
}
