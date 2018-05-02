package at.notamWebapp.interestSpec.specificInterest.view.forms.simpleInterestForm.areaForm.customFields;

import com.vaadin.ui.*;
import net.opengis.gml.*;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 24.04.2017.
 */
public class ElevatedCurveField extends CustomField<CurveSegmentArrayPropertyType> {

    private GridLayout elevatedCurveField = new GridLayout(2,2);
    private TextField startPointX = new TextField(), startPointY = new TextField(),
            endPointX = new TextField(), endPointY = new TextField();

    @Override
    protected Component initContent() {
        elevatedCurveField.addComponent(startPointX,0,0);
        elevatedCurveField.addComponent(startPointY,1,0);
        elevatedCurveField.addComponent(endPointX,0,1);
        elevatedCurveField.addComponent(endPointY,1,1);

        elevatedCurveField.setComponentAlignment(startPointX, Alignment.BOTTOM_LEFT);
        elevatedCurveField.setComponentAlignment(startPointY, Alignment.BOTTOM_RIGHT);
        elevatedCurveField.setComponentAlignment(endPointX, Alignment.BOTTOM_LEFT);
        elevatedCurveField.setComponentAlignment(endPointY, Alignment.BOTTOM_RIGHT);

        startPointX.addValueChangeListener(valueChangeEvent -> {commit(); this.fireValueChange(false);});
        startPointY.addValueChangeListener(valueChangeEvent -> {commit(); this.fireValueChange(false);});
        endPointX.addValueChangeListener(valueChangeEvent -> {commit(); this.fireValueChange(false);});
        endPointY.addValueChangeListener(valueChangeEvent -> {commit(); this.fireValueChange(false);});

        elevatedCurveField.setSizeFull();
        this.setSizeFull();
        startPointX.setCaption("Start Point");
        endPointX.setCaption("End Point");

        startPointX.setWidth("95%");
        startPointY.setWidth("95%");
        endPointX.setWidth("95%");
        endPointY.setWidth("95%");

        startPointX.setImmediate(true);
        startPointY.setImmediate(true);
        endPointX.setImmediate(true);
        endPointY.setImmediate(true);
        this.setImmediate(true);

        return elevatedCurveField;
    }

    @Override
    public Class<? extends CurveSegmentArrayPropertyType> getType() {
        return CurveSegmentArrayPropertyType.class;
    }

    @Override
    protected CurveSegmentArrayPropertyType getInternalValue() {
        CurveSegmentArrayPropertyType segments = new CurveSegmentArrayPropertyType();
        GeodesicStringType abstractCurveSegment = new GeodesicStringType();
        abstractCurveSegment.setInterpolation(CurveInterpolationType.GEODESIC);
        DirectPositionListType directPositionListType = new DirectPositionListType();
        abstractCurveSegment.setPosList(directPositionListType);
        JAXBElement<? extends AbstractCurveSegmentType> jaxbElement = new JAXBElement<>(
                QName.valueOf("gml:GeodesicString"), GeodesicStringType.class, abstractCurveSegment);
        segments.getAbstractCurveSegment().add(jaxbElement);

        if(!startPointX.getValue().equals("")) {
            directPositionListType.getValue().add(0, Double.valueOf(startPointX.getValue()));
        } else{
            directPositionListType.getValue().add(0, 0d);
        }

        if(!startPointY.getValue().equals("")) {
            directPositionListType.getValue().add(1, Double.valueOf(startPointY.getValue()));
        } else{
            directPositionListType.getValue().add(1, 0d);
        }

        if(!endPointX.getValue().equals("")) {
            directPositionListType.getValue().add(2, Double.valueOf(endPointX.getValue()));
        } else{
            directPositionListType.getValue().add(2, 0d);
        }

        if(!endPointY.getValue().equals("")) {
            directPositionListType.getValue().add(3, Double.valueOf(endPointY.getValue()));
        } else{
            directPositionListType.getValue().add(3, 0d);
        }

        return segments;
    }

    @Override
    public void setInternalValue(CurveSegmentArrayPropertyType newValue) {
        super.setInternalValue(newValue);
        if(newValue != null){
            GeodesicStringType geodesicStringType = null;
            LineStringSegmentType lineStringSegmentType = null;
            List<Double> pointList = null;

            if(newValue.getAbstractCurveSegment().get(0).getValue() instanceof GeodesicStringType) {
                geodesicStringType = (GeodesicStringType) newValue.getAbstractCurveSegment().get(0).getValue();
                pointList = geodesicStringType.getPosList().getValue();
            }else if(newValue.getAbstractCurveSegment().get(0).getValue() instanceof LineStringSegmentType){
                lineStringSegmentType = (LineStringSegmentType) newValue.getAbstractCurveSegment().get(0).getValue();
                pointList = lineStringSegmentType.getPosList().getValue();
            }
            if(pointList.size() == 4) {
                startPointX.setValue(String.valueOf(pointList.get(0)));
                startPointY.setValue(String.valueOf(pointList.get(1)));
                endPointX.setValue(String.valueOf(pointList.get(2)));
                endPointY.setValue(String.valueOf(pointList.get(3)));
            }
        }
    }
}
