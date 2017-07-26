package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.util.DBConnector;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.vaadin.ui.*;

import java.util.List;

/**
 * Created by khoef on 20.03.2017.
 */
public class LoadEvalInterestWindow extends Window {
    private VerticalLayout lPopUp = new VerticalLayout();
    private FormLayout lMask = new FormLayout();
    private Label text1 = new Label("Look for an already existing Interest:");
    private Label errorMessages = new Label("");
    private TextField name = new TextField("Filter by Interest Name");
    private Table existingIS = new Table();
    private Button bloadInt = new Button("Load");

    public LoadEvalInterestWindow(EvalNotamController controller){
        lPopUp.addComponent(lMask);
        lMask.addComponents(text1, name, bloadInt, errorMessages, existingIS);
        setContent(lPopUp);
        lPopUp.setMargin(true);
        name.setNullRepresentation("");
        existingIS.addContainerProperty("Item", String.class, null);
        existingIS.setId("existingISTable");
        existingIS.setSelectable(true);
        existingIS.setImmediate(true);
        existingIS.addItemClickListener(controller);
        existingIS.setVisible(false);
        bloadInt.addClickListener(clickEvent ->
                {
                    DBConnector dbconn = new DBConnector();
                    String interestString = null;
                    InterestSpecificationType interestSpec = null;
                    List<String> isList = dbconn.loadExistingInterests(name.getValue());
                    for(String s : isList){
                        existingIS.addItem(new Object[]{s}, s);
                    }
                    if(existingIS.size()<=10){
                        existingIS.setPageLength(existingIS.size());
                    }
                    existingIS.setVisible(true);
                    existingIS.setPageLength(10);
                }
        );
        //  bloadInt.setId("queryIS");
        //table.addValueChangeListener(controller);
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

    public Table getExistingISTable() {
        return existingIS;
    }
}
