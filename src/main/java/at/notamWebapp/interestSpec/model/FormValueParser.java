package at.notamWebapp.interestSpec.model;

import aero.aixm.CodeFlightRuleType;
import aero.aixm.CodeMeteoConditionsType;
import aero.aixm.ValDistanceType;
import at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.AreaOfInterestForm;
import com.frequentis.semnotam.schema._1.*;
import com.vaadin.server.Page;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by khoef on 22.12.2016.
 */
public class FormValueParser {

    public static SpatialBufferPropertyType getSpatialBuffer(HashMap<String, String> values) {
        SpatialBufferPropertyType sbpt = new SpatialBufferPropertyType();
        SpatialBufferType spt = new SpatialBufferType();
        ValDistanceType hor = new ValDistanceType();
        ValDistanceType ver = new ValDistanceType();
        hor.setValue(BigDecimal.valueOf(Long.parseLong(values.get("horizontalBuffer"))));
        ver.setValue(BigDecimal.valueOf(Long.parseLong(values.get("verticalBuffer"))));
        spt.setHorizontal(hor);
        spt.setVertical(ver);
        sbpt.setSpatialBuffer(spt);
        return sbpt;
    }

    public static SegmentShapePropertyType getSegmentShape(HashMap<String, String> values) {
        SegmentShapePropertyType sspt = new SegmentShapePropertyType();
        SegmentShapeAreaType ssat = new SegmentShapeAreaType();
        ElevatedPointReferencePropertyType startPoint = new ElevatedPointReferencePropertyType();
        ElevatedPointReferencePropertyType endPoint = new ElevatedPointReferencePropertyType();
        startPoint.setHref(values.get("startPointX")+" "+values.get("startPointY"));
        endPoint.setHref(values.get("endPointX")+" "+values.get("endPointY"));
        ssat.setStartPoint(startPoint);
        ssat.setEndPoint(endPoint);
        sspt.setSegmentShapeArea(ssat);
        return sspt;
    }

    public static ValDistanceType getValDistance(HashMap<String, String> values) {
        ValDistanceType value = new ValDistanceType();
        value.setValue(BigDecimal.valueOf(Long.parseLong(values.get("flightAltitude"))));
        return value;
    }

    public static TimeBufferPropertyType getTimeBuffer(HashMap<String, String> values) {
        TimeBufferPropertyType tbpt = new TimeBufferPropertyType();
        TimeBufferPropertyType.TemporalBuffer tb = new TimeBufferPropertyType.TemporalBuffer();
        try {
            Duration dur = DatatypeFactory.newInstance().newDuration(true, 0, 0, 0, 0, Integer.parseInt(values.get("timeBufferBefore")),0);
            tb.setBefore(dur);
            dur = DatatypeFactory.newInstance().newDuration(true, 0, 0, 0, 0, Integer.parseInt(values.get("timeBufferAfter")),0);
            tb.setAfter(dur);
            tbpt.setTemporalBuffer(tb);
        } catch (DatatypeConfigurationException e) {
            new Notification("Buffer konnte nicht erstellt werden.").show(Page.getCurrent());
            e.printStackTrace();
        }
        return tbpt;
    }

    public static CodeFlightRuleType getFlightRule(HashMap<String, String> values){
        CodeFlightRuleType cfrt = new CodeFlightRuleType();
        cfrt.setValue(values.get("flightRule"));
        return cfrt;
    }

    public static CodeMeteoConditionsType getMeteoCondition(HashMap<String, String> values) {
        CodeMeteoConditionsType cmct = new CodeMeteoConditionsType();
        cmct.setValue(values.get("meteoCondition"));
        return cmct;
    }

    public static TimeIntervalPropertyType getTimeInterval(HashMap<String, String> values) {
        TimeIntervalPropertyType tipt = new TimeIntervalPropertyType();
        TimeIntervalPropertyType.TimeInterval ti = new TimeIntervalPropertyType.TimeInterval();
        DateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        Date begPosTime = new Date();
        Date endPosTime = new Date();
        try {
            begPosTime = format.parse(values.get("beginPosition"));
            endPosTime = format.parse(values.get("endPosition"));
        } catch (ParseException e) {
            new Notification("Zeit konnte nicht geparst werden");
            e.printStackTrace();
        }
        GregorianCalendar gc1 = new GregorianCalendar();
        GregorianCalendar gc2 = new GregorianCalendar();
        gc1.setTime(begPosTime);
        gc2.setTime(endPosTime);
        XMLGregorianCalendar xmlBegPosTime, xmlEndPosTime;

        try {
            xmlBegPosTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc1);
            xmlEndPosTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc2);
            ti.setBeginPosition(xmlBegPosTime);
            ti.setEndPosition(xmlEndPosTime);
            tipt.setTimeInterval(ti);
        } catch (DatatypeConfigurationException e) {
            new Notification("XML Zeit konnte nicht erstellt werden.");
            e.printStackTrace();
        }
        return tipt;
    }
    public static TimeIntervalPropertyType getTimeInterval(Date startTime, Date endTime) {
        TimeIntervalPropertyType tipt = new TimeIntervalPropertyType();
        TimeIntervalPropertyType.TimeInterval ti = new TimeIntervalPropertyType.TimeInterval();
        DateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        Date begPosTime = startTime;
        Date endPosTime = endTime;

        GregorianCalendar gc1 = new GregorianCalendar();
        GregorianCalendar gc2 = new GregorianCalendar();
        gc1.setTime(begPosTime);
        gc2.setTime(endPosTime);
        XMLGregorianCalendar xmlBegPosTime, xmlEndPosTime;

        try {
            xmlBegPosTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc1);
            xmlEndPosTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc2);
            ti.setBeginPosition(xmlBegPosTime);
            ti.setEndPosition(xmlEndPosTime);
            tipt.setTimeInterval(ti);
        } catch (DatatypeConfigurationException e) {
            new Notification("XML Zeit konnte nicht erstellt werden.");
            e.printStackTrace();
        }
        return tipt;
    }

    public static TimeBufferPropertyType getTimeBuffer(String bufBef, String bufAft) {
        TimeBufferPropertyType tbpt = new TimeBufferPropertyType();
        TimeBufferPropertyType.TemporalBuffer tb = new TimeBufferPropertyType.TemporalBuffer();
        try {
            Duration dur = DatatypeFactory.newInstance().newDuration(true, 0, 0, 0, 0, Integer.parseInt(bufBef),0);
            tb.setBefore(dur);
            dur = DatatypeFactory.newInstance().newDuration(true, 0, 0, 0, 0, Integer.parseInt(bufAft),0);
            tb.setAfter(dur);
            tbpt.setTemporalBuffer(tb);
        } catch (DatatypeConfigurationException e) {
            new Notification("Buffer konnte nicht erstellt werden.").show(Page.getCurrent());
            e.printStackTrace();
        }
        return tbpt;
    }

    public static AreaOfInterestType addAreaFormValuesToAreaInterest(AreaOfInterestForm areaForm) {
        //  Abschnitt zur Erzeugung der jeweiligen AreaInterests und hinzufügen zum FlightPath
        HashMap<String, String> values = areaForm.getCaptionValuePairs();
        String designator = null, conceptName = null, identifier = null, aerodromeDesignator = null;
        ValDistanceType height = null;
        Boolean defaultDirection = true;
        BigInteger sequence = null;
        CodeFlightRuleType flightRule = null;
        CodeMeteoConditionsType meteoCondition = null;
        TimeIntervalPropertyType timeInterval = null;
        TimeBufferPropertyType timeBuffer = null;
        CodeTimeOfDayBaseType timeOfDay = null;
        SpatialBufferPropertyType areaBuffer = null;
        SegmentShapePropertyType segmentShape = null;

        if(values.get("designator")!= null) {
            designator = values.get("designator");
        }
        if(values.get("flightRule")!= null) {
            flightRule = getFlightRule(values);
        }
        if(values.get("meteoCondition")!=null) {
            meteoCondition = getMeteoCondition(values);
        }
        if(values.get("sequence")!=null) {
            sequence = (BigInteger.valueOf(Long.parseLong(values.get("sequence"))));
        }
        if(values.get("beginPosition")!=null && values.get("endPosition")!=null) {
            timeInterval = getTimeInterval(values);
        }
        if(values.get("timeBufferBefore")!= null && values.get("timeBufferAfter") != null) {
            timeBuffer = getTimeBuffer(values);
        }
        if(values.get("timeOfDay")!=null) {
            timeOfDay = CodeTimeOfDayBaseType.valueOf(values.get("timeOfDay"));
        }
        if(values.get("conceptName")!= null) {
            conceptName = values.get("conceptName");
        }
        if(values.get("horizontalBuffer") != null && values.get("verticalBuffer") != null) {
            areaBuffer = getSpatialBuffer(values);
        }
        if(values.get("identifier")!=null){
            identifier = values.get("identifier");
        }
        if(values.get("defaultDirection")!=null){
            defaultDirection = Boolean.parseBoolean(values.get("defaultDirection"));
        }
        if(values.get("flightAltitude")!= null){
            height = getValDistance(values);
        }
        if(values.get("startPointX")!=null && values.get("startPointY")!=null
                && values.get("endPointX")!=null && values.get("endPointY")!=null){
            segmentShape = getSegmentShape(values);
        }
        if(values.get("aerodromeDesignator")!=null){
            aerodromeDesignator = values.get("aerodromeDesignator");
        }
        switch(areaForm.getCaption()) {
            case "DepartureAerodromeAreaType":
                DepartureAerodromeAreaType area1 = new DepartureAerodromeAreaType();
                area1.setDesignator(designator);
                area1.setFlightRule(flightRule);
                area1.setMeteoCondition(meteoCondition);
                area1.setSequence(sequence);
                area1.setTime(timeInterval);
                area1.setTimeBuffer(timeBuffer);
                area1.setTimeOfDay(timeOfDay);
                return area1;
            case "DestinationAerodromeAreaType":
                DestinationAerodromeAreaType area2 = new DestinationAerodromeAreaType();
                area2.setDesignator(designator);
                area2.setFlightRule(flightRule);
                area2.setMeteoCondition(meteoCondition);
                area2.setSequence(sequence);
                area2.setTime(timeInterval);
                area2.setTimeBuffer(timeBuffer);
                area2.setTimeOfDay(timeOfDay);
                return area2;
            case "DepartureAlternateAerodromeAreaType":
                DepartureAlternateAerodromeAreaType area3 = new DepartureAlternateAerodromeAreaType();
                area3.setDesignator(designator);
                area3.setFlightRule(flightRule);
                area3.setMeteoCondition(meteoCondition);
                area3.setSequence(sequence);
                area3.setTime(timeInterval);
                area3.setTimeBuffer(timeBuffer);
                area3.setTimeOfDay(timeOfDay);
                return area3;
            case "EnRouteAlternateAerodromeAreaType":
                EnRouteAlternateAerodromeAreaType area4 = new EnRouteAlternateAerodromeAreaType();
                area4.setDesignator(designator);
                area4.setFlightRule(flightRule);
                area4.setMeteoCondition(meteoCondition);
                area4.setSequence(sequence);
                area4.setTime(timeInterval);
                area4.setTimeBuffer(timeBuffer);
                area4.setTimeOfDay(timeOfDay);
                return area4;
            case "DestinationAlternateAerodromeAreaType":
                DestinationAlternateAerodromeAreaType area5 = new DestinationAlternateAerodromeAreaType();
                area5.setDesignator(designator);
                area5.setFlightRule(flightRule);
                area5.setMeteoCondition(meteoCondition);
                area5.setSequence(sequence);
                area5.setTime(timeInterval);
                area5.setTimeBuffer(timeBuffer);
                area5.setTimeOfDay(timeOfDay);
                return area5;
            case "FirAreaType":
                FirAreaType area6 = new FirAreaType();
                area6.setDesignator(designator);
                area6.setFlightRule(flightRule);
                area6.setMeteoCondition(meteoCondition);
                area6.setSequence(sequence);
                area6.setTime(timeInterval);
                area6.setTimeBuffer(timeBuffer);
                area6.setTimeOfDay(timeOfDay);
                return area6;
            case "ShapeAreaType":
                ShapeAreaType area7 = new ShapeAreaType();
                area7.setFlightRule(flightRule);
                area7.setMeteoCondition(meteoCondition);
                area7.setSequence(sequence);
                area7.setTime(timeInterval);
                area7.setTimeBuffer(timeBuffer);
                area7.setTimeOfDay(timeOfDay);
                area7.setAreaBuffer(areaBuffer);
                area7.setHeight(height);
                //          area7.setShape();
                return area7;
            case "ConceptDefinedAreaType":
                ConceptDefinedAreaType area8 = new ConceptDefinedAreaType();
                area8.setFlightRule(flightRule);
                area8.setMeteoCondition(meteoCondition);
                area8.setSequence(sequence);
                area8.setTime(timeInterval);
                area8.setTimeBuffer(timeBuffer);
                area8.setTimeOfDay(timeOfDay);
                area8.setConceptName(conceptName);
                //          area8.setRestriction();
                return area8;
            case "AtsAreaType":
                AtsAreaType area9 = new AtsAreaType();
                area9.setIdentifier(identifier);
                area9.setDefaultDirection(defaultDirection);
                area9.setAreaBuffer(areaBuffer);
                area9.setSegmentShape(segmentShape);
                area9.setFlightAltitude(height);
                area9.setFlightRule(flightRule);
                area9.setMeteoCondition(meteoCondition);
                area9.setSequence(sequence);
                area9.setTime(timeInterval);
                area9.setTimeBuffer(timeBuffer);
                area9.setTimeOfDay(timeOfDay);
                return area9;
            case "DestinationApproachAreaType":
                DestinationApproachAreaType area10 = new DestinationApproachAreaType();
                area10.setAerodromeDesignator(aerodromeDesignator);
                area10.setIdentifier(identifier);
                area10.setDefaultDirection(defaultDirection);
                area10.setAreaBuffer(areaBuffer);
                area10.setSegmentShape(segmentShape);
                area10.setFlightAltitude(height);
                area10.setFlightRule(getFlightRule(values));
                area10.setMeteoCondition(getMeteoCondition(values));
                area10.setSequence(BigInteger.valueOf(Long.parseLong(values.get("sequence"))));
                area10.setTime(getTimeInterval(values));
                area10.setTimeBuffer(getTimeBuffer(values));
                area10.setTimeOfDay(CodeTimeOfDayBaseType.valueOf(values.get("timeOfDay")));
                return area10;
            case "DepartureAreaType":
                DepartureAreaType area11 = new DepartureAreaType();
                area11.setAerodromeDesignator(aerodromeDesignator);
                area11.setIdentifier(identifier);
                area11.setDefaultDirection(defaultDirection);
                area11.setAreaBuffer(areaBuffer);
                area11.setSegmentShape(segmentShape);
                area11.setFlightAltitude(height);
                area11.setFlightRule(flightRule);
                area11.setMeteoCondition(meteoCondition);
                area11.setSequence(sequence);
                area11.setTime(timeInterval);
                area11.setTimeBuffer(timeBuffer);
                area11.setTimeOfDay(timeOfDay);
                return area11;
            case "DepartureAlternateApproachAreaType":
                DepartureAlternateApproachAreaType area12 = new DepartureAlternateApproachAreaType();
                area12.setAerodromeDesignator(aerodromeDesignator);
                area12.setIdentifier(identifier);
                area12.setDefaultDirection(defaultDirection);
                area12.setAreaBuffer(areaBuffer);
                area12.setSegmentShape(segmentShape);
                area12.setFlightAltitude(height);
                area12.setFlightRule(flightRule);
                area12.setMeteoCondition(meteoCondition);
                area12.setSequence(sequence);
                area12.setTime(timeInterval);
                area12.setTimeBuffer(timeBuffer);
                area12.setTimeOfDay(timeOfDay);
                return area12;
            case "EnRouteAlternateApproachAreaType":
                EnRouteAlternateApproachAreaType area13 = new EnRouteAlternateApproachAreaType();
                area13.setAerodromeDesignator(aerodromeDesignator);
                area13.setIdentifier(identifier);
                area13.setDefaultDirection(defaultDirection);
                area13.setAreaBuffer(areaBuffer);
                area13.setSegmentShape(segmentShape);
                area13.setFlightAltitude(height);
                area13.setFlightRule(flightRule);
                area13.setMeteoCondition(meteoCondition);
                area13.setSequence(sequence);
                area13.setTime(timeInterval);
                area13.setTimeBuffer(timeBuffer);
                area13.setTimeOfDay(timeOfDay);
                return area13;
            case "DestinationAlternateApproachAreaType":
                DestinationAlternateApproachAreaType area14 = new DestinationAlternateApproachAreaType();
                area14.setAerodromeDesignator(aerodromeDesignator);
                area14.setIdentifier(identifier);
                area14.setDefaultDirection(defaultDirection);
                area14.setAreaBuffer(areaBuffer);
                area14.setSegmentShape(segmentShape);
                area14.setFlightAltitude(height);
                area14.setFlightRule(flightRule);
                area14.setMeteoCondition(meteoCondition);
                area14.setSequence(sequence);
                area14.setTime(timeInterval);
                area14.setTimeBuffer(timeBuffer);
                area14.setTimeOfDay(timeOfDay);
                return area14;
        }
        return null;
    }

    public static Panel getinterestFormPanel(String property) {
        Panel interestPanel = new Panel();
        return interestPanel;
    }


}
