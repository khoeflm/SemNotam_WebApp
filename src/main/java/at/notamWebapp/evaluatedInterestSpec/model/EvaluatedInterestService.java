package at.notamWebapp.evaluatedInterestSpec.model;

import aero.aixm.ElevatedPointPropertyType;
import aero.aixm.event.EventType;
import aero.aixm.event.NOTAMPropertyType;
import aero.aixm.event.NOTAMType;
import aero.aixm.message.BasicMessageMemberAIXMPropertyType;
import at.notamWebapp.interestSpec.specificInterest.model.Factories.GetField;
import com.frequentis.semnotam.schema._1.ClassificationPropertyType;
import com.frequentis.semnotam.schema._1.GroupPropertyType;
import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.schema._1.ResultNotamPropertyType;
import com.vaadin.tapio.googlemaps.client.LatLon;

import java.util.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 27.04.2017.
 */
public class EvaluatedInterestService {

    private InterestSpecResultType result;

    public InterestSpecResultType getResult() {
        return result;
    }

    public void setResult(InterestSpecResultType result) {
        this.result = result;
    }

    public List<Set<String>> getFilterLevels(){
        List<Set<String>> filterList =  new LinkedList<>();
        Set<String> importanceLevels = new HashSet<>(), flightLevels = new HashSet<>(),
                locationLevels = new HashSet<>(), briefingLevels = new HashSet<>(), eventLevels = new HashSet<>();
        filterList.add(0, importanceLevels);
        filterList.add(1, flightLevels);
        filterList.add(2, locationLevels);
        filterList.add(3, briefingLevels);
        filterList.add(3, eventLevels);


        if(result != null && result.getHasResult() != null){
            for(ResultNotamPropertyType rs : result.getHasResult()){
                List<ClassificationPropertyType> classificationList = rs.getResult().getHasClassification();
                for(ClassificationPropertyType cpt : classificationList){
                    String groupingName = cpt.getGroupAssignment().getHasGrouping().getGrouping().getGroupingName();
                    switch (groupingName) {
                        case "Importance": {
                            List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                            for (GroupPropertyType group : groupList) {
                                importanceLevels.add(group.getGroup().getGroupName());
                            }
                            break;
                        }
                        case "Flight Phase": {
                            List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                            for (GroupPropertyType group : groupList) {
                                flightLevels.add(group.getGroup().getGroupName());
                            }
                            break;
                        }
                        case "Location": {
                            List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                            for (GroupPropertyType group : groupList) {
                                locationLevels.add(group.getGroup().getGroupName());
                            }
                            break;
                        }
                        case "Briefing Package": {
                            List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                            for (GroupPropertyType group : groupList) {
                                briefingLevels.add(group.getGroup().getGroupName());
                            }
                            break;
                        }
                        case "Event Scenario": {
                            List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                            for (GroupPropertyType group : groupList) {
                                briefingLevels.add(group.getGroup().getGroupName());
                            }
                            break;
                        }
                    }
                }
            }
            return filterList;
        } // END if(result != null && result.getHasResult() != null){
        else return null;
    }

    public List<NotamTableRow> getNotamTableValues(){
        String notamId, notamText = "", begin = "", end = "", importance ="", flightPhase = "", location ="",
                briefingPackage="", event="";
        List<Double> pos = new ArrayList<>();
        List<NotamTableRow> notamTable = new ArrayList<>();
        NotamTableRow notamTableRow;
        if(result.getHasResult()!= null){
            for(ResultNotamPropertyType rs : result.getHasResult()){
                notamId = rs.getResult().getHasNotamId();
                List<ClassificationPropertyType> classificationList = rs.getResult().getHasClassification();
                for(ClassificationPropertyType cpt : classificationList){
                    String groupingName = cpt.getGroupAssignment().getHasGrouping().getGrouping().getGroupingName();
                    switch (groupingName) {
                        case "Importance":
                            importance = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                            break;
                        case "Flight Phase":
                            flightPhase = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                            break;
                        case "Location":
                            location = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                            break;
                        case "Briefing Package":
                            briefingPackage = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                            break;
                        case "Event Scenario":
                            event = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                            break;
                    }
                }

                if(rs.getResult().getHasNotam() != null) {
                    List<BasicMessageMemberAIXMPropertyType> notamPartList = rs.getResult().getHasNotam().
                            getAIXMBasicMessage().getHasMember();
                    for(BasicMessageMemberAIXMPropertyType notamPart : notamPartList){
                        if(notamPart.getAbstractAIXMFeature().getValue() instanceof EventType){
                            EventType notamEvent = (EventType) notamPart.getAbstractAIXMFeature().getValue();
                            NOTAMPropertyType notamProperty = notamEvent.getTimeSlice().get(0).getEventTimeSlice().getTextNOTAM().get(0);
                            NOTAMType notam = notamProperty.getNOTAM();
                            notamText = notam.getTranslation().get(0).getNOTAMTranslation().getSimpleText().getValue().getValue();
                            begin = notam.getEffectiveStart().getValue().getValue();
                            end = notam.getEffectiveEnd().getValue().getValue();
                        }
                    }
                    pos = GetField.getNotamPosition(rs);
                }
                notamTableRow = new NotamTableRow(notamId, notamText, begin, end, importance, flightPhase, pos,
                        briefingPackage, location, event);
                notamTable.add(notamTableRow);
            }
        }
        return notamTable;
    }

    public List<ElevatedPointPropertyType>  getFlightPath(){
        return result.getInterestSpecificData().get(0).getPointData().getHasMember();
    }


    public boolean isValid() {
        return result != null;
    }

    public List<LatLon> getNotamPosition(String notamId) {
        List<Double> notamPositionInDouble = null;
        if(result.getHasResult()!= null) {
            for (ResultNotamPropertyType rs : result.getHasResult()) {
                if(rs.getResult().getHasNotamId().equals(notamId)){
                    notamPositionInDouble = GetField.getNotamPosition(rs);
                }
            }
        }
        if(notamPositionInDouble != null){
            Double biggestLat = 0.0, biggestLon = 0.0, smallestLat = 0.0, smallestLon = 0.0;
            List<LatLon> notamPosition = new LinkedList<>();
            int i;
            for(i = 0; i < notamPositionInDouble.size();i=i+2){
                Double lat = notamPositionInDouble.get(i);
                Double lon = notamPositionInDouble.get(i+1);
                if(smallestLat==0.0 || lat < smallestLat){
                    smallestLat = lat;
                }
                if(biggestLat==0.0 || lat > biggestLat){
                    biggestLat = lat;
                }
                if(smallestLon==0.0 || lon < smallestLon){
                    smallestLon = lon;
                }
                if(biggestLon==0.0 || lon > biggestLon){
                    biggestLon = lon;
                }
            }
            notamPosition.add(new LatLon(smallestLat, smallestLon));
            notamPosition.add(new LatLon(biggestLat, biggestLon));
            return notamPosition;
        }
        else return null;
    }
}
