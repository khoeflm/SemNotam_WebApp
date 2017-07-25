package at.notamWebapp.util;

import aero.aixm.ElevatedPointPropertyType;
import at.notamWebapp.evaluatedInterestSpec.model.NotamTableRow;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline;
import net.opengis.gml.DirectPositionType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khoef on 15.06.2017.
 */
public class GoogleMapsDrawer {
    GoogleMapPolyline flightpathPolyLine;
    List<GoogleMapMarker> markerList;
    List<GoogleMapPolygon> polygonList;

    public void drawFlightPath(GoogleMap map, List<ElevatedPointPropertyType> pointList){
        map.removePolyline(flightpathPolyLine);
        List<LatLon> points = new ArrayList<>();
        Double biggestLat = 0.0, biggestLon = 0.0, smallestLat = 0.0, smallestLon = 0.0;
        for(ElevatedPointPropertyType p : pointList){
            DirectPositionType pos = p.getElevatedPoint().getPos();
            Double lat = new Double(pos.getValue().get(0));
            Double lon = new Double(pos.getValue().get(1));
            if(smallestLat==0.0 || lat < smallestLat){
                smallestLat = lat;
            }
            if(biggestLat==0.0 || lat > biggestLat){
                biggestLat = lat;
            }
            if(smallestLon==0.0 || lon < smallestLon){
                smallestLon = lon;
            }
            if(biggestLon==0.0 || lon > biggestLon){
                biggestLon = lon;
            }
            points.add(new LatLon(pos.getValue().get(0), pos.getValue().get(1)));
        }
        LatLon northEastBound = new LatLon(biggestLat, biggestLon);
        LatLon southWestBound = new LatLon(smallestLat, smallestLon);
        flightpathPolyLine = new GoogleMapPolyline(points);
        flightpathPolyLine.setStrokeWeight(3);
        map.fitToBounds(northEastBound, southWestBound);
        map.addPolyline(flightpathPolyLine);
    }

    public void drawNotamMarkers(GoogleMap googleMap, List<NotamTableRow> notamTableValues) {
        if(markerList == null){
            markerList = new ArrayList<>();
        }else if(markerList.size() != 0){
            for(GoogleMapMarker marker : markerList){
                googleMap.removeMarker(marker);
            }
        }
        if(polygonList == null){
            polygonList = new ArrayList<>();
        }else if(markerList.size() != 0){
            for(GoogleMapPolygon marker : polygonList){
                googleMap.removePolygonOverlay(marker);
            }
        }
        for(NotamTableRow row : notamTableValues){
            if(row.getPos().size()<=2) {
                GoogleMapMarker marker = new GoogleMapMarker(row.getNotamId(), new LatLon(row.getPos().get(0),
                        row.getPos().get(1)), true);
                if(row.getImportance().equalsIgnoreCase("flight critical")) {
                    marker.setIconUrl("VAADIN/themes/mytheme/icons/warning_red1.png");
                }else if(row.getImportance().equalsIgnoreCase("operational restriction")) {
                    marker.setIconUrl("VAADIN/themes/mytheme/icons/warning_blue1.png");
                }else if(row.getImportance().equalsIgnoreCase("potential hazard")) {
                    marker.setIconUrl("VAADIN/themes/mytheme/icons/warning_black1.png");
                }else{
                    marker.setIconUrl("VAADIN/themes/mytheme/icons/info1.png");
                }
                googleMap.addMarker(marker);
                markerList.add(marker);
            }else{
                List<LatLon> posList = new ArrayList<>();
                GoogleMapPolygon marker = new GoogleMapPolygon();
                for(int i = 0; i+1 < row.getPos().size(); i=i+2) {
                    posList.add(new LatLon(row.getPos().get(i),row.getPos().get(i+1)));
                }
                if(row.getImportance().equalsIgnoreCase("flight critical")) {
                    marker.setFillColor("#FF0000");
                }else if(row.getImportance().equalsIgnoreCase("operational restriction")) {
                    marker.setFillColor("#FFFF00");
                }else if(row.getImportance().equalsIgnoreCase("potential hazard")) {
                    marker.setFillColor("#00FFFF");
                }else{
                    marker.setFillColor("#FFFFFF");
                }
                marker.setCoordinates(posList);
                googleMap.addPolygonOverlay(marker);
                polygonList.add(marker);
            }
        }
    }
}