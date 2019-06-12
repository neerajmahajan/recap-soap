
package samples.services.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFullQuoteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFullQuoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeHistory" type="{http://services.samples/xsd}TradingDay" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFullQuoteResponse", propOrder = {
    "tradeHistory"
})
public class GetFullQuoteResponse {

    @XmlElement(nillable = true)
    protected List<TradingDay> tradeHistory;

    /**
     * Gets the value of the tradeHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingDay }
     * 
     * 
     */
    public List<TradingDay> getTradeHistory() {
        if (tradeHistory == null) {
            tradeHistory = new ArrayList<TradingDay>();
        }
        return this.tradeHistory;
    }

}
