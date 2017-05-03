
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


/**
 * <p>Java-Klasse für TimesheetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimesheetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}TimesheetPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTimesheetExtension"/&gt;
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
@XmlType(name = "TimesheetType", propOrder = {
    "timeReference",
    "startDate",
    "endDate",
    "day",
    "dayTil",
    "startTime",
    "startEvent",
    "startTimeRelativeEvent",
    "startEventInterpretation",
    "endTime",
    "endEvent",
    "endTimeRelativeEvent",
    "endEventInterpretation",
    "daylightSavingAdjust",
    "excluded",
    "annotation",
    "extension"
})
public class TimesheetType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "timeReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeReferenceType> timeReference;
    @XmlElementRef(name = "startDate", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateMonthDayType> startDate;
    @XmlElementRef(name = "endDate", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateMonthDayType> endDate;
    @XmlElementRef(name = "day", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDayType> day;
    @XmlElementRef(name = "dayTil", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDayType> dayTil;
    @XmlElementRef(name = "startTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> startTime;
    @XmlElementRef(name = "startEvent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventType> startEvent;
    @XmlElementRef(name = "startTimeRelativeEvent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> startTimeRelativeEvent;
    @XmlElementRef(name = "startEventInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventCombinationType> startEventInterpretation;
    @XmlElementRef(name = "endTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> endTime;
    @XmlElementRef(name = "endEvent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventType> endEvent;
    @XmlElementRef(name = "endTimeRelativeEvent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> endTimeRelativeEvent;
    @XmlElementRef(name = "endEventInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventCombinationType> endEventInterpretation;
    @XmlElementRef(name = "daylightSavingAdjust", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> daylightSavingAdjust;
    @XmlElementRef(name = "excluded", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> excluded;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<TimesheetType.Extension> extension;

    /**
     * Ruft den Wert der timeReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeReferenceType> getTimeReference() {
        return timeReference;
    }

    /**
     * Legt den Wert der timeReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeReferenceType }{@code >}
     *     
     */
    public void setTimeReference(JAXBElement<CodeTimeReferenceType> value) {
        this.timeReference = value;
    }

    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public JAXBElement<DateMonthDayType> getStartDate() {
        return startDate;
    }

    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<DateMonthDayType> value) {
        this.startDate = value;
    }

    /**
     * Ruft den Wert der endDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public JAXBElement<DateMonthDayType> getEndDate() {
        return endDate;
    }

    /**
     * Legt den Wert der endDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<DateMonthDayType> value) {
        this.endDate = value;
    }

    /**
     * Ruft den Wert der day-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public JAXBElement<CodeDayType> getDay() {
        return day;
    }

    /**
     * Legt den Wert der day-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public void setDay(JAXBElement<CodeDayType> value) {
        this.day = value;
    }

    /**
     * Ruft den Wert der dayTil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public JAXBElement<CodeDayType> getDayTil() {
        return dayTil;
    }

    /**
     * Legt den Wert der dayTil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public void setDayTil(JAXBElement<CodeDayType> value) {
        this.dayTil = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public JAXBElement<TimeType> getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<TimeType> value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der startEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeEventType> getStartEvent() {
        return startEvent;
    }

    /**
     * Legt den Wert der startEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public void setStartEvent(JAXBElement<CodeTimeEventType> value) {
        this.startEvent = value;
    }

    /**
     * Ruft den Wert der startTimeRelativeEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public JAXBElement<ValDurationType> getStartTimeRelativeEvent() {
        return startTimeRelativeEvent;
    }

    /**
     * Legt den Wert der startTimeRelativeEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setStartTimeRelativeEvent(JAXBElement<ValDurationType> value) {
        this.startTimeRelativeEvent = value;
    }

    /**
     * Ruft den Wert der startEventInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeEventCombinationType> getStartEventInterpretation() {
        return startEventInterpretation;
    }

    /**
     * Legt den Wert der startEventInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public void setStartEventInterpretation(JAXBElement<CodeTimeEventCombinationType> value) {
        this.startEventInterpretation = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public JAXBElement<TimeType> getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<TimeType> value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der endEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeEventType> getEndEvent() {
        return endEvent;
    }

    /**
     * Legt den Wert der endEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public void setEndEvent(JAXBElement<CodeTimeEventType> value) {
        this.endEvent = value;
    }

    /**
     * Ruft den Wert der endTimeRelativeEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public JAXBElement<ValDurationType> getEndTimeRelativeEvent() {
        return endTimeRelativeEvent;
    }

    /**
     * Legt den Wert der endTimeRelativeEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setEndTimeRelativeEvent(JAXBElement<ValDurationType> value) {
        this.endTimeRelativeEvent = value;
    }

    /**
     * Ruft den Wert der endEventInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeEventCombinationType> getEndEventInterpretation() {
        return endEventInterpretation;
    }

    /**
     * Legt den Wert der endEventInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public void setEndEventInterpretation(JAXBElement<CodeTimeEventCombinationType> value) {
        this.endEventInterpretation = value;
    }

    /**
     * Ruft den Wert der daylightSavingAdjust-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDaylightSavingAdjust() {
        return daylightSavingAdjust;
    }

    /**
     * Legt den Wert der daylightSavingAdjust-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDaylightSavingAdjust(JAXBElement<CodeYesNoType> value) {
        this.daylightSavingAdjust = value;
    }

    /**
     * Ruft den Wert der excluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getExcluded() {
        return excluded;
    }

    /**
     * Legt den Wert der excluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setExcluded(JAXBElement<CodeYesNoType> value) {
        this.excluded = value;
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
     * {@link TimesheetType.Extension }
     * 
     * 
     */
    public List<TimesheetType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<TimesheetType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTimesheetExtension"/&gt;
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
        "abstractTimesheetExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractTimesheetExtension", required = true)
        protected AbstractExtensionType abstractTimesheetExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractTimesheetExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractTimesheetExtension() {
            return abstractTimesheetExtension;
        }

        /**
         * Legt den Wert der abstractTimesheetExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractTimesheetExtension(AbstractExtensionType value) {
            this.abstractTimesheetExtension = value;
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
