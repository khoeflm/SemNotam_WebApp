
package aero.aixm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.RouteSegmentExtensionType;


/**
 * <p>Java-Klasse für RouteSegmentTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteSegmentTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RouteSegmentPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRouteSegmentExtension"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteSegmentTimeSliceType", propOrder = {
    "level",
    "upperLimit",
    "upperLimitReference",
    "lowerLimit",
    "lowerLimitReference",
    "minimumObstacleClearanceAltitude",
    "pathType",
    "trueTrack",
    "magneticTrack",
    "reverseTrueTrack",
    "reverseMagneticTrack",
    "length",
    "widthLeft",
    "widthRight",
    "turnDirection",
    "signalGap",
    "minimumEnrouteAltitude",
    "minimumCrossingAtEnd",
    "minimumCrossingAtEndReference",
    "maximumCrossingAtEnd",
    "maximumCrossingAtEndReference",
    "navigationType",
    "requiredNavigationPerformance",
    "designatorSuffix",
    "start",
    "routeFormed",
    "evaluationArea",
    "curveExtent",
    "end",
    "availability",
    "annotation",
    "extension"
})
public class RouteSegmentTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "level", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLevelType> level;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "minimumObstacleClearanceAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumObstacleClearanceAltitude;
    @XmlElementRef(name = "pathType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteSegmentPathType> pathType;
    @XmlElementRef(name = "trueTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> trueTrack;
    @XmlElementRef(name = "magneticTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> magneticTrack;
    @XmlElementRef(name = "reverseTrueTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> reverseTrueTrack;
    @XmlElementRef(name = "reverseMagneticTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> reverseMagneticTrack;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "widthLeft", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthLeft;
    @XmlElementRef(name = "widthRight", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthRight;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
    @XmlElementRef(name = "signalGap", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> signalGap;
    @XmlElementRef(name = "minimumEnrouteAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumEnrouteAltitude;
    @XmlElementRef(name = "minimumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumCrossingAtEnd;
    @XmlElementRef(name = "minimumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> minimumCrossingAtEndReference;
    @XmlElementRef(name = "maximumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> maximumCrossingAtEnd;
    @XmlElementRef(name = "maximumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> maximumCrossingAtEndReference;
    @XmlElementRef(name = "navigationType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteNavigationType> navigationType;
    @XmlElementRef(name = "requiredNavigationPerformance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRNPType> requiredNavigationPerformance;
    @XmlElementRef(name = "designatorSuffix", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteDesignatorSuffixType> designatorSuffix;
    @XmlElementRef(name = "start", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<EnRouteSegmentPointPropertyType> start;
    @XmlElementRef(name = "routeFormed", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyType> routeFormed;
    @XmlElementRef(name = "evaluationArea", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ObstacleAssessmentAreaPropertyType> evaluationArea;
    @XmlElementRef(name = "curveExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CurvePropertyType> curveExtent;
    @XmlElementRef(name = "end", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<EnRouteSegmentPointPropertyType> end;
    @XmlElement(nillable = true)
    protected List<RouteAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RouteSegmentTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der level-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelType }{@code >}
     *     
     */
    public JAXBElement<CodeLevelType> getLevel() {
        return level;
    }

    /**
     * Legt den Wert der level-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelType }{@code >}
     *     
     */
    public void setLevel(JAXBElement<CodeLevelType> value) {
        this.level = value;
    }

    /**
     * Ruft den Wert der upperLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Legt den Wert der upperLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setUpperLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimit = value;
    }

    /**
     * Ruft den Wert der upperLimitReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getUpperLimitReference() {
        return upperLimitReference;
    }

    /**
     * Legt den Wert der upperLimitReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setUpperLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLimitReference = value;
    }

    /**
     * Ruft den Wert der lowerLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Legt den Wert der lowerLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setLowerLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimit = value;
    }

    /**
     * Ruft den Wert der lowerLimitReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getLowerLimitReference() {
        return lowerLimitReference;
    }

    /**
     * Legt den Wert der lowerLimitReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setLowerLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLimitReference = value;
    }

    /**
     * Ruft den Wert der minimumObstacleClearanceAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumObstacleClearanceAltitude() {
        return minimumObstacleClearanceAltitude;
    }

    /**
     * Legt den Wert der minimumObstacleClearanceAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumObstacleClearanceAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumObstacleClearanceAltitude = value;
    }

    /**
     * Ruft den Wert der pathType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteSegmentPathType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteSegmentPathType> getPathType() {
        return pathType;
    }

    /**
     * Legt den Wert der pathType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteSegmentPathType }{@code >}
     *     
     */
    public void setPathType(JAXBElement<CodeRouteSegmentPathType> value) {
        this.pathType = value;
    }

    /**
     * Ruft den Wert der trueTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getTrueTrack() {
        return trueTrack;
    }

    /**
     * Legt den Wert der trueTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setTrueTrack(JAXBElement<ValBearingType> value) {
        this.trueTrack = value;
    }

    /**
     * Ruft den Wert der magneticTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getMagneticTrack() {
        return magneticTrack;
    }

    /**
     * Legt den Wert der magneticTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setMagneticTrack(JAXBElement<ValBearingType> value) {
        this.magneticTrack = value;
    }

    /**
     * Ruft den Wert der reverseTrueTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getReverseTrueTrack() {
        return reverseTrueTrack;
    }

    /**
     * Legt den Wert der reverseTrueTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setReverseTrueTrack(JAXBElement<ValBearingType> value) {
        this.reverseTrueTrack = value;
    }

    /**
     * Ruft den Wert der reverseMagneticTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getReverseMagneticTrack() {
        return reverseMagneticTrack;
    }

    /**
     * Legt den Wert der reverseMagneticTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setReverseMagneticTrack(JAXBElement<ValBearingType> value) {
        this.reverseMagneticTrack = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der widthLeft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidthLeft() {
        return widthLeft;
    }

    /**
     * Legt den Wert der widthLeft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthLeft(JAXBElement<ValDistanceType> value) {
        this.widthLeft = value;
    }

    /**
     * Ruft den Wert der widthRight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidthRight() {
        return widthRight;
    }

    /**
     * Legt den Wert der widthRight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthRight(JAXBElement<ValDistanceType> value) {
        this.widthRight = value;
    }

    /**
     * Ruft den Wert der turnDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public JAXBElement<CodeDirectionTurnType> getTurnDirection() {
        return turnDirection;
    }

    /**
     * Legt den Wert der turnDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setTurnDirection(JAXBElement<CodeDirectionTurnType> value) {
        this.turnDirection = value;
    }

    /**
     * Ruft den Wert der signalGap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSignalGap() {
        return signalGap;
    }

    /**
     * Legt den Wert der signalGap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSignalGap(JAXBElement<CodeYesNoType> value) {
        this.signalGap = value;
    }

    /**
     * Ruft den Wert der minimumEnrouteAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumEnrouteAltitude() {
        return minimumEnrouteAltitude;
    }

    /**
     * Legt den Wert der minimumEnrouteAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumEnrouteAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumEnrouteAltitude = value;
    }

    /**
     * Ruft den Wert der minimumCrossingAtEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumCrossingAtEnd() {
        return minimumCrossingAtEnd;
    }

    /**
     * Legt den Wert der minimumCrossingAtEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumCrossingAtEnd = value;
    }

    /**
     * Ruft den Wert der minimumCrossingAtEndReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getMinimumCrossingAtEndReference() {
        return minimumCrossingAtEndReference;
    }

    /**
     * Legt den Wert der minimumCrossingAtEndReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.minimumCrossingAtEndReference = value;
    }

    /**
     * Ruft den Wert der maximumCrossingAtEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMaximumCrossingAtEnd() {
        return maximumCrossingAtEnd;
    }

    /**
     * Legt den Wert der maximumCrossingAtEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.maximumCrossingAtEnd = value;
    }

    /**
     * Ruft den Wert der maximumCrossingAtEndReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getMaximumCrossingAtEndReference() {
        return maximumCrossingAtEndReference;
    }

    /**
     * Legt den Wert der maximumCrossingAtEndReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.maximumCrossingAtEndReference = value;
    }

    /**
     * Ruft den Wert der navigationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteNavigationType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteNavigationType> getNavigationType() {
        return navigationType;
    }

    /**
     * Legt den Wert der navigationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteNavigationType }{@code >}
     *     
     */
    public void setNavigationType(JAXBElement<CodeRouteNavigationType> value) {
        this.navigationType = value;
    }

    /**
     * Ruft den Wert der requiredNavigationPerformance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    public JAXBElement<CodeRNPType> getRequiredNavigationPerformance() {
        return requiredNavigationPerformance;
    }

    /**
     * Legt den Wert der requiredNavigationPerformance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    public void setRequiredNavigationPerformance(JAXBElement<CodeRNPType> value) {
        this.requiredNavigationPerformance = value;
    }

    /**
     * Ruft den Wert der designatorSuffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorSuffixType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteDesignatorSuffixType> getDesignatorSuffix() {
        return designatorSuffix;
    }

    /**
     * Legt den Wert der designatorSuffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorSuffixType }{@code >}
     *     
     */
    public void setDesignatorSuffix(JAXBElement<CodeRouteDesignatorSuffixType> value) {
        this.designatorSuffix = value;
    }

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<EnRouteSegmentPointPropertyType> getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointPropertyType }{@code >}
     *     
     */
    public void setStart(JAXBElement<EnRouteSegmentPointPropertyType> value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der routeFormed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePropertyType> getRouteFormed() {
        return routeFormed;
    }

    /**
     * Legt den Wert der routeFormed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public void setRouteFormed(JAXBElement<RoutePropertyType> value) {
        this.routeFormed = value;
    }

    /**
     * Ruft den Wert der evaluationArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObstacleAssessmentAreaPropertyType }{@code >}
     *     
     */
    public JAXBElement<ObstacleAssessmentAreaPropertyType> getEvaluationArea() {
        return evaluationArea;
    }

    /**
     * Legt den Wert der evaluationArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObstacleAssessmentAreaPropertyType }{@code >}
     *     
     */
    public void setEvaluationArea(JAXBElement<ObstacleAssessmentAreaPropertyType> value) {
        this.evaluationArea = value;
    }

    /**
     * Ruft den Wert der curveExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     *     
     */
    public JAXBElement<CurvePropertyType> getCurveExtent() {
        return curveExtent;
    }

    /**
     * Legt den Wert der curveExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     *     
     */
    public void setCurveExtent(JAXBElement<CurvePropertyType> value) {
        this.curveExtent = value;
    }

    /**
     * Ruft den Wert der end-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<EnRouteSegmentPointPropertyType> getEnd() {
        return end;
    }

    /**
     * Legt den Wert der end-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointPropertyType }{@code >}
     *     
     */
    public void setEnd(JAXBElement<EnRouteSegmentPointPropertyType> value) {
        this.end = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteAvailabilityPropertyType }
     * 
     * 
     */
    public List<RouteAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<RouteAvailabilityPropertyType>();
        }
        return this.availability;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteSegmentTimeSliceType.Extension }
     * 
     * 
     */
    public List<RouteSegmentTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RouteSegmentTimeSliceType.Extension>();
        }
        return this.extension;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRouteSegmentExtension"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractRouteSegmentExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractRouteSegmentExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractRouteSegmentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractRouteSegmentExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RouteSegmentExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRouteSegmentExtension() {
            return abstractRouteSegmentExtension;
        }

        /**
         * Legt den Wert der abstractRouteSegmentExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RouteSegmentExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractRouteSegmentExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRouteSegmentExtension = value;
        }

        /**
         * Ruft den Wert der owns-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * Legt den Wert der owns-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwns(Boolean value) {
            this.owns = value;
        }

    }

}
