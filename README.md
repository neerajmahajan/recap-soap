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


#### Creating SEI
* create a sei folder
* run command ``` wsimport <WSDL_URI>

#### Creating a WebService

* @WebService
* @WebMethod, We can also use exclude=true attribute to exclude method from web service method.
* A class annotated with @WebService will be instantiated only once in the web container.

##### Approaches
* Contract First (WSDL first)
* Code First (Service First)

##### WSDL unerstanding
* An Interface declration in the form of an XML.
* It has a set of operations(Method), with input method arguments information and return type
* portType is the serviceName that exposes set of operations.
* binding defines how the service accept requests(eg over http) and send response.
```
<definitions>
    <types></types>
    <message></message>
    <message></message>
    ...
    <portType>
      <operation>
          <input wsam:Action="" message=""/>
          <output wsam:Action="" message=""/>
      </operation
    </portType> 
    <binding name="" type="">
      <soap:binding transport="" style="" />
      <operation name="">
        <input>
          <soap:body use="literal" />
        </input>
        <output>
          <soap:body use="literal" />
        </output>
    </binding>
    <service name="">
      <port name="" binding="">
          <soap:address location="" />
      </port>
    </service>
</definitions>   
```

