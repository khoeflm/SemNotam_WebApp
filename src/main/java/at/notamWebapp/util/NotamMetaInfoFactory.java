package at.notamWebapp.util;

import at.notamWebapp.interestSpec.generalInterest.model.GeneralInterestModel;
import com.frequentis.semnotam.schema._1.*;

import java.math.BigInteger;

/**
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
