<%-- 
    Document   : index
    Created on : 01-feb-2016, 10:11:43
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            span.verde{
                color: green;
            }
        </style>
    </head>
    <body>
        <h2>100 números aleatorios, en verde los primos</h2>
        <% 
          
        for (int x = 0; x < 100;x++){
            int n = (int)(Math.random() * 200) + 1;

            boolean esPrimo = true;
            for (int i = 2; i < n; i++) {
              if ((n % i) == 0) {
                esPrimo = false;
              }
            }

            if (esPrimo) {
              out.println("<span class=\"verde\">" + n + "</span>");
            } else {
              out.println(n);
            }
        }
        %>
   
    </body>
</html>
