package at.notamWebapp.util.customConverter;

import com.frequentis.semnotam.schema._1.ElevatedPointReferencePropertyType;
import com.vaadin.data.util.converter.Converter;

import java.util.Locale;

/**
 * Created by khoef on 29.01.2017.
 */
public class ElevatedPointConverter implements Converter<String, ElevatedPointReferencePropertyType>{

    @Override
    public ElevatedPointReferencePropertyType convertToModel(String s, Class<? extends ElevatedPointReferencePropertyType>
            aClass, Locale locale) throws ConversionException {
        ElevatedPointReferencePropertyType point = new ElevatedPointReferencePropertyType();
        point.setHref(s);
        return point;
    }

    @Override
    public String convertToPresentation(ElevatedPointReferencePropertyType elevatedPointReferencePropertyType,
                                        Class<? extends String> aClass, Locale locale) throws ConversionException {
        return elevatedPointReferencePropertyType.getHref();
    }

    @Override
    public Class getModelType() {
        return ElevatedPointReferencePropertyType.class;
    }

    @Override
    public Class getPresentationType() {
        return String.class;
    }
}
