package at.notamWebapp.interestSpec.view.complexInterestForms;

import at.notamWebapp.interestSpec.controller.SemNotamController;

/**
 * Created by khoef on 24.12.2016.
 */
public class GroupUnionForm  extends GroupInterestForm {
    public GroupUnionForm(SemNotamController controller, int id) {
        super(controller);
        setCaption("UnionInterestType");
        setId("GROU"+id);
        setLabelId(getId());
    }
}
