package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import com.vaadin.ui.*;

/**
 * Created by khoef on 20.03.2017.
 */
public class LoadEvalInterestWindow extends Window {
    private VerticalLayout mainLayout = new VerticalLayout();
    private FormLayout lMask = new FormLayout();
    private Label windowTitle = new Label("Look for an already existing Interest!");
    private Label errorMessages = new Label("");
    private TextField interestName = new TextField("Interest Name");
    private Button bloadInt = new Button("Load");
    private Table resultTable = new Table();

    public LoadEvalInterestWindow(EvalNotamController controller){
        mainLayout.addComponent(lMask);
        lMask.addComponents(windowTitle, interestName, bloadInt, errorMessages, resultTable);
        setContent(mainLayout);
        mainLayout.setMargin(true);
        bloadInt.addClickListener(controller);
        bloadInt.setId("queryRS");
        resultTable.setId("resultTable");
        resultTable.setPageLength(resultTable.size());
        resultTable.setSelectable(true);
        resultTable.setImmediate(true);
        resultTable.addItemClickListener(controller);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        interestName.setValue("");
    }

    public void showLoadErrorMessage(String interestString) {
        if(interestString.equals("-1")){
            errorMessages.setValue("No interest was found");
        }
    }

    public Table getResultTable() {
        return resultTable;
    }
}
