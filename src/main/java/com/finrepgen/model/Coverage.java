//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.09 at 06:20:02 PM IST 
//


package com.finrepgen.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCovered" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompanyIDList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "industryCovered",
    "companyIDList"
})
public class Coverage
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IndustryCovered", required = true)
    protected String industryCovered;
    @XmlElement(name = "CompanyIDList", required = true)
    protected CompanyIDList companyIDList;

    /**
     * Gets the value of the industryCovered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCovered() {
        return industryCovered;
    }

    /**
     * Sets the value of the industryCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCovered(String value) {
        this.industryCovered = value;
    }

    /**
     * Gets the value of the companyIDList property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIDList }
     *     
     */
    public CompanyIDList getCompanyIDList() {
        return companyIDList;
    }

    /**
     * Sets the value of the companyIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIDList }
     *     
     */
    public void setCompanyIDList(CompanyIDList value) {
        this.companyIDList = value;
    }

}
