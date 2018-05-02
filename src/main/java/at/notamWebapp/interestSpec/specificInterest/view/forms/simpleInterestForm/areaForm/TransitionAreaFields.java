package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm;

import at.notamWebapp.interestSpec.specificInterest.controller.ElevatedDataController;
import at.notamWebapp.interestSpec.specificInterest.controller.SemNotamController;
import at.notamWebapp.interestSpec.specificInterest.view.forms.FormValidatorInterface;
import at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.customFields.ElevatedCurveField;
import at.notamWebapp.util.customConverter.CustomDateConverter;
import at.notamWebapp.util.customConverter.CustomDayTimeConverter;
import at.notamWebapp.util.customConverter.CustomDurationConverter;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.frequentis.semnotam.schema._1.TransitionAreaType;
import com.frequentis.semnotam.schema._1.TransitionSegmentType;
import com.frequentis.semnotam.ws.specificInterest.SpecificInterestWS;
import com.vaadin.data.Property;
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
public class TransitionAreaFields extends GridLayout implements FormValidatorInterface{

    private ComboBox identifier = new ComboBox("Identifier");
    private ComboBox aerodromeDesignator = new ComboBox("Aerodrome Designator");
    private DateField beginPosition = new DateField("Begin Position");
    private DateField endPosition = new DateField("End Position");
    ElevatedCurveField elevatedCurveField = new ElevatedCurveField();
    private SemNotamController controller;

    public TransitionAreaFields(AreaOfInterestPropertyType area, String areaId, List<String> transitionSegmentIds, List<String> aerodromeIds, SemNotamController controller) {
        setColumns(3);
        setRows(6);
        setSizeFull();
        this.controller = controller;
        setDefaultComponentAlignment(Alignment.BOTTOM_LEFT);
        setColumnExpandRatio(0, 0.3f);
        setColumnExpandRatio(1, 0.3f);
        setColumnExpandRatio(2, 0.3f);
        setMargin(true);
        setSpacing(true);

        //Set Predefined Transition IDs for ID ComboBox
        identifier.addItems(transitionSegmentIds);
        aerodromeDesignator.addItems(aerodromeIds);
        identifier.setRequired(true);
        aerodromeDesignator.setRequired(true);
        beginPosition.setRequired(true);
        endPosition.setRequired(true);

        identifier.setValidationVisible(false);
        beginPosition.setValidationVisible(false);
        endPosition.setValidationVisible(false);
        aerodromeDesignator.setValidationVisible(false);


        identifier.setRequiredError("Required");
        beginPosition.setRequiredError("Required");
        endPosition.setRequiredError("Required");
        aerodromeDesignator.setRequiredError("Required");


        //Set width of the single fields
        beginPosition.setWidth("90%");
        endPosition.setWidth("90%");
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
        aerodromeDesignator.setWidth("90%");
        //startPoint.setWidth("90%");
        //endPoint.setWidth("90%");

        elevatedCurveField.setWidth("90%");
        TextField bufferBefore = new TextField("Buffer Before [min]");
        bufferBefore.setWidth("90%");
        TextField bufferAfter = new TextField("Buffer After [min]");
        bufferAfter.setWidth("90%");
        TextField horizontalBuffer = new TextField("Horizontal Buffer");
        horizontalBuffer.setWidth("90%");
        TextField verticalBuffer = new TextField("Vertical Buffer");
        verticalBuffer.setWidth("90%");

        horizontalBuffer.setNullRepresentation("");
        verticalBuffer.setNullRepresentation("");
        sequence.setNullRepresentation("");
        flightAltitude.setNullRepresentation("");

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
        flightAltitude.setCaption("Height");
        Label areaId1 = new Label();
        areaId1.setValue(areaId);

        //Bind Aerodrome Type to Bean Item
        BeanFieldGroup<TransitionAreaType> binder = new BeanFieldGroup<>(TransitionAreaType.class);
        BeanItem<TransitionAreaType> item = null;
        TransitionAreaType specArea = null;
        if(area.getDepartureArea() != null) {
            item = new BeanItem<>(area.getDepartureArea());
            specArea = area.getDepartureArea();
        }
        else if(area.getDestinationApproachArea() != null){
            item = new BeanItem<>(area.getDestinationApproachArea());
            specArea = area.getDestinationApproachArea();

        }
        else if(area.getDepartureAlternateApproachArea() != null){
            item = new BeanItem<>(area.getDepartureAlternateApproachArea());
            specArea = area.getDepartureAlternateApproachArea();
        }
        else if(area.getEnRouteAlternateApproachArea() != null){
            item = new BeanItem<>(area.getEnRouteAlternateApproachArea());
            specArea = area.getEnRouteAlternateApproachArea();
        }
        else if(area.getDestinationAlternateApproachArea() != null){
            item = new BeanItem<>(area.getDestinationAlternateApproachArea());
            specArea = area.getDestinationAlternateApproachArea();
        }

        //bind fields to aerodrome properties
        binder.setItemDataSource(item);
        binder.bind(identifier, "identifier");
        binder.bind(sequence, "sequence");
        binder.bind(timeOfDay, "timeOfDay");
        binder.bind(meteoConditions, "meteoCondition.value");
        binder.bind(flightRules, "flightRule.value");
        binder.bind(flightAltitude, "flightAltitude");
        binder.bind(direction, "defaultDirection");
        binder.bind(aerodromeDesignator, "aerodromeDesignator");
        //binder.bind(startPoint, "segmentShape.segmentShapeArea.startPoint");
        //binder.bind(endPoint, "segmentShape.segmentShapeArea.endPoint");
        binder.bind(elevatedCurveField, "segmentShape.segmentShapeArea.shapeCurve." +
                "elevatedCurve.segments");
        binder.bind(beginPosition, "time.timeInterval.beginPosition");
        binder.bind(endPosition, "time.timeInterval.endPosition");
        binder.bind(bufferBefore, "timeBuffer.temporalBuffer.before");
        binder.bind(bufferAfter, "timeBuffer.temporalBuffer.after");
        binder.bind(horizontalBuffer, "areaBuffer.spatialBuffer.horizontal");
        binder.bind(verticalBuffer, "areaBuffer.spatialBuffer.vertical");
        int index = areaId.indexOf("AREA");
        sequence.setValue(areaId.substring(index+4));
        sequence.commit();

        TransitionAreaType finalSpecArea = specArea;
        identifier.addValueChangeListener(valueChangeEvent -> {
            String transitionSegmentId = valueChangeEvent.getProperty().getValue().toString();
            TransitionSegmentType transitionSegment = SpecificInterestWS.getTransitionSegmentById(transitionSegmentId);
            if(transitionSegmentId.equals(transitionSegment.getIdentifier())) {
                elevatedCurveField.setInternalValue(transitionSegment.getShape().getElevatedCurve().getSegments());
                controller.getElevatedDataController().setElevatedProperties(finalSpecArea, valueChangeEvent,
                        identifier.getValue().toString(), this.getId());
            }
        });
        elevatedCurveField.addValueChangeListener(valueChangeEvent -> {
            controller.getElevatedDataController().setElevatedPoint(finalSpecArea, identifier.getValue().toString(), this.getId());
        });

        aerodromeDesignator.addValueChangeListener(valueChangeEvent ->
        {try {
            if (!aerodromeDesignator.isValid()) {
                aerodromeDesignator.setValidationVisible(true);
            } else {
                aerodromeDesignator.setValidationVisible(false);
                aerodromeDesignator.setComponentError(null);
                aerodromeDesignator.commit();
            }
        } catch (Validator.EmptyValueException e) {
            // A required value was missing
        }});



        //add fields to layout
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
        addComponent(aerodromeDesignator, 1,5);
        addComponent(flightAltitude, 2, 0);
        addComponent(horizontalBuffer, 2, 1);
        addComponent(verticalBuffer, 2, 2);
        //addComponent(startPoint, 2, 3);
        //addComponent(endPoint, 2, 4);
        addComponent(elevatedCurveField,2,3,2,4);
        addComponent(direction, 2, 5);
        setComponentAlignment(areaId1, Alignment.MIDDLE_LEFT);

        //add listeners to single fields
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
                    }else if(endPosition.getValue() != null) {
                        endPosition.commit();
                    }
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
                    }else if(endPosition.getValue() != null) {
                        beginPosition.commit();
                    }
                }
        );
    }

   /* private void setElevatedProperties(TransitionAreaType specArea, Property.ValueChangeEvent valueChangeEvent) {
        String transitionSegmentId = valueChangeEvent.getProperty().getValue().toString();
        TransitionSegmentType transitionSegment = SpecificInterestWS.getTransitionSegmentById(transitionSegmentId);
        if(transitionSegmentId.equals(transitionSegment.getIdentifier())) {
            elevatedCurveField.setInternalValue(transitionSegment.getShape().getElevatedCurve().getSegments());
            controller.getElevatedDataController().setElevatedProperties(specArea, valueChangeEvent,
                    identifier.getValue().toString(), this.getId());
        }
    }


    private void setElevatedPoint(TransitionAreaType transArea) {
        controller.getElevatedDataController().setElevatedPoint(transArea, identifier.getValue().toString(), this.getId());

        if(!identifier.getValue().toString().isEmpty()) {
            GeodesicStringType geodesicStringType = (GeodesicStringType) transArea.getSegmentShape().getSegmentShapeArea().getShapeCurve().
                    getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            List<Double> pointList = geodesicStringType.getPosList().getValue();
            controller.getElevatedDataController().setElevatedPoint(identifier.getValue().toString(), this.getId(), pointList);
            ElevatedPointReferencePropertyType startPoint = new ElevatedPointReferencePropertyType();
            ElevatedPointReferencePropertyType endPoint = new ElevatedPointReferencePropertyType();
            startPoint.setHref("#ElevatedPoint" + ElevatedDataController.getFirstPointId(identifier.getValue().toString()));
            endPoint.setHref("#ElevatedPoint" + ElevatedDataController.getSecondPointId(identifier.getValue().toString()));
            transArea.getSegmentShape().getSegmentShapeArea().setStartPoint(startPoint);
            transArea.getSegmentShape().getSegmentShapeArea().setEndPoint(endPoint);
        }

    }*/

    private void setElevatedCurveId(TransitionAreaType transArea, Property.ValueChangeEvent valueChangeEvent) {
        String identifier = (String) valueChangeEvent.getProperty().getValue();
        String firstPointId = ElevatedDataController.getFirstPointId(identifier);
        String secondPointId = ElevatedDataController.getSecondPointId(identifier);
        transArea.getSegmentShape().getSegmentShapeArea().getShapeCurve().getElevatedCurve().setId("ElevatedCurvePoint"+
                firstPointId +"Point"+secondPointId);
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
        if(!aerodromeDesignator.isValid()){
            aerodromeDesignator.setValidationVisible(true);
            isValid = false;
        }
        return isValid;
    }
}
