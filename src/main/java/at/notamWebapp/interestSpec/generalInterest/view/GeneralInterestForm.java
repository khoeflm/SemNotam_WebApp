package at.notamWebapp.interestSpec.generalInterest.view;

import at.notamWebapp.interestSpec.generalInterest.controller.GeneralInterest;
import at.notamWebapp.interestSpec.generalInterest.view.windows.ElementLoadWindow;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by khoef on 01.03.2017.
 */
public class GeneralInterestForm extends Panel {

    private Button bTempFilterDim, bTempDim, bSpatialFilterDim, bSpatialDim, bSpatial4dDim,
            bAircraftDim, bDataFormat, bDataType;
    private Button delTempFilterDim, delTempDim, delSpatialFilterDim, delSpatialDim, delSpatial4Dim, delAircraftDim,
            delDataFormat, delDataType;
    private TextField tfTempFilterDim, tfTempDim, tfSpatialFilterDim, tfSpatialDim, tfSpatial4dDim,
            tfAircraftDim, tfDataFormat, tfDataType;
    private GridLayout giFormLayout;
    private ElementLoadWindow elw = new ElementLoadWindow();
    private GeneralInterest generalInterestController;

    public GeneralInterestForm(GeneralInterest controller){
        setCaption("General Interest");
        giFormLayout = new GridLayout(3, 8);
        giFormLayout.setSpacing(true);
        giFormLayout.setMargin(true);
        giFormLayout.setDefaultComponentAlignment(Alignment.BOTTOM_LEFT);
        setContent(giFormLayout);
        generalInterestController = controller;

        tfTempFilterDim = new TextField("Temporal Filter Dimension");
        tfTempDim = new TextField("Temporal Dimension");
        tfSpatialFilterDim = new TextField("Spatial Filter Dimension");
        tfSpatialDim = new TextField("Spatial Dimension");
        tfSpatial4dDim = new TextField("Spatial Temporal 4D Dimension");
        tfAircraftDim = new TextField("Aircraft Dimension");
        tfDataFormat = new TextField("Data Model");
        tfDataType = new TextField("Data Type");

        tfTempFilterDim.setEnabled(false);
        tfTempDim.setEnabled(false);
        tfSpatialFilterDim.setEnabled(false);
        tfSpatialDim.setEnabled(false);
        tfSpatial4dDim.setEnabled(false);
        tfAircraftDim.setEnabled(false);
        tfDataFormat.setEnabled(false);
        tfDataType.setEnabled(false);

        // Webservice Call Buttons
        bTempFilterDim = new Button( null ,controller);
        bTempDim = new Button(null, controller);
        bSpatialFilterDim = new Button(null, controller);
        bSpatialDim = new Button(null, controller);
        bSpatial4dDim = new Button(null, controller);
        bAircraftDim = new Button(null, controller);
        bDataFormat = new Button(null, controller);
        bDataType = new Button(null, controller);

        bTempFilterDim.setIcon(VaadinIcons.SEARCH, "SEARCH");
        bTempDim.setIcon(VaadinIcons.SEARCH, "SEARCH");
        bSpatialFilterDim.setIcon(VaadinIcons.SEARCH, "SEARCH");
        bSpatialDim.setIcon(VaadinIcons.SEARCH, "SEARCH");
        bSpatial4dDim.setIcon(VaadinIcons.SEARCH, "SEARCH");
        bAircraftDim.setIcon(VaadinIcons.SEARCH, "SEARCH");
        bDataFormat.setIcon(VaadinIcons.SEARCH, "SEARCH");
        bDataType.setIcon(VaadinIcons.SEARCH, "SEARCH");

        bTempFilterDim.setId("gi1");
        bTempDim.setId("gi2");
        bSpatialFilterDim.setId("gi3");
        bSpatialDim.setId("gi4");
        bSpatial4dDim.setId("gi5");
        bAircraftDim.setId("gi6");
        bDataFormat.setId("gi7");
        bDataType.setId("gi8");

        bTempDim.setEnabled(false);
        bSpatialDim.setEnabled(false);

        //Buttons to delete Concepts
        delTempFilterDim = new Button("Delete", controller);
        delTempDim = new Button("Delete", controller);
        delSpatialFilterDim = new Button("Delete", controller);
        delSpatialDim = new Button("Delete", controller);
        delSpatial4Dim = new Button("Delete", controller);
        delAircraftDim = new Button("Delete", controller);
        delDataFormat = new Button("Delete", controller);
        delDataType = new Button("Delete", controller);

        delTempFilterDim.setId("del1");
        delTempDim.setId("del2");
        delSpatialFilterDim.setId("del3");
        delSpatialDim.setId("del4");
        delSpatial4Dim.setId("del5");
        delAircraftDim.setId("del6");
        delDataFormat.setId("del7");
        delDataType.setId("del8");

        giFormLayout.addComponents(tfTempFilterDim, bTempFilterDim, delTempFilterDim, tfTempDim, bTempDim, delTempDim,
                tfSpatialFilterDim, bSpatialFilterDim, delSpatialFilterDim, tfSpatialDim, bSpatialDim, delSpatialDim,
                tfSpatial4dDim, bSpatial4dDim, delSpatial4Dim, tfAircraftDim, bAircraftDim, delAircraftDim,
                tfDataFormat, bDataFormat, delDataFormat, tfDataType, bDataType, delDataType);
        giFormLayout.setDefaultComponentAlignment(Alignment.BOTTOM_LEFT);
    }

    public ElementLoadWindow getElw() {
        return elw;
    }

    public void setElw(ElementLoadWindow elw) {
        this.elw = elw;
        getUI().addWindow(elw);
    }

    public GridLayout getGiFormLayout() {
        return giFormLayout;
    }

    public TextField getTfTempFilterDim() {
        return tfTempFilterDim;
    }

    public TextField getTfTempDim() {
        return tfTempDim;
    }

    public TextField getTfSpatialFilterDim() {
        return tfSpatialFilterDim;
    }

    public TextField getTfSpatialDim() {
        return tfSpatialDim;
    }

    public TextField getTfSpatial4dDim() {
        return tfSpatial4dDim;
    }

    public TextField getTfAircraftDim() {
        return tfAircraftDim;
    }

    public TextField getTfDataFormat() {
        return tfDataFormat;
    }

    public TextField getTfDataType() {
        return tfDataType;
    }

    public GeneralInterest getGeneralInterestController(){
        return generalInterestController;
    }

    public void setConceptInElw(String concept) {}

    public Button getbTempDim() {
        return bTempDim;
    }

    public Button getbSpatialDim() {
        return bSpatialDim;
    }

    public Button getbSpatial4dDim() {
        return bSpatial4dDim;
    }

    public Button getDelTempDim() {
        return delTempDim;
    }

    public Button getDelSpatialDim() {
        return delSpatialDim;
    }

    public void removeWindow() {
        getUI().removeWindow(getElw());
    }


    public boolean isValid() {
        if(tfAircraftDim.isEmpty()&&tfSpatial4dDim.isEmpty()&&tfSpatialDim.isEmpty()&&tfTempDim.isEmpty()){
            return false;
        } else return true;
    }

    public ArrayList<String> getDimStringList() {
        ArrayList<String> dimStringList = new ArrayList<>();
        dimStringList.add(tfTempFilterDim.getValue());
        dimStringList.add(tfTempDim.getValue());
        dimStringList.add(tfSpatialFilterDim.getValue());
        dimStringList.add(tfSpatialDim.getValue());
        dimStringList.add(tfSpatial4dDim.getValue());
        dimStringList.add(tfAircraftDim.getValue());
        dimStringList.add(tfDataFormat.getValue());
        dimStringList.add(tfDataType.getValue());
        return dimStringList;
    }

    public void setDimStrings(String generalInteresDims) {
        List<String> dims = Arrays.asList(generalInteresDims.split(";"));
        tfTempFilterDim.setValue(dims.get(0));
        tfTempDim.setValue(dims.get(1));
        tfSpatialFilterDim.setValue(dims.get(2));
        tfSpatialDim.setValue(dims.get(3));
        tfSpatial4dDim.setValue(dims.get(4));
        tfAircraftDim.setValue(dims.get(5));
        tfDataFormat.setValue(dims.get(6));
        tfDataType.setValue(dims.get(7));
    }
}
