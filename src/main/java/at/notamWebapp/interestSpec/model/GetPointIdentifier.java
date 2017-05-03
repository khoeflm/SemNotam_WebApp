package at.notamWebapp.interestSpec.model;

/**
 * Created by khoef on 23.04.2017.
 */
public class GetPointIdentifier {

    public static String getFirstPointId(String segmentId){
        if(segmentId!="") {
            int x = segmentId.indexOf("-");
            return segmentId.substring(0, x - 1);
        }
        else return "";
    }

    public static String getSecondPointId(String segmentId){
        if(segmentId!="") {
            int x = segmentId.indexOf("-");
            int y = segmentId.length();
            return segmentId.substring(x + 1, y);
        }
        else return "";
    }
}
