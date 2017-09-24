package at.notamWebapp.interestSpec.specificInterest.view.windows;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.util.xmlHandler.XMLUnmarshaller;
import com.vaadin.ui.*;

import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.03.2017.
 */
public class LoadInterestWindow extends Window {
    private TextField name = new TextField("Filter by Interest Name");
    private Table existingIS = new Table();
    private Label errorMessages = new Label("");

    public LoadInterestWindow(SemNotamController controller){
        VerticalLayout lPopUp = new VerticalLayout();
        FormLayout lMask = new FormLayout();
        lPopUp.addComponent(lMask);
        Label text1 = new Label("Look for an already existing Interest:");
        Button bloadInt = new Button("Load");
        Label errorMessages = new Label("");
        lMask.addComponents(text1, name, bloadInt, errorMessages, existingIS);
        setContent(lPopUp);
        lPopUp.setMargin(true);
        name.setNullRepresentation("");
        existingIS.addContainerProperty("Item", String.class, null);
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
            } else existingIS.setPageLength(10);
        } showLoadErrorMessage();
        existingIS.setVisible(true);
        bloadInt.addClickListener(clickEvent ->
            {
                List<String> isListFiltered = XMLUnmarshaller.loadXMLFileNames(name.getValue(), "tmp/InterestSpecification");
                if(isListFiltered != null) {
                    for (String s : isListFiltered) {
                        existingIS.addItem(new Object[]{s}, s);
                        errorMessages.setValue("");
                    }
                    if (existingIS.size() <= 10) {
                        existingIS.setPageLength(existingIS.size());
                    } else existingIS.setPageLength(10);
                }else showLoadErrorMessage();
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
