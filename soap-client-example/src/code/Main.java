package code;

import javax.xml.bind.JAXBElement;

import samples.services.SimpleStockQuoteService;
import samples.services.SimpleStockQuoteServicePortType;
import samples.services.xsd.GetQuoteResponse;
import samples.services.xsd.ObjectFactory;

public class Main {
	
	public static void main(String[] args)  throws Exception{
		
		SimpleStockQuoteService service = new SimpleStockQuoteService();
		
		SimpleStockQuoteServicePortType simpleStockQuoteServiceHttpsSoap11Endpoint = service.getSimpleStockQuoteServiceHttpSoap11Endpoint();
		samples.services.xsd.GetQuote getQuote = new samples.services.xsd.GetQuote();
		
		ObjectFactory factory = new ObjectFactory();
		JAXBElement<String> createGetQuoteSymbol = factory.createGetQuoteSymbol("WSSSSS");
		
		getQuote.setSymbol(createGetQuoteSymbol);
		GetQuoteResponse quote = simpleStockQuoteServiceHttpsSoap11Endpoint.getQuote(getQuote);
		
		System.out.println(quote.getChange());
		
	}

}
