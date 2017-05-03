package at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.view.SemNotamForm;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.vaadin.ui.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by khoef on 23.11.2016.
 */
public class AreaOfInterestForm extends Panel implements SemNotamForm {
    private GridLayout areaFormLayout;
    private Button refresh, delete, hide;
    private VerticalLayout buttons1;
    private ArrayList<AbstractField> fieldList = new ArrayList<>();
    private AreaOfInterestPropertyType area;

    public GridLayout getAreaFormLayout() {
        return areaFormLayout;
    }

    public AreaOfInterestForm(String areaId, SemNotamController controller, Class areaClass, AreaOfInterestPropertyType area){
        setId(areaId);
        areaFormLayout = new GridLayout(2, 1);
        areaFormLayout.setSizeFull();
        areaFormLayout.setColumnExpandRatio(0, 0.8f);
        areaFormLayout.setColumnExpandRatio(1, 0.2f);
        this.area = area;

        //refresh and delete Button for the area form
        buttons1 = new VerticalLayout();
        buttons1.setSpacing(true);
        refresh = new Button("refresh");
        delete = new Button("delete");
        refresh.setId("350");
        refresh.addClickListener(controller);
        refresh.setWidth("90%");
        delete.setId("areaDel");
        delete.addClickListener(controller);
        delete.setWidth("90%");
        buttons1.addComponents(refresh, delete);

        //Button to collapse the area form
        hide = new Button("hide");
        hide.setId("hide");
        hide.addClickListener(controller);
        hide.setWidth("90%");

        VerticalLayout buttons2 = new VerticalLayout(hide, buttons1);
        buttons2.setSpacing(true);

        areaFormLayout.addComponent(buttons2, 1, 0);
        areaFormLayout.setComponentAlignment(buttons2, Alignment.BOTTOM_CENTER);
        setContent(areaFormLayout);
        setCaption(areaClass.getSimpleName());
        setWidth("95%");
        focus();
    }


    public HashMap<String, String> getCaptionValuePairs() {
        HashMap<String, String> map = new HashMap<>();
        //AbstractField: Abstrakte Klasse für alle Eingabe-Komponenten der Vaadin-Ui. (besitzt implementierte getValue() Methode).
        for(AbstractField c : fieldList){
            if(c.getValue() != null){
                map.put(c.getCaption(), c.getValue().toString());
            }
        }
        return map;
    }

    @Override
    public void addController(SemNotamController controller) {
    }

    public VerticalLayout getButtons() {
        return buttons1;
    }

    public void hide(){
        if(hide.getCaption().equals("hide")){
            getButtons().setVisible(false);
            getAreaFormLayout().getComponent(0,0).setVisible(false);
            hide.setCaption("show");
        }
        else if(hide.getCaption().equals("show")){
            getButtons().setVisible(true);
            getAreaFormLayout().getComponent(0,0).setVisible(true);
            hide.setCaption("hide");
        }
    }

    public AreaOfInterestPropertyType getArea() {
        return area;
    }
}
