package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 23.11.2016.
 */
public class AreaOfInterestForm extends Panel {
    private GridLayout areaFormLayout;
    private Button hide, up, down;
    private VerticalLayout buttons1;
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
        Button delete = new Button("delete");
        delete.setId("areaDel");
        delete.addClickListener(controller);
        delete.setWidth("90%");

        up = new Button("up");
        up.setId("up");
        up.addClickListener(controller);
        up.setWidth("90%");

        down = new Button("down");
        down.setId("down");
        down.addClickListener(controller);
        down.setWidth("90%");
        buttons1.addComponents(delete);

        //Button to collapse the area form
        hide = new Button("hide");
        hide.setId("hide");
        hide.addClickListener(controller);
        hide.setWidth("90%");

        VerticalLayout buttons2 = new VerticalLayout(hide, buttons1, up, down);
        buttons2.setSpacing(true);

        areaFormLayout.addComponent(buttons2, 1, 0);
        areaFormLayout.setComponentAlignment(buttons2, Alignment.BOTTOM_CENTER);
        setContent(areaFormLayout);
        setCaption(areaClass.getSimpleName());
        setWidth("95%");
        focus();
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
