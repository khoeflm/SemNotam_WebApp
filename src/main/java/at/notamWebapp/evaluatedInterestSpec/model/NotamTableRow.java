package at.notamWebapp.evaluatedInterestSpec.model;

import java.util.List;

/**
 * Created by khoef on 01.05.2017.
 */
public class NotamTableRow {
    private String notamId, notamText, begin, end, importance, briefingPhase;
    private List<Double> pos;

    public NotamTableRow(String notamId, String notamText, String begin, String end, String importance,
                         String briefingPhase, List<Double> pos){
        this.notamId = notamId;
        this.notamText = notamText;
        this.begin = begin;
        this.end = end;
        this.importance = importance;
        this.briefingPhase = briefingPhase;
        this.pos = pos;
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

    public String getBriefingPhase() {
        return briefingPhase;
    }

    public void setBriefingPhase(String briefingPhase) {
        this.briefingPhase = briefingPhase;
    }

    public void setPos(List<Double> pos) {
        this.pos = pos;
    }

    public List<Double> getPos() {
        return pos;
    }
}
