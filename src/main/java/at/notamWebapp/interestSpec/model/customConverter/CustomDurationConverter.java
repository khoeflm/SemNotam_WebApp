package at.notamWebapp.interestSpec.model.customConverter;

import com.vaadin.data.util.converter.Converter;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import java.util.Locale;

/**
 * Created by khoef on 31.01.2017.
 */
public class CustomDurationConverter implements Converter<String, Duration> {
    @Override
    public Duration convertToModel(String s, Class<? extends Duration> aClass, Locale locale) throws ConversionException {
        try {
            return DatatypeFactory.newInstance().newDuration(true, 0, 0, 0, 0, Integer.parseInt(s),0);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String convertToPresentation(Duration duration, Class<? extends String> aClass, Locale locale) throws ConversionException {
        return Integer.toString(duration.getMinutes());
    }

    @Override
    public Class<Duration> getModelType() {
        return Duration.class;
    }

    @Override
    public Class<String> getPresentationType() {
        return String.class;
    }
}
