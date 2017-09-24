package at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;

/**
 * SemNOTAM Project (User Interface)
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
