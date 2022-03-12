<%-- 
    Document   : Login
    Created on : Feb 22, 2022, 9:38:24 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <table>
        <body><form action="Login" method="post">
                <style>
                    h1 {text-align: center;}
                    p {text-align: center;}
                    div {text-align: center;}
                </style>

                <h1> Manchester United </h1>
                <hr>
                <div>
                    <h3> Username </h3>
                    <input type="text" name="username"/>
                </div>
                <div>
                    <h3> Password </h3><input type="password" name="password"/>
                </div>
                <p></p>
                <div>
                    <input type="submit" name="login" value="Login" />

                </div>
                <hr/>
            </form>

    </table>
</body>
</html>
