package at.notamWebapp.evaluatedInterestSpec.controller;

import at.notamWebapp.evaluatedInterestSpec.model.EvaluatedInterestService;
import at.notamWebapp.evaluatedInterestSpec.model.NotamTableRow;
import at.notamWebapp.evaluatedInterestSpec.view.EvaluatedInterestSpecificationForm;
import at.notamWebapp.util.xmlHandler.XMLParserService;
import at.notamWebapp.util.xmlHandler.XMLUnmarshaller;
import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;
import com.vaadin.data.util.BeanItem;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.server.Page;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.tapio.googlemaps.client.events.MarkerClickListener;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 27.04.2017.
 */
public class EvalNotamController implements Button.ClickListener, ItemClickEvent.ItemClickListener, MarkerClickListener {

    private EvaluatedInterestService model;
    private EvaluatedInterestSpecificationForm view;

    public EvalNotamController(EvaluatedInterestSpecificationForm view){
        this.model = new EvaluatedInterestService();
        this.view = view;
    }

    public EvaluatedInterestSpecificationForm getView() {
        return view;
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        if(clickEvent.getButton().getId().equals("findExIS")){
            view.addLoadEvalInterestWindow();
            view.getLoadEvalInterestWindow().focus();
        }
        else if(clickEvent.getButton().getId().equals("findExRS")){
            view.addLoadResultWindow();
            view.getLoadResultWindow().focus();
        }

    /*================================================================================================================
    ================================================================================================================*/

        else if(clickEvent.getButton().getId().equals("saveRS")) {
            if(view.getMenu().getResultID().isValid() && model.isValid()) {
                String filename = view.getMenu().getResultID().getValue();
                if (model.getResult() != null) {
                    if (XMLParserService.noSuchFileExists(filename, "tmp/Result")) {
                        XMLParserService.createXMLFile(model.getResult(), filename, "tmp/Result");
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
                XMLParserService.createXMLFile(model.getResult(), filename, "tmp/Result");
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
        if(itemClickEvent.getComponent().getId().equals("existingRSTable")){
            String existingRSName = itemClickEvent.getItem().toString();
            String interestString = XMLUnmarshaller.loadXMLFile(existingRSName, "tmp/Result");
            view.removeLoadResultWindow();
            InterestSpecResultType interestSpec = null;
            if (interestString != null) {
                interestSpec = XMLUnmarshaller.unmarshalInterestSpecResult(
                        new ByteArrayInputStream(interestString.getBytes(StandardCharsets.UTF_8)));
            }
            model.setResult(interestSpec);
            fillNotamFilterOptions();
            view.drawMapElements(model);
            view.setResultsVisible();
        }
        else if(itemClickEvent.getComponent().getId().equals("existingISTable")){
            String existingISName = itemClickEvent.getItem().toString();
            String interestString = XMLUnmarshaller.loadXMLFile(existingISName, "tmp/InterestSpecification/");
            InterestSpecificationType is = XMLUnmarshaller.unmarshalInterestSpecification(interestString);
            InterestSpecResultType interestSpec = SpecificInterestWS.evaluateInterestSpecification(is);
            view.removeLoadEvalInterestWindow();
            model.setResult(interestSpec);
            fillNotamFilterOptions();
            view.drawMapElements(model);
            view.setResultsVisible();
        }
        else if(itemClickEvent.getComponent().getId().equals("notamTable")){
            BeanItem<NotamTableRow> item = (BeanItem<NotamTableRow>) itemClickEvent.getItem();
            NotamTableRow selectedNotam = item.getBean();
            List<LatLon> notamPosition = model.getNotamPosition(selectedNotam.getNotamId());
            view.getNotamMap().setInfoWindow(selectedNotam);
            view.getNotamMap().fitToBounds(notamPosition);
        }
    }

    /*================================================================================================================
    ================================================================================================================*/

    private void fillNotamFilterOptions(){
        view.getNotamView().setFilterLevels(model.getFilterLevels());
        view.getNotamView().setNotamTable(model.getNotamTableValues(), view.getNotamMap());
        view.getNotamView().getClassificationCheckboxesLayout().setVisible(true);
    }

    /*================================================================================================================
    ================================================================================================================*/

    @Override
    public void markerClicked(GoogleMapMarker googleMapMarker) {
        view.getNotamView().selectTableItem(googleMapMarker.getCaption());
    }
}
