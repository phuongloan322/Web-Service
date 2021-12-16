/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bank.TaiKhoan;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/ChuyenTien"})
public class ChuyenTienController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan tk = (TaiKhoan) request.getSession().getAttribute("loginInfor");
        if (tk != null) {
            String STK = tk.getSoTaiKhoan();
            String stkDen = request.getParameter("stkDen");
            String sotienchuyen = request.getParameter("sotienchuyen");
            String noidung = request.getParameter("noidung");
            if (sotienchuyen != null) {
                long soTienChuyen = Long.parseLong(sotienchuyen);
                long soTienTu = soTien(tk.getSoTaiKhoan());
                TaiKhoan taikhoanDen = taiKhoanDen(stkDen);
                if(taikhoanDen == null) {
                    session.setAttribute("msg", "Số tài khoản không tồn tại");
                }
                else if (soTienTu - 50000 < soTienChuyen) {
                    session.setAttribute("msg", "Số tiền chuyển vượt quá số dư tài khoản");
                }
                else if (soTienChuyen < 0) {
                    session.setAttribute("msg", "Số tiền chuyển phải lớn hơn 0");
                } else if (soTienChuyen > 999999999) {
                    session.setAttribute("msg", "Số tiền chuyển quá lớn");
                }
                else {
                    int rs = chuyenTien(STK, stkDen, soTienChuyen);
                    if(rs > 0) {
                        int rs1 = luuChuyenTien(STK, stkDen, -soTienChuyen);
                        int rs2 = luuNhanTien(STK, stkDen,  soTienChuyen, noidung);
                        session.setAttribute("msg", "Giao dịch thực hiện thành công!");
                    }
                    else {
                        session.setAttribute("msg", "Giao dịch thực hiện thất bại");
                    }
                }
            
            }
            request.getRequestDispatcher("chuyentien.jsp").forward(request, response);
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

    private static long soTien(java.lang.String stkTu) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.soTien(stkTu);
    }

    private static int chuyenTien(java.lang.String stkTu, java.lang.String stkDen, long soTienChuyen) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.chuyenTien(stkTu, stkDen, soTienChuyen);
    }

    private static int luuChuyenTien(java.lang.String stkTu, java.lang.String stkDen, long soTienChuyen) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.luuChuyenTien(stkTu, stkDen, soTienChuyen);
    }

    private static int luuNhanTien(java.lang.String stkTu, java.lang.String stkDen, long soTienChuyen, java.lang.String noidung) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.luuNhanTien(stkTu, stkDen, soTienChuyen, noidung);
    }

    private static TaiKhoan taiKhoanDen(java.lang.String stkDen) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.taiKhoanDen(stkDen);
    }

}
