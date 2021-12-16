<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b class="ogin">ĐĂNG NHẬP</b> <br><br>
        <form action="Login" method="post" class="has-error">
            <input type="text" placeholder="User name" name="username"/>
            <input type="password" placeholder="Password" name="password"/>
            <span>
                <input type="checkbox" class="checkbox"> 
                Keep me signed in
            </span>
            <p>${tb}</p>
            <button type="submit" class="btn btn-default btnlogin">Login</button>
            <a class="textcenter" href="#">Quên mật khẩu ?</a>
            <hr>
            <a href="" class="btn btn-default btnregister1 vertical-center">Tạo tài khoản mới</a>
            <br>
        </form>
            <p>${msg}</p>
    </body>
</html>
