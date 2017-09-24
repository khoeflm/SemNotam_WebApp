package at.notamWebapp.evaluatedInterestSpec.view.forms;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.evaluatedInterestSpec.model.NotamTableRow;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.filter.Or;
import com.vaadin.data.util.filter.SimpleStringFilter;
import com.vaadin.ui.*;
import org.vaadin.haijian.ExcelExporter;
import org.vaadin.haijian.PdfExporter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 23.03.2017.
 */
public class NotamViewForm extends Panel {

    private Panel eventLevelPanel;
    private GridLayout classificationCheckboxesLayout;
    private VerticalLayout importanceLevelLayout;
    private VerticalLayout flightPhaseLevelLayout;
    private VerticalLayout briefingLevelLayout;
    private VerticalLayout locationLevelLayout;
    private VerticalLayout tableLayout;
    private VerticalLayout eventLevelLayout;
    private CheckBox importanceCB, flightPhaseCB, briefingCB, locationCB, eventCB;
    private Table notamTable;
    private EvalNotamController controller;
    private Or importanceFilter, flightPhaseFilter, briefingFilter, locationFilter, eventFilter;
    private List<String> importanceFilterList, flightPhaseFilterList, briefingFilterList, locationFilterList,
            eventFilterList;
    private NotamMapForm notamMapForm;
    private BeanItemContainer<NotamTableRow> beans;

    public NotamViewForm(EvalNotamController controller) {
        setCaption("NOTAMs");
        this.controller = controller;
        classificationCheckboxesLayout = new GridLayout(4,2);
        importanceLevelLayout = new VerticalLayout();
        flightPhaseLevelLayout = new VerticalLayout();
        briefingLevelLayout = new VerticalLayout();
        locationLevelLayout = new VerticalLayout();
        eventLevelLayout = new VerticalLayout();
        VerticalLayout importanceLayout = new VerticalLayout();
        VerticalLayout flightPhaseLayout = new VerticalLayout();
        VerticalLayout briefingLayout = new VerticalLayout();
        VerticalLayout locationLayout = new VerticalLayout();
        VerticalLayout eventLayout = new VerticalLayout();
        Panel importanceLevelPanel = new Panel();
        Panel flightPhaseLevelPanel = new Panel();
        Panel briefingLevelPanel = new Panel();
        Panel locationLevelPanel = new Panel();
        eventLevelPanel = new Panel();

        importanceCB = new CheckBox("Importance");
        flightPhaseCB = new CheckBox("Flight Phase");
        briefingCB = new CheckBox("Briefing Package");
        locationCB = new CheckBox("Location");
        eventCB = new CheckBox("Events");
        VerticalLayout notamViewVertLayout = new VerticalLayout();
        tableLayout = new VerticalLayout();

        classificationCheckboxesLayout.setVisible(false);
        classificationCheckboxesLayout.setSpacing(true);
        classificationCheckboxesLayout.setMargin(true);
        importanceLevelLayout.setMargin(true);
        flightPhaseLevelLayout.setMargin(true);
        briefingLevelLayout.setMargin(true);
        locationLevelLayout.setMargin(true);
        eventLevelLayout.setMargin(true);

        classificationCheckboxesLayout.addComponents(importanceLayout, flightPhaseLayout, briefingLayout, locationLayout);
        classificationCheckboxesLayout.addComponent(eventLayout,0,1,1,1);
        classificationCheckboxesLayout.setColumnExpandRatio(0, (float) 0.25);
        classificationCheckboxesLayout.setColumnExpandRatio(1, (float) 0.25);
        classificationCheckboxesLayout.setColumnExpandRatio(2, (float) 0.25);
        classificationCheckboxesLayout.setColumnExpandRatio(3, (float) 0.25);

        notamViewVertLayout.setWidth("100%");
        notamViewVertLayout.setMargin(true);
        classificationCheckboxesLayout.setWidth("100%");
        importanceLayout.setSizeFull();
        flightPhaseLayout.setSizeFull();
        briefingLayout.setSizeFull();
        locationLayout.setSizeFull();

        importanceLayout.addComponents(importanceCB, importanceLevelPanel);
        flightPhaseLayout.addComponents(flightPhaseCB, flightPhaseLevelPanel);
        briefingLayout.addComponents(briefingCB, briefingLevelPanel);
        locationLayout.addComponents(locationCB, locationLevelPanel);
        eventLayout.addComponents(eventCB, eventLevelPanel);
        importanceLevelPanel.setContent(importanceLevelLayout);
        flightPhaseLevelPanel.setContent(flightPhaseLevelLayout);
        briefingLevelPanel.setContent(briefingLevelLayout);
        locationLevelPanel.setContent(locationLevelLayout);
        eventLevelPanel.setContent(eventLevelLayout);
        eventLevelPanel.setVisible(false);
        notamViewVertLayout.addComponents(classificationCheckboxesLayout, tableLayout);
        setContent(notamViewVertLayout);

        importanceCB.setValue(true);
        importanceCB.addValueChangeListener(valueChangeEvent ->
                {
                    if(!importanceCB.getValue()){
                        notamTable.setColumnCollapsed("importance", true);
                    }
                    else{
                        notamTable.setColumnCollapsed("importance", false);
                    }
                }
        );

        flightPhaseCB.setValue(true);
        flightPhaseCB.addValueChangeListener(valueChangeEvent ->
                {
                    if (!flightPhaseCB.getValue()) {
                        notamTable.setColumnCollapsed("flightPhase", true);
                    }
                    else{
                        notamTable.setColumnCollapsed("flightPhase", false);
                    }
                }
        );

        briefingCB.setValue(true);
        briefingCB.addValueChangeListener(valueChangeEvent ->
                {
                    if (!briefingCB.getValue()) {
                        notamTable.setColumnCollapsed("briefingPackage", true);
                    }
                    else{
                        notamTable.setColumnCollapsed("briefingPackage", false);
                    }
                }
        );

        locationCB.setValue(true);
        locationCB.addValueChangeListener(valueChangeEvent ->
                {
                    if (!locationCB.getValue()) {
                        notamTable.setColumnCollapsed("location", true);
                    }
                    else{
                        notamTable.setColumnCollapsed("location", false);
                    }
                }
        );

        eventCB.setValue(false);
        eventCB.addValueChangeListener(valueChangeEvent ->
                {
                    if(!eventCB.getValue()){
                        eventLevelPanel.setVisible(false);
                    }
                    else{
                        eventLevelPanel.setVisible(true);
                    }
                }
        );
    }

    private void setImportanceLevel(Set<String> importanceLevels) {
        importanceLevelLayout.removeAllComponents();
        importanceFilterList = new ArrayList<>();
        for(String s : importanceLevels){
            CheckBox x = new CheckBox(s);
            x.setId(s);
            x.setValue(true);
            importanceFilterList.add(s);
            x.addValueChangeListener(valueChangeEvent -> {
                if(valueChangeEvent.getProperty().getValue().equals(false)){
                    importanceFilterList.remove(x.getId());
                    filterImportanceValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
                else if(valueChangeEvent.getProperty().getValue().equals(true)){
                    importanceFilterList.add(x.getId());
                    filterImportanceValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
            });
            importanceLevelLayout.addComponent(x);
        }
    }

    private void setFlightPhaseLevels(Set<String> flightPhaseLevels){
        flightPhaseLevelLayout.removeAllComponents();
        flightPhaseFilterList = new ArrayList<>();
        for(String s : flightPhaseLevels){
            CheckBox x = new CheckBox(s);
            x.setId(s);
            flightPhaseFilterList.add(s);
            x.setValue(true);
            x.addValueChangeListener(valueChangeEvent -> {
                if(valueChangeEvent.getProperty().getValue().equals(false)) {
                    flightPhaseFilterList.remove(x.getId());
                    filterflightPhaseValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
                else if(valueChangeEvent.getProperty().getValue().equals(true)){
                    flightPhaseFilterList.add(x.getId());
                    filterflightPhaseValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
            });
            flightPhaseLevelLayout.addComponent(x);
        }
    }

    private void filterImportanceValues() {
        beans.removeContainerFilter(importanceFilter);
        SimpleStringFilter[] filterList = new SimpleStringFilter[importanceFilterList.size()];
        int i=0;
        for(String s : importanceFilterList){
            filterList[i] = new SimpleStringFilter("importance", s, true, false);
            i++;
        }
        importanceFilter = new Or(filterList);
        beans.addContainerFilter(importanceFilter);
    }

    private void filterflightPhaseValues(){
        beans.removeContainerFilter(flightPhaseFilter);
        SimpleStringFilter[] filterList = new SimpleStringFilter[flightPhaseFilterList.size()];
        int i=0;
        for(String s : flightPhaseFilterList){
            filterList[i] = (new SimpleStringFilter("flightPhase", s, true, false));
            i++;
        }
        flightPhaseFilter = new Or(filterList);
        beans.addContainerFilter(flightPhaseFilter);
    }

    public GridLayout getClassificationCheckboxesLayout() {
        return classificationCheckboxesLayout;
    }

    public void setNotamTable(List<NotamTableRow> notamRows, NotamMapForm notamMap) {
        beans = new BeanItemContainer<>(NotamTableRow.class);
        beans.addAll(notamRows);
        fillNotamTable(beans);
    }

    private void fillNotamTable(BeanItemContainer<NotamTableRow> beans){
        this.notamTable = new Table();
        tableLayout.removeAllComponents();
        notamTable.setId("notamTable");
        notamTable.setContainerDataSource(beans);
        notamTable.setVisibleColumns("notamId", "notamText", "begin", "end", "importance", "flightPhase",
                "location", "briefingPackage", "eventScenario");
        notamTable.setPageLength(5);
        notamTable.setSelectable(true);
        notamTable.setImmediate(true);
        notamTable.addItemClickListener(controller);
        notamTable.setColumnCollapsingAllowed(true);
        tableLayout.addComponent(notamTable);
        tableLayout.setMargin(true);
        tableLayout.setSizeFull();
        notamTable.setWidth("100%");
        tableLayout.setComponentAlignment(notamTable, Alignment.TOP_LEFT);


        PdfExporter pdfExporter = new PdfExporter(notamTable);
        pdfExporter.setCaption("Export to PDF");
        ExcelExporter excelExporter = new ExcelExporter(notamTable);
        excelExporter.setCaption("Export to Excel");

        HorizontalLayout exporterLayout = new HorizontalLayout(pdfExporter, excelExporter);
        tableLayout.addComponent(exporterLayout);

        notamTable.addItemClickListener(controller);
    }

    public NotamMapForm getNotamMapForm() {
        return notamMapForm;
    }

    public void setNotamMapForm(NotamMapForm notamMapForm) {
        this.notamMapForm = notamMapForm;
    }

    public void setFilterLevels(List<Set<String>> filterLevels) {
        setImportanceLevel(filterLevels.get(0));
        setFlightPhaseLevels(filterLevels.get(1));
        setLocationLevels(filterLevels.get(2));
        setBriefingLevels(filterLevels.get(3));
        setEventLevels(filterLevels.get(4));
    }

    private void setBriefingLevels(Set<String> briefingLevels) {
        briefingLevelLayout.removeAllComponents();
        briefingFilterList = new ArrayList<>();
        for(String s : briefingLevels){
            CheckBox x = new CheckBox(s);
            x.setId(s);
            x.setValue(true);
            briefingFilterList.add(s);
            x.addValueChangeListener(valueChangeEvent -> {
                if(valueChangeEvent.getProperty().getValue().equals(false)){
                    briefingFilterList.remove(x.getId());
                    filterBriefingValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
                else if(valueChangeEvent.getProperty().getValue().equals(true)){
                    briefingFilterList.add(x.getId());
                    filterBriefingValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
            });
            briefingLevelLayout.addComponent(x);
        }
    }

    private void setLocationLevels(Set<String> locationLevels) {
        locationLevelLayout.removeAllComponents();
        locationFilterList = new ArrayList<>();
        for(String s : locationLevels){
            CheckBox x = new CheckBox(s);
            x.setId(s);
            x.setValue(true);
            locationFilterList.add(s);
            x.addValueChangeListener(valueChangeEvent -> {
                if(valueChangeEvent.getProperty().getValue().equals(false)){
                    locationFilterList.remove(x.getId());
                    filterLocationValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
                else if(valueChangeEvent.getProperty().getValue().equals(true)){
                    locationFilterList.add(x.getId());
                    filterLocationValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
            });
            locationLevelLayout.addComponent(x);
        }
    }

    private void filterBriefingValues() {
        beans.removeContainerFilter(briefingFilter);
        SimpleStringFilter[] filterList = new SimpleStringFilter[briefingFilterList.size()];
        int i=0;
        for(String s : briefingFilterList){
            filterList[i] = (new SimpleStringFilter("briefingPackage", s, true, false));
            i++;
        }
        briefingFilter = new Or(filterList);
        beans.addContainerFilter(briefingFilter);
    }

    private void filterLocationValues() {
        beans.removeContainerFilter(locationFilter);
        SimpleStringFilter[] filterList = new SimpleStringFilter[locationFilterList.size()];
        int i=0;
        for(String s : locationFilterList){
            filterList[i] = (new SimpleStringFilter("location", s, true, false));
            i++;
        }
        locationFilter = new Or(filterList);
        beans.addContainerFilter(locationFilter);
    }

    public Table getNotamTable() {
        return notamTable;
    }

    public void selectTableItem(String caption) {
        List<NotamTableRow> notamList = beans.getItemIds();
        for(NotamTableRow notam : notamList){
            if(notam.getNotamId().equals(caption)){
                notamMapForm.closeInfoWindow();
                notamMapForm.setInfoWindow(notam);
                notamTable.select(notam);
                notamTable.setCurrentPageFirstItemId(notam);
            }
        }
    }

    private void setEventLevels(Set<String> eventLevels) {
        eventFilterList = new ArrayList<>();
        TwinColSelect twinColSelect = new TwinColSelect();
        twinColSelect.setLeftColumnCaption("Inactive Events");
        twinColSelect.setRightColumnCaption("Active Events");
        twinColSelect.addItems(eventLevels);
        twinColSelect.setRows(10);
        twinColSelect.setSizeFull();
        twinColSelect.setValue(eventLevels);
        twinColSelect.addValueChangeListener(
              valueChangeEvent -> {
                  eventFilterList.clear();
                  eventFilterList.addAll((Collection<? extends String>) twinColSelect.getValue());
                  filterEventValues();
                  notamMapForm.filterNotamMap(beans.getItemIds());
              }
        );
        eventLevelLayout.addComponent(twinColSelect);
    }

    private void filterEventValues() {
        beans.removeContainerFilter(eventFilter);
        SimpleStringFilter[] filterList = new SimpleStringFilter[eventFilterList.size()];
        int i=0;
        for(String s : eventFilterList){
            filterList[i] = (new SimpleStringFilter("eventScenario", s, true, false));
            i++;
        }
        eventFilter = new Or(filterList);
        beans.addContainerFilter(eventFilter);
    }

}

