
package ws_soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_soap package. 
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

    private final static QName _AfficherVol_QNAME = new QName("http://ws_soap/", "afficher_vol");
    private final static QName _AfficherVolResponse_QNAME = new QName("http://ws_soap/", "afficher_volResponse");
    private final static QName _CalMntTtc_QNAME = new QName("http://ws_soap/", "cal_mnt_ttc");
    private final static QName _CalMntTtcResponse_QNAME = new QName("http://ws_soap/", "cal_mnt_ttcResponse");
    private final static QName _Traduction_QNAME = new QName("http://ws_soap/", "traduction");
    private final static QName _TraductionResponse_QNAME = new QName("http://ws_soap/", "traductionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AfficherVol }
     * 
     */
    public AfficherVol createAfficherVol() {
        return new AfficherVol();
    }

    /**
     * Create an instance of {@link AfficherVolResponse }
     * 
     */
    public AfficherVolResponse createAfficherVolResponse() {
        return new AfficherVolResponse();
    }

    /**
     * Create an instance of {@link CalMntTtc }
     * 
     */
    public CalMntTtc createCalMntTtc() {
        return new CalMntTtc();
    }

    /**
     * Create an instance of {@link CalMntTtcResponse }
     * 
     */
    public CalMntTtcResponse createCalMntTtcResponse() {
        return new CalMntTtcResponse();
    }

    /**
     * Create an instance of {@link Traduction }
     * 
     */
    public Traduction createTraduction() {
        return new Traduction();
    }

    /**
     * Create an instance of {@link TraductionResponse }
     * 
     */
    public TraductionResponse createTraductionResponse() {
        return new TraductionResponse();
    }

    /**
     * Create an instance of {@link Vol }
     * 
     */
    public Vol createVol() {
        return new Vol();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherVol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_soap/", name = "afficher_vol")
    public JAXBElement<AfficherVol> createAfficherVol(AfficherVol value) {
        return new JAXBElement<AfficherVol>(_AfficherVol_QNAME, AfficherVol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherVolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_soap/", name = "afficher_volResponse")
    public JAXBElement<AfficherVolResponse> createAfficherVolResponse(AfficherVolResponse value) {
        return new JAXBElement<AfficherVolResponse>(_AfficherVolResponse_QNAME, AfficherVolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalMntTtc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_soap/", name = "cal_mnt_ttc")
    public JAXBElement<CalMntTtc> createCalMntTtc(CalMntTtc value) {
        return new JAXBElement<CalMntTtc>(_CalMntTtc_QNAME, CalMntTtc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalMntTtcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_soap/", name = "cal_mnt_ttcResponse")
    public JAXBElement<CalMntTtcResponse> createCalMntTtcResponse(CalMntTtcResponse value) {
        return new JAXBElement<CalMntTtcResponse>(_CalMntTtcResponse_QNAME, CalMntTtcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Traduction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_soap/", name = "traduction")
    public JAXBElement<Traduction> createTraduction(Traduction value) {
        return new JAXBElement<Traduction>(_Traduction_QNAME, Traduction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraductionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws_soap/", name = "traductionResponse")
    public JAXBElement<TraductionResponse> createTraductionResponse(TraductionResponse value) {
        return new JAXBElement<TraductionResponse>(_TraductionResponse_QNAME, TraductionResponse.class, null, value);
    }

}
