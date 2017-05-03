package at.notamWebapp.interestSpec.view.complexInterestForms;

import at.notamWebapp.interestSpec.controller.SemNotamController;

/**
 * Created by khoef on 23.12.2016.
 */
public class BinaryUnionForm extends BinaryInterestForm {
    public BinaryUnionForm(SemNotamController controller, int id) {
        super(controller);
        setCaption("BinaryUnionInterestType");
        setId("BINU"+id);
        super.setLabelId(getId());
    }
}
