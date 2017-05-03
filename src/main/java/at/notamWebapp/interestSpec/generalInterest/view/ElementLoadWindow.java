package at.notamWebapp.interestSpec.generalInterest.view;

import at.notamWebapp.interestSpec.generalInterest.controller.GeneralInterest;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import java.util.List;

/**
 * Created by khoef on 27.03.2017.
 */
public class ElementLoadWindow extends Window{

    private VerticalLayout mainLayout = new VerticalLayout();
    private Label errorMessages = new Label("");
    private Table table = new Table();
    private String selected = new String();

    public ElementLoadWindow(){
        setVisible(false);
    };

    public ElementLoadWindow(GeneralInterest controller, List<String> list, int id){
        table.addContainerProperty("Item", String.class, null);
        table.setId(String.valueOf(id));
        int i = 1;
        for(String s : list){
            table.addItem(new Object[]{s},  i);
            i++;
        }
        table.setPageLength(table.size());
        table.setSelectable(true);
        table.setImmediate(true);
        //table.addValueChangeListener(controller);
        table.addItemClickListener(controller);
        mainLayout.setMargin(true);
        mainLayout.addComponents(table, errorMessages);
        center();
        setSizeUndefined();
        setContent(mainLayout);
        setVisible(true);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }

    public void showLoadErrorMessage(String interestString) {

    }

    public Table getTable() {
        return table;
    }
}
