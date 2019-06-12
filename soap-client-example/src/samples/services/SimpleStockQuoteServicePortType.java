
package samples.services;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import samples.services.xsd.GetFullQuote;
import samples.services.xsd.GetFullQuoteResponse;
import samples.services.xsd.GetMarketActivity;
import samples.services.xsd.GetMarketActivityResponse;
import samples.services.xsd.GetQuote;
import samples.services.xsd.GetQuoteResponse;
import samples.services.xsd.PlaceOrder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SimpleStockQuoteServicePortType", targetNamespace = "http://services.samples")
@XmlSeeAlso({
    samples.services.ObjectFactory.class,
    samples.services.xsd.ObjectFactory.class
})
public interface SimpleStockQuoteServicePortType {


    /**
     * 
     * @param request
     * @return
     *     returns samples.services.xsd.GetMarketActivityResponse
     */
    @WebMethod(action = "urn:getMarketActivity")
    @WebResult(targetNamespace = "http://services.samples")
    @RequestWrapper(localName = "getMarketActivity", targetNamespace = "http://services.samples", className = "samples.services.GetMarketActivity")
    @ResponseWrapper(localName = "getMarketActivityResponse", targetNamespace = "http://services.samples", className = "samples.services.GetMarketActivityResponse")
    public GetMarketActivityResponse getMarketActivity(
        @WebParam(name = "request", targetNamespace = "http://services.samples")
        GetMarketActivity request);

    /**
     * 
     * @param request
     * @return
     *     returns samples.services.xsd.GetFullQuoteResponse
     */
    @WebMethod(action = "urn:getFullQuote")
    @WebResult(targetNamespace = "http://services.samples")
    @RequestWrapper(localName = "getFullQuote", targetNamespace = "http://services.samples", className = "samples.services.GetFullQuote")
    @ResponseWrapper(localName = "getFullQuoteResponse", targetNamespace = "http://services.samples", className = "samples.services.GetFullQuoteResponse")
    public GetFullQuoteResponse getFullQuote(
        @WebParam(name = "request", targetNamespace = "http://services.samples")
        GetFullQuote request);

    /**
     * 
     * @param order
     */
    @WebMethod(action = "urn:placeOrder")
    @Oneway
    @RequestWrapper(localName = "placeOrder", targetNamespace = "http://services.samples", className = "samples.services.PlaceOrder")
    public void placeOrder(
        @WebParam(name = "order", targetNamespace = "http://services.samples")
        PlaceOrder order);

    /**
     * 
     * @param request
     * @return
     *     returns samples.services.xsd.GetQuoteResponse
     * @throws SimpleStockQuoteServiceException_Exception
     */
    @WebMethod(action = "urn:getQuote")
    @WebResult(targetNamespace = "http://services.samples")
    @RequestWrapper(localName = "getQuote", targetNamespace = "http://services.samples", className = "samples.services.GetQuote")
    @ResponseWrapper(localName = "getQuoteResponse", targetNamespace = "http://services.samples", className = "samples.services.GetQuoteResponse")
    public GetQuoteResponse getQuote(
        @WebParam(name = "request", targetNamespace = "http://services.samples")
        GetQuote request)
        throws SimpleStockQuoteServiceException_Exception
    ;

    /**
     * 
     * @param symbol
     * @return
     *     returns samples.services.xsd.GetQuoteResponse
     */
    @WebMethod(action = "urn:getSimpleQuote")
    @WebResult(targetNamespace = "http://services.samples")
    @RequestWrapper(localName = "getSimpleQuote", targetNamespace = "http://services.samples", className = "samples.services.GetSimpleQuote")
    @ResponseWrapper(localName = "getSimpleQuoteResponse", targetNamespace = "http://services.samples", className = "samples.services.GetSimpleQuoteResponse")
    public GetQuoteResponse getSimpleQuote(
        @WebParam(name = "symbol", targetNamespace = "http://services.samples")
        String symbol);

}