
package samples.services.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMarketActivityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMarketActivityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quotes" type="{http://services.samples/xsd}GetQuoteResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMarketActivityResponse", propOrder = {
    "quotes"
})
public class GetMarketActivityResponse {

    @XmlElement(nillable = true)
    protected List<GetQuoteResponse> quotes;

    /**
     * Gets the value of the quotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetQuoteResponse }
     * 
     * 
     */
    public List<GetQuoteResponse> getQuotes() {
        if (quotes == null) {
            quotes = new ArrayList<GetQuoteResponse>();
        }
        return this.quotes;
    }

}
