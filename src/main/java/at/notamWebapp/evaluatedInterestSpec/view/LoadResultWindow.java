package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.DBConnector;
import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.vaadin.ui.*;

import java.util.List;


/**
 * Created by khoef on 20.03.2017.
 */
public class LoadResultWindow extends Window {
    private VerticalLayout lPopUp = new VerticalLayout();
    private FormLayout lMask = new FormLayout();
    private Label text1 = new Label("Look for an already existing Interest!");
    private Label errorMessages = new Label("");
    private TextField name = new TextField("Interest Name");
    private Table existingRS = new Table();
    private Button bloadInt = new Button("Load");

    public LoadResultWindow(EvalNotamController controller){
        lPopUp.addComponent(lMask);
        lMask.addComponents(text1, name, bloadInt, errorMessages, existingRS);
        setContent(lPopUp);
        lPopUp.setMargin(true);
        name.setNullRepresentation("");
        existingRS.addContainerProperty("Result:", String.class, null);
        existingRS.setId("existingRSTable");
        existingRS.setSelectable(true);
        existingRS.setImmediate(true);
        existingRS.addItemClickListener(controller);
        existingRS.setVisible(false);
        bloadInt.addClickListener(clickEvent ->
                {
                    DBConnector dbconn = new DBConnector();
                    String interestString = null;
                    InterestSpecificationType interestSpec = null;
                    List<String> isList = dbconn.loadExistingResults(name.getValue());
                    for(String s : isList){
                        existingRS.addItem(new Object[]{s}, s);
                    }
                    if(existingRS.size()<=10){
                        existingRS.setPageLength(existingRS.size());
                    }
                    existingRS.setVisible(true);
                    existingRS.setPageLength(10);
                }
        );
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        //      name.setValue("");
    }

    public void showLoadErrorMessage(String interestString) {
        if(interestString.equals("-1")){
            errorMessages.setValue("No interest was found");
        }
    }

}
