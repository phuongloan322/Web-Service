/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TaiKhoandao {

    DungChung dc = new DungChung();

    public ArrayList<TaiKhoan> getTaiKhoan() throws Exception {
        ArrayList<TaiKhoan> ds = new ArrayList<TaiKhoan>();

        String sql = "select SoTaiKhoan, HoTen, SoTien, MatKhau from TaiKhoan";

        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            TaiKhoan taiKhoan = new TaiKhoan(rs.getString("SoTaiKhoan"), rs.getString("HoTen"), rs.getLong("SoTien"), rs.getString("MatKhau"));
            ds.add(taiKhoan);
        }
        rs.close();
        return ds;
    }

    public TaiKhoan getTaiKhoan(String stk) throws Exception {
        ArrayList<TaiKhoan> ds = new ArrayList<TaiKhoan>();
        TaiKhoan taiKhoan = null;

        String sql = "select SoTaiKhoan, HoTen, SoTien, MatKhau from TaiKhoan where SoTaiKhoan = ?";

        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setString(1, stk);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            TaiKhoan tk = new TaiKhoan(rs.getString("SoTaiKhoan"), rs.getString("HoTen"), rs.getLong("SoTien"), rs.getString("MatKhau"));
            taiKhoan = tk;
        }
        rs.close();
        return taiKhoan;
    }

    public long SoTien(String stkTu) throws Exception {
        long sotien = 0;

        String sql = "select SoTien from TaiKhoan where SoTaiKhoan = ?";

        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setString(1, stkTu);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            sotien = rs.getLong(1);
        }
        rs.close();
        return sotien;
    }

    public TaiKhoan TaiKhoanDen(String stkDen) throws Exception {
        TaiKhoan taikhoan = null;

        String sql = "select * from TaiKhoan where SoTaiKhoan = ?";

        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setString(1, stkDen);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            taikhoan = new TaiKhoan(rs.getString("SoTaiKhoan"), rs.getString("HoTen"), 0, null);
        }
        rs.close();
        return taikhoan;
    }
    
    public int RutTien(String stk, long soTienRut) throws Exception {
        int rs = 0;
        
        String sql = "update TaiKhoan\n"
                + "set SoTien = SoTien - ? "
                + "where SoTaiKhoan = ? ";
        
        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setLong(1, soTienRut);
        pst.setString(2, stk);        
        rs = pst.executeUpdate();
        return rs;
    }
    
    public int ChuyenTien(String stkTu, String stkDen, long soTienChuyen) throws Exception {
        int result = 0;
        String sql = "update TaiKhoan\n"
                + "set SoTien = SoTien - ? \n"
                + "where SoTaiKhoan = ?\n"
                + "update TaiKhoan\n"
                + "set SoTien = SoTien + ? \n"
                + "where SoTaiKhoan = ?";
        
        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setLong(1, soTienChuyen);
        pst.setString(2, stkTu);
        pst.setLong(3, soTienChuyen);
        pst.setString(4, stkDen);
        result = pst.executeUpdate();

        return result;
    }
    
    public int DoiPIN(String user, String mkcu, String mkmoi) throws Exception {
        int result = 0;
        String sql = "update TaiKhoan\n" +
                    "set MatKhau = ?\n" +
                    "where SoTaiKhoan = ? and MatKhau = ?";
        
        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setString(1, mkmoi);
        pst.setString(2, user);
        pst.setString(3, mkcu);
        result = pst.executeUpdate();

        return result;
    }
    
}
