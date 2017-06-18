package at.notamWebapp;

import net.opengis.gml.DirectPositionType;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by khoef on 16.06.2017.
 */
public class GetField {
    /**
     * Returns the first {@link Field} in the hierarchy for the specified name
     */

    public static List<Field> getAllModelFields(Class aClass) {
        List<Field> fields = new ArrayList<>();
        do {
            fields.addAll(Arrays.asList(aClass.getDeclaredFields()));
            aClass = aClass.getSuperclass();
        } while (aClass != null);
        return fields;
    }

    public static DirectPositionType getPosition(Object obj){
        List<Field> fieldList = getAllModelFields(obj.getClass());
        for(Field f : fieldList){
            if(!f.getClass().isPrimitive()){
                try {
                    f.setAccessible(true);
                    if(f.getName().equals("pos")) {

                            return (DirectPositionType) f.get(obj);

                    } else{
                        if(f.get(obj)!=null) {
                            getPosition(f.get(obj));
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
