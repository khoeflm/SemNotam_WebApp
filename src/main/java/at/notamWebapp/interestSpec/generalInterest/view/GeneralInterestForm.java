package at.notamWebapp.interestSpec.generalInterest.view;

import at.notamWebapp.interestSpec.generalInterest.controller.GeneralInterest;
import at.notamWebapp.interestSpec.view.SemNotamUI;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;

/**
 * Created by khoef on 01.03.2017.
 */
public class GeneralInterestForm extends Panel {

    private Button bTempFilterDim, bTempDim, bSpatialFilterDim, bSpatialDim, bSpatial4dDim,
            bAircraftDim, bDataFormat, bDataType;
    private TextField tfTempFilterDim, tfTempDim, tfSpatialFilterDim, tfSpatialDim, tfSpatial4dDim,
            tfAircraftDim, tfDataFormat, tfDataType;
    private GridLayout giFormLayout;
    private ElementLoadWindow elw = new ElementLoadWindow();
    private SemNotamUI snUI;
    private GeneralInterest generalInterestController;

    public GeneralInterestForm(GeneralInterest controller, SemNotamUI snUI){
        setCaption("General Interest");
        giFormLayout = new GridLayout(2, 8);
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
        tfDataFormat = new TextField("Data Format");
        tfDataType = new TextField("Data Type");

        tfTempFilterDim.setEnabled(false);
        tfTempDim.setEnabled(false);
        tfSpatialFilterDim.setEnabled(false);
        tfSpatialDim.setEnabled(false);
        tfSpatial4dDim.setEnabled(false);
        tfAircraftDim.setEnabled(false);
        tfDataFormat.setEnabled(false);
        tfDataType.setEnabled(false);

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

        bTempDim.setEnabled(true);
        bSpatialDim.setEnabled(true);

        giFormLayout.addComponents(tfTempFilterDim, bTempFilterDim, tfTempDim, bTempDim, tfSpatialFilterDim, bSpatialFilterDim,
                tfSpatialDim, bSpatialDim, tfSpatial4dDim, bSpatial4dDim, tfAircraftDim, bAircraftDim, tfDataFormat, bDataFormat,
                tfDataType, bDataType);

        giFormLayout.setDefaultComponentAlignment(Alignment.BOTTOM_LEFT);
        this.snUI = snUI;
    }

    public ElementLoadWindow getElw() {
        return elw;
    }

    public void setElw(ElementLoadWindow elw) {
        this.elw = elw;
        snUI.addWindow(elw);
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

    public void setConceptInElw(String concept) {

    }
}
