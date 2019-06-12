
package samples.services.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="quote" type="{http://services.samples/xsd}GetQuoteResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingDay", propOrder = {
    "day",
    "quote"
})
public class TradingDay {

    protected Integer day;
    @XmlElementRef(name = "quote", namespace = "http://services.samples/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<GetQuoteResponse> quote;

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDay(Integer value) {
        this.day = value;
    }

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetQuoteResponse }{@code >}
     *     
     */
    public JAXBElement<GetQuoteResponse> getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetQuoteResponse }{@code >}
     *     
     */
    public void setQuote(JAXBElement<GetQuoteResponse> value) {
        this.quote = value;
    }

}
