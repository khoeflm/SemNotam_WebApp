package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import com.vaadin.ui.*;

/**
 * Created by khoef on 23.03.2017.
 */
public class EvaluatedInterestMenuBarForm extends Panel {
    private Label findExIS, findExRS;
    private Button bFindExIS, bFindExRS, hide;
    private VerticalLayout mainLayout;
    private GridLayout layoutI;

    public EvaluatedInterestMenuBarForm(EvalNotamController controller){
        setCaption("Find existing InterestSpecification(Result)");

        layoutI = new GridLayout(2,2);
        findExIS = new Label("Find and Evaluate existing InterestSpecification:");
        findExRS = new Label("Find existing ResultSet:");
        bFindExIS = new Button("Find");
        bFindExRS = new Button("Find");
        bFindExIS.setId("findExIS");
        bFindExRS.setId("findExRS");
        bFindExIS.addClickListener(controller);
        bFindExRS.addClickListener(controller);
        layoutI.addComponent(findExIS,0,0);
        layoutI.addComponent(findExRS,0,1);
        layoutI.addComponent(bFindExIS,1,0);
        layoutI.addComponent(bFindExRS,1,1);
        mainLayout = new VerticalLayout(layoutI);
        setContent(mainLayout);
    }


}
