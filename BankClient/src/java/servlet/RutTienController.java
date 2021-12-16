/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bank.TaiKhoan;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class RutTienController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan tk = (TaiKhoan) request.getSession().getAttribute("loginInfor");
        if (tk != null) {
            String STK = tk.getSoTaiKhoan();
            String sotienrut = request.getParameter("sotienrut");
            if (sotienrut != null) {
                long soTienRut = Long.parseLong(sotienrut);
                long soTienKhaDung = soTien(STK);
                if(soTienKhaDung - 50000 < soTienRut) {
                    session.setAttribute("msg", "Số tiền rút không đủ!");
                }
                else {
                    int rs = rutTien(tk.getSoTaiKhoan(), soTienRut);
                    if(rs > 0) {
                        session.setAttribute("msg", "Giao dịch thực hiện thành công!");
                    }
                    else {
                        session.setAttribute("msg", "Giao dịch thực hiện thất bại");
                    }
                }
            }
            request.getRequestDispatcher("ruttien.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/Login");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static int rutTien(java.lang.String stk, long soTienRut) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.rutTien(stk, soTienRut);
    }

    private static long soTien(java.lang.String stkTu) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.soTien(stkTu);
    }

}
