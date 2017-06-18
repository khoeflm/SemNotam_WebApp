package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import com.vaadin.ui.*;

/**
 * Created by khoef on 23.03.2017.
 */
public class EvaluatedInterestMenuBarForm extends Panel {
    private Label findExIS, findExRS;
    private Button bFindExIS;
    private VerticalLayout mainLayout;
    private GridLayout layoutI;
    private Button bLoadResult = new Button("Find");
    private Button bSaveResult = new Button("Save RS");
    private TextField resultID = new TextField();


    public EvaluatedInterestMenuBarForm(EvalNotamController controller){
        setCaption("Find existing InterestSpecification(Result)");

        bLoadResult.setId("loadRS");
        bSaveResult.setId("saveRS");
        bSaveResult.addClickListener(controller);
        bLoadResult.addClickListener(controller);
        HorizontalLayout saveRS = new HorizontalLayout();
        saveRS.addComponents(resultID, bSaveResult);

        layoutI = new GridLayout(3,2);
        layoutI.setSizeFull();
        findExIS = new Label("Find and Evaluate existing InterestSpecification:");
        findExRS = new Label("Find existing ResultSet:");
        bFindExIS = new Button("Find");
        bFindExIS.setId("findExIS");
        bFindExIS.addClickListener(controller);
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
    }

    public TextField getResultID() {
        return resultID;
    }
}
