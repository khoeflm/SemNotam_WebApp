package at.notamWebapp.evaluatedInterestSpec.view.windows;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.util.xmlHandler.XMLUnmarshaller;
import com.vaadin.ui.*;

import java.util.List;


/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.03.2017.
 */
public class LoadResultWindow extends Window {
    private Label errorMessages = new Label("");
    private TextField name = new TextField("Filter by (part of the) Name");
    private Table existingRS = new Table();

    public LoadResultWindow(EvalNotamController controller){
        FormLayout lMask = new FormLayout();
        VerticalLayout lPopUp = new VerticalLayout();
        lPopUp.addComponent(lMask);
        Button bloadInt = new Button("Filter");
        Label text1 = new Label("Look for an already existing Result:");
        lMask.addComponents(text1, name, bloadInt, errorMessages, existingRS);
        setContent(lPopUp);
        lPopUp.setMargin(true);
        name.setNullRepresentation("");
        existingRS.addContainerProperty("Result:" +
                "", String.class, null);
        existingRS.setId("existingRSTable");
        existingRS.setSelectable(true);
        existingRS.setImmediate(true);
        existingRS.addItemClickListener(controller);
        existingRS.setWidth("80%");
        List<String> isList = XMLUnmarshaller.loadXMLFileNames(name.getValue(), "tmp/Result");
        if(isList != null) {
            for (String s : isList) {
                existingRS.addItem(new Object[]{s}, s);
            }
            if (existingRS.size() <= 10) {
                existingRS.setPageLength(existingRS.size());
            } else {
                existingRS.setPageLength(10);
            }
            existingRS.addItemClickListener(controller);
        } else showLoadErrorMessage();
        existingRS.setVisible(true);
        bloadInt.addClickListener(clickEvent ->
                {
                    List<String> isListFiltered = XMLUnmarshaller.loadXMLFileNames(name.getValue(), "tmp/Result");
                    if(isListFiltered != null) {
                       existingRS.removeAllItems();
                       for (String s : isListFiltered) {
                           existingRS.addItem(new Object[]{s}, s);
                           errorMessages.setValue("");
                       }
                       if (existingRS.size() <= 10) {
                           existingRS.setPageLength(existingRS.size());
                       } else existingRS.setPageLength(10);
                   } else showLoadErrorMessage();
                }
        );
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        //      name.setValue("");
    }

    private void showLoadErrorMessage() {
        errorMessages.setValue("No interest was found");
    }
}
