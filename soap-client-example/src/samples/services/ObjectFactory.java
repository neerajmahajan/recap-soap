
package samples.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the samples.services package. 
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

    private final static QName _GetSimpleQuoteSymbol_QNAME = new QName("http://services.samples", "symbol");
    private final static QName _GetFullQuoteRequest_QNAME = new QName("http://services.samples", "request");
    private final static QName _GetSimpleQuoteResponseReturn_QNAME = new QName("http://services.samples", "return");
    private final static QName _ExceptionMessage_QNAME = new QName("http://services.samples", "Message");
    private final static QName _PlaceOrderOrder_QNAME = new QName("http://services.samples", "order");
    private final static QName _SimpleStockQuoteServiceExceptionSimpleStockQuoteServiceException_QNAME = new QName("http://services.samples", "SimpleStockQuoteServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: samples.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link samples.services.GetMarketActivity }
     * 
     */
    public samples.services.GetMarketActivity createGetMarketActivity() {
        return new samples.services.GetMarketActivity();
    }

    /**
     * Create an instance of {@link samples.services.GetFullQuote }
     * 
     */
    public samples.services.GetFullQuote createGetFullQuote() {
        return new samples.services.GetFullQuote();
    }

    /**
     * Create an instance of {@link samples.services.PlaceOrder }
     * 
     */
    public samples.services.PlaceOrder createPlaceOrder() {
        return new samples.services.PlaceOrder();
    }

    /**
     * Create an instance of {@link samples.services.GetMarketActivityResponse }
     * 
     */
    public samples.services.GetMarketActivityResponse createGetMarketActivityResponse() {
        return new samples.services.GetMarketActivityResponse();
    }

    /**
     * Create an instance of {@link SimpleStockQuoteServiceException }
     * 
     */
    public SimpleStockQuoteServiceException createSimpleStockQuoteServiceException() {
        return new SimpleStockQuoteServiceException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetSimpleQuoteResponse }
     * 
     */
    public GetSimpleQuoteResponse createGetSimpleQuoteResponse() {
        return new GetSimpleQuoteResponse();
    }

    /**
     * Create an instance of {@link samples.services.GetQuote }
     * 
     */
    public samples.services.GetQuote createGetQuote() {
        return new samples.services.GetQuote();
    }

    /**
     * Create an instance of {@link GetSimpleQuote }
     * 
     */
    public GetSimpleQuote createGetSimpleQuote() {
        return new GetSimpleQuote();
    }

    /**
     * Create an instance of {@link samples.services.GetFullQuoteResponse }
     * 
     */
    public samples.services.GetFullQuoteResponse createGetFullQuoteResponse() {
        return new samples.services.GetFullQuoteResponse();
    }

    /**
     * Create an instance of {@link samples.services.GetQuoteResponse }
     * 
     */
    public samples.services.GetQuoteResponse createGetQuoteResponse() {
        return new samples.services.GetQuoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "symbol", scope = GetSimpleQuote.class)
    public JAXBElement<String> createGetSimpleQuoteSymbol(String value) {
        return new JAXBElement<String>(_GetSimpleQuoteSymbol_QNAME, String.class, GetSimpleQuote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link samples.services.xsd.GetFullQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "request", scope = samples.services.GetFullQuote.class)
    public JAXBElement<samples.services.xsd.GetFullQuote> createGetFullQuoteRequest(samples.services.xsd.GetFullQuote value) {
        return new JAXBElement<samples.services.xsd.GetFullQuote>(_GetFullQuoteRequest_QNAME, samples.services.xsd.GetFullQuote.class, samples.services.GetFullQuote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link samples.services.xsd.GetQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "return", scope = GetSimpleQuoteResponse.class)
    public JAXBElement<samples.services.xsd.GetQuoteResponse> createGetSimpleQuoteResponseReturn(samples.services.xsd.GetQuoteResponse value) {
        return new JAXBElement<samples.services.xsd.GetQuoteResponse>(_GetSimpleQuoteResponseReturn_QNAME, samples.services.xsd.GetQuoteResponse.class, GetSimpleQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link samples.services.xsd.GetQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "request", scope = samples.services.GetQuote.class)
    public JAXBElement<samples.services.xsd.GetQuote> createGetQuoteRequest(samples.services.xsd.GetQuote value) {
        return new JAXBElement<samples.services.xsd.GetQuote>(_GetFullQuoteRequest_QNAME, samples.services.xsd.GetQuote.class, samples.services.GetQuote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "Message", scope = Exception.class)
    public JAXBElement<String> createExceptionMessage(String value) {
        return new JAXBElement<String>(_ExceptionMessage_QNAME, String.class, Exception.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link samples.services.xsd.PlaceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "order", scope = samples.services.PlaceOrder.class)
    public JAXBElement<samples.services.xsd.PlaceOrder> createPlaceOrderOrder(samples.services.xsd.PlaceOrder value) {
        return new JAXBElement<samples.services.xsd.PlaceOrder>(_PlaceOrderOrder_QNAME, samples.services.xsd.PlaceOrder.class, samples.services.PlaceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link samples.services.xsd.GetMarketActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "return", scope = samples.services.GetMarketActivityResponse.class)
    public JAXBElement<samples.services.xsd.GetMarketActivityResponse> createGetMarketActivityResponseReturn(samples.services.xsd.GetMarketActivityResponse value) {
        return new JAXBElement<samples.services.xsd.GetMarketActivityResponse>(_GetSimpleQuoteResponseReturn_QNAME, samples.services.xsd.GetMarketActivityResponse.class, samples.services.GetMarketActivityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "SimpleStockQuoteServiceException", scope = SimpleStockQuoteServiceException.class)
    public JAXBElement<Exception> createSimpleStockQuoteServiceExceptionSimpleStockQuoteServiceException(Exception value) {
        return new JAXBElement<Exception>(_SimpleStockQuoteServiceExceptionSimpleStockQuoteServiceException_QNAME, Exception.class, SimpleStockQuoteServiceException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link samples.services.xsd.GetMarketActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "request", scope = samples.services.GetMarketActivity.class)
    public JAXBElement<samples.services.xsd.GetMarketActivity> createGetMarketActivityRequest(samples.services.xsd.GetMarketActivity value) {
        return new JAXBElement<samples.services.xsd.GetMarketActivity>(_GetFullQuoteRequest_QNAME, samples.services.xsd.GetMarketActivity.class, samples.services.GetMarketActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link samples.services.xsd.GetFullQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "return", scope = samples.services.GetFullQuoteResponse.class)
    public JAXBElement<samples.services.xsd.GetFullQuoteResponse> createGetFullQuoteResponseReturn(samples.services.xsd.GetFullQuoteResponse value) {
        return new JAXBElement<samples.services.xsd.GetFullQuoteResponse>(_GetSimpleQuoteResponseReturn_QNAME, samples.services.xsd.GetFullQuoteResponse.class, samples.services.GetFullQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link samples.services.xsd.GetQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.samples", name = "return", scope = samples.services.GetQuoteResponse.class)
    public JAXBElement<samples.services.xsd.GetQuoteResponse> createGetQuoteResponseReturn(samples.services.xsd.GetQuoteResponse value) {
        return new JAXBElement<samples.services.xsd.GetQuoteResponse>(_GetSimpleQuoteResponseReturn_QNAME, samples.services.xsd.GetQuoteResponse.class, samples.services.GetQuoteResponse.class, value);
    }

}
