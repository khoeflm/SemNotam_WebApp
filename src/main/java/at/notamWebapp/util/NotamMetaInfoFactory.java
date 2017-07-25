package at.notamWebapp.util;

import at.notamWebapp.interestSpec.generalInterest.model.GeneralInterestModel;
import com.frequentis.semnotam.schema._1.*;

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
}
