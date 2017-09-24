package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm;

import at.notamWebapp.util.customConverter.CustomDateConverter;
import at.notamWebapp.util.customConverter.CustomDayTimeConverter;
import at.notamWebapp.util.customConverter.CustomDurationConverter;
import com.frequentis.semnotam.schema._1.AerodromeAreaType;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.vaadin.data.Validator;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 25.01.2017.
 */
class AerodromeAreaFields extends GridLayout{

    private TextField designator = new TextField("Designator");
    private DateField beginPosition = new DateField();
    private DateField endPosition = new DateField();

    AerodromeAreaFields(AreaOfInterestPropertyType area, String areaId){
        Label areaId1 = new Label();
        areaId1.setValue(areaId);
        //set GridLayout attributes
        setColumns(3);
        setRows(5);
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
        designator.setWidth("90%");
        beginPosition.setWidth("90%");
        endPosition.setWidth("90%");
        TextField bufferBefore = new TextField("Buffer Before [min]");
        bufferBefore.setWidth("90%");
        TextField bufferAfter = new TextField("Buffer After [min]");
        bufferAfter.setWidth("90%");
        sequence.setNullRepresentation("");
        designator.setNullRepresentation("");
        bufferBefore.setNullRepresentation("");
        bufferAfter.setNullRepresentation("");

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

        designator.setRequired(true);

        //set ComboBox values
        //Day, Night --> Time of Day
        //IMC, VMC --> Meteo Conditions
        //IFR, VFR --> Flight Rules
        timeOfDay.addItems("DAY", "NIGHT");
        meteoConditions.addItems("IMC", "VMC");
        flightRules.addItems("IFR", "VFR");

        //Bind Aerodrome Type to Bean Item
        BeanFieldGroup<AerodromeAreaType> binder = new BeanFieldGroup(AerodromeAreaType.class);
        BeanItem<AerodromeAreaType> item = null;
        if(area.getDepartureAerodromeArea() != null) {
            item = new BeanItem<>(area.getDepartureAerodromeArea());
        }
        else if(area.getDestinationAerodromeArea() != null){
            item = new BeanItem<>(area.getDestinationAerodromeArea());
        }
        else if(area.getDepartureAlternateAerodromeArea() != null){
            item = new BeanItem<>(area.getDepartureAlternateAerodromeArea());
        }
        else if(area.getDestinationAlternateAerodromeArea() != null){
            item = new BeanItem<>(area.getDestinationAlternateAerodromeArea());
        }
        else if(area.getEnRouteAlternateAerodromeArea() != null){
            item = new BeanItem<>(area.getEnRouteAlternateAerodromeArea());
        }
        //bind fields to aerodrome properties
        binder.setItemDataSource(item);
        binder.bind(designator, "designator");
        binder.bind(sequence, "sequence");
        binder.bind(timeOfDay, "timeOfDay");
        binder.bind(meteoConditions, "meteoCondition.value");
        binder.bind(flightRules, "flightRule.value");
        binder.bind(beginPosition, "time.timeInterval.beginPosition");
        binder.bind(endPosition, "time.timeInterval.endPosition");
        binder.bind(bufferBefore, "timeBuffer.temporalBuffer.before");
        binder.bind(bufferAfter, "timeBuffer.temporalBuffer.after");
        int index = areaId.indexOf("AREA");
        sequence.setValue(areaId.substring(index+4));

        //add fields to layout
        addComponent(areaId1, 0, 0);
        addComponent(designator, 0, 1);
        addComponent(meteoConditions, 0, 2);
        addComponent(flightRules, 0, 3);
        addComponent(timeOfDay, 0, 4);
        addComponent(sequence, 1, 0);
        addComponent(beginPosition, 1,1);
        addComponent(endPosition,1,2);
        addComponent(bufferBefore, 1, 3);
        addComponent(bufferAfter,1,4);
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

        designator.addValueChangeListener(valueChangeEvent ->
                {try {
                    if (!designator.isValid()) {
                        designator.setValidationVisible(true);
                    } else {
                        designator.setValidationVisible(false);
                        designator.setComponentError(null);
                        designator.commit();
                    }
                } catch (Validator.EmptyValueException e) {
                    // A required value was missing
        }});

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
}