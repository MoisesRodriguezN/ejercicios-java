<%-- 
    Document   : tablamultiplicar
    Created on : 26-ene-2016, 9:20:27
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla de multiplicar</title>
    </head>
    <body style="background-color: deepskyblue">
        <h2 style="text-align: center;  box-shadow: #242424 4px 4px 4px; background-color: greenyellow;"> 
            Tabla de multiplicar </h2>
        <table border="2" style="box-shadow: #242424 4px 4px 4px; margin: auto; background-color: greenyellow;">
        <%
            String linea;
            int numero;

            linea = request.getParameter("numero");
            numero = Integer.parseInt( linea );

            for (int n = 1; n < 11; n++) {
            out.println("<tr>");
            out.println("<td>");
            out.print(numero + " X " + n + " = " + (n * numero) ); 
            out.println("</td></tr>");
            }
         %>
        </table>
    </body>
</html>
