package at.notamWebapp.interestSpec.specificInterest.model.Factories;

import aero.aixm.ElevatedCurvePropertyType;
import aero.aixm.ElevatedCurveType;
import com.frequentis.semnotam.schema._1.SegmentShapeAreaType;
import com.frequentis.semnotam.schema._1.SegmentShapePropertyType;
import com.frequentis.semnotam.schema._1.TimeIntervalPropertyType;
import com.vaadin.ui.Notification;
import net.opengis.gml.*;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
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

    public static SegmentShapePropertyType getSegmentShape(String x1,String y1,String x2,String y2) {
        SegmentShapePropertyType sspt = new SegmentShapePropertyType();
        SegmentShapeAreaType ssat = new SegmentShapeAreaType();
        ElevatedCurvePropertyType shapeCurve = new ElevatedCurvePropertyType();
        CurveSegmentArrayPropertyType segments = new CurveSegmentArrayPropertyType();
        GeodesicStringType abstractCurveSegment = new GeodesicStringType();
        DirectPositionListType directPositionListType = new DirectPositionListType();
        ElevatedCurveType elevatedCurveType = new ElevatedCurveType();


        elevatedCurveType.setSegments(segments);
        shapeCurve.setElevatedCurve(elevatedCurveType);
        ssat.setShapeCurve(shapeCurve);
        sspt.setSegmentShapeArea(ssat);
        abstractCurveSegment.setInterpolation(CurveInterpolationType.GEODESIC);

        abstractCurveSegment.setPosList(directPositionListType);
        JAXBElement<? extends AbstractCurveSegmentType> jaxbElement = new JAXBElement<>(
                QName.valueOf("gml:GeodesicString"), GeodesicStringType.class, abstractCurveSegment);
        segments.getAbstractCurveSegment().add(jaxbElement);

        if(!x1.equals("")) {
            directPositionListType.getValue().add(0, Double.valueOf(x1));
        } else{
            directPositionListType.getValue().add(0, 0d);
        }

        if(!y1.equals("")) {
            directPositionListType.getValue().add(1, Double.valueOf(y1));
        } else{
            directPositionListType.getValue().add(1, 0d);
        }

        if(!x2.equals("")) {
            directPositionListType.getValue().add(2, Double.valueOf(x2));
        } else{
            directPositionListType.getValue().add(2, 0d);
        }

        if(!y2.equals("")) {
            directPositionListType.getValue().add(3, Double.valueOf(y2));
        } else{
            directPositionListType.getValue().add(3, 0d);
        }
        return sspt;
    }

    public static TimeIntervalPropertyType getTimeInterval(HashMap<String, String> values) {
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

        return timeInterval(gc1, gc2);
    }
    public static TimeIntervalPropertyType getTimeInterval(Date startTime, Date endTime) {
        GregorianCalendar gc1 = new GregorianCalendar();
        GregorianCalendar gc2 = new GregorianCalendar();
        gc1.setTime(startTime);
        gc2.setTime(endTime);
        return timeInterval(gc1, gc2);
    }

    private static TimeIntervalPropertyType timeInterval(GregorianCalendar gc1, GregorianCalendar gc2){
        TimeIntervalPropertyType tipt = new TimeIntervalPropertyType();
        TimeIntervalPropertyType.TimeInterval ti = new TimeIntervalPropertyType.TimeInterval();
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
}

