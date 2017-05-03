package at.notamWebapp.interestSpec.view.complexInterestForms;

import at.notamWebapp.interestSpec.controller.SemNotamController;

/**
 * Created by khoef on 24.12.2016.
 */
public class GroupIntersectForm extends GroupInterestForm {

    public GroupIntersectForm(SemNotamController controller, int id) {
        super(controller);
        setCaption("IntersectionInterestType");
        setId("GROI"+id);
        setLabelId(getId());
    }
}
