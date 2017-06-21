package at.notamWebapp.interestSpec.model;

import aero.aixm.CodeSignalPerformanceILSType;
import aero.aixm.ElevatedPointPropertyType;
import aero.aixm.ElevatedPointType;
import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.view.InterestSpecificationForm;
import at.notamWebapp.interestSpec.view.complexInterestForms.FlightPathInterestForm;
import com.frequentis.semnotam.schema._1.*;
import com.vaadin.server.Page;
import com.vaadin.ui.Notification;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.GeodesicStringType;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by khoef on 20.11.2016.
 */
public class InterestSpecificationService{

    private InterestSpecificationForm view;
    private InterestSpecificationType interestSpec;
    private InterestPropertyType interest;
    private BinaryIntersectionInterestType rootBinaryInterest;
    private HashMap<String, InterestPropertyType> interestMap;
    private HashMap<String, ElevatedPointType> elevatedPointMap;
    private HashMap<String, List<ElevatedPointPropertyType>> posListMap;
    private ArrayList<String> chosenComplexInterests;
    private int idCounter = 0;
    private SemNotamController controller;

    public InterestSpecificationService(SemNotamController controller){
        this.view = controller.getView();
        this.controller = controller;
        interestSpec = new InterestSpecificationType();
        interest = new InterestPropertyType();
        rootBinaryInterest = new BinaryIntersectionInterestType();
        interest.setBinaryIntersectionInterest(rootBinaryInterest);
        interestMap = new HashMap<>();
        elevatedPointMap = new HashMap<>();
        chosenComplexInterests = new ArrayList<>();

    }

    public void setInterestSpec(InterestSpecificationType is){
        this.interestSpec = is;
    }

    public int addToInterestMap(String id, InterestPropertyType specificInterest) {
        idCounter++;
        this.interestMap.put(id+idCounter, specificInterest);
        if(specificInterest.getFlightPlanInterest()!=null){
            InterestPropertyType interestPropertyType = new InterestPropertyType();
            interestPropertyType.setFlightPathInterest(specificInterest.getFlightPlanInterest().getArea().getFlightPathInterest());
            interestMap.put("PATH"+idCounter, interestPropertyType);
        }
        return idCounter;
    }

    public InterestSpecificationType getInterestSpec() {
        return interestSpec;
    }

    public InterestSpecificationType getSavableInterestSpec(String rootElement, String filename, Boolean specificInterestDefined,
                                       Boolean generalInterestDefined) {
        if(!rootElement.equals("-1")||view.getDisableSpecific().getValue()) {
            InterestPropertyType undefinedInterest = new InterestPropertyType();
            undefinedInterest.setUndefinedInterest(new UndefinedInterestType());
            if(generalInterestDefined) {
                InterestPropertyType generalInterestProperty = new InterestPropertyType();
                generalInterestProperty.setIntersectionInterest(view.getGeneralInterestForm().getGeneralInterestController().
                        getGeneralIntersectionInterest());
                rootBinaryInterest.setLeftHand(generalInterestProperty);
            }
            else{
                rootBinaryInterest.setLeftHand(undefinedInterest);
            }
            if(specificInterestDefined) {
                rootBinaryInterest.setRightHand(interestMap.get(rootElement));
            }
            else{
                rootBinaryInterest.setRightHand(undefinedInterest);
            }
            interestSpec.setId(filename);
            interestSpec.setInterest(interest);
            return interestSpec;
        }
        return null;
    }

    public void saveInterestSpec() {
        String interestSpecID = view.getInterestSpecID().getValue();
        String rootElement = view.getRootElement();
        String filename;
        if(!rootElement.equals("-1")||view.getDisableSpecific().getValue()) {
            filename = interestSpecID;
            InterestPropertyType undefinedInterest = new InterestPropertyType();
            undefinedInterest.setUndefinedInterest(new UndefinedInterestType());
            if(!view.getDisableGeneral().getValue()) {
                InterestPropertyType generalInterestProperty = new InterestPropertyType();
                generalInterestProperty.setIntersectionInterest(view.getGeneralInterestForm().getGeneralInterestController().
                        getGeneralIntersectionInterest());
                rootBinaryInterest.setLeftHand(generalInterestProperty);
            }
            else{
                rootBinaryInterest.setLeftHand(undefinedInterest);
            }
            if(!view.getDisableSpecific().getValue()) {
                rootBinaryInterest.setRightHand(interestMap.get(rootElement));
            }
            else{
                rootBinaryInterest.setRightHand(undefinedInterest);
            }

            interestSpec.setId(filename);
            interestSpec.setInterest(interest);

        }
    }

    public void addInterest(String selectedInterest) {
        idCounter ++;
        switch(selectedInterest){
            case "1":
                FlightPlanInterestType flightPlan = new FlightPlanInterestType();
                FlightPathInterestPropertyType fliPaPropType = new FlightPathInterestPropertyType();

                //Aircraft
                AircraftOfInterestPropertyType aircPropType = new AircraftOfInterestPropertyType();
                AircraftOfInterestType aircraft = new AircraftOfInterestType();
                aircraft.setAircraftTypeName("");
                aircraft.setIlsCat(new CodeSignalPerformanceILSType());
                aircraft.getIlsCat().setValue("");

                //Period
                PeriodOfInterestPropertyType perPropType = new PeriodOfInterestPropertyType();
                PeriodOfInterestType period = new PeriodOfInterestType();
                TimeIntervalPropertyType timeInterval1 = new TimeIntervalPropertyType();
                TimeIntervalPropertyType timeInterval2 = new TimeIntervalPropertyType();
                TimeIntervalPropertyType.TimeInterval interval1 = new TimeIntervalPropertyType.TimeInterval();
                TimeIntervalPropertyType.TimeInterval interval2 = new TimeIntervalPropertyType.TimeInterval();
                timeInterval1.setTimeInterval(interval1);
                timeInterval2.setTimeInterval(interval2);
                interval1.setBeginPosition(null);
                interval1.setEndPosition(null);
                interval2.setBeginPosition(null);
                interval2.setEndPosition(null);
                TimeBufferPropertyType timeBuffer = new TimeBufferPropertyType();
                TimeBufferPropertyType.TemporalBuffer tempBuffer = new TimeBufferPropertyType.TemporalBuffer();
                try {
                    tempBuffer.setBefore(DatatypeFactory.newInstance().newDuration(true,0,0,0,0,0,0));
                    tempBuffer.setAfter(DatatypeFactory.newInstance().newDuration(true,0,0,0,0,0,0));
                } catch (DatatypeConfigurationException e) {
                    e.printStackTrace();
                }
                timeBuffer.setTemporalBuffer(tempBuffer);
                period.setTimeBuffer(timeBuffer);
                period.setDetTime(timeInterval1);
                period.setOccTime(timeInterval2);
                //Flightpath
                FlightPathInterestType flightPath = new FlightPathInterestType();
                fliPaPropType.setFlightPathInterest(flightPath);
                perPropType.setPeriodOfInterest(period);
                aircPropType.setAircraftOfInterest(aircraft);
                flightPlan.setArea(fliPaPropType);
                flightPlan.setAircraft(aircPropType);
                flightPlan.setPeriod(perPropType);

                InterestPropertyType dummyInterest = new InterestPropertyType();
                InterestPropertyType dummyInterest2 = new InterestPropertyType();
                InterestPropertyType dummyInterest3 = new InterestPropertyType();
                InterestPropertyType dummyInterest4 = new InterestPropertyType();
                dummyInterest.setFlightPlanInterest(flightPlan);
                dummyInterest2.setPeriodOfInterest(period);
                dummyInterest3.setAircraftOfInterest(aircraft);
                dummyInterest4.setFlightPathInterest(flightPath);

                view.addFlightPlanInterest(idCounter, flightPlan);
                this.interestMap.put("FPLA"+idCounter, dummyInterest);
                this.interestMap.put("PERI"+idCounter, dummyInterest2);
                this.interestMap.put("AIRC"+idCounter, dummyInterest3);
                this.interestMap.put("PATH"+idCounter, dummyInterest4);
                break;
            case "2":
                //Period
                period = new PeriodOfInterestType();
                timeInterval1 = new TimeIntervalPropertyType();
                timeInterval2 = new TimeIntervalPropertyType();
                interval1 = new TimeIntervalPropertyType.TimeInterval();
                interval2 = new TimeIntervalPropertyType.TimeInterval();
                timeInterval1.setTimeInterval(interval1);
                timeInterval2.setTimeInterval(interval2);
                interval1.setBeginPosition(null);
                interval1.setEndPosition(null);
                interval2.setBeginPosition(null);
                interval2.setEndPosition(null);
                timeBuffer = new TimeBufferPropertyType();
                tempBuffer = new TimeBufferPropertyType.TemporalBuffer();
                try {
                    tempBuffer.setBefore(DatatypeFactory.newInstance().newDuration(true,0,0,0,0,0,0));
                    tempBuffer.setAfter(DatatypeFactory.newInstance().newDuration(true,0,0,0,0,0,0));
                } catch (DatatypeConfigurationException e) {
                    e.printStackTrace();
                }
                timeBuffer.setTemporalBuffer(tempBuffer);
                period.setTimeBuffer(timeBuffer);
                period.setDetTime(timeInterval1);
                period.setOccTime(timeInterval2);
                dummyInterest = new InterestPropertyType();
                dummyInterest.setPeriodOfInterest(period);
                view.addPeriodInterest(idCounter, period);
                this.interestMap.put("PERI"+idCounter, dummyInterest);
                break;
            case "3":
                aircraft = new AircraftOfInterestType();
                aircraft.setAircraftTypeName("");
                aircraft.setIlsCat(new CodeSignalPerformanceILSType());
                aircraft.getIlsCat().setValue("");
                dummyInterest = new InterestPropertyType();
                dummyInterest.setAircraftOfInterest(aircraft);
                view.addAircraftInterest(idCounter, aircraft);
                this.interestMap.put("AIRC"+idCounter, dummyInterest);
                break;
            case "4":
                flightPath = new FlightPathInterestType();
                dummyInterest = new InterestPropertyType();
                dummyInterest.setFlightPathInterest(flightPath);
                view.addFlightPathInterest(idCounter, flightPath);
                this.interestMap.put("PATH"+idCounter, dummyInterest);
                break;
            case "5":
                AttributeOfInterestType attribute = new AttributeOfInterestType();
                dummyInterest = new InterestPropertyType();
                dummyInterest.setAttributeOfInterest(attribute);
                view.addAttributeOfInterest(idCounter, attribute);
                this.interestMap.put("ATTR"+idCounter, dummyInterest);
                break;
            case "6":
                BinaryIntersectionInterestType binaryInter = new BinaryIntersectionInterestType();
                dummyInterest = new InterestPropertyType();
                dummyInterest.setBinaryIntersectionInterest(binaryInter);
                view.addBinaryIntersect(idCounter, binaryInter);
                this.interestMap.put("BINI"+idCounter, dummyInterest);
                break;
            case "7":
                BinaryUnionInterestType binaryUnion = new BinaryUnionInterestType();
                dummyInterest = new InterestPropertyType();
                dummyInterest.setBinaryUnionInterest(binaryUnion);
                view.addBinaryUnion(idCounter, binaryUnion);
                this.interestMap.put("BINU"+idCounter, dummyInterest);
                break;
            case "8":
                IntersectionInterestType groupIntersect = new IntersectionInterestType();
                dummyInterest = new InterestPropertyType();
                dummyInterest.setIntersectionInterest(groupIntersect);
                view.addGroupIntersect(idCounter, groupIntersect);
                this.interestMap.put("GROI"+idCounter, dummyInterest);
                break;
            case "9":
                UnionInterestType groupUnion = new UnionInterestType();
                dummyInterest = new InterestPropertyType();
                dummyInterest.setUnionInterest(groupUnion);
                view.addGroupUnion(idCounter, groupUnion);
                this.interestMap.put("GROU"+idCounter, dummyInterest);
                break;
            case "10":
              /*  ComplementInterestType complement = new ComplementInterestType();
                dummyInterest = new InterestPropertyType();
                dummyInterest.setComplementInterest(complement);
                view.addComplexInterest(idCounter);
                this.interestMap.put("COMP"+idCounter, dummyInterest);
                break;
                */
            default:
                new Notification("WRONG INTEREST TYPE","CALLED INTEREST CAN NOT BE DEFINED").show(Page.getCurrent());
        }
    }

    //Mapping of the AreaInterests combobox to their defining classes
    public void addAreaInterest(String selectedArea, String id) {
        FlightPathInterestForm fpiForm = view.getFlightPathInterestForm(id);
        FlightPathInterestType flightPath = interestMap.get(id).getFlightPathInterest();
        AreaInterestFactory areaFactory = new AreaInterestFactory();
        AreaOfInterestPropertyType area = new AreaOfInterestPropertyType();
        switch(selectedArea) {
            case "1":
                area.setDepartureAerodromeArea(areaFactory.newDepartureAerodromeAreaType());
                 break;
            case "2":
                area.setDestinationAerodromeArea(areaFactory.newDestinationAerodromeAreaType());
                break;
            case "3":
                area.setDepartureAlternateAerodromeArea(areaFactory.newDepartureAlternateAerodromeAreaType());
                break;
            case "4":
                area.setEnRouteAlternateAerodromeArea(areaFactory.newEnRouteAlternateAerodromeAreaType());
                break;
            case "5":
                area.setDestinationAlternateAerodromeArea(areaFactory.newDestinationAlternateAerodromeAreaType());
                break;
            case "6":
                area.setFirArea(areaFactory.newFirArea());
                break;
            case "7":
                area.setShapeArea(areaFactory.newShapeArea());
                break;
            case "8":
                area.setConceptDefinedArea(areaFactory.newConceptDefinedAreaType());
                break;
            case "9":
                area.setAtsArea(areaFactory.newAtsAreaType());
                break;
            case "10":
                area.setDepartureArea(areaFactory.newDepartureArea());
                break;
            case "11":
                area.setDestinationApproachArea(areaFactory.newDestinationApproachArea());
                break;
            case "12":
                area.setDepartureAlternateApproachArea(areaFactory.newDepartureAlternateApproachArea());
                break;
            case "13":
                area.setEnRouteAlternateApproachArea(areaFactory.newEnRouteAlternateApproachArea());
                break;
            case "14":
                area.setDestinationAlternateApproachArea(areaFactory.newDestinationAlternateApproachArea());
                break;
            default:
                new Notification("WRONG INTEREST TYPE", "CALLED INTEREST CAN NOT BE DEFINED").show(Page.getCurrent());
                break;
        }
        flightPath.getHasMember().add(area);
        fpiForm.areaForm(area);
    }

    public HashMap<String, InterestPropertyType> getInterestMap() {
        return interestMap;
    }

    public ArrayList<String> getChosenComplexInterestStrings() {
        return chosenComplexInterests;
    }

    public void addComplexInterestLeftChild(String id, String panelId) {
        InterestPropertyType child = interestMap.get(id);
        switch (panelId.substring(0,4)){
            case "BINI":
                BinaryIntersectionInterestType bini = interestMap.get(panelId).getBinaryIntersectionInterest();
                bini.setLeftHand(child);
                break;
            case "BINU":
                BinaryUnionInterestType binu = interestMap.get(panelId).getBinaryUnionInterest();
                binu.setLeftHand(child);
                break;
        }
    }

    public void addComplexInterestRightChild(String id, String panelId){
        InterestPropertyType child = interestMap.get(id);
        switch (panelId.substring(0,4)){
            case "BINI":
                BinaryIntersectionInterestType bini = interestMap.get(panelId).getBinaryIntersectionInterest();
                bini.setRightHand(child);
                break;
            case "BINU":
                BinaryUnionInterestType binu = interestMap.get(panelId).getBinaryUnionInterest();
                binu.setRightHand(child);
                break;
        }
    }

    public void addComplexInterestGroupChild(String id, String panelId){
        InterestPropertyType child = interestMap.get(id);
        switch (panelId.substring(0,4)){
            case "GROI":
                IntersectionInterestType groi = interestMap.get(panelId).getIntersectionInterest();
                groi.getHasMember().add(child);
                break;
            case "GROU":
                UnionInterestType binu = interestMap.get(panelId).getUnionInterest();
                binu.getHasMember().add(child);
                break;
        }
    }

    public void removeComplexInterestLeftChild(String parentId) {
        switch (parentId.substring(0,4)){
            case"BINI":
                BinaryIntersectionInterestType bini = interestMap.get(parentId).getBinaryIntersectionInterest();
                bini.setLeftHand(null);
                break;
            case "BINU":
                BinaryUnionInterestType binu = interestMap.get(parentId).getBinaryUnionInterest();
                binu.setLeftHand(null);
                break;
        }
    }
    public void removeComplexInterestRightChild(String parentId) {
        switch (parentId.substring(0,4)){
            case"BINI":
                BinaryIntersectionInterestType bini = interestMap.get(parentId).getBinaryIntersectionInterest();
                bini.setRightHand(null);
                break;
            case "BINU":
                BinaryUnionInterestType binu = interestMap.get(parentId).getBinaryUnionInterest();
                binu.setRightHand(null);
                break;
        }
    }
    public void removeComplexInterestGroupChild(String parentId, String id) {
        InterestPropertyType child = getInterestMap().get(id);
        switch (parentId.substring(0,4)){
            case"GROI":
                IntersectionInterestType groi = interestMap.get(parentId).getIntersectionInterest();
                groi.getHasMember().remove(child);
                break;
            case "BINU":
                UnionInterestType grou = interest.getUnionInterest();
                grou.getHasMember().remove(child);
                break;
        }
    }

    public HashMap<String, ElevatedPointType> getElevatedPointMap() {
        return elevatedPointMap;
    }

    public void addInterestSpecificData(String id, ElevatedPointType elevatedPoint){
        //If it's the first InterestSpecificData, add the necessary instances to avoid a null Pointer Exception
        if(interestSpec.getInterestSpecificData().size() == 0){
            interestSpec.getInterestSpecificData().add(new InterestSpecificDataPropertyType());
            interestSpec.getInterestSpecificData().get(0).setPointData(new InterestSpecificDataType());
        }
        InterestSpecificDataType interestSpecificDataType = interestSpec.getInterestSpecificData().get(0).getPointData();
        //Remove old Point from Point List and Interest Spec
        if(elevatedPointMap.containsKey(id)) {
            ElevatedPointPropertyType removePointProp = new ElevatedPointPropertyType();
            ElevatedPointType oldPoint = elevatedPointMap.remove(id);
            for(ElevatedPointPropertyType pointProp : interestSpecificDataType.getHasMember()){
                if(pointProp.getElevatedPoint().equals(oldPoint)){
                    removePointProp = pointProp;
                }
            }
            interestSpecificDataType.getHasMember().remove(removePointProp);
        }

        //Add new Point to point to List
        elevatedPointMap.put(id, elevatedPoint);

        //Adding new Point to Interest Specification!
        ElevatedPointPropertyType elevatedPointPropertyType = new ElevatedPointPropertyType();
        elevatedPointPropertyType.setElevatedPoint(elevatedPoint);

        interestSpecificDataType.getHasMember().add(elevatedPointPropertyType);
    }

    public void refreshInterestSpecData(String pathId) {
        FlightPathInterestType flightpath = interestMap.get(pathId).getFlightPathInterest();
        GeodesicStringType positions = null;
        List<ElevatedPointPropertyType> posList = new ArrayList<>();
        if (posListMap != null && posListMap.containsKey(pathId)) {
            posListMap.remove(pathId);
        }
        for(AreaOfInterestPropertyType area : flightpath.getHasMember()) {
            if(area.getAtsArea() != null){
                positions = (GeodesicStringType) area.getAtsArea().getSegmentShape().
                        getSegmentShapeArea().getShapeCurve().getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            }else if(area.getDepartureArea() != null){
                positions = (GeodesicStringType) area.getDepartureArea().getSegmentShape().
                        getSegmentShapeArea().getShapeCurve().getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            }else if(area.getDepartureAlternateApproachArea() != null){
                positions = (GeodesicStringType) area.getDepartureAlternateApproachArea().getSegmentShape().
                        getSegmentShapeArea().getShapeCurve().getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            }else if(area.getDestinationAlternateApproachArea() != null){
                positions = (GeodesicStringType) area.getDestinationAlternateApproachArea().getSegmentShape().
                        getSegmentShapeArea().getShapeCurve().getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            }else if(area.getEnRouteAlternateApproachArea() != null){
                positions = (GeodesicStringType) area.getEnRouteAlternateApproachArea().getSegmentShape().
                        getSegmentShapeArea().getShapeCurve().getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            }else if(area.getDestinationApproachArea() != null){
                positions = (GeodesicStringType) area.getDestinationApproachArea().getSegmentShape().
                        getSegmentShapeArea().getShapeCurve().getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            }
            if(positions != null) {
                ElevatedPointPropertyType elevatedPointPropertyType = new ElevatedPointPropertyType();
                ElevatedPointType elevatedPointType = new ElevatedPointType();
                DirectPositionType directPositionType1 = new DirectPositionType(), directPositionType2 = new DirectPositionType();
                directPositionType1.getValue().add(0, positions.getPosList().getValue().get(0));
                directPositionType1.getValue().add(1, positions.getPosList().getValue().get(1));
                directPositionType2.getValue().add(0, positions.getPosList().getValue().get(2));
                directPositionType2.getValue().add(1, positions.getPosList().getValue().get(3));
                elevatedPointType.setPos(directPositionType1);
                elevatedPointPropertyType.setElevatedPoint(elevatedPointType);
                posList.add(elevatedPointPropertyType);
                elevatedPointType = new ElevatedPointType();
                elevatedPointPropertyType = new ElevatedPointPropertyType();
                elevatedPointType.setPos(directPositionType2);
                elevatedPointPropertyType.setElevatedPoint(elevatedPointType);
                posList.add(elevatedPointPropertyType);
            }
        }
        if(posListMap==null){
            posListMap = new HashMap<>();
        }
        posListMap.put(pathId, posList);
    }

    public HashMap<String, List<ElevatedPointPropertyType>> getPosListMap() {
        return posListMap;
    }
}
