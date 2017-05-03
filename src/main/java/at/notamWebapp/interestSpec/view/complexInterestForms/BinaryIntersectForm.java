package at.notamWebapp.interestSpec.view.complexInterestForms;

import at.notamWebapp.interestSpec.controller.SemNotamController;

/**
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
