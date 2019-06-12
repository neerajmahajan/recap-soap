
package samples.services.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetQuoteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetQuoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="earnings" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lastTradeTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="marketCap" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="peRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="percentageChange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="prevClose" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetQuoteResponse", propOrder = {
    "change",
    "earnings",
    "high",
    "last",
    "lastTradeTimestamp",
    "low",
    "marketCap",
    "name",
    "open",
    "peRatio",
    "percentageChange",
    "prevClose",
    "symbol",
    "volume"
})
public class GetQuoteResponse {

    protected Double change;
    protected Double earnings;
    protected Double high;
    protected Double last;
    @XmlElementRef(name = "lastTradeTimestamp", namespace = "http://services.samples/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastTradeTimestamp;
    protected Double low;
    protected Double marketCap;
    @XmlElementRef(name = "name", namespace = "http://services.samples/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    protected Double open;
    protected Double peRatio;
    protected Double percentageChange;
    protected Double prevClose;
    @XmlElementRef(name = "symbol", namespace = "http://services.samples/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symbol;
    protected Integer volume;

    /**
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChange(Double value) {
        this.change = value;
    }

    /**
     * Gets the value of the earnings property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEarnings() {
        return earnings;
    }

    /**
     * Sets the value of the earnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEarnings(Double value) {
        this.earnings = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHigh(Double value) {
        this.high = value;
    }

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLast(Double value) {
        this.last = value;
    }

    /**
     * Gets the value of the lastTradeTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastTradeTimestamp() {
        return lastTradeTimestamp;
    }

    /**
     * Sets the value of the lastTradeTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastTradeTimestamp(JAXBElement<String> value) {
        this.lastTradeTimestamp = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLow(Double value) {
        this.low = value;
    }

    /**
     * Gets the value of the marketCap property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarketCap() {
        return marketCap;
    }

    /**
     * Sets the value of the marketCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarketCap(Double value) {
        this.marketCap = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpen(Double value) {
        this.open = value;
    }

    /**
     * Gets the value of the peRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeRatio() {
        return peRatio;
    }

    /**
     * Sets the value of the peRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeRatio(Double value) {
        this.peRatio = value;
    }

    /**
     * Gets the value of the percentageChange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentageChange() {
        return percentageChange;
    }

    /**
     * Sets the value of the percentageChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentageChange(Double value) {
        this.percentageChange = value;
    }

    /**
     * Gets the value of the prevClose property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrevClose() {
        return prevClose;
    }

    /**
     * Sets the value of the prevClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrevClose(Double value) {
        this.prevClose = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymbol(JAXBElement<String> value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVolume(Integer value) {
        this.volume = value;
    }

}
