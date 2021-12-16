/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bank.ChiTietTaiKhoan;
import bank.TaiKhoan;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class LichSuGiaoDichController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan tk = (TaiKhoan) request.getSession().getAttribute("loginInfor");
        if (tk != null) {
            String STK = tk.getSoTaiKhoan();
            List<ChiTietTaiKhoan> list = xemChiTietTaiKhoan(STK);
            session.setAttribute("historyList", list);
            request.getRequestDispatcher("lichsugiaodich.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/Login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static java.util.List<bank.ChiTietTaiKhoan> xemChiTietTaiKhoan(java.lang.String stk) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.xemChiTietTaiKhoan(stk);
    }

}
