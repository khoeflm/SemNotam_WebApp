package at.notamWebapp.evaluatedInterestSpec.model;

import aero.aixm.ElevatedPointPropertyType;
import aero.aixm.event.EventType;
import aero.aixm.event.NOTAMPropertyType;
import aero.aixm.event.NOTAMType;
import aero.aixm.message.BasicMessageMemberAIXMPropertyType;
import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.util.DBConnector;
import at.notamWebapp.util.GetField;
import at.notamWebapp.util.XMLUnmarshaller;
import com.frequentis.semnotam.schema._1.*;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;
import com.vaadin.tapio.googlemaps.client.LatLon;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by khoef on 27.04.2017.
 */
public class EvaluatedInterestService {

    private InterestSpecResultType result;
    private EvalNotamController controller;

    public EvaluatedInterestService(EvalNotamController evalNotamController) {
        this.controller = evalNotamController;
    }

    public InterestSpecResultType loadResultFromDB(String resultName){
        //DB Connection and querying for the result
        DBConnector conn = new DBConnector();
        String resultXml = "";
        try {
            resultXml =  conn.loadResult(resultName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        InputStream input = new ByteArrayInputStream(resultXml.getBytes(StandardCharsets.UTF_8));
        return XMLUnmarshaller.unmarshalInterestSpecResult(input);
    }

    public void loadResultfromWS(InterestSpecificationType is){
        result = SpecificInterestWS.evaluateIS(is);
    }

    public InterestSpecResultType getResult() {
        return result;
    }

    public void setResult(InterestSpecResultType result) {
        this.result = result;
    }

    public List<String> getImportanceLevels(){
        List<String> importanceLevels = new ArrayList<>();
        if(result.getHasResult() != null){
            for(ResultNotamPropertyType rs : result.getHasResult()){
                GroupAssignmentType classificationType = rs.getResult().getHasClassification().get(0).getGroupAssignment();
                if(classificationType.getHasGrouping().getGrouping().getGroupingName().equals("Importance")){
                    if(!importanceLevels.contains(classificationType.getHasGroup().get(0).getGroup().getGroupName())) {
                        importanceLevels.add(classificationType.getHasGroup().get(0).getGroup().getGroupName());
                    }
                }
            }
        }
        return importanceLevels;
    }

    public List<String> getBriefingPhaseLevels(){
        List<String> briefingPhaseLevels = new ArrayList<>();
        if(result.getHasResult() != null){
            for(ResultNotamPropertyType rs : result.getHasResult()){
                GroupAssignmentType classificationType = rs.getResult().getHasClassification().get(0).getGroupAssignment();
                if(classificationType.getHasGrouping().getGrouping().getGroupingName().equals("Flight Phase")){
                    if(!briefingPhaseLevels.contains(classificationType.getHasGroup().get(0).getGroup().getGroupName())) {
                        briefingPhaseLevels.add(classificationType.getHasGroup().get(0).getGroup().getGroupName());
                    }
                }
            }
        }
        return  briefingPhaseLevels;
    }

    public List<Set<String>> getFilterLevels(){
        List<Set<String>> filterList =  new LinkedList<>();
        Set<String> importanceLevels = new HashSet<>(), flightLevels = new HashSet<>(),
                locationLevels = new HashSet<>(), briefingLevels = new HashSet<>();
        filterList.add(0, importanceLevels);
        filterList.add(1, flightLevels);
        filterList.add(2, locationLevels);
        filterList.add(3, briefingLevels);

        if(result != null && result.getHasResult() != null){
            for(ResultNotamPropertyType rs : result.getHasResult()){
                List<ClassificationPropertyType> classificationList = rs.getResult().getHasClassification();
                for(ClassificationPropertyType cpt : classificationList){
                    String groupingName = cpt.getGroupAssignment().getHasGrouping().getGrouping().getGroupingName();
                    if(groupingName.equals("Importance")){
                        List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                        for(GroupPropertyType group : groupList){
                            importanceLevels.add(group.getGroup().getGroupName());
                        }
                    }else if(groupingName.equals("Flight Phase")){
                        List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                        for(GroupPropertyType group : groupList){
                            flightLevels.add(group.getGroup().getGroupName());
                        }
                    }else if(groupingName.equals("Location")){
                        List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                        for(GroupPropertyType group : groupList){
                            locationLevels.add(group.getGroup().getGroupName());
                        }
                    }else if(groupingName.equals("Briefing Package")){
                        List<GroupPropertyType> groupList = cpt.getGroupAssignment().getHasGroup();
                        for(GroupPropertyType group : groupList){
                            briefingLevels.add(group.getGroup().getGroupName());
                        }
                    }
                }
            }
            return filterList;
        } // END if(result != null && result.getHasResult() != null){
        else return null;
    }

    public List<NotamTableRow> getNotamTableValues(){
        String notamId = "", notamText = "", begin = "", end = "", importance ="", flightPhase = "", location ="",
                briefingPackage="";
        List<Double> pos = new ArrayList<>();
        List<NotamTableRow> notamTable = new ArrayList<>();
        NotamTableRow notamTableRow;
        if(result.getHasResult()!= null){
            for(ResultNotamPropertyType rs : result.getHasResult()){
                notamId = rs.getResult().getHasNotamId();
                List<ClassificationPropertyType> classificationList = rs.getResult().getHasClassification();
                for(ClassificationPropertyType cpt : classificationList){
                    String groupingName = cpt.getGroupAssignment().getHasGrouping().getGrouping().getGroupingName();
                    if(groupingName.equals("Importance")){
                        importance = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                    }else if(groupingName.equals("Flight Phase")){
                        flightPhase = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                    }else if(groupingName.equals("Location")){
                        location = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                    }else if(groupingName.equals("Briefing Package")){
                        briefingPackage = cpt.getGroupAssignment().getHasGroup().get(0).getGroup().getGroupName();
                    }
                }

                if(rs.getResult().getHasNotam() != null) {
                    List<BasicMessageMemberAIXMPropertyType> notamPartList = rs.getResult().getHasNotam().
                            getAIXMBasicMessage().getHasMember();
                    for(BasicMessageMemberAIXMPropertyType notamPart : notamPartList){
                        if(notamPart.getAbstractAIXMFeature().getValue() instanceof EventType){
                            EventType event = (EventType) notamPart.getAbstractAIXMFeature().getValue();
                            NOTAMPropertyType notamProperty = event.getTimeSlice().get(0).getEventTimeSlice().getTextNOTAM().get(0);
                            NOTAMType notam = notamProperty.getNOTAM();
                            notamText = notam.getTranslation().get(0).getNOTAMTranslation().getSimpleText().getValue().getValue();
                            begin = notam.getEffectiveStart().getValue().getValue();
                            end = notam.getEffectiveEnd().getValue().getValue();
                        }
                    }
                    pos = GetField.getNotamPosition(rs);
                }
                notamTableRow = new NotamTableRow(notamId, notamText, begin, end, importance, flightPhase, pos,
                        briefingPackage, location);
                notamTable.add(notamTableRow);
            }
        }
        return notamTable;
    }

    public List<ElevatedPointPropertyType>  getFlightPath(){
        List<ElevatedPointPropertyType> pointList = result.getInterestSpecificData().get(0).getPointData().getHasMember();
        return pointList;
    }


    public boolean isValid() {
        if(result != null){
            return true;
        }else return false;
    }

    public List<LatLon> getNotamPosition(String notamId) {
        List<Double> notamPositionInDouble = null;
        if(result.getHasResult()!= null) {
            for (ResultNotamPropertyType rs : result.getHasResult()) {
                if(rs.getResult().getHasNotamId() == notamId){
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

    public LatLon getNotamCenterPosition(String notamId){
        List<Double> notamPositionInDouble = null;
        if(result.getHasResult()!= null) {
            for (ResultNotamPropertyType rs : result.getHasResult()) {
                if(rs.getResult().getHasNotamId() == notamId){
                    notamPositionInDouble = GetField.getNotamPosition(rs);
                }
            }
        }
        Double latSum = 0.0, lonSum = 0.0;
        for(int i=0; i < notamPositionInDouble.size(); i = i+2){
            latSum = latSum + notamPositionInDouble.get(i);
            lonSum = lonSum + notamPositionInDouble.get(i+1);
        }
        return new LatLon(latSum/(notamPositionInDouble.size()/2),lonSum/(notamPositionInDouble.size()/2));
    }
}
