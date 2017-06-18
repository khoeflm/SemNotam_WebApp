package at.notamWebapp.interestSpec.model.customConverter;

import aero.aixm.ValDistanceType;
import com.frequentis.semnotam.schema._1.CodeTimeOfDayBaseType;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.data.util.converter.DefaultConverterFactory;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

/**
 * Created by khoef on 29.01.2017.
 */
public class MyConverterFactory extends DefaultConverterFactory{
    @Override
    public <PRESENTATION, MODEL> Converter<PRESENTATION, MODEL> createConverter(Class<PRESENTATION> presentationType,
                                                                                Class<MODEL> modelType) {
        if(presentationType == String.class && modelType == ValDistanceType.class){
            return (Converter<PRESENTATION, MODEL>) new ValDistanceConverter();
        }
   //     else if(presentationType == String.class && modelType == ElevatedPointReferencePropertyType.class){
   //         return (Converter<PRESENTATION, MODEL>) new ElevatedPointConverter();
   //     }
        else if(presentationType == Date.class && modelType == XMLGregorianCalendar.class){
            return (Converter<PRESENTATION, MODEL>) new CustomDateConverter();
        }
        else if(presentationType == String.class && modelType == Duration.class){
            return (Converter<PRESENTATION, MODEL>) new CustomDurationConverter();
        }
    //    else if((presentationType == String.class) && (modelType == CodeVerticalDatumType.class)){
    //        return (Converter<PRESENTATION, MODEL>) new JAXBElementConverter();
    //    }
        else if((presentationType == String.class) && (modelType == CodeTimeOfDayBaseType.class)){
            return (Converter<PRESENTATION, MODEL>) new CustomDayTimeConverter();
        }
        else return super.createConverter(presentationType, modelType);
    }
}
