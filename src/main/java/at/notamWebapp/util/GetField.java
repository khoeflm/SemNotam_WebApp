package at.notamWebapp.util;

import aero.aixm.AirportHeliportType;
import aero.aixm.message.BasicMessageMemberAIXMPropertyType;
import com.frequentis.semnotam.schema._1.ResultNotamPropertyType;
import net.opengis.gml.DirectPositionListType;
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

    public static List<Double> getNotamPosition(ResultNotamPropertyType rs){
        List<Double> airportPosition = new ArrayList<>();
        List<Double> notamPosition = new ArrayList<>();
        List<BasicMessageMemberAIXMPropertyType> notamPropList = rs.getResult().getHasNotam().getAIXMBasicMessage().getHasMember();
        for(BasicMessageMemberAIXMPropertyType member : notamPropList) {
            if(member.getAbstractAIXMFeature().getDeclaredType().equals(AirportHeliportType.class)){
                AirportHeliportType airport = (AirportHeliportType) member.getAbstractAIXMFeature().getValue();
                airportPosition = airport.getTimeSlice().get(0).getAirportHeliportTimeSlice().getARP().
                        getValue().getElevatedPoint().getPos().getValue();
            }
            else{
                try {
                    List<Double> curPositions = getPosition(member.getAbstractAIXMFeature().getValue());
                    if(curPositions != null) {
                        notamPosition.addAll(curPositions);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }
        if(notamPosition.size() == 0) {
            return airportPosition;
        }
        return notamPosition;

    }

    public static List<Double> getPosition(Object obj) throws IllegalAccessException {
        List<Field> fieldList = getAllModelFields(obj.getClass());
        boolean alreadyChecked = false;
        for(Field f : fieldList){
            f.setAccessible(true);
            if (f.get(obj) != null) {
                if (obj.getClass().getSimpleName().equalsIgnoreCase("ArrayList") && !alreadyChecked) {
                    ArrayList<Object> list = (ArrayList<Object>) obj;
                    for (int i = 0; i < list.size(); i++) {
                        List<Double> rekList = getPosition(((ArrayList<Object>) obj).get(i));
                        if(rekList != null) {
                            return rekList;
                        }
                    }
                    alreadyChecked = true;
                } else if (!f.getClass().isPrimitive() && f.getType().getName() != "long"
                        && !f.getType().getSimpleName().equalsIgnoreCase("short")
                        && !f.getType().getSimpleName().equalsIgnoreCase("boolean")
                        && !f.getType().getSimpleName().equalsIgnoreCase("String")
                        && !f.getType().getSimpleName().equalsIgnoreCase("int")
                        && !f.getType().getSimpleName().equalsIgnoreCase("Constructor")
                        && !f.getType().getSimpleName().equalsIgnoreCase("Float")
                        && !f.getType().getSimpleName().equalsIgnoreCase("Hashmap")
                        && !f.getType().getSimpleName().equalsIgnoreCase("Map")
                        && !f.getType().getSimpleName().equalsIgnoreCase("PermissionCollection")
                        && !f.getType().getSimpleName().equalsIgnoreCase("ProtectionDomain")
                        && !f.getType().getSimpleName().equalsIgnoreCase("ClassRepository")
                        && !f.getType().getSimpleName().equalsIgnoreCase("ReferenceQueue")
                        && !f.getType().getSimpleName().equalsIgnoreCase("Permission")
                        && !f.getType().getSimpleName().equalsIgnoreCase("ReflectionFactory")
                        && !f.getType().getSimpleName().equalsIgnoreCase("BigInteger")
                        && !f.getType().getSimpleName().equalsIgnoreCase("BigDecimal")
                        && !f.getType().getSimpleName().equalsIgnoreCase("XMLGregorianCalendar")
                        && !f.getType().getSimpleName().equalsIgnoreCase("notamtype")
                        && !f.getName().equalsIgnoreCase("name")
                        && !f.getName().equalsIgnoreCase("declaredType")
                        && !f.getName().equalsIgnoreCase("scope")) {

                    if (f.getType().equals(DirectPositionType.class)) {
                        DirectPositionType pos = (DirectPositionType) f.get(obj);
                        return pos.getValue();
                    }
                    else if (f.getType().equals(DirectPositionListType.class)) {
                        DirectPositionListType posList = (DirectPositionListType) f.get(obj);
                        return posList.getValue();

                    }
                    else {
                        List<Double> rekList = getPosition(f.get(obj));
                        if(rekList != null) {
                            return rekList;
                        }
                    }
                }
            }
        }
        return null;
    }
}
