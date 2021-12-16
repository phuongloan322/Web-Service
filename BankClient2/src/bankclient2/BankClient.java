/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankclient2;

import bank.TaiKhoan;

/**
 *
 * @author Admin
 */
public class BankClient {

    public static TaiKhoan checkDangNhap(java.lang.String arg0, java.lang.String arg1) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.checkDangNhap(arg0, arg1);
    }

    public static int chuyenTien(java.lang.String arg0, java.lang.String arg1, long arg2) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.chuyenTien(arg0, arg1, arg2);
    }

    public static int luuChuyenTien(java.lang.String arg0, java.lang.String arg1, long arg2) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.luuChuyenTien(arg0, arg1, arg2);
    }

    public static int luuNhanTien(java.lang.String arg0, java.lang.String arg1, long arg2, java.lang.String arg3) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.luuNhanTien(arg0, arg1, arg2, arg3);
    }

    public static int luuRutTien(java.lang.String arg0, long arg1) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.luuRutTien(arg0, arg1);
    }

    public static int rutTien(java.lang.String arg0, long arg1) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.rutTien(arg0, arg1);
    }

    public static long soTien(java.lang.String arg0) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.soTien(arg0);
    }

    public static TaiKhoan taiKhoanDen(java.lang.String arg0) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.taiKhoanDen(arg0);
    }

    public static java.util.List<bank.ChiTietTaiKhoan> xemChiTietTaiKhoan(java.lang.String arg0) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.xemChiTietTaiKhoan(arg0);
    }

    public static TaiKhoan getSoTaiKhoan(java.lang.String arg0) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.getSoTaiKhoan(arg0);
    }

    public static java.util.List<bank.TaiKhoan> getTaiKhoan() {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.getTaiKhoan();
    }

    public static int doiPIN(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.doiPIN(arg0, arg1, arg2);
    }

    
}
