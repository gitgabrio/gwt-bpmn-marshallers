//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 05:11:55 PM BRT 
//


package org.submarine.client.bpmn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for Font complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Font"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="isBold" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="isItalic" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="isUnderline" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="isStrikeThrough" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Font", namespace = "http://www.omg.org/spec/DD/20100524/DC")
public class Font implements Named, Visitable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "size")
    protected Double size;
    @XmlAttribute(name = "isBold")
    protected Boolean isBold;
    @XmlAttribute(name = "isItalic")
    protected Boolean isItalic;
    @XmlAttribute(name = "isUnderline")
    protected Boolean isUnderline;
    @XmlAttribute(name = "isStrikeThrough")
    protected Boolean isStrikeThrough;
    @XmlTransient
    private QName jaxbElementName;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize(Double value) {
        this.size = value;
    }

    /**
     * Gets the value of the isBold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBold() {
        return isBold;
    }

    /**
     * Sets the value of the isBold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBold(Boolean value) {
        this.isBold = value;
    }

    /**
     * Gets the value of the isItalic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsItalic() {
        return isItalic;
    }

    /**
     * Sets the value of the isItalic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsItalic(Boolean value) {
        this.isItalic = value;
    }

    /**
     * Gets the value of the isUnderline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnderline() {
        return isUnderline;
    }

    /**
     * Sets the value of the isUnderline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnderline(Boolean value) {
        this.isUnderline = value;
    }

    /**
     * Gets the value of the isStrikeThrough property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStrikeThrough() {
        return isStrikeThrough;
    }

    /**
     * Sets the value of the isStrikeThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStrikeThrough(Boolean value) {
        this.isStrikeThrough = value;
    }

    public void setJAXBElementName(QName name) {
        this.jaxbElementName = name;
    }

    public QName getJAXBElementName() {
        return this.jaxbElementName;
    }

    public void afterUnmarshal(Unmarshaller u, Object parent) {
        if (parent instanceof JAXBElement<?> ) {
            this.jaxbElementName = ((JAXBElement<?> ) parent).getName();
        }
    }

    public<R, E extends Throwable >R accept(Visitor<R, E> aVisitor)
        throws E
    {
        return aVisitor.visit(this);
    }

}
