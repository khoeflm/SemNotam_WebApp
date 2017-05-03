package at.notamWebapp.interestSpec.view.simpleInterestForm;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.view.RestrictionForm;
import at.notamWebapp.interestSpec.view.SemNotamForm;
import com.frequentis.semnotam.schema._1.AttributeOfInterestType;
import com.vaadin.ui.*;

/**
 * Created by khoef on 24.11.2016.
 */
public class AttributeOfInterestForm extends Panel implements SemNotamForm {
    private ComboBox cbConceptName = new ComboBox("Concept Name:");
    private RestrictionForm restriction;
    private Label id = new Label();
    private AttributeOfInterestType attribute;

    public AttributeOfInterestForm(SemNotamController controller, int id, AttributeOfInterestType attribute){
        setId("ATTR"+id);
        this.id.setValue(getId());
        restriction = new RestrictionForm(controller);
        this.attribute = attribute;
        HorizontalLayout idLayout = new HorizontalLayout();
        Button deleteAttributeForm = new Button("Delete");
        deleteAttributeForm.setId("370");
        deleteAttributeForm.addClickListener(controller);
        idLayout.setSpacing(true);
        idLayout.addComponents(this.id, deleteAttributeForm);
        HorizontalLayout aoifHorizLayout = new HorizontalLayout(cbConceptName, restriction);
        VerticalLayout aoifVertLayout = new VerticalLayout(idLayout, aoifHorizLayout);
        aoifVertLayout.setSpacing(true);
        aoifVertLayout.setMargin(true);
        setCaption("Attribute of Interest");
        setContent(aoifVertLayout);
    }

    @Override
    public void addController(SemNotamController controller) {
    }
}
