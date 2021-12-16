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
	<h4>Đổi mã PIN</h4>
        <br>
        
        <form action="doipin">
		<label>Nhập mật khẩu cũ:</label>
		<input name="stkDen" placeholder="Vui lòng nhập số tài khoản cần chuyển" />
		<label>Nhập mât khẩu mới:</label>
		<input name="sotienchuyen" placeholder="Vui lòng nhập số tài khoản cần chuyển" />
		<label>Nhập lại mật khẩu mới:</label>
		<input name="noidung" placeholder="Vui lòng nhập lời nhắn" />
		<button>Thực hiện</button>
	</form>
        <script>
            alert();
        </script>
  </body>
</html>