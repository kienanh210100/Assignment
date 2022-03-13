<%-- 
    Document   : List
    Created on : Mar 3, 2022, 10:51:16 PM
    Author     : HP
--%>

<%@page import="entity.Account"%>
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
            ArrayList<Account> account = (ArrayList<Account>) request.getAttribute("account");
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
                <td><a href="Update?id=<%=p.getId()%>">Update</a></td>
                <td><a href="DeleteControl?id=<%=p.getId()%>"onclick="return confirm('Do you want to delete?')">Delete</a></td>
            </tr>
            <%}%>
        </table>
        <form action="LogoutControl" method="POST">
            <td><a href="LogoutControl"onclick="return confirm('Do you want to Log out?')">Log Out</a></td>
        </form>

    </center>

</html>