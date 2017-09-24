package at.notamWebapp.util.googleMapsService;

import aero.aixm.ElevatedPointPropertyType;
import at.notamWebapp.evaluatedInterestSpec.controller.EvalNotamController;
import at.notamWebapp.evaluatedInterestSpec.model.NotamTableRow;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapInfoWindow;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapMarker;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolygon;
import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline;
import net.opengis.gml.DirectPositionType;

import java.util.ArrayList;
import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 15.06.2017.
 */
public class GoogleMapsDrawer {
    private GoogleMapPolyline flightpathPolyLine;
    private GoogleMapInfoWindow infoWindow;
    private List<GoogleMapMarker> markerList;
    private List<GoogleMapPolygon> polygonList;
    private GoogleMap map;

    public GoogleMapsDrawer(EvalNotamController controller, GoogleMap googleMap) {
        map = googleMap;
        map.addMarkerClickListener(controller);
        infoWindow =  new GoogleMapInfoWindow();
    }

    public GoogleMapsDrawer(GoogleMap googleMap) {
        map = googleMap;
    }

    public void drawFlightPath(List<ElevatedPointPropertyType> pointList){
        map.removePolyline(flightpathPolyLine);
        List<LatLon> points = new ArrayList<>();
        Double biggestLat = 0.0, biggestLon = 0.0, smallestLat = 0.0, smallestLon = 0.0;
        for(ElevatedPointPropertyType p : pointList){
            DirectPositionType pos = p.getElevatedPoint().getPos();
            Double lat = pos.getValue().get(0);
            Double lon = pos.getValue().get(1);
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

    public void drawNotamMarkers(List<NotamTableRow> notamTableValues) {
        if(markerList == null){
            markerList = new ArrayList<>();
        }else if(markerList.size() != 0){
            for(GoogleMapMarker marker : markerList){
                map.removeMarker(marker);
            }
        }
        if(polygonList == null){
            polygonList = new ArrayList<>();
        }else if(markerList.size() != 0){
            for(GoogleMapPolygon marker : polygonList){
                map.removePolygonOverlay(marker);
            }
        }
        for(NotamTableRow row : notamTableValues){
            LatLon centerPosition = getNotamCenterPosition(row.getPos());
            if(row.getPos().size()<=2) {
                GoogleMapMarker marker = new GoogleMapMarker(row.getNotamId(), centerPosition, false);
                if (row.getImportance().equalsIgnoreCase("flight critical")) {
                    marker.setIconUrl("VAADIN/themes/mytheme/icons/warning_red1.png");
                } else if (row.getImportance().equalsIgnoreCase("operational restriction")) {
                    marker.setIconUrl("VAADIN/themes/mytheme/icons/warning_blue1.png");
                } else if (row.getImportance().equalsIgnoreCase("potential hazard")) {
                    marker.setIconUrl("VAADIN/themes/mytheme/icons/warning_black1.png");
                } else {
                    marker.setIconUrl("VAADIN/themes/mytheme/icons/info1.png");
                }
                markerList.add(marker);
                map.addMarker(marker);
            }

            else if(row.getPos().size()>2) {
                GoogleMapMarker marker = new GoogleMapMarker(row.getNotamId(), centerPosition, false);
                markerList.add(marker);
                map.addMarker(marker);
                GoogleMapPolygon polygon = new GoogleMapPolygon();
                List<LatLon> posList = new ArrayList<>();
                for (int i = 0; i + 1 < row.getPos().size(); i = i + 2) {
                    posList.add(new LatLon(row.getPos().get(i), row.getPos().get(i + 1)));
                }
                polygon.setFillColor("#FFFFFF");
                polygon.setCoordinates(posList);
                polygon.setId(Double.doubleToLongBits(row.getPos().get(0)));
                map.addPolygonOverlay(polygon);
                polygonList.add(polygon);
            }
        }
    }

    private LatLon getNotamCenterPosition(List<Double> posList) {
        Double latSum = 0.0, lonSum = 0.0;
        for(int i=0; i < posList.size(); i = i+2){
            latSum = latSum + posList.get(i);
            lonSum = lonSum + posList.get(i+1);
        }
        return new LatLon(latSum/(posList.size()/2),lonSum/(posList.size()/2));
    }

    public void fitToBounds(List<LatLon> notamPosition) {
        map.setMaxZoom(14);
        map.fitToBounds(notamPosition.get(1), notamPosition.get(0));
    }

    public void setInfoWindow(NotamTableRow selectedNotam) {
        closeInfoWindow();
        for(GoogleMapMarker notamMarker : markerList) {
            if(notamMarker.getCaption().equals(selectedNotam.getNotamId())) {
                infoWindow = new GoogleMapInfoWindow();
                infoWindow.setAnchorMarker(notamMarker);
                infoWindow.setContent(selectedNotam.getNotamText() + System.lineSeparator() + selectedNotam.getImportance());
                map.openInfoWindow(infoWindow);
            }
        }
    }

    public void closeInfoWindow() {
        infoWindow.setAnchorMarker(null);
    }
}