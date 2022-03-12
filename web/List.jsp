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
    <center>
    <h1>List Players of Manchester United 2021-2022</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Position</th>
            <th>Year</th>
            <th>Nation</th>
            <th>Number</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <% for (Players p : players) {
        %>
        <tr>
            <td><%= p.getName()%></td> 
            <td><%= p.getPosition()%></td>
            <td><%= p.getYear()%></td>
            <td><%= p.getNation()%></td>
            <td><%= p.getNumber()%></td> 
            <td><a href="Update?id=<%=p.getNumber()%>">Update</a></td>
            <td><a href="Delete?id=<%=p.getNumber()%>"onclick="return confirm('Do you want to delete?')">Delete</a></td>
        </tr>
        <%}%>
    </table>
    <form action="LogoutControll" method="POST">
    <td><a href="Logout"onclick="return confirm('Do you want to Log out?')">Log Out</a></td>
    </form>
</center>
 
</html>
