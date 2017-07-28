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

/**
 * Created by khoef on 23.03.2017.
 */
public class NotamViewForm extends Panel {

    private Panel importanceLevelPanel, briefingPhaseLevelPanel;
    private HorizontalLayout classificationCheckboxesLayout;
    private VerticalLayout importanceLevelLayout, briefingPhaseLevelLayout,importanceLayout, briefingPhaseLayout,
            notamViewVertLayout;
    private CheckBox importanceCB, briefingPhaseCB;
    private Table notamTable;
    private EvalNotamController controller;
    private Or importanceFilter, briefingPhaseFilter;
    private List<String> importanceFilterList, briefingPhaseFilterList;
    private NotamMapForm notamMapForm;
    BeanItemContainer<NotamTableRow> beans;

    public NotamViewForm(EvalNotamController controller) {
        setCaption("NOTAMs");
        this.controller = controller;
        classificationCheckboxesLayout = new HorizontalLayout();
        importanceLevelLayout = new VerticalLayout();
        briefingPhaseLevelLayout = new VerticalLayout();
        importanceLayout= new VerticalLayout();
        briefingPhaseLayout = new VerticalLayout();
        importanceLevelPanel = new Panel();
        briefingPhaseLevelPanel = new Panel();
        importanceCB = new CheckBox("Importance");
        briefingPhaseCB = new CheckBox("Briefing Phase");
        notamViewVertLayout = new VerticalLayout();

        classificationCheckboxesLayout.setVisible(false);
        classificationCheckboxesLayout.setSpacing(true);
        classificationCheckboxesLayout.setMargin(true);
        importanceLevelLayout.setMargin(true);
        briefingPhaseLevelLayout.setMargin(true);

        importanceLayout.addComponents(importanceCB, importanceLevelPanel);
        briefingPhaseLayout.addComponents(briefingPhaseCB, briefingPhaseLevelPanel);
        classificationCheckboxesLayout.addComponents(importanceLayout, briefingPhaseLayout);
        importanceLevelPanel.setContent(importanceLevelLayout);
        briefingPhaseLevelPanel.setContent(briefingPhaseLevelLayout);
        notamViewVertLayout.addComponent(classificationCheckboxesLayout);
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

        briefingPhaseCB.setValue(true);
        briefingPhaseCB.addValueChangeListener(valueChangeEvent ->
                {
                    if (!briefingPhaseCB.getValue()) {
                        notamTable.setColumnCollapsed("briefingPhase", true);
                        /*int cbCount = briefingPhaseLevelLayout.getComponentCount();
                        for (int i = 0; i < cbCount; i++) {
                            CheckBox cur = (CheckBox) briefingPhaseLevelLayout.getComponent(i);
                            cur.setValue(false);
                        }*/
                    }
                    else{
                        notamTable.setColumnCollapsed("briefingPhase", false);
                    }
                }
        );
    }

    public void setImportanceLevel(List<String> importanceLevels) {
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

    public void setBriefingPhaseLevels(List<String> briefingPhaseLevels){
        briefingPhaseLevelLayout.removeAllComponents();
        briefingPhaseFilterList = new ArrayList<>();
        for(String s : briefingPhaseLevels){
            CheckBox x = new CheckBox(s);
            x.setId(s);
            briefingPhaseFilterList.add(s);
            x.setValue(true);
            x.addValueChangeListener(valueChangeEvent -> {
                if(valueChangeEvent.getProperty().getValue().equals(false)) {
                    briefingPhaseFilterList.remove(x.getId());
                    filterImportanceValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
                else if(valueChangeEvent.getProperty().getValue().equals(true)){
                    briefingPhaseFilterList.add(x.getId());
                    filterBriefingPhaseValues();
                    notamMapForm.filterNotamMap(beans.getItemIds());
                }
            });
            briefingPhaseLevelLayout.addComponent(x);
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

    private void filterBriefingPhaseValues(){
        beans.removeContainerFilter(briefingPhaseFilter);
        SimpleStringFilter[] filterList = new SimpleStringFilter[briefingPhaseFilterList.size()];
        int i=0;
        for(String s : briefingPhaseFilterList){
            filterList[i] = (new SimpleStringFilter("briefingPhase", s, true, false));
            i++;
        }
        briefingPhaseFilter = new Or(filterList);
        beans.addContainerFilter(briefingPhaseFilter);
    }

    public HorizontalLayout getClassificationCheckboxesLayout() {
        return classificationCheckboxesLayout;
    }

    public void setNotamTable(List<NotamTableRow> notamRows, NotamMapForm notamMap) {
        beans = new BeanItemContainer<NotamTableRow>(NotamTableRow.class);
        beans.addAll(notamRows);
        fillNotamTable(beans);
    }

    private void fillNotamTable(BeanItemContainer<NotamTableRow> beans){
        notamViewVertLayout.removeAllComponents();
        this.notamTable = new Table();
        notamTable.setId("notamTable");
        notamTable.setContainerDataSource(beans);
        notamTable.setVisibleColumns(new Object[]{"notamId", "notamText", "begin", "end", "importance", "briefingPhase"});
        notamTable.setPageLength(5);
        //notamTable.setSelectable(true);
        notamTable.setImmediate(true);
        notamTable.addItemClickListener(controller);
        notamTable.setColumnCollapsingAllowed(true);
        VerticalLayout tableLayout = new VerticalLayout(notamTable);
        tableLayout.setMargin(true);
        tableLayout.setSizeFull();
        notamTable.setWidth("90%");
        tableLayout.setComponentAlignment(notamTable, Alignment.TOP_LEFT);


        PdfExporter pdfExporter = new PdfExporter(notamTable);
        pdfExporter.setCaption("Export to PDF");
        ExcelExporter excelExporter = new ExcelExporter(notamTable);
        excelExporter.setCaption("Export to Excel");

        HorizontalLayout exporterLayout = new HorizontalLayout(pdfExporter, excelExporter);
        tableLayout.addComponent(exporterLayout);
        notamViewVertLayout.addComponents(tableLayout);
    }

    public NotamMapForm getNotamMapForm() {
        return notamMapForm;
    }

    public void setNotamMapForm(NotamMapForm notamMapForm) {
        this.notamMapForm = notamMapForm;
    }
}
