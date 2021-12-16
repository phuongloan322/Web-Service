/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankclient2;

import bank.ChiTietTaiKhoan;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BankClient2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //ArrayList<TaiKhoan> ds = tt.getTaiKhoan();
            List<ChiTietTaiKhoan> ds = BankClient.xemChiTietTaiKhoan("123456789");
            for(ChiTietTaiKhoan tk : ds) {
                System.out.println(tk.getSoTienGiaoDich()+":"+tk.getSoTaiKhoan());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
