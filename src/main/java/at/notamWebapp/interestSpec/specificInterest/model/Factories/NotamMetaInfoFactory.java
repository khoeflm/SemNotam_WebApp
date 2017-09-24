package at.notamWebapp.interestSpec.specificInterest.model.Factories;

import at.notamWebapp.interestSpec.generalInterest.model.GeneralInterestModel;
import com.frequentis.semnotam.schema._1.*;

import java.math.BigInteger;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 24.07.2017.
 */
public class NotamMetaInfoFactory {
    public static NotamSetMetaInformationPropertyType createDefaultMetaInfo() {
        NotamSetMetaInformationPropertyType notamSetMetaInformationPropertyType = new NotamSetMetaInformationPropertyType();
        MetaInfoType metaInfoType = new MetaInfoType();
        RelevanceOptionPropertyType relevanceOptionPropertyType = new RelevanceOptionPropertyType();
        RelevanceOptionType relevanceOptionType = new RelevanceOptionType();
        notamSetMetaInformationPropertyType.setNotamSetMetaInformation(metaInfoType);
        metaInfoType.setAnnotation(setAnnotation());
        metaInfoType.setFilter(setFilter());
        metaInfoType.setRuleOption(relevanceOptionPropertyType);
        relevanceOptionPropertyType.setRelevanceRuleOption(relevanceOptionType);
        relevanceOptionType.setSpatialRelevanceRules(CodeSpatialRelevanceType.SHAPE);
        relevanceOptionType.setTemporalRelevanceRules(CodeTemporalRelevanceType.VALID_TIME);
        return notamSetMetaInformationPropertyType;
    }

    public static NotamSetMetaInformationPropertyType createMetaInfo(GeneralInterestModel generalInterest) {
        NotamSetMetaInformationPropertyType notamSetMetaInformationPropertyType = new NotamSetMetaInformationPropertyType();
        MetaInfoType metaInfoType = new MetaInfoType();
        RelevanceOptionPropertyType relevanceOption = new RelevanceOptionPropertyType();
        relevanceOption.setRelevanceRuleOption(generalInterest.getRelevanceOption());
        metaInfoType.setRuleOption(relevanceOption);
        metaInfoType.setDataType(generalInterest.getDataType());
        metaInfoType.setDataFormat(generalInterest.getDataModel());
        notamSetMetaInformationPropertyType.setNotamSetMetaInformation(metaInfoType);
        return notamSetMetaInformationPropertyType;
    }

    private static AnnotationInformationPropertyType setAnnotation() {
        AnnotationInformationPropertyType annotationInformationPropertyType = new AnnotationInformationPropertyType();
        AnnotationInformationType annotationInformationType = new AnnotationInformationType();
        annotationInformationPropertyType.setAnnotationInformation(annotationInformationType);

        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGrouping> --> <AnnotationGrouping> --> <groupingName>

        //Importance
        AnnotationPropertyType annotationPropertyType = new AnnotationPropertyType();
        AnnotationType annotationType = new AnnotationType();
        AnnotationGroupingPropertyType annotationGroupingPropertyType = new AnnotationGroupingPropertyType();
        GroupingType groupingType = new GroupingType();

        annotationInformationType.getHasAnnotation().add(annotationPropertyType);
        annotationPropertyType.setAnnotation(annotationType);
        annotationType.setHasGrouping(annotationGroupingPropertyType);
        annotationGroupingPropertyType.setAnnotationGrouping(groupingType);
        groupingType.setGroupingName("Importance");

        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGroup> --> <AnnotationGroup> --> <groupName> --> <groupOrder>

        //Importance Groups

        AnnotationGroupPropertyType annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        GroupType groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Unknown Importance");
        groupType.setGroupOrder(BigInteger.ONE);

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Flight Critical");
        groupType.setGroupOrder(BigInteger.valueOf(2));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Special Consideration");
        groupType.setGroupOrder(BigInteger.valueOf(3));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Operational Restriction");
        groupType.setGroupOrder(BigInteger.valueOf(4));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Potential Hazard");
        groupType.setGroupOrder(BigInteger.valueOf(5));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Additional Information");
        groupType.setGroupOrder(BigInteger.valueOf(6));


        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGrouping> --> <AnnotationGrouping> --> <groupingName>

        //Flight Phase
        annotationPropertyType = new AnnotationPropertyType();
        annotationType = new AnnotationType();
        annotationGroupingPropertyType = new AnnotationGroupingPropertyType();
        groupingType = new GroupingType();

        annotationInformationType.getHasAnnotation().add(annotationPropertyType);
        annotationPropertyType.setAnnotation(annotationType);
        annotationType.setHasGrouping(annotationGroupingPropertyType);
        annotationGroupingPropertyType.setAnnotationGrouping(groupingType);
        groupingType.setGroupingName("Flight Phase");

        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGroup> --> <AnnotationGroup> --> <groupName> --> <groupOrder>

        //Importance Groups

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("preFlight");
        groupType.setGroupOrder(BigInteger.ONE);

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("departure");
        groupType.setGroupOrder(BigInteger.valueOf(2));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("enRoute");
        groupType.setGroupOrder(BigInteger.valueOf(3));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("arrival");
        groupType.setGroupOrder(BigInteger.valueOf(4));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("diversion");
        groupType.setGroupOrder(BigInteger.valueOf(5));

        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGrouping> --> <AnnotationGrouping> --> <groupingName>

        //Location
        annotationPropertyType = new AnnotationPropertyType();
        annotationType = new AnnotationType();
        annotationGroupingPropertyType = new AnnotationGroupingPropertyType();
        groupingType = new GroupingType();

        annotationInformationType.getHasAnnotation().add(annotationPropertyType);
        annotationPropertyType.setAnnotation(annotationType);
        annotationType.setHasGrouping(annotationGroupingPropertyType);
        annotationGroupingPropertyType.setAnnotationGrouping(groupingType);
        groupingType.setGroupingName("Location");

        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGroup> --> <AnnotationGroup> --> <groupName> --> <groupOrder>

        //Location Groups

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Aerodrome Area");
        groupType.setGroupOrder(BigInteger.ONE);

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Transition Area");
        groupType.setGroupOrder(BigInteger.valueOf(2));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Aerodrome Transition");
        groupType.setGroupOrder(BigInteger.valueOf(3));

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Segment Area");
        groupType.setGroupOrder(BigInteger.valueOf(4));


        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGrouping> --> <AnnotationGrouping> --> <groupingName>

        //Briefing Package
        annotationPropertyType = new AnnotationPropertyType();
        annotationType = new AnnotationType();
        annotationGroupingPropertyType = new AnnotationGroupingPropertyType();
        groupingType = new GroupingType();

        annotationInformationType.getHasAnnotation().add(annotationPropertyType);
        annotationPropertyType.setAnnotation(annotationType);
        annotationType.setHasGrouping(annotationGroupingPropertyType);
        annotationGroupingPropertyType.setAnnotationGrouping(groupingType);
        groupingType.setGroupingName("Briefing Package");

        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGroup> --> <AnnotationGroup> --> <groupName> --> <groupOrder>

        //Importance Groups

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Essential");
        groupType.setGroupOrder(BigInteger.ONE);

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("Supplementary");
        groupType.setGroupOrder(BigInteger.valueOf(2));

        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGrouping> --> <AnnotationGrouping> --> <groupingName>

        //Event Scenarios
        annotationPropertyType = new AnnotationPropertyType();
        annotationType = new AnnotationType();
        annotationGroupingPropertyType = new AnnotationGroupingPropertyType();
        groupingType = new GroupingType();

        annotationInformationType.getHasAnnotation().add(annotationPropertyType);
        annotationPropertyType.setAnnotation(annotationType);
        annotationType.setHasGrouping(annotationGroupingPropertyType);
        annotationGroupingPropertyType.setAnnotationGrouping(groupingType);
        groupingType.setGroupingName("Event Scenario");

        // <annotation> --> <AnnotationInformation> --> <hasAnnotation> --> <Annotation> -->
        // <hasGroup> --> <AnnotationGroup> --> <groupName> --> <groupOrder>

        //Events
        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("AerodromeBeaconStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("AerodromeClosure");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("AerodromeSeaplaneBaseClosure");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("AerodromeConstructionStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("AerodromeHelipadStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("AerodromeWorkInProgress");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("AerodromeWildlifeHazard");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("AerodromeWindIndicatorStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ServiceAircraftRescueAndFireFightingAvailability");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ServiceFrictionMeasuringDeviceStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ServiceFuelAvailability");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ApronClosure");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ApronConstructionStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ApronGroundMarkingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ApronGroundLightingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ApronWorkInProgress");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ApronFieldCondition");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ApronSurfaceDefects");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayClosure");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionClosure");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionFrictionMeasurements");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayBrakingAction");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayFieldCondition");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwaySurfaceDefects");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayLightsObscured");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionLightedSignStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayGroundLightingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionGroundLightingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayGroundMarkingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionGroundMarkingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionApproachLightingSystemStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionVisualApproachLightingSystems");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayPilotControlledLightingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayPilotControlledLightingFrequencyChange");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayConstructionStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayWorkInProgress");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayWildlifeHazard");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionRunwayVisualRangeStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayRunwayVisualRangeStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionDistanceAvailable");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayDirectionThresholdDisplacement");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwaySafetyAreaStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RunwayArrestingGearStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayClosure");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayConstructionStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayDesignatedNonMovementArea");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayGroundLightingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayLightedSignStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayWorkInProgress");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayGroundMarkingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayFieldCondition");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwayBrakingAction");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("TaxiwaySurfaceDefects");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ObstructionPermanentObstacleLightStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ObstructionTemporaryObstacleStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WaterLaneClosure");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("SkiStripClosure");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WaterLaneSkiStripWorkInProgress");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WaterLaneSkiStripWildlifeHazard");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WaterLaneSkiStripDistanceAvailable");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WaterLaneSkiStripThresholdDisplacement");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WaterLaneSkiStripGroundMarkingStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("SkiStripFieldCondition");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("NavaidIlsStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("NavaidNavaidStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("NavaidCollocatedIlsNdbStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WeatherAutomatedWeatherServicesStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WeatherAutomatedWeatherServicesPropertiesChange");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("WeatherMicroburstWindshearDetectionStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("CommunicationsOutletStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("CommunicationsOutletStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("CommunicationsVorVoiceOutletStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ServiceHIWASStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ServiceATISStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ServiceATISFrequencyChange");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("ServiceADSBServiceStatus");

        annotationGroupPropertyType = new AnnotationGroupPropertyType();
        annotationType.getHasGroup().add(annotationGroupPropertyType);
        groupType = new GroupType();
        annotationGroupPropertyType.setAnnotationGroup(groupType);
        groupType.setGroupName("RadarSystemStatus");

        return annotationInformationPropertyType;
    }

    private static FilterInformationPropertyType setFilter() {
        FilterInformationPropertyType filterInformationPropertyType = new FilterInformationPropertyType();
        FilterInformationType filterInformationType = new FilterInformationType();
        FilterPropertyType filterPropertyType = new FilterPropertyType();
        FilterType filterType = new FilterType();
        FilterGroupingPropertyType filterGroupingPropertyType = new FilterGroupingPropertyType();
        GroupingType groupingType = new GroupingType();
        FilterGroupPropertyType filterGroupPropertyType = new FilterGroupPropertyType();
        GroupType groupType = new GroupType();

        /* <filter>
                <FilterInformation>
                    <hasFilter>
                        <Filter>
                            <hasGrouping>
                                <FilterGrouping>
                                    <groupingName>Relevance</groupingName>
                                </FilterGrouping>
                            </hasGrouping>
                            <hasGroup>
                                <FilterGroup>
                                    <groupName>Relevant</groupName>
         ...
        */

        filterInformationPropertyType.setFilterInformation(filterInformationType);
        filterInformationType.getHasFilter().add(filterPropertyType);
        filterPropertyType.setFilter(filterType);
        filterType.setHasGrouping(filterGroupingPropertyType);
        filterGroupingPropertyType.setFilterGrouping(groupingType);
        groupingType.setGroupingName("Relevance");
        filterType.getHasGroup().add(filterGroupPropertyType);
        filterGroupPropertyType.setFilterGroup(groupType);
        groupType.setGroupName("Relevant");

        return filterInformationPropertyType;
    }

}
