package at.notamWebapp;

import aero.aixm.ElevatedPointPropertyType;
import at.notamWebapp.evaluatedInterestSpec.model.NotamTableRow;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline;
import net.opengis.gml.DirectPositionType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khoef on 15.06.2017.
 */
public class GoogleMapsDrawer {
    GoogleMapPolyline flightpath;
    public void drawFlightPath(GoogleMap map, List<ElevatedPointPropertyType> pointList){
        map.removePolyline(flightpath);
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
        flightpath = new GoogleMapPolyline(points);
        flightpath.setStrokeWeight(3);
        map.fitToBounds(northEastBound, southWestBound);
        map.addPolyline(flightpath);
    }

    public void drawNotamMarkers(GoogleMap googleMap, List<NotamTableRow> notamTableValues) {
        googleMap.removeAllComponents();
        for(NotamTableRow row : notamTableValues){
            GoogleMapMarker marker = new GoogleMapMarker(row.getNotamId(),new LatLon(row.getPos().getValue().get(0),
                    row.getPos().getValue().get(1)),true);
            googleMap.addMarker(marker);
        }

    }
}