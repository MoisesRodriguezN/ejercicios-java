<%-- 
    Document   : conversor
    Created on : 25-ene-2016, 18:06:23
    Author     : moises
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor</title>
    </head>
    <body>
         <%
            double x = Double.parseDouble(request.getParameter("pesetas"));;
            double y = 166.386;

            double mul = x / y;
            DecimalFormat dosdecimas = new DecimalFormat("0.00");
            
            out.print(x  + " pesetas son  " + dosdecimas.format(mul) + "  euros");
         %>
    </body>
</html>
