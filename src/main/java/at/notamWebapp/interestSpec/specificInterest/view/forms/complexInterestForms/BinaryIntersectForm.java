package at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 23.12.2016.
 */
public class BinaryIntersectForm extends BinaryInterestForm {
    public BinaryIntersectForm(SemNotamController controller, int id) {
        super(controller);
        setId("BINI"+id);
        setLabelId(getId());
        setCaption("BinaryIntersectionInterestType");
    }
}
