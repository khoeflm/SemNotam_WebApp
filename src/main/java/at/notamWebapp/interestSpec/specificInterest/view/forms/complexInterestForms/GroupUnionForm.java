package at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;

/**
 * SemNOTAM Project (User Interface)
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
