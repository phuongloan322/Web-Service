/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

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

    
    @WebMethod(operationName = "getTaiKhoan")
    public ArrayList<TaiKhoan> getTaiKhoan() {
        try {
            return tkbo.getTaiKhoan();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @WebMethod(operationName = "getSoTaiKhoan")
    public TaiKhoan getSoTaiKhoan(String stk) {
        try {
            return tkbo.getTaiKhoan(stk);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @WebMethod(operationName = "CheckDangNhap")
    public TaiKhoan CheckDangNhap(String soTaiKhoan, String matKhau) {
        try {
            return tkbo.CheckDangNhap(soTaiKhoan, matKhau);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @WebMethod(operationName = "SoTien")
    public long SoTien(String stkTu) {
        try {
        return tkbo.SoTien(stkTu);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    @WebMethod(operationName = "TaiKhoanDen")
    public TaiKhoan TaiKhoanDen(String stkDen) {
        try {
            return tkbo.TaiKhoanDen(stkDen);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @WebMethod(operationName = "RutTien")
    public int RutTien(String stk, long soTienRut) {
        try {
            return tkbo.RutTien(stk, soTienRut);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    @WebMethod(operationName = "ChuyenTien")
    public int ChuyenTien(String stkTu, String stkDen, long soTienChuyen){
        try {
            return tkbo.ChuyenTien(stkTu, stkDen, soTienChuyen);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    @WebMethod(operationName = "ChiTietTaiKhoan")
    public ArrayList<ChiTietTaiKhoan> ChiTietTaiKhoan(String stk) {
        try {
            return cttkbo.ChiTietTaiKhoan(stk);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @WebMethod(operationName = "LuuRutTien")
    public int LuuRutTien(String stk, long soTienRut) {
        try {
        return cttkbo.LuuRutTien(stk, soTienRut);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    @WebMethod(operationName = "LuuChuyenTien")
    public int LuuChuyenTien(String stkTu, String stkDen, long soTienChuyen)  {
        try {
            return cttkbo.LuuChuyenTien(stkTu, stkDen, soTienChuyen);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    @WebMethod(operationName = "LuuNhanTien")
    public int LuuNhanTien(String stkTu, String stkDen, long soTienChuyen, String noidung)  {
        try {
            return cttkbo.LuuNhanTien(stkTu, stkDen, soTienChuyen, noidung);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
