package at.notamWebapp.evaluatedInterestSpec.controller;

import at.notamWebapp.util.DBConnector;
import at.notamWebapp.util.XMLUnmarshaller;
import at.notamWebapp.evaluatedInterestSpec.model.EvaluatedInterestService;
import at.notamWebapp.evaluatedInterestSpec.view.EvaluatedInterestSpecificationForm;
import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Button;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.List;

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
        if (clickEvent.getButton().getId().equals("findExRS")){
            view.addLoadEvalInterestWindow();
            view.setResultsVisible();
        }
        else if(clickEvent.getButton().getId().equals("findExIS")){
            InterestSpecificationType is = new InterestSpecificationType();
            model.loadResultfromWS(is);
            fillNotamFilterOptions();
            view.drawMapElements(model);
            view.setResultsVisible();
        }
        else if(clickEvent.getButton().getId().equals("queryRS")){
            DBConnector conn = new DBConnector();
            try {
                List<String> rsIdList = conn.loadResultIds();
                int i = 1;
                for(String rsItem : rsIdList){
                    view.getLoadEvalInterestWindow().getResultTable().addItem(new Object[]{rsItem}, i);
                    i++;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if(clickEvent.getButton().getId().equals("loadRS")){
            view.addLoadResultWindow();
        }

    /*================================================================================================================
    ================================================================================================================*/

        else if(clickEvent.getButton().getId().equals("saveRS")) {
            String filename = view.getMenu().getResultID().getValue();
            if (model.getResult() != null) {
                if (conn.noSuchFileExists(filename)) {
                    conn.createResult(model.getResult(), filename);
                } else {
                    view.setAlreadyExistingFileWindow(filename);
                }
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
            String existingIS = itemClickEvent.getItem().toString();
            DBConnector conn = new DBConnector();
            String interestString = conn.loadExistingResult(existingIS);
            view.removeLoadResultWindow();
            InterestSpecResultType interestSpec = XMLUnmarshaller.unmarshalInterestSpecResult(
                    new ByteArrayInputStream(interestString.getBytes(StandardCharsets.UTF_8)));
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
