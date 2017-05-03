package at.notamWebapp.interestSpec.view;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import com.vaadin.ui.FormLayout;

/**
 * Created by khoef on 24.11.2016.
 */
public class RestrictionForm extends FormLayout implements SemNotamForm{

    public RestrictionForm(SemNotamController controller){
        addController(controller);
    }

    @Override
    public void addController(SemNotamController controller) {

    }
}
