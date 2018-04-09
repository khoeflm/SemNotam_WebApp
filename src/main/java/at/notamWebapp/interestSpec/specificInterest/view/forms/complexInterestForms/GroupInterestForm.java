package at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 23.12.2016.
 */
public abstract class GroupInterestForm extends BinaryInterestForm {

    private Button addInterestButton;

    GroupInterestForm(SemNotamController controller) {
        super(controller);
        addInterestButton = new Button("Add Interest");
        addInterestButton.setId("310");
        addInterestButton.addClickListener(controller);
        getVertLayout().addComponent(addInterestButton);
        setContent(getVertLayout());
    }

    public void addInterestComboBox(){
        addInterestComboBox(null);
    }

    private void addInterestComboBox(Panel p){
        GridLayout newGridLay = new GridLayout(2,1);
        newGridLay.addComponent(initInterestComboBox(),0,0);
        getVertLayout().addComponent(newGridLay);
        getVertLayout().removeComponent(addInterestButton);
        getVertLayout().addComponent(addInterestButton);
        newGridLay.addComponent(p,1,0);
        HorizontalLayout cbLayout = (HorizontalLayout) newGridLay.getComponent(0,0);
        ComboBox cb = (ComboBox) cbLayout.getComponent(0);
        cb.addItems(getController().getModel().getInterestMap().keySet());
        cb.select(p.getId());
        getController().addChosenComplexInterests(p.getId());
    }

    public void addInterest(Panel p){
        if(getLeftIntLayout().getComponent(1,0)==null){
            getLeftIntLayout().addComponent(p,1,0);
            getComboBoxList().get(0).addItems(getController().getModel().getInterestMap().keySet());
            getComboBoxList().get(0).select(p.getId());
            getController().addChosenComplexInterests(p.getId());
        }
        else if(getRightIntLayout().getComponent(1,0)==null){
            getRightIntLayout().addComponent(p,1,0);
            getComboBoxList().get(1).addItems(getController().getModel().getInterestMap().keySet());
            getComboBoxList().get(1).select(p.getId());
            getController().addChosenComplexInterests(p.getId());
        }
        else{
            addInterestComboBox(p);
        }
    }
}
