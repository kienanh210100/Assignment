<%-- 
    Document   : Create
    Created on : Mar 14, 2022, 11:16:17 AM
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
        <body>
            <form action="CreateControl" method="post">
                <h1>Create new player </h1>
                <tr>
                    <td>Name:<td/>
                    <td> 
                        <input type="text"  name="name"/>
                    </td>
                </tr>
                <tr>
                    <td>Position:<td/>
                    <td> 
                        <input type="text" name="position" />
                    </td>
                </tr>
                <tr>
                    <td>Year:<td/>
                    <td>  
                        <input type="text" name="year" />
                    </td>
                </tr>
                <tr>
                    <td>Nation: <td/>
                    <td>
                        <input type="text" name="nation"/>
                    </td>
                </tr>
                <tr>
                    <td>Number: <td/>
                    <td> <input type="text"  name="number" />
                    </td>
                </tr>
                <td>
                    <input type="submit" value="Create"/>
                </td>

            </form>
        </body>
    </table>
</html>
