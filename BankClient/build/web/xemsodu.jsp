<%@page import="bank.TaiKhoan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
  	<title>Become-a-host</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  </head>
  <body>
	<h1>VNBank</h1>
	<h4>Thông tin tài khoản</h4>
        <br>
        <%
            TaiKhoan tk = (TaiKhoan)session.getAttribute("loginInfor");
        %> 
        <form action="index">
		<label>Họ tên:</label>
		<input name="stk" value="<%=tk.getHoTen()%>" />
                <label>Số tài khoản:</label>
		<input name="stk" value="<%=tk.getSoTaiKhoan()%>" />
		<label>Số tiền:</label>
		<input name="stk" value="<%=tk.getSoTien()%>" />
                <label>Số tiền khả dụng:</label>
		<input name="stk" value="<%=tk.getSoTien() -50000%>" />
		<button>Đóng</button>
	</form>
  </body>
</html>