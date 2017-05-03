
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

    private final static QName _Evaluate_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluate");
    private final static QName _EvaluateFeatureCollection_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateFeatureCollection");
    private final static QName _EvaluateFeatureCollectionResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateFeatureCollectionResponse");
    private final static QName _EvaluateInterestSpecification_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateInterestSpecification");
    private final static QName _EvaluateInterestSpecificationForFeatureCollection_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateInterestSpecificationForFeatureCollection");
    private final static QName _EvaluateInterestSpecificationForFeatureCollectionResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateInterestSpecificationForFeatureCollectionResponse");
    private final static QName _EvaluateInterestSpecificationForNotamSet_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateInterestSpecificationForNotamSet");
    private final static QName _EvaluateInterestSpecificationForNotamSetResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateInterestSpecificationForNotamSetResponse");
    private final static QName _EvaluateInterestSpecificationResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateInterestSpecificationResponse");
    private final static QName _EvaluateNotamSet_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateNotamSet");
    private final static QName _EvaluateNotamSetResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateNotamSetResponse");
    private final static QName _EvaluateResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "evaluateResponse");
    private final static QName _GetAerodromeById_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAerodromeById");
    private final static QName _GetAerodromeByIdResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAerodromeByIdResponse");
    private final static QName _GetAerodromeIds_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAerodromeIds");
    private final static QName _GetAerodromeIdsResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAerodromeIdsResponse");
    private final static QName _GetAircraftTypeIds_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAircraftTypeIds");
    private final static QName _GetAircraftTypeIdsResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAircraftTypeIdsResponse");
    private final static QName _GetAtsSegmentById_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAtsSegmentById");
    private final static QName _GetAtsSegmentByIdResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAtsSegmentByIdResponse");
    private final static QName _GetAtsSegmentIds_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAtsSegmentIds");
    private final static QName _GetAtsSegmentIdsResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getAtsSegmentIdsResponse");
    private final static QName _GetFirById_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getFirById");
    private final static QName _GetFirByIdResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getFirByIdResponse");
    private final static QName _GetFirIds_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getFirIds");
    private final static QName _GetFirIdsResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getFirIdsResponse");
    private final static QName _GetTransitionSegmentById_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getTransitionSegmentById");
    private final static QName _GetTransitionSegmentByIdResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getTransitionSegmentByIdResponse");
    private final static QName _GetTransitionSegmentIds_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getTransitionSegmentIds");
    private final static QName _GetTransitionSegmentIdsResponse_QNAME = new QName("http://ws.semnotam.frequentis.com/", "getTransitionSegmentIdsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.frequentis.semnotam.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Evaluate }
     * 
     */
    public Evaluate createEvaluate() {
        return new Evaluate();
    }

    /**
     * Create an instance of {@link EvaluateFeatureCollection }
     * 
     */
    public EvaluateFeatureCollection createEvaluateFeatureCollection() {
        return new EvaluateFeatureCollection();
    }

    /**
     * Create an instance of {@link EvaluateFeatureCollectionResponse }
     * 
     */
    public EvaluateFeatureCollectionResponse createEvaluateFeatureCollectionResponse() {
        return new EvaluateFeatureCollectionResponse();
    }

    /**
     * Create an instance of {@link EvaluateInterestSpecification }
     * 
     */
    public EvaluateInterestSpecification createEvaluateInterestSpecification() {
        return new EvaluateInterestSpecification();
    }

    /**
     * Create an instance of {@link EvaluateInterestSpecificationForFeatureCollection }
     * 
     */
    public EvaluateInterestSpecificationForFeatureCollection createEvaluateInterestSpecificationForFeatureCollection() {
        return new EvaluateInterestSpecificationForFeatureCollection();
    }

    /**
     * Create an instance of {@link EvaluateInterestSpecificationForFeatureCollectionResponse }
     * 
     */
    public EvaluateInterestSpecificationForFeatureCollectionResponse createEvaluateInterestSpecificationForFeatureCollectionResponse() {
        return new EvaluateInterestSpecificationForFeatureCollectionResponse();
    }

    /**
     * Create an instance of {@link EvaluateInterestSpecificationForNotamSet }
     * 
     */
    public EvaluateInterestSpecificationForNotamSet createEvaluateInterestSpecificationForNotamSet() {
        return new EvaluateInterestSpecificationForNotamSet();
    }

    /**
     * Create an instance of {@link EvaluateInterestSpecificationForNotamSetResponse }
     * 
     */
    public EvaluateInterestSpecificationForNotamSetResponse createEvaluateInterestSpecificationForNotamSetResponse() {
        return new EvaluateInterestSpecificationForNotamSetResponse();
    }

    /**
     * Create an instance of {@link EvaluateInterestSpecificationResponse }
     * 
     */
    public EvaluateInterestSpecificationResponse createEvaluateInterestSpecificationResponse() {
        return new EvaluateInterestSpecificationResponse();
    }

    /**
     * Create an instance of {@link EvaluateNotamSet }
     * 
     */
    public EvaluateNotamSet createEvaluateNotamSet() {
        return new EvaluateNotamSet();
    }

    /**
     * Create an instance of {@link EvaluateNotamSetResponse }
     * 
     */
    public EvaluateNotamSetResponse createEvaluateNotamSetResponse() {
        return new EvaluateNotamSetResponse();
    }

    /**
     * Create an instance of {@link EvaluateResponse }
     * 
     */
    public EvaluateResponse createEvaluateResponse() {
        return new EvaluateResponse();
    }

    /**
     * Create an instance of {@link GetAerodromeById }
     * 
     */
    public GetAerodromeById createGetAerodromeById() {
        return new GetAerodromeById();
    }

    /**
     * Create an instance of {@link GetAerodromeByIdResponse }
     * 
     */
    public GetAerodromeByIdResponse createGetAerodromeByIdResponse() {
        return new GetAerodromeByIdResponse();
    }

    /**
     * Create an instance of {@link GetAerodromeIds }
     * 
     */
    public GetAerodromeIds createGetAerodromeIds() {
        return new GetAerodromeIds();
    }

    /**
     * Create an instance of {@link GetAerodromeIdsResponse }
     * 
     */
    public GetAerodromeIdsResponse createGetAerodromeIdsResponse() {
        return new GetAerodromeIdsResponse();
    }

    /**
     * Create an instance of {@link GetAircraftTypeIds }
     * 
     */
    public GetAircraftTypeIds createGetAircraftTypeIds() {
        return new GetAircraftTypeIds();
    }

    /**
     * Create an instance of {@link GetAircraftTypeIdsResponse }
     * 
     */
    public GetAircraftTypeIdsResponse createGetAircraftTypeIdsResponse() {
        return new GetAircraftTypeIdsResponse();
    }

    /**
     * Create an instance of {@link GetAtsSegmentById }
     * 
     */
    public GetAtsSegmentById createGetAtsSegmentById() {
        return new GetAtsSegmentById();
    }

    /**
     * Create an instance of {@link GetAtsSegmentByIdResponse }
     * 
     */
    public GetAtsSegmentByIdResponse createGetAtsSegmentByIdResponse() {
        return new GetAtsSegmentByIdResponse();
    }

    /**
     * Create an instance of {@link GetAtsSegmentIds }
     * 
     */
    public GetAtsSegmentIds createGetAtsSegmentIds() {
        return new GetAtsSegmentIds();
    }

    /**
     * Create an instance of {@link GetAtsSegmentIdsResponse }
     * 
     */
    public GetAtsSegmentIdsResponse createGetAtsSegmentIdsResponse() {
        return new GetAtsSegmentIdsResponse();
    }

    /**
     * Create an instance of {@link GetFirById }
     * 
     */
    public GetFirById createGetFirById() {
        return new GetFirById();
    }

    /**
     * Create an instance of {@link GetFirByIdResponse }
     * 
     */
    public GetFirByIdResponse createGetFirByIdResponse() {
        return new GetFirByIdResponse();
    }

    /**
     * Create an instance of {@link GetFirIds }
     * 
     */
    public GetFirIds createGetFirIds() {
        return new GetFirIds();
    }

    /**
     * Create an instance of {@link GetFirIdsResponse }
     * 
     */
    public GetFirIdsResponse createGetFirIdsResponse() {
        return new GetFirIdsResponse();
    }

    /**
     * Create an instance of {@link GetTransitionSegmentById }
     * 
     */
    public GetTransitionSegmentById createGetTransitionSegmentById() {
        return new GetTransitionSegmentById();
    }

    /**
     * Create an instance of {@link GetTransitionSegmentByIdResponse }
     * 
     */
    public GetTransitionSegmentByIdResponse createGetTransitionSegmentByIdResponse() {
        return new GetTransitionSegmentByIdResponse();
    }

    /**
     * Create an instance of {@link GetTransitionSegmentIds }
     * 
     */
    public GetTransitionSegmentIds createGetTransitionSegmentIds() {
        return new GetTransitionSegmentIds();
    }

    /**
     * Create an instance of {@link GetTransitionSegmentIdsResponse }
     * 
     */
    public GetTransitionSegmentIdsResponse createGetTransitionSegmentIdsResponse() {
        return new GetTransitionSegmentIdsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evaluate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluate")
    public JAXBElement<Evaluate> createEvaluate(Evaluate value) {
        return new JAXBElement<Evaluate>(_Evaluate_QNAME, Evaluate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateFeatureCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateFeatureCollection")
    public JAXBElement<EvaluateFeatureCollection> createEvaluateFeatureCollection(EvaluateFeatureCollection value) {
        return new JAXBElement<EvaluateFeatureCollection>(_EvaluateFeatureCollection_QNAME, EvaluateFeatureCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateFeatureCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateFeatureCollectionResponse")
    public JAXBElement<EvaluateFeatureCollectionResponse> createEvaluateFeatureCollectionResponse(EvaluateFeatureCollectionResponse value) {
        return new JAXBElement<EvaluateFeatureCollectionResponse>(_EvaluateFeatureCollectionResponse_QNAME, EvaluateFeatureCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateInterestSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateInterestSpecification")
    public JAXBElement<EvaluateInterestSpecification> createEvaluateInterestSpecification(EvaluateInterestSpecification value) {
        return new JAXBElement<EvaluateInterestSpecification>(_EvaluateInterestSpecification_QNAME, EvaluateInterestSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateInterestSpecificationForFeatureCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateInterestSpecificationForFeatureCollection")
    public JAXBElement<EvaluateInterestSpecificationForFeatureCollection> createEvaluateInterestSpecificationForFeatureCollection(EvaluateInterestSpecificationForFeatureCollection value) {
        return new JAXBElement<EvaluateInterestSpecificationForFeatureCollection>(_EvaluateInterestSpecificationForFeatureCollection_QNAME, EvaluateInterestSpecificationForFeatureCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateInterestSpecificationForFeatureCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateInterestSpecificationForFeatureCollectionResponse")
    public JAXBElement<EvaluateInterestSpecificationForFeatureCollectionResponse> createEvaluateInterestSpecificationForFeatureCollectionResponse(EvaluateInterestSpecificationForFeatureCollectionResponse value) {
        return new JAXBElement<EvaluateInterestSpecificationForFeatureCollectionResponse>(_EvaluateInterestSpecificationForFeatureCollectionResponse_QNAME, EvaluateInterestSpecificationForFeatureCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateInterestSpecificationForNotamSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateInterestSpecificationForNotamSet")
    public JAXBElement<EvaluateInterestSpecificationForNotamSet> createEvaluateInterestSpecificationForNotamSet(EvaluateInterestSpecificationForNotamSet value) {
        return new JAXBElement<EvaluateInterestSpecificationForNotamSet>(_EvaluateInterestSpecificationForNotamSet_QNAME, EvaluateInterestSpecificationForNotamSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateInterestSpecificationForNotamSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateInterestSpecificationForNotamSetResponse")
    public JAXBElement<EvaluateInterestSpecificationForNotamSetResponse> createEvaluateInterestSpecificationForNotamSetResponse(EvaluateInterestSpecificationForNotamSetResponse value) {
        return new JAXBElement<EvaluateInterestSpecificationForNotamSetResponse>(_EvaluateInterestSpecificationForNotamSetResponse_QNAME, EvaluateInterestSpecificationForNotamSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateInterestSpecificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateInterestSpecificationResponse")
    public JAXBElement<EvaluateInterestSpecificationResponse> createEvaluateInterestSpecificationResponse(EvaluateInterestSpecificationResponse value) {
        return new JAXBElement<EvaluateInterestSpecificationResponse>(_EvaluateInterestSpecificationResponse_QNAME, EvaluateInterestSpecificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateNotamSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateNotamSet")
    public JAXBElement<EvaluateNotamSet> createEvaluateNotamSet(EvaluateNotamSet value) {
        return new JAXBElement<EvaluateNotamSet>(_EvaluateNotamSet_QNAME, EvaluateNotamSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateNotamSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateNotamSetResponse")
    public JAXBElement<EvaluateNotamSetResponse> createEvaluateNotamSetResponse(EvaluateNotamSetResponse value) {
        return new JAXBElement<EvaluateNotamSetResponse>(_EvaluateNotamSetResponse_QNAME, EvaluateNotamSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "evaluateResponse")
    public JAXBElement<EvaluateResponse> createEvaluateResponse(EvaluateResponse value) {
        return new JAXBElement<EvaluateResponse>(_EvaluateResponse_QNAME, EvaluateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAerodromeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAerodromeById")
    public JAXBElement<GetAerodromeById> createGetAerodromeById(GetAerodromeById value) {
        return new JAXBElement<GetAerodromeById>(_GetAerodromeById_QNAME, GetAerodromeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAerodromeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAerodromeByIdResponse")
    public JAXBElement<GetAerodromeByIdResponse> createGetAerodromeByIdResponse(GetAerodromeByIdResponse value) {
        return new JAXBElement<GetAerodromeByIdResponse>(_GetAerodromeByIdResponse_QNAME, GetAerodromeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAerodromeIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAerodromeIds")
    public JAXBElement<GetAerodromeIds> createGetAerodromeIds(GetAerodromeIds value) {
        return new JAXBElement<GetAerodromeIds>(_GetAerodromeIds_QNAME, GetAerodromeIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAerodromeIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAerodromeIdsResponse")
    public JAXBElement<GetAerodromeIdsResponse> createGetAerodromeIdsResponse(GetAerodromeIdsResponse value) {
        return new JAXBElement<GetAerodromeIdsResponse>(_GetAerodromeIdsResponse_QNAME, GetAerodromeIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAircraftTypeIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAircraftTypeIds")
    public JAXBElement<GetAircraftTypeIds> createGetAircraftTypeIds(GetAircraftTypeIds value) {
        return new JAXBElement<GetAircraftTypeIds>(_GetAircraftTypeIds_QNAME, GetAircraftTypeIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAircraftTypeIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAircraftTypeIdsResponse")
    public JAXBElement<GetAircraftTypeIdsResponse> createGetAircraftTypeIdsResponse(GetAircraftTypeIdsResponse value) {
        return new JAXBElement<GetAircraftTypeIdsResponse>(_GetAircraftTypeIdsResponse_QNAME, GetAircraftTypeIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAtsSegmentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAtsSegmentById")
    public JAXBElement<GetAtsSegmentById> createGetAtsSegmentById(GetAtsSegmentById value) {
        return new JAXBElement<GetAtsSegmentById>(_GetAtsSegmentById_QNAME, GetAtsSegmentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAtsSegmentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAtsSegmentByIdResponse")
    public JAXBElement<GetAtsSegmentByIdResponse> createGetAtsSegmentByIdResponse(GetAtsSegmentByIdResponse value) {
        return new JAXBElement<GetAtsSegmentByIdResponse>(_GetAtsSegmentByIdResponse_QNAME, GetAtsSegmentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAtsSegmentIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAtsSegmentIds")
    public JAXBElement<GetAtsSegmentIds> createGetAtsSegmentIds(GetAtsSegmentIds value) {
        return new JAXBElement<GetAtsSegmentIds>(_GetAtsSegmentIds_QNAME, GetAtsSegmentIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAtsSegmentIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getAtsSegmentIdsResponse")
    public JAXBElement<GetAtsSegmentIdsResponse> createGetAtsSegmentIdsResponse(GetAtsSegmentIdsResponse value) {
        return new JAXBElement<GetAtsSegmentIdsResponse>(_GetAtsSegmentIdsResponse_QNAME, GetAtsSegmentIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFirById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getFirById")
    public JAXBElement<GetFirById> createGetFirById(GetFirById value) {
        return new JAXBElement<GetFirById>(_GetFirById_QNAME, GetFirById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFirByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getFirByIdResponse")
    public JAXBElement<GetFirByIdResponse> createGetFirByIdResponse(GetFirByIdResponse value) {
        return new JAXBElement<GetFirByIdResponse>(_GetFirByIdResponse_QNAME, GetFirByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFirIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getFirIds")
    public JAXBElement<GetFirIds> createGetFirIds(GetFirIds value) {
        return new JAXBElement<GetFirIds>(_GetFirIds_QNAME, GetFirIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFirIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getFirIdsResponse")
    public JAXBElement<GetFirIdsResponse> createGetFirIdsResponse(GetFirIdsResponse value) {
        return new JAXBElement<GetFirIdsResponse>(_GetFirIdsResponse_QNAME, GetFirIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransitionSegmentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getTransitionSegmentById")
    public JAXBElement<GetTransitionSegmentById> createGetTransitionSegmentById(GetTransitionSegmentById value) {
        return new JAXBElement<GetTransitionSegmentById>(_GetTransitionSegmentById_QNAME, GetTransitionSegmentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransitionSegmentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getTransitionSegmentByIdResponse")
    public JAXBElement<GetTransitionSegmentByIdResponse> createGetTransitionSegmentByIdResponse(GetTransitionSegmentByIdResponse value) {
        return new JAXBElement<GetTransitionSegmentByIdResponse>(_GetTransitionSegmentByIdResponse_QNAME, GetTransitionSegmentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransitionSegmentIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getTransitionSegmentIds")
    public JAXBElement<GetTransitionSegmentIds> createGetTransitionSegmentIds(GetTransitionSegmentIds value) {
        return new JAXBElement<GetTransitionSegmentIds>(_GetTransitionSegmentIds_QNAME, GetTransitionSegmentIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransitionSegmentIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.semnotam.frequentis.com/", name = "getTransitionSegmentIdsResponse")
    public JAXBElement<GetTransitionSegmentIdsResponse> createGetTransitionSegmentIdsResponse(GetTransitionSegmentIdsResponse value) {
        return new JAXBElement<GetTransitionSegmentIdsResponse>(_GetTransitionSegmentIdsResponse_QNAME, GetTransitionSegmentIdsResponse.class, null, value);
    }

}
