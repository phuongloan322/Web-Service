/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DungChung {
    public static Connection cnn;
    public void KetNoi() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	System.out.println("Da xac dinh!");
	String url="jdbc:sqlserver://DESKTOP-E754EJE\\SQLEXPRESS:1433;databaseName=QLTaiKhoan;user=sa; password=123456";
    	cnn= DriverManager.getConnection(url);
    	System.out.println("Da ket noi");
    }
    public static void main(String[] args) {
        try {
            DungChung dc = new DungChung();
            dc.KetNoi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
