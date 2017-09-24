package at.notamWebapp.evaluatedInterestSpec.view.forms;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 23.03.2017.
 */
public class EvaluatedInterestMenuBarForm extends Panel {
    private TextField resultID = new TextField();


    public EvaluatedInterestMenuBarForm(EvalNotamController controller){
        setCaption("Find existing InterestSpecification(Result)");

        Button bLoadResult = new Button("Find");
        bLoadResult.setId("findExRS");
        bLoadResult.addClickListener(controller);

        Button bSaveResult = new Button("Save RS");
        bSaveResult.setId("saveRS");
        bSaveResult.addClickListener(controller);

        Button bFindExIS = new Button("Find");
        bFindExIS.setId("findExIS");
        bFindExIS.addClickListener(controller);

        HorizontalLayout saveRS = new HorizontalLayout();
        saveRS.addComponents(resultID, bSaveResult);

        GridLayout layoutI = new GridLayout(3, 2);
        layoutI.setSizeFull();
        Label findExIS = new Label("Find and Evaluate existing InterestSpecification:");
        Label findExRS = new Label("Find existing ResultSet:");

        layoutI.addComponent(findExRS,0,0);
        layoutI.addComponent(findExIS,0,1);
        layoutI.addComponent(bLoadResult,1,0);
        layoutI.addComponent(bFindExIS,1,1);
        layoutI.addComponent(saveRS, 2,0);
        layoutI.setComponentAlignment(saveRS, Alignment.MIDDLE_RIGHT);
        setContent(layoutI);
        layoutI.setColumnExpandRatio(0, (float) 0.33);
        layoutI.setColumnExpandRatio(1, (float) 0.33);
        layoutI.setColumnExpandRatio(2, (float) 0.33);

        resultID.addValidator(new StringLengthValidator("Wrong length",1,35,false));
        resultID.addValidator(new RegexpValidator("\\w+","Only [A-Z],[a-z],[0-9] and [_] are allowed"));
        resultID.setValidationVisible(false);
    }

    public TextField getResultID() {
        return resultID;
    }
}
