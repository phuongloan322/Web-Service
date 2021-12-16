<%-- 
    Document   : ruttien
    Created on : Dec 10, 2021, 4:21:16 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rút tiền</title>
    </head>
    <body>
	<h1>VNBank</h1>
	<h4>Xin vui lòng lựa chọn giao dịch</h4>
	<form action="RutTien">
		<input name="sotienrut" placeholder="Vui lòng nhập số tiền muốn rút" />
		<button>Thực hiện</button>
	</form>
        <script>
            alert(${msg});
        </script>
  </body>
</html>
