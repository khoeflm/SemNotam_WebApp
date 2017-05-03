
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.BooleanPropertyType;
import org.isotc211.gco.IntegerPropertyType;
import org.isotc211.gco.RealPropertyType;


/**
 * Information about an image's suitability for use
 * 
 * <p>Java-Klasse für MD_ImageDescription_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_ImageDescription_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_CoverageDescription_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="illuminationElevationAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="illuminationAzimuthAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="imagingCondition" type="{http://www.isotc211.org/2005/gmd}MD_ImagingConditionCode_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="imageQualityCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="cloudCoverPercentage" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="processingLevelCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="compressionGenerationQuantity" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="triangulationIndicator" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="radiometricCalibrationDataAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="cameraCalibrationInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="filmDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lensDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ImageDescription_Type", propOrder = {
    "illuminationElevationAngle",
    "illuminationAzimuthAngle",
    "imagingCondition",
    "imageQualityCode",
    "cloudCoverPercentage",
    "processingLevelCode",
    "compressionGenerationQuantity",
    "triangulationIndicator",
    "radiometricCalibrationDataAvailability",
    "cameraCalibrationInformationAvailability",
    "filmDistortionInformationAvailability",
    "lensDistortionInformationAvailability"
})
public class MDImageDescriptionType
    extends MDCoverageDescriptionType
{

    protected RealPropertyType illuminationElevationAngle;
    protected RealPropertyType illuminationAzimuthAngle;
    protected MDImagingConditionCodePropertyType imagingCondition;
    protected MDIdentifierPropertyType imageQualityCode;
    protected RealPropertyType cloudCoverPercentage;
    protected MDIdentifierPropertyType processingLevelCode;
    protected IntegerPropertyType compressionGenerationQuantity;
    protected BooleanPropertyType triangulationIndicator;
    protected BooleanPropertyType radiometricCalibrationDataAvailability;
    protected BooleanPropertyType cameraCalibrationInformationAvailability;
    protected BooleanPropertyType filmDistortionInformationAvailability;
    protected BooleanPropertyType lensDistortionInformationAvailability;

    /**
     * Ruft den Wert der illuminationElevationAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationElevationAngle() {
        return illuminationElevationAngle;
    }

    /**
     * Legt den Wert der illuminationElevationAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationElevationAngle(RealPropertyType value) {
        this.illuminationElevationAngle = value;
    }

    /**
     * Ruft den Wert der illuminationAzimuthAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationAzimuthAngle() {
        return illuminationAzimuthAngle;
    }

    /**
     * Legt den Wert der illuminationAzimuthAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationAzimuthAngle(RealPropertyType value) {
        this.illuminationAzimuthAngle = value;
    }

    /**
     * Ruft den Wert der imagingCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public MDImagingConditionCodePropertyType getImagingCondition() {
        return imagingCondition;
    }

    /**
     * Legt den Wert der imagingCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public void setImagingCondition(MDImagingConditionCodePropertyType value) {
        this.imagingCondition = value;
    }

    /**
     * Ruft den Wert der imageQualityCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getImageQualityCode() {
        return imageQualityCode;
    }

    /**
     * Legt den Wert der imageQualityCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setImageQualityCode(MDIdentifierPropertyType value) {
        this.imageQualityCode = value;
    }

    /**
     * Ruft den Wert der cloudCoverPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getCloudCoverPercentage() {
        return cloudCoverPercentage;
    }

    /**
     * Legt den Wert der cloudCoverPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setCloudCoverPercentage(RealPropertyType value) {
        this.cloudCoverPercentage = value;
    }

    /**
     * Ruft den Wert der processingLevelCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getProcessingLevelCode() {
        return processingLevelCode;
    }

    /**
     * Legt den Wert der processingLevelCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setProcessingLevelCode(MDIdentifierPropertyType value) {
        this.processingLevelCode = value;
    }

    /**
     * Ruft den Wert der compressionGenerationQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getCompressionGenerationQuantity() {
        return compressionGenerationQuantity;
    }

    /**
     * Legt den Wert der compressionGenerationQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setCompressionGenerationQuantity(IntegerPropertyType value) {
        this.compressionGenerationQuantity = value;
    }

    /**
     * Ruft den Wert der triangulationIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getTriangulationIndicator() {
        return triangulationIndicator;
    }

    /**
     * Legt den Wert der triangulationIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTriangulationIndicator(BooleanPropertyType value) {
        this.triangulationIndicator = value;
    }

    /**
     * Ruft den Wert der radiometricCalibrationDataAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getRadiometricCalibrationDataAvailability() {
        return radiometricCalibrationDataAvailability;
    }

    /**
     * Legt den Wert der radiometricCalibrationDataAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setRadiometricCalibrationDataAvailability(BooleanPropertyType value) {
        this.radiometricCalibrationDataAvailability = value;
    }

    /**
     * Ruft den Wert der cameraCalibrationInformationAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCameraCalibrationInformationAvailability() {
        return cameraCalibrationInformationAvailability;
    }

    /**
     * Legt den Wert der cameraCalibrationInformationAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCameraCalibrationInformationAvailability(BooleanPropertyType value) {
        this.cameraCalibrationInformationAvailability = value;
    }

    /**
     * Ruft den Wert der filmDistortionInformationAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getFilmDistortionInformationAvailability() {
        return filmDistortionInformationAvailability;
    }

    /**
     * Legt den Wert der filmDistortionInformationAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setFilmDistortionInformationAvailability(BooleanPropertyType value) {
        this.filmDistortionInformationAvailability = value;
    }

    /**
     * Ruft den Wert der lensDistortionInformationAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getLensDistortionInformationAvailability() {
        return lensDistortionInformationAvailability;
    }

    /**
     * Legt den Wert der lensDistortionInformationAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setLensDistortionInformationAvailability(BooleanPropertyType value) {
        this.lensDistortionInformationAvailability = value;
    }

}
