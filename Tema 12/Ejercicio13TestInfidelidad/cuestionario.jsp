<%-- 
    Document   : cuestionario
    Created on : 29-ene-2016, 12:52:43
    Author     : moises
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuestionario</title>
    </head>
    <body>
       <%
        int puntos = 0;
        String respuesta;
         
            respuesta = (request.getParameter("pregunta1"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
         
            respuesta = (request.getParameter("pregunta2"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            respuesta = (request.getParameter("pregunta3"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            respuesta = (request.getParameter("pregunta4"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            respuesta = (request.getParameter("pregunta5"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            respuesta = (request.getParameter("pregunta6"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            respuesta = (request.getParameter("pregunta7"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            respuesta = (request.getParameter("pregunta8"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            respuesta = (request.getParameter("pregunta9"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            respuesta = (request.getParameter("pregunta10"));  
            if (respuesta.equals("V")) {
                puntos+=3;
            }
            
            out.print("puntuación " + puntos + "<br> <br>"); 
            
             
            if ((puntos >=0) && (puntos <=10)){
                out.println("Has obtenido una puntuación de:  " + puntos + " puntos.");
                out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
                }
    

            if ((puntos >=11) && (puntos <=22)){
                out.println("Has obtenido una puntuación de:  " + puntos + " puntos.");
                out.print("Quizás exista el peligro de otra persona en su ");
                out.print("vida o en su mente, aunque seguramente será algo ");
                out.print ("sin importancia. No bajes la guardia.");
            }

            if ((puntos >=22) && (puntos <=30)){
                out.println("Has obtenido una puntuación de:  " + puntos + " puntos.");
                out.print("Tu pareja tiene todos los ingredientes para estar ");
                out.print("viviendo un romance con otra persona. ");
                out.print ("Te aconsejamos que indagues un poco mas ");
                out.print ("y averigües que es lo que pasa por su cabeza ");
            }
        
        %>
    </body>
</html>
