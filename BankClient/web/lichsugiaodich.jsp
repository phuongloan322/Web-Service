<%-- 
    Document   : lichsugiaodich
    Created on : Dec 10, 2021, 5:07:15 PM
    Author     : Admin
--%>

<%@page import="bank.ChiTietTaiKhoan"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Ngày giao dịch</th>
                    <th scope="col">Số tiền biến động</th>
                    <th scope="col">Ghi chú</th>
                </tr>
            </thead>
            <tbody>
                <%
		List<ChiTietTaiKhoan> cttk = (List<ChiTietTaiKhoan>)session.getAttribute("historyList");
                %>
                <%
                    if (cttk != null) {
                        int index = 1;
                        for (ChiTietTaiKhoan i : cttk) {
                            index++;
                %>
                        <tr>
                            <th scope="row"><%=index%></th>
                            <td><%=i.getNgayGiaoDich()%></td>
                            <td><%=i.getSoTienGiaoDich()%></td>
                            <td><%=i.getGhiChu()%></td>
                        </tr>
                <%}}%>
            </tbody>
        </table>
    </body>
</html>
