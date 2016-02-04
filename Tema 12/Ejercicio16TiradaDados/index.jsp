<%-- 
    Document   : index
    Created on : 01-feb-2016, 12:40:25
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tirada de dados aleatoria</title>
    </head>
    <body>
        <%
          String[] cara = {"as.png", "j.png", "q.png", "k.png", "siete.png", "ocho.png"};

          for (int i = 0; i < 3; i++) {
            out.print("<img src=\"" + cara[(int)(Math.random()*6)] +"\">");
          }
        %>
    </body>
</html>
