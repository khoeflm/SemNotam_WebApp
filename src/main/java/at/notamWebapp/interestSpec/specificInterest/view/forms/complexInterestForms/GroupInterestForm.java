package at.notamWebapp.interestSpec.specificInterest.view.forms.complexInterestForms;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;

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
    }

    public void addInterest(Panel p){
        if(getLeftIntLayout().getComponent(1,0)==null){getLeftIntLayout().addComponent(p,1,0);}
        else if(getRightIntLayout().getComponent(1,0)==null){getRightIntLayout().addComponent(p,1,0);}
        else{addInterestComboBox(p);}
    }
}
