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
    <body>
        <form action="Update" method="POST">
            Name <%=p.getName()%> 
            <input type="hidden" value="<%=p.getName()%>" name="name"/>
            <br/>
            Position: 
            <input type="text" value="<%=p.getPosition()%>" name="position" />
            <br/>
            Year: <input type="text" value="<%=p.getYear()%>" name="year" />
            <br/> 
            Nation: <input type="text" value="<%=p.getNation()%>" name="nation"/>
            Number: <input type="text" value="<%=p.getNumber()%>" name="number" />
            <br/>           
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
