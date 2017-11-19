package at.notamWebapp.interestSpec.specificInterest.controller;

import aero.aixm.ElevatedPointType;
import at.notamWebapp.interestSpec.specificInterest.model.InterestSpecificationService;
import at.notamWebapp.interestSpec.specificInterest.view.InterestSpecificationForm;
import com.frequentis.semnotam.schema._1.AtsAreaType;
import com.frequentis.semnotam.schema._1.ElevatedPointReferencePropertyType;
import com.vaadin.data.Property;
import com.vaadin.data.Validator;
import com.vaadin.ui.ComboBox;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.GeodesicStringType;

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

    public void setElevatedPoint(String curveId, List<Double> pointList){
        String firstPointId = "ElevatedPoint" + getFirstPointId(curveId);
        ElevatedPointType elevatedPoint = new ElevatedPointType();
        DirectPositionType directPosType = new DirectPositionType();
        directPosType.getValue().add(pointList.get(0));
        directPosType.getValue().add(pointList.get(1));
        elevatedPoint.setPos(directPosType);
        elevatedPoint.setId(firstPointId);
        model.addInterestSpecificData(firstPointId, elevatedPoint);

        String secondPointId = "ElevatedPoint" + getSecondPointId(curveId);
        elevatedPoint = new ElevatedPointType();
        directPosType = new DirectPositionType();
        directPosType.getValue().add(pointList.get(2));
        directPosType.getValue().add(pointList.get(3));
        elevatedPoint.setPos(directPosType);
        elevatedPoint.setId(secondPointId);
        model.addInterestSpecificData(secondPointId, elevatedPoint);
    }

    public static String getFirstPointId(String segmentId){
        if(segmentId!="") {
            if(segmentId.contains("-")) {
                int x = segmentId.indexOf("-");
                return segmentId.substring(0, x);
            }else{
                return segmentId +"1";
            }
        }
        else return "";
    }

    public static String getSecondPointId(String segmentId){
        if(segmentId!="") {
            if(segmentId.contains("-")) {
                int x = segmentId.indexOf("-");
                int y = segmentId.length();
                return segmentId.substring(x + 1, y);
            }else{
                return segmentId +"2";
            }
        }
        else return "";
    }

    public void setElevatedProperties(AtsAreaType specArea, Property.ValueChangeEvent valueChangeEvent, ComboBox identifier) {
        try {
            if (!identifier.isValid()) {
                identifier.setValidationVisible(true);
            } else {
                identifier.setValidationVisible(false);
                identifier.setComponentError(null);
                identifier.commit();
                setElevatedCurveId(specArea, valueChangeEvent);
                setElevatedPoint(specArea, identifier);
            }
        } catch (Validator.EmptyValueException e) {
            // A required value was missing
        }
    }

    public void setElevatedPoint(AtsAreaType atsArea, ComboBox identifier) {
        if(!identifier.getValue().toString().isEmpty()) {
            GeodesicStringType geodesicStringType = (GeodesicStringType) atsArea.getSegmentShape().getSegmentShapeArea().getShapeCurve().
                    getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            List<Double> pointList = geodesicStringType.getPosList().getValue();
            setElevatedPoint(identifier.getValue().toString(), pointList);
            ElevatedPointReferencePropertyType startPoint = new ElevatedPointReferencePropertyType();
            ElevatedPointReferencePropertyType endPoint = new ElevatedPointReferencePropertyType();
            startPoint.setHref("#ElevatedPoint" + ElevatedDataController.getFirstPointId(identifier.getValue().toString()));
            endPoint.setHref("#ElevatedPoint" + ElevatedDataController.getSecondPointId(identifier.getValue().toString()));
            atsArea.getSegmentShape().getSegmentShapeArea().setStartPoint(startPoint);
            atsArea.getSegmentShape().getSegmentShapeArea().setEndPoint(endPoint);
        }
    }

    public void setElevatedCurveId(AtsAreaType atsArea, Property.ValueChangeEvent valueChangeEvent) {
        String identifier = (String) valueChangeEvent.getProperty().getValue();
        String firstPointId = ElevatedDataController.getFirstPointId(identifier);
        String secondPointId = ElevatedDataController.getSecondPointId(identifier);
        atsArea.getSegmentShape().getSegmentShapeArea().getShapeCurve().getElevatedCurve().setId("ElevatedCurvePoint"+
                firstPointId +"Point"+secondPointId);
    }
}
