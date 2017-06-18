package at.notamWebapp.interestSpec;

import at.notamWebapp.interestSpec.model.AreaInterestFactory;
import at.notamWebapp.interestSpec.model.FormValueParser;
import at.notamWebapp.interestSpec.view.complexInterestForms.FlightPathInterestForm;
import com.frequentis.semnotam.schema._1.*;
import skyVectorFlightPlan.FlightPlan;

/**
 * Created by khoef on 15.06.2017.
 */
public class FlightPlanLoader {


    public static void addAreasFromFlightPlan(FlightPlan fpl, FlightPathInterestForm fpForm, FlightPathInterestType fpInterest) {
        //Flugplan aus Datei laden
        AreaInterestFactory areaInterestFactory = new AreaInterestFactory();
        FlightPlan.WaypointTable wpt = fpl.getWaypointTable();
        String x1 ="", x2="", y1="", y2="";
        float lastLat = wpt.getWaypoint().get(wpt.getWaypoint().size()-1).getLat();
        float lastLon = wpt.getWaypoint().get(wpt.getWaypoint().size()-1).getLon();
        for(FlightPlan.WaypointTable.Waypoint w : wpt.getWaypoint()) {

            if(wpt.getWaypoint().indexOf(w) == 0){
                //1. Station des Flugplans (Abflughafen) laden
                AreaOfInterestPropertyType area = new AreaOfInterestPropertyType();
                DepartureAerodromeAreaType depaat = areaInterestFactory.newDepartureAerodromeAreaType();
                area.setDepartureAerodromeArea(depaat);
                depaat.setDesignator(wpt.getWaypoint().get(0).getIdentifier());
                fpInterest.getHasMember().add(area);
                x1 = Float.toString(wpt.getWaypoint().get(0).getLat());
                y1 = Float.toString(wpt.getWaypoint().get(0).getLon());
            }
            else if(wpt.getWaypoint().indexOf(w) == 1){
                x2 = Float.toString(w.getLat());
                y2 = Float.toString(w.getLon());
                DepartureAreaType dat = areaInterestFactory.newDepartureArea();
                AreaOfInterestPropertyType area = new AreaOfInterestPropertyType();
                dat.setIdentifier(w.getIdentifier());
                dat.setSegmentShape(FormValueParser.getSegmentShape(x1, y1, x2, y2));
                area.setDepartureArea(dat);
                fpInterest.getHasMember().add(area);
                x1 = x2;
                y1 = y2;
            }
            else if (wpt.getWaypoint().indexOf(w) != wpt.getWaypoint().size() - 1) {
                x2 = Float.toString(w.getLat());
                y2 = Float.toString(w.getLon());
                AtsAreaType aat = areaInterestFactory.newAtsAreaType();
                AreaOfInterestPropertyType area = new AreaOfInterestPropertyType();
                aat.setIdentifier(w.getIdentifier());
                aat.setSegmentShape(FormValueParser.getSegmentShape(x1, y1, x2, y2));
                area.setAtsArea(aat);
                fpInterest.getHasMember().add(area);
                x1 = x2;
                y1 = y2;
            }
            else {
                //Destination Approach Area
                x2 = Float.toString(lastLat);
                y2 = Float.toString(lastLon);
                DestinationApproachAreaType dat = areaInterestFactory.newDestinationApproachArea();
                AreaOfInterestPropertyType area = new AreaOfInterestPropertyType();
                dat.setIdentifier(w.getIdentifier());
                dat.setSegmentShape(FormValueParser.getSegmentShape(x1,y1,x2,y2));
                area.setDestinationApproachArea(dat);
                fpInterest.getHasMember().add(area);
                //Zielflughafen laden
                DestinationAerodromeAreaType desaat = areaInterestFactory.newDestinationAerodromeAreaType();
                area = new AreaOfInterestPropertyType();
                desaat.setDesignator(wpt.getWaypoint().get(wpt.getWaypoint().size()-1).getIdentifier());
                area.setDestinationAerodromeArea(desaat);
                fpInterest.getHasMember().add(area);
            }
        }
        fpForm.addAllAreas(fpInterest);
    }
}
