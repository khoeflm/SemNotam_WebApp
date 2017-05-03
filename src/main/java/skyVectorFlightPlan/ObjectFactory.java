//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.12.20 um 01:35:12 PM CET 
//


package skyVectorFlightPlan;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightPlan }
     * 
     */
    public FlightPlan createFlightPlan() {
        return new FlightPlan();
    }

    /**
     * Create an instance of {@link FlightPlan.Route }
     * 
     */
    public FlightPlan.Route createFlightPlanRoute() {
        return new FlightPlan.Route();
    }

    /**
     * Create an instance of {@link FlightPlan.WaypointTable }
     * 
     */
    public FlightPlan.WaypointTable createFlightPlanWaypointTable() {
        return new FlightPlan.WaypointTable();
    }

    /**
     * Create an instance of {@link FlightPlan.Route.RoutePoint }
     * 
     */
    public FlightPlan.Route.RoutePoint createFlightPlanRouteRoutePoint() {
        return new FlightPlan.Route.RoutePoint();
    }

    /**
     * Create an instance of {@link FlightPlan.WaypointTable.Waypoint }
     * 
     */
    public FlightPlan.WaypointTable.Waypoint createFlightPlanWaypointTableWaypoint() {
        return new FlightPlan.WaypointTable.Waypoint();
    }

}
