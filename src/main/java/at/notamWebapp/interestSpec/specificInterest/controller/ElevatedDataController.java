package at.notamWebapp.interestSpec.specificInterest.controller;

import aero.aixm.ElevatedPointType;
import at.notamWebapp.interestSpec.specificInterest.model.InterestSpecificationService;
import at.notamWebapp.interestSpec.specificInterest.view.InterestSpecificationForm;
import com.frequentis.semnotam.schema._1.ElevatedPointReferencePropertyType;
import com.frequentis.semnotam.schema._1.SegmentAreaType;
import com.vaadin.data.Property;
import net.opengis.gml.AbstractCurveSegmentType;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.GeodesicStringType;
import net.opengis.gml.LineStringSegmentType;

import java.util.List;

/**
 * Created by khoef on 26.04.2017.
 */
public class ElevatedDataController {
    private InterestSpecificationForm view;
    private InterestSpecificationService model;

    ElevatedDataController(InterestSpecificationForm view, InterestSpecificationService model) {
        this.view = view;
        this.model = model;
    }

    public void setElevatedPoint(String curveId, String panelId, List<Double> pointList){
        String firstPointMapId = panelId + "S";
        String firstPointId = getFirstPointId(curveId);
        ElevatedPointType elevatedPoint = new ElevatedPointType();
        DirectPositionType directPosType = new DirectPositionType();
        directPosType.getValue().add(pointList.get(0));
        directPosType.getValue().add(pointList.get(1));
        elevatedPoint.setPos(directPosType);
        elevatedPoint.setId(firstPointId);
        model.addInterestSpecificData(firstPointMapId, elevatedPoint);

        String secondPointMapId = panelId + "E";
        String secondPointId = getSecondPointId(curveId);

        elevatedPoint = new ElevatedPointType();
        directPosType = new DirectPositionType();
        directPosType.getValue().add(pointList.get(2));
        directPosType.getValue().add(pointList.get(3));
        elevatedPoint.setPos(directPosType);
        elevatedPoint.setId(secondPointId);
        model.addInterestSpecificData(secondPointMapId, elevatedPoint);
    }

    public static String getFirstPointId(String segmentId){
        if(segmentId!="") {
            if(segmentId.contains("-")) {
                int x = segmentId.indexOf("-");
                return "EP_" + segmentId.substring(0, x);
            }else{
                return "EP_" + segmentId +"1";
            }
        }
        else return "";
    }

    public static String getSecondPointId(String segmentId){
        if(segmentId!="") {
            if(segmentId.contains("-")) {
                int x = segmentId.indexOf("-");
                int y = segmentId.length();
                return "EP_" + segmentId.substring(x + 1, y);
            }else{
                return "EP_" + segmentId +"2";
            }
        }
        else return "";
    }

    public void setElevatedProperties(SegmentAreaType specArea, Property.ValueChangeEvent valueChangeEvent, String identifier, String id) {
        setElevatedCurveId(specArea, valueChangeEvent);
        setElevatedPoint(specArea, identifier, id);

    }

    public void setElevatedPoint(SegmentAreaType atsArea, String identifier, String id) {
        if(!identifier.isEmpty()) {
            AbstractCurveSegmentType abstractCurveSegmentType = atsArea.getSegmentShape().getSegmentShapeArea().getShapeCurve().
                    getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            if(abstractCurveSegmentType != null) {
                GeodesicStringType geodesicStringType = null;
                LineStringSegmentType lineStringSegmentType = null;
                List<Double> pointList = null;

                if(abstractCurveSegmentType instanceof GeodesicStringType) {
                    geodesicStringType = (GeodesicStringType) abstractCurveSegmentType;
                    pointList = geodesicStringType.getPosList().getValue();
                }else if(abstractCurveSegmentType instanceof LineStringSegmentType){
                    lineStringSegmentType = (LineStringSegmentType) abstractCurveSegmentType;
                    pointList = lineStringSegmentType.getPosList().getValue();
                }
                setElevatedPoint(identifier, id, pointList);
                ElevatedPointReferencePropertyType startPoint = new ElevatedPointReferencePropertyType();
                ElevatedPointReferencePropertyType endPoint = new ElevatedPointReferencePropertyType();
                startPoint.setHref("#" + getFirstPointId(identifier));
                endPoint.setHref("#" + getSecondPointId(identifier));
                atsArea.getSegmentShape().getSegmentShapeArea().setStartPoint(startPoint);
                atsArea.getSegmentShape().getSegmentShapeArea().setEndPoint(endPoint);
            }
        }
    }

    public void setElevatedCurveId(SegmentAreaType atsArea, Property.ValueChangeEvent valueChangeEvent) {
        String identifier = (String) valueChangeEvent.getProperty().getValue();
        String firstPointId = getFirstPointId(identifier);
        String secondPointId = getSecondPointId(identifier);
        atsArea.getSegmentShape().getSegmentShapeArea().getShapeCurve().getElevatedCurve().
                setId(firstPointId +"Point"+secondPointId);
    }
}
