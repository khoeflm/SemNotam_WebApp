package at.notamWebapp.evaluatedInterestSpec.controller;

import at.notamWebapp.evaluatedInterestSpec.model.EvaluatedInterestService;
import at.notamWebapp.evaluatedInterestSpec.view.EvaluatedInterestSpecificationForm;
import at.notamWebapp.util.DBConnector;
import at.notamWebapp.util.XMLUnmarshaller;
import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by khoef on 27.04.2017.
 */
public class EvalNotamController implements Button.ClickListener, ItemClickEvent.ItemClickListener {

    EvaluatedInterestService model;
    EvaluatedInterestSpecificationForm view;
    DBConnector conn = new DBConnector();

    public EvalNotamController(EvaluatedInterestSpecificationForm view){
        this.model = new EvaluatedInterestService(this);
        this.view = view;
    }

    public EvaluatedInterestSpecificationForm getView() {
        return view;
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        if(clickEvent.getButton().getId().equals("findExIS")){
            view.addLoadEvalInterestWindow();
        }
        else if(clickEvent.getButton().getId().equals("findExRS")){
            view.addLoadResultWindow();
        }

    /*================================================================================================================
    ================================================================================================================*/

        else if(clickEvent.getButton().getId().equals("saveRS")) {
            if(view.getMenu().getResultID().isValid() && model.isValid()) {
                String filename = view.getMenu().getResultID().getValue();
                if (model.getResult() != null) {
                    if (conn.noSuchFileExists(filename)) {
                        conn.createResult(model.getResult(), filename);
                    } else {
                        view.setAlreadyExistingFileWindow(filename);
                    }
                }
            }else if(!view.getMenu().getResultID().isValid()){
                view.getMenu().getResultID().focus();
                new Notification("Only [A-Z],[a-z],[0-9] and \"_\" are allowed for the Result ID",
                        Notification.Type.ERROR_MESSAGE)
                        .show(Page.getCurrent());
            }else if(!model.isValid()){
                view.getMenu().getResultID().focus();
                new Notification("No Evaluated Interest Specification found",
                        Notification.Type.ERROR_MESSAGE)
                        .show(Page.getCurrent());
            }else {
                new Notification("Something went wrong. IS not saved",
                        Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
            }
        }
        //Continue the saving off the file although there is an already existing file with the same name
        else if(clickEvent.getButton().getId().equals("contSave")){
            String filename = view.getMenu().getResultID().getValue();
            if(model.getResult()!=null) {
                conn.createResult(model.getResult(), filename);
            }
            view.removeExistingFileWindow();
        }
        //Cancel saving due to already existing filename
        else if(clickEvent.getButton().getId().equals("cancelSave")){
            view.removeExistingFileWindow();
            view.getMenu().getResultID().focus();
        }
    }
    /*================================================================================================================
    ================================================================================================================*/


    @Override
    public void itemClick(ItemClickEvent itemClickEvent) {
        if (itemClickEvent.getComponent().getId().equals("resultTable")) {
            model.setResult(model.loadResultFromDB(itemClickEvent.getItem().toString()));
            fillNotamFilterOptions();
        }

        if(itemClickEvent.getComponent().getId().equals("existingRSTable")){
            String existingRS = itemClickEvent.getItem().toString();
            DBConnector conn = new DBConnector();
            String interestString = conn.loadExistingResult(existingRS);
            view.removeLoadResultWindow();
            InterestSpecResultType interestSpec = XMLUnmarshaller.unmarshalInterestSpecResult(
                    new ByteArrayInputStream(interestString.getBytes(StandardCharsets.UTF_8)));
            model.setResult(interestSpec);
            fillNotamFilterOptions();
            view.drawMapElements(model);
            view.setResultsVisible();
        }

        if(itemClickEvent.getComponent().getId().equals("existingISTable")){
            String existingIS = itemClickEvent.getItem().toString();
            DBConnector conn = new DBConnector();
            String interestString = conn.loadExistingInterest(existingIS);
            InterestSpecificationType is = XMLUnmarshaller.unmarshalInterestSpecification(interestString);

            InterestSpecResultType interestSpec = SpecificInterestWS.evaluateInterestSpecification(is);
            view.removeLoadEvalInterestWindow();
            model.setResult(interestSpec);
            fillNotamFilterOptions();
            view.drawMapElements(model);
            view.setResultsVisible();
        }
    }

    public void fillNotamFilterOptions(){
        view.getNotamView().setImportanceLevel(model.getImportanceLevels());
        view.getNotamView().setBriefingPhaseLevels(model.getBriefingPhaseLevels());
        view.getNotamView().setNotamTable(model.getNotamTableValues(), view.getNotamMap());
        view.getNotamView().getClassificationCheckboxesLayout().setVisible(true);
    }
}
