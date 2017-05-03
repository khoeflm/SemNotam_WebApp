package at.notamWebapp.interestSpec.generalInterest.model;

import com.frequentis.semnotam.schema._1.InterestPropertyType;
import com.frequentis.semnotam.schema._1.IntersectionInterestType;

/**
 * Created by khoef on 27.03.2017.
 */
public class GeneralInterestModel {
    private InterestPropertyType interest;
    private IntersectionInterestType intersectionInterest;

    public GeneralInterestModel(){
        intersectionInterest = new IntersectionInterestType();
        interest = new InterestPropertyType();
        interest.setIntersectionInterest(intersectionInterest);
    }

    public IntersectionInterestType getIntersectionInterest() {
        return intersectionInterest;
    }

    public InterestPropertyType getInterest() {
        return interest;
    }
}
