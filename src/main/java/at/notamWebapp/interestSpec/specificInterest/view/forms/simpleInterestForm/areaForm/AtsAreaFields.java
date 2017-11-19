package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm;

import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.interestSpec.specificInterest.view.forms.FormValidatorInterface;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.customFields.ElevatedCurveField;
import at.notamWebapp.util.customConverter.CustomDateConverter;
import at.notamWebapp.util.customConverter.CustomDayTimeConverter;
import at.notamWebapp.util.customConverter.CustomDurationConverter;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.frequentis.semnotam.schema._1.AtsAreaType;
import com.vaadin.data.Validator;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;

import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 28.01.2017.
 */
public class AtsAreaFields extends GridLayout implements FormValidatorInterface{

    private ComboBox identifier = new ComboBox("Identifier");
    private DateField beginPosition = new DateField();
    private DateField endPosition = new DateField();
    private TextField bufferBefore = new TextField("Buffer Before [min]");
    private TextField bufferAfter = new TextField("Buffer After [min]");


    public AtsAreaFields(AreaOfInterestPropertyType area, String areaId, List<String> predefinedAtsAreas, SemNotamController controller) {
        setColumns(3);
        setRows(6);
        setSizeFull();
        setDefaultComponentAlignment(Alignment.BOTTOM_LEFT);
        setColumnExpandRatio(0, 0.3f);
        setColumnExpandRatio(1, 0.3f);
        setColumnExpandRatio(2, 0.3f);
        setMargin(true);
        setSpacing(true);
        identifier.addItems(predefinedAtsAreas);
        identifier.setRequired(true);

        TextField horizontalBuffer = new TextField("Horizontal Buffer");
        horizontalBuffer.setWidth("90%");
        TextField verticalBuffer = new TextField("Vertical Buffer");
        verticalBuffer.setWidth("90%");
        TextField flightAltitude = new TextField("Height");
        flightAltitude.setWidth("90%");
        TextField sequence = new TextField("Sequence");
        sequence.setWidth("90%");
        ComboBox flightRules = new ComboBox("Flight Rules");
        flightRules.setWidth("90%");
        ComboBox timeOfDay = new ComboBox("Daytime");
        timeOfDay.setWidth("90%");
        ComboBox meteoConditions = new ComboBox("Meteo Conditions");
        meteoConditions.setWidth("90%");
        identifier.setWidth("90%");
        CheckBox direction = new CheckBox("Default Direction");
        direction.setWidth("90%");
        beginPosition.setWidth("90%");
        endPosition.setWidth("90%");
        bufferBefore.setWidth("90%");
        bufferAfter.setWidth("90%");
        //startPoint.setWidth("90%");
        //endPoint.setWidth("90%");
        ElevatedCurveField elevatedCurveField = new ElevatedCurveField();
        elevatedCurveField.setWidth("90%");
        sequence.setNullRepresentation("");
        bufferBefore.setNullRepresentation("");
        bufferAfter.setNullRepresentation("");
        flightAltitude.setNullRepresentation("");
        horizontalBuffer.setNullRepresentation("");
        verticalBuffer.setNullRepresentation("");

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
        BeanItem<AtsAreaType> item = new BeanItem<>(area.getAtsArea());
        BeanFieldGroup<AtsAreaType> binder = new BeanFieldGroup<>(AtsAreaType.class);
        binder.setItemDataSource(item);
        binder.bind(identifier, "identifier");
        binder.bind(sequence, "sequence");
        binder.bind(timeOfDay, "timeOfDay");
        binder.bind(meteoConditions, "meteoCondition.value");
        binder.bind(flightRules, "flightRule.value");
        binder.bind(horizontalBuffer, "areaBuffer.spatialBuffer.horizontal");
        binder.bind(verticalBuffer, "areaBuffer.spatialBuffer.vertical");
        binder.bind(flightAltitude, "flightAltitude");
        binder.bind(direction, "defaultDirection");
        binder.bind(beginPosition, "time.timeInterval.beginPosition");
        binder.bind(endPosition, "time.timeInterval.endPosition");
        binder.bind(bufferBefore, "timeBuffer.temporalBuffer.before");
        binder.bind(bufferAfter, "timeBuffer.temporalBuffer.after");
        //binder.bind(startPoint, "segmentShape.segmentShapeArea.startPoint");
        //binder.bind(endPoint, "segmentShape.segmentShapeArea.endPoint");
        binder.bind(elevatedCurveField, "segmentShape.segmentShapeArea.shapeCurve." +
                "elevatedCurve.segments");
        int index = areaId.indexOf("AREA");
        sequence.setValue(areaId.substring(index+4));

        identifier.addValueChangeListener(valueChangeEvent -> {
            AtsAreaType specArea = area.getAtsArea();
            controller.getElevatedDataController().setElevatedProperties(specArea, valueChangeEvent, identifier);
        });
        elevatedCurveField.addValueChangeListener(valueChangeEvent -> {
            AtsAreaType specArea = area.getAtsArea();
            controller.getElevatedDataController().setElevatedPoint(specArea, identifier);
        });

        bufferBefore.addValueChangeListener(valueChangeEvent ->
        {
            try{
                bufferBefore.commit();
            } catch (Validator.InvalidValueException e){
                //    tfOccBufBef.setComponentError(new UserError("Only numeric values allowed"));
            }
        });
        bufferAfter.addValueChangeListener(valueChangeEvent ->
        {
            try{
                bufferAfter.commit();
            } catch (Validator.InvalidValueException e){
                //    tfOccBufAft.setComponentError(new UserError("Only numeric values allowed"));
            }
        });

        addComponent(areaId1, 0, 0);
        addComponent(identifier, 0, 1);
        addComponent(meteoConditions, 0, 2);
        addComponent(flightRules, 0, 3);
        addComponent(timeOfDay, 0, 4);
        addComponent(sequence, 1, 0);
        addComponent(beginPosition, 1,1);
        addComponent(endPosition,1,2);
        addComponent(bufferBefore, 1, 3);
        addComponent(bufferAfter,1,4);
        addComponent(flightAltitude, 2, 0);
        addComponent(horizontalBuffer, 2, 1);
        addComponent(verticalBuffer, 2, 2);
        //addComponent(startPoint, 2, 3);
        //addComponent(endPoint, 2, 4);
        addComponent(elevatedCurveField,2,3,2,4);
        addComponent(direction, 2, 5);
        setComponentAlignment(areaId1, Alignment.MIDDLE_LEFT);

        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=5; j++){
                if(getComponent(i,j) != null && !(getComponent(i,j) instanceof Label)){
                    AbstractField f = (AbstractField) getComponent(i,j);
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
        boolean isValid = true;
        if(!identifier.isValid()){
            identifier.setValidationVisible(true);
            isValid = false;
        }
        if(!beginPosition.isValid()){
            beginPosition.setValidationVisible(true);
            isValid = false;
        }
        if(!endPosition.isValid()){
            endPosition.setValidationVisible(true);
            isValid = false;
        }
        return isValid;
    }
}
