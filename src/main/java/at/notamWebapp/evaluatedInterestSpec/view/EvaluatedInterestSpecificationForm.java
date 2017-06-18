package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.evaluatedInterestSpec.model.EvaluatedInterestService;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.FormLayout;

/**
 * Created by khoef on 23.03.2017.
 */
public class EvaluatedInterestSpecificationForm extends FormLayout implements View{
    private EvaluatedInterestMenuBarForm menu;
    private NotamViewForm notamView;
    private NotamMapForm notamMap;
    private LoadEvalInterestWindow loadEvalInterestWindow;
    private EvalNotamController controller;
    public EvaluatedInterestSpecificationForm() {
        controller = new EvalNotamController(this);
        menu = new EvaluatedInterestMenuBarForm(controller);
        notamView = new NotamViewForm(controller);
        notamMap = new NotamMapForm(controller);
        notamView.setVisible(false);
        notamMap.setVisible(false);
        addComponents(menu, notamView, notamMap);
        this.controller = controller;
        loadEvalInterestWindow = new LoadEvalInterestWindow(controller);
        loadEvalInterestWindow.setVisible(false);
    }

    public void addLoadEvalInterestWindow() {

        this.getUI().addWindow(loadEvalInterestWindow);
        loadEvalInterestWindow.setVisible(true);
    }

    public void removeLoadEvalInterestWindow() {
        this.getUI().removeWindow(loadEvalInterestWindow);
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

    public NotamMapForm getNotamMap() {
        return notamMap;
    }

    public void setResultsVisible(){
        notamMap.setVisible(true);
        notamView.setVisible(true);
    }

    public void drawMapElements(EvaluatedInterestService model) {
        notamMap.drawMapElements(model);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
    }
}
