package at.notamWebapp.interestSpec.controller;

import aero.aixm.ElevatedPointType;
import at.notamWebapp.interestSpec.model.GetPointIdentifier;
import at.notamWebapp.interestSpec.model.InterestSpecificationService;
import at.notamWebapp.interestSpec.view.InterestSpecificationForm;
import net.opengis.gml.DirectPositionType;

import java.util.List;

/**
 * Created by khoef on 26.04.2017.
 */
public class ElevatedDataController {
    private InterestSpecificationForm view;
    private InterestSpecificationService model;

    public ElevatedDataController(InterestSpecificationForm view, InterestSpecificationService model) {
        this.view = view;
        this.model = model;
    }

    public void setElevatedPoint(String curveId, List<Double> pointList){
        String firstPointId = "#ElevatedPoint" + GetPointIdentifier.getFirstPointId(curveId);
        ElevatedPointType elevatedPoint = new ElevatedPointType();
        DirectPositionType directPosType = new DirectPositionType();
        directPosType.getValue().add(pointList.get(0));
        directPosType.getValue().add(pointList.get(1));
        elevatedPoint.setPos(directPosType);
        elevatedPoint.setId(firstPointId);
        model.addInterestSpecificData(firstPointId, elevatedPoint);

        String secondPointId = "#ElevatedPoint" + GetPointIdentifier.getSecondPointId(curveId);
        elevatedPoint = new ElevatedPointType();
        directPosType = new DirectPositionType();
        directPosType.getValue().add(pointList.get(2));
        directPosType.getValue().add(pointList.get(3));
        elevatedPoint.setPos(directPosType);
        elevatedPoint.setId(secondPointId);
        model.addInterestSpecificData(secondPointId, elevatedPoint);
    }
}
