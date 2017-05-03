
package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractGriddedSurfaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractGriddedSurfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractParametricCurveSurfaceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.opengis.net/gml/3.2}PointGrid"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rows" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="columns" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGriddedSurfaceType", propOrder = {
    "pointGridRows"
})
@XmlSeeAlso({
    ConeType.class,
    CylinderType.class,
    SphereType.class
})
public abstract class AbstractGriddedSurfaceType
    extends AbstractParametricCurveSurfaceType
{

    @XmlElement(name = "rows", required = true)
    protected AbstractGriddedSurfaceType.Rows pointGridRows;
    @XmlAttribute(name = "rows")
    protected BigInteger rows;
    @XmlAttribute(name = "columns")
    protected BigInteger columns;

    /**
     * Ruft den Wert der pointGridRows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractGriddedSurfaceType.Rows }
     *     
     */
    public AbstractGriddedSurfaceType.Rows getPointGridRows() {
        return pointGridRows;
    }

    /**
     * Legt den Wert der pointGridRows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractGriddedSurfaceType.Rows }
     *     
     */
    public void setPointGridRows(AbstractGriddedSurfaceType.Rows value) {
        this.pointGridRows = value;
    }

    /**
     * Ruft den Wert der rows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRows() {
        return rows;
    }

    /**
     * Legt den Wert der rows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRows(BigInteger value) {
        this.rows = value;
    }

    /**
     * Ruft den Wert der columns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumns() {
        return columns;
    }

    /**
     * Legt den Wert der columns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumns(BigInteger value) {
        this.columns = value;
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
     *         &lt;element name="Row" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;group ref="{http://www.opengis.net/gml/3.2}geometricPositionListGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "row"
    })
    public static class Rows {

        @XmlElement(name = "Row", required = true)
        protected List<AbstractGriddedSurfaceType.Rows.Row> row;

        /**
         * Gets the value of the row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbstractGriddedSurfaceType.Rows.Row }
         * 
         * 
         */
        public List<AbstractGriddedSurfaceType.Rows.Row> getRow() {
            if (row == null) {
                row = new ArrayList<AbstractGriddedSurfaceType.Rows.Row>();
            }
            return this.row;
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
         *       &lt;group ref="{http://www.opengis.net/gml/3.2}geometricPositionListGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "posList",
            "geometricPositionGroup"
        })
        public static class Row {

            protected DirectPositionListType posList;
            @XmlElements({
                @XmlElement(name = "pos", type = DirectPositionType.class),
                @XmlElement(name = "pointProperty", type = PointPropertyType.class)
            })
            protected List<Object> geometricPositionGroup;

            /**
             * Ruft den Wert der posList-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DirectPositionListType }
             *     
             */
            public DirectPositionListType getPosList() {
                return posList;
            }

            /**
             * Legt den Wert der posList-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DirectPositionListType }
             *     
             */
            public void setPosList(DirectPositionListType value) {
                this.posList = value;
            }

            /**
             * Gets the value of the geometricPositionGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the geometricPositionGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGeometricPositionGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DirectPositionType }
             * {@link PointPropertyType }
             * 
             * 
             */
            public List<Object> getGeometricPositionGroup() {
                if (geometricPositionGroup == null) {
                    geometricPositionGroup = new ArrayList<Object>();
                }
                return this.geometricPositionGroup;
            }

        }

    }

}
