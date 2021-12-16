/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.TaiKhoan;
import dao.TaiKhoandao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TaiKhoanbo {
    
    TaiKhoandao taiKhoandao = new TaiKhoandao();
    
    public ArrayList<TaiKhoan> getTaiKhoan() throws Exception{
        return taiKhoandao.getTaiKhoan();
    }
    public TaiKhoan getTaiKhoan(String stk) throws Exception {
        return taiKhoandao.getTaiKhoan(stk);
    }
    public TaiKhoan CheckDangNhap(String soTaiKhoan, String matKhau) throws Exception{
        List<TaiKhoan> TaiKhoanlist = taiKhoandao.getTaiKhoan();
        TaiKhoan tk = null;
        for(TaiKhoan i : TaiKhoanlist) {
            if(i.getSoTaiKhoan().equals(soTaiKhoan) && i.getMatKhau().equals(matKhau)) 
                tk = i;
        }
        return tk;
    }
    public long SoTien(String stkTu) throws  Exception{
        return taiKhoandao.SoTien(stkTu);
    }
    public TaiKhoan TaiKhoanDen(String stkDen) throws Exception{
        return taiKhoandao.TaiKhoanDen(stkDen);
    }
    
    public int RutTien(String stk, long soTienRut) throws Exception{
        return taiKhoandao.RutTien(stk, soTienRut);
    }
    public int ChuyenTien(String stkTu, String stkDen, long soTienChuyen)throws Exception{
        return taiKhoandao.ChuyenTien(stkTu, stkDen, soTienChuyen);
    }
    public int DoiPIN(String user, String mkcu, String mkmoi) throws Exception {
        return taiKhoandao.DoiPIN(user, mkcu, mkmoi);
    }
}
