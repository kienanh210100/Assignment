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
    <body><form action="Login" method="post">
            <h1> Manchester United </h1>
            <div>
                Username: <input name="user"/>
            </div>
            <div>
                Password: <input type="password" name="pass"/>
            </div>
            <div>
                <input type="submit" name="login" value="Login" />
            </div>
        </form>
    </body>
</html>
