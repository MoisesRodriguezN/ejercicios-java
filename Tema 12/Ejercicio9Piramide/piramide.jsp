<%-- 
    Document   : piramide
    Created on : 28-ene-2016, 8:44:44
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Piramide</title>
    </head>
    <body>
        <%
            int alturaTotal = Integer.parseInt(request.getParameter("altura"));
            int altura = 1;
            int i = 0;
            int espacios = alturaTotal - 1;

            while (altura <= alturaTotal) {

              // inserta espacios (imagenes en blanco)
              for (i = 1; i <= espacios; i++) {
                out.print("<img src=\"blanco.jpg\">");
              }

              // pinta la lÃ­nea
              for (i = 1; i < altura * 2; i++) {
                out.print("<img src=\"ladrillo.jpg\" width=\"80\" height=\"110\">");
              }

              out.println("</br>");

              altura++;
              espacios--;
            } // while
        %>
    </body>
</html>
