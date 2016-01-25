<%-- 
    Document   : conversor
    Created on : 25-ene-2016, 12:28:51
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor</title>
    </head>
    <body>
        <%
            double x = Double.parseDouble(request.getParameter("euros"));;
            double y = 166.386;

            double mul = x * y;

            out.print(x  + " euros son  " + mul + "  pesetas");
         %>
    </body>
</html>
