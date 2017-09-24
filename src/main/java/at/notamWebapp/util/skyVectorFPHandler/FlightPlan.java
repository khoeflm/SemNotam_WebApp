//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.12.20 um 01:35:12 PM CET 
//


package at.notamWebapp.util.skyVectorFPHandler;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="waypoint-table">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="waypoint" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="country-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="route">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="route-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="flight-plan-index" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="route-point" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="waypoint-identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="waypoint-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="waypoint-country-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "created",
    "waypointTable",
    "route"
})
@XmlRootElement(name = "flight-plan")
public class FlightPlan {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "waypoint-table", required = true)
    protected WaypointTable waypointTable;
    @XmlElement(required = true)
    protected Route route;

    /**
     * Ruft den Wert der created-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Legt den Wert der created-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Ruft den Wert der waypointTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WaypointTable }
     *     
     */
    public WaypointTable getWaypointTable() {
        return waypointTable;
    }

    /**
     * Legt den Wert der waypointTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WaypointTable }
     *     
     */
    public void setWaypointTable(WaypointTable value) {
        this.waypointTable = value;
    }

    /**
     * Ruft den Wert der route-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    public Route getRoute() {
        return route;
    }

    /**
     * Legt den Wert der route-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    public void setRoute(Route value) {
        this.route = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="route-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="flight-plan-index" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="route-point" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="waypoint-identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="waypoint-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="waypoint-country-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "routeName",
        "flightPlanIndex",
        "routePoint"
    })
    public static class Route {

        @XmlElement(name = "route-name", required = true)
        protected String routeName;
        @XmlElement(name = "flight-plan-index")
        protected byte flightPlanIndex;
        @XmlElement(name = "route-point")
        protected List<RoutePoint> routePoint;

        /**
         * Ruft den Wert der routeName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRouteName() {
            return routeName;
        }

        /**
         * Legt den Wert der routeName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRouteName(String value) {
            this.routeName = value;
        }

        /**
         * Ruft den Wert der flightPlanIndex-Eigenschaft ab.
         * 
         */
        public byte getFlightPlanIndex() {
            return flightPlanIndex;
        }

        /**
         * Legt den Wert der flightPlanIndex-Eigenschaft fest.
         * 
         */
        public void setFlightPlanIndex(byte value) {
            this.flightPlanIndex = value;
        }

        /**
         * Gets the value of the routePoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routePoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoutePoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoutePoint }
         * 
         * 
         */
        public List<RoutePoint> getRoutePoint() {
            if (routePoint == null) {
                routePoint = new ArrayList<RoutePoint>();
            }
            return this.routePoint;
        }


        /**
         * <p>Java-Klasse f�r anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="waypoint-identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="waypoint-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="waypoint-country-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "waypointIdentifier",
            "waypointType",
            "waypointCountryCode"
        })
        public static class RoutePoint {

            @XmlElement(name = "waypoint-identifier", required = true)
            protected String waypointIdentifier;
            @XmlElement(name = "waypoint-type", required = true)
            protected String waypointType;
            @XmlElement(name = "waypoint-country-code", required = true)
            protected String waypointCountryCode;

            /**
             * Ruft den Wert der waypointIdentifier-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWaypointIdentifier() {
                return waypointIdentifier;
            }

            /**
             * Legt den Wert der waypointIdentifier-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWaypointIdentifier(String value) {
                this.waypointIdentifier = value;
            }

            /**
             * Ruft den Wert der waypointType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWaypointType() {
                return waypointType;
            }

            /**
             * Legt den Wert der waypointType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWaypointType(String value) {
                this.waypointType = value;
            }

            /**
             * Ruft den Wert der waypointCountryCode-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWaypointCountryCode() {
                return waypointCountryCode;
            }

            /**
             * Legt den Wert der waypointCountryCode-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWaypointCountryCode(String value) {
                this.waypointCountryCode = value;
            }

        }

    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="waypoint" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="country-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "waypoint"
    })
    public static class WaypointTable {

        protected List<Waypoint> waypoint;

        /**
         * Gets the value of the waypoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the waypoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWaypoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Waypoint }
         * 
         * 
         */
        public List<Waypoint> getWaypoint() {
            if (waypoint == null) {
                waypoint = new ArrayList<Waypoint>();
            }
            return this.waypoint;
        }


        /**
         * <p>Java-Klasse f�r anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="country-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "identifier",
            "type",
            "countryCode",
            "lat",
            "lon",
            "comment"
        })
        public static class Waypoint {

            @XmlElement(required = true)
            protected String identifier;
            @XmlElement(required = true)
            protected String type;
            @XmlElement(name = "country-code", required = true)
            protected String countryCode;
            protected float lat;
            protected float lon;
            @XmlElement(required = true)
            protected String comment;

            /**
             * Ruft den Wert der identifier-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentifier() {
                return identifier;
            }

            /**
             * Legt den Wert der identifier-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentifier(String value) {
                this.identifier = value;
            }

            /**
             * Ruft den Wert der type-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Legt den Wert der type-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Ruft den Wert der countryCode-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Legt den Wert der countryCode-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * Ruft den Wert der lat-Eigenschaft ab.
             * 
             */
            public float getLat() {
                return lat;
            }

            /**
             * Legt den Wert der lat-Eigenschaft fest.
             * 
             */
            public void setLat(float value) {
                this.lat = value;
            }

            /**
             * Ruft den Wert der lon-Eigenschaft ab.
             * 
             */
            public float getLon() {
                return lon;
            }

            /**
             * Legt den Wert der lon-Eigenschaft fest.
             * 
             */
            public void setLon(float value) {
                this.lon = value;
            }

            /**
             * Ruft den Wert der comment-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComment() {
                return comment;
            }

            /**
             * Legt den Wert der comment-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComment(String value) {
                this.comment = value;
            }

        }

    }

}
