package at.notamWebapp.interestSpec.view.complexInterestForms;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.view.SemNotamForm;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.util.ArrayList;

/**
 * Created by khoef on 23.12.2016.
 */
public abstract class BinaryInterestForm extends Panel implements SemNotamForm {

    private ArrayList<ComboBox> comboBoxList;
    private VerticalLayout vertLayout;
    private GridLayout leftIntLayout, rightIntLayout;
    private Label id = new Label();
    private SemNotamController controller;

    public BinaryInterestForm(SemNotamController controller) {
        this.controller = controller;
        comboBoxList = new ArrayList<>();
        vertLayout = new VerticalLayout();
        leftIntLayout = new GridLayout(2,1);
        rightIntLayout = new GridLayout(2,1);
        leftIntLayout.addComponent(initInterestComboBox(),0,0);
        rightIntLayout.addComponent(initInterestComboBox(), 0,0);
        Button deleteComp = new Button("Delete");
        deleteComp.setId("370");
        deleteComp.addClickListener(controller);
        HorizontalLayout idLayout = new HorizontalLayout();
        idLayout.setSpacing(true);
        idLayout.addComponents(this.id, deleteComp);
        vertLayout.addComponents(idLayout,leftIntLayout,rightIntLayout);
        vertLayout.setMargin(true);
        vertLayout.setSpacing(true);
        setContent(vertLayout);
    }

    @Override
    public void addController(SemNotamController controller) {
    }

    public void addLeftInterest(Panel p){
        leftIntLayout.addComponent(p, 1, 0);
    }

    public void addRightInterest(Panel p){
        rightIntLayout.addComponent(p,1,0);
    }

    public Layout initInterestComboBox(){
        HorizontalLayout horLay = new HorizontalLayout();
        ComboBox cb = new ComboBox();
        cb.setId("150");
        comboBoxList.add(cb);
        cb.setCaption("Interest "+ (comboBoxList.indexOf(cb)+1));
        cb.addFocusListener(controller);

        Button add = new Button();
        add.setId("320");
        add.setIcon(new ThemeResource("icons/button-check.ico"));
        add.addStyleName(ValoTheme.BUTTON_LINK);
        add.addClickListener(controller);

        Button delete = new Button();
        delete.setId("330");
        delete.setIcon(new ThemeResource("icons/button-cross.ico"));
        delete.addStyleName(ValoTheme.BUTTON_LINK);
        delete.addClickListener(controller);

        horLay.setDefaultComponentAlignment(Alignment.BOTTOM_CENTER);
        horLay.addComponent(cb, 0);
        horLay.addComponents(add, delete);
        horLay.setSpacing(true);
        return horLay;
    }

    public void setLabelId(String id) {
        this.id.setValue(id);
    }

    public ArrayList<ComboBox> getComboBoxList() {
        return comboBoxList;
    }

    public ComboBox getCbLeftInterest() {
        return comboBoxList.get(0);
    }

    public ComboBox getCbRightInterest() {
        return comboBoxList.get(1);
    }

    public VerticalLayout getVertLayout() {
        return vertLayout;
    }

    public GridLayout getLeftIntLayout() {
        return leftIntLayout;
    }

    public GridLayout getRightIntLayout() {
        return rightIntLayout;
    }

    public SemNotamController getController() {
        return controller;
    }
}
