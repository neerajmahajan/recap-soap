
package samples.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="SimpleStockQuoteServiceException" type="{http://services.samples}Exception" minOccurs="0"/>
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
    "simpleStockQuoteServiceException"
})
@XmlRootElement(name = "SimpleStockQuoteServiceException")
public class SimpleStockQuoteServiceException {

    @XmlElementRef(name = "SimpleStockQuoteServiceException", namespace = "http://services.samples", type = JAXBElement.class, required = false)
    protected JAXBElement<Exception> simpleStockQuoteServiceException;

    /**
     * Gets the value of the simpleStockQuoteServiceException property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Exception }{@code >}
     *     
     */
    public JAXBElement<Exception> getSimpleStockQuoteServiceException() {
        return simpleStockQuoteServiceException;
    }

    /**
     * Sets the value of the simpleStockQuoteServiceException property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Exception }{@code >}
     *     
     */
    public void setSimpleStockQuoteServiceException(JAXBElement<Exception> value) {
        this.simpleStockQuoteServiceException = value;
    }

}
