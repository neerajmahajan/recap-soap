# recap-soap

### SOAP Specification
* JAX-WS
* WSDL is used for API specification
* Data is exchanged between client and webserver in XML format using SOAP protocol.
* SOAP protocol is used. Simple Object Access Protocol.
* From client side when we call a SOAP webservice, we do a java object to SOAP XML conversion through intermediate application **SEI** Service Endpoint Interface.
* Depending on the client application technology you get SEI. **We can generate this from WSDL**
* A SOAP message is transmitted over the network.

#### WSDL 
* Web service defination language defines the contract of web service.
* UDDI - Universal Description discovery and Integration.. registry for webservices.
* <wsdl:service> contain detail of service operation exposed.
