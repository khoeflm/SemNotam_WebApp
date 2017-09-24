package at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;

/**
 * SemNOTAM Project (User Interface)
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
