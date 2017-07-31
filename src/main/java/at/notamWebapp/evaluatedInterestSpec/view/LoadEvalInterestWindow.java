package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.util.DBConnector;
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
    private TextField name = new TextField("Filter by (part of the) Name");
    private Table existingIS = new Table();
    private Button bloadInt = new Button("Filter");

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
        final DBConnector dbconn = new DBConnector();
        List<String> isList = dbconn.loadExistingInterests(name.getValue());
        for(String s : isList){
            existingIS.addItem(new Object[]{s}, s);
        }
        if(existingIS.size()<=10){
            existingIS.setPageLength(existingIS.size());
        } else {
            existingIS.setPageLength(10);
        }
        existingIS.setVisible(true);
        bloadInt.addClickListener(clickEvent ->
                {
                    List<String> isListFiltered = dbconn.loadExistingInterests(name.getValue());
                    existingIS.removeAllItems();
                    for(String s : isListFiltered){
                        existingIS.addItem(new Object[]{s}, s);
                    }
                    if(existingIS.size()<=10){
                        existingIS.setPageLength(existingIS.size());
                    } else {
                        existingIS.setPageLength(10);
                    }
                    existingIS.setVisible(true);
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
