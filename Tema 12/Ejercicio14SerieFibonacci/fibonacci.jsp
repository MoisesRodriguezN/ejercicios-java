<%-- 
    Document   : fibonacci
    Created on : 01-feb-2016, 9:46:10
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Serie fibonacci</title>
    </head>
    <body>
        
        <%
        int contador;
        contador = Integer.parseInt(request.getParameter("numero"));
        int f1;
        int f2;
        int suma;

        f1 = 0;
        f2 = 1;

        out.println("Resultado:");
        out.print("0,");

        do {
        out.print(f2 + "," );
          suma = f1 + f2;
          f1 = f2;
          f2 = suma;
          contador --;
        } while (contador >1);
        %>
    </body>
</html>
