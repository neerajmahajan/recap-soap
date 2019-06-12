
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
 *         &lt;element name="order" type="{http://services.samples/xsd}PlaceOrder" minOccurs="0"/>
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
    "order"
})
@XmlRootElement(name = "placeOrder")
public class PlaceOrder {

    @XmlElementRef(name = "order", namespace = "http://services.samples", type = JAXBElement.class, required = false)
    protected JAXBElement<samples.services.xsd.PlaceOrder> order;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link samples.services.xsd.PlaceOrder }{@code >}
     *     
     */
    public JAXBElement<samples.services.xsd.PlaceOrder> getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link samples.services.xsd.PlaceOrder }{@code >}
     *     
     */
    public void setOrder(JAXBElement<samples.services.xsd.PlaceOrder> value) {
        this.order = value;
    }

}
