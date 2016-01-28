<%-- 
    Document   : calendario
    Created on : 28-ene-2016, 11:13:57
    Author     : moises
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calendario</title>
    </head>
    <body>
        <h1>Calendario</h1>
        
         <%
      int mes = Integer.parseInt(request.getParameter("mes"));
      int anio = Integer.parseInt(request.getParameter("anio"));
      String[] nombreMes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

      Calendar miCalendario = Calendar.getInstance();
      miCalendario.set(anio, mes - 1, 1); // los meses van de 0 a 11

      int diasTotales = miCalendario.getActualMaximum(Calendar.DAY_OF_MONTH);

      int dia1 = miCalendario.get(Calendar.DAY_OF_WEEK);
      if (dia1 == 1) {
        dia1 = 7; // el domingo es dÃ­a 1
      } else {
        dia1--;
      }

      int columna = 1;
    %>

    <h1><% out.print(nombreMes[mes - 1] + " " + anio);%></h1>

    <table>
      <tr><th>lunes</th><th>martes</th><th>miÃ©rcoles</th><th>jueves</th><th>viernes</th><th>sÃ¡bado</th><th>domingo</th></tr>
      <tr>
      <%
      for (int i = 1; i < diasTotales + dia1; i++) {
        if (i >= dia1) {
          out.print("<td>" + (i - dia1 + 1) + "</td>");
        } else {
          out.print("<td> </td>"); // pinta los huecos que corresponden a los dÃ­as del mes pasado
        }
        columna++;
        if (columna == 8) { // termina la fila actual
          out.println("</tr><tr>");
          columna = 1;
        }
      }
      %>
      </td></tr>
    </table>
    </form>
    </body>
</html>
