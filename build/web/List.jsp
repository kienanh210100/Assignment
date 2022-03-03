<%-- 
    Document   : List
    Created on : Mar 3, 2022, 10:51:16 PM
    Author     : HP
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Players"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> List Players of Manchester United </title>
        <%
        ArrayList<Players> players = (ArrayList<Players>) request.getAttribute("players");
    %>
    </head>
    <body>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Position</th>
            <th>Year</th>
            <th>Nation</th>
            <th>Number</th>
            <th></th>
        </tr>
        <% for (Players p : players) {
        %>
        <tr>
            <td><%=p.getName()%></td> 
            <td><%=p.getPosition()%></td>
            <td><%=p.getYear()%></td>
            <td><%=p.getNation()%></td>
            <td><%=p.getNumber()%></td> 
            <td>
                <a href="update?id=<%= p.getNumber()%>">Update</a>
                <a href="Delete?id=<%= p.getNumber()%>" onclick="return confirm('Are you want to Delete?');">Delete</a>
            </td>
        </tr>
        <%}%>
    </table>
</body>
</html>
