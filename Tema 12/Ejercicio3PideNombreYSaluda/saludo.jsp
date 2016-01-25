<%-- 
    Document   : saludo
    Created on : 24-ene-2016, 9:40:25
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludo</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        <h1> Hola <% out.print(request.getParameter("nombre"));%></h1>
    </body>
</html>
