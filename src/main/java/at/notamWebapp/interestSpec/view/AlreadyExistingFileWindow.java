package at.notamWebapp.interestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.interestSpec.controller.SemNotamController;
import com.vaadin.ui.*;

/**
 * Created by khoef on 18.06.2017.
 */
public class AlreadyExistingFileWindow extends Window{
    private VerticalLayout lPopUp = new VerticalLayout();
    private Label errorText1 = new Label(), errorText2 = new Label();
    private Button cont, cancel;
    public AlreadyExistingFileWindow(String filename, SemNotamController controller){
        errorText1.setValue("An Interest Specification with the ID \"" +filename+ "\" does already exist.");
        errorText2.setValue("Do you want to overwrite the existing IS?");
        initAlreadyExistingFileWindow(filename);
        cancel.addClickListener(controller);
        cont.addClickListener(controller);
    }
    public AlreadyExistingFileWindow(String filename, EvalNotamController controller){
        errorText1.setValue("A Result Specification with the ID \"" +filename+ "\" does already exist.");
        errorText2.setValue("Do you want to overwrite the existing RS?");
        initAlreadyExistingFileWindow(filename);
        cancel.addClickListener(controller);
        cont.addClickListener(controller);
    }

    private void initAlreadyExistingFileWindow(String filename) {
        this.setCaption("File exists already!");
        cont = new Button("YES");
        cancel = new Button("NO");
        cont.setId("contSave");
        cancel.setId("cancelSave");
        lPopUp.setSpacing(true);
        lPopUp.addComponents(errorText1, errorText2);
        HorizontalLayout buttonLayout = new HorizontalLayout(cont, cancel);
        buttonLayout.setSpacing(true);
        buttonLayout.setSizeFull();
        buttonLayout.setComponentAlignment(cont, Alignment.BOTTOM_CENTER);
        buttonLayout.setComponentAlignment(cancel, Alignment.BOTTOM_CENTER);
        lPopUp.addComponent(buttonLayout);
        lPopUp.setComponentAlignment(buttonLayout, Alignment.MIDDLE_CENTER);
        setContent(lPopUp);
        center();
    }


}
