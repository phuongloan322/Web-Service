/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bank.TaiKhoan;

/**
 *
 * @author Admin
 */
public class NewClass {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(hello("loan"));
        System.out.println(checkDangNhap("123456789", "123123").getHoTen());
    }

    private static String hello(java.lang.String name) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.hello(name);
    }

    private static TaiKhoan checkDangNhap(java.lang.String soTaiKhoan, java.lang.String matKhau) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.checkDangNhap(soTaiKhoan, matKhau);
    }

   
}
