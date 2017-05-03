package at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import at.notamWebapp.interestSpec.model.GetPointIdentifier;
import at.notamWebapp.interestSpec.view.simpleInterestForm.areaForm.customFields.ElevatedCurveField;
import com.frequentis.semnotam.schema._1.AreaOfInterestPropertyType;
import com.frequentis.semnotam.schema._1.AtsAreaType;
import com.frequentis.semnotam.schema._1.ElevatedPointReferencePropertyType;
import com.frequentis.semnotam.schema._1.TransitionAreaType;
import com.vaadin.data.Property;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;
import net.opengis.gml.GeodesicStringType;

import java.util.List;

/**
 * Created by khoef on 28.01.2017.
 */
public class AtsAreaFields extends GridLayout {

    private Label areaId = new Label();
    private BeanFieldGroup<AtsAreaType> binder = new BeanFieldGroup<>(AtsAreaType.class);
    private TextField horizontalBuffer = new TextField("Horizontal Buffer");
    private TextField verticalBuffer = new TextField("Vertical Buffer");
    private TextField flightAltitude = new TextField("Height");
    private TextField sequence = new TextField("Sequence");
    private ComboBox flightRules = new ComboBox("Flight Rules");
    private ComboBox timeOfDay = new ComboBox("Daytime");
    private ComboBox meteoConditions = new ComboBox("Meteo Conditions");
    private ComboBox identifier = new ComboBox("Identifier");
    private CheckBox direction = new CheckBox("Default Direction");
    //private ElevatedPointReferenceField startPoint = new ElevatedPointReferenceField();
    //private ElevatedPointReferenceField endPoint = new ElevatedPointReferenceField();
    private ElevatedCurveField elevatedCurveField = new ElevatedCurveField();
    private DateField beginPosition = new DateField();
    private DateField endPosition = new DateField();
    private TextField bufferBefore = new TextField("Buffer Before");
    private TextField bufferAfter = new TextField("Buffer After");
    private SemNotamController controller;


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
        this.controller = controller;

        horizontalBuffer.setWidth("90%");
        verticalBuffer.setWidth("90%");
        flightAltitude.setWidth("90%");
        sequence.setWidth("90%");
        flightRules.setWidth("90%");
        timeOfDay.setWidth("90%");
        meteoConditions.setWidth("90%");
        identifier.setWidth("90%");
        direction.setWidth("90%");
        beginPosition.setWidth("90%");
        endPosition.setWidth("90%");
        bufferBefore.setWidth("90%");
        bufferAfter.setWidth("90%");
        //startPoint.setWidth("90%");
        //endPoint.setWidth("90%");
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
    /*
        beginPosition.setConverter(new CustomDateConverter());
        endPosition.setConverter(new CustomDateConverter());
        bufferBefore.setConverter(new CustomDurationConverter());
        bufferAfter.setConverter(new CustomDurationConverter());
    */
        //set ComboBox values
        //Day, Night --> Time of Day
        //IMC, VMC --> Meteo Conditions
        //IFR, VFR --> Flight Rules
        timeOfDay.addItems("DAY", "NIGHT");
        meteoConditions.addItems("IMC", "VMC");
        flightRules.addItems("IFR", "VFR");
        this.areaId.setValue(areaId);

        //Bind Aerodrome Type to Bean Item
        BeanItem<AtsAreaType> item = new BeanItem<>(area.getAtsArea());
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

        identifier.addValueChangeListener(valueChangeEvent -> {
            TransitionAreaType specArea = area.getDepartureArea();
            setElevatedProperties(specArea, valueChangeEvent);
        });
        elevatedCurveField.addValueChangeListener(valueChangeEvent -> {
            TransitionAreaType specArea = area.getDepartureArea();
            setElevatedPoint(specArea);
        });

        addComponent(this.areaId, 0, 0);
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
        setComponentAlignment(this.areaId, Alignment.MIDDLE_LEFT);

        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=5; j++){
                if(getComponent(i,j) != null && !(getComponent(i,j) instanceof Label)){
                    AbstractField f = (AbstractField) getComponent(i,j);
                    f.addValueChangeListener(valueChangeEvent -> f.commit());
                }
            }
        }
    }

    private void setElevatedProperties(TransitionAreaType specArea, Property.ValueChangeEvent valueChangeEvent) {
        setElevatedCurveId(specArea, valueChangeEvent);
        setElevatedPoint(specArea);
    }

    private void setElevatedPoint(TransitionAreaType transArea) {
        if(!identifier.getValue().toString().isEmpty()) {
            GeodesicStringType geodesicStringType = (GeodesicStringType) transArea.getSegmentShape().getSegmentShapeArea().getShapeCurve().
                    getElevatedCurve().getSegments().getAbstractCurveSegment().get(0).getValue();
            List<Double> pointList = geodesicStringType.getPosList().getValue();
            controller.getElevatedDataController().setElevatedPoint(identifier.getValue().toString(), pointList);
            ElevatedPointReferencePropertyType startPoint = new ElevatedPointReferencePropertyType();
            ElevatedPointReferencePropertyType endPoint = new ElevatedPointReferencePropertyType();
            startPoint.setHref("#ElevatedPoint" + GetPointIdentifier.getFirstPointId(identifier.getValue().toString()));
            endPoint.setHref("#ElevatedPoint" + GetPointIdentifier.getSecondPointId(identifier.getValue().toString()));
            transArea.getSegmentShape().getSegmentShapeArea().setStartPoint(startPoint);
            transArea.getSegmentShape().getSegmentShapeArea().setEndPoint(endPoint);
        }
    }

    private void setElevatedCurveId(TransitionAreaType transArea, Property.ValueChangeEvent valueChangeEvent) {
        String identifier = (String) valueChangeEvent.getProperty().getValue();
        String firstPointId = GetPointIdentifier.getFirstPointId(identifier);
        String secondPointId = GetPointIdentifier.getSecondPointId(identifier);
        transArea.getSegmentShape().getSegmentShapeArea().getShapeCurve().getElevatedCurve().setId("ElevatedCurvePoint"+
                firstPointId +"Point"+secondPointId);
    }
}
