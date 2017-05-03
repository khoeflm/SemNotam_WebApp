package at.notamWebapp.evaluatedInterestSpec.model;

import aero.aixm.event.EventType;
import aero.aixm.event.NOTAMPropertyType;
import aero.aixm.event.NOTAMType;
import at.notamWebapp.DBConnector;
import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.XMLUnmarshaller;
import com.frequentis.semnotam.schema._1.GroupAssignmentType;
import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.schema._1.ResultNotamPropertyType;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;

import javax.xml.bind.JAXBElement;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by khoef on 27.04.2017.
 */
public class EvaluatedInterestService {

    private InterestSpecResultType result = new InterestSpecResultType();
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
                if(classificationType.getHasGrouping().getGrouping().getGroupingName().equals("BriefingPhase")){
                    if(!briefingPhaseLevels.contains(classificationType.getHasGroup().get(0).getGroup().getGroupName())) {
                        briefingPhaseLevels.add(classificationType.getHasGroup().get(0).getGroup().getGroupName());
                    }
                }
            }
        }
        return  briefingPhaseLevels;
    }

    public List<NotamTableRow> getNotamTableValues(){
        String notamId = "", notamText = "", begin = "", end = "", importance ="", briefingPhase = "";
        List<NotamTableRow> notamTable = new ArrayList<>();
        NotamTableRow notamTableRow;
        if(result.getHasResult()!= null){
            for(ResultNotamPropertyType rs : result.getHasResult()){
                notamId = rs.getResult().getHasNotamId();
                importance = rs.getResult().getHasClassification().get(0).getGroupAssignment()
                        .getHasGroup().get(0).getGroup().getGroupName();
                briefingPhase = rs.getResult().getHasClassification().get(0).getGroupAssignment()
                        .getHasGroup().get(0).getGroup().getGroupName();
                if(rs.getResult().getHasNotam() != null) {
                    JAXBElement<EventType> eventTypeJAXBElement = (JAXBElement<EventType>) rs.getResult().getHasNotam()
                            .getAIXMBasicMessage().getHasMember().get(2).getAbstractAIXMFeature();
                    EventType event = eventTypeJAXBElement.getValue();
                    NOTAMPropertyType notamProperty = event.getTimeSlice().get(0).getEventTimeSlice().getTextNOTAM().get(0);
                    NOTAMType notam = notamProperty.getNOTAM();
                    notamText = notam.getTranslation().get(0).getNOTAMTranslation().getSimpleText().getValue().getValue();
                    begin = notam.getEffectiveStart().getValue().getValue();
                    end = notam.getEffectiveEnd().getValue().getValue();
                }
                notamTableRow = new NotamTableRow(notamId, notamText, begin, end, importance, briefingPhase);
                notamTable.add(notamTableRow);
            }
        }
        return notamTable;
    }
}
