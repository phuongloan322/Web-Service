/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.ChiTietTaiKhoan;
import dao.ChiTietTaiKhoandao;
import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class ChiTietTaiKhoanbo {
    ChiTietTaiKhoandao cttkdao = new  ChiTietTaiKhoandao();
    public ArrayList<ChiTietTaiKhoan> ChiTietTaiKhoan(String stk) throws Exception{
        return cttkdao.ChiTietTaiKhoan(stk);
    }
    
    public int LuuRutTien(String stk, long soTienRut) throws Exception{
        return cttkdao.LuuRutTien(stk, soTienRut);
    }
    public int LuuChuyenTien(String stkTu, String stkDen, long soTienChuyen) throws Exception {
        return cttkdao.LuuChuyenTien(stkTu, stkDen, soTienChuyen);
    }
    public int LuuNhanTien(String stkTu, String stkDen, long soTienChuyen, String noidung) throws Exception {
        return cttkdao.LuuNhanTien(stkTu, stkDen, soTienChuyen, noidung);
    }
}
