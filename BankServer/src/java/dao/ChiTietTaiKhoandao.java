/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ChiTietTaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ChiTietTaiKhoandao {

   
    DungChung dc = new DungChung();

    public ArrayList<ChiTietTaiKhoan> ChiTietTaiKhoan(String stk) throws Exception {
        ArrayList<ChiTietTaiKhoan> ds = new ArrayList<>();

        String sql = "select * from ChiTietTaiKhoan where SoTaiKhoan = ?";

        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setString(1, stk);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            ChiTietTaiKhoan cttk = new ChiTietTaiKhoan(rs.getLong("Id"), rs.getString("NgayGiaoDich"), rs.getLong("SoTienGiaoDich"), rs.getString("SoTaiKhoan"), rs.getString("GhiChu"));
            ds.add(cttk);
        }
        rs.close();
        return ds;
    }

    public int LuuRutTien(String stk, long soTienRut) throws Exception {
        int rs = 0;

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String ngayRutTien = f.format(now);

        String sql = "insert into ChiTietTaiKhoan values (?,?,?,?)";

        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setString(1, ngayRutTien);
        pst.setLong(2, soTienRut);
        pst.setString(3, stk);
        pst.setString(4, "Rút tiền");

        rs = pst.executeUpdate();
        return rs;
    }

    public int LuuChuyenTien(String stkTu, String stkDen, long soTienChuyen) throws Exception {
        int rs = 0;
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String ngayGiaodich = f.format(now);

        String sql = "insert into ChiTietTaiKhoan values (?,?,?,?)";
        
        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setString(1, ngayGiaodich);
        pst.setLong(2, soTienChuyen);
        pst.setString(3, stkTu);
        pst.setString(4, "Chuyển tiền đến " + stkDen);
        
        rs = pst.executeUpdate();
        return rs;
    }
    public int LuuNhanTien(String stkTu, String stkDen, long soTienChuyen, String noidung) throws Exception {
        int rs = 0;
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String ngayGiaodich = f.format(now);

        String sql = "insert into ChiTietTaiKhoan values (?,?,?,?)";
        
        dc.KetNoi();
        PreparedStatement pst = DungChung.cnn.prepareStatement(sql);
        pst.setString(1, ngayGiaodich);
        pst.setLong(2, soTienChuyen);
        pst.setString(3, stkDen);
        pst.setString(4, "Nhận tiền từ " + stkTu +": "+noidung);
        
        rs = pst.executeUpdate();
        return rs;
    }
}
