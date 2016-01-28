<%-- 
    Document   : index
    Created on : 28-ene-2016, 11:01:36
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calendario</h1>
        
        <form method="post" action="calendario.jsp">
      mes
            <select name="mes">
              <option value="1">enero</option>
              <option value="2">febrero</option>
              <option value="3">marzo</option>
              <option value="4">abril</option>
              <option value="5">mayo</option>
              <option value="6">junio</option>
              <option value="7">julio</option>
              <option value="8">agosto</option>
              <option value="9">septiembre</option>
              <option value="10">octubre</option>
              <option value="11">noviembre</option>
              <option value="12">diciembre</option>
            </select> 
      &nbsp;año <input type="number" name="anio" size="4"> 
      &nbsp;<input type="submit" value="Aceptar">
        </form>
    </body>
</html>
