
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
import aero.aixm.event.AirportHeliportExtensionType;


/**
 * <p>Java-Klasse für AirportHeliportTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirportHeliportTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AirportHeliportPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirportHeliportExtension"/&gt;
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
@XmlType(name = "AirportHeliportTimeSliceType", propOrder = {
    "designator",
    "airportHeliportName",
    "locationIndicatorICAO",
    "designatorIATA",
    "type",
    "certifiedICAO",
    "privateUse",
    "controlType",
    "fieldElevation",
    "fieldElevationAccuracy",
    "verticalDatum",
    "magneticVariation",
    "magneticVariationAccuracy",
    "dateMagneticVariation",
    "magneticVariationChange",
    "referenceTemperature",
    "altimeterCheckLocation",
    "secondaryPowerSupply",
    "windDirectionIndicator",
    "landingDirectionIndicator",
    "transitionAltitude",
    "transitionLevel",
    "lowestTemperature",
    "abandoned",
    "certificationDate",
    "certificationExpirationDate",
    "contaminant",
    "servedCity",
    "responsibleOrganisation",
    "arp",
    "aviationBoundary",
    "altimeterSource",
    "contact",
    "availability",
    "annotation",
    "extension"
})
public class AirportHeliportTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirportHeliportDesignatorType> designator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> airportHeliportName;
    @XmlElementRef(name = "locationIndicatorICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeICAOType> locationIndicatorICAO;
    @XmlElementRef(name = "designatorIATA", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeIATAType> designatorIATA;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirportHeliportType> type;
    @XmlElementRef(name = "certifiedICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> certifiedICAO;
    @XmlElementRef(name = "privateUse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> privateUse;
    @XmlElementRef(name = "controlType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryOperationsType> controlType;
    @XmlElementRef(name = "fieldElevation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> fieldElevation;
    @XmlElementRef(name = "fieldElevationAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> fieldElevationAccuracy;
    @XmlElementRef(name = "verticalDatum", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalDatumType> verticalDatum;
    @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationType> magneticVariation;
    @XmlElementRef(name = "magneticVariationAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> magneticVariationAccuracy;
    @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateMagneticVariation;
    @XmlElementRef(name = "magneticVariationChange", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationChangeType> magneticVariationChange;
    @XmlElementRef(name = "referenceTemperature", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> referenceTemperature;
    @XmlElementRef(name = "altimeterCheckLocation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> altimeterCheckLocation;
    @XmlElementRef(name = "secondaryPowerSupply", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> secondaryPowerSupply;
    @XmlElementRef(name = "windDirectionIndicator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> windDirectionIndicator;
    @XmlElementRef(name = "landingDirectionIndicator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> landingDirectionIndicator;
    @XmlElementRef(name = "transitionAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> transitionAltitude;
    @XmlElementRef(name = "transitionLevel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFLType> transitionLevel;
    @XmlElementRef(name = "lowestTemperature", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> lowestTemperature;
    @XmlElementRef(name = "abandoned", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> abandoned;
    @XmlElementRef(name = "certificationDate", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateType> certificationDate;
    @XmlElementRef(name = "certificationExpirationDate", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateType> certificationExpirationDate;
    @XmlElement(nillable = true)
    protected List<AirportHeliportContaminationPropertyType> contaminant;
    @XmlElement(nillable = true)
    protected List<CityPropertyType> servedCity;
    @XmlElementRef(name = "responsibleOrganisation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> responsibleOrganisation;
    @XmlElementRef(name = "ARP", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> arp;
    @XmlElementRef(name = "aviationBoundary", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedSurfacePropertyType> aviationBoundary;
    @XmlElement(nillable = true)
    protected List<AltimeterSourcePropertyType> altimeterSource;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElement(nillable = true)
    protected List<AirportHeliportAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AirportHeliportTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportDesignatorType }{@code >}
     *     
     */
    public JAXBElement<CodeAirportHeliportDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeAirportHeliportDesignatorType> value) {
        this.designator = value;
    }

    /**
     * Ruft den Wert der airportHeliportName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getAirportHeliportName() {
        return airportHeliportName;
    }

    /**
     * Legt den Wert der airportHeliportName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAirportHeliportName(JAXBElement<TextNameType> value) {
        this.airportHeliportName = value;
    }

    /**
     * Ruft den Wert der locationIndicatorICAO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeICAOType }{@code >}
     *     
     */
    public JAXBElement<CodeICAOType> getLocationIndicatorICAO() {
        return locationIndicatorICAO;
    }

    /**
     * Legt den Wert der locationIndicatorICAO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeICAOType }{@code >}
     *     
     */
    public void setLocationIndicatorICAO(JAXBElement<CodeICAOType> value) {
        this.locationIndicatorICAO = value;
    }

    /**
     * Ruft den Wert der designatorIATA-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeIATAType }{@code >}
     *     
     */
    public JAXBElement<CodeIATAType> getDesignatorIATA() {
        return designatorIATA;
    }

    /**
     * Legt den Wert der designatorIATA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeIATAType }{@code >}
     *     
     */
    public void setDesignatorIATA(JAXBElement<CodeIATAType> value) {
        this.designatorIATA = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportType }{@code >}
     *     
     */
    public JAXBElement<CodeAirportHeliportType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportHeliportType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAirportHeliportType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der certifiedICAO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getCertifiedICAO() {
        return certifiedICAO;
    }

    /**
     * Legt den Wert der certifiedICAO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCertifiedICAO(JAXBElement<CodeYesNoType> value) {
        this.certifiedICAO = value;
    }

    /**
     * Ruft den Wert der privateUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getPrivateUse() {
        return privateUse;
    }

    /**
     * Legt den Wert der privateUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setPrivateUse(JAXBElement<CodeYesNoType> value) {
        this.privateUse = value;
    }

    /**
     * Ruft den Wert der controlType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public JAXBElement<CodeMilitaryOperationsType> getControlType() {
        return controlType;
    }

    /**
     * Legt den Wert der controlType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public void setControlType(JAXBElement<CodeMilitaryOperationsType> value) {
        this.controlType = value;
    }

    /**
     * Ruft den Wert der fieldElevation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getFieldElevation() {
        return fieldElevation;
    }

    /**
     * Legt den Wert der fieldElevation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setFieldElevation(JAXBElement<ValDistanceVerticalType> value) {
        this.fieldElevation = value;
    }

    /**
     * Ruft den Wert der fieldElevationAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getFieldElevationAccuracy() {
        return fieldElevationAccuracy;
    }

    /**
     * Legt den Wert der fieldElevationAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setFieldElevationAccuracy(JAXBElement<ValDistanceVerticalType> value) {
        this.fieldElevationAccuracy = value;
    }

    /**
     * Ruft den Wert der verticalDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalDatumType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalDatumType> getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Legt den Wert der verticalDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalDatumType }{@code >}
     *     
     */
    public void setVerticalDatum(JAXBElement<CodeVerticalDatumType> value) {
        this.verticalDatum = value;
    }

    /**
     * Ruft den Wert der magneticVariation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     *     
     */
    public JAXBElement<ValMagneticVariationType> getMagneticVariation() {
        return magneticVariation;
    }

    /**
     * Legt den Wert der magneticVariation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     *     
     */
    public void setMagneticVariation(JAXBElement<ValMagneticVariationType> value) {
        this.magneticVariation = value;
    }

    /**
     * Ruft den Wert der magneticVariationAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getMagneticVariationAccuracy() {
        return magneticVariationAccuracy;
    }

    /**
     * Legt den Wert der magneticVariationAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setMagneticVariationAccuracy(JAXBElement<ValAngleType> value) {
        this.magneticVariationAccuracy = value;
    }

    /**
     * Ruft den Wert der dateMagneticVariation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public JAXBElement<DateYearType> getDateMagneticVariation() {
        return dateMagneticVariation;
    }

    /**
     * Legt den Wert der dateMagneticVariation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setDateMagneticVariation(JAXBElement<DateYearType> value) {
        this.dateMagneticVariation = value;
    }

    /**
     * Ruft den Wert der magneticVariationChange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationChangeType }{@code >}
     *     
     */
    public JAXBElement<ValMagneticVariationChangeType> getMagneticVariationChange() {
        return magneticVariationChange;
    }

    /**
     * Legt den Wert der magneticVariationChange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationChangeType }{@code >}
     *     
     */
    public void setMagneticVariationChange(JAXBElement<ValMagneticVariationChangeType> value) {
        this.magneticVariationChange = value;
    }

    /**
     * Ruft den Wert der referenceTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public JAXBElement<ValTemperatureType> getReferenceTemperature() {
        return referenceTemperature;
    }

    /**
     * Legt den Wert der referenceTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public void setReferenceTemperature(JAXBElement<ValTemperatureType> value) {
        this.referenceTemperature = value;
    }

    /**
     * Ruft den Wert der altimeterCheckLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getAltimeterCheckLocation() {
        return altimeterCheckLocation;
    }

    /**
     * Legt den Wert der altimeterCheckLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAltimeterCheckLocation(JAXBElement<CodeYesNoType> value) {
        this.altimeterCheckLocation = value;
    }

    /**
     * Ruft den Wert der secondaryPowerSupply-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSecondaryPowerSupply() {
        return secondaryPowerSupply;
    }

    /**
     * Legt den Wert der secondaryPowerSupply-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSecondaryPowerSupply(JAXBElement<CodeYesNoType> value) {
        this.secondaryPowerSupply = value;
    }

    /**
     * Ruft den Wert der windDirectionIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getWindDirectionIndicator() {
        return windDirectionIndicator;
    }

    /**
     * Legt den Wert der windDirectionIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setWindDirectionIndicator(JAXBElement<CodeYesNoType> value) {
        this.windDirectionIndicator = value;
    }

    /**
     * Ruft den Wert der landingDirectionIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getLandingDirectionIndicator() {
        return landingDirectionIndicator;
    }

    /**
     * Legt den Wert der landingDirectionIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLandingDirectionIndicator(JAXBElement<CodeYesNoType> value) {
        this.landingDirectionIndicator = value;
    }

    /**
     * Ruft den Wert der transitionAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getTransitionAltitude() {
        return transitionAltitude;
    }

    /**
     * Legt den Wert der transitionAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setTransitionAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.transitionAltitude = value;
    }

    /**
     * Ruft den Wert der transitionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    public JAXBElement<ValFLType> getTransitionLevel() {
        return transitionLevel;
    }

    /**
     * Legt den Wert der transitionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    public void setTransitionLevel(JAXBElement<ValFLType> value) {
        this.transitionLevel = value;
    }

    /**
     * Ruft den Wert der lowestTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public JAXBElement<ValTemperatureType> getLowestTemperature() {
        return lowestTemperature;
    }

    /**
     * Legt den Wert der lowestTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public void setLowestTemperature(JAXBElement<ValTemperatureType> value) {
        this.lowestTemperature = value;
    }

    /**
     * Ruft den Wert der abandoned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getAbandoned() {
        return abandoned;
    }

    /**
     * Legt den Wert der abandoned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAbandoned(JAXBElement<CodeYesNoType> value) {
        this.abandoned = value;
    }

    /**
     * Ruft den Wert der certificationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateType }{@code >}
     *     
     */
    public JAXBElement<DateType> getCertificationDate() {
        return certificationDate;
    }

    /**
     * Legt den Wert der certificationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateType }{@code >}
     *     
     */
    public void setCertificationDate(JAXBElement<DateType> value) {
        this.certificationDate = value;
    }

    /**
     * Ruft den Wert der certificationExpirationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateType }{@code >}
     *     
     */
    public JAXBElement<DateType> getCertificationExpirationDate() {
        return certificationExpirationDate;
    }

    /**
     * Legt den Wert der certificationExpirationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateType }{@code >}
     *     
     */
    public void setCertificationExpirationDate(JAXBElement<DateType> value) {
        this.certificationExpirationDate = value;
    }

    /**
     * Gets the value of the contaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportContaminationPropertyType }
     * 
     * 
     */
    public List<AirportHeliportContaminationPropertyType> getContaminant() {
        if (contaminant == null) {
            contaminant = new ArrayList<AirportHeliportContaminationPropertyType>();
        }
        return this.contaminant;
    }

    /**
     * Gets the value of the servedCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servedCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServedCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CityPropertyType }
     * 
     * 
     */
    public List<CityPropertyType> getServedCity() {
        if (servedCity == null) {
            servedCity = new ArrayList<CityPropertyType>();
        }
        return this.servedCity;
    }

    /**
     * Ruft den Wert der responsibleOrganisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> getResponsibleOrganisation() {
        return responsibleOrganisation;
    }

    /**
     * Legt den Wert der responsibleOrganisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationPropertyType }{@code >}
     *     
     */
    public void setResponsibleOrganisation(JAXBElement<AirportHeliportResponsibilityOrganisationPropertyType> value) {
        this.responsibleOrganisation = value;
    }

    /**
     * Ruft den Wert der arp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getARP() {
        return arp;
    }

    /**
     * Legt den Wert der arp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setARP(JAXBElement<ElevatedPointPropertyType> value) {
        this.arp = value;
    }

    /**
     * Ruft den Wert der aviationBoundary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedSurfacePropertyType> getAviationBoundary() {
        return aviationBoundary;
    }

    /**
     * Legt den Wert der aviationBoundary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setAviationBoundary(JAXBElement<ElevatedSurfacePropertyType> value) {
        this.aviationBoundary = value;
    }

    /**
     * Gets the value of the altimeterSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altimeterSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltimeterSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltimeterSourcePropertyType }
     * 
     * 
     */
    public List<AltimeterSourcePropertyType> getAltimeterSource() {
        if (altimeterSource == null) {
            altimeterSource = new ArrayList<AltimeterSourcePropertyType>();
        }
        return this.altimeterSource;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    public List<ContactInformationPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactInformationPropertyType>();
        }
        return this.contact;
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
     * {@link AirportHeliportAvailabilityPropertyType }
     * 
     * 
     */
    public List<AirportHeliportAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<AirportHeliportAvailabilityPropertyType>();
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
     * {@link AirportHeliportTimeSliceType.Extension }
     * 
     * 
     */
    public List<AirportHeliportTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AirportHeliportTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirportHeliportExtension"/&gt;
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
        "abstractAirportHeliportExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractAirportHeliportExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractAirportHeliportExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractAirportHeliportExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AirportHeliportExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAirportHeliportExtension() {
            return abstractAirportHeliportExtension;
        }

        /**
         * Legt den Wert der abstractAirportHeliportExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AirportHeliportExtensionType }{@code >}
         *     
         */
        public void setAbstractAirportHeliportExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAirportHeliportExtension = value;
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
