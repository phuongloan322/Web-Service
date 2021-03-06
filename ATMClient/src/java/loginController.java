/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bank.TaiKhoan;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = {"/Login"})
public class loginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
		if(session.getAttribute("loginInfor")==null) {
			                 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect(request.getContextPath()+"/Login");
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
        response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		request.setAttribute("error", " ");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		TaiKhoan account = checkDangNhap(username, password);
		
		if(account != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginInfor", account);
			response.sendRedirect(request.getContextPath()+"/index?msg=OK");
			return;
		}
		else {
			response.sendRedirect(request.getContextPath()+"/Login?msg=ERROR");
			return;
		}
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static TaiKhoan checkDangNhap(java.lang.String soTaiKhoan, java.lang.String matKhau) {
        bank.DichVu_Service service = new bank.DichVu_Service();
        bank.DichVu port = service.getDichVuPort();
        return port.checkDangNhap(soTaiKhoan, matKhau);
    }

}
