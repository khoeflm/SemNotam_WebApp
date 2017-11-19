package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm;

import at.notamWebapp.interestSpec.specificInterest.view.forms.FormValidatorInterface;
import at.notamWebapp.util.customConverter.CustomDateConverter;
import at.notamWebapp.util.customConverter.CustomDayTimeConverter;
import at.notamWebapp.util.customConverter.CustomDurationConverter;
import com.frequentis.semnotam.schema._1.AerodromeAreaType;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.frequentis.semnotam.schema._1.ShapeAreaType;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 28.01.2017.
 */
public class ShapeAreaFields extends GridLayout implements FormValidatorInterface{

    private DateField beginPosition = new DateField("Begin Position");
    private DateField endPosition = new DateField("End Position");


    public ShapeAreaFields(AreaOfInterestPropertyType area, String areaId) {
        //set GridLayout attributes
        setColumns(3);
        setRows(6);
        setSizeFull();
        setDefaultComponentAlignment(Alignment.BOTTOM_LEFT);
        setColumnExpandRatio(0, 0.3f);
        setColumnExpandRatio(1, 0.3f);
        setColumnExpandRatio(2, 0.3f);
        setMargin(true);
        setSpacing(true);

        //Set width of the single fields
        TextField sequence = new TextField("Sequence");
        sequence.setWidth("90%");
        ComboBox flightRules = new ComboBox("Flight Rules");
        flightRules.setWidth("90%");
        ComboBox timeOfDay = new ComboBox("Daytime");
        timeOfDay.setWidth("90%");
        ComboBox meteoConditions = new ComboBox("Meteo Conditions");
        meteoConditions.setWidth("90%");
        beginPosition.setWidth("90%");
        endPosition.setWidth("90%");
        TextField bufferBefore = new TextField("Buffer Before [min]");
        bufferBefore.setWidth("90%");
        TextField bufferAfter = new TextField("Buffer After [min]");
        bufferAfter.setWidth("90%");
        TextField height = new TextField("Height");
        height.setWidth("90%");
        TextField vertical = new TextField("Vertical");
        vertical.setWidth("90%");
        TextField horizontal = new TextField("Horizontal");
        horizontal.setWidth("90%");
        TextField elevation = new TextField("Elevation");
        elevation.setWidth("90%");
        TextField geoidUndulation = new TextField("Geo ID Undulation");
        geoidUndulation.setWidth("90%");
        TextField verticalDatum = new TextField("Vertical Datum");
        verticalDatum.setWidth("90%");
        TextField verticalAccuracy = new TextField("Vertical Accuracy");
        verticalAccuracy.setWidth("90%");

        sequence.setNullRepresentation("");
        bufferBefore.setNullRepresentation("");
        bufferAfter.setNullRepresentation("");
        height.setNullRepresentation("");
        vertical.setNullRepresentation("");
        horizontal.setNullRepresentation("");
        elevation.setNullRepresentation("");
        geoidUndulation.setNullRepresentation("");
        verticalDatum.setNullRepresentation("");
        verticalAccuracy.setNullRepresentation("");

        //Set Date Field Resolution to Minute
        beginPosition.setResolution(Resolution.MINUTE);
        endPosition.setResolution(Resolution.MINUTE);
        beginPosition.setImmediate(true);
        endPosition.setImmediate(true);
        //set Converter (XML-Gregorian Calender <-> Date)
        beginPosition.setConverter(new CustomDateConverter());
        endPosition.setConverter(new CustomDateConverter());
        bufferBefore.setConverter(new CustomDurationConverter());
        bufferAfter.setConverter(new CustomDurationConverter());
        timeOfDay.setConverter(new CustomDayTimeConverter());


        //set ComboBox values
        //Day, Night --> Time of Day
        //IMC, VMC --> Meteo Conditions
        //IFR, VFR --> Flight Rules
        timeOfDay.addItems("DAY", "NIGHT");
        meteoConditions.addItems("IMC", "VMC");
        flightRules.addItems("IFR", "VFR");
        Label areaId1 = new Label();
        areaId1.setValue(areaId);

        //Bind Aerodrome Type to Bean Item
        BeanFieldGroup<AerodromeAreaType> binder = new BeanFieldGroup(ShapeAreaType.class);
        BeanItem<ShapeAreaType> item = new BeanItem<>(area.getShapeArea());

        //bind fields to aerodrome properties
        binder.setItemDataSource(item);
        binder.bind(sequence, "sequence");
        binder.bind(timeOfDay, "timeOfDay");
        binder.bind(meteoConditions, "meteoCondition.value");
        binder.bind(flightRules, "flightRule.value");
        binder.bind(beginPosition, "time.timeInterval.beginPosition");
        binder.bind(endPosition, "time.timeInterval.endPosition");
        binder.bind(bufferBefore, "timeBuffer.temporalBuffer.before");
        binder.bind(bufferAfter, "timeBuffer.temporalBuffer.after");
        binder.bind(height, "height");
        binder.bind(vertical, "areaBuffer.spatialBuffer.vertical");
        binder.bind(horizontal, "areaBuffer.spatialBuffer.horizontal");
        binder.bind(elevation, "shape.elevatedSurface.elevation.value");
        binder.bind(geoidUndulation, "shape.elevatedSurface.geoidUndulation.value");
        binder.bind(verticalDatum, "shape.elevatedSurface.verticalDatum.value");
        binder.bind(verticalAccuracy, "shape.elevatedSurface.verticalAccuracy.value");
        int index = areaId.indexOf("AREA");
        sequence.setValue(areaId.substring(index+4));


        height.setWidth("90%");
        vertical.setWidth("90%");
        horizontal.setWidth("90%");
        elevation.setWidth("90%");
        geoidUndulation.setWidth("90%");
        verticalDatum.setWidth("90%");
        verticalAccuracy.setWidth("90%");

        //add fields to layout
        addComponent(areaId1, 0, 0);
        addComponent(geoidUndulation, 0, 1);
        addComponent(meteoConditions, 0, 2);
        addComponent(flightRules, 0, 3);
        addComponent(timeOfDay, 0, 4);
        addComponent(sequence, 1, 0);
        addComponent(beginPosition, 1,1);
        addComponent(endPosition,1,2);
        addComponent(bufferBefore, 1, 3);
        addComponent(bufferAfter,1,4);
        addComponent(height, 2, 0);
        addComponent(vertical, 2,1);
        addComponent(horizontal, 2, 2);
        addComponent(elevation, 2, 3);
        addComponent(verticalDatum, 2,4);
        addComponent(verticalAccuracy,2,5);

        setComponentAlignment(areaId1, Alignment.MIDDLE_LEFT);

        //add listeners to single fields
        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=4; j++){
                if(getComponent(i,j) != null && !(getComponent(i,j) instanceof Label)){
                    Field f = (Field) getComponent(i,j);
                    f.addValueChangeListener(valueChangeEvent -> f.commit());
                }
            }
        }

        //Validation of Start and End Time
        endPosition.addValueChangeListener(valueChangeEvent ->
                {

                    if(beginPosition.getValue() != null && endPosition.getValue().before(beginPosition.getValue())){
                        endPosition.setValue(beginPosition.getValue());
                        new Notification(
                                "Attention",
                                "End date must be after start date",
                                Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
                    }else endPosition.commit();
                }
        );

        beginPosition.addValueChangeListener(valueChangeEvent ->
                {

                    if(endPosition.getValue() != null && beginPosition.getValue().after(endPosition.getValue())){
                        beginPosition.setValue(endPosition.getValue());
                        new Notification(
                                "Attention",
                                "End date must be after start date",
                                Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
                    }else beginPosition.commit();
                }
        );
    }

    public boolean isValid() {
        return true;
    }
}
