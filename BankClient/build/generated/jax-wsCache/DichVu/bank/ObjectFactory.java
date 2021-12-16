
package bank;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bank package. 
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

    private final static QName _CongResponse_QNAME = new QName("http://bank/", "CongResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://bank/", "helloResponse");
    private final static QName _TaiKhoanDenResponse_QNAME = new QName("http://bank/", "TaiKhoanDenResponse");
    private final static QName _LuuChuyenTienResponse_QNAME = new QName("http://bank/", "LuuChuyenTienResponse");
    private final static QName _Hello_QNAME = new QName("http://bank/", "hello");
    private final static QName _GetSoTaiKhoanResponse_QNAME = new QName("http://bank/", "getSoTaiKhoanResponse");
    private final static QName _Cong_QNAME = new QName("http://bank/", "Cong");
    private final static QName _GetTaiKhoanResponse_QNAME = new QName("http://bank/", "getTaiKhoanResponse");
    private final static QName _TaiKhoanDen_QNAME = new QName("http://bank/", "TaiKhoanDen");
    private final static QName _XemChiTietTaiKhoanResponse_QNAME = new QName("http://bank/", "xemChiTietTaiKhoanResponse");
    private final static QName _LuuNhanTien_QNAME = new QName("http://bank/", "LuuNhanTien");
    private final static QName _LuuRutTien_QNAME = new QName("http://bank/", "LuuRutTien");
    private final static QName _DoiPINResponse_QNAME = new QName("http://bank/", "DoiPINResponse");
    private final static QName _LuuChuyenTien_QNAME = new QName("http://bank/", "LuuChuyenTien");
    private final static QName _ChuyenTienResponse_QNAME = new QName("http://bank/", "ChuyenTienResponse");
    private final static QName _SoTienResponse_QNAME = new QName("http://bank/", "SoTienResponse");
    private final static QName _RutTienResponse_QNAME = new QName("http://bank/", "RutTienResponse");
    private final static QName _RutTien_QNAME = new QName("http://bank/", "RutTien");
    private final static QName _SoTien_QNAME = new QName("http://bank/", "SoTien");
    private final static QName _XemChiTietTaiKhoan_QNAME = new QName("http://bank/", "xemChiTietTaiKhoan");
    private final static QName _GetSoTaiKhoan_QNAME = new QName("http://bank/", "getSoTaiKhoan");
    private final static QName _ChuyenTien_QNAME = new QName("http://bank/", "ChuyenTien");
    private final static QName _DoiPIN_QNAME = new QName("http://bank/", "DoiPIN");
    private final static QName _CheckDangNhapResponse_QNAME = new QName("http://bank/", "CheckDangNhapResponse");
    private final static QName _CheckDangNhap_QNAME = new QName("http://bank/", "CheckDangNhap");
    private final static QName _GetTaiKhoan_QNAME = new QName("http://bank/", "getTaiKhoan");
    private final static QName _LuuNhanTienResponse_QNAME = new QName("http://bank/", "LuuNhanTienResponse");
    private final static QName _LuuRutTienResponse_QNAME = new QName("http://bank/", "LuuRutTienResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChuyenTien }
     * 
     */
    public ChuyenTien createChuyenTien() {
        return new ChuyenTien();
    }

    /**
     * Create an instance of {@link DoiPIN }
     * 
     */
    public DoiPIN createDoiPIN() {
        return new DoiPIN();
    }

    /**
     * Create an instance of {@link CheckDangNhap }
     * 
     */
    public CheckDangNhap createCheckDangNhap() {
        return new CheckDangNhap();
    }

    /**
     * Create an instance of {@link GetTaiKhoan }
     * 
     */
    public GetTaiKhoan createGetTaiKhoan() {
        return new GetTaiKhoan();
    }

    /**
     * Create an instance of {@link CheckDangNhapResponse }
     * 
     */
    public CheckDangNhapResponse createCheckDangNhapResponse() {
        return new CheckDangNhapResponse();
    }

    /**
     * Create an instance of {@link LuuNhanTienResponse }
     * 
     */
    public LuuNhanTienResponse createLuuNhanTienResponse() {
        return new LuuNhanTienResponse();
    }

    /**
     * Create an instance of {@link LuuRutTienResponse }
     * 
     */
    public LuuRutTienResponse createLuuRutTienResponse() {
        return new LuuRutTienResponse();
    }

    /**
     * Create an instance of {@link LuuChuyenTien }
     * 
     */
    public LuuChuyenTien createLuuChuyenTien() {
        return new LuuChuyenTien();
    }

    /**
     * Create an instance of {@link DoiPINResponse }
     * 
     */
    public DoiPINResponse createDoiPINResponse() {
        return new DoiPINResponse();
    }

    /**
     * Create an instance of {@link ChuyenTienResponse }
     * 
     */
    public ChuyenTienResponse createChuyenTienResponse() {
        return new ChuyenTienResponse();
    }

    /**
     * Create an instance of {@link SoTienResponse }
     * 
     */
    public SoTienResponse createSoTienResponse() {
        return new SoTienResponse();
    }

    /**
     * Create an instance of {@link SoTien }
     * 
     */
    public SoTien createSoTien() {
        return new SoTien();
    }

    /**
     * Create an instance of {@link XemChiTietTaiKhoan }
     * 
     */
    public XemChiTietTaiKhoan createXemChiTietTaiKhoan() {
        return new XemChiTietTaiKhoan();
    }

    /**
     * Create an instance of {@link GetSoTaiKhoan }
     * 
     */
    public GetSoTaiKhoan createGetSoTaiKhoan() {
        return new GetSoTaiKhoan();
    }

    /**
     * Create an instance of {@link RutTienResponse }
     * 
     */
    public RutTienResponse createRutTienResponse() {
        return new RutTienResponse();
    }

    /**
     * Create an instance of {@link RutTien }
     * 
     */
    public RutTien createRutTien() {
        return new RutTien();
    }

    /**
     * Create an instance of {@link Cong }
     * 
     */
    public Cong createCong() {
        return new Cong();
    }

    /**
     * Create an instance of {@link GetTaiKhoanResponse }
     * 
     */
    public GetTaiKhoanResponse createGetTaiKhoanResponse() {
        return new GetTaiKhoanResponse();
    }

    /**
     * Create an instance of {@link LuuNhanTien }
     * 
     */
    public LuuNhanTien createLuuNhanTien() {
        return new LuuNhanTien();
    }

    /**
     * Create an instance of {@link LuuRutTien }
     * 
     */
    public LuuRutTien createLuuRutTien() {
        return new LuuRutTien();
    }

    /**
     * Create an instance of {@link TaiKhoanDen }
     * 
     */
    public TaiKhoanDen createTaiKhoanDen() {
        return new TaiKhoanDen();
    }

    /**
     * Create an instance of {@link XemChiTietTaiKhoanResponse }
     * 
     */
    public XemChiTietTaiKhoanResponse createXemChiTietTaiKhoanResponse() {
        return new XemChiTietTaiKhoanResponse();
    }

    /**
     * Create an instance of {@link CongResponse }
     * 
     */
    public CongResponse createCongResponse() {
        return new CongResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link TaiKhoanDenResponse }
     * 
     */
    public TaiKhoanDenResponse createTaiKhoanDenResponse() {
        return new TaiKhoanDenResponse();
    }

    /**
     * Create an instance of {@link LuuChuyenTienResponse }
     * 
     */
    public LuuChuyenTienResponse createLuuChuyenTienResponse() {
        return new LuuChuyenTienResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetSoTaiKhoanResponse }
     * 
     */
    public GetSoTaiKhoanResponse createGetSoTaiKhoanResponse() {
        return new GetSoTaiKhoanResponse();
    }

    /**
     * Create an instance of {@link ChiTietTaiKhoan }
     * 
     */
    public ChiTietTaiKhoan createChiTietTaiKhoan() {
        return new ChiTietTaiKhoan();
    }

    /**
     * Create an instance of {@link TaiKhoan }
     * 
     */
    public TaiKhoan createTaiKhoan() {
        return new TaiKhoan();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "CongResponse")
    public JAXBElement<CongResponse> createCongResponse(CongResponse value) {
        return new JAXBElement<CongResponse>(_CongResponse_QNAME, CongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaiKhoanDenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "TaiKhoanDenResponse")
    public JAXBElement<TaiKhoanDenResponse> createTaiKhoanDenResponse(TaiKhoanDenResponse value) {
        return new JAXBElement<TaiKhoanDenResponse>(_TaiKhoanDenResponse_QNAME, TaiKhoanDenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuuChuyenTienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "LuuChuyenTienResponse")
    public JAXBElement<LuuChuyenTienResponse> createLuuChuyenTienResponse(LuuChuyenTienResponse value) {
        return new JAXBElement<LuuChuyenTienResponse>(_LuuChuyenTienResponse_QNAME, LuuChuyenTienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoTaiKhoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "getSoTaiKhoanResponse")
    public JAXBElement<GetSoTaiKhoanResponse> createGetSoTaiKhoanResponse(GetSoTaiKhoanResponse value) {
        return new JAXBElement<GetSoTaiKhoanResponse>(_GetSoTaiKhoanResponse_QNAME, GetSoTaiKhoanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "Cong")
    public JAXBElement<Cong> createCong(Cong value) {
        return new JAXBElement<Cong>(_Cong_QNAME, Cong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaiKhoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "getTaiKhoanResponse")
    public JAXBElement<GetTaiKhoanResponse> createGetTaiKhoanResponse(GetTaiKhoanResponse value) {
        return new JAXBElement<GetTaiKhoanResponse>(_GetTaiKhoanResponse_QNAME, GetTaiKhoanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaiKhoanDen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "TaiKhoanDen")
    public JAXBElement<TaiKhoanDen> createTaiKhoanDen(TaiKhoanDen value) {
        return new JAXBElement<TaiKhoanDen>(_TaiKhoanDen_QNAME, TaiKhoanDen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XemChiTietTaiKhoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "xemChiTietTaiKhoanResponse")
    public JAXBElement<XemChiTietTaiKhoanResponse> createXemChiTietTaiKhoanResponse(XemChiTietTaiKhoanResponse value) {
        return new JAXBElement<XemChiTietTaiKhoanResponse>(_XemChiTietTaiKhoanResponse_QNAME, XemChiTietTaiKhoanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuuNhanTien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "LuuNhanTien")
    public JAXBElement<LuuNhanTien> createLuuNhanTien(LuuNhanTien value) {
        return new JAXBElement<LuuNhanTien>(_LuuNhanTien_QNAME, LuuNhanTien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuuRutTien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "LuuRutTien")
    public JAXBElement<LuuRutTien> createLuuRutTien(LuuRutTien value) {
        return new JAXBElement<LuuRutTien>(_LuuRutTien_QNAME, LuuRutTien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoiPINResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "DoiPINResponse")
    public JAXBElement<DoiPINResponse> createDoiPINResponse(DoiPINResponse value) {
        return new JAXBElement<DoiPINResponse>(_DoiPINResponse_QNAME, DoiPINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuuChuyenTien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "LuuChuyenTien")
    public JAXBElement<LuuChuyenTien> createLuuChuyenTien(LuuChuyenTien value) {
        return new JAXBElement<LuuChuyenTien>(_LuuChuyenTien_QNAME, LuuChuyenTien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChuyenTienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "ChuyenTienResponse")
    public JAXBElement<ChuyenTienResponse> createChuyenTienResponse(ChuyenTienResponse value) {
        return new JAXBElement<ChuyenTienResponse>(_ChuyenTienResponse_QNAME, ChuyenTienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoTienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "SoTienResponse")
    public JAXBElement<SoTienResponse> createSoTienResponse(SoTienResponse value) {
        return new JAXBElement<SoTienResponse>(_SoTienResponse_QNAME, SoTienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RutTienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "RutTienResponse")
    public JAXBElement<RutTienResponse> createRutTienResponse(RutTienResponse value) {
        return new JAXBElement<RutTienResponse>(_RutTienResponse_QNAME, RutTienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RutTien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "RutTien")
    public JAXBElement<RutTien> createRutTien(RutTien value) {
        return new JAXBElement<RutTien>(_RutTien_QNAME, RutTien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoTien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "SoTien")
    public JAXBElement<SoTien> createSoTien(SoTien value) {
        return new JAXBElement<SoTien>(_SoTien_QNAME, SoTien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XemChiTietTaiKhoan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "xemChiTietTaiKhoan")
    public JAXBElement<XemChiTietTaiKhoan> createXemChiTietTaiKhoan(XemChiTietTaiKhoan value) {
        return new JAXBElement<XemChiTietTaiKhoan>(_XemChiTietTaiKhoan_QNAME, XemChiTietTaiKhoan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoTaiKhoan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "getSoTaiKhoan")
    public JAXBElement<GetSoTaiKhoan> createGetSoTaiKhoan(GetSoTaiKhoan value) {
        return new JAXBElement<GetSoTaiKhoan>(_GetSoTaiKhoan_QNAME, GetSoTaiKhoan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChuyenTien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "ChuyenTien")
    public JAXBElement<ChuyenTien> createChuyenTien(ChuyenTien value) {
        return new JAXBElement<ChuyenTien>(_ChuyenTien_QNAME, ChuyenTien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoiPIN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "DoiPIN")
    public JAXBElement<DoiPIN> createDoiPIN(DoiPIN value) {
        return new JAXBElement<DoiPIN>(_DoiPIN_QNAME, DoiPIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDangNhapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "CheckDangNhapResponse")
    public JAXBElement<CheckDangNhapResponse> createCheckDangNhapResponse(CheckDangNhapResponse value) {
        return new JAXBElement<CheckDangNhapResponse>(_CheckDangNhapResponse_QNAME, CheckDangNhapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDangNhap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "CheckDangNhap")
    public JAXBElement<CheckDangNhap> createCheckDangNhap(CheckDangNhap value) {
        return new JAXBElement<CheckDangNhap>(_CheckDangNhap_QNAME, CheckDangNhap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaiKhoan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "getTaiKhoan")
    public JAXBElement<GetTaiKhoan> createGetTaiKhoan(GetTaiKhoan value) {
        return new JAXBElement<GetTaiKhoan>(_GetTaiKhoan_QNAME, GetTaiKhoan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuuNhanTienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "LuuNhanTienResponse")
    public JAXBElement<LuuNhanTienResponse> createLuuNhanTienResponse(LuuNhanTienResponse value) {
        return new JAXBElement<LuuNhanTienResponse>(_LuuNhanTienResponse_QNAME, LuuNhanTienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuuRutTienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank/", name = "LuuRutTienResponse")
    public JAXBElement<LuuRutTienResponse> createLuuRutTienResponse(LuuRutTienResponse value) {
        return new JAXBElement<LuuRutTienResponse>(_LuuRutTienResponse_QNAME, LuuRutTienResponse.class, null, value);
    }

}
