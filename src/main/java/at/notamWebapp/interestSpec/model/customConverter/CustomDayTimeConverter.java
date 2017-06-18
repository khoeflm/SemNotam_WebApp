package at.notamWebapp.interestSpec.model.customConverter;

import com.frequentis.semnotam.schema._1.CodeTimeOfDayBaseType;
import com.vaadin.data.util.converter.Converter;

import java.util.Locale;

/**
 * Created by khoef on 17.06.2017.
 */
public class CustomDayTimeConverter implements Converter<Object, CodeTimeOfDayBaseType> {


    @Override
    public CodeTimeOfDayBaseType convertToModel(Object o, Class<? extends CodeTimeOfDayBaseType> aClass, Locale locale) throws ConversionException {
        if(o.toString().equals("DAY")){
            return CodeTimeOfDayBaseType.DAY;
        }
        else if(o.toString().equals("NIGHT")){
            return CodeTimeOfDayBaseType.NIGHT;
        }
        return null;
    }

    @Override
    public Object convertToPresentation(CodeTimeOfDayBaseType codeTimeOfDayBaseType, Class<?> aClass, Locale locale) throws ConversionException {
        if(codeTimeOfDayBaseType.value().equals("DAY")){
            return "DAY";
        }
        else if(codeTimeOfDayBaseType.value().equals("NIGHT")){
            return "NIGHT";
        }
        return null;
    }

    @Override
    public Class<CodeTimeOfDayBaseType> getModelType() {
        return CodeTimeOfDayBaseType.class;
    }

    @Override
    public Class<Object> getPresentationType() {
        return Object.class;
    }


}
