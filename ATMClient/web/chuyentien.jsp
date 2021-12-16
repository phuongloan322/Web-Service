<%-- 
    Document   : chuyentien
    Created on : Dec 10, 2021, 5:02:06 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<h1>VNBank</h1>
	<h4>Xin vui lòng lựa chọn giao dịch</h4>
	<form action="ChuyenTien">
		<label>Tới số tài khoản:</label>
		<input name="stkDen" placeholder="Vui lòng nhập số tài khoản cần chuyển" />
		<label>Số tiền:</label>
		<input name="sotienchuyen" placeholder="Vui lòng nhập số tài khoản cần chuyển" />
		<label>Nội dung:</label>
		<input name="noidung" placeholder="Vui lòng nhập lời nhắn" />
		<button>Thực hiện</button>
	</form>
        <script>
            alert(${msg});
        </script>
  </body>
</html>
