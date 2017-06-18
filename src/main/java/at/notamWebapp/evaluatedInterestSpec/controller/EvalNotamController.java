package at.notamWebapp.evaluatedInterestSpec.controller;

import at.notamWebapp.DBConnector;
import at.notamWebapp.evaluatedInterestSpec.model.EvaluatedInterestService;
import at.notamWebapp.evaluatedInterestSpec.view.EvaluatedInterestSpecificationForm;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.ui.Button;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by khoef on 27.04.2017.
 */
public class EvalNotamController implements Button.ClickListener, ItemClickEvent.ItemClickListener {

    EvaluatedInterestService model;
    EvaluatedInterestSpecificationForm view;

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
    }

    @Override
    public void itemClick(ItemClickEvent itemClickEvent) {
        if(itemClickEvent.getComponent().getId().equals("notamTable")){

        }
        else if (itemClickEvent.getComponent().getId().equals("resultTable")) {
            model.setResult(model.loadResultFromDB(itemClickEvent.getItem().toString()));
            fillNotamFilterOptions();
        }
    }

    public void fillNotamFilterOptions(){
        view.getNotamView().setImportanceLevel(model.getImportanceLevels());
        view.getNotamView().setBriefingPhaseLevels(model.getBriefingPhaseLevels());
        view.getNotamView().setNotamTable(model.getNotamTableValues());
        view.getNotamView().getClassificationCheckboxesLayout().setVisible(true);
    }
}
