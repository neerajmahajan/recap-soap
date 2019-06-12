
package samples.services.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the samples.services.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetQuoteSymbol_QNAME = new QName("http://services.samples/xsd", "symbol");
    private final static QName _TradingDayQuote_QNAME = new QName("http://services.samples/xsd", "quote");
    private final static QName _GetQuoteResponseLastTradeTimestamp_QNAME = new QName("http://services.samples/xsd", "lastTradeTimestamp");
    private final static QName _GetQuoteResponseName_QNAME = new QName("http://services.samples/xsd", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: samples.services.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMarketActivity }
     * 
     */
    public GetMarketActivity createGetMarketActivity() {
        return new GetMarketActivity();
    }

    /**
     * Create an instance of {@link GetFullQuote }
     * 
     */
    public GetFullQuote createGetFullQuote() {
        return new GetFullQuote();
    }

    /**
     * Create an instance of {@link PlaceOrder }
     * 
     */
    public PlaceOrder createPlaceOrder() {
        return new PlaceOrder();
    }

    /**
     * Create an instance of {@link GetMarketActivityResponse }
     * 
     */
    public GetMarketActivityResponse createGetMarketActivityResponse() {
        return new GetMarketActivityResponse();
    }

    /**
     * Create an instance of {@link GetQuoteResponse }
     * 
     */
    public GetQuoteResponse createGetQuoteResponse() {
        return new GetQuoteResponse();
    }

    /**
     * Create an instance of {@link GetQuote }
     * 
     */
    public GetQuote createGetQuote() {
        return new GetQuote();
    }

    /**
     * Create an instance of {@link GetFullQuoteResponse }
     * 
     */
    public GetFullQuoteResponse createGetFullQuoteResponse() {
        return new GetFullQuoteResponse();
    }

    /**
     * Create an instance of {@link TradingDay }
     * 
     */
    public TradingDay createTradingDay() {
        return new TradingDay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples/xsd", name = "symbol", scope = GetQuote.class)
    public JAXBElement<String> createGetQuoteSymbol(String value) {
        return new JAXBElement<String>(_GetQuoteSymbol_QNAME, String.class, GetQuote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples/xsd", name = "symbol", scope = PlaceOrder.class)
    public JAXBElement<String> createPlaceOrderSymbol(String value) {
        return new JAXBElement<String>(_GetQuoteSymbol_QNAME, String.class, PlaceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples/xsd", name = "quote", scope = TradingDay.class)
    public JAXBElement<GetQuoteResponse> createTradingDayQuote(GetQuoteResponse value) {
        return new JAXBElement<GetQuoteResponse>(_TradingDayQuote_QNAME, GetQuoteResponse.class, TradingDay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples/xsd", name = "lastTradeTimestamp", scope = GetQuoteResponse.class)
    public JAXBElement<String> createGetQuoteResponseLastTradeTimestamp(String value) {
        return new JAXBElement<String>(_GetQuoteResponseLastTradeTimestamp_QNAME, String.class, GetQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples/xsd", name = "name", scope = GetQuoteResponse.class)
    public JAXBElement<String> createGetQuoteResponseName(String value) {
        return new JAXBElement<String>(_GetQuoteResponseName_QNAME, String.class, GetQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples/xsd", name = "symbol", scope = GetQuoteResponse.class)
    public JAXBElement<String> createGetQuoteResponseSymbol(String value) {
        return new JAXBElement<String>(_GetQuoteSymbol_QNAME, String.class, GetQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples/xsd", name = "symbol", scope = GetFullQuote.class)
    public JAXBElement<String> createGetFullQuoteSymbol(String value) {
        return new JAXBElement<String>(_GetQuoteSymbol_QNAME, String.class, GetFullQuote.class, value);
    }

}
