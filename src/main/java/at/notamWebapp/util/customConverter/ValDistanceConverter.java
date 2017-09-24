package at.notamWebapp.util.customConverter;

import aero.aixm.ValDistanceType;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.server.Page;
import com.vaadin.ui.Notification;

import java.math.BigDecimal;
import java.util.Locale;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 29.01.2017.
 */
public class ValDistanceConverter implements Converter<String, ValDistanceType> {

    @Override
    public ValDistanceType convertToModel(String s, Class<? extends ValDistanceType> aClass, Locale locale) throws ConversionException {
        ValDistanceType valDistance = new ValDistanceType();
        try {
            valDistance.setValue(BigDecimal.valueOf(Long.parseLong(s)));
            return valDistance;
        }catch (NumberFormatException e){
            new Notification(
                    "Attention",
                    "Only numeric values allowed.",
                    Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
            valDistance.setValue(BigDecimal.ZERO);
            return valDistance;
        }
    }

    @Override
    public String convertToPresentation(ValDistanceType valDistanceType, Class<? extends String> aClass, Locale locale) throws ConversionException {
         return valDistanceType.getValue().toString();
    }

    @Override
    public Class<ValDistanceType> getModelType() {
        return ValDistanceType.class;
    }

    @Override
    public Class<String> getPresentationType() {
        return String.class;
    }
}
