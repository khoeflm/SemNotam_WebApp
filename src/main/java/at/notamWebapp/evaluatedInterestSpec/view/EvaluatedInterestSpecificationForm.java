package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.interestSpec.view.SemNotamUI;
import com.vaadin.ui.FormLayout;

/**
 * Created by khoef on 23.03.2017.
 */
public class EvaluatedInterestSpecificationForm extends FormLayout{
    private EvaluatedInterestMenuBarForm menu;
    private NotamViewForm notamView;
    private NotamMapForm notamMap;
    private LoadEvalInterestWindow loadEvalInterestWindow;
    private EvalNotamController controller;
    private SemNotamUI snUI;
    public EvaluatedInterestSpecificationForm(EvalNotamController controller, SemNotamUI myUI) {
        menu = new EvaluatedInterestMenuBarForm(controller);
        notamView = new NotamViewForm(controller);
        notamMap = new NotamMapForm(controller);
        addComponents(menu, notamView, notamMap);
        this.controller = controller;
        loadEvalInterestWindow = new LoadEvalInterestWindow(controller);
        loadEvalInterestWindow.setVisible(false);
        this.snUI = myUI;
    }

    public void addLoadEvalInterestWindow() {

        this.getUI().addWindow(loadEvalInterestWindow);
        loadEvalInterestWindow.setVisible(true);
    }

    public void removeLoadEvalInterestWindow() {
        snUI.removeWindow(loadEvalInterestWindow);
        loadEvalInterestWindow.setVisible(false);
    }

    public EvaluatedInterestMenuBarForm getMenu() {
        return menu;
    }

    public LoadEvalInterestWindow getLoadEvalInterestWindow() {
        return loadEvalInterestWindow;
    }

    public NotamViewForm getNotamView() {
        return notamView;
    }
}
