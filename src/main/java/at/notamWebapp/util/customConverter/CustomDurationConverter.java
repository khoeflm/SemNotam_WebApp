package at.notamWebapp.util.customConverter;

import com.vaadin.data.util.converter.Converter;
import com.vaadin.server.Page;
import com.vaadin.ui.Notification;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import java.util.Locale;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 31.01.2017.
 */
public class CustomDurationConverter implements Converter<String, Duration> {
    @Override
    public Duration convertToModel(String s, Class<? extends Duration> aClass, Locale locale) throws ConversionException {

        try {
            return DatatypeFactory.newInstance().newDuration(true, 0, 0, 0, 0, Integer.parseInt(s),0);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            try {
                new Notification(
                        "Attention",
                        "Only numeric values allowed.",
                        Notification.Type.ERROR_MESSAGE).show(Page.getCurrent());
                return DatatypeFactory.newInstance().newDuration(true,0,0,0,0,0,0);
            } catch (DatatypeConfigurationException e1) {
                e1.printStackTrace();
            }
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
