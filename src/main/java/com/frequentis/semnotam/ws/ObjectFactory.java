
package com.frequentis.semnotam.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.frequentis.semnotam.ws package. 
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

    private final static QName _GetConceptForInterest_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getConceptForInterest");
    private final static QName _GetConceptForInterestResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getConceptForInterestResponse");
    private final static QName _GetInterestFromConcept_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getInterestFromConcept");
    private final static QName _GetInterestFromConceptResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getInterestFromConceptResponse");
    private final static QName _SelectConceptForFacet_QNAME = new QName("http://ws.semnotam.frequentis.com/", "selectConceptForFacet");
    private final static QName _SelectConceptForFacetResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "selectConceptForFacetResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.frequentis.semnotam.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetConceptForInterest }
     * 
     */
    public GetConceptForInterest createGetConceptForInterest() {
        return new GetConceptForInterest();
    }

    /**
     * Create an instance of {@link GetConceptForInterestResponse }
     * 
     */
    public GetConceptForInterestResponse createGetConceptForInterestResponse() {
        return new GetConceptForInterestResponse();
    }

    /**
     * Create an instance of {@link GetInterestFromConcept }
     * 
     */
    public GetInterestFromConcept createGetInterestFromConcept() {
        return new GetInterestFromConcept();
    }

    /**
     * Create an instance of {@link GetInterestFromConceptResponse }
     * 
     */
    public GetInterestFromConceptResponse createGetInterestFromConceptResponse() {
        return new GetInterestFromConceptResponse();
    }

    /**
     * Create an instance of {@link SelectConceptForFacet }
     * 
     */
    public SelectConceptForFacet createSelectConceptForFacet() {
        return new SelectConceptForFacet();
    }

    /**
     * Create an instance of {@link SelectConceptForFacetResponse }
     * 
     */
    public SelectConceptForFacetResponse createSelectConceptForFacetResponse() {
        return new SelectConceptForFacetResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConceptForInterest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getConceptForInterest")
    public JAXBElement<GetConceptForInterest> createGetConceptForInterest(GetConceptForInterest value) {
        return new JAXBElement<GetConceptForInterest>(_GetConceptForInterest_QNAME, GetConceptForInterest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConceptForInterestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getConceptForInterestResponse")
    public JAXBElement<GetConceptForInterestResponse> createGetConceptForInterestResponse(GetConceptForInterestResponse value) {
        return new JAXBElement<GetConceptForInterestResponse>(_GetConceptForInterestResponse_QNAME, GetConceptForInterestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInterestFromConcept }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getInterestFromConcept")
    public JAXBElement<GetInterestFromConcept> createGetInterestFromConcept(GetInterestFromConcept value) {
        return new JAXBElement<GetInterestFromConcept>(_GetInterestFromConcept_QNAME, GetInterestFromConcept.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInterestFromConceptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getInterestFromConceptResponse")
    public JAXBElement<GetInterestFromConceptResponse> createGetInterestFromConceptResponse(GetInterestFromConceptResponse value) {
        return new JAXBElement<GetInterestFromConceptResponse>(_GetInterestFromConceptResponse_QNAME, GetInterestFromConceptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectConceptForFacet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "selectConceptForFacet")
    public JAXBElement<SelectConceptForFacet> createSelectConceptForFacet(SelectConceptForFacet value) {
        return new JAXBElement<SelectConceptForFacet>(_SelectConceptForFacet_QNAME, SelectConceptForFacet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectConceptForFacetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "selectConceptForFacetResponse")
    public JAXBElement<SelectConceptForFacetResponse> createSelectConceptForFacetResponse(SelectConceptForFacetResponse value) {
        return new JAXBElement<SelectConceptForFacetResponse>(_SelectConceptForFacetResponse_QNAME, SelectConceptForFacetResponse.class, null, value);
    }

}
