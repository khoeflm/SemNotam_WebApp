
package com.frequentis.semnotam.schema._1;

import aero.aixm.CodeSignalPerformanceILSType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.frequentis.semnotam.schema._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InterestSpecification_QNAME = new QName("http://semnotam.frequentis.com/schema/1.0", "InterestSpecification");
    private final static QName _EvaluatedInterestSpecification_QNAME = new QName("http://semnotam.frequentis.com/schema/1.0", "EvaluatedInterestSpecification");
    private final static QName _LeafRestrictionTypeValueString_QNAME = new QName("http://semnotam.frequentis.com/schema/1.0", "value_string");
    private final static QName _LeafRestrictionTypeOperator_QNAME = new QName("http://semnotam.frequentis.com/schema/1.0", "operator");
    private final static QName _LeafRestrictionTypeValueDecimal_QNAME = new QName("http://semnotam.frequentis.com/schema/1.0", "value_decimal");
    private final static QName _LeafRestrictionTypeValueDateTime_QNAME = new QName("http://semnotam.frequentis.com/schema/1.0", "value_dateTime");
    private final static QName _AircraftOfInterestTypeAircraftTypeName_QNAME = new QName("http://semnotam.frequentis.com/schema/1.0", "aircraftTypeName");
    private final static QName _AircraftOfInterestTypeIlsCat_QNAME = new QName("http://semnotam.frequentis.com/schema/1.0", "ilsCat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.frequentis.semnotam.schema._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FirCollection }
     * 
     */
    public FirCollection createFirCollection() {
        return new FirCollection();
    }

    /**
     * Create an instance of {@link SegmentCollection }
     * 
     */
    public SegmentCollection createSegmentCollection() {
        return new SegmentCollection();
    }

    /**
     * Create an instance of {@link AerodromeCollection }
     * 
     */
    public AerodromeCollection createAerodromeCollection() {
        return new AerodromeCollection();
    }

    /**
     * Create an instance of {@link TimeIntervalPropertyType }
     * 
     */
    public TimeIntervalPropertyType createTimeIntervalPropertyType() {
        return new TimeIntervalPropertyType();
    }

    /**
     * Create an instance of {@link TimeBufferPropertyType }
     * 
     */
    public TimeBufferPropertyType createTimeBufferPropertyType() {
        return new TimeBufferPropertyType();
    }

    /**
     * Create an instance of {@link ExclusionPropertyType }
     * 
     */
    public ExclusionPropertyType createExclusionPropertyType() {
        return new ExclusionPropertyType();
    }

    /**
     * Create an instance of {@link InterestSpecificationType }
     * 
     */
    public InterestSpecificationType createInterestSpecificationType() {
        return new InterestSpecificationType();
    }

    /**
     * Create an instance of {@link FirCollection.HasMember }
     * 
     */
    public FirCollection.HasMember createFirCollectionHasMember() {
        return new FirCollection.HasMember();
    }

    /**
     * Create an instance of {@link SegmentCollection.HasMember }
     * 
     */
    public SegmentCollection.HasMember createSegmentCollectionHasMember() {
        return new SegmentCollection.HasMember();
    }

    /**
     * Create an instance of {@link InterestSpecificDataPropertyType }
     * 
     */
    public InterestSpecificDataPropertyType createInterestSpecificDataPropertyType() {
        return new InterestSpecificDataPropertyType();
    }

    /**
     * Create an instance of {@link AerodromeCollection.HasMember }
     * 
     */
    public AerodromeCollection.HasMember createAerodromeCollectionHasMember() {
        return new AerodromeCollection.HasMember();
    }

    /**
     * Create an instance of {@link InterestSpecResultType }
     * 
     */
    public InterestSpecResultType createInterestSpecResultType() {
        return new InterestSpecResultType();
    }

    /**
     * Create an instance of {@link NotamSetMetaInformationPropertyType }
     * 
     */
    public NotamSetMetaInformationPropertyType createNotamSetMetaInformationPropertyType() {
        return new NotamSetMetaInformationPropertyType();
    }

    /**
     * Create an instance of {@link MetaInfoType }
     * 
     */
    public MetaInfoType createMetaInfoType() {
        return new MetaInfoType();
    }

    /**
     * Create an instance of {@link EnrichmentInformationPropertyType }
     * 
     */
    public EnrichmentInformationPropertyType createEnrichmentInformationPropertyType() {
        return new EnrichmentInformationPropertyType();
    }

    /**
     * Create an instance of {@link EnrichmentInformationType }
     * 
     */
    public EnrichmentInformationType createEnrichmentInformationType() {
        return new EnrichmentInformationType();
    }

    /**
     * Create an instance of {@link EnrichmentPropertyType }
     * 
     */
    public EnrichmentPropertyType createEnrichmentPropertyType() {
        return new EnrichmentPropertyType();
    }

    /**
     * Create an instance of {@link EnrichmentType }
     * 
     */
    public EnrichmentType createEnrichmentType() {
        return new EnrichmentType();
    }

    /**
     * Create an instance of {@link AnnotationInformationPropertyType }
     * 
     */
    public AnnotationInformationPropertyType createAnnotationInformationPropertyType() {
        return new AnnotationInformationPropertyType();
    }

    /**
     * Create an instance of {@link AnnotationInformationType }
     * 
     */
    public AnnotationInformationType createAnnotationInformationType() {
        return new AnnotationInformationType();
    }

    /**
     * Create an instance of {@link AnnotationPropertyType }
     * 
     */
    public AnnotationPropertyType createAnnotationPropertyType() {
        return new AnnotationPropertyType();
    }

    /**
     * Create an instance of {@link AnnotationType }
     * 
     */
    public AnnotationType createAnnotationType() {
        return new AnnotationType();
    }

    /**
     * Create an instance of {@link AnnotationGroupingPropertyType }
     * 
     */
    public AnnotationGroupingPropertyType createAnnotationGroupingPropertyType() {
        return new AnnotationGroupingPropertyType();
    }

    /**
     * Create an instance of {@link AnnotationGroupPropertyType }
     * 
     */
    public AnnotationGroupPropertyType createAnnotationGroupPropertyType() {
        return new AnnotationGroupPropertyType();
    }

    /**
     * Create an instance of {@link GroupingType }
     * 
     */
    public GroupingType createGroupingType() {
        return new GroupingType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link FilterInformationPropertyType }
     * 
     */
    public FilterInformationPropertyType createFilterInformationPropertyType() {
        return new FilterInformationPropertyType();
    }

    /**
     * Create an instance of {@link FilterInformationType }
     * 
     */
    public FilterInformationType createFilterInformationType() {
        return new FilterInformationType();
    }

    /**
     * Create an instance of {@link FilterPropertyType }
     * 
     */
    public FilterPropertyType createFilterPropertyType() {
        return new FilterPropertyType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link FilterGroupingPropertyType }
     * 
     */
    public FilterGroupingPropertyType createFilterGroupingPropertyType() {
        return new FilterGroupingPropertyType();
    }

    /**
     * Create an instance of {@link FilterGroupPropertyType }
     * 
     */
    public FilterGroupPropertyType createFilterGroupPropertyType() {
        return new FilterGroupPropertyType();
    }

    /**
     * Create an instance of {@link GroupingArrangementPropertyType }
     * 
     */
    public GroupingArrangementPropertyType createGroupingArrangementPropertyType() {
        return new GroupingArrangementPropertyType();
    }

    /**
     * Create an instance of {@link GroupingArrangementType }
     * 
     */
    public GroupingArrangementType createGroupingArrangementType() {
        return new GroupingArrangementType();
    }

    /**
     * Create an instance of {@link GroupingArrangementListPropertyType }
     * 
     */
    public GroupingArrangementListPropertyType createGroupingArrangementListPropertyType() {
        return new GroupingArrangementListPropertyType();
    }

    /**
     * Create an instance of {@link GroupingArrangementListType }
     * 
     */
    public GroupingArrangementListType createGroupingArrangementListType() {
        return new GroupingArrangementListType();
    }

    /**
     * Create an instance of {@link ArrangementGroupingPropertyType }
     * 
     */
    public ArrangementGroupingPropertyType createArrangementGroupingPropertyType() {
        return new ArrangementGroupingPropertyType();
    }

    /**
     * Create an instance of {@link RankingStrategyPropertyType }
     * 
     */
    public RankingStrategyPropertyType createRankingStrategyPropertyType() {
        return new RankingStrategyPropertyType();
    }

    /**
     * Create an instance of {@link TemporalRankingStrategyType }
     * 
     */
    public TemporalRankingStrategyType createTemporalRankingStrategyType() {
        return new TemporalRankingStrategyType();
    }

    /**
     * Create an instance of {@link SpatialRankingStrategyType }
     * 
     */
    public SpatialRankingStrategyType createSpatialRankingStrategyType() {
        return new SpatialRankingStrategyType();
    }

    /**
     * Create an instance of {@link RelevanceOptionPropertyType }
     * 
     */
    public RelevanceOptionPropertyType createRelevanceOptionPropertyType() {
        return new RelevanceOptionPropertyType();
    }

    /**
     * Create an instance of {@link RelevanceOptionType }
     * 
     */
    public RelevanceOptionType createRelevanceOptionType() {
        return new RelevanceOptionType();
    }

    /**
     * Create an instance of {@link InterestSpecificDataType }
     * 
     */
    public InterestSpecificDataType createInterestSpecificDataType() {
        return new InterestSpecificDataType();
    }

    /**
     * Create an instance of {@link InterestPropertyType }
     * 
     */
    public InterestPropertyType createInterestPropertyType() {
        return new InterestPropertyType();
    }

    /**
     * Create an instance of {@link SimpleInterestPropertyType }
     * 
     */
    public SimpleInterestPropertyType createSimpleInterestPropertyType() {
        return new SimpleInterestPropertyType();
    }

    /**
     * Create an instance of {@link ComplexInterestType }
     * 
     */
    public ComplexInterestType createComplexInterestType() {
        return new ComplexInterestType();
    }

    /**
     * Create an instance of {@link BinaryInterestType }
     * 
     */
    public BinaryInterestType createBinaryInterestType() {
        return new BinaryInterestType();
    }

    /**
     * Create an instance of {@link BinaryIntersectionInterestType }
     * 
     */
    public BinaryIntersectionInterestType createBinaryIntersectionInterestType() {
        return new BinaryIntersectionInterestType();
    }

    /**
     * Create an instance of {@link BinaryUnionInterestType }
     * 
     */
    public BinaryUnionInterestType createBinaryUnionInterestType() {
        return new BinaryUnionInterestType();
    }

    /**
     * Create an instance of {@link ComplementInterestType }
     * 
     */
    public ComplementInterestType createComplementInterestType() {
        return new ComplementInterestType();
    }

    /**
     * Create an instance of {@link GroupInterestType }
     * 
     */
    public GroupInterestType createGroupInterestType() {
        return new GroupInterestType();
    }

    /**
     * Create an instance of {@link IntersectionInterestType }
     * 
     */
    public IntersectionInterestType createIntersectionInterestType() {
        return new IntersectionInterestType();
    }

    /**
     * Create an instance of {@link UnionInterestType }
     * 
     */
    public UnionInterestType createUnionInterestType() {
        return new UnionInterestType();
    }

    /**
     * Create an instance of {@link FlightPlanInterestType }
     * 
     */
    public FlightPlanInterestType createFlightPlanInterestType() {
        return new FlightPlanInterestType();
    }

    /**
     * Create an instance of {@link FlightPathInterestType }
     * 
     */
    public FlightPathInterestType createFlightPathInterestType() {
        return new FlightPathInterestType();
    }

    /**
     * Create an instance of {@link FlightPathInterestPropertyType }
     * 
     */
    public FlightPathInterestPropertyType createFlightPathInterestPropertyType() {
        return new FlightPathInterestPropertyType();
    }

    /**
     * Create an instance of {@link SimpleInterestType }
     * 
     */
    public SimpleInterestType createSimpleInterestType() {
        return new SimpleInterestType();
    }

    /**
     * Create an instance of {@link UndefinedInterestType }
     * 
     */
    public UndefinedInterestType createUndefinedInterestType() {
        return new UndefinedInterestType();
    }

    /**
     * Create an instance of {@link PeriodOfInterestPropertyType }
     * 
     */
    public PeriodOfInterestPropertyType createPeriodOfInterestPropertyType() {
        return new PeriodOfInterestPropertyType();
    }

    /**
     * Create an instance of {@link PeriodOfInterestType }
     * 
     */
    public PeriodOfInterestType createPeriodOfInterestType() {
        return new PeriodOfInterestType();
    }

    /**
     * Create an instance of {@link AttributeOfInterestType }
     * 
     */
    public AttributeOfInterestType createAttributeOfInterestType() {
        return new AttributeOfInterestType();
    }

    /**
     * Create an instance of {@link AircraftOfInterestPropertyType }
     * 
     */
    public AircraftOfInterestPropertyType createAircraftOfInterestPropertyType() {
        return new AircraftOfInterestPropertyType();
    }

    /**
     * Create an instance of {@link AircraftOfInterestType }
     * 
     */
    public AircraftOfInterestType createAircraftOfInterestType() {
        return new AircraftOfInterestType();
    }

    /**
     * Create an instance of {@link AreaOfInterestType }
     * 
     */
    public AreaOfInterestType createAreaOfInterestType() {
        return new AreaOfInterestType();
    }

    /**
     * Create an instance of {@link UnscopedAreaType }
     * 
     */
    public UnscopedAreaType createUnscopedAreaType() {
        return new UnscopedAreaType();
    }

    /**
     * Create an instance of {@link ShapeAreaType }
     * 
     */
    public ShapeAreaType createShapeAreaType() {
        return new ShapeAreaType();
    }

    /**
     * Create an instance of {@link FirAreaType }
     * 
     */
    public FirAreaType createFirAreaType() {
        return new FirAreaType();
    }

    /**
     * Create an instance of {@link SegmentAreaType }
     * 
     */
    public SegmentAreaType createSegmentAreaType() {
        return new SegmentAreaType();
    }

    /**
     * Create an instance of {@link SegmentShapePropertyType }
     * 
     */
    public SegmentShapePropertyType createSegmentShapePropertyType() {
        return new SegmentShapePropertyType();
    }

    /**
     * Create an instance of {@link SegmentShapeAreaType }
     * 
     */
    public SegmentShapeAreaType createSegmentShapeAreaType() {
        return new SegmentShapeAreaType();
    }

    /**
     * Create an instance of {@link ElevatedPointReferencePropertyType }
     * 
     */
    public ElevatedPointReferencePropertyType createElevatedPointReferencePropertyType() {
        return new ElevatedPointReferencePropertyType();
    }

    /**
     * Create an instance of {@link AtsAreaType }
     * 
     */
    public AtsAreaType createAtsAreaType() {
        return new AtsAreaType();
    }

    /**
     * Create an instance of {@link TransitionAreaType }
     * 
     */
    public TransitionAreaType createTransitionAreaType() {
        return new TransitionAreaType();
    }

    /**
     * Create an instance of {@link DepartureAreaType }
     * 
     */
    public DepartureAreaType createDepartureAreaType() {
        return new DepartureAreaType();
    }

    /**
     * Create an instance of {@link ApproachAreaType }
     * 
     */
    public ApproachAreaType createApproachAreaType() {
        return new ApproachAreaType();
    }

    /**
     * Create an instance of {@link DestinationApproachAreaType }
     * 
     */
    public DestinationApproachAreaType createDestinationApproachAreaType() {
        return new DestinationApproachAreaType();
    }

    /**
     * Create an instance of {@link AlternateApproachAreaType }
     * 
     */
    public AlternateApproachAreaType createAlternateApproachAreaType() {
        return new AlternateApproachAreaType();
    }

    /**
     * Create an instance of {@link DestinationAlternateApproachAreaType }
     * 
     */
    public DestinationAlternateApproachAreaType createDestinationAlternateApproachAreaType() {
        return new DestinationAlternateApproachAreaType();
    }

    /**
     * Create an instance of {@link EnRouteAlternateApproachAreaType }
     * 
     */
    public EnRouteAlternateApproachAreaType createEnRouteAlternateApproachAreaType() {
        return new EnRouteAlternateApproachAreaType();
    }

    /**
     * Create an instance of {@link DepartureAlternateApproachAreaType }
     * 
     */
    public DepartureAlternateApproachAreaType createDepartureAlternateApproachAreaType() {
        return new DepartureAlternateApproachAreaType();
    }

    /**
     * Create an instance of {@link ScopedAreaInterestType }
     * 
     */
    public ScopedAreaInterestType createScopedAreaInterestType() {
        return new ScopedAreaInterestType();
    }

    /**
     * Create an instance of {@link AreaOfInterestPropertyType }
     * 
     */
    public AreaOfInterestPropertyType createAreaOfInterestPropertyType() {
        return new AreaOfInterestPropertyType();
    }

    /**
     * Create an instance of {@link AerodromeAreaType }
     * 
     */
    public AerodromeAreaType createAerodromeAreaType() {
        return new AerodromeAreaType();
    }

    /**
     * Create an instance of {@link DepartureAerodromeAreaType }
     * 
     */
    public DepartureAerodromeAreaType createDepartureAerodromeAreaType() {
        return new DepartureAerodromeAreaType();
    }

    /**
     * Create an instance of {@link DestinationAerodromeAreaType }
     * 
     */
    public DestinationAerodromeAreaType createDestinationAerodromeAreaType() {
        return new DestinationAerodromeAreaType();
    }

    /**
     * Create an instance of {@link AlternateAerodromeAreaType }
     * 
     */
    public AlternateAerodromeAreaType createAlternateAerodromeAreaType() {
        return new AlternateAerodromeAreaType();
    }

    /**
     * Create an instance of {@link DepartureAlternateAerodromeAreaType }
     * 
     */
    public DepartureAlternateAerodromeAreaType createDepartureAlternateAerodromeAreaType() {
        return new DepartureAlternateAerodromeAreaType();
    }

    /**
     * Create an instance of {@link DestinationAlternateAerodromeAreaType }
     * 
     */
    public DestinationAlternateAerodromeAreaType createDestinationAlternateAerodromeAreaType() {
        return new DestinationAlternateAerodromeAreaType();
    }

    /**
     * Create an instance of {@link EnRouteAlternateAerodromeAreaType }
     * 
     */
    public EnRouteAlternateAerodromeAreaType createEnRouteAlternateAerodromeAreaType() {
        return new EnRouteAlternateAerodromeAreaType();
    }

    /**
     * Create an instance of {@link ConceptDefinedAreaType }
     * 
     */
    public ConceptDefinedAreaType createConceptDefinedAreaType() {
        return new ConceptDefinedAreaType();
    }

    /**
     * Create an instance of {@link RestrictionPropertyType }
     * 
     */
    public RestrictionPropertyType createRestrictionPropertyType() {
        return new RestrictionPropertyType();
    }

    /**
     * Create an instance of {@link NestedRestrictionType }
     * 
     */
    public NestedRestrictionType createNestedRestrictionType() {
        return new NestedRestrictionType();
    }

    /**
     * Create an instance of {@link LeafRestrictionType }
     * 
     */
    public LeafRestrictionType createLeafRestrictionType() {
        return new LeafRestrictionType();
    }

    /**
     * Create an instance of {@link QualifiedRestrictionType }
     * 
     */
    public QualifiedRestrictionType createQualifiedRestrictionType() {
        return new QualifiedRestrictionType();
    }

    /**
     * Create an instance of {@link UnqualifiedRestrictionType }
     * 
     */
    public UnqualifiedRestrictionType createUnqualifiedRestrictionType() {
        return new UnqualifiedRestrictionType();
    }

    /**
     * Create an instance of {@link SpatialBufferPropertyType }
     * 
     */
    public SpatialBufferPropertyType createSpatialBufferPropertyType() {
        return new SpatialBufferPropertyType();
    }

    /**
     * Create an instance of {@link SpatialBufferType }
     * 
     */
    public SpatialBufferType createSpatialBufferType() {
        return new SpatialBufferType();
    }

    /**
     * Create an instance of {@link FirType }
     * 
     */
    public FirType createFirType() {
        return new FirType();
    }

    /**
     * Create an instance of {@link SegmentType }
     * 
     */
    public SegmentType createSegmentType() {
        return new SegmentType();
    }

    /**
     * Create an instance of {@link AtsSegmentType }
     * 
     */
    public AtsSegmentType createAtsSegmentType() {
        return new AtsSegmentType();
    }

    /**
     * Create an instance of {@link TransitionSegmentType }
     * 
     */
    public TransitionSegmentType createTransitionSegmentType() {
        return new TransitionSegmentType();
    }

    /**
     * Create an instance of {@link AerodromeType }
     * 
     */
    public AerodromeType createAerodromeType() {
        return new AerodromeType();
    }

    /**
     * Create an instance of {@link ResultNotamPropertyType }
     * 
     */
    public ResultNotamPropertyType createResultNotamPropertyType() {
        return new ResultNotamPropertyType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link AIXMBasicMessagePropertyType }
     * 
     */
    public AIXMBasicMessagePropertyType createAIXMBasicMessagePropertyType() {
        return new AIXMBasicMessagePropertyType();
    }

    /**
     * Create an instance of {@link RankingAssignmentPropertyType }
     * 
     */
    public RankingAssignmentPropertyType createRankingAssignmentPropertyType() {
        return new RankingAssignmentPropertyType();
    }

    /**
     * Create an instance of {@link RankingAssignmentType }
     * 
     */
    public RankingAssignmentType createRankingAssignmentType() {
        return new RankingAssignmentType();
    }

    /**
     * Create an instance of {@link RankingPropertyType }
     * 
     */
    public RankingPropertyType createRankingPropertyType() {
        return new RankingPropertyType();
    }

    /**
     * Create an instance of {@link RankingType }
     * 
     */
    public RankingType createRankingType() {
        return new RankingType();
    }

    /**
     * Create an instance of {@link ClassificationPropertyType }
     * 
     */
    public ClassificationPropertyType createClassificationPropertyType() {
        return new ClassificationPropertyType();
    }

    /**
     * Create an instance of {@link GroupAssignmentType }
     * 
     */
    public GroupAssignmentType createGroupAssignmentType() {
        return new GroupAssignmentType();
    }

    /**
     * Create an instance of {@link GroupingPropertyType }
     * 
     */
    public GroupingPropertyType createGroupingPropertyType() {
        return new GroupingPropertyType();
    }

    /**
     * Create an instance of {@link GroupPropertyType }
     * 
     */
    public GroupPropertyType createGroupPropertyType() {
        return new GroupPropertyType();
    }

    /**
     * Create an instance of {@link ResultGroupType }
     * 
     */
    public ResultGroupType createResultGroupType() {
        return new ResultGroupType();
    }

    /**
     * Create an instance of {@link TimeIntervalPropertyType.TimeInterval }
     * 
     */
    public TimeIntervalPropertyType.TimeInterval createTimeIntervalPropertyTypeTimeInterval() {
        return new TimeIntervalPropertyType.TimeInterval();
    }

    /**
     * Create an instance of {@link TimeBufferPropertyType.TemporalBuffer }
     * 
     */
    public TimeBufferPropertyType.TemporalBuffer createTimeBufferPropertyTypeTemporalBuffer() {
        return new TimeBufferPropertyType.TemporalBuffer();
    }

    /**
     * Create an instance of {@link ExclusionPropertyType.Exclusion }
     * 
     */
    public ExclusionPropertyType.Exclusion createExclusionPropertyTypeExclusion() {
        return new ExclusionPropertyType.Exclusion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterestSpecificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semnotam.frequentis.com/schema/1.0", name = "InterestSpecification")
    public JAXBElement<InterestSpecificationType> createInterestSpecification(InterestSpecificationType value) {
        return new JAXBElement<InterestSpecificationType>(_InterestSpecification_QNAME, InterestSpecificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterestSpecResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semnotam.frequentis.com/schema/1.0", name = "EvaluatedInterestSpecification")
    public JAXBElement<InterestSpecResultType> createEvaluatedInterestSpecification(InterestSpecResultType value) {
        return new JAXBElement<InterestSpecResultType>(_EvaluatedInterestSpecification_QNAME, InterestSpecResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semnotam.frequentis.com/schema/1.0", name = "value_string", scope = LeafRestrictionType.class)
    public JAXBElement<String> createLeafRestrictionTypeValueString(String value) {
        return new JAXBElement<String>(_LeafRestrictionTypeValueString_QNAME, String.class, LeafRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semnotam.frequentis.com/schema/1.0", name = "operator", scope = LeafRestrictionType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLeafRestrictionTypeOperator(String value) {
        return new JAXBElement<String>(_LeafRestrictionTypeOperator_QNAME, String.class, LeafRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semnotam.frequentis.com/schema/1.0", name = "value_decimal", scope = LeafRestrictionType.class)
    public JAXBElement<BigDecimal> createLeafRestrictionTypeValueDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LeafRestrictionTypeValueDecimal_QNAME, BigDecimal.class, LeafRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semnotam.frequentis.com/schema/1.0", name = "value_dateTime", scope = LeafRestrictionType.class)
    public JAXBElement<XMLGregorianCalendar> createLeafRestrictionTypeValueDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LeafRestrictionTypeValueDateTime_QNAME, XMLGregorianCalendar.class, LeafRestrictionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semnotam.frequentis.com/schema/1.0", name = "aircraftTypeName", scope = AircraftOfInterestType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAircraftOfInterestTypeAircraftTypeName(String value) {
        return new JAXBElement<String>(_AircraftOfInterestTypeAircraftTypeName_QNAME, String.class, AircraftOfInterestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeSignalPerformanceILSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semnotam.frequentis.com/schema/1.0", name = "ilsCat", scope = AircraftOfInterestType.class)
    public JAXBElement<CodeSignalPerformanceILSType> createAircraftOfInterestTypeIlsCat(CodeSignalPerformanceILSType value) {
        return new JAXBElement<CodeSignalPerformanceILSType>(_AircraftOfInterestTypeIlsCat_QNAME, CodeSignalPerformanceILSType.class, AircraftOfInterestType.class, value);
    }

}
