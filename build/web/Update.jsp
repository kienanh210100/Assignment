<%-- 
    Document   : Update
    Created on : Mar 11, 2022, 11:36:21 PM
    Author     : HP
--%>

<%@page import="entity.Players"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Players p = (Players) request.getAttribute("player");
        %>
    </head>
    <center>
    <table>
        
        <body>
            <form action="Update" method="POST">
              
                <h1> Update information of <%=p.getName()%> </h1>
                <tr>
                    <td>Name:<td/>
                    <td> 
                        <input type="text" value="<%=p.getName()%>" name="name"/>
                    </td>
                </tr>
                <tr>
                    <td>Position:<td/>
                    <td> 
                        <input type="text" value="<%=p.getPosition()%>" name="position" />
                    </td>
                </tr>
                <tr>
                    <td>Year:<td/>
                    <td>  
                        <input type="text" value="<%=p.getYear()%>" name="year" />
                    </td>
                </tr>
                <tr>
                    <td>Nation: <td/>
                    <td>
                        <input type="text" value="<%=p.getNation()%>" name="nation"/>
                    </td>
                </tr>
                <tr>
                    <td>Number: <td/>
                    <td> <input type="text" value="<%=p.getNumber()%>" name="number" />
                    </td>
                </tr>
                <td>
                    <input type="submit" value="Save"/>
                </td>
                
            </form>  
        </body>
    </table>
</center>
</html>