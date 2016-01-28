<%-- 
    Document   : cuestionario
    Created on : 28-ene-2016, 10:05:26
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evaluación cuestionario</title>
    </head>
    <body>
        <%
        int puntos = 0;
        String respuesta;
         
            respuesta = (request.getParameter("pregunta1"));  
            if (respuesta.equals("b")) {
                puntos++;
            }
         
            respuesta = (request.getParameter("pregunta2"));  
            if (respuesta.equals("a")) {
                puntos++;
            }
            
            respuesta = (request.getParameter("pregunta3"));  
            if (respuesta.equals("c")) {
                puntos++;
            }
            
            respuesta = (request.getParameter("pregunta4"));  
            if (respuesta.equals("b")) {
                puntos++;
            }
            
            respuesta = (request.getParameter("pregunta5"));  
            if (respuesta.equals("b")) {
                puntos++;
            }
            
            respuesta = (request.getParameter("pregunta6"));  
            if (respuesta.equals("b")) {
                puntos++;
            }
            
            respuesta = (request.getParameter("pregunta7"));  
            if (respuesta.equals("a")) {
                puntos++;
            }
            
            respuesta = (request.getParameter("pregunta8"));  
            if (respuesta.equals("c")) {
                puntos++;
            }
            
            respuesta = (request.getParameter("pregunta9"));  
            if (respuesta.equals("c")) {
                puntos++;
            }
            
            respuesta = (request.getParameter("pregunta10"));  
            if (respuesta.equals("b")) {
                puntos++;
            }
            
            out.print("puntuacion " + puntos);
        
        %>
    </body>
</html>
