package at.notamWebapp.interestSpec.model;

import aero.aixm.*;
import com.frequentis.semnotam.schema._1.*;
import net.opengis.gml.CurveInterpolationType;
import net.opengis.gml.CurveSegmentArrayPropertyType;
import net.opengis.gml.DirectPositionListType;
import net.opengis.gml.GeodesicStringType;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;

/**
 * Created by khoef on 24.01.2017.
 */
public class AreaInterestFactory {

    public TimeBufferPropertyType newTimeBuffer(){
        TimeBufferPropertyType timeBuffer = new TimeBufferPropertyType();
        TimeBufferPropertyType.TemporalBuffer tempBuffer = new TimeBufferPropertyType.TemporalBuffer();
        Duration dur = null;
        try {
            dur = DatatypeFactory.newInstance().newDuration(true,0,0,0,0,0,0);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        tempBuffer.setAfter(dur);
        tempBuffer.setBefore(dur);
        timeBuffer.setTemporalBuffer(tempBuffer);
        return timeBuffer;
    }

    public TimeIntervalPropertyType newTimeInterval(){
        TimeIntervalPropertyType timeInterval = new TimeIntervalPropertyType();
        TimeIntervalPropertyType.TimeInterval time = new TimeIntervalPropertyType.TimeInterval();
        GregorianCalendar gc1 = new GregorianCalendar();
        GregorianCalendar gc2 = new GregorianCalendar();
        try {
            time.setBeginPosition(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc1));
            time.setEndPosition(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc2));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        timeInterval.setTimeInterval(time);
        return timeInterval;
    }

    private SpatialBufferPropertyType newSpatialBuffer(){
        SpatialBufferPropertyType spatialBufferPropertyType = new SpatialBufferPropertyType();
        SpatialBufferType spatialBufferType = new SpatialBufferType();
        ValDistanceType valDistanceType = newValDistanceType();
        spatialBufferType.setHorizontal(valDistanceType);
        spatialBufferType.setVertical(valDistanceType);
        spatialBufferPropertyType.setSpatialBuffer(spatialBufferType);
        return spatialBufferPropertyType;
    }

    private CodeFlightRuleType newCodeFlightRule(){
        CodeFlightRuleType flightRule = new CodeFlightRuleType();
        flightRule.setValue("");
        return flightRule;
    }

    private CodeMeteoConditionsType newMeteoCondition(){
        CodeMeteoConditionsType meteoConditionsType = new CodeMeteoConditionsType();
        meteoConditionsType.setValue("");
        return meteoConditionsType;
    }

    private CodeTimeOfDayBaseType newTimeOfDay(){
        return CodeTimeOfDayBaseType.DAY;
    }

    private SegmentShapePropertyType newSegmentShapePropertyType(){
        //Generate SegmentShape
        SegmentShapePropertyType segmentShapeProperty = new SegmentShapePropertyType();
        SegmentShapeAreaType segmentShape = new SegmentShapeAreaType();
        ElevatedCurvePropertyType shapeCurve = new ElevatedCurvePropertyType();
        ElevatedCurveType elevatedCurve = new ElevatedCurveType();
        CurveSegmentArrayPropertyType segment = new CurveSegmentArrayPropertyType();
        GeodesicStringType geodesicString = new GeodesicStringType();
        geodesicString.setInterpolation(CurveInterpolationType.GEODESIC);
        DirectPositionListType posList = new DirectPositionListType();
        geodesicString.setPosList(posList);
         JAXBElement<GeodesicStringType> geodesicStringTypeJAXBElement = new JAXBElement(QName.valueOf("GeodesicString"), GeodesicStringType.class, geodesicString);
        segment.getAbstractCurveSegment().add(geodesicStringTypeJAXBElement);
        elevatedCurve.setSegments(segment);
        shapeCurve.setElevatedCurve(elevatedCurve);
        segmentShape.setShapeCurve(shapeCurve);
        segmentShapeProperty.setSegmentShapeArea(segmentShape);
        return  segmentShapeProperty;
    }

    private ValDistanceType newValDistanceType(){
        ValDistanceType valDistanceType = new ValDistanceType();
        valDistanceType.setValue(BigDecimal.valueOf(0));
        return valDistanceType;
    }

    /*
    private ElevatedSurfacePropertyType newElevatedSurfacePropertyType(){
        ElevatedSurfacePropertyType elevatedSurfacePropertyType = new ElevatedSurfacePropertyType();
        ElevatedSurfaceType elevatedSurfaceType = new ElevatedSurfaceType();
        elevatedSurfaceType.se
        elevatedSurfacePropertyType.setElevatedSurface();
    }
    */
    /*
    private RestrictionPropertyType newRestrictionPropertyType(){
        RestrictionPropertyType restrictionPropertyType = new RestrictionPropertyType();
    //    restrictionPropertyType.setNestedRestriction();
        restrictionPropertyType.setNotamRestriction();
    //    restrictionPropertyType.setValueRestriction();
        NotamRestrictionType notamRestrictionType = new NotamRestrictionType();
        notamRestrictionType.
        return restrictionPropertyType;
    }
    */
    public DepartureAerodromeAreaType newDepartureAerodromeAreaType(){
        DepartureAerodromeAreaType area = new DepartureAerodromeAreaType();
        area.setDesignator("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        return area;
    }

    public DestinationAerodromeAreaType newDestinationAerodromeAreaType(){
        DestinationAerodromeAreaType area = new DestinationAerodromeAreaType();
        area.setDesignator("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        return area;
    }
    public DepartureAlternateAerodromeAreaType newDepartureAlternateAerodromeAreaType(){
        DepartureAlternateAerodromeAreaType area = new DepartureAlternateAerodromeAreaType();
        area.setDesignator("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        return area;
    }
    public EnRouteAlternateAerodromeAreaType newEnRouteAlternateAerodromeAreaType(){
        EnRouteAlternateAerodromeAreaType area = new EnRouteAlternateAerodromeAreaType();
        area.setDesignator("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        return area;
    }

    public DestinationAlternateAerodromeAreaType newDestinationAlternateAerodromeAreaType(){
        DestinationAlternateAerodromeAreaType area = new DestinationAlternateAerodromeAreaType();
        area.setDesignator("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        return area;
    }

    public FirAreaType newFirArea(){
        FirAreaType area = new FirAreaType();
        area.setDesignator("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        return area;
    }

    public ShapeAreaType newShapeArea(){
        ShapeAreaType area = new ShapeAreaType();
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.setFlightRule(newCodeFlightRule());
        area.setSequence(BigInteger.valueOf(0));
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        ElevatedSurfacePropertyType shape = new ElevatedSurfacePropertyType();
        ElevatedSurfaceType elevatedSurface = new ElevatedSurfaceType();
        elevatedSurface.setElevation(new JAXBElement<ValDistanceVerticalType>(new QName("elevation"),
                ValDistanceVerticalType.class, null));
        elevatedSurface.setGeoidUndulation(new JAXBElement<ValDistanceSignedType>(new QName("geoidUndulation"),
                ValDistanceSignedType.class, null));
        elevatedSurface.setVerticalAccuracy(new JAXBElement<ValDistanceType>(new QName("verticalAccuracy"),
                ValDistanceType.class, null));
        elevatedSurface.setVerticalDatum(new JAXBElement<CodeVerticalDatumType>(new QName("verticalDatum"),
                CodeVerticalDatumType.class, null));
        shape.setElevatedSurface(elevatedSurface);
        area.setShape(shape);
        area.setHeight(newValDistanceType());
        area.setAreaBuffer(newSpatialBuffer());
        return area;
    }


    public ConceptDefinedAreaType newConceptDefinedAreaType(){
        /*
        ConceptDefinedAreaType area = new ConceptDefinedAreaType();
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.setFlightRule(newCodeFlightRule());
        area.setSequence(new BigInteger(""));
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        area.setRestriction();
        area.setConceptName("");
        */
        return null;
    }

    public AtsAreaType newAtsAreaType(){
        AtsAreaType area = new AtsAreaType();
        area.setIdentifier("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        area.setAreaBuffer(newSpatialBuffer());
        area.setSegmentShape(newSegmentShapePropertyType());
        area.setFlightAltitude(newValDistanceType());
        area.setDefaultDirection(true);
        return area;
    }

    public DepartureAreaType newDepartureArea(){
        DepartureAreaType area = new DepartureAreaType();
        area.setIdentifier("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        area.setAreaBuffer(newSpatialBuffer());
        area.setSegmentShape(newSegmentShapePropertyType());
        area.setFlightAltitude(newValDistanceType());
        area.setDefaultDirection(true);
        return area;
    }

    public DestinationApproachAreaType newDestinationApproachArea(){
        DestinationApproachAreaType area = new DestinationApproachAreaType();
        area.setIdentifier("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        area.setAreaBuffer(newSpatialBuffer());
        area.setSegmentShape(newSegmentShapePropertyType());
        area.setIdentifier("");
        area.setFlightAltitude(newValDistanceType());
        area.setDefaultDirection(true);
        return area;
    }

    public DepartureAlternateApproachAreaType newDepartureAlternateApproachArea(){
        DepartureAlternateApproachAreaType area = new DepartureAlternateApproachAreaType();
        area.setIdentifier("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        area.setAreaBuffer(newSpatialBuffer());
        area.setSegmentShape(newSegmentShapePropertyType());
        area.setFlightAltitude(newValDistanceType());
        area.setDefaultDirection(true);
        return area;
    }

    public EnRouteAlternateApproachAreaType newEnRouteAlternateApproachArea(){
        EnRouteAlternateApproachAreaType area = new EnRouteAlternateApproachAreaType();
        area.setIdentifier("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        area.setAreaBuffer(newSpatialBuffer());
        area.setSegmentShape(newSegmentShapePropertyType());
        area.setFlightAltitude(newValDistanceType());
        area.setDefaultDirection(true);
        return area;
    }

    public DestinationAlternateApproachAreaType newDestinationAlternateApproachArea(){
        DestinationAlternateApproachAreaType area = new DestinationAlternateApproachAreaType();
        area.setIdentifier("");
        area.setSequence(BigInteger.valueOf(0));
        area.setTimeBuffer(newTimeBuffer());
        area.setTime(newTimeInterval());
        area.getTime().getTimeInterval().setBeginPosition(null);
        area.getTime().getTimeInterval().setEndPosition(null);
        area.setFlightRule(newCodeFlightRule());
        area.setMeteoCondition(newMeteoCondition());
        area.setTimeOfDay(newTimeOfDay());
        area.setAreaBuffer(newSpatialBuffer());
        area.setSegmentShape(newSegmentShapePropertyType());
        area.setFlightAltitude(newValDistanceType());
        area.setDefaultDirection(true);
        return area;
    }
}
