package at.notamWebapp.interestSpec.generalInterest.model;

import com.frequentis.semnotam.schema._1.*;

/**
 * Created by khoef on 27.03.2017.
 */
public class GeneralInterestModel {
    private InterestPropertyType interest;
    private IntersectionInterestType intersectionInterest;
    private RelevanceOptionType relevanceOption;

    public GeneralInterestModel(){
        intersectionInterest = new IntersectionInterestType();
        interest = new InterestPropertyType();
        interest.setIntersectionInterest(intersectionInterest);
        relevanceOption = new RelevanceOptionType();
        relevanceOption.setSpatialRelevanceRules(CodeSpatialRelevanceType.SHAPE);
        relevanceOption.setTemporalRelevanceRules(CodeTemporalRelevanceType.VALID_TIME);
    }

    public IntersectionInterestType getIntersectionInterest() {
        return intersectionInterest;
    }

    public InterestPropertyType getInterest() {
        return interest;
    }

    public RelevanceOptionType getRelevanceOption() {
        return relevanceOption;
    }
}
