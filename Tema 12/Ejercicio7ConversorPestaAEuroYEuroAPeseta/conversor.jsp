<%-- 
    Document   : conversor
    Created on : 26-ene-2016, 8:49:04
    Author     : moises
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor Pesetas y euros</title>
    </head>
    <body>
        <%
          if(request.getParameter("conversor").equals("opcion1")){
            double x = Double.parseDouble(request.getParameter("cantidad"));;
            double y = 166.386;

            double mul = x / y;
            DecimalFormat dosdecimas = new DecimalFormat("0.00");
            
            out.print(x  + " pesetas son  " + dosdecimas.format(mul) + "  euros");
          }else{
            double x = Double.parseDouble(request.getParameter("cantidad"));;
            double y = 166.386;

            double mul = x * y;
            DecimalFormat dosdecimas = new DecimalFormat("0.00");
            
            out.print(x  + " euros son  " + dosdecimas.format(mul) + "  pesetas");
          }
        %>
    </body>
</html>
