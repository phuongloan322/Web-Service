
import bean.ChiTietTaiKhoan;
import bo.ChiTietTaiKhoanbo;
import dao.DungChung;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyServer {
    public static void main(String[] args) {
        try {
            DungChung dc = new DungChung();
            dc.KetNoi();
            System.out.println("Dang cho may khach goi den!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}