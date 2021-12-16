/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import bean.ChiTietTaiKhoan;
import bean.TaiKhoan;
import bo.ChiTietTaiKhoanbo;
import bo.TaiKhoanbo;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "DichVu")
public class DichVu {

    /**
     * This is a sample web service operation
     */
    TaiKhoanbo tkbo = new TaiKhoanbo();
    ChiTietTaiKhoanbo cttkbo = new ChiTietTaiKhoanbo();
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Cong") 
    public  int Cong(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int s = a+b;
        return s;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getTaiKhoan")
    public ArrayList<TaiKhoan> getTaiKhoan() {
        try {
            return tkbo.getTaiKhoan();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getSoTaiKhoan")
    public TaiKhoan getSoTaiKhoan(@WebParam(name = "stk") String stk) {
        try {
            return tkbo.getTaiKhoan(stk);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CheckDangNhap")
    public TaiKhoan CheckDangNhap(@WebParam(name = "soTaiKhoan") String soTaiKhoan, @WebParam(name = "matKhau") String matKhau) {
        try {
            return tkbo.CheckDangNhap(soTaiKhoan, matKhau);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SoTien")
    public long SoTien(@WebParam(name = "stkTu") String stkTu) {
        try {
        return tkbo.SoTien(stkTu);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "TaiKhoanDen")
    public TaiKhoan TaiKhoanDen(@WebParam(name = "stkDen") String stkDen) {
         try {
            return tkbo.TaiKhoanDen(stkDen);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RutTien")
    public int RutTien(@WebParam(name = "stk") String stk, @WebParam(name = "soTienRut") long soTienRut) {
        try {
            return tkbo.RutTien(stk, soTienRut);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ChuyenTien")
    public int ChuyenTien(@WebParam(name = "stkTu") String stkTu, @WebParam(name = "stkDen") String stkDen, @WebParam(name = "soTienChuyen") long soTienChuyen) {
        try {
            return tkbo.ChuyenTien(stkTu, stkDen, soTienChuyen);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "XemChiTietTaiKhoan")
    public ArrayList<ChiTietTaiKhoan> XemChiTietTaiKhoan(@WebParam(name = "stk") String stk) {
        try {
            return cttkbo.ChiTietTaiKhoan(stk);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LuuRutTien")
    public int LuuRutTien(@WebParam(name = "stk") String stk, @WebParam(name = "soTienRut") long soTienRut) {
        try {
        return cttkbo.LuuRutTien(stk, soTienRut);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LuuChuyenTien")
    public int LuuChuyenTien(@WebParam(name = "stkTu") String stkTu, @WebParam(name = "stkDen") String stkDen, @WebParam(name = "soTienChuyen") long soTienChuyen) {
       try {
            return cttkbo.LuuChuyenTien(stkTu, stkDen, soTienChuyen);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LuuNhanTien")
    public int LuuNhanTien(@WebParam(name = "stkTu") String stkTu, @WebParam(name = "stkDen") String stkDen, @WebParam(name = "soTienChuyen") long soTienChuyen, @WebParam(name = "noidung") String noidung) {
        try {
            return cttkbo.LuuNhanTien(stkTu, stkDen, soTienChuyen, noidung);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DoiPIN")
    public int DoiPIN(@WebParam(name = "user") String user, @WebParam(name = "mkcu") String mkcu, @WebParam(name = "mkmoi") String mkmoi) {
         try {
            return tkbo.DoiPIN(user, mkcu, mkmoi);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    
    
}
