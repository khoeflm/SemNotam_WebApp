package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.view.forms.EvaluatedInterestMenuBarForm;
import at.notamWebapp.evaluatedInterestSpec.view.forms.NotamMapForm;
import at.notamWebapp.evaluatedInterestSpec.view.forms.NotamViewForm;
import at.notamWebapp.evaluatedInterestSpec.view.windows.LoadEvalInterestWindow;
import at.notamWebapp.evaluatedInterestSpec.view.windows.LoadResultWindow;
import at.notamWebapp.interestSpec.specificInterest.view.windows.AlreadyExistingFileWindow;
import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.evaluatedInterestSpec.model.EvaluatedInterestService;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 23.03.2017.
 */
public class EvaluatedInterestSpecificationForm extends FormLayout implements View{
    private EvaluatedInterestMenuBarForm menu;
    private NotamViewForm notamView;
    private NotamMapForm notamMap;
    private LoadEvalInterestWindow loadEvalInterestWindow;
    private LoadResultWindow loadResultWindow;
    private EvalNotamController controller;
    private AlreadyExistingFileWindow alreadyExistingFileWindow;

    public EvaluatedInterestSpecificationForm() {
        controller = new EvalNotamController(this);
        menu = new EvaluatedInterestMenuBarForm(controller);
        notamView = new NotamViewForm(controller);
        notamMap = new NotamMapForm(controller);
        notamView.setNotamMapForm(notamMap);
        notamView.setVisible(false);
        notamMap.setVisible(false);
        addComponents(menu, notamView, notamMap);
        loadEvalInterestWindow = new LoadEvalInterestWindow(controller);
        loadEvalInterestWindow.setVisible(false);
        setWidth("99%");
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

    public void addLoadResultWindow(){
        loadResultWindow = new LoadResultWindow(controller);
        getUI().addWindow(loadResultWindow);
    }

    public void removeLoadResultWindow(){
        getUI().removeWindow(loadResultWindow);
    }

    public void setAlreadyExistingFileWindow(String filename) {
        alreadyExistingFileWindow = new AlreadyExistingFileWindow(filename, controller);
        getUI().addWindow(alreadyExistingFileWindow);
    }

    public void removeExistingFileWindow() {
        getUI().removeWindow(alreadyExistingFileWindow);
    }

    public LoadResultWindow getLoadResultWindow() {
        return loadResultWindow;
    }
}
