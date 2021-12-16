/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("dichvuport")
public class DichVuPort {

    private bank_client.DichVu port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DichVuPort
     */
    public DichVuPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method CheckDangNhap
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<bank_client.TaiKhoan>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("checkdangnhap/")
    public JAXBElement<bank_client.TaiKhoan> getCheckDangNhap(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                bank_client.TaiKhoan result = port.checkDangNhap(arg0, arg1);
                return new JAXBElement<bank_client.TaiKhoan>(new QName("http//bank_client/", "taikhoan"), bank_client.TaiKhoan.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method DoiPIN
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("doipin/")
    public String getDoiPIN(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.doiPIN(arg0, arg1, arg2);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method XemChiTietTaiKhoan
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<bank_client.XemChiTietTaiKhoanResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("xemchitiettaikhoan/")
    public JAXBElement<bank_client.XemChiTietTaiKhoanResponse> getXemChiTietTaiKhoan(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<bank_client.ChiTietTaiKhoan> result = port.xemChiTietTaiKhoan(arg0);

                class XemChiTietTaiKhoanResponse_1 extends bank_client.XemChiTietTaiKhoanResponse {

                    XemChiTietTaiKhoanResponse_1(java.util.List<bank_client.ChiTietTaiKhoan> _return) {
                        this._return = _return;
                    }
                }
                bank_client.XemChiTietTaiKhoanResponse response = new XemChiTietTaiKhoanResponse_1(result);
                return new bank_client.ObjectFactory().createXemChiTietTaiKhoanResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method RutTien
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("ruttien/")
    public String getRutTien(@QueryParam("arg0") String arg0, @QueryParam("arg1")
            @DefaultValue("0") long arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.rutTien(arg0, arg1);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method LuuRutTien
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("luuruttien/")
    public String getLuuRutTien(@QueryParam("arg0") String arg0, @QueryParam("arg1")
            @DefaultValue("0") long arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.luuRutTien(arg0, arg1);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method TaiKhoanDen
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<bank_client.TaiKhoan>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("taikhoanden/")
    public JAXBElement<bank_client.TaiKhoan> getTaiKhoanDen(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                bank_client.TaiKhoan result = port.taiKhoanDen(arg0);
                return new JAXBElement<bank_client.TaiKhoan>(new QName("http//bank_client/", "taikhoan"), bank_client.TaiKhoan.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method LuuChuyenTien
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("luuchuyentien/")
    public String getLuuChuyenTien(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2")
            @DefaultValue("0") long arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.luuChuyenTien(arg0, arg1, arg2);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method SoTien
     * @param arg0 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("sotien/")
    public String getSoTien(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                long result = port.soTien(arg0);
                return new java.lang.Long(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getTaiKhoan
     * @return an instance of javax.xml.bind.JAXBElement<bank_client.GetTaiKhoanResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("gettaikhoan/")
    public JAXBElement<bank_client.GetTaiKhoanResponse> getTaiKhoan() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<bank_client.TaiKhoan> result = port.getTaiKhoan();

                class GetTaiKhoanResponse_1 extends bank_client.GetTaiKhoanResponse {

                    GetTaiKhoanResponse_1(java.util.List<bank_client.TaiKhoan> _return) {
                        this._return = _return;
                    }
                }
                bank_client.GetTaiKhoanResponse response = new GetTaiKhoanResponse_1(result);
                return new bank_client.ObjectFactory().createGetTaiKhoanResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method LuuNhanTien
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("luunhantien/")
    public String getLuuNhanTien(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2")
            @DefaultValue("0") long arg2, @QueryParam("arg3") String arg3) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.luuNhanTien(arg0, arg1, arg2, arg3);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method hello
     * @param name resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("hello/")
    public String getHello(@QueryParam("name") String name) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.hello(name);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getSoTaiKhoan
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<bank_client.TaiKhoan>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getsotaikhoan/")
    public JAXBElement<bank_client.TaiKhoan> getSoTaiKhoan(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                bank_client.TaiKhoan result = port.getSoTaiKhoan(arg0);
                return new JAXBElement<bank_client.TaiKhoan>(new QName("http//bank_client/", "taikhoan"), bank_client.TaiKhoan.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method ChuyenTien
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("chuyentien/")
    public String getChuyenTien(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2")
            @DefaultValue("0") long arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.chuyenTien(arg0, arg1, arg2);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private bank_client.DichVu getPort() {
        try {
            // Call Web Service Operation
            bank_client.DichVu_Service service = new bank_client.DichVu_Service();
            bank_client.DichVu p = service.getDichVuPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
