package at.notamWebapp.evaluatedInterestSpec.view;

import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.evaluatedInterestSpec.model.NotamTableRow;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.filter.Or;
import com.vaadin.data.util.filter.SimpleStringFilter;
import com.vaadin.ui.*;
import org.vaadin.haijian.ExcelExporter;
import org.vaadin.haijian.PdfExporter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by khoef on 23.03.2017.
 */
public class NotamViewForm extends Panel {

    private Panel importanceLevelPanel, flightPhaseLevelPanel, briefingLevelPanel, locationLevelPanel;
    private GridLayout classificationCheckboxesLayout;
    private VerticalLayout importanceLevelLayout, flightPhaseLevelLayout, briefingLevelLayout, locationLevelLayout,
            importanceLayout, flightPhaseLayout, briefingLayout, locationLayout, notamViewVertLayout, tableLayout;
    private CheckBox importanceCB, flightPhaseCB, briefingCB, locationCB;
    private Table notamTable;
    private EvalNotamController controller;
    private Or importanceFilter, flightPhaseFilter, briefingFilter, locationFilter;
    private List<String> importanceFilterList, flightPhaseFilterList, briefingFilterList, locationFilterList;
    private NotamMapForm notamMapForm;
    BeanItemContainer<NotamTableRow> beans;

    public NotamViewForm(EvalNotamController controller) {
        setCaption("NOTAMs");
        this.controller = controller;
        classificationCheckboxesLayout = new GridLayout(4,1);
        importanceLevelLayout = new VerticalLayout();
        flightPhaseLevelLayout = new VerticalLayout();
        briefingLevelLayout = new VerticalLayout();
        locationLevelLayout = new VerticalLayout();
        importanceLayout= new VerticalLayout();
        flightPhaseLayout = new VerticalLayout();
        briefingLayout = new VerticalLayout();
        locationLayout = new VerticalLayout();
        importanceLevelPanel = new Panel();
        flightPhaseLevelPanel = new Panel();
        briefingLevelPanel = new Panel();
        locationLevelPanel = new Panel();
        importanceCB = new CheckBox("Importance");
        flightPhaseCB = new CheckBox("Flight Phase");
        briefingCB = new CheckBox("Briefing Package");
        locationCB = new CheckBox("Location");
        notamViewVertLayout = new VerticalLayout();
        tableLayout = new VerticalLayout();

        classificationCheckboxesLayout.setVisible(false);
        classificationCheckboxesLayout.setSpacing(true);
        classificationCheckboxesLayout.setMargin(true);
        importanceLevelLayout.setMargin(true);
        flightPhaseLevelLayout.setMargin(true);
        briefingLevelLayout.setMargin(true);
        locationLevelLayout.setMargin(true);

        classificationCheckboxesLayout.addComponents(importanceLayout, flightPhaseLayout, briefingLayout, locationLayout);
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
        importanceLevelPanel.setContent(importanceLevelLayout);
        flightPhaseLevelPanel.setContent(flightPhaseLevelLayout);
        briefingLevelPanel.setContent(briefingLevelLayout);
        locationLevelPanel.setContent(locationLevelLayout);
        notamViewVertLayout.addComponents(classificationCheckboxesLayout, tableLayout);
        setContent(notamViewVertLayout);

        importanceCB.setValue(true);
        importanceCB.addValueChangeListener(valueChangeEvent ->
                {
                    if(!importanceCB.getValue()){
                        notamTable.setColumnCollapsed("importance", true);
                        /*int cbCount = importanceLevelLayout.getComponentCount();
                        for(int i = 0; i<cbCount;i++){
                           CheckBox cur = (CheckBox) importanceLevelLayout.getComponent(i);
                           cur.setValue(false);
                        }*/
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
                        /*int cbCount = flightPhaseLevelLayout.getComponentCount();
                        for (int i = 0; i < cbCount; i++) {
                            CheckBox cur = (CheckBox) flightPhaseLevelLayout.getComponent(i);
                            cur.setValue(false);
                        }*/
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
                        /*int cbCount = flightPhaseLevelLayout.getComponentCount();
                        for (int i = 0; i < cbCount; i++) {
                            CheckBox cur = (CheckBox) flightPhaseLevelLayout.getComponent(i);
                            cur.setValue(false);
                        }*/
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
                        /*int cbCount = flightPhaseLevelLayout.getComponentCount();
                        for (int i = 0; i < cbCount; i++) {
                            CheckBox cur = (CheckBox) flightPhaseLevelLayout.getComponent(i);
                            cur.setValue(false);
                        }*/
                    }
                    else{
                        notamTable.setColumnCollapsed("location", false);
                    }
                }
        );
    }

    public void setImportanceLevel(Set<String> importanceLevels) {
        importanceLevelLayout.removeAllComponents();
        importanceFilterList = new ArrayList<String>();
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

    public void setFlightPhaseLevels(Set<String> flightPhaseLevels){
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
        beans = new BeanItemContainer<NotamTableRow>(NotamTableRow.class);
        beans.addAll(notamRows);
        fillNotamTable(beans);
    }

    private void fillNotamTable(BeanItemContainer<NotamTableRow> beans){
        this.notamTable = new Table();
        tableLayout.removeAllComponents();
        notamTable.setId("notamTable");
        notamTable.setContainerDataSource(beans);
        notamTable.setVisibleColumns(new Object[]{"notamId", "notamText", "begin", "end", "importance", "flightPhase",
                "location", "briefingPackage"});
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
    }

    private void setBriefingLevels(Set<String> briefingLevels) {
        briefingLevelLayout.removeAllComponents();
        briefingFilterList = new ArrayList<String>();
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
        locationFilterList = new ArrayList<String>();
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
                notamTable.select(notam);
                notamMapForm.closeInfoWindow();
            }
        }
    }
}
