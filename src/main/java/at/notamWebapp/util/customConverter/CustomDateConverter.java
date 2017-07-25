package at.notamWebapp.util.customConverter;

import com.vaadin.data.util.converter.Converter;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by khoef on 31.01.2017.
 */
public class CustomDateConverter implements Converter<Date, XMLGregorianCalendar>{
    @Override
    public XMLGregorianCalendar convertToModel(Date date, Class<? extends XMLGregorianCalendar> aClass, Locale locale) throws ConversionException {
        DateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        if(date == null){
            return null;
        }
        else {
            try {
                date = format.parse(String.valueOf(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.setTime(date);
        XMLGregorianCalendar xmlGreCal = null;

        try {
            xmlGreCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc1);

        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return xmlGreCal;
    }

    @Override
    public Date convertToPresentation(XMLGregorianCalendar xmlGregorianCalendar, Class<? extends Date> aClass, Locale locale) throws ConversionException {
        if(xmlGregorianCalendar == null){
            return null;
        }
       else  return xmlGregorianCalendar.toGregorianCalendar().getTime();
    }

    @Override
    public Class<XMLGregorianCalendar> getModelType() {
        return XMLGregorianCalendar.class;
    }

    @Override
    public Class<Date> getPresentationType() {
        return Date.class;
    }
}
