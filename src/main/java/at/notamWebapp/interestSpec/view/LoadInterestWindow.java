package at.notamWebapp.interestSpec.view;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import com.vaadin.ui.*;

/**
 * Created by khoef on 20.03.2017.
 */
public class LoadInterestWindow extends Window {
    private VerticalLayout lPopUp = new VerticalLayout();
    private FormLayout lMask = new FormLayout();
    private Label text1 = new Label("Look for an already existing Interest!");
    private Label errorMessages = new Label("");
    private TextField name = new TextField("Interest Name");
    private Button bloadInt = new Button("Load");

    public LoadInterestWindow(SemNotamController controller){
        lPopUp.addComponent(lMask);
        lMask.addComponents(text1, name, bloadInt, errorMessages);
        setContent(lPopUp);
        lPopUp.setMargin(true);
        bloadInt.addClickListener(controller);
        bloadInt.setId("queryIS");
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        name.setValue("");
    }

    public void showLoadErrorMessage(String interestString) {
        if(interestString.equals("-1")){
            errorMessages.setValue("No interest was found");
        }
    }
}
