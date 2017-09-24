package at.notamWebapp.evaluatedInterestSpec.view.windows;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.util.xmlHandler.XMLUnmarshaller;
import com.vaadin.ui.*;

import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.03.2017.
 */
public class LoadEvalInterestWindow extends Window {
    private TextField name = new TextField("Filter by (part of the) Name");
    private Table existingIS = new Table();
    private Label errorMessages = new Label("");


    public LoadEvalInterestWindow(EvalNotamController controller){
        FormLayout lMask = new FormLayout();
        VerticalLayout lPopUp = new VerticalLayout();
        Button bloadInt = new Button("Filter");
        Label errorMessages = new Label("");
        Label text1 = new Label("Look for an already existing Interest:");

        lPopUp.addComponent(lMask);
        lMask.addComponents(text1, name, bloadInt, errorMessages, existingIS);
        setContent(lPopUp);
        lPopUp.setMargin(true);
        name.setNullRepresentation("");
        existingIS.addContainerProperty("Existing Interest Specification", String.class, null);
        existingIS.setId("existingISTable");
        existingIS.setSelectable(true);
        existingIS.setImmediate(true);
        existingIS.addItemClickListener(controller);
        existingIS.setWidth("80%");
        List<String> isList = XMLUnmarshaller.loadXMLFileNames(name.getValue(), "tmp/InterestSpecification");
        if(isList != null) {
            for (String s : isList) {
                existingIS.addItem(new Object[]{s}, s);
            }
            if (existingIS.size() <= 10) {
                existingIS.setPageLength(existingIS.size());
            } else {
                existingIS.setPageLength(10);
            }
        } else showLoadErrorMessage();
        existingIS.setVisible(true);
        bloadInt.addClickListener(clickEvent ->
                {
                    List<String> isListFiltered = XMLUnmarshaller.loadXMLFileNames(name.getValue(), "tmp/InterestSpecification");
                    if(isListFiltered != null) {
                        existingIS.removeAllItems();
                        for (String s : isListFiltered) {
                            existingIS.addItem(new Object[]{s}, s);
                            errorMessages.setValue("");
                        }
                        if (existingIS.size() <= 10) {
                            existingIS.setPageLength(existingIS.size());
                        } else {
                            existingIS.setPageLength(10);
                        }
                    } else showLoadErrorMessage();
                    existingIS.setVisible(true);
                }
        );
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }

    private void showLoadErrorMessage() {
        errorMessages.setValue("No interest was found");
    }
}
