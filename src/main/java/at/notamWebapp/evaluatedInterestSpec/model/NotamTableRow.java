package at.notamWebapp.evaluatedInterestSpec.model;

import java.util.List;

/**
 * Created by khoef on 01.05.2017.
 */
public class NotamTableRow {
    private String notamId, notamText, begin, end, importance, flightPhase, briefingPackage, location, eventScenario;
    private List<Double> pos;

    public NotamTableRow(String notamId, String notamText, String begin, String end, String importance,
                         String flightPhase, List<Double> pos, String briefingPackage, String location, String event){
        this.notamId = notamId;
        this.notamText = notamText;
        this.begin = begin;
        this.end = end;
        this.importance = importance;
        this.flightPhase = flightPhase;
        this.pos = pos;
        this.briefingPackage = briefingPackage;
        this.location = location;
        this.eventScenario = event;
    }

    /*=================================================================================================================
    =================================================================================================================*/
    //Getter and Setter:

    public String getNotamId() {
        return notamId;
    }

    public void setNotamId(String notamId) {
        this.notamId = notamId;
    }

    public String getNotamText() {
        return notamText;
    }

    public void setNotamText(String notamText) {
        this.notamText = notamText;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getFlightPhase() {
        return flightPhase;
    }

    public void setFlightPhase(String flightPhase) {
        this.flightPhase = flightPhase;
    }

    public void setPos(List<Double> pos) {
        this.pos = pos;
    }

    public List<Double> getPos() {
        return pos;
    }

    public void setBriefingPackage(String briefingPackage) {
        this.briefingPackage = briefingPackage;
    }

    public String getBriefingPackage() {
        return briefingPackage;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getEventScenario() {
        return eventScenario;
    }

    public void setEventScenario(String eventScenario) {
        this.eventScenario = eventScenario;
    }
}
